package com.cardinalcommerce.a;

import java.util.List;
import java.util.Map;

public final class registerForContextMenu<T> extends setVerticalScrollbarThumbDrawable<T> {
    private Class<T> cca_continue;

    public final setVerticalScrollbarThumbDrawable<T> configure(String str) {
        return this;
    }

    public final setVerticalScrollbarThumbDrawable<T> init(String str) {
        return this;
    }

    public registerForContextMenu(setFadingEdgeLength setfadingedgelength, Class<T> cls) {
        super(setfadingedgelength);
        this.cca_continue = cls;
    }

    public final Object getInstance() {
        try {
            return this.cca_continue.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object cca_continue() {
        try {
            return this.cca_continue.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void getInstance(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    public final void Cardinal(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }
}
