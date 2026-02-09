package com.reactnativenavigation.views.sidemenu;

import android.content.Context;
import android.util.Log;
import androidx.drawerlayout.widget.DrawerLayout;
import com.reactnativenavigation.utils.LogKt;

public class SideMenu extends DrawerLayout {
    public SideMenu(Context context) {
        super(context);
    }

    public void openDrawer(int i, boolean z) {
        try {
            super.openDrawer(i, z);
        } catch (IllegalArgumentException unused) {
            Log.w(LogKt.MAIN_LIB_TAG, "Tried to open sideMenu, but it's not defined");
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        if (getDrawerLockMode(i2) != i) {
            super.setDrawerLockMode(i, i2);
        }
    }
}
