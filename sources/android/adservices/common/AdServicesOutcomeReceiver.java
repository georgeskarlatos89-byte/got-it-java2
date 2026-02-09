package android.adservices.common;

import java.lang.Throwable;

public interface AdServicesOutcomeReceiver<R, E extends Throwable> {
    void onError(E e) {
    }

    void onResult(R r);
}
