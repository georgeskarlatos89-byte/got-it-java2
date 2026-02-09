package com.reactnativenavigation.viewcontrollers.viewcontroller;

import android.view.View;
import android.view.ViewGroup;

public class YellowBoxHelper {
    /* access modifiers changed from: package-private */
    public boolean isYellowBox(View view, View view2) {
        return (view instanceof ViewGroup) && (view2 instanceof ViewGroup) && ((ViewGroup) view).indexOfChild(view2) >= 1;
    }
}
