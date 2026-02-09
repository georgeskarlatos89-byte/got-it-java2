package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class isUnicode extends toJSONString.cca_continue {
    private isKeyword getWarnings = new isKeyword(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new isUnicode();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new isKeyword(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new isKeyword(this, merge, merge2, mergeArr, z);
    }

    public final toString cca_continue() {
        return new set();
    }

    public final int getInstance() {
        return 233;
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new JStylerObj.MPAgressive(bigInteger);
    }

    public final boolean values() {
        return true;
    }

    public isUnicode() {
        super(233, 74, 0, 0);
        this.getInstance = new JStylerObj.MPAgressive(BigInteger.valueOf(0));
        this.Cardinal = new JStylerObj.MPAgressive(BigInteger.valueOf(1));
        this.init = new BigInteger(1, getHeadingTextFontName.init("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.configure = BigInteger.valueOf(4);
        this.onValidated = 6;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i << 2) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            long[] jArr2 = ((JStylerObj.MPAgressive) jSONNavi.valueOf()).init;
            jArr[i2] = jArr2[0];
            jArr[i2 + 1] = jArr2[1];
            jArr[i2 + 2] = jArr2[2];
            jArr[i2 + 3] = jArr2[3];
            int i4 = i2 + 4;
            long[] jArr3 = ((JStylerObj.MPAgressive) jSONNavi.CardinalEnvironment()).init;
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
                return new isKeyword(isUnicode.this, new JStylerObj.MPAgressive(jArr), new JStylerObj.MPAgressive(jArr2), false);
            }
        };
    }
}
