package com.reactnativenavigation.views.stack.fab;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.github.clans.fab.FloatingActionButton;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.utils.ImageLoader;
import com.reactnativenavigation.utils.ImageLoadingListenerAdapter;
import com.reactnativenavigation.viewcontrollers.stack.FabAnimator;
import com.reactnativenavigation.viewcontrollers.stack.FabCollapseBehaviour;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import java.util.Collections;
import java.util.List;

public class Fab extends FloatingActionButton implements FabAnimator {
    private FabCollapseBehaviour collapseBehaviour = new FabCollapseBehaviour(this);
    private String id = "";

    public Fab(Context context, String str) {
        super(context);
        this.id = str;
    }

    public void applyIcon(String str, final ThemeColour themeColour) {
        new ImageLoader().loadIcons(getContext(), Collections.singletonList(str), new ImageLoadingListenerAdapter() {
            public void onComplete(List<? extends Drawable> list) {
                if (themeColour.hasValue()) {
                    ((Drawable) list.get(0)).setColorFilter(new PorterDuffColorFilter(themeColour.get(), PorterDuff.Mode.SRC_IN));
                }
                Fab.this.setImageDrawable((Drawable) list.get(0));
            }

            public void onError(Throwable th) {
                th.printStackTrace();
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((Fab) obj).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void show() {
        show(true);
    }

    public void hide() {
        hide(true);
    }

    public void enableCollapse(ScrollEventListener scrollEventListener) {
        this.collapseBehaviour.enableCollapse(scrollEventListener);
    }

    public void disableCollapse() {
        this.collapseBehaviour.disableCollapse();
    }

    public String getFabId() {
        return this.id;
    }
}
