package com.cardinalcommerce.a;

import java.io.BufferedWriter;
import java.io.Writer;

public final class getBorderColor extends BufferedWriter {
    public char[] Cardinal = new char[64];
    private final int getInstance;

    public getBorderColor(Writer writer) {
        super(writer);
        String instance = getTextFontSize.getInstance();
        this.getInstance = instance != null ? instance.length() : 2;
    }
}
