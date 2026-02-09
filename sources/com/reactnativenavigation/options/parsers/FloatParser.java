package com.reactnativenavigation.options.parsers;

import com.reactnativenavigation.options.params.FloatParam;
import com.reactnativenavigation.options.params.NullFloatParam;
import org.json.JSONObject;

public class FloatParser {
    public static FloatParam parse(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new FloatParam(Float.valueOf((float) jSONObject.optDouble(str))) : new NullFloatParam();
    }
}
