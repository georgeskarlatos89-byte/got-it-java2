package com.reactnativenavigation.options.parsers;

import android.content.Context;
import android.graphics.Typeface;
import com.reactnativenavigation.utils.ReactTypefaceUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J4\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/reactnativenavigation/options/parsers/TypefaceLoader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultTypeFace", "Landroid/graphics/Typeface;", "getDefaultTypeFace", "()Landroid/graphics/Typeface;", "defaultTypeFace$delegate", "Lkotlin/Lazy;", "getTypeFace", "fontFamilyName", "", "fontStyle", "fontWeight", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TypefaceLoader.kt */
public class TypefaceLoader {
    /* access modifiers changed from: private */
    public final Context context;
    private final Lazy defaultTypeFace$delegate = LazyKt.lazy(new TypefaceLoader$defaultTypeFace$2(this));

    public final Typeface getTypeFace(String str, String str2, String str3) {
        return getTypeFace$default(this, str, str2, str3, (Typeface) null, 8, (Object) null);
    }

    public TypefaceLoader(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public Typeface getDefaultTypeFace() {
        Object value = this.defaultTypeFace$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-defaultTypeFace>(...)");
        return (Typeface) value;
    }

    public static /* synthetic */ Typeface getTypeFace$default(TypefaceLoader typefaceLoader, String str, String str2, String str3, Typeface typeface, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                typeface = null;
            }
            return typefaceLoader.getTypeFace(str, str2, str3, typeface);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTypeFace");
    }

    public Typeface getTypeFace(String str, String str2, String str3, Typeface typeface) {
        return ReactTypefaceUtils.applyStyles(typeface, ReactTypefaceUtils.parseFontStyle(str2), ReactTypefaceUtils.parseFontWeight(str3), str, this.context.getAssets());
    }
}
