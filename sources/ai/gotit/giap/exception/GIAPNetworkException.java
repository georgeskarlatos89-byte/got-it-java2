package ai.gotit.giap.exception;

public class GIAPNetworkException extends GIAPRuntimeException {
    public GIAPNetworkException(int i) {
        super("Request failed: " + i);
    }

    public GIAPNetworkException(int i, String str) {
        super("Request failed: " + i + " - " + str);
    }
}
