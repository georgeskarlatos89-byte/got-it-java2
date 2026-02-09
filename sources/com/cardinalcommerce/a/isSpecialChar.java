package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class isSpecialChar extends toJSONString.cca_continue {
    private isSpecial getSDKVersion = new isSpecial(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new isSpecialChar();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new isSpecial(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new isSpecial(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return Opcodes.INSTANCEOF;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new isValidJson(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public isSpecialChar() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.getInstance = new isValidJson(new BigInteger(1, getHeadingTextFontName.init("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.Cardinal = new isValidJson(new BigInteger(1, getHeadingTextFontName.init("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i << 2) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            long[] jArr2 = ((isValidJson) jSONNavi.valueOf()).Cardinal;
            jArr[i2] = jArr2[0];
            jArr[i2 + 1] = jArr2[1];
            jArr[i2 + 2] = jArr2[2];
            jArr[i2 + 3] = jArr2[3];
            int i4 = i2 + 4;
            long[] jArr3 = ((isValidJson) jSONNavi.CardinalEnvironment()).Cardinal;
            jArr[i4] = jArr3[0];
            jArr[i4 + 1] = jArr3[1];
            jArr[i4 + 2] = jArr3[2];
            jArr[i4 + 3] = jArr3[3];
            i2 = i4 + 4;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[4];
                long[] jArr2 = new long[4];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 4; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 4) + i4] & j);
                    }
                    i2 += 8;
                }
                return new isSpecial(isSpecialChar.this, new isValidJson(jArr), new isValidJson(jArr2), false);
            }
        };
    }
}
