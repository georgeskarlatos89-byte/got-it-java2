package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.braintreepayments.cardform.R;
import java.util.regex.Pattern;

public class CardholderNameEditText extends ErrorEditText {
    private static final Pattern sensitiveDataRegex = Pattern.compile("^[\\d\\s-]+$");

    public CardholderNameEditText(Context context) {
        super(context);
        init();
    }

    public CardholderNameEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CardholderNameEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setInputType(1);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
    }

    public boolean isValid() {
        if (isOptional()) {
            return hasValidCardholderNameText();
        }
        return !isTextEmpty() && hasValidCardholderNameText();
    }

    private boolean isTextEmpty() {
        return getText().toString().trim().isEmpty();
    }

    private boolean hasValidCardholderNameText() {
        Editable text = getText();
        if (text != null) {
            return !sensitiveDataRegex.matcher(text).matches();
        }
        return true;
    }

    public String getErrorMessage() {
        return getContext().getString(R.string.bt_cardholder_name_required);
    }
}
