package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private DSAParameterSpec getInstance;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        try {
            return new DSASigner.detDSA256(this.getInstance.getP(), this.getInstance.getQ(), this.getInstance.getG()).configure("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DSAParameters");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            this.getInstance = (DSAParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "DSA Parameters";
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.getInstance;
        } else {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
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
        try {
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(bArr);
            DSASigner.detDSA256 detdsa256 = Cardinal != null ? new DSASigner.detDSA256(isEnableLogging.getInstance((Object) Cardinal)) : null;
            this.getInstance = new DSAParameterSpec(new BigInteger(1, detdsa256.Cardinal.getInstance), new BigInteger(1, detdsa256.configure.getInstance), new BigInteger(1, detdsa256.getInstance.getInstance));
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid DSA Parameter encoding.");
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
