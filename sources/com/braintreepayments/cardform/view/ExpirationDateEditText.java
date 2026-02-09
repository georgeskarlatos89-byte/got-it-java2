package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.braintreepayments.cardform.R;
import com.braintreepayments.cardform.utils.DateValidator;

public class ExpirationDateEditText extends ErrorEditText implements TextWatcher, View.OnClickListener {
    private static final int MAX_NUM_CHARS = 6;
    private boolean mChangeWasAddition;
    private View.OnClickListener mClickListener;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ExpirationDateEditText(Context context) {
        super(context);
        init();
    }

    public ExpirationDateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ExpirationDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setInputType(2);
        setInputFilters();
        addTextChangedListener(this);
        super.setOnClickListener(this);
    }

    private void setInputFilters() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(6), DigitsOnlyFilter.newInstance(6)});
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.mClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getMonth() {
        if (getString().length() < 2) {
            return "";
        }
        return getString().substring(0, 2);
    }

    public String getYear() {
        String string = getString();
        if (string.length() == 4 || string.length() == 6) {
            return getString().substring(2);
        }
        return "";
    }

    public boolean isValid() {
        return isOptional() || DateValidator.isValid(getMonth(), getYear());
    }

    public String getErrorMessage() {
        if (TextUtils.isEmpty(getText())) {
            return getContext().getString(R.string.bt_expiration_required);
        }
        return getContext().getString(R.string.bt_expiration_invalid);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.mChangeWasAddition = i3 > i2;
    }

    public void afterTextChanged(Editable editable) {
        if (this.mChangeWasAddition && editable.length() == 1 && Character.getNumericValue(editable.charAt(0)) >= 2) {
            prependLeadingZero(editable);
        }
        for (Object removeSpan : editable.getSpans(0, editable.length(), SlashSpan.class)) {
            editable.removeSpan(removeSpan);
        }
        addDateSlash(editable);
        if (((getSelectionStart() == 4 && !editable.toString().endsWith("20")) || getSelectionStart() == 6) && isValid()) {
            focusNextView();
        }
    }

    private void prependLeadingZero(Editable editable) {
        editable.replace(0, 1, "0").append(editable.charAt(0));
    }

    private void addDateSlash(Editable editable) {
        if (2 <= editable.length()) {
            editable.setSpan(new SlashSpan(), 1, 2, 33);
        }
    }

    private String getString() {
        Editable text = getText();
        return text != null ? text.toString() : "";
    }
}
