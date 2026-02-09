package com.braintreepayments.cardform.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.GravityCompat;
import com.braintreepayments.cardform.R;
import com.braintreepayments.cardform.utils.VibrationHelper;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import org.objectweb.asm.Opcodes;

public class ErrorEditText extends TextInputEditText {
    private boolean mError;
    private Animation mErrorAnimator;
    private boolean mOptional;

    public String getErrorMessage() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public ErrorEditText(Context context) {
        super(context);
        init();
    }

    public ErrorEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ErrorEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mErrorAnimator = AnimationUtils.loadAnimation(getContext(), R.anim.bt_error_animation);
        this.mError = false;
        setupRTL();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (i2 != i3) {
            setError((String) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !isValid() && !TextUtils.isEmpty(getText())) {
            setError(getErrorMessage());
        }
    }

    public void setFieldHint(int i) {
        setFieldHint(getContext().getString(i));
    }

    public void setFieldHint(String str) {
        if (getTextInputLayoutParent() != null) {
            getTextInputLayoutParent().setHint((CharSequence) str);
        } else {
            setHint(str);
        }
    }

    public View focusNextView() {
        View view;
        if (getImeActionId() == 2) {
            return null;
        }
        try {
            view = focusSearch(2);
        } catch (IllegalArgumentException unused) {
            view = focusSearch(Opcodes.IXOR);
        }
        if (view == null || !view.requestFocus()) {
            return null;
        }
        return view;
    }

    public void setOptional(boolean z) {
        this.mOptional = z;
    }

    public boolean isOptional() {
        return this.mOptional;
    }

    public boolean isError() {
        return this.mError;
    }

    public void setError(String str) {
        this.mError = !TextUtils.isEmpty(str);
        TextInputLayout textInputLayoutParent = getTextInputLayoutParent();
        if (textInputLayoutParent != null) {
            textInputLayoutParent.setErrorEnabled(!TextUtils.isEmpty(str));
            textInputLayoutParent.setError(str);
        }
        Animation animation = this.mErrorAnimator;
        if (animation != null && this.mError) {
            startAnimation(animation);
            VibrationHelper.vibrate(getContext(), 10);
        }
    }

    public void validate() {
        if (isValid() || isOptional()) {
            setError((String) null);
        } else {
            setError(getErrorMessage());
        }
    }

    public void closeSoftKeyboard() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public TextInputLayout getTextInputLayoutParent() {
        if (getParent() == null || !(getParent().getParent() instanceof TextInputLayout)) {
            return null;
        }
        return (TextInputLayout) getParent().getParent();
    }

    private void setupRTL() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            setTextDirection(3);
            setGravity(GravityCompat.END);
        }
    }
}
