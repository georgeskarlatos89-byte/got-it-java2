package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST3410Util;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.X509SignatureUtil;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;

public class BCECPrivateKey implements GMCipherSpi.SM2withRMD, GOST3410Util, ECPrivateKey {
    private transient BigInteger Cardinal;
    private transient ECParameterSpec cca_continue;
    private transient PKCS12BagAttributeCarrierImpl cleanup = new PKCS12BagAttributeCarrierImpl();
    private String configure = "EC";
    private transient PSSSignatureSpi.SHA512_256withRSA getInstance;
    private transient getDeviceFingerprint getSDKVersion;
    private boolean init;

    protected BCECPrivateKey() {
    }

    BCECPrivateKey(String str, PrivateKeyInfo privateKeyInfo, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) throws IOException {
        this.configure = str;
        this.getInstance = sHA512_256withRSA;
        Cardinal(privateKeyInfo);
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.configure = str;
        this.Cardinal = eCPrivateKeySpec.getS();
        this.cca_continue = eCPrivateKeySpec.getParams();
        this.getInstance = sHA512_256withRSA;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.Cardinal = eCPrivateKey.getS();
        this.configure = eCPrivateKey.getAlgorithm();
        this.cca_continue = eCPrivateKey.getParams();
        this.getInstance = sHA512_256withRSA;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getInstance = KeyFactory.init;
        Cardinal(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
        this.cleanup = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final BigInteger Cardinal() {
        return this.Cardinal;
    }

    public final X509CertificateObject configure() {
        ECParameterSpec eCParameterSpec = this.cca_continue;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.getInstance(eCParameterSpec);
    }

    public String getAlgorithm() {
        return this.configure;
    }

    public byte[] getEncoded() {
        DSAUtil cca_continue2 = ECUtils.cca_continue(this.cca_continue);
        ECParameterSpec eCParameterSpec = this.cca_continue;
        int instance = eCParameterSpec == null ? ECUtil.getInstance(this.getInstance, (BigInteger) null, getS()) : ECUtil.getInstance(this.getInstance, eCParameterSpec.getOrder(), getS());
        try {
            return new PrivateKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.CardinalError, cca_continue2), this.getSDKVersion != null ? new KeyAgreementSpi.DHwithSHA1CKDF(instance, getS(), this.getSDKVersion, cca_continue2) : new KeyAgreementSpi.DHwithSHA1CKDF(instance, getS(), cca_continue2)).configure("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.cca_continue;
    }

    public BigInteger getS() {
        return this.Cardinal;
    }

    public BCECPrivateKey(String str, X509SignatureUtil x509SignatureUtil, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        ECParameterSpec eCParameterSpec;
        this.configure = str;
        this.Cardinal = x509SignatureUtil.configure;
        if (x509SignatureUtil.Cardinal != null) {
            toJSONString tojsonstring = x509SignatureUtil.Cardinal.cca_continue;
            byte[] bArr = x509SignatureUtil.Cardinal.init;
            eCParameterSpec = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring), x509SignatureUtil.Cardinal);
        } else {
            eCParameterSpec = null;
        }
        this.cca_continue = eCParameterSpec;
        this.getInstance = sHA512_256withRSA;
    }

    public BCECPrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.configure = str;
        this.Cardinal = edDSA.init;
        this.getInstance = sHA512_256withRSA;
        if (eCParameterSpec == null) {
            KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            eCParameterSpec = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        }
        this.cca_continue = eCParameterSpec;
        this.getSDKVersion = Cardinal(bCECPublicKey);
    }

    public BCECPrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECPublicKey bCECPublicKey, X509CertificateObject x509CertificateObject, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.configure = str;
        this.Cardinal = edDSA.init;
        this.getInstance = sHA512_256withRSA;
        if (x509CertificateObject == null) {
            KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.cca_continue = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        } else {
            toJSONString tojsonstring2 = x509CertificateObject.cca_continue;
            byte[] bArr2 = x509CertificateObject.init;
            this.cca_continue = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring2), x509CertificateObject);
        }
        try {
            this.getSDKVersion = Cardinal(bCECPublicKey);
        } catch (Exception unused) {
            this.getSDKVersion = null;
        }
    }

    public BCECPrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.configure = str;
        this.Cardinal = edDSA.init;
        this.cca_continue = null;
        this.getInstance = sHA512_256withRSA;
    }

    private void Cardinal(PrivateKeyInfo privateKeyInfo) throws IOException {
        DSAUtil Cardinal2 = DSAUtil.Cardinal(privateKeyInfo.cca_continue.Cardinal);
        this.cca_continue = EC5Util.getInstance(Cardinal2, EC5Util.Cardinal(this.getInstance, Cardinal2));
        getThreeDSRequestorAppURL Cardinal3 = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
        if (Cardinal3 instanceof setEnvironment) {
            this.Cardinal = new BigInteger(setEnvironment.getInstance((Object) Cardinal3).getInstance);
            return;
        }
        KeyAgreementSpi.DHwithSHA1CKDF dHwithSHA1CKDF = Cardinal3 != null ? new KeyAgreementSpi.DHwithSHA1CKDF(isEnableLogging.getInstance((Object) Cardinal3)) : null;
        this.Cardinal = new BigInteger(1, ((setUICustomization) dHwithSHA1CKDF.getInstance.init(1)).getInstance());
        this.getSDKVersion = (getDeviceFingerprint) dHwithSHA1CKDF.Cardinal(1);
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        if (this.Cardinal.equals(bCECPrivateKey.Cardinal)) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.getInstance.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECPrivateKey.cca_continue;
            if (eCParameterSpec2 != null) {
                boolean z = bCECPrivateKey.init;
                x509CertificateObject = EC5Util.getInstance(eCParameterSpec2);
            } else {
                x509CertificateObject = bCECPrivateKey.getInstance.cca_continue();
            }
            if (instance.equals(x509CertificateObject)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.Cardinal.hashCode();
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.getInstance.cca_continue()).hashCode();
    }

    public String toString() {
        BigInteger bigInteger = this.Cardinal;
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return ECUtil.init("EC", bigInteger, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.getInstance.cca_continue());
    }

    private static getDeviceFingerprint Cardinal(BCECPublicKey bCECPublicKey) {
        try {
            return SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal(bCECPublicKey.getEncoded())).Cardinal;
        } catch (IOException unused) {
            return null;
        }
    }
}
