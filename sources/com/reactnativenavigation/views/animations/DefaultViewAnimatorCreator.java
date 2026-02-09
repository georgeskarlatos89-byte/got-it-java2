package com.reactnativenavigation.views.animations;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.views.animations.BaseViewAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/reactnativenavigation/views/animations/DefaultViewAnimatorCreator;", "Lcom/reactnativenavigation/views/animations/ViewAnimatorCreator;", "()V", "getHideAnimator", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "hideDirection", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator$HideDirection;", "additionalDy", "", "getShowAnimator", "translationStart", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DefaultViewAnimatorCreator.kt */
public final class DefaultViewAnimatorCreator implements ViewAnimatorCreator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long DURATION = 300;
    private static final FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/views/animations/DefaultViewAnimatorCreator$Companion;", "", "()V", "DURATION", "", "fastOutSlowInInterpolator", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DefaultViewAnimatorCreator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Animator getShowAnimator(View view, BaseViewAnimator.HideDirection hideDirection, float f) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(hideDirection, "hideDirection");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{((float) (hideDirection == BaseViewAnimator.HideDirection.Up ? 1 : -1)) * (((float) (-ViewUtils.getHeight(view))) - f), 0.0f});
        ofFloat.setInterpolator(fastOutSlowInInterpolator);
        ofFloat.setDuration(DURATION);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(\n               …tion = DURATION\n        }");
        return ofFloat;
    }

    public Animator getHideAnimator(View view, BaseViewAnimator.HideDirection hideDirection, float f) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(hideDirection, "hideDirection");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{view.getTranslationY(), ((float) (hideDirection == BaseViewAnimator.HideDirection.Up ? -1 : 1)) * (((float) view.getMeasuredHeight()) + f)});
        ofFloat.setInterpolator(fastOutSlowInInterpolator);
        ofFloat.setDuration(DURATION);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(\n               …tion = DURATION\n        }");
        return ofFloat;
    }
}
