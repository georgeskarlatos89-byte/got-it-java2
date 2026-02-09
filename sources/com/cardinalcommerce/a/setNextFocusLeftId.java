package com.cardinalcommerce.a;

import java.security.Provider;
import java.security.SecureRandom;

public final class setNextFocusLeftId extends setNextFocusUpId {
    public Provider configure;
    public Provider getInstance;
    public Provider init;

    public setNextFocusLeftId() {
        this((Provider) null, (Provider) null, (Provider) null, (Provider) null, (SecureRandom) null);
    }

    private setNextFocusLeftId(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.init = provider2;
        this.configure = provider3;
        this.getInstance = provider4;
    }
}
