package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setOnCreateContextMenuListener;
import com.cardinalcommerce.a.setOnHoverListener;
import com.cardinalcommerce.a.setOnLongClickListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.text.ParseException;

public class JWEObject extends setOnLongClickListener {
    private Base64URL Cardinal;
    private Base64URL cleanup;
    private JWEHeader configure;
    private Base64URL getInstance;
    private cca_continue getWarnings;
    private Base64URL init;

    public enum cca_continue {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        if (jWEHeader != null) {
            this.configure = jWEHeader;
            this.cca_continue = payload;
            this.getInstance = null;
            this.init = null;
            this.getWarnings = cca_continue.UNENCRYPTED;
            return;
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    private JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) throws ParseException {
        if (base64URL != null) {
            try {
                this.configure = JWEHeader.Cardinal(base64URL);
                if (base64URL2 == null || base64URL2.toString().isEmpty()) {
                    this.getInstance = null;
                } else {
                    this.getInstance = base64URL2;
                }
                if (base64URL3 == null || base64URL3.toString().isEmpty()) {
                    this.Cardinal = null;
                } else {
                    this.Cardinal = base64URL3;
                }
                if (base64URL4 != null) {
                    this.init = base64URL4;
                    if (base64URL5 == null || base64URL5.toString().isEmpty()) {
                        this.cleanup = null;
                    } else {
                        this.cleanup = base64URL5;
                    }
                    this.getWarnings = cca_continue.ENCRYPTED;
                    init(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e) {
                throw new ParseException(new StringBuilder("Invalid JWE header: ").append(e.getMessage()).toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }

    public static JWEObject cca_continue(String str) throws ParseException {
        Base64URL[] instance = setOnLongClickListener.getInstance(str);
        if (instance.length == 5) {
            return new JWEObject(instance[0], instance[1], instance[2], instance[3], instance[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public final synchronized void getInstance(setOnHoverListener setonhoverlistener) throws JOSEException {
        if (this.getWarnings != cca_continue.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        } else if (!setonhoverlistener.Cardinal().contains(this.configure.init())) {
            throw new JOSEException(new StringBuilder("The \"").append(this.configure.init()).append("\" algorithm is not supported by the JWE encrypter: Supported algorithms: ").append(setonhoverlistener.Cardinal()).toString());
        } else if (setonhoverlistener.cca_continue().contains(this.configure.Cardinal)) {
            try {
                JWECryptoParts instance = setonhoverlistener.getInstance(this.configure, this.cca_continue.getInstance());
                if (instance.getInstance != null) {
                    this.configure = instance.getInstance;
                }
                this.getInstance = instance.Cardinal;
                this.Cardinal = instance.configure;
                this.init = instance.cca_continue;
                this.cleanup = instance.init;
                this.getWarnings = cca_continue.ENCRYPTED;
            } catch (JOSEException e) {
                throw e;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new JOSEException(new StringBuilder("The \"").append(this.configure.Cardinal).append("\" encryption method or key size is not supported by the JWE encrypter: Supported methods: ").append(setonhoverlistener.cca_continue()).toString());
        }
    }

    public final synchronized void configure(setOnCreateContextMenuListener setoncreatecontextmenulistener) throws JOSEException {
        if (this.getWarnings == cca_continue.ENCRYPTED) {
            try {
                this.cca_continue = new Payload(setoncreatecontextmenulistener.Cardinal(this.configure, this.getInstance, this.Cardinal, this.init, this.cleanup));
                this.getWarnings = cca_continue.DECRYPTED;
            } catch (JOSEException e) {
                throw e;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    public final String cca_continue() {
        Base64URL base64URL;
        if (this.getWarnings == cca_continue.ENCRYPTED || this.getWarnings == cca_continue.DECRYPTED) {
            JWEHeader jWEHeader = this.configure;
            if (jWEHeader.cca_continue == null) {
                base64URL = Base64URL.Cardinal(jWEHeader.toString());
            } else {
                base64URL = jWEHeader.cca_continue;
            }
            StringBuilder sb = new StringBuilder(base64URL.toString());
            sb.append('.');
            Base64URL base64URL2 = this.getInstance;
            if (base64URL2 != null) {
                sb.append(base64URL2.toString());
            }
            sb.append('.');
            Base64URL base64URL3 = this.Cardinal;
            if (base64URL3 != null) {
                sb.append(base64URL3.toString());
            }
            sb.append('.');
            sb.append(this.init.toString());
            sb.append('.');
            Base64URL base64URL4 = this.cleanup;
            if (base64URL4 != null) {
                sb.append(base64URL4.toString());
            }
            return sb.toString();
        }
        throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
    }
}
