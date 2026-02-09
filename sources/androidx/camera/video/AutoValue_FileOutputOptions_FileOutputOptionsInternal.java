package androidx.camera.video;

import androidx.camera.video.FileOutputOptions;
import java.io.File;

final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends FileOutputOptions.FileOutputOptionsInternal {
    private final File file;
    private final long fileSizeLimit;

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(File file2, long j) {
        this.file = file2;
        this.fileSizeLimit = j;
    }

    /* access modifiers changed from: package-private */
    public File getFile() {
        return this.file;
    }

    /* access modifiers changed from: package-private */
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "FileOutputOptionsInternal{file=" + this.file + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions.FileOutputOptionsInternal)) {
            return false;
        }
        FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (FileOutputOptions.FileOutputOptionsInternal) obj;
        if (!this.file.equals(fileOutputOptionsInternal.getFile()) || this.fileSizeLimit != fileOutputOptionsInternal.getFileSizeLimit()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((this.file.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends FileOutputOptions.FileOutputOptionsInternal.Builder {
        private File file;
        private Long fileSizeLimit;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public FileOutputOptions.FileOutputOptionsInternal.Builder setFile(File file2) {
            if (file2 != null) {
                this.file = file2;
                return this;
            }
            throw new NullPointerException("Null file");
        }

        /* access modifiers changed from: package-private */
        public FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public FileOutputOptions.FileOutputOptionsInternal build() {
            String str = this.file == null ? " file" : "";
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (str.isEmpty()) {
                return new AutoValue_FileOutputOptions_FileOutputOptionsInternal(this.file, this.fileSizeLimit.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
