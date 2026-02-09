package com.mrousavy.camera.utils;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0005"}, d2 = {"containsAny", "", "T", "", "elements", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: List+containsAny.kt */
public final class List_containsAnyKt {
    public static final <T> boolean containsAny(List<? extends T> list, List<? extends T> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "elements");
        Iterable<Object> iterable = list2;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object contains : iterable) {
            if (list.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
