package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mrousavy/camera/TemporaryFile;", "", "path", "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+RecordVideo.kt */
public final class TemporaryFile {
    private final String path;

    public static /* synthetic */ TemporaryFile copy$default(TemporaryFile temporaryFile, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = temporaryFile.path;
        }
        return temporaryFile.copy(str);
    }

    public final String component1() {
        return this.path;
    }

    public final TemporaryFile copy(String str) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        return new TemporaryFile(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemporaryFile) && Intrinsics.areEqual((Object) this.path, (Object) ((TemporaryFile) obj).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "TemporaryFile(path=" + this.path + ')';
    }

    public TemporaryFile(String str) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        this.path = str;
    }

    public final String getPath() {
        return this.path;
    }
}
