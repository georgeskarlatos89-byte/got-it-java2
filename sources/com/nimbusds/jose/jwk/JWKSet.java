package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.IOUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class JWKSet {
    public static final String MIME_TYPE = "application/jwk-set+json; charset=UTF-8";
    private final Map<String, Object> customMembers;
    private final List<JWK> keys;

    public JWKSet() {
        this.keys = new LinkedList();
        this.customMembers = new HashMap();
    }

    public JWKSet(JWK jwk) {
        LinkedList linkedList = new LinkedList();
        this.keys = linkedList;
        this.customMembers = new HashMap();
        if (jwk != null) {
            linkedList.add(jwk);
            return;
        }
        throw new IllegalArgumentException("The JWK must not be null");
    }

    public JWKSet(List<JWK> list) {
        LinkedList linkedList = new LinkedList();
        this.keys = linkedList;
        this.customMembers = new HashMap();
        if (list != null) {
            linkedList.addAll(list);
            return;
        }
        throw new IllegalArgumentException("The JWK list must not be null");
    }

    public JWKSet(List<JWK> list, Map<String, Object> map) {
        LinkedList linkedList = new LinkedList();
        this.keys = linkedList;
        HashMap hashMap = new HashMap();
        this.customMembers = hashMap;
        if (list != null) {
            linkedList.addAll(list);
            hashMap.putAll(map);
            return;
        }
        throw new IllegalArgumentException("The JWK list must not be null");
    }

    public List<JWK> getKeys() {
        return this.keys;
    }

    public JWK getKeyByKeyId(String str) {
        for (JWK next : getKeys()) {
            if (next.getKeyID() != null && next.getKeyID().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Map<String, Object> getAdditionalMembers() {
        return this.customMembers;
    }

    public JWKSet toPublicJWKSet() {
        LinkedList linkedList = new LinkedList();
        for (JWK publicJWK : this.keys) {
            JWK publicJWK2 = publicJWK.toPublicJWK();
            if (publicJWK2 != null) {
                linkedList.add(publicJWK2);
            }
        }
        return new JWKSet(linkedList, this.customMembers);
    }

    public JSONObject toJSONObject() {
        return toJSONObject(true);
    }

    public JSONObject toJSONObject(boolean z) {
        JSONObject jSONObject = new JSONObject(this.customMembers);
        JSONArray jSONArray = new JSONArray();
        for (JWK next : this.keys) {
            if (z) {
                JWK publicJWK = next.toPublicJWK();
                if (publicJWK != null) {
                    jSONArray.add(publicJWK.toJSONObject());
                }
            } else {
                jSONArray.add(next.toJSONObject());
            }
        }
        jSONObject.put("keys", jSONArray);
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }

    public static JWKSet parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    public static JWKSet parse(JSONObject jSONObject) throws ParseException {
        JSONArray jSONArray = JSONObjectUtils.getJSONArray(jSONObject, "keys");
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < jSONArray.size()) {
            if (jSONArray.get(i) instanceof JSONObject) {
                try {
                    linkedList.add(JWK.parse((JSONObject) jSONArray.get(i)));
                    i++;
                } catch (ParseException e) {
                    throw new ParseException("Invalid JWK at position " + i + ": " + e.getMessage(), 0);
                }
            } else {
                throw new ParseException("The \"keys\" JSON array must contain JSON objects only", 0);
            }
        }
        JWKSet jWKSet = new JWKSet((List<JWK>) linkedList);
        for (Map.Entry entry : jSONObject.entrySet()) {
            if (entry.getKey() != null && !((String) entry.getKey()).equals("keys")) {
                jWKSet.getAdditionalMembers().put((String) entry.getKey(), entry.getValue());
            }
        }
        return jWKSet;
    }

    public static JWKSet load(File file) throws IOException, ParseException {
        return parse(IOUtils.readFileToString(file, Charset.forName("UTF-8")));
    }

    public static JWKSet load(URL url, int i, int i2, int i3) throws IOException, ParseException {
        return parse(new DefaultResourceRetriever(i, i2, i3).retrieveResource(url).getContent());
    }

    public static JWKSet load(URL url) throws IOException, ParseException {
        return load(url, 0, 0, 0);
    }

    public static JWKSet load(KeyStore keyStore, PasswordLookup passwordLookup) throws KeyStoreException {
        LinkedList linkedList = new LinkedList();
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            char[] charArray = passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(nextElement);
            Certificate certificate = keyStore.getCertificate(nextElement);
            if (certificate != null) {
                if (certificate.getPublicKey() instanceof RSAPublicKey) {
                    try {
                        RSAKey load = RSAKey.load(keyStore, nextElement, charArray);
                        if (load != null) {
                            linkedList.add(load);
                        }
                    } catch (JOSEException unused) {
                    }
                } else if (certificate.getPublicKey() instanceof ECPublicKey) {
                    ECKey load2 = ECKey.load(keyStore, nextElement, charArray);
                    if (load2 != null) {
                        linkedList.add(load2);
                    }
                }
            }
        }
        Enumeration<String> aliases2 = keyStore.aliases();
        while (aliases2.hasMoreElements()) {
            String nextElement2 = aliases2.nextElement();
            try {
                OctetSequenceKey load3 = OctetSequenceKey.load(keyStore, nextElement2, passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(nextElement2));
                if (load3 != null) {
                    linkedList.add(load3);
                }
            } catch (JOSEException unused2) {
            }
        }
        return new JWKSet((List<JWK>) linkedList);
    }
}
