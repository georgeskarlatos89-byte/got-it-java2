package lib.android.paypal.com.magnessdk;

import android.os.Handler;
import android.view.MotionEvent;
import java.util.Timer;
import java.util.TimerTask;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class l extends g {
    private static l K1;
    private boolean A1 = false;
    private int B1 = 0;
    /* access modifiers changed from: private */
    public boolean C1 = false;
    private boolean D1 = true;
    private int E1 = 0;
    private String F1 = "";
    private d G1;
    private MagnesSettings H1;
    private Handler I1;
    private Timer J1 = new Timer();
    private JSONObject x1 = new JSONObject();
    private JSONArray y1 = new JSONArray();
    private JSONArray z1 = new JSONArray();

    class a extends TimerTask {
        a() {
        }

        public void run() {
            boolean unused = l.this.C1 = true;
            l.this.d();
            l.this.c();
        }
    }

    class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        long f;
        long g;

        b(MotionEvent motionEvent, long j, long j2) {
            this.a = motionEvent.getPressure();
            this.b = motionEvent.getSize();
            this.c = motionEvent.getRawX();
            this.d = motionEvent.getRawY();
            this.e = motionEvent.getPointerCount();
            this.f = j;
            this.g = j2;
        }
    }

    l() {
    }

    private String a(float f) {
        double d = (double) f;
        c.n nVar = c.n.MAXIMUM_PRECISION;
        return String.valueOf(((double) Math.round(d * nVar.a())) / nVar.a());
    }

    private JSONArray a(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.getJSONObject(i));
        }
        return jSONArray2;
    }

    private JSONObject a(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (bVar.a != 0.0f) {
                jSONObject.put(c.n.FORCE.toString(), a(bVar.a));
            }
            if (bVar.b != 0.0f) {
                jSONObject.put(c.n.RADIUS.toString(), a(bVar.b));
            }
            jSONObject.put(c.n.TOUCH_LOCATION_X.toString(), String.valueOf(Math.round(bVar.c)));
            jSONObject.put(c.n.TOUCH_LOCATION_Y.toString(), String.valueOf(Math.round(bVar.d)));
            if (bVar.e > 1) {
                jSONObject.put(c.n.TOUCH_COUNT.toString(), String.valueOf(bVar.e));
            }
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e);
            return null;
        }
    }

    private void b() throws JSONException {
        if (this.z1.length() < c.n.MAXIMUM_TOUCH_COUNT.b()) {
            JSONArray jSONArray = this.y1;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.x1.put(c.n.TOUCH_EVENT.toString(), a(this.y1));
                this.z1.put(this.x1);
            }
            this.y1 = new JSONArray();
            this.x1 = new JSONObject();
            return;
        }
        c();
    }

    private void b(String str) {
        f();
        this.F1 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f A[Catch:{ JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c A[Catch:{ JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(lib.android.paypal.com.magnessdk.l.b r6) {
        /*
            r5 = this;
            long r0 = r6.f     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r2 = lib.android.paypal.com.magnessdk.c.n.UNINITIALIZED_TIME     // Catch:{ JSONException -> 0x0080 }
            long r3 = r2.c()     // Catch:{ JSONException -> 0x0080 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            org.json.JSONObject r0 = r5.x1     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r1 = lib.android.paypal.com.magnessdk.c.n.START_TIME     // Catch:{ JSONException -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0080 }
            long r3 = r6.f     // Catch:{ JSONException -> 0x0080 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0080 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0080 }
        L_0x001d:
            long r0 = r6.g     // Catch:{ JSONException -> 0x0080 }
            long r3 = r2.c()     // Catch:{ JSONException -> 0x0080 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0036
            org.json.JSONObject r0 = r5.x1     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r1 = lib.android.paypal.com.magnessdk.c.n.END_TIME     // Catch:{ JSONException -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0080 }
            long r3 = r6.g     // Catch:{ JSONException -> 0x0080 }
        L_0x0031:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0080 }
            goto L_0x0053
        L_0x0036:
            int r0 = r5.E1     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r1 = lib.android.paypal.com.magnessdk.c.n.MAXIMUM_EVENT_COUNT     // Catch:{ JSONException -> 0x0080 }
            int r1 = r1.b()     // Catch:{ JSONException -> 0x0080 }
            int r1 = r1 + -1
            if (r0 < r1) goto L_0x0056
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0080 }
            r6.g = r0     // Catch:{ JSONException -> 0x0080 }
            org.json.JSONObject r0 = r5.x1     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r1 = lib.android.paypal.com.magnessdk.c.n.END_TIME     // Catch:{ JSONException -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0080 }
            long r3 = r6.g     // Catch:{ JSONException -> 0x0080 }
            goto L_0x0031
        L_0x0053:
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0080 }
        L_0x0056:
            org.json.JSONArray r0 = r5.y1     // Catch:{ JSONException -> 0x0080 }
            org.json.JSONObject r1 = r5.a((lib.android.paypal.com.magnessdk.l.b) r6)     // Catch:{ JSONException -> 0x0080 }
            r0.put(r1)     // Catch:{ JSONException -> 0x0080 }
            int r0 = r5.E1     // Catch:{ JSONException -> 0x0080 }
            int r0 = r0 + 1
            r5.E1 = r0     // Catch:{ JSONException -> 0x0080 }
            long r0 = r6.g     // Catch:{ JSONException -> 0x0080 }
            long r2 = r2.c()     // Catch:{ JSONException -> 0x0080 }
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            r5.b()     // Catch:{ JSONException -> 0x0080 }
        L_0x0072:
            int r6 = r5.E1     // Catch:{ JSONException -> 0x0080 }
            lib.android.paypal.com.magnessdk.c$n r0 = lib.android.paypal.com.magnessdk.c.n.MAXIMUM_EVENT_COUNT     // Catch:{ JSONException -> 0x0080 }
            int r0 = r0.b()     // Catch:{ JSONException -> 0x0080 }
            if (r6 < r0) goto L_0x0089
            r5.c()     // Catch:{ JSONException -> 0x0080 }
            goto L_0x0089
        L_0x0080:
            r6 = move-exception
            java.lang.Class r0 = r5.getClass()
            r1 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r0, (int) r1, (java.lang.Throwable) r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.l.b(lib.android.paypal.com.magnessdk.l$b):void");
    }

    /* access modifiers changed from: private */
    public void c() {
        this.D1 = false;
        if (!this.A1) {
            g();
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        try {
            JSONObject jSONObject = this.x1;
            c.n nVar = c.n.END_TIME;
            String optString = jSONObject.optString(nVar.toString());
            if (optString == null || optString.isEmpty()) {
                this.x1.put(nVar.toString(), String.valueOf(System.currentTimeMillis()));
            }
            b();
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e);
        }
    }

    static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            if (K1 == null) {
                K1 = new l();
            }
            lVar = K1;
        }
        return lVar;
    }

    private void f() {
        if (this.C1) {
            this.J1.cancel();
        }
        this.C1 = false;
        this.E1 = 0;
        this.B1 = 0;
        this.D1 = true;
        if (!this.A1) {
            g();
        }
        this.y1 = new JSONArray();
        this.z1 = new JSONArray();
        this.A1 = false;
    }

    private void g() {
        this.A1 = true;
        JSONArray jSONArray = this.z1;
        if (jSONArray != null && jSONArray.length() != 0) {
            try {
                if (this.z1.length() > 0) {
                    JSONArray a2 = a(this.z1);
                    this.z1 = new JSONArray();
                    boolean a3 = g.a(this.G1, g.t1);
                    JSONObject a4 = a3 ? g.a(this.F1, a2, g.t1) : g.b(this.F1, a2, g.t1);
                    if (a4 != null) {
                        new lib.android.paypal.com.magnessdk.network.b(c.h.d.PRODUCTION_JSON_URL, a4, a3, this.H1, this.I1).c();
                    }
                }
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e);
            }
        }
    }

    private void h() {
        this.J1.schedule(new a(), c.n.MAXIMUM_TIME_ALLOWED.c());
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, MagnesSettings magnesSettings) {
    }

    /* access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent, String str) {
        d dVar;
        if (this.D1 && str != null && !str.isEmpty() && motionEvent != null && (dVar = this.G1) != null) {
            if (a(dVar, this.H1.getMagnesSource(), g.k1, g.t1, this.H1.getContext())) {
                if (!this.F1.equals(str)) {
                    b(str);
                }
                c.n nVar = c.n.UNINITIALIZED_TIME;
                long c = nVar.c();
                long c2 = nVar.c();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    c = System.currentTimeMillis();
                    int i = this.B1 + 1;
                    this.B1 = i;
                    if (i == 1) {
                        h();
                    }
                } else if (actionMasked == 1) {
                    c2 = System.currentTimeMillis();
                } else if (actionMasked != 2) {
                    return;
                }
                b(new b(motionEvent, c, c2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar, MagnesSettings magnesSettings, Handler handler) {
        this.G1 = dVar;
        this.H1 = magnesSettings;
        this.I1 = handler;
    }
}
