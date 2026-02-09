package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.camera.video.MediaStoreOutputOptions;

final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final Uri collectionUri;
    private final ContentResolver contentResolver;
    private final ContentValues contentValues;
    private final long fileSizeLimit;

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(ContentResolver contentResolver2, Uri uri, ContentValues contentValues2, long j) {
        this.contentResolver = contentResolver2;
        this.collectionUri = uri;
        this.contentValues = contentValues2;
        this.fileSizeLimit = j;
    }

    /* access modifiers changed from: package-private */
    public ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    /* access modifiers changed from: package-private */
    public Uri getCollectionUri() {
        return this.collectionUri;
    }

    /* access modifiers changed from: package-private */
    public ContentValues getContentValues() {
        return this.contentValues;
    }

    /* access modifiers changed from: package-private */
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "MediaStoreOutputOptionsInternal{contentResolver=" + this.contentResolver + ", collectionUri=" + this.collectionUri + ", contentValues=" + this.contentValues + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions.MediaStoreOutputOptionsInternal)) {
            return false;
        }
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal = (MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) obj;
        if (!this.contentResolver.equals(mediaStoreOutputOptionsInternal.getContentResolver()) || !this.collectionUri.equals(mediaStoreOutputOptionsInternal.getCollectionUri()) || !this.contentValues.equals(mediaStoreOutputOptionsInternal.getContentValues()) || this.fileSizeLimit != mediaStoreOutputOptionsInternal.getFileSizeLimit()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((((((this.contentResolver.hashCode() ^ 1000003) * 1000003) ^ this.collectionUri.hashCode()) * 1000003) ^ this.contentValues.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private Uri collectionUri;
        private ContentResolver contentResolver;
        private ContentValues contentValues;
        private Long fileSizeLimit;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(ContentResolver contentResolver2) {
            if (contentResolver2 != null) {
                this.contentResolver = contentResolver2;
                return this;
            }
            throw new NullPointerException("Null contentResolver");
        }

        /* access modifiers changed from: package-private */
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(Uri uri) {
            if (uri != null) {
                this.collectionUri = uri;
                return this;
            }
            throw new NullPointerException("Null collectionUri");
        }

        /* access modifiers changed from: package-private */
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(ContentValues contentValues2) {
            if (contentValues2 != null) {
                this.contentValues = contentValues2;
                return this;
            }
            throw new NullPointerException("Null contentValues");
        }

        /* access modifiers changed from: package-private */
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build() {
            String str = this.contentResolver == null ? " contentResolver" : "";
            if (this.collectionUri == null) {
                str = str + " collectionUri";
            }
            if (this.contentValues == null) {
                str = str + " contentValues";
            }
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (str.isEmpty()) {
                return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(this.contentResolver, this.collectionUri, this.contentValues, this.fileSizeLimit.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
