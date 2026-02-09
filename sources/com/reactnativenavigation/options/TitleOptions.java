package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.options.params.NullFraction;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.FontParser;
import com.reactnativenavigation.options.parsers.FractionParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import com.reactnativenavigation.options.parsers.TextParser;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import org.json.JSONObject;

public class TitleOptions {
    public Alignment alignment = Alignment.Default;
    public ThemeColour color = new NullThemeColour();
    public ComponentOptions component = new ComponentOptions();
    public FontOptions font = new FontOptions();
    public Fraction fontSize = new NullFraction();
    public Number height = new NullNumber();
    public Text text = new NullText();
    public Number topMargin = new NullNumber();

    public static TitleOptions parse(Context context, TypefaceLoader typefaceLoader, JSONObject jSONObject) {
        TitleOptions titleOptions = new TitleOptions();
        if (jSONObject == null) {
            return titleOptions;
        }
        titleOptions.component = ComponentOptions.parse(jSONObject.optJSONObject("component"));
        titleOptions.text = TextParser.parse(jSONObject, "text");
        titleOptions.color = ThemeColour.parse(context, jSONObject.optJSONObject(ViewProps.COLOR));
        titleOptions.fontSize = FractionParser.parse(jSONObject, ViewProps.FONT_SIZE);
        titleOptions.font = FontParser.parse(jSONObject);
        titleOptions.alignment = Alignment.fromString((String) TextParser.parse(jSONObject, "alignment").get(""));
        titleOptions.height = NumberParser.parse(jSONObject, "height");
        titleOptions.topMargin = NumberParser.parse(jSONObject, "topMargin");
        return titleOptions;
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(TitleOptions titleOptions) {
        if (titleOptions.text.hasValue()) {
            this.text = titleOptions.text;
            this.component.reset();
        } else if (titleOptions.component.hasValue()) {
            this.text = titleOptions.text;
        }
        if (titleOptions.color.hasValue()) {
            this.color = titleOptions.color;
        }
        if (titleOptions.fontSize.hasValue()) {
            this.fontSize = titleOptions.fontSize;
        }
        this.font.mergeWith(titleOptions.font);
        if (titleOptions.alignment != Alignment.Default) {
            this.alignment = titleOptions.alignment;
        }
        if (titleOptions.component.hasValue()) {
            this.component = titleOptions.component;
        }
        if (titleOptions.height.hasValue()) {
            this.height = titleOptions.height;
        }
        if (titleOptions.topMargin.hasValue()) {
            this.topMargin = titleOptions.topMargin;
        }
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(TitleOptions titleOptions) {
        if (!this.text.hasValue()) {
            this.text = titleOptions.text;
        }
        if (!this.color.hasValue()) {
            this.color = titleOptions.color;
        }
        if (!this.fontSize.hasValue()) {
            this.fontSize = titleOptions.fontSize;
        }
        this.font.mergeWithDefault(titleOptions.font);
        if (this.alignment == Alignment.Default) {
            this.alignment = titleOptions.alignment;
        }
        this.component.mergeWithDefault(titleOptions.component);
        if (!this.height.hasValue()) {
            this.height = titleOptions.height;
        }
        if (!this.topMargin.hasValue()) {
            this.topMargin = titleOptions.topMargin;
        }
    }
}
