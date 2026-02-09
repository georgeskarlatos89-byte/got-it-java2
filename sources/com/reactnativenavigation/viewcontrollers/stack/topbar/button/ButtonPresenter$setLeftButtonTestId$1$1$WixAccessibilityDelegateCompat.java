package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonPresenter$setLeftButtonTestId$1$1$WixAccessibilityDelegateCompat", "Landroidx/core/view/AccessibilityDelegateCompat;", "()V", "onInitializeAccessibilityNodeInfo", "", "host", "Landroid/view/View;", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonPresenter.kt */
public final class ButtonPresenter$setLeftButtonTestId$1$1$WixAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat, "info");
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String str = (String) view.getTag();
        if (str != null) {
            accessibilityNodeInfoCompat.setViewIdResourceName(str);
        }
    }
}
