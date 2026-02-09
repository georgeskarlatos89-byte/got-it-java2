package com.reactnativenavigation.views.element;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012J\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u001a\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/reactnativenavigation/views/element/TransitionSet;", "", "()V", "isEmpty", "", "()Z", "transitions", "", "Lcom/reactnativenavigation/views/element/Transition;", "getTransitions", "()Ljava/util/List;", "validElementTransitions", "", "Lcom/reactnativenavigation/views/element/ElementTransition;", "getValidElementTransitions", "setValidElementTransitions", "(Ljava/util/List;)V", "validSharedElementTransitions", "Lcom/reactnativenavigation/views/element/SharedElementTransition;", "getValidSharedElementTransitions", "setValidSharedElementTransitions", "add", "", "transition", "addAll", "forEach", "action", "Lkotlin/Function1;", "size", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionSet.kt */
public final class TransitionSet {
    private List<ElementTransition> validElementTransitions = new ArrayList();
    private List<SharedElementTransition> validSharedElementTransitions = new ArrayList();

    public final List<SharedElementTransition> getValidSharedElementTransitions() {
        return this.validSharedElementTransitions;
    }

    public final void setValidSharedElementTransitions(List<SharedElementTransition> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.validSharedElementTransitions = list;
    }

    public final List<ElementTransition> getValidElementTransitions() {
        return this.validElementTransitions;
    }

    public final void setValidElementTransitions(List<ElementTransition> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.validElementTransitions = list;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final List<Transition> getTransitions() {
        return CollectionsKt.plus(this.validElementTransitions, this.validSharedElementTransitions);
    }

    public final void add(SharedElementTransition sharedElementTransition) {
        Intrinsics.checkNotNullParameter(sharedElementTransition, "transition");
        this.validSharedElementTransitions.add(sharedElementTransition);
    }

    public final void add(ElementTransition elementTransition) {
        Intrinsics.checkNotNullParameter(elementTransition, "transition");
        this.validElementTransitions.add(elementTransition);
    }

    public final void addAll(List<? extends Transition> list) {
        Intrinsics.checkNotNullParameter(list, "transitions");
        for (Transition transition : list) {
            if (transition instanceof SharedElementTransition) {
                this.validSharedElementTransitions.add(transition);
            } else if (transition instanceof ElementTransition) {
                this.validElementTransitions.add(transition);
            }
        }
    }

    public final void forEach(Function1<? super Transition, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "action");
        for (Object invoke : this.validSharedElementTransitions) {
            function1.invoke(invoke);
        }
        for (Object invoke2 : this.validElementTransitions) {
            function1.invoke(invoke2);
        }
    }

    public final int size() {
        return this.validElementTransitions.size() + this.validSharedElementTransitions.size();
    }
}
