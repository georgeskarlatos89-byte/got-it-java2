package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class add extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = setErrorCode.configure(asDoubleObj.cca_continue);
    private asString getWarnings = new asString(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i << 3) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            setErrorCode.getInstance(((asDouble) jSONNavi.valueOf()).getInstance, iArr, i2);
            int i4 = i2 + 8;
            setErrorCode.getInstance(((asDouble) jSONNavi.CardinalEnvironment()).getInstance, iArr, i4);
            i2 = i4 + 8;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 8; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 8) + i5] & i4);
                    }
                    i2 += 16;
                }
                return new asString(add.this, new asDouble(iArr), new asDouble(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new add();
    }

    public final boolean Cardinal(int i) {
        return i == 4;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new asString(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new asString(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new asDouble(bigInteger);
    }

    public add() {
        super(getSDKVersion);
        this.getInstance = new asDouble(new BigInteger(1, getHeadingTextFontName.init("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.Cardinal = new asDouble(new BigInteger(1, getHeadingTextFontName.init("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.configure = BigInteger.valueOf(8);
        this.onValidated = 4;
    }
}
