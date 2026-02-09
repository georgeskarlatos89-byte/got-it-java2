package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class arrayStart extends toJSONString.Cardinal {
    public static final BigInteger getSDKVersion = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    private arrayStop getWarnings = new arrayStop(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new arrayStart();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new arrayStop(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new arrayStop(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getSDKVersion.bitLength();
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new objectElmStop(bigInteger);
    }

    public arrayStart() {
        super(getSDKVersion);
        this.getInstance = new objectElmStop(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.Cardinal = new objectElmStop(new BigInteger(1, getHeadingTextFontName.init("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 12) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            System.arraycopy(((objectElmStop) jSONNavi.valueOf()).configure, 0, iArr, i2, 12);
            int i4 = i2 + 12;
            System.arraycopy(((objectElmStop) jSONNavi.CardinalEnvironment()).configure, 0, iArr, i4, 12);
            i2 = i4 + 12;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                int[] iArr = new int[12];
                int[] iArr2 = new int[12];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 12; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = iArr;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 12) + i5] & i4);
                    }
                    i2 += 24;
                }
                return new arrayStop(arrayStart.this, new objectElmStop(iArr), new objectElmStop(iArr2), false);
            }
        };
    }
}
