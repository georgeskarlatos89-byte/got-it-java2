package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.merge;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;

public abstract class toJSONString {
    public merge Cardinal;
    public Base64 cca_continue;
    protected toString cleanup = null;
    public BigInteger configure;
    public merge getInstance;
    public BigInteger init;
    protected AAD onCReqSuccess = null;
    public int onValidated = 0;

    public static abstract class Cardinal extends toJSONString {
        public Cardinal(BigInteger bigInteger) {
            super(ByteUtils.init(bigInteger));
        }

        /* access modifiers changed from: protected */
        public final JSONNavi configure(int i, BigInteger bigInteger) {
            merge init = init(bigInteger);
            merge warnings = init.getInstance().cca_continue(this.getInstance).init(init).cca_continue(this.Cardinal).getWarnings();
            if (warnings != null) {
                if (warnings.values() != (i == 1)) {
                    warnings = warnings.init();
                }
                return cca_continue(init, warnings, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public final boolean getInstance(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getWarnings().configure()) < 0;
        }
    }

    public class configure {
        public AAD Cardinal;
        private int cca_continue;
        private toString getInstance;

        configure(int i, AAD aad, toString tostring) {
            this.cca_continue = i;
            this.Cardinal = aad;
            this.getInstance = tostring;
        }

        public final toJSONString cca_continue() {
            if (toJSONString.this.Cardinal(this.cca_continue)) {
                toJSONString Cardinal2 = toJSONString.this.Cardinal();
                if (Cardinal2 != toJSONString.this) {
                    synchronized (Cardinal2) {
                        Cardinal2.onValidated = this.cca_continue;
                        Cardinal2.onCReqSuccess = this.Cardinal;
                        Cardinal2.cleanup = this.getInstance;
                    }
                    return Cardinal2;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
    }

    protected toJSONString(Base64 base64) {
        this.cca_continue = base64;
    }

    private void getInstance(JSONNavi[] jSONNaviArr, int i, int i2) {
        if (jSONNaviArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        } else if (i < 0 || i2 < 0 || i > jSONNaviArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        } else {
            int i3 = 0;
            while (i3 < i2) {
                JSONNavi jSONNavi = jSONNaviArr[i + i3];
                if (jSONNavi == null || this == jSONNavi.configure()) {
                    i3++;
                } else {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
        }
    }

    public JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int instance = (getInstance() + 7) >>> 3;
        final byte[] bArr = new byte[((i * instance) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            byte[] byteArray = jSONNavi.valueOf().cca_continue().toByteArray();
            byte[] byteArray2 = jSONNavi.CardinalEnvironment().cca_continue().toByteArray();
            int i4 = byteArray.length > instance ? 1 : 0;
            int length = byteArray.length - i4;
            int i5 = byteArray2.length > instance ? 1 : 0;
            int length2 = byteArray2.length - i5;
            int i6 = i2 + instance;
            System.arraycopy(byteArray, i4, bArr, i6 - length, length);
            i2 = i6 + instance;
            System.arraycopy(byteArray2, i5, bArr, i2 - length2, length2);
        }
        return new JSONArray() {
            public final JSONNavi configure(int i) {
                int i2;
                int i3 = instance;
                byte[] bArr = new byte[i3];
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = ((i5 ^ i) - 1) >> 31;
                    int i7 = 0;
                    while (true) {
                        i2 = instance;
                        if (i7 >= i2) {
                            break;
                        }
                        byte b = bArr[i7];
                        byte[] bArr3 = bArr;
                        bArr[i7] = (byte) (b ^ (bArr3[i4 + i7] & i6));
                        bArr2[i7] = (byte) ((bArr3[(i2 + i4) + i7] & i6) ^ bArr2[i7]);
                        i7++;
                    }
                    i4 += i2 << 1;
                }
                toJSONString tojsonstring = toJSONString.this;
                return tojsonstring.cca_continue(tojsonstring.init(new BigInteger(1, bArr)), toJSONString.this.init(new BigInteger(1, bArr2)), false);
            }

            public final int getInstance() {
                return i;
            }
        };
    }

    /* access modifiers changed from: protected */
    public abstract toJSONString Cardinal();

    public boolean Cardinal(int i) {
        return i == 0;
    }

    public final synchronized toString CardinalEnvironment() {
        if (this.cleanup == null) {
            this.cleanup = cca_continue();
        }
        return this.cleanup;
    }

    public final AAD CardinalError() {
        return this.onCReqSuccess;
    }

    public JSONNavi cca_continue(JSONNavi jSONNavi) {
        if (this == jSONNavi.configure()) {
            return jSONNavi;
        }
        if (jSONNavi.getString()) {
            return init();
        }
        JSONNavi CardinalRenderType = jSONNavi.CardinalRenderType();
        return configure(CardinalRenderType.onValidated().cca_continue(), CardinalRenderType.getSDKVersion().cca_continue(), CardinalRenderType.Cardinal);
    }

    /* access modifiers changed from: protected */
    public abstract JSONNavi cca_continue(merge merge, merge merge2, boolean z);

    /* access modifiers changed from: protected */
    public abstract JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z);

    public final JSONNavi cca_continue(byte[] bArr) {
        JSONNavi jSONNavi;
        int instance = (getInstance() + 7) / 8;
        boolean z = false;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length == instance + 1) {
                    jSONNavi = configure(b & 1, setCornerRadius.getInstance(bArr, 1, instance));
                    if (!jSONNavi.init(true, true)) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException(new StringBuilder("Invalid point encoding 0x").append(Integer.toString(b, 16)).toString());
                } else if (bArr.length == (instance * 2) + 1) {
                    BigInteger instance2 = setCornerRadius.getInstance(bArr, 1, instance);
                    BigInteger instance3 = setCornerRadius.getInstance(bArr, instance + 1, instance);
                    boolean testBit = instance3.testBit(0);
                    if (b == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        jSONNavi = cca_continue(instance2, instance3);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (instance * 2) + 1) {
                jSONNavi = cca_continue(setCornerRadius.getInstance(bArr, 1, instance), setCornerRadius.getInstance(bArr, instance + 1, instance));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            jSONNavi = init();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b == 0 || !jSONNavi.getString()) {
            return jSONNavi;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* access modifiers changed from: protected */
    public toString cca_continue() {
        return this.onCReqSuccess instanceof AuthenticatedCipherText ? new newInstanceObject(this, (AuthenticatedCipherText) this.onCReqSuccess) : new getInteger();
    }

    public final merge cleanup() {
        return this.Cardinal;
    }

    /* access modifiers changed from: protected */
    public abstract JSONNavi configure(int i, BigInteger bigInteger);

    public JSONNavi configure(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return cca_continue(init(bigInteger), init(bigInteger2), z);
    }

    public final synchronized configure configure() {
        return new configure(this.onValidated, this.onCReqSuccess, this.cleanup);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof toJSONString) && configure((toJSONString) obj);
        }
        return true;
    }

    public abstract int getInstance();

    public abstract boolean getInstance(BigInteger bigInteger);

    public final merge getSDKVersion() {
        return this.getInstance;
    }

    public final Base64 getWarnings() {
        return this.cca_continue;
    }

    public abstract JSONNavi init();

    public abstract merge init(BigInteger bigInteger);

    public final void init(JSONNavi[] jSONNaviArr) {
        configure(jSONNaviArr, 0, jSONNaviArr.length, (merge) null);
    }

    public final BigInteger onCReqSuccess() {
        return this.init;
    }

    public final BigInteger onValidated() {
        return this.configure;
    }

    public final int valueOf() {
        return this.onValidated;
    }

    public static abstract class cca_continue extends toJSONString {
        private BigInteger[] getWarnings;

        /* access modifiers changed from: protected */
        public final merge Cardinal(merge merge) {
            merge merge2;
            if (merge.onCReqSuccess()) {
                return merge;
            }
            merge init = init(writeJSONString.getSDKVersion);
            int instance = getInstance();
            Random random = new Random();
            do {
                merge init2 = init(new BigInteger(instance, random));
                merge merge3 = merge;
                merge2 = init;
                for (int i = 1; i < instance; i++) {
                    merge instance2 = merge3.getInstance();
                    merge2 = merge2.getInstance().cca_continue(instance2.init(init2));
                    merge3 = instance2.cca_continue(merge);
                }
                if (!merge3.onCReqSuccess()) {
                    return null;
                }
            } while (merge2.getInstance().cca_continue(merge2).onCReqSuccess());
            return merge2;
        }

        /* access modifiers changed from: package-private */
        public final synchronized BigInteger[] CardinalRenderType() {
            if (this.getWarnings == null) {
                this.getWarnings = getSize.getInstance(this);
            }
            return this.getWarnings;
        }

        /* access modifiers changed from: protected */
        public final JSONNavi configure(int i, BigInteger bigInteger) {
            merge merge;
            merge init = init(bigInteger);
            if (init.onCReqSuccess()) {
                merge = cleanup().getWarnings();
            } else {
                merge Cardinal = Cardinal(init.getInstance().onValidated().init(cleanup()).cca_continue(getSDKVersion()).cca_continue(init));
                if (Cardinal != null) {
                    if (Cardinal.values() != (i == 1)) {
                        Cardinal = Cardinal.configure();
                    }
                    int valueOf = valueOf();
                    merge = (valueOf == 5 || valueOf == 6) ? Cardinal.cca_continue(init) : Cardinal.init(init);
                } else {
                    merge = null;
                }
            }
            if (merge != null) {
                return cca_continue(init, merge, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public final JSONNavi configure(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            merge init = init(bigInteger);
            merge init2 = init(bigInteger2);
            int valueOf = valueOf();
            if (valueOf == 5 || valueOf == 6) {
                if (!init.onCReqSuccess()) {
                    init2 = init2.getInstance(init).cca_continue(init);
                } else if (!init2.getInstance().equals(cleanup())) {
                    throw new IllegalArgumentException();
                }
            }
            return cca_continue(init, init2, z);
        }

        public final boolean getInstance(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getInstance();
        }

        public boolean values() {
            if (this.init == null || this.configure == null || !this.Cardinal.cleanup()) {
                return false;
            }
            return this.getInstance.onCReqSuccess() || this.getInstance.cleanup();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public cca_continue(int r6, int r7, int r8, int r9) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x004c
                r0 = 2
                r1 = 1
                r2 = 3
                r3 = 0
                if (r8 != 0) goto L_0x001f
                if (r9 != 0) goto L_0x0017
                int[] r8 = new int[r2]
                r8[r3] = r3
                r8[r1] = r7
                r8[r0] = r6
                com.cardinalcommerce.a.CompletionEvent r6 = com.cardinalcommerce.a.ByteUtils.Cardinal(r8)
                goto L_0x0035
            L_0x0017:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be 0 if k2 == 0"
                r6.<init>(r7)
                throw r6
            L_0x001f:
                if (r8 <= r7) goto L_0x0044
                if (r9 <= r8) goto L_0x003c
                r4 = 5
                int[] r4 = new int[r4]
                r4[r3] = r3
                r4[r1] = r7
                r4[r0] = r8
                r4[r2] = r9
                r7 = 4
                r4[r7] = r6
                com.cardinalcommerce.a.CompletionEvent r6 = com.cardinalcommerce.a.ByteUtils.Cardinal(r4)
            L_0x0035:
                r5.<init>(r6)
                r6 = 0
                r5.getWarnings = r6
                return
            L_0x003c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be > k2"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k2 must be > k1"
                r6.<init>(r7)
                throw r6
            L_0x004c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k1 must be > 0"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.toJSONString.cca_continue.<init>(int, int, int, int):void");
        }
    }

    public static class getInstance extends Cardinal {
        private JSONNavi.configure CardinalEnvironment;
        private BigInteger getSDKVersion;
        private BigInteger getWarnings;

        private getInstance(BigInteger bigInteger, BigInteger bigInteger2, merge merge, merge merge2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.getSDKVersion = bigInteger;
            this.getWarnings = bigInteger2;
            this.CardinalEnvironment = new JSONNavi.configure(this, (merge) null, (merge) null, false);
            this.getInstance = merge;
            this.Cardinal = merge2;
            this.init = bigInteger3;
            this.configure = bigInteger4;
            this.onValidated = 4;
        }

        public getInstance(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, (BigInteger) null, (BigInteger) null);
        }

        /* access modifiers changed from: protected */
        public final toJSONString Cardinal() {
            return new getInstance(this.getSDKVersion, this.getWarnings, this.getInstance, this.Cardinal, this.init, this.configure);
        }

        public final boolean Cardinal(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        /* access modifiers changed from: protected */
        public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
            return new JSONNavi.configure(this, merge, merge2, z);
        }

        /* access modifiers changed from: protected */
        public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
            return new JSONNavi.configure(this, merge, merge2, mergeArr, z);
        }

        public final int getInstance() {
            return this.getSDKVersion.bitLength();
        }

        public final JSONNavi init() {
            return this.CardinalEnvironment;
        }

        public final merge init(BigInteger bigInteger) {
            return new merge.cca_continue(this.getSDKVersion, this.getWarnings, bigInteger);
        }

        public getInstance(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.getSDKVersion = bigInteger;
            this.getWarnings = merge.cca_continue.configure(bigInteger);
            this.CardinalEnvironment = new JSONNavi.configure(this, (merge) null, (merge) null, false);
            this.getInstance = new merge.cca_continue(this.getSDKVersion, this.getWarnings, bigInteger2);
            this.Cardinal = new merge.cca_continue(this.getSDKVersion, this.getWarnings, bigInteger3);
            this.init = bigInteger4;
            this.configure = bigInteger5;
            this.onValidated = 4;
        }

        public final JSONNavi cca_continue(JSONNavi jSONNavi) {
            int valueOf;
            if (this == jSONNavi.configure() || valueOf() != 2 || jSONNavi.getString() || ((valueOf = jSONNavi.configure().valueOf()) != 2 && valueOf != 3 && valueOf != 4)) {
                return super.cca_continue(jSONNavi);
            }
            return new JSONNavi.configure(this, new merge.cca_continue(this.getSDKVersion, this.getWarnings, jSONNavi.init.cca_continue()), new merge.cca_continue(this.getSDKVersion, this.getWarnings, jSONNavi.cca_continue.cca_continue()), new merge[]{new merge.cca_continue(this.getSDKVersion, this.getWarnings, jSONNavi.getInstance[0].cca_continue())}, jSONNavi.Cardinal);
        }
    }

    public static class init extends cca_continue {
        private int CardinalEnvironment;
        private int CardinalError;
        int getSDKVersion;
        private int getWarnings;
        private JSONNavi.cca_continue valueOf;

        private init(int i, int i2, int i3, int i4, merge merge, merge merge2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.getSDKVersion = i;
            this.getWarnings = i2;
            this.CardinalError = i3;
            this.CardinalEnvironment = i4;
            this.init = bigInteger;
            this.configure = bigInteger2;
            this.valueOf = new JSONNavi.cca_continue(this, (merge) null, (merge) null, false);
            this.getInstance = merge;
            this.Cardinal = merge2;
            this.onValidated = 6;
        }

        public init(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public init(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        /* access modifiers changed from: protected */
        public final toJSONString Cardinal() {
            return new init(this.getSDKVersion, this.getWarnings, this.CardinalError, this.CardinalEnvironment, this.getInstance, this.Cardinal, this.init, this.configure);
        }

        public final boolean Cardinal(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        /* access modifiers changed from: protected */
        public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
            return new JSONNavi.cca_continue(this, merge, merge2, z);
        }

        /* access modifiers changed from: protected */
        public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
            return new JSONNavi.cca_continue(this, merge, merge2, mergeArr, z);
        }

        /* access modifiers changed from: protected */
        public final toString cca_continue() {
            return values() ? new set() : super.cca_continue();
        }

        public final int getInstance() {
            return this.getSDKVersion;
        }

        public final JSONNavi init() {
            return this.valueOf;
        }

        public final merge init(BigInteger bigInteger) {
            return new merge.configure(this.getSDKVersion, this.getWarnings, this.CardinalError, this.CardinalEnvironment, bigInteger);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public init(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.getSDKVersion = i;
            this.getWarnings = i2;
            this.CardinalError = i3;
            this.CardinalEnvironment = i4;
            this.init = bigInteger3;
            this.configure = bigInteger4;
            this.valueOf = new JSONNavi.cca_continue(this, (merge) null, (merge) null, false);
            this.getInstance = new merge.configure(this.getSDKVersion, this.getWarnings, this.CardinalError, this.CardinalEnvironment, bigInteger);
            this.Cardinal = new merge.configure(this.getSDKVersion, this.getWarnings, this.CardinalError, this.CardinalEnvironment, bigInteger2);
            this.onValidated = 6;
        }

        public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, int i) {
            final int i2 = (this.getSDKVersion + 63) >>> 6;
            int i3 = this.CardinalError;
            final int[] iArr = i3 == 0 && this.CardinalEnvironment == 0 ? new int[]{this.getWarnings} : new int[]{this.getWarnings, i3, this.CardinalEnvironment};
            final long[] jArr = new long[((i * i2) << 1)];
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                JSONNavi jSONNavi = jSONNaviArr[i5];
                newInstanceArray newinstancearray = ((merge.configure) jSONNavi.valueOf()).init;
                System.arraycopy(newinstancearray.cca_continue, 0, jArr, i4, newinstancearray.cca_continue.length);
                int i6 = i4 + i2;
                newInstanceArray newinstancearray2 = ((merge.configure) jSONNavi.CardinalEnvironment()).init;
                System.arraycopy(newinstancearray2.cca_continue, 0, jArr, i6, newinstancearray2.cca_continue.length);
                i4 = i6 + i2;
            }
            final int i7 = i;
            return new JSONArray() {
                public final int getInstance() {
                    return i7;
                }

                public final JSONNavi configure(int i) {
                    int i2;
                    int i3 = i2;
                    long[] jArr = new long[i3];
                    long[] jArr2 = new long[i3];
                    int i4 = 0;
                    for (int i5 = 0; i5 < i7; i5++) {
                        long j = (long) (((i5 ^ i) - 1) >> 31);
                        int i6 = 0;
                        while (true) {
                            i2 = i2;
                            if (i6 >= i2) {
                                break;
                            }
                            long j2 = jArr[i6];
                            long[] jArr3 = jArr;
                            jArr[i6] = j2 ^ (jArr3[i4 + i6] & j);
                            jArr2[i6] = jArr2[i6] ^ (jArr3[(i2 + i4) + i6] & j);
                            i6++;
                        }
                        i4 += i2 << 1;
                    }
                    return new JSONNavi.cca_continue(init.this, new merge.configure(init.this.getSDKVersion, iArr, new newInstanceArray(jArr)), new merge.configure(init.this.getSDKVersion, iArr, new newInstanceArray(jArr2)), false);
                }
            };
        }
    }

    private JSONNavi cca_continue(BigInteger bigInteger, BigInteger bigInteger2) {
        JSONNavi configure2 = configure(bigInteger, bigInteger2, false);
        if (configure2.init(false, true)) {
            return configure2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public final GMCipherSpi.SM2withRMD cca_continue(JSONNavi jSONNavi, String str) {
        Hashtable hashtable;
        GMCipherSpi.SM2withRMD sM2withRMD;
        if (jSONNavi == null || this != jSONNavi.configure()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
        synchronized (jSONNavi) {
            hashtable = jSONNavi.getSDKVersion;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            sM2withRMD = (GMCipherSpi.SM2withRMD) hashtable.get(str);
        }
        return sM2withRMD;
    }

    public final GMCipherSpi.SM2withRMD Cardinal(JSONNavi jSONNavi, String str, getCurrentObject getcurrentobject) {
        Hashtable hashtable;
        GMCipherSpi.SM2withRMD Cardinal2;
        if (jSONNavi == null || this != jSONNavi.configure()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
        synchronized (jSONNavi) {
            hashtable = jSONNavi.getSDKVersion;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                jSONNavi.getSDKVersion = hashtable;
            }
        }
        synchronized (hashtable) {
            GMCipherSpi.SM2withRMD sM2withRMD = (GMCipherSpi.SM2withRMD) hashtable.get(str);
            Cardinal2 = getcurrentobject.Cardinal(sM2withRMD);
            if (Cardinal2 != sM2withRMD) {
                hashtable.put(str, Cardinal2);
            }
        }
        return Cardinal2;
    }

    public final void configure(JSONNavi[] jSONNaviArr, int i, int i2, merge merge) {
        getInstance(jSONNaviArr, i, i2);
        int i3 = this.onValidated;
        if (i3 != 0 && i3 != 5) {
            merge[] mergeArr = new merge[i2];
            int[] iArr = new int[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i + i5;
                JSONNavi jSONNavi = jSONNaviArr[i6];
                if (jSONNavi != null && (merge != null || !jSONNavi.CardinalError())) {
                    mergeArr[i4] = jSONNavi.getInstance(0);
                    iArr[i4] = i6;
                    i4++;
                }
            }
            if (i4 != 0) {
                appendElement.getInstance(mergeArr, i4, merge);
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = iArr[i7];
                    jSONNaviArr[i8] = jSONNaviArr[i8].init(mergeArr[i7]);
                }
            }
        } else if (merge != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    public final boolean configure(toJSONString tojsonstring) {
        if (this != tojsonstring) {
            return tojsonstring != null && this.cca_continue.equals(tojsonstring.cca_continue) && this.getInstance.cca_continue().equals(tojsonstring.getInstance.cca_continue()) && this.Cardinal.cca_continue().equals(tojsonstring.Cardinal.cca_continue());
        }
        return true;
    }

    public int hashCode() {
        return (this.cca_continue.hashCode() ^ Integer.rotateLeft(this.getInstance.cca_continue().hashCode(), 8)) ^ Integer.rotateLeft(this.Cardinal.cca_continue().hashCode(), 16);
    }
}
