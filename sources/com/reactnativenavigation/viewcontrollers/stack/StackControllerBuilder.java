package com.reactnativenavigation.viewcontrollers.stack;

import android.app.Activity;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.stack.topbar.TopBarController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.BackButtonHelper;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackControllerBuilder {
    private Activity activity;
    private StackAnimator animator;
    private BackButtonHelper backButtonHelper = new BackButtonHelper();
    private ChildControllersRegistry childRegistry;
    private List<ViewController<?>> children = new ArrayList();
    private EventEmitter eventEmitter;
    private FabPresenter fabPresenter = new FabPresenter();
    private String id;
    private Options initialOptions = new Options();
    private Presenter presenter;
    private StackPresenter stackPresenter;
    private TopBarController topBarController;

    public StackControllerBuilder(Activity activity2, EventEmitter eventEmitter2) {
        this.activity = activity2;
        this.eventEmitter = eventEmitter2;
        this.presenter = new Presenter(activity2, new Options());
        this.animator = new StackAnimator(activity2);
    }

    public StackControllerBuilder setEventEmitter(EventEmitter eventEmitter2) {
        this.eventEmitter = eventEmitter2;
        return this;
    }

    public StackControllerBuilder setChildren(ViewController<?>... viewControllerArr) {
        return setChildren((List<ViewController<?>>) Arrays.asList(viewControllerArr));
    }

    public StackControllerBuilder setChildren(List<ViewController<?>> list) {
        this.children = list;
        return this;
    }

    public StackControllerBuilder setStackPresenter(StackPresenter stackPresenter2) {
        this.stackPresenter = stackPresenter2;
        return this;
    }

    public StackControllerBuilder setPresenter(Presenter presenter2) {
        this.presenter = presenter2;
        return this;
    }

    public StackControllerBuilder setChildRegistry(ChildControllersRegistry childControllersRegistry) {
        this.childRegistry = childControllersRegistry;
        return this;
    }

    public StackControllerBuilder setTopBarController(TopBarController topBarController2) {
        this.topBarController = topBarController2;
        return this;
    }

    public StackControllerBuilder setId(String str) {
        this.id = str;
        return this;
    }

    public StackControllerBuilder setInitialOptions(Options options) {
        this.initialOptions = options;
        return this;
    }

    public StackControllerBuilder setAnimator(StackAnimator stackAnimator) {
        this.animator = stackAnimator;
        return this;
    }

    /* access modifiers changed from: package-private */
    public StackControllerBuilder setBackButtonHelper(BackButtonHelper backButtonHelper2) {
        this.backButtonHelper = backButtonHelper2;
        return this;
    }

    public StackControllerBuilder setFabPresenter(FabPresenter fabPresenter2) {
        this.fabPresenter = fabPresenter2;
        return this;
    }

    public StackController build() {
        return new StackController(this.activity, this.children, this.childRegistry, this.eventEmitter, this.topBarController, this.animator, this.id, this.initialOptions, this.backButtonHelper, this.stackPresenter, this.presenter, this.fabPresenter);
    }
}
