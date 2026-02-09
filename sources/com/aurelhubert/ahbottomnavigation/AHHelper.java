package com.aurelhubert.ahbottomnavigation;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.ArrayList;

public class AHHelper {

    public interface Mapper<T> {
        T map(T t);
    }

    public static Drawable getTintDrawable(Drawable drawable, Integer num, boolean z) {
        if (num == null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            mutate.setTintList((ColorStateList) null);
            return mutate;
        } else if (z) {
            drawable.clearColorFilter();
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        } else {
            Drawable mutate2 = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTint(mutate2, num.intValue());
            return mutate2;
        }
    }

    public static void updateTopMargin(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda4(view));
        ofFloat.start();
    }

    static /* synthetic */ void lambda$updateTopMargin$0(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) floatValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static void updateBottomMargin(View view, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration((long) i3);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda3(view));
        ofFloat.start();
    }

    static /* synthetic */ void lambda$updateBottomMargin$1(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) floatValue);
            view.requestLayout();
        }
    }

    public static void updateMargin(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.bottomMargin = i4;
        }
    }

    public static void updateLeftMargin(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda2(view));
        ofFloat.start();
    }

    static /* synthetic */ void lambda$updateLeftMargin$2(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins((int) floatValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static void updateTextSize(TextView textView, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda5(textView));
        ofFloat.start();
    }

    public static void updateAlpha(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda6(view));
        ofFloat.start();
    }

    public static void updateTextColor(AHTextView aHTextView, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            aHTextView.setTextColor(num2);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num, num2});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new AHHelper$$ExternalSyntheticLambda0(aHTextView));
        ofObject.start();
    }

    public static void updateViewBackgroundColor(View view, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new AHHelper$$ExternalSyntheticLambda7(view));
        ofObject.start();
    }

    public static void updateDrawableColor(Drawable drawable, ImageView imageView, Integer num, Integer num2, boolean z) {
        if (num == null || num2 == null) {
            imageView.setImageDrawable(getTintDrawable(drawable, num2, z));
            imageView.requestLayout();
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num, num2});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new AHHelper$$ExternalSyntheticLambda8(imageView, drawable, z));
        ofObject.start();
    }

    static /* synthetic */ void lambda$updateDrawableColor$7(ImageView imageView, Drawable drawable, boolean z, ValueAnimator valueAnimator) {
        imageView.setImageDrawable(getTintDrawable(drawable, (Integer) valueAnimator.getAnimatedValue(), z));
        imageView.requestLayout();
    }

    public static void updateWidth(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new AHHelper$$ExternalSyntheticLambda1(view));
        ofFloat.start();
    }

    static /* synthetic */ void lambda$updateWidth$8(View view, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setLayoutParams(layoutParams);
    }

    public static boolean isTranslucentStatusBar(Context context) {
        return (unwrap(context).getWindow().getAttributes().flags & 134217728) == 134217728;
    }

    public static int getSoftButtonsBarSizePort(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Window window = unwrap(context).getWindow();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        window.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    public static Activity unwrap(Context context) {
        while (!(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static <T> void map(ArrayList<T> arrayList, Mapper<T> mapper) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.set(i, mapper.map(arrayList.get(i)));
            }
        }
    }

    public static <T> void fill(ArrayList<T> arrayList, int i, T t) {
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(t);
        }
    }

    public static boolean equals(Object obj, Object obj2) {
        return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NullPointerException | NumberFormatException unused) {
            return false;
        }
    }
}
