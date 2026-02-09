package androidx.camera.video.internal;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AudioSource$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ AudioSource f$0;
    public final /* synthetic */ BufferProvider f$1;

    public /* synthetic */ AudioSource$$ExternalSyntheticLambda3(AudioSource audioSource, BufferProvider bufferProvider) {
        this.f$0 = audioSource;
        this.f$1 = bufferProvider;
    }

    public final void run() {
        this.f$0.m206lambda$setBufferProvider$0$androidxcameravideointernalAudioSource(this.f$1);
    }
}
