package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import java.math.BigInteger;

public abstract class get {
    private static final int[] Cardinal = new int[0];
    private static final int[] cca_continue = {13, 41, 121, 337, 897, 2305};
    private static final byte[] configure = new byte[0];
    /* access modifiers changed from: private */
    public static final JSONNavi[] init = new JSONNavi[0];

    public static getDouble Cardinal(final JSONNavi jSONNavi, final int i, boolean z) {
        final toJSONString configure2 = jSONNavi.configure();
        return (getDouble) configure2.Cardinal(jSONNavi, "bc_wnaf", new getCurrentObject(true) {
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
                if ((r5 != null && r5.length >= r0) != false) goto L_0x0033;
             */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0039  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0 A[LOOP:0: B:60:0x00de->B:61:0x00e0, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x0105 A[LOOP:1: B:71:0x0103->B:72:0x0105, LOOP_END] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.cardinalcommerce.a.GMCipherSpi.SM2withRMD Cardinal(com.cardinalcommerce.a.GMCipherSpi.SM2withRMD r12) {
                /*
                    r11 = this;
                    boolean r0 = r12 instanceof com.cardinalcommerce.a.getDouble
                    r1 = 0
                    if (r0 == 0) goto L_0x0008
                    com.cardinalcommerce.a.getDouble r12 = (com.cardinalcommerce.a.getDouble) r12
                    goto L_0x0009
                L_0x0008:
                    r12 = r1
                L_0x0009:
                    int r0 = r5
                    r2 = 2
                    int r0 = r0 - r2
                    r3 = 0
                    int r0 = java.lang.Math.max(r3, r0)
                    r4 = 1
                    int r0 = r4 << r0
                    boolean r5 = true
                    if (r12 == 0) goto L_0x0035
                    com.cardinalcommerce.a.JSONNavi[] r6 = r12.configure
                    if (r6 == 0) goto L_0x0022
                    int r6 = r6.length
                    if (r6 < r0) goto L_0x0022
                    r6 = r4
                    goto L_0x0023
                L_0x0022:
                    r6 = r3
                L_0x0023:
                    if (r6 == 0) goto L_0x0035
                    if (r5 == 0) goto L_0x0033
                    com.cardinalcommerce.a.JSONNavi[] r5 = r12.Cardinal
                    if (r5 == 0) goto L_0x0030
                    int r5 = r5.length
                    if (r5 < r0) goto L_0x0030
                    r5 = r4
                    goto L_0x0031
                L_0x0030:
                    r5 = r3
                L_0x0031:
                    if (r5 == 0) goto L_0x0035
                L_0x0033:
                    r5 = r4
                    goto L_0x0036
                L_0x0035:
                    r5 = r3
                L_0x0036:
                    if (r5 == 0) goto L_0x0039
                    return r12
                L_0x0039:
                    if (r12 == 0) goto L_0x0042
                    com.cardinalcommerce.a.JSONNavi[] r5 = r12.configure
                    com.cardinalcommerce.a.JSONNavi[] r6 = r12.Cardinal
                    com.cardinalcommerce.a.JSONNavi r12 = r12.getInstance
                    goto L_0x0045
                L_0x0042:
                    r12 = r1
                    r5 = r12
                    r6 = r5
                L_0x0045:
                    if (r5 != 0) goto L_0x004d
                    com.cardinalcommerce.a.JSONNavi[] r5 = com.cardinalcommerce.a.get.init
                    r7 = r3
                    goto L_0x004e
                L_0x004d:
                    int r7 = r5.length
                L_0x004e:
                    if (r7 >= r0) goto L_0x00f1
                    com.cardinalcommerce.a.JSONNavi[] r5 = com.cardinalcommerce.a.get.configure((com.cardinalcommerce.a.JSONNavi[]) r5, (int) r0)
                    if (r0 != r4) goto L_0x0060
                    com.cardinalcommerce.a.JSONNavi r1 = r4
                    com.cardinalcommerce.a.JSONNavi r1 = r1.CardinalRenderType()
                    r5[r3] = r1
                    goto L_0x00f1
                L_0x0060:
                    if (r7 != 0) goto L_0x0068
                    com.cardinalcommerce.a.JSONNavi r8 = r4
                    r5[r3] = r8
                    r8 = r4
                    goto L_0x0069
                L_0x0068:
                    r8 = r7
                L_0x0069:
                    if (r0 != r2) goto L_0x0075
                    com.cardinalcommerce.a.JSONNavi r2 = r4
                    com.cardinalcommerce.a.JSONNavi r2 = r2.CardinalUiType()
                    r5[r4] = r2
                    goto L_0x00ea
                L_0x0075:
                    int r9 = r8 + -1
                    r9 = r5[r9]
                    if (r12 != 0) goto L_0x00dd
                    r12 = r5[r3]
                    com.cardinalcommerce.a.JSONNavi r12 = r12.getActionCode()
                    boolean r10 = r12.getString()
                    if (r10 != 0) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r10 = r1
                    com.cardinalcommerce.a.Base64 r10 = r10.cca_continue
                    int r10 = r10.Cardinal()
                    if (r10 != r4) goto L_0x0092
                    goto L_0x0093
                L_0x0092:
                    r4 = r3
                L_0x0093:
                    if (r4 == 0) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r4 = r1
                    int r4 = r4.getInstance()
                    r10 = 64
                    if (r4 < r10) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r4 = r1
                    int r4 = r4.valueOf()
                    if (r4 == r2) goto L_0x00ae
                    r2 = 3
                    if (r4 == r2) goto L_0x00ae
                    r2 = 4
                    if (r4 == r2) goto L_0x00ae
                    goto L_0x00dd
                L_0x00ae:
                    com.cardinalcommerce.a.merge r1 = r12.getInstance((int) r3)
                    com.cardinalcommerce.a.toJSONString r2 = r1
                    com.cardinalcommerce.a.merge r4 = r12.onValidated()
                    java.math.BigInteger r4 = r4.cca_continue()
                    com.cardinalcommerce.a.merge r10 = r12.getSDKVersion()
                    java.math.BigInteger r10 = r10.cca_continue()
                    com.cardinalcommerce.a.JSONNavi r2 = r2.configure(r4, r10, r3)
                    com.cardinalcommerce.a.merge r4 = r1.getInstance()
                    com.cardinalcommerce.a.merge r10 = r4.init((com.cardinalcommerce.a.merge) r1)
                    com.cardinalcommerce.a.JSONNavi r4 = r9.configure((com.cardinalcommerce.a.merge) r4)
                    com.cardinalcommerce.a.JSONNavi r9 = r4.getInstance((com.cardinalcommerce.a.merge) r10)
                    if (r7 != 0) goto L_0x00de
                    r5[r3] = r9
                    goto L_0x00de
                L_0x00dd:
                    r2 = r12
                L_0x00de:
                    if (r8 >= r0) goto L_0x00ea
                    int r4 = r8 + 1
                    com.cardinalcommerce.a.JSONNavi r9 = r9.cca_continue(r2)
                    r5[r8] = r9
                    r8 = r4
                    goto L_0x00de
                L_0x00ea:
                    com.cardinalcommerce.a.toJSONString r2 = r1
                    int r4 = r0 - r7
                    r2.configure(r5, r7, r4, r1)
                L_0x00f1:
                    boolean r1 = true
                    if (r1 == 0) goto L_0x0110
                    if (r6 != 0) goto L_0x00fb
                    com.cardinalcommerce.a.JSONNavi[] r1 = new com.cardinalcommerce.a.JSONNavi[r0]
                L_0x00f9:
                    r6 = r1
                    goto L_0x0103
                L_0x00fb:
                    int r3 = r6.length
                    if (r3 >= r0) goto L_0x0103
                    com.cardinalcommerce.a.JSONNavi[] r1 = com.cardinalcommerce.a.get.configure((com.cardinalcommerce.a.JSONNavi[]) r6, (int) r0)
                    goto L_0x00f9
                L_0x0103:
                    if (r3 >= r0) goto L_0x0110
                    r1 = r5[r3]
                    com.cardinalcommerce.a.JSONNavi r1 = r1.CardinalChallengeObserver()
                    r6[r3] = r1
                    int r3 = r3 + 1
                    goto L_0x0103
                L_0x0110:
                    com.cardinalcommerce.a.getDouble r0 = new com.cardinalcommerce.a.getDouble
                    r0.<init>()
                    r0.configure = r5
                    r0.Cardinal = r6
                    r0.getInstance = r12
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.get.AnonymousClass5.Cardinal(com.cardinalcommerce.a.GMCipherSpi$SM2withRMD):com.cardinalcommerce.a.GMCipherSpi$SM2withRMD");
            }
        });
    }

    public static int cca_continue(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int[] configure(int i, BigInteger bigInteger) {
        if (i == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            } else if (bigInteger.signum() == 0) {
                return Cardinal;
            } else {
                BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
                int bitLength = add.bitLength();
                int i2 = bitLength >> 1;
                int[] iArr = new int[i2];
                BigInteger xor = add.xor(bigInteger);
                int i3 = bitLength - 1;
                int i4 = 0;
                int i5 = 0;
                int i6 = 1;
                while (i6 < i3) {
                    if (!xor.testBit(i6)) {
                        i5++;
                    } else {
                        iArr[i4] = i5 | ((bigInteger.testBit(i6) ? -1 : 1) << 16);
                        i6++;
                        i5 = 1;
                        i4++;
                    }
                    i6++;
                }
                int i7 = i4 + 1;
                iArr[i4] = 65536 | i5;
                if (i2 <= i7) {
                    return iArr;
                }
                int[] iArr2 = new int[i7];
                System.arraycopy(iArr, 0, iArr2, 0, i7);
                return iArr2;
            }
        } else if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return Cardinal;
        } else {
            int bitLength2 = (bigInteger.bitLength() / i) + 1;
            int[] iArr3 = new int[bitLength2];
            int i8 = 1 << i;
            int i9 = i8 - 1;
            int i10 = i8 >>> 1;
            int i11 = 0;
            int i12 = 0;
            boolean z = false;
            while (i11 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i11) == z) {
                    i11++;
                } else {
                    bigInteger = bigInteger.shiftRight(i11);
                    int intValue = bigInteger.intValue() & i9;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i10) != 0;
                    if (z) {
                        intValue -= i8;
                    }
                    if (i12 > 0) {
                        i11--;
                    }
                    iArr3[i12] = i11 | (intValue << 16);
                    i11 = i;
                    i12++;
                }
            }
            if (bitLength2 <= i12) {
                return iArr3;
            }
            int[] iArr4 = new int[i12];
            System.arraycopy(iArr3, 0, iArr4, 0, i12);
            return iArr4;
        }
    }

    public static byte[] getInstance(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return configure;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength() - 1;
            byte[] bArr = new byte[bitLength];
            BigInteger xor = add.xor(bigInteger);
            int i2 = 1;
            while (i2 < bitLength) {
                if (xor.testBit(i2)) {
                    bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                    i2++;
                }
                i2++;
            }
            bArr[bitLength - 1] = 1;
            return bArr;
        } else if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return configure;
        } else {
            int bitLength2 = bigInteger.bitLength() + 1;
            byte[] bArr2 = new byte[bitLength2];
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = i3 >>> 1;
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            while (i6 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i6) == z) {
                    i6++;
                } else {
                    bigInteger = bigInteger.shiftRight(i6);
                    int intValue = bigInteger.intValue() & i4;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i5) != 0;
                    if (z) {
                        intValue -= i3;
                    }
                    if (i7 > 0) {
                        i6--;
                    }
                    int i8 = i7 + i6;
                    bArr2[i8] = (byte) intValue;
                    i7 = i8 + 1;
                    i6 = i;
                }
            }
            if (bitLength2 <= i7) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
    }

    public static getDouble cca_continue(JSONNavi jSONNavi) {
        GMCipherSpi.SM2withRMD cca_continue2 = jSONNavi.configure().cca_continue(jSONNavi, "bc_wnaf");
        if (cca_continue2 instanceof getDouble) {
            return (getDouble) cca_continue2;
        }
        return null;
    }

    public static int Cardinal(int i) {
        int[] iArr = cca_continue;
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static JSONNavi getInstance(final JSONNavi jSONNavi, final int i, JSONAwareEx jSONAwareEx) {
        toJSONString configure2 = jSONNavi.configure();
        final toJSONString configure3 = jSONNavi.configure();
        JSONNavi Cardinal2 = jSONAwareEx.Cardinal(jSONNavi);
        configure2.Cardinal(Cardinal2, "bc_wnaf", new getCurrentObject((getDouble) configure3.Cardinal(jSONNavi, "bc_wnaf", new getCurrentObject(true) {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.cardinalcommerce.a.GMCipherSpi.SM2withRMD Cardinal(com.cardinalcommerce.a.GMCipherSpi.SM2withRMD r12) {
                /*
                    r11 = this;
                    boolean r0 = r12 instanceof com.cardinalcommerce.a.getDouble
                    r1 = 0
                    if (r0 == 0) goto L_0x0008
                    com.cardinalcommerce.a.getDouble r12 = (com.cardinalcommerce.a.getDouble) r12
                    goto L_0x0009
                L_0x0008:
                    r12 = r1
                L_0x0009:
                    int r0 = r5
                    r2 = 2
                    int r0 = r0 - r2
                    r3 = 0
                    int r0 = java.lang.Math.max(r3, r0)
                    r4 = 1
                    int r0 = r4 << r0
                    boolean r5 = true
                    if (r12 == 0) goto L_0x0035
                    com.cardinalcommerce.a.JSONNavi[] r6 = r12.configure
                    if (r6 == 0) goto L_0x0022
                    int r6 = r6.length
                    if (r6 < r0) goto L_0x0022
                    r6 = r4
                    goto L_0x0023
                L_0x0022:
                    r6 = r3
                L_0x0023:
                    if (r6 == 0) goto L_0x0035
                    if (r5 == 0) goto L_0x0033
                    com.cardinalcommerce.a.JSONNavi[] r5 = r12.Cardinal
                    if (r5 == 0) goto L_0x0030
                    int r5 = r5.length
                    if (r5 < r0) goto L_0x0030
                    r5 = r4
                    goto L_0x0031
                L_0x0030:
                    r5 = r3
                L_0x0031:
                    if (r5 == 0) goto L_0x0035
                L_0x0033:
                    r5 = r4
                    goto L_0x0036
                L_0x0035:
                    r5 = r3
                L_0x0036:
                    if (r5 == 0) goto L_0x0039
                    return r12
                L_0x0039:
                    if (r12 == 0) goto L_0x0042
                    com.cardinalcommerce.a.JSONNavi[] r5 = r12.configure
                    com.cardinalcommerce.a.JSONNavi[] r6 = r12.Cardinal
                    com.cardinalcommerce.a.JSONNavi r12 = r12.getInstance
                    goto L_0x0045
                L_0x0042:
                    r12 = r1
                    r5 = r12
                    r6 = r5
                L_0x0045:
                    if (r5 != 0) goto L_0x004d
                    com.cardinalcommerce.a.JSONNavi[] r5 = com.cardinalcommerce.a.get.init
                    r7 = r3
                    goto L_0x004e
                L_0x004d:
                    int r7 = r5.length
                L_0x004e:
                    if (r7 >= r0) goto L_0x00f1
                    com.cardinalcommerce.a.JSONNavi[] r5 = com.cardinalcommerce.a.get.configure((com.cardinalcommerce.a.JSONNavi[]) r5, (int) r0)
                    if (r0 != r4) goto L_0x0060
                    com.cardinalcommerce.a.JSONNavi r1 = r4
                    com.cardinalcommerce.a.JSONNavi r1 = r1.CardinalRenderType()
                    r5[r3] = r1
                    goto L_0x00f1
                L_0x0060:
                    if (r7 != 0) goto L_0x0068
                    com.cardinalcommerce.a.JSONNavi r8 = r4
                    r5[r3] = r8
                    r8 = r4
                    goto L_0x0069
                L_0x0068:
                    r8 = r7
                L_0x0069:
                    if (r0 != r2) goto L_0x0075
                    com.cardinalcommerce.a.JSONNavi r2 = r4
                    com.cardinalcommerce.a.JSONNavi r2 = r2.CardinalUiType()
                    r5[r4] = r2
                    goto L_0x00ea
                L_0x0075:
                    int r9 = r8 + -1
                    r9 = r5[r9]
                    if (r12 != 0) goto L_0x00dd
                    r12 = r5[r3]
                    com.cardinalcommerce.a.JSONNavi r12 = r12.getActionCode()
                    boolean r10 = r12.getString()
                    if (r10 != 0) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r10 = r1
                    com.cardinalcommerce.a.Base64 r10 = r10.cca_continue
                    int r10 = r10.Cardinal()
                    if (r10 != r4) goto L_0x0092
                    goto L_0x0093
                L_0x0092:
                    r4 = r3
                L_0x0093:
                    if (r4 == 0) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r4 = r1
                    int r4 = r4.getInstance()
                    r10 = 64
                    if (r4 < r10) goto L_0x00dd
                    com.cardinalcommerce.a.toJSONString r4 = r1
                    int r4 = r4.valueOf()
                    if (r4 == r2) goto L_0x00ae
                    r2 = 3
                    if (r4 == r2) goto L_0x00ae
                    r2 = 4
                    if (r4 == r2) goto L_0x00ae
                    goto L_0x00dd
                L_0x00ae:
                    com.cardinalcommerce.a.merge r1 = r12.getInstance((int) r3)
                    com.cardinalcommerce.a.toJSONString r2 = r1
                    com.cardinalcommerce.a.merge r4 = r12.onValidated()
                    java.math.BigInteger r4 = r4.cca_continue()
                    com.cardinalcommerce.a.merge r10 = r12.getSDKVersion()
                    java.math.BigInteger r10 = r10.cca_continue()
                    com.cardinalcommerce.a.JSONNavi r2 = r2.configure(r4, r10, r3)
                    com.cardinalcommerce.a.merge r4 = r1.getInstance()
                    com.cardinalcommerce.a.merge r10 = r4.init((com.cardinalcommerce.a.merge) r1)
                    com.cardinalcommerce.a.JSONNavi r4 = r9.configure((com.cardinalcommerce.a.merge) r4)
                    com.cardinalcommerce.a.JSONNavi r9 = r4.getInstance((com.cardinalcommerce.a.merge) r10)
                    if (r7 != 0) goto L_0x00de
                    r5[r3] = r9
                    goto L_0x00de
                L_0x00dd:
                    r2 = r12
                L_0x00de:
                    if (r8 >= r0) goto L_0x00ea
                    int r4 = r8 + 1
                    com.cardinalcommerce.a.JSONNavi r9 = r9.cca_continue(r2)
                    r5[r8] = r9
                    r8 = r4
                    goto L_0x00de
                L_0x00ea:
                    com.cardinalcommerce.a.toJSONString r2 = r1
                    int r4 = r0 - r7
                    r2.configure(r5, r7, r4, r1)
                L_0x00f1:
                    boolean r1 = true
                    if (r1 == 0) goto L_0x0110
                    if (r6 != 0) goto L_0x00fb
                    com.cardinalcommerce.a.JSONNavi[] r1 = new com.cardinalcommerce.a.JSONNavi[r0]
                L_0x00f9:
                    r6 = r1
                    goto L_0x0103
                L_0x00fb:
                    int r3 = r6.length
                    if (r3 >= r0) goto L_0x0103
                    com.cardinalcommerce.a.JSONNavi[] r1 = com.cardinalcommerce.a.get.configure((com.cardinalcommerce.a.JSONNavi[]) r6, (int) r0)
                    goto L_0x00f9
                L_0x0103:
                    if (r3 >= r0) goto L_0x0110
                    r1 = r5[r3]
                    com.cardinalcommerce.a.JSONNavi r1 = r1.CardinalChallengeObserver()
                    r6[r3] = r1
                    int r3 = r3 + 1
                    goto L_0x0103
                L_0x0110:
                    com.cardinalcommerce.a.getDouble r0 = new com.cardinalcommerce.a.getDouble
                    r0.<init>()
                    r0.configure = r5
                    r0.Cardinal = r6
                    r0.getInstance = r12
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.get.AnonymousClass5.Cardinal(com.cardinalcommerce.a.GMCipherSpi$SM2withRMD):com.cardinalcommerce.a.GMCipherSpi$SM2withRMD");
            }
        }), jSONAwareEx, true) {
            private /* synthetic */ getDouble cca_continue;
            private /* synthetic */ JSONAwareEx configure;
            private /* synthetic */ boolean init = true;

            {
                this.cca_continue = r1;
                this.configure = r2;
            }

            public final GMCipherSpi.SM2withRMD Cardinal(GMCipherSpi.SM2withRMD sM2withRMD) {
                getDouble getdouble = new getDouble();
                JSONNavi jSONNavi = this.cca_continue.getInstance;
                if (jSONNavi != null) {
                    getdouble.getInstance = this.configure.Cardinal(jSONNavi);
                }
                JSONNavi[] jSONNaviArr = this.cca_continue.configure;
                int length = jSONNaviArr.length;
                JSONNavi[] jSONNaviArr2 = new JSONNavi[length];
                for (int i = 0; i < jSONNaviArr.length; i++) {
                    jSONNaviArr2[i] = this.configure.Cardinal(jSONNaviArr[i]);
                }
                getdouble.configure = jSONNaviArr2;
                if (this.init) {
                    JSONNavi[] jSONNaviArr3 = new JSONNavi[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONNaviArr3[i2] = jSONNaviArr2[i2].CardinalChallengeObserver();
                    }
                    getdouble.Cardinal = jSONNaviArr3;
                }
                return getdouble;
            }
        });
        return Cardinal2;
    }

    static /* synthetic */ JSONNavi[] configure(JSONNavi[] jSONNaviArr, int i) {
        JSONNavi[] jSONNaviArr2 = new JSONNavi[i];
        System.arraycopy(jSONNaviArr, 0, jSONNaviArr2, 0, jSONNaviArr.length);
        return jSONNaviArr2;
    }
}
