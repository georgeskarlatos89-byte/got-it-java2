package com.canhub.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0001H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/canhub/cropper/CropImageAnimation;", "Landroid/view/animation/Animation;", "Landroid/view/animation/Animation$AnimationListener;", "imageView", "Landroid/widget/ImageView;", "cropOverlayView", "Lcom/canhub/cropper/CropOverlayView;", "<init>", "(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V", "startBoundPoints", "", "endBoundPoints", "startCropWindowRect", "Landroid/graphics/RectF;", "endCropWindowRect", "startImageMatrix", "endImageMatrix", "setStartState", "", "boundPoints", "imageMatrix", "Landroid/graphics/Matrix;", "setEndState", "applyTransformation", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "onAnimationStart", "animation", "onAnimationEnd", "onAnimationRepeat", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: CropImageAnimation.kt */
public final class CropImageAnimation extends Animation implements Animation.AnimationListener {
    private final CropOverlayView cropOverlayView;
    private final float[] endBoundPoints = new float[8];
    private final RectF endCropWindowRect = new RectF();
    private final float[] endImageMatrix = new float[9];
    private final ImageView imageView;
    private final float[] startBoundPoints = new float[8];
    private final RectF startCropWindowRect = new RectF();
    private final float[] startImageMatrix = new float[9];

    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public CropImageAnimation(ImageView imageView2, CropOverlayView cropOverlayView2) {
        Intrinsics.checkNotNullParameter(imageView2, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView2, "cropOverlayView");
        this.imageView = imageView2;
        this.cropOverlayView = cropOverlayView2;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void setStartState(float[] fArr, Matrix matrix) {
        Intrinsics.checkNotNullParameter(fArr, "boundPoints");
        Intrinsics.checkNotNullParameter(matrix, "imageMatrix");
        reset();
        System.arraycopy(fArr, 0, this.startBoundPoints, 0, 8);
        this.startCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        matrix.getValues(this.startImageMatrix);
    }

    public final void setEndState(float[] fArr, Matrix matrix) {
        Intrinsics.checkNotNullParameter(fArr, "boundPoints");
        Intrinsics.checkNotNullParameter(matrix, "imageMatrix");
        System.arraycopy(fArr, 0, this.endBoundPoints, 0, 8);
        this.endCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        matrix.getValues(this.endImageMatrix);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        Intrinsics.checkNotNullParameter(transformation, "t");
        RectF rectF = new RectF();
        rectF.left = this.startCropWindowRect.left + ((this.endCropWindowRect.left - this.startCropWindowRect.left) * f);
        rectF.top = this.startCropWindowRect.top + ((this.endCropWindowRect.top - this.startCropWindowRect.top) * f);
        rectF.right = this.startCropWindowRect.right + ((this.endCropWindowRect.right - this.startCropWindowRect.right) * f);
        rectF.bottom = this.startCropWindowRect.bottom + ((this.endCropWindowRect.bottom - this.startCropWindowRect.bottom) * f);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            float f2 = this.startBoundPoints[i];
            fArr[i] = f2 + ((this.endBoundPoints[i] - f2) * f);
        }
        CropOverlayView cropOverlayView2 = this.cropOverlayView;
        cropOverlayView2.setCropWindowRect(rectF);
        cropOverlayView2.setBounds(fArr, this.imageView.getWidth(), this.imageView.getHeight());
        cropOverlayView2.invalidate();
        float[] fArr2 = new float[9];
        for (int i2 = 0; i2 < 9; i2++) {
            float f3 = this.startImageMatrix[i2];
            fArr2[i2] = f3 + ((this.endImageMatrix[i2] - f3) * f);
        }
        ImageView imageView2 = this.imageView;
        imageView2.getImageMatrix().setValues(fArr2);
        imageView2.invalidate();
    }

    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.imageView.clearAnimation();
    }
}
