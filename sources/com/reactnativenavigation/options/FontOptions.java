package com.reactnativenavigation.options;

import android.graphics.Typeface;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0007J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/reactnativenavigation/options/FontOptions;", "", "()V", "_typeface", "Landroid/graphics/Typeface;", "value", "Lcom/reactnativenavigation/options/params/Text;", "fontFamily", "getFontFamily", "()Lcom/reactnativenavigation/options/params/Text;", "setFontFamily", "(Lcom/reactnativenavigation/options/params/Text;)V", "fontStyle", "getFontStyle", "setFontStyle", "fontWeight", "getFontWeight", "setFontWeight", "isDirty", "", "equals", "other", "get", "defaultValue", "getTypeface", "typefaceLoader", "Lcom/reactnativenavigation/options/parsers/TypefaceLoader;", "defaultTypeface", "hasValue", "mergeWith", "", "mergeWithDefault", "defaultOptions", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontOptions.kt */
public final class FontOptions {
    private Typeface _typeface;
    private Text fontFamily = new NullText();
    private Text fontStyle = new NullText();
    private Text fontWeight = new NullText();
    private boolean isDirty;

    public final FontOptions get() {
        return get$default(this, (FontOptions) null, 1, (Object) null);
    }

    public final Typeface getTypeface(TypefaceLoader typefaceLoader) {
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
        return getTypeface$default(this, typefaceLoader, (Typeface) null, 2, (Object) null);
    }

    public final Text getFontFamily() {
        return this.fontFamily;
    }

    public final void setFontFamily(Text text) {
        Intrinsics.checkNotNullParameter(text, "value");
        this.fontFamily = text;
        this.isDirty = true;
    }

    public final Text getFontStyle() {
        return this.fontStyle;
    }

    public final void setFontStyle(Text text) {
        Intrinsics.checkNotNullParameter(text, "value");
        this.fontStyle = text;
        this.isDirty = true;
    }

    public final Text getFontWeight() {
        return this.fontWeight;
    }

    public final void setFontWeight(Text text) {
        Intrinsics.checkNotNullParameter(text, "value");
        this.fontWeight = text;
        this.isDirty = true;
    }

    public static /* synthetic */ Typeface getTypeface$default(FontOptions fontOptions, TypefaceLoader typefaceLoader, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            typeface = null;
        }
        return fontOptions.getTypeface(typefaceLoader, typeface);
    }

    public final Typeface getTypeface(TypefaceLoader typefaceLoader, Typeface typeface) {
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
        if (this.isDirty) {
            this._typeface = typefaceLoader.getTypeFace((String) this.fontFamily.get(null), (String) this.fontStyle.get(""), (String) this.fontWeight.get(""), typeface);
            this.isDirty = false;
        }
        Typeface typeface2 = this._typeface;
        if (typeface2 != null) {
            return typeface2;
        }
        if (typeface != null) {
            return typefaceLoader.getTypeFace((String) this.fontFamily.get(null), (String) this.fontStyle.get(""), (String) this.fontWeight.get(""), typeface);
        }
        return null;
    }

    public final void mergeWith(FontOptions fontOptions) {
        Intrinsics.checkNotNullParameter(fontOptions, "other");
        if (fontOptions.fontFamily.hasValue()) {
            setFontFamily(fontOptions.fontFamily);
        }
        if (fontOptions.fontStyle.hasValue()) {
            setFontStyle(fontOptions.fontStyle);
        }
        if (fontOptions.fontWeight.hasValue()) {
            setFontWeight(fontOptions.fontWeight);
        }
    }

    public final void mergeWithDefault(FontOptions fontOptions) {
        Intrinsics.checkNotNullParameter(fontOptions, "defaultOptions");
        if (!this.fontFamily.hasValue()) {
            setFontFamily(fontOptions.fontFamily);
        }
        if (!this.fontStyle.hasValue()) {
            setFontStyle(fontOptions.fontStyle);
        }
        if (!this.fontWeight.hasValue()) {
            setFontWeight(fontOptions.fontWeight);
        }
    }

    public final boolean hasValue() {
        return this.fontFamily.hasValue() || this.fontStyle.hasValue() || this.fontWeight.hasValue();
    }

    public static /* synthetic */ FontOptions get$default(FontOptions fontOptions, FontOptions fontOptions2, int i, Object obj) {
        if ((i & 1) != 0) {
            fontOptions2 = null;
        }
        return fontOptions.get(fontOptions2);
    }

    public final FontOptions get(FontOptions fontOptions) {
        return hasValue() ? this : fontOptions;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof FontOptions ? (FontOptions) obj : null) == null) {
            return false;
        }
        FontOptions fontOptions = (FontOptions) obj;
        if (!this.fontFamily.equals(fontOptions.fontFamily) || !this.fontStyle.equals(fontOptions.fontStyle) || !this.fontWeight.equals(fontOptions.fontWeight)) {
            return false;
        }
        return true;
    }
}
