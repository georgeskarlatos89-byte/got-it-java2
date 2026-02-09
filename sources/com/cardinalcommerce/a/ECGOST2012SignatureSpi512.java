package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import java.security.SecureRandom;

public final class ECGOST2012SignatureSpi512 implements GMCipherSpi.SM2 {
    private SecureRandom cca_continue;

    public final void getInstance(appendElement appendelement) {
        this.cca_continue = appendelement.configure;
    }

    public final PSSSignatureSpi.SHA256withRSA init() {
        DigestSignatureSpi.RIPEMD160 ripemd160 = new DigestSignatureSpi.RIPEMD160(this.cca_continue);
        byte[] bArr = new byte[32];
        ECKey.Cardinal(ripemd160.getInstance, 0, bArr, 0);
        return new PSSSignatureSpi.SHA256withRSA(new DigestSignatureSpi.SHA3_224(bArr, 0), ripemd160);
    }
}
