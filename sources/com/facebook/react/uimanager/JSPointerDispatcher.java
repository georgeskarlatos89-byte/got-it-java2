package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JSPointerDispatcher {
    private static final float ONMOVE_EPSILON = 0.1f;
    private static final String TAG = "POINTER EVENTS";
    private static final int UNSET_POINTER_ID = -1;
    private int mChildHandlingNativeGesture = -1;
    private int mCoalescingKey = 0;
    private Set<Integer> mHoveringPointerIds = new HashSet();
    private int mLastButtonState = 0;
    private Map<Integer, float[]> mLastEventCoordinatesByPointerId;
    private Map<Integer, List<TouchTargetHelper.ViewTarget>> mLastHitPathByPointerId;
    private int mPrimaryPointerId = -1;
    private final ViewGroup mRootViewGroup;

    public JSPointerDispatcher(ViewGroup viewGroup) {
        this.mRootViewGroup = viewGroup;
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mChildHandlingNativeGesture == -1 && view != null) {
            dispatchCancelEvent(motionEvent, eventDispatcher);
            this.mChildHandlingNativeGesture = view.getId();
        }
    }

    public void onChildEndedNativeGesture() {
        this.mChildHandlingNativeGesture = -1;
    }

    private void onUp(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int activePointerId = pointerEventState.getActivePointerId();
        List list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.UP, PointerEventHelper.EVENT.UP_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_UP, i, pointerEventState, motionEvent));
        }
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(activePointerId))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, i, pointerEventState, motionEvent));
            }
            dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch(list, PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, false), eventDispatcher);
        }
        if (motionEvent.getActionMasked() == 1) {
            this.mPrimaryPointerId = -1;
        }
        this.mHoveringPointerIds.remove(Integer.valueOf(activePointerId));
    }

    private void incrementCoalescingKey() {
        this.mCoalescingKey = (this.mCoalescingKey + 1) % Integer.MAX_VALUE;
    }

    private short getCoalescingKey() {
        return (short) (65535 & this.mCoalescingKey);
    }

    private void onDown(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(pointerEventState.getActivePointerId()));
        incrementCoalescingKey();
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(pointerEventState.getActivePointerId()))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i, pointerEventState, motionEvent));
            }
            List<TouchTargetHelper.ViewTarget> filterByShouldDispatch = filterByShouldDispatch(list, PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, false);
            Collections.reverse(filterByShouldDispatch);
            dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, filterByShouldDispatch, eventDispatcher);
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.DOWN, PointerEventHelper.EVENT.DOWN_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_DOWN, i, pointerEventState, motionEvent));
        }
    }

    private PointerEvent.PointerEventState createEventState(int i, MotionEvent motionEvent) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            float[] fArr = new float[2];
            float y = motionEvent.getY(i2);
            float[] fArr2 = {motionEvent.getX(i2), y};
            List<TouchTargetHelper.ViewTarget> findTargetPathAndCoordinatesForTouch = TouchTargetHelper.findTargetPathAndCoordinatesForTouch(fArr2[0], y, this.mRootViewGroup, fArr);
            int pointerId = motionEvent.getPointerId(i2);
            hashMap.put(Integer.valueOf(pointerId), fArr);
            hashMap2.put(Integer.valueOf(pointerId), findTargetPathAndCoordinatesForTouch);
            hashMap3.put(Integer.valueOf(pointerId), fArr2);
        }
        return new PointerEvent.PointerEventState(this.mPrimaryPointerId, i, this.mLastButtonState, UIManagerHelper.getSurfaceId((View) this.mRootViewGroup), hashMap, hashMap2, hashMap3, this.mHoveringPointerIds);
    }

    public void handleMotionEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z) {
        int i;
        if (this.mChildHandlingNativeGesture == -1) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked == 0) {
                this.mPrimaryPointerId = motionEvent.getPointerId(0);
            } else if (actionMasked == 7) {
                this.mHoveringPointerIds.add(Integer.valueOf(pointerId));
            }
            PointerEvent.PointerEventState createEventState = createEventState(pointerId, motionEvent);
            boolean z2 = z && motionEvent.getActionMasked() == 10;
            if (z2) {
                Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
                List list = map != null ? map.get(Integer.valueOf(createEventState.getActivePointerId())) : null;
                if (list != null && !list.isEmpty()) {
                    i = ((TouchTargetHelper.ViewTarget) list.get(list.size() - 1)).getViewId();
                    createEventState.getHitPathByPointerId().put(Integer.valueOf(pointerId), new ArrayList());
                } else {
                    return;
                }
            } else {
                List list2 = createEventState.getHitPathByPointerId().get(Integer.valueOf(pointerId));
                if (list2 != null && !list2.isEmpty()) {
                    i = ((TouchTargetHelper.ViewTarget) list2.get(0)).getViewId();
                } else {
                    return;
                }
            }
            switch (actionMasked) {
                case 0:
                case 5:
                    onDown(i, createEventState, motionEvent, eventDispatcher);
                    break;
                case 1:
                case 6:
                    incrementCoalescingKey();
                    onUp(i, createEventState, motionEvent, eventDispatcher);
                    break;
                case 2:
                    onMove(i, createEventState, motionEvent, eventDispatcher);
                    break;
                case 3:
                    dispatchCancelEvent(createEventState, motionEvent, eventDispatcher);
                    break;
                case 7:
                    float[] fArr = createEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
                    Map<Integer, float[]> map2 = this.mLastEventCoordinatesByPointerId;
                    if (qualifiedMove(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{0.0f, 0.0f} : this.mLastEventCoordinatesByPointerId.get(Integer.valueOf(pointerId)))) {
                        onMove(i, createEventState, motionEvent, eventDispatcher);
                        break;
                    } else {
                        return;
                    }
                    break;
                case 9:
                    return;
                case 10:
                    if (z2) {
                        onMove(i, createEventState, motionEvent, eventDispatcher);
                        break;
                    }
                    break;
                default:
                    FLog.w("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + i);
                    return;
            }
            this.mLastHitPathByPointerId = createEventState.getHitPathByPointerId();
            this.mLastEventCoordinatesByPointerId = createEventState.getEventCoordinatesByPointerId();
            this.mLastButtonState = motionEvent.getButtonState();
            this.mHoveringPointerIds.retainAll(this.mLastEventCoordinatesByPointerId.keySet());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isAnyoneListeningForBubblingEvent(java.util.List<com.facebook.react.uimanager.TouchTargetHelper.ViewTarget> r2, com.facebook.react.uimanager.events.PointerEventHelper.EVENT r3, com.facebook.react.uimanager.events.PointerEventHelper.EVENT r4) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            com.facebook.react.uimanager.TouchTargetHelper$ViewTarget r0 = (com.facebook.react.uimanager.TouchTargetHelper.ViewTarget) r0
            android.view.View r1 = r0.getView()
            boolean r1 = com.facebook.react.uimanager.events.PointerEventHelper.isListening(r1, r3)
            if (r1 != 0) goto L_0x0024
            android.view.View r0 = r0.getView()
            boolean r0 = com.facebook.react.uimanager.events.PointerEventHelper.isListening(r0, r4)
            if (r0 == 0) goto L_0x0004
        L_0x0024:
            r2 = 1
            return r2
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.JSPointerDispatcher.isAnyoneListeningForBubblingEvent(java.util.List, com.facebook.react.uimanager.events.PointerEventHelper$EVENT, com.facebook.react.uimanager.events.PointerEventHelper$EVENT):boolean");
    }

    private static List<TouchTargetHelper.ViewTarget> filterByShouldDispatch(List<TouchTargetHelper.ViewTarget> list, PointerEventHelper.EVENT event, PointerEventHelper.EVENT event2, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (z) {
            return arrayList;
        }
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = list.get(size).getView();
            if (!z2 && !PointerEventHelper.isListening(view, event2) && !PointerEventHelper.isListening(view, event)) {
                arrayList.remove(size);
            } else if (!z2 && PointerEventHelper.isListening(view, event2)) {
                z2 = true;
            }
        }
        return arrayList;
    }

    private void dispatchEventForViewTargets(String str, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, List<TouchTargetHelper.ViewTarget> list, EventDispatcher eventDispatcher) {
        for (TouchTargetHelper.ViewTarget viewId : list) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(str, viewId.getViewId(), pointerEventState, motionEvent));
        }
    }

    private boolean qualifiedMove(float[] fArr, float[] fArr2) {
        if (Math.abs(fArr2[0] - fArr[0]) > 0.1f || Math.abs(fArr2[1] - fArr[1]) > 0.1f) {
            return true;
        }
        return false;
    }

    private void onMove(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List list;
        boolean z;
        int i2 = i;
        PointerEvent.PointerEventState pointerEventState2 = pointerEventState;
        MotionEvent motionEvent2 = motionEvent;
        EventDispatcher eventDispatcher2 = eventDispatcher;
        int activePointerId = pointerEventState.getActivePointerId();
        List list2 = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
        if (map == null || !map.containsKey(Integer.valueOf(activePointerId))) {
            list = new ArrayList();
        } else {
            list = this.mLastHitPathByPointerId.get(Integer.valueOf(activePointerId));
        }
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i3 < Math.min(list2.size(), list.size()) && ((TouchTargetHelper.ViewTarget) list2.get((list2.size() - 1) - i3)).equals(list.get((list.size() - 1) - i3))) {
                View view = ((TouchTargetHelper.ViewTarget) list2.get((list2.size() - 1) - i3)).getView();
                if (!z3 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.ENTER_CAPTURE)) {
                    z3 = true;
                }
                if (!z2 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.LEAVE_CAPTURE)) {
                    z2 = true;
                }
                i3++;
            }
        }
        if (i3 >= Math.max(list2.size(), list.size())) {
            z = false;
        }
        if (z) {
            incrementCoalescingKey();
            if (list.size() > 0) {
                int viewId = ((TouchTargetHelper.ViewTarget) list.get(0)).getViewId();
                if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                    eventDispatcher2.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, viewId, pointerEventState2, motionEvent2));
                }
                List<TouchTargetHelper.ViewTarget> filterByShouldDispatch = filterByShouldDispatch(list.subList(0, list.size() - i3), PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, z2);
                if (filterByShouldDispatch.size() > 0) {
                    dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch, eventDispatcher);
                }
            }
            if (isAnyoneListeningForBubblingEvent(list2, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher2.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i2, pointerEventState2, motionEvent2));
            }
            List<TouchTargetHelper.ViewTarget> filterByShouldDispatch2 = filterByShouldDispatch(list2.subList(0, list2.size() - i3), PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, z3);
            if (filterByShouldDispatch2.size() > 0) {
                Collections.reverse(filterByShouldDispatch2);
                dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, filterByShouldDispatch2, eventDispatcher);
            }
        }
        if (isAnyoneListeningForBubblingEvent(list2, PointerEventHelper.EVENT.MOVE, PointerEventHelper.EVENT.MOVE_CAPTURE)) {
            eventDispatcher2.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_MOVE, i2, pointerEventState2, motionEvent2, getCoalescingKey()));
        }
    }

    private void dispatchCancelEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        Assertions.assertCondition(this.mChildHandlingNativeGesture == -1, "Expected to not have already sent a cancel for this gesture");
        dispatchCancelEvent(createEventState(motionEvent.getPointerId(motionEvent.getActionIndex()), motionEvent), motionEvent, eventDispatcher);
    }

    private void dispatchCancelEvent(PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        Assertions.assertCondition(this.mChildHandlingNativeGesture == -1, "Expected to not have already sent a cancel for this gesture");
        int activePointerId = pointerEventState.getActivePointerId();
        List list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        if (!list.isEmpty()) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.CANCEL, PointerEventHelper.EVENT.CANCEL_CAPTURE)) {
                ((EventDispatcher) Assertions.assertNotNull(eventDispatcher)).dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_CANCEL, ((TouchTargetHelper.ViewTarget) list.get(0)).getViewId(), pointerEventState, motionEvent));
            }
            dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch(list, PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, false), eventDispatcher);
            incrementCoalescingKey();
            this.mHoveringPointerIds.remove(Integer.valueOf(this.mPrimaryPointerId));
            this.mHoveringPointerIds.remove(Integer.valueOf(activePointerId));
            this.mPrimaryPointerId = -1;
        }
    }

    private void debugPrintHitPath(List<TouchTargetHelper.ViewTarget> list) {
        StringBuilder sb = new StringBuilder("hitPath: ");
        for (TouchTargetHelper.ViewTarget viewId : list) {
            sb.append(String.format("%d, ", new Object[]{Integer.valueOf(viewId.getViewId())}));
        }
        FLog.d(TAG, sb.toString());
    }
}
