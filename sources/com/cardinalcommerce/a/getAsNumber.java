package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class getAsNumber extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    private protectValues getWarnings = new protectValues(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 7) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            getSDKTransactionID.configure(((JSONStreamAwareEx) jSONNavi.valueOf()).cca_continue, iArr, i2);
            int i4 = i2 + 7;
            getSDKTransactionID.configure(((JSONStreamAwareEx) jSONNavi.CardinalEnvironment()).cca_continue, iArr, i4);
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
                return new protectValues(getAsNumber.this, new JSONStreamAwareEx(iArr), new JSONStreamAwareEx(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new getAsNumber();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new protectValues(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new protectValues(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new JSONStreamAwareEx(bigInteger);
    }

    public getAsNumber() {
        super(getSDKVersion);
        this.getInstance = new JSONStreamAwareEx(writeJSONString.getSDKVersion);
        this.Cardinal = new JSONStreamAwareEx(BigInteger.valueOf(5));
        this.init = new BigInteger(1, getHeadingTextFontName.init("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
