package com.reactnativenavigation.options;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.Assertions;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ImageLoader;
import com.reactnativenavigation.utils.RenderChecker;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabPresenter;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsAnimator;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsController;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsPresenter;
import com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.BottomTabsAttacher;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.component.ComponentPresenter;
import com.reactnativenavigation.viewcontrollers.component.ComponentViewController;
import com.reactnativenavigation.viewcontrollers.externalcomponent.ExternalComponentCreator;
import com.reactnativenavigation.viewcontrollers.externalcomponent.ExternalComponentPresenter;
import com.reactnativenavigation.viewcontrollers.externalcomponent.ExternalComponentViewController;
import com.reactnativenavigation.viewcontrollers.sidemenu.SideMenuController;
import com.reactnativenavigation.viewcontrollers.sidemenu.SideMenuPresenter;
import com.reactnativenavigation.viewcontrollers.stack.StackControllerBuilder;
import com.reactnativenavigation.viewcontrollers.stack.StackPresenter;
import com.reactnativenavigation.viewcontrollers.stack.topbar.TopBarController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.IconResolver;
import com.reactnativenavigation.viewcontrollers.toptabs.TopTabsController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.component.ComponentViewCreator;
import com.reactnativenavigation.views.stack.topbar.TopBarBackgroundViewCreator;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarButtonCreator;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactViewCreator;
import com.reactnativenavigation.views.toptabs.TopTabsLayoutCreator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class LayoutFactory {
    private Activity activity;
    private ChildControllersRegistry childRegistry;
    private Options defaultOptions = new Options();
    private EventEmitter eventEmitter;
    private Map<String, ExternalComponentCreator> externalComponentCreators;
    private final ReactInstanceManager reactInstanceManager;
    private TypefaceLoader typefaceManager;

    public void setDefaultOptions(Options options) {
        Assertions.assertNotNull(options);
        this.defaultOptions = options;
    }

    public LayoutFactory(ReactInstanceManager reactInstanceManager2) {
        this.reactInstanceManager = reactInstanceManager2;
    }

    public void init(Activity activity2, EventEmitter eventEmitter2, ChildControllersRegistry childControllersRegistry, Map<String, ExternalComponentCreator> map) {
        this.activity = activity2;
        this.eventEmitter = eventEmitter2;
        this.childRegistry = childControllersRegistry;
        this.externalComponentCreators = map;
        this.typefaceManager = new TypefaceLoader(activity2);
    }

    /* renamed from: com.reactnativenavigation.options.LayoutFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.reactnativenavigation.options.LayoutNode$Type[] r0 = com.reactnativenavigation.options.LayoutNode.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type = r0
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.Component     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.ExternalComponent     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.Stack     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.BottomTabs     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.SideMenuRoot     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.SideMenuCenter     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.SideMenuLeft     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.SideMenuRight     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$LayoutNode$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                com.reactnativenavigation.options.LayoutNode$Type r1 = com.reactnativenavigation.options.LayoutNode.Type.TopTabs     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.LayoutFactory.AnonymousClass1.<clinit>():void");
        }
    }

    public ViewController<?> create(LayoutNode layoutNode) {
        ReactContext currentReactContext = this.reactInstanceManager.getCurrentReactContext();
        switch (AnonymousClass1.$SwitchMap$com$reactnativenavigation$options$LayoutNode$Type[layoutNode.type.ordinal()]) {
            case 1:
                return createComponent(layoutNode);
            case 2:
                return createExternalComponent(currentReactContext, layoutNode);
            case 3:
                return createStack(layoutNode);
            case 4:
                return createBottomTabs(layoutNode);
            case 5:
                return createSideMenuRoot(layoutNode);
            case 6:
                return createSideMenuContent(layoutNode);
            case 7:
                return createSideMenuLeft(layoutNode);
            case 8:
                return createSideMenuRight(layoutNode);
            case 9:
                return createTopTabs(layoutNode);
            default:
                throw new IllegalArgumentException("Invalid node type: " + layoutNode.type);
        }
    }

    private ViewController<?> createSideMenuRoot(LayoutNode layoutNode) {
        SideMenuController sideMenuController = new SideMenuController(this.activity, this.childRegistry, layoutNode.id, parseOptions(layoutNode.getOptions()), new SideMenuPresenter(), new Presenter(this.activity, this.defaultOptions));
        ViewController<?> viewController = null;
        ViewController<?> viewController2 = null;
        ViewController<?> viewController3 = null;
        for (LayoutNode next : layoutNode.children) {
            int i = AnonymousClass1.$SwitchMap$com$reactnativenavigation$options$LayoutNode$Type[next.type.ordinal()];
            if (i == 6) {
                viewController = create(next);
                viewController.setParentController(sideMenuController);
            } else if (i == 7) {
                viewController2 = create(next);
                viewController2.setParentController(sideMenuController);
            } else if (i == 8) {
                viewController3 = create(next);
                viewController3.setParentController(sideMenuController);
            } else {
                throw new IllegalArgumentException("Invalid node type in sideMenu: " + layoutNode.type);
            }
        }
        if (viewController != null) {
            sideMenuController.setCenterController(viewController);
        }
        if (viewController2 != null) {
            sideMenuController.setLeftController(viewController2);
        }
        if (viewController3 != null) {
            sideMenuController.setRightController(viewController3);
        }
        return sideMenuController;
    }

    private ViewController<?> createSideMenuContent(LayoutNode layoutNode) {
        return create(layoutNode.children.get(0));
    }

    private ViewController<?> createSideMenuLeft(LayoutNode layoutNode) {
        return create(layoutNode.children.get(0));
    }

    private ViewController<?> createSideMenuRight(LayoutNode layoutNode) {
        return create(layoutNode.children.get(0));
    }

    private ViewController<?> createComponent(LayoutNode layoutNode) {
        return new ComponentViewController(this.activity, this.childRegistry, layoutNode.id, layoutNode.data.optString("name"), new ComponentViewCreator(this.reactInstanceManager), parseOptions(layoutNode.getOptions()), new Presenter(this.activity, this.defaultOptions), new ComponentPresenter(this.defaultOptions));
    }

    private ViewController<?> createExternalComponent(ReactContext reactContext, LayoutNode layoutNode) {
        ExternalComponent parse = ExternalComponent.parse(layoutNode.data);
        return new ExternalComponentViewController(this.activity, this.childRegistry, layoutNode.id, new Presenter(this.activity, this.defaultOptions), parse, this.externalComponentCreators.get(parse.name.get()), this.reactInstanceManager, new EventEmitter(reactContext), new ExternalComponentPresenter(), parseOptions(layoutNode.getOptions()));
    }

    private ViewController<?> createStack(LayoutNode layoutNode) {
        return new StackControllerBuilder(this.activity, this.eventEmitter).setChildren(createChildren(layoutNode.children)).setChildRegistry(this.childRegistry).setTopBarController(new TopBarController()).setId(layoutNode.id).setInitialOptions(parseOptions(layoutNode.getOptions())).setStackPresenter(new StackPresenter(this.activity, new TitleBarReactViewCreator(this.reactInstanceManager), new TopBarBackgroundViewCreator(this.reactInstanceManager), new TitleBarButtonCreator(this.reactInstanceManager), new IconResolver(this.activity, new ImageLoader()), new TypefaceLoader(this.activity), new RenderChecker(), this.defaultOptions)).setPresenter(new Presenter(this.activity, this.defaultOptions)).build();
    }

    private List<ViewController<?>> createChildren(List<LayoutNode> list) {
        ArrayList arrayList = new ArrayList();
        for (LayoutNode create : list) {
            arrayList.add(create(create));
        }
        return arrayList;
    }

    private ViewController<?> createBottomTabs(LayoutNode layoutNode) {
        LayoutNode layoutNode2 = layoutNode;
        ArrayList<S> map = CollectionUtils.map(layoutNode2.children, new LayoutFactory$$ExternalSyntheticLambda0(this));
        BottomTabsPresenter bottomTabsPresenter = new BottomTabsPresenter(map, this.defaultOptions, new BottomTabsAnimator());
        Activity activity2 = this.activity;
        ChildControllersRegistry childControllersRegistry = this.childRegistry;
        EventEmitter eventEmitter2 = this.eventEmitter;
        ImageLoader imageLoader = new ImageLoader();
        String str = layoutNode2.id;
        Options parseOptions = parseOptions(layoutNode.getOptions());
        Presenter presenter = new Presenter(this.activity, this.defaultOptions);
        BottomTabsAttacher bottomTabsAttacher = new BottomTabsAttacher(map, bottomTabsPresenter, this.defaultOptions);
        Activity activity3 = this.activity;
        ImageLoader imageLoader2 = new ImageLoader();
        TypefaceLoader typefaceLoader = new TypefaceLoader(this.activity);
        ArrayList<S> arrayList = map;
        BottomTabsAttacher bottomTabsAttacher2 = bottomTabsAttacher;
        TypefaceLoader typefaceLoader2 = typefaceLoader;
        return new BottomTabsController(activity2, arrayList, childControllersRegistry, eventEmitter2, imageLoader, str, parseOptions, presenter, bottomTabsAttacher2, bottomTabsPresenter, new BottomTabPresenter(activity3, arrayList, imageLoader2, typefaceLoader2, this.defaultOptions));
    }

    private ViewController<?> createTopTabs(LayoutNode layoutNode) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < layoutNode.children.size(); i++) {
            ViewController<?> create = create(layoutNode.children.get(i));
            parseOptions(layoutNode.children.get(i).getOptions()).setTopTabIndex(i);
            arrayList.add(create);
        }
        return new TopTabsController(this.activity, this.childRegistry, layoutNode.id, arrayList, new TopTabsLayoutCreator(this.activity, arrayList), parseOptions(layoutNode.getOptions()), new Presenter(this.activity, this.defaultOptions));
    }

    private Options parseOptions(JSONObject jSONObject) {
        Context currentReactContext = this.reactInstanceManager.getCurrentReactContext();
        if (currentReactContext == null && (currentReactContext = this.activity) == null) {
            currentReactContext = NavigationApplication.instance;
        }
        if (this.typefaceManager == null) {
            this.typefaceManager = new TypefaceLoader(currentReactContext);
        }
        return Options.parse(currentReactContext, this.typefaceManager, jSONObject);
    }

    public Options getDefaultOptions() {
        return this.defaultOptions;
    }
}
