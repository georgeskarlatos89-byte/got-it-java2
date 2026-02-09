package com.cardinalcommerce.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.cardinalcommerce.a.setZ;
import org.objectweb.asm.signature.SignatureVisitor;

public class setY extends ImageView {
    private static int Cardinal = 0;
    private static int init = 1;

    public void setImageBitmap(Bitmap bitmap) {
        int i = init;
        int i2 = i & 13;
        int i3 = ((i | 13) & (~i2)) + (i2 << 1);
        Cardinal = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setImageDrawable(Drawable drawable) {
        int i = Cardinal;
        int i2 = (i & 15) + (i | 15);
        init = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setImageIcon(Icon icon) {
        int i = init;
        int i2 = i & 71;
        int i3 = -(-((i ^ 71) | i2));
        int i4 = i2 ^ i3;
        int i5 = i3 & i2;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        Cardinal = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (!z) {
            int i7 = 42 / 0;
        }
    }

    public void setImageResource(int i) {
        int i2 = init;
        int i3 = (i2 & 46) + (i2 | 46);
        int i4 = ((i3 | -1) << 1) - (i3 ^ -1);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setImageURI(Uri uri) {
        int i = Cardinal;
        int i2 = i & 19;
        int i3 = (i ^ 19) | i2;
        int i4 = i2 ^ i3;
        int i5 = i3 & i2;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        init = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        int i = Cardinal;
        int i2 = ((i & 1) - (~(-(-(i | 1))))) - 1;
        init = i2 % 128;
        if ((i2 % 2 == 0 ? 'F' : 16) == 'F') {
            throw null;
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        int i = init;
        int i2 = ((i & -16) | ((~i) & 15)) + ((i & 15) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        int i = Cardinal;
        int i2 = i & 79;
        int i3 = ((i | 79) & (~i2)) + (i2 << 1);
        init = i3 % 128;
        if ((i3 % 2 == 0 ? 'V' : SignatureVisitor.EXTENDS) == 'V') {
            int i4 = 35 / 0;
        }
    }

    public setY(Context context) {
        super(context);
    }

    public setY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Drawable getDrawable() {
        int i = init;
        boolean z = true;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        int i4 = i ^ 59;
        int i5 = ((i & 59) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        Cardinal = i7 % 128;
        if (i7 % 2 != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        int i8 = 52 / 0;
        return null;
    }

    public void setCCAImageDrawable(Drawable drawable) {
        int i = init;
        int i2 = i ^ 27;
        int i3 = -(-((i & 27) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
        super.setImageDrawable(drawable);
        int i6 = Cardinal + 70;
        int i7 = ((i6 | -1) << 1) - (i6 ^ -1);
        init = i7 % 128;
        if ((i7 % 2 == 0 ? 9 : '3') != '3') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setCCAImageIcon(Icon icon) {
        int i = init;
        int i2 = (i & 35) + (i | 35);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        super.setImageIcon(icon);
        int i4 = init;
        int i5 = i4 & 85;
        int i6 = (i4 | 85) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        Cardinal = i8 % 128;
        if ((i8 % 2 != 0 ? 26 : '\'') != '\'') {
            throw null;
        }
    }

    public void setCCAImageUri(Uri uri) {
        int i = Cardinal;
        int i2 = (i ^ 105) + ((i & 105) << 1);
        init = i2 % 128;
        int i3 = i2 % 2;
        super.setImageURI(uri);
        int i4 = Cardinal + 37;
        init = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setCCAImageBitmap(Bitmap bitmap) {
        setCCAImageDrawable(new BitmapDrawable(getResources(), bitmap));
        int i = Cardinal;
        int i2 = i & 73;
        int i3 = -(-(i | 73));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        init = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setCCAImageResource(int i) {
        int i2 = Cardinal + 45;
        init = i2 % 128;
        char c = i2 % 2 == 0 ? '_' : 20;
        super.setImageResource(i);
        if (c != 20) {
            throw null;
        }
    }

    public void setCCAOnClickListener(setZ.Cardinal cardinal) {
        int i = (Cardinal + 34) - 1;
        init = i % 128;
        char c = i % 2 == 0 ? (char) 21 : 20;
        super.setOnClickListener(cardinal);
        if (c == 21) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setCCAOnFocusChangeListener(setZ.cca_continue cca_continue) {
        int i = Cardinal;
        int i2 = i & 123;
        int i3 = -(-((i ^ 123) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        init = i4 % 128;
        int i5 = i4 % 2;
        super.setOnFocusChangeListener(cca_continue);
        int i6 = init;
        int i7 = i6 & 21;
        int i8 = (((i6 ^ 21) | i7) << 1) - ((i6 | 21) & (~i7));
        Cardinal = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setCCAOnTouchListener(setZ.getInstance getinstance) {
        int i = Cardinal + 91;
        init = i % 128;
        boolean z = i % 2 == 0;
        super.setOnTouchListener(getinstance);
        if (z) {
            int i2 = 64 / 0;
        }
    }
}
