package com.mrousavy.camera.utils;

import com.facebook.react.bridge.WritableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"pushBoolean", "", "Lcom/facebook/react/bridge/WritableArray;", "value", "", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Boolean;)V", "pushDouble", "", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Double;)V", "pushInt", "", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Integer;)V", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WritableArray+Nullables.kt */
public final class WritableArray_NullablesKt {
    public static final void pushInt(WritableArray writableArray, Integer num) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (num == null) {
            writableArray.pushNull();
        } else {
            writableArray.pushInt(num.intValue());
        }
    }

    public static final void pushDouble(WritableArray writableArray, Double d) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (d == null) {
            writableArray.pushNull();
        } else {
            writableArray.pushDouble(d.doubleValue());
        }
    }

    public static final void pushBoolean(WritableArray writableArray, Boolean bool) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (bool == null) {
            writableArray.pushNull();
        } else {
            writableArray.pushBoolean(bool.booleanValue());
        }
    }
}
