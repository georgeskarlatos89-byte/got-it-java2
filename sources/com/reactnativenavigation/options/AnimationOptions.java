package com.reactnativenavigation.options;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000 42\u00020\u0001:\u00014B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eJ\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0000J\u0012\u0010,\u001a\u00020(2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J0\u0010-\u001a\u00020(2\u0018\u0010.\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/reactnativenavigation/options/AnimationOptions;", "Lcom/reactnativenavigation/options/LayoutAnimation;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "duration", "", "getDuration", "()I", "elementTransitions", "Lcom/reactnativenavigation/options/ElementTransitions;", "getElementTransitions", "()Lcom/reactnativenavigation/options/ElementTransitions;", "setElementTransitions", "(Lcom/reactnativenavigation/options/ElementTransitions;)V", "enabled", "Lcom/reactnativenavigation/options/params/Bool;", "id", "Lcom/reactnativenavigation/options/params/Text;", "sharedElements", "Lcom/reactnativenavigation/options/SharedElements;", "getSharedElements", "()Lcom/reactnativenavigation/options/SharedElements;", "setSharedElements", "(Lcom/reactnativenavigation/options/SharedElements;)V", "valueOptions", "Ljava/util/HashSet;", "Lcom/reactnativenavigation/options/ValueAnimationOptions;", "waitForRender", "getAnimation", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "defaultAnimation", "hasAnimation", "", "hasElementTransitions", "hasValue", "isFadeAnimation", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "parse", "setValueDy", "animation", "Landroid/util/Property;", "", "fromDelta", "toDelta", "shouldWaitForRender", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimationOptions.kt */
public class AnimationOptions implements LayoutAnimation {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private ElementTransitions elementTransitions;
    public Bool enabled;
    public Text id;
    private SharedElements sharedElements;
    private HashSet<ValueAnimationOptions> valueOptions;
    public Bool waitForRender;

    public AnimationOptions() {
        this((JSONObject) null, 1, (DefaultConstructorMarker) null);
    }

    public AnimationOptions(JSONObject jSONObject) {
        this.id = new NullText();
        this.enabled = new NullBool();
        this.waitForRender = new NullBool();
        this.sharedElements = new SharedElements();
        this.elementTransitions = new ElementTransitions();
        this.valueOptions = new HashSet<>();
        parse(jSONObject);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationOptions(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public SharedElements getSharedElements() {
        return this.sharedElements;
    }

    public void setSharedElements(SharedElements sharedElements2) {
        Intrinsics.checkNotNullParameter(sharedElements2, "<set-?>");
        this.sharedElements = sharedElements2;
    }

    public ElementTransitions getElementTransitions() {
        return this.elementTransitions;
    }

    public void setElementTransitions(ElementTransitions elementTransitions2) {
        Intrinsics.checkNotNullParameter(elementTransitions2, "<set-?>");
        this.elementTransitions = elementTransitions2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r1.equals("enable") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r1.equals(com.facebook.react.uimanager.ViewProps.ENABLED) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r1 = com.reactnativenavigation.options.parsers.BoolParser.parse(r8, r1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "parse(json, key)");
        r7.enabled = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void parse(org.json.JSONObject r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Iterator r0 = r8.keys()
        L_0x0007:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0089
            int r2 = r1.hashCode()
            java.lang.String r3 = "parse(json, key)"
            switch(r2) {
                case -1609594047: goto L_0x0075;
                case -1298848381: goto L_0x006c;
                case -585576158: goto L_0x0059;
                case -236533145: goto L_0x0046;
                case 3355: goto L_0x0033;
                case 1104912842: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0089
        L_0x0020:
            java.lang.String r2 = "waitForRender"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0029
            goto L_0x0089
        L_0x0029:
            com.reactnativenavigation.options.params.Bool r1 = com.reactnativenavigation.options.parsers.BoolParser.parse(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r7.waitForRender = r1
            goto L_0x0007
        L_0x0033:
            java.lang.String r2 = "id"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x003c
            goto L_0x0089
        L_0x003c:
            com.reactnativenavigation.options.params.Text r1 = com.reactnativenavigation.options.parsers.TextParser.parse(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r7.id = r1
            goto L_0x0007
        L_0x0046:
            java.lang.String r2 = "sharedElementTransitions"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x004f
            goto L_0x0089
        L_0x004f:
            com.reactnativenavigation.options.SharedElements$Companion r1 = com.reactnativenavigation.options.SharedElements.Companion
            com.reactnativenavigation.options.SharedElements r1 = r1.parse(r8)
            r7.setSharedElements(r1)
            goto L_0x0007
        L_0x0059:
            java.lang.String r2 = "elementTransitions"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x0089
        L_0x0062:
            com.reactnativenavigation.options.ElementTransitions$Companion r1 = com.reactnativenavigation.options.ElementTransitions.Companion
            com.reactnativenavigation.options.ElementTransitions r1 = r1.parse(r8)
            r7.setElementTransitions(r1)
            goto L_0x0007
        L_0x006c:
            java.lang.String r2 = "enable"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x007e
            goto L_0x0089
        L_0x0075:
            java.lang.String r2 = "enabled"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x007e
            goto L_0x0089
        L_0x007e:
            com.reactnativenavigation.options.params.Bool r1 = com.reactnativenavigation.options.parsers.BoolParser.parse(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r7.enabled = r1
            goto L_0x0007
        L_0x0089:
            java.util.HashSet<com.reactnativenavigation.options.ValueAnimationOptions> r2 = r7.valueOptions
            com.reactnativenavigation.options.ValueAnimationOptions$Companion r3 = com.reactnativenavigation.options.ValueAnimationOptions.Companion
            org.json.JSONObject r4 = r8.optJSONObject(r1)
            com.reactnativenavigation.options.AnimationOptions$Companion r5 = Companion
            java.lang.String r6 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            kotlin.Triple r1 = r5.getAnimProp(r1)
            com.reactnativenavigation.options.ValueAnimationOptions r1 = r3.parse(r4, r1)
            r2.add(r1)
            goto L_0x0007
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.AnimationOptions.parse(org.json.JSONObject):void");
    }

    public final void mergeWith(AnimationOptions animationOptions) {
        Intrinsics.checkNotNullParameter(animationOptions, "other");
        if (animationOptions.id.hasValue()) {
            this.id = animationOptions.id;
        }
        if (animationOptions.enabled.hasValue()) {
            this.enabled = animationOptions.enabled;
        }
        if (animationOptions.waitForRender.hasValue()) {
            this.waitForRender = animationOptions.waitForRender;
        }
        if (!animationOptions.valueOptions.isEmpty()) {
            this.valueOptions = animationOptions.valueOptions;
        }
        if (animationOptions.getSharedElements().hasValue()) {
            setSharedElements(animationOptions.getSharedElements());
        }
        if (animationOptions.getElementTransitions().hasValue()) {
            setElementTransitions(animationOptions.getElementTransitions());
        }
    }

    public final void mergeWithDefault(AnimationOptions animationOptions) {
        Intrinsics.checkNotNullParameter(animationOptions, "defaultOptions");
        if (!this.id.hasValue()) {
            this.id = animationOptions.id;
        }
        if (!this.enabled.hasValue()) {
            this.enabled = animationOptions.enabled;
        }
        if (!this.waitForRender.hasValue()) {
            this.waitForRender = animationOptions.waitForRender;
        }
        if (this.valueOptions.isEmpty()) {
            this.valueOptions = animationOptions.valueOptions;
        }
        if (!getSharedElements().hasValue()) {
            setSharedElements(animationOptions.getSharedElements());
        }
        if (!getElementTransitions().hasValue()) {
            setElementTransitions(animationOptions.getElementTransitions());
        }
    }

    public final boolean hasValue() {
        if (this.id.hasValue() || this.enabled.hasValue() || this.waitForRender.hasValue() || getSharedElements().hasValue() || getElementTransitions().hasValue() || (!this.valueOptions.isEmpty())) {
            return true;
        }
        return false;
    }

    public final Animator getAnimation(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        return getAnimation(view, new AnimatorSet());
    }

    public final Animator getAnimation(View view, Animator animator) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(animator, "defaultAnimation");
        if (!hasAnimation()) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Iterable<ValueAnimationOptions> iterable = this.valueOptions;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ValueAnimationOptions animation : iterable) {
            arrayList.add(animation.getAnimation(view));
        }
        animatorSet.playTogether((List) arrayList);
        return animatorSet;
    }

    public final Bool shouldWaitForRender() {
        return new Bool(Boolean.valueOf(this.waitForRender.isTrue() | hasElementTransitions()));
    }

    public final boolean hasElementTransitions() {
        return getSharedElements().hasValue() | getElementTransitions().hasValue();
    }

    /* access modifiers changed from: private */
    public static final Integer _get_duration_$lambda$2(ValueAnimationOptions valueAnimationOptions, int i) {
        Intrinsics.checkNotNullParameter(valueAnimationOptions, "item");
        Object obj = valueAnimationOptions.getDuration().get(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(obj, "item.duration[currentValue]");
        return Integer.valueOf(Math.max(((Number) obj).intValue(), i));
    }

    public final int getDuration() {
        Object reduce = CollectionUtils.reduce(this.valueOptions, 0, new AnimationOptions$$ExternalSyntheticLambda2());
        Intrinsics.checkNotNullExpressionValue(reduce, "reduce(valueOptions, 0, …tValue], currentValue) })");
        return ((Number) reduce).intValue();
    }

    public boolean hasAnimation() {
        return !this.valueOptions.isEmpty();
    }

    public final boolean isFadeAnimation() {
        Object obj;
        if (this.valueOptions.size() == 1) {
            Iterator it = this.valueOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ValueAnimationOptions) obj).isAlpha()) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean setValueDy$lambda$3(Property property, ValueAnimationOptions valueAnimationOptions) {
        Intrinsics.checkNotNullParameter(valueAnimationOptions, "o");
        return valueAnimationOptions.equals((Object) property);
    }

    public final void setValueDy(Property<View, Float> property, float f, float f2) {
        CollectionUtils.first(this.valueOptions, new AnimationOptions$$ExternalSyntheticLambda0(property), new AnimationOptions$$ExternalSyntheticLambda1(f, f2));
    }

    /* access modifiers changed from: private */
    public static final void setValueDy$lambda$4(float f, float f2, ValueAnimationOptions valueAnimationOptions) {
        Intrinsics.checkNotNullParameter(valueAnimationOptions, "param");
        valueAnimationOptions.setFromDelta(f);
        valueAnimationOptions.setToDelta(f2);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/reactnativenavigation/options/AnimationOptions$Companion;", "", "()V", "getAnimProp", "Lkotlin/Triple;", "Landroid/util/Property;", "Landroid/view/View;", "", "", "Lkotlin/Function1;", "key", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AnimationOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Triple<Property<View, Float>, Integer, Function1<View, Float>> getAnimProp(String str) {
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        return new Triple<>(View.ROTATION_X, 0, AnimationOptions$Companion$getAnimProp$8.INSTANCE);
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        return new Triple<>(View.ROTATION_Y, 0, AnimationOptions$Companion$getAnimProp$9.INSTANCE);
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        return new Triple<>(View.TRANSLATION_X, 1, AnimationOptions$Companion$getAnimProp$3.INSTANCE);
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        return new Triple<>(View.TRANSLATION_Y, 1, AnimationOptions$Companion$getAnimProp$4.INSTANCE);
                    }
                    break;
                case -908189618:
                    if (str.equals(ViewProps.SCALE_X)) {
                        return new Triple<>(View.SCALE_X, 0, AnimationOptions$Companion$getAnimProp$6.INSTANCE);
                    }
                    break;
                case -908189617:
                    if (str.equals(ViewProps.SCALE_Y)) {
                        return new Triple<>(View.SCALE_Y, 0, AnimationOptions$Companion$getAnimProp$7.INSTANCE);
                    }
                    break;
                case -40300674:
                    if (str.equals(ViewProps.ROTATION)) {
                        return new Triple<>(View.ROTATION, 0, AnimationOptions$Companion$getAnimProp$10.INSTANCE);
                    }
                    break;
                case 120:
                    if (str.equals("x")) {
                        return new Triple<>(View.X, 1, AnimationOptions$Companion$getAnimProp$1.INSTANCE);
                    }
                    break;
                case 121:
                    if (str.equals("y")) {
                        return new Triple<>(View.Y, 1, AnimationOptions$Companion$getAnimProp$2.INSTANCE);
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        return new Triple<>(View.ALPHA, 0, AnimationOptions$Companion$getAnimProp$5.INSTANCE);
                    }
                    break;
            }
            throw new IllegalArgumentException("This animation is not supported: " + str);
        }
    }
}
