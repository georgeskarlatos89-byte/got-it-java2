package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class h extends g {
    private String A1;
    private String B1;
    private String C1;
    private String D1;
    private String E1;
    private String F1;
    private String G1;
    private String H1;
    private String I1;
    private String J1;
    private String K1;
    private int L1;
    private boolean M1;
    private boolean N1;
    private String O1;
    private boolean P1;
    private String Q1;
    private long R1 = -1;
    private long S1 = -1;
    private long T1 = -1;
    private JSONObject U1;
    private JSONObject V1;
    private JSONObject W1;
    private JSONObject X1;
    private JSONObject Y1;
    private JSONArray Z1;
    private JSONObject a2;
    private JSONArray b2;
    private e c2;
    private String x1;
    private String y1;
    private String z1;

    class a implements FileFilter {
        a() {
        }

        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                lib.android.paypal.com.magnessdk.c$k$b[] r0 = lib.android.paypal.com.magnessdk.c.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.IS_TEST_KEYS_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.IS_SU_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.IS_SUPER_USER_APK_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.DETECT_ROOT_MANAGEMENT_APPS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_SU     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_BUSYBOX     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                lib.android.paypal.com.magnessdk.c$k$b r1 = lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_MAGISK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.h.b.<clinit>():void");
        }
    }

    static final class c {
        private static int a = 5;
        private static Boolean[] b;

        private c() {
        }

        private static boolean a() {
            return g() || lib.android.paypal.com.magnessdk.filesystem.c.a(c.f.f, "");
        }

        private static boolean a(Context context) {
            return lib.android.paypal.com.magnessdk.filesystem.d.a(context, (List<String>) new ArrayList(Arrays.asList(c.f.a)));
        }

        static String b(Context context) {
            if (b == null) {
                b = new Boolean[a];
                int i = 0;
                while (i < a) {
                    b[i] = Boolean.valueOf(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? false : b() : a(context) : c() : a() : h());
                    i++;
                }
            }
            return f.a(b);
        }

        private static boolean b() {
            return d() || f() || e();
        }

        private static boolean c() {
            return lib.android.paypal.com.magnessdk.filesystem.c.a(c.f.b, "");
        }

        static boolean c(Context context) {
            String b2 = b(context);
            return b2 != null && b2.contains("1");
        }

        private static boolean d() {
            return lib.android.paypal.com.magnessdk.filesystem.c.a(c.f.d, "");
        }

        private static boolean e() {
            return lib.android.paypal.com.magnessdk.filesystem.c.a(c.f.c, "");
        }

        private static boolean f() {
            return lib.android.paypal.com.magnessdk.filesystem.c.a(c.f.e, "");
        }

        private static boolean g() {
            return new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + "windows" + File.separatorChar + "BstSharedFolder").exists();
        }

        private static boolean h() {
            return m() || i() || j() || l() || n() || k() || o();
        }

        private static boolean i() {
            String str = Build.BRAND;
            return str.equals(c.d.C0003c.GENERIC.toString()) || str.equals(c.d.C0003c.GENERIC_X86.toString()) || str.equals("Android") || str.equals(c.d.C0003c.ANDY_OS.toString());
        }

        private static boolean j() {
            String str = Build.DEVICE;
            return str.equals(c.d.C0003c.ANDY_OSX.toString()) || str.equals(c.d.C0003c.DROID_4X.toString()) || str.equals(c.d.C0003c.GENERIC.toString()) || str.equals(c.d.C0003c.GENERIC_X86.toString()) || str.equals(c.d.C0003c.VBOX_86P.toString());
        }

        private static boolean k() {
            return Build.FINGERPRINT.startsWith(c.d.C0003c.GENERIC.toString());
        }

        private static boolean l() {
            String str = Build.HARDWARE;
            return str.equals(c.d.C0003c.GOLDFISH.toString()) || str.equals(c.d.C0003c.VBOX_86.toString()) || str.equals(c.d.C0003c.ANDY.toString()) || str.equals(c.d.C0003c.RANCHU.toString()) || str.equals(c.d.C0003c.TTVM_X86.toString()) || str.equals(c.d.C0003c.ANDROID_X86.toString());
        }

        private static boolean m() {
            String str = Build.MANUFACTURER;
            return str.equals(c.d.C0003c.UNKNOWN.toString()) || str.equals(c.d.C0003c.GENY_MOTION.toString()) || str.contains(c.d.C0003c.ANDY_OS.toString());
        }

        private static boolean n() {
            String str = Build.MODEL;
            return str.equals(c.d.C0003c.SDK.toString()) || str.equals(c.d.C0003c.GOODLE_SDK.toString()) || str.equals(c.d.C0003c.ANDROID_SDK_BUILD_FOR_X86.toString());
        }

        private static boolean o() {
            String str = Build.PRODUCT;
            return str.matches(".*_?sdk_?.*") || str.equals(c.d.C0003c.VBOX_86P.toString()) || str.equals(c.d.C0003c.GENY_MOTION.toString()) || str.equals(c.d.C0003c.DRIOD_4X.toString()) || str.equals(c.d.C0003c.ANDY_OSX.toString()) || str.equals(c.d.C0003c.REMIXEMU.toString());
        }
    }

    static final class d {
        private static int a = c.k.b.NUMBER_OF_ROOTED_FLAGS.a();
        private static Boolean[] b = null;

        private d() {
        }

        private static boolean a() {
            try {
                return new File(b("suFileName")).exists();
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((Class<?>) d.class, 3, (Throwable) e);
                return false;
            }
        }

        private static boolean a(Context context) {
            return lib.android.paypal.com.magnessdk.filesystem.d.a(context, (List<String>) new ArrayList(Arrays.asList(c.k.KNOWN_ROOT_APPS_PACKAGES.a())));
        }

        private static boolean a(String str) {
            return lib.android.paypal.com.magnessdk.filesystem.c.a(c.k.SU_PATHS.a(), str);
        }

        static String b(Context context) {
            boolean z;
            c.k.a aVar;
            if (b == null) {
                b = new Boolean[a];
                for (int i = 0; i < a; i++) {
                    c.k.b a2 = c.k.b.a(i);
                    if (a2 == null) {
                        return null;
                    }
                    switch (b.a[a2.ordinal()]) {
                        case 1:
                            z = c();
                            continue;
                        case 2:
                            z = a();
                            continue;
                        case 3:
                            z = b();
                            continue;
                        case 4:
                            z = a(context);
                            continue;
                        case 5:
                            aVar = c.k.a.SU;
                            break;
                        case 6:
                            aVar = c.k.a.BUSYBOX;
                            break;
                        case 7:
                            aVar = c.k.a.MAGISK;
                            break;
                        default:
                            z = false;
                            continue;
                    }
                    z = a(aVar.toString());
                    b[i] = Boolean.valueOf(z);
                }
            }
            return f.a(b);
        }

        private static String b(String str) throws IOException {
            Properties properties = new Properties();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(lib.android.paypal.com.magnessdk.filesystem.b.h.getBytes("UTF-8"));
            try {
                properties.load(byteArrayInputStream);
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((Class<?>) d.class, 3, (Throwable) e);
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
            return properties.getProperty(str);
        }

        private static boolean b() {
            try {
                return new File(b("superUserApk")).exists();
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((Class<?>) d.class, 3, (Throwable) e);
                return false;
            }
        }

        private static boolean c() {
            String str = Build.TAGS;
            return str != null && str.contains("test-keys");
        }

        static boolean c(Context context) {
            String b2 = b(context);
            if (b2 != null) {
                return b2.contains("1");
            }
            return false;
        }
    }

    h() {
    }

    private JSONArray a(MagnesSettings magnesSettings) {
        try {
            JSONArray jSONArray = new JSONArray();
            SensorManager sensorManager = (SensorManager) magnesSettings.getContext().getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor != null) {
                JSONObject a3 = f.a(defaultSensor);
                a3.put(c.a.SENSOR_TYPE.toString(), c.l.AC.toString());
                jSONArray.put(a3);
            }
            if (defaultSensor2 != null) {
                JSONObject a4 = f.a(defaultSensor2);
                a4.put(c.a.SENSOR_TYPE.toString(), c.l.GY.toString());
                jSONArray.put(a4);
            }
            if (defaultSensor3 != null) {
                JSONObject a5 = f.a(defaultSensor3);
                a5.put(c.a.SENSOR_TYPE.toString(), c.l.MG.toString());
                jSONArray.put(a5);
            }
            return jSONArray;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(int r11) {
        /*
            r10 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/sys/devices/system/cpu/"
            r0.<init>(r1)
            lib.android.paypal.com.magnessdk.h$a r1 = new lib.android.paypal.com.magnessdk.h$a
            r1.<init>()
            java.io.File[] r0 = r0.listFiles(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 12345(0x3039, float:1.7299E-41)
            if (r0 == 0) goto L_0x00a2
            r3 = 3
            if (r11 != r3) goto L_0x001d
            int r11 = r0.length
            goto L_0x00a3
        L_0x001d:
            r3 = 2
            java.lang.String r4 = "-403"
            r5 = -403(0xfffffffffffffe6d, float:NaN)
            r6 = 0
            if (r11 != r3) goto L_0x0062
            int r11 = r0.length
            r3 = r1
        L_0x0027:
            if (r6 >= r11) goto L_0x0060
            r7 = r0[r6]
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = r7.getPath()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r9 = "/cpufreq/cpuinfo_min_freq"
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.String r7 = lib.android.paypal.com.magnessdk.filesystem.c.c(r8)
            if (r7 == 0) goto L_0x005e
            boolean r8 = r7.equals(r4)
            if (r8 == 0) goto L_0x0054
            goto L_0x005e
        L_0x0054:
            int r7 = java.lang.Integer.parseInt(r7)
            if (r7 >= r3) goto L_0x005b
            r3 = r7
        L_0x005b:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x005e:
            r11 = r5
            goto L_0x00a3
        L_0x0060:
            r11 = r3
            goto L_0x00a3
        L_0x0062:
            r3 = 1
            if (r11 != r3) goto L_0x00a2
            int r11 = r0.length
            r3 = r6
        L_0x0067:
            if (r6 >= r11) goto L_0x0060
            r7 = r0[r6]
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = r7.getPath()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r9 = "/cpufreq/cpuinfo_max_freq"
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.String r7 = lib.android.paypal.com.magnessdk.filesystem.c.c(r8)
            if (r7 == 0) goto L_0x005e
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0094
            goto L_0x005e
        L_0x0094:
            java.lang.String r7 = lib.android.paypal.com.magnessdk.filesystem.c.c(r8)
            int r7 = java.lang.Integer.parseInt(r7)
            if (r7 <= r3) goto L_0x009f
            r3 = r7
        L_0x009f:
            int r6 = r6 + 1
            goto L_0x0067
        L_0x00a2:
            r11 = r2
        L_0x00a3:
            if (r11 == 0) goto L_0x00a9
            if (r11 != r1) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = r11
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.h.b(int):int");
    }

    private long b(String str) {
        StatFs statFs = new StatFs(str);
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    private String b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(lib.android.paypal.com.magnessdk.filesystem.b.c, 0);
        String string = sharedPreferences.getString(lib.android.paypal.com.magnessdk.filesystem.b.c, "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (str == null || str.equals(string)) {
            if (!string.equals("")) {
                return string;
            }
            str = f.a(true);
        }
        edit.putString(lib.android.paypal.com.magnessdk.filesystem.b.c, str);
        edit.apply();
        return str;
    }

    private String c(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), lib.android.paypal.com.magnessdk.filesystem.b.f);
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            int b3 = b(3);
            int b4 = b(2);
            int b5 = b(1);
            jSONObject.put(c.d.a.MIN_FREQUENCY.toString(), a((Object) Integer.valueOf(b4)));
            jSONObject.put(c.d.a.MAX_FREQUENCY.toString(), a((Object) Integer.valueOf(b5)));
            jSONObject.put(c.d.a.CORES.toString(), a((Object) Integer.valueOf(b3)));
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private long d(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        long b3 = b(Environment.getDataDirectory().getPath());
        try {
            jSONObject.put(c.d.b.TOTAL_SD.toString(), a((Object) Long.valueOf(a(601))));
            jSONObject.put(c.d.b.TOTAL_UD.toString(), a((Object) Long.valueOf(b3)));
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private long e(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String property = System.getProperty("os.name");
            String property2 = System.getProperty("os.version");
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(property)) {
                property = "";
            }
            objArr[0] = property;
            if (TextUtils.isEmpty(property2)) {
                property2 = "";
            }
            objArr[1] = property2;
            String format = String.format("%s %s", objArr);
            if (!TextUtils.isEmpty(format)) {
                jSONObject.put(c.d.f.VERSION.toString(), a((Object) format.trim()));
            }
            jSONObject.put(c.d.f.BOARD.toString(), a((Object) Build.BOARD));
            jSONObject.put(c.d.f.BOOTLOADER.toString(), a((Object) Build.BOOTLOADER));
            jSONObject.put(c.d.f.CPU_ABI1.toString(), a((Object) Build.SUPPORTED_ABIS[0]));
            jSONObject.put(c.d.f.DISPLAY.toString(), a((Object) Build.DISPLAY));
            jSONObject.put(c.d.f.RADIO.toString(), a((Object) Build.getRadioVersion()));
            jSONObject.put(c.d.f.FINGERPRINT.toString(), a((Object) Build.FINGERPRINT));
            jSONObject.put(c.d.f.HARDWARE.toString(), a((Object) Build.HARDWARE));
            jSONObject.put(c.d.f.MANUFACTURER.toString(), a((Object) Build.MANUFACTURER));
            jSONObject.put(c.d.f.PRODUCT.toString(), a((Object) Build.PRODUCT));
            jSONObject.put(c.d.f.TIME.toString(), a((Object) Long.valueOf(Build.TIME)));
            jSONObject.put(c.d.f.SYSTEM_TYPE.toString(), a((Object) System.getProperty("os.arch")));
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private long f() throws IllegalArgumentException {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
    }

    private String f(Context context) throws PackageManager.NameNotFoundException {
        return f.a(context);
    }

    private String g(Context context) {
        Uri uri;
        Cursor query;
        try {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null || !a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") || (query = context.getContentResolver().query(uri, (String[]) null, (String) null, new String[]{lib.android.paypal.com.magnessdk.filesystem.b.f}, (String) null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                if (query.getColumnCount() >= 2) {
                    String hexString = Long.toHexString(Long.parseLong(query.getString(1)));
                    query.close();
                    return hexString;
                }
            }
            return null;
        } catch (NumberFormatException e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
            return null;
        } finally {
            query.close();
        }
    }

    private String h(Context context) {
        WifiInfo connectionInfo = a(context, "android.permission.ACCESS_WIFI_STATE") ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo() : null;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    private JSONObject i(Context context) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        int i3;
        JSONObject jSONObject = new JSONObject();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                i2 = bounds.width();
                i3 = bounds.height();
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                int i4 = point.x;
                int i5 = point.y;
                i2 = i4;
                i3 = i5;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f4 = displayMetrics.density;
            i = displayMetrics.densityDpi;
            f3 = displayMetrics.scaledDensity;
            f2 = displayMetrics.xdpi;
            f = displayMetrics.ydpi;
        } else {
            i3 = 12345;
            f4 = 12345.0f;
            i2 = 12345;
            i = 12345;
            f = 12345.0f;
            f3 = 12345.0f;
            f2 = 12345.0f;
        }
        try {
            jSONObject.put(c.d.C0004d.WIDTH.toString(), a((Object) Integer.valueOf(i2)));
            jSONObject.put(c.d.C0004d.HEIGHT.toString(), a((Object) Integer.valueOf(i3)));
            jSONObject.put(c.d.C0004d.DENSITY.toString(), a((Object) Float.valueOf(f4)));
            jSONObject.put(c.d.C0004d.DENSITY_DPI.toString(), a((Object) Integer.valueOf(i)));
            jSONObject.put(c.d.C0004d.SCALE.toString(), a((Object) Float.valueOf(f3)));
            jSONObject.put(c.d.C0004d.X_DPI.toString(), a((Object) Float.valueOf(f2)));
            jSONObject.put(c.d.C0004d.Y_DPI.toString(), a((Object) Float.valueOf(f)));
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private JSONObject j(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dua", a((Object) WebSettings.getDefaultUserAgent(context)));
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.d.APP_GUID.toString(), this.x1);
            jSONObject.put(c.d.APP_ID.toString(), this.y1);
            jSONObject.put(c.d.ANDROID_ID.toString(), this.D1);
            jSONObject.put(c.d.APP_VERSION.toString(), this.z1);
            String dVar = c.d.APP_FIRST_INSTALL_TIME.toString();
            long j = this.S1;
            Long l = null;
            jSONObject.put(dVar, j == -1 ? null : Long.valueOf(j));
            String dVar2 = c.d.APP_LAST_UPDATE_TIME.toString();
            long j2 = this.T1;
            jSONObject.put(dVar2, j2 == -1 ? null : Long.valueOf(j2));
            jSONObject.put(c.d.CONF_URL.toString(), this.J1);
            jSONObject.put(c.d.COMP_VERSION.toString(), this.K1);
            jSONObject.put(c.d.DEVICE_MODEL.toString(), this.A1);
            jSONObject.put(c.d.DEVICE_NAME.toString(), this.B1);
            jSONObject.put(c.d.GSF_ID.toString(), this.E1);
            jSONObject.put(c.d.IS_EMULATOR.toString(), this.N1);
            jSONObject.put(c.d.EMULATOR_FLAGS.toString(), this.O1);
            jSONObject.put(c.d.IS_ROOTED.toString(), this.P1);
            jSONObject.put(c.d.ROOTED_FLAGS.toString(), this.Q1);
            jSONObject.put(c.d.OS_TYPE.toString(), "Android");
            jSONObject.put(c.d.OS_VERSION.toString(), this.C1);
            jSONObject.put(c.d.PAYLOAD_TYPE.toString(), this.G1);
            jSONObject.put(c.d.SMS_ENABLED.toString(), this.M1);
            jSONObject.put(c.d.MAC_ADDRS.toString(), this.F1);
            jSONObject.put(c.d.MAGNES_GUID.toString(), this.U1);
            String dVar3 = c.d.MAGNES_SOURCE.toString();
            int i = this.L1;
            jSONObject.put(dVar3, i == 0 ? null : Integer.valueOf(i));
            jSONObject.put(c.d.NOTIF_TOKEN.toString(), this.I1);
            jSONObject.put(c.d.SOURCE_APP_VERSION.toString(), this.H1);
            String dVar4 = c.d.TOTAL_STORAGE_SPACE.toString();
            long j3 = this.R1;
            if (j3 != -1) {
                l = Long.valueOf(j3);
            }
            jSONObject.put(dVar4, l);
            jSONObject.put(c.d.NOT_COLLECTIBLE_LIST.toString(), this.Z1);
            jSONObject.put(c.d.SENSOR_METADATA.toString(), this.b2);
            jSONObject.put(c.d.SCREEN.toString(), this.V1);
            jSONObject.put(c.d.CPU.toString(), this.W1);
            jSONObject.put(c.d.DISK.toString(), this.X1);
            jSONObject.put(c.d.SYSTEM.toString(), this.Y1);
            jSONObject.put(c.d.USER_AGENT.toString(), this.a2);
            jSONObject.put(c.d.IN_TREATMENT.toString(), g.j1);
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
            return jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar) {
        this.c2 = eVar;
        lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 0, "collecting RiskBlobCoreData");
        a(1, magnesSettings);
        a(2, magnesSettings);
        a(3, magnesSettings);
        a(65, magnesSettings);
        a(66, magnesSettings);
        a(69, magnesSettings);
        a(8, magnesSettings);
        a(9, magnesSettings);
        a(14, magnesSettings);
        a(15, magnesSettings);
        a(70, magnesSettings);
        a(59, magnesSettings);
        a(103, magnesSettings);
        a(60, magnesSettings);
        a(100, magnesSettings);
        a(32, magnesSettings);
        a(86, magnesSettings);
        a(62, magnesSettings);
        a(34, magnesSettings);
        a(37, magnesSettings);
        a(38, magnesSettings);
        a(63, magnesSettings);
        a(47, magnesSettings);
        a(52, magnesSettings);
        a(88, magnesSettings);
        g.j1 = false;
        if (a(dVar, magnesSettings.getMagnesSource(), g.k1, g.r1, magnesSettings.getContext())) {
            a(91, magnesSettings);
            a(90, magnesSettings);
            a(93, magnesSettings);
            a(94, magnesSettings);
            a(95, magnesSettings);
            a(101, magnesSettings);
        }
        return a();
    }

    /* access modifiers changed from: package-private */
    public void a(int i, MagnesSettings magnesSettings) {
        try {
            Context context = magnesSettings.getContext();
            switch (i) {
                case 1:
                    this.x1 = b(context, magnesSettings.getAppGuid());
                    return;
                case 2:
                    this.y1 = a(context);
                    return;
                case 3:
                    if (this.c2.a(i)) {
                        this.z1 = f(context);
                        return;
                    }
                    return;
                case 8:
                    this.K1 = a.o;
                    return;
                case 9:
                    if (this.c2.a(i)) {
                        this.J1 = c.h.d.REMOTE_CONFIG_URL.toString();
                        return;
                    }
                    return;
                case 14:
                    if (this.c2.a(i)) {
                        this.A1 = Build.MODEL;
                        return;
                    }
                    return;
                case 15:
                    if (this.c2.a(i)) {
                        this.B1 = Build.DEVICE;
                        return;
                    }
                    return;
                case 32:
                    if (this.c2.a(i)) {
                        this.F1 = h(context);
                        return;
                    }
                    return;
                case 34:
                    if (this.c2.a(i)) {
                        this.I1 = magnesSettings.getNotificationToken();
                        return;
                    }
                    return;
                case 37:
                    if (this.c2.a(i)) {
                        this.C1 = Build.VERSION.RELEASE;
                        return;
                    }
                    return;
                case 38:
                    if (this.c2.a(i)) {
                        this.G1 = lib.android.paypal.com.magnessdk.filesystem.b.g;
                        return;
                    }
                    return;
                case 47:
                    if (this.c2.a(i)) {
                        this.M1 = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
                        return;
                    }
                    return;
                case 52:
                    if (this.c2.a(i)) {
                        this.R1 = f();
                        return;
                    }
                    return;
                case 59:
                    if (this.c2.a(i)) {
                        this.N1 = c.c(context);
                        return;
                    }
                    return;
                case 60:
                    if (this.c2.a(i)) {
                        this.P1 = d.c(context);
                        return;
                    }
                    return;
                case 62:
                    if (this.c2.a(i)) {
                        this.L1 = magnesSettings.getMagnesSource();
                        return;
                    }
                    return;
                case 63:
                    if (this.c2.a(i)) {
                        this.H1 = f(context);
                        return;
                    }
                    return;
                case 65:
                    if (this.c2.a(i)) {
                        this.S1 = d(context);
                        return;
                    }
                    return;
                case 66:
                    if (this.c2.a(i)) {
                        this.T1 = e(context);
                        return;
                    }
                    return;
                case 69:
                    if (this.c2.a(i)) {
                        this.D1 = c(context);
                        return;
                    }
                    return;
                case 70:
                    if (this.c2.a(i)) {
                        this.E1 = g(context);
                        return;
                    }
                    return;
                case 86:
                    JSONObject b3 = b(context);
                    this.U1 = b3;
                    g.k1 = b3.optString("id");
                    return;
                case 88:
                    if (this.c2.k()) {
                        this.Z1 = this.c2.i();
                        return;
                    }
                    return;
                case 90:
                    if (this.c2.a(i)) {
                        this.W1 = c();
                        return;
                    }
                    return;
                case 91:
                    if (this.c2.a(i)) {
                        this.V1 = i(context);
                        return;
                    }
                    return;
                case 93:
                    if (this.c2.a(i)) {
                        this.X1 = d();
                        return;
                    }
                    return;
                case 94:
                    if (this.c2.a(i)) {
                        this.Y1 = e();
                        return;
                    }
                    return;
                case 95:
                    if (this.c2.a(i)) {
                        this.a2 = j(context);
                        return;
                    }
                    return;
                case 100:
                    if (this.c2.a(i)) {
                        this.Q1 = d.b(context);
                        return;
                    }
                    return;
                case 101:
                    if (this.c2.a(i)) {
                        this.b2 = a(magnesSettings);
                        return;
                    }
                    return;
                case 103:
                    if (this.c2.a(i)) {
                        this.O1 = c.b(context);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) h.class, 3, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.x1;
    }
}
