package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.BoolParser;
import com.reactnativenavigation.options.parsers.TextParser;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class FabOptions {
    public ArrayList<FabOptions> actionsArray = new ArrayList<>();
    public Text alignHorizontally = new NullText();
    public Text alignVertically = new NullText();
    public ThemeColour backgroundColor = new NullThemeColour();
    public ThemeColour clickColor = new NullThemeColour();
    public Bool hideOnScroll = new NullBool();
    public Text icon = new NullText();
    public ThemeColour iconColor = new NullThemeColour();
    public Text id = new NullText();
    public ThemeColour rippleColor = new NullThemeColour();
    public Text size = new NullText();
    public Bool visible = new NullBool();

    public static FabOptions parse(Context context, JSONObject jSONObject) {
        FabOptions fabOptions = new FabOptions();
        if (jSONObject == null) {
            return fabOptions;
        }
        fabOptions.id = TextParser.parse(jSONObject, "id");
        fabOptions.backgroundColor = ThemeColour.parse(context, jSONObject.optJSONObject(ViewProps.BACKGROUND_COLOR));
        fabOptions.clickColor = ThemeColour.parse(context, jSONObject.optJSONObject("clickColor"));
        fabOptions.rippleColor = ThemeColour.parse(context, jSONObject.optJSONObject("rippleColor"));
        fabOptions.visible = BoolParser.parse(jSONObject, ViewProps.VISIBLE);
        if (jSONObject.has("icon")) {
            fabOptions.icon = TextParser.parse(jSONObject.optJSONObject("icon"), "uri");
        }
        fabOptions.iconColor = ThemeColour.parse(context, jSONObject.optJSONObject("iconColor"));
        if (jSONObject.has("actions")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("actions");
            for (int i = 0; i < optJSONArray.length(); i++) {
                fabOptions.actionsArray.add(parse(context, optJSONArray.optJSONObject(i)));
            }
        }
        fabOptions.alignHorizontally = TextParser.parse(jSONObject, "alignHorizontally");
        fabOptions.alignVertically = TextParser.parse(jSONObject, "alignVertically");
        fabOptions.hideOnScroll = BoolParser.parse(jSONObject, "hideOnScroll");
        fabOptions.size = TextParser.parse(jSONObject, "size");
        return fabOptions;
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(FabOptions fabOptions) {
        if (fabOptions.id.hasValue()) {
            this.id = fabOptions.id;
        }
        if (fabOptions.backgroundColor.hasValue()) {
            this.backgroundColor = fabOptions.backgroundColor;
        }
        if (fabOptions.clickColor.hasValue()) {
            this.clickColor = fabOptions.clickColor;
        }
        if (fabOptions.iconColor.hasValue()) {
            this.iconColor = fabOptions.iconColor;
        }
        if (fabOptions.rippleColor.hasValue()) {
            this.rippleColor = fabOptions.rippleColor;
        }
        if (fabOptions.visible.hasValue()) {
            this.visible = fabOptions.visible;
        }
        if (fabOptions.icon.hasValue()) {
            this.icon = fabOptions.icon;
        }
        if (fabOptions.actionsArray.size() > 0) {
            this.actionsArray = fabOptions.actionsArray;
        }
        if (fabOptions.alignVertically.hasValue()) {
            this.alignVertically = fabOptions.alignVertically;
        }
        if (fabOptions.alignHorizontally.hasValue()) {
            this.alignHorizontally = fabOptions.alignHorizontally;
        }
        if (fabOptions.hideOnScroll.hasValue()) {
            this.hideOnScroll = fabOptions.hideOnScroll;
        }
        if (fabOptions.size.hasValue()) {
            this.size = fabOptions.size;
        }
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(FabOptions fabOptions) {
        if (!this.id.hasValue()) {
            this.id = fabOptions.id;
        }
        if (!this.iconColor.hasValue()) {
            this.iconColor = fabOptions.iconColor;
        }
        if (!this.rippleColor.hasValue()) {
            this.rippleColor = fabOptions.rippleColor;
        }
        if (!this.clickColor.hasValue()) {
            this.clickColor = fabOptions.clickColor;
        }
        if (!this.backgroundColor.hasValue()) {
            this.backgroundColor = fabOptions.backgroundColor;
        }
        if (!this.visible.hasValue()) {
            this.visible = fabOptions.visible;
        }
        if (!this.icon.hasValue()) {
            this.icon = fabOptions.icon;
        }
        if (this.actionsArray.size() == 0) {
            this.actionsArray = fabOptions.actionsArray;
        }
        if (!this.alignHorizontally.hasValue()) {
            this.alignHorizontally = fabOptions.alignHorizontally;
        }
        if (!this.alignVertically.hasValue()) {
            this.alignVertically = fabOptions.alignVertically;
        }
        if (!this.hideOnScroll.hasValue()) {
            this.hideOnScroll = fabOptions.hideOnScroll;
        }
        if (!this.size.hasValue()) {
            this.size = fabOptions.size;
        }
    }

    public boolean hasValue() {
        return this.id.hasValue() || this.icon.hasValue();
    }
}
