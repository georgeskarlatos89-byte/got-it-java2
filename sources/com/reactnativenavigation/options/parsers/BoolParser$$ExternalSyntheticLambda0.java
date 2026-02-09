package com.reactnativenavigation.options.parsers;

import com.reactnativenavigation.utils.CollectionUtils;
import org.json.JSONObject;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BoolParser$$ExternalSyntheticLambda0 implements CollectionUtils.Filter {
    public final /* synthetic */ JSONObject f$0;

    public /* synthetic */ BoolParser$$ExternalSyntheticLambda0(JSONObject jSONObject) {
        this.f$0 = jSONObject;
    }

    public final boolean filter(Object obj) {
        return this.f$0.has((String) obj);
    }
}
