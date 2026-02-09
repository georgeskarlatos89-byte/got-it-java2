package com.braintreepayments.api;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

class BottomSheetPresenter {
    private static final int BACKGROUND_FADE_ANIM_DURATION = 300;
    private static final int BOTTOM_SHEET_SLIDE_ANIM_DURATION = 150;
    private static final int BOTTOM_SHEET_SLIDE_UP_DELAY = 150;
    private static final int VIEW_PAGER_TRANSITION_ANIM_DURATION = 300;
    private Animator bottomSheetSlideDownAnimator;
    private Animator bottomSheetSlideUpAnimator;
    private BottomSheetViewModel childFragmentList;
    private ViewHolder viewHolder;
    private BottomSheetViewAdapter viewPagerAdapter;
    private ViewPager2Animator viewPagerAnimator;

    interface ViewHolder {
        View getBackgroundView();

        FragmentManager getChildFragmentManager();

        DropInRequest getDropInRequest();

        Lifecycle getLifecycle();

        ViewPager2 getViewPager();

        void requestLayout();
    }

    BottomSheetPresenter() {
    }

    /* access modifiers changed from: package-private */
    public void bind(ViewHolder viewHolder2) {
        this.viewHolder = viewHolder2;
        this.childFragmentList = new BottomSheetViewModel(BottomSheetViewType.SUPPORTED_PAYMENT_METHODS);
        this.viewPagerAnimator = new ViewPager2Animator(300);
        this.viewPagerAdapter = new BottomSheetViewAdapter(viewHolder2.getChildFragmentManager(), viewHolder2.getLifecycle(), this.childFragmentList, viewHolder2.getDropInRequest());
        ViewPager2 viewPager = viewHolder2.getViewPager();
        viewPager.setUserInputEnabled(false);
        viewPager.setAdapter(this.viewPagerAdapter);
        viewPager.setPageTransformer(new NoAnimationPageTransformer());
    }

    /* access modifiers changed from: package-private */
    public void unbind() {
        this.viewHolder = null;
        this.viewPagerAdapter = null;
        this.childFragmentList = null;
    }

    /* access modifiers changed from: package-private */
    public boolean isUnbound() {
        return this.viewHolder == null;
    }

    /* access modifiers changed from: package-private */
    public BottomSheetViewType getVisibleFragment() {
        if (isUnbound()) {
            return null;
        }
        return this.childFragmentList.getItem(this.viewHolder.getViewPager().getCurrentItem());
    }

    /* access modifiers changed from: package-private */
    public void slideUpBottomSheet(final AnimationCompleteCallback animationCompleteCallback) {
        if (!isUnbound()) {
            ViewPager2 viewPager = this.viewHolder.getViewPager();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.viewHolder.getBackgroundView(), View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            float viewGroupMeasuredHeight = (float) getViewGroupMeasuredHeight(viewPager);
            viewPager.setTranslationY(viewGroupMeasuredHeight);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewPager, View.TRANSLATION_Y, new float[]{viewGroupMeasuredHeight, 0.0f});
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            ofFloat2.setDuration(150);
            ofFloat2.setStartDelay(150);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).with(ofFloat);
            animatorSet.start();
            animatorSet.addListener(new SimpleAnimatorListener() {
                public void onAnimationEnd(Animator animator) {
                    animationCompleteCallback.onAnimationComplete();
                }
            });
            this.bottomSheetSlideUpAnimator = animatorSet;
        }
    }

    /* access modifiers changed from: package-private */
    public void slideDownBottomSheet(final AnimationCompleteCallback animationCompleteCallback) {
        if (!isUnbound()) {
            ViewPager2 viewPager = this.viewHolder.getViewPager();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.viewHolder.getBackgroundView(), View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            float viewGroupMeasuredHeight = (float) getViewGroupMeasuredHeight(viewPager);
            viewPager.setTranslationY(viewGroupMeasuredHeight);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewPager, View.TRANSLATION_Y, new float[]{0.0f, viewGroupMeasuredHeight});
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.setDuration(150);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).with(ofFloat);
            animatorSet.addListener(new SimpleAnimatorListener() {
                public void onAnimationEnd(Animator animator) {
                    animationCompleteCallback.onAnimationComplete();
                }
            });
            animatorSet.start();
            this.bottomSheetSlideDownAnimator = animatorSet;
        }
    }

    /* access modifiers changed from: package-private */
    public void showVaultManager() {
        if (!isUnbound()) {
            ViewPager2 viewPager = this.viewHolder.getViewPager();
            setViewGroupHeight(viewPager, getViewGroupMeasuredHeight(viewPager));
            this.viewHolder.requestLayout();
            this.childFragmentList.add(BottomSheetViewType.VAULT_MANAGER);
            this.viewPagerAdapter.notifyDataSetChanged();
            this.viewPagerAnimator.animateToPosition(viewPager, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public void dismissVaultManager() {
        if (!isUnbound()) {
            ViewPager2 viewPager = this.viewHolder.getViewPager();
            this.viewPagerAnimator.animateToPosition(viewPager, 0, new BottomSheetPresenter$$ExternalSyntheticLambda0(this, viewPager));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$dismissVaultManager$0$com-braintreepayments-api-BottomSheetPresenter  reason: not valid java name */
    public /* synthetic */ void m335lambda$dismissVaultManager$0$combraintreepaymentsapiBottomSheetPresenter(ViewPager2 viewPager2) {
        setViewGroupHeight(viewPager2, -2);
        this.viewHolder.requestLayout();
        this.childFragmentList.remove(1);
        this.viewPagerAdapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public boolean isAnimating() {
        Animator animator = this.bottomSheetSlideUpAnimator;
        boolean z = animator != null && animator.isRunning();
        Animator animator2 = this.bottomSheetSlideDownAnimator;
        boolean z2 = animator2 != null && animator2.isRunning();
        if (z || z2) {
            return true;
        }
        return false;
    }

    private int getViewGroupMeasuredHeight(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        viewGroup.measure(layoutParams.width, layoutParams.height);
        return viewGroup.getMeasuredHeight();
    }

    private void setViewGroupHeight(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = i;
        viewGroup.setLayoutParams(layoutParams);
    }
}
