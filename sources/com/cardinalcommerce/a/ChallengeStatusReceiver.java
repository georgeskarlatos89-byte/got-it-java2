package com.cardinalcommerce.a;

public final class ChallengeStatusReceiver extends setCCAImageUri {
    public byte[] cca_continue;
    public int getInstance;

    public ChallengeStatusReceiver(int i, byte[] bArr) {
        super(true);
        int i2;
        byte[] bArr2;
        int length = bArr.length;
        if (i == 0) {
            i2 = 1344;
        } else if (i == 1) {
            i2 = 2112;
        } else if (i == 2) {
            i2 = 2368;
        } else if (i == 3) {
            i2 = 5184;
        } else if (i == 4) {
            i2 = 12352;
        } else {
            throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
        if (length == i2) {
            this.getInstance = i;
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            this.cca_continue = bArr2;
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
