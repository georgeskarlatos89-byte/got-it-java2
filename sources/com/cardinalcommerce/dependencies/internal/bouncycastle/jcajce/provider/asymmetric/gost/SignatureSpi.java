package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.DSAEncoder;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
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
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class SignatureSpi extends java.security.SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private IESCipher.ECIESwithAESCBC getEciFlag = new KeyAgreementSpi.ECKAEGwithSHA256KDF();
    private GMSignatureSpi.sha256WithSM2 getEnrolled = new ISOSignatureSpi.SHA512_256WithRSAEncryption();
    private SecureRandom setEnabledDiscover;

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        setCCAImageUri Cardinal = privateKey instanceof DSAEncoder ? ECUtil.Cardinal(privateKey) : GOST3410Util.init(privateKey);
        this.getEciFlag.init();
        if (this.setEnabledDiscover != null) {
            this.getEnrolled.cca_continue(true, new DigestSignatureSpi.RIPEMD128(Cardinal, this.setEnabledDiscover));
        } else {
            this.getEnrolled.cca_continue(true, Cardinal);
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.setEnabledDiscover = secureRandom;
        engineInitSign(privateKey);
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        setCCAImageUri setccaimageuri;
        if (publicKey instanceof ExtendedInvalidKeySpecException) {
            setccaimageuri = ECUtil.init(publicKey);
        } else if (publicKey instanceof PKCS12BagAttributeCarrierImpl) {
            setccaimageuri = GOST3410Util.configure(publicKey);
        } else {
            try {
                PublicKey init = KeyFactory.init(SubjectPublicKeyInfo.configure(publicKey.getEncoded()));
                if (init instanceof ExtendedInvalidKeySpecException) {
                    setccaimageuri = ECUtil.init(init);
                } else {
                    throw new InvalidKeyException("can't recognise key type in DSA based signer");
                }
            } catch (Exception unused) {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.getEciFlag.init();
        this.getEnrolled.cca_continue(false, setccaimageuri);
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
            byte[] bArr2 = new byte[64];
            BigInteger[] init = this.getEnrolled.init(bArr);
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
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.getEnrolled.configure(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
