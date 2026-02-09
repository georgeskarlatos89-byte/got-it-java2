package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class RSAEncrypter extends toJSONString.cca_continue {
    private DirectDecrypter getWarnings = new DirectDecrypter(this, (merge) null, (merge) null);

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
                return new DirectDecrypter(RSAEncrypter.this, new DirectEncrypter(jArr), new DirectEncrypter(jArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new RSAEncrypter();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new DirectDecrypter(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new DirectDecrypter(this, merge, merge2, mergeArr, z);
    }

    public final toString cca_continue() {
        return new set();
    }

    public final int getInstance() {
        return 571;
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new DirectEncrypter(bigInteger);
    }

    public final boolean values() {
        return true;
    }

    public RSAEncrypter() {
        super(571, 2, 5, 10);
        this.getInstance = new DirectEncrypter(BigInteger.valueOf(0));
        this.Cardinal = new DirectEncrypter(BigInteger.valueOf(1));
        this.init = new BigInteger(1, getHeadingTextFontName.init("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.configure = BigInteger.valueOf(4);
        this.onValidated = 6;
    }
}
