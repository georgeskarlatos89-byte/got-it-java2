package com.reactnativenavigation.utils;

import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.ReactApplication;
import com.reactnativenavigation.NavigationApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isDarkMode", "", "Landroid/content/Context;", "Landroid/content/res/Configuration;", "isDebug", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Context.kt */
public final class ContextKt {
    public static final boolean isDebug(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) applicationContext).getReactNativeHost().getUseDeveloperSupport();
    }

    public static final boolean isDarkMode() {
        NavigationApplication navigationApplication = NavigationApplication.instance;
        Intrinsics.checkNotNullExpressionValue(navigationApplication, "instance");
        return isDarkMode((Context) navigationApplication);
    }

    public static final boolean isDarkMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDarkMode(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return (configuration.uiMode & 48) == 32;
    }
}
