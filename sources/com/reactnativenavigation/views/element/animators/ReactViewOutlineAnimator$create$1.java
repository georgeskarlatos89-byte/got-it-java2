package com.reactnativenavigation.views.element.animators;

import com.reactnativenavigation.utils.OutlineProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/reactnativenavigation/views/element/animators/ViewOutline;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactViewOutlineAnimator.kt */
final class ReactViewOutlineAnimator$create$1 extends Lambda implements Function1<ViewOutline, Unit> {
    final /* synthetic */ OutlineProvider $outlineProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReactViewOutlineAnimator$create$1(OutlineProvider outlineProvider) {
        super(1);
        this.$outlineProvider = outlineProvider;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ViewOutline) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ViewOutline viewOutline) {
        Intrinsics.checkNotNullParameter(viewOutline, "it");
        this.$outlineProvider.update(viewOutline);
    }
}
