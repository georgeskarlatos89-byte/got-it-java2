package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ImageUtilsKt;
import com.reactnativenavigation.utils.Scale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¨\u0006\u0014"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/FastImageMatrixAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Landroid/widget/ImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "centerCropMatrix", "Landroid/graphics/Matrix;", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "createTransformMatrix", "fitCenterMatrix", "fitXYMatrix", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageMatrixAnimator.kt */
public final class FastImageMatrixAnimator extends PropertyAnimatorCreator<ImageView> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FastImageMatrixAnimator.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.views.element.animators.FastImageMatrixAnimator.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastImageMatrixAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ImageView imageView, ImageView imageView2) {
        Intrinsics.checkNotNullParameter(imageView, "fromChild");
        Intrinsics.checkNotNullParameter(imageView2, "toChild");
        return !ImageUtilsKt.areDimensionsWithInheritedScaleEqual(getFrom(), getTo()) && !(imageView instanceof ReactImageView) && !(imageView2 instanceof ReactImageView);
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) from;
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) to;
        ImageView.ScaleType scaleType = ((ImageView) getTo()).getScaleType();
        int width = ((ImageView) getTo()).getWidth();
        int height = ((ImageView) getTo()).getHeight();
        Matrix createTransformMatrix = createTransformMatrix((ImageView) getFrom(), (ImageView) getTo());
        Matrix createTransformMatrix2 = createTransformMatrix((ImageView) getTo(), (ImageView) getTo());
        ((ImageView) getTo()).setScaleType(ImageView.ScaleType.MATRIX);
        ((ImageView) getTo()).getLayoutParams().width = Math.max(((ImageView) getFrom()).getWidth(), ((ImageView) getTo()).getWidth());
        ((ImageView) getTo()).getLayoutParams().height = Math.max(((ImageView) getFrom()).getHeight(), ((ImageView) getTo()).getHeight());
        ValueAnimator ofObject = ObjectAnimator.ofObject(new FastImageMatrixAnimator$create$1(this), new Object[]{createTransformMatrix, createTransformMatrix2});
        Intrinsics.checkNotNullExpressionValue(ofObject, "create$lambda$1");
        Animator animator = ofObject;
        animator.addListener(new FastImageMatrixAnimator$create$lambda$1$$inlined$doOnEnd$1(this, width, height, scaleType));
        Intrinsics.checkNotNullExpressionValue(ofObject, "override fun create(opti…        }\n        }\n    }");
        return animator;
    }

    private final Matrix createTransformMatrix(ImageView imageView, ImageView imageView2) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            return centerCropMatrix(imageView, imageView2);
        }
        if (i == 2) {
            return fitXYMatrix(imageView, imageView2);
        }
        if (i == 3) {
            return fitCenterMatrix(imageView, imageView2);
        }
        if (i == 4) {
            return fitCenterMatrix(imageView, imageView2);
        }
        throw new RuntimeException("Unsupported ScaleType " + imageView.getScaleType());
    }

    private final Matrix fitXYMatrix(ImageView imageView, ImageView imageView2) {
        Scale computeInheritedScale = ImageUtilsKt.computeInheritedScale(imageView);
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        Drawable drawable = imageView2.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale((((float) imageView.getWidth()) * component1) / ((float) drawable.getIntrinsicWidth()), (((float) imageView.getHeight()) * component2) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    private final Matrix centerCropMatrix(ImageView imageView, ImageView imageView2) {
        Scale computeInheritedScale = ImageUtilsKt.computeInheritedScale(imageView);
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        Drawable drawable = imageView2.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = ((float) imageView.getWidth()) * component1;
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = ((float) imageView.getHeight()) * component2;
        float f2 = (float) intrinsicHeight;
        float coerceAtLeast = RangesKt.coerceAtLeast(width / f, height / f2);
        int roundToInt = MathKt.roundToInt((width - (f * coerceAtLeast)) / 2.0f);
        int roundToInt2 = MathKt.roundToInt((height - (f2 * coerceAtLeast)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(coerceAtLeast, coerceAtLeast);
        matrix.postTranslate((float) roundToInt, (float) roundToInt2);
        return matrix;
    }

    private final Matrix fitCenterMatrix(ImageView imageView, ImageView imageView2) {
        Scale computeInheritedScale = ImageUtilsKt.computeInheritedScale(imageView);
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        Drawable drawable = imageView2.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = ((float) imageView.getWidth()) * component1;
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = ((float) imageView.getHeight()) * component2;
        float f2 = (float) intrinsicHeight;
        float min = Math.min(width / f, height / f2);
        int roundToInt = MathKt.roundToInt((width - (f * min)) / 2.0f);
        int roundToInt2 = MathKt.roundToInt((height - (f2 * min)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        matrix.postTranslate((float) roundToInt, (float) roundToInt2);
        return matrix;
    }
}
