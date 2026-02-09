package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemReader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.ConcatKDF;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.ECDH;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.SecretKey;

public final class setAllowClickWhenDisabled {
    private static int Cardinal = 1;
    private static int configure;
    public static final KeyFactory getInstance = new KeyFactory();

    static {
        int i = Cardinal;
        int i2 = i & 79;
        int i3 = i2 - (~((i ^ 79) | i2));
        boolean z = true;
        int i4 = i3 - 1;
        configure = i4 % 128;
        if (i4 % 2 != 0) {
            z = false;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public static KeyPair init() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("P-256");
        KeyPairGenerator instance = KeyPairGenerator.getInstance("ECDH", getInstance);
        instance.initialize(eCGenParameterSpec, new SecureRandom());
        KeyPair generateKeyPair = instance.generateKeyPair();
        int i = Cardinal;
        int i2 = (i & -28) | ((~i) & 27);
        int i3 = -(-((i & 27) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        configure = i4 % 128;
        int i5 = i4 % 2;
        return generateKeyPair;
    }

    public static SecretKey configure(setFitsSystemWindows setfitssystemwindows, KeyPair keyPair, String str) {
        int i = Cardinal;
        int i2 = (i ^ 13) + ((i & 13) << 1);
        configure = i2 % 128;
        int i3 = i2 % 2;
        SecretKey configure2 = configure((PublicKey) Cardinal(setfitssystemwindows, ((ECPublicKey) keyPair.getPublic()).getParams()), keyPair.getPrivate(), str);
        int i4 = Cardinal;
        int i5 = ((i4 | 79) << 1) - (i4 ^ 79);
        configure = i5 % 128;
        if ((i5 % 2 != 0 ? 31 : '0') != 31) {
            return configure2;
        }
        int i6 = 83 / 0;
        return configure2;
    }

    public static SecretKey configure(PublicKey publicKey, PrivateKey privateKey, String str) {
        try {
            Base64URL base64URL = null;
            SecretKey instance = new ConcatKDF("SHA-256").getInstance(ECDH.Cardinal((ECPublicKey) publicKey, privateKey, getInstance), 256, ByteUtils.cca_continue(ConcatKDF.configure((String) null), ConcatKDF.Cardinal((Base64URL) null), ConcatKDF.Cardinal(Base64URL.Cardinal(str)), ConcatKDF.Cardinal(), ConcatKDF.cca_continue()));
            int i = Cardinal;
            int i2 = (i ^ 45) + ((i & 45) << 1);
            configure = i2 % 128;
            int i3 = i2 % 2;
            return instance;
        } catch (Exception e) {
            setWillNotDraw.getInstance().getInstance(new EMVCoError(EMVCoError.KEY_GENERATOR_UTILS_ERROR_CODE, new StringBuilder(EMVCoError.KEY_GENERATOR_UTIL_ECDH_KEY_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString()));
            return null;
        }
    }

    private static ECPublicKey Cardinal(setFitsSystemWindows setfitssystemwindows, ECParameterSpec eCParameterSpec) {
        ECPublicKey eCPublicKey;
        int i = Cardinal;
        int i2 = ((i ^ 29) - (~((i & 29) << 1))) - 1;
        configure = i2 % 128;
        if (i2 % 2 == 0) {
            eCPublicKey = getInstance(setfitssystemwindows, eCParameterSpec, getInstance);
        } else {
            eCPublicKey = getInstance(setfitssystemwindows, eCParameterSpec, getInstance);
            int i3 = 49 / 0;
        }
        int i4 = Cardinal;
        int i5 = i4 & 125;
        int i6 = ((i4 | 125) & (~i5)) + (i5 << 1);
        configure = i6 % 128;
        int i7 = i6 % 2;
        return eCPublicKey;
    }

    private static ECPublicKey getInstance(setFitsSystemWindows setfitssystemwindows, ECParameterSpec eCParameterSpec, Provider provider) {
        ECPublicKey eCPublicKey;
        boolean z = true;
        try {
            eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC", provider).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, setPreferKeepClear.cca_continue(new Base64URL(setfitssystemwindows.init()).cca_continue)), new BigInteger(1, setPreferKeepClear.cca_continue(new Base64URL(setfitssystemwindows.cca_continue()).cca_continue))), eCParameterSpec));
            int i = configure;
            int i2 = ((i | 47) << 1) - (((~i) & 47) | (i & -48));
            Cardinal = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            setWillNotDraw.getInstance().getInstance(new EMVCoError(EMVCoError.KEY_GENERATOR_UTILS_ERROR_CODE, new StringBuilder(EMVCoError.KEY_GENERATOR_UTIL_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString()));
            eCPublicKey = null;
        }
        int i4 = Cardinal;
        int i5 = (i4 & -76) | ((~i4) & 75);
        int i6 = -(-((i4 & 75) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        configure = i7 % 128;
        if (i7 % 2 != 0) {
            z = false;
        }
        if (z) {
            return eCPublicKey;
        }
        throw null;
    }

    public static RSAPublicKey Cardinal(String str) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(new PemReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8"))))).cca_continue().cca_continue));
        int i = Cardinal;
        int i2 = i & 91;
        int i3 = (i | 91) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        configure = i5 % 128;
        if ((i5 % 2 != 0 ? 16 : ')') == ')') {
            return rSAPublicKey;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public static RSAPublicKey cca_continue(String str) throws IOException, CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8"))));
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        int i = configure;
        int i2 = i & 11;
        int i3 = ((i | 11) & (~i2)) + (i2 << 1);
        Cardinal = i3 % 128;
        int i4 = i3 % 2;
        PublicKey publicKey = null;
        Certificate certificate = null;
        while (true) {
            if ((bufferedInputStream.available() > 0 ? ':' : 20) == 20) {
                break;
            }
            int i5 = Cardinal;
            int i6 = i5 & 5;
            int i7 = ((i5 ^ 5) | i6) << 1;
            int i8 = -((i5 | 5) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            configure = i9 % 128;
            int i10 = i9 % 2;
            certificate = instance.generateCertificate(bufferedInputStream);
            int i11 = Cardinal;
            int i12 = (i11 ^ 124) + ((i11 & 124) << 1);
            int i13 = (i12 ^ -1) + ((i12 & -1) << 1);
            configure = i13 % 128;
            int i14 = i13 % 2;
        }
        if ((certificate != null ? 18 : '*') != '*') {
            int i15 = Cardinal;
            int i16 = ((i15 & -114) | ((~i15) & 113)) + ((i15 & 113) << 1);
            configure = i16 % 128;
            int i17 = i16 % 2;
            publicKey = certificate.getPublicKey();
            int i18 = configure;
            int i19 = ((i18 | 4) << 1) - (i18 ^ 4);
            int i20 = (i19 & -1) + (i19 | -1);
            Cardinal = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = configure;
            int i23 = i22 & 89;
            int i24 = ((i22 ^ 89) | i23) << 1;
            int i25 = -((i22 | 89) & (~i23));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            Cardinal = i26 % 128;
            int i27 = i26 % 2;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        int i28 = Cardinal;
        int i29 = i28 & 57;
        int i30 = i29 + ((i28 ^ 57) | i29);
        configure = i30 % 128;
        if ((i30 % 2 != 0 ? 'A' : 10) != 'A') {
            return rSAPublicKey;
        }
        int i31 = 27 / 0;
        return rSAPublicKey;
    }

    public static ECPublicKey init(String str) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(new PemReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8"))))).cca_continue().cca_continue));
        int i = Cardinal;
        int i2 = (i & 81) + (i | 81);
        configure = i2 % 128;
        int i3 = i2 % 2;
        return eCPublicKey;
    }
}
