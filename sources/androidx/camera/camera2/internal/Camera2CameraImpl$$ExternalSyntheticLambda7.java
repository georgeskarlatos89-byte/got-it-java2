package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ Camera2CameraImpl f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ SessionConfig f$2;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda7(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig) {
        this.f$0 = camera2CameraImpl;
        this.f$1 = str;
        this.f$2 = sessionConfig;
    }

    public final void run() {
        this.f$0.m39lambda$onUseCaseReset$8$androidxcameracamera2internalCamera2CameraImpl(this.f$1, this.f$2);
    }
}
