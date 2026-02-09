package com.mrousavy.camera.utils;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.mrousavy.camera.parsers.Size_easyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0006\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Size35mm", "Landroid/util/Size;", "getSize35mm", "()Landroid/util/Size;", "getDeviceTypes", "Lcom/facebook/react/bridge/ReadableArray;", "Landroid/hardware/camera2/CameraCharacteristics;", "getFieldOfView", "", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraCharacteristicsUtils.kt */
public final class CameraCharacteristicsUtilsKt {
    private static final Size Size35mm = new Size(36, 24);

    public static final Size getSize35mm() {
        return Size35mm;
    }

    public static final ReadableArray getDeviceTypes(CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        Intrinsics.checkNotNull(obj);
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Intrinsics.checkNotNull(obj2);
        float bigger = ((float) Size_easyKt.getBigger(Size35mm)) / Size_easyKt.getBigger((SizeF) obj2);
        WritableArray createArray = Arguments.createArray();
        for (float f : (float[]) obj) {
            float f2 = f * bigger;
            if (f2 < 24.0f) {
                createArray.pushString("ultra-wide-angle-camera");
            } else {
                if (24.0f <= f2 && f2 <= 43.0f) {
                    createArray.pushString("wide-angle-camera");
                } else if (f2 > 43.0f) {
                    createArray.pushString("telephoto-camera");
                } else {
                    throw new Error("Invalid focal length! (" + f + "mm)");
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(createArray, "deviceTypes");
        return createArray;
    }

    public static final double getFieldOfView(CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        Intrinsics.checkNotNull(obj);
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Intrinsics.checkNotNull(obj2);
        float f = (float) 2;
        return ((double) (f * ((float) Math.atan((double) (Size_easyKt.getBigger((SizeF) obj2) / (((float[]) obj)[0] * f)))))) * 57.29577951308232d;
    }
}
