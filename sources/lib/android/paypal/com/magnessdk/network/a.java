package lib.android.paypal.com.magnessdk.network;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.b;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.d;
import lib.android.paypal.com.magnessdk.e;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl;
import lib.android.paypal.com.magnessdk.network.base.c;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends c {
    private c.h.d b;
    private Map<String, String> c = new HashMap();
    private Handler d;
    private MagnesNetworkingFactoryImpl e;
    private MagnesSettings f;
    private JSONObject g;

    /* renamed from: lib.android.paypal.com.magnessdk.network.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0008a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                lib.android.paypal.com.magnessdk.c$h$d[] r0 = lib.android.paypal.com.magnessdk.c.h.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.RAMP_CONFIG_URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                lib.android.paypal.com.magnessdk.c$h$d r1 = lib.android.paypal.com.magnessdk.c.h.d.REMOTE_CONFIG_URL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.a.C0008a.<clinit>():void");
        }
    }

    public a(c.h.d dVar, MagnesSettings magnesSettings, Handler handler, JSONObject jSONObject) {
        this.b = dVar;
        this.f = magnesSettings;
        this.d = handler;
        this.e = magnesSettings.getMagnesNetworkingFactoryImpl() == null ? new MagnesNetworkingFactoryImpl() : magnesSettings.getMagnesNetworkingFactoryImpl();
        this.g = jSONObject;
    }

    private void a(int i, String str) {
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "MagesGetRequest for " + this.b.toString() + " returned status code " + i + ", and responseString: " + str);
    }

    private void a(String str) throws JSONException {
        int i = C0008a.a[this.b.ordinal()];
        if (i == 1) {
            b.a(this.f.getContext(), str, d.i);
        } else if (i == 2) {
            JSONObject jSONObject = new JSONObject(str);
            b.a(this.f.getContext(), jSONObject.toString(), e.k);
            e.b(jSONObject);
            if (jSONObject.optJSONArray(c.d.NOT_COLLECTIBLE_LIST.toString()) != null) {
                e.a(true);
            }
        }
    }

    private String e() {
        if (this.g == null) {
            return null;
        }
        return c.h.d.PRODUCTION_BEACON_URL.toString() + "?p=" + this.g.optString(c.b.a) + "&i=" + this.g.optString(c.e.IP_ADDRS.toString()) + "&t=" + String.valueOf(System.currentTimeMillis() / 1000) + "&a=" + this.f.getMagnesSource();
    }

    private String f() {
        if (this.b == c.h.d.PRODUCTION_BEACON_URL) {
            if (this.g == null) {
                return null;
            }
            String e2 = e();
            if (e2 != null && e2.length() > 0) {
                return e2;
            }
        }
        return this.b.toString();
    }

    private void g() {
        JSONObject jSONObject = this.g;
        if (jSONObject != null) {
            this.c.put("User-Agent", String.format("%s/%s/%s/Android", new Object[]{jSONObject.optString(c.d.APP_ID.toString()), this.g.optString(c.d.APP_VERSION.toString()), this.g.optString(c.d.APP_GUID.toString())}));
            this.c.put("Accept-Language", "en-us");
        }
    }

    public void a() {
        if (this.b == c.h.d.PRODUCTION_BEACON_URL) {
            g();
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
            MagnesNetworking createHttpClient = this.e.createHttpClient(c.h.b.GET);
            String f2 = f();
            if (f2 != null) {
                createHttpClient.setUri(Uri.parse(f2));
                Map<String, String> map = this.c;
                if (map != null && !map.isEmpty()) {
                    createHttpClient.setHeader(this.c);
                }
                Handler handler2 = this.d;
                if (handler2 != null) {
                    handler2.sendMessage(Message.obtain(handler2, c.h.C0006c.GET_REQUEST_STARTED.a(), "Magnes Request Started for URL: " + f2));
                }
                int execute = createHttpClient.execute((byte[]) null);
                String str = new String(createHttpClient.getResponseContent(), "UTF-8");
                a(execute, str);
                if (execute == c.h.C0006c.HTTP_STATUS_200.a()) {
                    a(str);
                    handler = this.d;
                    if (handler != null) {
                        message = Message.obtain(handler, c.h.C0006c.GET_REQUEST_SUCCEEDED.a(), str);
                    } else {
                        return;
                    }
                } else {
                    Handler handler3 = this.d;
                    if (handler3 != null) {
                        Handler handler4 = handler3;
                        message = Message.obtain(handler3, c.h.C0006c.GET_REQUEST_ERROR.a(), execute + " : " + str);
                        handler = handler4;
                    } else {
                        return;
                    }
                }
                handler.sendMessage(message);
            }
        } catch (Exception e2) {
            Handler handler5 = this.d;
            if (handler5 != null) {
                handler5.sendMessage(Message.obtain(handler5, c.h.C0006c.GET_REQUEST_ERROR.a(), e2));
            }
        }
    }

    public void run() {
        if (this.d != null) {
            d();
        }
    }
}
