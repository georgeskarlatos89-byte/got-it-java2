package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setUICustomization;
import java.io.IOException;
import java.security.SignatureException;

public class SignatureSpiLe extends SignatureSpi {
    private static void init(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        byte[] instance = setUICustomization.init(super.engineSign()).getInstance();
        init(instance);
        try {
            return new setEnabledVisaCheckout(instance).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] instance = ((setUICustomization) setUICustomization.Cardinal(bArr)).getInstance();
            init(instance);
            try {
                return super.engineVerify(new setEnabledVisaCheckout(instance).getEncoded());
            } catch (SignatureException e) {
                throw e;
            } catch (Exception e2) {
                throw new SignatureException(e2.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
