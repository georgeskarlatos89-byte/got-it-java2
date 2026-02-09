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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/FastImageBorderRadiusAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Landroid/widget/ImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "setInitialOutline", "", "provider", "Lcom/reactnativenavigation/utils/BorderRadiusOutlineProvider;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageBorderRadiusAnimator.kt */
public final class FastImageBorderRadiusAnimator extends PropertyAnimatorCreator<ImageView> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastImageBorderRadiusAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ImageView imageView, ImageView imageView2) {
        Intrinsics.checkNotNullParameter(imageView, "fromChild");
        Intrinsics.checkNotNullParameter(imageView2, "toChild");
        if ((imageView instanceof ReactImageView) || (imageView2 instanceof ReactImageView)) {
            return false;
        }
        if (FastImageBorderRadiusAnimator_utilitiesKt.getInheritedBorderRadius(this, getFrom()) == 0.0f) {
            if (FastImageBorderRadiusAnimator_utilitiesKt.getInheritedBorderRadius(this, getTo()) == 0.0f) {
                return false;
            }
        }
        return true;
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) from;
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) to;
        float inheritedBorderRadius = FastImageBorderRadiusAnimator_utilitiesKt.getInheritedBorderRadius(this, getFrom());
        float inheritedBorderRadius2 = FastImageBorderRadiusAnimator_utilitiesKt.getInheritedBorderRadius(this, getTo());
        BorderRadiusOutlineProvider borderRadiusOutlineProvider = new BorderRadiusOutlineProvider((ImageView) getTo(), inheritedBorderRadius);
        setInitialOutline((ImageView) getTo(), borderRadiusOutlineProvider);
        ValueAnimator ofObject = ObjectAnimator.ofObject(new CornerRadiusEvaluator(new FastImageBorderRadiusAnimator$create$1(borderRadiusOutlineProvider)), new Object[]{Float.valueOf(inheritedBorderRadius), Float.valueOf(inheritedBorderRadius2)});
        Intrinsics.checkNotNullExpressionValue(ofObject, "create$lambda$1");
        Animator animator = ofObject;
        animator.addListener(new FastImageBorderRadiusAnimator$create$lambda$1$$inlined$doOnEnd$1(this));
        Intrinsics.checkNotNullExpressionValue(ofObject, "outlineProvider = Border…ovider = null }\n        }");
        return animator;
    }

    private final void setInitialOutline(ImageView imageView, BorderRadiusOutlineProvider borderRadiusOutlineProvider) {
        imageView.setOutlineProvider(borderRadiusOutlineProvider);
        imageView.setClipToOutline(true);
        imageView.invalidateOutline();
    }
}
