package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    private final BaseCipherSpi.ErasableOutputStream Cardinal = new X931SignatureSpi.WhirlpoolWithRSAEncryption();

    /* access modifiers changed from: protected */
    public final AlgorithmParameters cca_continue(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.Cardinal.cca_continue(str);
    }
}
