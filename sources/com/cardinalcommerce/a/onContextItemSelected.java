package com.cardinalcommerce.a;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class onContextItemSelected<T> extends setVerticalScrollbarThumbDrawable<T> {
    private T Cardinal;
    private setVerticalScrollbarThumbDrawable<?> getInstance;

    public onContextItemSelected(setFadingEdgeLength setfadingedgelength, T t) {
        super(setfadingedgelength);
        if (t != null) {
            this.Cardinal = t;
            this.getInstance = setfadingedgelength.configure(t.getClass());
            return;
        }
        throw new NullPointerException("can not update null Object");
    }

    private onContextItemSelected(setFadingEdgeLength setfadingedgelength, T t, Type type) {
        super(setfadingedgelength);
        setVerticalScrollbarThumbDrawable<?> setverticalscrollbarthumbdrawable;
        if (t != null) {
            this.Cardinal = t;
            if (type instanceof ParameterizedType) {
                setverticalscrollbarthumbdrawable = setfadingedgelength.getInstance((ParameterizedType) type);
            } else {
                setverticalscrollbarthumbdrawable = setfadingedgelength.configure((Class) type);
            }
            this.getInstance = setverticalscrollbarthumbdrawable;
            return;
        }
        throw new NullPointerException("can not update null Object");
    }

    public final setVerticalScrollbarThumbDrawable<?> init(String str) throws getToolbarCustomization, IOException {
        Object instance = this.getInstance.getInstance(this.Cardinal, str);
        if (instance == null) {
            return this.getInstance.init(str);
        }
        return new onContextItemSelected(this.valueOf, instance, this.getInstance.cca_continue(str));
    }

    public final setVerticalScrollbarThumbDrawable<?> configure(String str) throws getToolbarCustomization, IOException {
        return this.getInstance.configure(str);
    }

    public final void getInstance(Object obj, String str, Object obj2) throws getToolbarCustomization, IOException {
        this.getInstance.getInstance(obj, str, obj2);
    }

    public final void Cardinal(Object obj, Object obj2) throws getToolbarCustomization, IOException {
        this.getInstance.Cardinal(obj, obj2);
    }

    public final Object getInstance() {
        T t = this.Cardinal;
        if (t != null) {
            return t;
        }
        return this.getInstance.getInstance();
    }

    public final Object cca_continue() {
        T t = this.Cardinal;
        if (t != null) {
            return t;
        }
        return this.getInstance.cca_continue();
    }

    public final T init(Object obj) {
        T t = this.Cardinal;
        if (t != null) {
            return t;
        }
        return this.getInstance.init(obj);
    }
}
