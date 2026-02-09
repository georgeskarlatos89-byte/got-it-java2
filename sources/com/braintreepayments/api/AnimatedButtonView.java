package com.braintreepayments.api;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ViewAnimator;
import com.braintreepayments.api.dropin.R;

class AnimatedButtonView extends RelativeLayout implements View.OnClickListener {
    private View.OnClickListener onClickListener;
    private ViewAnimator viewAnimator;

    public AnimatedButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public AnimatedButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        if (!isInEditMode()) {
            LayoutInflater.from(getContext()).inflate(R.layout.bt_animated_button_view, this);
            this.viewAnimator = (ViewAnimator) findViewById(R.id.bt_view_animator);
            Button button = (Button) findViewById(R.id.bt_button);
            button.setOnClickListener(this);
            this.viewAnimator.setInAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.viewAnimator.setOutAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.bt_AnimatedButtonAttributes);
            button.setText(obtainStyledAttributes.getString(R.styleable.bt_AnimatedButtonAttributes_bt_buttonText));
            obtainStyledAttributes.recycle();
        }
    }

    public void onClick(View view) {
        if (!isLoading()) {
            showLoading();
            View.OnClickListener onClickListener2 = this.onClickListener;
            if (onClickListener2 != null) {
                onClickListener2.onClick(this);
            }
        }
    }

    private boolean isLoading() {
        return this.viewAnimator.getDisplayedChild() == 1;
    }

    public void showButton() {
        if (this.viewAnimator.getDisplayedChild() == 1) {
            this.viewAnimator.showPrevious();
        }
    }

    public void showLoading() {
        if (this.viewAnimator.getDisplayedChild() == 0) {
            this.viewAnimator.showNext();
        }
    }

    public void setClickListener(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }
}
