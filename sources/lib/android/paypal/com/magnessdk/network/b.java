package lib.android.paypal.com.magnessdk.network;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.f;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl;
import lib.android.paypal.com.magnessdk.network.base.c;
import org.json.JSONObject;

public class b extends c {
    private static final String i = "MagnesPostRequest";
    private c.h.d b;
    private Map<String, String> c = new HashMap();
    private Handler d;
    private MagnesNetworkingFactoryImpl e;
    private MagnesSettings f;
    private JSONObject g;
    private boolean h;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                lib.android.paypal.com.magnessdk.c$h$d[] r0 = lib.android.paypal.com.magnessdk.c.h.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.DEVICE_INFO_URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.SANDBOX_DEVICE_INFO_URL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.PRODUCTION_JSON_URL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.AUDIT_JSON_URL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.b.a.<clinit>():void");
        }
    }

    public b(c.h.d dVar, JSONObject jSONObject, boolean z, MagnesSettings magnesSettings, Handler handler) {
        this.b = dVar;
        this.g = jSONObject;
        this.h = z;
        this.d = handler;
        this.f = magnesSettings;
        this.e = magnesSettings.getMagnesNetworkingFactoryImpl() == null ? new MagnesNetworkingFactoryImpl() : magnesSettings.getMagnesNetworkingFactoryImpl();
    }

    private String a(JSONObject jSONObject) {
        return String.format(Locale.US, "Dyson/%S (%S %S)", new Object[]{jSONObject.optString(c.d.COMP_VERSION.toString()), jSONObject.optString(c.d.OS_TYPE.toString()), Build.VERSION.RELEASE});
    }

    private void a(int i2, String str, String str2) {
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "MagnesPostRequest for " + str2 + " returned status code " + i2 + ", and responseString: " + str);
    }

    private String e() throws Exception {
        if (this.g == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appGuid", this.g.optString(c.d.APP_GUID.toString()));
        hashMap.put("libraryVersion", a(this.g));
        hashMap.put("additionalData", this.g.toString());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "Encoded Device info payload : " + sb.toString());
        return sb.toString();
    }

    private String f() throws Exception {
        if (this.g == null) {
            return null;
        }
        int i2 = a.a[this.b.ordinal()];
        if (i2 != 1 && i2 != 2) {
            return this.g.toString();
        }
        String e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2;
    }

    private String g() {
        if (this.f == null || this.d == null) {
            return null;
        }
        int i2 = a.a[this.b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return this.f.getEnvironment() == Environment.LIVE ? MagnesSDK.getInstance().a.g() : c.h.d.SANDBOX_DEVICE_INFO_URL.toString();
        }
        if (i2 != 3 && i2 != 4) {
            return this.b.toString();
        }
        return (this.f.getEnvironment() == Environment.LIVE ? this.h ? c.h.d.AUDIT_JSON_URL : c.h.d.PRODUCTION_JSON_URL : this.h ? c.h.d.SANDBOX_AUDIT_JSON_URL : c.h.d.SANDBOX_PROD_JSON_URL).toString();
    }

    public void a() {
        Map<String, String> map;
        if (this.f != null) {
            try {
                int i2 = a.a[this.b.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    map = f.c(this.f.getContext());
                    if (map == null) {
                        return;
                    }
                } else {
                    map = f.b(this.f.getContext());
                    if (map == null) {
                        return;
                    }
                }
                this.c = map;
            } catch (Exception e2) {
                lib.android.paypal.com.magnessdk.log.a.a((Class<?>) f.class, 3, (Throwable) e2);
            }
        }
    }

    public void c() {
        if (this.f.isEnableNetworkOnCallerThread()) {
            d();
        } else {
            b();
        }
    }

    public void d() {
        Message message;
        Handler handler;
        a();
        try {
            MagnesNetworking createHttpClient = this.e.createHttpClient(c.h.b.POST);
            String g2 = g();
            String f2 = f();
            if (g2 == null) {
                return;
            }
            if (f2 != null) {
                createHttpClient.setUri(Uri.parse(g2));
                createHttpClient.setHeader(this.c);
                Handler handler2 = this.d;
                handler2.sendMessage(Message.obtain(handler2, c.h.C0006c.POST_REQUEST_STARTED.a(), g2));
                int execute = createHttpClient.execute(f2.getBytes("UTF-8"));
                String str = new String(createHttpClient.getResponseContent(), "UTF-8");
                Log.d(i, "MagnesPostRequest returned PayPal-Debug-Id: " + createHttpClient.getPayPalDebugId());
                a(execute, str, g2);
                if (execute == c.h.C0006c.HTTP_STATUS_200.a()) {
                    handler = this.d;
                    if (handler != null) {
                        message = Message.obtain(handler, c.h.C0006c.POST_REQUEST_SUCCEEDED.a(), str);
                    } else {
                        return;
                    }
                } else {
                    handler = this.d;
                    if (handler != null) {
                        message = Message.obtain(handler, c.h.C0006c.POST_REQUEST_ERROR.a(), Integer.valueOf(execute));
                    } else {
                        return;
                    }
                }
                handler.sendMessage(message);
            }
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e2);
            Handler handler3 = this.d;
            if (handler3 != null) {
                handler3.sendMessage(Message.obtain(handler3, c.h.C0006c.POST_REQUEST_ERROR.a(), e2));
            }
        }
    }

    public void run() {
        if (this.d != null) {
            d();
        }
    }
}
