package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.a.DSAEncoder;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.PKCS12BagAttributeCarrierImpl;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class SignatureSpi extends java.security.SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private GMSignatureSpi.sha256WithSM2 getEciFlag = new ISOSignatureSpi.SHA224WithRSAEncryption();
    private IESCipher.ECIESwithAESCBC getEnrolled = new KeyAgreementSpi.ECKAEGwithSHA256KDF();

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        setCCAImageUri Cardinal = privateKey instanceof DSAEncoder ? ECUtil.Cardinal(privateKey) : GOST3410Util.init(privateKey);
        this.getEnrolled.init();
        if (this.appRandom != null) {
            this.getEciFlag.cca_continue(true, new DigestSignatureSpi.RIPEMD128(Cardinal, this.appRandom));
        } else {
            this.getEciFlag.cca_continue(true, Cardinal);
        }
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
        byte[] bArr = new byte[this.getEnrolled.getInstance()];
        this.getEnrolled.init(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            BigInteger[] init = this.getEciFlag.init(bArr);
            byte[] byteArray = init[0].toByteArray();
            byte[] byteArray2 = init[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.getEnrolled.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.getEnrolled.init(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.getEnrolled.getInstance()];
        this.getEnrolled.init(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.getEciFlag.configure(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        if (publicKey instanceof ExtendedInvalidKeySpecException) {
            sM2withRMD = publicKey instanceof BCECGOST3410PublicKey ? ((BCECGOST3410PublicKey) publicKey).getInstance : ECUtil.init(publicKey);
        } else if (publicKey instanceof PKCS12BagAttributeCarrierImpl) {
            sM2withRMD = GOST3410Util.configure(publicKey);
        } else {
            try {
                sM2withRMD = ECUtil.init(KeyFactory.init(SubjectPublicKeyInfo.configure(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.getEnrolled.init();
        this.getEciFlag.cca_continue(false, sM2withRMD);
    }
}
