package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.objectweb.asm.Opcodes;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    private SecureRandom Cardinal;
    private int cca_continue = 2048;
    private KeyAgreementSpi.X448withSHA384CKDF getInstance;

    /* access modifiers changed from: protected */
    public void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        } else if (i <= 1024 && i % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        } else if (i <= 1024 || i % 1024 == 0) {
            this.cca_continue = i;
            this.Cardinal = secureRandom;
        } else {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGenerateParameters() {
        SignatureSpi.ecDetDSASha3_384 ecdetdsasha3_384 = this.cca_continue <= 1024 ? new SignatureSpi.ecDetDSASha3_384() : new SignatureSpi.ecDetDSASha3_384(new SignatureSpi.ecCVCDSA224());
        if (this.Cardinal == null) {
            this.Cardinal = GMCipherSpi.SM2withWhirlpool.configure();
        }
        int cca_continue2 = PrimeCertaintyCalculator.cca_continue(this.cca_continue);
        int i = this.cca_continue;
        if (i == 1024) {
            KeyAgreementSpi.X448withSHA384CKDF x448withSHA384CKDF = new KeyAgreementSpi.X448withSHA384CKDF(1024, Opcodes.IF_ICMPNE, cca_continue2, this.Cardinal);
            this.getInstance = x448withSHA384CKDF;
            ecdetdsasha3_384.cca_continue(x448withSHA384CKDF);
        } else if (i > 1024) {
            KeyAgreementSpi.X448withSHA384CKDF x448withSHA384CKDF2 = new KeyAgreementSpi.X448withSHA384CKDF(this.cca_continue, 256, cca_continue2, this.Cardinal);
            this.getInstance = x448withSHA384CKDF2;
            ecdetdsasha3_384.cca_continue(x448withSHA384CKDF2);
        } else {
            ecdetdsasha3_384.cca_continue(i, cca_continue2, this.Cardinal);
        }
        KeyAgreementSpi.X448withSHA256CKDF instance = ecdetdsasha3_384.getInstance();
        try {
            AlgorithmParameters cca_continue3 = cca_continue("DSA");
            cca_continue3.init(new DSAParameterSpec(instance.configure, instance.init, instance.Cardinal));
            return cca_continue3;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
