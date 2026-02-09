package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public abstract class DSABase extends SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private DigestSignatureSpi.noneRSA Payload;
    public IESCipher.ECIESwithAESCBC getEciFlag;
    public GMSignatureSpi.sha256WithSM2 getEnrolled;

    public DSABase(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMSignatureSpi.sha256WithSM2 sha256withsm2, DigestSignatureSpi.noneRSA nonersa) {
        this.getEciFlag = eCIESwithAESCBC;
        this.getEnrolled = sha256withsm2;
        this.Payload = nonersa;
    }

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
            BigInteger[] init = this.getEnrolled.init(bArr);
            return this.Payload.configure(this.getEnrolled.init(), init[0], init[1]);
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
            BigInteger[] instance = this.Payload.getInstance(this.getEnrolled.init(), bArr);
            return this.getEnrolled.configure(bArr2, instance[0], instance[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
