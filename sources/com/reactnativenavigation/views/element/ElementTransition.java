package com.reactnativenavigation.views.element;

import android.animation.Animator;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.options.ElementTransitionOptions;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/reactnativenavigation/views/element/ElementTransition;", "Lcom/reactnativenavigation/views/element/Transition;", "transitionOptions", "Lcom/reactnativenavigation/options/ElementTransitionOptions;", "(Lcom/reactnativenavigation/options/ElementTransitionOptions;)V", "id", "", "getId", "()Ljava/lang/String;", "topInset", "", "getTopInset", "()I", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "viewController", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "getViewController", "()Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "setViewController", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;)V", "createAnimators", "Landroid/animation/Animator;", "isInvalid", "", "isValid", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ElementTransition.kt */
public final class ElementTransition extends Transition {
    private final ElementTransitionOptions transitionOptions;
    public View view;
    public ViewController<?> viewController;

    public ElementTransition(ElementTransitionOptions elementTransitionOptions) {
        Intrinsics.checkNotNullParameter(elementTransitionOptions, "transitionOptions");
        this.transitionOptions = elementTransitionOptions;
    }

    public final String getId() {
        return this.transitionOptions.getId();
    }

    public ViewController<?> getViewController() {
        ViewController<?> viewController2 = this.viewController;
        if (viewController2 != null) {
            return viewController2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewController");
        return null;
    }

    public void setViewController(ViewController<?> viewController2) {
        Intrinsics.checkNotNullParameter(viewController2, "<set-?>");
        this.viewController = viewController2;
    }

    public View getView() {
        View view2 = this.view;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ViewHierarchyConstants.VIEW_KEY);
        return null;
    }

    public void setView(View view2) {
        Intrinsics.checkNotNullParameter(view2, "<set-?>");
        this.view = view2;
    }

    public int getTopInset() {
        return getViewController().getTopInset();
    }

    public Animator createAnimators() {
        return this.transitionOptions.getAnimation(getView());
    }

    public final boolean isInvalid() {
        return !isValid();
    }

    public final boolean isValid() {
        return this.view != null;
    }
}
