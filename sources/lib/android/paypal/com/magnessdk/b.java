package lib.android.paypal.com.magnessdk;

import android.content.Context;
import java.io.File;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.filesystem.c;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONObject;

public abstract class b {
    static final int a = 1000;
    private static final String b = "_TIME";
    private static final String c = "_DATA";

    protected static String a(Context context, String str) {
        a.a((Class<?>) b.class, 0, "Loading loadCachedConfigData");
        return c.b(new File(context.getFilesDir(), str + c));
    }

    protected static JSONObject a(String str, Context context) {
        Class<b> cls = b.class;
        a.a((Class<?>) cls, 0, "entering getCachedConfig");
        try {
            String a2 = a(context, str);
            if (!a2.isEmpty()) {
                a.a((Class<?>) cls, 0, "leaving getCachedConfig,cached config loadsuccessfully");
                return new JSONObject(a2);
            }
            a.a((Class<?>) cls, 0, "leaving getCachedConfig,cached config loaded empty");
            return null;
        } catch (Exception e) {
            a.a((Class<?>) cls, 3, (Throwable) e);
        }
    }

    public static void a(Context context, String str, String str2) {
        a.a((Class<?>) b.class, 0, "entering saveConfigData");
        File file = new File(context.getFilesDir(), str2 + c);
        File file2 = new File(context.getFilesDir(), str2 + b);
        c.a(file, str);
        c.a(file2, String.valueOf(System.currentTimeMillis()));
    }

    static boolean a(JSONObject jSONObject, long j, c.C0002c cVar) {
        return System.currentTimeMillis() > j + (jSONObject.optLong(cVar == c.C0002c.RAMP ? c.i.CONF_REFRESH_TIME_KEY.toString() : cVar == c.C0002c.REMOTE ? c.j.CONF_REFRESH_TIME_KEY.toString() : "", 0) * 1000);
    }

    static boolean c(Context context, String str) {
        a.a((Class<?>) b.class, 0, "entering deleteCachedConfigDataFromDisk");
        return lib.android.paypal.com.magnessdk.filesystem.c.a(new File(context.getFilesDir(), new StringBuilder().append(str).append(c).toString())) && lib.android.paypal.com.magnessdk.filesystem.c.a(new File(context.getFilesDir(), new StringBuilder().append(str).append(b).toString()));
    }

    /* access modifiers changed from: package-private */
    public abstract JSONObject a();

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public String b(Context context, String str) {
        a.a(getClass(), 0, "Loading loadCachedConfigTime");
        return lib.android.paypal.com.magnessdk.filesystem.c.b(new File(context.getFilesDir(), str + b));
    }

    /* access modifiers changed from: protected */
    public abstract JSONObject b();

    /* access modifiers changed from: protected */
    public abstract JSONObject c();

    /* access modifiers changed from: protected */
    public abstract String d();
}
