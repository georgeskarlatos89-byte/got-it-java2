package com.cardinalcommerce.a;

import androidx.core.app.FrameMetricsAggregator;
import com.cardinalcommerce.a.JSONNavi;
import java.math.BigInteger;

public final class JSONUtil {
    static final int[] cca_continue = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, FrameMetricsAggregator.EVERY_DURATION};

    public final class JsonSmartFieldFilter extends JSONNavi.init {
        public JsonSmartFieldFilter(toJSONString tojsonstring, merge merge, merge merge2) {
            this(tojsonstring, merge, merge2, false);
        }

        public JsonSmartFieldFilter(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
            super(tojsonstring, merge, merge2);
            if ((merge == null) == (merge2 != null ? false : true)) {
                this.Cardinal = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        JsonSmartFieldFilter(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
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
            return new JsonSmartFieldFilter(tojsonstring, merge, merge2.cca_continue(merge3), mergeArr, this.Cardinal);
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
                merge5 = instance2.getInstance().cca_continue(instance2).cca_continue(onValidated).cca_continue(configure.getSDKVersion());
                if (merge5.onCReqSuccess()) {
                    return new JsonSmartFieldFilter(configure, merge5, configure.cleanup().getWarnings(), this.Cardinal);
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
                    return new JsonSmartFieldFilter(configure, init3, configure.cleanup().getWarnings(), this.Cardinal);
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
            return new JsonSmartFieldFilter(configure, merge5, merge4, new merge[]{merge6}, this.Cardinal);
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
            merge cca_continue = configure.getSDKVersion().init(instance4).cca_continue(instance3).cca_continue(merge2.init(merge3));
            merge configure2 = CardinalEnvironment.configure();
            merge Cardinal = configure.getSDKVersion().cca_continue(configure2).init(instance4).cca_continue(instance3).Cardinal(cca_continue, instance2, instance4);
            merge init = valueOf.init(instance4);
            merge instance5 = init.cca_continue(cca_continue).getInstance();
            if (instance5.onCReqSuccess()) {
                return Cardinal.onCReqSuccess() ? jSONNavi.getActionCode() : configure.init();
            }
            if (Cardinal.onCReqSuccess()) {
                return new JsonSmartFieldFilter(configure, Cardinal, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge init2 = Cardinal.getInstance().init(init);
            merge init3 = Cardinal.init(instance5).init(instance4);
            return new JsonSmartFieldFilter(configure, init2, Cardinal.cca_continue(instance5).getInstance().Cardinal(cca_continue, configure2, init3), new merge[]{init3}, this.Cardinal);
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
            merge sDKVersion = configure.getSDKVersion();
            if (!cleanup) {
                sDKVersion = sDKVersion.init(instance);
            }
            merge cca_continue = merge2.getInstance().cca_continue(init).cca_continue(sDKVersion);
            if (cca_continue.onCReqSuccess()) {
                return new JsonSmartFieldFilter(configure, cca_continue, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge instance2 = cca_continue.getInstance();
            merge init2 = cleanup ? cca_continue : cca_continue.init(instance);
            if (!cleanup) {
                merge = merge.init(merge3);
            }
            return new JsonSmartFieldFilter(configure, instance2, merge.configure(cca_continue, init).cca_continue(instance2).cca_continue(init2), new merge[]{init2}, this.Cardinal);
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
            return new JsonSmartFieldFilter((toJSONString) null, onCReqSuccess(), getWarnings());
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (getErrorMessage.cca_continue(16, iArr, i << 23, iArr2) | (i << 1)) & FrameMetricsAggregator.EVERY_DURATION;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void cca_continue(int[] r7, int[] r8, int[] r9) {
        /*
            r0 = 16
            int r1 = com.cardinalcommerce.a.getErrorMessage.configure((int) r0, (int[]) r7, (int[]) r8, (int[]) r9)
            r7 = r7[r0]
            int r1 = r1 + r7
            r7 = r8[r0]
            int r1 = r1 + r7
            r7 = 0
            r8 = 1
            r2 = 511(0x1ff, float:7.16E-43)
            if (r1 > r2) goto L_0x0028
            if (r1 != r2) goto L_0x0039
            int[] r3 = cca_continue
            r4 = 15
        L_0x0018:
            if (r4 < 0) goto L_0x0025
            r5 = r9[r4]
            r6 = r3[r4]
            if (r5 == r6) goto L_0x0022
            r3 = r7
            goto L_0x0026
        L_0x0022:
            int r4 = r4 + -1
            goto L_0x0018
        L_0x0025:
            r3 = r8
        L_0x0026:
            if (r3 == 0) goto L_0x0039
        L_0x0028:
            r3 = r7
        L_0x0029:
            if (r3 >= r0) goto L_0x0036
            r4 = r9[r3]
            int r4 = r4 + r8
            r9[r3] = r4
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0036:
            r7 = r8
        L_0x0037:
            int r1 = r1 + r7
            r1 = r1 & r2
        L_0x0039:
            r9[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONUtil.cca_continue(int[], int[], int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r4 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Cardinal(int[] r8, int[] r9) {
        /*
            r0 = 16
            int r1 = com.cardinalcommerce.a.getErrorMessage.configure(r0, r8, r9)
            r8 = r8[r0]
            int r1 = r1 + r8
            r8 = 0
            r2 = 1
            r3 = 511(0x1ff, float:7.16E-43)
            if (r1 > r3) goto L_0x0025
            if (r1 != r3) goto L_0x0036
            int[] r4 = cca_continue
            r5 = 15
        L_0x0015:
            if (r5 < 0) goto L_0x0022
            r6 = r9[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L_0x001f
            r4 = r8
            goto L_0x0023
        L_0x001f:
            int r5 = r5 + -1
            goto L_0x0015
        L_0x0022:
            r4 = r2
        L_0x0023:
            if (r4 == 0) goto L_0x0036
        L_0x0025:
            r4 = r8
        L_0x0026:
            if (r4 >= r0) goto L_0x0033
            r5 = r9[r4]
            int r5 = r5 + r2
            r9[r4] = r5
            if (r5 == 0) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x0026
        L_0x0033:
            r8 = r2
        L_0x0034:
            int r1 = r1 + r8
            r1 = r1 & r3
        L_0x0036:
            r9[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONUtil.Cardinal(int[], int[]):void");
    }

    public static int[] getInstance(BigInteger bigInteger) {
        boolean z;
        int[] configure = getErrorMessage.configure(521, bigInteger);
        int[] iArr = cca_continue;
        int i = 16;
        while (true) {
            if (i < 0) {
                z = true;
                break;
            } else if (configure[i] != iArr[i]) {
                z = false;
                break;
            } else {
                i--;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < 17; i2++) {
                configure[i2] = 0;
            }
        }
        return configure;
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = new int[33];
        setErrorCode.init(iArr4, iArr5, iArr6);
        long j = ((long) iArr5[8]) & 4294967295L;
        long j2 = ((long) iArr5[9]) & 4294967295L;
        long j3 = ((long) iArr5[10]) & 4294967295L;
        long j4 = ((long) iArr5[11]) & 4294967295L;
        long j5 = ((long) iArr5[12]) & 4294967295L;
        long j6 = ((long) iArr5[13]) & 4294967295L;
        long j7 = ((long) iArr5[14]) & 4294967295L;
        long j8 = ((long) iArr5[15]) & 4294967295L;
        long j9 = ((long) iArr4[8]) & 4294967295L;
        long j10 = 0;
        long j11 = (j9 * j) + 0;
        long j12 = j;
        iArr6[16] = (int) j11;
        long j13 = (j11 >>> 32) + (j9 * j2);
        iArr6[17] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j3);
        iArr6[18] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j4);
        iArr6[19] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j5);
        iArr6[20] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j6);
        iArr6[21] = (int) j17;
        long j18 = (j17 >>> 32) + (j9 * j7);
        iArr6[22] = (int) j18;
        long j19 = (j18 >>> 32) + (j9 * j8);
        iArr6[23] = (int) j19;
        iArr6[24] = (int) (j19 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 16;
        while (i2 < 8) {
            int i4 = i3 + i;
            long j20 = ((long) iArr[i2 + 8]) & 4294967295L;
            int i5 = i4;
            long j21 = (j20 * j12) + (((long) iArr6[i4]) & 4294967295L) + 0;
            iArr6[i5] = (int) j21;
            int i6 = i5 + 1;
            long j22 = (j21 >>> 32) + (j20 * j2) + (((long) iArr6[i6]) & 4294967295L);
            iArr6[i6] = (int) j22;
            int i7 = i5 + 2;
            long j23 = j3;
            long j24 = (j22 >>> 32) + (j20 * j3) + (((long) iArr6[i7]) & 4294967295L);
            iArr6[i7] = (int) j24;
            int i8 = i5 + 3;
            long j25 = (j24 >>> 32) + (j20 * j4) + (((long) iArr6[i8]) & 4294967295L);
            iArr6[i8] = (int) j25;
            int i9 = i5 + 4;
            long j26 = (j25 >>> 32) + (j20 * j5) + (((long) iArr6[i9]) & 4294967295L);
            iArr6[i9] = (int) j26;
            int i10 = i5 + 5;
            long j27 = (j26 >>> 32) + (j20 * j6) + (((long) iArr6[i10]) & 4294967295L);
            iArr6[i10] = (int) j27;
            int i11 = i5 + 6;
            long j28 = (j27 >>> 32) + (j20 * j7) + (((long) iArr6[i11]) & 4294967295L);
            iArr6[i11] = (int) j28;
            int i12 = i5 + 7;
            long j29 = (j28 >>> 32) + (j20 * j8) + (((long) iArr6[i12]) & 4294967295L);
            iArr6[i12] = (int) j29;
            iArr6[i5 + 8] = (int) (j29 >>> 32);
            i2++;
            i3 = i5;
            j2 = j2;
            j3 = j23;
            i = 1;
        }
        int init = setErrorCode.init(iArr6, iArr6);
        int i13 = 0;
        int Cardinal = init + setErrorCode.Cardinal(iArr6, 24, iArr6, 16, setErrorCode.Cardinal(iArr6, 0, iArr6, 8, 0) + init);
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = iArr;
        int[] iArr10 = iArr2;
        boolean z = setErrorCode.Cardinal(iArr9, iArr9, iArr7) != setErrorCode.Cardinal(iArr10, iArr10, iArr8);
        int[] iArr11 = new int[16];
        setErrorCode.init(iArr7, iArr8, iArr11);
        getErrorMessage.getInstance(32, Cardinal + (z ? getErrorMessage.cca_continue(16, iArr11, iArr6, 8) : getErrorMessage.Cardinal(16, iArr11, iArr6, 8)), iArr6, 24);
        int i14 = iArr9[16];
        int i15 = iArr10[16];
        long j30 = ((long) i14) & 4294967295L;
        long j31 = ((long) i15) & 4294967295L;
        while (true) {
            long j32 = j30;
            long j33 = ((((long) iArr10[i13]) & 4294967295L) * j30) + ((((long) iArr9[i13]) & 4294967295L) * j31);
            int i16 = i13 + 16;
            long j34 = j10 + j33 + (((long) iArr6[i16]) & 4294967295L);
            iArr6[i16] = (int) j34;
            long j35 = j34 >>> 32;
            i13++;
            if (i13 >= 16) {
                iArr6[32] = ((int) j35) + (i14 * i15);
                getInstance(iArr6, iArr3);
                return;
            }
            int[] iArr12 = iArr3;
            j10 = j35;
            j30 = j32;
        }
    }

    public static void configure(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 17) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < 17; i2++) {
                iArr2[i2] = 0;
            }
            return;
        }
        getErrorMessage.init(17, cca_continue, iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r4 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getInstance(int[] r8, int[] r9) {
        /*
            r0 = 32
            r0 = r8[r0]
            int r1 = com.cardinalcommerce.a.getErrorMessage.init((int[]) r8, (int) r0, (int[]) r9)
            int r1 = r1 >>> 23
            int r0 = r0 >>> 9
            int r1 = r1 + r0
            r0 = 16
            int r8 = com.cardinalcommerce.a.getErrorMessage.Cardinal((int) r0, (int[]) r8, (int[]) r9)
            int r1 = r1 + r8
            r8 = 0
            r2 = 1
            r3 = 511(0x1ff, float:7.16E-43)
            if (r1 > r3) goto L_0x0030
            if (r1 != r3) goto L_0x0041
            int[] r4 = cca_continue
            r5 = 15
        L_0x0020:
            if (r5 < 0) goto L_0x002d
            r6 = r9[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L_0x002a
            r4 = r8
            goto L_0x002e
        L_0x002a:
            int r5 = r5 + -1
            goto L_0x0020
        L_0x002d:
            r4 = r2
        L_0x002e:
            if (r4 == 0) goto L_0x0041
        L_0x0030:
            r4 = r8
        L_0x0031:
            if (r4 >= r0) goto L_0x003e
            r5 = r9[r4]
            int r5 = r5 + r2
            r9[r4] = r5
            if (r5 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x003e:
            r8 = r2
        L_0x003f:
            int r1 = r1 + r8
            r1 = r1 & r3
        L_0x0041:
            r9[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONUtil.getInstance(int[], int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getInstance(int[] r9) {
        /*
            r0 = 16
            r1 = r9[r0]
            int r2 = r1 >>> 9
            int r2 = com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r0, (int) r2, (int[]) r9)
            r3 = 511(0x1ff, float:7.16E-43)
            r1 = r1 & r3
            int r2 = r2 + r1
            r1 = 0
            r4 = 1
            if (r2 > r3) goto L_0x0028
            if (r2 != r3) goto L_0x0039
            int[] r5 = cca_continue
            r6 = 15
        L_0x0018:
            if (r6 < 0) goto L_0x0025
            r7 = r9[r6]
            r8 = r5[r6]
            if (r7 == r8) goto L_0x0022
            r5 = r1
            goto L_0x0026
        L_0x0022:
            int r6 = r6 + -1
            goto L_0x0018
        L_0x0025:
            r5 = r4
        L_0x0026:
            if (r5 == 0) goto L_0x0039
        L_0x0028:
            r5 = r1
        L_0x0029:
            if (r5 >= r0) goto L_0x0036
            r6 = r9[r5]
            int r6 = r6 + r4
            r9[r5] = r6
            if (r6 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0036:
            r1 = r4
        L_0x0037:
            int r2 = r2 + r1
            r2 = r2 & r3
        L_0x0039:
            r9[r0] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONUtil.getInstance(int[]):void");
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        ThreeDSEvent.getInstance(iArr, iArr3);
        int i = iArr[16];
        iArr3[32] = getErrorMessage.Cardinal(16, i << 1, iArr, iArr3, 16) + (i * i);
        getInstance(iArr3, iArr2);
    }

    public static void init(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[33];
        ThreeDSEvent.getInstance(iArr, iArr3);
        int i2 = iArr[16];
        iArr3[32] = getErrorMessage.Cardinal(16, i2 << 1, iArr, iArr3, 16) + (i2 * i2);
        getInstance(iArr3, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                ThreeDSEvent.getInstance(iArr2, iArr3);
                int i3 = iArr2[16];
                iArr3[32] = getErrorMessage.Cardinal(16, i3 << 1, iArr2, iArr3, 16) + (i3 * i3);
                getInstance(iArr3, iArr2);
            } else {
                return;
            }
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        int init = (getErrorMessage.init(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (init < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                }
                i2++;
            }
            init = (init + i) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = init;
    }
}
