package androidx.camera.video;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

public final class FileDescriptorOutputOptions extends OutputOptions {
    private final FileDescriptorOutputOptionsInternal mFileDescriptorOutputOptionsInternal;

    FileDescriptorOutputOptions(FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal) {
        Preconditions.checkNotNull(fileDescriptorOutputOptionsInternal, "FileDescriptorOutputOptionsInternal can't be null.");
        this.mFileDescriptorOutputOptionsInternal = fileDescriptorOutputOptionsInternal;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.mFileDescriptorOutputOptionsInternal.getParcelFileDescriptor();
    }

    public long getFileSizeLimit() {
        return this.mFileDescriptorOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mFileDescriptorOutputOptionsInternal.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions)) {
            return false;
        }
        return this.mFileDescriptorOutputOptionsInternal.equals(((FileDescriptorOutputOptions) obj).mFileDescriptorOutputOptionsInternal);
    }

    public int hashCode() {
        return this.mFileDescriptorOutputOptionsInternal.hashCode();
    }

    public static final class Builder implements OutputOptions.Builder<FileDescriptorOutputOptions, Builder> {
        private final FileDescriptorOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ParcelFileDescriptor parcelFileDescriptor) {
            FileDescriptorOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.Builder().setFileSizeLimit(0);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            fileSizeLimit.setParcelFileDescriptor(parcelFileDescriptor);
        }

        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        public FileDescriptorOutputOptions build() {
            return new FileDescriptorOutputOptions(this.mInternalBuilder.build());
        }
    }

    static abstract class FileDescriptorOutputOptionsInternal {
        /* access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();

        /* access modifiers changed from: package-private */
        public abstract ParcelFileDescriptor getParcelFileDescriptor();

        FileDescriptorOutputOptionsInternal() {
        }

        static abstract class Builder {
            /* access modifiers changed from: package-private */
            public abstract FileDescriptorOutputOptionsInternal build();

            /* access modifiers changed from: package-private */
            public abstract Builder setFileSizeLimit(long j);

            /* access modifiers changed from: package-private */
            public abstract Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor);

            Builder() {
            }
        }
    }
}
