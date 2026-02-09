package com.reactnativenavigation.views.element.animators;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/BackgroundColorAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Landroid/view/ViewGroup;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "excludedViews", "", "Ljava/lang/Class;", "Lcom/facebook/react/views/text/ReactTextView;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackgroundColorAnimator.kt */
public final class BackgroundColorAnimator extends PropertyAnimatorCreator<ViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundColorAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ViewGroup viewGroup, ViewGroup viewGroup2) {
        Intrinsics.checkNotNullParameter(viewGroup, "fromChild");
        Intrinsics.checkNotNullParameter(viewGroup2, "toChild");
        if ((viewGroup.getBackground() instanceof ReactViewBackgroundDrawable) && (viewGroup2.getBackground() instanceof ReactViewBackgroundDrawable)) {
            Drawable background = viewGroup.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewBackgroundDrawable");
            int color = ((ReactViewBackgroundDrawable) background).getColor();
            Drawable background2 = viewGroup2.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewBackgroundDrawable");
            if (color != ((ReactViewBackgroundDrawable) background2).getColor()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public List<Class<ReactTextView>> excludedViews() {
        return CollectionsKt.listOf(ReactTextView.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator create(com.reactnativenavigation.options.SharedElementTransitionOptions r5) {
        /*
            r4 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.reactnativenavigation.views.element.animators.BackgroundColorEvaluator r5 = new com.reactnativenavigation.views.element.animators.BackgroundColorEvaluator
            android.view.View r0 = r4.getTo()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewBackgroundDrawable"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            com.facebook.react.views.view.ReactViewBackgroundDrawable r0 = (com.facebook.react.views.view.ReactViewBackgroundDrawable) r0
            r5.<init>(r0)
            android.view.View r0 = r4.getFrom()
            int r0 = com.reactnativenavigation.utils.ViewUtils.getBackgroundColor(r0)
            double[] r0 = com.reactnativenavigation.utils.ColorUtils.colorToLAB(r0)
            android.view.View r1 = r4.getTo()
            int r1 = com.reactnativenavigation.utils.ViewUtils.getBackgroundColor(r1)
            double[] r1 = com.reactnativenavigation.utils.ColorUtils.colorToLAB(r1)
            java.lang.String r2 = "fromColor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = "toColor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r5.evaluate((float) r2, (double[]) r0, (double[]) r1)
            android.animation.TypeEvaluator r5 = (android.animation.TypeEvaluator) r5
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            android.animation.ValueAnimator r5 = android.animation.ObjectAnimator.ofObject(r5, r2)
            java.lang.String r0 = "ofObject(backgroundColor…ator, fromColor, toColor)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            android.animation.Animator r5 = (android.animation.Animator) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.views.element.animators.BackgroundColorAnimator.create(com.reactnativenavigation.options.SharedElementTransitionOptions):android.animation.Animator");
    }
}
