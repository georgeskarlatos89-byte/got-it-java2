package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class JWEObject extends toJSONString.cca_continue {
    private RSASSAVerifier getSDKVersion = new RSASSAVerifier(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i * 7) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            AuthenticationRequestParameters.init(((JWSObject) jSONNavi.valueOf()).configure, jArr, i2);
            int i4 = i2 + 7;
            AuthenticationRequestParameters.init(((JWSObject) jSONNavi.CardinalEnvironment()).configure, jArr, i4);
            i2 = i4 + 7;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[7];
                long[] jArr2 = new long[7];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 7; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 7) + i4] & j);
                    }
                    i2 += 14;
                }
                return new RSASSAVerifier(JWEObject.this, new JWSObject(jArr), new JWSObject(jArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new JWEObject();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new RSASSAVerifier(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new RSASSAVerifier(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return 409;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new JWSObject(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public JWEObject() {
        super(409, 87, 0, 0);
        this.getInstance = new JWSObject(BigInteger.valueOf(1));
        this.Cardinal = new JWSObject(new BigInteger(1, getHeadingTextFontName.init("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }
}
