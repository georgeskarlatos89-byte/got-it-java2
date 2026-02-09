package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ECGOST2012SignatureSpi512;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.X509CRLEntryObject;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.appendElement;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;

public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private int cca_continue;
    private GMCipherSpi.SM2 configure;
    private boolean getInstance;
    private SecureRandom init;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1, new SignatureSpi.ecNR());
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(0, new SignatureSpi.ecDetDSASha3_512());
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1, (GMCipherSpi.SM2) null);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3, new ECGOST2012SignatureSpi512());
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(2, new KeyAgreementSpi.ECVKO());
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2, (GMCipherSpi.SM2) null);
        }
    }

    KeyPairGeneratorSpi(int i, GMCipherSpi.SM2 sm2) {
        this.cca_continue = i;
        this.configure = sm2;
    }

    private void getInstance(int i) throws InvalidAlgorithmParameterException {
        int i2 = this.cca_continue;
        if (i2 == i) {
            return;
        }
        if (i2 == 1 || i2 == 0) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 == -1 && i != 1 && i != 0) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 == 3 || i2 == 2) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 != -2 || i == 3 || i == 2) {
            this.cca_continue = i;
        } else {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
    }

    private void init(int i) {
        GMCipherSpi.SM2 sm2;
        appendElement ed25519;
        this.getInstance = true;
        if (this.init == null) {
            this.init = new SecureRandom();
        }
        if (i != -2) {
            if (i != -1) {
                if (i == 0) {
                    sm2 = this.configure;
                    ed25519 = new SignatureSpi.Ed448(this.init);
                } else if (i != 1) {
                    if (i == 2) {
                        sm2 = this.configure;
                        ed25519 = new DigestSignatureSpi.SHA3_256(this.init);
                    } else if (i != 3) {
                        return;
                    }
                }
                sm2.getInstance(ed25519);
                return;
            }
            sm2 = this.configure;
            ed25519 = new SignatureSpi.Ed25519(this.init);
            sm2.getInstance(ed25519);
            return;
        }
        this.configure.getInstance(new DigestSignatureSpi.SHA1(this.init));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.init = secureRandom;
        if (i == 255 || i == 256) {
            int i2 = this.cca_continue;
            if (i2 != -2) {
                if (i2 == -1 || i2 == 1) {
                    init(1);
                    return;
                } else if (i2 != 3) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            init(3);
        } else if (i == 448) {
            int i3 = this.cca_continue;
            if (i3 != -2) {
                if (i3 == -1 || i3 == 0) {
                    init(0);
                    return;
                } else if (i3 != 2) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            init(2);
        } else {
            throw new InvalidParameterException("unknown key size");
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.init = secureRandom;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            getInstance(((ECGenParameterSpec) algorithmParameterSpec).getName());
        } else if (algorithmParameterSpec instanceof X509CRLEntryObject) {
            getInstance(((X509CRLEntryObject) algorithmParameterSpec).cca_continue);
        } else if (algorithmParameterSpec instanceof X931SignatureSpi.SHA512_224WithRSAEncryption) {
            getInstance(((X931SignatureSpi.SHA512_224WithRSAEncryption) algorithmParameterSpec).getInstance);
        } else if (algorithmParameterSpec instanceof BaseCipherSpi) {
            getInstance(((BaseCipherSpi) algorithmParameterSpec).configure);
        } else {
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: ".concat(String.valueOf(algorithmParameterSpec)));
        }
    }

    private void getInstance(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase("Ed448") || str.equals(X509.Mappings.init.init)) {
            getInstance(0);
            this.configure = new SignatureSpi.ecDetDSASha3_512();
            init(0);
        } else if (str.equalsIgnoreCase("Ed25519") || str.equals(X509.Mappings.cca_continue.init)) {
            getInstance(1);
            this.configure = new SignatureSpi.ecNR();
            init(1);
        } else if (str.equalsIgnoreCase("X448") || str.equals(X509.Mappings.configure.init)) {
            getInstance(2);
            this.configure = new KeyAgreementSpi.ECVKO();
            init(2);
        } else if (str.equalsIgnoreCase("X25519") || str.equals(X509.Mappings.Cardinal.init)) {
            getInstance(3);
            this.configure = new ECGOST2012SignatureSpi512();
            init(3);
        }
    }

    public KeyPair generateKeyPair() {
        if (this.configure != null) {
            if (!this.getInstance) {
                init(this.cca_continue);
            }
            PSSSignatureSpi.SHA256withRSA init2 = this.configure.init();
            int i = this.cca_continue;
            if (i == 0) {
                return new KeyPair(new BCEdDSAPublicKey(init2.getInstance), new BCEdDSAPrivateKey(init2.init));
            }
            if (i == 1) {
                return new KeyPair(new BCEdDSAPublicKey(init2.getInstance), new BCEdDSAPrivateKey(init2.init));
            }
            if (i == 2) {
                return new KeyPair(new BCXDHPublicKey(init2.getInstance), new BCXDHPrivateKey(init2.init));
            }
            if (i == 3) {
                return new KeyPair(new BCXDHPublicKey(init2.getInstance), new BCXDHPrivateKey(init2.init));
            }
            throw new IllegalStateException("generator not correctly initialized");
        }
        throw new IllegalStateException("generator not correctly initialized");
    }
}
