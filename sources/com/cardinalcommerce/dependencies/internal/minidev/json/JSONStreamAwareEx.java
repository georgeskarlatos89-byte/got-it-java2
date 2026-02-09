package com.cardinalcommerce.dependencies.internal.minidev.json;

import java.io.IOException;

public interface JSONStreamAwareEx extends JSONStreamAware {
    void writeJSONString(Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
