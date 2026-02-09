package com.mrousavy.camera.utils;

import android.util.Range;
import android.util.Size;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mrousavy/camera/utils/DeviceFormat;", "", "map", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;)V", "frameRateRanges", "", "Landroid/util/Range;", "", "getFrameRateRanges", "()Ljava/util/List;", "photoSize", "Landroid/util/Size;", "getPhotoSize", "()Landroid/util/Size;", "videoSize", "getVideoSize", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DeviceFormat.kt */
public final class DeviceFormat {
    private final List<Range<Integer>> frameRateRanges;
    private final Size photoSize;
    private final Size videoSize;

    public DeviceFormat(ReadableMap readableMap) {
        String str;
        Intrinsics.checkNotNullParameter(readableMap, "map");
        ReadableArray array = readableMap.getArray("frameRateRanges");
        Intrinsics.checkNotNull(array);
        ArrayList<Object> arrayList = array.toArrayList();
        Intrinsics.checkNotNullExpressionValue(arrayList, "map.getArray(\"frameRateRanges\")!!.toArrayList()");
        Iterable iterable = arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object next : iterable) {
            if (next instanceof HashMap) {
                Map map = (Map) next;
                arrayList2.add(DeviceFormatKt.rangeFactory(map.get("minFrameRate"), map.get("maxFrameRate")));
            } else {
                StringBuilder sb = new StringBuilder("DeviceFormat: frameRateRanges contained a Range that was not of type HashMap<*,*>! Actual Type: ");
                if (next != null) {
                    Intrinsics.checkNotNullExpressionValue(next, "range");
                    Class<?> cls = next.getClass();
                    if (cls != null) {
                        str = cls.getName();
                        throw new IllegalArgumentException(sb.append(str).toString());
                    }
                }
                str = null;
                throw new IllegalArgumentException(sb.append(str).toString());
            }
        }
        this.frameRateRanges = (List) arrayList2;
        this.photoSize = new Size(readableMap.getInt("photoWidth"), readableMap.getInt("photoHeight"));
        this.videoSize = new Size(readableMap.getInt("videoWidth"), readableMap.getInt("videoHeight"));
    }

    public final List<Range<Integer>> getFrameRateRanges() {
        return this.frameRateRanges;
    }

    public final Size getPhotoSize() {
        return this.photoSize;
    }

    public final Size getVideoSize() {
        return this.videoSize;
    }
}
