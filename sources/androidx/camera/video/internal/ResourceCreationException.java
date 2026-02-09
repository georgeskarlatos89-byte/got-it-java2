package androidx.camera.video.internal;

public class ResourceCreationException extends Exception {
    public ResourceCreationException(String str) {
        super(str);
    }

    public ResourceCreationException(String str, Throwable th) {
        super(str, th);
    }

    public ResourceCreationException(Throwable th) {
        super(th);
    }
}
