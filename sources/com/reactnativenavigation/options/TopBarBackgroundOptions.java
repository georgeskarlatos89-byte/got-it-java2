package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.BoolParser;
import org.json.JSONObject;

public class TopBarBackgroundOptions {
    public ThemeColour color = new NullThemeColour();
    public ComponentOptions component = new ComponentOptions();
    public Bool waitForRender = new NullBool();

    public static TopBarBackgroundOptions parse(Context context, JSONObject jSONObject) {
        TopBarBackgroundOptions topBarBackgroundOptions = new TopBarBackgroundOptions();
        if (jSONObject == null) {
            return topBarBackgroundOptions;
        }
        topBarBackgroundOptions.color = ThemeColour.parse(context, jSONObject.optJSONObject(ViewProps.COLOR));
        topBarBackgroundOptions.component = ComponentOptions.parse(jSONObject.optJSONObject("component"));
        topBarBackgroundOptions.waitForRender = BoolParser.parse(jSONObject, "waitForRender");
        if (topBarBackgroundOptions.component.hasValue()) {
            topBarBackgroundOptions.color = ThemeColour.transparent();
        }
        return topBarBackgroundOptions;
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(TopBarBackgroundOptions topBarBackgroundOptions) {
        if (topBarBackgroundOptions.color.hasValue()) {
            this.color = topBarBackgroundOptions.color;
        }
        if (topBarBackgroundOptions.waitForRender.hasValue()) {
            this.waitForRender = topBarBackgroundOptions.waitForRender;
        }
        this.component.mergeWith(topBarBackgroundOptions.component);
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(TopBarBackgroundOptions topBarBackgroundOptions) {
        if (!this.color.hasValue()) {
            this.color = topBarBackgroundOptions.color;
        }
        if (!this.waitForRender.hasValue()) {
            this.waitForRender = topBarBackgroundOptions.waitForRender;
        }
        this.component.mergeWithDefault(topBarBackgroundOptions.component);
    }
}
