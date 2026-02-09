package com.cardinalcommerce.a;

import com.cardinalcommerce.a.BaseCipherSpi;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class DSABase implements BaseCipherSpi.ErasableOutputStream {
    private Provider cca_continue;

    public DSABase(Provider provider) {
        this.cca_continue = provider;
    }

    public final CertificateFactory Cardinal(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.cca_continue);
    }

    public final AlgorithmParameters cca_continue(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str, this.cca_continue);
    }

    public final KeyFactory getInstance(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.cca_continue);
    }

    public final Signature init(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.cca_continue);
    }
}
