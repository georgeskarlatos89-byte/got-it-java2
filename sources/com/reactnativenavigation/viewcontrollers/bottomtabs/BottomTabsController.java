package com.reactnativenavigation.viewcontrollers.bottomtabs;

import android.animation.Animator;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.reactnativenavigation.options.BottomTabOptions;
import com.reactnativenavigation.options.HwBackBottomTabsBehaviour;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ImageLoader;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.BottomTabsAttacher;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.bottomtabs.BottomTabs;
import com.reactnativenavigation.views.bottomtabs.BottomTabsContainer;
import com.reactnativenavigation.views.bottomtabs.BottomTabsLayout;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BottomTabsController extends ParentController<BottomTabsLayout> implements AHBottomNavigation.OnTabSelectedListener, TabSelector {
    private BottomTabs bottomTabs;
    private BottomTabsContainer bottomTabsContainer;
    private final EventEmitter eventEmitter;
    private final ImageLoader imageLoader;
    private final BottomTabsPresenter presenter;
    private final Deque<Integer> selectionStack = new LinkedList();
    private final BottomTabPresenter tabPresenter;
    private final List<ViewController<?>> tabs;
    private final BottomTabsAttacher tabsAttacher;

    public BottomTabsAnimator getAnimator() {
        return this.presenter.getAnimator();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.presenter.onConfigurationChanged(resolveCurrentOptions());
        this.tabPresenter.onConfigurationChanged(resolveCurrentOptions());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomTabsController(Activity activity, List<ViewController<?>> list, ChildControllersRegistry childControllersRegistry, EventEmitter eventEmitter2, ImageLoader imageLoader2, String str, Options options, Presenter presenter2, BottomTabsAttacher bottomTabsAttacher, BottomTabsPresenter bottomTabsPresenter, BottomTabPresenter bottomTabPresenter) {
        super(activity, childControllersRegistry, str, presenter2, options);
        this.tabs = list;
        this.eventEmitter = eventEmitter2;
        this.imageLoader = imageLoader2;
        this.tabsAttacher = bottomTabsAttacher;
        this.presenter = bottomTabsPresenter;
        this.tabPresenter = bottomTabPresenter;
        CollectionUtils.forEach(list, new BottomTabsController$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabsController  reason: not valid java name */
    public /* synthetic */ void m996lambda$new$0$comreactnativenavigationviewcontrollersbottomtabsBottomTabsController(ViewController viewController) {
        viewController.setParentController(this);
    }

    public void setDefaultOptions(Options options) {
        super.setDefaultOptions(options);
        this.presenter.setDefaultOptions(options);
        this.tabPresenter.setDefaultOptions(options);
    }

    public BottomTabsLayout createView() {
        BottomTabsLayout bottomTabsLayout = new BottomTabsLayout(getActivity());
        BottomTabsContainer createBottomTabsContainer = createBottomTabsContainer();
        this.bottomTabsContainer = createBottomTabsContainer;
        this.bottomTabs = createBottomTabsContainer.getBottomTabs();
        Options resolveCurrentOptions = resolveCurrentOptions();
        this.tabsAttacher.init(bottomTabsLayout, resolveCurrentOptions);
        this.presenter.bindView(this.bottomTabsContainer, this);
        this.tabPresenter.bindView(this.bottomTabs);
        this.bottomTabs.setOnTabSelectedListener(this);
        bottomTabsLayout.addBottomTabsContainer(this.bottomTabsContainer);
        this.bottomTabs.addItems(createTabs());
        setInitialTab(resolveCurrentOptions);
        this.tabsAttacher.attach();
        return bottomTabsLayout;
    }

    private void setInitialTab(Options options) {
        int i;
        if (options.bottomTabsOptions.currentTabId.hasValue()) {
            i = this.presenter.findTabIndexByTabId((String) options.bottomTabsOptions.currentTabId.get());
        } else {
            i = options.bottomTabsOptions.currentTabIndex.hasValue() ? ((Integer) options.bottomTabsOptions.currentTabIndex.get()).intValue() : 0;
        }
        this.bottomTabs.setCurrentItem(i, false);
    }

    /* access modifiers changed from: protected */
    public BottomTabsContainer createBottomTabsContainer() {
        return new BottomTabsContainer(getActivity(), createBottomTabs());
    }

    /* access modifiers changed from: protected */
    public BottomTabs createBottomTabs() {
        return new BottomTabs(getActivity());
    }

    public void applyOptions(Options options) {
        super.applyOptions(options);
        this.bottomTabs.disableItemsCreation();
        this.presenter.applyOptions(options);
        this.tabPresenter.applyOptions();
        this.bottomTabs.enableItemsCreation();
        this.options.bottomTabsOptions.clearOneTimeOptions();
        this.initialOptions.bottomTabsOptions.clearOneTimeOptions();
    }

    public void mergeOptions(Options options) {
        this.presenter.mergeOptions(options, this);
        this.tabPresenter.mergeOptions(options);
        super.mergeOptions(options);
        this.options.bottomTabsOptions.clearOneTimeOptions();
        this.initialOptions.bottomTabsOptions.clearOneTimeOptions();
    }

    public void applyChildOptions(Options options, ViewController<?> viewController) {
        super.applyChildOptions(options, viewController);
        this.presenter.applyChildOptions(resolveCurrentOptions(), viewController);
        performOnParentController(new BottomTabsController$$ExternalSyntheticLambda5(this, viewController));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyChildOptions$1$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabsController  reason: not valid java name */
    public /* synthetic */ void m993lambda$applyChildOptions$1$comreactnativenavigationviewcontrollersbottomtabsBottomTabsController(ViewController viewController, ParentController parentController) {
        parentController.applyChildOptions(this.options.copy().clearBottomTabsOptions().clearBottomTabOptions(), viewController);
    }

    public void mergeChildOptions(Options options, ViewController<?> viewController) {
        super.mergeChildOptions(options, viewController);
        this.presenter.mergeChildOptions(options, viewController);
        this.tabPresenter.m990lambda$mergeOptions$1$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(options, viewController);
        performOnParentController(new BottomTabsController$$ExternalSyntheticLambda2(options, viewController));
    }

    public boolean handleBack(CommandListener commandListener) {
        boolean z = !this.tabs.isEmpty() && this.tabs.get(this.bottomTabs.getCurrentItem()).handleBack(commandListener);
        Options resolveCurrentOptions = resolveCurrentOptions();
        if (!z) {
            if (resolveCurrentOptions.hardwareBack.getBottomTabOnPress() instanceof HwBackBottomTabsBehaviour.PrevSelection) {
                if (!this.selectionStack.isEmpty()) {
                    selectTab(this.selectionStack.poll().intValue(), false);
                    return true;
                }
            } else if (!(resolveCurrentOptions.hardwareBack.getBottomTabOnPress() instanceof HwBackBottomTabsBehaviour.JumpToFirst) || getSelectedIndex() == 0) {
                return false;
            } else {
                selectTab(0, false);
                return true;
            }
        }
        return z;
    }

    public void sendOnNavigationButtonPressed(String str) {
        getCurrentChild().sendOnNavigationButtonPressed(str);
    }

    public ViewController<?> getCurrentChild() {
        List<ViewController<?>> list = this.tabs;
        BottomTabs bottomTabs2 = this.bottomTabs;
        return list.get(bottomTabs2 == null ? 0 : bottomTabs2.getCurrentItem());
    }

    public boolean onTabSelected(int i, boolean z) {
        ViewController viewController = this.tabs.get(i);
        BottomTabOptions bottomTabOptions = viewController.resolveCurrentOptions().bottomTabOptions;
        this.eventEmitter.emitBottomTabPressed(i);
        if (((Boolean) bottomTabOptions.selectTabOnPress.get(true)).booleanValue()) {
            this.eventEmitter.emitBottomTabSelected(this.bottomTabs.getCurrentItem(), i);
            if (!z) {
                selectTab(i);
            }
        }
        if (((Boolean) bottomTabOptions.popToRoot.get(false)).booleanValue() && z && (viewController instanceof StackController)) {
            ((StackController) viewController).popToRoot(Options.EMPTY, new CommandListenerAdapter());
        }
        return false;
    }

    private List<AHBottomNavigationItem> createTabs() {
        if (this.tabs.size() <= 5) {
            return CollectionUtils.map(this.tabs, new BottomTabsController$$ExternalSyntheticLambda0(this));
        }
        throw new RuntimeException("Too many tabs!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createTabs$3$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabsController  reason: not valid java name */
    public /* synthetic */ AHBottomNavigationItem m994lambda$createTabs$3$comreactnativenavigationviewcontrollersbottomtabsBottomTabsController(ViewController viewController) {
        BottomTabOptions bottomTabOptions = viewController.resolveCurrentOptions().bottomTabOptions;
        return new AHBottomNavigationItem((String) bottomTabOptions.text.get(""), this.imageLoader.loadIcon(getActivity(), (String) bottomTabOptions.icon.get(null)), this.imageLoader.loadIcon(getActivity(), (String) bottomTabOptions.selectedIcon.get(null)), (String) bottomTabOptions.testId.get(""));
    }

    public int getSelectedIndex() {
        return this.bottomTabs.getCurrentItem();
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        ObjectUtils.perform(findController((View) viewGroup), new BottomTabsController$$ExternalSyntheticLambda1());
        return super.onMeasureChild(coordinatorLayout, viewGroup, i, i2, i3, i4);
    }

    public int getBottomInset(ViewController<?> viewController) {
        return this.presenter.getBottomInset(resolveChildOptions(viewController)) + ((Integer) ObjectUtils.perform(getParentController(), 0, new BottomTabsController$$ExternalSyntheticLambda4(this))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getBottomInset$4$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabsController  reason: not valid java name */
    public /* synthetic */ Integer m995lambda$getBottomInset$4$comreactnativenavigationviewcontrollersbottomtabsBottomTabsController(ParentController parentController) {
        return Integer.valueOf(parentController.getBottomInset(this));
    }

    public void applyBottomInset() {
        this.presenter.applyBottomInset(getBottomInset());
        super.applyBottomInset();
    }

    public Collection<ViewController<?>> getChildControllers() {
        return this.tabs;
    }

    public void destroy() {
        this.tabsAttacher.destroy();
        super.destroy();
    }

    public void selectTab(int i) {
        selectTab(i, resolveCurrentOptions().hardwareBack.getBottomTabOnPress() instanceof HwBackBottomTabsBehaviour.PrevSelection);
    }

    private void selectTab(int i, boolean z) {
        saveTabSelection(i, z);
        this.tabsAttacher.onTabSelected(this.tabs.get(i));
        getCurrentView().setVisibility(4);
        this.bottomTabs.setCurrentItem(i, false);
        getCurrentView().setVisibility(0);
        getCurrentChild().onViewWillAppear();
        getCurrentChild().onViewDidAppear();
    }

    private void saveTabSelection(int i, boolean z) {
        if (!z) {
            return;
        }
        if (this.selectionStack.isEmpty() || this.selectionStack.peek().intValue() != i || this.bottomTabs.getCurrentItem() != i) {
            this.selectionStack.offerFirst(Integer.valueOf(this.bottomTabs.getCurrentItem()));
        }
    }

    private ViewGroup getCurrentView() {
        return this.tabs.get(this.bottomTabs.getCurrentItem()).getView();
    }

    public Animator getPushAnimation(Options options) {
        return this.presenter.getPushAnimation(options);
    }

    public Animator getSetStackRootAnimation(Options options) {
        return this.presenter.getSetStackRootAnimation(options);
    }

    public Animator getPopAnimation(Options options, Options options2) {
        return this.presenter.getPopAnimation(options, options2);
    }

    public BottomTabs getBottomTabs() {
        return this.bottomTabs;
    }

    public BottomTabsContainer getBottomTabsContainer() {
        return this.bottomTabsContainer;
    }

    public void setBottomTabsContainer(BottomTabsContainer bottomTabsContainer2) {
        this.bottomTabsContainer = bottomTabsContainer2;
    }

    public void setBottomTabs(BottomTabs bottomTabs2) {
        this.bottomTabs = bottomTabs2;
    }
}
