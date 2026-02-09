package com.braintreepayments.cardform.utils;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Arrays;

public class CardNumberTransformation implements TransformationMethod {
    private static final String FOUR_DOTS = "••••";

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence.length() < 9) {
            return charSequence;
        }
        StringBuilder append = new StringBuilder().append("•••• ").append(charSequence.subSequence(charSequence.length() - 4, charSequence.length()));
        char[] cArr = new char[(charSequence.length() - append.length())];
        Arrays.fill(cArr, 0);
        append.insert(0, cArr);
        return append.toString();
    }
}
