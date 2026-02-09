package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.webkit.ProxyConfig;
import com.cardinalcommerce.a.setZ;
import com.cardinalcommerce.cardinalmobilesdk.R;

public final class setRight extends CompoundButton {
    private static int Cardinal = 0;
    private static int configure = 1;
    private int cca_continue;

    interface cca_continue extends CompoundButton.OnCheckedChangeListener {
    }

    public final void setButtonDrawable(int i) {
        int i2 = configure;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        Cardinal = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setElevation(float f) {
        boolean z = true;
        int i = (configure + 54) - 1;
        Cardinal = i % 128;
        if (i % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    public final void setId(int i) {
        int i2 = (configure + 24) - 1;
        Cardinal = i2 % 128;
        if ((i2 % 2 != 0 ? 'P' : 'T') == 'P') {
            int i3 = 18 / 0;
        }
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i = configure;
        int i2 = i & 83;
        int i3 = i2 + ((i ^ 83) | i2);
        Cardinal = i3 % 128;
        if ((i3 % 2 != 0 ? 'Z' : 19) != 19) {
            throw null;
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        int i = configure;
        int i2 = i ^ 97;
        int i3 = (i & 97) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = (configure + 25) - 1;
        int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
        Cardinal = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ void cca_continue(setRight setright) {
        int i = configure + 20;
        int i2 = (i & -1) + (i | -1);
        Cardinal = i2 % 128;
        char c = i2 % 2 != 0 ? 'a' : 14;
        setright.Cardinal();
        if (c != 'a') {
            int i3 = configure;
            int i4 = i3 & 83;
            int i5 = (i4 - (~((i3 ^ 83) | i4))) - 1;
            Cardinal = i5 % 128;
            if ((i5 % 2 != 0 ? 'c' : 16) != 16) {
                int i6 = 91 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    static /* synthetic */ int configure(setRight setright, int i) {
        int i2 = configure;
        int i3 = (i2 + 12) - 1;
        Cardinal = i3 % 128;
        boolean z = i3 % 2 == 0;
        setright.cca_continue = i;
        if (z) {
            int i4 = i2 & 63;
            int i5 = (i4 - (~((i2 ^ 63) | i4))) - 1;
            Cardinal = i5 % 128;
            int i6 = i5 % 2;
            return i;
        }
        throw null;
    }

    static /* synthetic */ int init(setRight setright) {
        int i = (configure + 88) - 1;
        Cardinal = i % 128;
        boolean z = i % 2 != 0;
        int i2 = setright.cca_continue;
        if (z) {
            int i3 = 90 / 0;
        }
        return i2;
    }

    public setRight(Context context) {
        super(context);
        getInstance();
    }

    public setRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getInstance();
    }

    public setRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getInstance();
    }

    private void getInstance() {
        this.cca_continue = 0;
        Cardinal();
        setCCAOnCheckedChangeListener(new cca_continue() {
            private static int configure = 1;
            private static int getInstance;

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = getInstance;
                int i2 = i & 107;
                int i3 = -(-((i ^ 107) | i2));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                configure = i4 % 128;
                if ((i4 % 2 == 0 ? 'E' : 'U') == 'U') {
                    if (setRight.init(setRight.this) != 1) {
                        setRight.configure(setRight.this, 1);
                        int i5 = configure;
                        int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
                        getInstance = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        setRight.configure(setRight.this, 0);
                        int i8 = configure;
                        int i9 = i8 & 65;
                        int i10 = -(-((i8 ^ 65) | i9));
                        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                        getInstance = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    setRight.cca_continue(setRight.this);
                    int i13 = configure;
                    int i14 = i13 & 81;
                    int i15 = (((i13 ^ 81) | i14) << 1) - ((i13 | 81) & (~i14));
                    getInstance = i15 % 128;
                    int i16 = i15 % 2;
                    return;
                }
                setRight.init(setRight.this);
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        });
        int i = configure;
        int i2 = i & 33;
        int i3 = ((i ^ 33) | i2) << 1;
        int i4 = -((i | 33) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        Cardinal = i5 % 128;
        int i6 = i5 % 2;
    }

    private void Cardinal() {
        int i;
        int i2 = Cardinal;
        int i3 = i2 & 7;
        int i4 = i3 + ((i2 ^ 7) | i3);
        configure = i4 % 128;
        int i5 = i4 % 2;
        if (this.cca_continue != 1) {
            i = R.drawable.ic_uncheck_box;
            int i6 = configure;
            int i7 = ((i6 ^ 55) | (i6 & 55)) << 1;
            int i8 = -(((~i6) & 55) | (i6 & -56));
            int i9 = (i7 & i8) + (i8 | i7);
            Cardinal = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i = R.drawable.ic_checked_box;
            int i11 = Cardinal;
            int i12 = ((i11 & -4) | ((~i11) & 3)) + ((i11 & 3) << 1);
            configure = i12 % 128;
            int i13 = i12 % 2;
        }
        configure();
        setCCAButtonDrawable(i);
        Cardinal(this);
        int i14 = configure;
        int i15 = ((i14 & -50) | ((~i14) & 49)) + ((i14 & 49) << 1);
        Cardinal = i15 % 128;
        int i16 = i15 % 2;
    }

    private static void Cardinal(setRight setright) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 8, 8, 16);
        setright.setLayoutParams(layoutParams);
        int i = (configure + 50) - 1;
        Cardinal = i % 128;
        if (i % 2 != 0) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final int cca_continue() {
        int i = configure;
        int i2 = i + 2;
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        Cardinal = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.cca_continue;
        int i6 = (i & 61) + (i | 61);
        Cardinal = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setCheckState(int i) {
        int i2 = Cardinal;
        int i3 = (i2 & -74) | ((~i2) & 73);
        int i4 = -(-((i2 & 73) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        configure = i5 % 128;
        int i6 = i5 % 2;
        this.cca_continue = i;
        Cardinal();
        int i7 = configure;
        int i8 = (i7 & 17) + (i7 | 17);
        Cardinal = i8 % 128;
        int i9 = i8 % 2;
    }

    public final int getId() {
        int i = configure;
        int i2 = ((i | 6) << 1) - (i ^ 6);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        int i4 = i3 % 128;
        Cardinal = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 75;
        int i7 = -(-((i4 ^ 75) | i6));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        configure = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = configure;
        int i2 = (i & 103) + (i | 103);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        super.setText("", bufferType);
        int i4 = configure + 81;
        Cardinal = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final CharSequence getText() {
        boolean z = true;
        int i = ((Cardinal + 65) - 1) - 1;
        configure = i % 128;
        if (i % 2 == 0) {
            z = false;
        }
        if (z) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final boolean isChecked() {
        int i = configure;
        int i2 = i & 117;
        int i3 = ((i ^ 117) | i2) << 1;
        int i4 = -((i | 117) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        Cardinal = i6;
        int i7 = i5 % 2;
        int i8 = (i6 & 103) + (i6 | 103);
        configure = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    private void configure() {
        int i = configure;
        int i2 = i & 59;
        int i3 = -(-(i | 59));
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        if (i4 % 2 != 0) {
            super.setPadding(104, 5, 66, 4);
        } else {
            super.setPadding(20, 4, 28, 4);
        }
    }

    public final void setCCAElevation(float f) {
        int i = configure;
        int i2 = (i & -110) | ((~i) & 109);
        int i3 = -(-((i & 109) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
        super.setElevation(f);
        int i6 = configure + 49;
        Cardinal = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final int init() {
        int i = ((Cardinal + 121) - 1) - 1;
        configure = i % 128;
        int i2 = i % 2;
        int id = super.getId();
        int i3 = (Cardinal + 77) - 1;
        int i4 = (i3 & -1) + (i3 | -1);
        configure = i4 % 128;
        if (i4 % 2 != 0) {
            return id;
        }
        throw null;
    }

    public final void setCCAText(CharSequence charSequence) {
        int i = Cardinal;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        configure = i2 % 128;
        if (i2 % 2 != 0) {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
        } else {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
            throw null;
        }
    }

    public final void setCCAId(int i) {
        int i2 = Cardinal;
        int i3 = ((i2 ^ 71) | (i2 & 71)) << 1;
        int i4 = -(((~i2) & 71) | (i2 & -72));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        configure = i5 % 128;
        boolean z = i5 % 2 == 0;
        super.setId(i);
        if (!z) {
            int i6 = configure;
            int i7 = i6 & 27;
            int i8 = ((i6 ^ 27) | i7) << 1;
            int i9 = -((i6 | 27) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            Cardinal = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        throw null;
    }

    public final void setCCAOnCheckedChangeListener(cca_continue cca_continue2) {
        int i = Cardinal;
        int i2 = i & 47;
        int i3 = (((i | 47) & (~i2)) - (~(i2 << 1))) - 1;
        configure = i3 % 128;
        int i4 = i3 % 2;
        super.setOnCheckedChangeListener(cca_continue2);
        int i5 = Cardinal;
        int i6 = (i5 ^ 33) + ((i5 & 33) << 1);
        configure = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setCCAButtonDrawable(int i) {
        int i2 = Cardinal;
        int i3 = (i2 & 83) + (i2 | 83);
        configure = i3 % 128;
        int i4 = i3 % 2;
        super.setButtonDrawable(i);
        int i5 = Cardinal;
        int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
        configure = i6 % 128;
        if ((i6 % 2 == 0 ? '!' : '5') == '!') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void setCCAOnClickListener(setZ.Cardinal cardinal) {
        int i = Cardinal;
        int i2 = ((i | 107) << 1) - (i ^ 107);
        configure = i2 % 128;
        boolean z = i2 % 2 == 0;
        super.setOnClickListener(cardinal);
        if (!z) {
            int i3 = configure;
            int i4 = i3 & 63;
            int i5 = (((i3 | 63) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            Cardinal = i5 % 128;
            if (!(i5 % 2 == 0)) {
                int i6 = 15 / 0;
                return;
            }
            return;
        }
        throw null;
    }
}
