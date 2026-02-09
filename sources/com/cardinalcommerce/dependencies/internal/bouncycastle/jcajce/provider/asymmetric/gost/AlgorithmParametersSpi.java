package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.NHKeyFactorySpi;
import com.cardinalcommerce.a.QTESLAKeyFactorySpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private QTESLAKeyFactorySpi Cardinal;

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof QTESLAKeyFactorySpi) {
            this.Cardinal = (QTESLAKeyFactorySpi) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        try {
            this.Cardinal = QTESLAKeyFactorySpi.init(new AlgorithmParameterGeneratorSpi((isEnableLogging) getThreeDSRequestorAppURL.Cardinal(bArr)));
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        }
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "GOST3410 Parameters";
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else if (cls == NHKeyFactorySpi.class || cls == AlgorithmParameterSpec.class) {
            return this.Cardinal;
        } else {
            throw new InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        try {
            return new AlgorithmParameterGeneratorSpi(new ASN1ObjectIdentifier(this.Cardinal.configure), new ASN1ObjectIdentifier(this.Cardinal.Cardinal), new ASN1ObjectIdentifier(this.Cardinal.init)).configure("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding GOST3410Parameters");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if ((str == null || str.equals("ASN.1")) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) throws IOException {
        if ((str == null || str.equals("ASN.1")) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
    }
}
