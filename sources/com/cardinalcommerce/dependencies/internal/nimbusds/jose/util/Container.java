package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

public class Container<T> {
    public T init;

    public Container() {
    }

    public Container(T t) {
        this.init = t;
    }
}
