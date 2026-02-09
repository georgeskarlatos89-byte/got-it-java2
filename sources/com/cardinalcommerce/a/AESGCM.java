package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class AESGCM extends toJSONString.cca_continue {
    static final DirectEncrypter getWarnings;
    private static DirectEncrypter valueOf;
    private AESCBC getSDKVersion = new AESCBC(this, (merge) null, (merge) null);

    static {
        DirectEncrypter directEncrypter = new DirectEncrypter(new BigInteger(1, getHeadingTextFontName.init("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        valueOf = directEncrypter;
        getWarnings = (DirectEncrypter) directEncrypter.getWarnings();
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i * 9) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            getSDKAppID.init(((DirectEncrypter) jSONNavi.valueOf()).Cardinal, jArr, i2);
            int i4 = i2 + 9;
            getSDKAppID.init(((DirectEncrypter) jSONNavi.CardinalEnvironment()).Cardinal, jArr, i4);
            i2 = i4 + 9;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[9];
                long[] jArr2 = new long[9];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 9; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 9) + i4] & j);
                    }
                    i2 += 18;
                }
                return new AESCBC(AESGCM.this, new DirectEncrypter(jArr), new DirectEncrypter(jArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new AESGCM();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new AESCBC(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new AESCBC(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return 571;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new DirectEncrypter(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public AESGCM() {
        super(571, 2, 5, 10);
        this.getInstance = new DirectEncrypter(BigInteger.valueOf(1));
        this.Cardinal = valueOf;
        this.init = new BigInteger(1, getHeadingTextFontName.init("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }
}
