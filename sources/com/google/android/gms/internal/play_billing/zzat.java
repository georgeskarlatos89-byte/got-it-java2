package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
final class zzat extends zzal {
    static final zzal zza = new zzat((Object) null, new Object[0], 0);
    final transient Object[] zzb;
    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.play_billing.zzat zzg(int r16, java.lang.Object[] r17, com.google.android.gms.internal.play_billing.zzak r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000d
            com.google.android.gms.internal.play_billing.zzal r0 = zza
            com.google.android.gms.internal.play_billing.zzat r0 = (com.google.android.gms.internal.play_billing.zzat) r0
            return r0
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0027
            r0 = r1[r4]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r2 = r1[r5]
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.play_billing.zzad.zza(r0, r2)
            com.google.android.gms.internal.play_billing.zzat r0 = new com.google.android.gms.internal.play_billing.zzat
            r0.<init>(r3, r1, r5)
            return r0
        L_0x0027:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            com.google.android.gms.internal.play_billing.zzaa.zzb(r0, r6, r7)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r7 >= r8) goto L_0x004c
            int r8 = r7 + -1
            int r8 = java.lang.Integer.highestOneBit(r8)
        L_0x003e:
            int r8 = r8 + r8
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0050
            goto L_0x003e
        L_0x004c:
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L_0x01f3
        L_0x0050:
            if (r0 != r5) goto L_0x0066
            r0 = r1[r4]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r7 = r1[r5]
            java.lang.Object r7 = java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.play_billing.zzad.zza(r0, r7)
            r0 = r5
            r7 = r0
            r5 = r6
            goto L_0x01c6
        L_0x0066:
            int r7 = r8 + -1
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r8 > r9) goto L_0x00e3
            byte[] r8 = new byte[r8]
            java.util.Arrays.fill(r8, r11)
            r9 = r4
            r11 = r9
        L_0x0075:
            if (r9 >= r0) goto L_0x00cb
            int r12 = r11 + r11
            int r13 = r9 + r9
            r14 = r1[r13]
            java.lang.Object r14 = java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r5
            r13 = r1[r13]
            java.lang.Object r13 = java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.play_billing.zzad.zza(r14, r13)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.play_billing.zzae.zza(r15)
        L_0x0093:
            r15 = r15 & r7
            byte r6 = r8[r15]
            r5 = 255(0xff, float:3.57E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x00a9
            byte r5 = (byte) r12
            r8[r15] = r5
            if (r11 >= r9) goto L_0x00a6
            r1[r12] = r14
            r5 = r12 ^ 1
            r1[r5] = r13
        L_0x00a6:
            int r11 = r11 + 1
            goto L_0x00c1
        L_0x00a9:
            r5 = r1[r6]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00c6
            r3 = r6 ^ 1
            com.google.android.gms.internal.play_billing.zzaj r5 = new com.google.android.gms.internal.play_billing.zzaj
            r6 = r1[r3]
            java.lang.Object r6 = java.util.Objects.requireNonNull(r6)
            r5.<init>(r14, r13, r6)
            r1[r3] = r13
            r3 = r5
        L_0x00c1:
            int r9 = r9 + 1
            r5 = 1
            r6 = 2
            goto L_0x0075
        L_0x00c6:
            int r15 = r15 + 1
            r5 = 1
            r6 = 2
            goto L_0x0093
        L_0x00cb:
            if (r11 != r0) goto L_0x00d0
            r3 = r8
        L_0x00ce:
            r5 = 2
            goto L_0x00e0
        L_0x00d0:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
            r3 = r5
            r5 = r6
        L_0x00e0:
            r7 = 1
            goto L_0x01c6
        L_0x00e3:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r5) goto L_0x0159
            short[] r5 = new short[r8]
            java.util.Arrays.fill(r5, r11)
            r6 = r4
            r8 = r6
        L_0x00ef:
            if (r6 >= r0) goto L_0x0143
            int r9 = r8 + r8
            int r11 = r6 + r6
            r12 = r1[r11]
            java.lang.Object r12 = java.util.Objects.requireNonNull(r12)
            r13 = 1
            r11 = r11 ^ r13
            r11 = r1[r11]
            java.lang.Object r11 = java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.play_billing.zzad.zza(r12, r11)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.play_billing.zzae.zza(r13)
        L_0x010e:
            r13 = r13 & r7
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x0125
            short r14 = (short) r9
            r5[r13] = r14
            if (r8 >= r6) goto L_0x0122
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r11
        L_0x0122:
            int r8 = r8 + 1
            goto L_0x013d
        L_0x0125:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0140
            r3 = r14 ^ 1
            com.google.android.gms.internal.play_billing.zzaj r9 = new com.google.android.gms.internal.play_billing.zzaj
            r13 = r1[r3]
            java.lang.Object r13 = java.util.Objects.requireNonNull(r13)
            r9.<init>(r12, r11, r13)
            r1[r3] = r11
            r3 = r9
        L_0x013d:
            int r6 = r6 + 1
            goto L_0x00ef
        L_0x0140:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0143:
            if (r8 != r0) goto L_0x0147
            goto L_0x01b4
        L_0x0147:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r6[r9] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
            r7 = r9
            goto L_0x01c6
        L_0x0159:
            r9 = 1
            int[] r5 = new int[r8]
            java.util.Arrays.fill(r5, r11)
            r6 = r4
            r8 = r6
        L_0x0161:
            if (r6 >= r0) goto L_0x01b2
            int r12 = r8 + r8
            int r13 = r6 + r6
            r14 = r1[r13]
            java.lang.Object r14 = java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r9
            r9 = r1[r13]
            java.lang.Object r9 = java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.play_billing.zzad.zza(r14, r9)
            int r13 = r14.hashCode()
            int r13 = com.google.android.gms.internal.play_billing.zzae.zza(r13)
        L_0x017f:
            r13 = r13 & r7
            r15 = r5[r13]
            if (r15 != r11) goto L_0x0191
            r5[r13] = r12
            if (r8 >= r6) goto L_0x018e
            r1[r12] = r14
            r12 = r12 ^ 1
            r1[r12] = r9
        L_0x018e:
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x0191:
            r11 = r1[r15]
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x01ae
            r3 = r15 ^ 1
            com.google.android.gms.internal.play_billing.zzaj r11 = new com.google.android.gms.internal.play_billing.zzaj
            r12 = r1[r3]
            java.lang.Object r12 = java.util.Objects.requireNonNull(r12)
            r11.<init>(r14, r9, r12)
            r1[r3] = r9
            r3 = r11
        L_0x01a9:
            int r6 = r6 + 1
            r9 = 1
            r11 = -1
            goto L_0x0161
        L_0x01ae:
            int r13 = r13 + 1
            r11 = -1
            goto L_0x017f
        L_0x01b2:
            if (r8 != r0) goto L_0x01b7
        L_0x01b4:
            r3 = r5
            goto L_0x00ce
        L_0x01b7:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
        L_0x01c6:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01ed
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            com.google.android.gms.internal.play_billing.zzaj r0 = (com.google.android.gms.internal.play_billing.zzaj) r0
            if (r2 == 0) goto L_0x01e8
            r2.zzc = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L_0x01ed
        L_0x01e8:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        L_0x01ed:
            com.google.android.gms.internal.play_billing.zzat r2 = new com.google.android.gms.internal.play_billing.zzat
            r2.<init>(r3, r1, r0)
            return r2
        L_0x01f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzat.zzg(int, java.lang.Object[], com.google.android.gms.internal.play_billing.zzak):com.google.android.gms.internal.play_billing.zzat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[RETURN] */
    @javax.annotation.CheckForNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0006
        L_0x0003:
            r10 = r0
            goto L_0x009e
        L_0x0006:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L_0x0022
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0003
            r10 = r2[r3]
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10)
            goto L_0x009e
        L_0x0022:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L_0x0027
            goto L_0x0003
        L_0x0027:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L_0x0053
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + -1
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzae.zza(r1)
        L_0x003a:
            r1 = r1 & r6
            byte r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0043
            goto L_0x0003
        L_0x0043:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0050
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L_0x009e
        L_0x0050:
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0053:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L_0x007f
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + -1
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzae.zza(r1)
        L_0x0065:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006f
            goto L_0x0003
        L_0x006f:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007c
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L_0x009e
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x007f:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.zzae.zza(r6)
        L_0x008b:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L_0x0092
            goto L_0x0003
        L_0x0092:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a2
            r10 = r7 ^ 1
            r10 = r2[r10]
        L_0x009e:
            if (r10 != 0) goto L_0x00a1
            return r0
        L_0x00a1:
            return r10
        L_0x00a2:
            int r6 = r6 + 1
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzat.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
