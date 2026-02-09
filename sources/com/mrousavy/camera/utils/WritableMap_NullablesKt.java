package com.mrousavy.camera.utils;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"putBoolean", "", "Lcom/facebook/react/bridge/WritableMap;", "key", "", "value", "", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Boolean;)V", "putDouble", "", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V", "putInt", "", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WritableMap+Nullables.kt */
public final class WritableMap_NullablesKt {
    public static final void putInt(WritableMap writableMap, String str, Integer num) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        if (num == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putInt(str, num.intValue());
        }
    }

    public static final void putDouble(WritableMap writableMap, String str, Double d) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        if (d == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putDouble(str, d.doubleValue());
        }
    }

    public static final void putBoolean(WritableMap writableMap, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        if (bool == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putBoolean(str, bool.booleanValue());
        }
    }
}
