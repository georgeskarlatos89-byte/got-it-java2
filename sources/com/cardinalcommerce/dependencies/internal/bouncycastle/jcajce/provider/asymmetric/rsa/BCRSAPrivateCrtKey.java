package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {
    private BigInteger Cardinal;
    private BigInteger cleanup;
    private BigInteger configure;
    private BigInteger getSDKVersion;
    private BigInteger init;
    private BigInteger onCReqSuccess;

    BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.getInstance = rSAPrivateCrtKey.getModulus();
        this.init = rSAPrivateCrtKey.getPublicExponent();
        this.cca_continue = rSAPrivateCrtKey.getPrivateExponent();
        this.configure = rSAPrivateCrtKey.getPrimeP();
        this.Cardinal = rSAPrivateCrtKey.getPrimeQ();
        this.getSDKVersion = rSAPrivateCrtKey.getPrimeExponentP();
        this.cleanup = rSAPrivateCrtKey.getPrimeExponentQ();
        this.onCReqSuccess = rSAPrivateCrtKey.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.getInstance = rSAPrivateCrtKeySpec.getModulus();
        this.init = rSAPrivateCrtKeySpec.getPublicExponent();
        this.cca_continue = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.configure = rSAPrivateCrtKeySpec.getPrimeP();
        this.Cardinal = rSAPrivateCrtKeySpec.getPrimeQ();
        this.getSDKVersion = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.cleanup = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.onCReqSuccess = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    public BigInteger getCrtCoefficient() {
        return this.onCReqSuccess;
    }

    public byte[] getEncoded() {
        return KeyUtil.cca_continue(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.configure, isEnabledVisaCheckout.configure), new KeyAgreementSpi.DHUwithSHA512CKDF(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getPrimeExponentP() {
        return this.getSDKVersion;
    }

    public BigInteger getPrimeExponentQ() {
        return this.cleanup;
    }

    public BigInteger getPrimeP() {
        return this.configure;
    }

    public BigInteger getPrimeQ() {
        return this.Cardinal;
    }

    public BigInteger getPublicExponent() {
        return this.init;
    }

    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Private CRT Key [");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(RSAUtil.cca_continue(getModulus())).append("],[").append(RSAUtil.Cardinal(getPublicExponent())).append("]").append(instance);
        stringBuffer.append("             modulus: ").append(getModulus().toString(16)).append(instance);
        stringBuffer.append("     public exponent: ").append(getPublicExponent().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    BCRSAPrivateCrtKey(DigestSignatureSpi.RIPEMD256 ripemd256) {
        super((DigestSignatureSpi.SHA256) ripemd256);
        this.init = ripemd256.Cardinal;
        this.configure = ripemd256.init;
        this.Cardinal = ripemd256.configure;
        this.getSDKVersion = ripemd256.cleanup;
        this.cleanup = ripemd256.onValidated;
        this.onCReqSuccess = ripemd256.getWarnings;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BCRSAPrivateCrtKey(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r2) throws java.io.IOException {
        /*
            r1 = this;
            com.cardinalcommerce.a.setUICustomization r2 = r2.Cardinal
            byte[] r2 = r2.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r2)
            if (r2 == 0) goto L_0x0016
            com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF r0 = new com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF
            com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r2)
            r0.<init>(r2)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r1.<init>((com.cardinalcommerce.a.KeyAgreementSpi.DHUwithSHA512CKDF) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey.<init>(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo):void");
    }

    BCRSAPrivateCrtKey(KeyAgreementSpi.DHUwithSHA512CKDF dHUwithSHA512CKDF) {
        this.getInstance = dHUwithSHA512CKDF.getInstance;
        this.init = dHUwithSHA512CKDF.configure;
        this.cca_continue = dHUwithSHA512CKDF.Cardinal;
        this.configure = dHUwithSHA512CKDF.init;
        this.Cardinal = dHUwithSHA512CKDF.cca_continue;
        this.getSDKVersion = dHUwithSHA512CKDF.getSDKVersion;
        this.cleanup = dHUwithSHA512CKDF.getWarnings;
        this.onCReqSuccess = dHUwithSHA512CKDF.onCReqSuccess;
    }
}
