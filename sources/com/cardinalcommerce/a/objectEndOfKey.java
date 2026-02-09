package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class objectEndOfKey extends toJSONString.Cardinal {
    public static final BigInteger getWarnings = new BigInteger(1, getHeadingTextFontName.init("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    private convertToStrict getSDKVersion = new convertToStrict(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new objectEndOfKey();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new convertToStrict(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new convertToStrict(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getWarnings.bitLength();
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new convertToX(bigInteger);
    }

    public objectEndOfKey() {
        super(getWarnings);
        this.getInstance = new convertToX(new BigInteger(1, getHeadingTextFontName.init("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.Cardinal = new convertToX(new BigInteger(1, getHeadingTextFontName.init("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 17) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            System.arraycopy(((convertToX) jSONNavi.valueOf()).cca_continue, 0, iArr, i2, 17);
            int i4 = i2 + 17;
            System.arraycopy(((convertToX) jSONNavi.CardinalEnvironment()).cca_continue, 0, iArr, i4, 17);
            i2 = i4 + 17;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[17];
                int[] iArr2 = new int[17];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 17; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 17) + i5] & i4);
                    }
                    i2 += 34;
                }
                return new convertToStrict(objectEndOfKey.this, new convertToX(iArr), new convertToX(iArr2), false);
            }
        };
    }
}
