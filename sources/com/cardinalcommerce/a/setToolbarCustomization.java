package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStyle;
import java.io.IOException;

public interface setToolbarCustomization<T> {
    <E extends T> void getInstance(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
