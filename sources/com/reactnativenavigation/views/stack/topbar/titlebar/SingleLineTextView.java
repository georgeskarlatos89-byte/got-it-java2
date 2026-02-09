package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/views/stack/topbar/titlebar/SingleLineTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "fontSizeDp", "", "(Landroid/content/Context;F)V", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SingleLineTextView.kt */
public final class SingleLineTextView extends AppCompatTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleLineTextView(Context context, float f) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextSize(1, f);
    }
}
