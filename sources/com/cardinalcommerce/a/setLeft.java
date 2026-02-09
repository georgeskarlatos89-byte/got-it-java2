package com.cardinalcommerce.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;
import com.cardinalcommerce.a.setZ;

public class setLeft extends TextView {
    private static int Cardinal = 1;
    private static int cca_continue;

    public void addTextChangedListener(TextWatcher textWatcher) {
        int i = Cardinal;
        int i2 = i & 105;
        int i3 = i2 + ((i ^ 105) | i2);
        cca_continue = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setFocusableInTouchMode(boolean z) {
        int i = (cca_continue + 76) - 1;
        Cardinal = i % 128;
        int i2 = i % 2;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        int i = Cardinal;
        int i2 = (((i ^ 94) + ((i & 94) << 1)) + 0) - 1;
        cca_continue = i2 % 128;
        if ((i2 % 2 != 0 ? '.' : '6') == '.') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public /* synthetic */ CharSequence getText() {
        int i = Cardinal;
        int i2 = (i & 1) + (i | 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        Editable Cardinal2 = Cardinal();
        int i4 = cca_continue;
        int i5 = ((i4 | 74) << 1) - (i4 ^ 74);
        int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
        Cardinal = i6 % 128;
        if (!(i6 % 2 == 0)) {
            return Cardinal2;
        }
        throw null;
    }

    public setLeft(Context context) {
        super(context);
    }

    public setLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImeOptions(268435456);
        setCursorVisible(true);
        setSingleLine();
        setGravity(17);
    }

    public setLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if ((r0 != null) != true) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if ((r0 == null ? 21 : '\\') != '\\') goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        setCursorVisible(true);
        setTextIsSelectable(true);
        r1 = new android.text.SpannableStringBuilder();
        r4 = Cardinal + 69;
        cca_continue = r4 % 128;
        r4 = r4 % 2;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r4 >= r0.length()) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r5 == true) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r0 = (Cardinal + 28) - 1;
        cca_continue = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r5 = cca_continue + 24;
        r6 = (r5 & -1) + (r5 | -1);
        Cardinal = r6 % 128;
        r6 = r6 % 2;
        r1.append('*');
        r4 = (r4 + 2) - 1;
        r5 = Cardinal;
        r6 = r5 & 37;
        r5 = -(-(r5 | 37));
        r7 = (r6 ^ r5) + ((r5 & r6) << 1);
        cca_continue = r7 % 128;
        r7 = r7 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.text.Editable Cardinal() {
        /*
            r8 = this;
            int r0 = Cardinal
            r1 = r0 & 83
            r0 = r0 | 83
            int r1 = r1 + r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            r0 = 31
            if (r1 == 0) goto L_0x0014
            r1 = 25
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r1 == r0) goto L_0x002a
            java.lang.CharSequence r0 = super.getText()
            r1 = 33
            int r1 = r1 / r2
            if (r0 != 0) goto L_0x0024
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r1 = r3
        L_0x0025:
            if (r1 == r3) goto L_0x005b
            goto L_0x0038
        L_0x0028:
            r0 = move-exception
            throw r0
        L_0x002a:
            java.lang.CharSequence r0 = super.getText()
            r1 = 92
            if (r0 != 0) goto L_0x0035
            r4 = 21
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            if (r4 == r1) goto L_0x005b
        L_0x0038:
            int r0 = Cardinal
            r1 = r0 & 65
            r0 = r0 | 65
            int r1 = r1 + r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            r1 = r0 & -108(0xffffffffffffff94, float:NaN)
            int r2 = ~r0
            r4 = 107(0x6b, float:1.5E-43)
            r2 = r2 & r4
            r1 = r1 | r2
            r0 = r0 & r4
            int r0 = r0 << r3
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r3
            int r2 = r2 + r0
            int r0 = r2 % 128
            Cardinal = r0
            int r2 = r2 % 2
            r0 = 0
            return r0
        L_0x005b:
            r8.setCursorVisible(r3)
            r8.setTextIsSelectable(r3)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            int r4 = Cardinal
            int r4 = r4 + 69
            int r5 = r4 % 128
            cca_continue = r5
            int r4 = r4 % 2
            r4 = r2
        L_0x0071:
            int r5 = r0.length()
            if (r4 >= r5) goto L_0x0079
            r5 = r3
            goto L_0x007a
        L_0x0079:
            r5 = r2
        L_0x007a:
            if (r5 == r3) goto L_0x0088
            int r0 = Cardinal
            int r0 = r0 + 28
            int r0 = r0 - r3
            int r2 = r0 % 128
            cca_continue = r2
            int r0 = r0 % 2
            return r1
        L_0x0088:
            int r5 = cca_continue
            int r5 = r5 + 24
            r6 = r5 & -1
            r5 = r5 | -1
            int r6 = r6 + r5
            int r5 = r6 % 128
            Cardinal = r5
            int r6 = r6 % 2
            r5 = 42
            r1.append(r5)
            int r4 = r4 + 2
            int r4 = r4 - r3
            int r5 = Cardinal
            r6 = r5 & 37
            r5 = r5 | 37
            int r5 = -r5
            int r5 = -r5
            r7 = r6 ^ r5
            r5 = r5 & r6
            int r5 = r5 << r3
            int r7 = r7 + r5
            int r5 = r7 % 128
            cca_continue = r5
            int r7 = r7 % 2
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setLeft.Cardinal():android.text.Editable");
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionStart() {
        int i = cca_continue;
        int i2 = (((i ^ 43) | (i & 43)) << 1) - (((~i) & 43) | (i & -44));
        Cardinal = i2 % 128;
        if (!(i2 % 2 == 0)) {
            int length = Cardinal().toString().length();
            int i3 = Cardinal;
            int i4 = i3 ^ 71;
            int i5 = ((i3 & 71) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            cca_continue = i7 % 128;
            if ((i7 % 2 != 0 ? 15 : 'Z') == 'Z') {
                return length;
            }
            int i8 = 25 / 0;
            return length;
        }
        Cardinal().toString().length();
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        int i = Cardinal;
        int i2 = i ^ 107;
        int i3 = (i & 107) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        cca_continue = i4 % 128;
        if (i4 % 2 == 0) {
            int length = Cardinal().toString().length();
            int i5 = (cca_continue + 98) - 1;
            Cardinal = i5 % 128;
            int i6 = i5 % 2;
            return length;
        }
        Cardinal().toString().length();
        throw null;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i = cca_continue;
        int i2 = (i & -34) | ((~i) & 33);
        int i3 = -(-((i & 33) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
        super.setText("", bufferType);
        int i6 = Cardinal;
        int i7 = (i6 ^ 5) + ((i6 & 5) << 1);
        cca_continue = i7 % 128;
        int i8 = i7 % 2;
    }

    public final CharSequence configure() {
        int i = cca_continue;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        CharSequence text = super.getText();
        int i4 = cca_continue;
        int i5 = (i4 & -104) | ((~i4) & 103);
        int i6 = -(-((i4 & 103) << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        Cardinal = i7 % 128;
        if ((i7 % 2 == 0 ? 11 : 'V') == 'V') {
            return text;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public void setCCAText(CharSequence charSequence) {
        int i = cca_continue + 39;
        Cardinal = i % 128;
        if ((i % 2 == 0 ? 'O' : 'b') != 'b') {
            super.setText(charSequence, TextView.BufferType.EDITABLE);
            int i2 = 70 / 0;
            return;
        }
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setCCAFocusableInTouchMode(boolean z) {
        int i = Cardinal + 82;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        super.setFocusableInTouchMode(z);
        int i4 = cca_continue;
        int i5 = i4 | 57;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 57)) & i5);
        int i8 = (i6 & i7) + (i7 | i6);
        Cardinal = i8 % 128;
        if (i8 % 2 == 0) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public void setCCAOnFocusChangeListener(setZ.cca_continue cca_continue2) {
        int i = Cardinal;
        int i2 = (i & -80) | ((~i) & 79);
        boolean z = true;
        int i3 = -(-((i & 79) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        cca_continue = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        super.setOnFocusChangeListener(cca_continue2);
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
