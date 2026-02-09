package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.cardform.OnCardFormFieldFocusedListener;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.OnCardFormValidListener;
import com.braintreepayments.cardform.R;
import com.braintreepayments.cardform.utils.CardType;
import com.braintreepayments.cardform.utils.ViewUtils;
import com.braintreepayments.cardform.view.CardEditText;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.List;

public class CardForm extends LinearLayout implements CardEditText.OnCardTypeChangedListener, View.OnFocusChangeListener, View.OnClickListener, TextView.OnEditorActionListener, TextWatcher {
    public static final int FIELD_DISABLED = 0;
    public static final int FIELD_OPTIONAL = 1;
    public static final int FIELD_REQUIRED = 2;
    private String mActionLabel;
    private CardEditText mCardNumber;
    private ImageView mCardNumberIcon;
    private boolean mCardNumberRequired;
    private CardholderNameEditText mCardholderName;
    private ImageView mCardholderNameIcon;
    private int mCardholderNameStatus = 0;
    private CountryCodeEditText mCountryCode;
    private CvvEditText mCvv;
    private boolean mCvvRequired;
    private ExpirationDateEditText mExpiration;
    private boolean mExpirationRequired;
    private MobileNumberEditText mMobileNumber;
    private TextView mMobileNumberExplanation;
    private ImageView mMobileNumberIcon;
    private boolean mMobileNumberRequired;
    private OnCardFormFieldFocusedListener mOnCardFormFieldFocusedListener;
    private OnCardFormSubmitListener mOnCardFormSubmitListener;
    private OnCardFormValidListener mOnCardFormValidListener;
    private CardEditText.OnCardTypeChangedListener mOnCardTypeChangedListener;
    private PostalCodeEditText mPostalCode;
    private ImageView mPostalCodeIcon;
    private boolean mPostalCodeRequired;
    private InitialValueCheckBox mSaveCardCheckBox;
    private boolean mSaveCardCheckBoxChecked;
    private boolean mSaveCardCheckBoxVisible;
    private boolean mValid = false;
    private List<ErrorEditText> mVisibleEditTexts;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CardForm(Context context) {
        super(context);
        init();
    }

    public CardForm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public CardForm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private void init() {
        setVisibility(8);
        setOrientation(1);
        inflate(getContext(), R.layout.bt_card_form_fields, this);
        this.mCardNumberIcon = (ImageView) findViewById(R.id.bt_card_form_card_number_icon);
        this.mCardNumber = (CardEditText) findViewById(R.id.bt_card_form_card_number);
        this.mExpiration = (ExpirationDateEditText) findViewById(R.id.bt_card_form_expiration);
        this.mCvv = (CvvEditText) findViewById(R.id.bt_card_form_cvv);
        this.mCardholderName = (CardholderNameEditText) findViewById(R.id.bt_card_form_cardholder_name);
        this.mCardholderNameIcon = (ImageView) findViewById(R.id.bt_card_form_cardholder_name_icon);
        this.mPostalCodeIcon = (ImageView) findViewById(R.id.bt_card_form_postal_code_icon);
        this.mPostalCode = (PostalCodeEditText) findViewById(R.id.bt_card_form_postal_code);
        this.mMobileNumberIcon = (ImageView) findViewById(R.id.bt_card_form_mobile_number_icon);
        this.mCountryCode = (CountryCodeEditText) findViewById(R.id.bt_card_form_country_code);
        this.mMobileNumber = (MobileNumberEditText) findViewById(R.id.bt_card_form_mobile_number);
        this.mMobileNumberExplanation = (TextView) findViewById(R.id.bt_card_form_mobile_number_explanation);
        this.mSaveCardCheckBox = (InitialValueCheckBox) findViewById(R.id.bt_card_form_save_card_checkbox);
        this.mVisibleEditTexts = new ArrayList();
        setListeners(this.mCardholderName);
        setListeners(this.mCardNumber);
        setListeners(this.mExpiration);
        setListeners(this.mCvv);
        setListeners(this.mPostalCode);
        setListeners(this.mMobileNumber);
        this.mCardNumber.setOnCardTypeChangedListener(this);
    }

    public CardForm cardRequired(boolean z) {
        this.mCardNumberRequired = z;
        return this;
    }

    public CardForm expirationRequired(boolean z) {
        this.mExpirationRequired = z;
        return this;
    }

    public CardForm cvvRequired(boolean z) {
        this.mCvvRequired = z;
        return this;
    }

    public CardForm cardholderName(int i) {
        this.mCardholderNameStatus = i;
        return this;
    }

    public CardForm postalCodeRequired(boolean z) {
        this.mPostalCodeRequired = z;
        return this;
    }

    public CardForm mobileNumberRequired(boolean z) {
        this.mMobileNumberRequired = z;
        return this;
    }

    public CardForm actionLabel(String str) {
        this.mActionLabel = str;
        return this;
    }

    public CardForm mobileNumberExplanation(String str) {
        this.mMobileNumberExplanation.setText(str);
        return this;
    }

    public CardForm maskCardNumber(boolean z) {
        this.mCardNumber.setMask(z);
        return this;
    }

    public CardForm maskCvv(boolean z) {
        this.mCvv.setMask(z);
        return this;
    }

    public CardForm saveCardCheckBoxVisible(boolean z) {
        this.mSaveCardCheckBoxVisible = z;
        return this;
    }

    public CardForm saveCardCheckBoxChecked(boolean z) {
        this.mSaveCardCheckBoxChecked = z;
        return this;
    }

    public void setup(AppCompatActivity appCompatActivity) {
        setup((FragmentActivity) appCompatActivity);
    }

    public void setup(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().setFlags(8192, 8192);
        boolean z = this.mCardholderNameStatus != 0;
        boolean isDarkBackground = ViewUtils.isDarkBackground(fragmentActivity);
        this.mCardholderNameIcon.setImageResource(isDarkBackground ? R.drawable.bt_ic_cardholder_name_dark : R.drawable.bt_ic_cardholder_name);
        this.mCardNumberIcon.setImageResource(isDarkBackground ? R.drawable.bt_ic_card_dark : R.drawable.bt_ic_card);
        this.mPostalCodeIcon.setImageResource(isDarkBackground ? R.drawable.bt_ic_postal_code_dark : R.drawable.bt_ic_postal_code);
        this.mMobileNumberIcon.setImageResource(isDarkBackground ? R.drawable.bt_ic_mobile_number_dark : R.drawable.bt_ic_mobile_number);
        setViewVisibility(this.mCardholderNameIcon, z);
        setFieldVisibility(this.mCardholderName, z);
        setViewVisibility(this.mCardNumberIcon, this.mCardNumberRequired);
        setFieldVisibility(this.mCardNumber, this.mCardNumberRequired);
        setFieldVisibility(this.mExpiration, this.mExpirationRequired);
        setFieldVisibility(this.mCvv, this.mCvvRequired);
        setViewVisibility(this.mPostalCodeIcon, this.mPostalCodeRequired);
        setFieldVisibility(this.mPostalCode, this.mPostalCodeRequired);
        setViewVisibility(this.mMobileNumberIcon, this.mMobileNumberRequired);
        setFieldVisibility(this.mCountryCode, this.mMobileNumberRequired);
        setFieldVisibility(this.mMobileNumber, this.mMobileNumberRequired);
        setViewVisibility(this.mMobileNumberExplanation, this.mMobileNumberRequired);
        setViewVisibility(this.mSaveCardCheckBox, this.mSaveCardCheckBoxVisible);
        for (int i = 0; i < this.mVisibleEditTexts.size(); i++) {
            TextInputEditText textInputEditText = this.mVisibleEditTexts.get(i);
            if (i == this.mVisibleEditTexts.size() - 1) {
                textInputEditText.setImeOptions(2);
                textInputEditText.setImeActionLabel(this.mActionLabel, 2);
                textInputEditText.setOnEditorActionListener(this);
            } else {
                textInputEditText.setImeOptions(5);
                textInputEditText.setImeActionLabel((CharSequence) null, 1);
                textInputEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            }
        }
        this.mSaveCardCheckBox.setInitiallyChecked(this.mSaveCardCheckBoxChecked);
        setVisibility(0);
    }

    public void setCardholderNameIcon(int i) {
        this.mCardholderNameIcon.setImageResource(i);
    }

    public void setCardNumberIcon(int i) {
        this.mCardNumberIcon.setImageResource(i);
    }

    public void setPostalCodeIcon(int i) {
        this.mPostalCodeIcon.setImageResource(i);
    }

    public void setMobileNumberIcon(int i) {
        this.mMobileNumberIcon.setImageResource(i);
    }

    private void setListeners(EditText editText) {
        editText.setOnFocusChangeListener(this);
        editText.setOnClickListener(this);
        editText.addTextChangedListener(this);
    }

    private void setViewVisibility(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    private void setFieldVisibility(ErrorEditText errorEditText, boolean z) {
        setViewVisibility(errorEditText, z);
        if (errorEditText.getTextInputLayoutParent() != null) {
            setViewVisibility(errorEditText.getTextInputLayoutParent(), z);
        }
        if (z) {
            this.mVisibleEditTexts.add(errorEditText);
        } else {
            this.mVisibleEditTexts.remove(errorEditText);
        }
    }

    public void setOnCardFormValidListener(OnCardFormValidListener onCardFormValidListener) {
        this.mOnCardFormValidListener = onCardFormValidListener;
    }

    public void setOnCardFormSubmitListener(OnCardFormSubmitListener onCardFormSubmitListener) {
        this.mOnCardFormSubmitListener = onCardFormSubmitListener;
    }

    public void setOnFormFieldFocusedListener(OnCardFormFieldFocusedListener onCardFormFieldFocusedListener) {
        this.mOnCardFormFieldFocusedListener = onCardFormFieldFocusedListener;
    }

    public void setOnCardTypeChangedListener(CardEditText.OnCardTypeChangedListener onCardTypeChangedListener) {
        this.mOnCardTypeChangedListener = onCardTypeChangedListener;
    }

    public void setEnabled(boolean z) {
        this.mCardholderName.setEnabled(z);
        this.mCardNumber.setEnabled(z);
        this.mExpiration.setEnabled(z);
        this.mCvv.setEnabled(z);
        this.mPostalCode.setEnabled(z);
        this.mMobileNumber.setEnabled(z);
    }

    public boolean isValid() {
        boolean z = false;
        boolean z2 = this.mCardholderNameStatus != 2 || this.mCardholderName.isValid();
        if (this.mCardNumberRequired) {
            z2 = z2 && this.mCardNumber.isValid();
        }
        if (this.mExpirationRequired) {
            z2 = z2 && this.mExpiration.isValid();
        }
        if (this.mCvvRequired) {
            z2 = z2 && this.mCvv.isValid();
        }
        if (this.mPostalCodeRequired) {
            z2 = z2 && this.mPostalCode.isValid();
        }
        if (!this.mMobileNumberRequired) {
            return z2;
        }
        if (z2 && this.mCountryCode.isValid() && this.mMobileNumber.isValid()) {
            z = true;
        }
        return z;
    }

    public void validate() {
        if (this.mCardholderNameStatus == 2) {
            this.mCardholderName.validate();
        }
        if (this.mCardNumberRequired) {
            this.mCardNumber.validate();
        }
        if (this.mExpirationRequired) {
            this.mExpiration.validate();
        }
        if (this.mCvvRequired) {
            this.mCvv.validate();
        }
        if (this.mPostalCodeRequired) {
            this.mPostalCode.validate();
        }
        if (this.mMobileNumberRequired) {
            this.mCountryCode.validate();
            this.mMobileNumber.validate();
        }
    }

    public CardholderNameEditText getCardholderNameEditText() {
        return this.mCardholderName;
    }

    public CardEditText getCardEditText() {
        return this.mCardNumber;
    }

    public ExpirationDateEditText getExpirationDateEditText() {
        return this.mExpiration;
    }

    public CvvEditText getCvvEditText() {
        return this.mCvv;
    }

    public PostalCodeEditText getPostalCodeEditText() {
        return this.mPostalCode;
    }

    public CountryCodeEditText getCountryCodeEditText() {
        return this.mCountryCode;
    }

    public MobileNumberEditText getMobileNumberEditText() {
        return this.mMobileNumber;
    }

    public void setCardholderNameError(String str) {
        if (this.mCardholderNameStatus == 2) {
            this.mCardholderName.setError(str);
            if (!this.mCardNumber.isFocused() && !this.mExpiration.isFocused() && !this.mCvv.isFocused()) {
                requestEditTextFocus(this.mCardholderName);
            }
        }
    }

    public void setCardNumberError(String str) {
        if (this.mCardNumberRequired) {
            this.mCardNumber.setError(str);
            requestEditTextFocus(this.mCardNumber);
        }
    }

    public void setExpirationError(String str) {
        if (this.mExpirationRequired) {
            this.mExpiration.setError(str);
            if (!this.mCardNumber.isFocused()) {
                requestEditTextFocus(this.mExpiration);
            }
        }
    }

    public void setCvvError(String str) {
        if (this.mCvvRequired) {
            this.mCvv.setError(str);
            if (!this.mCardNumber.isFocused() && !this.mExpiration.isFocused()) {
                requestEditTextFocus(this.mCvv);
            }
        }
    }

    public void setPostalCodeError(String str) {
        if (this.mPostalCodeRequired) {
            this.mPostalCode.setError(str);
            if (!this.mCardNumber.isFocused() && !this.mExpiration.isFocused() && !this.mCvv.isFocused() && !this.mCardholderName.isFocused()) {
                requestEditTextFocus(this.mPostalCode);
            }
        }
    }

    public void setCountryCodeError(String str) {
        if (this.mMobileNumberRequired) {
            this.mCountryCode.setError(str);
            if (!this.mCardNumber.isFocused() && !this.mExpiration.isFocused() && !this.mCvv.isFocused() && !this.mCardholderName.isFocused() && !this.mPostalCode.isFocused()) {
                requestEditTextFocus(this.mCountryCode);
            }
        }
    }

    public void setMobileNumberError(String str) {
        if (this.mMobileNumberRequired) {
            this.mMobileNumber.setError(str);
            if (!this.mCardNumber.isFocused() && !this.mExpiration.isFocused() && !this.mCvv.isFocused() && !this.mCardholderName.isFocused() && !this.mPostalCode.isFocused() && !this.mCountryCode.isFocused()) {
                requestEditTextFocus(this.mMobileNumber);
            }
        }
    }

    private void requestEditTextFocus(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }

    public void closeSoftKeyboard() {
        this.mCardNumber.closeSoftKeyboard();
    }

    public String getCardholderName() {
        return this.mCardholderName.getText().toString();
    }

    public String getCardNumber() {
        return this.mCardNumber.getText().toString();
    }

    public String getExpirationMonth() {
        return this.mExpiration.getMonth();
    }

    public String getExpirationYear() {
        return this.mExpiration.getYear();
    }

    public String getCvv() {
        return this.mCvv.getText().toString();
    }

    public String getPostalCode() {
        return this.mPostalCode.getText().toString();
    }

    public String getCountryCode() {
        return this.mCountryCode.getCountryCode();
    }

    public String getMobileNumber() {
        return this.mMobileNumber.getMobileNumber();
    }

    public boolean isSaveCardCheckBoxChecked() {
        return this.mSaveCardCheckBox.isChecked();
    }

    public void onCardTypeChanged(CardType cardType) {
        this.mCvv.setCardType(cardType);
        CardEditText.OnCardTypeChangedListener onCardTypeChangedListener = this.mOnCardTypeChangedListener;
        if (onCardTypeChangedListener != null) {
            onCardTypeChangedListener.onCardTypeChanged(cardType);
        }
    }

    public void onFocusChange(View view, boolean z) {
        OnCardFormFieldFocusedListener onCardFormFieldFocusedListener;
        if (z && (onCardFormFieldFocusedListener = this.mOnCardFormFieldFocusedListener) != null) {
            onCardFormFieldFocusedListener.onCardFormFieldFocused(view);
        }
    }

    public void onClick(View view) {
        OnCardFormFieldFocusedListener onCardFormFieldFocusedListener = this.mOnCardFormFieldFocusedListener;
        if (onCardFormFieldFocusedListener != null) {
            onCardFormFieldFocusedListener.onCardFormFieldFocused(view);
        }
    }

    public void afterTextChanged(Editable editable) {
        boolean isValid = isValid();
        if (this.mValid != isValid) {
            this.mValid = isValid;
            OnCardFormValidListener onCardFormValidListener = this.mOnCardFormValidListener;
            if (onCardFormValidListener != null) {
                onCardFormValidListener.onCardFormValid(isValid);
            }
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        OnCardFormSubmitListener onCardFormSubmitListener;
        if (i != 2 || (onCardFormSubmitListener = this.mOnCardFormSubmitListener) == null) {
            return false;
        }
        onCardFormSubmitListener.onCardFormSubmit();
        return true;
    }
}
