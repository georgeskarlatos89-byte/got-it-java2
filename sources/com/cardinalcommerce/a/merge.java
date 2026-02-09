package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.util.Random;

public abstract class merge implements writeJSONString {

    public static abstract class Cardinal extends merge {
        public int CardinalError() {
            int Cardinal = Cardinal();
            merge merge = this;
            merge merge2 = merge;
            for (int i = 1; i < Cardinal; i++) {
                merge2 = merge2.getInstance();
                merge = merge.cca_continue(merge2);
            }
            if (merge.onCReqSuccess()) {
                return 0;
            }
            if (merge.cleanup()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class init extends merge {
    }

    public abstract int Cardinal();

    public abstract merge Cardinal(merge merge);

    public merge Cardinal(merge merge, merge merge2, merge merge3) {
        return init(merge).cca_continue(merge2.init(merge3));
    }

    public abstract merge cca_continue(merge merge);

    public abstract BigInteger cca_continue();

    public boolean cleanup() {
        return getSDKVersion() == 1;
    }

    public abstract merge configure();

    public merge configure(merge merge, merge merge2) {
        return getInstance().cca_continue(merge.init(merge2));
    }

    public merge configure(merge merge, merge merge2, merge merge3) {
        return init(merge).Cardinal(merge2.init(merge3));
    }

    public abstract merge getInstance();

    public abstract merge getInstance(merge merge);

    public int getSDKVersion() {
        return cca_continue().bitLength();
    }

    public abstract merge getWarnings();

    public abstract merge init();

    public merge init(int i) {
        merge merge = this;
        for (int i2 = 0; i2 < i; i2++) {
            merge = merge.getInstance();
        }
        return merge;
    }

    public abstract merge init(merge merge);

    public boolean onCReqSuccess() {
        return cca_continue().signum() == 0;
    }

    public abstract merge onValidated();

    public String toString() {
        return cca_continue().toString(16);
    }

    public boolean values() {
        return cca_continue().testBit(0);
    }

    public static class cca_continue extends init {
        private BigInteger Cardinal;
        private BigInteger cca_continue;
        private BigInteger configure;

        cca_continue(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.Cardinal = bigInteger;
            this.cca_continue = bigInteger2;
            this.configure = bigInteger3;
        }

        static BigInteger configure(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return CardinalRenderType.shiftLeft(bitLength).subtract(bigInteger);
        }

        private BigInteger configure(BigInteger bigInteger, BigInteger bigInteger2) {
            return getInstance(bigInteger.multiply(bigInteger2));
        }

        private BigInteger getInstance(BigInteger bigInteger) {
            if (this.cca_continue == null) {
                return bigInteger.mod(this.Cardinal);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.Cardinal.bitLength();
            boolean equals = this.cca_continue.equals(writeJSONString.CardinalRenderType);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.cca_continue);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.Cardinal) >= 0) {
                bigInteger = bigInteger.subtract(this.Cardinal);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.Cardinal.subtract(bigInteger);
        }

        public final int Cardinal() {
            return this.Cardinal.bitLength();
        }

        public final merge Cardinal(merge merge, merge merge2, merge merge3) {
            BigInteger bigInteger = this.configure;
            BigInteger cca_continue2 = merge.cca_continue();
            BigInteger cca_continue3 = merge2.cca_continue();
            BigInteger cca_continue4 = merge3.cca_continue();
            return new cca_continue(this.Cardinal, this.cca_continue, getInstance(bigInteger.multiply(cca_continue2).add(cca_continue3.multiply(cca_continue4))));
        }

        public final BigInteger cca_continue() {
            return this.configure;
        }

        public final merge configure() {
            BigInteger add = this.configure.add(writeJSONString.CardinalRenderType);
            if (add.compareTo(this.Cardinal) == 0) {
                add = writeJSONString.getSDKVersion;
            }
            return new cca_continue(this.Cardinal, this.cca_continue, add);
        }

        public final merge configure(merge merge, merge merge2) {
            BigInteger bigInteger = this.configure;
            BigInteger cca_continue2 = merge.cca_continue();
            BigInteger cca_continue3 = merge2.cca_continue();
            return new cca_continue(this.Cardinal, this.cca_continue, getInstance(bigInteger.multiply(bigInteger).add(cca_continue2.multiply(cca_continue3))));
        }

        public final merge configure(merge merge, merge merge2, merge merge3) {
            BigInteger bigInteger = this.configure;
            BigInteger cca_continue2 = merge.cca_continue();
            BigInteger cca_continue3 = merge2.cca_continue();
            BigInteger cca_continue4 = merge3.cca_continue();
            return new cca_continue(this.Cardinal, this.cca_continue, getInstance(bigInteger.multiply(cca_continue2).subtract(cca_continue3.multiply(cca_continue4))));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof cca_continue)) {
                return false;
            }
            cca_continue cca_continue2 = (cca_continue) obj;
            return this.Cardinal.equals(cca_continue2.Cardinal) && this.configure.equals(cca_continue2.configure);
        }

        public final merge getInstance() {
            BigInteger bigInteger = this.Cardinal;
            BigInteger bigInteger2 = this.cca_continue;
            BigInteger bigInteger3 = this.configure;
            return new cca_continue(bigInteger, bigInteger2, configure(bigInteger3, bigInteger3));
        }

        public final merge getInstance(merge merge) {
            return new cca_continue(this.Cardinal, this.cca_continue, configure(this.configure, init(merge.cca_continue())));
        }

        public final int hashCode() {
            return this.Cardinal.hashCode() ^ this.configure.hashCode();
        }

        public final merge init() {
            if (this.configure.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.Cardinal;
            return new cca_continue(bigInteger, this.cca_continue, bigInteger.subtract(this.configure));
        }

        public final merge init(merge merge) {
            return new cca_continue(this.Cardinal, this.cca_continue, configure(this.configure, merge.cca_continue()));
        }

        public final merge onValidated() {
            return new cca_continue(this.Cardinal, this.cca_continue, init(this.configure));
        }

        public final merge cca_continue(merge merge) {
            BigInteger bigInteger = this.Cardinal;
            BigInteger bigInteger2 = this.cca_continue;
            BigInteger add = this.configure.add(merge.cca_continue());
            if (add.compareTo(this.Cardinal) >= 0) {
                add = add.subtract(this.Cardinal);
            }
            return new cca_continue(bigInteger, bigInteger2, add);
        }

        public final merge Cardinal(merge merge) {
            BigInteger bigInteger = this.Cardinal;
            BigInteger bigInteger2 = this.cca_continue;
            BigInteger subtract = this.configure.subtract(merge.cca_continue());
            if (subtract.signum() < 0) {
                subtract = subtract.add(this.Cardinal);
            }
            return new cca_continue(bigInteger, bigInteger2, subtract);
        }

        public final merge getWarnings() {
            BigInteger bigInteger;
            if (onCReqSuccess() || cleanup()) {
                return this;
            }
            boolean z = false;
            if (this.Cardinal.testBit(0)) {
                Object obj = null;
                if (this.Cardinal.testBit(1)) {
                    BigInteger add = this.Cardinal.shiftRight(2).add(writeJSONString.CardinalRenderType);
                    BigInteger bigInteger2 = this.Cardinal;
                    cca_continue cca_continue2 = new cca_continue(bigInteger2, this.cca_continue, this.configure.modPow(add, bigInteger2));
                    if (cca_continue2.getInstance().equals(this)) {
                        return cca_continue2;
                    }
                    return null;
                } else if (this.Cardinal.testBit(2)) {
                    BigInteger modPow = this.configure.modPow(this.Cardinal.shiftRight(3), this.Cardinal);
                    BigInteger instance = getInstance(modPow.multiply(this.configure));
                    if (getInstance(instance.multiply(modPow)).equals(writeJSONString.CardinalRenderType)) {
                        cca_continue cca_continue3 = new cca_continue(this.Cardinal, this.cca_continue, instance);
                        if (cca_continue3.getInstance().equals(this)) {
                            return cca_continue3;
                        }
                        return null;
                    }
                    cca_continue cca_continue4 = new cca_continue(this.Cardinal, this.cca_continue, getInstance(instance.multiply(writeJSONString.CardinalEnvironment.modPow(this.Cardinal.shiftRight(2), this.Cardinal))));
                    if (cca_continue4.getInstance().equals(this)) {
                        return cca_continue4;
                    }
                    return null;
                } else {
                    BigInteger shiftRight = this.Cardinal.shiftRight(1);
                    if (!this.configure.modPow(shiftRight, this.Cardinal).equals(writeJSONString.CardinalRenderType)) {
                        return null;
                    }
                    BigInteger bigInteger3 = this.configure;
                    BigInteger shiftLeft = bigInteger3.shiftLeft(1);
                    if (shiftLeft.compareTo(this.Cardinal) >= 0) {
                        shiftLeft = shiftLeft.subtract(this.Cardinal);
                    }
                    BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
                    if (shiftLeft2.compareTo(this.Cardinal) >= 0) {
                        shiftLeft2 = shiftLeft2.subtract(this.Cardinal);
                    }
                    BigInteger add2 = shiftRight.add(writeJSONString.CardinalRenderType);
                    BigInteger subtract = this.Cardinal.subtract(writeJSONString.CardinalRenderType);
                    Random random = new Random();
                    while (true) {
                        BigInteger bigInteger4 = new BigInteger(this.Cardinal.bitLength(), random);
                        if (bigInteger4.compareTo(this.Cardinal) >= 0 || !getInstance(bigInteger4.multiply(bigInteger4).subtract(shiftLeft2)).modPow(shiftRight, this.Cardinal).equals(subtract)) {
                            Object obj2 = obj;
                            boolean z2 = z;
                            Object obj3 = obj2;
                            boolean z3 = z2;
                            obj = obj3;
                            z = z3;
                        } else {
                            int bitLength = add2.bitLength();
                            int lowestSetBit = add2.getLowestSetBit();
                            BigInteger bigInteger5 = writeJSONString.CardinalRenderType;
                            BigInteger bigInteger6 = writeJSONString.CardinalEnvironment;
                            int i = bitLength - 1;
                            BigInteger bigInteger7 = bigInteger4;
                            BigInteger bigInteger8 = writeJSONString.CardinalRenderType;
                            BigInteger bigInteger9 = writeJSONString.CardinalRenderType;
                            while (i >= lowestSetBit + 1) {
                                bigInteger8 = getInstance(bigInteger8.multiply(bigInteger9));
                                if (add2.testBit(i)) {
                                    bigInteger9 = getInstance(bigInteger8.multiply(bigInteger3));
                                    BigInteger instance2 = getInstance(bigInteger5.multiply(bigInteger7));
                                    BigInteger instance3 = getInstance(bigInteger7.multiply(bigInteger6).subtract(bigInteger4.multiply(bigInteger8)));
                                    bigInteger = shiftRight;
                                    bigInteger7 = getInstance(bigInteger7.multiply(bigInteger7).subtract(bigInteger9.shiftLeft(1)));
                                    bigInteger6 = instance3;
                                    bigInteger5 = instance2;
                                } else {
                                    bigInteger = shiftRight;
                                    bigInteger5 = getInstance(bigInteger5.multiply(bigInteger6).subtract(bigInteger8));
                                    bigInteger7 = getInstance(bigInteger7.multiply(bigInteger6).subtract(bigInteger4.multiply(bigInteger8)));
                                    bigInteger6 = getInstance(bigInteger6.multiply(bigInteger6).subtract(bigInteger8.shiftLeft(1)));
                                    bigInteger9 = bigInteger8;
                                }
                                i--;
                                shiftRight = bigInteger;
                            }
                            BigInteger bigInteger10 = shiftRight;
                            BigInteger instance4 = getInstance(bigInteger8.multiply(bigInteger9));
                            BigInteger instance5 = getInstance(instance4.multiply(bigInteger3));
                            BigInteger instance6 = getInstance(bigInteger5.multiply(bigInteger6).subtract(instance4));
                            BigInteger instance7 = getInstance(bigInteger7.multiply(bigInteger6).subtract(bigInteger4.multiply(instance4)));
                            BigInteger instance8 = getInstance(instance4.multiply(instance5));
                            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                                instance6 = getInstance(instance6.multiply(instance7));
                                instance7 = getInstance(instance7.multiply(instance7).subtract(instance8.shiftLeft(1)));
                                instance8 = getInstance(instance8.multiply(instance8));
                            }
                            BigInteger[] bigIntegerArr = new BigInteger[2];
                            if (getInstance(instance7.multiply(instance7)).equals(shiftLeft2)) {
                                BigInteger bigInteger11 = this.Cardinal;
                                BigInteger bigInteger12 = this.cca_continue;
                                if (instance7.testBit(0)) {
                                    instance7 = this.Cardinal.subtract(instance7);
                                }
                                return new cca_continue(bigInteger11, bigInteger12, instance7.shiftRight(1));
                            } else if (!instance6.equals(writeJSONString.CardinalRenderType) && !instance6.equals(subtract)) {
                                return null;
                            } else {
                                z = false;
                                shiftRight = bigInteger10;
                                obj = null;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("not done yet");
            }
        }

        private BigInteger init(BigInteger bigInteger) {
            int bitLength = this.Cardinal.bitLength();
            int i = (bitLength + 31) >> 5;
            int[] configure2 = getErrorMessage.configure(bitLength, this.Cardinal);
            int[] configure3 = getErrorMessage.configure(bitLength, bigInteger);
            int[] iArr = new int[i];
            X509CertUtils.init(configure2, configure3, iArr);
            return getErrorMessage.Cardinal(i, iArr);
        }
    }

    public static class configure extends Cardinal {
        private int Cardinal;
        private int cca_continue;
        private int[] configure;
        newInstanceArray init;

        public configure(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.Cardinal = 2;
                this.configure = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i3 > 0) {
                this.Cardinal = 3;
                this.configure = new int[]{i2, i3, i4};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.cca_continue = i;
            this.init = new newInstanceArray(bigInteger);
        }

        configure(int i, int[] iArr, newInstanceArray newinstancearray) {
            this.cca_continue = i;
            this.Cardinal = iArr.length == 1 ? 2 : 3;
            this.configure = iArr;
            this.init = newinstancearray;
        }

        public static void Cardinal(merge merge, merge merge2) {
            if (!(merge instanceof configure) || !(merge2 instanceof configure)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            configure configure2 = (configure) merge;
            configure configure3 = (configure) merge2;
            if (configure2.Cardinal != configure3.Cardinal) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            } else if (configure2.cca_continue != configure3.cca_continue || !getBackgroundColor.cca_continue(configure2.configure, configure3.configure)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        public final int Cardinal() {
            return this.cca_continue;
        }

        public final merge Cardinal(merge merge) {
            return cca_continue(merge);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.cardinalcommerce.a.newInstanceArray} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.cardinalcommerce.a.merge Cardinal(com.cardinalcommerce.a.merge r3, com.cardinalcommerce.a.merge r4, com.cardinalcommerce.a.merge r5) {
            /*
                r2 = this;
                com.cardinalcommerce.a.newInstanceArray r0 = r2.init
                com.cardinalcommerce.a.merge$configure r3 = (com.cardinalcommerce.a.merge.configure) r3
                com.cardinalcommerce.a.newInstanceArray r3 = r3.init
                com.cardinalcommerce.a.merge$configure r4 = (com.cardinalcommerce.a.merge.configure) r4
                com.cardinalcommerce.a.newInstanceArray r4 = r4.init
                com.cardinalcommerce.a.merge$configure r5 = (com.cardinalcommerce.a.merge.configure) r5
                com.cardinalcommerce.a.newInstanceArray r5 = r5.init
                com.cardinalcommerce.a.newInstanceArray r1 = r0.getInstance((com.cardinalcommerce.a.newInstanceArray) r3)
                com.cardinalcommerce.a.newInstanceArray r4 = r4.getInstance((com.cardinalcommerce.a.newInstanceArray) r5)
                if (r1 == r0) goto L_0x001a
                if (r1 != r3) goto L_0x0021
            L_0x001a:
                java.lang.Object r3 = r1.clone()
                r1 = r3
                com.cardinalcommerce.a.newInstanceArray r1 = (com.cardinalcommerce.a.newInstanceArray) r1
            L_0x0021:
                r1.configure((com.cardinalcommerce.a.newInstanceArray) r4)
                int r3 = r2.cca_continue
                int[] r4 = r2.configure
                r1.cca_continue(r3, r4)
                com.cardinalcommerce.a.merge$configure r3 = new com.cardinalcommerce.a.merge$configure
                int r4 = r2.cca_continue
                int[] r5 = r2.configure
                r3.<init>(r4, r5, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.merge.configure.Cardinal(com.cardinalcommerce.a.merge, com.cardinalcommerce.a.merge, com.cardinalcommerce.a.merge):com.cardinalcommerce.a.merge");
        }

        public final merge cca_continue(merge merge) {
            newInstanceArray newinstancearray = (newInstanceArray) this.init.clone();
            newinstancearray.configure(((configure) merge).init);
            return new configure(this.cca_continue, this.configure, newinstancearray);
        }

        public final boolean cleanup() {
            return this.init.configure();
        }

        public final merge configure(merge merge, merge merge2, merge merge3) {
            return Cardinal(merge, merge2, merge3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof configure)) {
                return false;
            }
            configure configure2 = (configure) obj;
            return this.cca_continue == configure2.cca_continue && this.Cardinal == configure2.Cardinal && getBackgroundColor.cca_continue(this.configure, configure2.configure) && this.init.equals(configure2.init);
        }

        public final merge getInstance() {
            int i = this.cca_continue;
            int[] iArr = this.configure;
            return new configure(i, iArr, this.init.Cardinal(i, iArr));
        }

        public final merge getInstance(merge merge) {
            return init(merge.onValidated());
        }

        public final int getSDKVersion() {
            return this.init.init();
        }

        public final int hashCode() {
            return (this.init.hashCode() ^ this.cca_continue) ^ getBackgroundColor.init(this.configure);
        }

        public final merge init() {
            return this;
        }

        public final merge init(int i) {
            if (i <= 0) {
                return this;
            }
            int i2 = this.cca_continue;
            int[] iArr = this.configure;
            return new configure(i2, iArr, this.init.getInstance(i, i2, iArr));
        }

        public final merge init(merge merge) {
            int i = this.cca_continue;
            int[] iArr = this.configure;
            return new configure(i, iArr, this.init.cca_continue(((configure) merge).init, i, iArr));
        }

        public final merge onValidated() {
            int i = this.cca_continue;
            int[] iArr = this.configure;
            return new configure(i, iArr, this.init.getInstance(i, iArr));
        }

        public final boolean onCReqSuccess() {
            long[] jArr = this.init.cca_continue;
            for (long j : jArr) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }

        public final boolean values() {
            newInstanceArray newinstancearray = this.init;
            return newinstancearray.cca_continue.length > 0 && (1 & newinstancearray.cca_continue[0]) != 0;
        }

        public final BigInteger cca_continue() {
            newInstanceArray newinstancearray = this.init;
            int configure2 = newinstancearray.configure(newinstancearray.cca_continue.length);
            if (configure2 == 0) {
                return writeJSONString.getSDKVersion;
            }
            int i = configure2 - 1;
            long j = newinstancearray.cca_continue[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) ((int) (j >>> (i3 << 3)));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[((i * 8) + i2)];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = configure2 - 2; i5 >= 0; i5--) {
                long j2 = newinstancearray.cca_continue[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) ((int) (j2 >>> (i6 << 3)));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }

        public final merge configure() {
            newInstanceArray newinstancearray;
            int i = this.cca_continue;
            int[] iArr = this.configure;
            newInstanceArray newinstancearray2 = this.init;
            if (newinstancearray2.cca_continue.length == 0) {
                newinstancearray = new newInstanceArray(new long[]{1});
            } else {
                int max = Math.max(1, newinstancearray2.configure(newinstancearray2.cca_continue.length));
                long[] jArr = new long[max];
                System.arraycopy(newinstancearray2.cca_continue, 0, jArr, 0, Math.min(newinstancearray2.cca_continue.length, max));
                jArr[0] = jArr[0] ^ 1;
                newinstancearray = new newInstanceArray(jArr);
            }
            return new configure(i, iArr, newinstancearray);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.cardinalcommerce.a.newInstanceArray} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.cardinalcommerce.a.merge configure(com.cardinalcommerce.a.merge r11, com.cardinalcommerce.a.merge r12) {
            /*
                r10 = this;
                com.cardinalcommerce.a.newInstanceArray r0 = r10.init
                com.cardinalcommerce.a.merge$configure r11 = (com.cardinalcommerce.a.merge.configure) r11
                com.cardinalcommerce.a.newInstanceArray r11 = r11.init
                com.cardinalcommerce.a.merge$configure r12 = (com.cardinalcommerce.a.merge.configure) r12
                com.cardinalcommerce.a.newInstanceArray r12 = r12.init
                long[] r1 = r0.cca_continue
                int r1 = r1.length
                int r1 = r0.configure((int) r1)
                if (r1 != 0) goto L_0x0015
                r4 = r0
                goto L_0x003e
            L_0x0015:
                int r1 = r1 << 1
                long[] r2 = new long[r1]
                r3 = 0
                r4 = r3
            L_0x001b:
                if (r4 >= r1) goto L_0x0039
                long[] r5 = r0.cca_continue
                int r6 = r4 >>> 1
                r6 = r5[r6]
                int r5 = r4 + 1
                int r8 = (int) r6
                long r8 = com.cardinalcommerce.a.newInstanceArray.getInstance((int) r8)
                r2[r4] = r8
                int r4 = r5 + 1
                r8 = 32
                long r6 = r6 >>> r8
                int r6 = (int) r6
                long r6 = com.cardinalcommerce.a.newInstanceArray.getInstance((int) r6)
                r2[r5] = r6
                goto L_0x001b
            L_0x0039:
                com.cardinalcommerce.a.newInstanceArray r4 = new com.cardinalcommerce.a.newInstanceArray
                r4.<init>(r2, r3, r1)
            L_0x003e:
                com.cardinalcommerce.a.newInstanceArray r11 = r11.getInstance((com.cardinalcommerce.a.newInstanceArray) r12)
                if (r4 != r0) goto L_0x004b
                java.lang.Object r12 = r4.clone()
                r4 = r12
                com.cardinalcommerce.a.newInstanceArray r4 = (com.cardinalcommerce.a.newInstanceArray) r4
            L_0x004b:
                r4.configure((com.cardinalcommerce.a.newInstanceArray) r11)
                int r11 = r10.cca_continue
                int[] r12 = r10.configure
                r4.cca_continue(r11, r12)
                com.cardinalcommerce.a.merge$configure r11 = new com.cardinalcommerce.a.merge$configure
                int r12 = r10.cca_continue
                int[] r0 = r10.configure
                r11.<init>(r12, r0, r4)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.merge.configure.configure(com.cardinalcommerce.a.merge, com.cardinalcommerce.a.merge):com.cardinalcommerce.a.merge");
        }

        public final merge getWarnings() {
            long[] jArr = this.init.cca_continue;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= jArr.length) {
                    z = true;
                    break;
                } else if (jArr[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            return (z || this.init.configure()) ? this : init(this.cca_continue - 1);
        }
    }
}
