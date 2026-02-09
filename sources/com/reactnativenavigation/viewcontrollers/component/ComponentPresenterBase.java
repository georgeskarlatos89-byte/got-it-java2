package com.reactnativenavigation.viewcontrollers.component;

import android.view.View;
import android.view.ViewGroup;

public class ComponentPresenterBase {
    public void applyTopInsets(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if ((view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null && marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.requestLayout();
        }
    }

    public void applyBottomInset(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if ((view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null && marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            view.requestLayout();
        }
    }
}
