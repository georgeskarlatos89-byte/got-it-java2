package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

public final class MediaStoreOutputOptions extends OutputOptions {
    public static final ContentValues EMPTY_CONTENT_VALUES = new ContentValues();
    private final MediaStoreOutputOptionsInternal mMediaStoreOutputOptionsInternal;

    MediaStoreOutputOptions(MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal) {
        Preconditions.checkNotNull(mediaStoreOutputOptionsInternal, "MediaStoreOutputOptionsInternal can't be null.");
        this.mMediaStoreOutputOptionsInternal = mediaStoreOutputOptionsInternal;
    }

    public ContentResolver getContentResolver() {
        return this.mMediaStoreOutputOptionsInternal.getContentResolver();
    }

    public Uri getCollectionUri() {
        return this.mMediaStoreOutputOptionsInternal.getCollectionUri();
    }

    public ContentValues getContentValues() {
        return this.mMediaStoreOutputOptionsInternal.getContentValues();
    }

    public long getFileSizeLimit() {
        return this.mMediaStoreOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mMediaStoreOutputOptionsInternal.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions)) {
            return false;
        }
        return this.mMediaStoreOutputOptionsInternal.equals(((MediaStoreOutputOptions) obj).mMediaStoreOutputOptionsInternal);
    }

    public int hashCode() {
        return this.mMediaStoreOutputOptionsInternal.hashCode();
    }

    public static final class Builder implements OutputOptions.Builder<MediaStoreOutputOptions, Builder> {
        private final MediaStoreOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ContentResolver contentResolver, Uri uri) {
            MediaStoreOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.Builder().setContentValues(MediaStoreOutputOptions.EMPTY_CONTENT_VALUES).setFileSizeLimit(0);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            fileSizeLimit.setContentResolver(contentResolver).setCollectionUri(uri);
        }

        public Builder setContentValues(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.mInternalBuilder.setContentValues(contentValues);
            return this;
        }

        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        public MediaStoreOutputOptions build() {
            return new MediaStoreOutputOptions(this.mInternalBuilder.build());
        }
    }

    static abstract class MediaStoreOutputOptionsInternal {
        /* access modifiers changed from: package-private */
        public abstract Uri getCollectionUri();

        /* access modifiers changed from: package-private */
        public abstract ContentResolver getContentResolver();

        /* access modifiers changed from: package-private */
        public abstract ContentValues getContentValues();

        /* access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();

        MediaStoreOutputOptionsInternal() {
        }

        static abstract class Builder {
            /* access modifiers changed from: package-private */
            public abstract MediaStoreOutputOptionsInternal build();

            /* access modifiers changed from: package-private */
            public abstract Builder setCollectionUri(Uri uri);

            /* access modifiers changed from: package-private */
            public abstract Builder setContentResolver(ContentResolver contentResolver);

            /* access modifiers changed from: package-private */
            public abstract Builder setContentValues(ContentValues contentValues);

            /* access modifiers changed from: package-private */
            public abstract Builder setFileSizeLimit(long j);

            Builder() {
            }
        }
    }
}
