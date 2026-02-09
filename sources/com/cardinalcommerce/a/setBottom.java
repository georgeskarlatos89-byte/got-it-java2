package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.webkit.ProxyConfig;
import com.cardinalcommerce.a.setZ;

public class setBottom extends Button {
    private static int Cardinal = 1;
    private static int init;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        int i = Cardinal;
        int i2 = (i & -126) | ((~i) & 125);
        int i3 = (i & 125) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        init = i4 % 128;
        if (i4 % 2 != 0) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        int i = Cardinal;
        int i2 = i & 123;
        int i3 = (i ^ 123) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        init = i4 % 128;
        if ((i4 % 2 != 0 ? 31 : 'M') == 31) {
            throw null;
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        int i = init;
        int i2 = (i & 91) + (i | 91);
        Cardinal = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = init;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setVisibility(int i) {
        int i2 = init;
        boolean z = true;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        Cardinal = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (z) {
            int i4 = 93 / 0;
        }
    }

    public setBottom(Context context) {
        super(context);
    }

    public setBottom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setBottom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CharSequence getText() {
        int i = Cardinal;
        int i2 = (i & 27) + (i | 27);
        init = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (i + 102) - 1;
        init = i4 % 128;
        int i5 = i4 % 2;
        return ProxyConfig.MATCH_ALL_SCHEMES;
    }

    public void setCCAOnClickListener(setZ.Cardinal cardinal) {
        int i = Cardinal;
        int i2 = i & 99;
        int i3 = (i | 99) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        init = i5 % 128;
        char c = i5 % 2 != 0 ? 30 : 'W';
        super.setOnClickListener(cardinal);
        if (c != 30) {
            int i6 = Cardinal;
            int i7 = (i6 ^ 31) + ((i6 & 31) << 1);
            init = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        throw null;
    }

    public void setCCAText(CharSequence charSequence) {
        int i = Cardinal;
        int i2 = i ^ 111;
        int i3 = ((i & 111) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        init = i5 % 128;
        if (i5 % 2 == 0) {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
            return;
        }
        super.setText(charSequence, TextView.BufferType.EDITABLE);
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public void setCCAOnTouchListener(setZ.getInstance getinstance) {
        int i = init;
        int i2 = (i & 31) + (i | 31);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        super.setOnTouchListener(getinstance);
        int i4 = Cardinal;
        int i5 = i4 & 31;
        boolean z = true;
        int i6 = ((((i4 ^ 31) | i5) << 1) - (~(-((i4 | 31) & (~i5))))) - 1;
        init = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setCCAOnFocusChangeListener(setZ.cca_continue cca_continue) {
        int i = Cardinal;
        int i2 = i & 61;
        int i3 = ((i ^ 61) | i2) << 1;
        int i4 = -((i | 61) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        init = i5 % 128;
        char c = i5 % 2 != 0 ? '*' : 'b';
        super.setOnFocusChangeListener(cca_continue);
        if (c != 'b') {
            int i6 = 98 / 0;
        }
    }

    public void setCCAVisibility(int i) {
        int i2 = Cardinal;
        int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
        init = i3 % 128;
        int i4 = i3 % 2;
        super.setVisibility(i);
        int i5 = Cardinal;
        int i6 = ((i5 & -112) | ((~i5) & 111)) + ((i5 & 111) << 1);
        init = i6 % 128;
        int i7 = i6 % 2;
    }
}
