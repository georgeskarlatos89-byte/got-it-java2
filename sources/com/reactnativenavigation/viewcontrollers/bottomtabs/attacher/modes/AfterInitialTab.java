package com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes;

import android.view.ViewGroup;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsPresenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

public class AfterInitialTab extends AttachMode {
    private final Runnable attachOtherTabs = new AfterInitialTab$$ExternalSyntheticLambda2(this);

    public AfterInitialTab(ViewGroup viewGroup, List<ViewController<?>> list, BottomTabsPresenter bottomTabsPresenter, Options options) {
        super(viewGroup, list, bottomTabsPresenter, options);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-reactnativenavigation-viewcontrollers-bottomtabs-attacher-modes-AfterInitialTab  reason: not valid java name */
    public /* synthetic */ void m997lambda$new$0$comreactnativenavigationviewcontrollersbottomtabsattachermodesAfterInitialTab() {
        CollectionUtils.forEach(otherTabs(), new AfterInitialTab$$ExternalSyntheticLambda1(this));
    }

    public void attach() {
        this.initialTab.addOnAppearedListener(this.attachOtherTabs);
        attach(this.initialTab);
    }

    public void destroy() {
        this.initialTab.removeOnAppearedListener(this.attachOtherTabs);
    }

    private List<ViewController<?>> otherTabs() {
        return CollectionUtils.filter(this.tabs, new AfterInitialTab$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$otherTabs$1$com-reactnativenavigation-viewcontrollers-bottomtabs-attacher-modes-AfterInitialTab  reason: not valid java name */
    public /* synthetic */ boolean m998lambda$otherTabs$1$comreactnativenavigationviewcontrollersbottomtabsattachermodesAfterInitialTab(ViewController viewController) {
        return viewController != this.initialTab;
    }
}
