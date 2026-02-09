package com.cardinalcommerce.a;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class BaseAlgorithmParameterGeneratorSpi implements AlgorithmParameterSpec {
    public final PublicKey Cardinal;
    public final PrivateKey cca_continue;
    public final PublicKey getInstance;
    public final byte[] init;
}
