package com.reactnativenavigation.views.stack.fab;

import android.content.Context;
import android.view.View;
import com.github.clans.fab.FloatingActionMenu;
import com.reactnativenavigation.viewcontrollers.stack.FabAnimator;
import com.reactnativenavigation.viewcontrollers.stack.FabCollapseBehaviour;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import java.util.HashSet;

public class FabMenu extends FloatingActionMenu implements FabAnimator {
    private HashSet<Fab> actions = new HashSet<>();
    private FabCollapseBehaviour collapseBehaviour;
    private String id = "";

    public FabMenu(Context context, String str) {
        super(context);
        this.id = str;
        this.collapseBehaviour = new FabCollapseBehaviour(this);
        onFinishInflate();
        setOnMenuButtonClickListener(new FabMenu$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-reactnativenavigation-views-stack-fab-FabMenu  reason: not valid java name */
    public /* synthetic */ void m1044lambda$new$0$comreactnativenavigationviewsstackfabFabMenu(View view) {
        toggle(true);
    }

    public void show() {
        showMenu(true);
    }

    public void hide() {
        hideMenu(true);
    }

    public void enableCollapse(ScrollEventListener scrollEventListener) {
        this.collapseBehaviour.enableCollapse(scrollEventListener);
    }

    public void disableCollapse() {
        this.collapseBehaviour.disableCollapse();
    }

    public HashSet<Fab> getActions() {
        return this.actions;
    }

    public String getFabId() {
        return this.id;
    }
}
