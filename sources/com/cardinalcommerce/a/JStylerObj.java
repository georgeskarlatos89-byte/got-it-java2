package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.merge;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.objectweb.asm.Opcodes;

public final class JStylerObj implements GMCipherSpi.SM2withSha512 {
    private int cca_continue;
    private byte[] configure;
    private IESCipher.ECIESwithAESCBC getInstance;
    private byte[] init;

    public final class Escape4Web extends JSONNavi.init {
        public Escape4Web(toJSONString tojsonstring, merge merge, merge merge2) {
            this(tojsonstring, merge, merge2, false);
        }

        public Escape4Web(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
            super(tojsonstring, merge, merge2);
            if ((merge == null) == (merge2 != null ? false : true)) {
                this.Cardinal = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        Escape4Web(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
            super(tojsonstring, merge, merge2, mergeArr);
            this.Cardinal = z;
        }

        public final boolean CardinalActionCode() {
            merge valueOf = valueOf();
            return !valueOf.onCReqSuccess() && CardinalEnvironment().values() != valueOf.values();
        }

        public final JSONNavi CardinalChallengeObserver() {
            if (getString()) {
                return this;
            }
            merge merge = this.init;
            if (merge.onCReqSuccess()) {
                return this;
            }
            merge merge2 = this.cca_continue;
            merge merge3 = this.getInstance[0];
            toJSONString tojsonstring = this.configure;
            merge[] mergeArr = {merge3};
            return new Escape4Web(tojsonstring, merge, merge2.cca_continue(merge3), mergeArr, this.Cardinal);
        }

        public final JSONNavi cca_continue(JSONNavi jSONNavi) {
            merge merge;
            merge merge2;
            merge merge3;
            merge merge4;
            merge merge5;
            merge merge6;
            if (getString()) {
                return jSONNavi;
            }
            if (jSONNavi.getString()) {
                return this;
            }
            toJSONString configure = configure();
            merge merge7 = this.init;
            merge valueOf = jSONNavi.valueOf();
            if (merge7.onCReqSuccess()) {
                return valueOf.onCReqSuccess() ? configure.init() : jSONNavi.cca_continue(this);
            }
            merge merge8 = this.cca_continue;
            merge merge9 = this.getInstance[0];
            merge CardinalEnvironment = jSONNavi.CardinalEnvironment();
            merge instance = jSONNavi.getInstance(0);
            boolean cleanup = merge9.cleanup();
            if (!cleanup) {
                merge2 = valueOf.init(merge9);
                merge = CardinalEnvironment.init(merge9);
            } else {
                merge2 = valueOf;
                merge = CardinalEnvironment;
            }
            boolean cleanup2 = instance.cleanup();
            if (!cleanup2) {
                merge7 = merge7.init(instance);
                merge3 = merge8.init(instance);
            } else {
                merge3 = merge8;
            }
            merge cca_continue = merge3.cca_continue(merge);
            merge cca_continue2 = merge7.cca_continue(merge2);
            if (cca_continue2.onCReqSuccess()) {
                return cca_continue.onCReqSuccess() ? getActionCode() : configure.init();
            }
            if (valueOf.onCReqSuccess()) {
                JSONNavi CardinalRenderType = CardinalRenderType();
                merge onValidated = CardinalRenderType.onValidated();
                merge sDKVersion = CardinalRenderType.getSDKVersion();
                merge instance2 = sDKVersion.cca_continue(CardinalEnvironment).getInstance(onValidated);
                merge5 = instance2.getInstance().cca_continue(instance2).cca_continue(onValidated).configure();
                if (merge5.onCReqSuccess()) {
                    return new Escape4Web(configure, merge5, configure.cleanup().getWarnings(), this.Cardinal);
                }
                merge cca_continue3 = instance2.init(onValidated.cca_continue(merge5)).cca_continue(merge5).cca_continue(sDKVersion).getInstance(merge5).cca_continue(merge5);
                merge6 = configure.init(writeJSONString.CardinalRenderType);
                merge4 = cca_continue3;
            } else {
                merge instance3 = cca_continue2.getInstance();
                merge init = cca_continue.init(merge7);
                merge init2 = cca_continue.init(merge2);
                merge init3 = init.init(init2);
                if (init3.onCReqSuccess()) {
                    return new Escape4Web(configure, init3, configure.cleanup().getWarnings(), this.Cardinal);
                }
                merge init4 = cca_continue.init(instance3);
                merge init5 = !cleanup2 ? init4.init(instance) : init4;
                merge configure2 = init2.cca_continue(instance3).configure(init5, merge8.cca_continue(merge9));
                if (!cleanup) {
                    init5 = init5.init(merge9);
                }
                merge5 = init3;
                merge4 = configure2;
                merge6 = init5;
            }
            return new Escape4Web(configure, merge5, merge4, new merge[]{merge6}, this.Cardinal);
        }

        public final JSONNavi configure(JSONNavi jSONNavi) {
            if (getString()) {
                return jSONNavi;
            }
            if (jSONNavi.getString()) {
                return getActionCode();
            }
            toJSONString configure = configure();
            merge merge = this.init;
            if (merge.onCReqSuccess()) {
                return jSONNavi;
            }
            merge valueOf = jSONNavi.valueOf();
            merge instance = jSONNavi.getInstance(0);
            if (valueOf.onCReqSuccess() || !instance.cleanup()) {
                return getActionCode().cca_continue(jSONNavi);
            }
            merge merge2 = this.cca_continue;
            merge merge3 = this.getInstance[0];
            merge CardinalEnvironment = jSONNavi.CardinalEnvironment();
            merge instance2 = merge.getInstance();
            merge instance3 = merge2.getInstance();
            merge instance4 = merge3.getInstance();
            merge cca_continue = instance4.cca_continue(instance3).cca_continue(merge2.init(merge3));
            merge Cardinal = CardinalEnvironment.init(instance4).cca_continue(instance3).Cardinal(cca_continue, instance2, instance4);
            merge init = valueOf.init(instance4);
            merge instance5 = init.cca_continue(cca_continue).getInstance();
            if (instance5.onCReqSuccess()) {
                return Cardinal.onCReqSuccess() ? jSONNavi.getActionCode() : configure.init();
            }
            if (Cardinal.onCReqSuccess()) {
                return new Escape4Web(configure, Cardinal, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge init2 = Cardinal.getInstance().init(init);
            merge init3 = Cardinal.init(instance5).init(instance4);
            return new Escape4Web(configure, init2, Cardinal.cca_continue(instance5).getInstance().Cardinal(cca_continue, CardinalEnvironment.configure(), init3), new merge[]{init3}, this.Cardinal);
        }

        public final JSONNavi getActionCode() {
            if (getString()) {
                return this;
            }
            toJSONString configure = configure();
            merge merge = this.init;
            if (merge.onCReqSuccess()) {
                return configure.init();
            }
            merge merge2 = this.cca_continue;
            merge merge3 = this.getInstance[0];
            boolean cleanup = merge3.cleanup();
            merge init = cleanup ? merge2 : merge2.init(merge3);
            merge instance = cleanup ? merge3 : merge3.getInstance();
            merge cca_continue = merge2.getInstance().cca_continue(init).cca_continue(instance);
            if (cca_continue.onCReqSuccess()) {
                return new Escape4Web(configure, cca_continue, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge instance2 = cca_continue.getInstance();
            merge init2 = cleanup ? cca_continue : cca_continue.init(instance);
            if (!cleanup) {
                merge = merge.init(merge3);
            }
            return new Escape4Web(configure, instance2, merge.configure(cca_continue, init).cca_continue(instance2).cca_continue(init2), new merge[]{init2}, this.Cardinal);
        }

        public final merge getSDKVersion() {
            merge merge = this.init;
            merge merge2 = this.cca_continue;
            if (getString() || merge.onCReqSuccess()) {
                return merge2;
            }
            merge init = merge2.cca_continue(merge).init(merge);
            merge merge3 = this.getInstance[0];
            return !merge3.cleanup() ? init.getInstance(merge3) : init;
        }

        public final JSONNavi init() {
            return new Escape4Web((toJSONString) null, onCReqSuccess(), getWarnings());
        }
    }

    public JStylerObj() {
    }

    static void Cardinal(long[] jArr, long[] jArr2) {
        EncryptedJWT.Cardinal(jArr[0], jArr2, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr2, 2);
        EncryptedJWT.Cardinal(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    static void Cardinal(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    private static void cca_continue(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        long j4 = j2 << 1;
        jArr2[2] = j4;
        long j5 = j4 ^ j2;
        jArr2[3] = j5;
        long j6 = j4 << 1;
        jArr2[4] = j6;
        jArr2[5] = j6 ^ j2;
        long j7 = j5 << 1;
        jArr2[6] = j7;
        jArr2[7] = j7 ^ j2;
        int i2 = (int) j3;
        long j8 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j9 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j8);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j8 >>> 49) ^ (j9 << 15));
    }

    private static void cca_continue(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void configure(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    private static void getInstance(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    static void init(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        cca_continue(jArr, jArr4);
        cca_continue(jArr2, jArr5);
        long[] jArr6 = jArr3;
        cca_continue(jArr4[0], jArr5[0], jArr6, 0);
        cca_continue(jArr4[1], jArr5[1], jArr6, 1);
        cca_continue(jArr4[2], jArr5[2], jArr6, 2);
        cca_continue(jArr4[3], jArr5[3], jArr6, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        cca_continue(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        cca_continue(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        cca_continue(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        cca_continue(j, j3, jArr7, 0);
        cca_continue(j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        getInstance(jArr3);
    }

    public final class EscapeLT extends toJSONString.cca_continue {
        private Escape4Web getWarnings = new Escape4Web(this, (merge) null, (merge) null);

        public final toJSONString Cardinal() {
            return new EscapeLT();
        }

        public final boolean Cardinal(int i) {
            return i == 6;
        }

        public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
            return new Escape4Web(this, merge, merge2, z);
        }

        public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
            return new Escape4Web(this, merge, merge2, mergeArr, z);
        }

        public final int getInstance() {
            return 233;
        }

        public final JSONNavi init() {
            return this.getWarnings;
        }

        public final merge init(BigInteger bigInteger) {
            return new MPAgressive(bigInteger);
        }

        public final boolean values() {
            return false;
        }

        public EscapeLT() {
            super(233, 74, 0, 0);
            this.getInstance = new MPAgressive(BigInteger.valueOf(1));
            this.Cardinal = new MPAgressive(new BigInteger(1, getHeadingTextFontName.init("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
            this.init = new BigInteger(1, getHeadingTextFontName.init("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
            this.configure = BigInteger.valueOf(2);
            this.onValidated = 6;
        }

        public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
            final long[] jArr = new long[((i << 2) << 1)];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                JSONNavi jSONNavi = jSONNaviArr[i3];
                long[] jArr2 = ((MPAgressive) jSONNavi.valueOf()).init;
                jArr[i2] = jArr2[0];
                jArr[i2 + 1] = jArr2[1];
                jArr[i2 + 2] = jArr2[2];
                jArr[i2 + 3] = jArr2[3];
                int i4 = i2 + 4;
                long[] jArr3 = ((MPAgressive) jSONNavi.CardinalEnvironment()).init;
                jArr[i4] = jArr3[0];
                jArr[i4 + 1] = jArr3[1];
                jArr[i4 + 2] = jArr3[2];
                jArr[i4 + 3] = jArr3[3];
                i2 = i4 + 4;
            }
            return new JSONArray() {
                public final int getInstance() {
                    return i;
                }

                public final JSONNavi configure(int i) {
                    long[] jArr = new long[4];
                    long[] jArr2 = new long[4];
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        long j = (long) (((i3 ^ i) - 1) >> 31);
                        for (int i4 = 0; i4 < 4; i4++) {
                            long j2 = jArr[i4];
                            long[] jArr3 = jArr;
                            jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                            jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 4) + i4] & j);
                        }
                        i2 += 8;
                    }
                    return new Escape4Web(EscapeLT.this, new MPAgressive(jArr), new MPAgressive(jArr2), false);
                }
            };
        }
    }

    public final class MPAgressive extends merge.Cardinal {
        protected long[] init;

        protected MPAgressive(long[] jArr) {
            this.init = jArr;
        }

        public final int Cardinal() {
            return 233;
        }

        public final merge Cardinal(merge merge) {
            return cca_continue(merge);
        }

        public final BigInteger cca_continue() {
            return setErrorCode.init(this.init);
        }

        public final boolean cleanup() {
            return setErrorCode.Cardinal(this.init);
        }

        public final merge configure(merge merge, merge merge2, merge merge3) {
            return Cardinal(merge, merge2, merge3);
        }

        public final int hashCode() {
            return getBackgroundColor.Cardinal(this.init, 4) ^ 2330074;
        }

        public final merge init() {
            return this;
        }

        public final boolean values() {
            return (this.init[0] & 1) != 0;
        }

        public MPAgressive(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
                throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
            }
            long[] init2 = setErrorCode.init(bigInteger);
            long j = init2[3];
            long j2 = j >>> 41;
            init2[0] = init2[0] ^ j2;
            init2[1] = (j2 << 10) ^ init2[1];
            init2[3] = j & 2199023255551L;
            this.init = init2;
        }

        public MPAgressive() {
            this.init = new long[4];
        }

        public final boolean onCReqSuccess() {
            long[] jArr = this.init;
            for (int i = 0; i < 4; i++) {
                if (jArr[i] != 0) {
                    return false;
                }
            }
            return true;
        }

        public final merge cca_continue(merge merge) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPAgressive) merge).init;
            return new MPAgressive(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
        }

        public final merge configure() {
            long[] jArr = this.init;
            return new MPAgressive(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
        }

        public final merge init(merge merge) {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            isSpecialOpen.configure(this.init, ((MPAgressive) merge).init, jArr2);
            isSpecialOpen.getInstance(jArr2, jArr);
            return new MPAgressive(jArr);
        }

        public final merge Cardinal(merge merge, merge merge2, merge merge3) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPAgressive) merge).init;
            long[] jArr3 = ((MPAgressive) merge2).init;
            long[] jArr4 = ((MPAgressive) merge3).init;
            long[] jArr5 = new long[8];
            long[] jArr6 = new long[8];
            isSpecialOpen.configure(jArr, jArr2, jArr6);
            isSpecialOpen.cca_continue(jArr5, jArr6, jArr5);
            long[] jArr7 = new long[8];
            isSpecialOpen.configure(jArr3, jArr4, jArr7);
            isSpecialOpen.cca_continue(jArr5, jArr7, jArr5);
            long[] jArr8 = new long[4];
            isSpecialOpen.getInstance(jArr5, jArr8);
            return new MPAgressive(jArr8);
        }

        public final merge getInstance(merge merge) {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            isSpecialOpen.configure(this.init, ((MPAgressive) merge.onValidated()).init, jArr2);
            isSpecialOpen.getInstance(jArr2, jArr);
            return new MPAgressive(jArr);
        }

        public final merge getInstance() {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            isSpecialOpen.init(this.init, jArr2);
            isSpecialOpen.getInstance(jArr2, jArr);
            return new MPAgressive(jArr);
        }

        public final merge configure(merge merge, merge merge2) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPAgressive) merge).init;
            long[] jArr3 = ((MPAgressive) merge2).init;
            long[] jArr4 = new long[8];
            long[] jArr5 = new long[8];
            isSpecialOpen.init(jArr, jArr5);
            isSpecialOpen.cca_continue(jArr4, jArr5, jArr4);
            long[] jArr6 = new long[8];
            isSpecialOpen.configure(jArr2, jArr3, jArr6);
            isSpecialOpen.cca_continue(jArr4, jArr6, jArr4);
            long[] jArr7 = new long[4];
            isSpecialOpen.getInstance(jArr4, jArr7);
            return new MPAgressive(jArr7);
        }

        public final merge init(int i) {
            if (i <= 0) {
                return this;
            }
            long[] jArr = new long[4];
            isSpecialOpen.cca_continue(this.init, i, jArr);
            return new MPAgressive(jArr);
        }

        public final int CardinalError() {
            long[] jArr = this.init;
            return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
        }

        public final merge onValidated() {
            long[] jArr = new long[4];
            long[] jArr2 = this.init;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                } else if (jArr2[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                long[] jArr3 = new long[4];
                long[] jArr4 = new long[4];
                long[] jArr5 = new long[8];
                isSpecialOpen.init(jArr2, jArr5);
                isSpecialOpen.getInstance(jArr5, jArr3);
                long[] jArr6 = new long[8];
                isSpecialOpen.configure(jArr3, jArr2, jArr6);
                isSpecialOpen.getInstance(jArr6, jArr3);
                long[] jArr7 = new long[8];
                isSpecialOpen.init(jArr3, jArr7);
                isSpecialOpen.getInstance(jArr7, jArr3);
                long[] jArr8 = new long[8];
                isSpecialOpen.configure(jArr3, jArr2, jArr8);
                isSpecialOpen.getInstance(jArr8, jArr3);
                isSpecialOpen.cca_continue(jArr3, 3, jArr4);
                long[] jArr9 = new long[8];
                isSpecialOpen.configure(jArr4, jArr3, jArr9);
                isSpecialOpen.getInstance(jArr9, jArr4);
                long[] jArr10 = new long[8];
                isSpecialOpen.init(jArr4, jArr10);
                isSpecialOpen.getInstance(jArr10, jArr4);
                long[] jArr11 = new long[8];
                isSpecialOpen.configure(jArr4, jArr2, jArr11);
                isSpecialOpen.getInstance(jArr11, jArr4);
                isSpecialOpen.cca_continue(jArr4, 7, jArr3);
                long[] jArr12 = new long[8];
                isSpecialOpen.configure(jArr3, jArr4, jArr12);
                isSpecialOpen.getInstance(jArr12, jArr3);
                isSpecialOpen.cca_continue(jArr3, 14, jArr4);
                long[] jArr13 = new long[8];
                isSpecialOpen.configure(jArr4, jArr3, jArr13);
                isSpecialOpen.getInstance(jArr13, jArr4);
                long[] jArr14 = new long[8];
                isSpecialOpen.init(jArr4, jArr14);
                isSpecialOpen.getInstance(jArr14, jArr4);
                long[] jArr15 = new long[8];
                isSpecialOpen.configure(jArr4, jArr2, jArr15);
                isSpecialOpen.getInstance(jArr15, jArr4);
                isSpecialOpen.cca_continue(jArr4, 29, jArr3);
                long[] jArr16 = new long[8];
                isSpecialOpen.configure(jArr3, jArr4, jArr16);
                isSpecialOpen.getInstance(jArr16, jArr3);
                isSpecialOpen.cca_continue(jArr3, 58, jArr4);
                long[] jArr17 = new long[8];
                isSpecialOpen.configure(jArr4, jArr3, jArr17);
                isSpecialOpen.getInstance(jArr17, jArr4);
                isSpecialOpen.cca_continue(jArr4, 116, jArr3);
                long[] jArr18 = new long[8];
                isSpecialOpen.configure(jArr3, jArr4, jArr18);
                isSpecialOpen.getInstance(jArr18, jArr3);
                long[] jArr19 = new long[8];
                isSpecialOpen.init(jArr3, jArr19);
                isSpecialOpen.getInstance(jArr19, jArr);
                return new MPAgressive(jArr);
            }
            throw new IllegalStateException();
        }

        public final merge getWarnings() {
            long[] jArr = new long[4];
            long[] jArr2 = this.init;
            int i = 0;
            long instance = EncryptedJWT.getInstance(jArr2[0]);
            long instance2 = EncryptedJWT.getInstance(jArr2[1]);
            long j = (instance & 4294967295L) | (instance2 << 32);
            long j2 = (instance >>> 32) | (instance2 & -4294967296L);
            long instance3 = EncryptedJWT.getInstance(jArr2[2]);
            int i2 = 3;
            long instance4 = EncryptedJWT.getInstance(jArr2[3]);
            long j3 = (4294967295L & instance3) | (instance4 << 32);
            long j4 = (instance3 >>> 32) | (instance4 & -4294967296L);
            long j5 = j4 >>> 27;
            long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
            long j7 = j2 ^ (j2 << 37);
            long[] jArr3 = new long[8];
            int[] iArr = {32, 117, Opcodes.ATHROW};
            while (i < i2) {
                int i3 = iArr[i];
                int i4 = i3 >>> 6;
                int i5 = i3 & 63;
                jArr3[i4] = jArr3[i4] ^ (j7 << i5);
                int i6 = i4 + 1;
                int i7 = -i5;
                jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i7));
                int i8 = i4 + 2;
                jArr3[i8] = jArr3[i8] ^ ((j5 << i5) | (j6 >>> i7));
                i2 = 3;
                int i9 = i4 + 3;
                jArr3[i9] = jArr3[i9] ^ (j5 >>> i7);
                i++;
            }
            isSpecialOpen.getInstance(jArr3, jArr);
            jArr[0] = jArr[0] ^ j;
            jArr[1] = jArr[1] ^ j3;
            return new MPAgressive(jArr);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MPAgressive)) {
                return false;
            }
            long[] jArr = this.init;
            long[] jArr2 = ((MPAgressive) obj).init;
            for (int i = 3; i >= 0; i--) {
                if (jArr[i] != jArr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final class MPSimple extends merge.Cardinal {
        protected long[] init;

        protected MPSimple(long[] jArr) {
            this.init = jArr;
        }

        public final int Cardinal() {
            return 239;
        }

        public final merge Cardinal(merge merge) {
            return cca_continue(merge);
        }

        public final BigInteger cca_continue() {
            return setErrorCode.init(this.init);
        }

        public final boolean cleanup() {
            return setErrorCode.Cardinal(this.init);
        }

        public final merge configure(merge merge, merge merge2, merge merge3) {
            return Cardinal(merge, merge2, merge3);
        }

        public final int hashCode() {
            return getBackgroundColor.Cardinal(this.init, 4) ^ 23900158;
        }

        public final merge init() {
            return this;
        }

        public final boolean values() {
            return (this.init[0] & 1) != 0;
        }

        public MPSimple(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
                throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
            }
            long[] init2 = setErrorCode.init(bigInteger);
            long j = init2[3];
            long j2 = j >>> 47;
            init2[0] = init2[0] ^ j2;
            init2[2] = (j2 << 30) ^ init2[2];
            init2[3] = j & 140737488355327L;
            this.init = init2;
        }

        public MPSimple() {
            this.init = new long[4];
        }

        public final boolean onCReqSuccess() {
            long[] jArr = this.init;
            for (int i = 0; i < 4; i++) {
                if (jArr[i] != 0) {
                    return false;
                }
            }
            return true;
        }

        public final merge cca_continue(merge merge) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPSimple) merge).init;
            return new MPSimple(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
        }

        public final merge configure() {
            long[] jArr = this.init;
            return new MPSimple(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
        }

        public final merge init(merge merge) {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            MPTrue.Cardinal(this.init, ((MPSimple) merge).init, jArr2);
            MPTrue.cca_continue(jArr2, jArr);
            return new MPSimple(jArr);
        }

        public final merge Cardinal(merge merge, merge merge2, merge merge3) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPSimple) merge).init;
            long[] jArr3 = ((MPSimple) merge2).init;
            long[] jArr4 = ((MPSimple) merge3).init;
            long[] jArr5 = new long[8];
            long[] jArr6 = new long[8];
            MPTrue.Cardinal(jArr, jArr2, jArr6);
            MPTrue.cca_continue(jArr5, jArr6, jArr5);
            long[] jArr7 = new long[8];
            MPTrue.Cardinal(jArr3, jArr4, jArr7);
            MPTrue.cca_continue(jArr5, jArr7, jArr5);
            long[] jArr8 = new long[4];
            MPTrue.cca_continue(jArr5, jArr8);
            return new MPSimple(jArr8);
        }

        public final merge getInstance(merge merge) {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            MPTrue.Cardinal(this.init, ((MPSimple) merge.onValidated()).init, jArr2);
            MPTrue.cca_continue(jArr2, jArr);
            return new MPSimple(jArr);
        }

        public final merge getInstance() {
            long[] jArr = new long[4];
            long[] jArr2 = new long[8];
            MPTrue.Cardinal(this.init, jArr2);
            MPTrue.cca_continue(jArr2, jArr);
            return new MPSimple(jArr);
        }

        public final merge configure(merge merge, merge merge2) {
            long[] jArr = this.init;
            long[] jArr2 = ((MPSimple) merge).init;
            long[] jArr3 = ((MPSimple) merge2).init;
            long[] jArr4 = new long[8];
            long[] jArr5 = new long[8];
            MPTrue.Cardinal(jArr, jArr5);
            MPTrue.cca_continue(jArr4, jArr5, jArr4);
            long[] jArr6 = new long[8];
            MPTrue.Cardinal(jArr2, jArr3, jArr6);
            MPTrue.cca_continue(jArr4, jArr6, jArr4);
            long[] jArr7 = new long[4];
            MPTrue.cca_continue(jArr4, jArr7);
            return new MPSimple(jArr7);
        }

        public final merge init(int i) {
            if (i <= 0) {
                return this;
            }
            long[] jArr = new long[4];
            MPTrue.configure(this.init, i, jArr);
            return new MPSimple(jArr);
        }

        public final int CardinalError() {
            long[] jArr = this.init;
            return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
        }

        public final merge onValidated() {
            long[] jArr = new long[4];
            long[] jArr2 = this.init;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                } else if (jArr2[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                long[] jArr3 = new long[4];
                long[] jArr4 = new long[4];
                long[] jArr5 = new long[8];
                MPTrue.Cardinal(jArr2, jArr5);
                MPTrue.cca_continue(jArr5, jArr3);
                long[] jArr6 = new long[8];
                MPTrue.Cardinal(jArr3, jArr2, jArr6);
                MPTrue.cca_continue(jArr6, jArr3);
                long[] jArr7 = new long[8];
                MPTrue.Cardinal(jArr3, jArr7);
                MPTrue.cca_continue(jArr7, jArr3);
                long[] jArr8 = new long[8];
                MPTrue.Cardinal(jArr3, jArr2, jArr8);
                MPTrue.cca_continue(jArr8, jArr3);
                MPTrue.configure(jArr3, 3, jArr4);
                long[] jArr9 = new long[8];
                MPTrue.Cardinal(jArr4, jArr3, jArr9);
                MPTrue.cca_continue(jArr9, jArr4);
                long[] jArr10 = new long[8];
                MPTrue.Cardinal(jArr4, jArr10);
                MPTrue.cca_continue(jArr10, jArr4);
                long[] jArr11 = new long[8];
                MPTrue.Cardinal(jArr4, jArr2, jArr11);
                MPTrue.cca_continue(jArr11, jArr4);
                MPTrue.configure(jArr4, 7, jArr3);
                long[] jArr12 = new long[8];
                MPTrue.Cardinal(jArr3, jArr4, jArr12);
                MPTrue.cca_continue(jArr12, jArr3);
                MPTrue.configure(jArr3, 14, jArr4);
                long[] jArr13 = new long[8];
                MPTrue.Cardinal(jArr4, jArr3, jArr13);
                MPTrue.cca_continue(jArr13, jArr4);
                long[] jArr14 = new long[8];
                MPTrue.Cardinal(jArr4, jArr14);
                MPTrue.cca_continue(jArr14, jArr4);
                long[] jArr15 = new long[8];
                MPTrue.Cardinal(jArr4, jArr2, jArr15);
                MPTrue.cca_continue(jArr15, jArr4);
                MPTrue.configure(jArr4, 29, jArr3);
                long[] jArr16 = new long[8];
                MPTrue.Cardinal(jArr3, jArr4, jArr16);
                MPTrue.cca_continue(jArr16, jArr3);
                long[] jArr17 = new long[8];
                MPTrue.Cardinal(jArr3, jArr17);
                MPTrue.cca_continue(jArr17, jArr3);
                long[] jArr18 = new long[8];
                MPTrue.Cardinal(jArr3, jArr2, jArr18);
                MPTrue.cca_continue(jArr18, jArr3);
                MPTrue.configure(jArr3, 59, jArr4);
                long[] jArr19 = new long[8];
                MPTrue.Cardinal(jArr4, jArr3, jArr19);
                MPTrue.cca_continue(jArr19, jArr4);
                long[] jArr20 = new long[8];
                MPTrue.Cardinal(jArr4, jArr20);
                MPTrue.cca_continue(jArr20, jArr4);
                long[] jArr21 = new long[8];
                MPTrue.Cardinal(jArr4, jArr2, jArr21);
                MPTrue.cca_continue(jArr21, jArr4);
                MPTrue.configure(jArr4, 119, jArr3);
                long[] jArr22 = new long[8];
                MPTrue.Cardinal(jArr3, jArr4, jArr22);
                MPTrue.cca_continue(jArr22, jArr3);
                long[] jArr23 = new long[8];
                MPTrue.Cardinal(jArr3, jArr23);
                MPTrue.cca_continue(jArr23, jArr);
                return new MPSimple(jArr);
            }
            throw new IllegalStateException();
        }

        public final merge getWarnings() {
            long[] jArr = new long[4];
            long[] jArr2 = this.init;
            long instance = EncryptedJWT.getInstance(jArr2[0]);
            long instance2 = EncryptedJWT.getInstance(jArr2[1]);
            long j = (instance & 4294967295L) | (instance2 << 32);
            long j2 = (instance >>> 32) | (instance2 & -4294967296L);
            long instance3 = EncryptedJWT.getInstance(jArr2[2]);
            long instance4 = EncryptedJWT.getInstance(jArr2[3]);
            long j3 = (instance3 & 4294967295L) | (instance4 << 32);
            long j4 = (instance3 >>> 32) | (instance4 & -4294967296L);
            long j5 = j4 >>> 49;
            long j6 = (j2 >>> 49) | (j4 << 15);
            long j7 = j4 ^ (j2 << 15);
            long[] jArr3 = new long[8];
            int[] iArr = {39, 120};
            int i = 0;
            for (int i2 = 2; i < i2; i2 = 2) {
                int i3 = iArr[i];
                int i4 = i3 >>> 6;
                int i5 = i3 & 63;
                jArr3[i4] = jArr3[i4] ^ (j2 << i5);
                int i6 = i4 + 1;
                int i7 = -i5;
                jArr3[i6] = jArr3[i6] ^ ((j7 << i5) | (j2 >>> i7));
                int i8 = i4 + 2;
                jArr3[i8] = jArr3[i8] ^ ((j6 << i5) | (j7 >>> i7));
                int i9 = i4 + 3;
                jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i7));
                int i10 = i4 + 4;
                jArr3[i10] = jArr3[i10] ^ (j5 >>> i7);
                i++;
            }
            MPTrue.cca_continue(jArr3, jArr);
            jArr[0] = jArr[0] ^ j;
            jArr[1] = jArr[1] ^ j3;
            return new MPSimple(jArr);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MPSimple)) {
                return false;
            }
            long[] jArr = this.init;
            long[] jArr2 = ((MPSimple) obj).init;
            for (int i = 3; i >= 0; i--) {
                if (jArr[i] != jArr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final class MPTrue implements GMCipherSpi.SM2withBlake2b {
        private SecureRandom Cardinal;
        private boolean cca_continue;
        private GMCipherSpi.SM2withBlake2b configure;
        private byte[] getInstance;
        private IESCipher.ECIESwithAESCBC init;

        public MPTrue() {
        }

        static void Cardinal(long[] jArr, long[] jArr2) {
            EncryptedJWT.Cardinal(jArr[0], jArr2, 0);
            EncryptedJWT.Cardinal(jArr[1], jArr2, 2);
            EncryptedJWT.Cardinal(jArr[2], jArr2, 4);
            long j = jArr[3];
            jArr2[6] = EncryptedJWT.getInstance((int) j);
            jArr2[7] = ((long) EncryptedJWT.Cardinal((int) (j >>> 32))) & 4294967295L;
        }

        static void Cardinal(long[] jArr, long[] jArr2, long[] jArr3) {
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[4];
            getInstance(jArr, jArr4);
            getInstance(jArr2, jArr5);
            long[] jArr6 = jArr3;
            getInstance(jArr4[0], jArr5[0], jArr6, 0);
            getInstance(jArr4[1], jArr5[1], jArr6, 1);
            getInstance(jArr4[2], jArr5[2], jArr6, 2);
            getInstance(jArr4[3], jArr5[3], jArr6, 3);
            for (int i = 5; i > 0; i--) {
                jArr3[i] = jArr3[i] ^ jArr3[i - 1];
            }
            getInstance(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
            getInstance(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
            for (int i2 = 7; i2 > 1; i2--) {
                jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
            }
            long j = jArr4[0] ^ jArr4[2];
            long j2 = jArr4[1] ^ jArr4[3];
            long j3 = jArr5[0] ^ jArr5[2];
            long j4 = jArr5[1] ^ jArr5[3];
            getInstance(j ^ j2, j3 ^ j4, jArr3, 3);
            long[] jArr7 = new long[3];
            getInstance(j, j3, jArr7, 0);
            getInstance(j2, j4, jArr7, 1);
            long j5 = jArr7[0];
            long j6 = jArr7[1];
            long j7 = jArr7[2];
            jArr3[2] = jArr3[2] ^ j5;
            jArr3[3] = (j5 ^ j6) ^ jArr3[3];
            jArr3[4] = jArr3[4] ^ (j7 ^ j6);
            jArr3[5] = jArr3[5] ^ j7;
            cca_continue(jArr3);
        }

        private static void cca_continue(long[] jArr) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            jArr[0] = j ^ (j2 << 60);
            jArr[1] = (j2 >>> 4) ^ (j3 << 56);
            jArr[2] = (j3 >>> 8) ^ (j4 << 52);
            jArr[3] = (j4 >>> 12) ^ (j5 << 48);
            jArr[4] = (j5 >>> 16) ^ (j6 << 44);
            jArr[5] = (j6 >>> 20) ^ (j7 << 40);
            jArr[6] = (j7 >>> 24) ^ (j8 << 36);
            jArr[7] = j8 >>> 28;
        }

        public static void cca_continue(long[] jArr, long[] jArr2) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = j7 ^ (j8 >>> 17);
            long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
            long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
            long j12 = j ^ (j11 << 17);
            long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
            long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
            long j15 = j14 >>> 47;
            jArr2[0] = j12 ^ j15;
            jArr2[1] = j13;
            long j16 = j15 << 30;
            jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
            jArr2[3] = 140737488355327L & j14;
        }

        static void cca_continue(long[] jArr, long[] jArr2, long[] jArr3) {
            jArr3[0] = jArr[0] ^ jArr2[0];
            jArr3[1] = jArr[1] ^ jArr2[1];
            jArr3[2] = jArr[2] ^ jArr2[2];
            jArr3[3] = jArr[3] ^ jArr2[3];
            jArr3[4] = jArr[4] ^ jArr2[4];
            jArr3[5] = jArr[5] ^ jArr2[5];
            jArr3[6] = jArr[6] ^ jArr2[6];
            jArr3[7] = jArr2[7] ^ jArr[7];
        }

        private static void getInstance(long j, long j2, long[] jArr, int i) {
            long j3 = j;
            long[] jArr2 = new long[8];
            jArr2[1] = j2;
            long j4 = j2 << 1;
            jArr2[2] = j4;
            long j5 = j4 ^ j2;
            jArr2[3] = j5;
            long j6 = j4 << 1;
            jArr2[4] = j6;
            jArr2[5] = j6 ^ j2;
            long j7 = j5 << 1;
            jArr2[6] = j7;
            jArr2[7] = j7 ^ j2;
            int i2 = (int) j3;
            long j8 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
            long j9 = 0;
            int i3 = 54;
            do {
                int i4 = (int) (j3 >>> i3);
                long j10 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
                j8 ^= j10 << i3;
                j9 ^= j10 >>> (-i3);
                i3 -= 6;
            } while (i3 > 0);
            jArr[i] = jArr[i] ^ (1152921504606846975L & j8);
            int i5 = i + 1;
            jArr[i5] = ((((((j3 & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j9) << 4) ^ (j8 >>> 60)) ^ jArr[i5];
        }

        private static void getInstance(long[] jArr, long[] jArr2) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            jArr2[0] = j & 1152921504606846975L;
            jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
            jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
            jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
        }

        public static void configure(long[] jArr, int i, long[] jArr2) {
            long[] jArr3 = new long[8];
            Cardinal(jArr, jArr3);
            while (true) {
                cca_continue(jArr3, jArr2);
                i--;
                if (i > 0) {
                    Cardinal(jArr2, jArr3);
                } else {
                    return;
                }
            }
        }

        public MPTrue(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC, byte[] bArr) {
            this(sM2withBlake2b, eCIESwithAESCBC, eCIESwithAESCBC, bArr);
        }

        public MPTrue(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC, IESCipher.ECIESwithAESCBC eCIESwithAESCBC2, byte[] bArr) {
            this.configure = sM2withBlake2b;
            this.init = eCIESwithAESCBC2;
            this.getInstance = new byte[eCIESwithAESCBC.getInstance()];
            eCIESwithAESCBC.init();
            if (bArr != null) {
                eCIESwithAESCBC.init(bArr, 0, bArr.length);
            }
            eCIESwithAESCBC.init(this.getInstance, 0);
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            SecureRandom secureRandom;
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                secureRandom = ((DigestSignatureSpi.RIPEMD128) sM2withRMD).Cardinal;
            } else {
                secureRandom = GMCipherSpi.SM2withWhirlpool.configure();
            }
            this.Cardinal = secureRandom;
            this.configure.getInstance(z, sM2withRMD);
            this.cca_continue = z;
        }

        public final int init() {
            int init2 = this.configure.init();
            return this.cca_continue ? (init2 - 1) - (this.getInstance.length * 2) : init2;
        }

        public final int getInstance() {
            int instance = this.configure.getInstance();
            return this.cca_continue ? instance : (instance - 1) - (this.getInstance.length * 2);
        }

        public final byte[] Cardinal(byte[] bArr, int i, int i2) throws KeyAgreementSpi.AnonymousClass1 {
            byte[] bArr2;
            byte[] bArr3;
            if (this.cca_continue) {
                int init2 = this.configure.init();
                if (this.cca_continue) {
                    init2 = (init2 - 1) - (this.getInstance.length * 2);
                }
                if (i2 <= init2) {
                    int init3 = this.configure.init();
                    if (this.cca_continue) {
                        init3 = (init3 - 1) - (this.getInstance.length * 2);
                    }
                    int length = init3 + 1 + (this.getInstance.length * 2);
                    byte[] bArr4 = new byte[length];
                    int i3 = length - i2;
                    System.arraycopy(bArr, i, bArr4, i3, i2);
                    bArr4[i3 - 1] = 1;
                    byte[] bArr5 = this.getInstance;
                    System.arraycopy(bArr5, 0, bArr4, bArr5.length, bArr5.length);
                    int length2 = this.getInstance.length;
                    byte[] bArr6 = new byte[length2];
                    this.Cardinal.nextBytes(bArr6);
                    byte[] cca_continue2 = cca_continue(bArr6, 0, length2, length - this.getInstance.length);
                    for (int length3 = this.getInstance.length; length3 != length; length3++) {
                        bArr4[length3] = (byte) (bArr4[length3] ^ cca_continue2[length3 - this.getInstance.length]);
                    }
                    System.arraycopy(bArr6, 0, bArr4, 0, this.getInstance.length);
                    byte[] bArr7 = this.getInstance;
                    byte[] cca_continue3 = cca_continue(bArr4, bArr7.length, length - bArr7.length, bArr7.length);
                    for (int i4 = 0; i4 != this.getInstance.length; i4++) {
                        bArr4[i4] = (byte) (bArr4[i4] ^ cca_continue3[i4]);
                    }
                    return this.configure.Cardinal(bArr4, 0, length);
                }
                throw new GMSignatureSpi("input data too long");
            }
            byte[] Cardinal2 = this.configure.Cardinal(bArr, i, i2);
            int instance = this.configure.getInstance();
            byte[] bArr8 = new byte[instance];
            boolean z = instance < (this.getInstance.length * 2) + 1;
            if (Cardinal2.length <= instance) {
                System.arraycopy(Cardinal2, 0, bArr8, instance - Cardinal2.length, Cardinal2.length);
            } else {
                System.arraycopy(Cardinal2, 0, bArr8, 0, instance);
                z = true;
            }
            byte[] bArr9 = this.getInstance;
            byte[] cca_continue4 = cca_continue(bArr8, bArr9.length, instance - bArr9.length, bArr9.length);
            int i5 = 0;
            while (true) {
                bArr2 = this.getInstance;
                if (i5 == bArr2.length) {
                    break;
                }
                bArr8[i5] = (byte) (bArr8[i5] ^ cca_continue4[i5]);
                i5++;
            }
            byte[] cca_continue5 = cca_continue(bArr8, 0, bArr2.length, instance - bArr2.length);
            for (int length4 = this.getInstance.length; length4 != instance; length4++) {
                bArr8[length4] = (byte) (bArr8[length4] ^ cca_continue5[length4 - this.getInstance.length]);
            }
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                bArr3 = this.getInstance;
                if (i6 == bArr3.length) {
                    break;
                }
                if (bArr3[i6] != bArr8[bArr3.length + i6]) {
                    z2 = true;
                }
                i6++;
            }
            int i7 = instance;
            for (int length5 = bArr3.length * 2; length5 != instance; length5++) {
                if ((bArr8[length5] != 0) && (i7 == instance)) {
                    i7 = length5;
                }
            }
            boolean z3 = i7 > instance + -1;
            boolean z4 = bArr8[i7] != 1;
            int i8 = i7 + 1;
            if ((z3 | z4) || (z | z2)) {
                for (int i9 = 0; i9 < instance; i9++) {
                    bArr8[i9] = 0;
                }
                throw new KeyAgreementSpi.AnonymousClass1("data wrong");
            }
            int i10 = instance - i8;
            byte[] bArr10 = new byte[i10];
            System.arraycopy(bArr8, i8, bArr10, 0, i10);
            return bArr10;
        }

        private byte[] cca_continue(byte[] bArr, int i, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            int instance = this.init.getInstance();
            byte[] bArr3 = new byte[instance];
            byte[] bArr4 = new byte[4];
            this.init.init();
            int i4 = 0;
            while (i4 < i3 / instance) {
                bArr4[0] = (byte) (i4 >>> 24);
                bArr4[1] = (byte) (i4 >>> 16);
                bArr4[2] = (byte) (i4 >>> 8);
                bArr4[3] = (byte) i4;
                this.init.init(bArr, i, i2);
                this.init.init(bArr4, 0, 4);
                this.init.init(bArr3, 0);
                System.arraycopy(bArr3, 0, bArr2, i4 * instance, instance);
                i4++;
            }
            int i5 = instance * i4;
            if (i5 < i3) {
                bArr4[0] = (byte) (i4 >>> 24);
                bArr4[1] = (byte) (i4 >>> 16);
                bArr4[2] = (byte) (i4 >>> 8);
                bArr4[3] = (byte) i4;
                this.init.init(bArr, i, i2);
                this.init.init(bArr4, 0, 4);
                this.init.init(bArr3, 0);
                System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
            }
            return bArr2;
        }
    }

    public final class MustProtect {
        private static final long[] getInstance = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

        public static void Cardinal(long[] jArr, long[] jArr2) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
            long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
            long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
            long j13 = j10 >>> 27;
            jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
            jArr2[1] = j12;
            jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
            jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
            jArr2[4] = 134217727 & j10;
        }

        private static void cca_continue(long j, long j2, long[] jArr, int i) {
            long j3 = j;
            long[] jArr2 = new long[8];
            jArr2[1] = j2;
            long j4 = j2 << 1;
            jArr2[2] = j4;
            long j5 = j4 ^ j2;
            jArr2[3] = j5;
            long j6 = j4 << 1;
            jArr2[4] = j6;
            jArr2[5] = j6 ^ j2;
            long j7 = j5 << 1;
            jArr2[6] = j7;
            jArr2[7] = j7 ^ j2;
            long j8 = jArr2[((int) j3) & 7];
            long j9 = 0;
            int i2 = 48;
            do {
                int i3 = (int) (j3 >>> i2);
                long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
                j8 ^= j10 << i2;
                j9 ^= j10 >>> (-i2);
                i2 -= 9;
            } while (i2 > 0);
            jArr[i] = 144115188075855871L & j8;
            jArr[i + 1] = (((((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
        }

        public static void cca_continue(long[] jArr, long[] jArr2) {
            jArr2[0] = jArr[0] ^ 1;
            jArr2[1] = jArr[1];
            jArr2[2] = jArr[2];
            jArr2[3] = jArr[3];
            jArr2[4] = jArr[4];
        }

        private static void cca_continue(long[] jArr, long[] jArr2, long[] jArr3) {
            jArr3[0] = jArr[0] ^ jArr2[0];
            jArr3[1] = jArr[1] ^ jArr2[1];
            jArr3[2] = jArr[2] ^ jArr2[2];
            jArr3[3] = jArr[3] ^ jArr2[3];
            jArr3[4] = jArr[4] ^ jArr2[4];
            jArr3[5] = jArr[5] ^ jArr2[5];
            jArr3[6] = jArr[6] ^ jArr2[6];
            jArr3[7] = jArr[7] ^ jArr2[7];
            jArr3[8] = jArr2[8] ^ jArr[8];
        }

        public static int configure(long[] jArr) {
            return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
        }

        private static void configure(long[] jArr, long[] jArr2, long[] jArr3) {
            long[] jArr4 = new long[5];
            long[] jArr5 = new long[5];
            onCReqSuccess(jArr, jArr4);
            onCReqSuccess(jArr2, jArr5);
            long[] jArr6 = new long[26];
            long[] jArr7 = jArr6;
            cca_continue(jArr4[0], jArr5[0], jArr7, 0);
            cca_continue(jArr4[1], jArr5[1], jArr7, 2);
            cca_continue(jArr4[2], jArr5[2], jArr7, 4);
            cca_continue(jArr4[3], jArr5[3], jArr7, 6);
            cca_continue(jArr4[4], jArr5[4], jArr7, 8);
            long j = jArr4[0];
            long j2 = j ^ jArr4[1];
            long j3 = jArr5[0];
            long j4 = j3 ^ jArr5[1];
            long j5 = jArr4[2];
            long j6 = j ^ j5;
            long j7 = jArr5[2];
            long j8 = j3 ^ j7;
            long j9 = jArr4[4];
            long j10 = j5 ^ j9;
            long j11 = jArr5[4];
            long j12 = j7 ^ j11;
            long j13 = jArr4[3];
            long j14 = j13 ^ j9;
            long j15 = jArr5[3];
            long j16 = j15 ^ j11;
            long[] jArr8 = jArr6;
            cca_continue(j6 ^ j13, j8 ^ j15, jArr8, 18);
            cca_continue(j10 ^ jArr4[1], j12 ^ jArr5[1], jArr8, 20);
            long j17 = j2 ^ j14;
            long j18 = j4 ^ j16;
            long j19 = j17 ^ jArr4[2];
            long[] jArr9 = jArr6;
            cca_continue(j17, j18, jArr9, 22);
            cca_continue(j19, jArr5[2] ^ j18, jArr9, 24);
            cca_continue(j2, j4, jArr9, 10);
            cca_continue(j6, j8, jArr9, 12);
            cca_continue(j10, j12, jArr9, 14);
            cca_continue(j14, j16, jArr9, 16);
            jArr3[0] = jArr6[0];
            jArr3[9] = jArr6[9];
            long j20 = jArr6[0];
            long j21 = jArr6[1] ^ j20;
            long j22 = jArr6[2] ^ j21;
            long j23 = jArr6[10] ^ j22;
            jArr3[1] = j23;
            long j24 = jArr6[3] ^ jArr6[4];
            long j25 = j22 ^ (j24 ^ (jArr6[11] ^ jArr6[12]));
            jArr3[2] = j25;
            long j26 = j21 ^ j24;
            long j27 = jArr6[5] ^ jArr6[6];
            long j28 = jArr6[8];
            long j29 = (j26 ^ j27) ^ j28;
            long j30 = jArr6[13] ^ jArr6[14];
            long j31 = jArr6[18];
            long j32 = jArr6[22];
            long j33 = jArr6[24];
            jArr3[3] = (j29 ^ j30) ^ ((j31 ^ j32) ^ j33);
            long j34 = jArr6[7] ^ j28;
            long j35 = jArr6[9];
            long j36 = j34 ^ j35;
            long j37 = j36 ^ jArr6[17];
            jArr3[8] = j37;
            long j38 = (j36 ^ j27) ^ (jArr6[15] ^ jArr6[16]);
            jArr3[7] = j38;
            long j39 = j38 ^ j23;
            long j40 = jArr6[19] ^ jArr6[20];
            long j41 = jArr6[25];
            long j42 = j41 ^ j33;
            long j43 = jArr6[23];
            long j44 = j40 ^ j42;
            jArr3[4] = (j44 ^ (j31 ^ j43)) ^ j39;
            long j45 = jArr6[21];
            jArr3[5] = ((j25 ^ j37) ^ j44) ^ (j45 ^ j32);
            jArr3[6] = (((((j29 ^ j20) ^ j35) ^ j30) ^ j45) ^ j43) ^ j41;
            init(jArr3);
        }

        private static void init(long[] jArr) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            jArr[0] = j ^ (j2 << 57);
            jArr[1] = (j2 >>> 7) ^ (j3 << 50);
            jArr[2] = (j3 >>> 14) ^ (j4 << 43);
            jArr[3] = (j4 >>> 21) ^ (j5 << 36);
            jArr[4] = (j5 >>> 28) ^ (j6 << 29);
            jArr[5] = (j6 >>> 35) ^ (j7 << 22);
            jArr[6] = (j7 >>> 42) ^ (j8 << 15);
            jArr[7] = (j8 >>> 49) ^ (j9 << 8);
            jArr[8] = (j9 >>> 56) ^ (j10 << 1);
            jArr[9] = j10 >>> 63;
        }

        public static void init(long[] jArr, long[] jArr2, long[] jArr3) {
            jArr3[0] = jArr[0] ^ jArr2[0];
            jArr3[1] = jArr[1] ^ jArr2[1];
            jArr3[2] = jArr[2] ^ jArr2[2];
            jArr3[3] = jArr[3] ^ jArr2[3];
            jArr3[4] = jArr2[4] ^ jArr[4];
        }

        private static void onCReqSuccess(long[] jArr, long[] jArr2) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            jArr2[0] = j & 144115188075855871L;
            jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
            jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
            jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
            jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
        }

        private static void onValidated(long[] jArr, long[] jArr2) {
            for (int i = 0; i < 4; i++) {
                EncryptedJWT.Cardinal(jArr[i], jArr2, i << 1);
            }
            jArr2[8] = EncryptedJWT.getInstance((int) jArr[4]);
        }

        public static long[] Cardinal(BigInteger bigInteger) {
            if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[5];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[4];
            long j2 = j >>> 27;
            jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
            jArr[4] = j & 134217727;
            return jArr;
        }

        public static void getInstance(long[] jArr, long[] jArr2) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 5) {
                    z = true;
                    break;
                } else if (jArr[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                long[] jArr5 = new long[9];
                onValidated(jArr, jArr5);
                Cardinal(jArr5, jArr3);
                long[] jArr6 = new long[10];
                configure(jArr3, jArr, jArr6);
                Cardinal(jArr6, jArr3);
                Cardinal(jArr3, 2, jArr4);
                long[] jArr7 = new long[10];
                configure(jArr4, jArr3, jArr7);
                Cardinal(jArr7, jArr4);
                Cardinal(jArr4, 4, jArr3);
                long[] jArr8 = new long[10];
                configure(jArr3, jArr4, jArr8);
                Cardinal(jArr8, jArr3);
                Cardinal(jArr3, 8, jArr4);
                long[] jArr9 = new long[10];
                configure(jArr4, jArr3, jArr9);
                Cardinal(jArr9, jArr4);
                long[] jArr10 = new long[9];
                onValidated(jArr4, jArr10);
                Cardinal(jArr10, jArr4);
                long[] jArr11 = new long[10];
                configure(jArr4, jArr, jArr11);
                Cardinal(jArr11, jArr4);
                Cardinal(jArr4, 17, jArr3);
                long[] jArr12 = new long[10];
                configure(jArr3, jArr4, jArr12);
                Cardinal(jArr12, jArr3);
                long[] jArr13 = new long[9];
                onValidated(jArr3, jArr13);
                Cardinal(jArr13, jArr3);
                long[] jArr14 = new long[10];
                configure(jArr3, jArr, jArr14);
                Cardinal(jArr14, jArr3);
                Cardinal(jArr3, 35, jArr4);
                long[] jArr15 = new long[10];
                configure(jArr4, jArr3, jArr15);
                Cardinal(jArr15, jArr4);
                Cardinal(jArr4, 70, jArr3);
                long[] jArr16 = new long[10];
                configure(jArr3, jArr4, jArr16);
                Cardinal(jArr16, jArr3);
                long[] jArr17 = new long[9];
                onValidated(jArr3, jArr17);
                Cardinal(jArr17, jArr3);
                long[] jArr18 = new long[10];
                configure(jArr3, jArr, jArr18);
                Cardinal(jArr18, jArr3);
                Cardinal(jArr3, (int) Opcodes.F2D, jArr4);
                long[] jArr19 = new long[10];
                configure(jArr4, jArr3, jArr19);
                Cardinal(jArr19, jArr4);
                long[] jArr20 = new long[9];
                onValidated(jArr4, jArr20);
                Cardinal(jArr20, jArr2);
                return;
            }
            throw new IllegalStateException();
        }

        public static void Cardinal(long[] jArr, long[] jArr2, long[] jArr3) {
            long[] jArr4 = new long[10];
            configure(jArr, jArr2, jArr4);
            Cardinal(jArr4, jArr3);
        }

        public static void getInstance(long[] jArr, long[] jArr2, long[] jArr3) {
            long[] jArr4 = new long[10];
            configure(jArr, jArr2, jArr4);
            cca_continue(jArr3, jArr4, jArr3);
        }

        public static void init(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr2;
            long[] jArr4 = new long[5];
            long instance = EncryptedJWT.getInstance(jArr[0]);
            long instance2 = EncryptedJWT.getInstance(jArr[1]);
            long j = (instance & 4294967295L) | (instance2 << 32);
            jArr4[0] = (instance >>> 32) | (instance2 & -4294967296L);
            long instance3 = EncryptedJWT.getInstance(jArr[2]);
            long instance4 = EncryptedJWT.getInstance(jArr[3]);
            jArr4[1] = (instance3 >>> 32) | (-4294967296L & instance4);
            long instance5 = EncryptedJWT.getInstance(jArr[4]);
            long j2 = 4294967295L & instance5;
            jArr4[2] = instance5 >>> 32;
            long[] jArr5 = new long[10];
            configure(jArr4, getInstance, jArr5);
            Cardinal(jArr5, jArr3);
            jArr3[0] = jArr3[0] ^ j;
            jArr3[1] = jArr3[1] ^ ((instance3 & 4294967295L) | (instance4 << 32));
            jArr3[2] = jArr3[2] ^ j2;
        }

        public static void configure(long[] jArr, long[] jArr2) {
            long[] jArr3 = new long[9];
            onValidated(jArr, jArr3);
            Cardinal(jArr3, jArr2);
        }

        public static void cleanup(long[] jArr, long[] jArr2) {
            long[] jArr3 = new long[9];
            onValidated(jArr, jArr3);
            cca_continue(jArr2, jArr3, jArr2);
        }

        public static void Cardinal(long[] jArr, int i, long[] jArr2) {
            long[] jArr3 = new long[9];
            onValidated(jArr, jArr3);
            while (true) {
                Cardinal(jArr3, jArr2);
                i--;
                if (i > 0) {
                    onValidated(jArr2, jArr3);
                } else {
                    return;
                }
            }
        }
    }

    public final class StringProtector extends toJSONString.cca_continue {
        private mustBeProtect getWarnings = new mustBeProtect(this, (merge) null, (merge) null);

        public final toJSONString Cardinal() {
            return new StringProtector();
        }

        public final boolean Cardinal(int i) {
            return i == 6;
        }

        public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
            return new mustBeProtect(this, merge, merge2, z);
        }

        public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
            return new mustBeProtect(this, merge, merge2, mergeArr, z);
        }

        public final toString cca_continue() {
            return new set();
        }

        public final int getInstance() {
            return 239;
        }

        public final JSONNavi init() {
            return this.getWarnings;
        }

        public final merge init(BigInteger bigInteger) {
            return new MPSimple(bigInteger);
        }

        public final boolean values() {
            return true;
        }

        public StringProtector() {
            super(239, Opcodes.IFLE, 0, 0);
            this.getInstance = new MPSimple(BigInteger.valueOf(0));
            this.Cardinal = new MPSimple(BigInteger.valueOf(1));
            this.init = new BigInteger(1, getHeadingTextFontName.init("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
            this.configure = BigInteger.valueOf(4);
            this.onValidated = 6;
        }

        public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
            final long[] jArr = new long[((i << 2) << 1)];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                JSONNavi jSONNavi = jSONNaviArr[i3];
                long[] jArr2 = ((MPSimple) jSONNavi.valueOf()).init;
                jArr[i2] = jArr2[0];
                jArr[i2 + 1] = jArr2[1];
                jArr[i2 + 2] = jArr2[2];
                jArr[i2 + 3] = jArr2[3];
                int i4 = i2 + 4;
                long[] jArr3 = ((MPSimple) jSONNavi.CardinalEnvironment()).init;
                jArr[i4] = jArr3[0];
                jArr[i4 + 1] = jArr3[1];
                jArr[i4 + 2] = jArr3[2];
                jArr[i4 + 3] = jArr3[3];
                i2 = i4 + 4;
            }
            return new JSONArray() {
                public final int getInstance() {
                    return i;
                }

                public final JSONNavi configure(int i) {
                    long[] jArr = new long[4];
                    long[] jArr2 = new long[4];
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        long j = (long) (((i3 ^ i) - 1) >> 31);
                        for (int i4 = 0; i4 < 4; i4++) {
                            long j2 = jArr[i4];
                            long[] jArr3 = jArr;
                            jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                            jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 4) + i4] & j);
                        }
                        i2 += 8;
                    }
                    return new mustBeProtect(StringProtector.this, new MPSimple(jArr), new MPSimple(jArr2), false);
                }
            };
        }
    }

    public static void cca_continue(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        Cardinal(jArr, jArr3);
        while (true) {
            configure(jArr3, jArr2);
            i--;
            if (i > 0) {
                Cardinal(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public JStylerObj(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.getInstance = eCIESwithAESCBC;
        this.cca_continue = eCIESwithAESCBC.getInstance();
    }

    public final void getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
        if (sM2withRMD instanceof CipherSpi.OAEPPadding) {
            CipherSpi.OAEPPadding oAEPPadding = (CipherSpi.OAEPPadding) sM2withRMD;
            this.init = oAEPPadding.Cardinal;
            this.configure = oAEPPadding.getInstance;
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }

    public final int cca_continue(byte[] bArr, int i, int i2) throws GMSignatureSpi, IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 >= 0) {
            byte[] bArr2 = new byte[this.cca_continue];
            byte[] bArr3 = new byte[4];
            this.getInstance.init();
            if (i2 > this.cca_continue) {
                int i5 = 1;
                i4 = 0;
                while (true) {
                    bArr3[0] = (byte) (i5 >>> 24);
                    bArr3[1] = (byte) (i5 >>> 16);
                    bArr3[2] = (byte) (i5 >>> 8);
                    bArr3[3] = (byte) i5;
                    this.getInstance.init(bArr3, 0, 4);
                    IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
                    byte[] bArr4 = this.init;
                    eCIESwithAESCBC.init(bArr4, 0, bArr4.length);
                    IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.getInstance;
                    byte[] bArr5 = this.configure;
                    eCIESwithAESCBC2.init(bArr5, 0, bArr5.length);
                    this.getInstance.init(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i4, this.cca_continue);
                    int i6 = this.cca_continue;
                    i4 += i6;
                    i3 = i5 + 1;
                    if (i5 >= i2 / i6) {
                        break;
                    }
                    i5 = i3;
                }
            } else {
                i3 = 1;
                i4 = 0;
            }
            if (i4 < i2) {
                bArr3[0] = (byte) (i3 >>> 24);
                bArr3[1] = (byte) (i3 >>> 16);
                bArr3[2] = (byte) (i3 >>> 8);
                bArr3[3] = (byte) i3;
                this.getInstance.init(bArr3, 0, 4);
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.getInstance;
                byte[] bArr6 = this.init;
                eCIESwithAESCBC3.init(bArr6, 0, bArr6.length);
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC4 = this.getInstance;
                byte[] bArr7 = this.configure;
                eCIESwithAESCBC4.init(bArr7, 0, bArr7.length);
                this.getInstance.init(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i4, i2 - i4);
            }
            return i2;
        }
        throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too small");
    }
}
