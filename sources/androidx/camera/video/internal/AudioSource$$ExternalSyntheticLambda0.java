package androidx.camera.video.internal;

import androidx.camera.video.internal.AudioSource;
import java.util.concurrent.Executor;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AudioSource$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ AudioSource f$0;
    public final /* synthetic */ Executor f$1;
    public final /* synthetic */ AudioSource.AudioSourceCallback f$2;

    public /* synthetic */ AudioSource$$ExternalSyntheticLambda0(AudioSource audioSource, Executor executor, AudioSource.AudioSourceCallback audioSourceCallback) {
        this.f$0 = audioSource;
        this.f$1 = executor;
        this.f$2 = audioSourceCallback;
    }

    public final void run() {
        this.f$0.m205lambda$setAudioSourceCallback$4$androidxcameravideointernalAudioSource(this.f$1, this.f$2);
    }
}
