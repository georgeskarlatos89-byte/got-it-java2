package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.isEnableLogging;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private DHParameterSpec init;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        try {
            return new KeyAgreementSpi.DHUwithSHA1CKDF(this.init.getP(), this.init.getG(), this.init.getL()).configure("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DHParameters");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            this.init = (DHParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.init;
        } else {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        KeyAgreementSpi.DHUwithSHA1CKDF dHUwithSHA1CKDF;
        BigInteger bigInteger;
        BigInteger bigInteger2 = null;
        if (bArr != null) {
            try {
                dHUwithSHA1CKDF = new KeyAgreementSpi.DHUwithSHA1CKDF(isEnableLogging.getInstance((Object) bArr));
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid DH Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid DH Parameter encoding.");
            }
        } else {
            dHUwithSHA1CKDF = null;
        }
        if (dHUwithSHA1CKDF.getInstance == null) {
            bigInteger = null;
        } else {
            bigInteger = new BigInteger(1, dHUwithSHA1CKDF.getInstance.getInstance);
        }
        if (bigInteger != null) {
            BigInteger bigInteger3 = new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance);
            BigInteger bigInteger4 = new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance);
            if (dHUwithSHA1CKDF.getInstance != null) {
                bigInteger2 = new BigInteger(1, dHUwithSHA1CKDF.getInstance.getInstance);
            }
            this.init = new DHParameterSpec(bigInteger3, bigInteger4, bigInteger2.intValue());
            return;
        }
        this.init = new DHParameterSpec(new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance), new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance));
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
    }
}
