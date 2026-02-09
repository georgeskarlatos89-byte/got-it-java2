package io.sentry.android.core.internal.gestures;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

public final class SentryGestureListener implements GestureDetector.OnGestureListener {
    private final IHub hub;
    /* access modifiers changed from: private */
    public final boolean isAndroidXAvailable;
    private final SentryAndroidOptions options;
    private final ScrollState scrollState = new ScrollState();
    private final WeakReference<Window> windowRef;

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public SentryGestureListener(WeakReference<Window> weakReference, IHub iHub, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        this.windowRef = weakReference;
        this.hub = iHub;
        this.options = sentryAndroidOptions;
        this.isAndroidXAvailable = z;
    }

    public void onUp(MotionEvent motionEvent) {
        View ensureWindowDecorView = ensureWindowDecorView("onUp");
        View view = (View) this.scrollState.targetRef.get();
        if (ensureWindowDecorView != null && view != null) {
            if (this.scrollState.type == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            addBreadcrumb(view, this.scrollState.type, Collections.singletonMap("direction", this.scrollState.calculateDirection(motionEvent)));
            this.scrollState.reset();
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.scrollState.reset();
        float unused = this.scrollState.startX = motionEvent.getX();
        float unused2 = this.scrollState.startY = motionEvent.getY();
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View ensureWindowDecorView = ensureWindowDecorView("onSingleTapUp");
        if (!(ensureWindowDecorView == null || motionEvent == null)) {
            View findTarget = ViewUtils.findTarget(ensureWindowDecorView, motionEvent.getX(), motionEvent.getY(), new SentryGestureListener$$ExternalSyntheticLambda0());
            if (findTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            addBreadcrumb(findTarget, "click", Collections.emptyMap());
        }
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View ensureWindowDecorView = ensureWindowDecorView("onScroll");
        if (!(ensureWindowDecorView == null || motionEvent == null || this.scrollState.type != null)) {
            View findTarget = ViewUtils.findTarget(ensureWindowDecorView, motionEvent.getX(), motionEvent.getY(), new ViewTargetSelector() {
                public boolean skipChildren() {
                    return true;
                }

                public boolean select(View view) {
                    return ViewUtils.isViewScrollable(view, SentryGestureListener.this.isAndroidXAvailable);
                }
            });
            if (findTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.scrollState.setTarget(findTarget);
            String unused = this.scrollState.type = ViewProps.SCROLL;
        }
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        String unused = this.scrollState.type = "swipe";
        return false;
    }

    private void addBreadcrumb(View view, String str, Map<String, Object> map) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        this.hub.addBreadcrumb(Breadcrumb.userInteraction(str, ViewUtils.getResourceId(view), canonicalName, map));
    }

    private View ensureWindowDecorView(String str) {
        Window window = (Window) this.windowRef.get();
        if (window == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private static final class ScrollState {
        /* access modifiers changed from: private */
        public float startX;
        /* access modifiers changed from: private */
        public float startY;
        /* access modifiers changed from: private */
        public WeakReference<View> targetRef;
        /* access modifiers changed from: private */
        public String type;

        private ScrollState() {
            this.type = null;
            this.targetRef = new WeakReference<>((Object) null);
            this.startX = 0.0f;
            this.startY = 0.0f;
        }

        /* access modifiers changed from: private */
        public void setTarget(View view) {
            this.targetRef = new WeakReference<>(view);
        }

        /* access modifiers changed from: private */
        public String calculateDirection(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.startX;
            float y = motionEvent.getY() - this.startY;
            return Math.abs(x) > Math.abs(y) ? x > 0.0f ? ViewProps.RIGHT : "left" : y > 0.0f ? "down" : "up";
        }

        /* access modifiers changed from: private */
        public void reset() {
            this.targetRef.clear();
            this.type = null;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }
    }
}
