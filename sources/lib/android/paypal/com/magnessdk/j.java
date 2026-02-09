package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.network.b;
import org.json.JSONArray;
import org.json.JSONObject;

final class j extends g {
    private static j G1;
    /* access modifiers changed from: private */
    public JSONArray A1;
    private Handler B1;
    private MagnesSettings C1;
    /* access modifiers changed from: private */
    public m D1;
    /* access modifiers changed from: private */
    public m E1;
    /* access modifiers changed from: private */
    public m F1;
    private String x1 = "";
    private JSONObject y1;
    private e z1;

    class a implements Runnable {
        final /* synthetic */ JSONObject a;

        a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public void run() {
            if (j.this.D1 != null && this.a.optBoolean(c.l.AC.toString(), false)) {
                j.this.A1.put(j.this.D1.f());
            }
            if (j.this.E1 != null && this.a.optBoolean(c.l.GY.toString(), false)) {
                j.this.A1.put(j.this.E1.f());
            }
            if (j.this.F1 != null && this.a.optBoolean(c.l.MG.toString(), false)) {
                j.this.A1.put(j.this.F1.f());
            }
            j.this.c();
        }
    }

    j() {
    }

    static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (G1 == null) {
                G1 = new j();
            }
            jVar = G1;
        }
        return jVar;
    }

    /* access modifiers changed from: private */
    public void c() {
        try {
            boolean a2 = g.a(g.q1);
            JSONObject a3 = a2 ? g.a(this.x1, this.A1, g.q1) : g.b(this.x1, this.A1, g.q1);
            if (a3 != null) {
                new b(c.h.d.PRODUCTION_JSON_URL, a3, a2, this.C1, this.B1).c();
            }
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) j.class, 3, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, String str, JSONObject jSONObject) {
        this.x1 = str;
        this.y1 = jSONObject;
        a(96, magnesSettings);
        a(97, magnesSettings);
        a(102, magnesSettings);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.schedule(new a(jSONObject), (long) this.z1.j(), TimeUnit.SECONDS);
        newSingleThreadScheduledExecutor.shutdown();
        return null;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, MagnesSettings magnesSettings) {
        m mVar;
        try {
            Context context = magnesSettings.getContext();
            if (i != 96) {
                if (i != 97) {
                    if (i == 102) {
                        if (this.z1.a(i)) {
                            this.F1 = new m(context, this.B1, 2);
                            if (this.y1.optBoolean(c.l.MG.toString(), false)) {
                                mVar = this.F1;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this.z1.a(i)) {
                    this.E1 = new m(context, this.B1, 4);
                    if (this.y1.optBoolean(c.l.GY.toString(), false)) {
                        mVar = this.E1;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.z1.a(i)) {
                this.D1 = new m(context, this.B1, 1);
                if (this.y1.optBoolean(c.l.AC.toString(), false)) {
                    mVar = this.D1;
                } else {
                    return;
                }
            } else {
                return;
            }
            mVar.c();
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((Class<?>) j.class, 3, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, Handler handler, MagnesSettings magnesSettings) {
        this.B1 = handler;
        this.z1 = eVar;
        this.C1 = magnesSettings;
        this.A1 = new JSONArray();
    }
}
