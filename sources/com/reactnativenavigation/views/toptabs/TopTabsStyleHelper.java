package com.reactnativenavigation.views.toptabs;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.utils.ViewUtils;

class TopTabsStyleHelper {
    private TopTabs topTabs;

    TopTabsStyleHelper(TopTabs topTabs2) {
        this.topTabs = topTabs2;
    }

    /* access modifiers changed from: package-private */
    public void applyTopTabsFontSize(Number number) {
        if (number.hasValue()) {
            for (int i = 0; i < this.topTabs.getTabCount(); i++) {
                applyOnTabTitle(i, new TopTabsStyleHelper$$ExternalSyntheticLambda1(number));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void applyTopTabsColors(ThemeColour themeColour, ThemeColour themeColour2) {
        ColorStateList tabTextColors = this.topTabs.getTabTextColors();
        int i = -1;
        int colorForState = tabTextColors != null ? tabTextColors.getColorForState(this.topTabs.getSelectedTabColors(), -1) : -1;
        if (tabTextColors != null) {
            i = tabTextColors.getColorForState(this.topTabs.getDefaultTabColors(), -1);
        }
        if (themeColour.hasValue()) {
            colorForState = themeColour.get();
        }
        if (themeColour2.hasValue()) {
            i = themeColour2.get();
        }
        this.topTabs.setTabTextColors(i, colorForState);
    }

    /* access modifiers changed from: package-private */
    public void setFontFamily(int i, Typeface typeface) {
        applyOnTabTitle(i, new TopTabsStyleHelper$$ExternalSyntheticLambda0(typeface));
    }

    private void applyOnTabTitle(int i, Functions.Func1<TextView> func1) {
        TextView textView = (TextView) ViewUtils.findChildByClass(getTabView(i), TextView.class);
        if (textView != null) {
            func1.run(textView);
        }
    }

    private ViewGroup getTabView(int i) {
        return (ViewGroup) ((ViewGroup) this.topTabs.getChildAt(0)).getChildAt(i);
    }
}
