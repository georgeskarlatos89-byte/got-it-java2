package lib.android.paypal.com.magnessdk.log;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static final String e = "****MAGNES DEBUGGING MESSAGE****";
    private static boolean f = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: lib.android.paypal.com.magnessdk.log.a$a  reason: collision with other inner class name */
    @interface C0007a {
    }

    private a() {
    }

    public static void a(Class<?> cls, int i, String str) {
        boolean z = f;
        if (!z) {
            return;
        }
        if (i == 0) {
            Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        } else if (i == 1) {
            Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        } else if (i == 2) {
            Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        } else if (i == 3 && z) {
            Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        }
    }

    public static void a(Class<?> cls, int i, Throwable th) {
        boolean z = f;
        if (!z) {
            return;
        }
        if (i == 0) {
            Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        } else if (i == 1) {
            Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        } else if (i == 2) {
            Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        } else if (i == 3 && z) {
            Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        }
    }
}
