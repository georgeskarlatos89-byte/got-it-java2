package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.soloader.SysUtil;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;

public class SoLoader {
    static final boolean DEBUG = false;
    private static final String[] DEFAULT_DENY_LIST = {System.mapLibraryName("breakpad")};
    public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
    public static final int SOLOADER_DISABLE_BACKUP_SOSOURCE = 8;
    public static final int SOLOADER_DISABLE_FS_SYNC_JOB = 256;
    public static final int SOLOADER_DONT_TREAT_AS_SYSTEMAPP = 32;
    public static final int SOLOADER_ENABLE_DIRECT_SOSOURCE = 64;
    public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
    public static final int SOLOADER_EXPLICITLY_ENABLE_BACKUP_SOSOURCE = 128;
    public static final int SOLOADER_LOOK_IN_ZIP = 4;
    public static final int SOLOADER_SKIP_MERGED_JNI_ONLOAD = 16;
    private static final String SO_STORE_NAME_MAIN = "lib-main";
    private static final String SO_STORE_NAME_SPLIT = "lib-";
    static final boolean SYSTRACE_LIBRARY_LOADING = true;
    static final String TAG = "SoLoader";
    public static String VERSION = "0.10.5";
    private static boolean isEnabled = true;
    private static int sAppType = 0;
    @Nullable
    private static ApplicationSoSource sApplicationSoSource;
    @Nullable
    private static UnpackingSoSource[] sBackupSoSources;
    private static int sFlags;
    private static final Set<String> sLoadedAndMergedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    /* access modifiers changed from: private */
    public static final HashSet<String> sLoadedLibraries = new HashSet<>();
    /* access modifiers changed from: private */
    public static final Map<String, Object> sLoadingLibraries = new HashMap();
    @Nullable
    static SoFileLoader sSoFileLoader;
    /* access modifiers changed from: private */
    @Nullable
    public static volatile SoSource[] sSoSources = null;
    /* access modifiers changed from: private */
    public static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    /* access modifiers changed from: private */
    public static final AtomicInteger sSoSourcesVersion = new AtomicInteger(0);
    @Nullable
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;

    interface AppType {
        public static final int SYSTEM_APP = 2;
        public static final int THIRD_PARTY_APP = 1;
        public static final int UNSET = 0;
        public static final int UPDATED_SYSTEM_APP = 3;
    }

    public static void init(Context context, int i) throws IOException {
        init(context, i, (SoFileLoader) null, DEFAULT_DENY_LIST);
    }

    public static void init(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        init(context, i, soFileLoader, DEFAULT_DENY_LIST);
    }

    public static void init(Context context, int i, @Nullable SoFileLoader soFileLoader, String[] strArr) throws IOException {
        if (!isInitialized()) {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                boolean initEnableConfig = initEnableConfig(context);
                isEnabled = initEnableConfig;
                if (initEnableConfig) {
                    int appType = getAppType(context, i);
                    sAppType = appType;
                    if ((i & 128) == 0 && SysUtil.isSupportedDirectLoad(context, appType)) {
                        i |= 72;
                    }
                    initSoLoader(soFileLoader);
                    initSoSources(context, i, strArr);
                    Log.v(TAG, "Init SoLoader delegate");
                    NativeLoader.initIfUninitialized(new NativeLoaderToSoLoaderDelegate());
                } else {
                    initDummySoSource();
                    Log.v(TAG, "Init System Loader delegate");
                    NativeLoader.initIfUninitialized(new SystemDelegate());
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        }
    }

    public static void init(Context context, boolean z) {
        try {
            init(context, z ? 1 : 0, (SoFileLoader) null, DEFAULT_DENY_LIST);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean initEnableConfig(android.content.Context r4) {
        /*
            r0 = 0
            java.lang.String r1 = r4.getPackageName()     // Catch:{ Exception -> 0x0014 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x0012 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r2)     // Catch:{ Exception -> 0x0012 }
            android.os.Bundle r0 = r4.metaData     // Catch:{ Exception -> 0x0012 }
            goto L_0x0030
        L_0x0012:
            r4 = move-exception
            goto L_0x0016
        L_0x0014:
            r4 = move-exception
            r1 = r0
        L_0x0016:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected issue with package manager ("
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SoLoader"
            android.util.Log.w(r2, r1, r4)
        L_0x0030:
            r4 = 1
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = "com.facebook.soloader.enabled"
            boolean r0 = r0.getBoolean(r1, r4)
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.initEnableConfig(android.content.Context):boolean");
    }

    private static void initSoSources(Context context, int i, String[] strArr) throws IOException {
        if (sSoSources == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (sSoSources != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                sFlags = i;
                ArrayList arrayList = new ArrayList();
                AddSystemLibSoSource(arrayList, strArr);
                if (context != null) {
                    if ((i & 1) != 0) {
                        addApplicationSoSource(context, arrayList, getApplicationSoSourceFlags());
                        sBackupSoSources = null;
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "adding exo package source: lib-main");
                        }
                        arrayList.add(0, new ExoSoSource(context, SO_STORE_NAME_MAIN));
                    } else {
                        if ((i & 64) != 0) {
                            addDirectApkSoSource(context, arrayList);
                        }
                        addApplicationSoSource(context, arrayList, getApplicationSoSourceFlags());
                        AddBackupSoSource(context, arrayList, 1);
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int makePrepareFlags = makePrepareFlags();
                int length = soSourceArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "Preparing SO source: " + soSourceArr[i2]);
                    }
                    boolean z = SYSTRACE_LIBRARY_LOADING;
                    if (z) {
                        Api18TraceUtils.beginTraceSection(TAG, "_", soSourceArr[i2].getClass().getSimpleName());
                    }
                    soSourceArr[i2].prepare(makePrepareFlags);
                    if (z) {
                        Api18TraceUtils.endSection();
                    }
                    length = i2;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion.getAndIncrement();
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "init finish: " + sSoSources.length + " SO sources prepared");
                }
            } finally {
                sSoSourcesLock.writeLock().unlock();
            }
        }
    }

    private static void initDummySoSource() {
        if (sSoSources == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (sSoSources != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                sSoSources = new SoSource[0];
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                sSoSourcesLock.writeLock().unlock();
                throw th;
            }
        }
    }

    private static int getApplicationSoSourceFlags() {
        int i = sAppType;
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    private static void addDirectApkSoSource(Context context, ArrayList<SoSource> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String file : context.getApplicationInfo().splitSourceDirs) {
                DirectApkSoSource directApkSoSource = new DirectApkSoSource(new File(file));
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "validating/adding directApk source from splitApk: " + directApkSoSource.toString());
                }
                if (directApkSoSource.isValid()) {
                    arrayList.add(0, directApkSoSource);
                }
            }
        }
        DirectApkSoSource directApkSoSource2 = new DirectApkSoSource(context);
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "validating/adding directApk source: " + directApkSoSource2.toString());
        }
        if (directApkSoSource2.isValid()) {
            arrayList.add(0, directApkSoSource2);
        }
    }

    private static void addApplicationSoSource(Context context, ArrayList<SoSource> arrayList, int i) {
        sApplicationSoSource = new ApplicationSoSource(context, i);
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "adding application source: " + sApplicationSoSource.toString());
        }
        arrayList.add(0, sApplicationSoSource);
    }

    private static void AddBackupSoSource(Context context, ArrayList<SoSource> arrayList, int i) throws IOException {
        if ((sFlags & 8) != 0) {
            sBackupSoSources = null;
            File soStorePath = UnpackingSoSource.getSoStorePath(context, SO_STORE_NAME_MAIN);
            try {
                SysUtil.dumbDeleteRecursive(soStorePath);
            } catch (IOException e) {
                Log.w(TAG, "Failed to delete " + soStorePath.getCanonicalPath(), e);
            }
        } else {
            File file = new File(context.getApplicationInfo().sourceDir);
            ArrayList arrayList2 = new ArrayList();
            ApkSoSource apkSoSource = new ApkSoSource(context, file, SO_STORE_NAME_MAIN, i);
            arrayList2.add(apkSoSource);
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "adding backup source from : " + apkSoSource.toString());
            }
            addBackupSoSourceFromSplitApk(context, i, arrayList2);
            sBackupSoSources = (UnpackingSoSource[]) arrayList2.toArray(new UnpackingSoSource[arrayList2.size()]);
            arrayList.addAll(0, arrayList2);
        }
    }

    private static void addBackupSoSourceFromSplitApk(Context context, int i, ArrayList<UnpackingSoSource> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "adding backup sources from split apks");
            }
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                ApkSoSource apkSoSource = new ApkSoSource(context, new File(strArr[i2]), SO_STORE_NAME_SPLIT + i3, i);
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "adding backup source: " + apkSoSource.toString());
                }
                arrayList.add(apkSoSource);
                i2++;
                i3 = i4;
            }
        }
    }

    private static void AddSystemLibSoSource(ArrayList<SoSource> arrayList, String[] strArr) {
        String str = SysUtil.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + CertificateUtil.DELIMITER + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(CertificateUtil.DELIMITER)))) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "adding system library source: " + str3);
            }
            arrayList.add(new DirectorySoSource(new File(str3), 2, strArr));
        }
    }

    private static int makePrepareFlags() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = sFlags;
            int i2 = (i & 2) != 0 ? 1 : 0;
            if ((i & 256) != 0) {
                i2 |= 4;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i2;
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    private static synchronized void initSoLoader(@Nullable SoFileLoader soFileLoader) {
        synchronized (SoLoader.class) {
            if (soFileLoader == null) {
                if (sSoFileLoader != null) {
                    return;
                }
            }
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method nativeLoadRuntimeMethod = getNativeLoadRuntimeMethod();
            final boolean z = nativeLoadRuntimeMethod != null;
            final String classLoaderLdLoadLibrary = z ? SysUtil.Api14Utils.getClassLoaderLdLoadLibrary() : null;
            final String makeNonZipPath = makeNonZipPath(classLoaderLdLoadLibrary);
            sSoFileLoader = new SoFileLoader() {
                public void loadBytes(String str, ElfByteChannel elfByteChannel, int i) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARNING: type inference failed for: r1v0 */
                /* JADX WARNING: type inference failed for: r1v12 */
                /* JADX WARNING: type inference failed for: r1v14 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
                    if (r1 == null) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
                    android.util.Log.e(com.facebook.soloader.SoLoader.TAG, "Error when loading lib: " + r1 + " lib hash: " + getLibHash(r9) + " search path is " + r10);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void load(java.lang.String r9, int r10) {
                    /*
                        r8 = this;
                        boolean r0 = r2
                        if (r0 == 0) goto L_0x00cf
                        r0 = 4
                        r10 = r10 & r0
                        r1 = 1
                        r2 = 0
                        if (r10 != r0) goto L_0x000c
                        r10 = r1
                        goto L_0x000d
                    L_0x000c:
                        r10 = r2
                    L_0x000d:
                        if (r10 == 0) goto L_0x0012
                        java.lang.String r10 = r3
                        goto L_0x0014
                    L_0x0012:
                        java.lang.String r10 = r4
                    L_0x0014:
                        r0 = 0
                        java.lang.Runtime r3 = r5     // Catch:{ IllegalAccessException -> 0x0082, IllegalArgumentException -> 0x0080, InvocationTargetException -> 0x007e, all -> 0x0079 }
                        monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0082, IllegalArgumentException -> 0x0080, InvocationTargetException -> 0x007e, all -> 0x0079 }
                        java.lang.reflect.Method r4 = r6     // Catch:{ all -> 0x006b }
                        java.lang.Runtime r5 = r5     // Catch:{ all -> 0x006b }
                        r6 = 3
                        java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x006b }
                        r6[r2] = r9     // Catch:{ all -> 0x006b }
                        java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                        java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x006b }
                        r6[r1] = r2     // Catch:{ all -> 0x006b }
                        r1 = 2
                        r6[r1] = r10     // Catch:{ all -> 0x006b }
                        java.lang.Object r1 = r4.invoke(r5, r6)     // Catch:{ all -> 0x006b }
                        java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006b }
                        if (r1 != 0) goto L_0x0065
                        monitor-exit(r3)     // Catch:{ all -> 0x0077 }
                        if (r1 == 0) goto L_0x00d2
                        java.lang.String r0 = "SoLoader"
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "Error when loading lib: "
                        r2.<init>(r3)
                        java.lang.StringBuilder r1 = r2.append(r1)
                        java.lang.String r2 = " lib hash: "
                        java.lang.StringBuilder r1 = r1.append(r2)
                        java.lang.String r9 = r8.getLibHash(r9)
                        java.lang.StringBuilder r9 = r1.append(r9)
                        java.lang.String r1 = " search path is "
                        java.lang.StringBuilder r9 = r9.append(r1)
                        java.lang.StringBuilder r9 = r9.append(r10)
                        java.lang.String r9 = r9.toString()
                        android.util.Log.e(r0, r9)
                        goto L_0x00d2
                    L_0x0065:
                        java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0077 }
                        r0.<init>(r1)     // Catch:{ all -> 0x0077 }
                        throw r0     // Catch:{ all -> 0x0077 }
                    L_0x006b:
                        r1 = move-exception
                        r7 = r1
                        r1 = r0
                        r0 = r7
                    L_0x006f:
                        monitor-exit(r3)     // Catch:{ all -> 0x0077 }
                        throw r0     // Catch:{ IllegalAccessException -> 0x0075, IllegalArgumentException -> 0x0073, InvocationTargetException -> 0x0071 }
                    L_0x0071:
                        r0 = move-exception
                        goto L_0x0086
                    L_0x0073:
                        r0 = move-exception
                        goto L_0x0086
                    L_0x0075:
                        r0 = move-exception
                        goto L_0x0086
                    L_0x0077:
                        r0 = move-exception
                        goto L_0x006f
                    L_0x0079:
                        r1 = move-exception
                        r7 = r1
                        r1 = r0
                        r0 = r7
                        goto L_0x00a0
                    L_0x007e:
                        r1 = move-exception
                        goto L_0x0083
                    L_0x0080:
                        r1 = move-exception
                        goto L_0x0083
                    L_0x0082:
                        r1 = move-exception
                    L_0x0083:
                        r7 = r1
                        r1 = r0
                        r0 = r7
                    L_0x0086:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
                        r2.<init>()     // Catch:{ all -> 0x009f }
                        java.lang.String r3 = "Error: Cannot load "
                        java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x009f }
                        java.lang.StringBuilder r2 = r2.append(r9)     // Catch:{ all -> 0x009f }
                        java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x009f }
                        java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x009f }
                        r2.<init>(r1, r0)     // Catch:{ all -> 0x009f }
                        throw r2     // Catch:{ all -> 0x009f }
                    L_0x009f:
                        r0 = move-exception
                    L_0x00a0:
                        if (r1 == 0) goto L_0x00ce
                        java.lang.String r2 = "SoLoader"
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        java.lang.String r4 = "Error when loading lib: "
                        r3.<init>(r4)
                        java.lang.StringBuilder r1 = r3.append(r1)
                        java.lang.String r3 = " lib hash: "
                        java.lang.StringBuilder r1 = r1.append(r3)
                        java.lang.String r9 = r8.getLibHash(r9)
                        java.lang.StringBuilder r9 = r1.append(r9)
                        java.lang.String r1 = " search path is "
                        java.lang.StringBuilder r9 = r9.append(r1)
                        java.lang.StringBuilder r9 = r9.append(r10)
                        java.lang.String r9 = r9.toString()
                        android.util.Log.e(r2, r9)
                    L_0x00ce:
                        throw r0
                    L_0x00cf:
                        java.lang.System.load(r9)
                    L_0x00d2:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.AnonymousClass1.load(java.lang.String, int):void");
                }

                private String getLibHash(String str) {
                    FileInputStream fileInputStream;
                    try {
                        File file = new File(str);
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        fileInputStream = new FileInputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read > 0) {
                                instance.update(bArr, 0, read);
                            } else {
                                String format = String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                                fileInputStream.close();
                                return format;
                            }
                        }
                    } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
                        return e.toString();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            };
        }
    }

    @Nullable
    private static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e) {
            Log.w(TAG, "Cannot get nativeLoad method", e);
            return null;
        }
    }

    private static int getAppType(Context context, int i) {
        int i2 = sAppType;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 1;
        if ((i & 32) == 0 && context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if ((applicationInfo.flags & 1) != 0) {
                i3 = (applicationInfo.flags & 128) != 0 ? 3 : 2;
            }
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i3);
            }
        }
        return i3;
    }

    public static void setInTestMode() {
        TestOnlyUtils.setSoSources(new SoSource[]{new NoopSoSource()});
    }

    public static void deinitForTest() {
        TestOnlyUtils.setSoSources((SoSource[]) null);
    }

    static class TestOnlyUtils {
        TestOnlyUtils() {
        }

        static void setSoSources(SoSource[] soSourceArr) {
            SoLoader.sSoSourcesLock.writeLock().lock();
            try {
                SoSource[] unused = SoLoader.sSoSources = soSourceArr;
                SoLoader.sSoSourcesVersion.getAndIncrement();
            } finally {
                SoLoader.sSoSourcesLock.writeLock().unlock();
            }
        }

        static void setSoFileLoader(SoFileLoader soFileLoader) {
            SoLoader.sSoFileLoader = soFileLoader;
        }

        static void resetStatus() {
            synchronized (SoLoader.class) {
                SoLoader.sLoadedLibraries.clear();
                SoLoader.sLoadingLibraries.clear();
                SoLoader.sSoFileLoader = null;
            }
            setSoSources((SoSource[]) null);
        }
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.getSupportedAbis()) + " error: " + str);
            initCause(th);
        }
    }

    @Nullable
    public static String getLibraryPath(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String str2 = null;
            if (sSoSources != null) {
                int i = 0;
                while (str2 == null && i < sSoSources.length) {
                    str2 = sSoSources[i].getLibraryPath(str);
                    i++;
                }
            }
            return str2;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @Nullable
    public static String[] getLibraryDependencies(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            String[] strArr = null;
            if (sSoSources != null) {
                int i = 0;
                while (strArr == null && i < sSoSources.length) {
                    strArr = sSoSources[i].getLibraryDependencies(str);
                    i++;
                }
            }
            return strArr;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @Nullable
    public static File getSoFile(String str) {
        String mapLibName = MergedSoMapping.mapLibName(str);
        if (mapLibName != null) {
            str = mapLibName;
        }
        String mapLibraryName = System.mapLibraryName(str);
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                int i = 0;
                while (i < sSoSources.length) {
                    try {
                        File soFileByName = sSoSources[i].getSoFileByName(mapLibraryName);
                        if (soFileByName != null) {
                            return soFileByName;
                        }
                        i++;
                    } catch (IOException unused) {
                    }
                }
            }
            sSoSourcesLock.readLock().unlock();
            return null;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static boolean loadLibrary(String str) {
        return isEnabled ? loadLibrary(str, 0) : NativeLoader.loadLibrary(str);
    }

    public static boolean loadLibrary(String str, int i) throws UnsatisfiedLinkError {
        SystemLoadLibraryWrapper systemLoadLibraryWrapper;
        Boolean loadLibraryOnNonAndroid = loadLibraryOnNonAndroid(str);
        if (loadLibraryOnNonAndroid != null) {
            return loadLibraryOnNonAndroid.booleanValue();
        }
        if (!isEnabled) {
            return NativeLoader.loadLibrary(str);
        }
        int i2 = sAppType;
        if ((i2 == 2 || i2 == 3) && (systemLoadLibraryWrapper = sSystemLoadLibraryWrapper) != null) {
            systemLoadLibraryWrapper.loadLibrary(str);
            return true;
        }
        String mapLibName = MergedSoMapping.mapLibName(str);
        return loadLibraryBySoName(System.mapLibraryName(mapLibName != null ? mapLibName : str), str, mapLibName, i, (StrictMode.ThreadPolicy) null);
    }

    @Nullable
    private static Boolean loadLibraryOnNonAndroid(String str) {
        Boolean valueOf;
        if (sSoSources != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    assertInitialized();
                } else {
                    synchronized (SoLoader.class) {
                        boolean z = !sLoadedLibraries.contains(str);
                        if (z) {
                            SystemLoadLibraryWrapper systemLoadLibraryWrapper = sSystemLoadLibraryWrapper;
                            if (systemLoadLibraryWrapper != null) {
                                systemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                        valueOf = Boolean.valueOf(z);
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return valueOf;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    static void loadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        loadLibraryBySoNameImpl(str, (String) null, (String) null, i, threadPolicy);
    }

    private static boolean loadLibraryBySoName(String str, @Nullable String str2, @Nullable String str3, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2 = false;
        do {
            try {
                z2 = loadLibraryBySoNameImpl(str, str2, str3, i, threadPolicy);
                z = false;
                continue;
            } catch (UnsatisfiedLinkError e) {
                int i2 = sSoSourcesVersion.get();
                sSoSourcesLock.writeLock().lock();
                try {
                    if (sApplicationSoSource == null || !sApplicationSoSource.checkAndMaybeUpdate()) {
                        z = false;
                    } else {
                        Log.w(TAG, "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                        sSoSourcesVersion.getAndIncrement();
                        z = true;
                    }
                    sSoSourcesLock.writeLock().unlock();
                    if (sSoSourcesVersion.get() == i2) {
                        throw e;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    sSoSourcesLock.writeLock().unlock();
                    throw th;
                }
            }
        } while (z);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0151, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r2 + "', which has been merged into '" + r1 + "'.  See comment for details.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0154, code lost:
        if (SYSTRACE_LIBRARY_LOADING != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0156, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0159, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x015a, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x015b, code lost:
        r7.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0164, code lost:
        return !r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0168, code lost:
        sSoSourcesLock.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0171, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r7 = sSoSourcesLock;
        r7.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r10 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r14 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r9.contains(r1) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (r18 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        r7.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        if (r10 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0074, code lost:
        if (android.util.Log.isLoggable(TAG, 3) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0076, code lost:
        android.util.Log.d(TAG, "About to load: " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0088, code lost:
        doLoadLibraryBySoName(r1, r0, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (android.util.Log.isLoggable(TAG, 3) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0095, code lost:
        android.util.Log.d(TAG, "Loaded: " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        r3 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r9.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ad, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b3, code lost:
        r1 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b7, code lost:
        if (r1 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d0, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r0, r1.substring(r1.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00da, code lost:
        if ((r0 & 16) != 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00e0, code lost:
        if (android.text.TextUtils.isEmpty(r17) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e8, code lost:
        if (sLoadedAndMergedLibraries.contains(r2) == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00ea, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00eb, code lost:
        if (r18 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00ed, code lost:
        if (r8 != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ef, code lost:
        r0 = SYSTRACE_LIBRARY_LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00f1, code lost:
        if (r0 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00f3, code lost:
        com.facebook.soloader.Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[", r2, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0100, code lost:
        if (android.util.Log.isLoggable(TAG, 3) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0102, code lost:
        android.util.Log.d(TAG, "About to merge: " + r2 + " / " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x011e, code lost:
        com.facebook.soloader.MergedSoMapping.invokeJniOnload(r17);
        sLoadedAndMergedLibraries.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0126, code lost:
        if (r0 == false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x012c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012e, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean loadLibraryBySoNameImpl(java.lang.String r16, @javax.annotation.Nullable java.lang.String r17, @javax.annotation.Nullable java.lang.String r18, int r19, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r20) {
        /*
            r1 = r16
            r2 = r17
            r0 = r19
            java.lang.String r3 = "Loaded: "
            java.lang.String r4 = "About to load: "
            java.lang.String r5 = "About to merge: "
            java.lang.String r6 = "Failed to call JNI_OnLoad from '"
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            r8 = 0
            if (r7 != 0) goto L_0x001e
            java.util.Set<java.lang.String> r7 = sLoadedAndMergedLibraries
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L_0x001e
            return r8
        L_0x001e:
            java.lang.Class<com.facebook.soloader.SoLoader> r7 = com.facebook.soloader.SoLoader.class
            monitor-enter(r7)
            java.util.HashSet<java.lang.String> r9 = sLoadedLibraries     // Catch:{ all -> 0x0172 }
            boolean r10 = r9.contains(r1)     // Catch:{ all -> 0x0172 }
            r11 = 1
            if (r10 == 0) goto L_0x0030
            if (r18 != 0) goto L_0x002e
            monitor-exit(r7)     // Catch:{ all -> 0x0172 }
            return r8
        L_0x002e:
            r10 = r11
            goto L_0x0031
        L_0x0030:
            r10 = r8
        L_0x0031:
            java.util.Map<java.lang.String, java.lang.Object> r12 = sLoadingLibraries     // Catch:{ all -> 0x0172 }
            boolean r13 = r12.containsKey(r1)     // Catch:{ all -> 0x0172 }
            if (r13 == 0) goto L_0x003e
            java.lang.Object r12 = r12.get(r1)     // Catch:{ all -> 0x0172 }
            goto L_0x0047
        L_0x003e:
            java.lang.Object r13 = new java.lang.Object     // Catch:{ all -> 0x0172 }
            r13.<init>()     // Catch:{ all -> 0x0172 }
            r12.put(r1, r13)     // Catch:{ all -> 0x0172 }
            r12 = r13
        L_0x0047:
            monitor-exit(r7)     // Catch:{ all -> 0x0172 }
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = sSoSourcesLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r7.readLock()
            r13.lock()
            monitor-enter(r12)     // Catch:{ all -> 0x0167 }
            r13 = 3
            if (r10 != 0) goto L_0x00d8
            java.lang.Class<com.facebook.soloader.SoLoader> r14 = com.facebook.soloader.SoLoader.class
            monitor-enter(r14)     // Catch:{ all -> 0x00d5 }
            boolean r15 = r9.contains(r1)     // Catch:{ all -> 0x00d2 }
            if (r15 == 0) goto L_0x006b
            if (r18 != 0) goto L_0x006a
            monitor-exit(r14)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r12)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.readLock()
            r0.unlock()
            return r8
        L_0x006a:
            r10 = r11
        L_0x006b:
            monitor-exit(r14)     // Catch:{ all -> 0x00d2 }
            if (r10 != 0) goto L_0x00d8
            java.lang.String r14 = "SoLoader"
            boolean r14 = android.util.Log.isLoggable(r14, r13)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            if (r14 == 0) goto L_0x0088
            java.lang.String r14 = "SoLoader"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            r15.<init>(r4)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.StringBuilder r4 = r15.append(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            android.util.Log.d(r14, r4)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
        L_0x0088:
            r4 = r20
            doLoadLibraryBySoName(r1, r0, r4)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.String r4 = "SoLoader"
            boolean r4 = android.util.Log.isLoggable(r4, r13)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = "SoLoader"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r14.<init>(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r3 = r14.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d5 }
            android.util.Log.d(r4, r3)     // Catch:{ all -> 0x00d5 }
        L_0x00a7:
            java.lang.Class<com.facebook.soloader.SoLoader> r3 = com.facebook.soloader.SoLoader.class
            monitor-enter(r3)     // Catch:{ all -> 0x00d5 }
            r9.add(r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r3)     // Catch:{ all -> 0x00af }
            goto L_0x00d8
        L_0x00af:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00b2:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d1
            java.lang.String r2 = "unexpected e_machine:"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = "unexpected e_machine:"
            int r2 = r1.lastIndexOf(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r1.substring(r2)     // Catch:{ all -> 0x00d5 }
            com.facebook.soloader.SoLoader$WrongAbiError r2 = new com.facebook.soloader.SoLoader$WrongAbiError     // Catch:{ all -> 0x00d5 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00d5 }
            throw r2     // Catch:{ all -> 0x00d5 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            goto L_0x0165
        L_0x00d8:
            r0 = r0 & 16
            if (r0 != 0) goto L_0x015a
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x00eb
            java.util.Set<java.lang.String> r0 = sLoadedAndMergedLibraries     // Catch:{ all -> 0x00d5 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00eb
            r8 = r11
        L_0x00eb:
            if (r18 == 0) goto L_0x015a
            if (r8 != 0) goto L_0x015a
            boolean r0 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r3 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r4 = "]"
            com.facebook.soloader.Api18TraceUtils.beginTraceSection(r3, r2, r4)     // Catch:{ all -> 0x00d5 }
        L_0x00fa:
            java.lang.String r3 = "SoLoader"
            boolean r3 = android.util.Log.isLoggable(r3, r13)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            if (r3 == 0) goto L_0x011e
            java.lang.String r3 = "SoLoader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            r4.<init>(r5)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            java.lang.StringBuilder r4 = r4.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            java.lang.String r5 = " / "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            android.util.Log.d(r3, r4)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
        L_0x011e:
            com.facebook.soloader.MergedSoMapping.invokeJniOnload(r17)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            java.util.Set<java.lang.String> r3 = sLoadedAndMergedLibraries     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            r3.add(r2)     // Catch:{ UnsatisfiedLinkError -> 0x012e }
            if (r0 == 0) goto L_0x015a
            com.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x00d5 }
            goto L_0x015a
        L_0x012c:
            r0 = move-exception
            goto L_0x0152
        L_0x012e:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r4.<init>(r6)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "', which has been merged into '"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "'.  See comment for details."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012c }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x012c }
            throw r3     // Catch:{ all -> 0x012c }
        L_0x0152:
            boolean r1 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x0159
            com.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x00d5 }
        L_0x0159:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x015a:
            monitor-exit(r12)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.readLock()
            r0.unlock()
            r0 = r10 ^ 1
            return r0
        L_0x0165:
            monitor-exit(r12)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = sSoSourcesLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        L_0x0172:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0172 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.loadLibraryBySoNameImpl(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void doLoadLibraryBySoName(java.lang.String r12, int r13, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r14) throws java.lang.UnsatisfiedLinkError {
        /*
            java.lang.String r0 = " result: "
            java.lang.String r1 = "Could not load: "
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = sSoSourcesLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            r3.lock()
            com.facebook.soloader.SoSource[] r3 = sSoSources     // Catch:{ all -> 0x018f }
            java.lang.String r4 = "SoLoader"
            java.lang.String r5 = "couldn't find DSO to load: "
            if (r3 == 0) goto L_0x0166
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.readLock()
            r1.unlock()
            r1 = 1
            r3 = 0
            if (r14 != 0) goto L_0x0026
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskReads()
            r6 = r1
            goto L_0x0027
        L_0x0026:
            r6 = r3
        L_0x0027:
            boolean r7 = SYSTRACE_LIBRARY_LOADING
            if (r7 == 0) goto L_0x0032
            java.lang.String r7 = "SoLoader.loadLibrary["
            java.lang.String r8 = "]"
            com.facebook.soloader.Api18TraceUtils.beginTraceSection(r7, r12, r8)
        L_0x0032:
            r7 = 3
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()     // Catch:{ all -> 0x011d }
            r2.lock()     // Catch:{ all -> 0x011d }
            r2 = r3
            r8 = r2
        L_0x003c:
            if (r2 != 0) goto L_0x0092
            com.facebook.soloader.SoSource[] r9 = sSoSources     // Catch:{ all -> 0x0086 }
            int r9 = r9.length     // Catch:{ all -> 0x0086 }
            if (r8 >= r9) goto L_0x0092
            com.facebook.soloader.SoSource[] r9 = sSoSources     // Catch:{ all -> 0x0086 }
            r9 = r9[r8]     // Catch:{ all -> 0x0086 }
            int r2 = r9.loadLibrary(r12, r13, r14)     // Catch:{ all -> 0x0086 }
            if (r2 != r7) goto L_0x0083
            com.facebook.soloader.UnpackingSoSource[] r9 = sBackupSoSources     // Catch:{ all -> 0x0086 }
            if (r9 == 0) goto L_0x0083
            boolean r8 = android.util.Log.isLoggable(r4, r7)     // Catch:{ all -> 0x0086 }
            if (r8 == 0) goto L_0x006d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r8.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r9 = "Trying backup SoSource for "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r8 = r8.append(r12)     // Catch:{ all -> 0x0086 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0086 }
            android.util.Log.d(r4, r8)     // Catch:{ all -> 0x0086 }
        L_0x006d:
            com.facebook.soloader.UnpackingSoSource[] r8 = sBackupSoSources     // Catch:{ all -> 0x0086 }
            int r9 = r8.length     // Catch:{ all -> 0x0086 }
            r10 = r3
        L_0x0071:
            if (r10 >= r9) goto L_0x0092
            r11 = r8[r10]     // Catch:{ all -> 0x0086 }
            r11.prepare((java.lang.String) r12)     // Catch:{ all -> 0x0086 }
            int r11 = r11.loadLibrary(r12, r13, r14)     // Catch:{ all -> 0x0086 }
            if (r11 != r1) goto L_0x0080
            r2 = r11
            goto L_0x0092
        L_0x0080:
            int r10 = r10 + 1
            goto L_0x0071
        L_0x0083:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0086:
            r13 = move-exception
            r3 = r2
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = sSoSourcesLock     // Catch:{ all -> 0x011d }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ all -> 0x011d }
            r1.unlock()     // Catch:{ all -> 0x011d }
            throw r13     // Catch:{ all -> 0x011d }
        L_0x0092:
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = sSoSourcesLock     // Catch:{ all -> 0x011a }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r13.readLock()     // Catch:{ all -> 0x011a }
            r1.unlock()     // Catch:{ all -> 0x011a }
            boolean r1 = SYSTRACE_LIBRARY_LOADING
            if (r1 == 0) goto L_0x00a2
            com.facebook.soloader.Api18TraceUtils.endSection()
        L_0x00a2:
            if (r6 == 0) goto L_0x00a7
            android.os.StrictMode.setThreadPolicy(r14)
        L_0x00a7:
            if (r2 == 0) goto L_0x00ab
            if (r2 != r7) goto L_0x012f
        L_0x00ab:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            java.lang.StringBuilder r12 = r14.append(r12)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r13.readLock()
            r13.lock()
        L_0x00bb:
            com.facebook.soloader.SoSource[] r13 = sSoSources
            int r13 = r13.length
            if (r3 >= r13) goto L_0x00de
            java.lang.String r13 = "\n\tSoSource "
            java.lang.StringBuilder r13 = r12.append(r13)
            java.lang.StringBuilder r13 = r13.append(r3)
            java.lang.String r14 = ": "
            java.lang.StringBuilder r13 = r13.append(r14)
            com.facebook.soloader.SoSource[] r14 = sSoSources
            r14 = r14[r3]
            java.lang.String r14 = r14.toString()
            r13.append(r14)
            int r3 = r3 + 1
            goto L_0x00bb
        L_0x00de:
            com.facebook.soloader.ApplicationSoSource r13 = sApplicationSoSource
            if (r13 == 0) goto L_0x00fd
            android.content.Context r13 = r13.getUpdatedContext()
            java.io.File r13 = com.facebook.soloader.ApplicationSoSource.getNativeLibDirFromContext(r13)
            java.lang.String r14 = "\n\tNative lib dir: "
            java.lang.StringBuilder r14 = r12.append(r14)
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.StringBuilder r13 = r14.append(r13)
            java.lang.String r14 = "\n"
            r13.append(r14)
        L_0x00fd:
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = sSoSourcesLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r13.readLock()
            r13.unlock()
            java.lang.StringBuilder r13 = r12.append(r0)
            r13.append(r2)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r4, r12)
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError
            r13.<init>(r12)
            throw r13
        L_0x011a:
            r13 = move-exception
            r3 = r2
            goto L_0x011e
        L_0x011d:
            r13 = move-exception
        L_0x011e:
            boolean r1 = SYSTRACE_LIBRARY_LOADING
            if (r1 == 0) goto L_0x0125
            com.facebook.soloader.Api18TraceUtils.endSection()
        L_0x0125:
            if (r6 == 0) goto L_0x012a
            android.os.StrictMode.setThreadPolicy(r14)
        L_0x012a:
            if (r3 == 0) goto L_0x0130
            if (r3 != r7) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            return
        L_0x0130:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            java.lang.StringBuilder r12 = r14.append(r12)
            java.lang.String r14 = r13.getMessage()
            if (r14 != 0) goto L_0x0143
            java.lang.String r14 = r13.toString()
        L_0x0143:
            java.lang.String r1 = " caused by: "
            java.lang.StringBuilder r1 = r12.append(r1)
            r1.append(r14)
            r13.printStackTrace()
            java.lang.StringBuilder r14 = r12.append(r0)
            r14.append(r3)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r4, r12)
            java.lang.UnsatisfiedLinkError r14 = new java.lang.UnsatisfiedLinkError
            r14.<init>(r12)
            r14.initCause(r13)
            throw r14
        L_0x0166:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r13.<init>(r1)     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r13 = r13.append(r12)     // Catch:{ all -> 0x018f }
            java.lang.String r14 = " because no SO source exists"
            java.lang.StringBuilder r13 = r13.append(r14)     // Catch:{ all -> 0x018f }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x018f }
            android.util.Log.e(r4, r13)     // Catch:{ all -> 0x018f }
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r14.<init>(r5)     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r12 = r14.append(r12)     // Catch:{ all -> 0x018f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x018f }
            r13.<init>(r12)     // Catch:{ all -> 0x018f }
            throw r13     // Catch:{ all -> 0x018f }
        L_0x018f:
            r12 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = sSoSourcesLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r13 = r13.readLock()
            r13.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.doLoadLibraryBySoName(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    @Nullable
    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(CertificateUtil.DELIMITER);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(CertificateUtil.DELIMITER, arrayList);
    }

    static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        try {
            for (SoSource unpackLibrary : sSoSources) {
                File unpackLibrary2 = unpackLibrary.unpackLibrary(str);
                if (unpackLibrary2 != null) {
                    return unpackLibrary2;
                }
            }
            sSoSourcesLock.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static void assertInitialized() {
        if (!isInitialized()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    public static boolean isInitialized() {
        boolean z = true;
        if (sSoSources != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    public static int getSoSourcesVersion() {
        return sSoSourcesVersion.get();
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[(sSoSources.length + 1)];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion.getAndIncrement();
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Prepended to SO sources: " + soSource);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    public static String makeLdLibraryPath() {
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            SoSource[] soSourceArr = sSoSources;
            if (soSourceArr != null) {
                for (SoSource addToLdLibraryPath : soSourceArr) {
                    addToLdLibraryPath.addToLdLibraryPath(arrayList);
                }
            }
            String join = TextUtils.join(CertificateUtil.DELIMITER, arrayList);
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "makeLdLibraryPath final path: " + join);
            }
            return join;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean areSoSourcesAbisSupported() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                for (SoSource soSourceAbis : sSoSources) {
                    String[] soSourceAbis2 = soSourceAbis.getSoSourceAbis();
                    int length = soSourceAbis2.length;
                    int i = 0;
                    while (i < length) {
                        String str = soSourceAbis2[i];
                        boolean z = false;
                        for (int i2 = 0; i2 < supportedAbis.length && !z; i2++) {
                            z = str.equals(supportedAbis[i2]);
                        }
                        if (!z) {
                            Log.e(TAG, "abi not supported: " + str);
                            reentrantReadWriteLock = sSoSourcesLock;
                        } else {
                            i++;
                        }
                    }
                }
                sSoSourcesLock.readLock().unlock();
                return true;
            }
            reentrantReadWriteLock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    public static boolean useDepsFile(Context context, boolean z, boolean z2) {
        return NativeDeps.useDepsFile(context, z, z2);
    }

    public static int getLoadedLibrariesCount() {
        return sLoadedLibraries.size();
    }
}
