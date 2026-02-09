package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;

public class setCCAImageUri implements GMCipherSpi.SM2withRMD {
    public boolean getSDKVersion;

    setCCAImageUri() {
    }

    static BCDSAPrivateKey Cardinal(String str) {
        if (str.equals("SHA-1")) {
            return new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA1KDF.onValidated, isEnabledVisaCheckout.configure);
        }
        if (str.equals("SHA-224")) {
            return new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.onValidated, isEnabledVisaCheckout.configure);
        }
        if (str.equals("SHA-256")) {
            return new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.cca_continue, isEnabledVisaCheckout.configure);
        }
        if (str.equals("SHA-384")) {
            return new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.Cardinal, isEnabledVisaCheckout.configure);
        }
        if (str.equals("SHA-512")) {
            return new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.getInstance, isEnabledVisaCheckout.configure);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(String.valueOf(str)));
    }

    public static IESCipher.ECIESwithAESCBC init(BCDSAPrivateKey bCDSAPrivateKey) {
        if (bCDSAPrivateKey.cca_continue.equals(KeyAgreementSpi.DHUwithSHA1KDF.onValidated)) {
            return new KeyFactorySpi.ECMQV();
        }
        if (bCDSAPrivateKey.cca_continue.equals(IESCipher.IESwithDESedeCBC.onValidated)) {
            return new KeyPairGeneratorSpi.ECDHC();
        }
        if (bCDSAPrivateKey.cca_continue.equals(IESCipher.IESwithDESedeCBC.cca_continue)) {
            return new SignatureSpi.ecCVCDSA224();
        }
        if (bCDSAPrivateKey.cca_continue.equals(IESCipher.IESwithDESedeCBC.Cardinal)) {
            return new SignatureSpi.ecCVCDSA();
        }
        if (bCDSAPrivateKey.cca_continue.equals(IESCipher.IESwithDESedeCBC.getInstance)) {
            return new KeyPairGeneratorSpi.ECMQV();
        }
        throw new IllegalArgumentException(new StringBuilder("unrecognised OID in digest algorithm identifier: ").append(bCDSAPrivateKey.cca_continue).toString());
    }

    public setCCAImageUri(boolean z) {
        this.getSDKVersion = z;
    }

    public final boolean configure() {
        return this.getSDKVersion;
    }
}
