package com.cardinalcommerce.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.cardinalcommerce.cardinalmobilesdk.R;
import kotlin.text.Typography;

public class setTranslationZ extends LinearLayout {
    private static int cca_continue = 0;
    private static int configure = 1;
    private int Cardinal = -1;

    public void addView(View view) {
        int i = configure + 103;
        cca_continue = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 88 / 0;
        }
    }

    static /* synthetic */ void getInstance(setTranslationZ settranslationz) {
        int i = configure;
        int i2 = (i & -104) | ((~i) & 103);
        int i3 = (i & 103) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        settranslationz.init();
        int i6 = configure;
        int i7 = i6 & 33;
        int i8 = (i6 ^ 33) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        cca_continue = i9 % 128;
        if ((i9 % 2 != 0 ? '_' : 'a') == '_') {
            throw null;
        }
    }

    static /* synthetic */ void init(setTranslationZ settranslationz, setTranslationX settranslationx) {
        int i = configure;
        int i2 = i & 51;
        int i3 = i | 51;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        settranslationz.getInstance(settranslationx);
        int i6 = cca_continue;
        int i7 = (i6 & 79) + (i6 | 79);
        configure = i7 % 128;
        int i8 = i7 % 2;
    }

    public setTranslationZ(Context context) {
        super(context);
    }

    public setTranslationZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setTranslationZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void Cardinal(final View view) {
        int i = cca_continue;
        int i2 = ((((i | 122) << 1) - (i ^ 122)) + 0) - 1;
        configure = i2 % 128;
        int i3 = i2 % 2;
        if (view instanceof setTranslationX) {
            view.setOnClickListener(new View.OnClickListener() {
                private static int Cardinal = 0;
                private static int cca_continue = 1;

                public final void onClick(View view) {
                    int i = Cardinal;
                    int i2 = i & 47;
                    int i3 = (((i ^ 47) | i2) << 1) - ((i | 47) & (~i2));
                    cca_continue = i3 % 128;
                    int i4 = i3 % 2;
                    setTranslationZ.getInstance(setTranslationZ.this);
                    setTranslationZ.init(setTranslationZ.this, (setTranslationX) view);
                    int i5 = cca_continue;
                    int i6 = (i5 & 51) + (i5 | 51);
                    Cardinal = i6 % 128;
                    if ((i6 % 2 != 0 ? Typography.less : '\\') != '\\') {
                        Throwable th = null;
                        super.hashCode();
                        throw th;
                    }
                }
            });
            int i4 = cca_continue;
            int i5 = i4 ^ 65;
            int i6 = ((i4 & 65) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            configure = i8 % 128;
            int i9 = i8 % 2;
        }
        super.addView(view);
        int i10 = cca_continue;
        int i11 = i10 & 45;
        int i12 = (((i10 | 45) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        configure = i12 % 128;
        if ((i12 % 2 == 0 ? '\\' : 13) == '\\') {
            throw null;
        }
    }

    private void init() {
        int i = cca_continue;
        boolean z = true;
        int i2 = (((i ^ 7) | (i & 7)) << 1) - (((~i) & 7) | (i & -8));
        int i3 = i2 % 128;
        configure = i3;
        int i4 = i2 % 2;
        int i5 = ((i3 + 105) - 1) - 1;
        cca_continue = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            Throwable th = null;
            if ((i7 < getChildCount() ? 'F' : 17) != 17) {
                int i8 = configure;
                int i9 = i8 & 47;
                int i10 = -(-((i8 ^ 47) | i9));
                int i11 = (i9 & i10) + (i10 | i9);
                cca_continue = i11 % 128;
                int i12 = i11 % 2;
                View childAt = getChildAt(i7);
                if (!(!(childAt instanceof setTranslationX))) {
                    int i13 = configure;
                    int i14 = ((i13 | 53) << 1) - (i13 ^ 53);
                    cca_continue = i14 % 128;
                    if (!(i14 % 2 != 0 ? true : false)) {
                        cca_continue((setTranslationX) childAt);
                        int i15 = configure;
                        int i16 = i15 & 41;
                        int i17 = (i15 | 41) & (~i16);
                        int i18 = i16 << 1;
                        int i19 = (i17 & i18) + (i17 | i18);
                        cca_continue = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        cca_continue((setTranslationX) childAt);
                        throw th;
                    }
                }
                int i21 = ((i7 ^ 1) | (i7 & 1)) << 1;
                int i22 = -(((~i7) & 1) | (i7 & -2));
                i7 = (i22 | i21) + (i21 & i22);
                int i23 = cca_continue;
                int i24 = ((i23 ^ 115) | (i23 & 115)) << 1;
                int i25 = -(((~i23) & 115) | (i23 & -116));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                configure = i26 % 128;
                int i27 = i26 % 2;
            } else {
                int i28 = configure + 5;
                cca_continue = i28 % 128;
                if (i28 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    super.hashCode();
                    throw th;
                }
                return;
            }
        }
    }

    private static void cca_continue(setTranslationX settranslationx) {
        int i = configure;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        settranslationx.setCCAButtonDrawable(R.drawable.ic_radio_button_unchecked);
        int i4 = configure + 57;
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getInstance(setTranslationX settranslationx) {
        int i = (cca_continue + 30) - 1;
        configure = i % 128;
        int i2 = i % 2;
        settranslationx.setCCAButtonDrawable(R.drawable.ic_check_circle);
        cca_continue(settranslationx.getId());
        int i3 = configure;
        int i4 = ((i3 | 9) << 1) - (i3 ^ 9);
        cca_continue = i4 % 128;
        if ((i4 % 2 != 0 ? 'D' : 'T') == 'D') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final int getInstance() {
        int i = configure;
        int i2 = i & 49;
        int i3 = -(-((i ^ 49) | i2));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.Cardinal;
        int i7 = i & 115;
        int i8 = ((i ^ 115) | i7) << 1;
        int i9 = -((i | 115) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        cca_continue = i10 % 128;
        if ((i10 % 2 != 0 ? 'Q' : 18) == 18) {
            return i6;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void cca_continue(int i) {
        int i2 = configure;
        int i3 = (i2 | 43) << 1;
        int i4 = -(((~i2) & 43) | (i2 & -44));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        cca_continue = i5 % 128;
        char c = i5 % 2 != 0 ? '/' : '8';
        this.Cardinal = i;
        if (c != '8') {
            throw null;
        }
    }
}
