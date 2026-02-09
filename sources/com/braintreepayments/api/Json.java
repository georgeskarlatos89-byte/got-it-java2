package com.braintreepayments.api;

import org.json.JSONObject;

class Json {
    Json() {
    }

    static String optString(JSONObject jSONObject, String str, String str2) {
        return (jSONObject == null || jSONObject.isNull(str)) ? str2 : jSONObject.optString(str, str2);
    }

    static Boolean optBoolean(JSONObject jSONObject, String str, Boolean bool) {
        return (jSONObject == null || jSONObject.isNull(str)) ? bool : Boolean.valueOf(jSONObject.optBoolean(str, bool.booleanValue()));
    }
}
