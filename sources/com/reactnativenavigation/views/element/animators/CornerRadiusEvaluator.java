package com.reactnativenavigation.views.element.animators;

import android.animation.TypeEvaluator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/CornerRadiusEvaluator;", "Landroid/animation/TypeEvaluator;", "", "onEvaluate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "evaluate", "ratio", "from", "to", "(FFF)Ljava/lang/Float;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CornerRadiusEvaluator.kt */
public final class CornerRadiusEvaluator implements TypeEvaluator<Float> {
    private final Function1<Float, Unit> onEvaluate;

    public CornerRadiusEvaluator(Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onEvaluate");
        this.onEvaluate = function1;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }

    public Float evaluate(float f, float f2, float f3) {
        float f4 = f2 + (f * (f3 - f2));
        this.onEvaluate.invoke(Float.valueOf(f4));
        return Float.valueOf(f4);
    }
}
