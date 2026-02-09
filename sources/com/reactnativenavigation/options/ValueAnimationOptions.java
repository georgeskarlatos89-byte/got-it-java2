package com.reactnativenavigation.options;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.brentvatne.react.ReactVideoView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.params.FloatParam;
import com.reactnativenavigation.options.params.NullFloatParam;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.parsers.FloatParser;
import com.reactnativenavigation.options.parsers.InterpolationParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import com.reactnativenavigation.utils.UiUtils;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0016\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005J\b\u0010%\u001a\u00020\bH\u0016J\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/reactnativenavigation/options/ValueAnimationOptions;", "", "()V", "animProp", "Landroid/util/Property;", "Landroid/view/View;", "", "animPropType", "", "Ljava/lang/Integer;", "animationValueAccessor", "Lkotlin/Function1;", "duration", "Lcom/reactnativenavigation/options/params/Number;", "getDuration", "()Lcom/reactnativenavigation/options/params/Number;", "setDuration", "(Lcom/reactnativenavigation/options/params/Number;)V", "<set-?>", "Lcom/reactnativenavigation/options/params/FloatParam;", "from", "getFrom", "()Lcom/reactnativenavigation/options/params/FloatParam;", "fromDelta", "interpolator", "Landroid/animation/TimeInterpolator;", "startDelay", "to", "getTo", "toDelta", "equals", "", "animationProperty", "other", "getAnimation", "Landroid/animation/Animator;", "view", "hashCode", "isAlpha", "setFromDelta", "", "setToDelta", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ValueAnimationOptions.kt */
public final class ValueAnimationOptions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public Property<View, Float> animProp;
    /* access modifiers changed from: private */
    public Integer animPropType;
    /* access modifiers changed from: private */
    public Function1<? super View, Float> animationValueAccessor;
    private Number duration;
    /* access modifiers changed from: private */
    public FloatParam from = new NullFloatParam();
    private FloatParam fromDelta;
    /* access modifiers changed from: private */
    public TimeInterpolator interpolator;
    /* access modifiers changed from: private */
    public Number startDelay;
    /* access modifiers changed from: private */
    public FloatParam to;
    private FloatParam toDelta;

    public ValueAnimationOptions() {
        Float valueOf = Float.valueOf(0.0f);
        this.fromDelta = new FloatParam(valueOf);
        this.to = new NullFloatParam();
        this.toDelta = new FloatParam(valueOf);
        this.duration = new NullNumber();
        this.startDelay = new NullNumber();
        this.interpolator = new LinearInterpolator();
    }

    public final FloatParam getFrom() {
        return this.from;
    }

    public final FloatParam getTo() {
        return this.to;
    }

    public final Number getDuration() {
        return this.duration;
    }

    public final void setDuration(Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.duration = number;
    }

    public final void setFromDelta(float f) {
        this.fromDelta = new FloatParam(Float.valueOf(f));
    }

    public final void setToDelta(float f) {
        this.toDelta = new FloatParam(Float.valueOf(f));
    }

    public final Animator getAnimation(View view) {
        Float f;
        Float f2;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (this.from.hasValue() || this.to.hasValue()) {
            Float f3 = (Float) this.fromDelta.get();
            Float f4 = (Float) this.toDelta.get();
            Integer num = this.animPropType;
            if (num != null && num.intValue() == 1) {
                float floatValue = f3.floatValue();
                Context context = view.getContext();
                FloatParam floatParam = this.from;
                Function1<? super View, Float> function1 = this.animationValueAccessor;
                Intrinsics.checkNotNull(function1);
                Object obj = floatParam.get(function1.invoke(view));
                Intrinsics.checkNotNullExpressionValue(obj, "this.from[animationValueAccessor!!(view)]");
                f2 = Float.valueOf(floatValue + UiUtils.dpToPx(context, ((Number) obj).floatValue()));
                float floatValue2 = f4.floatValue();
                Context context2 = view.getContext();
                FloatParam floatParam2 = this.to;
                Function1<? super View, Float> function12 = this.animationValueAccessor;
                Intrinsics.checkNotNull(function12);
                Object obj2 = floatParam2.get(function12.invoke(view));
                Intrinsics.checkNotNullExpressionValue(obj2, "this.to[animationValueAccessor!!(view)]");
                f = Float.valueOf(floatValue2 + UiUtils.dpToPx(context2, ((Number) obj2).floatValue()));
            } else {
                float floatValue3 = f3.floatValue();
                FloatParam floatParam3 = this.from;
                Function1<? super View, Float> function13 = this.animationValueAccessor;
                Intrinsics.checkNotNull(function13);
                Object obj3 = floatParam3.get(function13.invoke(view));
                Intrinsics.checkNotNullExpressionValue(obj3, "this.from[animationValueAccessor!!(view)]");
                f2 = Float.valueOf(floatValue3 + ((Number) obj3).floatValue());
                float floatValue4 = f4.floatValue();
                FloatParam floatParam4 = this.to;
                Function1<? super View, Float> function14 = this.animationValueAccessor;
                Intrinsics.checkNotNull(function14);
                Object obj4 = floatParam4.get(function14.invoke(view));
                Intrinsics.checkNotNullExpressionValue(obj4, "this.to[animationValueAccessor!!(view)]");
                f = Float.valueOf(floatValue4 + ((Number) obj4).floatValue());
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.animProp, new float[]{f2.floatValue(), f.floatValue()});
            ofFloat.setInterpolator(this.interpolator);
            if (this.duration.hasValue()) {
                ofFloat.setDuration((long) ((Number) this.duration.get()).intValue());
            }
            if (this.startDelay.hasValue()) {
                ofFloat.setStartDelay((long) ((Number) this.startDelay.get()).intValue());
            }
            Intrinsics.checkNotNullExpressionValue(ofFloat, "animator");
            return ofFloat;
        }
        throw new IllegalArgumentException("Params 'from' and 'to' are mandatory".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) getClass(), (Object) obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.animProp, (Object) ((ValueAnimationOptions) obj).animProp);
    }

    public final boolean equals(Property<View, Float> property) {
        Intrinsics.checkNotNullParameter(property, "animationProperty");
        Property<View, Float> property2 = this.animProp;
        Intrinsics.checkNotNull(property2);
        return Intrinsics.areEqual((Object) property2.getName(), (Object) property.getName());
    }

    public int hashCode() {
        Property<View, Float> property = this.animProp;
        if (property != null) {
            return property.hashCode();
        }
        return 0;
    }

    public final boolean isAlpha() {
        return Intrinsics.areEqual((Object) this.animProp, (Object) View.ALPHA);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000624\u0010\u0007\u001a0\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\r0\b¨\u0006\u000e"}, d2 = {"Lcom/reactnativenavigation/options/ValueAnimationOptions$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/ValueAnimationOptions;", "json", "Lorg/json/JSONObject;", "property", "Lkotlin/Triple;", "Landroid/util/Property;", "Landroid/view/View;", "", "", "Lkotlin/Function1;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ValueAnimationOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ValueAnimationOptions parse(JSONObject jSONObject, Triple<? extends Property<View, Float>, Integer, ? extends Function1<? super View, Float>> triple) {
            Intrinsics.checkNotNullParameter(triple, "property");
            ValueAnimationOptions valueAnimationOptions = new ValueAnimationOptions();
            valueAnimationOptions.animProp = (Property) triple.getFirst();
            valueAnimationOptions.animPropType = triple.getSecond();
            valueAnimationOptions.animationValueAccessor = (Function1) triple.getThird();
            FloatParam parse = FloatParser.parse(jSONObject, Constants.MessagePayloadKeys.FROM);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(json, \"from\")");
            valueAnimationOptions.from = parse;
            FloatParam parse2 = FloatParser.parse(jSONObject, "to");
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(json, \"to\")");
            valueAnimationOptions.to = parse2;
            Number parse3 = NumberParser.parse(jSONObject, ReactVideoView.EVENT_PROP_DURATION);
            Intrinsics.checkNotNullExpressionValue(parse3, "parse(json, \"duration\")");
            valueAnimationOptions.setDuration(parse3);
            Number parse4 = NumberParser.parse(jSONObject, "startDelay");
            Intrinsics.checkNotNullExpressionValue(parse4, "parse(json, \"startDelay\")");
            valueAnimationOptions.startDelay = parse4;
            TimeInterpolator parse5 = InterpolationParser.parse(jSONObject);
            Intrinsics.checkNotNullExpressionValue(parse5, "parse(json)");
            valueAnimationOptions.interpolator = parse5;
            return valueAnimationOptions;
        }
    }
}
