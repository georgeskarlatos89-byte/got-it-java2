package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class BaseCipherSpi extends CipherSpi {
    private final BaseCipherSpi.ErasableOutputStream Cardinal = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private Class[] cca_continue = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private AlgorithmParameters configure = null;
    private KeyAgreementSpi.DHC getInstance = null;

    /* access modifiers changed from: protected */
    public int engineGetBlockSize() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetIV() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    /* access modifiers changed from: protected */
    public int engineGetOutputSize(int i) {
        return -1;
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: protected */
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder("Padding ").append(str).append(" unknown.").toString());
    }

    /* access modifiers changed from: protected */
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                KeyAgreementSpi.DHC dhc = this.getInstance;
                if (dhc == null) {
                    return engineDoFinal(encoded, 0, encoded.length);
                }
                int length = encoded.length;
                return dhc.Cardinal();
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }

    /* access modifiers changed from: protected */
    public final AlgorithmParameters getInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.Cardinal.cca_continue(str);
    }

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public final byte[] getInstance() {
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

    /* access modifiers changed from: protected */
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        byte[] bArr2;
        try {
            KeyAgreementSpi.DHC dhc = this.getInstance;
            if (dhc == null) {
                bArr2 = engineDoFinal(bArr, 0, bArr.length);
            } else {
                int length = bArr.length;
                bArr2 = dhc.getInstance();
            }
            if (i == 3) {
                return new SecretKeySpec(bArr2, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory instance = this.Cardinal.getInstance(str);
                    if (i == 1) {
                        return instance.generatePublic(new X509EncodedKeySpec(bArr2));
                    }
                    if (i == 2) {
                        return instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                    }
                    throw new InvalidKeyException("Unknown key type ".concat(String.valueOf(i)));
                } catch (NoSuchAlgorithmException e) {
                    throw new InvalidKeyException(new StringBuilder("Unknown key type ").append(e.getMessage()).toString());
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(new StringBuilder("Unknown key type ").append(e2.getMessage()).toString());
                } catch (NoSuchProviderException e3) {
                    throw new InvalidKeyException(new StringBuilder("Unknown key type ").append(e3.getMessage()).toString());
                }
            } else {
                try {
                    PrivateKeyInfo cca_continue2 = PrivateKeyInfo.cca_continue(bArr2);
                    PrivateKey Cardinal2 = com.cardinalcommerce.a.KeyFactory.Cardinal(cca_continue2);
                    if (Cardinal2 != null) {
                        return Cardinal2;
                    }
                    throw new InvalidKeyException(new StringBuilder("algorithm ").append(cca_continue2.cca_continue.cca_continue).append(" not supported").toString());
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (KeyAgreementSpi.AnonymousClass1 e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (BadPaddingException e5) {
            throw new InvalidKeyException("unable to unwrap") {
                public synchronized Throwable getCause() {
                    return e5;
                }
            };
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
    }
}
