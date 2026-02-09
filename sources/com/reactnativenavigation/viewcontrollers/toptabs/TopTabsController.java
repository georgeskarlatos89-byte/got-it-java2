package com.reactnativenavigation.viewcontrollers.toptabs;

import android.app.Activity;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewVisibilityListenerAdapter;
import com.reactnativenavigation.views.toptabs.TopTabsLayoutCreator;
import com.reactnativenavigation.views.toptabs.TopTabsViewPager;
import java.util.Collection;
import java.util.List;

public class TopTabsController extends ParentController<TopTabsViewPager> {
    private List<ViewController<?>> tabs;
    private TopTabsLayoutCreator viewCreator;

    public TopTabsController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, List<ViewController<?>> list, TopTabsLayoutCreator topTabsLayoutCreator, Options options, Presenter presenter) {
        super(activity, childControllersRegistry, str, presenter, options);
        this.viewCreator = topTabsLayoutCreator;
        this.tabs = list;
        for (ViewController next : list) {
            next.setParentController(this);
            next.setViewVisibilityListener(new ViewVisibilityListenerAdapter() {
                public boolean onViewAppeared(View view) {
                    return ((TopTabsViewPager) TopTabsController.this.getView()).isCurrentView(view);
                }
            });
        }
    }

    public ViewController<?> getCurrentChild() {
        return this.tabs.get(((TopTabsViewPager) getView()).getCurrentItem());
    }

    public TopTabsViewPager createView() {
        this.view = this.viewCreator.create();
        return (TopTabsViewPager) this.view;
    }

    public Collection<? extends ViewController<?>> getChildControllers() {
        return this.tabs;
    }

    public void onViewWillAppear() {
        super.onViewWillAppear();
        performOnParentController(new TopTabsController$$ExternalSyntheticLambda3(this));
        performOnCurrentTab(new TopTabsController$$ExternalSyntheticLambda4());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onViewWillAppear$0$com-reactnativenavigation-viewcontrollers-toptabs-TopTabsController  reason: not valid java name */
    public /* synthetic */ void m1032lambda$onViewWillAppear$0$comreactnativenavigationviewcontrollerstoptabsTopTabsController(ParentController parentController) {
        parentController.setupTopTabsWithViewPager((ViewPager) getView());
    }

    public void onViewWillDisappear() {
        super.onViewWillDisappear();
    }

    public void onViewDisappear() {
        super.onViewDisappear();
        performOnCurrentTab(new TopTabsController$$ExternalSyntheticLambda1());
        performOnParentController(new TopTabsController$$ExternalSyntheticLambda2());
    }

    public void sendOnNavigationButtonPressed(String str) {
        performOnCurrentTab(new TopTabsController$$ExternalSyntheticLambda5(str));
    }

    public void applyOptions(Options options) {
        super.applyOptions(options);
        ((TopTabsViewPager) getView()).applyOptions(options);
    }

    public void applyChildOptions(Options options, ViewController<?> viewController) {
        super.applyChildOptions(options, viewController);
        performOnParentController(new TopTabsController$$ExternalSyntheticLambda6(this, viewController));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyChildOptions$2$com-reactnativenavigation-viewcontrollers-toptabs-TopTabsController  reason: not valid java name */
    public /* synthetic */ void m1031lambda$applyChildOptions$2$comreactnativenavigationviewcontrollerstoptabsTopTabsController(ViewController viewController, ParentController parentController) {
        parentController.applyChildOptions(this.options.copy(), viewController);
    }

    public void mergeChildOptions(Options options, ViewController<?> viewController) {
        super.mergeChildOptions(options, viewController);
        performOnParentController(new TopTabsController$$ExternalSyntheticLambda0(options, viewController));
    }

    public void switchToTab(int i) {
        ((TopTabsViewPager) getView()).switchToTab(i);
        getCurrentChild().onViewDidAppear();
    }

    private void performOnCurrentTab(Functions.Func1<ViewController<?>> func1) {
        func1.run(this.tabs.get(((TopTabsViewPager) getView()).getCurrentItem()));
    }
}
