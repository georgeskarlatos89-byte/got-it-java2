package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.aurelhubert.ahbottomnavigation.notification.AHNotificationHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lib.android.paypal.com.magnessdk.g;
import org.objectweb.asm.Opcodes;

public class AHBottomNavigation extends FrameLayout {
    public static final int CURRENT_ITEM_NONE = -1;
    private static final String EXCEPTION_INDEX_OUT_OF_BOUNDS = "The position (%d) is out of bounds of the items (%d elements)";
    private static final int MAX_ITEMS = 5;
    private static final int MIN_ITEMS = 3;
    private static String TAG = "AHBottomNavigation";
    public static final int UPDATE_ALL_NOTIFICATIONS = -1;
    private int activeMarginTop;
    private int activePaddingTop;
    private boolean animateTabSelection = true;
    /* access modifiers changed from: private */
    public View backgroundColorView;
    private boolean behaviorTranslationEnabled = true;
    private AHBottomNavigationBehavior<AHBottomNavigation> bottomNavigationBehavior;
    private int bottomNavigationHeight;
    private Animator circleRevealAnim;
    private boolean colored = false;
    private ArrayList<Integer> coloredTitleColorActive = new ArrayList<>(5);
    private ArrayList<Integer> coloredTitleColorInactive = new ArrayList<>(5);
    /* access modifiers changed from: private */
    public Context context;
    private int currentColor = 0;
    private int currentItem = 0;
    private int defaultBackgroundColor = -1;
    private int defaultBackgroundResource = 0;
    private int defaultIconHeight;
    private int defaultIconWidth;
    private int defaultNotificationElevation;
    private boolean forceTint = false;
    private boolean hideBottomNavigationWithAnimation = false;
    private ArrayList<Integer> iconActiveColor = new ArrayList<>(5);
    private ArrayList<Integer> iconDisableColor = new ArrayList<>(5);
    private ArrayList<Integer> iconHeight = new ArrayList<>(5);
    private ArrayList<Integer> iconInactiveColor = new ArrayList<>(5);
    private ArrayList<Integer> iconWidth = new ArrayList<>(5);
    private boolean isBehaviorTranslationSet = false;
    /* access modifiers changed from: private */
    public ArrayList<AHBottomNavigationItem> items = new ArrayList<>();
    private Boolean[] itemsEnabledStates = {true, true, true, true, true};
    private LinearLayout linearLayoutContainer;
    private int navigationBarHeight = 0;
    private OnNavigationPositionListener navigationPositionListener;
    private boolean needHideBottomNavigation = false;
    private float notSelectedItemWidth;
    private int notificationActiveMarginLeft;
    private int notificationActiveMarginTop;
    private long notificationAnimationDuration;
    private int notificationBackgroundColor;
    private Drawable notificationBackgroundDrawable;
    private int notificationInactiveMarginLeft;
    private int notificationInactiveMarginTop;
    private int notificationTextColor;
    private Typeface notificationTypeface;
    private List<AHNotification> notifications = AHNotification.generateEmptyList(5);
    private boolean preferLargeIcons = false;
    private Resources resources;
    private boolean selectedBackgroundVisible = false;
    private float selectedItemWidth;
    private boolean soundEffectsEnabled = true;
    private OnTabSelectedListener tabSelectedListener;
    private ArrayList<Integer> titleActiveColor = new ArrayList<>(5);
    private ArrayList<Float> titleActiveTextSize = new ArrayList<>(5);
    private ArrayList<Integer> titleDisableColor = new ArrayList<>(5);
    private ArrayList<Integer> titleInactiveColor = new ArrayList<>(5);
    private ArrayList<Float> titleInactiveTextSize = new ArrayList<>(5);
    private TitleState titleState = TitleState.SHOW_WHEN_ACTIVE;
    private ArrayList<Typeface> titleTypeface = new ArrayList<>();
    private boolean translucentNavigationEnabled;
    private ArrayList<View> views = new ArrayList<>();
    private float widthDifference;

    public interface OnNavigationPositionListener {
        void onPositionChange(int i);
    }

    public interface OnTabSelectedListener {
        boolean onTabSelected(int i, boolean z);
    }

    public enum TitleState {
        SHOW_WHEN_ACTIVE,
        SHOW_WHEN_ACTIVE_FORCE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    public AHBottomNavigation(Context context2) {
        super(context2);
        init(context2, (AttributeSet) null);
    }

    public AHBottomNavigation(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        init(context2, attributeSet);
    }

    public AHBottomNavigation(Context context2, AttributeSet attributeSet, int i) {
        super(context2, attributeSet, i);
        init(context2, attributeSet);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.soundEffectsEnabled = z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        createItems();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.isBehaviorTranslationSet) {
            setBehaviorTranslationEnabled(this.behaviorTranslationEnabled);
            this.isBehaviorTranslationSet = true;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("current_item", this.currentItem);
        bundle.putParcelableArrayList("notifications", new ArrayList(this.notifications));
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.currentItem = bundle.getInt("current_item");
            this.notifications = bundle.getParcelableArrayList("notifications");
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    private void init(Context context2, AttributeSet attributeSet) {
        this.context = context2;
        Resources resources2 = context2.getResources();
        this.resources = resources2;
        this.defaultNotificationElevation = resources2.getDimensionPixelSize(R.dimen.bottom_navigation_notification_elevation);
        this.activePaddingTop = (int) this.resources.getDimension(R.dimen.bottom_navigation_margin_top_active);
        this.activeMarginTop = (int) this.resources.getDimension(R.dimen.bottom_navigation_small_margin_top_active);
        this.widthDifference = this.resources.getDimension(R.dimen.bottom_navigation_small_selected_width_difference);
        this.defaultIconHeight = this.resources.getDimensionPixelSize(R.dimen.bottom_navigation_icon);
        this.defaultIconWidth = this.resources.getDimensionPixelSize(R.dimen.bottom_navigation_icon);
        AHHelper.fill(this.iconActiveColor, 5, null);
        AHHelper.fill(this.iconInactiveColor, 5, null);
        AHHelper.fill(this.iconDisableColor, 5, null);
        AHHelper.fill(this.titleActiveColor, 5, null);
        AHHelper.fill(this.titleInactiveColor, 5, null);
        AHHelper.fill(this.titleDisableColor, 5, null);
        AHHelper.fill(this.iconWidth, 5, null);
        AHHelper.fill(this.iconHeight, 5, null);
        AHHelper.fill(this.titleTypeface, 5, null);
        AHHelper.fill(this.titleActiveTextSize, 5, null);
        AHHelper.fill(this.titleInactiveTextSize, 5, null);
        AHHelper.fill(this.coloredTitleColorActive, 5, Integer.valueOf(ContextCompat.getColor(context2, R.color.colorBottomNavigationActiveColored)));
        AHHelper.fill(this.coloredTitleColorInactive, 5, Integer.valueOf(ContextCompat.getColor(context2, R.color.colorBottomNavigationInactiveColored)));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.AHBottomNavigationBehavior_Params, 0, 0);
            try {
                this.selectedBackgroundVisible = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigationBehavior_Params_selectedBackgroundVisible, false);
                this.translucentNavigationEnabled = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigationBehavior_Params_translucentNavigationEnabled, false);
                AHHelper.map(this.titleActiveColor, new AHBottomNavigation$$ExternalSyntheticLambda3(obtainStyledAttributes, context2));
                AHHelper.map(this.titleInactiveColor, new AHBottomNavigation$$ExternalSyntheticLambda4(obtainStyledAttributes, context2));
                AHHelper.map(this.iconDisableColor, new AHBottomNavigation$$ExternalSyntheticLambda5(obtainStyledAttributes, context2));
                AHHelper.map(this.coloredTitleColorActive, new AHBottomNavigation$$ExternalSyntheticLambda6(obtainStyledAttributes, context2));
                AHHelper.map(this.coloredTitleColorInactive, new AHBottomNavigation$$ExternalSyntheticLambda7(obtainStyledAttributes, context2));
                this.colored = obtainStyledAttributes.getBoolean(R.styleable.AHBottomNavigationBehavior_Params_colored, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.notificationTextColor = ContextCompat.getColor(context2, 17170443);
        this.bottomNavigationHeight = (int) this.resources.getDimension(R.dimen.bottom_navigation_height);
        this.notificationActiveMarginLeft = (int) this.resources.getDimension(R.dimen.bottom_navigation_notification_margin_left_active);
        this.notificationInactiveMarginLeft = (int) this.resources.getDimension(R.dimen.bottom_navigation_notification_margin_left);
        this.notificationActiveMarginTop = (int) this.resources.getDimension(R.dimen.bottom_navigation_notification_margin_top_active);
        this.notificationInactiveMarginTop = (int) this.resources.getDimension(R.dimen.bottom_navigation_notification_margin_top);
        this.notificationAnimationDuration = 150;
        ViewCompat.setElevation(this, this.resources.getDimension(R.dimen.bottom_navigation_elevation));
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.bottomNavigationHeight));
    }

    /* access modifiers changed from: protected */
    public void createItems() {
        if (this.items.size() < 3) {
            Log.w(TAG, "The items list should have at least 3 items");
        } else if (this.items.size() > 5) {
            Log.w(TAG, "The items list should not have more than 5 items");
        }
        int dimension = (int) this.resources.getDimension(R.dimen.bottom_navigation_height);
        removeAllViews();
        this.views.clear();
        this.backgroundColorView = new View(this.context);
        addView(this.backgroundColorView, new FrameLayout.LayoutParams(-1, calculateHeight(dimension)));
        this.bottomNavigationHeight = dimension;
        LinearLayout linearLayout = new LinearLayout(this.context);
        this.linearLayoutContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.linearLayoutContainer.setGravity(17);
        addView(this.linearLayoutContainer, new FrameLayout.LayoutParams(-1, dimension));
        if (isClassic()) {
            createClassicItems(this.linearLayoutContainer);
        } else {
            createSmallItems(this.linearLayoutContainer);
        }
        post(new AHBottomNavigation$$ExternalSyntheticLambda2(this));
    }

    private boolean isClassic() {
        if (this.preferLargeIcons && this.items.size() == 3) {
            return true;
        }
        if (this.titleState == TitleState.ALWAYS_HIDE || this.titleState == TitleState.SHOW_WHEN_ACTIVE_FORCE || (this.items.size() != 3 && this.titleState != TitleState.ALWAYS_SHOW)) {
            return false;
        }
        return true;
    }

    private int calculateHeight(int i) {
        if (!this.translucentNavigationEnabled) {
            return i;
        }
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.navigationBarHeight = this.resources.getDimensionPixelSize(identifier);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842973, 16843760});
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        if (hasImmersive() && z) {
            i += this.navigationBarHeight;
        }
        obtainStyledAttributes.recycle();
        return i;
    }

    public boolean hasImmersive() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i2 > displayMetrics2.widthPixels || i > displayMetrics2.heightPixels;
    }

    private void createClassicItems(LinearLayout linearLayout) {
        boolean z;
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        float dimension = this.resources.getDimension(R.dimen.bottom_navigation_height);
        float dimension2 = this.resources.getDimension(R.dimen.bottom_navigation_min_width);
        float dimension3 = this.resources.getDimension(R.dimen.bottom_navigation_max_width);
        int i = 3;
        if (this.titleState == TitleState.ALWAYS_SHOW && this.items.size() > 3) {
            dimension2 = this.resources.getDimension(R.dimen.bottom_navigation_small_inactive_min_width);
            dimension3 = this.resources.getDimension(R.dimen.bottom_navigation_small_inactive_max_width);
        }
        int width = getWidth();
        if (width != 0 && this.items.size() != 0) {
            float size = (float) (width / this.items.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            boolean z2 = false;
            int i2 = 0;
            while (i2 < this.items.size()) {
                boolean z3 = this.currentItem == i2 ? true : z2;
                AHBottomNavigationItem aHBottomNavigationItem = this.items.get(i2);
                View inflate = layoutInflater.inflate(R.layout.bottom_navigation_item, this, z2);
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.bottom_navigation_container);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.bottom_navigation_item_icon);
                AHTextView aHTextView = (AHTextView) inflate.findViewById(R.id.bottom_navigation_item_title);
                AHTextView aHTextView2 = (AHTextView) inflate.findViewById(R.id.bottom_navigation_notification);
                imageView.getLayoutParams().width = getIconWidth(i2);
                imageView.getLayoutParams().height = getIconHeight(i2);
                imageView.setImageDrawable(aHBottomNavigationItem.getDrawable(this.context));
                if (this.titleState == TitleState.ALWAYS_HIDE || aHBottomNavigationItem.getTitle(this.context).isEmpty()) {
                    aHTextView.setVisibility(8);
                    if (!this.animateTabSelection) {
                        AHHelper.updateMargin(imageView, z2 ? 1 : 0, z2, z2, z2);
                    }
                    ((FrameLayout.LayoutParams) imageView.getLayoutParams()).gravity = 17;
                    ((ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams()).topMargin = ((this.bottomNavigationHeight - getIconHeight(i2)) / 2) - dpToPx(4);
                } else {
                    aHTextView.setText(aHBottomNavigationItem.getTitle(this.context));
                }
                aHTextView.setTypeface(this.titleTypeface.get(i2));
                if (this.titleState == TitleState.ALWAYS_SHOW && this.items.size() > i) {
                    frameLayout.setPadding(0, frameLayout.getPaddingTop(), 0, frameLayout.getPaddingBottom());
                }
                if (z3) {
                    if (this.selectedBackgroundVisible) {
                        z = true;
                        inflate.setSelected(true);
                    } else {
                        z = true;
                    }
                    imageView.setSelected(z);
                    if ((inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.animateTabSelection) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, this.activePaddingTop, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.notificationActiveMarginLeft, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                    marginLayoutParams3.setMargins(this.notificationInactiveMarginLeft, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                }
                if (!this.colored) {
                    int i3 = this.defaultBackgroundResource;
                    if (i3 != 0) {
                        setBackgroundResource(i3);
                    } else {
                        setBackgroundColor(this.defaultBackgroundColor);
                    }
                } else if (z3) {
                    setBackgroundColor(aHBottomNavigationItem.getColor(this.context));
                    this.currentColor = aHBottomNavigationItem.getColor(this.context);
                }
                aHTextView.setTextSize(0, z3 ? getActiveTextSize(i2) : getInactiveTextSize(i2));
                if (this.itemsEnabledStates[i2].booleanValue()) {
                    inflate.setOnClickListener(new AHBottomNavigation$$ExternalSyntheticLambda0(this, i2));
                    imageView.setImageDrawable(AHHelper.getTintDrawable(this.items.get(i2).getDrawable(this.context), (z3 ? this.iconActiveColor : this.iconInactiveColor).get(i2), this.forceTint));
                    aHTextView.setTextColor((z3 ? this.titleActiveColor : this.titleInactiveColor).get(i2));
                    inflate.setSoundEffectsEnabled(this.soundEffectsEnabled);
                } else {
                    imageView.setImageDrawable(AHHelper.getTintDrawable(this.items.get(i2).getDrawable(this.context), this.iconDisableColor.get(i2), this.forceTint));
                    aHTextView.setTextColor(this.titleDisableColor.get(i2));
                }
                if (aHBottomNavigationItem.getTag() != null) {
                    inflate.setTag(aHBottomNavigationItem.getTag());
                }
                linearLayout.addView(inflate, new FrameLayout.LayoutParams((int) dimension2, (int) dimension));
                this.views.add(inflate);
                setTabAccessibilityLabel(i2, this.currentItem);
                i2++;
                z2 = false;
                i = 3;
            }
            updateNotifications(true, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createClassicItems$5$com-aurelhubert-ahbottomnavigation-AHBottomNavigation  reason: not valid java name */
    public /* synthetic */ void m323lambda$createClassicItems$5$comaurelhubertahbottomnavigationAHBottomNavigation(int i, View view) {
        updateItems(i, true);
    }

    private int getIconHeight(int i) {
        if (this.iconHeight.get(i) == null) {
            return this.defaultIconHeight;
        }
        return dpToPx(this.iconHeight.get(i).intValue());
    }

    private int getIconWidth(int i) {
        if (this.iconWidth.get(i) == null) {
            return this.defaultIconWidth;
        }
        return dpToPx(this.iconWidth.get(i).intValue());
    }

    private float getInactiveTextSize(int i) {
        if (this.titleInactiveTextSize.get(i) != null) {
            return this.titleInactiveTextSize.get(i).floatValue();
        }
        if (this.titleState != TitleState.ALWAYS_SHOW || this.items.size() <= 3) {
            return this.resources.getDimension(R.dimen.bottom_navigation_text_size_inactive);
        }
        return this.resources.getDimension(R.dimen.bottom_navigation_text_size_forced_inactive);
    }

    private float getActiveTextSize(int i) {
        if (this.titleActiveTextSize.get(i) != null) {
            return this.titleActiveTextSize.get(i).floatValue();
        }
        if (this.titleState != TitleState.ALWAYS_SHOW || this.items.size() <= 3) {
            return this.resources.getDimension(R.dimen.bottom_navigation_text_size_active);
        }
        return this.resources.getDimension(R.dimen.bottom_navigation_text_size_forced_active);
    }

    private void createSmallItems(LinearLayout linearLayout) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        float dimension = this.resources.getDimension(R.dimen.bottom_navigation_height);
        float dimension2 = this.resources.getDimension(R.dimen.bottom_navigation_small_inactive_min_width);
        float dimension3 = this.resources.getDimension(R.dimen.bottom_navigation_small_inactive_max_width);
        int width = getWidth();
        if (width != 0 && this.items.size() != 0) {
            float size = (float) (width / this.items.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            float f = this.widthDifference;
            this.selectedItemWidth = (((float) this.items.size()) * f) + dimension2;
            float f2 = dimension2 - f;
            this.notSelectedItemWidth = f2;
            int i = 0;
            while (i < this.items.size()) {
                boolean z = this.currentItem == i;
                AHBottomNavigationItem aHBottomNavigationItem = this.items.get(i);
                View inflate = layoutInflater.inflate(R.layout.bottom_navigation_small_item, this, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.bottom_navigation_small_item_icon);
                AHTextView aHTextView = (AHTextView) inflate.findViewById(R.id.bottom_navigation_small_item_title);
                AHTextView aHTextView2 = (AHTextView) inflate.findViewById(R.id.bottom_navigation_notification);
                imageView.setImageDrawable(aHBottomNavigationItem.getDrawable(this.context));
                imageView.getLayoutParams().width = getIconWidth(i);
                imageView.getLayoutParams().height = getIconHeight(i);
                if (this.titleState != TitleState.ALWAYS_HIDE) {
                    aHTextView.setText(aHBottomNavigationItem.getTitle(this.context));
                }
                if (!((this.titleState != TitleState.ALWAYS_HIDE && !aHBottomNavigationItem.getTitle(this.context).isEmpty()) || this.titleState == TitleState.SHOW_WHEN_ACTIVE || this.titleState == TitleState.SHOW_WHEN_ACTIVE_FORCE)) {
                    aHTextView.setVisibility(8);
                    ((FrameLayout.LayoutParams) imageView.getLayoutParams()).gravity = 17;
                    AHHelper.updateMargin(imageView, 0, 0, 0, 0);
                }
                float activeTextSize = getActiveTextSize(i);
                if (activeTextSize != 0.0f) {
                    aHTextView.setTextSize(0, activeTextSize);
                }
                aHTextView.setTypeface(this.titleTypeface.get(i));
                if (z) {
                    if (this.selectedBackgroundVisible) {
                        inflate.setSelected(true);
                    }
                    imageView.setSelected(true);
                    if (this.titleState != TitleState.ALWAYS_HIDE && this.animateTabSelection && (inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, this.activeMarginTop, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.notificationActiveMarginLeft, this.notificationActiveMarginTop, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    if (this.animateTabSelection) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                        marginLayoutParams3.setMargins(this.notificationInactiveMarginLeft, this.notificationInactiveMarginTop, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                    }
                }
                if (!this.colored) {
                    int i2 = this.defaultBackgroundResource;
                    if (i2 != 0) {
                        setBackgroundResource(i2);
                    } else {
                        setBackgroundColor(this.defaultBackgroundColor);
                    }
                } else if (i == this.currentItem) {
                    setBackgroundColor(aHBottomNavigationItem.getColor(this.context));
                    this.currentColor = aHBottomNavigationItem.getColor(this.context);
                }
                if (this.itemsEnabledStates[i].booleanValue()) {
                    imageView.setImageDrawable(AHHelper.getTintDrawable(this.items.get(i).getDrawable(this.context), (this.currentItem == i ? this.iconActiveColor : this.iconInactiveColor).get(i), this.forceTint));
                    aHTextView.setTextColor((this.currentItem == i ? this.titleActiveColor : this.titleInactiveColor).get(i));
                    aHTextView.setAlpha(this.currentItem == i ? 1.0f : 0.0f);
                    inflate.setOnClickListener(new AHBottomNavigation$$ExternalSyntheticLambda1(this, i));
                    inflate.setSoundEffectsEnabled(this.soundEffectsEnabled);
                } else {
                    imageView.setImageDrawable(AHHelper.getTintDrawable(this.items.get(i).getDrawable(this.context), this.iconDisableColor.get(i), this.forceTint));
                    aHTextView.setTextColor(this.titleDisableColor.get(i));
                    aHTextView.setAlpha(0.0f);
                }
                int i3 = i == this.currentItem ? (int) this.selectedItemWidth : (int) f2;
                if (this.titleState == TitleState.ALWAYS_HIDE) {
                    i3 = (int) (((double) f2) * 1.16d);
                }
                if (aHBottomNavigationItem.getTag() != null) {
                    inflate.setTag(aHBottomNavigationItem.getTag());
                }
                linearLayout.addView(inflate, new FrameLayout.LayoutParams(i3, (int) dimension));
                this.views.add(inflate);
                setTabAccessibilityLabel(i, this.currentItem);
                i++;
            }
            updateNotifications(true, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createSmallItems$6$com-aurelhubert-ahbottomnavigation-AHBottomNavigation  reason: not valid java name */
    public /* synthetic */ void m324lambda$createSmallItems$6$comaurelhubertahbottomnavigationAHBottomNavigation(int i, View view) {
        updateSmallItems(i, true);
    }

    private void setTabAccessibilityLabel(int i, int i2) {
        AHBottomNavigationItem aHBottomNavigationItem = this.items.get(i);
        String str = "";
        String str2 = i2 == i ? "selected, " : str;
        if (aHBottomNavigationItem.getTitle(this.context) != null) {
            str2 = str2 + aHBottomNavigationItem.getTitle(this.context) + ", ";
        }
        if (AHHelper.isInteger(this.notifications.get(i).getReadableText())) {
            int parseInt = Integer.parseInt(this.notifications.get(i).getReadableText());
            StringBuilder append = new StringBuilder().append(str2).append(parseInt).append(" new item");
            if (parseInt != 1) {
                str = g.q1;
            }
            str2 = append.append(str).append(", ").toString();
        }
        this.views.get(i).setContentDescription(str2 + "tab, " + (i + 1) + " out of " + getItemsCount());
    }

    private void updateItems(final int i, boolean z) {
        for (int i2 = 0; i2 < this.views.size(); i2++) {
            setTabAccessibilityLabel(i2, i);
        }
        if (this.currentItem == i) {
            OnTabSelectedListener onTabSelectedListener = this.tabSelectedListener;
            if (onTabSelectedListener != null && z) {
                onTabSelectedListener.onTabSelected(i, true);
                return;
            }
            return;
        }
        OnTabSelectedListener onTabSelectedListener2 = this.tabSelectedListener;
        if (onTabSelectedListener2 == null || !z || onTabSelectedListener2.onTabSelected(i, false)) {
            int dimension = (int) this.resources.getDimension(R.dimen.bottom_navigation_margin_top_active);
            int dimension2 = (int) this.resources.getDimension(R.dimen.bottom_navigation_margin_top_inactive);
            int i3 = 0;
            while (i3 < this.views.size()) {
                View view = this.views.get(i3);
                if (this.selectedBackgroundVisible) {
                    view.setSelected(i3 == i);
                }
                if (i3 == i) {
                    AHTextView aHTextView = (AHTextView) view.findViewById(R.id.bottom_navigation_item_title);
                    ImageView imageView = (ImageView) view.findViewById(R.id.bottom_navigation_item_icon);
                    AHTextView aHTextView2 = (AHTextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.animateTabSelection) {
                        AHHelper.updateTopMargin(imageView, dimension2, dimension);
                        AHHelper.updateLeftMargin(aHTextView2, this.notificationInactiveMarginLeft, this.notificationActiveMarginLeft);
                        AHHelper.updateTextSize(aHTextView, getInactiveTextSize(i3), getActiveTextSize(i3));
                    }
                    AHHelper.updateTextColor(aHTextView, this.titleInactiveColor.get(i3), this.titleActiveColor.get(i3));
                    AHHelper.updateDrawableColor(this.items.get(i).getDrawable(this.context), imageView, this.iconInactiveColor.get(i3), this.iconActiveColor.get(i3), this.forceTint);
                    boolean z2 = this.colored;
                    if (z2) {
                        int max = Math.max(getWidth(), getHeight());
                        int x = ((int) view.getX()) + (view.getWidth() / 2);
                        int height = view.getHeight() / 2;
                        Animator animator = this.circleRevealAnim;
                        if (animator != null && animator.isRunning()) {
                            this.circleRevealAnim.cancel();
                            setBackgroundColor(this.items.get(i).getColor(this.context));
                            this.backgroundColorView.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.backgroundColorView, x, height, 0.0f, (float) max);
                        this.circleRevealAnim = createCircularReveal;
                        createCircularReveal.setStartDelay(5);
                        this.circleRevealAnim.addListener(new Animator.AnimatorListener() {
                            public void onAnimationCancel(Animator animator) {
                            }

                            public void onAnimationRepeat(Animator animator) {
                            }

                            public void onAnimationStart(Animator animator) {
                                AHBottomNavigation.this.backgroundColorView.setBackgroundColor(((AHBottomNavigationItem) AHBottomNavigation.this.items.get(i)).getColor(AHBottomNavigation.this.context));
                            }

                            public void onAnimationEnd(Animator animator) {
                                AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
                                aHBottomNavigation.setBackgroundColor(((AHBottomNavigationItem) aHBottomNavigation.items.get(i)).getColor(AHBottomNavigation.this.context));
                                AHBottomNavigation.this.backgroundColorView.setBackgroundColor(0);
                            }
                        });
                        this.circleRevealAnim.start();
                    } else if (z2) {
                        AHHelper.updateViewBackgroundColor(this, this.currentColor, this.items.get(i).getColor(this.context));
                    } else {
                        int i4 = this.defaultBackgroundResource;
                        if (i4 != 0) {
                            setBackgroundResource(i4);
                        } else {
                            setBackgroundColor(this.defaultBackgroundColor);
                        }
                        this.backgroundColorView.setBackgroundColor(0);
                    }
                } else if (i3 == this.currentItem) {
                    AHTextView aHTextView3 = (AHTextView) view.findViewById(R.id.bottom_navigation_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.bottom_navigation_item_icon);
                    AHTextView aHTextView4 = (AHTextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.animateTabSelection) {
                        AHHelper.updateTopMargin(imageView2, dimension, dimension2);
                        AHHelper.updateLeftMargin(aHTextView4, this.notificationActiveMarginLeft, this.notificationInactiveMarginLeft);
                        AHHelper.updateTextSize(aHTextView3, getActiveTextSize(i3), getInactiveTextSize(i3));
                    }
                    AHHelper.updateTextColor(aHTextView3, this.titleActiveColor.get(i3), this.titleInactiveColor.get(i3));
                    AHHelper.updateDrawableColor(this.items.get(this.currentItem).getDrawable(this.context), imageView2, this.iconActiveColor.get(i3), this.iconInactiveColor.get(i3), this.forceTint);
                }
                i3++;
            }
            this.currentItem = i;
            if (i > 0 && i < this.items.size()) {
                this.currentColor = this.items.get(this.currentItem).getColor(this.context);
            } else if (this.currentItem == -1) {
                int i5 = this.defaultBackgroundResource;
                if (i5 != 0) {
                    setBackgroundResource(i5);
                } else {
                    setBackgroundColor(this.defaultBackgroundColor);
                }
                this.backgroundColorView.setBackgroundColor(0);
            }
        }
    }

    private void updateSmallItems(final int i, boolean z) {
        if (this.currentItem == i) {
            OnTabSelectedListener onTabSelectedListener = this.tabSelectedListener;
            if (onTabSelectedListener != null && z) {
                onTabSelectedListener.onTabSelected(i, true);
                return;
            }
            return;
        }
        OnTabSelectedListener onTabSelectedListener2 = this.tabSelectedListener;
        if (onTabSelectedListener2 == null || !z || onTabSelectedListener2.onTabSelected(i, false)) {
            int dimension = (int) this.resources.getDimension(R.dimen.bottom_navigation_small_margin_top_active);
            int dimension2 = (int) this.resources.getDimension(R.dimen.bottom_navigation_small_margin_top);
            int i2 = 0;
            while (i2 < this.views.size()) {
                View view = this.views.get(i2);
                if (this.selectedBackgroundVisible) {
                    view.setSelected(i2 == i);
                }
                if (i2 == i) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bottom_navigation_small_container);
                    AHTextView aHTextView = (AHTextView) view.findViewById(R.id.bottom_navigation_small_item_title);
                    ImageView imageView = (ImageView) view.findViewById(R.id.bottom_navigation_small_item_icon);
                    AHTextView aHTextView2 = (AHTextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.titleState != TitleState.ALWAYS_HIDE) {
                        AHHelper.updateTopMargin(imageView, dimension2, dimension);
                        AHHelper.updateLeftMargin(aHTextView2, this.notificationInactiveMarginLeft, this.notificationActiveMarginLeft);
                        AHHelper.updateTopMargin(aHTextView2, this.notificationInactiveMarginTop, this.notificationActiveMarginTop);
                        AHHelper.updateTextColor(aHTextView, this.iconInactiveColor.get(i2), this.iconActiveColor.get(i2));
                        AHHelper.updateWidth(frameLayout, this.notSelectedItemWidth, this.selectedItemWidth);
                    }
                    AHHelper.updateAlpha(aHTextView, 0.0f, 1.0f);
                    AHHelper.updateDrawableColor(this.items.get(i).getDrawable(this.context), imageView, this.iconInactiveColor.get(i2), this.iconActiveColor.get(i2), this.forceTint);
                    boolean z2 = this.colored;
                    if (z2) {
                        int max = Math.max(getWidth(), getHeight());
                        int x = ((int) this.views.get(i).getX()) + (this.views.get(i).getWidth() / 2);
                        int height = this.views.get(i).getHeight() / 2;
                        Animator animator = this.circleRevealAnim;
                        if (animator != null && animator.isRunning()) {
                            this.circleRevealAnim.cancel();
                            setBackgroundColor(this.items.get(i).getColor(this.context));
                            this.backgroundColorView.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.backgroundColorView, x, height, 0.0f, (float) max);
                        this.circleRevealAnim = createCircularReveal;
                        createCircularReveal.setStartDelay(5);
                        this.circleRevealAnim.addListener(new Animator.AnimatorListener() {
                            public void onAnimationCancel(Animator animator) {
                            }

                            public void onAnimationRepeat(Animator animator) {
                            }

                            public void onAnimationStart(Animator animator) {
                                AHBottomNavigation.this.backgroundColorView.setBackgroundColor(((AHBottomNavigationItem) AHBottomNavigation.this.items.get(i)).getColor(AHBottomNavigation.this.context));
                            }

                            public void onAnimationEnd(Animator animator) {
                                AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
                                aHBottomNavigation.setBackgroundColor(((AHBottomNavigationItem) aHBottomNavigation.items.get(i)).getColor(AHBottomNavigation.this.context));
                                AHBottomNavigation.this.backgroundColorView.setBackgroundColor(0);
                            }
                        });
                        this.circleRevealAnim.start();
                    } else if (z2) {
                        AHHelper.updateViewBackgroundColor(this, this.currentColor, this.items.get(i).getColor(this.context));
                    } else {
                        int i3 = this.defaultBackgroundResource;
                        if (i3 != 0) {
                            setBackgroundResource(i3);
                        } else {
                            setBackgroundColor(this.defaultBackgroundColor);
                        }
                        this.backgroundColorView.setBackgroundColor(0);
                    }
                } else if (i2 == this.currentItem) {
                    View findViewById = view.findViewById(R.id.bottom_navigation_small_container);
                    AHTextView aHTextView3 = (AHTextView) view.findViewById(R.id.bottom_navigation_small_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.bottom_navigation_small_item_icon);
                    AHTextView aHTextView4 = (AHTextView) view.findViewById(R.id.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.titleState != TitleState.ALWAYS_HIDE) {
                        AHHelper.updateTopMargin(imageView2, dimension, dimension2);
                        AHHelper.updateLeftMargin(aHTextView4, this.notificationActiveMarginLeft, this.notificationInactiveMarginLeft);
                        AHHelper.updateTopMargin(aHTextView4, this.notificationActiveMarginTop, this.notificationInactiveMarginTop);
                        AHHelper.updateTextColor(aHTextView3, this.iconActiveColor.get(i2), this.iconInactiveColor.get(i2));
                        AHHelper.updateWidth(findViewById, this.selectedItemWidth, this.notSelectedItemWidth);
                    }
                    AHHelper.updateAlpha(aHTextView3, 1.0f, 0.0f);
                    AHHelper.updateDrawableColor(this.items.get(this.currentItem).getDrawable(this.context), imageView2, this.iconActiveColor.get(i2), this.iconInactiveColor.get(i2), this.forceTint);
                }
                i2++;
            }
            this.currentItem = i;
            if (i > 0 && i < this.items.size()) {
                this.currentColor = this.items.get(this.currentItem).getColor(this.context);
            } else if (this.currentItem == -1) {
                int i4 = this.defaultBackgroundResource;
                if (i4 != 0) {
                    setBackgroundResource(i4);
                } else {
                    setBackgroundColor(this.defaultBackgroundColor);
                }
                this.backgroundColorView.setBackgroundColor(0);
            }
        }
    }

    private void updateNotifications(boolean z, int i) {
        int i2 = 0;
        while (i2 < this.views.size() && i2 < this.notifications.size()) {
            if (i == -1 || i == i2) {
                AHNotification aHNotification = this.notifications.get(i2);
                int textColor = AHNotificationHelper.getTextColor(aHNotification, this.notificationTextColor);
                int backgroundColor = AHNotificationHelper.getBackgroundColor(aHNotification, this.notificationBackgroundColor);
                AHTextView aHTextView = (AHTextView) this.views.get(i2).findViewById(R.id.bottom_navigation_notification);
                if (z) {
                    aHTextView.setElevation(aHNotification.isDot() ? 0.0f : (float) this.defaultNotificationElevation);
                    aHTextView.setTextColor(textColor);
                    Typeface typeface = this.notificationTypeface;
                    if (typeface != null) {
                        aHTextView.setTypeface(typeface);
                    } else {
                        aHTextView.setTypeface((Typeface) null, 1);
                    }
                    if (this.notificationBackgroundDrawable != null) {
                        aHTextView.setBackground(this.notificationBackgroundDrawable.getConstantState().newDrawable());
                    } else if (backgroundColor != 0) {
                        aHTextView.setBackground(AHHelper.getTintDrawable(ContextCompat.getDrawable(this.context, R.drawable.notification_background), Integer.valueOf(backgroundColor), this.forceTint));
                    }
                }
                if (aHNotification.isEmpty()) {
                    hideNotification(aHNotification, aHTextView);
                } else {
                    showNotification(aHNotification, aHTextView);
                }
            }
            i2++;
        }
    }

    private void showNotification(AHNotification aHNotification, AHTextView aHTextView) {
        aHTextView.setText(aHNotification.getReadableText());
        updateNotificationSize(aHNotification, aHTextView);
        if (aHTextView.getAlpha() == 1.0f) {
            return;
        }
        if (shouldAnimateNotification(aHNotification)) {
            animateNotificationShow(aHTextView);
            aHNotification.setAnimate(false);
            return;
        }
        aHTextView.setScaleX(1.0f);
        aHTextView.setScaleY(1.0f);
        aHTextView.setAlpha(1.0f);
    }

    private void animateNotificationShow(AHTextView aHTextView) {
        aHTextView.setScaleX(0.0f);
        aHTextView.setScaleY(0.0f);
        aHTextView.setAlpha(0.0f);
        aHTextView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(this.notificationAnimationDuration).start();
    }

    private void hideNotification(AHNotification aHNotification, AHTextView aHTextView) {
        if (aHTextView.getAlpha() == 0.0f) {
            return;
        }
        if (shouldAnimateNotification(aHNotification)) {
            animateHideNotification(aHTextView);
            aHNotification.setAnimate(false);
            return;
        }
        aHTextView.setScaleX(0.0f);
        aHTextView.setScaleY(0.0f);
        aHTextView.setAlpha(0.0f);
    }

    private void animateHideNotification(final AHTextView aHTextView) {
        aHTextView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                if (aHTextView.getAlpha() == 0.0f) {
                    aHTextView.setText("");
                }
            }
        }).setDuration(this.notificationAnimationDuration).start();
    }

    private void updateNotificationSize(AHNotification aHNotification, AHTextView aHTextView) {
        ViewGroup.LayoutParams layoutParams = aHTextView.getLayoutParams();
        layoutParams.width = (aHNotification.getSize() < 0 || aHNotification.hasText()) ? -2 : aHNotification.getSize();
        layoutParams.height = aHNotification.getSize() >= 0 ? aHNotification.getSize() : getResources().getDimensionPixelSize(R.dimen.bottom_navigation_notification_height);
        aHTextView.requestLayout();
    }

    private boolean shouldAnimateNotification(AHNotification aHNotification) {
        return aHNotification.shouldAnimate() && this.animateTabSelection;
    }

    public void addItem(AHBottomNavigationItem aHBottomNavigationItem) {
        if (this.items.size() > 5) {
            Log.w(TAG, "The items list should not have more than 5 items");
        }
        this.items.add(aHBottomNavigationItem);
        createItems();
    }

    public void addItems(List<AHBottomNavigationItem> list) {
        if (list.size() > 5 || this.items.size() + list.size() > 5) {
            Log.w(TAG, "The items list should not have more than 5 items");
        }
        this.items.addAll(list);
        createItems();
    }

    public void removeItemAtIndex(int i) {
        if (i < this.items.size()) {
            this.items.remove(i);
            createItems();
        }
    }

    public void removeAllItems() {
        this.items.clear();
        createItems();
    }

    public void refresh() {
        createItems();
    }

    public int getItemsCount() {
        return this.items.size();
    }

    public boolean isColored() {
        return this.colored;
    }

    public void setColored(boolean z) {
        this.colored = z;
        this.iconActiveColor = z ? this.coloredTitleColorActive : this.titleActiveColor;
        this.iconInactiveColor = z ? this.coloredTitleColorInactive : this.titleInactiveColor;
        createItems();
    }

    public int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    public void setDefaultBackgroundColor(int i) {
        this.defaultBackgroundColor = i;
        createItems();
    }

    public void setDefaultBackgroundResource(int i) {
        this.defaultBackgroundResource = i;
        createItems();
    }

    public void setAnimateTabSelection(boolean z) {
        this.animateTabSelection = z;
    }

    public Integer getIconActiveColor(int i) {
        return this.iconActiveColor.get(i);
    }

    public void setIconActiveColor(int i, Integer num) {
        if (!AHHelper.equals(this.iconActiveColor.get(i), num)) {
            this.iconActiveColor.set(i, num);
            createItems();
        }
    }

    public void setIconWidth(int i, Integer num) {
        if (!AHHelper.equals(this.iconWidth.get(i), num)) {
            this.iconWidth.set(i, num);
            createItems();
        }
    }

    public void setIconHeight(int i, Integer num) {
        if (!AHHelper.equals(this.iconHeight.get(i), num)) {
            this.iconHeight.set(i, num);
            createItems();
        }
    }

    public void setTitleActiveColor(int i, Integer num) {
        if (!AHHelper.equals(this.titleActiveColor.get(i), num)) {
            this.titleActiveColor.set(i, num);
            createItems();
        }
    }

    public Integer getIconInactiveColor(int i) {
        return this.iconInactiveColor.get(i);
    }

    public Integer getTitleInactiveColor(int i) {
        return this.titleInactiveColor.get(i);
    }

    public void setIconInactiveColor(int i, Integer num) {
        if (!AHHelper.equals(this.iconInactiveColor.get(i), num)) {
            this.iconInactiveColor.set(i, num);
            createItems();
        }
    }

    public void setTitleInactiveColor(int i, Integer num) {
        if (!AHHelper.equals(this.titleInactiveColor.get(i), num)) {
            this.titleInactiveColor.set(i, num);
            createItems();
        }
    }

    public void setColoredModeColors(int i, int i2, int i3) {
        this.coloredTitleColorActive.set(i, Integer.valueOf(i2));
        this.coloredTitleColorInactive.set(i, Integer.valueOf(i3));
        createItems();
    }

    public void setSelectedBackgroundVisible(boolean z) {
        this.selectedBackgroundVisible = z;
        createItems();
    }

    public void setTitleTypeface(int i, Typeface typeface) {
        if (this.titleTypeface.get(i) != typeface) {
            this.titleTypeface.set(i, typeface);
            createItems();
        }
    }

    public void setTitleActiveTextSize(int i, Float f) {
        if (!AHHelper.equals(this.titleActiveTextSize.get(i), f)) {
            this.titleActiveTextSize.set(i, f);
            createItems();
        }
    }

    public void setTitleInactiveTextSize(int i, Float f) {
        if (!AHHelper.equals(this.titleInactiveTextSize.get(i), f)) {
            this.titleInactiveTextSize.set(i, f);
            createItems();
        }
    }

    public void setTitleActiveTextSizeInSp(int i, Float f) {
        if (!AHHelper.equals(this.titleActiveTextSize.get(i), f)) {
            this.titleActiveTextSize.set(i, Float.valueOf(TypedValue.applyDimension(2, f.floatValue(), this.resources.getDisplayMetrics())));
            createItems();
        }
    }

    public void setTitleInactiveTextSizeInSp(int i, Float f) {
        if (!AHHelper.equals(this.titleInactiveTextSize.get(i), f)) {
            this.titleInactiveTextSize.set(i, Float.valueOf(TypedValue.applyDimension(2, f.floatValue(), this.resources.getDisplayMetrics())));
            createItems();
        }
    }

    public void setTag(int i, String str) {
        if (i >= 0 && i < this.views.size()) {
            this.views.get(i).setTag(str);
        }
    }

    public AHBottomNavigationItem getItem(int i) {
        if (i >= 0 && i <= this.items.size() - 1) {
            return this.items.get(i);
        }
        Log.w(TAG, "The position is out of bounds of the items (" + this.items.size() + " elements)");
        return null;
    }

    public int getCurrentItem() {
        return this.currentItem;
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (i >= this.items.size()) {
            Log.w(TAG, "The position is out of bounds of the items (" + this.items.size() + " elements)");
        } else if (isClassic()) {
            updateItems(i, z);
        } else {
            updateSmallItems(i, z);
        }
    }

    public boolean isBehaviorTranslationEnabled() {
        return this.behaviorTranslationEnabled;
    }

    public void setBehaviorTranslationEnabled(boolean z) {
        this.behaviorTranslationEnabled = z;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
            if (aHBottomNavigationBehavior == null) {
                this.bottomNavigationBehavior = new AHBottomNavigationBehavior<>(z, this.navigationBarHeight);
            } else {
                aHBottomNavigationBehavior.setBehaviorTranslationEnabled(z, this.navigationBarHeight);
            }
            OnNavigationPositionListener onNavigationPositionListener = this.navigationPositionListener;
            if (onNavigationPositionListener != null) {
                this.bottomNavigationBehavior.setOnNavigationPositionListener(onNavigationPositionListener);
            }
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(this.bottomNavigationBehavior);
            if (this.needHideBottomNavigation) {
                this.needHideBottomNavigation = false;
                this.bottomNavigationBehavior.hideView(this, this.bottomNavigationHeight, this.hideBottomNavigationWithAnimation);
            }
        }
    }

    public void manageFloatingActionButtonBehavior(FloatingActionButton floatingActionButton) {
        if (floatingActionButton.getParent() instanceof CoordinatorLayout) {
            ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).setBehavior(new AHBottomNavigationFABBehavior(this.navigationBarHeight));
        }
    }

    public void hideBottomNavigation() {
        hideBottomNavigation(true);
    }

    public void hideBottomNavigation(boolean z) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.hideView(this, this.bottomNavigationHeight, z);
        } else if (getParent() instanceof CoordinatorLayout) {
            this.needHideBottomNavigation = true;
            this.hideBottomNavigationWithAnimation = z;
        } else {
            ViewCompat.animate(this).translationY((float) this.bottomNavigationHeight).setInterpolator(new LinearOutSlowInInterpolator()).setDuration(z ? 300 : 0).start();
        }
    }

    public void restoreBottomNavigation() {
        restoreBottomNavigation(true);
    }

    public void restoreBottomNavigation(boolean z) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.resetOffset(this, z);
        } else {
            ViewCompat.animate(this).translationY(0.0f).setInterpolator(new LinearOutSlowInInterpolator()).setDuration(z ? 300 : 0).start();
        }
    }

    public boolean isTranslucentNavigationEnabled() {
        return this.translucentNavigationEnabled;
    }

    public void setTranslucentNavigationEnabled(boolean z) {
        this.translucentNavigationEnabled = z;
    }

    public boolean isForceTint() {
        return this.forceTint;
    }

    public void setForceTint(boolean z) {
        this.forceTint = z;
        createItems();
    }

    public TitleState getTitleState() {
        return this.titleState;
    }

    public void setTitleState(TitleState titleState2) {
        this.titleState = titleState2;
        createItems();
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.tabSelectedListener = onTabSelectedListener;
    }

    public void removeOnTabSelectedListener() {
        this.tabSelectedListener = null;
    }

    public void setOnNavigationPositionListener(OnNavigationPositionListener onNavigationPositionListener) {
        this.navigationPositionListener = onNavigationPositionListener;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.setOnNavigationPositionListener(onNavigationPositionListener);
        }
    }

    public void removeOnNavigationPositionListener() {
        this.navigationPositionListener = null;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.removeOnNavigationPositionListener();
        }
    }

    @Deprecated
    public void setNotification(int i, int i2) {
        String str;
        if (i2 < 0 || i2 > this.items.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, EXCEPTION_INDEX_OUT_OF_BOUNDS, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.items.size())}));
        }
        if (i == 0) {
            str = "";
        } else {
            str = String.valueOf(i);
        }
        this.notifications.set(i2, AHNotification.justText(str));
        updateNotifications(false, i2);
    }

    public void setNotification(String str, int i) {
        if (i < 0 || i > this.items.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, EXCEPTION_INDEX_OUT_OF_BOUNDS, new Object[]{Integer.valueOf(i), Integer.valueOf(this.items.size())}));
        }
        this.notifications.set(i, AHNotification.justText(str));
        updateNotifications(false, i);
    }

    public void setNotification(AHNotification aHNotification, int i) {
        if (i < 0 || i > this.items.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, EXCEPTION_INDEX_OUT_OF_BOUNDS, new Object[]{Integer.valueOf(i), Integer.valueOf(this.items.size())}));
        }
        if (aHNotification == null) {
            aHNotification = new AHNotification();
        }
        this.notifications.set(i, aHNotification);
        updateNotifications(true, i);
    }

    public void setNotificationSize(int i, Integer num) {
        if (!AHHelper.equals(Integer.valueOf(this.notifications.get(i).getSize()), num)) {
            this.notifications.get(i).setSize(num.intValue());
            updateNotifications(true, i);
        }
    }

    public void setNotificationTextColor(int i) {
        if (this.notificationTextColor != i) {
            this.notificationTextColor = i;
            updateNotifications(true, -1);
        }
    }

    public void setNotificationTextColorResource(int i) {
        this.notificationTextColor = ContextCompat.getColor(this.context, i);
        updateNotifications(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.notificationBackgroundDrawable = drawable;
        updateNotifications(true, -1);
    }

    public void setNotificationBackgroundColor(int i) {
        if (this.notificationBackgroundColor != i) {
            this.notificationBackgroundColor = i;
            updateNotifications(true, -1);
        }
    }

    public void setNotificationBackgroundColorResource(int i) {
        this.notificationBackgroundColor = ContextCompat.getColor(this.context, i);
        updateNotifications(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.notificationTypeface = typeface;
        updateNotifications(true, -1);
    }

    public void setNotificationAnimationDuration(long j) {
        this.notificationAnimationDuration = j;
        updateNotifications(true, -1);
    }

    public void setNotificationMarginLeft(int i, int i2) {
        this.notificationActiveMarginLeft = i;
        this.notificationInactiveMarginLeft = i2;
        createItems();
    }

    public void setUseElevation(boolean z) {
        ViewCompat.setElevation(this, z ? this.resources.getDimension(R.dimen.bottom_navigation_elevation) : 0.0f);
        setClipToPadding(false);
    }

    public void setUseElevation(boolean z, float f) {
        if (!z) {
            f = 0.0f;
        }
        ViewCompat.setElevation(this, f);
        setClipToPadding(false);
    }

    public boolean isHidden() {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.bottomNavigationBehavior;
        if (aHBottomNavigationBehavior != null) {
            return aHBottomNavigationBehavior.isHidden();
        }
        return false;
    }

    public View getViewAtPosition(int i) {
        LinearLayout linearLayout = this.linearLayoutContainer;
        if (linearLayout == null || i < 0 || i >= linearLayout.getChildCount()) {
            return null;
        }
        return this.linearLayoutContainer.getChildAt(i);
    }

    public void enableItemAtPosition(int i) {
        if (i < 0 || i > this.items.size() - 1) {
            Log.w(TAG, "The position is out of bounds of the items (" + this.items.size() + " elements)");
            return;
        }
        this.itemsEnabledStates[i] = true;
        createItems();
    }

    public void disableItemAtPosition(int i) {
        if (i < 0 || i > this.items.size() - 1) {
            Log.w(TAG, "The position is out of bounds of the items (" + this.items.size() + " elements)");
            return;
        }
        this.itemsEnabledStates[i] = false;
        createItems();
    }

    public void setIconDisableColor(int i, int i2) {
        this.iconDisableColor.set(i, Integer.valueOf(i2));
    }

    public void setPreferLargeIcons(boolean z) {
        this.preferLargeIcons = z;
    }

    private int dpToPx(int i) {
        return i * (getResources().getDisplayMetrics().densityDpi / Opcodes.IF_ICMPNE);
    }
}
