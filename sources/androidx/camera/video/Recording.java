package androidx.camera.video;

import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsStopped;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    Recording(Recorder recorder, long j, OutputOptions outputOptions, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsStopped = atomicBoolean;
        CloseGuardHelper create = CloseGuardHelper.create();
        this.mCloseGuard = create;
        this.mRecorder = recorder;
        this.mRecordingId = j;
        this.mOutputOptions = outputOptions;
        if (z) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    static Recording from(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j, pendingRecording.getOutputOptions(), false);
    }

    static Recording createFinalizedFrom(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j, pendingRecording.getOutputOptions(), true);
    }

    /* access modifiers changed from: package-private */
    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public void pause() {
        if (!this.mIsStopped.get()) {
            this.mRecorder.pause(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void resume() {
        if (!this.mIsStopped.get()) {
            this.mRecorder.resume(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void stop() {
        this.mCloseGuard.close();
        if (!this.mIsStopped.getAndSet(true)) {
            this.mRecorder.stop(this);
        }
    }

    public void close() {
        stop();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stop();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public long getRecordingId() {
        return this.mRecordingId;
    }
}
