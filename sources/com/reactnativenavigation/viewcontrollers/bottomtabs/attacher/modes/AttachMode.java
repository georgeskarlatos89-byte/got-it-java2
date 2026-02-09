package com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes;

import android.view.ViewGroup;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabFinder;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsPresenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.bottomtabs.BottomTabsBehaviour;
import java.util.List;

public abstract class AttachMode {
    protected final BottomTabFinder bottomTabFinder;
    final ViewController<?> initialTab;
    protected final ViewGroup parent;
    protected final BottomTabsPresenter presenter;
    protected final List<ViewController<?>> tabs;

    public abstract void attach();

    public void destroy() {
    }

    public void onTabSelected(ViewController<?> viewController) {
    }

    /* renamed from: com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes.AttachMode$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$reactnativenavigation$options$TabsAttachMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.reactnativenavigation.options.TabsAttachMode[] r0 = com.reactnativenavigation.options.TabsAttachMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$reactnativenavigation$options$TabsAttachMode = r0
                com.reactnativenavigation.options.TabsAttachMode r1 = com.reactnativenavigation.options.TabsAttachMode.AFTER_INITIAL_TAB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$TabsAttachMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.reactnativenavigation.options.TabsAttachMode r1 = com.reactnativenavigation.options.TabsAttachMode.ON_SWITCH_TO_TAB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$TabsAttachMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.reactnativenavigation.options.TabsAttachMode r1 = com.reactnativenavigation.options.TabsAttachMode.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$TabsAttachMode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.reactnativenavigation.options.TabsAttachMode r1 = com.reactnativenavigation.options.TabsAttachMode.TOGETHER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes.AttachMode.AnonymousClass1.<clinit>():void");
        }
    }

    public static AttachMode get(ViewGroup viewGroup, List<ViewController<?>> list, BottomTabsPresenter bottomTabsPresenter, Options options) {
        int i = AnonymousClass1.$SwitchMap$com$reactnativenavigation$options$TabsAttachMode[options.bottomTabsOptions.tabsAttachMode.ordinal()];
        if (i == 1) {
            return new AfterInitialTab(viewGroup, list, bottomTabsPresenter, options);
        }
        if (i != 2) {
            return new Together(viewGroup, list, bottomTabsPresenter, options);
        }
        return new OnSwitchToTab(viewGroup, list, bottomTabsPresenter, options);
    }

    AttachMode(ViewGroup viewGroup, List<ViewController<?>> list, BottomTabsPresenter bottomTabsPresenter, Options options) {
        this.parent = viewGroup;
        this.tabs = list;
        this.presenter = bottomTabsPresenter;
        BottomTabFinder bottomTabFinder2 = new BottomTabFinder(list);
        this.bottomTabFinder = bottomTabFinder2;
        int findByControllerId = options.bottomTabsOptions.currentTabId.hasValue() ? bottomTabFinder2.findByControllerId((String) options.bottomTabsOptions.currentTabId.get()) : -1;
        this.initialTab = list.get(findByControllerId < 0 ? ((Integer) options.bottomTabsOptions.currentTabIndex.get(0)).intValue() : findByControllerId);
    }

    public void attach(ViewController<?> viewController) {
        ViewGroup view = viewController.getView();
        view.setVisibility(viewController == this.initialTab ? 0 : 4);
        this.parent.addView(view, CoordinatorLayoutUtils.matchParentWithBehaviour(new BottomTabsBehaviour(viewController.getParentController())));
    }
}
