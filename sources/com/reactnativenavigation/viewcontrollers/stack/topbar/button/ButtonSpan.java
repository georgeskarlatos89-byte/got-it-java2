package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.utils.UiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonSpan;", "Landroid/text/style/MetricAffectingSpan;", "context", "Landroid/content/Context;", "button", "Lcom/reactnativenavigation/options/ButtonOptions;", "typefaceLoader", "Lcom/reactnativenavigation/options/parsers/TypefaceLoader;", "(Landroid/content/Context;Lcom/reactnativenavigation/options/ButtonOptions;Lcom/reactnativenavigation/options/parsers/TypefaceLoader;)V", "fontSize", "", "getFontSize", "()Ljava/lang/Float;", "apply", "", "paint", "Landroid/graphics/Paint;", "updateDrawState", "drawState", "Landroid/text/TextPaint;", "updateMeasureState", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonSpan.kt */
public final class ButtonSpan extends MetricAffectingSpan {
    private final ButtonOptions button;
    private final Context context;
    private final TypefaceLoader typefaceLoader;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonSpan(Context context2, ButtonOptions buttonOptions, TypefaceLoader typefaceLoader2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, buttonOptions, (i & 4) != 0 ? new TypefaceLoader(context2) : typefaceLoader2);
    }

    public ButtonSpan(Context context2, ButtonOptions buttonOptions, TypefaceLoader typefaceLoader2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(buttonOptions, "button");
        Intrinsics.checkNotNullParameter(typefaceLoader2, "typefaceLoader");
        this.context = context2;
        this.button = buttonOptions;
        this.typefaceLoader = typefaceLoader2;
    }

    public final Float getFontSize() {
        if (this.button.fontSize.hasValue()) {
            return Float.valueOf(UiUtils.dpToPx(this.context, (float) ((Number) this.button.fontSize.get()).doubleValue()));
        }
        return null;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "drawState");
        apply(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        apply(textPaint);
    }

    public final void apply(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Typeface typeface = this.button.font.getTypeface(this.typefaceLoader, paint.getTypeface());
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (typeface != null ? ~typeface.getStyle() : 1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        Float fontSize = getFontSize();
        if (fontSize != null) {
            paint.setTextSize(fontSize.floatValue());
        }
        paint.setTypeface(typeface);
    }
}
