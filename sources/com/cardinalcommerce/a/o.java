package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class o extends toJSONString.Cardinal {
    public static final BigInteger getWarnings = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    private JSONObject getSDKVersion = new JSONObject(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 5) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            ProtocolErrorEvent.getInstance(((isArray) jSONNavi.valueOf()).cca_continue, iArr, i2);
            int i4 = i2 + 5;
            ProtocolErrorEvent.getInstance(((isArray) jSONNavi.CardinalEnvironment()).cca_continue, iArr, i4);
            i2 = i4 + 5;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[5];
                int[] iArr2 = new int[5];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 5; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 5) + i5] & i4);
                    }
                    i2 += 10;
                }
                return new JSONObject(o.this, new isArray(iArr), new isArray(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new o();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new JSONObject(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new JSONObject(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getWarnings.bitLength();
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new isArray(bigInteger);
    }

    public o() {
        super(getWarnings);
        this.getInstance = new isArray(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.Cardinal = new isArray(new BigInteger(1, getHeadingTextFontName.init("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("0100000000000000000000351EE786A818F3A1A16B"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
