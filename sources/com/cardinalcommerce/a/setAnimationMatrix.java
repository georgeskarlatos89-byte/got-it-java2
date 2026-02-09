package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.cardinalcommerce.a.setZ;

public class setAnimationMatrix extends TextView {
    private static int Cardinal = 0;
    private static int cca_continue = 1;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        int i = Cardinal;
        int i2 = i & 13;
        boolean z = true;
        int i3 = (((i ^ 13) | i2) << 1) - ((i | 13) & (~i2));
        cca_continue = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        int i = Cardinal;
        int i2 = ((i & -88) | ((~i) & 87)) + ((i & 87) << 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        int i = Cardinal;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        cca_continue = i2 % 128;
        if ((i2 % 2 == 0 ? '@' : 'O') != 'O') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public setAnimationMatrix(Context context) {
        super(context);
    }

    public setAnimationMatrix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setAnimationMatrix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = Cardinal;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        super.setText("", bufferType);
        int i4 = Cardinal + 73;
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
    }

    public CharSequence getText() {
        int i = Cardinal;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (i ^ 3) + ((i & 3) << 1);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    public void setCCAText(CharSequence charSequence) {
        int i = cca_continue;
        boolean z = true;
        int i2 = (((i | 122) << 1) - (i ^ 122)) - 1;
        Cardinal = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        super.setText(charSequence, TextView.BufferType.EDITABLE);
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setCCAOnClickListener(setZ.Cardinal cardinal) {
        int i = cca_continue;
        int i2 = i ^ 35;
        int i3 = ((((i & 35) | i2) << 1) - (~(-i2))) - 1;
        Cardinal = i3 % 128;
        char c = i3 % 2 != 0 ? ')' : 26;
        Throwable th = null;
        super.setOnClickListener(cardinal);
        if (c != ')') {
            int i4 = Cardinal;
            int i5 = i4 & 1;
            int i6 = (i5 - (~((i4 ^ 1) | i5))) - 1;
            cca_continue = i6 % 128;
            if ((i6 % 2 == 0 ? 19 : '3') != '3') {
                super.hashCode();
                throw th;
            }
            return;
        }
        throw th;
    }

    public void setCCAOnFocusChangeListener(setZ.cca_continue cca_continue2) {
        int i = ((cca_continue + 86) + 0) - 1;
        Cardinal = i % 128;
        int i2 = i % 2;
        super.setOnFocusChangeListener(cca_continue2);
        int i3 = Cardinal;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setCCAOnTouchListener(setZ.getInstance getinstance) {
        int i = cca_continue;
        boolean z = true;
        int i2 = (i ^ 105) + ((i & 105) << 1);
        Cardinal = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        super.setOnTouchListener(getinstance);
        if (!z) {
            throw null;
        }
    }
}
