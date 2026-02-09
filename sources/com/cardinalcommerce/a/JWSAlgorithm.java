package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class JWSAlgorithm extends toJSONString.cca_continue {
    private JWSVerifier getWarnings = new JWSVerifier(this, (merge) null, (merge) null);

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
                return new JWSVerifier(JWSAlgorithm.this, new JWSObject(jArr), new JWSObject(jArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new JWSAlgorithm();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new JWSVerifier(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new JWSVerifier(this, merge, merge2, mergeArr, z);
    }

    public final toString cca_continue() {
        return new set();
    }

    public final int getInstance() {
        return 409;
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new JWSObject(bigInteger);
    }

    public final boolean values() {
        return true;
    }

    public JWSAlgorithm() {
        super(409, 87, 0, 0);
        this.getInstance = new JWSObject(BigInteger.valueOf(0));
        this.Cardinal = new JWSObject(BigInteger.valueOf(1));
        this.init = new BigInteger(1, getHeadingTextFontName.init("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.configure = BigInteger.valueOf(4);
        this.onValidated = 6;
    }
}
