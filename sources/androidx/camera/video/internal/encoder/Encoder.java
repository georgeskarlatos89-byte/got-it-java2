package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.camera.video.internal.BufferProvider;
import java.util.concurrent.Executor;

public interface Encoder {

    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    public interface EncoderInput {
    }

    public interface SurfaceInput extends EncoderInput {

        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(Surface surface);
        }

        void setOnSurfaceUpdateListener(Executor executor, OnSurfaceUpdateListener onSurfaceUpdateListener);
    }

    EncoderInput getInput();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(EncoderCallback encoderCallback, Executor executor);

    void start();

    void stop();

    void stop(long j);
}
