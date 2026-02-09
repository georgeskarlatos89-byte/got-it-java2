package com.reactnativenavigation.views.toptabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;
import com.reactnativenavigation.viewcontrollers.toptabs.TopTabsAdapter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.IReactView;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.component.Component;
import java.util.List;

public class TopTabsViewPager extends ViewPager implements Component, ButtonController.OnClickListener {
    private static final int OFFSCREEN_PAGE_LIMIT = 99;
    private List<ViewController<?>> tabs;

    public void applyOptions(Options options) {
    }

    public TopTabsViewPager(Context context, List<ViewController<?>> list, TopTabsAdapter topTabsAdapter) {
        super(context);
        this.tabs = list;
        initTabs(topTabsAdapter);
    }

    private void initTabs(TopTabsAdapter topTabsAdapter) {
        setOffscreenPageLimit(99);
        for (ViewController<?> view : this.tabs) {
            addView(view.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        setAdapter(topTabsAdapter);
        addOnPageChangeListener(topTabsAdapter);
    }

    public boolean isRendered() {
        return this.tabs.size() != 0 && areAllTabsRendered();
    }

    private boolean areAllTabsRendered() {
        for (ViewController<?> isRendered : this.tabs) {
            if (!isRendered.isRendered()) {
                return false;
            }
        }
        return true;
    }

    public void switchToTab(int i) {
        setCurrentItem(i);
    }

    public void onPress(ButtonOptions buttonOptions) {
        ((IReactView) this.tabs.get(getCurrentItem()).getView()).sendOnNavigationButtonPressed(buttonOptions.id);
    }

    public void destroy() {
        for (ViewController<?> destroy : this.tabs) {
            destroy.destroy();
        }
    }

    public boolean isCurrentView(View view) {
        for (ViewController<?> view2 : this.tabs) {
            if (view2.getView() == view) {
                return true;
            }
        }
        return false;
    }
}
