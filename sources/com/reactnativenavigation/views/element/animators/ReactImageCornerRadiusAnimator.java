package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.BorderRadiusOutlineProvider;
import com.reactnativenavigation.utils.ReactImageViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¨\u0006\u0014"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/ReactImageCornerRadiusAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/image/ReactImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "setInitialCornerRadiusAfterAnimatorIsCreated", "", "setInitialOutline", "provider", "Lcom/reactnativenavigation/utils/BorderRadiusOutlineProvider;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactImageCornerRadiusAnimator.kt */
public final class ReactImageCornerRadiusAnimator extends PropertyAnimatorCreator<ReactImageView> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactImageCornerRadiusAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactImageView reactImageView, ReactImageView reactImageView2) {
        Intrinsics.checkNotNullParameter(reactImageView, "fromChild");
        Intrinsics.checkNotNullParameter(reactImageView2, "toChild");
        return !((ReactImageViewKt.getCornerRadius(reactImageView) > ReactImageViewKt.getCornerRadius(reactImageView2) ? 1 : (ReactImageViewKt.getCornerRadius(reactImageView) == ReactImageViewKt.getCornerRadius(reactImageView2) ? 0 : -1)) == 0);
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView = (ReactImageView) to;
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView2 = (ReactImageView) from;
        BorderRadiusOutlineProvider borderRadiusOutlineProvider = new BorderRadiusOutlineProvider((ImageView) getTo(), ReactImageViewKt.getCornerRadius((ReactImageView) getFrom()));
        setInitialOutline((ReactImageView) getTo(), borderRadiusOutlineProvider);
        ValueAnimator ofObject = ObjectAnimator.ofObject(new CornerRadiusEvaluator(new ReactImageCornerRadiusAnimator$create$1(borderRadiusOutlineProvider)), new Object[]{Float.valueOf(ReactImageViewKt.getCornerRadius((ReactImageView) getFrom())), Float.valueOf(ReactImageViewKt.getCornerRadius((ReactImageView) getTo()))});
        setInitialCornerRadiusAfterAnimatorIsCreated((ReactImageView) getTo(), (ReactImageView) getFrom());
        Intrinsics.checkNotNullExpressionValue(ofObject, "create$lambda$1");
        Animator animator = ofObject;
        animator.addListener(new ReactImageCornerRadiusAnimator$create$lambda$1$$inlined$doOnEnd$1(this, borderRadiusOutlineProvider));
        Intrinsics.checkNotNullExpressionValue(ofObject, "outlineProvider = Border…vider.radius) }\n        }");
        return animator;
    }

    private final void setInitialOutline(ReactImageView reactImageView, BorderRadiusOutlineProvider borderRadiusOutlineProvider) {
        reactImageView.setOutlineProvider(borderRadiusOutlineProvider);
        reactImageView.setClipToOutline(true);
        reactImageView.invalidateOutline();
    }

    private final void setInitialCornerRadiusAfterAnimatorIsCreated(ReactImageView reactImageView, ReactImageView reactImageView2) {
        reactImageView.setFadeDuration(0);
        reactImageView.setBorderRadius(Math.min(ReactImageViewKt.getCornerRadius(reactImageView2), ReactImageViewKt.getCornerRadius(reactImageView)));
        reactImageView.maybeUpdateView();
    }
}
