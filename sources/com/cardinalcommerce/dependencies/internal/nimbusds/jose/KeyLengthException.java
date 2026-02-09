package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setAutofillId;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;

public class KeyLengthException extends setAutofillId {
    private final setVerticalScrollbarTrackDrawable Cardinal;
    private final int configure;

    public KeyLengthException(String str) {
        super(str);
        this.configure = 0;
        this.Cardinal = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyLengthException(int i, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable) {
        super(new StringBuilder().append(i > 0 ? new StringBuilder("The expected key length is ").append(i).append(" bits").toString() : "Unexpected key length").append(setverticalscrollbartrackdrawable != null ? new StringBuilder(" (for ").append(setverticalscrollbartrackdrawable).append(" algorithm)").toString() : "").toString());
        this.configure = i;
        this.Cardinal = setverticalscrollbartrackdrawable;
    }
}
