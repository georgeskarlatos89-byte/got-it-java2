package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util;

import com.cardinalcommerce.a.PSSSignatureSpi;

public abstract class AlgorithmProvider {
    public abstract void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA);
}
