package androidx.camera.core.internal.compat.workaround;

import android.media.MediaCodec;
import androidx.camera.core.Preview;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.List;

public class SurfaceSorter {
    private static final int PRIORITY_MEDIA_CODEC_SURFACE = 2;
    private static final int PRIORITY_OTHERS = 1;
    private static final int PRIORITY_PREVIEW_SURFACE = 0;
    private final boolean mHasQuirk;

    public SurfaceSorter() {
        this.mHasQuirk = DeviceQuirks.get(SurfaceOrderQuirk.class) != null;
    }

    public void sort(List<DeferrableSurface> list) {
        if (this.mHasQuirk) {
            Collections.sort(list, new SurfaceSorter$$ExternalSyntheticLambda0(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$sort$0$androidx-camera-core-internal-compat-workaround-SurfaceSorter  reason: not valid java name */
    public /* synthetic */ int m175lambda$sort$0$androidxcameracoreinternalcompatworkaroundSurfaceSorter(DeferrableSurface deferrableSurface, DeferrableSurface deferrableSurface2) {
        return getSurfacePriority(deferrableSurface) - getSurfacePriority(deferrableSurface2);
    }

    private int getSurfacePriority(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == MediaCodec.class || deferrableSurface.getContainerClass() == VideoCapture.class) {
            return 2;
        }
        return deferrableSurface.getContainerClass() == Preview.class ? 0 : 1;
    }
}
