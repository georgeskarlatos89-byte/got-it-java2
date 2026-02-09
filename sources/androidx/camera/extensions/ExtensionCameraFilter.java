package androidx.camera.extensions;

import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Identifier;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class ExtensionCameraFilter implements CameraFilter {
    private final Identifier mId;
    private final VendorExtender mVendorExtender;

    ExtensionCameraFilter(String str, VendorExtender vendorExtender) {
        this.mId = Identifier.create(str);
        this.mVendorExtender = vendorExtender;
    }

    public Identifier getIdentifier() {
        return this.mId;
    }

    public List<CameraInfo> filter(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CameraInfo next : list) {
            Preconditions.checkArgument(next instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (this.mVendorExtender.isExtensionAvailable(Camera2CameraInfo.from(next).getCameraId(), Camera2CameraInfo.from(next).getCameraCharacteristicsMap())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
