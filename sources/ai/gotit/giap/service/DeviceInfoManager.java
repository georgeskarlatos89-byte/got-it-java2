package ai.gotit.giap.service;

import ai.gotit.giap.constant.DeviceInfoProps;
import ai.gotit.giap.constant.StorageKey;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class DeviceInfoManager {
    private ConfigManager configManager;
    private Map<String, Object> staticProps = new HashMap();
    private Storage storage;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048 A[SYNTHETIC, Splitter:B:15:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeviceInfoManager(ai.gotit.giap.service.ConfigManager r10, ai.gotit.giap.service.Storage r11) {
        /*
            r9 = this;
            java.lang.String r0 = "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."
            r9.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.staticProps = r1
            r9.configManager = r10
            r9.storage = r11
            android.content.Context r10 = r10.getContext()
            android.content.pm.PackageManager r11 = r10.getPackageManager()
            r1 = 0
            r2 = 0
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x002c }
            android.content.pm.PackageInfo r10 = r11.getPackageInfo(r10, r1)     // Catch:{ NameNotFoundException -> 0x002c }
            int r3 = r10.versionCode     // Catch:{ NameNotFoundException -> 0x002c }
            long r3 = (long) r3     // Catch:{ NameNotFoundException -> 0x002c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ NameNotFoundException -> 0x002c }
            java.lang.String r10 = r10.versionName     // Catch:{ NameNotFoundException -> 0x002d }
            goto L_0x0033
        L_0x002c:
            r3 = r2
        L_0x002d:
            java.lang.String r10 = "System information constructed with a context that apparently doesn't exist."
            ai.gotit.giap.util.Logger.warn((java.lang.String) r10)
            r10 = r2
        L_0x0033:
            java.lang.Class r4 = r11.getClass()
            r5 = 1
            java.lang.String r6 = "hasSystemFeature"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r4 = r2
        L_0x0046:
            if (r4 == 0) goto L_0x006d
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x0066, IllegalAccessException -> 0x0061 }
            java.lang.String r7 = "android.hardware.nfc"
            r6[r1] = r7     // Catch:{ InvocationTargetException -> 0x0066, IllegalAccessException -> 0x0061 }
            java.lang.Object r6 = r4.invoke(r11, r6)     // Catch:{ InvocationTargetException -> 0x0066, IllegalAccessException -> 0x0061 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ InvocationTargetException -> 0x0066, IllegalAccessException -> 0x0061 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0062 }
            java.lang.String r7 = "android.hardware.telephony"
            r5[r1] = r7     // Catch:{ InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0062 }
            java.lang.Object r11 = r4.invoke(r11, r5)     // Catch:{ InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0062 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ InvocationTargetException -> 0x0067, IllegalAccessException -> 0x0062 }
            goto L_0x006b
        L_0x0061:
            r6 = r2
        L_0x0062:
            ai.gotit.giap.util.Logger.warn((java.lang.String) r0)
            goto L_0x006a
        L_0x0066:
            r6 = r2
        L_0x0067:
            ai.gotit.giap.util.Logger.warn((java.lang.String) r0)
        L_0x006a:
            r11 = r2
        L_0x006b:
            r2 = r6
            goto L_0x006e
        L_0x006d:
            r11 = r2
        L_0x006e:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$device_id"
            java.lang.String r4 = r9.getDeviceId()
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$os"
            java.lang.String r4 = "Android"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$lib"
            java.lang.String r4 = "GIAP-android"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$lib_version"
            java.lang.String r4 = "1.0"
            r0.put(r1, r4)
            android.util.DisplayMetrics r0 = r9.getScreenMetrics()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.staticProps
            int r4 = r0.heightPixels
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "$screen_height"
            r1.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.staticProps
            int r4 = r0.widthPixels
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "$screen_width"
            r1.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.staticProps
            int r0 = r0.densityDpi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "$screen_dpi"
            r1.put(r4, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$app_build_number"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.staticProps
            java.lang.String r1 = "$app_version_string"
            r0.put(r1, r10)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$carrier"
            java.lang.String r1 = r9.getCarrier()
            r10.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$manufacturer"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r10.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$model"
            java.lang.String r1 = android.os.Build.MODEL
            r10.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$brand"
            java.lang.String r1 = android.os.Build.BRAND
            r10.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$bluetooth_version"
            java.lang.String r1 = r9.getBluetoothVersion()
            r10.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$has_nfc"
            r10.put(r0, r2)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r0 = "$has_telephone"
            r10.put(r0, r11)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.staticProps
            java.lang.String r11 = "$google_play_services"
            java.lang.String r0 = r9.getGooglePlayServices()
            r10.put(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gotit.giap.service.DeviceInfoManager.<init>(ai.gotit.giap.service.ConfigManager, ai.gotit.giap.service.Storage):void");
    }

    public static DeviceInfoManager makeInstance(ConfigManager configManager2, Storage storage2) {
        return new DeviceInfoManager(configManager2, storage2);
    }

    public JSONObject getDeviceInfo() {
        return new JSONObject(getDeviceInfoAsMap());
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getDeviceInfoAsMap() {
        HashMap hashMap = new HashMap(this.staticProps);
        hashMap.put(DeviceInfoProps.WIFI, isWifiConnected());
        hashMap.put(DeviceInfoProps.BLUETOOTH_ENABLED, isBluetoothEnabled());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getStaticProps() {
        return this.staticProps;
    }

    private String getDeviceId() {
        String string = this.storage.getString(StorageKey.DEVICE_ID);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.storage.put(StorageKey.DEVICE_ID, uuid);
        return uuid;
    }

    private DisplayMetrics getScreenMetrics() {
        return this.configManager.getContext().getResources().getDisplayMetrics();
    }

    private String getCarrier() {
        TelephonyManager telephonyManager = (TelephonyManager) this.configManager.getContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    private String getBluetoothVersion() {
        PackageManager packageManager = this.configManager.getContext().getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
            return "ble";
        }
        if (packageManager.hasSystemFeature("android.hardware.bluetooth")) {
            return "classic";
        }
        return null;
    }

    private String getGooglePlayServices() {
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.configManager.getContext());
            if (isGooglePlayServicesAvailable == 0) {
                return "available";
            }
            if (isGooglePlayServicesAvailable == 1) {
                return "missing";
            }
            if (isGooglePlayServicesAvailable == 2) {
                return "out of date";
            }
            if (isGooglePlayServicesAvailable == 3) {
                return "disabled";
            }
            if (isGooglePlayServicesAvailable != 9) {
                return null;
            }
            return Constants.COLLATION_INVALID;
        } catch (RuntimeException unused) {
            return "not configured";
        }
    }

    private Boolean isWifiConnected() {
        ConnectivityManager connectivityManager;
        Context context = this.configManager.getContext();
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return Boolean.valueOf(networkCapabilities.hasTransport(1));
            }
            return null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private Boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter;
        Context context = this.configManager.getContext();
        try {
            if (context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }
}
