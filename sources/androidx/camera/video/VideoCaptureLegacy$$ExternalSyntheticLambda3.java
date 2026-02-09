package androidx.camera.video;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$$ExternalSyntheticLambda3 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ AtomicReference f$0;

    public /* synthetic */ VideoCaptureLegacy$$ExternalSyntheticLambda3(AtomicReference atomicReference) {
        this.f$0 = atomicReference;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f$0.set(completer);
    }
}
