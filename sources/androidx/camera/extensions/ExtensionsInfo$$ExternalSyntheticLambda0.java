package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.Identifier;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ExtensionsInfo$$ExternalSyntheticLambda0 implements CameraConfigProvider {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Identifier f$1;

    public /* synthetic */ ExtensionsInfo$$ExternalSyntheticLambda0(int i, Identifier identifier) {
        this.f$0 = i;
        this.f$1 = identifier;
    }

    public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
        return ExtensionsInfo.lambda$injectExtensionCameraConfig$0(this.f$0, this.f$1, cameraInfo, context);
    }
}
