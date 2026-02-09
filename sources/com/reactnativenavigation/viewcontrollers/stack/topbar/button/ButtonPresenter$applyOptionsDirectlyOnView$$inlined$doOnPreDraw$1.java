package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¨\u0006\u0002"}, d2 = {"<anonymous>", "", "androidx/core/view/ViewKt$doOnPreDraw$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: View.kt */
public final class ButtonPresenter$applyOptionsDirectlyOnView$$inlined$doOnPreDraw$1 implements Runnable {
    final /* synthetic */ MenuItem $menuItem$inlined;
    final /* synthetic */ Function1 $onViewFound$inlined;
    final /* synthetic */ View $this_doOnPreDraw;
    final /* synthetic */ Toolbar $titleBar$inlined;
    final /* synthetic */ ButtonPresenter this$0;

    public ButtonPresenter$applyOptionsDirectlyOnView$$inlined$doOnPreDraw$1(View view, ButtonPresenter buttonPresenter, Function1 function1, MenuItem menuItem, Toolbar toolbar) {
        this.$this_doOnPreDraw = view;
        this.this$0 = buttonPresenter;
        this.$onViewFound$inlined = function1;
        this.$menuItem$inlined = menuItem;
        this.$titleBar$inlined = toolbar;
    }

    public final void run() {
        if (this.this$0.button.hasComponent()) {
            Function1 function1 = this.$onViewFound$inlined;
            View actionView = this.$menuItem$inlined.getActionView();
            Intrinsics.checkNotNull(actionView);
            function1.invoke(actionView);
        }
        for (TextView next : ViewUtils.findChildrenByClass((ActionMenuView) ViewUtils.findChildByClass(this.$titleBar$inlined, ActionMenuView.class), TextView.class)) {
            ButtonPresenter buttonPresenter = this.this$0;
            Intrinsics.checkNotNullExpressionValue(next, ViewHierarchyConstants.VIEW_KEY);
            if (buttonPresenter.isTextualButtonView(next) || this.this$0.isIconButtonView(next, this.$menuItem$inlined)) {
                this.$onViewFound$inlined.invoke(next);
            }
        }
    }
}
