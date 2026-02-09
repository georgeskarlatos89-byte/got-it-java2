package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.BoolParser;
import com.reactnativenavigation.options.parsers.FontParser;
import com.reactnativenavigation.options.parsers.IconParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import com.reactnativenavigation.options.parsers.TextParser;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import org.json.JSONObject;

public class BottomTabOptions {
    public Bool animateBadge = new NullBool();
    public Text badge = new NullText();
    public ThemeColour badgeColor = new NullThemeColour();
    public DotIndicatorOptions dotIndicator = new DotIndicatorOptions();
    public FontOptions font = new FontOptions();
    public Number fontSize = new NullNumber();
    public Text icon = new NullText();
    public ThemeColour iconColor = new NullThemeColour();
    public Number iconHeight = new NullNumber();
    public Number iconWidth = new NullNumber();
    public Bool popToRoot = new NullBool();
    public Bool selectTabOnPress = new NullBool();
    public Number selectedFontSize = new NullNumber();
    public Text selectedIcon = new NullText();
    public ThemeColour selectedIconColor = new NullThemeColour();
    public ThemeColour selectedTextColor = new NullThemeColour();
    public Text testId = new NullText();
    public Text text = new NullText();
    public ThemeColour textColor = new NullThemeColour();

    public static BottomTabOptions parse(Context context, TypefaceLoader typefaceLoader, JSONObject jSONObject) {
        BottomTabOptions bottomTabOptions = new BottomTabOptions();
        if (jSONObject == null) {
            return bottomTabOptions;
        }
        bottomTabOptions.text = TextParser.parse(jSONObject, "text");
        bottomTabOptions.textColor = ThemeColour.parse(context, jSONObject.optJSONObject("textColor"));
        bottomTabOptions.selectedTextColor = ThemeColour.parse(context, jSONObject.optJSONObject("selectedTextColor"));
        bottomTabOptions.icon = IconParser.parse(jSONObject, "icon");
        bottomTabOptions.iconWidth = NumberParser.parse(jSONObject, "iconWidth");
        bottomTabOptions.iconHeight = NumberParser.parse(jSONObject, "iconHeight");
        bottomTabOptions.selectedIcon = IconParser.parse(jSONObject, "selectedIcon");
        bottomTabOptions.iconColor = ThemeColour.parse(context, jSONObject.optJSONObject("iconColor"));
        bottomTabOptions.selectedIconColor = ThemeColour.parse(context, jSONObject.optJSONObject("selectedIconColor"));
        bottomTabOptions.badge = TextParser.parse(jSONObject, "badge");
        bottomTabOptions.badgeColor = ThemeColour.parse(context, jSONObject.optJSONObject("badgeColor"));
        bottomTabOptions.animateBadge = BoolParser.parse(jSONObject, "animateBadge");
        bottomTabOptions.testId = TextParser.parse(jSONObject, ViewProps.TEST_ID);
        bottomTabOptions.font = FontParser.parse(jSONObject);
        bottomTabOptions.fontSize = NumberParser.parse(jSONObject, ViewProps.FONT_SIZE);
        bottomTabOptions.selectedFontSize = NumberParser.parse(jSONObject, "selectedFontSize");
        bottomTabOptions.dotIndicator = DotIndicatorOptions.parse(context, jSONObject.optJSONObject("dotIndicator"));
        bottomTabOptions.selectTabOnPress = BoolParser.parse(jSONObject, "selectTabOnPress");
        bottomTabOptions.popToRoot = BoolParser.parse(jSONObject, "popToRoot");
        return bottomTabOptions;
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(BottomTabOptions bottomTabOptions) {
        if (bottomTabOptions.textColor.hasValue()) {
            this.textColor = bottomTabOptions.textColor;
        }
        if (bottomTabOptions.selectedTextColor.hasValue()) {
            this.selectedTextColor = bottomTabOptions.selectedTextColor;
        }
        if (bottomTabOptions.iconColor.hasValue()) {
            this.iconColor = bottomTabOptions.iconColor;
        }
        if (bottomTabOptions.selectedIconColor.hasValue()) {
            this.selectedIconColor = bottomTabOptions.selectedIconColor;
        }
        if (bottomTabOptions.badgeColor.hasValue()) {
            this.badgeColor = bottomTabOptions.badgeColor;
        }
        if (bottomTabOptions.text.hasValue()) {
            this.text = bottomTabOptions.text;
        }
        if (bottomTabOptions.icon.hasValue()) {
            this.icon = bottomTabOptions.icon;
        }
        if (bottomTabOptions.iconWidth.hasValue()) {
            this.iconWidth = bottomTabOptions.iconWidth;
        }
        if (bottomTabOptions.iconHeight.hasValue()) {
            this.iconHeight = bottomTabOptions.iconHeight;
        }
        if (bottomTabOptions.selectedIcon.hasValue()) {
            this.selectedIcon = bottomTabOptions.selectedIcon;
        }
        if (bottomTabOptions.badge.hasValue()) {
            this.badge = bottomTabOptions.badge;
        }
        if (bottomTabOptions.animateBadge.hasValue()) {
            this.animateBadge = bottomTabOptions.animateBadge;
        }
        if (bottomTabOptions.testId.hasValue()) {
            this.testId = bottomTabOptions.testId;
        }
        if (bottomTabOptions.fontSize.hasValue()) {
            this.fontSize = bottomTabOptions.fontSize;
        }
        if (bottomTabOptions.selectedFontSize.hasValue()) {
            this.selectedFontSize = bottomTabOptions.selectedFontSize;
        }
        this.font.mergeWith(bottomTabOptions.font);
        if (bottomTabOptions.dotIndicator.hasValue()) {
            this.dotIndicator = bottomTabOptions.dotIndicator;
        }
        if (bottomTabOptions.selectTabOnPress.hasValue()) {
            this.selectTabOnPress = bottomTabOptions.selectTabOnPress;
        }
        if (bottomTabOptions.popToRoot.hasValue()) {
            this.popToRoot = bottomTabOptions.popToRoot;
        }
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(BottomTabOptions bottomTabOptions) {
        if (!this.textColor.hasValue()) {
            this.textColor = bottomTabOptions.textColor;
        }
        if (!this.selectedTextColor.hasValue()) {
            this.selectedTextColor = bottomTabOptions.selectedTextColor;
        }
        if (!this.iconColor.hasValue()) {
            this.iconColor = bottomTabOptions.iconColor;
        }
        if (!this.selectedIconColor.hasValue()) {
            this.selectedIconColor = bottomTabOptions.selectedIconColor;
        }
        if (!this.badgeColor.hasValue()) {
            this.badgeColor = bottomTabOptions.badgeColor;
        }
        if (!this.text.hasValue()) {
            this.text = bottomTabOptions.text;
        }
        if (!this.icon.hasValue()) {
            this.icon = bottomTabOptions.icon;
        }
        if (!this.iconWidth.hasValue()) {
            this.iconWidth = bottomTabOptions.iconWidth;
        }
        if (!this.iconHeight.hasValue()) {
            this.iconHeight = bottomTabOptions.iconHeight;
        }
        if (!this.selectedIcon.hasValue()) {
            this.selectedIcon = bottomTabOptions.selectedIcon;
        }
        if (!this.badge.hasValue()) {
            this.badge = bottomTabOptions.badge;
        }
        if (!this.animateBadge.hasValue()) {
            this.animateBadge = bottomTabOptions.animateBadge;
        }
        if (!this.fontSize.hasValue()) {
            this.fontSize = bottomTabOptions.fontSize;
        }
        if (!this.selectedFontSize.hasValue()) {
            this.selectedFontSize = bottomTabOptions.selectedFontSize;
        }
        this.font.mergeWithDefault(bottomTabOptions.font);
        if (!this.testId.hasValue()) {
            this.testId = bottomTabOptions.testId;
        }
        if (!this.dotIndicator.hasValue()) {
            this.dotIndicator = bottomTabOptions.dotIndicator;
        }
        if (!this.selectTabOnPress.hasValue()) {
            this.selectTabOnPress = bottomTabOptions.selectTabOnPress;
        }
        if (!this.popToRoot.hasValue()) {
            this.popToRoot = bottomTabOptions.popToRoot;
        }
    }
}
