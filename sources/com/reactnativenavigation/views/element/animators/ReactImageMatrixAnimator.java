package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0014¨\u0006\u0019"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/ReactImageMatrixAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/image/ReactImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "calculateBounds", "Landroid/graphics/Rect;", "view", "parentScaleX", "", "parentScaleY", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "getScaleType", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "child", "scaleType", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactImageMatrixAnimator.kt */
public final class ReactImageMatrixAnimator extends PropertyAnimatorCreator<ReactImageView> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactImageMatrixAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactImageView reactImageView, ReactImageView reactImageView2) {
        Intrinsics.checkNotNullParameter(reactImageView, "fromChild");
        Intrinsics.checkNotNullParameter(reactImageView2, "toChild");
        return !ViewUtils.areDimensionsEqual(getFrom(), getTo());
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView = (ReactImageView) from;
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView2 = (ReactImageView) to;
        ((GenericDraweeHierarchy) ((ReactImageView) getTo()).getHierarchy()).setFadeDuration(0);
        ViewParent parent = ((ReactImageView) getFrom()).getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        float scaleX = ((View) parent).getScaleX();
        ViewParent parent2 = ((ReactImageView) getFrom()).getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.View");
        float scaleY = ((View) parent2).getScaleY();
        Rect calculateBounds = calculateBounds(getFrom(), scaleX, scaleY);
        ((GenericDraweeHierarchy) reactImageView2.getHierarchy()).setActualImageScaleType(new ScalingUtils.InterpolatingScaleType(getScaleType(getFrom()), getScaleType(getTo()), calculateBounds, calculateBounds$default(this, getTo(), 0.0f, 0.0f, 6, (Object) null), new PointF((((float) ((ReactImageView) getFrom()).getWidth()) * scaleX) / 2.0f, (((float) ((ReactImageView) getFrom()).getHeight()) * scaleY) / 2.0f), new PointF(((float) ((ReactImageView) getTo()).getWidth()) / 2.0f, ((float) ((ReactImageView) getTo()).getHeight()) / 2.0f)));
        ((ReactImageView) getTo()).getLayoutParams().width = Math.max(((ReactImageView) getFrom()).getWidth(), ((ReactImageView) getTo()).getWidth());
        ((ReactImageView) getTo()).getLayoutParams().height = Math.max(((ReactImageView) getFrom()).getHeight(), ((ReactImageView) getTo()).getHeight());
        ValueAnimator ofObject = ObjectAnimator.ofObject(new ReactImageMatrixAnimator$$ExternalSyntheticLambda0(reactImageView2, this), new Object[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
        Intrinsics.checkNotNullExpressionValue(ofObject, "ofObject({ fraction: Flo…ll\n            }, 0f, 1f)");
        return ofObject;
    }

    /* access modifiers changed from: private */
    public static final Object create$lambda$3$lambda$2(ReactImageView reactImageView, ReactImageMatrixAnimator reactImageMatrixAnimator, float f, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(reactImageView, "$this_with");
        Intrinsics.checkNotNullParameter(reactImageMatrixAnimator, "this$0");
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 2>");
        if (((GenericDraweeHierarchy) reactImageView.getHierarchy()).getActualImageScaleType() != null) {
            ScalingUtils.ScaleType actualImageScaleType = ((GenericDraweeHierarchy) reactImageView.getHierarchy()).getActualImageScaleType();
            ScalingUtils.InterpolatingScaleType interpolatingScaleType = actualImageScaleType instanceof ScalingUtils.InterpolatingScaleType ? (ScalingUtils.InterpolatingScaleType) actualImageScaleType : null;
            if (interpolatingScaleType != null) {
                interpolatingScaleType.setValue(f);
                reactImageMatrixAnimator.getTo().invalidate();
            }
        }
        return null;
    }

    private final ScalingUtils.ScaleType getScaleType(View view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.facebook.react.views.image.ReactImageView");
        ReactImageView reactImageView = (ReactImageView) view;
        ScalingUtils.ScaleType actualImageScaleType = ((GenericDraweeHierarchy) reactImageView.getHierarchy()).getActualImageScaleType();
        if (actualImageScaleType == null) {
            actualImageScaleType = ImageResizeMode.defaultValue();
        }
        Intrinsics.checkNotNullExpressionValue(actualImageScaleType, "child.hierarchy.actualIm…ResizeMode.defaultValue()");
        return getScaleType(reactImageView, actualImageScaleType);
    }

    private final ScalingUtils.ScaleType getScaleType(ReactImageView reactImageView, ScalingUtils.ScaleType scaleType) {
        if (!(scaleType instanceof ScalingUtils.InterpolatingScaleType)) {
            return scaleType;
        }
        ScalingUtils.ScaleType scaleTypeTo = ((ScalingUtils.InterpolatingScaleType) scaleType).getScaleTypeTo();
        Intrinsics.checkNotNullExpressionValue(scaleTypeTo, "scaleType.scaleTypeTo");
        return getScaleType(reactImageView, scaleTypeTo);
    }

    static /* synthetic */ Rect calculateBounds$default(ReactImageMatrixAnimator reactImageMatrixAnimator, View view, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        return reactImageMatrixAnimator.calculateBounds(view, f, f2);
    }

    private final Rect calculateBounds(View view, float f, float f2) {
        return new Rect(0, 0, MathKt.roundToInt(((float) view.getWidth()) * f), MathKt.roundToInt(((float) view.getHeight()) * f2));
    }
}
