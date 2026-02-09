package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class protect4Web extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    private objectNext getWarnings = new objectNext(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i << 3) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            setErrorCode.getInstance(((indent) jSONNavi.valueOf()).Cardinal, iArr, i2);
            int i4 = i2 + 8;
            setErrorCode.getInstance(((indent) jSONNavi.CardinalEnvironment()).Cardinal, iArr, i4);
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
                return new objectNext(protect4Web.this, new indent(iArr), new indent(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new protect4Web();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new objectNext(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new objectNext(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new indent(bigInteger);
    }

    public protect4Web() {
        super(getSDKVersion);
        this.getInstance = new indent(writeJSONString.getSDKVersion);
        this.Cardinal = new indent(BigInteger.valueOf(7));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
