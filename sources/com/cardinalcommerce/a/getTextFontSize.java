package com.cardinalcommerce.a;

import java.security.AccessController;
import java.security.PrivilegedAction;

public final class getTextFontSize {
    private static String configure;

    static {
        try {
            configure = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                public final /* synthetic */ Object run() {
                    return System.getProperty("line.separator");
                }
            });
        } catch (Exception unused) {
            try {
                configure = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                configure = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        }
    }

    public static String Cardinal(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String Cardinal(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int cca_continue = getHeadingTextFontSize.cca_continue(bArr, cArr);
        if (cca_continue >= 0) {
            return new String(cArr, 0, cca_continue);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String cca_continue(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] configure(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String getInstance() {
        return configure;
    }

    public static String getInstance(byte[] bArr) {
        return new String(init(bArr));
    }

    private static char[] init(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }
}
