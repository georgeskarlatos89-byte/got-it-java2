package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setKeepScreenOn;
import com.cardinalcommerce.a.setNextClusterForwardId;
import com.cardinalcommerce.a.setNextFocusDownId;
import com.cardinalcommerce.a.setNextFocusRightId;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;
import com.cardinalcommerce.a.setWindowInsetsAnimationCallback;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ECKey extends JWK {
    private static Set<Curve> Cardinal = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.getInstance, Curve.configure, Curve.cca_continue, Curve.init})));
    private final Curve cca_continue;
    private final PrivateKey cleanup;
    private final Base64URL configure;
    private final Base64URL getInstance;
    private final Base64URL init;

    public static class getInstance {
        private Base64URL Cardinal;
        private Base64URL CardinalEnvironment;
        private KeyStore CardinalError;
        private List<Base64> CardinalRenderType;
        private final Curve cca_continue;
        private Set<setNextFocusRightId> cleanup;
        private PrivateKey configure;
        private final Base64URL getInstance;
        private String getSDKVersion;
        private setWindowInsetsAnimationCallback getWarnings;
        private final Base64URL init;
        private URI onCReqSuccess;
        private setVerticalScrollbarTrackDrawable onValidated;
        @Deprecated
        private Base64URL valueOf;

        private getInstance(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
            if (curve != null) {
                this.cca_continue = curve;
                if (base64URL != null) {
                    this.getInstance = base64URL;
                    if (base64URL2 != null) {
                        this.init = base64URL2;
                        return;
                    }
                    throw new IllegalArgumentException("The 'y' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            throw new IllegalArgumentException("The curve must not be null");
        }

        public getInstance(Curve curve, ECPublicKey eCPublicKey) {
            this(curve, ECKey.cca_continue(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), ECKey.cca_continue(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }

        public final ECKey cca_continue() {
            try {
                if (this.Cardinal == null && this.configure == null) {
                    return new ECKey(this.cca_continue, this.getInstance, this.init, this.getWarnings, this.cleanup, this.onValidated, this.getSDKVersion, this.onCReqSuccess, this.valueOf, this.CardinalEnvironment, this.CardinalRenderType, this.CardinalError);
                }
                if (this.configure != null) {
                    return new ECKey(this.cca_continue, this.getInstance, this.init, this.configure, this.getWarnings, this.cleanup, this.onValidated, this.getSDKVersion, this.onCReqSuccess, this.valueOf, this.CardinalEnvironment, this.CardinalRenderType, this.CardinalError);
                }
                return new ECKey(this.cca_continue, this.getInstance, this.init, this.Cardinal, this.getWarnings, this.cleanup, this.onValidated, this.getSDKVersion, this.onCReqSuccess, this.valueOf, this.CardinalEnvironment, this.CardinalRenderType, this.CardinalError);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }
    }

    private static void init(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!Cardinal.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: ".concat(String.valueOf(curve)));
        } else if (!setAccessibilityPaneTitle.configure(new BigInteger(1, setPreferKeepClear.cca_continue(base64URL.cca_continue)), new BigInteger(1, setPreferKeepClear.cca_continue(base64URL2.cca_continue)), setNextFocusDownId.cca_continue(curve))) {
            throw new IllegalArgumentException(new StringBuilder("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the ").append(curve).append(" curve").toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.configure, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 != null) {
            this.cca_continue = curve2;
            if (base64URL5 != null) {
                this.configure = base64URL5;
                if (base64URL6 != null) {
                    this.getInstance = base64URL6;
                    init(curve, base64URL, base64URL2);
                    configure(init());
                    this.init = null;
                    this.cleanup = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.configure, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL4, base64URL5, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL6 = base64URL;
        Base64URL base64URL7 = base64URL2;
        Base64URL base64URL8 = base64URL3;
        if (curve2 != null) {
            this.cca_continue = curve2;
            if (base64URL6 != null) {
                this.configure = base64URL6;
                if (base64URL7 != null) {
                    this.getInstance = base64URL7;
                    init(curve, base64URL, base64URL2);
                    configure(init());
                    if (base64URL8 != null) {
                        this.init = base64URL8;
                        this.cleanup = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.configure, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 != null) {
            this.cca_continue = curve2;
            if (base64URL5 != null) {
                this.configure = base64URL5;
                if (base64URL6 != null) {
                    this.getInstance = base64URL6;
                    init(curve, base64URL, base64URL2);
                    configure(init());
                    this.init = null;
                    this.cleanup = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    private boolean Cardinal() {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) init().get(0).getPublicKey();
            if (new BigInteger(1, setPreferKeepClear.cca_continue(this.configure.cca_continue)).equals(eCPublicKey.getW().getAffineX()) && new BigInteger(1, setPreferKeepClear.cca_continue(this.getInstance.cca_continue)).equals(eCPublicKey.getW().getAffineY())) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    private void configure(List<X509Certificate> list) {
        if (list != null) {
            X509Certificate x509Certificate = list.get(0);
            if (!Cardinal()) {
                throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
            }
        }
    }

    public final boolean getInstance() {
        return (this.init == null && this.cleanup == null) ? false : true;
    }

    public final JSONObject cca_continue() {
        JSONObject cca_continue2 = super.cca_continue();
        cca_continue2.put("crv", this.cca_continue.toString());
        cca_continue2.put("x", this.configure.toString());
        cca_continue2.put("y", this.getInstance.toString());
        Base64URL base64URL = this.init;
        if (base64URL != null) {
            cca_continue2.put("d", base64URL.toString());
        }
        return cca_continue2;
    }

    public static ECKey init(String str) throws ParseException {
        return getInstance(setAccessibilityPaneTitle.getInstance(str));
    }

    public static ECKey getInstance(JSONObject jSONObject) throws ParseException {
        Base64URL base64URL;
        Base64URL base64URL2;
        Base64URL base64URL3;
        List list;
        Base64URL base64URL4;
        List list2;
        Base64URL base64URL5;
        JSONObject jSONObject2 = jSONObject;
        if (setNextClusterForwardId.configure.equals(setKeepScreenOn.configure(jSONObject))) {
            try {
                Curve configure2 = Curve.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "crv", String.class));
                String str = (String) setAccessibilityPaneTitle.init(jSONObject2, "x", String.class);
                Base64URL base64URL6 = null;
                if (str == null) {
                    base64URL = null;
                } else {
                    base64URL = new Base64URL(str);
                }
                String str2 = (String) setAccessibilityPaneTitle.init(jSONObject2, "y", String.class);
                if (str2 == null) {
                    base64URL2 = null;
                } else {
                    base64URL2 = new Base64URL(str2);
                }
                String str3 = (String) setAccessibilityPaneTitle.init(jSONObject2, "d", String.class);
                if (str3 == null) {
                    base64URL3 = null;
                } else {
                    base64URL3 = new Base64URL(str3);
                }
                if (base64URL3 == null) {
                    try {
                        setWindowInsetsAnimationCallback instance = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject2, "use", String.class));
                        String[] configure3 = setAccessibilityPaneTitle.configure(jSONObject2, "key_ops");
                        if (configure3 == null) {
                            list2 = null;
                        } else {
                            list2 = Arrays.asList(configure3);
                        }
                        Set<setNextFocusRightId> instance2 = setNextFocusRightId.getInstance(list2);
                        setVerticalScrollbarTrackDrawable configure4 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "alg", String.class));
                        String str4 = (String) setAccessibilityPaneTitle.init(jSONObject2, "kid", String.class);
                        URI instance3 = setAccessibilityPaneTitle.getInstance(jSONObject2, "x5u");
                        String str5 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t", String.class);
                        if (str5 == null) {
                            base64URL5 = null;
                        } else {
                            base64URL5 = new Base64URL(str5);
                        }
                        String str6 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t#S256", String.class);
                        if (str6 != null) {
                            base64URL6 = new Base64URL(str6);
                        }
                        return new ECKey(configure2, base64URL, base64URL2, instance, instance2, configure4, str4, instance3, base64URL5, base64URL6, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                } else {
                    setWindowInsetsAnimationCallback instance4 = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject2, "use", String.class));
                    String[] configure5 = setAccessibilityPaneTitle.configure(jSONObject2, "key_ops");
                    if (configure5 == null) {
                        list = null;
                    } else {
                        list = Arrays.asList(configure5);
                    }
                    Set<setNextFocusRightId> instance5 = setNextFocusRightId.getInstance(list);
                    setVerticalScrollbarTrackDrawable configure6 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "alg", String.class));
                    String str7 = (String) setAccessibilityPaneTitle.init(jSONObject2, "kid", String.class);
                    URI instance6 = setAccessibilityPaneTitle.getInstance(jSONObject2, "x5u");
                    String str8 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t", String.class);
                    if (str8 == null) {
                        base64URL4 = null;
                    } else {
                        base64URL4 = new Base64URL(str8);
                    }
                    String str9 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t#S256", String.class);
                    if (str9 != null) {
                        base64URL6 = new Base64URL(str9);
                    }
                    return new ECKey(configure2, base64URL, base64URL2, base64URL3, instance4, instance5, configure6, str7, instance6, base64URL4, base64URL6, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.cca_continue, eCKey.cca_continue) && Objects.equals(this.configure, eCKey.configure) && Objects.equals(this.getInstance, eCKey.getInstance) && Objects.equals(this.init, eCKey.init) && Objects.equals(this.cleanup, eCKey.cleanup);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.cca_continue, this.configure, this.getInstance, this.init, this.cleanup});
    }

    public static Base64URL cca_continue(int i, BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i2 = 0;
            }
            int i3 = bitLength / 8;
            int i4 = i3 - length;
            byte[] bArr = new byte[i3];
            System.arraycopy(byteArray, i2, bArr, i4, length);
            byteArray = bArr;
        }
        int i5 = (i + 7) / 8;
        if (byteArray.length >= i5) {
            return Base64URL.init(byteArray);
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(byteArray, 0, bArr2, i5 - byteArray.length, byteArray.length);
        return Base64URL.init(bArr2);
    }
}
