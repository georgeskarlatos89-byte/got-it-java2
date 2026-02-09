package com.reactnativenavigation.views.element.animators;

import android.animation.TypeEvaluator;
import androidx.core.graphics.ColorUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/BackgroundColorEvaluator;", "Landroid/animation/TypeEvaluator;", "", "background", "Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;", "(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;)V", "color", "evaluate", "ratio", "", "from", "to", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BackgroundColorEvaluator.kt */
public final class BackgroundColorEvaluator implements TypeEvaluator<double[]> {
    private final ReactViewBackgroundDrawable background;
    private final double[] color = new double[3];

    public BackgroundColorEvaluator(ReactViewBackgroundDrawable reactViewBackgroundDrawable) {
        Intrinsics.checkNotNullParameter(reactViewBackgroundDrawable, AppStateModule.APP_STATE_BACKGROUND);
        this.background = reactViewBackgroundDrawable;
    }

    public double[] evaluate(float f, double[] dArr, double[] dArr2) {
        Intrinsics.checkNotNullParameter(dArr, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(dArr2, "to");
        ColorUtils.blendLAB(dArr, dArr2, (double) f, this.color);
        this.background.setColor(com.reactnativenavigation.utils.ColorUtils.labToColor(this.color));
        return this.color;
    }
}
