package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.Alignment;
import com.reactnativenavigation.options.FontOptions;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007J\u0006\u0010\u001e\u001a\u00020\u001fJ\r\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0014H\u0007J0\u0010#\u001a\u00020\u00162\n\u0010$\u001a\u00060%j\u0002`&2\n\u0010'\u001a\u00060%j\u0002`(2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0018H\u0002J \u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020%H\u0002J0\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%H\u0014J\u0018\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020%H\u0014J\u000e\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:J\u0018\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0007J\u0018\u0010>\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u000fJ\u0010\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020%H\u0016J\u000e\u0010B\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u000fJ\u0010\u0010C\u001a\u00020\u00162\b\u0010D\u001a\u0004\u0018\u00010EJ\u0010\u0010F\u001a\u00020\u00162\b\b\u0001\u00109\u001a\u00020%J\u000e\u0010G\u001a\u00020\u00162\u0006\u0010H\u001a\u00020IJ\u0016\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u001fJ\u0010\u0010Q\u001a\u00020\u00162\b\u0010R\u001a\u0004\u0018\u00010EJ\u000e\u0010S\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u000fJ\u0010\u0010T\u001a\u00020\u00162\b\b\u0001\u00109\u001a\u00020%J\u000e\u0010U\u001a\u00020\u00162\u0006\u0010H\u001a\u00020IJ\u0010\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u0014H\u0007J\u000e\u0010X\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u000fJ\u0016\u0010Y\u001a\u00020\u00162\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleAndButtonsContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "component", "Landroid/view/View;", "<set-?>", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/ButtonBar;", "leftButtonBar", "getLeftButtonBar", "()Lcom/reactnativenavigation/views/stack/topbar/titlebar/ButtonBar;", "rightButtonBar", "getRightButtonBar", "value", "Lcom/reactnativenavigation/options/Alignment;", "titleComponentAlignment", "setTitleComponentAlignment", "(Lcom/reactnativenavigation/options/Alignment;)V", "titleSubTitleBar", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleSubTitleLayout;", "animateLeftButtons", "", "animate", "", "animateRightButtons", "clearComponent", "()Lkotlin/Unit;", "clearTitle", "getComponent", "getTitle", "", "getTitleComponent", "getTitleComponent$react_native_navigation_reactNative71Release", "getTitleSubtitleBar", "measureTextTitleEnsureTruncatedEndIfNeeded", "titleRight", "", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleRight;", "titleLeft", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleLeft;", "titleComponent", "isCenter", "measureTitleComponentExact", "mode", "containerWidth", "containerHeight", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBackgroundColor", "color", "Lcom/reactnativenavigation/options/params/ThemeColour;", "setButtonBars", "left", "right", "setComponent", "alignment", "setLayoutDirection", "layoutDirection", "setSubTitleTextAlignment", "setSubtitle", "subtitle", "", "setSubtitleColor", "setSubtitleFontSize", "size", "", "setSubtitleTypeface", "typefaceLoader", "Lcom/reactnativenavigation/options/parsers/TypefaceLoader;", "font", "Lcom/reactnativenavigation/options/FontOptions;", "setTestId", "testId", "setTitle", "title", "setTitleBarAlignment", "setTitleColor", "setTitleFontSize", "setTitleSubtitleLayout", "layout", "setTitleTextAlignment", "setTitleTypeface", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TitleAndButtonsContainer.kt */
public final class TitleAndButtonsContainer extends ViewGroup {
    private View component;
    private ButtonBar leftButtonBar;
    private ButtonBar rightButtonBar;
    private Alignment titleComponentAlignment = Alignment.Default;
    private TitleSubTitleLayout titleSubTitleBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleAndButtonsContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleSubTitleBar = new TitleSubTitleLayout(context);
        this.leftButtonBar = new ButtonBar(context);
        this.rightButtonBar = new ButtonBar(context);
        addView(this.leftButtonBar, new ViewGroup.LayoutParams(-2, -1));
        addView(this.titleSubTitleBar, new ViewGroup.LayoutParams(-2, -1));
        addView(this.rightButtonBar, new ViewGroup.LayoutParams(-2, -1));
    }

    private final void setTitleComponentAlignment(Alignment alignment) {
        if (this.titleComponentAlignment != alignment) {
            this.titleComponentAlignment = alignment;
            requestLayout();
        }
    }

    public final void animateLeftButtons(boolean z) {
        this.leftButtonBar.setShouldAnimate(z);
    }

    public final void animateRightButtons(boolean z) {
        this.rightButtonBar.setShouldAnimate(z);
    }

    public final ButtonBar getLeftButtonBar() {
        return this.leftButtonBar;
    }

    public final ButtonBar getRightButtonBar() {
        return this.rightButtonBar;
    }

    public static /* synthetic */ void setComponent$default(TitleAndButtonsContainer titleAndButtonsContainer, View view, Alignment alignment, int i, Object obj) {
        if ((i & 2) != 0) {
            alignment = Alignment.Default;
        }
        titleAndButtonsContainer.setComponent(view, alignment);
    }

    public final void setComponent(View view, Alignment alignment) {
        Intrinsics.checkNotNullParameter(view, "component");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        if (!Intrinsics.areEqual((Object) this.component, (Object) view)) {
            clearTitle();
            this.component = view;
            addView(view, new ViewGroup.LayoutParams(-2, -2));
            setTitleComponentAlignment(alignment);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        clearComponent();
        this.titleSubTitleBar.setVisibility(0);
        this.titleSubTitleBar.setTitle(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        clearComponent();
        this.titleSubTitleBar.setVisibility(0);
        this.titleSubTitleBar.setSubtitle(charSequence);
    }

    public final void setTitleBarAlignment(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        setTitleComponentAlignment(alignment);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        View view = this.component;
        if (view != null) {
            view.setLayoutDirection(i);
        }
        this.titleSubTitleBar.setLayoutDirection(i);
        this.rightButtonBar.setLayoutDirection(i);
        ButtonBar buttonBar = this.leftButtonBar;
        if (ViewExtensionsKt.isRTL(this)) {
            i = 1;
        }
        buttonBar.setLayoutDirection(i);
    }

    public final void setSubTitleTextAlignment(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.titleSubTitleBar.setSubTitleAlignment(alignment);
    }

    public final void setTitleTextAlignment(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.titleSubTitleBar.setTitleAlignment(alignment);
    }

    public final void setBackgroundColor(ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        if (themeColour.hasValue()) {
            setBackgroundColor(themeColour.get());
        }
    }

    public final void setTitleFontSize(float f) {
        this.titleSubTitleBar.setTitleFontSize(f);
    }

    public final void setTitleTypeface(TypefaceLoader typefaceLoader, FontOptions fontOptions) {
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
        Intrinsics.checkNotNullParameter(fontOptions, "font");
        this.titleSubTitleBar.setTitleTypeface(typefaceLoader, fontOptions);
    }

    public final void setSubtitleTypeface(TypefaceLoader typefaceLoader, FontOptions fontOptions) {
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
        Intrinsics.checkNotNullParameter(fontOptions, "font");
        this.titleSubTitleBar.setSubtitleTypeface(typefaceLoader, fontOptions);
    }

    public final void setSubtitleFontSize(float f) {
        this.titleSubTitleBar.setSubtitleFontSize(f);
    }

    public final void setSubtitleColor(int i) {
        this.titleSubTitleBar.setSubtitleTextColor(i);
    }

    public final void setTitleColor(int i) {
        this.titleSubTitleBar.setTitleTextColor(i);
    }

    public final String getTitle() {
        return this.titleSubTitleBar.getTitle();
    }

    public final void clearTitle() {
        this.titleSubTitleBar.clear();
        clearComponent();
    }

    public final void setTestId(String str) {
        Intrinsics.checkNotNullParameter(str, "testId");
        this.titleSubTitleBar.setTestId(str);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View titleComponent$react_native_navigation_reactNative71Release = getTitleComponent$react_native_navigation_reactNative71Release();
        boolean z2 = this.titleComponentAlignment == Alignment.Center;
        int i5 = i3 - i;
        boolean isRTL = ViewExtensionsKt.isRTL(this);
        int measuredWidth = titleComponent$react_native_navigation_reactNative71Release.getMeasuredWidth();
        int measuredHeight = titleComponent$react_native_navigation_reactNative71Release.getMeasuredHeight();
        int measuredWidth2 = this.leftButtonBar.getMeasuredWidth();
        Pair<Integer, Integer> resolveHorizontalTitleBoundsLimit = TitleAndButtonsMeasurerKt.resolveHorizontalTitleBoundsLimit(i5, measuredWidth, measuredWidth2, this.rightButtonBar.getMeasuredWidth(), z2, isRTL);
        int intValue = resolveHorizontalTitleBoundsLimit.component1().intValue();
        int intValue2 = resolveHorizontalTitleBoundsLimit.component2().intValue();
        Pair<Integer, Integer> resolveVerticalTitleBoundsLimit = TitleAndButtonsMeasurerKt.resolveVerticalTitleBoundsLimit(i4 - i2, measuredHeight);
        int intValue3 = resolveVerticalTitleBoundsLimit.component1().intValue();
        int intValue4 = resolveVerticalTitleBoundsLimit.component2().intValue();
        Pair<Integer, Integer> resolveLeftButtonsBounds = TitleAndButtonsMeasurerKt.resolveLeftButtonsBounds(i5, measuredWidth2, isRTL);
        int intValue5 = resolveLeftButtonsBounds.component1().intValue();
        int intValue6 = resolveLeftButtonsBounds.component2().intValue();
        Pair<Integer, Integer> resolveRightButtonsBounds = TitleAndButtonsMeasurerKt.resolveRightButtonsBounds(i5, this.rightButtonBar.getMeasuredWidth(), isRTL);
        int intValue7 = resolveRightButtonsBounds.component1().intValue();
        int intValue8 = resolveRightButtonsBounds.component2().intValue();
        this.leftButtonBar.layout(intValue5, i2, intValue6, i4);
        this.rightButtonBar.layout(intValue7, i2, intValue8, i4);
        titleComponent$react_native_navigation_reactNative71Release.layout(intValue, intValue3, intValue2, intValue4);
        measureTextTitleEnsureTruncatedEndIfNeeded(intValue2, intValue, titleComponent$react_native_navigation_reactNative71Release, z2);
    }

    private final void measureTextTitleEnsureTruncatedEndIfNeeded(int i, int i2, View view, boolean z) {
        int i3;
        int i4;
        if (this.component == null && (i3 = i - i2) != view.getMeasuredWidth()) {
            if (z) {
                i4 = 0;
            } else {
                i4 = TitleAndButtonsMeasurerKt.getDEFAULT_LEFT_MARGIN_PX() * 2;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureTitleComponentExact(mode, size, size2);
        setMeasuredDimension(size, size2);
    }

    private final void measureTitleComponentExact(int i, int i2, int i3) {
        if (i == 1073741824) {
            View titleComponent$react_native_navigation_reactNative71Release = getTitleComponent$react_native_navigation_reactNative71Release();
            this.rightButtonBar.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            this.leftButtonBar.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            int measuredWidth = this.rightButtonBar.getMeasuredWidth();
            int measuredWidth2 = this.leftButtonBar.getMeasuredWidth();
            boolean z = this.titleComponentAlignment == Alignment.Center;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            int makeTitleAtMostWidthMeasureSpec = TitleAndButtonsMeasurerKt.makeTitleAtMostWidthMeasureSpec(i2, measuredWidth, measuredWidth2, z);
            if (titleComponent$react_native_navigation_reactNative71Release instanceof TitleBarReactView) {
                ((TitleBarReactView) titleComponent$react_native_navigation_reactNative71Release).setCentered(z);
            }
            titleComponent$react_native_navigation_reactNative71Release.measure(makeTitleAtMostWidthMeasureSpec, makeMeasureSpec);
        }
    }

    private final Unit clearComponent() {
        View view = this.component;
        if (view == null) {
            return null;
        }
        ViewExtensionsKt.removeFromParent(view);
        this.component = null;
        return Unit.INSTANCE;
    }

    public final View getTitleComponent$react_native_navigation_reactNative71Release() {
        View view = this.component;
        return view == null ? this.titleSubTitleBar : view;
    }

    public final View getComponent() {
        return this.component;
    }

    public final void setTitleSubtitleLayout(TitleSubTitleLayout titleSubTitleLayout) {
        Intrinsics.checkNotNullParameter(titleSubTitleLayout, "layout");
        removeView(this.titleSubTitleBar);
        this.titleSubTitleBar = titleSubTitleLayout;
        addView(titleSubTitleLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void setButtonBars(ButtonBar buttonBar, ButtonBar buttonBar2) {
        Intrinsics.checkNotNullParameter(buttonBar, "left");
        Intrinsics.checkNotNullParameter(buttonBar2, ViewProps.RIGHT);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.leftButtonBar.getLayoutParams());
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(this.rightButtonBar.getLayoutParams());
        removeView(this.leftButtonBar);
        removeView(this.rightButtonBar);
        addView(buttonBar, layoutParams);
        addView(buttonBar2, layoutParams2);
        this.leftButtonBar = buttonBar;
        this.rightButtonBar = buttonBar2;
    }

    public final TitleSubTitleLayout getTitleSubtitleBar() {
        return this.titleSubTitleBar;
    }
}
