package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;

public interface VideoOutput {

    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void onSourceStateChanged(SourceState sourceState) {
    }

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    Observable<StreamInfo> getStreamInfo() {
        return StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
    }

    Observable<MediaSpec> getMediaSpec() {
        return ConstantObservable.withValue(null);
    }
}
