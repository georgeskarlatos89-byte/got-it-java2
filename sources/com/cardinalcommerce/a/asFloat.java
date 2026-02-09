package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class asFloat extends toJSONString.Cardinal {
    public static final BigInteger getWarnings = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    private asIntegerObj getSDKVersion = new asIntegerObj(this, (merge) null, (merge) null);

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final int[] iArr = new int[((i << 3) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            setErrorCode.getInstance(((asLongObj) jSONNavi.valueOf()).cca_continue, iArr, i2);
            int i4 = i2 + 8;
            setErrorCode.getInstance(((asLongObj) jSONNavi.CardinalEnvironment()).cca_continue, iArr, i4);
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
                return new asIntegerObj(asFloat.this, new asLongObj(iArr), new asLongObj(iArr2), false);
            }
        };
    }

    public final toJSONString Cardinal() {
        return new asFloat();
    }

    public final boolean Cardinal(int i) {
        return i == 2;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new asIntegerObj(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new asIntegerObj(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return getWarnings.bitLength();
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new asLongObj(bigInteger);
    }

    public asFloat() {
        super(getWarnings);
        this.getInstance = new asLongObj(new BigInteger(1, getHeadingTextFontName.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.Cardinal = new asLongObj(new BigInteger(1, getHeadingTextFontName.init("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.configure = BigInteger.valueOf(1);
        this.onValidated = 2;
    }
}
