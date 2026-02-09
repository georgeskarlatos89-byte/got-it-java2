package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.views.text.ReactTextView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.TextViewUtils;
import com.reactnativenavigation.utils.ViewUtils;
import com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/TextChangeAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/text/ReactTextView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextChangeAnimator.kt */
public final class TextChangeAnimator extends PropertyAnimatorCreator<ReactTextView> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextChangeAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactTextView reactTextView, ReactTextView reactTextView2) {
        Intrinsics.checkNotNullParameter(reactTextView, "fromChild");
        Intrinsics.checkNotNullParameter(reactTextView2, "toChild");
        Point locationOnScreen = ViewUtils.getLocationOnScreen(getFrom());
        Point locationOnScreen2 = ViewUtils.getLocationOnScreen(getTo());
        if (!Intrinsics.areEqual((Object) reactTextView.getText().toString(), (Object) reactTextView2.getText().toString())) {
            return false;
        }
        if (!(TextViewUtils.getTextSize(reactTextView) == TextViewUtils.getTextSize(reactTextView2)) || !locationOnScreen.equals(locationOnScreen2.x, locationOnScreen2.y)) {
            return true;
        }
        return false;
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type android.widget.TextView");
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type android.widget.TextView");
        Animator buildAnimator = new ReflowTextAnimatorHelper.Builder((TextView) from, (TextView) to).calculateDuration(false).setBoundsCalculator(new TextChangeAnimator$$ExternalSyntheticLambda0(this)).setTextColorGetter(new TextChangeAnimator$$ExternalSyntheticLambda1()).buildAnimator();
        Intrinsics.checkNotNullExpressionValue(buildAnimator, "Builder(from as TextView…        }.buildAnimator()");
        return buildAnimator;
    }

    /* access modifiers changed from: private */
    public static final Rect create$lambda$0(TextChangeAnimator textChangeAnimator, View view) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(textChangeAnimator, "this$0");
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (Intrinsics.areEqual((Object) view, (Object) textChangeAnimator.getTo())) {
            ViewGroup.LayoutParams layoutParams = ((TextView) textChangeAnimator.getTo()).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        } else {
            i = iArr[0];
        }
        if (Intrinsics.areEqual((Object) view, (Object) textChangeAnimator.getTo())) {
            ViewGroup.LayoutParams layoutParams2 = ((TextView) textChangeAnimator.getTo()).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        } else {
            i2 = iArr[1];
        }
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* access modifiers changed from: private */
    public static final int create$lambda$1(TextView textView) {
        return TextViewUtils.getTextColor(textView);
    }
}
