package com.google.android.gms.internal.auth;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzgz {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc = zzdo.zza();
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0156  */
    static {
        /*
            sun.misc.Unsafe r0 = zzg()
            zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.auth.zzdo.zza()
            zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzs(r1)
            zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzs(r2)
            zze = r2
            r3 = 0
            if (r0 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r1 == 0) goto L_0x0028
            com.google.android.gms.internal.auth.zzgx r3 = new com.google.android.gms.internal.auth.zzgx
            r3.<init>(r0)
            goto L_0x002f
        L_0x0028:
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.internal.auth.zzgw r3 = new com.google.android.gms.internal.auth.zzgw
            r3.<init>(r0)
        L_0x002f:
            zzf = r3
            java.lang.String r0 = "getLong"
            java.lang.String r1 = "objectFieldOffset"
            r2 = 2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r3 = r5
            goto L_0x0069
        L_0x003c:
            sun.misc.Unsafe r3 = r3.zza
            if (r3 != 0) goto L_0x0041
            goto L_0x003a
        L_0x0041:
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0064 }
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            r6[r5] = r7     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r6)     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0064 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x0064 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0064 }
            r6[r4] = r7     // Catch:{ all -> 0x0064 }
            r3.getMethod(r0, r6)     // Catch:{ all -> 0x0064 }
            java.lang.reflect.Field r3 = zzy()     // Catch:{ all -> 0x0064 }
            if (r3 != 0) goto L_0x0062
            goto L_0x003a
        L_0x0062:
            r3 = r4
            goto L_0x0069
        L_0x0064:
            r3 = move-exception
            zzh(r3)
            goto L_0x003a
        L_0x0069:
            zzg = r3
            com.google.android.gms.internal.auth.zzgy r3 = zzf
            if (r3 != 0) goto L_0x0072
        L_0x006f:
            r0 = r5
            goto L_0x0107
        L_0x0072:
            sun.misc.Unsafe r3 = r3.zza
            if (r3 != 0) goto L_0x0077
            goto L_0x006f
        L_0x0077:
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            r6[r5] = r7     // Catch:{ all -> 0x0101 }
            r3.getMethod(r1, r6)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r1[r5] = r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "arrayBaseOffset"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r1[r5] = r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "arrayIndexScale"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1[r5] = r6     // Catch:{ all -> 0x0101 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r1[r4] = r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "getInt"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x0101 }
            r1 = 3
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x0101 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r6[r4] = r7     // Catch:{ all -> 0x0101 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0101 }
            r6[r2] = r7     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = "putInt"
            r3.getMethod(r7, r6)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x0101 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r6[r4] = r7     // Catch:{ all -> 0x0101 }
            r3.getMethod(r0, r6)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ all -> 0x0101 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r0[r4] = r6     // Catch:{ all -> 0x0101 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r0[r2] = r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "putLong"
            r3.getMethod(r6, r0)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ all -> 0x0101 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r0[r4] = r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "getObject"
            r3.getMethod(r6, r0)     // Catch:{ all -> 0x0101 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r5] = r1     // Catch:{ all -> 0x0101 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0101 }
            r0[r4] = r1     // Catch:{ all -> 0x0101 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r2] = r1     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "putObject"
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0101 }
            r0 = r4
            goto L_0x0107
        L_0x0101:
            r0 = move-exception
            zzh(r0)
            goto L_0x006f
        L_0x0107:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            zzw(r0)
            java.lang.Class<boolean[]> r0 = boolean[].class
            zzw(r0)
            zzx(r0)
            java.lang.Class<int[]> r0 = int[].class
            zzw(r0)
            zzx(r0)
            java.lang.Class<long[]> r0 = long[].class
            zzw(r0)
            zzx(r0)
            java.lang.Class<float[]> r0 = float[].class
            zzw(r0)
            zzx(r0)
            java.lang.Class<double[]> r0 = double[].class
            zzw(r0)
            zzx(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzw(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzx(r0)
            java.lang.reflect.Field r0 = zzy()
            if (r0 == 0) goto L_0x014d
            com.google.android.gms.internal.auth.zzgy r1 = zzf
            if (r1 == 0) goto L_0x014d
            r1.zzk(r0)
        L_0x014d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r4 = r5
        L_0x0157:
            zza = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgz.<clinit>():void");
    }

    private zzgz() {
    }

    static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(Object obj, long j) {
        return zzf.zzi(obj, j);
    }

    static long zzd(Object obj, long j) {
        return zzf.zzj(obj, j);
    }

    static <T> T zze(Class<T> cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static Object zzf(Object obj, long j) {
        return zzf.zzl(obj, j);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzgz.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    static /* synthetic */ void zzi(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        zzgy zzgy = zzf;
        int zzi = zzgy.zzi(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzgy.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzi));
    }

    static /* synthetic */ void zzj(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        zzgy zzgy = zzf;
        int zzi = zzgy.zzi(obj, j2);
        int i = (((int) j) & 3) << 3;
        zzgy.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzi));
    }

    static void zzk(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzl(Object obj, long j, double d) {
        zzf.zzd(obj, j, d);
    }

    static void zzm(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static void zzn(Object obj, long j, int i) {
        zzf.zzm(obj, j, i);
    }

    static void zzo(Object obj, long j, long j2) {
        zzf.zzn(obj, j, j2);
    }

    static void zzp(Object obj, long j, Object obj2) {
        zzf.zzo(obj, j, obj2);
    }

    static /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zzf.zzi(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zzf.zzi(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zzdo.zza;
        try {
            Class<?> cls3 = zzc;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzt(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static boolean zzu() {
        return zzh;
    }

    static boolean zzv() {
        return zzg;
    }

    private static int zzw(Class<?> cls) {
        if (zzh) {
            return zzf.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class<?> cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzdo.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
