package com.cardinalcommerce.dependencies.internal.minidev.json;

import com.cardinalcommerce.a.setLabelCustomization;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

public class JSONObject extends HashMap<String, Object> implements JSONAware, JSONAwareEx, JSONStreamAwareEx {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public static String escape(String str) {
        return JSONValue.escape(str);
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, JSONValue.COMPRESSION);
    }

    public static String toJSONString(Map<String, ? extends Object> map, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSONKV(String str, Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (str == null) {
            appendable.append(ThreeDSStrings.NULL_STRING);
        } else if (!jSONStyle.mustProtectKey(str)) {
            appendable.append(str);
        } else {
            appendable.append(Typography.quote);
            JSONValue.escape(str, appendable, jSONStyle);
            appendable.append(Typography.quote);
        }
        appendable.append(':');
        if (obj instanceof String) {
            jSONStyle.writeString(appendable, (String) obj);
        } else {
            JSONValue.writeJSONString(obj, appendable, jSONStyle);
        }
    }

    public JSONObject appendField(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public String getAsString(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public Number getAsNumber(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return Long.valueOf(obj.toString());
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable) throws IOException {
        writeJSON(map, appendable, JSONValue.COMPRESSION);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (map == null) {
            appendable.append(ThreeDSStrings.NULL_STRING);
        } else {
            setLabelCustomization.getInstance.getInstance(map, appendable, jSONStyle);
        }
    }

    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSON(this, appendable, JSONValue.COMPRESSION);
    }

    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) throws IOException {
        writeJSON(this, appendable, jSONStyle);
    }

    public void merge(Object obj) {
        init(this, obj);
    }

    private static JSONObject init(JSONObject jSONObject, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof JSONObject) {
            return merge(jSONObject, (JSONObject) obj);
        }
        throw new RuntimeException(new StringBuilder("JSON megre can not merge JSONObject with ").append(obj.getClass()).toString());
    }

    private static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj2 != null) {
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (obj2 != null) {
                        if (jSONArray instanceof JSONArray) {
                            jSONArray = merge(jSONArray, (JSONArray) obj2);
                        } else {
                            jSONArray.add(obj2);
                        }
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof JSONObject) {
                    jSONObject.put(str, init((JSONObject) obj, obj2));
                } else if (!obj.equals(obj2)) {
                    if (obj.getClass().equals(obj2.getClass())) {
                        throw new RuntimeException(new StringBuilder("JSON merge can not merge two ").append(obj.getClass().getName()).append(" Object together").toString());
                    }
                    throw new RuntimeException(new StringBuilder("JSON merge can not merge ").append(obj.getClass().getName()).append(" with ").append(obj2.getClass().getName()).toString());
                }
            }
        }
        for (String str2 : jSONObject2.keySet()) {
            if (!jSONObject.containsKey(str2)) {
                jSONObject.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject;
    }

    protected static JSONArray configure(JSONArray jSONArray, Object obj) {
        return obj == null ? jSONArray : merge(jSONArray, (JSONArray) obj);
    }

    private static JSONArray merge(JSONArray jSONArray, JSONArray jSONArray2) {
        jSONArray.addAll(jSONArray2);
        return jSONArray;
    }

    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    public String toString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    public String toString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }
}
