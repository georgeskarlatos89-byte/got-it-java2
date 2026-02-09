package com.cardinalcommerce.a;

public final class Transaction {
    public short[][] Cardinal;
    public short[] cca_continue;
    public short[][][] configure;
    private int getInstance;
    public short[][][] init;
    private int onCReqSuccess;
    private int onValidated;

    public Transaction(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b3 = b & 255;
        this.getInstance = b3;
        byte b4 = b2 & 255;
        this.onCReqSuccess = b4;
        this.onValidated = b4 - b3;
        this.init = sArr;
        this.configure = sArr2;
        this.Cardinal = sArr3;
        this.cca_continue = sArr4;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Transaction)) {
            Transaction transaction = (Transaction) obj;
            if (this.getInstance != transaction.getInstance || this.onCReqSuccess != transaction.onCReqSuccess || this.onValidated != transaction.onValidated || !protocolError.cca_continue(this.init, transaction.init) || !protocolError.cca_continue(this.configure, transaction.configure) || !protocolError.Cardinal(this.Cardinal, transaction.Cardinal) || !protocolError.getInstance(this.cca_continue, transaction.cca_continue)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.getInstance * 37) + this.onCReqSuccess) * 37) + this.onValidated) * 37;
        short[][][] sArr = this.init;
        int i2 = 0;
        for (int i3 = 0; i3 != sArr.length; i3++) {
            int i4 = i2 * 257;
            short[][] sArr2 = sArr[i3];
            int i5 = 0;
            for (int i6 = 0; i6 != sArr2.length; i6++) {
                i5 = (i5 * 257) + getBackgroundColor.getInstance(sArr2[i6]);
            }
            i2 = i4 + i5;
        }
        int i7 = (i + i2) * 37;
        short[][][] sArr3 = this.configure;
        int i8 = 0;
        for (int i9 = 0; i9 != sArr3.length; i9++) {
            int i10 = i8 * 257;
            short[][] sArr4 = sArr3[i9];
            int i11 = 0;
            for (int i12 = 0; i12 != sArr4.length; i12++) {
                i11 = (i11 * 257) + getBackgroundColor.getInstance(sArr4[i12]);
            }
            i8 = i10 + i11;
        }
        int i13 = (i7 + i8) * 37;
        short[][] sArr5 = this.Cardinal;
        int i14 = 0;
        for (int i15 = 0; i15 != sArr5.length; i15++) {
            i14 = (i14 * 257) + getBackgroundColor.getInstance(sArr5[i15]);
        }
        return ((i13 + i14) * 37) + getBackgroundColor.getInstance(this.cca_continue);
    }
}
