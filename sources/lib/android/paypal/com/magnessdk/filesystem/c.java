package lib.android.paypal.com.magnessdk.filesystem;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import lib.android.paypal.com.magnessdk.f;
import lib.android.paypal.com.magnessdk.log.a;

public final class c {
    private c() {
    }

    public static String a(Context context, String str) {
        return context.getSharedPreferences(str, 0).getString(str, "");
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static boolean a(File file) {
        Class<c> cls = c.class;
        try {
            if (file.exists()) {
                a.a((Class<?>) cls, 0, "deleting CachedConfigDataFromDisk");
                return file.delete();
            }
        } catch (Exception e) {
            a.a((Class<?>) cls, 3, (Throwable) e);
        }
        return false;
    }

    public static boolean a(File file, String str) {
        Class<c> cls = c.class;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes("UTF-8"));
                f.a((Class<?>) cls, (Closeable) fileOutputStream2);
                return true;
            } catch (Exception e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    a.a((Class<?>) cls, 3, (Throwable) e);
                    f.a((Class<?>) cls, (Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    f.a((Class<?>) cls, (Closeable) fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                f.a((Class<?>) cls, (Closeable) fileOutputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            a.a((Class<?>) cls, 3, (Throwable) e);
            f.a((Class<?>) cls, (Closeable) fileOutputStream);
            return false;
        }
    }

    public static boolean a(String[] strArr, String str) {
        File file;
        if (!(strArr == null || str == null)) {
            boolean z = !str.isEmpty();
            for (String str2 : strArr) {
                if (!z) {
                    file = new File(str2);
                }
                if (file.exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b(File file) {
        Class<c> cls = c.class;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile2.length())];
                randomAccessFile2.readFully(bArr);
                String str = new String(bArr, "UTF-8");
                f.a((Class<?>) cls, (Closeable) randomAccessFile2);
                return str;
            } catch (Exception e) {
                e = e;
                randomAccessFile = randomAccessFile2;
                try {
                    a.a((Class<?>) cls, 3, (Throwable) e);
                    f.a((Class<?>) cls, (Closeable) randomAccessFile);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    f.a((Class<?>) cls, (Closeable) randomAccessFile2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                f.a((Class<?>) cls, (Closeable) randomAccessFile2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            a.a((Class<?>) cls, 3, (Throwable) e);
            f.a((Class<?>) cls, (Closeable) randomAccessFile);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.io.File r5) {
        /*
            java.lang.Class<lib.android.paypal.com.magnessdk.filesystem.c> r0 = lib.android.paypal.com.magnessdk.filesystem.c.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
        L_0x0012:
            java.lang.String r5 = r3.readLine()     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            if (r5 == 0) goto L_0x002d
            r1.append(r5)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            goto L_0x0012
        L_0x001c:
            r5 = move-exception
            goto L_0x0043
        L_0x001e:
            r5 = move-exception
            goto L_0x0024
        L_0x0020:
            r5 = move-exception
            goto L_0x0042
        L_0x0022:
            r5 = move-exception
            r3 = r2
        L_0x0024:
            r4 = -403(0xfffffffffffffe6d, float:NaN)
            r1.append(r4)     // Catch:{ all -> 0x0040 }
            r4 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r0, (int) r4, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0040 }
        L_0x002d:
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r0, (java.io.Closeable) r3)
            java.lang.String r5 = r1.toString()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            java.lang.String r2 = r1.toString()
        L_0x003f:
            return r2
        L_0x0040:
            r5 = move-exception
            r2 = r3
        L_0x0042:
            r3 = r2
        L_0x0043:
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r0, (java.io.Closeable) r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.filesystem.c.c(java.io.File):java.lang.String");
    }
}
