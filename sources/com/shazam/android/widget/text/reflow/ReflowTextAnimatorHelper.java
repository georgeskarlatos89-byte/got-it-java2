package com.shazam.android.widget.text.reflow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.transition.PathMotion;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

public final class ReflowTextAnimatorHelper {
    private static final char ELLIPSIS = '…';
    private static final boolean IS_LOLLIPOP_OR_ABOVE = true;
    private static final int OPACITY_MID_TRANSITION = 204;
    private static final int OPAQUE = 255;
    private static final float STAGGER_DECAY = 0.8f;
    private static final int TRANSPARENT = 0;
    private final AnimatorSet animator;
    private final BoundsCalculator boundsCalculator;
    private boolean calculateDuration;
    private long duration;
    private Bitmap endText;
    private final TextSizeGetter fontSizeGetter;
    private final boolean freezeOnLastFrame;
    private final long maxDuration;
    private final long minDuration;
    private final boolean showLayers;
    private final TextView sourceView;
    private long staggerDelay;
    private Bitmap startText;
    private final TextView targetView;
    private final TextColorGetter textColorGetter;
    private final long velocity;

    private ReflowTextAnimatorHelper(Builder builder) {
        this.animator = new AnimatorSet();
        this.showLayers = builder.showLayers;
        this.sourceView = builder.sourceView;
        this.targetView = builder.targetView;
        this.minDuration = builder.minDuration;
        this.maxDuration = builder.maxDuration;
        this.calculateDuration = builder.calculateDuration;
        this.staggerDelay = builder.staggerDelay;
        this.velocity = builder.velocity;
        this.freezeOnLastFrame = builder.freezeOnLastFrame;
        this.fontSizeGetter = builder.fontSizeGetter;
        this.textColorGetter = builder.textColorGetter;
        this.boundsCalculator = builder.boundsCalculator;
    }

    public Animator createAnimator() {
        this.duration = this.calculateDuration ? calculateDuration(this.boundsCalculator.calculate(this.sourceView), this.boundsCalculator.calculate(this.targetView)) : -1;
        this.startText = createBitmap(this.sourceView);
        this.endText = createBitmap(this.targetView);
        this.targetView.setWillNotDraw(true);
        ((ViewGroup) this.targetView.getParent()).setClipChildren(false);
        this.animator.playTogether(createRunAnimators(this.targetView, this.startText, this.endText, getRuns()));
        if (!this.freezeOnLastFrame) {
            this.animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    ReflowTextAnimatorHelper.this.unfreeze();
                }
            });
        }
        return this.animator;
    }

    public void unfreeze() {
        this.targetView.setWillNotDraw(false);
        this.targetView.getOverlay().clear();
        ((ViewGroup) this.targetView.getParent()).setClipChildren(true);
        Bitmap bitmap = this.startText;
        if (bitmap != null) {
            bitmap.recycle();
            this.startText = null;
        }
        Bitmap bitmap2 = this.endText;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.endText = null;
        }
    }

    private List<Run> getRuns() {
        int i = 1;
        int max = Math.max(this.sourceView.getLayout().getLineVisibleEnd(this.sourceView.getLayout().getLineCount() - 1), this.targetView.getLayout().getLineVisibleEnd(this.targetView.getLayout().getLineCount() - 1));
        ArrayList arrayList = new ArrayList();
        Layout layout = this.sourceView.getLayout();
        Layout layout2 = this.targetView.getLayout();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i3 < max) {
            int i12 = i3 == max + -1 ? i : 0;
            int lineForOffset = layout.getLineForOffset(i3);
            int i13 = max;
            Layout createUnrestrictedLayout = (i12 == 0 && layout.getText().charAt(i3) == 8230) ? createUnrestrictedLayout(this.sourceView) : layout;
            int lineForOffset2 = layout2.getLineForOffset(i3);
            ArrayList arrayList2 = arrayList;
            layout2 = (i12 == 0 && layout2.getText().charAt(i3) == 8230) ? createUnrestrictedLayout(this.targetView) : layout2;
            if (lineForOffset == i4 && lineForOffset2 == i5 && i12 == 0) {
                arrayList = arrayList2;
                i = 1;
            } else {
                if (i12 != 0) {
                    i3++;
                }
                int min = Math.min(i4, createUnrestrictedLayout.getLineCount() - 1);
                int min2 = Math.min(i5, layout2.getLineCount() - 1);
                int lineBottom = createUnrestrictedLayout.getLineBottom(min);
                int lineBottom2 = layout2.getLineBottom(min2);
                int i14 = lineForOffset2;
                if (min == 0 && i6 == -1) {
                    i6 = getStartOffsetLeft(createUnrestrictedLayout, min);
                }
                if (min2 == 0 && i7 == -1) {
                    i7 = getStartOffsetLeft(layout2, min2);
                }
                int i15 = i11;
                Rect rect = new Rect(i8, i9, i8 + getSectionWidth(createUnrestrictedLayout, i15, i3), lineBottom);
                rect.offset(this.sourceView.getCompoundPaddingLeft() + i6, this.sourceView.getCompoundPaddingTop());
                Rect rect2 = new Rect(i10, i2, getSectionWidth(layout2, i15, i3) + i10, lineBottom2);
                rect2.offset(this.targetView.getCompoundPaddingLeft() + i7, this.targetView.getCompoundPaddingTop());
                boolean z = lineBottom <= this.sourceView.getMeasuredHeight();
                boolean z2 = lineBottom2 <= this.targetView.getMeasuredHeight();
                if (!z && !z2) {
                    return arrayList2;
                }
                Run run = new Run(rect, z, rect2, z2);
                arrayList = arrayList2;
                arrayList.add(run);
                i8 = (int) createUnrestrictedLayout.getPrimaryHorizontal(i3);
                i9 = createUnrestrictedLayout.getLineTop(lineForOffset);
                i10 = (int) layout2.getPrimaryHorizontal(i3);
                int i16 = i14;
                i2 = layout2.getLineTop(i16);
                i4 = lineForOffset;
                i5 = i16;
                i11 = i3;
                i = 1;
                i6 = 0;
                i7 = 0;
            }
            i3 += i;
            layout = createUnrestrictedLayout;
            max = i13;
        }
        return arrayList;
    }

    private int getStartOffsetLeft(Layout layout, int i) {
        return (int) layout.getLineLeft(i);
    }

    private static int getSectionWidth(Layout layout, int i, int i2) {
        return (int) Layout.getDesiredWidth(layout.getText(), i, i2, layout.getPaint());
    }

    private static Layout createUnrestrictedLayout(TextView textView) {
        CharSequence text = textView.getText();
        Layout layout = textView.getLayout();
        layout.getPaint();
        return StaticLayout.Builder.obtain(text, 0, text.length(), layout.getPaint(), layout.getWidth()).setAlignment(layout.getAlignment()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }

    private static void drawLayerBounds(Canvas canvas, Rect rect, int i, Paint paint, Paint paint2, Paint paint3) {
        Rect rect2 = new Rect(rect.left + 1, rect.top + 1, rect.right - 1, rect.bottom - 1);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect2, paint2);
        canvas.drawText("" + i, (float) (rect.left + 6), (float) (rect.top + 21), paint3);
    }

    private List<Animator> createRunAnimators(View view, Bitmap bitmap, Bitmap bitmap2, List<Run> list) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        char c;
        Rect calculate = this.boundsCalculator.calculate(this.sourceView);
        Rect calculate2 = this.boundsCalculator.calculate(this.targetView);
        ArrayList arrayList = new ArrayList(list.size());
        int i6 = calculate2.left - calculate.left;
        int i7 = calculate2.top - calculate.top;
        int i8 = 1;
        boolean z4 = calculate.centerY() > calculate2.centerY();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (this.showLayers) {
            Paint paint = new Paint();
            paint.setTextSize(20.0f);
            paint.setColor(-16777216);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(1.0f);
            paint2.setColor(-2130771968);
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(1.0f);
            paint3.setColor(-2130771968);
            int[] intArray = this.sourceView.getResources().getIntArray(R.array.debug_colors);
            Canvas canvas = new Canvas(bitmap);
            Canvas canvas2 = new Canvas(bitmap2);
            Paint paint4 = new Paint();
            int i9 = 1;
            int i10 = 0;
            for (Run next : list) {
                int i11 = i10 + 1;
                paint4.setColor(intArray[i10 % intArray.length]);
                paint4.setAlpha(128);
                Paint paint5 = paint4;
                Canvas canvas3 = canvas2;
                int i12 = i9;
                Paint paint6 = paint5;
                Canvas canvas4 = canvas;
                Paint paint7 = paint2;
                int[] iArr = intArray;
                Paint paint8 = paint;
                drawLayerBounds(canvas, next.getStart(), i12, paint6, paint7, paint8);
                drawLayerBounds(canvas3, next.getEnd(), i12, paint6, paint7, paint8);
                i9++;
                Bitmap bitmap3 = bitmap;
                Bitmap bitmap4 = bitmap2;
                canvas2 = canvas3;
                paint4 = paint5;
                i10 = i11;
                canvas = canvas4;
                intArray = iArr;
            }
        }
        if (z4) {
            i = 0;
        } else {
            i = list.size() - 1;
        }
        long j = 0;
        boolean z5 = true;
        boolean z6 = true;
        while (true) {
            if ((!z4 || i >= list.size()) && (z4 || i < 0)) {
                return arrayList;
            }
            Run run = list.get(i);
            if (run.isStartVisible() || run.isEndVisible()) {
                SwitchDrawable switchDrawable = new SwitchDrawable(bitmap, run.getStart(), this.fontSizeGetter.get(this.sourceView), bitmap2, run.getEnd(), this.fontSizeGetter.get(this.targetView), this.textColorGetter.get(this.sourceView), this.textColorGetter.get(this.targetView));
                i3 = i;
                switchDrawable.setBounds(run.getStart().left, run.getStart().top, run.getStart().right, run.getStart().bottom);
                view.getOverlay().add(switchDrawable);
                i2 = i7;
                z = z4;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(switchDrawable, new PropertyValuesHolder[]{getPathValuesHolder(run, i7, i6), PropertyValuesHolder.ofInt(SwitchDrawable.WIDTH, new int[]{run.getStart().width(), run.getEnd().width()}), PropertyValuesHolder.ofInt(SwitchDrawable.HEIGHT, new int[]{run.getStart().height(), run.getEnd().height()}), PropertyValuesHolder.ofFloat(SwitchDrawable.PROGRESS, new float[]{0.0f, 1.0f})});
                boolean z7 = run.getStart().centerX() + i6 < run.getEnd().centerX();
                if (run.isStartVisible() && run.isEndVisible() && !z5 && z7 != z6) {
                    long j2 = this.staggerDelay;
                    j += j2;
                    this.staggerDelay = (long) (((float) j2) * STAGGER_DECAY);
                }
                ofPropertyValuesHolder.setStartDelay(j);
                boolean z8 = z7;
                long max = Math.max(this.minDuration, this.duration - (j / 2));
                if (this.calculateDuration) {
                    ofPropertyValuesHolder.setDuration(max);
                }
                arrayList.add(ofPropertyValuesHolder);
                if (run.isStartVisible() != run.isEndVisible()) {
                    Property<SwitchDrawable, Integer> property = SwitchDrawable.ALPHA;
                    int[] iArr2 = new int[2];
                    int i13 = 255;
                    if (run.isStartVisible()) {
                        i5 = 255;
                        c = 0;
                    } else {
                        c = 0;
                        i5 = 0;
                    }
                    iArr2[c] = i5;
                    if (run.isEndVisible()) {
                        i4 = 1;
                    } else {
                        i4 = 1;
                        i13 = 0;
                    }
                    iArr2[i4] = i13;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(switchDrawable, property, iArr2);
                    if (this.calculateDuration) {
                        ofInt.setDuration((this.duration + j) / 2);
                    }
                    if (!run.isStartVisible()) {
                        z3 = false;
                        switchDrawable.setAlpha(0);
                        ofInt.setStartDelay((this.duration + j) / 2);
                    } else {
                        z3 = false;
                        ofInt.setStartDelay(j);
                    }
                    arrayList.add(ofInt);
                } else {
                    i4 = 1;
                    z3 = false;
                    ObjectAnimator ofInt2 = ObjectAnimator.ofInt(switchDrawable, SwitchDrawable.ALPHA, new int[]{255, 204, 255});
                    ofInt2.setStartDelay(j);
                    if (this.calculateDuration) {
                        ofInt2.setDuration(this.duration + j);
                    }
                    ofInt2.setInterpolator(linearInterpolator);
                    arrayList.add(ofInt2);
                }
                z2 = z3;
                z6 = z8;
            } else {
                z = z4;
                i2 = i7;
                i3 = i;
                i4 = i8;
                z2 = z5;
            }
            z5 = z2;
            i8 = i4;
            z4 = z;
            i = i3 + (z ? i4 : -1);
            i7 = i2;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    private PropertyValuesHolder getPathValuesHolder(Run run, int i, int i2) {
        if (IS_LOLLIPOP_OR_ABOVE) {
            return PropertyValuesHolder.ofObject(SwitchDrawable.TOP_LEFT, (TypeConverter) null, new PathMotion() {
                public Path getPath(float f, float f2, float f3, float f4) {
                    return ReflowTextAnimatorHelper.getPath(f, f2, f3, f4);
                }
            }.getPath((float) (run.getEnd().left - i2), (float) (run.getEnd().top - i), (float) run.getStart().left, (float) run.getStart().top));
        }
        PointF pointF = new PointF((float) run.getStart().left, (float) run.getStart().top);
        PointF pointF2 = new PointF((float) (run.getEnd().left - i2), (float) (run.getEnd().top - i));
        return PropertyValuesHolder.ofObject(SwitchDrawable.TOP_LEFT, new TypeEvaluator<PointF>() {
            private final PointF point = new PointF();

            public PointF evaluate(float f, PointF pointF, PointF pointF2) {
                this.point.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + ((pointF2.y - pointF.y) * f));
                return this.point;
            }
        }, new PointF[]{pointF, pointF2});
    }

    private Bitmap createBitmap(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight() * (this.showLayers ? 3 : 1), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private long calculateDuration(Rect rect, Rect rect2) {
        return Math.max(this.minDuration, Math.min(this.maxDuration, (long) ((((float) Math.hypot((double) (rect.exactCenterX() - rect2.exactCenterX()), (double) (rect.exactCenterY() - rect2.exactCenterY()))) / ((float) this.velocity)) * 1000.0f)));
    }

    public static class Builder {
        private static final boolean DEFAULT_CALCULATE_DURATION = true;
        private static final TextSizeGetter DEFAULT_FONT_SIZE_GETTER = new ReflowTextAnimatorHelper$Builder$$ExternalSyntheticLambda1();
        private static final long DEFAULT_MAX_DURATION = 400;
        private static final long DEFAULT_MIN_DURATION = 200;
        private static final long DEFAULT_STAGGER = 40;
        private static final TextColorGetter DEFAULT_TEXT_COLOR_GETTER = new ReflowTextAnimatorHelper$Builder$$ExternalSyntheticLambda2();
        private static final long DEFAULT_VELOCITY = 700;
        /* access modifiers changed from: private */
        public BoundsCalculator boundsCalculator = new ReflowTextAnimatorHelper$Builder$$ExternalSyntheticLambda0();
        /* access modifiers changed from: private */
        public boolean calculateDuration = true;
        /* access modifiers changed from: private */
        public TextSizeGetter fontSizeGetter = DEFAULT_FONT_SIZE_GETTER;
        /* access modifiers changed from: private */
        public boolean freezeOnLastFrame = false;
        /* access modifiers changed from: private */
        public long maxDuration = DEFAULT_MAX_DURATION;
        /* access modifiers changed from: private */
        public long minDuration = DEFAULT_MIN_DURATION;
        /* access modifiers changed from: private */
        public boolean showLayers = false;
        /* access modifiers changed from: private */
        public TextView sourceView;
        /* access modifiers changed from: private */
        public long staggerDelay = DEFAULT_STAGGER;
        /* access modifiers changed from: private */
        public TextView targetView;
        /* access modifiers changed from: private */
        public TextColorGetter textColorGetter = DEFAULT_TEXT_COLOR_GETTER;
        /* access modifiers changed from: private */
        public long velocity = 700;

        static /* synthetic */ Rect lambda$new$0(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        }

        public Builder(TextView textView, TextView textView2) {
            this.sourceView = textView;
            this.targetView = textView2;
            if (textView != null) {
                ViewCompat.isLaidOut(textView);
                TextView textView3 = this.targetView;
                if (textView3 != null) {
                    ViewCompat.isLaidOut(textView3);
                    return;
                }
                throw new IllegalArgumentException("Target view can't be null");
            }
            throw new IllegalArgumentException("Source view can't be null");
        }

        public Builder debug(boolean z) {
            this.showLayers = z;
            return this;
        }

        public Builder withDuration(long j, long j2) {
            this.minDuration = j;
            this.maxDuration = j2;
            return this;
        }

        public Builder calculateDuration(boolean z) {
            this.calculateDuration = z;
            return this;
        }

        public Builder setBoundsCalculator(BoundsCalculator boundsCalculator2) {
            this.boundsCalculator = boundsCalculator2;
            return this;
        }

        public Builder withStaggerDelay(long j) {
            this.staggerDelay = j;
            return this;
        }

        public void setFontSizeGetter(TextSizeGetter textSizeGetter) {
            this.fontSizeGetter = textSizeGetter;
        }

        public Builder setTextColorGetter(TextColorGetter textColorGetter2) {
            this.textColorGetter = textColorGetter2;
            return this;
        }

        public Builder withVelocity(long j) {
            this.velocity = j;
            return this;
        }

        public Builder withFreezeOnLastFrame(boolean z) {
            this.freezeOnLastFrame = z;
            return this;
        }

        public ReflowTextAnimatorHelper build() {
            return new ReflowTextAnimatorHelper(this);
        }

        public Animator buildAnimator() {
            if (!this.freezeOnLastFrame) {
                return build().createAnimator();
            }
            throw new IllegalStateException("Use build() to retain ability to unfreeze() the Helper.");
        }
    }
}
