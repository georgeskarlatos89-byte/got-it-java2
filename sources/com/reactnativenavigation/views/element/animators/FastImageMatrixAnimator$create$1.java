package com.reactnativenavigation.views.element.animators;

import android.graphics.Matrix;
import android.widget.ImageView;
import com.google.android.material.animation.MatrixEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/reactnativenavigation/views/element/animators/FastImageMatrixAnimator$create$1", "Lcom/google/android/material/animation/MatrixEvaluator;", "evaluate", "Landroid/graphics/Matrix;", "fraction", "", "startValue", "endValue", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageMatrixAnimator.kt */
public final class FastImageMatrixAnimator$create$1 extends MatrixEvaluator {
    final /* synthetic */ FastImageMatrixAnimator this$0;

    FastImageMatrixAnimator$create$1(FastImageMatrixAnimator fastImageMatrixAnimator) {
        this.this$0 = fastImageMatrixAnimator;
    }

    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        Intrinsics.checkNotNullParameter(matrix, "startValue");
        Intrinsics.checkNotNullParameter(matrix2, "endValue");
        Matrix evaluate = super.evaluate(f, matrix, matrix2);
        Intrinsics.checkNotNullExpressionValue(evaluate, "super.evaluate(fraction, startValue, endValue)");
        ((ImageView) this.this$0.getTo()).setImageMatrix(evaluate);
        return evaluate;
    }
}
