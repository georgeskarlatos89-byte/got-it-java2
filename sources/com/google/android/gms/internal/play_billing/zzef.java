package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzec, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzei, zzdq zzdq, zzff zzff, zzce zzce, zzdx zzdx) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzce != null && zzce.zzf(zzec)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzei;
        this.zzl = zzdq;
        this.zzm = zzff;
        this.zzn = zzce;
        this.zzg = zzec;
        this.zzp = zzdx;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzs = (long) (zzs(i) & 1048575);
            Object object = unsafe.getObject(obj2, zzs);
            if (object != null) {
                zzeo zzv = zzv(i);
                if (!zzI(obj, i)) {
                    if (!zzL(object)) {
                        unsafe.putObject(obj, zzs, object);
                    } else {
                        Object zze2 = zzv.zze();
                        zzv.zzg(zze2, object);
                        unsafe.putObject(obj, zzs, zze2);
                    }
                    zzD(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzs);
                if (!zzL(object2)) {
                    Object zze3 = zzv.zze();
                    zzv.zzg(zze3, object2);
                    unsafe.putObject(obj, zzs, zze3);
                    object2 = zze3;
                }
                zzv.zzg(object2, object);
                return;
            }
            int i2 = this.zzc[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzs = (long) (zzs(i) & 1048575);
            Object object = unsafe.getObject(obj2, zzs);
            if (object != null) {
                zzeo zzv = zzv(i);
                if (!zzM(obj, i2, i)) {
                    if (!zzL(object)) {
                        unsafe.putObject(obj, zzs, object);
                    } else {
                        Object zze2 = zzv.zze();
                        zzv.zzg(zze2, object);
                        unsafe.putObject(obj, zzs, zze2);
                    }
                    zzE(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzs);
                if (!zzL(object2)) {
                    Object zze3 = zzv.zze();
                    zzv.zzg(zze3, object2);
                    unsafe.putObject(obj, zzs, zze3);
                    object2 = zze3;
                }
                zzv.zzg(object2, object);
                return;
            }
            int i3 = this.zzc[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp2 = zzp(i);
        long j = (long) (1048575 & zzp2);
        if (j != 1048575) {
            zzfp.zzq(obj, j, (1 << (zzp2 >>> 20)) | zzfp.zzc(obj, j));
        }
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, (long) (zzp(i2) & 1048575), i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, (long) (zzs(i) & 1048575), obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, (long) (zzs(i2) & 1048575), obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp2 = zzp(i);
        long j = (long) (zzp2 & 1048575);
        if (j == 1048575) {
            int zzs = zzs(i);
            long j2 = (long) (zzs & 1048575);
            switch (zzr(zzs)) {
                case 0:
                    return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
                case 2:
                    return zzfp.zzd(obj, j2) != 0;
                case 3:
                    return zzfp.zzd(obj, j2) != 0;
                case 4:
                    return zzfp.zzc(obj, j2) != 0;
                case 5:
                    return zzfp.zzd(obj, j2) != 0;
                case 6:
                    return zzfp.zzc(obj, j2) != 0;
                case 7:
                    return zzfp.zzw(obj, j2);
                case 8:
                    Object zzf2 = zzfp.zzf(obj, j2);
                    if (zzf2 instanceof String) {
                        return !((String) zzf2).isEmpty();
                    }
                    if (zzf2 instanceof zzbq) {
                        return !zzbq.zzb.equals(zzf2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzfp.zzf(obj, j2) != null;
                case 10:
                    return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
                case 11:
                    return zzfp.zzc(obj, j2) != 0;
                case 12:
                    return zzfp.zzc(obj, j2) != 0;
                case 13:
                    return zzfp.zzc(obj, j2) != 0;
                case 14:
                    return zzfp.zzd(obj, j2) != 0;
                case 15:
                    return zzfp.zzc(obj, j2) != 0;
                case 16:
                    return zzfp.zzd(obj, j2) != 0;
                case 17:
                    return zzfp.zzf(obj, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzfp.zzc(obj, j) & (1 << (zzp2 >>> 20))) != 0;
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeo) {
        return zzeo.zzk(zzfp.zzf(obj, (long) (i & 1048575)));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfx) throws IOException {
        if (obj instanceof String) {
            zzfx.zzG(i, (String) obj);
        } else {
            zzfx.zzd(i, (zzbq) obj);
        }
    }

    static zzfg zzd(Object obj) {
        zzcs zzcs = (zzcs) obj;
        zzfg zzfg = zzcs.zzc;
        if (zzfg != zzfg.zzc()) {
            return zzfg;
        }
        zzfg zzf2 = zzfg.zzf();
        zzcs.zzc = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzdz r34, com.google.android.gms.internal.play_billing.zzei r35, com.google.android.gms.internal.play_billing.zzdq r36, com.google.android.gms.internal.play_billing.zzff r37, com.google.android.gms.internal.play_billing.zzce r38, com.google.android.gms.internal.play_billing.zzdx r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.zzen
            if (r1 == 0) goto L_0x0402
            com.google.android.gms.internal.play_billing.zzen r0 = (com.google.android.gms.internal.play_billing.zzen) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0025
            r4 = 1
        L_0x001b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0026
            r4 = r7
            goto L_0x001b
        L_0x0025:
            r7 = 1
        L_0x0026:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0045
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0032:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0042
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0032
        L_0x0042:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0045:
            if (r7 != 0) goto L_0x0057
            int[] r7 = zza
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r13
            r16 = r14
            r18 = r16
            r17 = r7
            r7 = r18
            goto L_0x0167
        L_0x0057:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0063:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0073
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0063
        L_0x0073:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0076:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0095
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0082:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0092
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0082
        L_0x0092:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0095:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a1
        L_0x00b1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r17 = r7
            r13 = r9
            r18 = r14
            r7 = r4
            r14 = r10
            r4 = r15
        L_0x0167:
            sun.misc.Unsafe r9 = zzb
            java.lang.Object[] r10 = r0.zze()
            com.google.android.gms.internal.play_billing.zzec r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r19 = r18 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r20 = r3
            r21 = r20
            r22 = r18
            r23 = r19
        L_0x0187:
            if (r4 >= r2) goto L_0x03db
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01af
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0197:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01a9
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r25
            goto L_0x0197
        L_0x01a9:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r25
            goto L_0x01b1
        L_0x01af:
            r3 = r24
        L_0x01b1:
            int r24 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L_0x01bf:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d1
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r3 = r3 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L_0x01bf
        L_0x01d1:
            int r8 = r8 << r24
            r3 = r3 | r8
            r8 = r25
            goto L_0x01d9
        L_0x01d7:
            r8 = r24
        L_0x01d9:
            r6 = r3 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01e3
            int r6 = r20 + 1
            r17[r20] = r21
            r20 = r6
        L_0x01e3:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r5 = r3 & 2048(0x800, float:2.87E-42)
            r26 = r2
            r2 = 51
            if (r6 < r2) goto L_0x029a
            int r2 = r8 + 1
            char r8 = r1.charAt(r8)
            r27 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L_0x0221
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r30 = 13
            r32 = r27
            r27 = r8
            r8 = r32
        L_0x0204:
            int r31 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r2) goto L_0x021a
            r2 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r30
            r27 = r27 | r2
            int r30 = r30 + 13
            r8 = r31
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0204
        L_0x021a:
            int r2 = r8 << r30
            r8 = r27 | r2
            r2 = r31
            goto L_0x0223
        L_0x0221:
            r2 = r27
        L_0x0223:
            r27 = r2
            int r2 = r6 + -51
            r30 = r14
            r14 = 9
            if (r2 == r14) goto L_0x024f
            r14 = 17
            if (r2 != r14) goto L_0x0232
            goto L_0x024f
        L_0x0232:
            r14 = 12
            if (r2 != r14) goto L_0x025e
            int r2 = r0.zzc()
            r14 = 1
            if (r2 == r14) goto L_0x0242
            if (r5 == 0) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r5 = 0
            goto L_0x025e
        L_0x0242:
            int r2 = r16 + 1
            int r24 = r21 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r16 = r10[r16]
            r12[r24] = r16
            goto L_0x025c
        L_0x024f:
            r14 = 1
            int r2 = r16 + 1
            int r24 = r21 / 3
            int r24 = r24 + r24
            int r28 = r24 + 1
            r14 = r10[r16]
            r12[r28] = r14
        L_0x025c:
            r16 = r2
        L_0x025e:
            int r8 = r8 + r8
            r2 = r10[r8]
            boolean r14 = r2 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0268
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L_0x0270
        L_0x0268:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzz(r15, r2)
            r10[r8] = r2
        L_0x0270:
            r31 = r13
            long r13 = r9.objectFieldOffset(r2)
            int r2 = (int) r13
            int r8 = r8 + 1
            r13 = r10[r8]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0282
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x028a
        L_0x0282:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzz(r15, r13)
            r10[r8] = r13
        L_0x028a:
            long r13 = r9.objectFieldOffset(r13)
            int r8 = (int) r13
            r29 = r1
            r24 = r8
            r25 = r27
            r8 = 0
            r27 = r0
            goto L_0x039d
        L_0x029a:
            r31 = r13
            r30 = r14
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzz(r15, r13)
            r14 = 9
            if (r6 == r14) goto L_0x0320
            r14 = 17
            if (r6 != r14) goto L_0x02b2
            goto L_0x0320
        L_0x02b2:
            r14 = 27
            if (r6 == r14) goto L_0x030f
            r14 = 49
            if (r6 != r14) goto L_0x02c0
            int r14 = r2 + 1
            r27 = r0
            r0 = 1
            goto L_0x0314
        L_0x02c0:
            r14 = 12
            if (r6 == r14) goto L_0x02f4
            r14 = 30
            if (r6 == r14) goto L_0x02f4
            r14 = 44
            if (r6 != r14) goto L_0x02cd
            goto L_0x02f4
        L_0x02cd:
            r14 = 50
            if (r6 != r14) goto L_0x02f0
            int r14 = r2 + 1
            int r27 = r22 + 1
            r17[r22] = r21
            int r22 = r21 / 3
            r2 = r10[r2]
            int r22 = r22 + r22
            r12[r22] = r2
            if (r5 == 0) goto L_0x02ec
            int r22 = r22 + 1
            int r2 = r14 + 1
            r14 = r10[r14]
            r12[r22] = r14
            r22 = r27
            goto L_0x02f0
        L_0x02ec:
            r2 = r14
            r22 = r27
            r5 = 0
        L_0x02f0:
            r27 = r0
            r0 = 1
            goto L_0x032d
        L_0x02f4:
            int r14 = r0.zzc()
            r27 = r0
            r0 = 1
            if (r14 == r0) goto L_0x0302
            if (r5 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r5 = 0
            goto L_0x032d
        L_0x0302:
            int r14 = r2 + 1
            int r24 = r21 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r2 = r10[r2]
            r12[r24] = r2
            goto L_0x031e
        L_0x030f:
            r27 = r0
            r0 = 1
            int r14 = r2 + 1
        L_0x0314:
            int r24 = r21 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r2 = r10[r2]
            r12[r24] = r2
        L_0x031e:
            r2 = r14
            goto L_0x032d
        L_0x0320:
            r27 = r0
            r0 = 1
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r0
            java.lang.Class r24 = r13.getType()
            r12[r14] = r24
        L_0x032d:
            long r13 = r9.objectFieldOffset(r13)
            int r13 = (int) r13
            r14 = r3 & 4096(0x1000, float:5.74E-42)
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == 0) goto L_0x0387
            r14 = 17
            if (r6 > r14) goto L_0x0387
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r0) goto L_0x0362
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x034c:
            int r25 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r0) goto L_0x035e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r24
            r8 = r8 | r14
            int r24 = r24 + 13
            r14 = r25
            goto L_0x034c
        L_0x035e:
            int r14 = r14 << r24
            r8 = r8 | r14
            goto L_0x0364
        L_0x0362:
            r25 = r14
        L_0x0364:
            int r14 = r7 + r7
            int r24 = r8 / 32
            int r14 = r14 + r24
            r0 = r10[r14]
            r29 = r1
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0375
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x037d
        L_0x0375:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = zzz(r15, r0)
            r10[r14] = r0
        L_0x037d:
            long r0 = r9.objectFieldOffset(r0)
            int r0 = (int) r0
            int r8 = r8 % 32
            r24 = r0
            goto L_0x038c
        L_0x0387:
            r29 = r1
            r25 = r8
            r8 = 0
        L_0x038c:
            r0 = 18
            if (r6 < r0) goto L_0x039a
            r0 = 49
            if (r6 > r0) goto L_0x039a
            int r0 = r23 + 1
            r17[r23] = r13
            r23 = r0
        L_0x039a:
            r16 = r2
            r2 = r13
        L_0x039d:
            int r0 = r21 + 1
            r11[r21] = r4
            int r1 = r0 + 1
            r4 = r3 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x03aa
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03ab
        L_0x03aa:
            r4 = 0
        L_0x03ab:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03b2
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03b3
        L_0x03b2:
            r3 = 0
        L_0x03b3:
            if (r5 == 0) goto L_0x03b8
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03b9
        L_0x03b8:
            r5 = 0
        L_0x03b9:
            int r6 = r6 << 20
            r3 = r3 | r4
            r3 = r3 | r5
            r3 = r3 | r6
            r2 = r2 | r3
            r11[r0] = r2
            int r21 = r1 + 1
            int r0 = r8 << 20
            r0 = r0 | r24
            r11[r1] = r0
            r4 = r25
            r2 = r26
            r0 = r27
            r1 = r29
            r14 = r30
            r13 = r31
            r3 = 0
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0187
        L_0x03db:
            r27 = r0
            r31 = r13
            r30 = r14
            com.google.android.gms.internal.play_billing.zzef r0 = new com.google.android.gms.internal.play_billing.zzef
            com.google.android.gms.internal.play_billing.zzec r14 = r27.zza()
            int r15 = r27.zzc()
            r16 = 0
            r9 = r0
            r10 = r11
            r11 = r12
            r12 = r31
            r13 = r30
            r20 = r35
            r21 = r36
            r22 = r37
            r23 = r38
            r24 = r39
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x0402:
            com.google.android.gms.internal.play_billing.zzfc r0 = (com.google.android.gms.internal.play_billing.zzfc) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeo = (zzeo) objArr[i3];
        if (zzeo != null) {
            return zzeo;
        }
        zzeo zzb2 = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, (long) zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze2 = zzv.zze();
        if (object != null) {
            zzv.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, (long) (zzs(i2) & 1048575));
        if (zzL(object)) {
            return object;
        }
        Object zze2 = zzv.zze();
        if (object != null) {
            zzv.zzg(zze2, object);
        }
        return zze2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037a, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037c, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x039a, code lost:
        r1 = r1 * r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x054e, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0560, code lost:
        r12 = r12 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0670, code lost:
        r0 = r0 + (r2 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06d9, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0762, code lost:
        r0 = r0 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0779, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0791, code lost:
        r0 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0795, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r9 = false;
        r10 = 1048575;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            sun.misc.Unsafe r8 = zzb
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r9
            r11 = r1
            r12 = r11
            r0 = r10
        L_0x000e:
            int[] r2 = r6.zzc
            int r2 = r2.length
            if (r11 >= r2) goto L_0x07a0
            int r2 = r6.zzs(r11)
            int r3 = zzr(r2)
            int[] r4 = r6.zzc
            int r5 = r11 + 2
            r13 = r4[r11]
            r4 = r4[r5]
            r5 = r4 & r10
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0040
            if (r5 == r0) goto L_0x0037
            if (r5 != r10) goto L_0x0030
            r0 = r9
            goto L_0x0035
        L_0x0030:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
        L_0x0035:
            r1 = r0
            r0 = r5
        L_0x0037:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r5 = r4
            goto L_0x0044
        L_0x0040:
            r14 = r0
            r16 = r1
            r5 = r9
        L_0x0044:
            r0 = r2 & r10
            com.google.android.gms.internal.play_billing.zzcj r1 = com.google.android.gms.internal.play_billing.zzcj.DOUBLE_LIST_PACKED
            int r1 = r1.zza()
            if (r3 < r1) goto L_0x0053
            com.google.android.gms.internal.play_billing.zzcj r1 = com.google.android.gms.internal.play_billing.zzcj.SINT64_LIST_PACKED
            r1.zza()
        L_0x0053:
            long r1 = (long) r0
            r17 = 63
            switch(r3) {
                case 0: goto L_0x077d;
                case 1: goto L_0x0765;
                case 2: goto L_0x0745;
                case 3: goto L_0x0727;
                case 4: goto L_0x0708;
                case 5: goto L_0x06f2;
                case 6: goto L_0x06dc;
                case 7: goto L_0x06c5;
                case 8: goto L_0x0691;
                case 9: goto L_0x0674;
                case 10: goto L_0x064d;
                case 11: goto L_0x062e;
                case 12: goto L_0x060e;
                case 13: goto L_0x05f8;
                case 14: goto L_0x05e2;
                case 15: goto L_0x05be;
                case 16: goto L_0x059a;
                case 17: goto L_0x057b;
                case 18: goto L_0x056e;
                case 19: goto L_0x0563;
                case 20: goto L_0x0540;
                case 21: goto L_0x0524;
                case 22: goto L_0x0508;
                case 23: goto L_0x04fc;
                case 24: goto L_0x04f0;
                case 25: goto L_0x04d6;
                case 26: goto L_0x0475;
                case 27: goto L_0x0435;
                case 28: goto L_0x0403;
                case 29: goto L_0x03e9;
                case 30: goto L_0x03cf;
                case 31: goto L_0x03c3;
                case 32: goto L_0x03b7;
                case 33: goto L_0x039d;
                case 34: goto L_0x037f;
                case 35: goto L_0x0364;
                case 36: goto L_0x034d;
                case 37: goto L_0x0336;
                case 38: goto L_0x031f;
                case 39: goto L_0x0308;
                case 40: goto L_0x02f0;
                case 41: goto L_0x02d8;
                case 42: goto L_0x02be;
                case 43: goto L_0x02a6;
                case 44: goto L_0x028e;
                case 45: goto L_0x0276;
                case 46: goto L_0x025e;
                case 47: goto L_0x0246;
                case 48: goto L_0x022e;
                case 49: goto L_0x0205;
                case 50: goto L_0x01d5;
                case 51: goto L_0x01c7;
                case 52: goto L_0x01b9;
                case 53: goto L_0x01a3;
                case 54: goto L_0x018d;
                case 55: goto L_0x0176;
                case 56: goto L_0x0168;
                case 57: goto L_0x015a;
                case 58: goto L_0x014c;
                case 59: goto L_0x0120;
                case 60: goto L_0x010c;
                case 61: goto L_0x00f0;
                case 62: goto L_0x00da;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b5;
                case 65: goto L_0x00a7;
                case 66: goto L_0x008c;
                case 67: goto L_0x0071;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0795
        L_0x005b:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.play_billing.zzec r0 = (com.google.android.gms.internal.play_billing.zzec) r0
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzt(r13, r0, r1)
            goto L_0x0578
        L_0x0071:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = zzt(r7, r1)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            long r1 = r1 ^ r3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x008c:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = zzo(r7, r1)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            r1 = r1 ^ r2
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0762
        L_0x00a7:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0791
        L_0x00b5:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0779
        L_0x00c3:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = zzo(r7, r1)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x00da:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = zzo(r7, r1)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0762
        L_0x00f0:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r1)
            com.google.android.gms.internal.play_billing.zzbq r1 = (com.google.android.gms.internal.play_billing.zzbq) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0670
        L_0x010c:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzh(r13, r0, r1)
            goto L_0x0578
        L_0x0120:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.zzbq
            if (r2 == 0) goto L_0x0140
            com.google.android.gms.internal.play_billing.zzbq r1 = (com.google.android.gms.internal.play_billing.zzbq) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0670
        L_0x0140:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzv(r1)
            goto L_0x0762
        L_0x014c:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x06d9
        L_0x015a:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0779
        L_0x0168:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0791
        L_0x0176:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = zzo(r7, r1)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x018d:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = zzt(r7, r1)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x01a3:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = zzt(r7, r1)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x01b9:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0779
        L_0x01c7:
            boolean r0 = r6.zzM(r7, r13, r11)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0791
        L_0x01d5:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.lang.Object r1 = r6.zzw(r11)
            com.google.android.gms.internal.play_billing.zzdw r0 = (com.google.android.gms.internal.play_billing.zzdw) r0
            com.google.android.gms.internal.play_billing.zzdv r1 = (com.google.android.gms.internal.play_billing.zzdv) r1
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0795
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x01f7
            goto L_0x0795
        L_0x01f7:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L_0x0205:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r2 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0219
            r4 = r9
            goto L_0x022b
        L_0x0219:
            r3 = r9
            r4 = r3
        L_0x021b:
            if (r3 >= r2) goto L_0x022b
            java.lang.Object r5 = r0.get(r3)
            com.google.android.gms.internal.play_billing.zzec r5 = (com.google.android.gms.internal.play_billing.zzec) r5
            int r5 = com.google.android.gms.internal.play_billing.zzby.zzt(r13, r5, r1)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x021b
        L_0x022b:
            int r12 = r12 + r4
            goto L_0x0795
        L_0x022e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzj(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x0246:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzi(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x025e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zze(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x0276:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzc(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zza(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x02a6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzk(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x02be:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x02d8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzc(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x02f0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zze(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x0308:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzf(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x031f:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzl(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x0336:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzg(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x034d:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzc(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x037a
        L_0x0364:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zze(r0)
            if (r0 <= 0) goto L_0x0795
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
        L_0x037a:
            int r1 = r1 + r2
            int r1 = r1 + r0
        L_0x037c:
            int r12 = r12 + r1
            goto L_0x0795
        L_0x037f:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0390
        L_0x038d:
            r0 = r9
            goto L_0x0578
        L_0x0390:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzj(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
        L_0x039a:
            int r1 = r1 * r2
            goto L_0x0762
        L_0x039d:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03ac
            goto L_0x038d
        L_0x03ac:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzi(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            goto L_0x039a
        L_0x03b7:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzd(r13, r0, r9)
            goto L_0x0578
        L_0x03c3:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzb(r13, r0, r9)
            goto L_0x0578
        L_0x03cf:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03de
            goto L_0x038d
        L_0x03de:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zza(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            goto L_0x039a
        L_0x03e9:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03f8
            goto L_0x038d
        L_0x03f8:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzk(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            goto L_0x039a
        L_0x0403:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0414
            r1 = r9
            goto L_0x037c
        L_0x0414:
            int r2 = r13 << 3
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            int r1 = r1 * r2
            r2 = r9
        L_0x041c:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x037c
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.play_billing.zzbq r3 = (com.google.android.gms.internal.play_billing.zzbq) r3
            int r3 = r3.zzd()
            int r4 = com.google.android.gms.internal.play_billing.zzby.zzw(r3)
            int r4 = r4 + r3
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L_0x041c
        L_0x0435:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r2 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0449
            r3 = r9
            goto L_0x0472
        L_0x0449:
            int r3 = r13 << 3
            int r3 = com.google.android.gms.internal.play_billing.zzby.zzw(r3)
            int r3 = r3 * r2
            r4 = r9
        L_0x0451:
            if (r4 >= r2) goto L_0x0472
            java.lang.Object r5 = r0.get(r4)
            boolean r13 = r5 instanceof com.google.android.gms.internal.play_billing.zzdi
            if (r13 == 0) goto L_0x0468
            com.google.android.gms.internal.play_billing.zzdi r5 = (com.google.android.gms.internal.play_billing.zzdi) r5
            int r5 = r5.zza()
            int r13 = com.google.android.gms.internal.play_billing.zzby.zzw(r5)
            int r13 = r13 + r5
            int r3 = r3 + r13
            goto L_0x046f
        L_0x0468:
            com.google.android.gms.internal.play_billing.zzec r5 = (com.google.android.gms.internal.play_billing.zzec) r5
            int r5 = com.google.android.gms.internal.play_billing.zzby.zzu(r5, r1)
            int r3 = r3 + r5
        L_0x046f:
            int r4 = r4 + 1
            goto L_0x0451
        L_0x0472:
            int r12 = r12 + r3
            goto L_0x0795
        L_0x0475:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0485
            goto L_0x054e
        L_0x0485:
            int r2 = r13 << 3
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            int r2 = r2 * r1
            boolean r3 = r0 instanceof com.google.android.gms.internal.play_billing.zzdk
            if (r3 == 0) goto L_0x04b4
            com.google.android.gms.internal.play_billing.zzdk r0 = (com.google.android.gms.internal.play_billing.zzdk) r0
            r3 = r9
        L_0x0493:
            if (r3 >= r1) goto L_0x0560
            java.lang.Object r4 = r0.zzf(r3)
            boolean r5 = r4 instanceof com.google.android.gms.internal.play_billing.zzbq
            if (r5 == 0) goto L_0x04aa
            com.google.android.gms.internal.play_billing.zzbq r4 = (com.google.android.gms.internal.play_billing.zzbq) r4
            int r4 = r4.zzd()
            int r5 = com.google.android.gms.internal.play_billing.zzby.zzw(r4)
            int r5 = r5 + r4
            int r2 = r2 + r5
            goto L_0x04b1
        L_0x04aa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.play_billing.zzby.zzv(r4)
            int r2 = r2 + r4
        L_0x04b1:
            int r3 = r3 + 1
            goto L_0x0493
        L_0x04b4:
            r3 = r9
        L_0x04b5:
            if (r3 >= r1) goto L_0x0560
            java.lang.Object r4 = r0.get(r3)
            boolean r5 = r4 instanceof com.google.android.gms.internal.play_billing.zzbq
            if (r5 == 0) goto L_0x04cc
            com.google.android.gms.internal.play_billing.zzbq r4 = (com.google.android.gms.internal.play_billing.zzbq) r4
            int r4 = r4.zzd()
            int r5 = com.google.android.gms.internal.play_billing.zzby.zzw(r4)
            int r5 = r5 + r4
            int r2 = r2 + r5
            goto L_0x04d3
        L_0x04cc:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.play_billing.zzby.zzv(r4)
            int r2 = r2 + r4
        L_0x04d3:
            int r3 = r3 + 1
            goto L_0x04b5
        L_0x04d6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r0 = r0.size()
            if (r0 != 0) goto L_0x04e6
            goto L_0x038d
        L_0x04e6:
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r1 = r1 + r15
            int r0 = r0 * r1
            goto L_0x0578
        L_0x04f0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzb(r13, r0, r9)
            goto L_0x0578
        L_0x04fc:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzd(r13, r0, r9)
            goto L_0x0578
        L_0x0508:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0518
            goto L_0x038d
        L_0x0518:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzf(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            goto L_0x039a
        L_0x0524:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0534
            goto L_0x038d
        L_0x0534:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzl(r0)
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r2)
            goto L_0x039a
        L_0x0540:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.play_billing.zzeq.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0550
        L_0x054e:
            r2 = r9
            goto L_0x0560
        L_0x0550:
            int r1 = r13 << 3
            int r2 = com.google.android.gms.internal.play_billing.zzeq.zzg(r0)
            int r0 = r0.size()
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
        L_0x0560:
            int r12 = r12 + r2
            goto L_0x0795
        L_0x0563:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzb(r13, r0, r9)
            goto L_0x0578
        L_0x056e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzd(r13, r0, r9)
        L_0x0578:
            int r12 = r12 + r0
            goto L_0x0795
        L_0x057b:
            r0 = r19
            r3 = r1
            r1 = r20
            r2 = r11
            r9 = r3
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.play_billing.zzec r0 = (com.google.android.gms.internal.play_billing.zzec) r0
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzt(r13, r0, r1)
            goto L_0x0578
        L_0x059a:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            long r1 = r1 ^ r3
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x05be:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            r1 = r1 ^ r2
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0762
        L_0x05e2:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0791
        L_0x05f8:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0779
        L_0x060e:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x062e:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0762
        L_0x064d:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r9)
            com.google.android.gms.internal.play_billing.zzbq r1 = (com.google.android.gms.internal.play_billing.zzbq) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
        L_0x0670:
            int r2 = r2 + r1
            int r0 = r0 + r2
            goto L_0x0578
        L_0x0674:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r11)
            int r0 = com.google.android.gms.internal.play_billing.zzeq.zzh(r13, r0, r1)
            goto L_0x0578
        L_0x0691:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r9)
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.zzbq
            if (r2 == 0) goto L_0x06b9
            com.google.android.gms.internal.play_billing.zzbq r1 = (com.google.android.gms.internal.play_billing.zzbq) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.play_billing.zzby.zzw(r1)
            goto L_0x0670
        L_0x06b9:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzv(r1)
            goto L_0x0762
        L_0x06c5:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
        L_0x06d9:
            int r0 = r0 + r15
            goto L_0x0578
        L_0x06dc:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0779
        L_0x06f2:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            goto L_0x0791
        L_0x0708:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x0727:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
            goto L_0x0762
        L_0x0745:
            r9 = r1
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
            int r1 = com.google.android.gms.internal.play_billing.zzby.zzx(r1)
        L_0x0762:
            int r0 = r0 + r1
            goto L_0x0578
        L_0x0765:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
        L_0x0779:
            int r0 = r0 + 4
            goto L_0x0578
        L_0x077d:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0795
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0)
        L_0x0791:
            int r0 = r0 + 8
            goto L_0x0578
        L_0x0795:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000e
        L_0x07a0:
            com.google.android.gms.internal.play_billing.zzff r0 = r6.zzm
            java.lang.Object r1 = r0.zzd(r7)
            int r0 = r0.zza(r1)
            int r12 = r12 + r0
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0802
            com.google.android.gms.internal.play_billing.zzce r0 = r6.zzn
            com.google.android.gms.internal.play_billing.zzci r0 = r0.zzb(r7)
            r9 = 0
            r18 = 0
        L_0x07b8:
            com.google.android.gms.internal.play_billing.zzfb r1 = r0.zza
            int r1 = r1.zzb()
            if (r9 >= r1) goto L_0x07d9
            com.google.android.gms.internal.play_billing.zzfb r1 = r0.zza
            java.util.Map$Entry r1 = r1.zzg(r9)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.play_billing.zzch r2 = (com.google.android.gms.internal.play_billing.zzch) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.play_billing.zzci.zzb(r2, r1)
            int r18 = r18 + r1
            int r9 = r9 + 1
            goto L_0x07b8
        L_0x07d9:
            com.google.android.gms.internal.play_billing.zzfb r0 = r0.zza
            java.lang.Iterable r0 = r0.zzc()
            java.util.Iterator r0 = r0.iterator()
        L_0x07e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0800
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.play_billing.zzch r2 = (com.google.android.gms.internal.play_billing.zzch) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.play_billing.zzci.zzb(r2, r1)
            int r18 = r18 + r1
            goto L_0x07e3
        L_0x0800:
            int r12 = r12 + r18
        L_0x0802:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b8, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0212, code lost:
        r2 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0216, code lost:
        r1 = r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0217, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int[] r2 = r8.zzc
            int r2 = r2.length
            if (r0 >= r2) goto L_0x021b
            int r2 = r8.zzs(r0)
            int[] r3 = r8.zzc
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            int r2 = zzr(r2)
            r3 = r3[r0]
            long r4 = (long) r4
            r6 = 37
            r7 = 32
            switch(r2) {
                case 0: goto L_0x0206;
                case 1: goto L_0x01fb;
                case 2: goto L_0x01f2;
                case 3: goto L_0x01e9;
                case 4: goto L_0x01e2;
                case 5: goto L_0x01d9;
                case 6: goto L_0x01d2;
                case 7: goto L_0x01c7;
                case 8: goto L_0x01ba;
                case 9: goto L_0x01ac;
                case 10: goto L_0x01a0;
                case 11: goto L_0x0198;
                case 12: goto L_0x0190;
                case 13: goto L_0x0188;
                case 14: goto L_0x017e;
                case 15: goto L_0x0176;
                case 16: goto L_0x016c;
                case 17: goto L_0x015f;
                case 18: goto L_0x0153;
                case 19: goto L_0x0153;
                case 20: goto L_0x0153;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0153;
                case 24: goto L_0x0153;
                case 25: goto L_0x0153;
                case 26: goto L_0x0153;
                case 27: goto L_0x0153;
                case 28: goto L_0x0153;
                case 29: goto L_0x0153;
                case 30: goto L_0x0153;
                case 31: goto L_0x0153;
                case 32: goto L_0x0153;
                case 33: goto L_0x0153;
                case 34: goto L_0x0153;
                case 35: goto L_0x0153;
                case 36: goto L_0x0153;
                case 37: goto L_0x0153;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x0153;
                case 41: goto L_0x0153;
                case 42: goto L_0x0153;
                case 43: goto L_0x0153;
                case 44: goto L_0x0153;
                case 45: goto L_0x0153;
                case 46: goto L_0x0153;
                case 47: goto L_0x0153;
                case 48: goto L_0x0153;
                case 49: goto L_0x0153;
                case 50: goto L_0x0147;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x0111;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00d5;
                case 58: goto L_0x00c3;
                case 59: goto L_0x00af;
                case 60: goto L_0x009d;
                case 61: goto L_0x008b;
                case 62: goto L_0x007d;
                case 63: goto L_0x006f;
                case 64: goto L_0x0061;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0033;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0217
        L_0x0021:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x0033:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0043:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x0051:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0061:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x006f:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x007d:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x008b:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x009d:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x00af:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x00c3:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            boolean r2 = zzN(r9, r4)
            int r2 = com.google.android.gms.internal.play_billing.zzda.zza(r2)
            goto L_0x0216
        L_0x00d5:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x00e3:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x00f3:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L_0x0216
        L_0x0101:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0111:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0121:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            float r2 = zzn(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0216
        L_0x0133:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L_0x0217
            int r1 = r1 * 53
            double r2 = zzm(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0147:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x0153:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x015f:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            if (r2 == 0) goto L_0x01b8
            int r6 = r2.hashCode()
            goto L_0x01b8
        L_0x016c:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.play_billing.zzfp.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0176:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x017e:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.play_billing.zzfp.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x0188:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x0190:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x0198:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x01a0:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x01ac:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            if (r2 == 0) goto L_0x01b8
            int r6 = r2.hashCode()
        L_0x01b8:
            int r1 = r1 + r6
            goto L_0x0217
        L_0x01ba:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzfp.zzf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0216
        L_0x01c7:
            int r1 = r1 * 53
            boolean r2 = com.google.android.gms.internal.play_billing.zzfp.zzw(r9, r4)
            int r2 = com.google.android.gms.internal.play_billing.zzda.zza(r2)
            goto L_0x0216
        L_0x01d2:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x01d9:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.play_billing.zzfp.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x01e2:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.play_billing.zzfp.zzc(r9, r4)
            goto L_0x0216
        L_0x01e9:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.play_billing.zzfp.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x01f2:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.play_billing.zzfp.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
            goto L_0x0212
        L_0x01fb:
            int r1 = r1 * 53
            float r2 = com.google.android.gms.internal.play_billing.zzfp.zzb(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0216
        L_0x0206:
            int r1 = r1 * 53
            double r2 = com.google.android.gms.internal.play_billing.zzfp.zza(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.play_billing.zzda.zzd
        L_0x0212:
            long r4 = r2 >>> r7
            long r2 = r2 ^ r4
            int r2 = (int) r2
        L_0x0216:
            int r1 = r1 + r2
        L_0x0217:
            int r0 = r0 + 3
            goto L_0x0002
        L_0x021b:
            int r1 = r1 * 53
            com.google.android.gms.internal.play_billing.zzff r0 = r8.zzm
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x023b
            int r1 = r1 * 53
            com.google.android.gms.internal.play_billing.zzce r0 = r8.zzn
            com.google.android.gms.internal.play_billing.zzci r9 = r0.zzb(r9)
            com.google.android.gms.internal.play_billing.zzfb r9 = r9.zza
            int r9 = r9.hashCode()
            int r1 = r1 + r9
        L_0x023b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzb(java.lang.Object):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f7, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a9, code lost:
        r4 = r13;
        r3 = r14;
        r6 = r17;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03af, code lost:
        r14 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b5, code lost:
        r2 = r37;
        r8 = r5;
        r9 = r6;
        r19 = r10;
        r5 = r11;
        r1 = r12;
        r20 = r13;
        r6 = r14;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c7, code lost:
        r29 = r5;
        r10 = r6;
        r21 = r8;
        r6 = r15;
        r4 = r20;
        r8 = r38;
        r5 = r1;
        r1 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0553, code lost:
        r9 = r11;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0555, code lost:
        r11 = r29;
        r10 = r30;
        r8 = r31;
        r13 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05fb, code lost:
        r13 = r10;
        r10 = r8;
        r8 = r9;
        r9 = r11;
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0605, code lost:
        r9 = r11;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0607, code lost:
        r11 = r29;
        r10 = r30;
        r8 = r31;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06a8, code lost:
        r0 = r33;
        r7 = r13;
        r13 = r10;
        r10 = r8;
        r8 = r9;
        r9 = r11;
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x076e, code lost:
        r8 = r1;
        r10 = r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0881, code lost:
        r8 = r1;
        r1 = r2;
        r10 = r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x09b7, code lost:
        if (r1 == r7) goto L_0x09c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09b9, code lost:
        r7 = r34;
        r2 = r8;
        r4 = r9;
        r3 = r10;
        r12 = r13;
        r6 = r17;
        r10 = 0;
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x09c7, code lost:
        r7 = r34;
        r3 = r1;
        r1 = r8;
        r4 = r9;
        r29 = r11;
        r5 = r13;
        r6 = r15;
        r8 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a27, code lost:
        r20 = r1;
        r1 = r3;
        r4 = r5;
        r9 = r6;
        r6 = r35;
        r5 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0af6, code lost:
        r20 = r1;
        r1 = r3;
        r9 = r6;
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0afb, code lost:
        r32 = r5;
        r5 = r4;
        r4 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b02, code lost:
        r20 = r1;
        r1 = r3;
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b3b, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b3c, code lost:
        r32 = r5;
        r5 = r4;
        r4 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0baa, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0c23, code lost:
        r2 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0c69, code lost:
        if (r2 == r9) goto L_0x0c82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0c6b, code lost:
        r14 = r37;
        r13 = r38;
        r12 = r5;
        r15 = r6;
        r6 = r17;
        r10 = 0;
        r3 = r20;
        r5 = r21;
        r11 = r29;
        r32 = r2;
        r2 = r1;
        r1 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0c82, code lost:
        r8 = r38;
        r3 = r2;
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a8, code lost:
        r4 = r13;
        r3 = r14;
        r6 = r17;
        r2 = r21;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b1, code lost:
        r2 = r37;
        r9 = r1;
        r8 = r5;
        r5 = r11;
        r1 = r12;
        r20 = r13;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bb, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0c89 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0c9e  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0cc1  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0666 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0881 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x0881 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzbc r39) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r7 = r34
            r15 = r35
            r14 = r37
            r13 = r38
            r12 = r39
            zzA(r34)
            sun.misc.Unsafe r11 = zzb
            r10 = 0
            r1 = r36
            r3 = r10
            r4 = r3
            r5 = r4
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001b:
            r16 = 0
            if (r1 >= r14) goto L_0x0ce7
            int r4 = r1 + 1
            byte r1 = r15[r1]
            if (r1 >= 0) goto L_0x002c
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzi(r1, r15, r4, r12)
            int r4 = r12.zza
            goto L_0x0031
        L_0x002c:
            r32 = r4
            r4 = r1
            r1 = r32
        L_0x0031:
            int r8 = r4 >>> 3
            r9 = 3
            if (r8 <= r2) goto L_0x0046
            int r3 = r3 / r9
            int r2 = r0.zze
            if (r8 < r2) goto L_0x0044
            int r2 = r0.zzf
            if (r8 > r2) goto L_0x0044
            int r2 = r0.zzq(r8, r3)
            goto L_0x0052
        L_0x0044:
            r2 = -1
            goto L_0x0052
        L_0x0046:
            int r2 = r0.zze
            if (r8 < r2) goto L_0x0055
            int r2 = r0.zzf
            if (r8 > r2) goto L_0x0055
            int r2 = r0.zzq(r8, r10)
        L_0x0052:
            r3 = r2
            r2 = -1
            goto L_0x0057
        L_0x0055:
            r2 = -1
            r3 = -1
        L_0x0057:
            if (r3 != r2) goto L_0x006a
            r3 = r1
            r18 = r2
            r21 = r5
            r17 = r6
            r1 = r8
            r19 = r10
            r29 = r11
            r5 = r12
            r8 = r13
        L_0x0067:
            r6 = r15
            goto L_0x0c87
        L_0x006a:
            r2 = r4 & 7
            int[] r9 = r0.zzc
            int r19 = r3 + 1
            r10 = r9[r19]
            r19 = r4
            int r4 = zzr(r10)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r10 & r17
            long r13 = (long) r13
            r21 = r8
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            r23 = 0
            java.lang.String r8 = ""
            r27 = r8
            r8 = 17
            if (r4 > r8) goto L_0x03d6
            int r8 = r3 + 2
            r8 = r9[r8]
            int r9 = r8 >>> 20
            r25 = 1
            int r9 = r25 << r9
            r29 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            r30 = r13
            if (r8 == r6) goto L_0x00b2
            if (r6 == r10) goto L_0x00a6
            long r13 = (long) r6
            r11.putInt(r7, r13, r5)
        L_0x00a6:
            if (r8 != r10) goto L_0x00aa
            r5 = 0
            goto L_0x00af
        L_0x00aa:
            long r5 = (long) r8
            int r5 = r11.getInt(r7, r5)
        L_0x00af:
            r17 = r8
            goto L_0x00b4
        L_0x00b2:
            r17 = r6
        L_0x00b4:
            switch(r4) {
                case 0: goto L_0x0391;
                case 1: goto L_0x0378;
                case 2: goto L_0x035e;
                case 3: goto L_0x035e;
                case 4: goto L_0x034a;
                case 5: goto L_0x032f;
                case 6: goto L_0x0319;
                case 7: goto L_0x02fd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x0187;
                case 10: goto L_0x0174;
                case 11: goto L_0x034a;
                case 12: goto L_0x0142;
                case 13: goto L_0x0319;
                case 14: goto L_0x032f;
                case 15: goto L_0x012b;
                case 16: goto L_0x0101;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            r6 = r1
            r14 = r3
            r13 = r19
            r1 = 3
            r10 = 0
            if (r2 != r1) goto L_0x03b5
            r5 = r5 | r9
            java.lang.Object r1 = r0.zzx(r7, r14)
            int r2 = r21 << 3
            r2 = r2 | 4
            com.google.android.gms.internal.play_billing.zzeo r9 = r0.zzv(r14)
            r3 = r21
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r1
            r18 = -1
            r19 = r10
            r10 = r35
            r36 = r5
            r5 = r11
            r11 = r6
            r6 = r12
            r12 = r37
            r20 = r13
            r13 = r2
            r2 = r37
            r6 = r14
            r14 = r39
            int r8 = com.google.android.gms.internal.play_billing.zzbd.zzl(r8, r9, r10, r11, r12, r13, r14)
            r0.zzF(r7, r6, r1)
            r13 = r38
            r12 = r39
            r14 = r2
            r2 = r3
            r11 = r5
            r3 = r6
            r1 = r8
            r6 = r17
            r10 = r19
            r4 = r20
            r5 = r36
            goto L_0x001b
        L_0x0101:
            if (r2 != 0) goto L_0x011f
            r8 = r5 | r9
            int r9 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r1, r12)
            long r1 = r12.zzb
            long r5 = com.google.android.gms.internal.play_billing.zzbu.zzc(r1)
            r1 = r11
            r13 = -1
            r2 = r34
            r14 = r3
            r13 = r19
            r3 = r30
            r1.putLong(r2, r3, r5)
            r5 = r8
            r1 = r9
            goto L_0x01a8
        L_0x011f:
            r2 = r37
            r9 = r1
            r6 = r3
            r8 = r5
            r4 = r10
            r5 = r11
            r1 = r12
            r20 = r19
            goto L_0x01bb
        L_0x012b:
            r14 = r3
            r13 = r19
            if (r2 != 0) goto L_0x01b1
            r5 = r5 | r9
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r12)
            int r2 = r12.zza
            int r2 = com.google.android.gms.internal.play_billing.zzbu.zzb(r2)
            r3 = r30
            r11.putInt(r7, r3, r2)
            goto L_0x01a8
        L_0x0142:
            r14 = r3
            r13 = r19
            r3 = r30
            if (r2 != 0) goto L_0x01b1
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r12)
            int r2 = r12.zza
            com.google.android.gms.internal.play_billing.zzcw r6 = r0.zzu(r14)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r29 & r8
            if (r8 == 0) goto L_0x016f
            if (r6 == 0) goto L_0x016f
            boolean r6 = r6.zza(r2)
            if (r6 == 0) goto L_0x0162
            goto L_0x016f
        L_0x0162:
            com.google.android.gms.internal.play_billing.zzfg r3 = zzd(r34)
            long r8 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r3.zzj(r13, r2)
            goto L_0x01a8
        L_0x016f:
            r5 = r5 | r9
            r11.putInt(r7, r3, r2)
            goto L_0x01a8
        L_0x0174:
            r14 = r3
            r13 = r19
            r3 = r30
            r6 = 2
            if (r2 != r6) goto L_0x01b1
            r5 = r5 | r9
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zza(r15, r1, r12)
            java.lang.Object r2 = r12.zzc
            r11.putObject(r7, r3, r2)
            goto L_0x01a8
        L_0x0187:
            r14 = r3
            r13 = r19
            r6 = 2
            if (r2 != r6) goto L_0x01b1
            r8 = r5 | r9
            java.lang.Object r9 = r0.zzx(r7, r14)
            com.google.android.gms.internal.play_billing.zzeo r2 = r0.zzv(r14)
            r6 = r1
            r1 = r9
            r3 = r35
            r4 = r6
            r5 = r37
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzm(r1, r2, r3, r4, r5, r6)
            r0.zzF(r7, r14, r9)
            r5 = r8
        L_0x01a8:
            r4 = r13
            r3 = r14
            r6 = r17
            r2 = r21
            r10 = 0
            goto L_0x03af
        L_0x01b1:
            r2 = r37
            r9 = r1
            r8 = r5
            r4 = r10
            r5 = r11
            r1 = r12
            r20 = r13
            r6 = r14
        L_0x01bb:
            r3 = r21
            goto L_0x02f7
        L_0x01bf:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r1 = 2
            if (r2 != r1) goto L_0x02e9
            r1 = r29 & r22
            if (r1 == 0) goto L_0x02c2
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r6, r12)
            int r2 = r12.zza
            if (r2 < 0) goto L_0x02bd
            r5 = r5 | r9
            if (r2 != 0) goto L_0x01e0
            r8 = r27
            r12.zzc = r8
            r29 = r5
            r10 = 0
            goto L_0x0296
        L_0x01e0:
            int r6 = com.google.android.gms.internal.play_billing.zzfu.zza
            int r6 = r15.length
            int r8 = r6 - r1
            r9 = r1 | r2
            int r8 = r8 - r2
            r8 = r8 | r9
            if (r8 < 0) goto L_0x0299
            int r6 = r1 + r2
            char[] r2 = new char[r2]
            r8 = 0
        L_0x01f0:
            if (r1 >= r6) goto L_0x0204
            byte r9 = r15[r1]
            boolean r16 = com.google.android.gms.internal.play_billing.zzfq.zzd(r9)
            if (r16 == 0) goto L_0x0204
            int r1 = r1 + 1
            int r16 = r8 + 1
            char r9 = (char) r9
            r2[r8] = r9
            r8 = r16
            goto L_0x01f0
        L_0x0204:
            if (r1 >= r6) goto L_0x028b
            int r9 = r1 + 1
            byte r1 = r15[r1]
            boolean r16 = com.google.android.gms.internal.play_billing.zzfq.zzd(r1)
            if (r16 == 0) goto L_0x022a
            int r16 = r8 + 1
            char r1 = (char) r1
            r2[r8] = r1
            r1 = r9
        L_0x0216:
            r8 = r16
            if (r1 >= r6) goto L_0x0204
            byte r9 = r15[r1]
            boolean r16 = com.google.android.gms.internal.play_billing.zzfq.zzd(r9)
            if (r16 == 0) goto L_0x0204
            int r1 = r1 + 1
            int r16 = r8 + 1
            char r9 = (char) r9
            r2[r8] = r9
            goto L_0x0216
        L_0x022a:
            r10 = -32
            if (r1 >= r10) goto L_0x0245
            if (r9 >= r6) goto L_0x0240
            int r10 = r8 + 1
            int r16 = r9 + 1
            byte r9 = r15[r9]
            com.google.android.gms.internal.play_billing.zzfq.zzc(r1, r9, r2, r8)
            r8 = r10
            r1 = r16
        L_0x023c:
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0204
        L_0x0240:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x0245:
            r10 = -16
            if (r1 >= r10) goto L_0x0265
            int r10 = r6 + -1
            if (r9 >= r10) goto L_0x0260
            int r10 = r8 + 1
            int r16 = r9 + 1
            byte r9 = r15[r9]
            int r22 = r16 + 1
            r29 = r5
            byte r5 = r15[r16]
            com.google.android.gms.internal.play_billing.zzfq.zzb(r1, r9, r5, r2, r8)
            r8 = r10
            r1 = r22
            goto L_0x0283
        L_0x0260:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x0265:
            r29 = r5
            int r5 = r6 + -2
            if (r9 >= r5) goto L_0x0286
            int r5 = r9 + 1
            byte r23 = r15[r9]
            int r9 = r5 + 1
            byte r24 = r15[r5]
            int r5 = r9 + 1
            byte r25 = r15[r9]
            r22 = r1
            r26 = r2
            r27 = r8
            com.google.android.gms.internal.play_billing.zzfq.zza(r22, r23, r24, r25, r26, r27)
            int r8 = r8 + 2
            r1 = r5
        L_0x0283:
            r5 = r29
            goto L_0x023c
        L_0x0286:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x028b:
            r29 = r5
            java.lang.String r1 = new java.lang.String
            r10 = 0
            r1.<init>(r2, r10, r8)
            r12.zzc = r1
            r1 = r6
        L_0x0296:
            r5 = r29
            goto L_0x02dd
        L_0x0299:
            r10 = 0
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4[r10] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r4[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 2
            r4[r2] = r1
            java.lang.String r1 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r3.<init>(r1)
            throw r3
        L_0x02bd:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x02c2:
            r8 = r27
            r10 = 0
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r6, r12)
            int r2 = r12.zza
            if (r2 < 0) goto L_0x02e4
            r5 = r5 | r9
            if (r2 != 0) goto L_0x02d3
            r12.zzc = r8
            goto L_0x02dd
        L_0x02d3:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.play_billing.zzda.zzb
            r6.<init>(r15, r1, r2, r8)
            r12.zzc = r6
            int r1 = r1 + r2
        L_0x02dd:
            java.lang.Object r2 = r12.zzc
            r11.putObject(r7, r3, r2)
            goto L_0x03a9
        L_0x02e4:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x02e9:
            r2 = r37
            r8 = r5
            r9 = r6
            r5 = r11
            r1 = r12
            r20 = r13
            r6 = r14
            r3 = r21
            r4 = 1048575(0xfffff, float:1.469367E-39)
        L_0x02f7:
            r18 = -1
            r19 = 0
            goto L_0x03c7
        L_0x02fd:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r10 = 0
            if (r2 != 0) goto L_0x03b5
            r5 = r5 | r9
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r6, r12)
            long r8 = r12.zzb
            int r2 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0313
            r8 = 1
            goto L_0x0314
        L_0x0313:
            r8 = r10
        L_0x0314:
            com.google.android.gms.internal.play_billing.zzfp.zzm(r7, r3, r8)
            goto L_0x03a9
        L_0x0319:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r1 = 5
            r10 = 0
            if (r2 != r1) goto L_0x03b5
            int r1 = r6 + 4
            r5 = r5 | r9
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r6)
            r11.putInt(r7, r3, r2)
            goto L_0x03a9
        L_0x032f:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r1 = 1
            r10 = 0
            if (r2 != r1) goto L_0x03b5
            int r8 = r6 + 8
            r9 = r9 | r5
            long r5 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r6)
            r1 = r11
            r2 = r34
            r1.putLong(r2, r3, r5)
            r1 = r8
            r5 = r9
            goto L_0x03a9
        L_0x034a:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r10 = 0
            if (r2 != 0) goto L_0x03b5
            r5 = r5 | r9
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r6, r12)
            int r2 = r12.zza
            r11.putInt(r7, r3, r2)
            goto L_0x03a9
        L_0x035e:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r10 = 0
            if (r2 != 0) goto L_0x03b5
            r8 = r5 | r9
            int r9 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r6, r12)
            long r5 = r12.zzb
            r1 = r11
            r2 = r34
            r1.putLong(r2, r3, r5)
            r5 = r8
            r1 = r9
            goto L_0x03a9
        L_0x0378:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r1 = 5
            r10 = 0
            if (r2 != r1) goto L_0x03b5
            int r1 = r6 + 4
            r5 = r5 | r9
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r6)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            com.google.android.gms.internal.play_billing.zzfp.zzp(r7, r3, r2)
            goto L_0x03a9
        L_0x0391:
            r6 = r1
            r14 = r3
            r13 = r19
            r3 = r30
            r1 = 1
            r10 = 0
            if (r2 != r1) goto L_0x03b5
            int r1 = r6 + 8
            r5 = r5 | r9
            long r8 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r6)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            com.google.android.gms.internal.play_billing.zzfp.zzo(r7, r3, r8)
        L_0x03a9:
            r4 = r13
            r3 = r14
            r6 = r17
            r2 = r21
        L_0x03af:
            r14 = r37
        L_0x03b1:
            r13 = r38
            goto L_0x001b
        L_0x03b5:
            r2 = r37
            r8 = r5
            r9 = r6
            r19 = r10
            r5 = r11
            r1 = r12
            r20 = r13
            r6 = r14
            r3 = r21
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r18 = -1
        L_0x03c7:
            r29 = r5
            r10 = r6
            r21 = r8
            r6 = r15
            r4 = r20
            r8 = r38
            r5 = r1
            r1 = r3
            r3 = r9
            goto L_0x0c87
        L_0x03d6:
            r17 = r6
            r29 = r10
            r20 = r19
            r8 = r27
            r18 = -1
            r19 = 0
            r6 = r3
            r3 = r21
            r21 = r5
            r5 = r11
            r10 = r13
            r14 = r37
            r13 = r1
            r1 = r12
            r12 = 27
            r27 = 10
            if (r4 != r12) goto L_0x0448
            r12 = 2
            if (r2 != r12) goto L_0x043c
            java.lang.Object r2 = r5.getObject(r7, r10)
            com.google.android.gms.internal.play_billing.zzcz r2 = (com.google.android.gms.internal.play_billing.zzcz) r2
            boolean r4 = r2.zzc()
            if (r4 != 0) goto L_0x0414
            int r4 = r2.size()
            if (r4 != 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            int r27 = r4 + r4
        L_0x040b:
            r4 = r27
            com.google.android.gms.internal.play_billing.zzcz r2 = r2.zzd(r4)
            r5.putObject(r7, r10, r2)
        L_0x0414:
            com.google.android.gms.internal.play_billing.zzeo r8 = r0.zzv(r6)
            r9 = r20
            r10 = r35
            r11 = r13
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r37
            r13 = r2
            r2 = r14
            r14 = r39
            int r8 = com.google.android.gms.internal.play_billing.zzbd.zze(r8, r9, r10, r11, r12, r13, r14)
            r13 = r38
            r12 = r1
            r14 = r2
            r2 = r3
            r11 = r5
            r3 = r6
            r1 = r8
            r6 = r17
            r10 = r19
            r4 = r20
            r5 = r21
            goto L_0x001b
        L_0x043c:
            r29 = r5
            r5 = r20
            r32 = r13
            r13 = r1
            r1 = r6
            r6 = r32
            goto L_0x0a0d
        L_0x0448:
            r12 = 49
            if (r4 > r12) goto L_0x09d4
            r30 = r6
            r12 = r29
            r29 = r5
            long r5 = (long) r12
            sun.misc.Unsafe r9 = zzb
            java.lang.Object r12 = r9.getObject(r7, r10)
            com.google.android.gms.internal.play_billing.zzcz r12 = (com.google.android.gms.internal.play_billing.zzcz) r12
            boolean r22 = r12.zzc()
            if (r22 != 0) goto L_0x0477
            int r22 = r12.size()
            if (r22 != 0) goto L_0x0468
            goto L_0x046a
        L_0x0468:
            int r27 = r22 + r22
        L_0x046a:
            r31 = r3
            r3 = r27
            com.google.android.gms.internal.play_billing.zzcz r3 = r12.zzd(r3)
            r9.putObject(r7, r10, r3)
            r12 = r3
            goto L_0x0479
        L_0x0477:
            r31 = r3
        L_0x0479:
            switch(r4) {
                case 18: goto L_0x0940;
                case 19: goto L_0x08e7;
                case 20: goto L_0x089b;
                case 21: goto L_0x089b;
                case 22: goto L_0x0870;
                case 23: goto L_0x0824;
                case 24: goto L_0x07d7;
                case 25: goto L_0x0773;
                case 26: goto L_0x06b3;
                case 27: goto L_0x0675;
                case 28: goto L_0x0610;
                case 29: goto L_0x0870;
                case 30: goto L_0x055f;
                case 31: goto L_0x07d7;
                case 32: goto L_0x0824;
                case 33: goto L_0x0504;
                case 34: goto L_0x04a7;
                case 35: goto L_0x0940;
                case 36: goto L_0x08e7;
                case 37: goto L_0x089b;
                case 38: goto L_0x089b;
                case 39: goto L_0x0870;
                case 40: goto L_0x0824;
                case 41: goto L_0x07d7;
                case 42: goto L_0x0773;
                case 43: goto L_0x0870;
                case 44: goto L_0x055f;
                case 45: goto L_0x07d7;
                case 46: goto L_0x0824;
                case 47: goto L_0x0504;
                case 48: goto L_0x04a7;
                default: goto L_0x047c;
            }
        L_0x047c:
            r7 = r13
            r9 = r20
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            r1 = 3
            if (r2 != r1) goto L_0x09b6
            r1 = r9 & -8
            r20 = r1 | 4
            com.google.android.gms.internal.play_billing.zzeo r22 = r0.zzv(r10)
            r1 = r22
            r2 = r35
            r3 = r7
            r4 = r37
            r5 = r20
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzc(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r13.zzc
            r12.add(r2)
            goto L_0x0998
        L_0x04a7:
            r3 = 2
            if (r2 != r3) goto L_0x04cf
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r13, r1)
            int r3 = r1.zza
            int r3 = r3 + r2
        L_0x04b3:
            if (r2 >= r3) goto L_0x04c3
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r2, r1)
            long r4 = r1.zzb
            long r4 = com.google.android.gms.internal.play_billing.zzbu.zzc(r4)
            r12.zzf(r4)
            goto L_0x04b3
        L_0x04c3:
            if (r2 != r3) goto L_0x04ca
            r7 = r13
            r9 = r20
            goto L_0x0555
        L_0x04ca:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x04cf:
            if (r2 != 0) goto L_0x04ff
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r13, r1)
            long r3 = r1.zzb
            long r3 = com.google.android.gms.internal.play_billing.zzbu.zzc(r3)
            r12.zzf(r3)
        L_0x04e0:
            if (r2 >= r14) goto L_0x04fc
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r1)
            int r4 = r1.zza
            r11 = r20
            if (r11 != r4) goto L_0x0553
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r3, r1)
            long r3 = r1.zzb
            long r3 = com.google.android.gms.internal.play_billing.zzbu.zzc(r3)
            r12.zzf(r3)
            r20 = r11
            goto L_0x04e0
        L_0x04fc:
            r11 = r20
            goto L_0x0553
        L_0x04ff:
            r7 = r13
            r9 = r20
            goto L_0x0607
        L_0x0504:
            r11 = r20
            r3 = 2
            if (r2 != r3) goto L_0x052a
            com.google.android.gms.internal.play_billing.zzct r12 = (com.google.android.gms.internal.play_billing.zzct) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r13, r1)
            int r3 = r1.zza
            int r3 = r3 + r2
        L_0x0512:
            if (r2 >= r3) goto L_0x0522
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r1)
            int r4 = r1.zza
            int r4 = com.google.android.gms.internal.play_billing.zzbu.zzb(r4)
            r12.zzg(r4)
            goto L_0x0512
        L_0x0522:
            if (r2 != r3) goto L_0x0525
            goto L_0x0553
        L_0x0525:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x052a:
            if (r2 != 0) goto L_0x0605
            com.google.android.gms.internal.play_billing.zzct r12 = (com.google.android.gms.internal.play_billing.zzct) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r13, r1)
            int r3 = r1.zza
            int r3 = com.google.android.gms.internal.play_billing.zzbu.zzb(r3)
            r12.zzg(r3)
        L_0x053b:
            if (r2 >= r14) goto L_0x0553
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r1)
            int r4 = r1.zza
            if (r11 != r4) goto L_0x0553
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r3, r1)
            int r3 = r1.zza
            int r3 = com.google.android.gms.internal.play_billing.zzbu.zzb(r3)
            r12.zzg(r3)
            goto L_0x053b
        L_0x0553:
            r9 = r11
            r7 = r13
        L_0x0555:
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            r1 = r2
            goto L_0x09b7
        L_0x055f:
            r11 = r20
            r3 = 2
            if (r2 != r3) goto L_0x056e
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzf(r15, r13, r12, r1)
            r10 = r1
            r8 = r30
            r9 = r31
            goto L_0x0584
        L_0x056e:
            if (r2 != 0) goto L_0x0603
            r10 = r1
            r1 = r11
            r2 = r35
            r9 = r31
            r3 = r13
            r4 = r37
            r8 = r29
            r5 = r12
            r8 = r30
            r6 = r39
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzj(r1, r2, r3, r4, r5, r6)
        L_0x0584:
            com.google.android.gms.internal.play_billing.zzcw r1 = r0.zzu(r8)
            com.google.android.gms.internal.play_billing.zzff r3 = r0.zzm
            int r4 = com.google.android.gms.internal.play_billing.zzeq.zza
            if (r1 == 0) goto L_0x05f4
            boolean r4 = r12 instanceof java.util.RandomAccess
            if (r4 == 0) goto L_0x05ce
            int r4 = r12.size()
            r36 = r2
            r2 = r16
            r5 = r19
            r6 = r5
        L_0x059d:
            if (r5 >= r4) goto L_0x05c4
            java.lang.Object r20 = r12.get(r5)
            java.lang.Integer r20 = (java.lang.Integer) r20
            int r0 = r20.intValue()
            boolean r20 = r1.zza(r0)
            if (r20 == 0) goto L_0x05bb
            if (r5 == r6) goto L_0x05b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.set(r6, r0)
        L_0x05b8:
            int r6 = r6 + 1
            goto L_0x05bf
        L_0x05bb:
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzeq.zzo(r7, r9, r0, r2, r3)
        L_0x05bf:
            int r5 = r5 + 1
            r0 = r33
            goto L_0x059d
        L_0x05c4:
            if (r6 == r4) goto L_0x05f6
            java.util.List r0 = r12.subList(r6, r4)
            r0.clear()
            goto L_0x05f6
        L_0x05ce:
            r36 = r2
            java.util.Iterator r0 = r12.iterator()
            r2 = r16
        L_0x05d6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x05f6
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r5 = r1.zza(r4)
            if (r5 != 0) goto L_0x05d6
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzeq.zzo(r7, r9, r4, r2, r3)
            r0.remove()
            goto L_0x05d6
        L_0x05f4:
            r36 = r2
        L_0x05f6:
            r0 = r33
            r1 = r36
            r7 = r13
        L_0x05fb:
            r13 = r10
            r10 = r8
            r8 = r9
            r9 = r11
            r11 = r29
            goto L_0x09b7
        L_0x0603:
            r0 = r33
        L_0x0605:
            r9 = r11
            r7 = r13
        L_0x0607:
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            goto L_0x09b6
        L_0x0610:
            r10 = r1
            r11 = r20
            r8 = r30
            r9 = r31
            r0 = 2
            if (r2 != r0) goto L_0x06a8
            int r0 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r13, r10)
            int r1 = r10.zza
            if (r1 < 0) goto L_0x0670
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x066b
            if (r1 != 0) goto L_0x062e
            com.google.android.gms.internal.play_billing.zzbq r1 = com.google.android.gms.internal.play_billing.zzbq.zzb
            r12.add(r1)
            goto L_0x0636
        L_0x062e:
            com.google.android.gms.internal.play_billing.zzbq r2 = com.google.android.gms.internal.play_billing.zzbq.zzl(r15, r0, r1)
            r12.add(r2)
        L_0x0635:
            int r0 = r0 + r1
        L_0x0636:
            if (r0 >= r14) goto L_0x0666
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r0, r10)
            int r2 = r10.zza
            if (r11 != r2) goto L_0x0666
            int r0 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r10)
            int r1 = r10.zza
            if (r1 < 0) goto L_0x0661
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x065c
            if (r1 != 0) goto L_0x0654
            com.google.android.gms.internal.play_billing.zzbq r1 = com.google.android.gms.internal.play_billing.zzbq.zzb
            r12.add(r1)
            goto L_0x0636
        L_0x0654:
            com.google.android.gms.internal.play_billing.zzbq r2 = com.google.android.gms.internal.play_billing.zzbq.zzl(r15, r0, r1)
            r12.add(r2)
            goto L_0x0635
        L_0x065c:
            com.google.android.gms.internal.play_billing.zzdc r0 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r0
        L_0x0661:
            com.google.android.gms.internal.play_billing.zzdc r0 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r0
        L_0x0666:
            r1 = r0
            r7 = r13
            r0 = r33
            goto L_0x05fb
        L_0x066b:
            com.google.android.gms.internal.play_billing.zzdc r0 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r0
        L_0x0670:
            com.google.android.gms.internal.play_billing.zzdc r0 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r0
        L_0x0675:
            r10 = r1
            r11 = r20
            r8 = r30
            r9 = r31
            r0 = 2
            if (r2 != r0) goto L_0x06a8
            r0 = r33
            com.google.android.gms.internal.play_billing.zzeo r1 = r0.zzv(r8)
            r3 = r8
            r4 = r29
            r8 = r1
            r1 = r9
            r9 = r11
            r2 = r10
            r10 = r35
            r5 = r11
            r11 = r13
            r6 = r12
            r12 = r37
            r7 = r13
            r13 = r6
            r6 = r14
            r14 = r39
            int r8 = com.google.android.gms.internal.play_billing.zzbd.zze(r8, r9, r10, r11, r12, r13, r14)
            r13 = r2
            r10 = r3
            r11 = r4
            r9 = r5
            r14 = r6
            r32 = r8
            r8 = r1
            r1 = r32
            goto L_0x09b7
        L_0x06a8:
            r0 = r33
            r7 = r13
            r13 = r10
            r10 = r8
            r8 = r9
            r9 = r11
            r11 = r29
            goto L_0x09b6
        L_0x06b3:
            r7 = r13
            r9 = r20
            r4 = r29
            r3 = r30
            r10 = 2
            r13 = r1
            r1 = r31
            if (r2 != r10) goto L_0x076e
            r10 = 536870912(0x20000000, double:2.652494739E-315)
            long r5 = r5 & r10
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x070e
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r5 = r13.zza
            if (r5 < 0) goto L_0x0709
            if (r5 != 0) goto L_0x06d6
            r12.add(r8)
            goto L_0x06e1
        L_0x06d6:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.play_billing.zzda.zzb
            r6.<init>(r15, r2, r5, r10)
            r12.add(r6)
        L_0x06e0:
            int r2 = r2 + r5
        L_0x06e1:
            if (r2 >= r14) goto L_0x0881
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r13)
            int r6 = r13.zza
            if (r9 != r6) goto L_0x0881
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r5, r13)
            int r5 = r13.zza
            if (r5 < 0) goto L_0x0704
            if (r5 != 0) goto L_0x06f9
            r12.add(r8)
            goto L_0x06e1
        L_0x06f9:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.play_billing.zzda.zzb
            r6.<init>(r15, r2, r5, r10)
            r12.add(r6)
            goto L_0x06e0
        L_0x0704:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x0709:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x070e:
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r5 = r13.zza
            if (r5 < 0) goto L_0x0769
            if (r5 != 0) goto L_0x071c
            r12.add(r8)
            goto L_0x072f
        L_0x071c:
            int r6 = r2 + r5
            boolean r10 = com.google.android.gms.internal.play_billing.zzfu.zze(r15, r2, r6)
            if (r10 == 0) goto L_0x0764
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.play_billing.zzda.zzb
            r10.<init>(r15, r2, r5, r11)
            r12.add(r10)
        L_0x072e:
            r2 = r6
        L_0x072f:
            if (r2 >= r14) goto L_0x0881
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r13)
            int r6 = r13.zza
            if (r9 != r6) goto L_0x0881
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r5, r13)
            int r5 = r13.zza
            if (r5 < 0) goto L_0x075f
            if (r5 != 0) goto L_0x0747
            r12.add(r8)
            goto L_0x072f
        L_0x0747:
            int r6 = r2 + r5
            boolean r10 = com.google.android.gms.internal.play_billing.zzfu.zze(r15, r2, r6)
            if (r10 == 0) goto L_0x075a
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.play_billing.zzda.zzb
            r10.<init>(r15, r2, r5, r11)
            r12.add(r10)
            goto L_0x072e
        L_0x075a:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x075f:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x0764:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x0769:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzd()
            throw r1
        L_0x076e:
            r8 = r1
            r10 = r3
            r11 = r4
            goto L_0x09b6
        L_0x0773:
            r7 = r13
            r9 = r20
            r4 = r29
            r3 = r30
            r5 = 2
            r13 = r1
            r1 = r31
            if (r2 != r5) goto L_0x07a6
            com.google.android.gms.internal.play_billing.zzbe r12 = (com.google.android.gms.internal.play_billing.zzbe) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r5 = r13.zza
            int r5 = r5 + r2
        L_0x0789:
            if (r2 >= r5) goto L_0x079d
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r2, r13)
            long r10 = r13.zzb
            int r6 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r6 == 0) goto L_0x0797
            r10 = 1
            goto L_0x0799
        L_0x0797:
            r10 = r19
        L_0x0799:
            r12.zze(r10)
            goto L_0x0789
        L_0x079d:
            if (r2 != r5) goto L_0x07a1
            goto L_0x0881
        L_0x07a1:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x07a6:
            if (r2 != 0) goto L_0x076e
            com.google.android.gms.internal.play_billing.zzbe r12 = (com.google.android.gms.internal.play_billing.zzbe) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r7, r13)
            long r5 = r13.zzb
            int r5 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x07b6
            r10 = 1
            goto L_0x07b8
        L_0x07b6:
            r10 = r19
        L_0x07b8:
            r12.zze(r10)
        L_0x07bb:
            if (r2 >= r14) goto L_0x0881
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r13)
            int r6 = r13.zza
            if (r9 != r6) goto L_0x0881
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r5, r13)
            long r5 = r13.zzb
            int r5 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x07d1
            r10 = 1
            goto L_0x07d3
        L_0x07d1:
            r10 = r19
        L_0x07d3:
            r12.zze(r10)
            goto L_0x07bb
        L_0x07d7:
            r7 = r13
            r9 = r20
            r4 = r29
            r3 = r30
            r5 = 2
            r13 = r1
            r1 = r31
            if (r2 != r5) goto L_0x0802
            com.google.android.gms.internal.play_billing.zzct r12 = (com.google.android.gms.internal.play_billing.zzct) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r5 = r13.zza
            int r5 = r5 + r2
        L_0x07ed:
            if (r2 >= r5) goto L_0x07f9
            int r6 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r2)
            r12.zzg(r6)
            int r2 = r2 + 4
            goto L_0x07ed
        L_0x07f9:
            if (r2 != r5) goto L_0x07fd
            goto L_0x0881
        L_0x07fd:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x0802:
            r5 = 5
            if (r2 != r5) goto L_0x076e
            int r2 = r7 + 4
            com.google.android.gms.internal.play_billing.zzct r12 = (com.google.android.gms.internal.play_billing.zzct) r12
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r7)
            r12.zzg(r5)
        L_0x0810:
            if (r2 >= r14) goto L_0x0881
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r13)
            int r6 = r13.zza
            if (r9 != r6) goto L_0x0881
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r5)
            r12.zzg(r2)
            int r2 = r5 + 4
            goto L_0x0810
        L_0x0824:
            r7 = r13
            r9 = r20
            r4 = r29
            r3 = r30
            r5 = 2
            r13 = r1
            r1 = r31
            if (r2 != r5) goto L_0x084e
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r5 = r13.zza
            int r5 = r5 + r2
        L_0x083a:
            if (r2 >= r5) goto L_0x0846
            long r10 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r2)
            r12.zzf(r10)
            int r2 = r2 + 8
            goto L_0x083a
        L_0x0846:
            if (r2 != r5) goto L_0x0849
            goto L_0x0881
        L_0x0849:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x084e:
            r5 = 1
            if (r2 != r5) goto L_0x076e
            int r2 = r7 + 8
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            long r5 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r7)
            r12.zzf(r5)
        L_0x085c:
            if (r2 >= r14) goto L_0x0881
            int r5 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r2, r13)
            int r6 = r13.zza
            if (r9 != r6) goto L_0x0881
            long r10 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r5)
            r12.zzf(r10)
            int r2 = r5 + 8
            goto L_0x085c
        L_0x0870:
            r7 = r13
            r9 = r20
            r4 = r29
            r3 = r30
            r5 = 2
            r13 = r1
            r1 = r31
            if (r2 != r5) goto L_0x0887
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzf(r15, r7, r12, r13)
        L_0x0881:
            r8 = r1
            r1 = r2
            r10 = r3
            r11 = r4
            goto L_0x09b7
        L_0x0887:
            if (r2 != 0) goto L_0x076e
            r8 = r1
            r1 = r9
            r2 = r35
            r10 = r3
            r3 = r7
            r11 = r4
            r4 = r37
            r5 = r12
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzj(r1, r2, r3, r4, r5, r6)
            goto L_0x09b7
        L_0x089b:
            r7 = r13
            r9 = r20
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L_0x08c6
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r2 = r13.zza
            int r2 = r2 + r1
        L_0x08b1:
            if (r1 >= r2) goto L_0x08bd
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r1, r13)
            long r3 = r13.zzb
            r12.zzf(r3)
            goto L_0x08b1
        L_0x08bd:
            if (r1 != r2) goto L_0x08c1
            goto L_0x09b7
        L_0x08c1:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x08c6:
            if (r2 != 0) goto L_0x09b6
            com.google.android.gms.internal.play_billing.zzdr r12 = (com.google.android.gms.internal.play_billing.zzdr) r12
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r7, r13)
            long r2 = r13.zzb
            r12.zzf(r2)
        L_0x08d3:
            if (r1 >= r14) goto L_0x09b7
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r13)
            int r3 = r13.zza
            if (r9 != r3) goto L_0x09b7
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzk(r15, r2, r13)
            long r2 = r13.zzb
            r12.zzf(r2)
            goto L_0x08d3
        L_0x08e7:
            r7 = r13
            r9 = r20
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L_0x0916
            com.google.android.gms.internal.play_billing.zzck r12 = (com.google.android.gms.internal.play_billing.zzck) r12
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r2 = r13.zza
            int r2 = r2 + r1
        L_0x08fd:
            if (r1 >= r2) goto L_0x090d
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r1)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r12.zzf(r3)
            int r1 = r1 + 4
            goto L_0x08fd
        L_0x090d:
            if (r1 != r2) goto L_0x0911
            goto L_0x09b7
        L_0x0911:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x0916:
            r1 = 5
            if (r2 != r1) goto L_0x09b6
            int r1 = r7 + 4
            com.google.android.gms.internal.play_billing.zzck r12 = (com.google.android.gms.internal.play_billing.zzck) r12
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r7)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r12.zzf(r2)
        L_0x0928:
            if (r1 >= r14) goto L_0x09b7
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r13)
            int r3 = r13.zza
            if (r9 != r3) goto L_0x09b7
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzb(r15, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zzf(r1)
            int r1 = r2 + 4
            goto L_0x0928
        L_0x0940:
            r7 = r13
            r9 = r20
            r11 = r29
            r10 = r30
            r8 = r31
            r13 = r1
            r1 = 2
            if (r2 != r1) goto L_0x096e
            com.google.android.gms.internal.play_billing.zzca r12 = (com.google.android.gms.internal.play_billing.zzca) r12
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r7, r13)
            int r2 = r13.zza
            int r2 = r2 + r1
        L_0x0956:
            if (r1 >= r2) goto L_0x0966
            long r3 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r1)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r12.zzf(r3)
            int r1 = r1 + 8
            goto L_0x0956
        L_0x0966:
            if (r1 != r2) goto L_0x0969
            goto L_0x09b7
        L_0x0969:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzg()
            throw r1
        L_0x096e:
            r1 = 1
            if (r2 != r1) goto L_0x09b6
            int r1 = r7 + 8
            com.google.android.gms.internal.play_billing.zzca r12 = (com.google.android.gms.internal.play_billing.zzca) r12
            long r2 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r7)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r12.zzf(r2)
        L_0x0980:
            if (r1 >= r14) goto L_0x09b7
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r13)
            int r3 = r13.zza
            if (r9 != r3) goto L_0x09b7
            long r3 = com.google.android.gms.internal.play_billing.zzbd.zzn(r15, r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r12.zzf(r3)
            int r1 = r2 + 8
            goto L_0x0980
        L_0x0998:
            if (r1 >= r14) goto L_0x09b7
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzh(r15, r1, r13)
            int r2 = r13.zza
            if (r9 != r2) goto L_0x09b7
            r1 = r22
            r2 = r35
            r4 = r37
            r5 = r20
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzc(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r13.zzc
            r12.add(r2)
            goto L_0x0998
        L_0x09b6:
            r1 = r7
        L_0x09b7:
            if (r1 == r7) goto L_0x09c7
            r7 = r34
            r2 = r8
            r4 = r9
            r3 = r10
            r12 = r13
            r6 = r17
            r10 = r19
            r5 = r21
            goto L_0x03b1
        L_0x09c7:
            r7 = r34
            r3 = r1
            r1 = r8
            r4 = r9
            r29 = r11
            r5 = r13
            r6 = r15
            r8 = r38
            goto L_0x0c87
        L_0x09d4:
            r7 = r13
            r12 = r29
            r13 = r1
            r29 = r5
            r1 = r6
            r5 = r20
            r6 = 50
            if (r4 != r6) goto L_0x0a16
            r6 = 2
            if (r2 != r6) goto L_0x0a0a
            sun.misc.Unsafe r2 = zzb
            java.lang.Object r1 = r0.zzw(r1)
            r7 = r34
            java.lang.Object r3 = r2.getObject(r7, r10)
            r4 = r3
            com.google.android.gms.internal.play_billing.zzdw r4 = (com.google.android.gms.internal.play_billing.zzdw) r4
            boolean r4 = r4.zze()
            if (r4 != 0) goto L_0x0a07
            com.google.android.gms.internal.play_billing.zzdw r4 = com.google.android.gms.internal.play_billing.zzdw.zza()
            com.google.android.gms.internal.play_billing.zzdw r4 = r4.zzb()
            com.google.android.gms.internal.play_billing.zzdx.zza(r4, r3)
            r2.putObject(r7, r10, r4)
        L_0x0a07:
            com.google.android.gms.internal.play_billing.zzdv r1 = (com.google.android.gms.internal.play_billing.zzdv) r1
            throw r16
        L_0x0a0a:
            r6 = r7
            r7 = r34
        L_0x0a0d:
            r8 = r38
            r10 = r1
            r1 = r3
            r4 = r5
            r3 = r6
            r5 = r13
            goto L_0x0067
        L_0x0a16:
            r6 = r7
            r7 = r34
            int r20 = r1 + 2
            sun.misc.Unsafe r13 = zzb
            r9 = r9[r20]
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r15
            long r14 = (long) r9
            switch(r4) {
                case 51: goto L_0x0c47;
                case 52: goto L_0x0c26;
                case 53: goto L_0x0c06;
                case 54: goto L_0x0c06;
                case 55: goto L_0x0be9;
                case 56: goto L_0x0bcb;
                case 57: goto L_0x0bad;
                case 58: goto L_0x0b81;
                case 59: goto L_0x0b43;
                case 60: goto L_0x0b07;
                case 61: goto L_0x0ae1;
                case 62: goto L_0x0be9;
                case 63: goto L_0x0aaa;
                case 64: goto L_0x0bad;
                case 65: goto L_0x0bcb;
                case 66: goto L_0x0a8d;
                case 67: goto L_0x0a60;
                case 68: goto L_0x0a32;
                default: goto L_0x0a27;
            }
        L_0x0a27:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r6 = r35
            r5 = r39
            goto L_0x0c68
        L_0x0a32:
            r4 = 3
            if (r2 != r4) goto L_0x0a5d
            r2 = r5 & -8
            r13 = r2 | 4
            java.lang.Object r2 = r0.zzy(r7, r3, r1)
            com.google.android.gms.internal.play_billing.zzeo r9 = r0.zzv(r1)
            r8 = r2
            r10 = r35
            r11 = r6
            r12 = r37
            r4 = r39
            r15 = r37
            r14 = r39
            int r8 = com.google.android.gms.internal.play_billing.zzbd.zzl(r8, r9, r10, r11, r12, r13, r14)
            r0.zzG(r7, r3, r1, r2)
            r20 = r1
            r1 = r3
            r9 = r6
            r2 = r8
            r6 = r35
            goto L_0x0afb
        L_0x0a5d:
            r15 = r37
            goto L_0x0a27
        L_0x0a60:
            r9 = r37
            r4 = r39
            if (r2 != 0) goto L_0x0a85
            r8 = r35
            r12 = 1048575(0xfffff, float:1.469367E-39)
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r8, r6, r4)
            r36 = r13
            long r12 = r4.zzb
            long r12 = com.google.android.gms.internal.play_billing.zzbu.zzc(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = r36
            r13.putObject(r7, r10, r12)
            r13.putInt(r7, r14, r3)
            goto L_0x0af6
        L_0x0a85:
            r20 = r1
            r1 = r3
            r9 = r6
            r6 = r35
            goto L_0x0b3c
        L_0x0a8d:
            r8 = r35
            r9 = r37
            r4 = r39
            if (r2 != 0) goto L_0x0b02
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r8, r6, r4)
            int r12 = r4.zza
            int r12 = com.google.android.gms.internal.play_billing.zzbu.zzb(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.putObject(r7, r10, r12)
            r13.putInt(r7, r14, r3)
            goto L_0x0af6
        L_0x0aaa:
            r8 = r35
            r9 = r37
            r4 = r39
            if (r2 != 0) goto L_0x0b02
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r8, r6, r4)
            int r12 = r4.zza
            r36 = r2
            com.google.android.gms.internal.play_billing.zzcw r2 = r0.zzu(r1)
            if (r2 == 0) goto L_0x0ad4
            boolean r2 = r2.zza(r12)
            if (r2 == 0) goto L_0x0ac7
            goto L_0x0ad4
        L_0x0ac7:
            com.google.android.gms.internal.play_billing.zzfg r2 = zzd(r34)
            long r10 = (long) r12
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.zzj(r5, r10)
            goto L_0x0ade
        L_0x0ad4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r13.putObject(r7, r10, r2)
            r13.putInt(r7, r14, r3)
        L_0x0ade:
            r2 = r36
            goto L_0x0af6
        L_0x0ae1:
            r8 = r35
            r9 = r37
            r4 = r39
            r12 = 2
            if (r2 != r12) goto L_0x0b02
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zza(r8, r6, r4)
            java.lang.Object r12 = r4.zzc
            r13.putObject(r7, r10, r12)
            r13.putInt(r7, r14, r3)
        L_0x0af6:
            r20 = r1
            r1 = r3
            r9 = r6
            r6 = r8
        L_0x0afb:
            r32 = r5
            r5 = r4
            r4 = r32
            goto L_0x0c69
        L_0x0b02:
            r20 = r1
            r1 = r3
            r9 = r6
            goto L_0x0b3b
        L_0x0b07:
            r8 = r35
            r9 = r37
            r4 = r39
            r12 = 2
            if (r2 != r12) goto L_0x0b37
            java.lang.Object r10 = r0.zzy(r7, r3, r1)
            com.google.android.gms.internal.play_billing.zzeo r2 = r0.zzv(r1)
            r11 = r1
            r1 = r10
            r12 = r3
            r3 = r35
            r13 = r4
            r4 = r6
            r14 = r5
            r5 = r37
            r9 = r6
            r15 = r29
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzm(r1, r2, r3, r4, r5, r6)
            r0.zzG(r7, r12, r11, r10)
            r2 = r1
            r6 = r8
            r20 = r11
            r1 = r12
            r5 = r13
            r4 = r14
            goto L_0x0c69
        L_0x0b37:
            r9 = r6
            r20 = r1
            r1 = r3
        L_0x0b3b:
            r6 = r8
        L_0x0b3c:
            r32 = r5
            r5 = r4
            r4 = r32
            goto L_0x0c68
        L_0x0b43:
            r20 = r1
            r1 = r3
            r3 = r5
            r9 = r6
            r4 = 2
            r6 = r35
            r5 = r39
            if (r2 != r4) goto L_0x0baa
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r6, r9, r5)
            int r4 = r5.zza
            if (r4 != 0) goto L_0x0b5b
            r13.putObject(r7, r10, r8)
            goto L_0x0b7b
        L_0x0b5b:
            r8 = r12 & r22
            int r12 = r2 + r4
            if (r8 == 0) goto L_0x0b6d
            boolean r8 = com.google.android.gms.internal.play_billing.zzfu.zze(r6, r2, r12)
            if (r8 == 0) goto L_0x0b68
            goto L_0x0b6d
        L_0x0b68:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zzc()
            throw r1
        L_0x0b6d:
            java.lang.String r8 = new java.lang.String
            r36 = r12
            java.nio.charset.Charset r12 = com.google.android.gms.internal.play_billing.zzda.zzb
            r8.<init>(r6, r2, r4, r12)
            r13.putObject(r7, r10, r8)
            r2 = r36
        L_0x0b7b:
            r13.putInt(r7, r14, r1)
            r4 = r3
            goto L_0x0c69
        L_0x0b81:
            r20 = r1
            r1 = r3
            r3 = r5
            r9 = r6
            r6 = r35
            r5 = r39
            if (r2 != 0) goto L_0x0baa
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r6, r9, r5)
            r36 = r2
            r4 = r3
            long r2 = r5.zzb
            int r2 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0b9c
            r28 = 1
            goto L_0x0b9e
        L_0x0b9c:
            r28 = r19
        L_0x0b9e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r28)
            r13.putObject(r7, r10, r2)
            r13.putInt(r7, r14, r1)
            goto L_0x0c23
        L_0x0baa:
            r4 = r3
            goto L_0x0c68
        L_0x0bad:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r3 = 5
            r6 = r35
            r5 = r39
            if (r2 != r3) goto L_0x0c68
            int r2 = r9 + 4
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzb(r6, r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.putObject(r7, r10, r3)
            r13.putInt(r7, r14, r1)
            goto L_0x0c69
        L_0x0bcb:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r3 = 1
            r6 = r35
            r5 = r39
            if (r2 != r3) goto L_0x0c68
            int r2 = r9 + 8
            long r22 = com.google.android.gms.internal.play_billing.zzbd.zzn(r6, r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            r13.putObject(r7, r10, r3)
            r13.putInt(r7, r14, r1)
            goto L_0x0c69
        L_0x0be9:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r6 = r35
            r5 = r39
            if (r2 != 0) goto L_0x0c68
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzh(r6, r9, r5)
            int r3 = r5.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.putObject(r7, r10, r3)
            r13.putInt(r7, r14, r1)
            goto L_0x0c69
        L_0x0c06:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r6 = r35
            r5 = r39
            if (r2 != 0) goto L_0x0c68
            int r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r6, r9, r5)
            r36 = r2
            long r2 = r5.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r13.putObject(r7, r10, r2)
            r13.putInt(r7, r14, r1)
        L_0x0c23:
            r2 = r36
            goto L_0x0c69
        L_0x0c26:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r3 = 5
            r6 = r35
            r5 = r39
            if (r2 != r3) goto L_0x0c68
            int r2 = r9 + 4
            int r3 = com.google.android.gms.internal.play_billing.zzbd.zzb(r6, r9)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r13.putObject(r7, r10, r3)
            r13.putInt(r7, r14, r1)
            goto L_0x0c69
        L_0x0c47:
            r20 = r1
            r1 = r3
            r4 = r5
            r9 = r6
            r3 = 1
            r6 = r35
            r5 = r39
            if (r2 != r3) goto L_0x0c68
            int r2 = r9 + 8
            long r22 = com.google.android.gms.internal.play_billing.zzbd.zzn(r6, r9)
            double r22 = java.lang.Double.longBitsToDouble(r22)
            java.lang.Double r3 = java.lang.Double.valueOf(r22)
            r13.putObject(r7, r10, r3)
            r13.putInt(r7, r14, r1)
            goto L_0x0c69
        L_0x0c68:
            r2 = r9
        L_0x0c69:
            if (r2 == r9) goto L_0x0c82
            r14 = r37
            r13 = r38
            r12 = r5
            r15 = r6
            r6 = r17
            r10 = r19
            r3 = r20
            r5 = r21
            r11 = r29
            r32 = r2
            r2 = r1
            r1 = r32
            goto L_0x001b
        L_0x0c82:
            r8 = r38
            r3 = r2
            r10 = r20
        L_0x0c87:
            if (r4 != r8) goto L_0x0c94
            if (r8 == 0) goto L_0x0c94
            r1 = r3
            r6 = r17
            r5 = r21
            r13 = r29
            goto L_0x0ced
        L_0x0c94:
            boolean r2 = r0.zzh
            if (r2 == 0) goto L_0x0cc1
            com.google.android.gms.internal.play_billing.zzcd r2 = r5.zzd
            com.google.android.gms.internal.play_billing.zzcd r9 = com.google.android.gms.internal.play_billing.zzcd.zza
            if (r2 == r9) goto L_0x0cc1
            com.google.android.gms.internal.play_billing.zzec r2 = r0.zzg
            com.google.android.gms.internal.play_billing.zzcd r9 = r5.zzd
            com.google.android.gms.internal.play_billing.zzcq r2 = r9.zzb(r2, r1)
            if (r2 != 0) goto L_0x0cbd
            com.google.android.gms.internal.play_billing.zzfg r9 = zzd(r34)
            r11 = r1
            r1 = r4
            r2 = r35
            r12 = r4
            r13 = r29
            r4 = r37
            r5 = r9
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzg(r1, r2, r3, r4, r5, r6)
            goto L_0x0cd4
        L_0x0cbd:
            r1 = r7
            com.google.android.gms.internal.play_billing.zzco r1 = (com.google.android.gms.internal.play_billing.zzco) r1
            throw r16
        L_0x0cc1:
            r11 = r1
            r12 = r4
            r13 = r29
            com.google.android.gms.internal.play_billing.zzfg r5 = zzd(r34)
            r1 = r12
            r2 = r35
            r4 = r37
            r6 = r39
            int r1 = com.google.android.gms.internal.play_billing.zzbd.zzg(r1, r2, r3, r4, r5, r6)
        L_0x0cd4:
            r15 = r35
            r14 = r37
            r3 = r10
            r2 = r11
            r4 = r12
            r11 = r13
            r6 = r17
            r10 = r19
            r5 = r21
            r12 = r39
            r13 = r8
            goto L_0x001b
        L_0x0ce7:
            r21 = r5
            r17 = r6
            r8 = r13
            r13 = r11
        L_0x0ced:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0cf6
            long r9 = (long) r6
            r13.putInt(r7, r9, r5)
        L_0x0cf6:
            int r3 = r0.zzj
        L_0x0cf8:
            int r5 = r0.zzk
            if (r3 >= r5) goto L_0x0d23
            int[] r5 = r0.zzi
            int[] r6 = r0.zzc
            r5 = r5[r3]
            r6 = r6[r5]
            int r6 = r0.zzs(r5)
            r6 = r6 & r2
            long r9 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r9)
            if (r6 != 0) goto L_0x0d11
            goto L_0x0d17
        L_0x0d11:
            com.google.android.gms.internal.play_billing.zzcw r9 = r0.zzu(r5)
            if (r9 != 0) goto L_0x0d1a
        L_0x0d17:
            int r3 = r3 + 1
            goto L_0x0cf8
        L_0x0d1a:
            com.google.android.gms.internal.play_billing.zzdw r6 = (com.google.android.gms.internal.play_billing.zzdw) r6
            java.lang.Object r1 = r0.zzw(r5)
            com.google.android.gms.internal.play_billing.zzdv r1 = (com.google.android.gms.internal.play_billing.zzdv) r1
            throw r16
        L_0x0d23:
            if (r8 != 0) goto L_0x0d2f
            r2 = r37
            if (r1 != r2) goto L_0x0d2a
            goto L_0x0d35
        L_0x0d2a:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zze()
            throw r1
        L_0x0d2f:
            r2 = r37
            if (r1 > r2) goto L_0x0d36
            if (r4 != r8) goto L_0x0d36
        L_0x0d35:
            return r1
        L_0x0d36:
            com.google.android.gms.internal.play_billing.zzdc r1 = com.google.android.gms.internal.play_billing.zzdc.zze()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcs = (zzcs) obj;
                zzcs.zzu(Integer.MAX_VALUE);
                zzcs.zza = 0;
                zzcs.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = (long) i2;
                if (zzr != 9) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, this.zzc[i], i)) {
                            zzv(i).zzf(zzb.getObject(obj, j));
                        }
                    } else {
                        switch (zzr) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzl.zza(obj, j);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = (long) i2;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbc) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0350, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b5, code lost:
        r16 = r10;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0443, code lost:
        r22 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0445, code lost:
        r16 = r10;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x06b6, code lost:
        r15 = r15 + 3;
        r0 = r9;
        r1 = r13;
        r10 = r16;
        r11 = r19;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r16 = r10;
        r19 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(java.lang.Object r24, com.google.android.gms.internal.play_billing.zzfx r25) throws java.io.IOException {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.play_billing.zzce r0 = r6.zzn
            com.google.android.gms.internal.play_billing.zzci r0 = r0.zzb(r7)
            com.google.android.gms.internal.play_billing.zzfb r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0024
            java.util.Iterator r0 = r0.zzf()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r10 = r0
            goto L_0x0026
        L_0x0024:
            r1 = 0
            r10 = 0
        L_0x0026:
            int[] r11 = r6.zzc
            sun.misc.Unsafe r12 = zzb
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r15 = 0
        L_0x002f:
            int r3 = r11.length
            if (r15 >= r3) goto L_0x06c2
            int r3 = r6.zzs(r15)
            int[] r4 = r6.zzc
            int r5 = zzr(r3)
            r14 = r4[r15]
            r9 = 17
            if (r5 > r9) goto L_0x0067
            int r9 = r15 + 2
            r4 = r4[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r4 & r9
            if (r13 == r0) goto L_0x005b
            if (r13 != r9) goto L_0x0052
            r9 = r1
            r2 = 0
            goto L_0x0059
        L_0x0052:
            r9 = r1
            long r0 = (long) r13
            int r0 = r12.getInt(r7, r0)
            r2 = r0
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r9 = r1
        L_0x005c:
            int r1 = r4 >>> 20
            r4 = 1
            int r1 = r4 << r1
            r21 = r1
            r20 = r2
            r13 = r9
            goto L_0x006d
        L_0x0067:
            r9 = r1
            r20 = r2
            r13 = r9
            r21 = 0
        L_0x006d:
            r9 = r0
        L_0x006e:
            if (r13 == 0) goto L_0x008d
            com.google.android.gms.internal.play_billing.zzce r0 = r6.zzn
            int r0 = r0.zza(r13)
            if (r0 > r14) goto L_0x008d
            com.google.android.gms.internal.play_billing.zzce r0 = r6.zzn
            r0.zze(r8, r13)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r10.next()
            r13 = r0
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            goto L_0x006e
        L_0x008b:
            r13 = 0
            goto L_0x006e
        L_0x008d:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            long r3 = (long) r0
            switch(r5) {
                case 0: goto L_0x0696;
                case 1: goto L_0x0675;
                case 2: goto L_0x0654;
                case 3: goto L_0x0632;
                case 4: goto L_0x0610;
                case 5: goto L_0x05ee;
                case 6: goto L_0x05cc;
                case 7: goto L_0x05aa;
                case 8: goto L_0x0588;
                case 9: goto L_0x0562;
                case 10: goto L_0x053e;
                case 11: goto L_0x051c;
                case 12: goto L_0x04fa;
                case 13: goto L_0x04d8;
                case 14: goto L_0x04b6;
                case 15: goto L_0x0494;
                case 16: goto L_0x0472;
                case 17: goto L_0x044b;
                case 18: goto L_0x0433;
                case 19: goto L_0x0422;
                case 20: goto L_0x0411;
                case 21: goto L_0x0400;
                case 22: goto L_0x03ef;
                case 23: goto L_0x03de;
                case 24: goto L_0x03cd;
                case 25: goto L_0x03bb;
                case 26: goto L_0x039c;
                case 27: goto L_0x036e;
                case 28: goto L_0x0354;
                case 29: goto L_0x0340;
                case 30: goto L_0x032f;
                case 31: goto L_0x031e;
                case 32: goto L_0x030d;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02eb;
                case 35: goto L_0x02d9;
                case 36: goto L_0x02c7;
                case 37: goto L_0x02b5;
                case 38: goto L_0x02a3;
                case 39: goto L_0x0291;
                case 40: goto L_0x027f;
                case 41: goto L_0x026d;
                case 42: goto L_0x025b;
                case 43: goto L_0x0249;
                case 44: goto L_0x0237;
                case 45: goto L_0x0225;
                case 46: goto L_0x0213;
                case 47: goto L_0x0201;
                case 48: goto L_0x01ef;
                case 49: goto L_0x01c1;
                case 50: goto L_0x01b0;
                case 51: goto L_0x01a1;
                case 52: goto L_0x0192;
                case 53: goto L_0x0183;
                case 54: goto L_0x0174;
                case 55: goto L_0x0165;
                case 56: goto L_0x0156;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0129;
                case 60: goto L_0x0116;
                case 61: goto L_0x0106;
                case 62: goto L_0x00f8;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0096;
            }
        L_0x0096:
            r16 = r10
            r19 = r11
            r17 = 0
        L_0x009c:
            r22 = 0
            goto L_0x06b6
        L_0x00a0:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r12.getObject(r7, r3)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r15)
            r8.zzq(r14, r0, r1)
            goto L_0x0096
        L_0x00b2:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            long r0 = zzt(r7, r3)
            r8.zzD(r14, r0)
            goto L_0x0096
        L_0x00c0:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzB(r14, r0)
            goto L_0x0096
        L_0x00ce:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            long r0 = zzt(r7, r3)
            r8.zzz(r14, r0)
            goto L_0x0096
        L_0x00dc:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzx(r14, r0)
            goto L_0x0096
        L_0x00ea:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzi(r14, r0)
            goto L_0x0096
        L_0x00f8:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzI(r14, r0)
            goto L_0x0096
        L_0x0106:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r12.getObject(r7, r3)
            com.google.android.gms.internal.play_billing.zzbq r0 = (com.google.android.gms.internal.play_billing.zzbq) r0
            r8.zzd(r14, r0)
            goto L_0x0096
        L_0x0116:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r12.getObject(r7, r3)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r15)
            r8.zzv(r14, r0, r1)
            goto L_0x0096
        L_0x0129:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r12.getObject(r7, r3)
            zzO(r14, r0, r8)
            goto L_0x0096
        L_0x0138:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            boolean r0 = zzN(r7, r3)
            r8.zzb(r14, r0)
            goto L_0x0096
        L_0x0147:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzk(r14, r0)
            goto L_0x0096
        L_0x0156:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            long r0 = zzt(r7, r3)
            r8.zzm(r14, r0)
            goto L_0x0096
        L_0x0165:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            int r0 = zzo(r7, r3)
            r8.zzr(r14, r0)
            goto L_0x0096
        L_0x0174:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            long r0 = zzt(r7, r3)
            r8.zzK(r14, r0)
            goto L_0x0096
        L_0x0183:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            long r0 = zzt(r7, r3)
            r8.zzt(r14, r0)
            goto L_0x0096
        L_0x0192:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            float r0 = zzn(r7, r3)
            r8.zzo(r14, r0)
            goto L_0x0096
        L_0x01a1:
            boolean r0 = r6.zzM(r7, r14, r15)
            if (r0 == 0) goto L_0x0096
            double r0 = zzm(r7, r3)
            r8.zzf(r14, r0)
            goto L_0x0096
        L_0x01b0:
            java.lang.Object r0 = r12.getObject(r7, r3)
            if (r0 != 0) goto L_0x01b8
            goto L_0x0096
        L_0x01b8:
            java.lang.Object r0 = r6.zzw(r15)
            com.google.android.gms.internal.play_billing.zzdv r0 = (com.google.android.gms.internal.play_billing.zzdv) r0
            r17 = 0
            throw r17
        L_0x01c1:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeo r2 = r6.zzv(r15)
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zza
            if (r1 == 0) goto L_0x03b5
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x03b5
            r3 = 0
        L_0x01dc:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x03b5
            java.lang.Object r4 = r1.get(r3)
            r5 = r8
            com.google.android.gms.internal.play_billing.zzbz r5 = (com.google.android.gms.internal.play_billing.zzbz) r5
            r5.zzq(r0, r4, r2)
            int r3 = r3 + 1
            goto L_0x01dc
        L_0x01ef:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            com.google.android.gms.internal.play_billing.zzeq.zzD(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0201:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzC(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0213:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzB(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0225:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzA(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0237:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzu(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0249:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzE(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x025b:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzs(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x026d:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzv(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x027f:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzw(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x0291:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzy(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x02a3:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzF(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x02b5:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzz(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x02c7:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzx(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x02d9:
            r2 = 1
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzt(r0, r1, r8, r2)
            goto L_0x03b5
        L_0x02eb:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            com.google.android.gms.internal.play_billing.zzeq.zzD(r0, r1, r8, r2)
            goto L_0x0350
        L_0x02fc:
            r2 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzC(r0, r1, r8, r2)
            goto L_0x0350
        L_0x030d:
            r2 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzB(r0, r1, r8, r2)
            goto L_0x0350
        L_0x031e:
            r2 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzA(r0, r1, r8, r2)
            goto L_0x0350
        L_0x032f:
            r2 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzu(r0, r1, r8, r2)
            goto L_0x0350
        L_0x0340:
            r2 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzE(r0, r1, r8, r2)
        L_0x0350:
            r22 = r2
            goto L_0x0445
        L_0x0354:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            int r2 = com.google.android.gms.internal.play_billing.zzeq.zza
            if (r1 == 0) goto L_0x03b5
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x03b5
            r8.zze(r0, r1)
            goto L_0x03b5
        L_0x036e:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeo r2 = r6.zzv(r15)
            int r3 = com.google.android.gms.internal.play_billing.zzeq.zza
            if (r1 == 0) goto L_0x03b5
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x03b5
            r3 = 0
        L_0x0389:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x03b5
            java.lang.Object r4 = r1.get(r3)
            r5 = r8
            com.google.android.gms.internal.play_billing.zzbz r5 = (com.google.android.gms.internal.play_billing.zzbz) r5
            r5.zzv(r0, r4, r2)
            int r3 = r3 + 1
            goto L_0x0389
        L_0x039c:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            int r2 = com.google.android.gms.internal.play_billing.zzeq.zza
            if (r1 == 0) goto L_0x03b5
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x03b5
            r8.zzH(r0, r1)
        L_0x03b5:
            r16 = r10
            r19 = r11
            goto L_0x009c
        L_0x03bb:
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            r5 = 0
            com.google.android.gms.internal.play_billing.zzeq.zzs(r0, r1, r8, r5)
            goto L_0x0443
        L_0x03cd:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzv(r0, r1, r8, r5)
            goto L_0x0443
        L_0x03de:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzw(r0, r1, r8, r5)
            goto L_0x0443
        L_0x03ef:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzy(r0, r1, r8, r5)
            goto L_0x0443
        L_0x0400:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzF(r0, r1, r8, r5)
            goto L_0x0443
        L_0x0411:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzz(r0, r1, r8, r5)
            goto L_0x0443
        L_0x0422:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzx(r0, r1, r8, r5)
            goto L_0x0443
        L_0x0433:
            r5 = 0
            r17 = 0
            int[] r0 = r6.zzc
            r0 = r0[r15]
            java.lang.Object r1 = r12.getObject(r7, r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.play_billing.zzeq.zzt(r0, r1, r8, r5)
        L_0x0443:
            r22 = r5
        L_0x0445:
            r16 = r10
            r19 = r11
            goto L_0x06b6
        L_0x044b:
            r5 = 0
            r17 = 0
            r0 = r23
            r1 = r24
            r2 = r15
            r16 = r10
            r19 = r11
            r10 = r3
            r3 = r9
            r4 = r20
            r22 = r5
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r15)
            r8.zzq(r14, r0, r1)
            goto L_0x06b6
        L_0x0472:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            long r0 = r12.getLong(r7, r10)
            r8.zzD(r14, r0)
            goto L_0x06b6
        L_0x0494:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzB(r14, r0)
            goto L_0x06b6
        L_0x04b6:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            long r0 = r12.getLong(r7, r10)
            r8.zzz(r14, r0)
            goto L_0x06b6
        L_0x04d8:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzx(r14, r0)
            goto L_0x06b6
        L_0x04fa:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzi(r14, r0)
            goto L_0x06b6
        L_0x051c:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzI(r14, r0)
            goto L_0x06b6
        L_0x053e:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.play_billing.zzbq r0 = (com.google.android.gms.internal.play_billing.zzbq) r0
            r8.zzd(r14, r0)
            goto L_0x06b6
        L_0x0562:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.play_billing.zzeo r1 = r6.zzv(r15)
            r8.zzv(r14, r0, r1)
            goto L_0x06b6
        L_0x0588:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r0 = r12.getObject(r7, r10)
            zzO(r14, r0, r8)
            goto L_0x06b6
        L_0x05aa:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            boolean r0 = com.google.android.gms.internal.play_billing.zzfp.zzw(r7, r10)
            r8.zzb(r14, r0)
            goto L_0x06b6
        L_0x05cc:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzk(r14, r0)
            goto L_0x06b6
        L_0x05ee:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            long r0 = r12.getLong(r7, r10)
            r8.zzm(r14, r0)
            goto L_0x06b6
        L_0x0610:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            int r0 = r12.getInt(r7, r10)
            r8.zzr(r14, r0)
            goto L_0x06b6
        L_0x0632:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            long r0 = r12.getLong(r7, r10)
            r8.zzK(r14, r0)
            goto L_0x06b6
        L_0x0654:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            long r0 = r12.getLong(r7, r10)
            r8.zzt(r14, r0)
            goto L_0x06b6
        L_0x0675:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            float r0 = com.google.android.gms.internal.play_billing.zzfp.zzb(r7, r10)
            r8.zzo(r14, r0)
            goto L_0x06b6
        L_0x0696:
            r16 = r10
            r19 = r11
            r17 = 0
            r22 = 0
            r10 = r3
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r20
            r5 = r21
            boolean r0 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x06b6
            double r0 = com.google.android.gms.internal.play_billing.zzfp.zza(r7, r10)
            r8.zzf(r14, r0)
        L_0x06b6:
            int r15 = r15 + 3
            r0 = r9
            r1 = r13
            r10 = r16
            r11 = r19
            r2 = r20
            goto L_0x002f
        L_0x06c2:
            r9 = r1
            r16 = r10
            r17 = 0
        L_0x06c7:
            if (r1 == 0) goto L_0x06df
            com.google.android.gms.internal.play_billing.zzce r0 = r6.zzn
            r0.zze(r8, r1)
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x06dc
            java.lang.Object r0 = r16.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x06c7
        L_0x06dc:
            r1 = r17
            goto L_0x06c7
        L_0x06df:
            com.google.android.gms.internal.play_billing.zzff r0 = r6.zzm
            java.lang.Object r1 = r0.zzd(r7)
            r0.zzj(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = (long) (zzs & 1048575);
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzfp.zza(obj, j)) == Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzfp.zzb(obj, j)) == Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzH(obj, obj2, i) && zzfp.zzw(obj, j) == zzfp.zzw(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    z = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzp2 = (long) (zzp(i) & 1048575);
                    if (zzfp.zzc(obj, zzp2) == zzfp.zzc(obj2, zzp2) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    public final boolean zzk(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i2, i, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i7, i6) && !zzK(obj2, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzdw) zzfp.zzf(obj2, (long) (zzs & 1048575))).isEmpty()) {
                            zzdv zzdv = (zzdv) zzw(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzfp.zzf(obj2, (long) (zzs & 1048575));
                if (!list.isEmpty()) {
                    zzeo zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzJ(obj, i6, i2, i, i10) && !zzK(obj2, zzs, zzv(i6))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        return !this.zzh || this.zzn.zzb(obj2).zzj();
    }
}
