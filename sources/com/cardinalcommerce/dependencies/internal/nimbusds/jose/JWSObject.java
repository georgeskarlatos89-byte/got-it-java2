package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setOnKeyListener;
import com.cardinalcommerce.a.setOnLongClickListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.text.ParseException;

public class JWSObject extends setOnLongClickListener {
    final String Cardinal;
    public final setOnKeyListener configure;
    getInstance getInstance;
    Base64URL init;

    public enum getInstance {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    private JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) throws ParseException {
        this(base64URL, new Payload(base64URL2), base64URL3);
    }

    private JWSObject(Base64URL base64URL, Payload payload, Base64URL base64URL2) throws ParseException {
        String str;
        Base64URL base64URL3;
        Base64URL base64URL4;
        Base64URL base64URL5;
        Base64URL base64URL6;
        if (base64URL != null) {
            try {
                setOnKeyListener Cardinal2 = setOnKeyListener.Cardinal(base64URL);
                this.configure = Cardinal2;
                this.cca_continue = payload;
                if (Cardinal2.Cardinal) {
                    StringBuilder sb = new StringBuilder();
                    if (Cardinal2.cca_continue == null) {
                        base64URL5 = Base64URL.Cardinal(Cardinal2.toString());
                    } else {
                        base64URL5 = Cardinal2.cca_continue;
                    }
                    StringBuilder append = sb.append(base64URL5.toString()).append('.');
                    Payload payload2 = this.cca_continue;
                    if (payload2.getInstance != null) {
                        base64URL6 = payload2.getInstance;
                    } else {
                        base64URL6 = Base64URL.init(payload2.getInstance());
                    }
                    str = append.append(base64URL6.toString()).toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (Cardinal2.cca_continue == null) {
                        base64URL4 = Base64URL.Cardinal(Cardinal2.toString());
                    } else {
                        base64URL4 = Cardinal2.cca_continue;
                    }
                    str = sb2.append(base64URL4.toString()).append('.').append(this.cca_continue.toString()).toString();
                }
                this.Cardinal = str;
                if (base64URL2 != null) {
                    this.init = base64URL2;
                    this.getInstance = getInstance.SIGNED;
                    if (Cardinal2.Cardinal) {
                        Base64URL[] base64URLArr = new Base64URL[3];
                        base64URLArr[0] = base64URL;
                        if (payload.getInstance != null) {
                            base64URL3 = payload.getInstance;
                        } else {
                            base64URL3 = Base64URL.init(payload.getInstance());
                        }
                        base64URLArr[1] = base64URL3;
                        base64URLArr[2] = base64URL2;
                        init(base64URLArr);
                        return;
                    }
                    init(base64URL, new Base64URL(""), base64URL2);
                    return;
                }
                throw new IllegalArgumentException("The third part must not be null");
            } catch (ParseException e) {
                throw new ParseException(new StringBuilder("Invalid JWS header: ").append(e.getMessage()).toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }

    public static JWSObject Cardinal(String str) throws ParseException {
        Base64URL[] instance = setOnLongClickListener.getInstance(str);
        if (instance.length == 3) {
            return new JWSObject(instance[0], instance[1], instance[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public final synchronized boolean getInstance(JWSVerifier jWSVerifier) throws JOSEException {
        boolean cca_continue;
        if (this.getInstance != getInstance.SIGNED) {
            if (this.getInstance != getInstance.VERIFIED) {
                throw new IllegalStateException("The JWS object must be in a signed or verified state");
            }
        }
        try {
            cca_continue = jWSVerifier.cca_continue(this.configure, this.Cardinal.getBytes(setAllowedHandwritingDelegatePackage.configure), this.init);
            if (cca_continue) {
                this.getInstance = getInstance.VERIFIED;
            }
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
        return cca_continue;
    }
}
