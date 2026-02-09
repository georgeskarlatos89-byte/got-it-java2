package com.braintreepayments.cardform.utils;

import android.app.Activity;
import com.braintreepayments.cardform.R;

public enum ExpirationDateDialogTheme {
    LIGHT(R.color.bt_black_87, R.color.bt_white_87, R.color.bt_black_38),
    DARK(R.color.bt_white_87, R.color.bt_black_87, R.color.bt_white_38);
    
    private final int mItemDisabledTextColor;
    private final int mItemInverseTextColor;
    private final int mItemTextColor;
    private int mResolvedItemDisabledTextColor;
    private int mResolvedItemInverseTextColor;
    private int mResolvedItemTextColor;
    private int mResolvedSelectedItemBackground;

    private ExpirationDateDialogTheme(int i, int i2, int i3) {
        this.mItemTextColor = i;
        this.mItemInverseTextColor = i2;
        this.mItemDisabledTextColor = i3;
    }

    public static ExpirationDateDialogTheme detectTheme(Activity activity) {
        ExpirationDateDialogTheme expirationDateDialogTheme;
        if (ViewUtils.isDarkBackground(activity)) {
            expirationDateDialogTheme = DARK;
        } else {
            expirationDateDialogTheme = LIGHT;
        }
        expirationDateDialogTheme.mResolvedItemTextColor = activity.getResources().getColor(expirationDateDialogTheme.mItemTextColor);
        expirationDateDialogTheme.mResolvedItemInverseTextColor = ColorUtils.getColor(activity, "textColorPrimaryInverse", expirationDateDialogTheme.mItemInverseTextColor);
        expirationDateDialogTheme.mResolvedItemDisabledTextColor = activity.getResources().getColor(expirationDateDialogTheme.mItemDisabledTextColor);
        expirationDateDialogTheme.mResolvedSelectedItemBackground = ColorUtils.getColor(activity, "colorAccent", R.color.bt_blue);
        return expirationDateDialogTheme;
    }

    public int getItemTextColor() {
        return this.mResolvedItemTextColor;
    }

    public int getItemInvertedTextColor() {
        return this.mResolvedItemInverseTextColor;
    }

    public int getItemDisabledTextColor() {
        return this.mResolvedItemDisabledTextColor;
    }

    public int getSelectedItemBackground() {
        return this.mResolvedSelectedItemBackground;
    }
}
