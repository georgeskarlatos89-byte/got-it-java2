package com.cardinalcommerce.a;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class setHorizontalScrollbarThumbDrawable<T> extends setVerticalScrollbarThumbDrawable<T> {
    public Map<String, String> cca_continue = new HashMap();
    private setVerticalScrollbarThumbDrawable<T> configure;

    public setHorizontalScrollbarThumbDrawable(setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) {
        super(setverticalscrollbarthumbdrawable.valueOf);
        this.configure = setverticalscrollbarthumbdrawable;
    }

    public final Object getInstance() {
        return this.configure.getInstance();
    }

    public final void getInstance(Object obj, String str, Object obj2) throws getToolbarCustomization, IOException {
        String str2 = this.cca_continue.get(str);
        if (str2 != null) {
            str = str2;
        }
        this.configure.getInstance(obj, str, obj2);
    }

    public final Object getInstance(Object obj, String str) {
        String str2 = this.cca_continue.get(str);
        if (str2 != null) {
            str = str2;
        }
        return this.configure.getInstance(obj, str);
    }

    public final Type cca_continue(String str) {
        String str2 = this.cca_continue.get(str);
        if (str2 != null) {
            str = str2;
        }
        return this.configure.cca_continue(str);
    }

    public final setVerticalScrollbarThumbDrawable<?> configure(String str) throws getToolbarCustomization, IOException {
        String str2 = this.cca_continue.get(str);
        if (str2 != null) {
            str = str2;
        }
        return this.configure.configure(str);
    }

    public final setVerticalScrollbarThumbDrawable<?> init(String str) throws getToolbarCustomization, IOException {
        String str2 = this.cca_continue.get(str);
        if (str2 != null) {
            str = str2;
        }
        return this.configure.init(str);
    }
}
