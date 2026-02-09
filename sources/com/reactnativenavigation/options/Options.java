package com.reactnativenavigation.options;

import android.content.Context;
import com.reactnativenavigation.options.layout.LayoutOptions;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import org.json.JSONObject;

public class Options {
    public static final Options EMPTY = new Options();
    public AnimationsOptions animations = new AnimationsOptions();
    public BottomTabOptions bottomTabOptions = new BottomTabOptions();
    public BottomTabsOptions bottomTabsOptions = new BottomTabsOptions();
    public FabOptions fabOptions = new FabOptions();
    public HardwareBackButtonOptions hardwareBack = new HardwareBackButtonOptions();
    public LayoutOptions layout = new LayoutOptions();
    public ModalOptions modal = new ModalOptions();
    public NavigationBarOptions navigationBar = new NavigationBarOptions();
    public OverlayOptions overlayOptions = new OverlayOptions();
    public SideMenuRootOptions sideMenuRootOptions = new SideMenuRootOptions();
    public StatusBarOptions statusBar = new StatusBarOptions();
    public TopBarOptions topBar = new TopBarOptions();
    public TopTabOptions topTabOptions = new TopTabOptions();
    public TopTabsOptions topTabs = new TopTabsOptions();

    public static Options parse(Context context, TypefaceLoader typefaceLoader, JSONObject jSONObject) {
        Options options = new Options();
        if (jSONObject == null) {
            return options;
        }
        options.topBar = TopBarOptions.parse(context, typefaceLoader, jSONObject.optJSONObject("topBar"));
        options.topTabs = TopTabsOptions.parse(context, jSONObject.optJSONObject("topTabs"));
        options.topTabOptions = TopTabOptions.parse(typefaceLoader, jSONObject.optJSONObject("topTab"));
        options.bottomTabOptions = BottomTabOptions.parse(context, typefaceLoader, jSONObject.optJSONObject("bottomTab"));
        options.bottomTabsOptions = BottomTabsOptions.parse(context, jSONObject.optJSONObject("bottomTabs"));
        options.overlayOptions = OverlayOptions.parse(jSONObject.optJSONObject("overlay"));
        options.fabOptions = FabOptions.parse(context, jSONObject.optJSONObject("fab"));
        options.sideMenuRootOptions = SideMenuRootOptions.parse(jSONObject.optJSONObject("sideMenu"));
        options.animations = AnimationsOptions.parse(jSONObject.optJSONObject("animations"));
        options.modal = ModalOptions.parse(jSONObject);
        options.navigationBar = NavigationBarOptions.parse(context, jSONObject.optJSONObject("navigationBar"));
        options.statusBar = StatusBarOptions.parse(context, jSONObject.optJSONObject("statusBar"));
        options.layout = LayoutOptions.parse(context, jSONObject.optJSONObject("layout"));
        options.hardwareBack = new HardwareBackButtonOptions(jSONObject.optJSONObject("hardwareBackButton"));
        return options;
    }

    /* access modifiers changed from: package-private */
    public void setTopTabIndex(int i) {
        this.topTabOptions.tabIndex = i;
    }

    public Options copy() {
        Options options = new Options();
        options.topBar.mergeWith(this.topBar);
        options.topTabs.mergeWith(this.topTabs);
        options.topTabOptions.mergeWith(this.topTabOptions);
        options.bottomTabOptions.mergeWith(this.bottomTabOptions);
        options.bottomTabsOptions.mergeWith(this.bottomTabsOptions);
        options.overlayOptions = this.overlayOptions;
        options.fabOptions.mergeWith(this.fabOptions);
        options.sideMenuRootOptions.mergeWith(this.sideMenuRootOptions);
        options.animations.mergeWith(this.animations);
        options.modal.mergeWith(this.modal);
        options.navigationBar.mergeWith(this.navigationBar);
        options.statusBar.mergeWith(this.statusBar);
        options.layout.mergeWith(this.layout);
        options.hardwareBack.mergeWith(this.hardwareBack);
        return options;
    }

    public Options mergeWith(Options options) {
        Options copy = copy();
        copy.topBar.mergeWith(options.topBar);
        copy.topTabs.mergeWith(options.topTabs);
        copy.topTabOptions.mergeWith(options.topTabOptions);
        copy.bottomTabOptions.mergeWith(options.bottomTabOptions);
        copy.bottomTabsOptions.mergeWith(options.bottomTabsOptions);
        copy.fabOptions.mergeWith(options.fabOptions);
        copy.animations.mergeWith(options.animations);
        copy.sideMenuRootOptions.mergeWith(options.sideMenuRootOptions);
        copy.modal.mergeWith(options.modal);
        copy.navigationBar.mergeWith(options.navigationBar);
        copy.statusBar.mergeWith(options.statusBar);
        copy.layout.mergeWith(options.layout);
        copy.hardwareBack.mergeWith(options.hardwareBack);
        return copy;
    }

    public Options withDefaultOptions(Options options) {
        this.topBar.mergeWithDefault(options.topBar);
        this.topTabOptions.mergeWithDefault(options.topTabOptions);
        this.topTabs.mergeWithDefault(options.topTabs);
        this.bottomTabOptions.mergeWithDefault(options.bottomTabOptions);
        this.bottomTabsOptions.mergeWithDefault(options.bottomTabsOptions);
        this.fabOptions.mergeWithDefault(options.fabOptions);
        this.animations.mergeWithDefault(options.animations);
        this.sideMenuRootOptions.mergeWithDefault(options.sideMenuRootOptions);
        this.modal.mergeWithDefault(options.modal);
        this.navigationBar.mergeWithDefault(options.navigationBar);
        this.statusBar.mergeWithDefault(options.statusBar);
        this.layout.mergeWithDefault(options.layout);
        this.hardwareBack.mergeWithDefault(options.hardwareBack);
        return this;
    }

    public Options clearTopBarOptions() {
        this.topBar = new TopBarOptions();
        return this;
    }

    public Options clearBottomTabsOptions() {
        this.bottomTabsOptions = new BottomTabsOptions();
        return this;
    }

    public Options clearTopTabOptions() {
        this.topTabOptions = new TopTabOptions();
        return this;
    }

    public Options clearTopTabsOptions() {
        this.topTabs = new TopTabsOptions();
        return this;
    }

    public Options clearBottomTabOptions() {
        this.bottomTabOptions = new BottomTabOptions();
        return this;
    }

    public Options clearAnimationOptions() {
        this.animations = new AnimationsOptions();
        return this;
    }

    public Options clearFabOptions() {
        this.fabOptions = new FabOptions();
        return this;
    }

    public Options clearOneTimeOptions() {
        this.bottomTabsOptions.currentTabId = new NullText();
        this.bottomTabsOptions.currentTabIndex = new NullNumber();
        return this;
    }
}
