package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.ArrayList;

public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    /* access modifiers changed from: private */
    public static final TextPaint sTextPaintInstance = new TextPaint(1);
    /* access modifiers changed from: private */
    public Spannable mPreparedSpannableText;
    /* access modifiers changed from: private */
    public boolean mShouldNotifyOnTextLayout;
    private final YogaBaselineFunction mTextBaselineFunction;
    private final YogaMeasureFunction mTextMeasureFunction;

    public boolean hoistNativeChildren() {
        return true;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public ReactTextShadowNode() {
        this((ReactTextViewManagerCallback) null);
    }

    public ReactTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mTextMeasureFunction = new YogaMeasureFunction() {
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x016b, code lost:
                if (r2 > r21) goto L_0x016d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long measure(com.facebook.yoga.YogaNode r18, float r19, com.facebook.yoga.YogaMeasureMode r20, float r21, com.facebook.yoga.YogaMeasureMode r22) {
                /*
                    r17 = this;
                    r0 = r17
                    r1 = r19
                    r2 = r20
                    r3 = r22
                    com.facebook.react.views.text.ReactTextShadowNode r4 = com.facebook.react.views.text.ReactTextShadowNode.this
                    android.text.Spannable r4 = r4.mPreparedSpannableText
                    java.lang.String r5 = "Spannable element has not been prepared in onBeforeLayout"
                    java.lang.Object r4 = com.facebook.infer.annotation.Assertions.assertNotNull(r4, r5)
                    android.text.Spannable r4 = (android.text.Spannable) r4
                    com.facebook.react.views.text.ReactTextShadowNode r5 = com.facebook.react.views.text.ReactTextShadowNode.this
                    android.text.Layout r5 = r5.measureSpannedText(r4, r1, r2)
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    boolean r6 = r6.mAdjustsFontSizeToFit
                    r7 = -1
                    r8 = 0
                    if (r6 == 0) goto L_0x00b5
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    com.facebook.react.views.text.TextAttributes r6 = r6.mTextAttributes
                    int r6 = r6.getEffectiveFontSize()
                    com.facebook.react.views.text.ReactTextShadowNode r9 = com.facebook.react.views.text.ReactTextShadowNode.this
                    com.facebook.react.views.text.TextAttributes r9 = r9.mTextAttributes
                    int r9 = r9.getEffectiveFontSize()
                    com.facebook.react.views.text.ReactTextShadowNode r10 = com.facebook.react.views.text.ReactTextShadowNode.this
                    float r10 = r10.mMinimumFontScale
                    float r6 = (float) r6
                    float r10 = r10 * r6
                    r11 = 1082130432(0x40800000, float:4.0)
                    float r11 = com.facebook.react.uimanager.PixelUtil.toPixelFromDIP((float) r11)
                    float r10 = java.lang.Math.max(r10, r11)
                    int r10 = (int) r10
                L_0x0045:
                    if (r9 <= r10) goto L_0x00b5
                    com.facebook.react.views.text.ReactTextShadowNode r11 = com.facebook.react.views.text.ReactTextShadowNode.this
                    int r11 = r11.mNumberOfLines
                    if (r11 == r7) goto L_0x0057
                    int r11 = r5.getLineCount()
                    com.facebook.react.views.text.ReactTextShadowNode r12 = com.facebook.react.views.text.ReactTextShadowNode.this
                    int r12 = r12.mNumberOfLines
                    if (r11 > r12) goto L_0x0064
                L_0x0057:
                    com.facebook.yoga.YogaMeasureMode r11 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
                    if (r3 == r11) goto L_0x00b5
                    int r11 = r5.getHeight()
                    float r11 = (float) r11
                    int r11 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00b5
                L_0x0064:
                    r5 = 1065353216(0x3f800000, float:1.0)
                    float r5 = com.facebook.react.uimanager.PixelUtil.toPixelFromDIP((float) r5)
                    int r5 = (int) r5
                    int r9 = r9 - r5
                    float r5 = (float) r9
                    float r5 = r5 / r6
                    int r11 = r4.length()
                    java.lang.Class<com.facebook.react.views.text.ReactAbsoluteSizeSpan> r12 = com.facebook.react.views.text.ReactAbsoluteSizeSpan.class
                    java.lang.Object[] r11 = r4.getSpans(r8, r11, r12)
                    com.facebook.react.views.text.ReactAbsoluteSizeSpan[] r11 = (com.facebook.react.views.text.ReactAbsoluteSizeSpan[]) r11
                    int r12 = r11.length
                    r13 = r8
                L_0x007c:
                    if (r13 >= r12) goto L_0x00ac
                    r14 = r11[r13]
                    com.facebook.react.views.text.ReactAbsoluteSizeSpan r15 = new com.facebook.react.views.text.ReactAbsoluteSizeSpan
                    int r8 = r14.getSize()
                    float r8 = (float) r8
                    float r8 = r8 * r5
                    float r7 = (float) r10
                    float r7 = java.lang.Math.max(r8, r7)
                    int r7 = (int) r7
                    r15.<init>(r7)
                    int r7 = r4.getSpanStart(r14)
                    int r8 = r4.getSpanEnd(r14)
                    r16 = r5
                    int r5 = r4.getSpanFlags(r14)
                    r4.setSpan(r15, r7, r8, r5)
                    r4.removeSpan(r14)
                    int r13 = r13 + 1
                    r5 = r16
                    r7 = -1
                    r8 = 0
                    goto L_0x007c
                L_0x00ac:
                    com.facebook.react.views.text.ReactTextShadowNode r5 = com.facebook.react.views.text.ReactTextShadowNode.this
                    android.text.Layout r5 = r5.measureSpannedText(r4, r1, r2)
                    r7 = -1
                    r8 = 0
                    goto L_0x0045
                L_0x00b5:
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    boolean r6 = r6.mShouldNotifyOnTextLayout
                    if (r6 == 0) goto L_0x00fa
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    com.facebook.react.uimanager.ThemedReactContext r6 = r6.getThemedContext()
                    android.text.TextPaint r7 = com.facebook.react.views.text.ReactTextShadowNode.sTextPaintInstance
                    com.facebook.react.bridge.WritableArray r7 = com.facebook.react.views.text.FontMetricsUtil.getFontMetrics(r4, r5, r7, r6)
                    com.facebook.react.bridge.WritableMap r8 = com.facebook.react.bridge.Arguments.createMap()
                    java.lang.String r9 = "lines"
                    r8.putArray(r9, r7)
                    boolean r7 = r6.hasActiveReactInstance()
                    if (r7 == 0) goto L_0x00ee
                    java.lang.Class<com.facebook.react.uimanager.events.RCTEventEmitter> r7 = com.facebook.react.uimanager.events.RCTEventEmitter.class
                    com.facebook.react.bridge.JavaScriptModule r6 = r6.getJSModule(r7)
                    com.facebook.react.uimanager.events.RCTEventEmitter r6 = (com.facebook.react.uimanager.events.RCTEventEmitter) r6
                    com.facebook.react.views.text.ReactTextShadowNode r7 = com.facebook.react.views.text.ReactTextShadowNode.this
                    int r7 = r7.getReactTag()
                    java.lang.String r9 = "topTextLayout"
                    r6.receiveEvent(r7, r9, r8)
                    goto L_0x00fa
                L_0x00ee:
                    com.facebook.react.bridge.ReactNoCrashSoftException r6 = new com.facebook.react.bridge.ReactNoCrashSoftException
                    java.lang.String r7 = "Cannot get RCTEventEmitter, no CatalystInstance"
                    r6.<init>((java.lang.String) r7)
                    java.lang.String r7 = "ReactTextShadowNode"
                    com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r7, r6)
                L_0x00fa:
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    int r6 = r6.mNumberOfLines
                    r7 = -1
                    if (r6 != r7) goto L_0x0106
                    int r6 = r5.getLineCount()
                    goto L_0x0112
                L_0x0106:
                    com.facebook.react.views.text.ReactTextShadowNode r6 = com.facebook.react.views.text.ReactTextShadowNode.this
                    int r6 = r6.mNumberOfLines
                    int r7 = r5.getLineCount()
                    int r6 = java.lang.Math.min(r6, r7)
                L_0x0112:
                    com.facebook.yoga.YogaMeasureMode r7 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                    r8 = 1
                    if (r2 != r7) goto L_0x0118
                    goto L_0x014f
                L_0x0118:
                    r7 = 0
                    r9 = 0
                L_0x011a:
                    if (r9 >= r6) goto L_0x0145
                    int r10 = r4.length()
                    if (r10 <= 0) goto L_0x0131
                    int r10 = r5.getLineEnd(r9)
                    int r10 = r10 - r8
                    char r10 = r4.charAt(r10)
                    r11 = 10
                    if (r10 != r11) goto L_0x0131
                    r10 = r8
                    goto L_0x0132
                L_0x0131:
                    r10 = 0
                L_0x0132:
                    if (r10 == 0) goto L_0x0139
                    float r10 = r5.getLineMax(r9)
                    goto L_0x013d
                L_0x0139:
                    float r10 = r5.getLineWidth(r9)
                L_0x013d:
                    int r11 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0142
                    r7 = r10
                L_0x0142:
                    int r9 = r9 + 1
                    goto L_0x011a
                L_0x0145:
                    com.facebook.yoga.YogaMeasureMode r4 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                    if (r2 != r4) goto L_0x014e
                    int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                    if (r2 <= 0) goto L_0x014e
                    goto L_0x014f
                L_0x014e:
                    r1 = r7
                L_0x014f:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r4 = 29
                    if (r2 <= r4) goto L_0x015b
                    double r1 = (double) r1
                    double r1 = java.lang.Math.ceil(r1)
                    float r1 = (float) r1
                L_0x015b:
                    com.facebook.yoga.YogaMeasureMode r2 = com.facebook.yoga.YogaMeasureMode.EXACTLY
                    if (r3 == r2) goto L_0x016d
                    int r6 = r6 - r8
                    int r2 = r5.getLineBottom(r6)
                    float r2 = (float) r2
                    com.facebook.yoga.YogaMeasureMode r4 = com.facebook.yoga.YogaMeasureMode.AT_MOST
                    if (r3 != r4) goto L_0x016f
                    int r3 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
                    if (r3 <= 0) goto L_0x016f
                L_0x016d:
                    r2 = r21
                L_0x016f:
                    long r1 = com.facebook.yoga.YogaMeasureOutput.make((float) r1, (float) r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextShadowNode.AnonymousClass1.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
            }
        };
        this.mTextBaselineFunction = new YogaBaselineFunction() {
            public float baseline(YogaNode yogaNode, float f, float f2) {
                Layout r2 = ReactTextShadowNode.this.measureSpannedText((Spannable) Assertions.assertNotNull(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout"), f, YogaMeasureMode.EXACTLY);
                return (float) r2.getLineBaseline(r2.getLineCount() - 1);
            }
        };
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
            setBaselineFunction(this.mTextBaselineFunction);
        }
    }

    /* access modifiers changed from: private */
    public Layout measureSpannedText(Spannable spannable, float f, YogaMeasureMode yogaMeasureMode) {
        TextPaint textPaint = sTextPaintInstance;
        textPaint.setTextSize((float) this.mTextAttributes.getEffectiveFontSize());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int textAlign = getTextAlign();
        if (textAlign == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (textAlign == 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (textAlign == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z || (!YogaConstants.isUndefined(desiredWidth) && desiredWidth <= f))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil((double) desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            if (Build.VERSION.SDK_INT >= 26) {
                hyphenationFrequency.setJustificationMode(this.mJustificationMode);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring == null || (!z && ((float) isBoring.width) > f)) {
            if (Build.VERSION.SDK_INT > 29) {
                f = (float) Math.ceil((double) f);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            if (Build.VERSION.SDK_INT >= 28) {
                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        } else {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, 0.0f, isBoring, this.mIncludeFontPadding);
        }
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        this.mPreparedSpannableText = spannedFromShadowNode(this, (String) null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mPreparedSpannableText != null) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(this.mPreparedSpannableText, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.mShouldNotifyOnTextLayout = z;
    }

    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (this.mInlineViews == null || this.mInlineViews.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) Assertions.assertNotNull(this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spanned.getSpans(0, spanned.length(), TextInlineViewPlaceholderSpan.class);
        ArrayList arrayList = new ArrayList(textInlineViewPlaceholderSpanArr.length);
        for (TextInlineViewPlaceholderSpan reactTag : textInlineViewPlaceholderSpanArr) {
            ReactShadowNode reactShadowNode = (ReactShadowNode) this.mInlineViews.get(Integer.valueOf(reactTag.getReactTag()));
            reactShadowNode.calculateLayout();
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }
}
