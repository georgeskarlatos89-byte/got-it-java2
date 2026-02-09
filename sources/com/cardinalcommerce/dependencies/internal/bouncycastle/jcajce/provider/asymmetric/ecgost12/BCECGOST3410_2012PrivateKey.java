package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
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

public class BCECGOST3410_2012PrivateKey implements GMCipherSpi.SM2withRMD, GOST3410Util, ECPrivateKey {
    private transient ECParameterSpec Cardinal;
    private transient BigInteger cca_continue;
    private boolean configure;
    private String getInstance = "ECGOST3410-2012";
    private transient getDeviceFingerprint getSDKVersion;
    private transient AlgorithmParameterGeneratorSpi init;
    private transient PKCS12BagAttributeCarrierImpl onValidated = new PKCS12BagAttributeCarrierImpl();

    protected BCECGOST3410_2012PrivateKey() {
    }

    BCECGOST3410_2012PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        cca_continue(privateKeyInfo);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.cca_continue = eCPrivateKeySpec.getS();
        this.Cardinal = eCPrivateKeySpec.getParams();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        cca_continue(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
        this.onValidated = new PKCS12BagAttributeCarrierImpl();
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
        return this.getInstance;
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

    public BCECGOST3410_2012PrivateKey(X509SignatureUtil x509SignatureUtil) {
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

    public BCECGOST3410_2012PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
        this.getInstance = str;
        this.cca_continue = edDSA.init;
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
        this.init = bCECGOST3410_2012PublicKey.cca_continue();
        this.getSDKVersion = SubjectPublicKeyInfo.configure(bCECGOST3410_2012PublicKey.getEncoded()).Cardinal;
    }

    public BCECGOST3410_2012PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, X509CertificateObject x509CertificateObject) {
        KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
        this.getInstance = str;
        this.cca_continue = edDSA.init;
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
        this.init = bCECGOST3410_2012PublicKey.cca_continue();
        this.getSDKVersion = SubjectPublicKeyInfo.configure(bCECGOST3410_2012PublicKey.getEncoded()).Cardinal;
    }

    public BCECGOST3410_2012PrivateKey(String str, KeyPairGeneratorSpi.EdDSA edDSA) {
        this.getInstance = str;
        this.cca_continue = edDSA.init;
        this.Cardinal = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cca_continue(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.cardinalcommerce.a.BCDSAPrivateKey r2 = r1.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.Cardinal
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.onCReqSuccess()
            boolean r3 = r2 instanceof com.cardinalcommerce.a.isEnableLogging
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x00aa
            com.cardinalcommerce.a.isEnableLogging r3 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r2)
            int r3 = r3.cca_continue()
            r7 = 2
            if (r3 == r7) goto L_0x0029
            com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r2)
            int r2 = r2.cca_continue()
            r3 = 3
            if (r2 != r3) goto L_0x00aa
        L_0x0029:
            com.cardinalcommerce.a.BCDSAPrivateKey r2 = r1.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.Cardinal
            boolean r3 = r2 instanceof com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi
            if (r3 == 0) goto L_0x0035
            r4 = r2
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r4 = (com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi) r4
            goto L_0x0040
        L_0x0035:
            if (r2 == 0) goto L_0x0040
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r4 = new com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi
            com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r2)
            r4.<init>(r2)
        L_0x0040:
            r0.init = r4
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = r4.configure
            java.lang.String r2 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            com.cardinalcommerce.a.PEMUtil$Boundaries r2 = com.cardinalcommerce.a.BaseKeyFactorySpi.configure(r2)
            com.cardinalcommerce.a.toJSONString r3 = r2.cca_continue
            byte[] r4 = r2.init
            java.security.spec.EllipticCurve r9 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r3)
            com.cardinalcommerce.a.X509CRLObject r3 = new com.cardinalcommerce.a.X509CRLObject
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r4 = r0.init
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r4 = r4.configure
            java.lang.String r8 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r4)
            com.cardinalcommerce.a.JSONNavi r4 = r2.configure
            java.security.spec.ECPoint r10 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r4)
            java.math.BigInteger r11 = r2.getInstance
            java.math.BigInteger r12 = r2.getWarnings
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            r0.Cardinal = r3
            com.cardinalcommerce.a.setUICustomization r1 = r1.Cardinal
            byte[] r1 = r1.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r1)
            boolean r2 = r1 instanceof com.cardinalcommerce.a.setEnvironment
            if (r2 == 0) goto L_0x008a
            com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r2.<init>(r5, r1)
            r0.cca_continue = r2
            return
        L_0x008a:
            com.cardinalcommerce.a.setUICustomization r1 = com.cardinalcommerce.a.setUICustomization.init(r1)
            byte[] r1 = r1.getInstance()
            int r2 = r1.length
            byte[] r2 = new byte[r2]
        L_0x0095:
            int r3 = r1.length
            if (r6 == r3) goto L_0x00a2
            int r3 = r1.length
            int r3 = r3 - r5
            int r3 = r3 - r6
            byte r3 = r1[r3]
            r2[r6] = r3
            int r6 = r6 + 1
            goto L_0x0095
        L_0x00a2:
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r5, r2)
            r0.cca_continue = r1
            return
        L_0x00aa:
            com.cardinalcommerce.a.BCDSAPrivateKey r2 = r1.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.Cardinal
            com.cardinalcommerce.a.DSAUtil r2 = com.cardinalcommerce.a.DSAUtil.Cardinal(r2)
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r2.cca_continue
            boolean r3 = r3 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r3 == 0) goto L_0x0120
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier.cca_continue((java.lang.Object) r2)
            com.cardinalcommerce.a.GMCipherSpi r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            if (r3 != 0) goto L_0x00f2
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r3 = com.cardinalcommerce.a.IES.Mappings.configure(r2)
            com.cardinalcommerce.a.toJSONString r7 = r3.cca_continue
            byte[] r8 = r3.configure
            if (r8 == 0) goto L_0x00d5
            int r9 = r8.length
            byte[] r9 = new byte[r9]
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r6, r9, r6, r10)
        L_0x00d5:
            java.security.spec.EllipticCurve r13 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r7)
            com.cardinalcommerce.a.X509CRLObject r6 = new com.cardinalcommerce.a.X509CRLObject
            java.lang.String r12 = com.cardinalcommerce.a.IES.Mappings.init((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)
            com.cardinalcommerce.a.JSONNavi r2 = r3.init
            java.security.spec.ECPoint r14 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.JSONNavi) r2)
            java.math.BigInteger r15 = r3.getInstance
            java.math.BigInteger r2 = r3.Cardinal
            r11 = r6
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.Cardinal = r6
            goto L_0x0159
        L_0x00f2:
            com.cardinalcommerce.a.toJSONString r7 = r3.init
            byte[] r8 = r3.Cardinal
            if (r8 == 0) goto L_0x00ff
            int r9 = r8.length
            byte[] r9 = new byte[r9]
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r6, r9, r6, r10)
        L_0x00ff:
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
            goto L_0x0159
        L_0x0120:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r2.cca_continue
            boolean r3 = r3 instanceof com.cardinalcommerce.a.setUiType
            if (r3 == 0) goto L_0x0129
            r0.Cardinal = r4
            goto L_0x0159
        L_0x0129:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.cca_continue
            com.cardinalcommerce.a.GMCipherSpi r2 = com.cardinalcommerce.a.GMCipherSpi.cca_continue(r2)
            com.cardinalcommerce.a.toJSONString r3 = r2.init
            byte[] r7 = r2.Cardinal
            if (r7 == 0) goto L_0x013c
            int r8 = r7.length
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r6, r8, r6, r9)
        L_0x013c:
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
        L_0x0159:
            com.cardinalcommerce.a.setUICustomization r1 = r1.Cardinal
            byte[] r1 = r1.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r1)
            boolean r2 = r1 instanceof com.cardinalcommerce.a.setEnvironment
            if (r2 == 0) goto L_0x0175
            com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r2.<init>(r1)
            r0.cca_continue = r2
            return
        L_0x0175:
            if (r1 == 0) goto L_0x0180
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r4 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
            r4.<init>(r1)
        L_0x0180:
            com.cardinalcommerce.a.isEnableLogging r1 = r4.getInstance
            com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r1.init(r5)
            com.cardinalcommerce.a.setUICustomization r1 = (com.cardinalcommerce.a.setUICustomization) r1
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance()
            r2.<init>(r5, r1)
            r0.cca_continue = r2
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r4.Cardinal(r5)
            com.cardinalcommerce.a.getDeviceFingerprint r1 = (com.cardinalcommerce.a.getDeviceFingerprint) r1
            r0.getSDKVersion = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.cca_continue(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r13 = this;
            java.math.BigInteger r0 = r13.cca_continue
            int r0 = r0.bitLength()
            r1 = 256(0x100, float:3.59E-43)
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L_0x000e
            r0 = r2
            goto L_0x000f
        L_0x000e:
            r0 = r3
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA224CKDF.getInstance
            goto L_0x0016
        L_0x0014:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA224CKDF.Cardinal
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            r0 = 64
            goto L_0x001d
        L_0x001b:
            r0 = 32
        L_0x001d:
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r4 = r13.init
            java.lang.String r5 = "DER"
            r6 = 0
            if (r4 == 0) goto L_0x005e
            byte[] r4 = new byte[r0]
            java.math.BigInteger r7 = r13.getS()
            byte[] r7 = r7.toByteArray()
            int r8 = r7.length
            if (r8 >= r0) goto L_0x003b
            byte[] r8 = new byte[r0]
            int r9 = r7.length
            int r9 = r0 - r9
            int r10 = r7.length
            java.lang.System.arraycopy(r7, r3, r8, r9, r10)
            r7 = r8
        L_0x003b:
            if (r3 == r0) goto L_0x0047
            int r8 = r7.length
            int r8 = r8 - r2
            int r8 = r8 - r3
            byte r8 = r7[r8]
            r4[r3] = r8
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0047:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x005d }
            com.cardinalcommerce.a.BCDSAPrivateKey r2 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x005d }
            com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi r3 = r13.init     // Catch:{ IOException -> 0x005d }
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x005d }
            com.cardinalcommerce.a.setEnabledVisaCheckout r1 = new com.cardinalcommerce.a.setEnabledVisaCheckout     // Catch:{ IOException -> 0x005d }
            r1.<init>((byte[]) r4)     // Catch:{ IOException -> 0x005d }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x005d }
            byte[] r0 = r0.configure(r5)     // Catch:{ IOException -> 0x005d }
            return r0
        L_0x005d:
            return r6
        L_0x005e:
            java.security.spec.ECParameterSpec r0 = r13.Cardinal
            boolean r2 = r0 instanceof com.cardinalcommerce.a.X509CRLObject
            if (r2 == 0) goto L_0x007f
            com.cardinalcommerce.a.X509CRLObject r0 = (com.cardinalcommerce.a.X509CRLObject) r0
            java.lang.String r0 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue((java.lang.String) r0)
            if (r0 != 0) goto L_0x0079
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            java.security.spec.ECParameterSpec r2 = r13.Cardinal
            com.cardinalcommerce.a.X509CRLObject r2 = (com.cardinalcommerce.a.X509CRLObject) r2
            java.lang.String r2 = r2.cca_continue
            r0.<init>((java.lang.String) r2)
        L_0x0079:
            com.cardinalcommerce.a.DSAUtil r2 = new com.cardinalcommerce.a.DSAUtil
            r2.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            goto L_0x00cb
        L_0x007f:
            if (r0 != 0) goto L_0x0093
            com.cardinalcommerce.a.DSAUtil r2 = new com.cardinalcommerce.a.DSAUtil
            com.cardinalcommerce.a.isEnabledVisaCheckout r0 = com.cardinalcommerce.a.isEnabledVisaCheckout.configure
            r2.<init>((com.cardinalcommerce.a.setUiType) r0)
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.math.BigInteger r3 = r13.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r6, r3)
            goto L_0x00db
        L_0x0093:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.cardinalcommerce.a.toJSONString r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getInstance((java.security.spec.EllipticCurve) r0)
            com.cardinalcommerce.a.GMCipherSpi r0 = new com.cardinalcommerce.a.GMCipherSpi
            java.security.spec.ECParameterSpec r2 = r13.Cardinal
            java.security.spec.ECPoint r2 = r2.getGenerator()
            com.cardinalcommerce.a.JSONNavi r9 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.cca_continue((com.cardinalcommerce.a.toJSONString) r8, (java.security.spec.ECPoint) r2)
            java.security.spec.ECParameterSpec r2 = r13.Cardinal
            java.math.BigInteger r10 = r2.getOrder()
            java.security.spec.ECParameterSpec r2 = r13.Cardinal
            int r2 = r2.getCofactor()
            long r2 = (long) r2
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r2)
            java.security.spec.ECParameterSpec r2 = r13.Cardinal
            java.security.spec.EllipticCurve r2 = r2.getCurve()
            byte[] r12 = r2.getSeed()
            r7 = r0
            r7.<init>((com.cardinalcommerce.a.toJSONString) r8, (com.cardinalcommerce.a.JSONNavi) r9, (java.math.BigInteger) r10, (java.math.BigInteger) r11, (byte[]) r12)
            com.cardinalcommerce.a.DSAUtil r2 = new com.cardinalcommerce.a.DSAUtil
            r2.<init>((com.cardinalcommerce.a.GMCipherSpi) r0)
        L_0x00cb:
            com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA r0 = com.cardinalcommerce.a.KeyFactory.init
            java.security.spec.ECParameterSpec r3 = r13.Cardinal
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r13.getS()
            int r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance(r0, r3, r4)
        L_0x00db:
            com.cardinalcommerce.a.getDeviceFingerprint r3 = r13.getSDKVersion
            if (r3 == 0) goto L_0x00eb
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r3 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r4 = r13.getS()
            com.cardinalcommerce.a.getDeviceFingerprint r7 = r13.getSDKVersion
            r3.<init>(r0, r4, r7, r2)
            goto L_0x00f4
        L_0x00eb:
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r3 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
            java.math.BigInteger r4 = r13.getS()
            r3.<init>(r0, r4, r2)
        L_0x00f4:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x010b }
            com.cardinalcommerce.a.BCDSAPrivateKey r4 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x010b }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r2.onCReqSuccess()     // Catch:{ IOException -> 0x010b }
            r4.<init>(r1, r2)     // Catch:{ IOException -> 0x010b }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r3.onCReqSuccess()     // Catch:{ IOException -> 0x010b }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x010b }
            byte[] r0 = r0.configure(r5)     // Catch:{ IOException -> 0x010b }
            return r0
        L_0x010b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.getEncoded():byte[]");
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        if (this.cca_continue.equals(bCECGOST3410_2012PrivateKey.cca_continue)) {
            ECParameterSpec eCParameterSpec = this.Cardinal;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECGOST3410_2012PrivateKey.Cardinal;
            if (eCParameterSpec2 != null) {
                boolean z = bCECGOST3410_2012PrivateKey.configure;
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
        String str = this.getInstance;
        BigInteger bigInteger = this.cca_continue;
        ECParameterSpec eCParameterSpec = this.Cardinal;
        return ECUtil.init(str, bigInteger, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }
}
