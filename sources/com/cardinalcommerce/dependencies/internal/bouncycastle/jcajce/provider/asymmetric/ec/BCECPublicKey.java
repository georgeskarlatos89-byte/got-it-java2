package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.ECUtils;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PQCObjectIdentifiers;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class BCECPublicKey implements ExtendedInvalidKeySpecException, ECPublicKey {
    transient ECParameterSpec Cardinal;
    transient KeyPairGeneratorSpi.XDH cca_continue;
    private transient PSSSignatureSpi.SHA512_256withRSA configure;
    boolean getInstance;
    private String init;

    public BCECPublicKey(String str, KeyPairGeneratorSpi.XDH xdh, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = str;
        this.cca_continue = xdh;
        this.Cardinal = null;
        this.configure = sHA512_256withRSA;
    }

    BCECPublicKey(String str, SubjectPublicKeyInfo subjectPublicKeyInfo, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = str;
        this.configure = sHA512_256withRSA;
        configure(subjectPublicKeyInfo);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = str;
        this.Cardinal = eCPublicKeySpec.getParams();
        this.cca_continue = new KeyPairGeneratorSpi.XDH(EC5Util.init(this.Cardinal, eCPublicKeySpec.getW()), EC5Util.Cardinal(sHA512_256withRSA, eCPublicKeySpec.getParams()));
        this.configure = sHA512_256withRSA;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = "EC";
        this.init = eCPublicKey.getAlgorithm();
        this.Cardinal = eCPublicKey.getParams();
        this.cca_continue = new KeyPairGeneratorSpi.XDH(EC5Util.init(this.Cardinal, eCPublicKey.getW()), EC5Util.Cardinal(sHA512_256withRSA, eCPublicKey.getParams()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configure = KeyFactory.init;
        configure(SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final X509CertificateObject configure() {
        ECParameterSpec eCParameterSpec = this.Cardinal;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.getInstance(eCParameterSpec);
    }

    public String getAlgorithm() {
        return this.init;
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.Cardinal;
    }

    public BCECPublicKey(String str, PQCObjectIdentifiers pQCObjectIdentifiers, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = str;
        if (pQCObjectIdentifiers.Cardinal != null) {
            toJSONString tojsonstring = pQCObjectIdentifiers.Cardinal.cca_continue;
            byte[] bArr = pQCObjectIdentifiers.Cardinal.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.cca_continue = new KeyPairGeneratorSpi.XDH(pQCObjectIdentifiers.cca_continue, ECUtil.cca_continue(sHA512_256withRSA, pQCObjectIdentifiers.Cardinal));
            this.Cardinal = EC5Util.cca_continue(cca_continue2, pQCObjectIdentifiers.Cardinal);
        } else {
            ECParameterSpec eCParameterSpec = null;
            this.cca_continue = new KeyPairGeneratorSpi.XDH(sHA512_256withRSA.cca_continue().cca_continue.configure(pQCObjectIdentifiers.cca_continue.onCReqSuccess().cca_continue(), pQCObjectIdentifiers.cca_continue.getWarnings().cca_continue(), false), EC5Util.Cardinal(sHA512_256withRSA, (ECParameterSpec) null));
            this.Cardinal = null;
        }
        this.configure = sHA512_256withRSA;
    }

    public BCECPublicKey(String str, KeyPairGeneratorSpi.XDH xdh, ECParameterSpec eCParameterSpec, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = "EC";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.init = str;
        this.cca_continue = xdh;
        if (eCParameterSpec == null) {
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.Cardinal = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        } else {
            this.Cardinal = eCParameterSpec;
        }
        this.configure = sHA512_256withRSA;
    }

    public BCECPublicKey(String str, KeyPairGeneratorSpi.XDH xdh, X509CertificateObject x509CertificateObject, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = "EC";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.init = str;
        if (x509CertificateObject == null) {
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.Cardinal = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        } else {
            toJSONString tojsonstring2 = x509CertificateObject.cca_continue;
            byte[] bArr2 = x509CertificateObject.init;
            this.Cardinal = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring2), x509CertificateObject);
        }
        this.cca_continue = xdh;
        this.configure = sHA512_256withRSA;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [com.cardinalcommerce.a.getThreeDSRequestorAppURL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void configure(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo r7) {
        /*
            r6 = this;
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r7.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.Cardinal
            com.cardinalcommerce.a.DSAUtil r0 = com.cardinalcommerce.a.DSAUtil.Cardinal(r0)
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r1 = r6.configure
            com.cardinalcommerce.a.toJSONString r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.Cardinal((com.cardinalcommerce.a.PSSSignatureSpi.SHA512_256withRSA) r1, (com.cardinalcommerce.a.DSAUtil) r0)
            java.security.spec.ECParameterSpec r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getInstance(r0, r1)
            r6.Cardinal = r2
            com.cardinalcommerce.a.getDeviceFingerprint r7 = r7.Cardinal
            byte[] r7 = r7.getInstance()
            com.cardinalcommerce.a.setEnabledVisaCheckout r2 = new com.cardinalcommerce.a.setEnabledVisaCheckout
            r2.<init>((byte[]) r7)
            r3 = 0
            byte r3 = r7[r3]
            r4 = 4
            if (r3 != r4) goto L_0x0055
            r3 = 1
            byte r3 = r7[r3]
            int r4 = r7.length
            r5 = 2
            int r4 = r4 - r5
            if (r3 != r4) goto L_0x0055
            byte r3 = r7[r5]
            r4 = 3
            if (r3 == r5) goto L_0x0034
            if (r3 != r4) goto L_0x0055
        L_0x0034:
            com.cardinalcommerce.a.GMCipherSpi$ErasableOutputStream r3 = new com.cardinalcommerce.a.GMCipherSpi$ErasableOutputStream
            r3.<init>()
            int r3 = r1.getInstance()
            int r3 = r3 + 7
            int r3 = r3 / 8
            int r5 = r7.length
            int r5 = r5 - r4
            if (r3 < r5) goto L_0x0055
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r7 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r7)     // Catch:{ IOException -> 0x004d }
            r2 = r7
            com.cardinalcommerce.a.setUICustomization r2 = (com.cardinalcommerce.a.setUICustomization) r2     // Catch:{ IOException -> 0x004d }
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r7.<init>(r0)
            throw r7
        L_0x0055:
            com.cardinalcommerce.a.ECUtils r7 = new com.cardinalcommerce.a.ECUtils
            r7.<init>((com.cardinalcommerce.a.toJSONString) r1, (com.cardinalcommerce.a.setUICustomization) r2)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r1 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH
            com.cardinalcommerce.a.JSONNavi r7 = r7.cca_continue()
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r2 = r6.configure
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((com.cardinalcommerce.a.PSSSignatureSpi.SHA512_256withRSA) r2, (com.cardinalcommerce.a.DSAUtil) r0)
            r1.<init>(r7, r0)
            r6.cca_continue = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey.configure(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    public byte[] getEncoded() {
        return KeyUtil.getInstance(new SubjectPublicKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.CardinalError, ECUtils.cca_continue(this.Cardinal)), setUICustomization.init(new ECUtils(this.cca_continue.configure, this.getInstance).onCReqSuccess()).getInstance()));
    }

    public ECPoint getW() {
        return EC5Util.cca_continue(this.cca_continue.configure);
    }

    public final JSONNavi Cardinal() {
        JSONNavi jSONNavi = this.cca_continue.configure;
        return this.Cardinal == null ? jSONNavi.cca_continue() : jSONNavi;
    }

    public String toString() {
        JSONNavi jSONNavi = this.cca_continue.configure;
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return ECUtil.Cardinal("EC", jSONNavi, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.configure.cca_continue());
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        if (this.cca_continue.configure.init(bCECPublicKey.cca_continue.configure)) {
            ECParameterSpec eCParameterSpec = this.Cardinal;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.configure.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECPublicKey.Cardinal;
            if (eCParameterSpec2 != null) {
                boolean z = bCECPublicKey.getInstance;
                x509CertificateObject = EC5Util.getInstance(eCParameterSpec2);
            } else {
                x509CertificateObject = bCECPublicKey.configure.cca_continue();
            }
            if (instance.equals(x509CertificateObject)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.cca_continue.configure.hashCode();
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : this.configure.cca_continue()).hashCode();
    }
}
