package com.reactnativenavigation.options;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import com.brentvatne.react.ReactVideoView;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullText;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.Text;
import com.reactnativenavigation.options.parsers.InterpolationParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import com.reactnativenavigation.options.parsers.TextParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u001bJ\u0006\u0010\u0016\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "", "()V", "duration", "Lcom/reactnativenavigation/options/params/Number;", "getDuration", "()Lcom/reactnativenavigation/options/params/Number;", "setDuration", "(Lcom/reactnativenavigation/options/params/Number;)V", "fromId", "Lcom/reactnativenavigation/options/params/Text;", "getFromId", "()Lcom/reactnativenavigation/options/params/Text;", "setFromId", "(Lcom/reactnativenavigation/options/params/Text;)V", "interpolator", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", "startDelay", "getStartDelay", "setStartDelay", "toId", "getToId", "setToId", "", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SharedElementTransitionOptions.kt */
public final class SharedElementTransitionOptions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Number duration = new NullNumber();
    private Text fromId = new NullText();
    private TimeInterpolator interpolator = new LinearInterpolator();
    private Number startDelay = new NullNumber();
    private Text toId = new NullText();

    @JvmStatic
    public static final SharedElementTransitionOptions parse(JSONObject jSONObject) {
        return Companion.parse(jSONObject);
    }

    public final Text getFromId() {
        return this.fromId;
    }

    public final void setFromId(Text text) {
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        this.fromId = text;
    }

    public final Text getToId() {
        return this.toId;
    }

    public final void setToId(Text text) {
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        this.toId = text;
    }

    /* renamed from: getDuration  reason: collision with other method in class */
    public final Number m962getDuration() {
        return this.duration;
    }

    public final void setDuration(Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.duration = number;
    }

    /* renamed from: getStartDelay  reason: collision with other method in class */
    public final Number m963getStartDelay() {
        return this.startDelay;
    }

    public final void setStartDelay(Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.startDelay = number;
    }

    public final TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<set-?>");
        this.interpolator = timeInterpolator;
    }

    public final long getDuration() {
        return (long) ((Number) this.duration.get(0)).intValue();
    }

    public final long getStartDelay() {
        return (long) ((Number) this.startDelay.get(0)).intValue();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/options/SharedElementTransitionOptions$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "json", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SharedElementTransitionOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SharedElementTransitionOptions parse(JSONObject jSONObject) {
            SharedElementTransitionOptions sharedElementTransitionOptions = new SharedElementTransitionOptions();
            if (jSONObject == null) {
                return sharedElementTransitionOptions;
            }
            Text parse = TextParser.parse(jSONObject, "fromId");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(json, \"fromId\")");
            sharedElementTransitionOptions.setFromId(parse);
            Text parse2 = TextParser.parse(jSONObject, "toId");
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(json, \"toId\")");
            sharedElementTransitionOptions.setToId(parse2);
            Number parse3 = NumberParser.parse(jSONObject, ReactVideoView.EVENT_PROP_DURATION);
            Intrinsics.checkNotNullExpressionValue(parse3, "parse(json, \"duration\")");
            sharedElementTransitionOptions.setDuration(parse3);
            Number parse4 = NumberParser.parse(jSONObject, "startDelay");
            Intrinsics.checkNotNullExpressionValue(parse4, "parse(json, \"startDelay\")");
            sharedElementTransitionOptions.setStartDelay(parse4);
            TimeInterpolator parse5 = InterpolationParser.parse(jSONObject);
            Intrinsics.checkNotNullExpressionValue(parse5, "parse(json)");
            sharedElementTransitionOptions.setInterpolator(parse5);
            return sharedElementTransitionOptions;
        }
    }
}
