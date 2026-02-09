package com.shazam.android.widget.text.reflow;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.DrawableCompat;

class SwitchDrawable extends Drawable {
    static final Property<SwitchDrawable, Integer> ALPHA = new Property<SwitchDrawable, Integer>(Integer.class, "alpha") {
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.setAlpha(num.intValue());
        }

        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(DrawableCompat.getAlpha(switchDrawable));
        }
    };
    static final Property<SwitchDrawable, Integer> HEIGHT = new Property<SwitchDrawable, Integer>(Integer.class, "height") {
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.setHeight(num.intValue());
        }

        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(switchDrawable.getHeight());
        }
    };
    static final Property<SwitchDrawable, Float> PROGRESS = new Property<SwitchDrawable, Float>(Float.class, NotificationCompat.CATEGORY_PROGRESS) {
        public void set(SwitchDrawable switchDrawable, Float f) {
            switchDrawable.setProgress(f.floatValue());
        }

        public Float get(SwitchDrawable switchDrawable) {
            return Float.valueOf(0.0f);
        }
    };
    static final Property<SwitchDrawable, PointF> TOP_LEFT = new Property<SwitchDrawable, PointF>(PointF.class, "topLeft") {
        public void set(SwitchDrawable switchDrawable, PointF pointF) {
            switchDrawable.setTopLeft(pointF);
        }

        public PointF get(SwitchDrawable switchDrawable) {
            return switchDrawable.getTopLeft();
        }
    };
    static final Property<SwitchDrawable, Integer> WIDTH = new Property<SwitchDrawable, Integer>(Integer.class, "width") {
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.setWidth(num.intValue());
        }

        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(switchDrawable.getWidth());
        }
    };
    private final double[] color = new double[3];
    private Bitmap currentBitmap;
    private Rect currentBitmapSrcBounds;
    private final Bitmap endBitmap;
    private final Rect endBitmapSrcBounds;
    private final double[] endColor;
    private boolean hasSwitched = false;
    private int height;
    private final Paint paint;
    private final double[] startColor;
    private final float switchThreshold;
    private PointF topLeft;
    private int width;

    public int getOpacity() {
        return -3;
    }

    SwitchDrawable(Bitmap bitmap, Rect rect, float f, Bitmap bitmap2, Rect rect2, float f2, int i, int i2) {
        this.currentBitmap = bitmap;
        this.currentBitmapSrcBounds = rect;
        this.endBitmap = bitmap2;
        this.endBitmapSrcBounds = rect2;
        this.startColor = ColorUtils.colorToLAB(i);
        this.endColor = ColorUtils.colorToLAB(i2);
        this.switchThreshold = f / (f2 + f);
        this.paint = new Paint(6);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.currentBitmap, this.currentBitmapSrcBounds, getBounds(), this.paint);
    }

    public int getAlpha() {
        return this.paint.getAlpha();
    }

    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public ColorFilter getColorFilter() {
        return this.paint.getColorFilter();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: package-private */
    public void setProgress(float f) {
        setColor(f);
        if (!this.hasSwitched && f >= this.switchThreshold) {
            this.currentBitmap = this.endBitmap;
            this.currentBitmapSrcBounds = this.endBitmapSrcBounds;
            this.hasSwitched = true;
        }
    }

    public void setColor(float f) {
        ColorUtils.blendLab(this.startColor, this.endColor, f, this.color);
        this.paint.setColorFilter(new PorterDuffColorFilter(ColorUtils.labToColor(this.color), PorterDuff.Mode.SRC_IN));
    }

    /* access modifiers changed from: package-private */
    public PointF getTopLeft() {
        return this.topLeft;
    }

    /* access modifiers changed from: package-private */
    public void setTopLeft(PointF pointF) {
        this.topLeft = pointF;
        updateBounds();
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: package-private */
    public void setWidth(int i) {
        this.width = i;
        updateBounds();
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: package-private */
    public void setHeight(int i) {
        this.height = i;
        updateBounds();
    }

    private void updateBounds() {
        int round = Math.round(this.topLeft.x);
        int round2 = Math.round(this.topLeft.y);
        setBounds(round, round2, this.width + round, this.height + round2);
    }
}
