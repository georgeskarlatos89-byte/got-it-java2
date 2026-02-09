package com.reactnativenavigation.viewcontrollers.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.reactnativenavigation.utils.UiUtils;

public class BaseAnimator {
    private static final TimeInterpolator ACCELERATE_DECELERATE = new AccelerateDecelerateInterpolator();
    private static final TimeInterpolator DECELERATE = new DecelerateInterpolator();
    private static final int DURATION = 300;
    private final float translationY;

    public BaseAnimator(Context context) {
        this.translationY = UiUtils.getWindowHeight(context);
    }

    public AnimatorSet getDefaultPushAnimation(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(DECELERATE);
        animatorSet.setDuration(300);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{this.translationY, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat2.setDuration(300);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    public AnimatorSet getDefaultPopAnimation(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(ACCELERATE_DECELERATE);
        animatorSet.setDuration(300);
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, this.translationY}), ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f})});
        return animatorSet;
    }

    public AnimatorSet getDefaultSetStackRootAnimation(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(DECELERATE);
        animatorSet.setDuration(300);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{this.translationY, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat2.setDuration(300);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }
}
