package com.cardinalcommerce.a;

import com.cardinalcommerce.emvco.events.ThreeDSEvent;

public interface setEnabled extends setScreenReaderFocusable {
    void init(String str, ThreeDSEvent threeDSEvent);
}
