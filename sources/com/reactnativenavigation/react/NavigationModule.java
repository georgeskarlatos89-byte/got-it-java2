package com.reactnativenavigation.react;

import android.app.Activity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.reactnativenavigation.NavigationActivity;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.options.LayoutFactory;
import com.reactnativenavigation.options.LayoutNode;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.parsers.JSONParser;
import com.reactnativenavigation.options.parsers.LayoutNodeParser;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.LaunchArgsParser;
import com.reactnativenavigation.utils.Now;
import com.reactnativenavigation.utils.SystemUiUtils;
import com.reactnativenavigation.utils.UiThread;
import com.reactnativenavigation.utils.UiUtils;
import com.reactnativenavigation.viewcontrollers.navigator.Navigator;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONObject;

public class NavigationModule extends ReactContextBaseJavaModule {
    private static final String NAME = "RNNBridgeModule";
    /* access modifiers changed from: private */
    public EventEmitter eventEmitter;
    private final JSONParser jsonParser;
    private final LayoutFactory layoutFactory;
    private final Now now;
    private final ReactInstanceManager reactInstanceManager;

    public String getName() {
        return NAME;
    }

    public NavigationModule(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager2, LayoutFactory layoutFactory2) {
        this(reactApplicationContext, reactInstanceManager2, new JSONParser(), layoutFactory2);
    }

    public NavigationModule(final ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager2, JSONParser jSONParser, final LayoutFactory layoutFactory2) {
        super(reactApplicationContext);
        this.now = new Now();
        this.reactInstanceManager = reactInstanceManager2;
        this.jsonParser = jSONParser;
        this.layoutFactory = layoutFactory2;
        reactApplicationContext.addLifecycleEventListener(new LifecycleEventListenerAdapter() {
            public void onHostPause() {
                super.onHostPause();
                UiUtils.runOnMainThread(new NavigationModule$1$$ExternalSyntheticLambda0(this));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onHostPause$0$com-reactnativenavigation-react-NavigationModule$1  reason: not valid java name */
            public /* synthetic */ void m983lambda$onHostPause$0$comreactnativenavigationreactNavigationModule$1() {
                if (NavigationModule.this.activity() != null) {
                    NavigationModule.this.navigator().onHostPause();
                }
            }

            public void onHostResume() {
                NavigationModule.this.eventEmitter = new EventEmitter(reactApplicationContext);
                NavigationModule.this.navigator().setEventEmitter(NavigationModule.this.eventEmitter);
                layoutFactory2.init(NavigationModule.this.activity(), NavigationModule.this.eventEmitter, NavigationModule.this.navigator().getChildRegistry(), ((NavigationApplication) NavigationModule.this.activity().getApplication()).getExternalComponents());
                UiUtils.runOnMainThread(new NavigationModule$1$$ExternalSyntheticLambda1(this));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onHostResume$1$com-reactnativenavigation-react-NavigationModule$1  reason: not valid java name */
            public /* synthetic */ void m984lambda$onHostResume$1$comreactnativenavigationreactNavigationModule$1() {
                NavigationModule.this.navigator().onHostResume();
            }
        });
    }

    @ReactMethod
    public void getLaunchArgs(String str, Promise promise) {
        promise.resolve(LaunchArgsParser.parse(activity()));
    }

    private WritableMap createNavigationConstantsMap() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Constants.BACK_BUTTON_JS_KEY, Constants.BACK_BUTTON_ID);
        createMap.putDouble(Constants.BOTTOM_TABS_HEIGHT_KEY, (double) UiUtils.pxToDp(reactApplicationContext, (float) UiUtils.getBottomTabsHeight(reactApplicationContext)));
        createMap.putDouble(Constants.STATUS_BAR_HEIGHT_KEY, (double) UiUtils.pxToDp(reactApplicationContext, (float) SystemUiUtils.getStatusBarHeight(currentActivity)));
        createMap.putDouble(Constants.TOP_BAR_HEIGHT_KEY, (double) UiUtils.pxToDp(reactApplicationContext, (float) UiUtils.getTopBarHeight(reactApplicationContext)));
        return createMap;
    }

    @ReactMethod
    public void getNavigationConstants(Promise promise) {
        promise.resolve(createNavigationConstantsMap());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getNavigationConstantsSync() {
        return createNavigationConstantsMap();
    }

    @ReactMethod
    public void setRoot(String str, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda5(this, LayoutNodeParser.parse((JSONObject) Objects.requireNonNull(this.jsonParser.parse(readableMap).optJSONObject("root"))), str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setRoot$0$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m979lambda$setRoot$0$comreactnativenavigationreactNavigationModule(LayoutNode layoutNode, String str, Promise promise) {
        navigator().setRoot(this.layoutFactory.create(layoutNode), new NativeCommandListener("setRoot", str, promise, this.eventEmitter, this.now), this.reactInstanceManager);
    }

    @ReactMethod
    public void setDefaultOptions(ReadableMap readableMap) {
        handle(new NavigationModule$$ExternalSyntheticLambda11(this, readableMap));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setDefaultOptions$1$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m978lambda$setDefaultOptions$1$comreactnativenavigationreactNavigationModule(ReadableMap readableMap) {
        Options parse = parse(readableMap);
        this.layoutFactory.setDefaultOptions(parse);
        navigator().setDefaultOptions(parse);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeOptions$2$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m973lambda$mergeOptions$2$comreactnativenavigationreactNavigationModule(String str, ReadableMap readableMap) {
        navigator().mergeOptions(str, parse(readableMap));
    }

    @ReactMethod
    public void mergeOptions(String str, ReadableMap readableMap) {
        handle(new NavigationModule$$ExternalSyntheticLambda12(this, str, readableMap));
    }

    @ReactMethod
    public void push(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda10(this, LayoutNodeParser.parse(this.jsonParser.parse(readableMap)), str2, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$push$3$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m977lambda$push$3$comreactnativenavigationreactNavigationModule(LayoutNode layoutNode, String str, String str2, Promise promise) {
        navigator().push(str, this.layoutFactory.create(layoutNode), new NativeCommandListener("push", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void setStackRoot(String str, String str2, ReadableArray readableArray, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda0(this, readableArray, str2, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setStackRoot$4$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m980lambda$setStackRoot$4$comreactnativenavigationreactNavigationModule(ReadableArray readableArray, String str, String str2, Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(this.layoutFactory.create(LayoutNodeParser.parse(this.jsonParser.parse(readableArray.getMap(i)))));
        }
        navigator().setStackRoot(str, arrayList, new NativeCommandListener("setStackRoot", str2, promise, this.eventEmitter, this.now));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$pop$5$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m974lambda$pop$5$comreactnativenavigationreactNavigationModule(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().pop(str, parse(readableMap), new NativeCommandListener("pop", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void pop(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda13(this, str2, readableMap, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$popTo$6$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m975lambda$popTo$6$comreactnativenavigationreactNavigationModule(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().popTo(str, parse(readableMap), new NativeCommandListener("popTo", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void popTo(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda4(this, str2, readableMap, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$popToRoot$7$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m976lambda$popToRoot$7$comreactnativenavigationreactNavigationModule(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().popToRoot(str, parse(readableMap), new NativeCommandListener("popToRoot", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void popToRoot(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda3(this, str2, readableMap, str, promise));
    }

    @ReactMethod
    public void showModal(String str, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda6(this, LayoutNodeParser.parse(this.jsonParser.parse(readableMap)), str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$showModal$8$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m981lambda$showModal$8$comreactnativenavigationreactNavigationModule(LayoutNode layoutNode, String str, Promise promise) {
        navigator().showModal(this.layoutFactory.create(layoutNode), new NativeCommandListener("showModal", str, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void dismissModal(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda7(this, str2, readableMap, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$dismissModal$9$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m970lambda$dismissModal$9$comreactnativenavigationreactNavigationModule(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().mergeOptions(str, parse(readableMap));
        navigator().dismissModal(str, new NativeCommandListener("dismissModal", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void dismissAllModals(String str, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda2(this, readableMap, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$dismissAllModals$10$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m968lambda$dismissAllModals$10$comreactnativenavigationreactNavigationModule(ReadableMap readableMap, String str, Promise promise) {
        navigator().dismissAllModals(parse(readableMap), new NativeCommandListener("dismissAllModals", str, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void showOverlay(String str, ReadableMap readableMap, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda8(this, LayoutNodeParser.parse(this.jsonParser.parse(readableMap)), str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$showOverlay$11$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m982lambda$showOverlay$11$comreactnativenavigationreactNavigationModule(LayoutNode layoutNode, String str, Promise promise) {
        navigator().showOverlay(this.layoutFactory.create(layoutNode), new NativeCommandListener("showOverlay", str, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void dismissOverlay(String str, String str2, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda9(this, str2, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$dismissOverlay$12$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m971lambda$dismissOverlay$12$comreactnativenavigationreactNavigationModule(String str, String str2, Promise promise) {
        navigator().dismissOverlay(str, new NativeCommandListener("dismissOverlay", str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void dismissAllOverlays(String str, Promise promise) {
        handle(new NavigationModule$$ExternalSyntheticLambda1(this, str, promise));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$dismissAllOverlays$13$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m969lambda$dismissAllOverlays$13$comreactnativenavigationreactNavigationModule(String str, Promise promise) {
        navigator().dismissAllOverlays(new NativeCommandListener("dismissAllOverlays", str, promise, this.eventEmitter, this.now));
    }

    /* access modifiers changed from: private */
    public Navigator navigator() {
        return activity().getNavigator();
    }

    private Options parse(ReadableMap readableMap) {
        return readableMap == null ? Options.EMPTY : Options.parse(getReactApplicationContext(), new TypefaceLoader(activity()), this.jsonParser.parse(readableMap));
    }

    /* access modifiers changed from: protected */
    public void handle(Runnable runnable) {
        UiThread.post(new NavigationModule$$ExternalSyntheticLambda14(this, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$handle$14$com-reactnativenavigation-react-NavigationModule  reason: not valid java name */
    public /* synthetic */ void m972lambda$handle$14$comreactnativenavigationreactNavigationModule(Runnable runnable) {
        if (getCurrentActivity() != null && !activity().isFinishing()) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    public NavigationActivity activity() {
        return (NavigationActivity) getCurrentActivity();
    }

    public void onCatalystInstanceDestroy() {
        NavigationActivity activity = activity();
        if (activity != null) {
            activity.onCatalystInstanceDestroy();
        }
        super.onCatalystInstanceDestroy();
    }
}
