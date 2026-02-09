package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class SignatureSpi extends java.security.SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private GMSignatureSpi.sha256WithSM2 getEciFlag = new ISOSignatureSpi.RIPEMD160WithRSAEncryption();
    private IESCipher.ECIESwithAESCBC getEnrolled;

    private static byte[] getInstance(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i << 1;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & Ascii.SI);
        }
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInitSign(java.security.PrivateKey r5) throws java.security.InvalidKeyException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L_0x0018
            com.cardinalcommerce.a.setCCAImageUri r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r5)
            com.cardinalcommerce.a.KeyAgreementSpi$ECKAEGwithSHA256KDF r0 = new com.cardinalcommerce.a.KeyAgreementSpi$ECKAEGwithSHA256KDF
            byte[] r1 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA256CKDF.cca_continue()
            byte[] r1 = getInstance(r1)
            r0.<init>((byte[]) r1)
        L_0x0015:
            r4.getEnrolled = r0
            goto L_0x002f
        L_0x0018:
            boolean r0 = r5 instanceof com.cardinalcommerce.a.DSAEncoder
            if (r0 == 0) goto L_0x002e
            com.cardinalcommerce.a.setCCAImageUri r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r5)
            com.cardinalcommerce.a.KeyAgreementSpi$ECKAEGwithSHA256KDF r0 = new com.cardinalcommerce.a.KeyAgreementSpi$ECKAEGwithSHA256KDF
            byte[] r1 = com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA256CKDF.cca_continue()
            byte[] r1 = getInstance(r1)
            r0.<init>((byte[]) r1)
            goto L_0x0015
        L_0x002e:
            r5 = 0
        L_0x002f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L_0x0041
            com.cardinalcommerce.a.GMSignatureSpi$sha256WithSM2 r0 = r4.getEciFlag
            com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD128 r2 = new com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD128
            java.security.SecureRandom r3 = r4.appRandom
            r2.<init>(r5, r3)
            r0.cca_continue(r1, r2)
            return
        L_0x0041:
            com.cardinalcommerce.a.GMSignatureSpi$sha256WithSM2 r0 = r4.getEciFlag
            r0.cca_continue(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi.engineInitSign(java.security.PrivateKey):void");
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
            BigInteger[] init = this.getEciFlag.init(bArr);
            byte[] byteArray = init[0].toByteArray();
            byte[] byteArray2 = init[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) << 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new setEnabledVisaCheckout(bArr2).getEncoded();
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
            byte[] instance = ((setUICustomization) setUICustomization.Cardinal(bArr)).getInstance();
            byte[] bArr3 = new byte[(instance.length / 2)];
            byte[] bArr4 = new byte[(instance.length / 2)];
            System.arraycopy(instance, 0, bArr4, 0, instance.length / 2);
            System.arraycopy(instance, instance.length / 2, bArr3, 0, instance.length / 2);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.getEciFlag.configure(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        byte[] bArr;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            sM2withRMD = bCDSTU4145PublicKey.init;
            if (bCDSTU4145PublicKey.getInstance != null) {
                byte[] bArr2 = bCDSTU4145PublicKey.getInstance.getInstance;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    byte[] bArr3 = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                    bArr = bArr3;
                }
            } else {
                bArr = KeyAgreementSpi.DHwithSHA256CKDF.cca_continue();
            }
            this.getEnrolled = new KeyAgreementSpi.ECKAEGwithSHA256KDF(getInstance(bArr));
        } else {
            sM2withRMD = ECUtil.init(publicKey);
            this.getEnrolled = new KeyAgreementSpi.ECKAEGwithSHA256KDF(getInstance(KeyAgreementSpi.DHwithSHA256CKDF.cca_continue()));
        }
        this.getEciFlag.cca_continue(false, sM2withRMD);
    }
}
