package com.reactnativenavigation.views.element.animators;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.views.image.ReactImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactImageBoundsAnimator.kt */
final class ReactImageBoundsAnimator$create$1 extends Lambda implements Function1<Rect, Unit> {
    final /* synthetic */ ReactImageBoundsAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReactImageBoundsAnimator$create$1(ReactImageBoundsAnimator reactImageBoundsAnimator) {
        super(1);
        this.this$0 = reactImageBoundsAnimator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Rect) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "it");
        View to = this.this$0.getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView = (ReactImageView) to;
        ReactImageBoundsAnimator reactImageBoundsAnimator = this.this$0;
        reactImageView.getDrawable().setBounds(rect);
        reactImageView.getDrawable().getCurrent().setBounds(rect);
        ((ReactImageView) reactImageBoundsAnimator.getTo()).setClipBounds(rect);
        reactImageView.invalidate();
    }
}
