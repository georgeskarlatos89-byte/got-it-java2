package com.reactnativenavigation.views.element;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.reactnativenavigation.R;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import com.reactnativenavigation.utils.ViewTags;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J9\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010%\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010+\u001a\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0-2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/reactnativenavigation/views/element/TransitionAnimatorCreator;", "", "transitionSetCreator", "Lcom/reactnativenavigation/views/element/TransitionSetCreator;", "(Lcom/reactnativenavigation/views/element/TransitionSetCreator;)V", "addToOverlay", "", "vc", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "element", "Landroid/view/View;", "lp", "Landroid/widget/FrameLayout$LayoutParams;", "create", "Landroid/animation/AnimatorSet;", "animation", "Lcom/reactnativenavigation/options/LayoutAnimation;", "fadeAnimation", "Lcom/reactnativenavigation/options/AnimationOptions;", "fromScreen", "toScreen", "(Lcom/reactnativenavigation/options/LayoutAnimation;Lcom/reactnativenavigation/options/AnimationOptions;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAnimator", "transitions", "Lcom/reactnativenavigation/views/element/TransitionSet;", "createElementTransitionAnimators", "", "Landroid/animation/Animator;", "Lcom/reactnativenavigation/views/element/ElementTransition;", "createSharedElementAnimator", "transition", "Lcom/reactnativenavigation/views/element/SharedElementTransition;", "createSharedElementTransitionAnimators", "getZIndex", "", "view", "recordIndices", "removeFromOverlay", "reparent", "Lcom/reactnativenavigation/views/element/Transition;", "reparentViews", "restoreViewsToOriginalState", "returnToOriginalParent", "setAnimatorsDuration", "animators", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionAnimatorCreator.kt */
public class TransitionAnimatorCreator {
    private final TransitionSetCreator transitionSetCreator;

    public TransitionAnimatorCreator() {
        this((TransitionSetCreator) null, 1, (DefaultConstructorMarker) null);
    }

    public TransitionAnimatorCreator(TransitionSetCreator transitionSetCreator2) {
        Intrinsics.checkNotNullParameter(transitionSetCreator2, "transitionSetCreator");
        this.transitionSetCreator = transitionSetCreator2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransitionAnimatorCreator(TransitionSetCreator transitionSetCreator2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TransitionSetCreator() : transitionSetCreator2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.reactnativenavigation.options.AnimationOptions} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object create(com.reactnativenavigation.options.LayoutAnimation r5, com.reactnativenavigation.options.AnimationOptions r6, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r7, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r8, kotlin.coroutines.Continuation<? super android.animation.AnimatorSet> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.reactnativenavigation.views.element.TransitionAnimatorCreator$create$1
            if (r0 == 0) goto L_0x0014
            r0 = r9
            com.reactnativenavigation.views.element.TransitionAnimatorCreator$create$1 r0 = (com.reactnativenavigation.views.element.TransitionAnimatorCreator$create$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L_0x0019
        L_0x0014:
            com.reactnativenavigation.views.element.TransitionAnimatorCreator$create$1 r0 = new com.reactnativenavigation.views.element.TransitionAnimatorCreator$create$1
            r0.<init>(r4, r9)
        L_0x0019:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.reactnativenavigation.options.AnimationOptions r6 = (com.reactnativenavigation.options.AnimationOptions) r6
            java.lang.Object r5 = r0.L$0
            com.reactnativenavigation.views.element.TransitionAnimatorCreator r5 = (com.reactnativenavigation.views.element.TransitionAnimatorCreator) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            com.reactnativenavigation.views.element.TransitionSetCreator r9 = r4.transitionSetCreator
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r9.create(r5, r7, r8, r0)
            if (r9 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r5 = r4
        L_0x004e:
            com.reactnativenavigation.views.element.TransitionSet r9 = (com.reactnativenavigation.views.element.TransitionSet) r9
            android.animation.AnimatorSet r5 = r5.createAnimator(r6, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.views.element.TransitionAnimatorCreator.create(com.reactnativenavigation.options.LayoutAnimation, com.reactnativenavigation.options.AnimationOptions, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final AnimatorSet createAnimator(AnimationOptions animationOptions, TransitionSet transitionSet) {
        recordIndices(transitionSet);
        reparentViews(transitionSet);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(createSharedElementTransitionAnimators(transitionSet.getValidSharedElementTransitions()));
        arrayList.addAll(createElementTransitionAnimators(transitionSet.getValidElementTransitions()));
        Collection collection = arrayList;
        setAnimatorsDuration(collection, animationOptions);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(collection);
        Animator animator = animatorSet;
        animator.addListener(new TransitionAnimatorCreator$createAnimator$lambda$4$$inlined$doOnStart$1(transitionSet));
        animator.addListener(new TransitionAnimatorCreator$createAnimator$lambda$4$$inlined$doOnEnd$1(this, transitionSet));
        animator.addListener(new TransitionAnimatorCreator$createAnimator$lambda$4$$inlined$doOnCancel$1(this, transitionSet));
        return animatorSet;
    }

    private final void recordIndices(TransitionSet transitionSet) {
        transitionSet.forEach(TransitionAnimatorCreator$recordIndices$1.INSTANCE);
    }

    private final void setAnimatorsDuration(Collection<? extends Animator> collection, AnimationOptions animationOptions) {
        for (Animator animator : collection) {
            if (animator instanceof AnimatorSet) {
                ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
                Intrinsics.checkNotNullExpressionValue(childAnimations, "animator.childAnimations");
                setAnimatorsDuration(childAnimations, animationOptions);
            } else if (((int) animator.getDuration()) <= 0) {
                animator.setDuration((long) animationOptions.getDuration());
            }
        }
    }

    private final void reparentViews(TransitionSet transitionSet) {
        for (Transition reparent : CollectionsKt.sortedWith(transitionSet.getTransitions(), new TransitionAnimatorCreator$reparentViews$$inlined$sortedBy$1(this))) {
            reparent(reparent);
        }
        for (SharedElementTransition view : transitionSet.getValidSharedElementTransitions()) {
            view.getView().setVisibility(4);
        }
    }

    private final List<AnimatorSet> createSharedElementTransitionAnimators(List<SharedElementTransition> list) {
        List<AnimatorSet> arrayList = new ArrayList<>();
        for (SharedElementTransition createSharedElementAnimator : list) {
            arrayList.add(createSharedElementAnimator(createSharedElementAnimator));
        }
        return arrayList;
    }

    private final AnimatorSet createSharedElementAnimator(SharedElementTransition sharedElementTransition) {
        AnimatorSet createAnimators = sharedElementTransition.createAnimators();
        createAnimators.addListener(new TransitionAnimatorCreator$createSharedElementAnimator$1$1(sharedElementTransition));
        return createAnimators;
    }

    private final List<Animator> createElementTransitionAnimators(List<ElementTransition> list) {
        List<Animator> arrayList = new ArrayList<>();
        for (ElementTransition createAnimators : list) {
            arrayList.add(createAnimators.createAnimators());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void restoreViewsToOriginalState(TransitionSet transitionSet) {
        List<Transition> arrayList = new ArrayList<>();
        arrayList.addAll(transitionSet.getValidSharedElementTransitions());
        arrayList.addAll(transitionSet.getValidElementTransitions());
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new TransitionAnimatorCreator$restoreViewsToOriginalState$lambda$12$$inlined$sortBy$1(this));
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new TransitionAnimatorCreator$restoreViewsToOriginalState$lambda$12$$inlined$sortBy$2());
        }
        for (Transition transition : arrayList) {
            removeFromOverlay(transition.getViewController(), transition.getView());
            returnToOriginalParent(transition.getView());
        }
        for (SharedElementTransition from : transitionSet.getValidSharedElementTransitions()) {
            from.getFrom().setAlpha(1.0f);
        }
    }

    private final void reparent(Transition transition) {
        Point locationOnScreen = ViewUtils.getLocationOnScreen(transition.getView());
        ViewParent parent = transition.getView().getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        transition.getView().setTag(R.id.original_parent, viewGroup);
        transition.getView().setTag(R.id.original_layout_params, transition.getView().getLayoutParams());
        transition.getView().setTag(R.id.original_top, Integer.valueOf(transition.getView().getTop()));
        transition.getView().setTag(R.id.original_bottom, Integer.valueOf(transition.getView().getBottom()));
        transition.getView().setTag(R.id.original_right, Integer.valueOf(transition.getView().getRight()));
        transition.getView().setTag(R.id.original_left, Integer.valueOf(transition.getView().getLeft()));
        transition.getView().setTag(R.id.original_pivot_x, Float.valueOf(transition.getView().getPivotX()));
        transition.getView().setTag(R.id.original_pivot_y, Float.valueOf(transition.getView().getPivotY()));
        transition.getView().setTag(R.id.original_z_index, Integer.valueOf(getZIndex(transition.getView())));
        viewGroup.removeView(transition.getView());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(transition.getView().getLayoutParams());
        layoutParams.topMargin = locationOnScreen.y;
        layoutParams.leftMargin = locationOnScreen.x;
        layoutParams.gravity = 0;
        layoutParams.width = transition.getView().getWidth();
        layoutParams.height = transition.getView().getHeight();
        addToOverlay(transition.getViewController(), transition.getView(), layoutParams);
    }

    private final void returnToOriginalParent(View view) {
        ViewExtensionsKt.removeFromParent(view);
        Object obj = ViewTags.get(view, R.id.original_top);
        Intrinsics.checkNotNullExpressionValue(obj, "get(element, R.id.original_top)");
        view.setTop(((Number) obj).intValue());
        Object obj2 = ViewTags.get(view, R.id.original_bottom);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(element, R.id.original_bottom)");
        view.setBottom(((Number) obj2).intValue());
        Object obj3 = ViewTags.get(view, R.id.original_right);
        Intrinsics.checkNotNullExpressionValue(obj3, "get(element, R.id.original_right)");
        view.setRight(((Number) obj3).intValue());
        Object obj4 = ViewTags.get(view, R.id.original_left);
        Intrinsics.checkNotNullExpressionValue(obj4, "get(element, R.id.original_left)");
        view.setLeft(((Number) obj4).intValue());
        Object obj5 = ViewTags.get(view, R.id.original_pivot_x);
        Intrinsics.checkNotNullExpressionValue(obj5, "get(element, R.id.original_pivot_x)");
        view.setPivotX(((Number) obj5).floatValue());
        Object obj6 = ViewTags.get(view, R.id.original_pivot_y);
        Intrinsics.checkNotNullExpressionValue(obj6, "get(element, R.id.original_pivot_y)");
        view.setPivotY(((Number) obj6).floatValue());
        Object obj7 = ViewTags.get(view, R.id.original_parent);
        Intrinsics.checkNotNullExpressionValue(obj7, "get<ViewGroup>(element, R.id.original_parent)");
        Object obj8 = ViewTags.get(view, R.id.original_layout_params);
        Intrinsics.checkNotNullExpressionValue(obj8, "get<ViewGroup.LayoutPara…d.original_layout_params)");
        Object obj9 = ViewTags.get(view, R.id.original_index_in_parent);
        Intrinsics.checkNotNullExpressionValue(obj9, "get<Int>(element, R.id.original_index_in_parent)");
        ((ViewGroup) obj7).addView(view, ((Number) obj9).intValue(), (ViewGroup.LayoutParams) obj8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Integer} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getZIndex(android.view.View r2) {
        /*
            r1 = this;
            java.lang.Integer r0 = com.facebook.react.uimanager.ViewGroupManager.getViewZIndex(r2)
            if (r0 != 0) goto L_0x0016
            int r0 = com.reactnativenavigation.R.id.original_z_index
            java.lang.Object r2 = com.reactnativenavigation.utils.ViewTags.get(r2, r0)
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0016
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0016:
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.views.element.TransitionAnimatorCreator.getZIndex(android.view.View):int");
    }

    private final void addToOverlay(ViewController<?> viewController, View view, FrameLayout.LayoutParams layoutParams) {
        ParentController parentController = viewController.getParentController();
        if (parentController != null) {
            viewController = parentController;
        }
        viewController.addOverlay(view, layoutParams);
    }

    private final void removeFromOverlay(ViewController<?> viewController, View view) {
        ParentController parentController = viewController.getParentController();
        if (parentController != null) {
            viewController = parentController;
        }
        viewController.removeOverlay(view);
    }
}
