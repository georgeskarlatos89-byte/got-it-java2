package com.mrousavy.camera.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"rangeFactory", "Landroid/util/Range;", "", "minFrameRate", "", "maxFrameRate", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DeviceFormat.kt */
public final class DeviceFormatKt {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r3 = r3.getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.Range<java.lang.Integer> rangeFactory(java.lang.Object r3, java.lang.Object r4) {
        /*
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0015
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r0.<init>(r3, r4)
            goto L_0x003d
        L_0x0015:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x003e
            android.util.Range r0 = new android.util.Range
            java.lang.Number r3 = (java.lang.Number) r3
            double r1 = r3.doubleValue()
            int r3 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r1 = r4.doubleValue()
            int r4 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r0.<init>(r3, r4)
        L_0x003d:
            return r0
        L_0x003e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DeviceFormat: frameRateRanges contained a Range that didn't have minFrameRate/maxFrameRate of types Int/Double! Actual Type: "
            r1.<init>(r2)
            r2 = 0
            if (r3 == 0) goto L_0x0055
            java.lang.Class r3 = r3.getClass()
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r3.getName()
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " & "
            java.lang.StringBuilder r3 = r3.append(r1)
            if (r4 == 0) goto L_0x006c
            java.lang.Class r4 = r4.getClass()
            if (r4 == 0) goto L_0x006c
            java.lang.String r2 = r4.getName()
        L_0x006c:
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.utils.DeviceFormatKt.rangeFactory(java.lang.Object, java.lang.Object):android.util.Range");
    }
}
