package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class object extends toJSONString.Cardinal {
    public static final BigInteger getWarnings = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    private a getSDKVersion = new a(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i * 5) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            ProtocolErrorEvent.getInstance(((atNext) jSONNavi.valueOf()).configure, iArr, i2);
            int i4 = i2 + 5;
            ProtocolErrorEvent.getInstance(((atNext) jSONNavi.CardinalEnvironment()).configure, iArr, i4);
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
                return new a(object.this, new atNext(iArr), new atNext(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new object();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new a(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new a(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getWarnings.bitLength();
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new atNext(bigInteger);
    }

    public object() {
        super(getWarnings);
        this.getInstance = new atNext(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.Cardinal = new atNext(new BigInteger(1, getHeadingTextFontName.init("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("0100000000000000000001F4C8F927AED3CA752257"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
