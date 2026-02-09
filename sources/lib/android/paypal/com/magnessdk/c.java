package lib.android.paypal.com.magnessdk;

import com.facebook.appevents.UserDataStore;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePushConstants;

public final class c {

    public enum a {
        AUDIT_KEY("audit"),
        FEATURE("type"),
        PAYLOAD("payload"),
        SENSOR_TYPE("t"),
        SENSOR_PAYLOAD(ContextChain.TAG_PRODUCT);
        
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b {
        public static final String a = "pairing_id";
        public static final String b = "correlation-id";
        public static final String c = "Android";
        static final int d = 36;
        static final int e = 30;
        public static final long f = 1000;
        static final long g = 0;
        static final int h = 50000;
        static final int i = 150;
        static final int j = 25;
        static final int k = 120;
        static final String l = "os.name";
        static final String m = "os.version";
        static final String n = "os.arch";
        public static final int o = 10;
        public static final int p = 10;
        public static final int q = 60000;
        public static final int r = 256;

        public enum a {
            MOBILE("MOBILE"),
            WIFI("WIFI"),
            VPN("VPN"),
            BLUETOOTH("Bluetooth Tethering"),
            WIFI_AWARE("WIFI AWARE"),
            LOWPAN("LOW PAN"),
            ETHERNET("Ethernet");
            
            private final String a;

            private a(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$b  reason: collision with other inner class name */
        public enum C0000b {
            EXCEPTION("Network Setup Exception, Check PPNetworkEnvironment for details");
            
            private final String a;

            private C0000b(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$c  reason: collision with other inner class name */
        public enum C0001c {
            CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
            APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");
            
            private final String a;

            private C0001c(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        private b() {
        }
    }

    /* renamed from: lib.android.paypal.com.magnessdk.c$c  reason: collision with other inner class name */
    public enum C0002c {
        RAMP("ramp"),
        REMOTE("remote");
        
        private final String a;

        private C0002c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum d {
        ANDROID_ID(lib.android.paypal.com.magnessdk.filesystem.b.f),
        APP_FIRST_INSTALL_TIME("app_first_install_time"),
        APP_GUID("app_guid"),
        APP_ID("app_id"),
        APP_LAST_UPDATE_TIME("app_last_update_time"),
        APP_VERSION("app_version"),
        COMP_VERSION("comp_version"),
        CONF_URL("conf_url"),
        CPU("cpu"),
        DEVICE_MODEL("device_model"),
        DEVICE_NAME("device_name"),
        DISK("disk"),
        EMULATOR_FLAGS("ef"),
        GSF_ID("gsf_id"),
        IN_TREATMENT("t"),
        IS_EMULATOR("is_emulator"),
        IS_ROOTED("is_rooted"),
        MAC_ADDRS("mac_addrs"),
        MAGNES_GUID("magnes_guid"),
        MAGNES_SOURCE("magnes_source"),
        NOT_COLLECTIBLE_LIST("nc"),
        NOTIF_TOKEN("notif_token"),
        OS_TYPE("os_type"),
        OS_VERSION("os_version"),
        PAYLOAD_TYPE("payload_type"),
        ROOTED_FLAGS("rf"),
        SCREEN("screen"),
        SENSOR_METADATA("smd"),
        SMS_ENABLED("sms_enabled"),
        SOURCE_APP_VERSION("source_app_version"),
        SYSTEM("system"),
        G("t"),
        TOTAL_STORAGE_SPACE("total_storage_space"),
        USER_AGENT("user_agent");
        
        private final String a;

        public enum a {
            CORES("cores"),
            MAX_FREQUENCY("maxFreq"),
            MIN_FREQUENCY("minFreq");
            
            private final String a;

            private a(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        public enum b {
            TOTAL_SD("total_sd"),
            TOTAL_UD("total");
            
            private final String a;

            private b(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$c  reason: collision with other inner class name */
        public enum C0003c {
            ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
            ANDROID_X86("android_x86"),
            ANDY("andy"),
            ANDY_OS("AndyOS"),
            ANDY_OSX("AndyOSX"),
            DRIOD_4X("Driod4X"),
            DROID_4X("Droid4X"),
            GENERIC("generic"),
            GENERIC_X86("generic_x86"),
            GENY_MOTION("Genymotion"),
            GOLDFISH("goldfish"),
            GOODLE_SDK("google_sdk"),
            SDK(ServerProtocol.DIALOG_PARAM_SDK_VERSION),
            UNKNOWN("unknown"),
            VBOX_86("vbox86"),
            VBOX_86P("vbox86p"),
            RANCHU("ranchu"),
            REMIXEMU("remixemu"),
            TTVM_X86("ttVM_x86");
            
            private final String a;

            private C0003c(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$d  reason: collision with other inner class name */
        public enum C0004d {
            DENSITY("density"),
            DENSITY_DPI("densityDpi"),
            HEIGHT("height"),
            SCALE("scale"),
            WIDTH("width"),
            X_DPI("xdpi"),
            Y_DPI("ydpi");
            
            private final String a;

            private C0004d(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        public enum e {
            FIFO_MAX_EVENT_COUNT("mec"),
            MAX_RANGE("mr"),
            NAME("n"),
            POWER("pwr"),
            RESOLUTION("re"),
            VENDOR("v"),
            VERSION("ver");
            
            private final String a;

            private e(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        public enum f {
            VERSION("version"),
            BOARD("board"),
            BOOTLOADER("bootloader"),
            CPU_ABI1("cpu_abi1"),
            DISPLAY("display"),
            RADIO("radio"),
            FINGERPRINT("fingerprint"),
            HARDWARE("hardware"),
            MANUFACTURER("manufacturer"),
            PRODUCT("product"),
            TIME(CodePushConstants.LATEST_ROLLBACK_TIME_KEY),
            SYSTEM_TYPE("system_type");
            
            private final String a;

            private f(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        private d(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum e {
        BASE_STATION_ID("base_station_id"),
        BATTERY("battery"),
        BSSID("bssid"),
        BSSID_ARRAY("bssid_array"),
        C("c"),
        CDMA_NETWORK_ID("cdma_network_id"),
        CDMA_SYSTEM_ID("cdma_system_id"),
        CELL_ID("cell_id"),
        CONF_VERSION("conf_version"),
        CONN_TYPE("conn_type"),
        DC_ID("dc_id"),
        m("device_id"),
        DEVICE_UPTIME("device_uptime"),
        DISK("disk"),
        DS("ds"),
        IP_ADDRESSES("ip_addresses"),
        IP_ADDRS("ip_addrs"),
        IS_DEV_MODE_ON("dmo"),
        KNOWN_APPS("known_apps"),
        LINKER_ID("linker_id"),
        LOCALE_COUNTRY("locale_country"),
        LOCALE_LANG("locale_lang"),
        LOCATION(FirebaseAnalytics.Param.LOCATION),
        LOCATION_AREA_CODE("location_area_code"),
        MEMORY("memory"),
        MG_ID("mg_id"),
        NETWORK_OPERATOR("network_operator"),
        PHONE_TYPE("phone_type"),
        PL("pl"),
        PROXY_SETTING("proxy_setting"),
        RISK_COMP_SESSION_ID("risk_comp_session_id"),
        ROAMING("roaming"),
        SCREEN("screen"),
        SERIAL_NUMBER("serial_number"),
        SIM_OPERATOR_NAME("sim_operator_name"),
        SIM_SERIAL_NUMBER("sim_serial_number"),
        SR("sr"),
        SSID("ssid"),
        SUBSCRIBER_ID("subscriber_id"),
        O("t"),
        TIMESTAMP("timestamp"),
        TZ("tz"),
        TZ_NAME("tz_name"),
        VPN_SETTING("VPN_setting");
        
        private final String a;

        public enum a {
            CURRENT("current"),
            LEVEL(FirebaseAnalytics.Param.LEVEL),
            METHOD(FirebaseAnalytics.Param.METHOD),
            LOW_POWER("low_power"),
            STATE("state"),
            TEMP("temp"),
            VOLTAGE("voltage");
            
            private final String a;

            private a(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        public enum b {
            FREE_SD("free_sd"),
            FREE_UD("free"),
            MOUNTED("mounted");
            
            private final String a;

            private b(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$e$c  reason: collision with other inner class name */
        public enum C0005c {
            FREE("free"),
            FREE_RUNTIME("free_runtime"),
            MAX_RUNTIME("max_runtime"),
            TOTAL("total"),
            TOTAL_RUNTIME("total_runtime");
            
            private final String a;

            private C0005c(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        private e(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    static class f {
        static final String[] a = {"com.bignox.appcenter", "com.bluestacks.settings", "com.bluestacks.filemanager", "com.genymotion.superuser", "org.greatfruit.andy.ime", "com.kaopu001.tiantianserver", "com.tiantian.ime", "com.microvirt.installer", "com.android.ld.appstore", "com.ldmnq.launcher3", "com.jide.Appstore"};
        static final String[] b = {"init.android_x86.rc", "ueventd.android_x86.rc", "fstab.android_x86", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "ueventd.android_x86_64.rc", "init.android_x86_64.rc", "fstab.goldfish", "init.goldfish.rc", "init.superuser.rc"};
        static final String[] c = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
        static final String[] d = {"/dev/socket/qemud", "/dev/qemu_pipe"};
        static final String[] e = {"goldfish"};
        static final String[] f = {"init.ranchu.rc", "init.remixos.rc", "init.andy.rc", "ueventd.andy.rc", "bin/genybaseband", "bin/genymotion-vbox-sf", "ueventd.nox.rc", "init.nox.rc", "/system/bin/noxd"};

        static final class a {
            public static final int a = 5;
            public static final int b = 0;
            public static final int c = 1;
            public static final int d = 2;
            public static final int e = 3;
            public static final int f = 4;

            private a() {
            }
        }

        private f() {
        }
    }

    public enum g {
        PRODUCTION(a.d),
        STAGE("stage");
        
        private final String a;

        private g(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum h {
        NETWORKING("MagnesNetworking");
        
        private final String a;

        public enum a {
            HTTP_CONNECT_TIMEOUT(b.q),
            HTTP_READ_TIMEOUT(b.q),
            READ_BYTE(1024);
            
            private final int a;

            private a(int i) {
                this.a = i;
            }

            public int a() {
                return this.a;
            }
        }

        public enum b {
            POST("POST"),
            GET("GET");
            
            private final String a;

            private b(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$h$c  reason: collision with other inner class name */
        public enum C0006c {
            GET_REQUEST_STARTED(50),
            GET_REQUEST_ERROR(51),
            GET_REQUEST_SUCCEEDED(52),
            POST_REQUEST_STARTED(53),
            POST_REQUEST_ERROR(54),
            POST_REQUEST_SUCCEEDED(55),
            HTTP_STATUS_FAILED(-1),
            HTTP_STATUS_200(200);
            
            private final int a;

            private C0006c(int i) {
                this.a = i;
            }

            public static C0006c a(int i) {
                C0006c cVar = GET_REQUEST_STARTED;
                if (i == cVar.a()) {
                    return cVar;
                }
                C0006c cVar2 = GET_REQUEST_ERROR;
                if (i == cVar2.a()) {
                    return cVar2;
                }
                C0006c cVar3 = GET_REQUEST_SUCCEEDED;
                if (i == cVar3.a()) {
                    return cVar3;
                }
                C0006c cVar4 = POST_REQUEST_STARTED;
                if (i == cVar4.a()) {
                    return cVar4;
                }
                C0006c cVar5 = POST_REQUEST_ERROR;
                if (i == cVar5.a()) {
                    return cVar5;
                }
                C0006c cVar6 = POST_REQUEST_SUCCEEDED;
                if (i == cVar6.a()) {
                    return cVar6;
                }
                C0006c cVar7 = HTTP_STATUS_FAILED;
                if (i == cVar7.a()) {
                    return cVar7;
                }
                C0006c cVar8 = HTTP_STATUS_200;
                if (i == cVar8.a()) {
                    return cVar8;
                }
                return null;
            }

            public int a() {
                return this.a;
            }
        }

        public enum d {
            AUDIT_JSON_URL(a.e),
            DEVICE_INFO_URL(a.g),
            PRODUCTION_BEACON_URL(a.h),
            PRODUCTION_JSON_URL(a.i),
            RAMP_CONFIG_URL(a.j),
            REMOTE_CONFIG_URL(a.k),
            SANDBOX_DEVICE_INFO_URL(a.m),
            SANDBOX_AUDIT_JSON_URL(a.l),
            SANDBOX_PROD_JSON_URL(a.l);
            
            private final String a;

            private d(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        private h(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum i {
        OPEN("o"),
        EXCLUDED("e"),
        MIN_VERSION("m"),
        RAMP_THRESHOLD("r"),
        APP_IDS("ai"),
        APP_SOURCES("as"),
        CONF_REFRESH_TIME_KEY("cr_ti");
        
        private final String a;

        private i(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum j {
        CONF_VERSION("conf_version"),
        CONF_ENDPOINT_URL("endpoint_url"),
        CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
        ANDROID_APPS_TO_CHECK("android_apps_to_check"),
        NOT_COLLECTABLE("nc"),
        MG_ID("m"),
        SENSOR_COLLECT_TIME(g.q1);
        
        private final String a;

        private j(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum k {
        KNOWN_ROOT_APPS_PACKAGES("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"),
        SU_PATHS("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/xbin/daemonsu/", "/system/etc/init.d/99SuperSUDaemon/", "/system/bin/.ext/.su/", "/system/etc/.has_su_daemon/", "/system/etc/.installed_su_daemon/", "/cache/", "/data/", "/dev/");
        
        private final String[] a;

        public enum a {
            SU("su"),
            BUSYBOX("busybox"),
            MAGISK("magisk");
            
            private final String a;

            private a(String str) {
                this.a = str;
            }

            public String toString() {
                return this.a;
            }
        }

        public enum b {
            NUMBER_OF_ROOTED_FLAGS(7),
            IS_TEST_KEYS_FOUND(0),
            IS_SU_FOUND(1),
            IS_SUPER_USER_APK_FOUND(2),
            DETECT_ROOT_MANAGEMENT_APPS(3),
            CHECK_FOR_BINARY_SU(4),
            CHECK_FOR_BINARY_BUSYBOX(5),
            CHECK_FOR_BINARY_MAGISK(6);
            
            private final int a;

            private b(int i) {
                this.a = i;
            }

            public static b a(int i) {
                b bVar = IS_TEST_KEYS_FOUND;
                if (i == bVar.a()) {
                    return bVar;
                }
                b bVar2 = IS_SU_FOUND;
                if (i == bVar2.a()) {
                    return bVar2;
                }
                b bVar3 = IS_SUPER_USER_APK_FOUND;
                if (i == bVar3.a()) {
                    return bVar3;
                }
                b bVar4 = DETECT_ROOT_MANAGEMENT_APPS;
                if (i == bVar4.a()) {
                    return bVar4;
                }
                b bVar5 = CHECK_FOR_BINARY_SU;
                if (i == bVar5.a()) {
                    return bVar5;
                }
                b bVar6 = CHECK_FOR_BINARY_BUSYBOX;
                if (i == bVar6.a()) {
                    return bVar6;
                }
                b bVar7 = CHECK_FOR_BINARY_MAGISK;
                if (i == bVar7.a()) {
                    return bVar7;
                }
                return null;
            }

            public int a() {
                return this.a;
            }
        }

        private k(String... strArr) {
            this.a = strArr;
        }

        public String[] a() {
            return this.a;
        }
    }

    public enum l {
        AC("ac"),
        GY("gy"),
        MG("mg");
        
        private final String a;

        private l(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum m {
        FLIGHT_TIME("flightTime"),
        TELEMETRY_EVENTS("Events"),
        TYPING_SPEED(g.s1),
        VIEW_ID("viewId"),
        AUTO_COMPLETE_EVENT("wsac"),
        BACKSPACE_EVENT("wsbs"),
        CUT_EVENT("wsct"),
        PRE_FILLED_EVENT("wspf"),
        REGULAR_TYPING_EVENT("wsrt"),
        FAILED_TO_CONVERT_TO_JSON("Failed to convert to JSON");
        
        private final String a;

        private m(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public enum n {
        TOUCH_EVENT("te"),
        FORCE("f"),
        RADIUS("r"),
        TOUCH_LOCATION_X("x"),
        TOUCH_LOCATION_Y("y"),
        TOUCH_COUNT("tc"),
        START_TIME(UserDataStore.STATE),
        END_TIME("et"),
        MAXIMUM_PRECISION("10000000d"),
        UNINITIALIZED_TIME("-1000"),
        MAXIMUM_EVENT_COUNT("400"),
        MAXIMUM_TIME_ALLOWED("5000"),
        MAXIMUM_TOUCH_COUNT("5");
        
        private final String a;

        private n(String str) {
            this.a = str;
        }

        public double a() {
            return Double.parseDouble(this.a);
        }

        public int b() {
            return Integer.parseInt(this.a);
        }

        public long c() {
            return Long.parseLong(this.a);
        }

        public String d() {
            return this.a;
        }

        public String toString() {
            return this.a;
        }
    }

    private c() {
    }
}
