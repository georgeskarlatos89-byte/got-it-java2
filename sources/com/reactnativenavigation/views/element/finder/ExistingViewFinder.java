package com.reactnativenavigation.views.element.finder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import com.facebook.drawee.generic.RootDrawable;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J'\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0012H\u0002J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0012H\u0002J\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/reactnativenavigation/views/element/finder/ExistingViewFinder;", "Lcom/reactnativenavigation/views/element/finder/ViewFinder;", "()V", "checkIfFastImageIsMeasured", "", "view", "Landroid/widget/ImageView;", "find", "Landroid/view/View;", "root", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "nativeId", "", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasMeasuredDrawable", "resume", "", "cont", "Lkotlin/coroutines/Continuation;", "resumeOnImageLoad", "isImageScaledToFit", "Landroid/graphics/drawable/Drawable;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExistingViewFinder.kt */
public final class ExistingViewFinder implements ViewFinder {
    public Object find(ViewController<?> viewController, String str, Continuation<? super View> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        Continuation continuation2 = safeContinuation;
        View findView = ReactFindViewUtil.findView((View) viewController.getView(), str);
        if (findView == null) {
            Result.Companion companion = Result.Companion;
            continuation2.resumeWith(Result.m1102constructorimpl((Object) null));
        } else if (findView instanceof ImageView) {
            ImageView imageView = (ImageView) findView;
            if (hasMeasuredDrawable(imageView)) {
                resume(imageView, continuation2);
            } else {
                resumeOnImageLoad(imageView, continuation2);
            }
        } else {
            Result.Companion companion2 = Result.Companion;
            continuation2.resumeWith(Result.m1102constructorimpl(findView));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final void resume(ImageView imageView, Continuation<? super View> continuation) {
        if (imageView.getDrawable() instanceof RootDrawable) {
            imageView.post(new ExistingViewFinder$$ExternalSyntheticLambda0(continuation, imageView));
            return;
        }
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(imageView));
    }

    /* access modifiers changed from: private */
    public static final void resume$lambda$1(Continuation continuation, ImageView imageView) {
        Intrinsics.checkNotNullParameter(continuation, "$cont");
        Intrinsics.checkNotNullParameter(imageView, "$view");
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(imageView));
    }

    /* access modifiers changed from: private */
    public final void resumeOnImageLoad(ImageView imageView, Continuation<? super View> continuation) {
        View view = imageView;
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new ExistingViewFinder$resumeOnImageLoad$$inlined$doOnPreDraw$1(view, this, imageView, continuation)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
    }

    /* access modifiers changed from: private */
    public final boolean hasMeasuredDrawable(ImageView imageView) {
        if (imageView.getDrawable() instanceof RootDrawable) {
            return true;
        }
        return checkIfFastImageIsMeasured(imageView);
    }

    private final boolean checkIfFastImageIsMeasured(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        return (drawable == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1 || !isImageScaledToFit(drawable, imageView)) ? false : true;
    }

    private final boolean isImageScaledToFit(Drawable drawable, ImageView imageView) {
        return Math.min(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight())) >= 1.0f;
    }
}
