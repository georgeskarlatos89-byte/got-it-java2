package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.AlgorithmParametersSpi;
import com.cardinalcommerce.a.BCECGOST3410_2012PrivateKey;
import com.cardinalcommerce.a.BCXDHPublicKey;
import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyLengthException;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.XMSSMTKeyFactorySpi;
import com.cardinalcommerce.a.getProgressView;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.protocolError;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class IESCipher extends CipherSpi {
    private final BaseCipherSpi.ErasableOutputStream Cardinal = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private KeyLengthException cca_continue;
    private AlgorithmParameters cleanup = null;
    private ByteArrayOutputStream configure = new ByteArrayOutputStream();
    private int getInstance = -1;
    private boolean getSDKVersion = false;
    private XMSSMTKeyFactorySpi getWarnings = null;
    private final int init;
    private SecureRandom onCReqSuccess;
    private setCCAImageUri onValidated;
    private setCCAImageUri values = null;

    public IESCipher(KeyLengthException keyLengthException) {
        this.cca_continue = keyLengthException;
        this.init = 0;
    }

    public IESCipher(KeyLengthException keyLengthException, int i) {
        this.cca_continue = keyLengthException;
        this.init = i;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.cleanup == null && this.getWarnings != null) {
            try {
                AlgorithmParameters cca_continue2 = this.Cardinal.cca_continue("IES");
                this.cleanup = cca_continue2;
                cca_continue2.init(this.getWarnings);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.cleanup;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(XMSSMTKeyFactorySpi.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(new StringBuilder("cannot recognise parameters: ").append(e.toString()).toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.cleanup = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            AlgorithmParameterSpec algorithmParameterSpec = null;
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(new StringBuilder("cannot handle supplied parameter spec: ").append(e.getMessage()).toString());
        }
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z;
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (cca_continue2.equals("NONE")) {
            z = false;
        } else if (cca_continue2.equals("DHAES")) {
            z = true;
        } else {
            throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
        }
        this.getSDKVersion = z;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (!cca_continue2.equals("NOPADDING") && !cca_continue2.equals("PKCS5PADDING") && !cca_continue2.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.configure.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.configure.write(bArr, i, i2);
        return null;
    }

    public static class IES extends IESCipher {
        public IES() {
            super(new KeyLengthException(new KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo(), new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()), new BCECGOST3410_2012PrivateKey(new KeyFactorySpi.ECMQV())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new KeyLengthException(new KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo(), new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()), new BCECGOST3410_2012PrivateKey(new KeyFactorySpi.ECMQV()), new KeyAgreementSpi.X25519(new getProgressView(new SignatureSpi.ecDSASha3_224()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new KeyLengthException(new KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo(), new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()), new BCECGOST3410_2012PrivateKey(new KeyFactorySpi.ECMQV()), new KeyAgreementSpi.X25519(new getProgressView(new SignatureSpi.ecDSA384()))), 8);
        }
    }

    public int engineGetBlockSize() {
        if (this.cca_continue.cca_continue != null) {
            return this.cca_continue.cca_continue.Cardinal();
        }
        return 0;
    }

    public byte[] engineGetIV() {
        byte[] bArr;
        XMSSMTKeyFactorySpi xMSSMTKeyFactorySpi = this.getWarnings;
        if (xMSSMTKeyFactorySpi == null || (bArr = xMSSMTKeyFactorySpi.configure) == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int engineGetOutputSize(int i) {
        int size;
        if (this.onValidated != null) {
            int instance = this.cca_continue.Cardinal.getInstance();
            int bitLength = this.values == null ? (((((BCXDHPublicKey) this.onValidated).Cardinal.Cardinal.bitLength() + 7) * 2) / 8) + 1 : 0;
            if (this.cca_continue.cca_continue != null) {
                int i2 = this.getInstance;
                if (i2 == 1 || i2 == 3) {
                    i = this.cca_continue.cca_continue.init(i);
                } else if (i2 == 2 || i2 == 4) {
                    i = this.cca_continue.cca_continue.init((i - instance) - bitLength);
                } else {
                    throw new IllegalStateException("cipher not initialised");
                }
            }
            int i3 = this.getInstance;
            if (i3 == 1 || i3 == 3) {
                size = this.configure.size() + instance + bitLength;
            } else if (i3 == 2 || i3 == 4) {
                size = (this.configure.size() - instance) - bitLength;
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
            return size + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        XMSSMTKeyFactorySpi xMSSMTKeyFactorySpi;
        setCCAImageUri setccaimageuri;
        PrivateKey init2;
        byte[] bArr;
        byte[] bArr2 = null;
        if (algorithmParameterSpec == null) {
            int i2 = this.init;
            if (i2 == 0 || i != 1) {
                bArr = null;
            } else {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            xMSSMTKeyFactorySpi = IESUtil.cca_continue(this.cca_continue.cca_continue, bArr);
        } else if (algorithmParameterSpec instanceof XMSSMTKeyFactorySpi) {
            xMSSMTKeyFactorySpi = (XMSSMTKeyFactorySpi) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        this.getWarnings = xMSSMTKeyFactorySpi;
        byte[] bArr3 = this.getWarnings.configure;
        if (bArr3 != null) {
            bArr2 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        }
        int i3 = this.init;
        if (i3 == 0 || (bArr2 != null && bArr2.length == i3)) {
            if (i == 1 || i == 3) {
                if (key instanceof DHPublicKey) {
                    setccaimageuri = DHUtil.getInstance((PublicKey) key);
                } else if (key instanceof PEMUtil) {
                    PEMUtil pEMUtil = (PEMUtil) key;
                    this.onValidated = DHUtil.getInstance(pEMUtil.getInstance());
                    this.values = DHUtil.cca_continue(pEMUtil.init());
                    this.onCReqSuccess = secureRandom;
                    this.getInstance = i;
                    this.configure.reset();
                    return;
                } else {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
            } else if (i == 2 || i == 4) {
                if (key instanceof DHPrivateKey) {
                    init2 = (PrivateKey) key;
                } else if (key instanceof PEMUtil) {
                    PEMUtil pEMUtil2 = (PEMUtil) key;
                    this.values = DHUtil.getInstance(pEMUtil2.getInstance());
                    init2 = pEMUtil2.init();
                } else {
                    throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
                }
                setccaimageuri = DHUtil.cca_continue(init2);
            } else {
                throw new InvalidKeyException("must be passed EC key");
            }
            this.onValidated = setccaimageuri;
            this.onCReqSuccess = secureRandom;
            this.getInstance = i;
            this.configure.reset();
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder("NONCE in IES Parameters needs to be ").append(this.init).append(" bytes long").toString());
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        if (i2 != 0) {
            this.configure.write(bArr, i, i2);
        }
        byte[] byteArray = this.configure.toByteArray();
        this.configure.reset();
        byte[] bArr5 = this.getWarnings.cca_continue;
        byte[] bArr6 = null;
        if (bArr5 == null) {
            bArr2 = null;
        } else {
            bArr2 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr2, 0, bArr5.length);
        }
        byte[] bArr7 = this.getWarnings.getInstance;
        if (bArr7 == null) {
            bArr3 = null;
        } else {
            bArr3 = new byte[bArr7.length];
            System.arraycopy(bArr7, 0, bArr3, 0, bArr7.length);
        }
        GMCipherSpi.SM2withRMD oaep = new AlgorithmParametersSpi.OAEP(bArr2, bArr3, this.getWarnings.init, this.getWarnings.Cardinal);
        byte[] bArr8 = this.getWarnings.configure;
        if (bArr8 == null) {
            bArr4 = null;
        } else {
            bArr4 = new byte[bArr8.length];
            System.arraycopy(bArr8, 0, bArr4, 0, bArr8.length);
        }
        if (bArr4 != null) {
            byte[] bArr9 = this.getWarnings.configure;
            if (bArr9 != null) {
                bArr6 = new byte[bArr9.length];
                System.arraycopy(bArr9, 0, bArr6, 0, bArr9.length);
            }
            oaep = new DigestSignatureSpi.MD4(oaep, bArr6);
        }
        KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = ((BCXDHPublicKey) this.onValidated).Cardinal;
        setCCAImageUri setccaimageuri = this.values;
        if (setccaimageuri != null) {
            try {
                int i3 = this.getInstance;
                if (i3 != 1) {
                    if (i3 != 3) {
                        KeyLengthException keyLengthException = this.cca_continue;
                        setCCAImageUri setccaimageuri2 = this.onValidated;
                        keyLengthException.getInstance = false;
                        keyLengthException.configure = setccaimageuri2;
                        keyLengthException.init = setccaimageuri;
                        keyLengthException.onCReqSuccess = new byte[0];
                        keyLengthException.getInstance(oaep);
                        return this.cca_continue.init(byteArray, byteArray.length);
                    }
                }
                KeyLengthException keyLengthException2 = this.cca_continue;
                setCCAImageUri setccaimageuri3 = this.onValidated;
                keyLengthException2.getInstance = true;
                keyLengthException2.configure = setccaimageuri;
                keyLengthException2.init = setccaimageuri3;
                keyLengthException2.onCReqSuccess = new byte[0];
                keyLengthException2.getInstance(oaep);
                return this.cca_continue.init(byteArray, byteArray.length);
            } catch (Exception e) {
                throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e);
            }
        } else {
            int i4 = this.getInstance;
            if (i4 == 1 || i4 == 3) {
                SignatureSpi.ecDetDSASha3_256 ecdetdsasha3_256 = new SignatureSpi.ecDetDSASha3_256();
                KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF = new KeyAgreementSpi.X25519UwithSHA256KDF(this.onCReqSuccess, x25519withSHA256CKDF);
                KeyAgreementSpi.X25519UwithSHA256KDF x25519UwithSHA256KDF2 = x25519UwithSHA256KDF;
                ecdetdsasha3_256.configure = x25519UwithSHA256KDF;
                protocolError protocolerror = new protocolError(ecdetdsasha3_256, new IESCipher.ECIES() {
                    public final byte[] init(setCCAImageUri setccaimageuri) {
                        int bitLength = (((BCXDHPublicKey) setccaimageuri).Cardinal.Cardinal.bitLength() + 7) / 8;
                        byte[] bArr = new byte[bitLength];
                        byte[] configure = setCornerRadius.configure(((KeyAgreementSpi.X25519withSHA256KDF) setccaimageuri).init);
                        if (configure.length <= bitLength) {
                            System.arraycopy(configure, 0, bArr, bitLength - configure.length, configure.length);
                            return bArr;
                        }
                        throw new IllegalArgumentException("Senders's public key longer than expected.");
                    }
                });
                try {
                    KeyLengthException keyLengthException3 = this.cca_continue;
                    setCCAImageUri setccaimageuri4 = this.onValidated;
                    keyLengthException3.getInstance = true;
                    keyLengthException3.init = setccaimageuri4;
                    keyLengthException3.getWarnings = protocolerror;
                    keyLengthException3.getInstance(oaep);
                    return this.cca_continue.init(byteArray, byteArray.length);
                } catch (Exception e2) {
                    throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e2);
                }
            } else if (i4 == 2 || i4 == 4) {
                try {
                    KeyLengthException keyLengthException4 = this.cca_continue;
                    setCCAImageUri setccaimageuri5 = this.onValidated;
                    ISOSignatureSpi iSOSignatureSpi = new ISOSignatureSpi(((BCXDHPublicKey) this.onValidated).Cardinal);
                    keyLengthException4.getInstance = false;
                    keyLengthException4.configure = setccaimageuri5;
                    keyLengthException4.cleanup = iSOSignatureSpi;
                    keyLengthException4.getInstance(oaep);
                    return this.cca_continue.init(byteArray, byteArray.length);
                } catch (KeyAgreementSpi.AnonymousClass1 e3) {
                    throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e3);
                }
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
        }
    }
}
