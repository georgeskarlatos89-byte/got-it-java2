package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.cardinalcommerce.a.DSAEncoder;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class ECGOST2012SignatureSpi512 extends SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private IESCipher.ECIESwithAESCBC getEciFlag = new KeyAgreementSpi.MQVwithSHA224KDFAndSharedInfo();
    private GMSignatureSpi.sha256WithSM2 getEnrolled = new ISOSignatureSpi.SHA256WithRSAEncryption();
    private int getSignatureVerification = 64;
    private int isEnabledDiscover = 128;

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.getEciFlag.getInstance()];
        this.getEciFlag.init(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.isEnabledDiscover];
            BigInteger[] init = this.getEnrolled.init(bArr);
            byte[] byteArray = init[0].toByteArray();
            byte[] byteArray2 = init[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.getSignatureVerification - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.getSignatureVerification - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.isEnabledDiscover - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.isEnabledDiscover - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.getEciFlag.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.getEciFlag.init(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.getEciFlag.getInstance()];
        this.getEciFlag.init(bArr2, 0);
        try {
            int i = this.getSignatureVerification;
            byte[] bArr3 = new byte[i];
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 0, bArr4, 0, i);
            int i2 = this.getSignatureVerification;
            System.arraycopy(bArr, i2, bArr3, 0, i2);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.getEnrolled.configure(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        KeyPairGeneratorSpi.Ed448 ed448;
        Object obj;
        if (publicKey instanceof ExtendedInvalidKeySpecException) {
            if (publicKey instanceof BCECGOST3410_2012PublicKey) {
                obj = ((BCECGOST3410_2012PublicKey) publicKey).configure;
            } else {
                obj = ECUtil.init(publicKey);
            }
            ed448 = (KeyPairGeneratorSpi.Ed448) obj;
        } else {
            try {
                ed448 = (KeyPairGeneratorSpi.Ed448) ECUtil.init(KeyFactory.init(SubjectPublicKeyInfo.configure(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
            }
        }
        if (ed448.Cardinal.getInstance.bitLength() >= 505) {
            this.getEciFlag.init();
            this.getEnrolled.cca_continue(false, ed448);
            return;
        }
        throw new InvalidKeyException("key too weak for ECGOST-2012-512");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAEncoder) {
            KeyPairGeneratorSpi.Ed448 ed448 = (KeyPairGeneratorSpi.Ed448) ECUtil.Cardinal(privateKey);
            if (ed448.Cardinal.getInstance.bitLength() >= 505) {
                this.getEciFlag.init();
                if (this.appRandom != null) {
                    this.getEnrolled.cca_continue(true, new DigestSignatureSpi.RIPEMD128(ed448, this.appRandom));
                } else {
                    this.getEnrolled.cca_continue(true, ed448);
                }
            } else {
                throw new InvalidKeyException("key too weak for ECGOST-2012-512");
            }
        } else {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
        }
    }
}
