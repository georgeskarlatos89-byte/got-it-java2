package com.reactnativenavigation.viewcontrollers.toptabs;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

public class TopTabsAdapter extends PagerAdapter implements ViewPager.OnPageChangeListener {
    private int currentPage = 0;
    private List<ViewController<?>> tabs;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public TopTabsAdapter(List<ViewController<?>> list) {
        this.tabs = list;
    }

    public CharSequence getPageTitle(int i) {
        return (CharSequence) getTabOptions(i).topTabOptions.title.get("");
    }

    public int getCount() {
        return this.tabs.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.tabs.get(i).getView();
    }

    public void onPageSelected(int i) {
        this.tabs.get(this.currentPage).onViewDisappear();
        this.tabs.get(i).onViewWillAppear();
        this.currentPage = i;
    }

    private Options getTabOptions(int i) {
        return this.tabs.get(i).options;
    }
}
