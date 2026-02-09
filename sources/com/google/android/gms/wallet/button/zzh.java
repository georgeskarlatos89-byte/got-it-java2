package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzh {
    public static Drawable zza(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable == null ? new GradientDrawable() : drawable;
    }
}
