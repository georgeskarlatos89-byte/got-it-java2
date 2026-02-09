package com.reactnativenavigation.views.element.animators;

import android.animation.TypeEvaluator;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/OutlineEvaluator;", "Landroid/animation/TypeEvaluator;", "Lcom/reactnativenavigation/views/element/animators/ViewOutline;", "onEvaluate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "evaluate", "ratio", "", "from", "to", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OutlineEvaluator.kt */
public final class OutlineEvaluator implements TypeEvaluator<ViewOutline> {
    private final Function1<ViewOutline, Unit> onEvaluate;

    public OutlineEvaluator(Function1<? super ViewOutline, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onEvaluate");
        this.onEvaluate = function1;
    }

    public ViewOutline evaluate(float f, ViewOutline viewOutline, ViewOutline viewOutline2) {
        Intrinsics.checkNotNullParameter(viewOutline, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(viewOutline2, "to");
        ViewOutline viewOutline3 = new ViewOutline(viewOutline.getWidth() + ((viewOutline2.getWidth() - viewOutline.getWidth()) * f), viewOutline.getHeight() + ((viewOutline2.getHeight() - viewOutline.getHeight()) * f), viewOutline.getRadius() + (f * (viewOutline2.getRadius() - viewOutline.getRadius())));
        this.onEvaluate.invoke(viewOutline3);
        return viewOutline3;
    }
}
