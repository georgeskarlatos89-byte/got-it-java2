package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.DirectEncrypter;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.RSAEncrypter;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.ECKey;
import com.cardinalcommerce.dependencies.internal.nimbusds.jwt.EncryptedJWT;
import com.cardinalcommerce.dependencies.internal.nimbusds.jwt.JWTClaimsSet;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import javax.crypto.SecretKey;

public final class setWillNotCacheDrawing {
    private static int cca_continue = 0;
    private static int configure = 1;
    private setFilterTouchesWhenObscured Cardinal;
    private setPressed getInstance;
    private String init;

    public setWillNotCacheDrawing() {
    }

    public static String init(Context context, String str, String str2) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException, ParseException, JOSEException, InvalidAlgorithmParameterException, CertificateException {
        setWillNotCacheDrawing instance = new setHapticFeedbackEnabled(context).getInstance(str2);
        boolean z = false;
        if (instance.getInstance() == setFilterTouchesWhenObscured.RSA) {
            int i = cca_continue;
            int i2 = i & 9;
            int i3 = ((i | 9) & (~i2)) + (i2 << 1);
            configure = i3 % 128;
            int i4 = i3 % 2;
            if (instance.cca_continue() != setPressed.KEY) {
                z = true;
            }
            if (!z) {
                int i5 = cca_continue + 125;
                configure = i5 % 128;
                int i6 = i5 % 2;
                String instance2 = getInstance(str, setAllowClickWhenDisabled.Cardinal(instance.Cardinal()));
                int i7 = configure;
                int i8 = (i7 ^ 115) + ((i7 & 115) << 1);
                cca_continue = i8 % 128;
                int i9 = i8 % 2;
                return instance2;
            }
            String instance3 = getInstance(str, setAllowClickWhenDisabled.cca_continue(instance.Cardinal()));
            int i10 = cca_continue;
            int i11 = i10 & 95;
            int i12 = ((i10 ^ 95) | i11) << 1;
            int i13 = -((i10 | 95) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            configure = i14 % 128;
            int i15 = i14 % 2;
            return instance3;
        }
        String configure2 = configure(str, setAllowClickWhenDisabled.init(instance.Cardinal()), str2);
        int i16 = configure;
        int i17 = (i16 ^ 67) + ((i16 & 67) << 1);
        cca_continue = i17 % 128;
        int i18 = i17 % 2;
        return configure2;
    }

    private static String getInstance(String str, RSAPublicKey rSAPublicKey) throws ParseException, JOSEException {
        EncryptedJWT encryptedJWT = new EncryptedJWT(new JWEHeader(JWEAlgorithm.getInstance, EncryptionMethod.init), JWTClaimsSet.Cardinal(str));
        encryptedJWT.getInstance(new RSAEncrypter(rSAPublicKey));
        String cca_continue2 = encryptedJWT.cca_continue();
        int i = cca_continue;
        int i2 = i & 17;
        int i3 = (((i ^ 17) | i2) << 1) - ((i | 17) & (~i2));
        configure = i3 % 128;
        int i4 = i3 % 2;
        return cca_continue2;
    }

    private static String configure(String str, ECPublicKey eCPublicKey, String str2) throws ParseException, JOSEException, InvalidAlgorithmParameterException, NoSuchAlgorithmException {
        KeyPair init2 = setAllowClickWhenDisabled.init();
        SecretKey configure2 = setAllowClickWhenDisabled.configure((PublicKey) eCPublicKey, init2.getPrivate(), str2);
        ECKey cca_continue2 = new ECKey.getInstance(Curve.getInstance, (ECPublicKey) init2.getPublic()).cca_continue();
        JWEHeader.getInstance getinstance = new JWEHeader.getInstance(JWEAlgorithm.getWarnings, EncryptionMethod.init);
        getinstance.valueOf = ECKey.init(cca_continue2.toJSONString());
        JWEObject jWEObject = new JWEObject(getinstance.configure(), new Payload(str));
        if (configure2 != null) {
            jWEObject.getInstance(new DirectEncrypter(configure2));
            String cca_continue3 = jWEObject.cca_continue();
            int i = configure;
            int i2 = ((i ^ 29) | (i & 29)) << 1;
            int i3 = -(((~i) & 29) | (i & -30));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            cca_continue = i4 % 128;
            int i5 = i4 % 2;
            return cca_continue3;
        }
        throw new ParseException("Null secretKey Exception", 0);
    }

    public setWillNotCacheDrawing(String str, setFilterTouchesWhenObscured setfiltertoucheswhenobscured, setPressed setpressed) {
        this.Cardinal = setfiltertoucheswhenobscured;
        if (setpressed == setPressed.KEY) {
            this.init = new StringBuilder("-----BEGIN PUBLIC KEY-----\n").append(str).append("\n-----END PUBLIC KEY-----").toString();
        } else {
            this.init = new StringBuilder("-----BEGIN CERTIFICATE-----\n").append(str).append("\n-----END CERTIFICATE-----").toString();
        }
        this.getInstance = setpressed;
    }

    private String Cardinal() {
        int i = cca_continue;
        int i2 = ((i | 13) << 1) - (i ^ 13);
        configure = i2 % 128;
        int i3 = i2 % 2;
        String str = this.init;
        int i4 = ((i & 12) + (i | 12)) - 1;
        configure = i4 % 128;
        if ((i4 % 2 == 0 ? 'a' : 9) == 9) {
            return str;
        }
        throw null;
    }

    private setFilterTouchesWhenObscured getInstance() {
        setFilterTouchesWhenObscured setfiltertoucheswhenobscured;
        int i = cca_continue;
        int i2 = (i & 116) + (i | 116);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        configure = i3 % 128;
        if ((i3 % 2 == 0 ? '3' : 'B') != '3') {
            setfiltertoucheswhenobscured = this.Cardinal;
        } else {
            setfiltertoucheswhenobscured = this.Cardinal;
            int i4 = 48 / 0;
        }
        int i5 = i & 109;
        int i6 = i5 + ((i ^ 109) | i5);
        configure = i6 % 128;
        int i7 = i6 % 2;
        return setfiltertoucheswhenobscured;
    }

    private setPressed cca_continue() {
        int i = configure;
        int i2 = i & 17;
        int i3 = ((((i ^ 17) | i2) << 1) - (~(-((i | 17) & (~i2))))) - 1;
        cca_continue = i3 % 128;
        if (i3 % 2 == 0) {
            return this.getInstance;
        }
        int i4 = 27 / 0;
        return this.getInstance;
    }
}
