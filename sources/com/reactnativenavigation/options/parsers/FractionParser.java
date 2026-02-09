package com.reactnativenavigation.options.parsers;

import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.options.params.NullFraction;
import org.json.JSONObject;

public class FractionParser {
    public static Fraction parse(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new Fraction(jSONObject.optDouble(str)) : new NullFraction();
    }
}
