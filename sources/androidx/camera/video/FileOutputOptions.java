package androidx.camera.video;

import androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
import java.io.File;

public final class FileOutputOptions extends OutputOptions {
    private final FileOutputOptionsInternal mFileOutputOptionsInternal;

    FileOutputOptions(FileOutputOptionsInternal fileOutputOptionsInternal) {
        Preconditions.checkNotNull(fileOutputOptionsInternal, "FileOutputOptionsInternal can't be null.");
        this.mFileOutputOptionsInternal = fileOutputOptionsInternal;
    }

    public File getFile() {
        return this.mFileOutputOptionsInternal.getFile();
    }

    public long getFileSizeLimit() {
        return this.mFileOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mFileOutputOptionsInternal.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions)) {
            return false;
        }
        return this.mFileOutputOptionsInternal.equals(((FileOutputOptions) obj).mFileOutputOptionsInternal);
    }

    public int hashCode() {
        return this.mFileOutputOptionsInternal.hashCode();
    }

    public static final class Builder implements OutputOptions.Builder<FileOutputOptions, Builder> {
        private final FileOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(File file) {
            FileOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_FileOutputOptions_FileOutputOptionsInternal.Builder().setFileSizeLimit(0);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(file, "File can't be null.");
            fileSizeLimit.setFile(file);
        }

        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        public FileOutputOptions build() {
            return new FileOutputOptions(this.mInternalBuilder.build());
        }
    }

    static abstract class FileOutputOptionsInternal {
        /* access modifiers changed from: package-private */
        public abstract File getFile();

        /* access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();

        FileOutputOptionsInternal() {
        }

        static abstract class Builder {
            /* access modifiers changed from: package-private */
            public abstract FileOutputOptionsInternal build();

            /* access modifiers changed from: package-private */
            public abstract Builder setFile(File file);

            /* access modifiers changed from: package-private */
            public abstract Builder setFileSizeLimit(long j);

            Builder() {
            }
        }
    }
}
