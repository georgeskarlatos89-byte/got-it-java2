package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.models.Payload;
import org.objectweb.asm.signature.SignatureVisitor;

public final class onValidated {
    private static int getInstance = 0;
    private static int onCReqSuccess = 1;
    public Payload Cardinal;
    public String cca_continue;
    public int configure;
    private String init;

    public final void Cardinal(Payload payload) {
        int i = onCReqSuccess;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        this.Cardinal = payload;
        int i4 = (((i | 10) << 1) - (i ^ 10)) - 1;
        getInstance = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void configure(int i) {
        int i2 = getInstance;
        int i3 = i2 & 123;
        int i4 = i3 + ((i2 ^ 123) | i3);
        onCReqSuccess = i4 % 128;
        int i5 = i4 % 2;
        this.configure = i;
        int i6 = i2 + 61;
        onCReqSuccess = i6 % 128;
        if ((i6 % 2 == 0 ? 25 : ')') != ')') {
            int i7 = 21 / 0;
        }
    }

    public final void Cardinal(String str) {
        boolean z = true;
        int i = (onCReqSuccess + 104) - 1;
        int i2 = i % 128;
        getInstance = i2;
        int i3 = i % 2;
        this.cca_continue = str;
        int i4 = i2 ^ 125;
        int i5 = (((i2 & 125) | i4) << 1) - i4;
        onCReqSuccess = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    public final Payload getInstance() {
        int i = onCReqSuccess;
        int i2 = i & 81;
        int i3 = -(-((i ^ 81) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getInstance = i4 % 128;
        int i5 = i4 % 2;
        Payload payload = this.Cardinal;
        int i6 = i & 69;
        int i7 = (i | 69) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        getInstance = i9 % 128;
        int i10 = i9 % 2;
        return payload;
    }

    public final String init() {
        int i = onCReqSuccess;
        int i2 = i & 117;
        int i3 = (i | 117) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        getInstance = i5 % 128;
        if ((i5 % 2 != 0 ? 'P' : SignatureVisitor.SUPER) != 'P') {
            return this.init;
        }
        int i6 = 36 / 0;
        return this.init;
    }

    public final void configure(String str) {
        int i = getInstance;
        int i2 = i & 115;
        int i3 = (((i ^ 115) | i2) << 1) - ((~i2) & (i | 115));
        onCReqSuccess = i3 % 128;
        int i4 = i3 % 2;
        this.init = str;
        int i5 = ((i | 125) << 1) - (i ^ 125);
        onCReqSuccess = i5 % 128;
        if ((i5 % 2 == 0 ? (char) 9 : 27) != 27) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
