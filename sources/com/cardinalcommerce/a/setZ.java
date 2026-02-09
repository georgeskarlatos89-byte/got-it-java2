package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class setZ extends View {
    private static int Cardinal = 1;
    private static int init;

    public interface Cardinal extends View.OnClickListener {
    }

    public interface cca_continue extends View.OnFocusChangeListener {
    }

    interface configure extends View.OnScrollChangeListener {
    }

    interface getInstance extends View.OnTouchListener {
    }

    public final void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        int i = init;
        int i2 = i ^ 35;
        int i3 = (i & 35) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = init;
        int i2 = ((i ^ 13) - (~(-(-((i & 13) << 1))))) - 1;
        Cardinal = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 16 : 7) != 7) {
            int i3 = 12 / 0;
        }
    }

    public final void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = init;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        int i = init;
        int i2 = (i & 39) + (i | 39);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        int i = (init + 122) - 1;
        Cardinal = i % 128;
        int i2 = i % 2;
    }

    public final void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
        int i = init;
        int i2 = i & 77;
        int i3 = (i ^ 77) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        if (!(i4 % 2 != 0)) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        int i = init;
        int i2 = (((i | 43) << 1) - (~(-(((~i) & 43) | (i & -44))))) - 1;
        Cardinal = i2 % 128;
        if ((i2 % 2 == 0 ? 'E' : 6) != 6) {
            throw null;
        }
    }

    public final void setVisibility(int i) {
        int i2 = init;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        Cardinal = i3 % 128;
        int i4 = i3 % 2;
    }

    public setZ(Context context) {
        super(context);
    }

    public setZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void setCCAOnClickListener(Cardinal cardinal) {
        int i = init;
        int i2 = i & 21;
        int i3 = (i ^ 21) | i2;
        boolean z = true;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        Cardinal = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        super.setOnClickListener(cardinal);
        if (!z) {
            throw null;
        }
    }

    public final void setCCAVisibility(int i) {
        int i2 = Cardinal;
        int i3 = ((i2 & 27) - (~(-(-(i2 | 27))))) - 1;
        init = i3 % 128;
        int i4 = i3 % 2;
        super.setVisibility(i);
        int i5 = (Cardinal + 90) - 1;
        init = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCCAOnTouchListener(getInstance getinstance) {
        int i = init;
        int i2 = ((i & 91) - (~(i | 91))) - 1;
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        super.setOnTouchListener(getinstance);
        int i4 = Cardinal;
        int i5 = ((i4 ^ 24) + ((i4 & 24) << 1)) - 1;
        init = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
    }

    public final void setCCAOnFocusChangeListener(cca_continue cca_continue2) {
        int i = init;
        int i2 = i & 27;
        int i3 = -(-((i ^ 27) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
        super.setOnFocusChangeListener(cca_continue2);
        int i6 = Cardinal;
        int i7 = ((i6 ^ 53) | (i6 & 53)) << 1;
        int i8 = -(((~i6) & 53) | (i6 & -54));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        init = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public final void setCCAOnScrollChangeListener(configure configure2) {
        int i = Cardinal + 49;
        init = i % 128;
        int i2 = i % 2;
        super.setOnScrollChangeListener(configure2);
        int i3 = init + 106;
        int i4 = (i3 & -1) + (i3 | -1);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
    }
}
