package androidx.camera.video;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.FileDescriptorOutputOptions;

final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long fileSizeLimit;
    private final ParcelFileDescriptor parcelFileDescriptor;

    private AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(ParcelFileDescriptor parcelFileDescriptor2, long j) {
        this.parcelFileDescriptor = parcelFileDescriptor2;
        this.fileSizeLimit = j;
    }

    /* access modifiers changed from: package-private */
    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    /* access modifiers changed from: package-private */
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "FileDescriptorOutputOptionsInternal{parcelFileDescriptor=" + this.parcelFileDescriptor + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal)) {
            return false;
        }
        FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal = (FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) obj;
        if (!this.parcelFileDescriptor.equals(fileDescriptorOutputOptionsInternal.getParcelFileDescriptor()) || this.fileSizeLimit != fileDescriptorOutputOptionsInternal.getFileSizeLimit()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((this.parcelFileDescriptor.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private Long fileSizeLimit;
        private ParcelFileDescriptor parcelFileDescriptor;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor2) {
            if (parcelFileDescriptor2 != null) {
                this.parcelFileDescriptor = parcelFileDescriptor2;
                return this;
            }
            throw new NullPointerException("Null parcelFileDescriptor");
        }

        /* access modifiers changed from: package-private */
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build() {
            String str = this.parcelFileDescriptor == null ? " parcelFileDescriptor" : "";
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (str.isEmpty()) {
                return new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(this.parcelFileDescriptor, this.fileSizeLimit.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
