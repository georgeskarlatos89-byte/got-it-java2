package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class asInt extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    private array getWarnings = new array(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new asInt();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new array(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new array(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new asBoolean(bigInteger);
    }

    public asInt() {
        super(getSDKVersion);
        this.getInstance = new asBoolean(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.Cardinal = new asBoolean(new BigInteger(1, getHeadingTextFontName.init("E87579C11079F43DD824993C2CEE5ED3")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFE0000000075A30D1B9038A115"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i << 2) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            int[] iArr2 = ((asBoolean) jSONNavi.valueOf()).getInstance;
            iArr[i2] = iArr2[0];
            iArr[i2 + 1] = iArr2[1];
            iArr[i2 + 2] = iArr2[2];
            iArr[i2 + 3] = iArr2[3];
            int i4 = i2 + 4;
            int[] iArr3 = ((asBoolean) jSONNavi.CardinalEnvironment()).getInstance;
            iArr[i4] = iArr3[0];
            iArr[i4 + 1] = iArr3[1];
            iArr[i4 + 2] = iArr3[2];
            iArr[i4 + 3] = iArr3[3];
            i2 = i4 + 4;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 4; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 4) + i5] & i4);
                    }
                    i2 += 8;
                }
                return new array(asInt.this, new asBoolean(iArr), new asBoolean(iArr2), false);
            }
        };
    }
}
