package com.reactnativenavigation.views.element.animators;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J \u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/BoundsEvaluator;", "Landroid/animation/TypeEvaluator;", "Landroid/graphics/Rect;", "onEvaluate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "fromHeight", "", "fromWidth", "result", "toHeight", "toWidth", "evaluate", "ratio", "", "from", "to", "sync", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BoundsEvaluator.kt */
public final class BoundsEvaluator implements TypeEvaluator<Rect> {
    private int fromHeight;
    private int fromWidth;
    private final Function1<Rect, Unit> onEvaluate;
    private final Rect result = new Rect();
    private int toHeight;
    private int toWidth;

    public BoundsEvaluator(Function1<? super Rect, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onEvaluate");
        this.onEvaluate = function1;
    }

    public Rect evaluate(float f, Rect rect, Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(rect2, "to");
        sync(rect, rect2);
        Rect rect3 = this.result;
        int i = this.fromWidth;
        rect3.right = (int) (((float) i) + (((float) (this.toWidth - i)) * f));
        Rect rect4 = this.result;
        int i2 = this.fromHeight;
        rect4.bottom = (int) (((float) i2) + (((float) (this.toHeight - i2)) * f));
        this.onEvaluate.invoke(this.result);
        return this.result;
    }

    private final void sync(Rect rect, Rect rect2) {
        this.fromWidth = rect.right;
        this.fromHeight = rect.bottom;
        this.toWidth = rect2.right;
        this.toHeight = rect2.bottom;
    }
}
