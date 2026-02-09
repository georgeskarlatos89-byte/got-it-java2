package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Hashtable configure = new Hashtable();
    private static Object init = new Object();
    private SignatureSpi.ecDSAnone Cardinal = new SignatureSpi.ecDSAnone();
    private KeyAgreementSpi.X25519UwithSHA256KDF cca_continue;
    private int getInstance = 2048;
    private boolean onCReqSuccess = false;
    private SecureRandom onValidated = GMCipherSpi.SM2withWhirlpool.configure();

    public KeyPairGeneratorSpi() {
        super("DH");
    }

    private static KeyAgreementSpi.X25519UwithSHA256KDF init(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof X931SignatureSpi.SHA512WithRSAEncryption ? new KeyAgreementSpi.X25519UwithSHA256KDF(secureRandom, ((X931SignatureSpi.SHA512WithRSAEncryption) dHParameterSpec).init()) : new KeyAgreementSpi.X25519UwithSHA256KDF(secureRandom, new KeyAgreementSpi.X25519withSHA256CKDF(dHParameterSpec.getP(), dHParameterSpec.getG(), (BigInteger) null, dHParameterSpec.getL()));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.getInstance = i;
        this.onValidated = secureRandom;
        this.onCReqSuccess = false;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            try {
                KeyAgreementSpi.X25519UwithSHA256KDF init2 = init(secureRandom, (DHParameterSpec) algorithmParameterSpec);
                this.cca_continue = init2;
                KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF = init2;
                this.Cardinal.cca_continue = init2;
                this.onCReqSuccess = true;
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException(e.getMessage(), e);
            }
        } else {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
    }

    public KeyPair generateKeyPair() {
        KeyAgreementSpi.X25519UwithSHA256KDF init2;
        if (!this.onCReqSuccess) {
            Integer valueOf = Integer.valueOf(this.getInstance);
            if (configure.containsKey(valueOf)) {
                init2 = (KeyAgreementSpi.X25519UwithSHA256KDF) configure.get(valueOf);
            } else {
                DHParameterSpec configure2 = KeyFactory.init.configure(this.getInstance);
                if (configure2 != null) {
                    init2 = init(this.onValidated, configure2);
                } else {
                    synchronized (init) {
                        if (configure.containsKey(valueOf)) {
                            this.cca_continue = (KeyAgreementSpi.X25519UwithSHA256KDF) configure.get(valueOf);
                        } else {
                            SignatureSpi.ecDetDSASha3_224 ecdetdsasha3_224 = new SignatureSpi.ecDetDSASha3_224();
                            int i = this.getInstance;
                            int cca_continue2 = PrimeCertaintyCalculator.cca_continue(i);
                            SecureRandom secureRandom = this.onValidated;
                            ecdetdsasha3_224.init = i;
                            ecdetdsasha3_224.getInstance = cca_continue2;
                            ecdetdsasha3_224.cca_continue = secureRandom;
                            KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF = new KeyAgreementSpi.X25519UwithSHA256KDF(this.onValidated, ecdetdsasha3_224.configure());
                            this.cca_continue = x25519UwithSHA256KDF;
                            configure.put(valueOf, x25519UwithSHA256KDF);
                        }
                    }
                    SignatureSpi.ecDSAnone ecdsanone = this.Cardinal;
                    KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF2 = this.cca_continue;
                    KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF3 = x25519UwithSHA256KDF2;
                    ecdsanone.cca_continue = x25519UwithSHA256KDF2;
                    this.onCReqSuccess = true;
                }
            }
            this.cca_continue = init2;
            SignatureSpi.ecDSAnone ecdsanone2 = this.Cardinal;
            KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF22 = this.cca_continue;
            KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF32 = x25519UwithSHA256KDF22;
            ecdsanone2.cca_continue = x25519UwithSHA256KDF22;
            this.onCReqSuccess = true;
        }
        PSSSignatureSpi.SHA256withRSA init3 = this.Cardinal.init();
        return new KeyPair(new BCDHPublicKey((KeyAgreementSpi.X25519withSHA256KDF) init3.getInstance), new BCDHPrivateKey((KeyAgreementSpi.X25519UwithSHA256CKDF) init3.init));
    }
}
