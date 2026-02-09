package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class JSONStyle extends toJSONString.Cardinal {
    public static final BigInteger getWarnings = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    private mustProtectValue getSDKVersion = new mustProtectValue(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 7) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            getSDKTransactionID.configure(((ignoreNull) jSONNavi.valueOf()).getInstance, iArr, i2);
            int i4 = i2 + 7;
            getSDKTransactionID.configure(((ignoreNull) jSONNavi.CardinalEnvironment()).getInstance, iArr, i4);
            i2 = i4 + 7;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[7];
                int[] iArr2 = new int[7];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 7; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 7) + i5] & i4);
                    }
                    i2 += 14;
                }
                return new mustProtectValue(JSONStyle.this, new ignoreNull(iArr), new ignoreNull(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new JSONStyle();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new mustProtectValue(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new mustProtectValue(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getWarnings.bitLength();
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new ignoreNull(bigInteger);
    }

    public JSONStyle() {
        super(getWarnings);
        this.getInstance = new ignoreNull(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.Cardinal = new ignoreNull(new BigInteger(1, getHeadingTextFontName.init("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
