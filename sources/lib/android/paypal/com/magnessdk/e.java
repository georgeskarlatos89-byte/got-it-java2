package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends b {
    private static final String j = "5.0";
    public static final String k = "REMOTE_CONFIG";
    private static final String l = "QW5kcm9pZE1hZ25lcw==";
    private static final int m = 5;
    private static final int n = 86400;
    private static final int o = 128;
    private static BitSet p = null;
    private static boolean q = false;
    private static JSONArray r;
    public final String d = "conf_refresh_time_interval";
    private Context e;
    private MagnesSettings f;
    private JSONObject g;
    private Handler h;
    private boolean i = false;

    public e(MagnesSettings magnesSettings, Handler handler) {
        this.f = magnesSettings;
        this.e = magnesSettings.getContext();
        this.h = handler;
        this.i = magnesSettings.isDisableRemoteConfig();
        a(c());
        try {
            a.a(getClass(), 0, this.g.toString(2));
        } catch (JSONException e2) {
            a.a(getClass(), 3, (Throwable) e2);
        }
    }

    public static void a(boolean z) {
        q = z;
    }

    private boolean a(String str, String str2) {
        a.a(getClass(), 0, "entering shouldUseCachedConfiguration");
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        a.a(getClass(), 0, "Comparing Cached version is " + str + " default version is " + str2);
        int i2 = 0;
        while (i2 < split.length && i2 < split2.length && split[i2].equals(split2[i2])) {
            i2++;
        }
        return Integer.valueOf(Integer.signum((i2 >= split.length || i2 >= split2.length) ? split.length - split2.length : Integer.valueOf(split[i2]).compareTo(Integer.valueOf(split2[i2])))).intValue() >= 0;
    }

    public static void b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(c.j.NOT_COLLECTABLE.toString());
        if (optJSONArray != null) {
            r = optJSONArray;
        }
        BitSet bitSet = new BitSet(128);
        p = bitSet;
        bitSet.set(0, 128, true);
        int i2 = 0;
        while (optJSONArray != null && i2 < optJSONArray.length()) {
            try {
                p.set(optJSONArray.getInt(i2), false);
            } catch (JSONException e2) {
                a.a((Class<?>) e.class, 3, (Throwable) e2);
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        b(jSONObject);
        this.g = jSONObject;
    }

    public boolean a(int i2) {
        return p.get(i2);
    }

    /* access modifiers changed from: protected */
    public JSONObject b() {
        a.a(getClass(), 0, "entering getDefaultRemoteConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.j.CONF_VERSION.toString(), j);
            jSONObject.put(c.j.CONF_REFRESH_TIME_KEY.toString(), n);
            jSONObject.put(c.j.CONF_ENDPOINT_URL.toString(), c.h.d.DEVICE_INFO_URL.toString());
        } catch (JSONException e2) {
            a.a(getClass(), 3, (Throwable) e2);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public JSONObject c() {
        try {
            JSONObject a = b.a(k, this.e);
            if (a == null) {
                new lib.android.paypal.com.magnessdk.network.a(c.h.d.REMOTE_CONFIG_URL, this.f, this.h, (JSONObject) null).c();
            } else if (a(a.optString(c.e.CONF_VERSION.toString(), ""), j)) {
                boolean a2 = b.a(a, Long.parseLong(b(this.e, k)), c.C0002c.REMOTE);
                if (!this.i && a2) {
                    new lib.android.paypal.com.magnessdk.network.a(c.h.d.REMOTE_CONFIG_URL, this.f, this.h, (JSONObject) null).c();
                }
                a.a(getClass(), 0, "Using cached currentConfig due to isRemoteConfigDisabled : " + this.i + " or isConfigExpired : " + a2);
                return a;
            } else {
                b.c(this.e, k);
            }
        } catch (Exception e2) {
            a.a(getClass(), 3, (Throwable) e2);
        }
        return b();
    }

    /* access modifiers changed from: protected */
    public String d() {
        return c.h.d.REMOTE_CONFIG_URL.toString();
    }

    public List<String> e() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = this.g.optJSONArray(c.j.ANDROID_APPS_TO_CHECK.toString());
        int i2 = 0;
        while (optJSONArray != null && i2 < optJSONArray.length()) {
            arrayList.add(optJSONArray.getString(i2));
            i2++;
        }
        return arrayList;
    }

    public String f() {
        return this.g.optString(c.j.CONF_VERSION.toString());
    }

    public String g() {
        return this.g.optString(c.j.CONF_ENDPOINT_URL.toString(), c.h.d.DEVICE_INFO_URL.toString());
    }

    public String h() {
        return this.g.optString(c.j.MG_ID.toString(), l);
    }

    public JSONArray i() {
        return r;
    }

    public int j() {
        return this.g.optInt(c.j.SENSOR_COLLECT_TIME.toString(), 5);
    }

    public boolean k() {
        return q;
    }
}
