package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class registerReader extends toJSONString.cca_continue {
    private remapField getSDKVersion = new remapField(this, (merge) null, (merge) null);

    public final toJSONString Cardinal() {
        return new registerReader();
    }

    public final boolean Cardinal(int i) {
        return i == 6;
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, boolean z) {
        return new remapField(this, merge, merge2, z);
    }

    public final JSONNavi cca_continue(merge merge, merge merge2, merge[] mergeArr, boolean z) {
        return new remapField(this, merge, merge2, mergeArr, z);
    }

    public final int getInstance() {
        return Opcodes.IF_ICMPGT;
    }

    public final JSONNavi init() {
        return this.getSDKVersion;
    }

    public final merge init(BigInteger bigInteger) {
        return new parseWithException(bigInteger);
    }

    public final boolean values() {
        return false;
    }

    public registerReader() {
        super(Opcodes.IF_ICMPGT, 3, 6, 7);
        this.getInstance = new parseWithException(BigInteger.valueOf(1));
        this.Cardinal = new parseWithException(new BigInteger(1, getHeadingTextFontName.init("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.init = new BigInteger(1, getHeadingTextFontName.init("040000000000000000000292FE77E70C12A4234C33"));
        this.configure = BigInteger.valueOf(2);
        this.onValidated = 6;
    }

    public final JSONArray Cardinal(JSONNavi[] jSONNaviArr, final int i) {
        final long[] jArr = new long[((i * 3) << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            JSONNavi jSONNavi = jSONNaviArr[i3];
            long[] jArr2 = ((parseWithException) jSONNavi.valueOf()).cca_continue;
            jArr[i2] = jArr2[0];
            jArr[i2 + 1] = jArr2[1];
            jArr[i2 + 2] = jArr2[2];
            int i4 = i2 + 3;
            long[] jArr3 = ((parseWithException) jSONNavi.CardinalEnvironment()).cca_continue;
            jArr[i4] = jArr3[0];
            jArr[i4 + 1] = jArr3[1];
            jArr[i4 + 2] = jArr3[2];
            i2 = i4 + 3;
        }
        return new JSONArray() {
            public final int getInstance() {
                return i;
            }

            public final JSONNavi configure(int i) {
                long[] jArr = new long[3];
                long[] jArr2 = new long[3];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    long j = (long) (((i3 ^ i) - 1) >> 31);
                    for (int i4 = 0; i4 < 3; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = jArr;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 3) + i4] & j);
                    }
                    i2 += 6;
                }
                return new remapField(registerReader.this, new parseWithException(jArr), new parseWithException(jArr2), false);
            }
        };
    }
}
