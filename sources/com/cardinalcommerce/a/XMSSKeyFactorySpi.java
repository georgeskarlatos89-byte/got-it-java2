package com.cardinalcommerce.a;

import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public abstract class XMSSKeyFactorySpi {
    private static final BigInteger configure = BigInteger.valueOf(2);
    private static final BigInteger getInstance = BigInteger.valueOf(1);

    static {
        BigInteger.valueOf(3);
    }

    private static void getInstance(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() <= 0 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException(new StringBuilder("'").append(str).append("' must be non-null and >= 2").toString());
        }
    }

    public static boolean Cardinal(BigInteger bigInteger) {
        getInstance(bigInteger, "candidate");
        int intValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (!(intValue % 2 == 0 || intValue % 3 == 0 || intValue % 5 == 0 || intValue % 7 == 0 || intValue % 11 == 0 || intValue % 13 == 0 || intValue % 17 == 0 || intValue % 19 == 0 || intValue % 23 == 0)) {
            int intValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
            if (!(intValue2 % 29 == 0 || intValue2 % 31 == 0 || intValue2 % 37 == 0 || intValue2 % 41 == 0 || intValue2 % 43 == 0)) {
                int intValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
                if (!(intValue3 % 47 == 0 || intValue3 % 53 == 0 || intValue3 % 59 == 0 || intValue3 % 61 == 0 || intValue3 % 67 == 0)) {
                    int intValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
                    if (!(intValue4 % 71 == 0 || intValue4 % 73 == 0 || intValue4 % 79 == 0 || intValue4 % 83 == 0)) {
                        int intValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
                        if (!(intValue5 % 89 == 0 || intValue5 % 97 == 0 || intValue5 % 101 == 0 || intValue5 % 103 == 0)) {
                            int intValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
                            if (!(intValue6 % 107 == 0 || intValue6 % 109 == 0 || intValue6 % 113 == 0 || intValue6 % 127 == 0)) {
                                int intValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
                                if (!(intValue7 % Opcodes.LXOR == 0 || intValue7 % Opcodes.L2F == 0 || intValue7 % Opcodes.F2I == 0 || intValue7 % Opcodes.FCMPL == 0)) {
                                    int intValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
                                    if (!(intValue8 % Opcodes.DCMPL == 0 || intValue8 % Opcodes.IFGT == 0 || intValue8 % Opcodes.IF_ICMPGT == 0 || intValue8 % Opcodes.GOTO == 0)) {
                                        int intValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
                                        if (!(intValue9 % Opcodes.LRETURN == 0 || intValue9 % Opcodes.PUTSTATIC == 0 || intValue9 % Opcodes.PUTFIELD == 0 || intValue9 % Opcodes.ATHROW == 0)) {
                                            int intValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
                                            return intValue10 % Opcodes.INSTANCEOF == 0 || intValue10 % Opcodes.MULTIANEWARRAY == 0 || intValue10 % Opcodes.IFNONNULL == 0 || intValue10 % 211 == 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[LOOP:0: B:10:0x002f->B:26:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Cardinal(java.math.BigInteger r10, java.security.SecureRandom r11, int r12) {
        /*
            java.lang.String r0 = "candidate"
            getInstance(r10, r0)
            if (r11 == 0) goto L_0x0077
            if (r12 <= 0) goto L_0x006f
            int r0 = r10.bitLength()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x0012
            return r2
        L_0x0012:
            r0 = 0
            boolean r1 = r10.testBit(r0)
            if (r1 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.math.BigInteger r1 = getInstance
            java.math.BigInteger r1 = r10.subtract(r1)
            java.math.BigInteger r3 = configure
            java.math.BigInteger r3 = r10.subtract(r3)
            int r4 = r1.getLowestSetBit()
            java.math.BigInteger r5 = r1.shiftRight(r4)
            r6 = r0
        L_0x002f:
            if (r6 >= r12) goto L_0x006e
            java.math.BigInteger r7 = configure
            java.math.BigInteger r7 = com.cardinalcommerce.a.setCornerRadius.Cardinal(r7, r3, r11)
            java.math.BigInteger r7 = r7.modPow(r5, r10)
            java.math.BigInteger r8 = getInstance
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0067
            boolean r8 = r7.equals(r1)
            if (r8 == 0) goto L_0x004a
            goto L_0x0067
        L_0x004a:
            r8 = r2
        L_0x004b:
            if (r8 >= r4) goto L_0x0062
            java.math.BigInteger r9 = configure
            java.math.BigInteger r7 = r7.modPow(r9, r10)
            boolean r9 = r7.equals(r1)
            if (r9 == 0) goto L_0x005a
            goto L_0x0067
        L_0x005a:
            java.math.BigInteger r9 = getInstance
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0064
        L_0x0062:
            r7 = r0
            goto L_0x0068
        L_0x0064:
            int r8 = r8 + 1
            goto L_0x004b
        L_0x0067:
            r7 = r2
        L_0x0068:
            if (r7 != 0) goto L_0x006b
            return r0
        L_0x006b:
            int r6 = r6 + 1
            goto L_0x002f
        L_0x006e:
            return r2
        L_0x006f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "'iterations' must be > 0"
            r10.<init>(r11)
            throw r10
        L_0x0077:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "'random' cannot be null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.XMSSKeyFactorySpi.Cardinal(java.math.BigInteger, java.security.SecureRandom, int):boolean");
    }
}
