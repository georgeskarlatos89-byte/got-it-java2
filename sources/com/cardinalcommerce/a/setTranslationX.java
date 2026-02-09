package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.webkit.ProxyConfig;
import com.cardinalcommerce.cardinalmobilesdk.R;

public final class setTranslationX extends CompoundButton {
    private static int configure = 0;
    private static int getInstance = 1;

    public final void setButtonDrawable(int i) {
        int i2 = configure;
        int i3 = i2 & 107;
        int i4 = (((i2 ^ 107) | i3) << 1) - ((i2 | 107) & (~i3));
        getInstance = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i = getInstance;
        int i2 = i ^ 29;
        int i3 = ((i & 29) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        configure = i5 % 128;
        if ((i5 % 2 != 0 ? 'O' : 16) != 16) {
            int i6 = 68 / 0;
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = configure;
        int i6 = ((i5 | 84) << 1) - (i5 ^ 84);
        int i7 = (i6 & -1) + (i6 | -1);
        getInstance = i7 % 128;
        if ((i7 % 2 == 0 ? 'H' : 'A') != 'A') {
            throw null;
        }
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = (getInstance + 86) - 1;
        configure = i % 128;
        int i2 = i % 2;
    }

    public setTranslationX(Context context) {
        super(context);
        cca_continue();
    }

    public setTranslationX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cca_continue();
    }

    public setTranslationX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cca_continue();
    }

    private void cca_continue() {
        int i = configure;
        int i2 = (i & 37) + (i | 37);
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        setCCAPadding();
        setCCAButtonDrawable(R.drawable.ic_radio_button_unchecked);
        cca_continue(this);
        int i4 = configure;
        int i5 = i4 & 17;
        int i6 = (i4 | 17) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        getInstance = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 78 / 0;
        }
    }

    public final CharSequence getText() {
        int i = getInstance;
        int i2 = i & 89;
        int i3 = i2 + ((i ^ 89) | i2);
        configure = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i | 98) << 1) - (i ^ 98);
        int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
        configure = i6 % 128;
        int i7 = i6 % 2;
        return ProxyConfig.MATCH_ALL_SCHEMES;
    }

    public final void setCCAButtonDrawable(int i) {
        int i2 = configure;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getInstance = i5 % 128;
        boolean z = i5 % 2 == 0;
        super.setButtonDrawable(i);
        if (z) {
            throw null;
        }
    }

    public final void setCCAText(CharSequence charSequence) {
        int i = configure;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getInstance = i2 % 128;
        boolean z = false;
        if (!(i2 % 2 == 0)) {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
        } else {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
            int i3 = 64 / 0;
        }
        int i4 = getInstance;
        int i5 = i4 & 45;
        int i6 = i4 | 45;
        int i7 = (i5 & i6) + (i6 | i5);
        configure = i7 % 128;
        if (i7 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void setCCAPadding() {
        int i = configure;
        boolean z = true;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        super.setPadding(20, 4, 28, 4);
        int i4 = getInstance;
        int i5 = (i4 & 55) + (i4 | 55);
        configure = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        }
        if (z) {
            int i6 = 44 / 0;
        }
    }

    private static void cca_continue(setTranslationX settranslationx) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 8, 8, 16);
        settranslationx.setLayoutParams(layoutParams);
        int i = getInstance;
        int i2 = i & 115;
        int i3 = ((i ^ 115) | i2) << 1;
        int i4 = -((i | 115) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        configure = i5 % 128;
        if (!(i5 % 2 == 0)) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void setCCAOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i = getInstance;
        int i2 = (i & 77) + (i | 77);
        configure = i2 % 128;
        char c = i2 % 2 != 0 ? '+' : 'Z';
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        if (c == '+') {
            throw null;
        }
    }
}
