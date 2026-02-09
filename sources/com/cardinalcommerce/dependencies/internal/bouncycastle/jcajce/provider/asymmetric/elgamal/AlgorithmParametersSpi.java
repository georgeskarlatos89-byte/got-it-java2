package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class AlgorithmParametersSpi extends X931SignatureSpi {
    private AsymmetricKeyInfoConverter getInstance;

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z = algorithmParameterSpec instanceof AsymmetricKeyInfoConverter;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        } else if (z) {
            this.getInstance = (AsymmetricKeyInfoConverter) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.getInstance = new AsymmetricKeyInfoConverter(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "ElGamal Parameters";
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        try {
            return new KeyAgreementSpi.DHUwithSHA224KDF(this.getInstance.Cardinal, this.getInstance.configure).configure("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if ((str == null || str.equals("ASN.1")) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    public final AlgorithmParameterSpec cca_continue(Class cls) throws InvalidParameterSpecException {
        if (cls == AsymmetricKeyInfoConverter.class || cls == AlgorithmParameterSpec.class) {
            return this.getInstance;
        }
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.getInstance.Cardinal, this.getInstance.configure);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        try {
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(bArr);
            KeyAgreementSpi.DHUwithSHA224KDF dHUwithSHA224KDF = Cardinal != null ? new KeyAgreementSpi.DHUwithSHA224KDF(isEnableLogging.getInstance((Object) Cardinal)) : null;
            this.getInstance = new AsymmetricKeyInfoConverter(new BigInteger(1, dHUwithSHA224KDF.cca_continue.getInstance), new BigInteger(1, dHUwithSHA224KDF.getInstance.getInstance));
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
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
