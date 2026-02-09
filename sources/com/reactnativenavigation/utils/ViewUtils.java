package com.reactnativenavigation.utils;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

public class ViewUtils {

    public interface Matcher<T> {
        boolean match(T t);
    }

    static /* synthetic */ boolean lambda$findChildrenByClass$1(Object obj) {
        return true;
    }

    static /* synthetic */ boolean lambda$findChildrenByClassRecursive$0(Object obj) {
        return true;
    }

    public static <T extends View> T findChildByClass(ViewGroup viewGroup, Class<T> cls) {
        T findChildByClass;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            T childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (findChildByClass = findChildByClass((ViewGroup) childAt, cls)) != null && cls.isAssignableFrom(findChildByClass.getClass())) {
                return findChildByClass;
            }
        }
        return null;
    }

    public static <T> List<T> findChildrenByClassRecursive(ViewGroup viewGroup, Class<?> cls) {
        return findChildrenByClassRecursive(viewGroup, cls, new ViewUtils$$ExternalSyntheticLambda0());
    }

    public static <T> List<T> findChildrenByClassRecursive(ViewGroup viewGroup, Class<?> cls, Matcher<T> matcher) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(findChildrenByClassRecursive((ViewGroup) childAt, cls, matcher));
            }
            if (cls.isAssignableFrom(childAt.getClass()) && matcher.match(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static <T> List<T> findChildrenByClass(ViewGroup viewGroup, Class<T> cls) {
        return findChildrenByClass(viewGroup, cls, new ViewUtils$$ExternalSyntheticLambda2());
    }

    public static <T> List<T> findChildrenByClass(ViewGroup viewGroup, Class<?> cls, Matcher<T> matcher) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass()) && matcher.match(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static boolean isChildOf(ViewGroup viewGroup, View view) {
        if (viewGroup == view) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt == view) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && isChildOf((ViewGroup) childAt, view)) {
                return true;
            }
        }
        return false;
    }

    public static int getHeight(View view) {
        if (view.getLayoutParams() == null) {
            return 0;
        }
        return view.getLayoutParams().height < 0 ? view.getHeight() : view.getLayoutParams().height;
    }

    public static Point getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static boolean areDimensionsEqual(View view, View view2) {
        return view.getWidth() == view2.getWidth() && view.getHeight() == view2.getHeight();
    }

    public static int getIndexInParent(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return -1;
        }
        return ((ViewGroup) parent).indexOfChild(view);
    }

    public static int getBackgroundColor(View view) {
        if (view.getBackground() instanceof ReactViewBackgroundDrawable) {
            return ((ReactViewBackgroundDrawable) view.getBackground()).getColor();
        }
        throw new RuntimeException(view.getBackground().getClass().getSimpleName() + " is not ReactViewBackgroundDrawable");
    }

    public static boolean isVisible(View view) {
        return ((Boolean) ObjectUtils.perform(view, false, new ViewUtils$$ExternalSyntheticLambda1())).booleanValue();
    }

    static /* synthetic */ Boolean lambda$isVisible$2(View view) {
        return Boolean.valueOf(view.getVisibility() == 0);
    }

    public static int topMargin(View view) {
        return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }
}
