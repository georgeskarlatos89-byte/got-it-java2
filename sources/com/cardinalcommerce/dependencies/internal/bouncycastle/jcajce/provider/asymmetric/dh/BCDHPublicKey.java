package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BCDSTU4145PrivateKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class BCDHPublicKey implements DHPublicKey {
    public transient KeyAgreementSpi.X25519withSHA256KDF Cardinal;
    private BigInteger cca_continue;
    private transient DHParameterSpec getInstance;
    private transient SubjectPublicKeyInfo init;

    BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.cca_continue = bigInteger;
        this.getInstance = dHParameterSpec;
        this.Cardinal = dHParameterSpec instanceof X931SignatureSpi.SHA512WithRSAEncryption ? new KeyAgreementSpi.X25519withSHA256KDF(bigInteger, ((X931SignatureSpi.SHA512WithRSAEncryption) dHParameterSpec).init()) : new KeyAgreementSpi.X25519withSHA256KDF(bigInteger, new KeyAgreementSpi.X25519withSHA256CKDF(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.cca_continue = dHPublicKey.getY();
        this.getInstance = dHPublicKey.getParams();
        this.Cardinal = new KeyAgreementSpi.X25519withSHA256KDF(this.cca_continue, new KeyAgreementSpi.X25519withSHA256CKDF(this.getInstance.getP(), this.getInstance.getG()));
    }

    BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.cca_continue = dHPublicKeySpec.getY();
        this.getInstance = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.Cardinal = new KeyAgreementSpi.X25519withSHA256KDF(this.cca_continue, new KeyAgreementSpi.X25519withSHA256CKDF(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getInstance = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.init = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getInstance.getP());
        objectOutputStream.writeObject(this.getInstance.getG());
        objectOutputStream.writeInt(this.getInstance.getL());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        return this.getInstance;
    }

    public BigInteger getY() {
        return this.cca_continue;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.cca_continue("DH", this.cca_continue, new KeyAgreementSpi.X25519withSHA256CKDF(this.getInstance.getP(), this.getInstance.getG()));
    }

    BCDHPublicKey(KeyAgreementSpi.X25519withSHA256KDF x25519withSHA256KDF) {
        this.cca_continue = x25519withSHA256KDF.init;
        this.getInstance = new X931SignatureSpi.SHA512WithRSAEncryption(x25519withSHA256KDF.Cardinal);
        this.Cardinal = x25519withSHA256KDF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        if (new java.math.BigInteger(com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r0.init(2)).getInstance).compareTo(java.math.BigInteger.valueOf((long) new java.math.BigInteger(com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r0.init(0)).getInstance).bitLength())) > 0) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCDHPublicKey(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo r13) {
        /*
            r12 = this;
            r12.<init>()
            r12.init = r13
            com.cardinalcommerce.a.getDeviceFingerprint r0 = r13.Cardinal     // Catch:{ IOException -> 0x01b2 }
            byte[] r0 = r0.init()     // Catch:{ IOException -> 0x01b2 }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r0)     // Catch:{ IOException -> 0x01b2 }
            com.cardinalcommerce.a.setEnvironment r0 = (com.cardinalcommerce.a.setEnvironment) r0     // Catch:{ IOException -> 0x01b2 }
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r0 = r0.getInstance
            r1.<init>(r0)
            r12.cca_continue = r1
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r13.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.Cardinal
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            com.cardinalcommerce.a.BCDSAPrivateKey r13 = r13.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r13 = r13.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode
            boolean r1 = r13.equals(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0134
            int r1 = r0.cca_continue()
            r4 = 2
            if (r1 == r4) goto L_0x006e
            int r1 = r0.cca_continue()
            r5 = 3
            r6 = 0
            if (r1 <= r5) goto L_0x0040
            goto L_0x006f
        L_0x0040:
            com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r0.init(r4)
            com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r1)
            com.cardinalcommerce.a.CardinalConfigurationParameters r4 = r0.init(r6)
            com.cardinalcommerce.a.setEnvironment r4 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r4)
            java.math.BigInteger r5 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r5.<init>(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r4 = r4.getInstance
            r1.<init>(r4)
            int r1 = r1.bitLength()
            long r7 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r7)
            int r1 = r5.compareTo(r1)
            if (r1 <= 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r6 = r3
        L_0x006f:
            if (r6 == 0) goto L_0x0073
            goto L_0x0134
        L_0x0073:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.GMCipherSpi.SM2withMD5.getSignatureVerification
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0124
            if (r0 == 0) goto L_0x0087
            com.cardinalcommerce.a.BCDSTU4145PrivateKey r13 = new com.cardinalcommerce.a.BCDSTU4145PrivateKey
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            r13.<init>(r0)
            goto L_0x0088
        L_0x0087:
            r13 = r2
        L_0x0088:
            com.cardinalcommerce.a.KeyFactorySpi$1 r0 = r13.configure
            if (r0 == 0) goto L_0x00de
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF r1 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF
            java.math.BigInteger r4 = r12.cca_continue
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF r11 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF
            com.cardinalcommerce.a.setEnvironment r5 = r13.getInstance
            java.math.BigInteger r6 = new java.math.BigInteger
            byte[] r5 = r5.getInstance
            r6.<init>(r3, r5)
            com.cardinalcommerce.a.setEnvironment r5 = r13.cca_continue
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r5 = r5.getInstance
            r7.<init>(r3, r5)
            com.cardinalcommerce.a.setEnvironment r5 = r13.Cardinal
            java.math.BigInteger r8 = new java.math.BigInteger
            byte[] r5 = r5.getInstance
            r8.<init>(r3, r5)
            com.cardinalcommerce.a.setEnvironment r5 = r13.init
            if (r5 != 0) goto L_0x00b2
            goto L_0x00bb
        L_0x00b2:
            com.cardinalcommerce.a.setEnvironment r13 = r13.init
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r2.<init>(r3, r13)
        L_0x00bb:
            r9 = r2
            com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512CKDF r10 = new com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512CKDF
            com.cardinalcommerce.a.getDeviceFingerprint r13 = r0.cca_continue
            byte[] r13 = r13.getInstance()
            com.cardinalcommerce.a.setEnvironment r0 = r0.configure
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r0 = r0.getInstance
            r2.<init>(r3, r0)
            int r0 = r2.intValue()
            r10.<init>(r13, r0)
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r1.<init>(r4, r11)
            r12.Cardinal = r1
            goto L_0x0118
        L_0x00de:
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF r0 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF
            java.math.BigInteger r1 = r12.cca_continue
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF r10 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF
            com.cardinalcommerce.a.setEnvironment r4 = r13.getInstance
            java.math.BigInteger r5 = new java.math.BigInteger
            byte[] r4 = r4.getInstance
            r5.<init>(r3, r4)
            com.cardinalcommerce.a.setEnvironment r4 = r13.cca_continue
            java.math.BigInteger r6 = new java.math.BigInteger
            byte[] r4 = r4.getInstance
            r6.<init>(r3, r4)
            com.cardinalcommerce.a.setEnvironment r4 = r13.Cardinal
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r4 = r4.getInstance
            r7.<init>(r3, r4)
            com.cardinalcommerce.a.setEnvironment r4 = r13.init
            if (r4 != 0) goto L_0x0104
            goto L_0x010d
        L_0x0104:
            com.cardinalcommerce.a.setEnvironment r13 = r13.init
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r2.<init>(r3, r13)
        L_0x010d:
            r8 = r2
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.<init>(r1, r10)
            r12.Cardinal = r0
        L_0x0118:
            com.cardinalcommerce.a.X931SignatureSpi$SHA512WithRSAEncryption r13 = new com.cardinalcommerce.a.X931SignatureSpi$SHA512WithRSAEncryption
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF r0 = r12.Cardinal
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF r0 = r0.Cardinal
            r13.<init>(r0)
            r12.getInstance = r13
            return
        L_0x0124:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown algorithm type: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        L_0x0134:
            if (r0 == 0) goto L_0x0140
            com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA1CKDF r13 = new com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA1CKDF
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            r13.<init>(r0)
            goto L_0x0141
        L_0x0140:
            r13 = r2
        L_0x0141:
            com.cardinalcommerce.a.setEnvironment r0 = r13.getInstance
            if (r0 != 0) goto L_0x0147
            r1 = r2
            goto L_0x0150
        L_0x0147:
            com.cardinalcommerce.a.setEnvironment r0 = r13.getInstance
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r0 = r0.getInstance
            r1.<init>(r3, r0)
        L_0x0150:
            if (r1 == 0) goto L_0x017e
            javax.crypto.spec.DHParameterSpec r0 = new javax.crypto.spec.DHParameterSpec
            com.cardinalcommerce.a.setEnvironment r1 = r13.Cardinal
            java.math.BigInteger r4 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r4.<init>(r3, r1)
            com.cardinalcommerce.a.setEnvironment r1 = r13.configure
            java.math.BigInteger r5 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r5.<init>(r3, r1)
            com.cardinalcommerce.a.setEnvironment r1 = r13.getInstance
            if (r1 != 0) goto L_0x016b
            goto L_0x0174
        L_0x016b:
            com.cardinalcommerce.a.setEnvironment r13 = r13.getInstance
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r2.<init>(r3, r13)
        L_0x0174:
            int r13 = r2.intValue()
            r0.<init>(r4, r5, r13)
            r12.getInstance = r0
            goto L_0x0197
        L_0x017e:
            javax.crypto.spec.DHParameterSpec r0 = new javax.crypto.spec.DHParameterSpec
            com.cardinalcommerce.a.setEnvironment r1 = r13.Cardinal
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r2.<init>(r3, r1)
            com.cardinalcommerce.a.setEnvironment r13 = r13.configure
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r13 = r13.getInstance
            r1.<init>(r3, r13)
            r0.<init>(r2, r1)
            r12.getInstance = r0
        L_0x0197:
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF r13 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256KDF
            java.math.BigInteger r0 = r12.cca_continue
            com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF r1 = new com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF
            javax.crypto.spec.DHParameterSpec r2 = r12.getInstance
            java.math.BigInteger r2 = r2.getP()
            javax.crypto.spec.DHParameterSpec r3 = r12.getInstance
            java.math.BigInteger r3 = r3.getG()
            r1.<init>(r2, r3)
            r13.<init>(r0, r1)
            r12.Cardinal = r13
            return
        L_0x01b2:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid info structure in DH public key"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey.<init>(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    public byte[] getEncoded() {
        KeyFactorySpi.AnonymousClass1 r9;
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.init;
        if (subjectPublicKeyInfo != null) {
            return KeyUtil.getInstance(subjectPublicKeyInfo);
        }
        DHParameterSpec dHParameterSpec = this.getInstance;
        if (!(dHParameterSpec instanceof X931SignatureSpi.SHA512WithRSAEncryption) || ((X931SignatureSpi.SHA512WithRSAEncryption) dHParameterSpec).Cardinal == null) {
            return KeyUtil.configure(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode, new KeyAgreementSpi.DHUwithSHA1CKDF(this.getInstance.getP(), this.getInstance.getG(), this.getInstance.getL()).onCReqSuccess()), new setEnvironment(this.cca_continue));
        }
        KeyAgreementSpi.X25519withSHA256CKDF init2 = ((X931SignatureSpi.SHA512WithRSAEncryption) this.getInstance).init();
        KeyAgreementSpi.X448UwithSHA512CKDF x448UwithSHA512CKDF = init2.onValidated;
        byte[] bArr = null;
        if (x448UwithSHA512CKDF != null) {
            byte[] bArr2 = x448UwithSHA512CKDF.init;
            if (bArr2 != null) {
                bArr = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            r9 = new KeyFactorySpi.AnonymousClass1(bArr, x448UwithSHA512CKDF.configure);
        } else {
            r9 = null;
        }
        return KeyUtil.configure(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.getSignatureVerification, new BCDSTU4145PrivateKey(init2.Cardinal, init2.init, init2.getInstance, init2.configure, r9).onCReqSuccess()), new setEnvironment(this.cca_continue));
    }
}
