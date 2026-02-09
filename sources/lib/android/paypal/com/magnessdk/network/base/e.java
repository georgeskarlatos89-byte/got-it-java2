package lib.android.paypal.com.magnessdk.network.base;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import lib.android.paypal.com.magnessdk.MagnesSDK;

public final class e extends Handler {
    private static e b = null;
    private static final String c = "GET request to ";
    private static final String d = "POST request to ";
    private WeakReference<MagnesSDK> a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                lib.android.paypal.com.magnessdk.c$h$c[] r0 = lib.android.paypal.com.magnessdk.c.h.C0006c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.GET_REQUEST_STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.GET_REQUEST_SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.GET_REQUEST_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.POST_REQUEST_STARTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.POST_REQUEST_SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.POST_REQUEST_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.e.a.<clinit>():void");
        }
    }

    private e(Looper looper, MagnesSDK magnesSDK) {
        super(looper);
        this.a = new WeakReference<>(magnesSDK);
    }

    public static synchronized e a(Looper looper, MagnesSDK magnesSDK) {
        e eVar;
        synchronized (e.class) {
            if (b == null) {
                b = new e(looper, magnesSDK);
            }
            eVar = b;
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r6, 3, r0.append(r8.obj).append(" error.").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        r8 = new java.lang.StringBuilder(c).append(r8.obj);
        r0 = " succeeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r6, 0, r8.append(r0).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.ref.WeakReference<lib.android.paypal.com.magnessdk.MagnesSDK> r0 = r7.a
            java.lang.Object r0 = r0.get()
            lib.android.paypal.com.magnessdk.MagnesSDK r0 = (lib.android.paypal.com.magnessdk.MagnesSDK) r0
            if (r0 == 0) goto L_0x0090
            int r0 = r8.what
            lib.android.paypal.com.magnessdk.c$h$c r0 = lib.android.paypal.com.magnessdk.c.h.C0006c.a(r0)
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            int[] r1 = lib.android.paypal.com.magnessdk.network.base.e.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 3
            java.lang.String r2 = " error."
            java.lang.String r3 = "POST request to "
            java.lang.String r4 = "GET request to "
            r5 = 0
            java.lang.Class<lib.android.paypal.com.magnessdk.network.base.e> r6 = lib.android.paypal.com.magnessdk.network.base.e.class
            switch(r0) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0078;
                case 3: goto L_0x004b;
                case 4: goto L_0x003d;
                case 5: goto L_0x002f;
                case 6: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0090
        L_0x0029:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            goto L_0x0050
        L_0x002f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.Object r8 = r8.obj
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " successfully."
            goto L_0x0085
        L_0x003d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.Object r8 = r8.obj
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " started."
            goto L_0x0085
        L_0x004b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
        L_0x0050:
            java.lang.Object r8 = r8.obj
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r6, (int) r1, (java.lang.String) r8)
            goto L_0x0090
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.RAMP_CONFIG_URL
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r6, (int) r5, (java.lang.String) r0)
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.Object r8 = r8.obj
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " succeeded"
        L_0x0085:
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r6, (int) r5, (java.lang.String) r8)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.e.handleMessage(android.os.Message):void");
    }
}
