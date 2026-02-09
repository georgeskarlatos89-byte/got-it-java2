package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.facebook.common.callercontext.ContextChain;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class setPreferKeepClearRects extends JWK {
    private final Base64URL Cardinal;
    private final Base64URL cca_continue;
    private final PrivateKey cleanup;
    private final Base64URL configure;
    private final Base64URL getInstance;
    private final Base64URL getSDKVersion;
    private final Base64URL getWarnings;
    private final Base64URL init;
    private final List<init> onCReqSuccess;
    private final Base64URL onValidated;

    public static class init implements Serializable {
        final Base64URL Cardinal;
        final Base64URL configure;
        final Base64URL init;

        public init(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL != null) {
                this.Cardinal = base64URL;
                if (base64URL2 != null) {
                    this.configure = base64URL2;
                    if (base64URL3 != null) {
                        this.init = base64URL3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private setPreferKeepClearRects(com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r17, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r18, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r19, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r20, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r21, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r22, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r23, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r24, java.util.List<com.cardinalcommerce.a.setPreferKeepClearRects.init> r25, java.security.PrivateKey r26, com.cardinalcommerce.a.setWindowInsetsAnimationCallback r27, java.util.Set<com.cardinalcommerce.a.setNextFocusRightId> r28, com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable r29, java.lang.String r30, java.net.URI r31, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r32, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r33, java.util.List<com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64> r34, java.security.KeyStore r35) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r18
            r14 = r20
            r15 = r21
            r10 = r22
            r9 = r23
            r8 = r24
            com.cardinalcommerce.a.setNextClusterForwardId r1 = com.cardinalcommerce.a.setNextClusterForwardId.init
            r0 = r16
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00eb
            r11.Cardinal = r12
            if (r13 == 0) goto L_0x00e3
            r11.configure = r13
            java.util.List r0 = r16.init()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r16.init()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r0 = r16.configure()
            if (r0 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            r0 = r19
            r11.cca_continue = r0
            if (r14 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x0081
            r0 = r22
            r1 = r23
            if (r0 == 0) goto L_0x0085
            r2 = r24
            if (r1 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x0087
            r11.init = r14
            r11.getInstance = r15
            r11.getWarnings = r0
            r11.onValidated = r1
            r11.getSDKVersion = r2
            if (r25 == 0) goto L_0x0078
            java.util.List r0 = java.util.Collections.unmodifiableList(r25)
            r11.onCReqSuccess = r0
            goto L_0x007e
        L_0x0078:
            java.util.List r0 = java.util.Collections.emptyList()
            r11.onCReqSuccess = r0
        L_0x007e:
            r0 = r26
            goto L_0x00b0
        L_0x0081:
            r0 = r22
            r1 = r23
        L_0x0085:
            r2 = r24
        L_0x0087:
            if (r14 != 0) goto L_0x0093
            if (r15 != 0) goto L_0x0093
            if (r0 != 0) goto L_0x0093
            if (r1 != 0) goto L_0x0093
            if (r2 != 0) goto L_0x0093
            if (r25 == 0) goto L_0x009e
        L_0x0093:
            if (r14 != 0) goto L_0x00b3
            if (r15 != 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00b3
            if (r1 != 0) goto L_0x00b3
            if (r2 == 0) goto L_0x009e
            goto L_0x00b3
        L_0x009e:
            r0 = 0
            r11.init = r0
            r11.getInstance = r0
            r11.getWarnings = r0
            r11.onValidated = r0
            r11.getSDKVersion = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r11.onCReqSuccess = r0
            goto L_0x007e
        L_0x00b0:
            r11.cleanup = r0
            return
        L_0x00b3:
            if (r14 == 0) goto L_0x00db
            if (r15 == 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00cb
            if (r1 != 0) goto L_0x00c3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first CRT coefficient must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00cb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00e3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public exponent value must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The modulus value must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setPreferKeepClearRects.<init>(com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, java.util.List, java.security.PrivateKey, com.cardinalcommerce.a.setWindowInsetsAnimationCallback, java.util.Set, com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable, java.lang.String, java.net.URI, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, java.util.List, java.security.KeyStore):void");
    }

    private boolean configure() {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) init().get(0).getPublicKey();
            if (new BigInteger(1, setPreferKeepClear.cca_continue(this.configure.cca_continue)).equals(rSAPublicKey.getPublicExponent()) && new BigInteger(1, setPreferKeepClear.cca_continue(this.Cardinal.cca_continue)).equals(rSAPublicKey.getModulus())) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean getInstance() {
        return (this.cca_continue == null && this.init == null && this.cleanup == null) ? false : true;
    }

    public final JSONObject cca_continue() {
        JSONObject cca_continue2 = super.cca_continue();
        cca_continue2.put("n", this.Cardinal.toString());
        cca_continue2.put("e", this.configure.toString());
        Base64URL base64URL = this.cca_continue;
        if (base64URL != null) {
            cca_continue2.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.init;
        if (base64URL2 != null) {
            cca_continue2.put(ContextChain.TAG_PRODUCT, base64URL2.toString());
        }
        Base64URL base64URL3 = this.getInstance;
        if (base64URL3 != null) {
            cca_continue2.put("q", base64URL3.toString());
        }
        Base64URL base64URL4 = this.getWarnings;
        if (base64URL4 != null) {
            cca_continue2.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.onValidated;
        if (base64URL5 != null) {
            cca_continue2.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.getSDKVersion;
        if (base64URL6 != null) {
            cca_continue2.put("qi", base64URL6.toString());
        }
        List<init> list = this.onCReqSuccess;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (init next : this.onCReqSuccess) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("r", next.Cardinal.toString());
                jSONObject.put("d", next.configure.toString());
                jSONObject.put("t", next.init.toString());
                jSONArray.add(jSONObject);
            }
            cca_continue2.put("oth", jSONArray);
        }
        return cca_continue2;
    }

    public static setPreferKeepClearRects init(JSONObject jSONObject) throws ParseException {
        Base64URL base64URL;
        Base64URL base64URL2;
        Base64URL base64URL3;
        Base64URL base64URL4;
        Base64URL base64URL5;
        Base64URL base64URL6;
        Base64URL base64URL7;
        Base64URL base64URL8;
        ArrayList arrayList;
        List list;
        Base64URL base64URL9;
        Base64URL base64URL10;
        JSONArray jSONArray;
        Base64URL base64URL11;
        Base64URL base64URL12;
        Base64URL base64URL13;
        JSONObject jSONObject2 = jSONObject;
        if (setNextClusterForwardId.init.equals(setKeepScreenOn.configure(jSONObject))) {
            String str = (String) setAccessibilityPaneTitle.init(jSONObject2, "n", String.class);
            if (str == null) {
                base64URL = null;
            } else {
                base64URL = new Base64URL(str);
            }
            String str2 = (String) setAccessibilityPaneTitle.init(jSONObject2, "e", String.class);
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
            String str4 = (String) setAccessibilityPaneTitle.init(jSONObject2, ContextChain.TAG_PRODUCT, String.class);
            if (str4 == null) {
                base64URL4 = null;
            } else {
                base64URL4 = new Base64URL(str4);
            }
            String str5 = (String) setAccessibilityPaneTitle.init(jSONObject2, "q", String.class);
            if (str5 == null) {
                base64URL5 = null;
            } else {
                base64URL5 = new Base64URL(str5);
            }
            String str6 = (String) setAccessibilityPaneTitle.init(jSONObject2, "dp", String.class);
            if (str6 == null) {
                base64URL6 = null;
            } else {
                base64URL6 = new Base64URL(str6);
            }
            String str7 = (String) setAccessibilityPaneTitle.init(jSONObject2, "dq", String.class);
            if (str7 == null) {
                base64URL7 = null;
            } else {
                base64URL7 = new Base64URL(str7);
            }
            String str8 = (String) setAccessibilityPaneTitle.init(jSONObject2, "qi", String.class);
            if (str8 == null) {
                base64URL8 = null;
            } else {
                base64URL8 = new Base64URL(str8);
            }
            if (!jSONObject2.containsKey("oth") || (jSONArray = (JSONArray) setAccessibilityPaneTitle.init(jSONObject2, "oth", JSONArray.class)) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                Iterator it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject3 = (JSONObject) next;
                        String str9 = (String) setAccessibilityPaneTitle.init(jSONObject3, "r", String.class);
                        if (str9 == null) {
                            base64URL11 = null;
                        } else {
                            base64URL11 = new Base64URL(str9);
                        }
                        String str10 = (String) setAccessibilityPaneTitle.init(jSONObject3, "dq", String.class);
                        if (str10 == null) {
                            base64URL12 = null;
                        } else {
                            base64URL12 = new Base64URL(str10);
                        }
                        Iterator it2 = it;
                        String str11 = (String) setAccessibilityPaneTitle.init(jSONObject3, "t", String.class);
                        if (str11 == null) {
                            base64URL13 = null;
                        } else {
                            base64URL13 = new Base64URL(str11);
                        }
                        try {
                            arrayList2.add(new init(base64URL11, base64URL12, base64URL13));
                            it = it2;
                        } catch (IllegalArgumentException e) {
                            throw new ParseException(e.getMessage(), 0);
                        }
                    }
                }
                arrayList = arrayList2;
            }
            try {
                setWindowInsetsAnimationCallback instance = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject2, "use", String.class));
                String[] configure2 = setAccessibilityPaneTitle.configure(jSONObject2, "key_ops");
                if (configure2 == null) {
                    list = null;
                } else {
                    list = Arrays.asList(configure2);
                }
                Set<setNextFocusRightId> instance2 = setNextFocusRightId.getInstance(list);
                setVerticalScrollbarTrackDrawable configure3 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "alg", String.class));
                String str12 = (String) setAccessibilityPaneTitle.init(jSONObject2, "kid", String.class);
                URI instance3 = setAccessibilityPaneTitle.getInstance(jSONObject2, "x5u");
                String str13 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t", String.class);
                if (str13 == null) {
                    base64URL9 = null;
                } else {
                    base64URL9 = new Base64URL(str13);
                }
                String str14 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t#S256", String.class);
                if (str14 == null) {
                    base64URL10 = null;
                } else {
                    base64URL10 = new Base64URL(str14);
                }
                return new setPreferKeepClearRects(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, (PrivateKey) null, instance, instance2, configure3, str12, instance3, base64URL9, base64URL10, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPreferKeepClearRects) || !super.equals(obj)) {
            return false;
        }
        setPreferKeepClearRects setpreferkeepclearrects = (setPreferKeepClearRects) obj;
        return Objects.equals(this.Cardinal, setpreferkeepclearrects.Cardinal) && Objects.equals(this.configure, setpreferkeepclearrects.configure) && Objects.equals(this.cca_continue, setpreferkeepclearrects.cca_continue) && Objects.equals(this.init, setpreferkeepclearrects.init) && Objects.equals(this.getInstance, setpreferkeepclearrects.getInstance) && Objects.equals(this.getWarnings, setpreferkeepclearrects.getWarnings) && Objects.equals(this.onValidated, setpreferkeepclearrects.onValidated) && Objects.equals(this.getSDKVersion, setpreferkeepclearrects.getSDKVersion) && Objects.equals(this.onCReqSuccess, setpreferkeepclearrects.onCReqSuccess) && Objects.equals(this.cleanup, setpreferkeepclearrects.cleanup);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.Cardinal, this.configure, this.cca_continue, this.init, this.getInstance, this.getWarnings, this.onValidated, this.getSDKVersion, this.onCReqSuccess, this.cleanup});
    }
}
