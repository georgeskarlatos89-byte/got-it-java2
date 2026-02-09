package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ImageUtilsKt;
import com.reactnativenavigation.utils.Scale;
import com.reactnativenavigation.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/FastImageBoundsAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Landroid/widget/ImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageBoundsAnimator.kt */
public final class FastImageBoundsAnimator extends PropertyAnimatorCreator<ImageView> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastImageBoundsAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ImageView imageView, ImageView imageView2) {
        Intrinsics.checkNotNullParameter(imageView, "fromChild");
        Intrinsics.checkNotNullParameter(imageView2, "toChild");
        return !ViewUtils.areDimensionsEqual(getFrom(), getTo()) && !(imageView instanceof ReactImageView) && !(imageView2 instanceof ReactImageView);
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        Rect rect = new Rect();
        getFrom().getDrawingRect(rect);
        Rect rect2 = new Rect();
        getTo().getDrawingRect(rect2);
        Scale computeInheritedScale = ImageUtilsKt.computeInheritedScale(getFrom());
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        rect.right = MathKt.roundToInt(((float) rect.right) * component1);
        rect.bottom = MathKt.roundToInt(((float) rect.bottom) * component2);
        ValueAnimator ofObject = ObjectAnimator.ofObject(new BoundsEvaluator(new FastImageBoundsAnimator$create$1(this)), new Object[]{rect, rect2});
        Intrinsics.checkNotNullExpressionValue(ofObject, "override fun create(opti…awingRect\n        )\n    }");
        return ofObject;
    }
}
