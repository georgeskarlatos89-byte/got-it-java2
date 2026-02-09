package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.content.ContextCompat;
import com.aurelhubert.ahbottomnavigation.AHHelper;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AHBottomNavigation$$ExternalSyntheticLambda3 implements AHHelper.Mapper {
    public final /* synthetic */ TypedArray f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ AHBottomNavigation$$ExternalSyntheticLambda3(TypedArray typedArray, Context context) {
        this.f$0 = typedArray;
        this.f$1 = context;
    }

    public final Object map(Object obj) {
        return Integer.valueOf(this.f$0.getColor(R.styleable.AHBottomNavigationBehavior_Params_accentColor, ContextCompat.getColor(this.f$1, R.color.colorBottomNavigationAccent)));
    }
}
