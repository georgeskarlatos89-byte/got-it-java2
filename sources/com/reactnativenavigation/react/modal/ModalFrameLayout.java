package com.reactnativenavigation.react.modal;

import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/reactnativenavigation/react/modal/ModalFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "modalContentLayout", "Lcom/reactnativenavigation/react/modal/ModalContentLayout;", "getModalContentLayout", "()Lcom/reactnativenavigation/react/modal/ModalContentLayout;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalFrameLayout.kt */
public final class ModalFrameLayout extends FrameLayout {
    private final ModalContentLayout modalContentLayout;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModalFrameLayout(com.facebook.react.bridge.ReactContext r6) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0
            r5.<init>(r0)
            com.reactnativenavigation.react.modal.ModalContentLayout r1 = new com.reactnativenavigation.react.modal.ModalContentLayout
            r1.<init>(r0)
            r5.modalContentLayout = r1
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -2
            r0.<init>(r2, r2)
            android.app.Activity r2 = r6.getCurrentActivity()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0031
            java.lang.String r4 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            boolean r2 = com.reactnativenavigation.utils.SystemUiUtils.isTranslucent(r2)
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            android.app.Activity r6 = r6.getCurrentActivity()
            int r3 = com.reactnativenavigation.utils.SystemUiUtils.getStatusBarHeight(r6)
        L_0x003d:
            r0.topMargin = r3
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r5.addView(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.react.modal.ModalFrameLayout.<init>(com.facebook.react.bridge.ReactContext):void");
    }

    public final ModalContentLayout getModalContentLayout() {
        return this.modalContentLayout;
    }
}
