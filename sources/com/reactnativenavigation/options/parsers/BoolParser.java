package com.reactnativenavigation.options.parsers;

import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.utils.CollectionUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public class BoolParser {
    public static Bool parse(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new Bool(Boolean.valueOf(jSONObject.optBoolean(str))) : new NullBool();
    }

    public static Bool parseFirst(JSONObject jSONObject, String... strArr) {
        List asList = Arrays.asList(strArr);
        Objects.requireNonNull(jSONObject);
        String str = (String) CollectionUtils.first(asList, new BoolParser$$ExternalSyntheticLambda0(jSONObject));
        return str != null ? new Bool(Boolean.valueOf(jSONObject.optBoolean(str))) : new NullBool();
    }
}
