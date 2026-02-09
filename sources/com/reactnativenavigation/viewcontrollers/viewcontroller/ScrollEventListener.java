package com.reactnativenavigation.viewcontrollers.viewcontroller;

import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.views.scroll.ScrollEvent;
import com.reactnativenavigation.utils.ReflectionUtils;
import com.reactnativenavigation.utils.UiThread;

public class ScrollEventListener implements EventDispatcherListener {
    private OnDragListener dragListener;
    private boolean dragStarted;
    private EventDispatcher eventDispatcher;
    private OnScrollListener onScrollListener;
    private int prevScrollY = -1;
    private ScrollAwareView view;

    public interface OnDragListener {
        void onHide();

        void onShow();
    }

    public interface OnScrollListener {
        void onScrollDown(float f);

        void onScrollUp(float f);
    }

    public interface ScrollAwareView {
        int getMeasuredHeight();

        float getTranslationY();
    }

    public ScrollEventListener(EventDispatcher eventDispatcher2) {
        this.eventDispatcher = eventDispatcher2;
    }

    public void register(ScrollAwareView scrollAwareView, OnScrollListener onScrollListener2, OnDragListener onDragListener) {
        this.view = scrollAwareView;
        this.onScrollListener = onScrollListener2;
        this.dragListener = onDragListener;
        this.eventDispatcher.addListener(this);
    }

    public void unregister() {
        this.eventDispatcher.removeListener(this);
    }

    public void onEventDispatch(Event event) {
        if (event instanceof ScrollEvent) {
            handleScrollEvent((ScrollEvent) event);
        }
    }

    private void handleScrollEvent(ScrollEvent scrollEvent) {
        try {
            if ("topScroll".equals(scrollEvent.getEventName())) {
                int intValue = ((Integer) ReflectionUtils.getDeclaredField(scrollEvent, "mScrollY")).intValue();
                onVerticalScroll(intValue, this.prevScrollY);
                if (intValue != this.prevScrollY) {
                    this.prevScrollY = intValue;
                }
            } else if ("topScrollBeginDrag".equals(scrollEvent.getEventName())) {
                onDrag(true, ((Double) ReflectionUtils.getDeclaredField(scrollEvent, "mYVelocity")).doubleValue());
            } else if ("topScrollEndDrag".equals(scrollEvent.getEventName())) {
                onDrag(false, ((Double) ReflectionUtils.getDeclaredField(scrollEvent, "mYVelocity")).doubleValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onVerticalScroll(int i, int i2) {
        ScrollAwareView scrollAwareView;
        if (i >= 0 && this.dragStarted && (scrollAwareView = this.view) != null) {
            int calcScrollDiff = calcScrollDiff(i, i2, scrollAwareView.getMeasuredHeight());
            float translationY = this.view.getTranslationY() - ((float) calcScrollDiff);
            if (calcScrollDiff < 0) {
                this.onScrollListener.onScrollDown(translationY);
            } else {
                this.onScrollListener.onScrollUp(translationY);
            }
        }
    }

    private int calcScrollDiff(int i, int i2, int i3) {
        int i4 = i - i2;
        return Math.abs(i4) > i3 ? (Math.abs(i4) / i4) * i3 : i4;
    }

    private void onDrag(boolean z, double d) {
        this.dragStarted = z;
        UiThread.post(new ScrollEventListener$$ExternalSyntheticLambda0(this, d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onDrag$0$com-reactnativenavigation-viewcontrollers-viewcontroller-ScrollEventListener  reason: not valid java name */
    public /* synthetic */ void m1035lambda$onDrag$0$comreactnativenavigationviewcontrollersviewcontrollerScrollEventListener(double d) {
        if (this.dragStarted) {
            return;
        }
        if (d > 0.0d) {
            this.dragListener.onShow();
        } else {
            this.dragListener.onHide();
        }
    }
}
