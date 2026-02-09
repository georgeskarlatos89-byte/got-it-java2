package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.Context;
import android.view.View;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.react.ReactView;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleBarReactView;", "Lcom/reactnativenavigation/react/ReactView;", "context", "Landroid/content/Context;", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "componentId", "", "componentName", "(Landroid/content/Context;Lcom/facebook/react/ReactInstanceManager;Ljava/lang/String;Ljava/lang/String;)V", "centered", "", "getCentered", "()Z", "setCentered", "(Z)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TitleBarReactView.kt */
public final class TitleBarReactView extends ReactView {
    private boolean centered;

    public TitleBarReactView(Context context, ReactInstanceManager reactInstanceManager, String str, String str2) {
        super(context, reactInstanceManager, str, str2);
    }

    public final boolean getCentered() {
        return this.centered;
    }

    public final void setCentered(boolean z) {
        this.centered = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.centered) {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        super.onMeasure(i, i2);
    }
}
