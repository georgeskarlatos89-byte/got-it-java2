package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.ReactTextView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ViewUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/YAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Landroid/view/View;", "from", "to", "(Landroid/view/View;Landroid/view/View;)V", "dy", "", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "excludedViews", "", "Ljava/lang/Class;", "Lcom/facebook/react/views/text/ReactTextView;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: YAnimator.kt */
public final class YAnimator extends PropertyAnimatorCreator<View> {
    private final int dy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
        Point locationOnScreen = ViewUtils.getLocationOnScreen(view);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.dy = locationOnScreen.y - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(View view, View view2) {
        Intrinsics.checkNotNullParameter(view, "fromChild");
        Intrinsics.checkNotNullParameter(view2, "toChild");
        return this.dy != 0;
    }

    /* access modifiers changed from: protected */
    public List<Class<ReactTextView>> excludedViews() {
        return CollectionsKt.listOf(ReactTextView.class);
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        getTo().setTranslationY((float) this.dy);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getTo(), View.TRANSLATION_Y, new float[]{(float) this.dy, 0.0f});
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(to, TRANSLATION_Y, dy.toFloat(), 0f)");
        return ofFloat;
    }
}
