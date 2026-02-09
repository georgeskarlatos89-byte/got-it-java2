package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.getTextColor;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.objectweb.asm.Opcodes;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Hashtable getInstance = new Hashtable();
    private static Object init = new Object();
    private KeyAgreementSpi.X25519withSHA512CKDF Cardinal;
    private int cca_continue = 2048;
    private SignatureSpi.ecDetDSA512 configure = new SignatureSpi.ecDetDSA512();
    private boolean getWarnings = false;
    private SecureRandom onValidated = GMCipherSpi.SM2withWhirlpool.configure();

    public KeyPairGeneratorSpi() {
        super("DSA");
    }

    public void initialize(int i, SecureRandom secureRandom) {
        boolean z;
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec cca_continue2 = KeyFactory.init.cca_continue(i);
        if (cca_continue2 != null) {
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF = new KeyAgreementSpi.X25519withSHA512CKDF(secureRandom, new KeyAgreementSpi.X448withSHA256CKDF(cca_continue2.getP(), cca_continue2.getQ(), cca_continue2.getG()));
            this.Cardinal = x25519withSHA512CKDF;
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF2 = x25519withSHA512CKDF;
            this.configure.getInstance = x25519withSHA512CKDF;
            z = true;
        } else {
            this.cca_continue = i;
            this.onValidated = secureRandom;
            z = false;
        }
        this.getWarnings = z;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF = new KeyAgreementSpi.X25519withSHA512CKDF(secureRandom, new KeyAgreementSpi.X448withSHA256CKDF(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
            this.Cardinal = x25519withSHA512CKDF;
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF2 = x25519withSHA512CKDF;
            this.configure.getInstance = x25519withSHA512CKDF;
            this.getWarnings = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
    }

    public KeyPair generateKeyPair() {
        SignatureSpi.ecDetDSASha3_384 ecdetdsasha3_384;
        int i;
        SecureRandom secureRandom;
        if (!this.getWarnings) {
            Integer valueOf = Integer.valueOf(this.cca_continue);
            if (getInstance.containsKey(valueOf)) {
                this.Cardinal = (KeyAgreementSpi.X25519withSHA512CKDF) getInstance.get(valueOf);
            } else {
                synchronized (init) {
                    if (getInstance.containsKey(valueOf)) {
                        this.Cardinal = (KeyAgreementSpi.X25519withSHA512CKDF) getInstance.get(valueOf);
                    } else {
                        int cca_continue2 = PrimeCertaintyCalculator.cca_continue(this.cca_continue);
                        int i2 = this.cca_continue;
                        if (i2 == 1024) {
                            ecdetdsasha3_384 = new SignatureSpi.ecDetDSASha3_384();
                            if (getTextColor.getInstance("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                i = this.cca_continue;
                                secureRandom = this.onValidated;
                            } else {
                                ecdetdsasha3_384.cca_continue(new KeyAgreementSpi.X448withSHA384CKDF(1024, Opcodes.IF_ICMPNE, cca_continue2, this.onValidated));
                                KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF = new KeyAgreementSpi.X25519withSHA512CKDF(this.onValidated, ecdetdsasha3_384.getInstance());
                                this.Cardinal = x25519withSHA512CKDF;
                                getInstance.put(valueOf, x25519withSHA512CKDF);
                            }
                        } else if (i2 > 1024) {
                            KeyAgreementSpi.X448withSHA384CKDF x448withSHA384CKDF = new KeyAgreementSpi.X448withSHA384CKDF(this.cca_continue, 256, cca_continue2, this.onValidated);
                            SignatureSpi.ecDetDSASha3_384 ecdetdsasha3_3842 = new SignatureSpi.ecDetDSASha3_384(new SignatureSpi.ecCVCDSA224());
                            ecdetdsasha3_3842.cca_continue(x448withSHA384CKDF);
                            ecdetdsasha3_384 = ecdetdsasha3_3842;
                            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF2 = new KeyAgreementSpi.X25519withSHA512CKDF(this.onValidated, ecdetdsasha3_384.getInstance());
                            this.Cardinal = x25519withSHA512CKDF2;
                            getInstance.put(valueOf, x25519withSHA512CKDF2);
                        } else {
                            ecdetdsasha3_384 = new SignatureSpi.ecDetDSASha3_384();
                            i = this.cca_continue;
                            secureRandom = this.onValidated;
                        }
                        ecdetdsasha3_384.cca_continue(i, cca_continue2, secureRandom);
                        KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF22 = new KeyAgreementSpi.X25519withSHA512CKDF(this.onValidated, ecdetdsasha3_384.getInstance());
                        this.Cardinal = x25519withSHA512CKDF22;
                        getInstance.put(valueOf, x25519withSHA512CKDF22);
                    }
                }
            }
            SignatureSpi.ecDetDSA512 ecdetdsa512 = this.configure;
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF3 = this.Cardinal;
            KeyAgreementSpi.X25519withSHA512CKDF x25519withSHA512CKDF4 = x25519withSHA512CKDF3;
            ecdetdsa512.getInstance = x25519withSHA512CKDF3;
            this.getWarnings = true;
        }
        PSSSignatureSpi.SHA256withRSA init2 = this.configure.init();
        return new KeyPair(new BCDSAPublicKey((KeyAgreementSpi.X448withSHA512CKDF) init2.getInstance), new BCDSAPrivateKey((KeyAgreementSpi.X448UwithSHA512KDF) init2.init));
    }
}
