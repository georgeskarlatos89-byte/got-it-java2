package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST3410Util;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.X509SignatureUtil;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
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

public class BCDSTU4145PrivateKey implements GMCipherSpi.SM2withRMD, GOST3410Util, ECPrivateKey {
    private transient ECParameterSpec Cardinal;
    private transient getDeviceFingerprint cca_continue;
    private String configure = "DSTU4145";
    private boolean getInstance;
    private transient BigInteger init;
    private transient PKCS12BagAttributeCarrierImpl onCReqSuccess = new PKCS12BagAttributeCarrierImpl();

    protected BCDSTU4145PrivateKey() {
    }

    BCDSTU4145PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        cca_continue(privateKeyInfo);
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.init = eCPrivateKeySpec.getS();
        this.Cardinal = eCPrivateKeySpec.getParams();
    }

    private static void init(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        cca_continue(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
        this.onCReqSuccess = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final BigInteger Cardinal() {
        return this.init;
    }

    public final X509CertificateObject configure() {
        ECParameterSpec eCParameterSpec = this.Cardinal;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.getInstance(eCParameterSpec);
    }

    public String getAlgorithm() {
        return this.configure;
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public ECParameterSpec getParams() {
        return this.Cardinal;
    }

    public BigInteger getS() {
        return this.init;
    }

    public BCDSTU4145PrivateKey(X509SignatureUtil x509SignatureUtil) {
        ECParameterSpec eCParameterSpec;
        this.init = x509SignatureUtil.configure;
        if (x509SignatureUtil.Cardinal != null) {
            toJSONString tojsonstring = x509SignatureUtil.Cardinal.cca_continue;
            byte[] bArr = x509SignatureUtil.Cardinal.init;
            eCParameterSpec = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring), x509SignatureUtil.Cardinal);
        } else {
            eCParameterSpec = null;
        }
        this.Cardinal = eCParameterSpec;
    }

    public BCDSTU4145PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
        this.configure = str;
        this.init = edDSA.init;
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
        this.cca_continue = configure(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCDSTU4145PublicKey bCDSTU4145PublicKey, X509CertificateObject x509CertificateObject) {
        KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
        this.configure = str;
        this.init = edDSA.init;
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
            this.Cardinal = new ECParameterSpec(EC5Util.cca_continue(tojsonstring2), EC5Util.cca_continue(x509CertificateObject.configure), x509CertificateObject.getInstance, x509CertificateObject.getWarnings.intValue());
        }
        this.cca_continue = configure(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA) {
        this.configure = str;
        this.init = edDSA.init;
        this.Cardinal = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.cardinalcommerce.a.PEMUtil$Boundaries} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.cardinalcommerce.a.X509CertificateObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: com.cardinalcommerce.a.PEMUtil$Boundaries} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.cardinalcommerce.a.PEMUtil$Boundaries} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cca_continue(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.cardinalcommerce.a.BCDSAPrivateKey r2 = r1.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.Cardinal
            com.cardinalcommerce.a.DSAUtil r2 = com.cardinalcommerce.a.DSAUtil.Cardinal(r2)
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r2.cca_continue
            boolean r3 = r3 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x007d
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier.cca_continue((java.lang.Object) r2)
            com.cardinalcommerce.a.GMCipherSpi r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            if (r3 != 0) goto L_0x004e
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r3 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA384CKDF.getInstance(r2)
            com.cardinalcommerce.a.toJSONString r7 = r3.cca_continue
            byte[] r8 = r3.configure
            if (r8 == 0) goto L_0x0032
            int r9 = r8.length
            byte[] r9 = new byte[r9]
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r6, r9, r6, r10)
        L_0x0032:
            java.security.spec.EllipticCurve r13 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r7)
            com.cardinalcommerce.a.X509CRLObject r6 = new com.cardinalcommerce.a.X509CRLObject
            java.lang.String r12 = r2.init
            com.cardinalcommerce.a.JSONNavi r2 = r3.init
            java.security.spec.ECPoint r14 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r2)
            java.math.BigInteger r15 = r3.getInstance
            java.math.BigInteger r2 = r3.Cardinal
            r11 = r6
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.Cardinal = r6
            goto L_0x0189
        L_0x004e:
            com.cardinalcommerce.a.toJSONString r7 = r3.init
            byte[] r8 = r3.Cardinal
            if (r8 == 0) goto L_0x005b
            int r9 = r8.length
            byte[] r9 = new byte[r9]
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r6, r9, r6, r10)
        L_0x005b:
            java.security.spec.EllipticCurve r13 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r7)
            com.cardinalcommerce.a.X509CRLObject r6 = new com.cardinalcommerce.a.X509CRLObject
            java.lang.String r12 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            com.cardinalcommerce.a.ECUtils r2 = r3.getInstance
            com.cardinalcommerce.a.JSONNavi r2 = r2.cca_continue()
            java.security.spec.ECPoint r14 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r2)
            java.math.BigInteger r15 = r3.cca_continue
            java.math.BigInteger r2 = r3.configure
            r11 = r6
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.Cardinal = r6
            goto L_0x0189
        L_0x007d:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r2.cca_continue
            boolean r3 = r3 instanceof com.cardinalcommerce.a.setUiType
            if (r3 == 0) goto L_0x0087
            r0.Cardinal = r5
            goto L_0x0189
        L_0x0087:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r2.cca_continue
            com.cardinalcommerce.a.isEnableLogging r3 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r3)
            com.cardinalcommerce.a.CardinalConfigurationParameters r7 = r3.init(r6)
            boolean r7 = r7 instanceof com.cardinalcommerce.a.setEnvironment
            if (r7 == 0) goto L_0x00c7
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.cca_continue
            com.cardinalcommerce.a.GMCipherSpi r2 = com.cardinalcommerce.a.GMCipherSpi.cca_continue(r2)
            com.cardinalcommerce.a.toJSONString r3 = r2.init
            byte[] r7 = r2.Cardinal
            if (r7 == 0) goto L_0x00a8
            int r8 = r7.length
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r6, r8, r6, r9)
        L_0x00a8:
            java.security.spec.EllipticCurve r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r3)
            java.security.spec.ECParameterSpec r6 = new java.security.spec.ECParameterSpec
            com.cardinalcommerce.a.ECUtils r7 = r2.getInstance
            com.cardinalcommerce.a.JSONNavi r7 = r7.cca_continue()
            java.security.spec.ECPoint r7 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r7)
            java.math.BigInteger r8 = r2.cca_continue
            java.math.BigInteger r2 = r2.configure
            int r2 = r2.intValue()
            r6.<init>(r3, r7, r8, r2)
            r0.Cardinal = r6
            goto L_0x0189
        L_0x00c7:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA256CKDF r2 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA256CKDF.init(r3)
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r3 = r2.configure
            if (r3 == 0) goto L_0x00d1
            r3 = r4
            goto L_0x00d2
        L_0x00d1:
            r3 = r6
        L_0x00d2:
            if (r3 == 0) goto L_0x00fa
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = r2.configure
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r3 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA384CKDF.getInstance(r2)
            com.cardinalcommerce.a.PEMUtil$Boundaries r14 = new com.cardinalcommerce.a.PEMUtil$Boundaries
            java.lang.String r8 = r2.init
            com.cardinalcommerce.a.toJSONString r9 = r3.cca_continue
            com.cardinalcommerce.a.JSONNavi r10 = r3.init
            java.math.BigInteger r11 = r3.getInstance
            java.math.BigInteger r12 = r3.Cardinal
            byte[] r2 = r3.configure
            if (r2 != 0) goto L_0x00ec
            r13 = r5
            goto L_0x00f4
        L_0x00ec:
            int r3 = r2.length
            byte[] r3 = new byte[r3]
            int r7 = r2.length
            java.lang.System.arraycopy(r2, r6, r3, r6, r7)
            r13 = r3
        L_0x00f4:
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x016c
        L_0x00fa:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA512CKDF r2 = r2.init
            com.cardinalcommerce.a.setUICustomization r3 = r2.init
            byte[] r3 = r3.getInstance()
            if (r3 != 0) goto L_0x0106
            r7 = r5
            goto L_0x010d
        L_0x0106:
            int r7 = r3.length
            byte[] r7 = new byte[r7]
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r6, r7, r6, r8)
        L_0x010d:
            com.cardinalcommerce.a.BCDSAPrivateKey r3 = r1.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r3 = r3.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r8 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA512KDF.Cardinal
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x011c
            init(r7)
        L_0x011c:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA256KDF r3 = r2.cca_continue
            com.cardinalcommerce.a.toJSONString$init r15 = new com.cardinalcommerce.a.toJSONString$init
            int r9 = r3.Cardinal
            int r10 = r3.getInstance
            int r11 = r3.cca_continue
            int r12 = r3.configure
            com.cardinalcommerce.a.setEnvironment r3 = r2.Cardinal
            java.math.BigInteger r13 = new java.math.BigInteger
            byte[] r3 = r3.getInstance
            r13.<init>(r3)
            java.math.BigInteger r14 = new java.math.BigInteger
            r14.<init>(r4, r7)
            r8 = r15
            r8.<init>((int) r9, (int) r10, (int) r11, (int) r12, (java.math.BigInteger) r13, (java.math.BigInteger) r14)
            com.cardinalcommerce.a.setUICustomization r3 = r2.getInstance
            byte[] r3 = r3.getInstance()
            if (r3 != 0) goto L_0x0144
            r7 = r5
            goto L_0x014b
        L_0x0144:
            int r7 = r3.length
            byte[] r7 = new byte[r7]
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r6, r7, r6, r8)
        L_0x014b:
            com.cardinalcommerce.a.BCDSAPrivateKey r3 = r1.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r3 = r3.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r6 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA512KDF.Cardinal
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x015a
            init(r7)
        L_0x015a:
            com.cardinalcommerce.a.X509CertificateObject r14 = new com.cardinalcommerce.a.X509CertificateObject
            com.cardinalcommerce.a.JSONNavi r3 = com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((com.cardinalcommerce.a.toJSONString) r15, (byte[]) r7)
            com.cardinalcommerce.a.setEnvironment r2 = r2.configure
            java.math.BigInteger r6 = new java.math.BigInteger
            byte[] r2 = r2.getInstance
            r6.<init>(r2)
            r14.<init>(r15, r3, r6)
        L_0x016c:
            com.cardinalcommerce.a.toJSONString r2 = r14.cca_continue
            byte[] r3 = r14.init
            java.security.spec.EllipticCurve r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r2)
            java.security.spec.ECParameterSpec r3 = new java.security.spec.ECParameterSpec
            com.cardinalcommerce.a.JSONNavi r6 = r14.configure
            java.security.spec.ECPoint r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r6)
            java.math.BigInteger r7 = r14.getInstance
            java.math.BigInteger r8 = r14.getWarnings
            int r8 = r8.intValue()
            r3.<init>(r2, r6, r7, r8)
            r0.Cardinal = r3
        L_0x0189:
            com.cardinalcommerce.a.setUICustomization r1 = r1.Cardinal
            byte[] r1 = r1.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r1)
            boolean r2 = r1 instanceof com.cardinalcommerce.a.setEnvironment
            if (r2 == 0) goto L_0x01a5
            com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r2.<init>(r1)
            r0.init = r2
            return
        L_0x01a5:
            if (r1 == 0) goto L_0x01b0
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r5 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
            r5.<init>(r1)
        L_0x01b0:
            com.cardinalcommerce.a.isEnableLogging r1 = r5.getInstance
            com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r1.init(r4)
            com.cardinalcommerce.a.setUICustomization r1 = (com.cardinalcommerce.a.setUICustomization) r1
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance()
            r2.<init>(r4, r1)
            r0.init = r2
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r5.Cardinal(r4)
            com.cardinalcommerce.a.getDeviceFingerprint r1 = (com.cardinalcommerce.a.getDeviceFingerprint) r1
            r0.cca_continue = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.cca_continue(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a1 A[Catch:{ IOException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b6 A[Catch:{ IOException -> 0x00d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            java.security.spec.ECParameterSpec r0 = r9.Cardinal
            boolean r1 = r0 instanceof com.cardinalcommerce.a.X509CRLObject
            r2 = 0
            if (r1 == 0) goto L_0x0022
            com.cardinalcommerce.a.X509CRLObject r0 = (com.cardinalcommerce.a.X509CRLObject) r0
            java.lang.String r0 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((java.lang.String) r0)
            if (r0 != 0) goto L_0x001c
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            java.security.spec.ECParameterSpec r1 = r9.Cardinal
            com.cardinalcommerce.a.X509CRLObject r1 = (com.cardinalcommerce.a.X509CRLObject) r1
            java.lang.String r1 = r1.cca_continue
            r0.<init>((java.lang.String) r1)
        L_0x001c:
            com.cardinalcommerce.a.DSAUtil r1 = new com.cardinalcommerce.a.DSAUtil
            r1.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            goto L_0x006e
        L_0x0022:
            if (r0 != 0) goto L_0x0036
            com.cardinalcommerce.a.DSAUtil r1 = new com.cardinalcommerce.a.DSAUtil
            com.cardinalcommerce.a.isEnabledVisaCheckout r0 = com.cardinalcommerce.a.isEnabledVisaCheckout.configure
            r1.<init>((com.cardinalcommerce.a.setUiType) r0)
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.math.BigInteger r3 = r9.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r2, r3)
            goto L_0x007e
        L_0x0036:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.cardinalcommerce.a.toJSONString r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getInstance((java.security.spec.EllipticCurve) r0)
            com.cardinalcommerce.a.GMCipherSpi r0 = new com.cardinalcommerce.a.GMCipherSpi
            java.security.spec.ECParameterSpec r1 = r9.Cardinal
            java.security.spec.ECPoint r1 = r1.getGenerator()
            com.cardinalcommerce.a.JSONNavi r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r4, (java.security.spec.ECPoint) r1)
            java.security.spec.ECParameterSpec r1 = r9.Cardinal
            java.math.BigInteger r6 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r9.Cardinal
            int r1 = r1.getCofactor()
            long r7 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r1 = r9.Cardinal
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r8 = r1.getSeed()
            r3 = r0
            r3.<init>((com.cardinalcommerce.a.toJSONString) r4, (com.cardinalcommerce.a.JSONNavi) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (byte[]) r8)
            com.cardinalcommerce.a.DSAUtil r1 = new com.cardinalcommerce.a.DSAUtil
            r1.<init>((com.cardinalcommerce.a.GMCipherSpi) r0)
        L_0x006e:
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r9.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r3, r4)
        L_0x007e:
            com.cardinalcommerce.a.getDeviceFingerprint r3 = r9.cca_continue
            if (r3 == 0) goto L_0x008e
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r3 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r4 = r9.getS()
            com.cardinalcommerce.a.getDeviceFingerprint r5 = r9.cca_continue
            r3.<init>(r0, r4, r5, r1)
            goto L_0x0097
        L_0x008e:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r3 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r4 = r9.getS()
            r3.<init>(r0, r4, r1)
        L_0x0097:
            java.lang.String r0 = r9.configure     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = "DSTU4145"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x00d1 }
            if (r0 == 0) goto L_0x00b6
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.BCDSAPrivateKey r4 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r5 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA512KDF.cca_continue     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r1.onCReqSuccess()     // Catch:{ IOException -> 0x00d1 }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r3.onCReqSuccess()     // Catch:{ IOException -> 0x00d1 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00ca
        L_0x00b6:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.BCDSAPrivateKey r4 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r5 = com.cardinalcommerce.a.GMCipherSpi.SM2withMD5.CardinalError     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r1.onCReqSuccess()     // Catch:{ IOException -> 0x00d1 }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x00d1 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r3.onCReqSuccess()     // Catch:{ IOException -> 0x00d1 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x00d1 }
        L_0x00ca:
            java.lang.String r1 = "DER"
            byte[] r0 = r0.configure(r1)     // Catch:{ IOException -> 0x00d1 }
            return r0
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        if (this.init.equals(bCDSTU4145PrivateKey.init)) {
            ECParameterSpec eCParameterSpec = this.Cardinal;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCDSTU4145PrivateKey.Cardinal;
            if (eCParameterSpec2 != null) {
                boolean z = bCDSTU4145PrivateKey.getInstance;
                x509CertificateObject = EC5Util.getInstance(eCParameterSpec2);
            } else {
                x509CertificateObject = KeyFactory.init.cca_continue();
            }
            if (instance.equals(x509CertificateObject)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.init.hashCode();
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue()).hashCode();
    }

    public String toString() {
        String str = this.configure;
        BigInteger bigInteger = this.init;
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return ECUtil.init(str, bigInteger, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }

    private static getDeviceFingerprint configure(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal(bCDSTU4145PublicKey.getEncoded())).Cardinal;
        } catch (IOException unused) {
            return null;
        }
    }
}
