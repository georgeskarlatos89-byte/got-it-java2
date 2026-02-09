package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DSAEncoder;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
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

public class GMCipherSpi extends CipherSpi {
    private ErasableOutputStream Cardinal = new ErasableOutputStream();
    private SignatureSpi.ecDetDSA cca_continue;
    private setCCAImageUri configure;
    private final BaseCipherSpi.ErasableOutputStream getInstance = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private SecureRandom getSDKVersion;
    private int init = -1;

    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new SignatureSpi.ecDetDSA());
        }
    }

    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new SignatureSpi.ecDetDSA(new KeyAgreementSpi.ECKAEGwithSHA512KDF((byte) 0)));
        }
    }

    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new SignatureSpi.ecDetDSA(new KeyAgreementSpi.MQV((byte) 0)));
        }
    }

    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new SignatureSpi.ecDetDSA(new KeyFactorySpi.ECDH()));
        }
    }

    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new SignatureSpi.ecDetDSA(new KeyFactorySpi.ECGOST3410_2012()));
        }
    }

    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new SignatureSpi.ecDetDSA(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new SignatureSpi.ecDetDSA(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new SignatureSpi.ecDetDSA(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new SignatureSpi.ecDetDSA(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new SignatureSpi.ecDetDSA(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new SignatureSpi.ecDetDSA(new SignatureSpi.ecDSA256()));
        }
    }

    public GMCipherSpi(SignatureSpi.ecDetDSA ecdetdsa) {
        this.cca_continue = ecdetdsa;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] Cardinal2;
        if (i2 != 0) {
            this.Cardinal.write(bArr, i, i2);
        }
        try {
            int i3 = this.init;
            if (i3 == 1 || i3 == 3) {
                this.cca_continue.Cardinal(true, (GMCipherSpi.SM2withRMD) new DigestSignatureSpi.RIPEMD128(this.configure, this.getSDKVersion));
                Cardinal2 = this.cca_continue.Cardinal(this.Cardinal.cca_continue(), this.Cardinal.size());
            } else if (i3 == 2 || i3 == 4) {
                this.cca_continue.Cardinal(false, (GMCipherSpi.SM2withRMD) this.configure);
                Cardinal2 = this.cca_continue.Cardinal(this.Cardinal.cca_continue(), this.Cardinal.size());
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
            this.Cardinal.init();
            return Cardinal2;
        } catch (Exception e) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e);
        } catch (Exception e2) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to process block", e2);
        } catch (Throwable th) {
            this.Cardinal.init();
            throw th;
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return null;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder("cannot recognise parameters: ").append(algorithmParameters.getClass().getName()).toString());
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            AlgorithmParameterSpec algorithmParameterSpec = null;
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(new StringBuilder("cannot handle supplied parameter spec: ").append(e.getMessage()).toString());
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        setCCAImageUri setccaimageuri;
        if (i == 1 || i == 3) {
            if (key instanceof PublicKey) {
                setccaimageuri = ECUtils.cca_continue((PublicKey) key);
            } else {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
        } else if (i != 2 && i != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else if (key instanceof PrivateKey) {
            setccaimageuri = ECUtil.Cardinal((PrivateKey) key);
        } else {
            throw new InvalidKeyException("must be passed private EC key for decryption");
        }
        this.configure = setccaimageuri;
        if (secureRandom != null) {
            this.getSDKVersion = secureRandom;
        } else {
            this.getSDKVersion = GMCipherSpi.SM2withWhirlpool.configure();
        }
        this.init = i;
        this.Cardinal.reset();
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!getTextFontSize.cca_continue(str).equals("NONE")) {
            throw new IllegalArgumentException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!getTextFontSize.cca_continue(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.Cardinal.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.Cardinal.write(bArr, i, i2);
        return null;
    }

    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        public final byte[] cca_continue() {
            return this.buf;
        }

        public final void init() {
            byte[] bArr = this.buf;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
            reset();
        }
    }

    public int engineGetKeySize(Key key) {
        if (key instanceof DSAEncoder) {
            return ((DSAEncoder) key).configure().cca_continue.getInstance();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    public int engineGetOutputSize(int i) {
        int i2;
        int instance;
        int i3 = this.init;
        if (i3 == 1 || i3 == 3) {
            SignatureSpi.ecDetDSA ecdetdsa = this.cca_continue;
            i2 = (ecdetdsa.init * 2) + 1 + i;
            instance = ecdetdsa.getInstance.getInstance();
        } else if (i3 == 2 || i3 == 4) {
            SignatureSpi.ecDetDSA ecdetdsa2 = this.cca_continue;
            i2 = (ecdetdsa2.init * 2) + 1 + i;
            instance = ecdetdsa2.getInstance.getInstance();
        } else {
            throw new IllegalStateException("cipher not initialised");
        }
        return i2 + instance;
    }
}
