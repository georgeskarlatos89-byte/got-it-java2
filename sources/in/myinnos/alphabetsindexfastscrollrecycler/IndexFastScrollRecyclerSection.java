package in.myinnos.alphabetsindexfastscrollrecycler;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class IndexFastScrollRecyclerSection extends RecyclerView.AdapterDataObserver {
    AttributeSet attrs;
    private int indexPaintPaintColor = -1;
    private int indexbarBackgroudAlpha;
    private int indexbarBackgroudColor;
    private int indexbarHighLightTextColor;
    private int indexbarTextColor;
    private int mCurrentSection = -1;
    private float mDensity;
    private int mIndexBarStrokeColor;
    public int mIndexBarStrokeWidth = 2;
    private float mIndexbarMargin;
    private RectF mIndexbarRect;
    private float mIndexbarWidth;
    private SectionIndexer mIndexer = null;
    private boolean mIsIndexing = false;
    private Runnable mLastFadeRunnable = null;
    private int mListViewHeight;
    private int mListViewWidth;
    private float mPreviewPadding;
    /* access modifiers changed from: private */
    public RecyclerView mRecyclerView = null;
    private float mScaledDensity;
    private String[] mSections = null;
    private int previewBackgroudAlpha;
    private int previewBackgroundColor;
    private int previewTextColor;
    private boolean previewVisibility = true;
    private int setIndexBarCornerRadius;
    private Boolean setIndexBarStrokeVisibility = true;
    private Boolean setIndexBarVisibility = true;
    private int setIndexTextSize;
    private float setIndexbarMargin;
    private float setIndexbarWidth;
    private int setPreviewPadding;
    private int setPreviewTextSize;
    private Boolean setSetIndexBarHighLightTextVisibility = false;
    private Typeface setTypeface = null;

    private int convertTransparentValueToBackgroundAlpha(float f) {
        return (int) (f * 255.0f);
    }

    public IndexFastScrollRecyclerSection(Context context, IndexFastScrollRecyclerView indexFastScrollRecyclerView) {
        this.setIndexTextSize = indexFastScrollRecyclerView.setIndexTextSize;
        this.setIndexbarWidth = indexFastScrollRecyclerView.mIndexbarWidth;
        this.setIndexbarMargin = indexFastScrollRecyclerView.mIndexbarMargin;
        this.setPreviewPadding = indexFastScrollRecyclerView.mPreviewPadding;
        this.setPreviewTextSize = indexFastScrollRecyclerView.mPreviewTextSize;
        this.previewBackgroundColor = indexFastScrollRecyclerView.mPreviewBackgroudColor;
        this.previewTextColor = indexFastScrollRecyclerView.mPreviewTextColor;
        this.previewBackgroudAlpha = convertTransparentValueToBackgroundAlpha(indexFastScrollRecyclerView.mPreviewTransparentValue);
        this.mIndexBarStrokeColor = indexFastScrollRecyclerView.mSetIndexBarStrokeColor;
        this.mIndexBarStrokeWidth = indexFastScrollRecyclerView.mIndexBarStrokeWidth;
        this.setIndexBarCornerRadius = indexFastScrollRecyclerView.mIndexBarCornerRadius;
        this.indexbarBackgroudColor = indexFastScrollRecyclerView.mIndexbarBackgroudColor;
        this.indexbarTextColor = indexFastScrollRecyclerView.mIndexbarTextColor;
        this.indexbarHighLightTextColor = indexFastScrollRecyclerView.indexbarHighLightTextColor;
        this.indexbarBackgroudAlpha = convertTransparentValueToBackgroundAlpha(indexFastScrollRecyclerView.mIndexBarTransparentValue);
        this.mDensity = context.getResources().getDisplayMetrics().density;
        this.mScaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        this.mRecyclerView = indexFastScrollRecyclerView;
        setAdapter(indexFastScrollRecyclerView.getAdapter());
        float f = this.setIndexbarWidth;
        float f2 = this.mDensity;
        this.mIndexbarWidth = f * f2;
        this.mIndexbarMargin = this.setIndexbarMargin * f2;
        this.mPreviewPadding = ((float) this.setPreviewPadding) * f2;
    }

    public void draw(Canvas canvas) {
        int i;
        if (this.setIndexBarVisibility.booleanValue()) {
            Paint paint = new Paint();
            paint.setColor(this.indexbarBackgroudColor);
            paint.setAlpha(this.indexbarBackgroudAlpha);
            paint.setAntiAlias(true);
            RectF rectF = this.mIndexbarRect;
            int i2 = this.setIndexBarCornerRadius;
            float f = this.mDensity;
            canvas.drawRoundRect(rectF, ((float) i2) * f, ((float) i2) * f, paint);
            if (this.setIndexBarStrokeVisibility.booleanValue()) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.mIndexBarStrokeColor);
                paint.setStrokeWidth((float) this.mIndexBarStrokeWidth);
                RectF rectF2 = this.mIndexbarRect;
                int i3 = this.setIndexBarCornerRadius;
                float f2 = this.mDensity;
                canvas.drawRoundRect(rectF2, ((float) i3) * f2, ((float) i3) * f2, paint);
            }
            String[] strArr = this.mSections;
            if (strArr != null && strArr.length > 0) {
                if (this.previewVisibility && (i = this.mCurrentSection) >= 0 && strArr[i] != "") {
                    Paint paint2 = new Paint();
                    paint2.setColor(this.previewBackgroundColor);
                    paint2.setAlpha(this.previewBackgroudAlpha);
                    paint2.setAntiAlias(true);
                    paint2.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
                    Paint paint3 = new Paint();
                    paint3.setColor(this.previewTextColor);
                    paint3.setAntiAlias(true);
                    paint3.setTextSize(((float) this.setPreviewTextSize) * this.mScaledDensity);
                    paint3.setTypeface(this.setTypeface);
                    float measureText = paint3.measureText(this.mSections[this.mCurrentSection]);
                    float max = Math.max(((this.mPreviewPadding * 2.0f) + paint3.descent()) - paint3.ascent(), (this.mPreviewPadding * 2.0f) + measureText);
                    int i4 = this.mListViewWidth;
                    int i5 = this.mListViewHeight;
                    RectF rectF3 = new RectF((((float) i4) - max) / 2.0f, (((float) i5) - max) / 2.0f, ((((float) i4) - max) / 2.0f) + max, ((((float) i5) - max) / 2.0f) + max);
                    float f3 = this.mDensity;
                    canvas.drawRoundRect(rectF3, f3 * 5.0f, f3 * 5.0f, paint2);
                    canvas.drawText(this.mSections[this.mCurrentSection], (rectF3.left + ((max - measureText) / 2.0f)) - 1.0f, (rectF3.top + ((max - (paint3.descent() - paint3.ascent())) / 2.0f)) - paint3.ascent(), paint3);
                    fade(300);
                }
                Paint paint4 = new Paint();
                paint4.setColor(this.indexbarTextColor);
                paint4.setAntiAlias(true);
                paint4.setTextSize(((float) this.setIndexTextSize) * this.mScaledDensity);
                paint4.setTypeface(this.setTypeface);
                float height = (this.mIndexbarRect.height() - (this.mIndexbarMargin * 2.0f)) / ((float) this.mSections.length);
                float descent = (height - (paint4.descent() - paint4.ascent())) / 2.0f;
                for (int i6 = 0; i6 < this.mSections.length; i6++) {
                    if (this.setSetIndexBarHighLightTextVisibility.booleanValue()) {
                        int i7 = this.mCurrentSection;
                        if (i7 <= -1 || i6 != i7) {
                            paint4.setTypeface(this.setTypeface);
                            paint4.setTextSize(((float) this.setIndexTextSize) * this.mScaledDensity);
                            paint4.setColor(this.indexbarTextColor);
                        } else {
                            paint4.setTypeface(Typeface.create(this.setTypeface, 1));
                            paint4.setTextSize(((float) (this.setIndexTextSize + 3)) * this.mScaledDensity);
                            paint4.setColor(this.indexbarHighLightTextColor);
                        }
                        canvas.drawText(this.mSections[i6], this.mIndexbarRect.left + ((this.mIndexbarWidth - paint4.measureText(this.mSections[i6])) / 2.0f), (((this.mIndexbarRect.top + this.mIndexbarMargin) + (((float) i6) * height)) + descent) - paint4.ascent(), paint4);
                    } else {
                        canvas.drawText(this.mSections[i6], this.mIndexbarRect.left + ((this.mIndexbarWidth - paint4.measureText(this.mSections[i6])) / 2.0f), (((this.mIndexbarRect.top + this.mIndexbarMargin) + (((float) i6) * height)) + descent) - paint4.ascent(), paint4);
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.mIsIndexing) {
                    if (contains(motionEvent.getX(), motionEvent.getY())) {
                        this.mCurrentSection = getSectionByPoint(motionEvent.getY());
                        scrollToPosition();
                    }
                    return true;
                }
            } else if (this.mIsIndexing) {
                this.mIsIndexing = false;
                this.mCurrentSection = -1;
            }
        } else if (contains(motionEvent.getX(), motionEvent.getY())) {
            this.mIsIndexing = true;
            this.mCurrentSection = getSectionByPoint(motionEvent.getY());
            scrollToPosition();
            return true;
        }
        return false;
    }

    private void scrollToPosition() {
        try {
            int positionForSection = this.mIndexer.getPositionForSection(this.mCurrentSection);
            RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(positionForSection, 0);
            } else {
                layoutManager.scrollToPosition(positionForSection);
            }
        } catch (Exception unused) {
            Log.d("INDEX_BAR", "Data size returns null");
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.mListViewWidth = i;
        this.mListViewHeight = i2;
        float f = (float) i;
        float f2 = this.mIndexbarMargin;
        this.mIndexbarRect = new RectF((f - f2) - this.mIndexbarWidth, f2, f - f2, ((float) i2) - f2);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SectionIndexer) {
            adapter.registerAdapterDataObserver(this);
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.mIndexer = sectionIndexer;
            this.mSections = (String[]) sectionIndexer.getSections();
        }
    }

    public void onChanged() {
        super.onChanged();
        updateSections();
    }

    public void updateSections() {
        this.mSections = (String[]) this.mIndexer.getSections();
    }

    public boolean contains(float f, float f2) {
        return f >= this.mIndexbarRect.left && f2 >= this.mIndexbarRect.top && f2 <= this.mIndexbarRect.top + this.mIndexbarRect.height();
    }

    private int getSectionByPoint(float f) {
        String[] strArr = this.mSections;
        if (strArr == null || strArr.length == 0 || f < this.mIndexbarRect.top + this.mIndexbarMargin) {
            return 0;
        }
        if (f >= (this.mIndexbarRect.top + this.mIndexbarRect.height()) - this.mIndexbarMargin) {
            return this.mSections.length - 1;
        }
        return (int) (((f - this.mIndexbarRect.top) - this.mIndexbarMargin) / ((this.mIndexbarRect.height() - (this.mIndexbarMargin * 2.0f)) / ((float) this.mSections.length)));
    }

    private void fade(long j) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            Runnable runnable = this.mLastFadeRunnable;
            if (runnable != null) {
                recyclerView.removeCallbacks(runnable);
            }
            AnonymousClass1 r0 = new Runnable() {
                public void run() {
                    IndexFastScrollRecyclerSection.this.mRecyclerView.invalidate();
                }
            };
            this.mLastFadeRunnable = r0;
            this.mRecyclerView.postDelayed(r0, j);
        }
    }

    public void setIndexTextSize(int i) {
        this.setIndexTextSize = i;
    }

    public void setIndexbarWidth(float f) {
        this.mIndexbarWidth = f;
    }

    public void setIndexbarMargin(float f) {
        this.mIndexbarMargin = f;
    }

    public void setPreviewPadding(int i) {
        this.setPreviewPadding = i;
    }

    public void setIndexBarCornerRadius(int i) {
        this.setIndexBarCornerRadius = i;
    }

    public void setIndexBarTransparentValue(float f) {
        this.indexbarBackgroudAlpha = convertTransparentValueToBackgroundAlpha(f);
    }

    public void setTypeface(Typeface typeface) {
        this.setTypeface = typeface;
    }

    public void setIndexBarVisibility(boolean z) {
        this.setIndexBarVisibility = Boolean.valueOf(z);
    }

    public void setIndexBarStrokeVisibility(boolean z) {
        this.setIndexBarStrokeVisibility = Boolean.valueOf(z);
    }

    public void setPreviewVisibility(boolean z) {
        this.previewVisibility = z;
    }

    public void setIndexBarStrokeWidth(int i) {
        this.mIndexBarStrokeWidth = i;
    }

    public void setPreviewTextSize(int i) {
        this.setPreviewTextSize = i;
    }

    public void setPreviewColor(int i) {
        this.previewBackgroundColor = i;
    }

    public void setPreviewTextColor(int i) {
        this.previewTextColor = i;
    }

    public void setPreviewTransparentValue(float f) {
        this.previewBackgroudAlpha = convertTransparentValueToBackgroundAlpha(f);
    }

    public void setIndexBarColor(int i) {
        this.indexbarBackgroudColor = i;
    }

    public void setIndexBarTextColor(int i) {
        this.indexbarTextColor = i;
    }

    public void setIndexBarStrokeColor(int i) {
        this.mIndexBarStrokeColor = i;
    }

    public void setIndexbarHighLightTextColor(int i) {
        this.indexbarHighLightTextColor = i;
    }

    public void setIndexBarHighLightTextVisibility(boolean z) {
        this.setSetIndexBarHighLightTextVisibility = Boolean.valueOf(z);
    }
}
