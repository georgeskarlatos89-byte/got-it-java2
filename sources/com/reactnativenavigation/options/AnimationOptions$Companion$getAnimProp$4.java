package com.reactnativenavigation.options;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimationOptions.kt */
/* synthetic */ class AnimationOptions$Companion$getAnimProp$4 extends FunctionReferenceImpl implements Function1<View, Float> {
    public static final AnimationOptions$Companion$getAnimProp$4 INSTANCE = new AnimationOptions$Companion$getAnimProp$4();

    AnimationOptions$Companion$getAnimProp$4() {
        super(1, View.class, "getTranslationY", "getTranslationY()F", 0);
    }

    public final Float invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        return Float.valueOf(view.getTranslationY());
    }
}
