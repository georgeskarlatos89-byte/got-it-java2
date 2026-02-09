package com.cardinalcommerce.a;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.AlgorithmParameterSpec;

public final class BaseCipherSpi implements AlgorithmParameterSpec {
    public final String configure;

    public interface ErasableOutputStream {
        CertificateFactory Cardinal(String str) throws NoSuchProviderException, CertificateException;

        AlgorithmParameters cca_continue(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

        KeyFactory getInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

        Signature init(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
    }
}
