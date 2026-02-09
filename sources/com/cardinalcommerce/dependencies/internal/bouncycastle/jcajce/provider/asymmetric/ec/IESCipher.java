package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.AlgorithmParametersSpi;
import com.cardinalcommerce.a.BCECGOST3410_2012PrivateKey;
import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DSAEncoder;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyLengthException;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.XMSSMTKeyFactorySpi;
import com.cardinalcommerce.a.getProgressView;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.protocolError;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
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

public class IESCipher extends CipherSpi {
    private int Cardinal = -1;
    private setCCAImageUri CardinalRenderType = null;
    private final BaseCipherSpi.ErasableOutputStream cca_continue = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private boolean cleanup = false;
    private int configure;
    private ByteArrayOutputStream getInstance = new ByteArrayOutputStream();
    private setCCAImageUri getSDKVersion;
    private XMSSMTKeyFactorySpi getWarnings = null;
    private KeyLengthException init;
    private AlgorithmParameters onCReqSuccess = null;
    private SecureRandom onValidated;

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new getProgressView(new SignatureSpi.ecDSASha3_224()), 16);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new getProgressView(new SignatureSpi.ecDSA384()), 8);
        }
    }

    public IESCipher(KeyLengthException keyLengthException) {
        this.init = keyLengthException;
        this.configure = 0;
    }

    public IESCipher(KeyLengthException keyLengthException, int i) {
        this.init = keyLengthException;
        this.configure = i;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.onCReqSuccess == null && this.getWarnings != null) {
            try {
                AlgorithmParameters cca_continue2 = this.cca_continue.cca_continue("IES");
                this.onCReqSuccess = cca_continue2;
                cca_continue2.init(this.getWarnings);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.onCReqSuccess;
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
        this.onCReqSuccess = algorithmParameters;
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
        this.cleanup = z;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (!cca_continue2.equals("NOPADDING") && !cca_continue2.equals("PKCS5PADDING") && !cca_continue2.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.getInstance.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.getInstance.write(bArr, i, i2);
        return null;
    }

    public static class ECIES extends IESCipher {
        public ECIES() {
            super(new KeyLengthException(new KeyAgreementSpi.DHUC(), new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()), new BCECGOST3410_2012PrivateKey(new KeyFactorySpi.ECMQV())));
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(GMCipherSpi.SM2withSha256 sM2withSha256, int i) {
            super(new KeyLengthException(new KeyAgreementSpi.DHUC(), new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()), new BCECGOST3410_2012PrivateKey(new KeyFactorySpi.ECMQV()), new KeyAgreementSpi.X25519(sM2withSha256)), i);
        }
    }

    public int engineGetBlockSize() {
        if (this.init.cca_continue != null) {
            return this.init.cca_continue.Cardinal();
        }
        return 0;
    }

    public int engineGetKeySize(Key key) {
        if (key instanceof DSAEncoder) {
            return ((DSAEncoder) key).configure().cca_continue.getInstance();
        }
        throw new IllegalArgumentException("not an EC key");
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
        if (this.getSDKVersion != null) {
            int instance = this.init.Cardinal.getInstance();
            int instance2 = this.CardinalRenderType == null ? ((((KeyPairGeneratorSpi.Ed448) this.getSDKVersion).Cardinal.cca_continue.getInstance() + 7) / 8) * 2 : 0;
            if (this.init.cca_continue != null) {
                int i2 = this.Cardinal;
                if (i2 == 1 || i2 == 3) {
                    i = this.init.cca_continue.init(i);
                } else if (i2 == 2 || i2 == 4) {
                    i = this.init.cca_continue.init((i - instance) - instance2);
                } else {
                    throw new IllegalStateException("cipher not initialised");
                }
            }
            int i3 = this.Cardinal;
            if (i3 == 1 || i3 == 3) {
                size = this.getInstance.size() + instance + 1 + instance2;
            } else if (i3 == 2 || i3 == 4) {
                size = (this.getInstance.size() - instance) - instance2;
            } else {
                throw new IllegalStateException("cipher not initialised");
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
        this.CardinalRenderType = null;
        if (algorithmParameterSpec == null) {
            int i2 = this.configure;
            if (i2 == 0 || i != 1) {
                bArr = null;
            } else {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            xMSSMTKeyFactorySpi = IESUtil.cca_continue(this.init.cca_continue, bArr);
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
        int i3 = this.configure;
        if (i3 == 0 || (bArr2 != null && bArr2.length == i3)) {
            if (i == 1 || i == 3) {
                if (key instanceof PublicKey) {
                    setccaimageuri = ECUtils.cca_continue((PublicKey) key);
                } else if (key instanceof PEMUtil) {
                    PEMUtil pEMUtil = (PEMUtil) key;
                    this.getSDKVersion = ECUtils.cca_continue(pEMUtil.getInstance());
                    this.CardinalRenderType = ECUtil.Cardinal(pEMUtil.init());
                    this.onValidated = secureRandom;
                    this.Cardinal = i;
                    this.getInstance.reset();
                    return;
                } else {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
            } else if (i == 2 || i == 4) {
                if (key instanceof PrivateKey) {
                    init2 = (PrivateKey) key;
                } else if (key instanceof PEMUtil) {
                    PEMUtil pEMUtil2 = (PEMUtil) key;
                    this.CardinalRenderType = ECUtils.cca_continue(pEMUtil2.getInstance());
                    init2 = pEMUtil2.init();
                } else {
                    throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
                }
                setccaimageuri = ECUtil.Cardinal(init2);
            } else {
                throw new InvalidKeyException("must be passed EC key");
            }
            this.getSDKVersion = setccaimageuri;
            this.onValidated = secureRandom;
            this.Cardinal = i;
            this.getInstance.reset();
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder("NONCE in IES Parameters needs to be ").append(this.configure).append(" bytes long").toString());
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        if (i2 != 0) {
            this.getInstance.write(bArr, i, i2);
        }
        byte[] byteArray = this.getInstance.toByteArray();
        this.getInstance.reset();
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
        KeyFactorySpi.EDDSA eddsa = ((KeyPairGeneratorSpi.Ed448) this.getSDKVersion).Cardinal;
        setCCAImageUri setccaimageuri = this.CardinalRenderType;
        if (setccaimageuri != null) {
            try {
                int i3 = this.Cardinal;
                if (i3 != 1) {
                    if (i3 != 3) {
                        KeyLengthException keyLengthException = this.init;
                        setCCAImageUri setccaimageuri2 = this.getSDKVersion;
                        keyLengthException.getInstance = false;
                        keyLengthException.configure = setccaimageuri2;
                        keyLengthException.init = setccaimageuri;
                        keyLengthException.onCReqSuccess = new byte[0];
                        keyLengthException.getInstance(oaep);
                        return this.init.init(byteArray, byteArray.length);
                    }
                }
                KeyLengthException keyLengthException2 = this.init;
                setCCAImageUri setccaimageuri3 = this.getSDKVersion;
                keyLengthException2.getInstance = true;
                keyLengthException2.configure = setccaimageuri;
                keyLengthException2.init = setccaimageuri3;
                keyLengthException2.onCReqSuccess = new byte[0];
                keyLengthException2.getInstance(oaep);
                return this.init.init(byteArray, byteArray.length);
            } catch (Exception e) {
                throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e);
            }
        } else {
            int i4 = this.Cardinal;
            if (i4 == 1 || i4 == 3) {
                SignatureSpi.ecNR224 ecnr224 = new SignatureSpi.ecNR224();
                ecnr224.getInstance(new KeyPairGeneratorSpi.Ed25519(eddsa, this.onValidated));
                boolean z = this.getWarnings.cleanup;
                protocolError protocolerror = new protocolError(ecnr224, new IESCipher.ECIES(false) {
                    public final byte[] init(setCCAImageUri setccaimageuri) {
                        return ((KeyPairGeneratorSpi.XDH) setccaimageuri).configure.Cardinal(false);
                    }
                });
                try {
                    KeyLengthException keyLengthException3 = this.init;
                    setCCAImageUri setccaimageuri4 = this.getSDKVersion;
                    keyLengthException3.getInstance = true;
                    keyLengthException3.init = setccaimageuri4;
                    keyLengthException3.getWarnings = protocolerror;
                    keyLengthException3.getInstance(oaep);
                    return this.init.init(byteArray, byteArray.length);
                } catch (Exception e2) {
                    throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e2);
                }
            } else if (i4 == 2 || i4 == 4) {
                try {
                    KeyLengthException keyLengthException4 = this.init;
                    setCCAImageUri setccaimageuri5 = this.getSDKVersion;
                    DigestSignatureSpi.SHA512_256 sha512_256 = new DigestSignatureSpi.SHA512_256(eddsa);
                    keyLengthException4.getInstance = false;
                    keyLengthException4.configure = setccaimageuri5;
                    keyLengthException4.cleanup = sha512_256;
                    keyLengthException4.getInstance(oaep);
                    return this.init.init(byteArray, byteArray.length);
                } catch (KeyAgreementSpi.AnonymousClass1 e3) {
                    throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e3);
                }
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
        }
    }
}
