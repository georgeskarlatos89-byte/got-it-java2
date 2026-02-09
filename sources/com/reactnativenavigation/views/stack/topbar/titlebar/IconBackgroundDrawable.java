package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.reactnativenavigation.options.params.DensityPixel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0001H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0014J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0011H\u0016J(\u0010%\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016J\u0012\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010&\u001a\u00020.H\u0002R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/reactnativenavigation/views/stack/topbar/titlebar/IconBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "wrapped", "cornerRadius", "Lcom/reactnativenavigation/options/params/DensityPixel;", "backgroundWidth", "", "backgroundHeight", "iconColor", "backgroundColor", "(Landroid/graphics/drawable/Drawable;Lcom/reactnativenavigation/options/params/DensityPixel;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundRect", "Landroid/graphics/Rect;", "bitmapHeight", "bitmapPaint", "bitmapRect", "bitmapWidth", "path", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawBackgroundColor", "drawBitmap", "drawPath", "getOpacity", "getWrappedDrawable", "onBoundsChange", "bounds", "setAlpha", "alpha", "setBounds", "r", "l", "t", "b", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "updatePath", "Landroid/graphics/RectF;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IconBackgroundDrawable.kt */
public final class IconBackgroundDrawable extends Drawable {
    private final Integer backgroundColor;
    private final int backgroundHeight;
    private final Paint backgroundPaint;
    private Rect backgroundRect;
    private final int backgroundWidth;
    private final int bitmapHeight;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private final int bitmapWidth;
    private final DensityPixel cornerRadius;
    private final Integer iconColor;
    private final Path path = new Path();
    private final Drawable wrapped;

    public int getOpacity() {
        return 0;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public IconBackgroundDrawable(Drawable drawable, DensityPixel densityPixel, int i, int i2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(drawable, "wrapped");
        Intrinsics.checkNotNullParameter(densityPixel, "cornerRadius");
        this.wrapped = drawable;
        this.cornerRadius = densityPixel;
        this.backgroundWidth = i;
        this.backgroundHeight = i2;
        this.iconColor = num;
        this.backgroundColor = num2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColorFilter(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN) : null);
        this.bitmapPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        if (num2 != null) {
            paint2.setColor(num2.intValue());
        }
        this.backgroundPaint = paint2;
        this.bitmapWidth = drawable.getIntrinsicWidth();
        this.bitmapHeight = drawable.getIntrinsicHeight();
        this.backgroundRect = new Rect();
        this.bitmapRect = new Rect();
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawPath(canvas);
        drawBackgroundColor(canvas);
        drawBitmap(canvas);
    }

    private final void drawBackgroundColor(Canvas canvas) {
        Integer num = this.backgroundColor;
        if (num != null) {
            num.intValue();
            canvas.drawRect(this.backgroundRect, this.backgroundPaint);
        }
    }

    private final void drawPath(Canvas canvas) {
        if (this.cornerRadius.hasValue()) {
            canvas.clipPath(this.path);
        }
    }

    private final void drawBitmap(Canvas canvas) {
        canvas.drawBitmap(DrawableKt.toBitmap$default(this.wrapped, 0, 0, (Bitmap.Config) null, 7, (Object) null), (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        updatePath(new RectF((float) i, (float) i2, (float) this.backgroundWidth, (float) this.backgroundHeight));
        super.setBounds(i, i2, this.backgroundWidth, this.backgroundHeight);
    }

    public void setBounds(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "r");
        rect.right = this.backgroundWidth;
        rect.bottom = this.backgroundHeight;
        updatePath(new RectF(rect));
        super.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "bounds");
        this.backgroundRect = new Rect((rect.width() - this.backgroundWidth) / 2, (rect.height() - this.backgroundHeight) / 2, rect.width() - ((rect.width() - this.backgroundWidth) / 2), rect.height() - ((rect.height() - this.backgroundHeight) / 2));
        this.bitmapRect = new Rect((rect.width() - this.bitmapWidth) / 2, (rect.height() - this.bitmapHeight) / 2, rect.width() - ((rect.width() - this.bitmapWidth) / 2), rect.height() - ((rect.height() - this.bitmapHeight) / 2));
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.wrapped.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.wrapped.setColorFilter(colorFilter);
    }

    private final void updatePath(RectF rectF) {
        if (this.cornerRadius.hasValue()) {
            this.path.reset();
            float intValue = (float) ((Number) this.cornerRadius.get(0)).intValue();
            this.path.addRoundRect(rectF, intValue, intValue, Path.Direction.CW);
        }
    }

    public final Drawable getWrappedDrawable() {
        return this.wrapped;
    }
}
