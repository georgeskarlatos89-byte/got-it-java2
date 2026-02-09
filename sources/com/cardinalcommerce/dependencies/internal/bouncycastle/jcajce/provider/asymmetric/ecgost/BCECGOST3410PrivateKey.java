package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.a.CardinalConfigurationParameters;
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

public class BCECGOST3410PrivateKey implements GMCipherSpi.SM2withRMD, GOST3410Util, ECPrivateKey {
    private transient ECParameterSpec Cardinal;
    private transient BigInteger cca_continue;
    private transient PKCS12BagAttributeCarrierImpl cleanup = new PKCS12BagAttributeCarrierImpl();
    private String configure = "ECGOST3410";
    private transient CardinalConfigurationParameters getInstance;
    private transient getDeviceFingerprint getSDKVersion;
    private boolean init;

    protected BCECGOST3410PrivateKey() {
    }

    BCECGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.cca_continue = eCPrivateKeySpec.getS();
        this.Cardinal = eCPrivateKeySpec.getParams();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
        this.cleanup = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final BigInteger Cardinal() {
        return this.cca_continue;
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
        return this.cca_continue;
    }

    public BCECGOST3410PrivateKey(X509SignatureUtil x509SignatureUtil) {
        ECParameterSpec eCParameterSpec;
        this.cca_continue = x509SignatureUtil.configure;
        if (x509SignatureUtil.Cardinal != null) {
            toJSONString tojsonstring = x509SignatureUtil.Cardinal.cca_continue;
            byte[] bArr = x509SignatureUtil.Cardinal.init;
            eCParameterSpec = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring), x509SignatureUtil.Cardinal);
        } else {
            eCParameterSpec = null;
        }
        this.Cardinal = eCParameterSpec;
    }

    public BCECGOST3410PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.configure = str;
        this.cca_continue = edDSA.init;
        if (eCParameterSpec == null) {
            KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            eCParameterSpec = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        }
        this.Cardinal = eCParameterSpec;
        this.getInstance = bCECGOST3410PublicKey.getInstance();
        this.getSDKVersion = configure(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECGOST3410PublicKey bCECGOST3410PublicKey, X509CertificateObject x509CertificateObject) {
        this.configure = str;
        this.cca_continue = edDSA.init;
        if (x509CertificateObject == null) {
            KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
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
        this.getInstance = bCECGOST3410PublicKey.getInstance();
        this.getSDKVersion = configure(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA) {
        this.configure = str;
        this.cca_continue = edDSA.init;
        this.Cardinal = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r13) throws java.io.IOException {
        /*
            r12 = this;
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r13.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.Cardinal
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r0.onCReqSuccess()
            boolean r2 = r1 instanceof com.cardinalcommerce.a.isEnableLogging
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00a0
            com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
            int r2 = r2.cca_continue()
            r6 = 2
            if (r2 == r6) goto L_0x0025
            com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
            int r1 = r1.cca_continue()
            r2 = 3
            if (r1 != r2) goto L_0x00a0
        L_0x0025:
            boolean r1 = r0 instanceof com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi
            if (r1 == 0) goto L_0x002d
            r3 = r0
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r3 = (com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi) r3
            goto L_0x0038
        L_0x002d:
            if (r0 == 0) goto L_0x0038
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r3 = new com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            r3.<init>(r0)
        L_0x0038:
            r12.getInstance = r3
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r3.configure
            java.lang.String r0 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            com.cardinalcommerce.a.PEMUtil$Boundaries r0 = com.cardinalcommerce.a.BaseKeyFactorySpi.configure(r0)
            com.cardinalcommerce.a.toJSONString r1 = r0.cca_continue
            byte[] r2 = r0.init
            java.security.spec.EllipticCurve r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r1)
            com.cardinalcommerce.a.X509CRLObject r1 = new com.cardinalcommerce.a.X509CRLObject
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = r3.configure
            java.lang.String r7 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            com.cardinalcommerce.a.JSONNavi r2 = r0.configure
            java.security.spec.ECPoint r9 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r2)
            java.math.BigInteger r10 = r0.getInstance
            java.math.BigInteger r11 = r0.getWarnings
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.Cardinal = r1
            com.cardinalcommerce.a.setUICustomization r13 = r13.Cardinal
            byte[] r13 = r13.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r13 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r13)
            boolean r0 = r13 instanceof com.cardinalcommerce.a.setEnvironment
            if (r0 == 0) goto L_0x0080
            com.cardinalcommerce.a.setEnvironment r13 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r13)
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r0.<init>(r4, r13)
            r12.cca_continue = r0
            return
        L_0x0080:
            com.cardinalcommerce.a.setUICustomization r13 = com.cardinalcommerce.a.setUICustomization.init(r13)
            byte[] r13 = r13.getInstance()
            int r0 = r13.length
            byte[] r0 = new byte[r0]
        L_0x008b:
            int r1 = r13.length
            if (r5 == r1) goto L_0x0098
            int r1 = r13.length
            int r1 = r1 - r4
            int r1 = r1 - r5
            byte r1 = r13[r1]
            r0[r5] = r1
            int r5 = r5 + 1
            goto L_0x008b
        L_0x0098:
            java.math.BigInteger r13 = new java.math.BigInteger
            r13.<init>(r4, r0)
            r12.cca_continue = r13
            return
        L_0x00a0:
            com.cardinalcommerce.a.DSAUtil r0 = com.cardinalcommerce.a.DSAUtil.Cardinal(r0)
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r0.cca_continue
            boolean r1 = r1 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r1 == 0) goto L_0x010a
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier.cca_continue((java.lang.Object) r0)
            com.cardinalcommerce.a.GMCipherSpi r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            if (r1 != 0) goto L_0x00dd
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r1 = com.cardinalcommerce.a.IES.Mappings.configure(r0)
            com.cardinalcommerce.a.GMCipherSpi r2 = new com.cardinalcommerce.a.GMCipherSpi
            com.cardinalcommerce.a.toJSONString r7 = r1.cca_continue
            com.cardinalcommerce.a.JSONNavi r8 = r1.init
            java.math.BigInteger r9 = r1.getInstance
            java.math.BigInteger r10 = r1.Cardinal
            byte[] r1 = r1.configure
            if (r1 != 0) goto L_0x00ca
            r11 = r3
            goto L_0x00d2
        L_0x00ca:
            int r6 = r1.length
            byte[] r6 = new byte[r6]
            int r11 = r1.length
            java.lang.System.arraycopy(r1, r5, r6, r5, r11)
            r11 = r6
        L_0x00d2:
            r6 = r2
            r6.<init>((com.cardinalcommerce.a.toJSONString) r7, (com.cardinalcommerce.a.JSONNavi) r8, (java.math.BigInteger) r9, (java.math.BigInteger) r10, (byte[]) r11)
            java.lang.String r0 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            r7 = r0
            r1 = r2
            goto L_0x00e2
        L_0x00dd:
            java.lang.String r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            r7 = r0
        L_0x00e2:
            com.cardinalcommerce.a.toJSONString r0 = r1.init
            byte[] r2 = r1.Cardinal
            if (r2 == 0) goto L_0x00ef
            int r6 = r2.length
            byte[] r6 = new byte[r6]
            int r8 = r2.length
            java.lang.System.arraycopy(r2, r5, r6, r5, r8)
        L_0x00ef:
            java.security.spec.EllipticCurve r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r0)
            com.cardinalcommerce.a.X509CRLObject r0 = new com.cardinalcommerce.a.X509CRLObject
            com.cardinalcommerce.a.ECUtils r2 = r1.getInstance
            com.cardinalcommerce.a.JSONNavi r2 = r2.cca_continue()
            java.security.spec.ECPoint r9 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r2)
            java.math.BigInteger r10 = r1.cca_continue
            java.math.BigInteger r11 = r1.configure
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.Cardinal = r0
            goto L_0x0143
        L_0x010a:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r0.cca_continue
            boolean r1 = r1 instanceof com.cardinalcommerce.a.setUiType
            if (r1 == 0) goto L_0x0113
            r12.Cardinal = r3
            goto L_0x0143
        L_0x0113:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = r0.cca_continue
            com.cardinalcommerce.a.GMCipherSpi r0 = com.cardinalcommerce.a.GMCipherSpi.cca_continue(r0)
            com.cardinalcommerce.a.toJSONString r1 = r0.init
            byte[] r2 = r0.Cardinal
            if (r2 == 0) goto L_0x0126
            int r6 = r2.length
            byte[] r6 = new byte[r6]
            int r7 = r2.length
            java.lang.System.arraycopy(r2, r5, r6, r5, r7)
        L_0x0126:
            java.security.spec.EllipticCurve r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r1)
            java.security.spec.ECParameterSpec r2 = new java.security.spec.ECParameterSpec
            com.cardinalcommerce.a.ECUtils r5 = r0.getInstance
            com.cardinalcommerce.a.JSONNavi r5 = r5.cca_continue()
            java.security.spec.ECPoint r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r5)
            java.math.BigInteger r6 = r0.cca_continue
            java.math.BigInteger r0 = r0.configure
            int r0 = r0.intValue()
            r2.<init>(r1, r5, r6, r0)
            r12.Cardinal = r2
        L_0x0143:
            com.cardinalcommerce.a.setUICustomization r13 = r13.Cardinal
            byte[] r13 = r13.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r13 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r13)
            boolean r0 = r13 instanceof com.cardinalcommerce.a.setEnvironment
            if (r0 == 0) goto L_0x015f
            com.cardinalcommerce.a.setEnvironment r13 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r13)
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r0.<init>(r13)
            r12.cca_continue = r0
            return
        L_0x015f:
            if (r13 == 0) goto L_0x016a
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r3 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            com.cardinalcommerce.a.isEnableLogging r13 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r13)
            r3.<init>(r13)
        L_0x016a:
            com.cardinalcommerce.a.isEnableLogging r13 = r3.getInstance
            com.cardinalcommerce.a.CardinalConfigurationParameters r13 = r13.init(r4)
            com.cardinalcommerce.a.setUICustomization r13 = (com.cardinalcommerce.a.setUICustomization) r13
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r13 = r13.getInstance()
            r0.<init>(r4, r13)
            r12.cca_continue = r0
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r13 = r3.Cardinal(r4)
            com.cardinalcommerce.a.getDeviceFingerprint r13 = (com.cardinalcommerce.a.getDeviceFingerprint) r13
            r12.getSDKVersion = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.init(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r9.getInstance
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L_0x0047
            r0 = 32
            byte[] r3 = new byte[r0]
            java.math.BigInteger r4 = r9.getS()
            byte[] r4 = r4.toByteArray()
            int r5 = r4.length
            r6 = 0
            if (r5 >= r0) goto L_0x0021
            byte[] r5 = new byte[r0]
            int r7 = r4.length
            int r7 = 32 - r7
            int r8 = r4.length
            java.lang.System.arraycopy(r4, r6, r5, r7, r8)
            r4 = r5
        L_0x0021:
            if (r6 == r0) goto L_0x002e
            int r5 = r4.length
            int r5 = r5 + -1
            int r5 = r5 - r6
            byte r5 = r4[r5]
            r3[r6] = r5
            int r6 = r6 + 1
            goto L_0x0021
        L_0x002e:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x0046 }
            com.cardinalcommerce.a.BCDSAPrivateKey r4 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x0046 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r5 = com.cardinalcommerce.a.IES.onValidated     // Catch:{ IOException -> 0x0046 }
            com.cardinalcommerce.a.CardinalConfigurationParameters r6 = r9.getInstance     // Catch:{ IOException -> 0x0046 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0046 }
            com.cardinalcommerce.a.setEnabledVisaCheckout r5 = new com.cardinalcommerce.a.setEnabledVisaCheckout     // Catch:{ IOException -> 0x0046 }
            r5.<init>((byte[]) r3)     // Catch:{ IOException -> 0x0046 }
            r0.<init>(r4, r5)     // Catch:{ IOException -> 0x0046 }
            byte[] r0 = r0.configure(r1)     // Catch:{ IOException -> 0x0046 }
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            java.security.spec.ECParameterSpec r0 = r9.Cardinal
            boolean r3 = r0 instanceof com.cardinalcommerce.a.X509CRLObject
            if (r3 == 0) goto L_0x0068
            com.cardinalcommerce.a.X509CRLObject r0 = (com.cardinalcommerce.a.X509CRLObject) r0
            java.lang.String r0 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((java.lang.String) r0)
            if (r0 != 0) goto L_0x0062
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            com.cardinalcommerce.a.X509CRLObject r3 = (com.cardinalcommerce.a.X509CRLObject) r3
            java.lang.String r3 = r3.cca_continue
            r0.<init>((java.lang.String) r3)
        L_0x0062:
            com.cardinalcommerce.a.DSAUtil r3 = new com.cardinalcommerce.a.DSAUtil
            r3.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            goto L_0x00b4
        L_0x0068:
            if (r0 != 0) goto L_0x007c
            com.cardinalcommerce.a.DSAUtil r3 = new com.cardinalcommerce.a.DSAUtil
            com.cardinalcommerce.a.isEnabledVisaCheckout r0 = com.cardinalcommerce.a.isEnabledVisaCheckout.configure
            r3.<init>((com.cardinalcommerce.a.setUiType) r0)
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.math.BigInteger r4 = r9.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r2, r4)
            goto L_0x00c4
        L_0x007c:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.cardinalcommerce.a.toJSONString r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getInstance((java.security.spec.EllipticCurve) r0)
            com.cardinalcommerce.a.GMCipherSpi r0 = new com.cardinalcommerce.a.GMCipherSpi
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            java.security.spec.ECPoint r3 = r3.getGenerator()
            com.cardinalcommerce.a.JSONNavi r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r4, (java.security.spec.ECPoint) r3)
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r9.Cardinal
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>((com.cardinalcommerce.a.toJSONString) r4, (com.cardinalcommerce.a.JSONNavi) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (byte[]) r8)
            com.cardinalcommerce.a.DSAUtil r3 = new com.cardinalcommerce.a.DSAUtil
            r3.<init>((com.cardinalcommerce.a.GMCipherSpi) r0)
        L_0x00b4:
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.security.spec.ECParameterSpec r4 = r9.Cardinal
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r9.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r4, r5)
        L_0x00c4:
            com.cardinalcommerce.a.getDeviceFingerprint r4 = r9.getSDKVersion
            if (r4 == 0) goto L_0x00d4
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r4 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r5 = r9.getS()
            com.cardinalcommerce.a.getDeviceFingerprint r6 = r9.getSDKVersion
            r4.<init>(r0, r5, r6, r3)
            goto L_0x00dd
        L_0x00d4:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r4 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r5 = r9.getS()
            r4.<init>(r0, r5, r3)
        L_0x00dd:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x00f6 }
            com.cardinalcommerce.a.BCDSAPrivateKey r5 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x00f6 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r6 = com.cardinalcommerce.a.IES.onValidated     // Catch:{ IOException -> 0x00f6 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r3.onCReqSuccess()     // Catch:{ IOException -> 0x00f6 }
            r5.<init>(r6, r3)     // Catch:{ IOException -> 0x00f6 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r4.onCReqSuccess()     // Catch:{ IOException -> 0x00f6 }
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x00f6 }
            byte[] r0 = r0.configure(r1)     // Catch:{ IOException -> 0x00f6 }
            return r0
        L_0x00f6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        if (this.cca_continue.equals(bCECGOST3410PrivateKey.cca_continue)) {
            ECParameterSpec eCParameterSpec = this.Cardinal;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECGOST3410PrivateKey.Cardinal;
            if (eCParameterSpec2 != null) {
                boolean z = bCECGOST3410PrivateKey.init;
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
        int hashCode = this.cca_continue.hashCode();
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue()).hashCode();
    }

    public String toString() {
        String str = this.configure;
        BigInteger bigInteger = this.cca_continue;
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return ECUtil.init(str, bigInteger, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }

    private static getDeviceFingerprint configure(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal(bCECGOST3410PublicKey.getEncoded())).Cardinal;
        } catch (IOException unused) {
            return null;
        }
    }
}
