package com.reactnativenavigation.views.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.animations.ViewAnimationOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003=>?B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010%J\"\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/J\"\u00100\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/J\"\u00101\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/J(\u00102\u001a\u00020(2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0016J\u0006\u00107\u001a\u00020\u0018J\u0006\u00108\u001a\u00020\u0018J\b\u00109\u001a\u00020(H\u0016J\b\u0010:\u001a\u00020(H\u0016J\u001a\u0010;\u001a\u00020(2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010<\u001a\u00020/R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R,\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8\u0006@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R,\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0018\u0010!\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lcom/reactnativenavigation/views/animations/BaseViewAnimator;", "T", "Landroid/view/View;", "", "hideDirection", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator$HideDirection;", "view", "defaultAnimatorCreator", "Lcom/reactnativenavigation/views/animations/ViewAnimatorCreator;", "(Lcom/reactnativenavigation/views/animations/BaseViewAnimator$HideDirection;Landroid/view/View;Lcom/reactnativenavigation/views/animations/ViewAnimatorCreator;)V", "animationState", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimationState;", "value", "Landroid/animation/Animator;", "hideAnimator", "getHideAnimator$annotations", "()V", "getHideAnimator", "()Landroid/animation/Animator;", "setHideAnimator", "(Landroid/animation/Animator;)V", "hideAnimatorListener", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimatorListener;", "isFullyHidden", "", "()Z", "isFullyVisible", "isOrWillBeHidden", "isOrWillBeVisible", "showAnimator", "getShowAnimator$annotations", "getShowAnimator", "setShowAnimator", "showAnimatorListener", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/view/View;", "bindView", "", "getPopAnimation", "animation", "Lcom/reactnativenavigation/options/animations/ViewAnimationOptions;", "visible", "Lcom/reactnativenavigation/options/params/Bool;", "additionalDy", "", "getPushAnimation", "getSetStackRootAnimation", "hide", "options", "Lcom/reactnativenavigation/options/AnimationOptions;", "onAnimationEnd", "Ljava/lang/Runnable;", "isAnimatingHide", "isAnimatingShow", "onHideAnimationEnd", "onShowAnimationEnd", "show", "translationStartDy", "AnimationState", "AnimatorListener", "HideDirection", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BaseViewAnimator.kt */
public class BaseViewAnimator<T extends View> {
    /* access modifiers changed from: private */
    public AnimationState animationState;
    private final ViewAnimatorCreator defaultAnimatorCreator;
    private Animator hideAnimator;
    private final BaseViewAnimator<T>.AnimatorListener hideAnimatorListener;
    private final HideDirection hideDirection;
    private Animator showAnimator;
    private final BaseViewAnimator<T>.AnimatorListener showAnimatorListener;
    protected T view;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimationState;", "", "(Ljava/lang/String;I)V", "Idle", "AnimatingEnter", "AnimatingExit", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: BaseViewAnimator.kt */
    private enum AnimationState {
        Idle,
        AnimatingEnter,
        AnimatingExit
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/reactnativenavigation/views/animations/BaseViewAnimator$HideDirection;", "", "(Ljava/lang/String;I)V", "Up", "Down", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: BaseViewAnimator.kt */
    public enum HideDirection {
        Up,
        Down
    }

    public static /* synthetic */ void getHideAnimator$annotations() {
    }

    public static /* synthetic */ void getShowAnimator$annotations() {
    }

    public void onHideAnimationEnd() {
    }

    public void onShowAnimationEnd() {
    }

    public BaseViewAnimator(HideDirection hideDirection2, T t, ViewAnimatorCreator viewAnimatorCreator) {
        Intrinsics.checkNotNullParameter(hideDirection2, "hideDirection");
        Intrinsics.checkNotNullParameter(viewAnimatorCreator, "defaultAnimatorCreator");
        this.hideDirection = hideDirection2;
        this.defaultAnimatorCreator = viewAnimatorCreator;
        this.showAnimator = new AnimatorSet();
        this.hideAnimator = new AnimatorSet();
        this.showAnimatorListener = new AnimatorListener(this, AnimationState.AnimatingEnter, 0);
        this.hideAnimatorListener = new AnimatorListener(this, AnimationState.AnimatingExit, 8);
        this.animationState = AnimationState.Idle;
        if (t != null) {
            setView(t);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseViewAnimator(HideDirection hideDirection2, View view2, ViewAnimatorCreator viewAnimatorCreator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hideDirection2, (i & 2) != 0 ? null : view2, (i & 4) != 0 ? new DefaultViewAnimatorCreator() : viewAnimatorCreator);
    }

    /* access modifiers changed from: protected */
    public final T getView() {
        T t = this.view;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ViewHierarchyConstants.VIEW_KEY);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void setView(T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.view = t;
    }

    public final Animator getShowAnimator() {
        return this.showAnimator;
    }

    private final void setShowAnimator(Animator animator) {
        this.showAnimator = animator;
        animator.addListener(this.showAnimatorListener);
        this.showAnimator.addListener(new BaseViewAnimator$special$$inlined$doOnEnd$1(this));
    }

    public final Animator getHideAnimator() {
        return this.hideAnimator;
    }

    public final void setHideAnimator(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "value");
        this.hideAnimator = animator;
        animator.addListener(this.hideAnimatorListener);
        this.hideAnimator.addListener(new BaseViewAnimator$special$$inlined$doOnEnd$2(this));
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "startState", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimationState;", "endVisibility", "", "(Lcom/reactnativenavigation/views/animations/BaseViewAnimator;Lcom/reactnativenavigation/views/animations/BaseViewAnimator$AnimationState;I)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: BaseViewAnimator.kt */
    private final class AnimatorListener extends AnimatorListenerAdapter {
        private final int endVisibility;
        private boolean isCancelled;
        private final AnimationState startState;
        final /* synthetic */ BaseViewAnimator<T> this$0;

        public AnimatorListener(BaseViewAnimator baseViewAnimator, AnimationState animationState, int i) {
            Intrinsics.checkNotNullParameter(animationState, "startState");
            this.this$0 = baseViewAnimator;
            this.startState = animationState;
            this.endVisibility = i;
        }

        public final boolean isCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z) {
            this.isCancelled = z;
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            ViewExtensionsKt.resetViewProperties(this.this$0.getView());
            this.this$0.getView().setVisibility(0);
            this.this$0.animationState = this.startState;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            this.isCancelled = true;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            if (!this.isCancelled) {
                this.this$0.animationState = AnimationState.Idle;
                this.this$0.getView().setVisibility(this.endVisibility);
            }
        }
    }

    private final boolean isOrWillBeVisible() {
        return isFullyVisible() || this.animationState == AnimationState.AnimatingEnter;
    }

    private final boolean isFullyVisible() {
        return getView().getVisibility() == 0 && this.animationState == AnimationState.Idle;
    }

    public final boolean isOrWillBeHidden() {
        return isFullyHidden() || this.animationState == AnimationState.AnimatingExit;
    }

    private final boolean isFullyHidden() {
        return getView().getVisibility() == 8 && this.animationState == AnimationState.Idle;
    }

    public void bindView(T t) {
        Intrinsics.checkNotNullParameter(t, ViewHierarchyConstants.VIEW_KEY);
        setView(t);
    }

    public final boolean isAnimatingHide() {
        return this.hideAnimator.isRunning();
    }

    public final boolean isAnimatingShow() {
        return this.showAnimator.isRunning();
    }

    public static /* synthetic */ Animator getPushAnimation$default(BaseViewAnimator baseViewAnimator, ViewAnimationOptions viewAnimationOptions, Bool bool, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return baseViewAnimator.getPushAnimation(viewAnimationOptions, bool, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPushAnimation");
    }

    public final Animator getPushAnimation(ViewAnimationOptions viewAnimationOptions, Bool bool, float f) {
        Intrinsics.checkNotNullParameter(viewAnimationOptions, "animation");
        Intrinsics.checkNotNullParameter(bool, ViewProps.VISIBLE);
        if (isOrWillBeVisible() && bool.isFalse()) {
            this.showAnimator.cancel();
            setHideAnimator(viewAnimationOptions.exit.getAnimation(getView(), this.defaultAnimatorCreator.getHideAnimator(getView(), this.hideDirection, f)));
            return this.hideAnimator;
        } else if (!isOrWillBeHidden() || !bool.isTrueOrUndefined()) {
            return null;
        } else {
            this.hideAnimator.cancel();
            setShowAnimator(viewAnimationOptions.enter.getAnimation(getView(), this.defaultAnimatorCreator.getShowAnimator(getView(), this.hideDirection, f)));
            return this.showAnimator;
        }
    }

    public static /* synthetic */ Animator getPopAnimation$default(BaseViewAnimator baseViewAnimator, ViewAnimationOptions viewAnimationOptions, Bool bool, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return baseViewAnimator.getPopAnimation(viewAnimationOptions, bool, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPopAnimation");
    }

    public final Animator getPopAnimation(ViewAnimationOptions viewAnimationOptions, Bool bool, float f) {
        Intrinsics.checkNotNullParameter(viewAnimationOptions, "animation");
        Intrinsics.checkNotNullParameter(bool, ViewProps.VISIBLE);
        if (isOrWillBeVisible() && bool.isFalse()) {
            this.showAnimator.cancel();
            setHideAnimator(viewAnimationOptions.exit.getAnimation(getView(), this.defaultAnimatorCreator.getHideAnimator(getView(), this.hideDirection, f)));
            return this.hideAnimator;
        } else if (!isOrWillBeHidden() || !bool.isTrueOrUndefined()) {
            return null;
        } else {
            this.hideAnimator.cancel();
            setShowAnimator(viewAnimationOptions.enter.getAnimation(getView(), this.defaultAnimatorCreator.getShowAnimator(getView(), this.hideDirection, f)));
            return this.showAnimator;
        }
    }

    public static /* synthetic */ Animator getSetStackRootAnimation$default(BaseViewAnimator baseViewAnimator, ViewAnimationOptions viewAnimationOptions, Bool bool, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return baseViewAnimator.getSetStackRootAnimation(viewAnimationOptions, bool, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSetStackRootAnimation");
    }

    public final Animator getSetStackRootAnimation(ViewAnimationOptions viewAnimationOptions, Bool bool, float f) {
        Intrinsics.checkNotNullParameter(viewAnimationOptions, "animation");
        Intrinsics.checkNotNullParameter(bool, ViewProps.VISIBLE);
        if (isOrWillBeVisible() && bool.isFalse()) {
            this.showAnimator.cancel();
            setHideAnimator(viewAnimationOptions.exit.getAnimation(getView(), this.defaultAnimatorCreator.getHideAnimator(getView(), this.hideDirection, f)));
            return this.hideAnimator;
        } else if (!isOrWillBeHidden() || !bool.isTrueOrUndefined()) {
            return null;
        } else {
            this.hideAnimator.cancel();
            setShowAnimator(viewAnimationOptions.enter.getAnimation(getView(), this.defaultAnimatorCreator.getShowAnimator(getView(), this.hideDirection, f)));
            return this.showAnimator;
        }
    }

    public static /* synthetic */ void show$default(BaseViewAnimator baseViewAnimator, AnimationOptions animationOptions, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                animationOptions = new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            baseViewAnimator.show(animationOptions, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
    }

    public final void show(AnimationOptions animationOptions, float f) {
        Animator animator;
        Intrinsics.checkNotNullParameter(animationOptions, "options");
        if (!isOrWillBeVisible()) {
            if (animationOptions.hasValue()) {
                animationOptions.setValueDy(View.TRANSLATION_Y, -f, 0.0f);
                animator = animationOptions.getAnimation(getView());
            } else {
                animator = this.defaultAnimatorCreator.getShowAnimator(getView(), this.hideDirection, f);
            }
            setShowAnimator(animator);
            this.hideAnimator.cancel();
            this.showAnimator.start();
        }
    }

    public static /* synthetic */ void hide$default(BaseViewAnimator baseViewAnimator, AnimationOptions animationOptions, float f, Runnable runnable, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                animationOptions = new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                runnable = null;
            }
            baseViewAnimator.hide(animationOptions, f, runnable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
    }

    public void hide(AnimationOptions animationOptions, float f, Runnable runnable) {
        Animator animator;
        Intrinsics.checkNotNullParameter(animationOptions, "options");
        if (!isOrWillBeHidden()) {
            if (animationOptions.hasValue()) {
                animationOptions.setValueDy(View.TRANSLATION_Y, 0.0f, -f);
                animator = animationOptions.getAnimation(getView());
            } else {
                animator = this.defaultAnimatorCreator.getHideAnimator(getView(), this.hideDirection, f);
            }
            setHideAnimator(animator);
            this.showAnimator.cancel();
            Animator animator2 = this.hideAnimator;
            animator2.addListener(new BaseViewAnimator$hide$lambda$4$$inlined$doOnEnd$1(runnable));
            animator2.start();
        }
    }
}
