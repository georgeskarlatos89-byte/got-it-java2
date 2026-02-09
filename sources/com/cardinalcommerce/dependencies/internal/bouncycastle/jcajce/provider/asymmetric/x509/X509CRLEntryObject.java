package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setRequestTimeout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

class X509CRLEntryObject extends X509CRLEntry {
    private int Cardinal;
    private boolean configure;
    private KeyAgreementSpi.MQVwithSHA384KDF getInstance;
    private DSASigner.dsa384.cca_continue init;

    protected X509CRLEntryObject(DSASigner.dsa384.cca_continue cca_continue, boolean z, KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF) {
        this.init = cca_continue;
        this.getInstance = cca_continue(z, mQVwithSHA384KDF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof X509CRLEntryObject ? this.init.equals(((X509CRLEntryObject) obj).init) : super.equals(this);
    }

    public X500Principal getCertificateIssuer() {
        if (this.getInstance == null) {
            return null;
        }
        try {
            return new X500Principal(this.getInstance.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return init(true);
    }

    public byte[] getEncoded() throws CRLException {
        try {
            return this.init.configure("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return init(false);
    }

    public boolean hasExtensions() {
        return this.init.Cardinal() != null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.configure) {
            this.Cardinal = super.hashCode();
            this.configure = true;
        }
        return this.Cardinal;
    }

    private KeyAgreementSpi.MQVwithSHA384KDF cca_continue(boolean z, KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF) {
        if (!z) {
            return null;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = DSASigner.detDSASha3_256.onCReqSuccess;
        DSASigner.detDSASha3_224 Cardinal2 = this.init.Cardinal();
        DSASigner.detDSASha3_256 detdsasha3_256 = Cardinal2 != null ? (DSASigner.detDSASha3_256) Cardinal2.cca_continue.get(aSN1ObjectIdentifier) : null;
        if (detdsasha3_256 == null) {
            return mQVwithSHA384KDF;
        }
        try {
            getThreeDSRequestorAppURL Cardinal3 = DSASigner.detDSASha3_256.Cardinal(detdsasha3_256);
            DSASigner.detDSASha3_384[] detdsasha3_384Arr = (Cardinal3 != null ? new DSASigner.dsa224(isEnableLogging.getInstance((Object) Cardinal3)) : null).init;
            int length = detdsasha3_384Arr.length;
            DSASigner.detDSASha3_384[] detdsasha3_384Arr2 = new DSASigner.detDSASha3_384[length];
            System.arraycopy(detdsasha3_384Arr, 0, detdsasha3_384Arr2, 0, length);
            for (int i = 0; i < length; i++) {
                if (detdsasha3_384Arr2[i].getInstance == 4) {
                    return KeyAgreementSpi.MQVwithSHA384KDF.init(detdsasha3_384Arr2[i].cca_continue);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private Set init(boolean z) {
        DSASigner.detDSASha3_224 Cardinal2 = this.init.Cardinal();
        if (Cardinal2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration elements = Cardinal2.init.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            if (z == ((DSASigner.detDSASha3_256) Cardinal2.cca_continue.get(aSN1ObjectIdentifier)).getString) {
                hashSet.add(aSN1ObjectIdentifier.init);
            }
        }
        return hashSet;
    }

    public byte[] getExtensionValue(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(str);
        DSASigner.detDSASha3_224 Cardinal2 = this.init.Cardinal();
        DSASigner.detDSASha3_256 detdsasha3_256 = Cardinal2 != null ? (DSASigner.detDSASha3_256) Cardinal2.cca_continue.get(aSN1ObjectIdentifier) : null;
        if (detdsasha3_256 == null) {
            return null;
        }
        try {
            return detdsasha3_256.CardinalChallengeObserver.getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(new StringBuilder("Exception encoding: ").append(e.toString()).toString());
        }
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(setEnvironment.getInstance((Object) this.init.configure.init(0)).getInstance);
    }

    public Date getRevocationDate() {
        return DSASigner.dsaSha3_384.cca_continue(this.init.configure.init(1)).getInstance();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(getSerialNumber()).append(instance);
        stringBuffer.append("       revocationDate: ").append(getRevocationDate()).append(instance);
        stringBuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(instance);
        DSASigner.detDSASha3_224 Cardinal2 = this.init.Cardinal();
        if (Cardinal2 != null) {
            Enumeration elements = Cardinal2.init.elements();
            if (elements.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:").append(instance);
                while (elements.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
                    DSASigner.detDSASha3_256 detdsasha3_256 = (DSASigner.detDSASha3_256) Cardinal2.cca_continue.get(aSN1ObjectIdentifier);
                    if (detdsasha3_256.CardinalChallengeObserver != null) {
                        getProxyAddress getproxyaddress = new getProxyAddress(detdsasha3_256.CardinalChallengeObserver.getInstance());
                        stringBuffer.append("                       critical(").append(detdsasha3_256.getString).append(") ");
                        try {
                            if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.cleanup)) {
                                stringBuffer.append(DSASigner.detDSA.getInstance(setRequestTimeout.cca_continue((Object) getproxyaddress.configure()))).append(instance);
                            } else if (aSN1ObjectIdentifier.equals(DSASigner.detDSASha3_256.onCReqSuccess)) {
                                StringBuffer append = stringBuffer.append("Certificate issuer: ");
                                getThreeDSRequestorAppURL configure2 = getproxyaddress.configure();
                                append.append(configure2 instanceof DSASigner.dsa224 ? (DSASigner.dsa224) configure2 : configure2 != null ? new DSASigner.dsa224(isEnableLogging.getInstance((Object) configure2)) : null).append(instance);
                            } else {
                                stringBuffer.append(aSN1ObjectIdentifier.init);
                                stringBuffer.append(" value = ").append(KeyAgreementSpi.MQVwithSHA1KDF.configure((Object) getproxyaddress.configure())).append(instance);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(aSN1ObjectIdentifier.init);
                            stringBuffer.append(" value = *****").append(instance);
                        }
                    } else {
                        stringBuffer.append(instance);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
