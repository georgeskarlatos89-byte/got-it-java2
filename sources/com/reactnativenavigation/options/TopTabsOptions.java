package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.BoolParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import org.json.JSONObject;

public class TopTabsOptions {
    public Number fontSize = new NullNumber();
    public Number height = new NullNumber();
    public ThemeColour selectedTabColor = new NullThemeColour();
    public ThemeColour unselectedTabColor = new NullThemeColour();
    public Bool visible = new NullBool();

    public static TopTabsOptions parse(Context context, JSONObject jSONObject) {
        TopTabsOptions topTabsOptions = new TopTabsOptions();
        if (jSONObject == null) {
            return topTabsOptions;
        }
        topTabsOptions.selectedTabColor = ThemeColour.parse(context, jSONObject.optJSONObject("selectedTabColor"));
        topTabsOptions.unselectedTabColor = ThemeColour.parse(context, jSONObject.optJSONObject("unselectedTabColor"));
        topTabsOptions.fontSize = NumberParser.parse(jSONObject, ViewProps.FONT_SIZE);
        topTabsOptions.visible = BoolParser.parse(jSONObject, ViewProps.VISIBLE);
        topTabsOptions.height = NumberParser.parse(jSONObject, "height");
        return topTabsOptions;
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(TopTabsOptions topTabsOptions) {
        if (topTabsOptions.selectedTabColor.hasValue()) {
            this.selectedTabColor = topTabsOptions.selectedTabColor;
        }
        if (topTabsOptions.unselectedTabColor.hasValue()) {
            this.unselectedTabColor = topTabsOptions.unselectedTabColor;
        }
        if (topTabsOptions.fontSize.hasValue()) {
            this.fontSize = topTabsOptions.fontSize;
        }
        if (topTabsOptions.visible.hasValue()) {
            this.visible = topTabsOptions.visible;
        }
        if (topTabsOptions.height.hasValue()) {
            this.height = topTabsOptions.height;
        }
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(TopTabsOptions topTabsOptions) {
        if (!this.selectedTabColor.hasValue()) {
            this.selectedTabColor = topTabsOptions.selectedTabColor;
        }
        if (!this.unselectedTabColor.hasValue()) {
            this.unselectedTabColor = topTabsOptions.unselectedTabColor;
        }
        if (!this.fontSize.hasValue()) {
            this.fontSize = topTabsOptions.fontSize;
        }
        if (!this.visible.hasValue()) {
            this.visible = topTabsOptions.visible;
        }
        if (!this.height.hasValue()) {
            this.height = topTabsOptions.height;
        }
    }
}
