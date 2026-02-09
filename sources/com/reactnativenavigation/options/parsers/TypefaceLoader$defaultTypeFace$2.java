package com.reactnativenavigation.options.parsers;

import android.graphics.Typeface;
import com.aurelhubert.ahbottomnavigation.AHTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TypefaceLoader.kt */
final class TypefaceLoader$defaultTypeFace$2 extends Lambda implements Function0<Typeface> {
    final /* synthetic */ TypefaceLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypefaceLoader$defaultTypeFace$2(TypefaceLoader typefaceLoader) {
        super(0);
        this.this$0 = typefaceLoader;
    }

    public final Typeface invoke() {
        Typeface typeface = new AHTextView(this.this$0.context).getTypeface();
        return typeface == null ? Typeface.DEFAULT : typeface;
    }
}
