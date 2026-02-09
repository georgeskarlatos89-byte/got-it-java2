package com.reactnativenavigation.views.bottomtabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.reactnativenavigation.R;
import com.reactnativenavigation.options.LayoutDirection;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController$$ExternalSyntheticLambda3;
import java.util.ArrayList;
import java.util.List;

public class BottomTabs extends AHBottomNavigation {
    private boolean itemsCreationEnabled = true;
    private List<Runnable> onItemCreationEnabled = new ArrayList();
    private boolean shouldCreateItems = true;

    public BottomTabs(Context context) {
        super(context);
        setId(R.id.bottomTabs);
        setDefaultBackgroundColor(0);
    }

    public void disableItemsCreation() {
        this.itemsCreationEnabled = false;
    }

    public void enableItemsCreation() {
        this.itemsCreationEnabled = true;
        if (this.shouldCreateItems) {
            this.shouldCreateItems = false;
            createItems();
            CollectionUtils.forEach(this.onItemCreationEnabled, new ViewController$$ExternalSyntheticLambda3());
            this.onItemCreationEnabled.clear();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (hasItemsAndIsMeasured(i, i2, i3, i4)) {
            createItems();
        }
    }

    /* access modifiers changed from: protected */
    public void createItems() {
        if (this.itemsCreationEnabled) {
            superCreateItems();
        } else {
            this.shouldCreateItems = true;
        }
    }

    public void superCreateItems() {
        super.createItems();
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (this.itemsCreationEnabled) {
            super.setCurrentItem(i, z);
        } else {
            this.onItemCreationEnabled.add(new BottomTabs$$ExternalSyntheticLambda0(this, i, z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setCurrentItem$0$com-reactnativenavigation-views-bottomtabs-BottomTabs  reason: not valid java name */
    public /* synthetic */ void m1041lambda$setCurrentItem$0$comreactnativenavigationviewsbottomtabsBottomTabs(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public void setTitleState(AHBottomNavigation.TitleState titleState) {
        if (getTitleState() != titleState) {
            super.setTitleState(titleState);
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (getDefaultBackgroundColor() != i) {
            setDefaultBackgroundColor(i);
        }
    }

    public void restoreBottomNavigation(boolean z) {
        super.restoreBottomNavigation(z);
        if (!z) {
            setVisibility(0);
        }
    }

    public void hideBottomNavigation(boolean z) {
        super.hideBottomNavigation(z);
        if (!z) {
            setVisibility(8);
        }
    }

    public void setText(int i, String str) {
        AHBottomNavigationItem item = getItem(i);
        if (!item.getTitle(getContext()).equals(str)) {
            item.setTitle(str);
            refresh();
        }
    }

    public void setIcon(int i, Drawable drawable) {
        AHBottomNavigationItem item = getItem(i);
        if (!item.getDrawable(getContext()).equals(drawable)) {
            item.setIcon(drawable);
            refresh();
        }
    }

    public void setSelectedIcon(int i, Drawable drawable) {
        AHBottomNavigationItem item = getItem(i);
        if (!item.getDrawable(getContext()).equals(drawable)) {
            item.setSelectedIcon(drawable);
            refresh();
        }
    }

    public void setLayoutDirection(LayoutDirection layoutDirection) {
        LinearLayout linearLayout = (LinearLayout) ViewUtils.findChildByClass(this, LinearLayout.class);
        if (linearLayout != null) {
            linearLayout.setLayoutDirection(layoutDirection.get());
        }
    }

    private boolean hasItemsAndIsMeasured(int i, int i2, int i3, int i4) {
        return (i == 0 || i2 == 0 || (i == i3 && i2 == i4) || getItemsCount() <= 0) ? false : true;
    }
}
