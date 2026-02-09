package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BCDSAPublicKey;
import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DESUtil;
import com.cardinalcommerce.a.DHUtil;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.ExtendedData;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getHeadingTextFontName;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.getRenderType;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.getUiType;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.isEnabledHostedFields;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.isLocationDataConsentGiven;
import com.cardinalcommerce.a.readObject;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

class X509CertificateObject extends X509Certificate implements GMCipherSpi.SM2withRMD {
    private boolean Cardinal;
    private BCDSAPublicKey cca_continue;
    private boolean[] configure;
    private BaseCipherSpi.ErasableOutputStream getInstance;
    private GMCipherSpi.SM2withRMD getSDKVersion = new PKCS12BagAttributeCarrierImpl();
    private int getWarnings;
    private DSASigner.detDSA384 init;

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CertificateObject)) {
            return super.equals(obj);
        }
        X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
        if (!this.Cardinal || !x509CertificateObject.Cardinal || this.getWarnings == x509CertificateObject.getWarnings) {
            return this.init.equals(x509CertificateObject.init);
        }
        return false;
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.init.configure("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public boolean[] getKeyUsage() {
        return this.configure;
    }

    public synchronized int hashCode() {
        if (!this.Cardinal) {
            this.getWarnings = super.hashCode();
            this.Cardinal = true;
        }
        return this.getWarnings;
    }

    public X509CertificateObject(BaseCipherSpi.ErasableOutputStream erasableOutputStream, DSASigner.detDSA384 detdsa384) throws CertificateParsingException {
        this.getInstance = erasableOutputStream;
        this.init = detdsa384;
        try {
            byte[] Cardinal2 = Cardinal("2.5.29.19");
            if (Cardinal2 != null) {
                getThreeDSRequestorAppURL Cardinal3 = getThreeDSRequestorAppURL.Cardinal(Cardinal2);
                this.cca_continue = Cardinal3 != null ? new BCDSAPublicKey(isEnableLogging.getInstance((Object) Cardinal3)) : null;
            }
            try {
                byte[] Cardinal4 = Cardinal("2.5.29.15");
                if (Cardinal4 != null) {
                    getDeviceFingerprint Cardinal5 = getDeviceFingerprint.Cardinal((Object) getThreeDSRequestorAppURL.Cardinal(Cardinal4));
                    byte[] instance = Cardinal5.getInstance();
                    int length = (instance.length << 3) - Cardinal5.onValidated();
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    this.configure = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        this.configure[i2] = (instance[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                    }
                    return;
                }
                this.configure = null;
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: ".concat(String.valueOf(e)));
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: ".concat(String.valueOf(e2)));
        }
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder sb = new StringBuilder("certificate expired on ");
            DSASigner.dsaSha3_384 dsasha3_384 = this.init.Cardinal.getSDKVersion;
            boolean z = dsasha3_384.Cardinal instanceof ExtendedData;
            getThreeDSRequestorAppURL getthreedsrequestorappurl = dsasha3_384.Cardinal;
            throw new CertificateExpiredException(sb.append(z ? ((ExtendedData) getthreedsrequestorappurl).cca_continue() : ((getUiType) getthreedsrequestorappurl).cca_continue()).toString());
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder sb2 = new StringBuilder("certificate not valid till ");
            DSASigner.dsaSha3_384 dsasha3_3842 = this.init.Cardinal.getInstance;
            boolean z2 = dsasha3_3842.Cardinal instanceof ExtendedData;
            getThreeDSRequestorAppURL getthreedsrequestorappurl2 = dsasha3_3842.Cardinal;
            throw new CertificateNotYetValidException(sb2.append(z2 ? ((ExtendedData) getthreedsrequestorappurl2).cca_continue() : ((getUiType) getthreedsrequestorappurl2).cca_continue()).toString());
        }
    }

    public int getVersion() {
        return new BigInteger(this.init.Cardinal.configure.getInstance).intValue() + 1;
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(this.init.Cardinal.init.getInstance);
    }

    public Principal getIssuerDN() {
        try {
            return new DESUtil(KeyAgreementSpi.MQVwithSHA384KDF.init(this.init.Cardinal.cca_continue.getEncoded()));
        } catch (IOException unused) {
            return null;
        }
    }

    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new getRenderType(byteArrayOutputStream).getInstance((CardinalConfigurationParameters) this.init.Cardinal.cca_continue);
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Principal getSubjectDN() {
        return new DESUtil(KeyAgreementSpi.MQVwithSHA384KDF.init(this.init.Cardinal.cleanup.onCReqSuccess()));
    }

    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new getRenderType(byteArrayOutputStream).getInstance((CardinalConfigurationParameters) this.init.Cardinal.cleanup);
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Date getNotBefore() {
        return this.init.Cardinal.getInstance.getInstance();
    }

    public Date getNotAfter() {
        return this.init.Cardinal.getSDKVersion.getInstance();
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.init.Cardinal.configure("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public byte[] getSignature() {
        return this.init.configure.init();
    }

    public String getSigAlgName() {
        return X509SignatureUtil.configure(this.init.cca_continue);
    }

    public String getSigAlgOID() {
        return this.init.cca_continue.cca_continue.init;
    }

    public byte[] getSigAlgParams() {
        if (this.init.cca_continue.Cardinal != null) {
            try {
                return this.init.cca_continue.Cardinal.onCReqSuccess().configure("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public boolean[] getIssuerUniqueID() {
        getDeviceFingerprint getdevicefingerprint = this.init.Cardinal.onValidated;
        if (getdevicefingerprint == null) {
            return null;
        }
        byte[] instance = getdevicefingerprint.getInstance();
        int length = (instance.length << 3) - getdevicefingerprint.onValidated();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (instance[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public boolean[] getSubjectUniqueID() {
        getDeviceFingerprint getdevicefingerprint = this.init.Cardinal.onCReqSuccess;
        if (getdevicefingerprint == null) {
            return null;
        }
        byte[] instance = getdevicefingerprint.getInstance();
        int length = (instance.length << 3) - getdevicefingerprint.onValidated();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (instance[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] Cardinal2 = Cardinal("2.5.29.37");
        if (Cardinal2 == null) {
            return null;
        }
        try {
            isEnableLogging isenablelogging = (isEnableLogging) new getProxyAddress(Cardinal2).configure();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != isenablelogging.cca_continue(); i++) {
                arrayList.add(((ASN1ObjectIdentifier) isenablelogging.init(i)).init);
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public int getBasicConstraints() {
        BCDSAPublicKey bCDSAPublicKey = this.cca_continue;
        if (bCDSAPublicKey != null) {
            boolean z = false;
            if (bCDSAPublicKey.Cardinal != null) {
                if (bCDSAPublicKey.Cardinal.init[0] != 0) {
                    z = true;
                }
            }
            if (z) {
                BCDSAPublicKey bCDSAPublicKey2 = this.cca_continue;
                BigInteger bigInteger = null;
                if ((bCDSAPublicKey2.configure != null ? new BigInteger(bCDSAPublicKey2.configure.getInstance) : null) == null) {
                    return Integer.MAX_VALUE;
                }
                BCDSAPublicKey bCDSAPublicKey3 = this.cca_continue;
                if (bCDSAPublicKey3.configure != null) {
                    bigInteger = new BigInteger(bCDSAPublicKey3.configure.getInstance);
                }
                return bigInteger.intValue();
            }
        }
        return -1;
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return Cardinal(Cardinal(DSASigner.detDSASha3_256.getInstance.init));
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return Cardinal(Cardinal(DSASigner.detDSASha3_256.configure.init));
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        DSASigner.detDSASha3_224 detdsasha3_224 = this.init.Cardinal.values;
        if (detdsasha3_224 == null) {
            return null;
        }
        Enumeration elements = detdsasha3_224.init.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            if (((DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier)).getString) {
                hashSet.add(aSN1ObjectIdentifier.init);
            }
        }
        return hashSet;
    }

    private byte[] Cardinal(String str) {
        DSASigner.detDSASha3_224 detdsasha3_224 = this.init.Cardinal.values;
        if (detdsasha3_224 == null) {
            return null;
        }
        DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(new ASN1ObjectIdentifier(str));
        if (detdsasha3_256 != null) {
            return detdsasha3_256.CardinalChallengeObserver.getInstance();
        }
        return null;
    }

    public byte[] getExtensionValue(String str) {
        DSASigner.detDSASha3_224 detdsasha3_224 = this.init.Cardinal.values;
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

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        DSASigner.detDSASha3_224 detdsasha3_224 = this.init.Cardinal.values;
        if (detdsasha3_224 == null) {
            return null;
        }
        Enumeration elements = detdsasha3_224.init.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            if (!((DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier)).getString) {
                hashSet.add(aSN1ObjectIdentifier.init);
            }
        }
        return hashSet;
    }

    public boolean hasUnsupportedCriticalExtension() {
        DSASigner.detDSASha3_224 detdsasha3_224;
        if (getVersion() != 3 || (detdsasha3_224 = this.init.Cardinal.values) == null) {
            return false;
        }
        Enumeration elements = detdsasha3_224.init.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            if (!aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.cca_continue) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.valueOf) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.CardinalRenderType) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.getActionCode) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.CardinalError) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.getSDKVersion) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.onValidated) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.CardinalEnvironment) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.init) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.getInstance) && !aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.getWarnings) && ((DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier)).getString) {
                return true;
            }
        }
        return false;
    }

    public PublicKey getPublicKey() {
        try {
            return KeyFactory.init(this.init.Cardinal.getWarnings);
        } catch (IOException unused) {
            return null;
        }
    }

    public String toString() {
        Object iESwithAESCBC;
        StringBuffer append;
        String str;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer("  [0]         Version: ");
        String instance = getTextFontSize.getInstance();
        stringBuffer2.append(getVersion()).append(instance);
        stringBuffer2.append("         SerialNumber: ").append(getSerialNumber()).append(instance);
        stringBuffer2.append("             IssuerDN: ").append(getIssuerDN()).append(instance);
        stringBuffer2.append("           Start Date: ").append(getNotBefore()).append(instance);
        stringBuffer2.append("           Final Date: ").append(getNotAfter()).append(instance);
        stringBuffer2.append("            SubjectDN: ").append(getSubjectDN()).append(instance);
        stringBuffer2.append("           Public Key: ").append(getPublicKey()).append(instance);
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
        DSASigner.detDSASha3_224 detdsasha3_224 = this.init.Cardinal.values;
        if (detdsasha3_224 != null) {
            Enumeration elements = detdsasha3_224.init.elements();
            if (elements.hasMoreElements()) {
                stringBuffer2.append("       Extensions: \n");
            }
            while (elements.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
                DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) detdsasha3_224.cca_continue.get(aSN1ObjectIdentifier);
                if (detdsasha3_256.CardinalChallengeObserver != null) {
                    getProxyAddress getproxyaddress = new getProxyAddress(detdsasha3_256.CardinalChallengeObserver.getInstance());
                    stringBuffer2.append("                       critical(").append(detdsasha3_256.getString).append(") ");
                    try {
                        Object obj = null;
                        if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.init)) {
                            getThreeDSRequestorAppURL configure2 = getproxyaddress.configure();
                            if (configure2 != null) {
                                obj = new BCDSAPublicKey(isEnableLogging.getInstance((Object) configure2));
                            }
                            stringBuffer2.append(obj).append(instance);
                        } else {
                            if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.cca_continue)) {
                                getThreeDSRequestorAppURL configure3 = getproxyaddress.configure();
                                if (configure3 != null) {
                                    obj = new DSASigner.dsa256(getDeviceFingerprint.Cardinal((Object) configure3));
                                }
                                append = stringBuffer2.append(obj);
                            } else {
                                if (aSN1ObjectIdentifier.equals(DHUtil.configure)) {
                                    iESwithAESCBC = new readObject((getDeviceFingerprint) getproxyaddress.configure());
                                } else if (aSN1ObjectIdentifier.equals(DHUtil.init)) {
                                    iESwithAESCBC = new KeyAgreementSpi((isEnabledHostedFields) getproxyaddress.configure());
                                } else if (aSN1ObjectIdentifier.equals(DHUtil.getInstance)) {
                                    iESwithAESCBC = new IESCipher.IESwithAESCBC((isEnabledHostedFields) getproxyaddress.configure());
                                } else {
                                    stringBuffer2.append(aSN1ObjectIdentifier.init);
                                    stringBuffer2.append(" value = ").append(KeyAgreementSpi.MQVwithSHA1KDF.configure((Object) getproxyaddress.configure())).append(instance);
                                }
                                append = stringBuffer2.append(iESwithAESCBC);
                            }
                            append.append(instance);
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
        return stringBuffer2.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        String configure2 = X509SignatureUtil.configure(this.init.cca_continue);
        try {
            signature = this.getInstance.init(configure2);
        } catch (Exception unused) {
            signature = Signature.getInstance(configure2);
        }
        configure(publicKey, signature);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        String configure2 = X509SignatureUtil.configure(this.init.cca_continue);
        configure(publicKey, str != null ? Signature.getInstance(configure2, str) : Signature.getInstance(configure2));
    }

    public final void verify(PublicKey publicKey, Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        String configure2 = X509SignatureUtil.configure(this.init.cca_continue);
        configure(publicKey, provider != null ? Signature.getInstance(configure2, provider) : Signature.getInstance(configure2));
    }

    private void configure(PublicKey publicKey, Signature signature) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (cca_continue(this.init.cca_continue, this.init.Cardinal.Cardinal)) {
            X509SignatureUtil.Cardinal(signature, this.init.cca_continue.Cardinal);
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
            return;
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private static boolean cca_continue(BCDSAPrivateKey bCDSAPrivateKey, BCDSAPrivateKey bCDSAPrivateKey2) {
        if (!bCDSAPrivateKey.cca_continue.equals(bCDSAPrivateKey2.cca_continue)) {
            return false;
        }
        if (bCDSAPrivateKey.Cardinal == null) {
            if (bCDSAPrivateKey2.Cardinal == null || bCDSAPrivateKey2.Cardinal.equals(isEnabledVisaCheckout.configure)) {
                return true;
            }
            return false;
        } else if (bCDSAPrivateKey2.Cardinal != null) {
            return bCDSAPrivateKey.Cardinal.equals(bCDSAPrivateKey2.Cardinal);
        } else {
            if (bCDSAPrivateKey.Cardinal == null || bCDSAPrivateKey.Cardinal.equals(isEnabledVisaCheckout.configure)) {
                return true;
            }
            return false;
        }
    }

    private static Collection Cardinal(byte[] bArr) throws CertificateParsingException {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration init2 = isEnableLogging.getInstance((Object) bArr).init();
            while (init2.hasMoreElements()) {
                DSASigner.detDSASha3_384 Cardinal2 = DSASigner.detDSASha3_384.Cardinal(init2.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(Cardinal2.getInstance));
                switch (Cardinal2.getInstance) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(Cardinal2.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((isLocationDataConsentGiven) Cardinal2.cca_continue).cca_continue());
                        break;
                    case 4:
                        arrayList2.add(KeyAgreementSpi.MQVwithSHA384KDF.Cardinal(KeyFactorySpi.cca_continue, Cardinal2.cca_continue).toString());
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(setEnabledVisaCheckout.init(Cardinal2.cca_continue).getInstance()).getHostAddress());
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.cca_continue((Object) Cardinal2.cca_continue).init);
                        break;
                    default:
                        throw new IOException(new StringBuilder("Bad tag number: ").append(Cardinal2.getInstance).toString());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }
}
