package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.DateUtils;
import io.sentry.EventProcessor;
import io.sentry.ILogger;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.ConnectivityChecker;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.android.core.internal.util.MainThreadChecker;
import io.sentry.android.core.internal.util.RootChecker;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

final class DefaultAndroidEventProcessor implements EventProcessor {
    static final String EMULATOR = "emulator";
    static final String KERNEL_VERSION = "kernelVersion";
    static final String ROOTED = "rooted";
    static final String SIDE_LOADED = "sideLoaded";
    private final IBuildInfoProvider buildInfoProvider;
    final Context context;
    final Future<Map<String, Object>> contextData;
    private final ILogger logger;
    private final RootChecker rootChecker;

    public DefaultAndroidEventProcessor(Context context2, ILogger iLogger, IBuildInfoProvider iBuildInfoProvider) {
        this(context2, iLogger, iBuildInfoProvider, new RootChecker(context2, iBuildInfoProvider, iLogger));
    }

    DefaultAndroidEventProcessor(Context context2, ILogger iLogger, IBuildInfoProvider iBuildInfoProvider, RootChecker rootChecker2) {
        this.context = (Context) Objects.requireNonNull(context2, "The application context is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The Logger is required.");
        this.buildInfoProvider = (IBuildInfoProvider) Objects.requireNonNull(iBuildInfoProvider, "The BuildInfoProvider is required.");
        this.rootChecker = (RootChecker) Objects.requireNonNull(rootChecker2, "The RootChecker is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.contextData = newSingleThreadExecutor.submit(new DefaultAndroidEventProcessor$$ExternalSyntheticLambda0(this));
        newSingleThreadExecutor.shutdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: loadContextData */
    public Map<String, Object> m1088lambda$new$0$iosentryandroidcoreDefaultAndroidEventProcessor() {
        HashMap hashMap = new HashMap();
        hashMap.put(ROOTED, Boolean.valueOf(this.rootChecker.isDeviceRooted()));
        String kernelVersion = getKernelVersion();
        if (kernelVersion != null) {
            hashMap.put(KERNEL_VERSION, kernelVersion);
        }
        hashMap.put(EMULATOR, isEmulator());
        Map<String, String> sideLoadedInfo = getSideLoadedInfo();
        if (sideLoadedInfo != null) {
            hashMap.put(SIDE_LOADED, sideLoadedInfo);
        }
        return hashMap;
    }

    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryEvent, obj);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryEvent);
            setThreads(sentryEvent);
        }
        setCommons(sentryEvent, true, shouldApplyScopeData);
        return sentryEvent;
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent, boolean z, boolean z2) {
        mergeUser(sentryBaseEvent);
        setDevice(sentryBaseEvent, z, z2);
        mergeOS(sentryBaseEvent);
        setSideLoadedInfo(sentryBaseEvent);
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Object obj) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            return true;
        }
        this.logger.log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            sentryBaseEvent.setUser(getDefaultUser());
        } else if (user.getId() == null) {
            user.setId(getDeviceId());
        }
    }

    private void setDevice(SentryBaseEvent sentryBaseEvent, boolean z, boolean z2) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            sentryBaseEvent.getContexts().setDevice(getDevice(z, z2));
        }
    }

    private void mergeOS(SentryBaseEvent sentryBaseEvent) {
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        sentryBaseEvent.getContexts().setOperatingSystem(getOperatingSystem());
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            sentryBaseEvent.getContexts().put((name == null || name.isEmpty()) ? "os_1" : "os_" + name.trim().toLowerCase(Locale.ROOT), operatingSystem);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent) {
        App app = sentryBaseEvent.getContexts().getApp();
        if (app == null) {
            app = new App();
        }
        setAppExtras(app);
        setPackageInfo(sentryBaseEvent, app);
        sentryBaseEvent.getContexts().setApp(app);
    }

    private void setThreads(SentryEvent sentryEvent) {
        if (sentryEvent.getThreads() != null) {
            for (SentryThread next : sentryEvent.getThreads()) {
                next.setCurrent(Boolean.valueOf(MainThreadChecker.isMainThread(next)));
            }
        }
    }

    private void setPackageInfo(SentryBaseEvent sentryBaseEvent, App app) {
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, this.logger);
        if (packageInfo != null) {
            setDist(sentryBaseEvent, ContextUtils.getVersionCode(packageInfo));
            setAppPackageInfo(app, packageInfo);
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent, String str) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(str);
        }
    }

    private void setAppExtras(App app) {
        app.setAppName(getApplicationName());
        app.setAppStartTime(AppStartState.getInstance().getAppStartTime());
    }

    private String getAbi() {
        return Build.CPU_ABI;
    }

    private String getAbi2() {
        return Build.CPU_ABI2;
    }

    private void setArchitectures(Device device) {
        device.setArchs(Build.SUPPORTED_ABIS);
    }

    private Long getMemorySize(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private Device getDevice(boolean z, boolean z2) {
        Device device = new Device();
        device.setName(getDeviceName());
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(getFamily());
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        setArchitectures(device);
        if (z) {
            setDeviceIO(device, z2);
        }
        device.setOrientation(getOrientation());
        try {
            Object obj = this.contextData.get().get(EMULATOR);
            if (obj != null) {
                device.setSimulator((Boolean) obj);
            }
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting emulator.", th);
        }
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics != null) {
            device.setScreenWidthPixels(Integer.valueOf(displayMetrics.widthPixels));
            device.setScreenHeightPixels(Integer.valueOf(displayMetrics.heightPixels));
            device.setScreenDensity(Float.valueOf(displayMetrics.density));
            device.setScreenDpi(Integer.valueOf(displayMetrics.densityDpi));
        }
        device.setBootTime(getBootTime());
        device.setTimezone(getTimeZone());
        if (device.getId() == null) {
            device.setId(getDeviceId());
        }
        Locale locale = Locale.getDefault();
        if (device.getLanguage() == null) {
            device.setLanguage(locale.getLanguage());
        }
        if (device.getLocale() == null) {
            device.setLocale(locale.toString());
        }
        return device;
    }

    private void setDeviceIO(Device device, boolean z) {
        boolean z2;
        Intent batteryIntent = getBatteryIntent();
        if (batteryIntent != null) {
            device.setBatteryLevel(getBatteryLevel(batteryIntent));
            device.setCharging(isCharging(batteryIntent));
            device.setBatteryTemperature(getBatteryTemperature(batteryIntent));
        }
        int i = AnonymousClass1.$SwitchMap$io$sentry$android$core$internal$util$ConnectivityChecker$Status[ConnectivityChecker.getConnectionStatus(this.context, this.logger).ordinal()];
        if (i == 1) {
            z2 = false;
        } else if (i != 2) {
            z2 = null;
        } else {
            z2 = true;
        }
        device.setOnline(z2);
        ActivityManager.MemoryInfo memInfo = getMemInfo();
        if (memInfo != null) {
            device.setMemorySize(getMemorySize(memInfo));
            if (z) {
                device.setFreeMemory(Long.valueOf(memInfo.availMem));
                device.setLowMemory(Boolean.valueOf(memInfo.lowMemory));
            }
        }
        File externalFilesDir = this.context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            device.setStorageSize(getTotalInternalStorage(statFs));
            device.setFreeStorage(getUnusedInternalStorage(statFs));
        }
        StatFs externalStorageStat = getExternalStorageStat(externalFilesDir);
        if (externalStorageStat != null) {
            device.setExternalStorageSize(getTotalExternalStorage(externalStorageStat));
            device.setExternalFreeStorage(getUnusedExternalStorage(externalStorageStat));
        }
        if (device.getConnectionType() == null) {
            device.setConnectionType(ConnectivityChecker.getConnectionType(this.context, this.logger, this.buildInfoProvider));
        }
    }

    /* renamed from: io.sentry.android.core.DefaultAndroidEventProcessor$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$android$core$internal$util$ConnectivityChecker$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.sentry.android.core.internal.util.ConnectivityChecker$Status[] r0 = io.sentry.android.core.internal.util.ConnectivityChecker.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$sentry$android$core$internal$util$ConnectivityChecker$Status = r0
                io.sentry.android.core.internal.util.ConnectivityChecker$Status r1 = io.sentry.android.core.internal.util.ConnectivityChecker.Status.NOT_CONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$sentry$android$core$internal$util$ConnectivityChecker$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                io.sentry.android.core.internal.util.ConnectivityChecker$Status r1 = io.sentry.android.core.internal.util.ConnectivityChecker.Status.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.DefaultAndroidEventProcessor.AnonymousClass1.<clinit>():void");
        }
    }

    private String getDeviceName() {
        return Settings.Global.getString(this.context.getContentResolver(), "device_name");
    }

    private TimeZone getTimeZone() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        if (!locales.isEmpty()) {
            return Calendar.getInstance(locales.get(0)).getTimeZone();
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Date getBootTime() {
        try {
            return DateUtils.getDateTime(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            this.logger.log(SentryLevel.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private ActivityManager.MemoryInfo getMemInfo() {
        try {
            ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.logger.log(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    private Intent getBatteryIntent() {
        return this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private String getFamily() {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    private Float getBatteryLevel(Intent intent) {
        try {
            int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1) {
                if (intExtra2 != -1) {
                    return Float.valueOf((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                }
            }
            return null;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Boolean isCharging(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    private Float getBatteryTemperature(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(((float) intExtra) / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private Device.DeviceOrientation getOrientation() {
        Device.DeviceOrientation deviceOrientation;
        Throwable th;
        try {
            deviceOrientation = DeviceOrientations.getOrientation(this.context.getResources().getConfiguration().orientation);
            if (deviceOrientation == null) {
                try {
                    this.logger.log(SentryLevel.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.logger.log(SentryLevel.ERROR, "Error getting device orientation.", th);
                    return deviceOrientation;
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            deviceOrientation = null;
            th = th4;
            this.logger.log(SentryLevel.ERROR, "Error getting device orientation.", th);
            return deviceOrientation;
        }
        return deviceOrientation;
    }

    private Boolean isEmulator() {
        boolean z;
        try {
            if ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.FINGERPRINT.startsWith("generic") && !Build.FINGERPRINT.startsWith("unknown") && !Build.HARDWARE.contains("goldfish") && !Build.HARDWARE.contains("ranchu") && !Build.MODEL.contains("google_sdk") && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && !Build.PRODUCT.contains("sdk_google") && !Build.PRODUCT.contains("google_sdk") && !Build.PRODUCT.contains(ServerProtocol.DIALOG_PARAM_SDK_VERSION) && !Build.PRODUCT.contains("sdk_x86") && !Build.PRODUCT.contains("vbox86p") && !Build.PRODUCT.contains(EMULATOR)) {
                if (!Build.PRODUCT.contains("simulator")) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    private Long getTotalInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(getBlockCountLong(statFs) * getBlockSizeLong(statFs));
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private long getBlockSizeLong(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    private int getBlockSizeDep(StatFs statFs) {
        return statFs.getBlockSize();
    }

    private long getBlockCountLong(StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    private int getBlockCountDep(StatFs statFs) {
        return statFs.getBlockCount();
    }

    private long getAvailableBlocksLong(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    private int getAvailableBlocksDep(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    private Long getUnusedInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(getAvailableBlocksLong(statFs) * getBlockSizeLong(statFs));
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    private StatFs getExternalStorageStat(File file) {
        if (!isExternalStorageMounted()) {
            File externalStorageDep = getExternalStorageDep(file);
            if (externalStorageDep != null) {
                return new StatFs(externalStorageDep.getPath());
            }
            this.logger.log(SentryLevel.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
        this.logger.log(SentryLevel.INFO, "External storage is not mounted or emulated.", new Object[0]);
        return null;
    }

    private File[] getExternalFilesDirs() {
        return this.context.getExternalFilesDirs((String) null);
    }

    private File getExternalStorageDep(File file) {
        File[] externalFilesDirs = getExternalFilesDirs();
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.logger.log(SentryLevel.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private Long getTotalExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(getBlockCountLong(statFs) * getBlockSizeLong(statFs));
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private boolean isExternalStorageMounted() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    private Long getUnusedExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(getAvailableBlocksLong(statFs) * getBlockSizeLong(statFs));
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        try {
            return this.context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    private OperatingSystem getOperatingSystem() {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setName("Android");
        operatingSystem.setVersion(Build.VERSION.RELEASE);
        operatingSystem.setBuild(Build.DISPLAY);
        try {
            Object obj = this.contextData.get().get(KERNEL_VERSION);
            if (obj != null) {
                operatingSystem.setKernelVersion((String) obj);
            }
            Object obj2 = this.contextData.get().get(ROOTED);
            if (obj2 != null) {
                operatingSystem.setRooted((Boolean) obj2);
            }
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting OperatingSystem.", th);
        }
        return operatingSystem;
    }

    private void setAppPackageInfo(App app, PackageInfo packageInfo) {
        app.setAppIdentifier(packageInfo.packageName);
        app.setAppVersion(packageInfo.versionName);
        app.setAppBuild(ContextUtils.getVersionCode(packageInfo));
    }

    private String getKernelVersion() {
        BufferedReader bufferedReader;
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (IOException e) {
            this.logger.log(SentryLevel.ERROR, "Exception while attempting to read kernel information", (Throwable) e);
            return property;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private String getApplicationName() {
        try {
            ApplicationInfo applicationInfo = this.context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return this.context.getString(i);
            }
            if (applicationInfo.nonLocalizedLabel != null) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return this.context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    public User getDefaultUser() {
        User user = new User();
        user.setId(getDeviceId());
        return user;
    }

    private String getDeviceId() {
        try {
            return Installation.id(this.context);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private Map<String, String> getSideLoadedInfo() {
        String str;
        try {
            PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, this.logger);
            PackageManager packageManager = this.context.getPackageManager();
            if (!(packageInfo == null || packageManager == null)) {
                str = packageInfo.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    HashMap hashMap = new HashMap();
                    if (installerPackageName != null) {
                        hashMap.put("isSideLoaded", "false");
                        hashMap.put("installerStore", installerPackageName);
                    } else {
                        hashMap.put("isSideLoaded", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    }
                    return hashMap;
                } catch (IllegalArgumentException unused) {
                    this.logger.log(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
            this.logger.log(SentryLevel.DEBUG, "%s package isn't installed.", str);
            return null;
        }
        return null;
    }

    private void setSideLoadedInfo(SentryBaseEvent sentryBaseEvent) {
        try {
            Object obj = this.contextData.get().get(SIDE_LOADED);
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    sentryBaseEvent.setTag((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    public SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryTransaction, obj);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryTransaction);
        }
        setCommons(sentryTransaction, false, shouldApplyScopeData);
        return sentryTransaction;
    }
}
