package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStyle;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;
import java.io.IOException;

public final class setButtonCustomization implements setToolbarCustomization<Object> {
    public final <E> void getInstance(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        jSONStyle.arrayStart(appendable);
        boolean z = false;
        for (Object obj : (Object[]) e) {
            if (z) {
                jSONStyle.objectNext(appendable);
            } else {
                z = true;
            }
            JSONValue.writeJSONString(obj, appendable, jSONStyle);
        }
        jSONStyle.arrayStop(appendable);
    }
}
