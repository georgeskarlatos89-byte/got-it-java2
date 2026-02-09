package com.reactnativenavigation.views.element.animators;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageBoundsAnimator.kt */
final class FastImageBoundsAnimator$create$1 extends Lambda implements Function1<Rect, Unit> {
    final /* synthetic */ FastImageBoundsAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FastImageBoundsAnimator$create$1(FastImageBoundsAnimator fastImageBoundsAnimator) {
        super(1);
        this.this$0 = fastImageBoundsAnimator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Rect) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "it");
        this.this$0.getTo().setClipBounds(rect);
        this.this$0.getTo().invalidate();
    }
}
