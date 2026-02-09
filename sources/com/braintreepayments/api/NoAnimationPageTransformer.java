package com.braintreepayments.api;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

class NoAnimationPageTransformer implements ViewPager2.PageTransformer {
    NoAnimationPageTransformer() {
    }

    public void transformPage(View view, float f) {
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
        }
    }
}
