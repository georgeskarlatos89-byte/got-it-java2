package com.mrousavy.camera.utils;

import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"byID", "Landroidx/camera/core/CameraSelector$Builder;", "cameraId", "", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraSelector+byID.kt */
public final class CameraSelector_byIDKt {
    public static final CameraSelector.Builder byID(CameraSelector.Builder builder, String str) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(str, "cameraId");
        CameraSelector.Builder addCameraFilter = builder.addCameraFilter(new CameraSelector_byIDKt$$ExternalSyntheticLambda0(str));
        Intrinsics.checkNotNullExpressionValue(addCameraFilter, "this.addCameraFilter { c…r false\n      }\n    }\n  }");
        return addCameraFilter;
    }

    /* access modifiers changed from: private */
    public static final List byID$lambda$1(String str, List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "$cameraId");
        Intrinsics.checkNotNullParameter(list, "cameras");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            try {
                Camera2CameraInfo from = Camera2CameraInfo.from((CameraInfo) next);
                Intrinsics.checkNotNullExpressionValue(from, "from(cameraInfoX)");
                z = Intrinsics.areEqual((Object) from.getCameraId(), (Object) str);
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
