package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public final class getDeviceFingerprintUrl extends getUiType {
    public getDeviceFingerprintUrl(byte[] bArr) {
        super(bArr);
    }

    private byte[] valueOf() {
        if (this.init[this.init.length - 1] != 90) {
            return this.init;
        }
        if (!cleanup()) {
            byte[] bArr = new byte[(this.init.length + 4)];
            System.arraycopy(this.init, 0, bArr, 0, this.init.length - 1);
            System.arraycopy(getTextFontSize.configure("0000Z"), 0, bArr, this.init.length - 1, 5);
            return bArr;
        } else if (!onValidated()) {
            byte[] bArr2 = new byte[(this.init.length + 2)];
            System.arraycopy(this.init, 0, bArr2, 0, this.init.length - 1);
            System.arraycopy(getTextFontSize.configure("00Z"), 0, bArr2, this.init.length - 1, 3);
            return bArr2;
        } else if (!init()) {
            return this.init;
        } else {
            int length = this.init.length - 2;
            while (length > 0 && this.init[length] == 48) {
                length--;
            }
            if (this.init[length] == 46) {
                byte[] bArr3 = new byte[(length + 1)];
                System.arraycopy(this.init, 0, bArr3, 0, length);
                bArr3[length] = 90;
                return bArr3;
            }
            byte[] bArr4 = new byte[(length + 2)];
            int i = length + 1;
            System.arraycopy(this.init, 0, bArr4, 0, i);
            bArr4[i] = 90;
            return bArr4;
        }
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        int length = valueOf().length;
        return GM.Mappings.Cardinal(length) + 1 + length;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] valueOf = valueOf();
        getrendertype.getInstance(24);
        getrendertype.configure(valueOf.length);
        getrendertype.configure.write(valueOf);
    }
}
