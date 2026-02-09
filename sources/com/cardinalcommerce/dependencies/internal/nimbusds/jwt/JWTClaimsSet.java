package com.cardinalcommerce.dependencies.internal.nimbusds.jwt;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.facebook.AuthenticationTokenClaims;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class JWTClaimsSet implements Serializable {
    private final Map<String, Object> configure;

    public static class cca_continue {
        final Map<String, Object> Cardinal = new LinkedHashMap();
    }

    private /* synthetic */ JWTClaimsSet(Map map, byte b) {
        this(map);
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_ISS);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_SUB);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_AUD);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_EXP);
        hashSet.add("nbf");
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_IAT);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_JIT);
        Collections.unmodifiableSet(hashSet);
    }

    private JWTClaimsSet(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.configure = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: package-private */
    public JSONObject getInstance() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.configure.entrySet()) {
            if (next.getValue() instanceof Date) {
                jSONObject.put(next.getKey(), Long.valueOf(((Date) next.getValue()).getTime() / 1000));
            } else if (AuthenticationTokenClaims.JSON_KEY_AUD.equals(next.getKey())) {
                List<String> init = init();
                if (init != null && !init.isEmpty()) {
                    if (init.size() == 1) {
                        jSONObject.put(AuthenticationTokenClaims.JSON_KEY_AUD, init.get(0));
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.addAll(init);
                        jSONObject.put(AuthenticationTokenClaims.JSON_KEY_AUD, jSONArray);
                    }
                }
            } else if (next.getValue() != null) {
                jSONObject.put(next.getKey(), next.getValue());
            }
        }
        return jSONObject;
    }

    public static JWTClaimsSet Cardinal(String str) throws ParseException {
        JSONObject instance = setAccessibilityPaneTitle.getInstance(str);
        cca_continue cca_continue2 = new cca_continue();
        for (String str2 : instance.keySet()) {
            if (str2.equals(AuthenticationTokenClaims.JSON_KEY_ISS)) {
                cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_ISS, (String) setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_ISS, String.class));
            } else if (str2.equals(AuthenticationTokenClaims.JSON_KEY_SUB)) {
                cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_SUB, (String) setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_SUB, String.class));
            } else if (str2.equals(AuthenticationTokenClaims.JSON_KEY_AUD)) {
                Object obj = instance.get(AuthenticationTokenClaims.JSON_KEY_AUD);
                if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_AUD, String.class));
                    cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_AUD, arrayList);
                } else {
                    List list = null;
                    if (obj instanceof List) {
                        String[] configure2 = setAccessibilityPaneTitle.configure(instance, AuthenticationTokenClaims.JSON_KEY_AUD);
                        if (configure2 != null) {
                            list = Arrays.asList(configure2);
                        }
                        cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_AUD, list);
                    } else if (obj == null) {
                        String str3 = null;
                        cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_AUD, (Object) null);
                    }
                }
            } else if (str2.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_EXP, new Date(setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_EXP) * 1000));
            } else if (str2.equals("nbf")) {
                cca_continue2.Cardinal.put("nbf", new Date(setAccessibilityPaneTitle.init(instance, "nbf") * 1000));
            } else if (str2.equals(AuthenticationTokenClaims.JSON_KEY_IAT)) {
                cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_IAT, new Date(setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_IAT) * 1000));
            } else if (str2.equals(AuthenticationTokenClaims.JSON_KEY_JIT)) {
                cca_continue2.Cardinal.put(AuthenticationTokenClaims.JSON_KEY_JIT, (String) setAccessibilityPaneTitle.init(instance, AuthenticationTokenClaims.JSON_KEY_JIT, String.class));
            } else {
                cca_continue2.Cardinal.put(str2, instance.get(str2));
            }
        }
        return new JWTClaimsSet(cca_continue2.Cardinal, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWTClaimsSet)) {
            return false;
        }
        return Objects.equals(this.configure, ((JWTClaimsSet) obj).configure);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.configure});
    }

    private List<String> init() {
        List list;
        Object obj = this.configure.get(AuthenticationTokenClaims.JSON_KEY_AUD);
        if (obj instanceof String) {
            return Collections.singletonList((String) obj);
        }
        try {
            String[] cca_continue2 = cca_continue(AuthenticationTokenClaims.JSON_KEY_AUD);
            if (cca_continue2 == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(Arrays.asList(cca_continue2));
            }
            return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    private String[] cca_continue(String str) throws ParseException {
        if (this.configure.get(str) == null) {
            return null;
        }
        try {
            List list = (List) this.configure.get(str);
            int size = list.size();
            String[] strArr = new String[size];
            int i = 0;
            while (i < size) {
                try {
                    strArr[i] = (String) list.get(i);
                    i++;
                } catch (ClassCastException unused) {
                    throw new ParseException(new StringBuilder("The \"").append(str).append("\" claim is not a list / JSON array of strings").toString(), 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException(new StringBuilder("The \"").append(str).append("\" claim is not a list / JSON array").toString(), 0);
        }
    }

    public final String toString() {
        return getInstance().toJSONString();
    }
}
