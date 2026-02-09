package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class JWECryptoParts extends toJSONString.cca_continue {
    private JOSEException getSDKVersion = new JOSEException(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i * 5) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            setErrorMessage.cca_continue(((JWEHeader) jSONNavi.valueOf()).getInstance, jArr, i2);
            int i4 = i2 + 5;
            setErrorMessage.cca_continue(((JWEHeader) jSONNavi.CardinalEnvironment()).getInstance, jArr, i4);
            i2 = i4 + 5;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[5];
                long[] jArr2 = new long[5];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 5; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 5) + i4] & j);
                    }
                    i2 += 10;
                }
                return new JOSEException(JWECryptoParts.this, new JWEHeader(jArr), new JWEHeader(jArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new JWECryptoParts();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new JOSEException(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new JOSEException(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return 283;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new JWEHeader(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public JWECryptoParts() {
        super(283, 5, 7, 12);
        this.getInstance = new JWEHeader(BigInteger.valueOf(1));
        this.Cardinal = new JWEHeader(new BigInteger(1, getHeadingTextFontName.init("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }
}
