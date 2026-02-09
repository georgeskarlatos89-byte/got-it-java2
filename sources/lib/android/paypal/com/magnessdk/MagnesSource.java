package lib.android.paypal.com.magnessdk;

public enum MagnesSource {
    DEFAULT(19),
    PAYPAL(10),
    EBAY(11),
    BRAINTREE(12),
    SIMILITY(17),
    VENMO(18);
    
    private int version;

    private MagnesSource(int i) {
        this.version = i;
    }

    public int getVersion() {
        return this.version;
    }
}
