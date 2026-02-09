package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

final class getSize {
    private static final BigInteger Cardinal = writeJSONString.CardinalEnvironment.negate();
    private static final BigInteger cca_continue;
    private static byte[][] cleanup = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
    public static final at[] configure;
    public static final at[] getInstance;
    private static byte[][] getWarnings = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    private static final BigInteger init;

    static {
        BigInteger negate = writeJSONString.CardinalRenderType.negate();
        init = negate;
        BigInteger negate2 = writeJSONString.valueOf.negate();
        cca_continue = negate2;
        configure = new at[]{null, new at(writeJSONString.CardinalRenderType, writeJSONString.getSDKVersion), null, new at(negate2, negate), null, new at(negate, negate), null, new at(writeJSONString.CardinalRenderType, negate), null};
        BigInteger bigInteger = writeJSONString.CardinalRenderType;
        getInstance = new at[]{null, new at(writeJSONString.CardinalRenderType, writeJSONString.getSDKVersion), null, new at(negate2, writeJSONString.CardinalRenderType), null, new at(negate, writeJSONString.CardinalRenderType), null, new at(bigInteger, bigInteger), null};
    }

    getSize() {
    }

    public static byte Cardinal(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    private static getKeys getInstance(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + 10;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - 10;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(writeJSONString.CardinalRenderType);
        }
        return new getKeys(shiftRight, 10);
    }

    public static BigInteger init(byte b) {
        return BigInteger.valueOf(b == 1 ? 6 : 10);
    }

    private static BigInteger[] init(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = writeJSONString.CardinalEnvironment;
                bigInteger2 = BigInteger.valueOf((long) b);
            } else {
                bigInteger = writeJSONString.getSDKVersion;
                bigInteger2 = writeJSONString.CardinalRenderType;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] getInstance(toJSONString.cca_continue cca_continue2) {
        int i;
        if (cca_continue2.values()) {
            int instance = cca_continue2.getInstance();
            int intValue = cca_continue2.getSDKVersion().cca_continue().intValue();
            byte b = (byte) (intValue == 0 ? -1 : 1);
            BigInteger onValidated = cca_continue2.onValidated();
            if (onValidated != null) {
                if (onValidated.equals(writeJSONString.CardinalEnvironment)) {
                    i = 1;
                } else if (onValidated.equals(writeJSONString.CardinalError)) {
                    i = 2;
                }
                BigInteger[] init2 = init(b, (instance + 3) - intValue, false);
                if (b == 1) {
                    init2[0] = init2[0].negate();
                    init2[1] = init2[1].negate();
                }
                return new BigInteger[]{writeJSONString.CardinalRenderType.add(init2[1]).shiftRight(i), writeJSONString.CardinalRenderType.add(init2[0]).shiftRight(i).negate()};
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011b, code lost:
        if (r7.cca_continue.compareTo(com.cardinalcommerce.a.writeJSONString.CardinalRenderType.shiftLeft(r7.configure)) >= 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012c, code lost:
        if (r5.cca_continue.compareTo(Cardinal.shiftLeft(r5.configure)) < 0) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.a.at configure(java.math.BigInteger r11, int r12, byte r13, java.math.BigInteger[] r14, byte r15) {
        /*
            r0 = 0
            r1 = 1
            if (r15 != r1) goto L_0x000d
            r2 = r14[r0]
            r3 = r14[r1]
            java.math.BigInteger r2 = r2.add(r3)
            goto L_0x0015
        L_0x000d:
            r2 = r14[r0]
            r3 = r14[r1]
            java.math.BigInteger r2 = r2.subtract(r3)
        L_0x0015:
            java.math.BigInteger[] r3 = init(r15, r12, r1)
            r3 = r3[r1]
            r5 = r14[r0]
            r9 = 10
            r4 = r11
            r6 = r3
            r7 = r13
            r8 = r12
            com.cardinalcommerce.a.getKeys r10 = getInstance(r4, r5, r6, r7, r8, r9)
            r5 = r14[r1]
            com.cardinalcommerce.a.getKeys r12 = getInstance(r4, r5, r6, r7, r8, r9)
            int r13 = r10.configure
            int r3 = r12.configure
            if (r3 != r13) goto L_0x0182
            r13 = -1
            if (r15 == r1) goto L_0x0041
            if (r15 != r13) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "mu must be 1 or -1"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            java.math.BigInteger r3 = r10.cca_continue()
            java.math.BigInteger r4 = r12.cca_continue()
            com.cardinalcommerce.a.getKeys r5 = new com.cardinalcommerce.a.getKeys
            java.math.BigInteger r6 = r10.cca_continue
            int r7 = r10.configure
            java.math.BigInteger r7 = r3.shiftLeft(r7)
            java.math.BigInteger r6 = r6.subtract(r7)
            int r7 = r10.configure
            r5.<init>(r6, r7)
            com.cardinalcommerce.a.getKeys r6 = new com.cardinalcommerce.a.getKeys
            java.math.BigInteger r7 = r12.cca_continue
            int r8 = r12.configure
            java.math.BigInteger r8 = r4.shiftLeft(r8)
            java.math.BigInteger r7 = r7.subtract(r8)
            int r12 = r12.configure
            r6.<init>(r7, r12)
            com.cardinalcommerce.a.getKeys r12 = r5.Cardinal(r5)
            if (r15 != r1) goto L_0x007a
            com.cardinalcommerce.a.getKeys r12 = r12.Cardinal(r6)
            goto L_0x008b
        L_0x007a:
            com.cardinalcommerce.a.getKeys r7 = new com.cardinalcommerce.a.getKeys
            java.math.BigInteger r8 = r6.cca_continue
            java.math.BigInteger r8 = r8.negate()
            int r9 = r6.configure
            r7.<init>(r8, r9)
            com.cardinalcommerce.a.getKeys r12 = r12.Cardinal(r7)
        L_0x008b:
            com.cardinalcommerce.a.getKeys r7 = r6.Cardinal(r6)
            com.cardinalcommerce.a.getKeys r7 = r7.Cardinal(r6)
            com.cardinalcommerce.a.getKeys r6 = r7.Cardinal(r6)
            if (r15 != r1) goto L_0x00af
            com.cardinalcommerce.a.getKeys r8 = new com.cardinalcommerce.a.getKeys
            java.math.BigInteger r9 = r7.cca_continue
            java.math.BigInteger r9 = r9.negate()
            int r7 = r7.configure
            r8.<init>(r9, r7)
            com.cardinalcommerce.a.getKeys r7 = r5.Cardinal(r8)
            com.cardinalcommerce.a.getKeys r5 = r5.Cardinal(r6)
            goto L_0x00c4
        L_0x00af:
            com.cardinalcommerce.a.getKeys r7 = r5.Cardinal(r7)
            com.cardinalcommerce.a.getKeys r8 = new com.cardinalcommerce.a.getKeys
            java.math.BigInteger r9 = r6.cca_continue
            java.math.BigInteger r9 = r9.negate()
            int r6 = r6.configure
            r8.<init>(r9, r6)
            com.cardinalcommerce.a.getKeys r5 = r5.Cardinal(r8)
        L_0x00c4:
            java.math.BigInteger r6 = com.cardinalcommerce.a.writeJSONString.CardinalRenderType
            java.math.BigInteger r8 = r12.cca_continue
            int r9 = r12.configure
            java.math.BigInteger r6 = r6.shiftLeft(r9)
            int r6 = r8.compareTo(r6)
            if (r6 < 0) goto L_0x00e8
            java.math.BigInteger r6 = init
            java.math.BigInteger r8 = r7.cca_continue
            int r9 = r7.configure
            java.math.BigInteger r6 = r6.shiftLeft(r9)
            int r6 = r8.compareTo(r6)
            if (r6 >= 0) goto L_0x00e5
            goto L_0x00f8
        L_0x00e5:
            r8 = r0
            r6 = r1
            goto L_0x00fd
        L_0x00e8:
            java.math.BigInteger r6 = com.cardinalcommerce.a.writeJSONString.CardinalEnvironment
            java.math.BigInteger r8 = r5.cca_continue
            int r9 = r5.configure
            java.math.BigInteger r6 = r6.shiftLeft(r9)
            int r6 = r8.compareTo(r6)
            if (r6 < 0) goto L_0x00fb
        L_0x00f8:
            r8 = r15
            r6 = r0
            goto L_0x00fd
        L_0x00fb:
            r6 = r0
            r8 = r6
        L_0x00fd:
            java.math.BigInteger r9 = init
            java.math.BigInteger r10 = r12.cca_continue
            int r12 = r12.configure
            java.math.BigInteger r12 = r9.shiftLeft(r12)
            int r12 = r10.compareTo(r12)
            if (r12 >= 0) goto L_0x011e
            java.math.BigInteger r12 = com.cardinalcommerce.a.writeJSONString.CardinalRenderType
            java.math.BigInteger r5 = r7.cca_continue
            int r7 = r7.configure
            java.math.BigInteger r12 = r12.shiftLeft(r7)
            int r12 = r5.compareTo(r12)
            if (r12 < 0) goto L_0x0131
            goto L_0x012e
        L_0x011e:
            java.math.BigInteger r12 = Cardinal
            java.math.BigInteger r13 = r5.cca_continue
            int r5 = r5.configure
            java.math.BigInteger r12 = r12.shiftLeft(r5)
            int r12 = r13.compareTo(r12)
            if (r12 >= 0) goto L_0x0130
        L_0x012e:
            int r12 = -r15
            byte r8 = (byte) r12
        L_0x0130:
            r13 = r6
        L_0x0131:
            long r12 = (long) r13
            java.math.BigInteger r12 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r12 = r3.add(r12)
            long r5 = (long) r8
            java.math.BigInteger r13 = java.math.BigInteger.valueOf(r5)
            java.math.BigInteger r13 = r4.add(r13)
            com.cardinalcommerce.a.at r15 = new com.cardinalcommerce.a.at
            r15.<init>(r12, r13)
            java.math.BigInteger r12 = r15.cca_continue
            java.math.BigInteger r12 = r2.multiply(r12)
            java.math.BigInteger r11 = r11.subtract(r12)
            r12 = 2
            java.math.BigInteger r12 = java.math.BigInteger.valueOf(r12)
            r13 = r14[r1]
            java.math.BigInteger r12 = r12.multiply(r13)
            java.math.BigInteger r13 = r15.Cardinal
            java.math.BigInteger r12 = r12.multiply(r13)
            java.math.BigInteger r11 = r11.subtract(r12)
            r12 = r14[r1]
            java.math.BigInteger r13 = r15.cca_continue
            java.math.BigInteger r12 = r12.multiply(r13)
            r13 = r14[r0]
            java.math.BigInteger r14 = r15.Cardinal
            java.math.BigInteger r13 = r13.multiply(r14)
            java.math.BigInteger r12 = r12.subtract(r13)
            com.cardinalcommerce.a.at r13 = new com.cardinalcommerce.a.at
            r13.<init>(r11, r12)
            return r13
        L_0x0182:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "lambda0 and lambda1 do not have same scale"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getSize.configure(java.math.BigInteger, int, byte, java.math.BigInteger[], byte):com.cardinalcommerce.a.at");
    }

    public static byte[] Cardinal(byte b, at atVar, BigInteger bigInteger, BigInteger bigInteger2, at[] atVarArr) {
        BigInteger subtract;
        boolean z;
        if (b == 1 || b == -1) {
            BigInteger multiply = atVar.cca_continue.multiply(atVar.cca_continue);
            BigInteger multiply2 = atVar.cca_continue.multiply(atVar.Cardinal);
            BigInteger shiftLeft = atVar.Cardinal.multiply(atVar.Cardinal).shiftLeft(1);
            if (b == 1) {
                subtract = multiply.add(multiply2);
            } else if (b == -1) {
                subtract = multiply.subtract(multiply2);
            } else {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            int bitLength = subtract.add(shiftLeft).bitLength();
            byte[] bArr = new byte[(bitLength > 30 ? bitLength + 4 + 4 : 38)];
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger bigInteger3 = atVar.cca_continue;
            BigInteger bigInteger4 = atVar.Cardinal;
            int i = 0;
            while (true) {
                if (bigInteger3.equals(writeJSONString.getSDKVersion) && bigInteger4.equals(writeJSONString.getSDKVersion)) {
                    return bArr;
                }
                if (bigInteger3.testBit(0)) {
                    BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                    if (mod.compareTo(shiftRight) >= 0) {
                        mod = mod.subtract(bigInteger);
                    }
                    byte intValue = (byte) mod.intValue();
                    bArr[i] = intValue;
                    if (intValue < 0) {
                        intValue = (byte) (-intValue);
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        bigInteger3 = bigInteger3.subtract(atVarArr[intValue].cca_continue);
                        bigInteger4 = bigInteger4.subtract(atVarArr[intValue].Cardinal);
                    } else {
                        bigInteger3 = bigInteger3.add(atVarArr[intValue].cca_continue);
                        bigInteger4 = bigInteger4.add(atVarArr[intValue].Cardinal);
                    }
                } else {
                    bArr[i] = 0;
                }
                BigInteger shiftRight2 = bigInteger3.shiftRight(1);
                BigInteger add = b == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
                i++;
                BigInteger negate = bigInteger3.shiftRight(1).negate();
                bigInteger3 = add;
                bigInteger4 = negate;
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static JSONNavi.init[] cca_continue(JSONNavi.init init2, byte b) {
        byte[][] bArr = b == 0 ? cleanup : getWarnings;
        JSONNavi.init[] initArr = new JSONNavi.init[((bArr.length + 1) >>> 1)];
        initArr[0] = init2;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            JSONNavi.init init3 = (JSONNavi.init) init2.configure().init();
            JSONNavi.init init4 = (JSONNavi.init) init2.CardinalChallengeObserver();
            int i3 = 0;
            for (int length2 = bArr2.length - 1; length2 >= 0; length2--) {
                i3++;
                byte b2 = bArr2[length2];
                if (b2 != 0) {
                    init3 = (JSONNavi.init) init3.init(i3).cca_continue(b2 > 0 ? init2 : init4);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                init3 = init3.init(i3);
            }
            initArr[i2] = init3;
        }
        init2.configure().init((JSONNavi[]) initArr);
        return initArr;
    }
}
