package androidx.camera.video;

public abstract class OutputOptions {
    public static final int FILE_SIZE_UNLIMITED = 0;

    interface Builder<T extends OutputOptions, B> {
        T build();

        B setFileSizeLimit(long j);
    }

    public abstract long getFileSizeLimit();

    OutputOptions() {
    }
}
