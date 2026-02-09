package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONUtil;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class getSetterName extends toJSONString.cca_continue {
    private JSONUtil.JsonSmartFieldFilter getSDKVersion = new JSONUtil.JsonSmartFieldFilter(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new getSetterName();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new JSONUtil.JsonSmartFieldFilter(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new JSONUtil.JsonSmartFieldFilter(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return 113;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new arrayNextElm(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public getSetterName() {
        super(113, 9, 0, 0);
        this.getInstance = new arrayNextElm(new BigInteger(1, getHeadingTextFontName.init("003088250CA6E7C7FE649CE85820F7")));
        this.Cardinal = new arrayNextElm(new BigInteger(1, getHeadingTextFontName.init("00E8BEE4D3E2260744188BE0E9C723")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("0100000000000000D9CCEC8A39E56F"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i << 1) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            long[] jArr2 = ((arrayNextElm) jSONNavi.valueOf()).init;
            jArr[i2] = jArr2[0];
            jArr[i2 + 1] = jArr2[1];
            int i4 = i2 + 2;
            long[] jArr3 = ((arrayNextElm) jSONNavi.CardinalEnvironment()).init;
            jArr[i4] = jArr3[0];
            jArr[i4 + 1] = jArr3[1];
            i2 = i4 + 2;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 2; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 2) + i4] & j);
                    }
                    i2 += 4;
                }
                return new JSONUtil.JsonSmartFieldFilter(getSetterName.this, new arrayNextElm(jArr), new arrayNextElm(jArr2), false);
            }
        };
    }
}
