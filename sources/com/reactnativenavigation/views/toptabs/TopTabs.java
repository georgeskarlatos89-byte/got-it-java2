package com.reactnativenavigation.views.toptabs;

import android.content.Context;
import android.graphics.Typeface;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import com.reactnativenavigation.views.stack.topbar.TopBar;

public class TopTabs extends TabLayout {
    private final TopTabsStyleHelper styleHelper = new TopTabsStyleHelper(this);

    public TopTabs(Context context) {
        super(context);
    }

    public void setFontFamily(int i, Typeface typeface) {
        this.styleHelper.setFontFamily(i, typeface);
    }

    public int[] getSelectedTabColors() {
        return SELECTED_STATE_SET;
    }

    public int[] getDefaultTabColors() {
        return EMPTY_STATE_SET;
    }

    public void applyTopTabsColors(ThemeColour themeColour, ThemeColour themeColour2) {
        this.styleHelper.applyTopTabsColors(themeColour, themeColour2);
    }

    public void applyTopTabsFontSize(Number number) {
        this.styleHelper.applyTopTabsFontSize(number);
    }

    public void setVisibility(TopBar topBar, boolean z) {
        if (!z || getTabCount() <= 0) {
            topBar.removeView(this);
            return;
        }
        if (getParent() == null) {
            topBar.addView(this, 1);
        }
        setVisibility(0);
    }

    public void clear() {
        setupWithViewPager((ViewPager) null);
        ViewExtensionsKt.removeFromParent(this);
    }

    public void init(ViewPager viewPager) {
        setupWithViewPager(viewPager);
    }
}
