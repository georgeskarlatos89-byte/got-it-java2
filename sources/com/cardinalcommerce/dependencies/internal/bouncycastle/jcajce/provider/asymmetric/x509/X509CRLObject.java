package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DESUtil;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.getHeadingTextFontName;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

class X509CRLObject extends X509CRL {
    private byte[] Cardinal;
    private DSASigner cca_continue;
    private int cleanup;
    private BaseCipherSpi.ErasableOutputStream configure;
    private boolean getInstance;
    private boolean getSDKVersion = false;
    private String init;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (!this.getSDKVersion || !x509CRLObject.getSDKVersion || x509CRLObject.cleanup == this.cleanup) {
            return this.cca_continue.equals(x509CRLObject.cca_continue);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return getInstance(true);
    }

    public byte[] getEncoded() throws CRLException {
        try {
            return this.cca_continue.configure("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return getInstance(false);
    }

    public String getSigAlgName() {
        return this.init;
    }

    public byte[] getSigAlgParams() {
        byte[] bArr = this.Cardinal;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public int hashCode() {
        if (!this.getSDKVersion) {
            this.getSDKVersion = true;
            this.cleanup = super.hashCode();
        }
        return this.cleanup;
    }

    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            signature = this.configure.init(getSigAlgName());
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        configure(publicKey, signature);
    }

    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        configure(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    public void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        configure(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }

    private static boolean getInstance(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(DSASigner.detDSASha3_256.getSDKVersion.init);
            if (extensionValue == null) {
                return false;
            }
            byte[] instance = setUICustomization.init(extensionValue).getInstance();
            return (instance != null ? new DSASigner.dsaSha3_224(isEnableLogging.getInstance((Object) instance)) : null).configure;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    protected X509CRLObject(BaseCipherSpi.ErasableOutputStream erasableOutputStream, DSASigner dSASigner) throws CRLException {
        this.configure = erasableOutputStream;
        this.cca_continue = dSASigner;
        try {
            this.init = X509SignatureUtil.configure(dSASigner.getInstance);
            if (dSASigner.getInstance.Cardinal != null) {
                this.Cardinal = dSASigner.getInstance.Cardinal.onCReqSuccess().configure("DER");
            } else {
                this.Cardinal = null;
            }
            this.getInstance = getInstance((X509CRL) this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: ".concat(String.valueOf(e)));
        }
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(DSASigner.detDSASha3_256.getSDKVersion.init);
        criticalExtensionOIDs.remove(DSASigner.detDSASha3_256.onValidated.init);
        if (!criticalExtensionOIDs.isEmpty()) {
            return true;
        }
        return false;
    }

    private Set getInstance(boolean z) {
        DSASigner.detDSASha3_224 detdsasha3_224;
        if (getVersion() != 2 || (detdsasha3_224 = this.cca_continue.cca_continue.onCReqSuccess) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration elements = detdsasha3_224.init.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            if (z == ((DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier)).getString) {
                hashSet.add(aSN1ObjectIdentifier.init);
            }
        }
        return hashSet;
    }

    public byte[] getExtensionValue(String str) {
        DSASigner.detDSASha3_224 detdsasha3_224 = this.cca_continue.cca_continue.onCReqSuccess;
        if (detdsasha3_224 == null) {
            return null;
        }
        DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(new ASN1ObjectIdentifier(str));
        if (detdsasha3_256 == null) {
            return null;
        }
        try {
            return detdsasha3_256.CardinalChallengeObserver.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(new StringBuilder("error parsing ").append(e.toString()).toString());
        }
    }

    private void configure(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (this.cca_continue.getInstance.equals(this.cca_continue.cca_continue.getInstance)) {
            byte[] bArr = this.Cardinal;
            if (bArr != null) {
                try {
                    X509SignatureUtil.Cardinal(signature, getThreeDSRequestorAppURL.Cardinal(bArr));
                } catch (IOException e) {
                    throw new SignatureException(new StringBuilder("cannot decode signature parameters: ").append(e.getMessage()).toString());
                }
            }
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    public int getVersion() {
        DSASigner.dsa384 dsa384 = this.cca_continue.cca_continue;
        if (dsa384.Cardinal == null) {
            return 1;
        }
        return new BigInteger(dsa384.Cardinal.getInstance).intValue() + 1;
    }

    public Principal getIssuerDN() {
        return new DESUtil(KeyAgreementSpi.MQVwithSHA384KDF.init(this.cca_continue.cca_continue.init.onCReqSuccess()));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.cca_continue.cca_continue.init.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Date getThisUpdate() {
        return this.cca_continue.cca_continue.configure.getInstance();
    }

    public Date getNextUpdate() {
        if (this.cca_continue.cca_continue.cca_continue != null) {
            return this.cca_continue.cca_continue.cca_continue.getInstance();
        }
        return null;
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Enumeration configure2 = this.cca_continue.configure();
        KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF = null;
        while (configure2.hasMoreElements()) {
            DSASigner.dsa384.cca_continue cca_continue2 = (DSASigner.dsa384.cca_continue) configure2.nextElement();
            if (bigInteger.equals(new BigInteger(setEnvironment.getInstance((Object) cca_continue2.configure.init(0)).getInstance))) {
                return new X509CRLEntryObject(cca_continue2, this.getInstance, mQVwithSHA384KDF);
            }
            if (this.getInstance) {
                if (cca_continue2.configure.cca_continue() == 3) {
                    DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) cca_continue2.Cardinal().cca_continue.get(DSASigner.detDSASha3_256.onCReqSuccess);
                    if (detdsasha3_256 != null) {
                        getThreeDSRequestorAppURL Cardinal2 = DSASigner.detDSASha3_256.Cardinal(detdsasha3_256);
                        DSASigner.detDSASha3_384[] detdsasha3_384Arr = (Cardinal2 != null ? new DSASigner.dsa224(isEnableLogging.getInstance((Object) Cardinal2)) : null).init;
                        int length = detdsasha3_384Arr.length;
                        DSASigner.detDSASha3_384[] detdsasha3_384Arr2 = new DSASigner.detDSASha3_384[length];
                        System.arraycopy(detdsasha3_384Arr, 0, detdsasha3_384Arr2, 0, length);
                        mQVwithSHA384KDF = KeyAgreementSpi.MQVwithSHA384KDF.init(detdsasha3_384Arr2[0].cca_continue);
                    }
                }
            }
        }
        return null;
    }

    public Set getRevokedCertificates() {
        HashSet hashSet = new HashSet();
        Enumeration configure2 = this.cca_continue.configure();
        KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF = null;
        while (configure2.hasMoreElements()) {
            DSASigner.dsa384.cca_continue cca_continue2 = (DSASigner.dsa384.cca_continue) configure2.nextElement();
            hashSet.add(new X509CRLEntryObject(cca_continue2, this.getInstance, mQVwithSHA384KDF));
            if (this.getInstance) {
                if (cca_continue2.configure.cca_continue() == 3) {
                    DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) cca_continue2.Cardinal().cca_continue.get(DSASigner.detDSASha3_256.onCReqSuccess);
                    if (detdsasha3_256 != null) {
                        getThreeDSRequestorAppURL Cardinal2 = DSASigner.detDSASha3_256.Cardinal(detdsasha3_256);
                        DSASigner.detDSASha3_384[] detdsasha3_384Arr = (Cardinal2 != null ? new DSASigner.dsa224(isEnableLogging.getInstance((Object) Cardinal2)) : null).init;
                        int length = detdsasha3_384Arr.length;
                        DSASigner.detDSASha3_384[] detdsasha3_384Arr2 = new DSASigner.detDSASha3_384[length];
                        System.arraycopy(detdsasha3_384Arr, 0, detdsasha3_384Arr2, 0, length);
                        mQVwithSHA384KDF = KeyAgreementSpi.MQVwithSHA384KDF.init(detdsasha3_384Arr2[0].cca_continue);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            return Collections.unmodifiableSet(hashSet);
        }
        return null;
    }

    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.cca_continue.cca_continue.configure("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getSignature() {
        return this.cca_continue.Cardinal.init();
    }

    public String getSigAlgOID() {
        return this.cca_continue.getInstance.cca_continue.init;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer("              Version: ");
        String instance = getTextFontSize.getInstance();
        stringBuffer2.append(getVersion()).append(instance);
        stringBuffer2.append("             IssuerDN: ").append(getIssuerDN()).append(instance);
        stringBuffer2.append("          This update: ").append(getThisUpdate()).append(instance);
        stringBuffer2.append("          Next update: ").append(getNextUpdate()).append(instance);
        stringBuffer2.append("  Signature Algorithm: ").append(getSigAlgName()).append(instance);
        byte[] signature = getSignature();
        stringBuffer2.append("            Signature: ").append(new String(getHeadingTextFontName.cca_continue(signature, 0, 20))).append(instance);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer = stringBuffer2.append("                       ");
                str = new String(getHeadingTextFontName.cca_continue(signature, i, 20));
            } else {
                stringBuffer = stringBuffer2.append("                       ");
                str = new String(getHeadingTextFontName.cca_continue(signature, i, signature.length - i));
            }
            stringBuffer.append(str).append(instance);
        }
        DSASigner.detDSASha3_224 detdsasha3_224 = this.cca_continue.cca_continue.onCReqSuccess;
        if (detdsasha3_224 != null) {
            Enumeration elements = detdsasha3_224.init.elements();
            if (elements.hasMoreElements()) {
                stringBuffer2.append("           Extensions: ").append(instance);
            }
            while (elements.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
                DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier);
                if (detdsasha3_256.CardinalChallengeObserver != null) {
                    getProxyAddress getproxyaddress = new getProxyAddress(detdsasha3_256.CardinalChallengeObserver.getInstance());
                    stringBuffer2.append("                       critical(").append(detdsasha3_256.getString).append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.Cardinal)) {
                            stringBuffer2.append(new KeyAgreementSpi.MQVwithSHA512KDF(new BigInteger(1, setEnvironment.getInstance((Object) getproxyaddress.configure()).getInstance))).append(instance);
                        } else if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.onValidated)) {
                            stringBuffer2.append(new StringBuilder("Base CRL: ").append(new KeyAgreementSpi.MQVwithSHA512KDF(new BigInteger(1, setEnvironment.getInstance((Object) getproxyaddress.configure()).getInstance))).toString()).append(instance);
                        } else {
                            Object obj = null;
                            if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.getSDKVersion)) {
                                getThreeDSRequestorAppURL configure2 = getproxyaddress.configure();
                                if (configure2 instanceof DSASigner.dsaSha3_224) {
                                    obj = (DSASigner.dsaSha3_224) configure2;
                                } else if (configure2 != null) {
                                    obj = new DSASigner.dsaSha3_224(isEnableLogging.getInstance((Object) configure2));
                                }
                                stringBuffer2.append(obj).append(instance);
                            } else if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.CardinalError)) {
                                getThreeDSRequestorAppURL configure3 = getproxyaddress.configure();
                                if (configure3 != null) {
                                    obj = new KeyPairGeneratorSpi(isEnableLogging.getInstance((Object) configure3));
                                }
                                stringBuffer2.append(obj).append(instance);
                            } else if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.values)) {
                                getThreeDSRequestorAppURL configure4 = getproxyaddress.configure();
                                if (configure4 != null) {
                                    obj = new KeyPairGeneratorSpi(isEnableLogging.getInstance((Object) configure4));
                                }
                                stringBuffer2.append(obj).append(instance);
                            } else {
                                stringBuffer2.append(aSN1ObjectIdentifier.init);
                                stringBuffer2.append(" value = ").append(KeyAgreementSpi.MQVwithSHA1KDF.configure((Object) getproxyaddress.configure())).append(instance);
                            }
                        }
                    } catch (Exception unused) {
                        stringBuffer2.append(aSN1ObjectIdentifier.init);
                        stringBuffer2.append(" value = *****").append(instance);
                    }
                } else {
                    stringBuffer2.append(instance);
                }
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                stringBuffer2.append(append);
                stringBuffer2.append(instance);
            }
        }
        return stringBuffer2.toString();
    }

    public boolean isRevoked(Certificate certificate) {
        KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF;
        if (certificate.getType().equals("X.509")) {
            Enumeration configure2 = this.cca_continue.configure();
            KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF2 = this.cca_continue.cca_continue.init;
            if (configure2.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (configure2.hasMoreElements()) {
                    Object nextElement = configure2.nextElement();
                    DSASigner.detDSA384 detdsa384 = null;
                    DSASigner.dsa384.cca_continue cca_continue2 = nextElement instanceof DSASigner.dsa384.cca_continue ? (DSASigner.dsa384.cca_continue) nextElement : nextElement != null ? new DSASigner.dsa384.cca_continue(isEnableLogging.getInstance(nextElement)) : null;
                    if (this.getInstance) {
                        if (cca_continue2.configure.cca_continue() == 3) {
                            DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) cca_continue2.Cardinal().cca_continue.get(DSASigner.detDSASha3_256.onCReqSuccess);
                            if (detdsasha3_256 != null) {
                                getThreeDSRequestorAppURL Cardinal2 = DSASigner.detDSASha3_256.Cardinal(detdsasha3_256);
                                DSASigner.detDSASha3_384[] detdsasha3_384Arr = (Cardinal2 != null ? new DSASigner.dsa224(isEnableLogging.getInstance((Object) Cardinal2)) : null).init;
                                int length = detdsasha3_384Arr.length;
                                DSASigner.detDSASha3_384[] detdsasha3_384Arr2 = new DSASigner.detDSASha3_384[length];
                                System.arraycopy(detdsasha3_384Arr, 0, detdsasha3_384Arr2, 0, length);
                                mQVwithSHA384KDF2 = KeyAgreementSpi.MQVwithSHA384KDF.init(detdsasha3_384Arr2[0].cca_continue);
                            }
                        }
                    }
                    if (new BigInteger(setEnvironment.getInstance((Object) cca_continue2.configure.init(0)).getInstance).equals(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            mQVwithSHA384KDF = KeyAgreementSpi.MQVwithSHA384KDF.init(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                byte[] encoded = certificate.getEncoded();
                                if (encoded != null) {
                                    detdsa384 = new DSASigner.detDSA384(isEnableLogging.getInstance((Object) encoded));
                                }
                                mQVwithSHA384KDF = detdsa384.Cardinal.cca_continue;
                            } catch (CertificateEncodingException e) {
                                throw new IllegalArgumentException(new StringBuilder("Cannot process certificate: ").append(e.getMessage()).toString());
                            }
                        }
                        if (!mQVwithSHA384KDF2.equals(mQVwithSHA384KDF)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }
}
