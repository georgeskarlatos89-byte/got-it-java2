package com.reactnativenavigation.views.toptabs;

import android.content.Context;
import com.reactnativenavigation.viewcontrollers.toptabs.TopTabsAdapter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

public class TopTabsLayoutCreator {
    private Context context;
    private List<ViewController<?>> tabs;

    public TopTabsLayoutCreator(Context context2, List<ViewController<?>> list) {
        this.context = context2;
        this.tabs = list;
    }

    public TopTabsViewPager create() {
        return new TopTabsViewPager(this.context, this.tabs, new TopTabsAdapter(this.tabs));
    }
}
