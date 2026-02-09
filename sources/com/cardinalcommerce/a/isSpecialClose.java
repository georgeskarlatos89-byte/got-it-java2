package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class isSpecialClose extends toJSONString.cca_continue {
    private isSpace getWarnings = new isSpace(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new isSpecialClose();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new isSpace(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new isSpace(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return Opcodes.INSTANCEOF;
    }

    public final JSONNavi init() {
        return this.getWarnings;
    }

    public final merge init(BigInteger bigInteger) {
        return new isValidJson(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public isSpecialClose() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.getInstance = new isValidJson(new BigInteger(1, getHeadingTextFontName.init("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.Cardinal = new isValidJson(new BigInteger(1, getHeadingTextFontName.init("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("01000000000000000000000000C7F34A778F443ACC920EBA49"));
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
                return new isSpace(isSpecialClose.this, new isValidJson(jArr), new isValidJson(jArr2), false);
            }
        };
    }
}
