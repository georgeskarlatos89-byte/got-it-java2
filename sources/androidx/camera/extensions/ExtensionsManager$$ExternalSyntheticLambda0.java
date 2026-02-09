package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.CameraProvider;
import androidx.camera.extensions.internal.VersionName;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ExtensionsManager$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ VersionName f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ CameraProvider f$2;

    public /* synthetic */ ExtensionsManager$$ExternalSyntheticLambda0(VersionName versionName, Context context, CameraProvider cameraProvider) {
        this.f$0 = versionName;
        this.f$1 = context;
        this.f$2 = cameraProvider;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ExtensionsManager.lambda$getInstanceAsync$0(this.f$0, this.f$1, this.f$2, completer);
    }
}
