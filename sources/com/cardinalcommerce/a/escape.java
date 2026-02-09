package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class escape extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    private up getWarnings = new up(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 6) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            RuntimeErrorEvent.getInstance(((failure) jSONNavi.valueOf()).cca_continue, iArr, i2);
            int i4 = i2 + 6;
            RuntimeErrorEvent.getInstance(((failure) jSONNavi.CardinalEnvironment()).cca_continue, iArr, i4);
            i2 = i4 + 6;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[6];
                int[] iArr2 = new int[6];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 6; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 6) + i5] & i4);
                    }
                    i2 += 12;
                }
                return new up(escape.this, new failure(iArr), new failure(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new escape();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new up(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new up(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new failure(bigInteger);
    }

    public escape() {
        super(getSDKVersion);
        this.getInstance = new failure(writeJSONString.getSDKVersion);
        this.Cardinal = new failure(BigInteger.valueOf(3));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
