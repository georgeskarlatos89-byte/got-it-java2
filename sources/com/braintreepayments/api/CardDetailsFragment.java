package com.braintreepayments.api;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.braintreepayments.api.dropin.R;
import com.braintreepayments.cardform.OnCardFormFieldFocusedListener;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.view.CardEditText;
import com.braintreepayments.cardform.view.CardForm;

public class CardDetailsFragment extends DropInFragment implements OnCardFormSubmitListener, OnCardFormFieldFocusedListener {
    AnimatedButtonView animatedButtonView;
    BraintreeErrorInspector braintreeErrorInspector = new BraintreeErrorInspector();
    CardForm cardForm;
    private String cardNumber;
    private CardFormConfiguration configuration;
    private DropInRequest dropInRequest;
    DropInViewModel dropInViewModel;
    private Boolean isTokenizationKeyAuth;

    static CardDetailsFragment from(DropInRequest dropInRequest2, String str, Configuration configuration2, boolean z) {
        CardFormConfiguration cardFormConfiguration = new CardFormConfiguration(configuration2.isCvvChallengePresent(), configuration2.isPostalCodeChallengePresent());
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DROP_IN_REQUEST", dropInRequest2);
        bundle.putString("EXTRA_CARD_NUMBER", str);
        bundle.putParcelable("EXTRA_CARD_FORM_CONFIGURATION", cardFormConfiguration);
        bundle.putBoolean("EXTRA_AUTH_IS_TOKENIZATION_KEY", z);
        CardDetailsFragment cardDetailsFragment = new CardDetailsFragment();
        cardDetailsFragment.setArguments(bundle);
        return cardDetailsFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dropInRequest = (DropInRequest) arguments.getParcelable("EXTRA_DROP_IN_REQUEST");
            this.configuration = (CardFormConfiguration) arguments.getParcelable("EXTRA_CARD_FORM_CONFIGURATION");
            this.cardNumber = arguments.getString("EXTRA_CARD_NUMBER");
            this.isTokenizationKeyAuth = Boolean.valueOf(arguments.getBoolean("EXTRA_AUTH_IS_TOKENIZATION_KEY"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.bt_fragment_card_details, viewGroup, false);
        this.cardForm = (CardForm) inflate.findViewById(R.id.bt_card_form);
        AnimatedButtonView animatedButtonView2 = (AnimatedButtonView) inflate.findViewById(R.id.bt_animated_button_view);
        this.animatedButtonView = animatedButtonView2;
        animatedButtonView2.setClickListener(new CardDetailsFragment$$ExternalSyntheticLambda0(this));
        NoticeOfCollectionHelper.setNoticeOfCollectionText((TextView) inflate.findViewById(R.id.bt_privacy_policy), getString(R.string.bt_notice_of_collection));
        DropInViewModel dropInViewModel2 = (DropInViewModel) new ViewModelProvider(requireActivity()).get(DropInViewModel.class);
        this.dropInViewModel = dropInViewModel2;
        dropInViewModel2.getCardTokenizationError().observe(getViewLifecycleOwner(), new CardDetailsFragment$$ExternalSyntheticLambda1(this));
        this.dropInViewModel.getUserCanceledError().observe(getViewLifecycleOwner(), new CardDetailsFragment$$ExternalSyntheticLambda2(this));
        requireActivity().getOnBackPressedDispatcher().addCallback(requireActivity(), new OnBackPressedCallback(true) {
            public void handleOnBackPressed() {
                CardDetailsFragment.this.getParentFragmentManager().popBackStack();
                remove();
            }
        });
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.bt_toolbar);
        toolbar.setNavigationContentDescription(R.string.bt_back);
        toolbar.setTouchscreenBlocksFocus(false);
        toolbar.setNavigationOnClickListener(new CardDetailsFragment$$ExternalSyntheticLambda3(this));
        if (!this.isTokenizationKeyAuth.booleanValue() && this.dropInRequest.getAllowVaultCardOverride()) {
            z = true;
        }
        this.cardForm.cardRequired(true).expirationRequired(true).cvvRequired(this.configuration.isCvvChallengePresent()).postalCodeRequired(this.configuration.isPostalCodeChallengePresent()).cardholderName(this.dropInRequest.getCardholderNameStatus()).saveCardCheckBoxVisible(z).saveCardCheckBoxChecked(this.dropInRequest.getVaultCardDefaultValue()).setup(requireActivity());
        this.cardForm.maskCardNumber(this.dropInRequest.getMaskCardNumber());
        this.cardForm.maskCvv(this.dropInRequest.getMaskSecurityCode());
        this.cardForm.setOnFormFieldFocusedListener(this);
        this.cardForm.setOnCardFormSubmitListener(this);
        this.cardForm.getCardEditText().setText(this.cardNumber);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$0$com-braintreepayments-api-CardDetailsFragment  reason: not valid java name */
    public /* synthetic */ void m350lambda$onCreateView$0$combraintreepaymentsapiCardDetailsFragment(View view) {
        onCardFormSubmit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$1$com-braintreepayments-api-CardDetailsFragment  reason: not valid java name */
    public /* synthetic */ void m351lambda$onCreateView$1$combraintreepaymentsapiCardDetailsFragment(Exception exc) {
        if (exc instanceof ErrorWithResponse) {
            setErrors((ErrorWithResponse) exc);
        }
        this.animatedButtonView.showButton();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$2$com-braintreepayments-api-CardDetailsFragment  reason: not valid java name */
    public /* synthetic */ void m352lambda$onCreateView$2$combraintreepaymentsapiCardDetailsFragment(Exception exc) {
        this.animatedButtonView.showButton();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$3$com-braintreepayments-api-CardDetailsFragment  reason: not valid java name */
    public /* synthetic */ void m353lambda$onCreateView$3$combraintreepaymentsapiCardDetailsFragment(View view) {
        getParentFragmentManager().popBackStack();
    }

    public void onResume() {
        super.onResume();
        if (this.dropInRequest.getCardholderNameStatus() == 0) {
            this.cardForm.getExpirationDateEditText().requestFocus();
        } else {
            this.cardForm.getCardholderNameEditText().requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    public void setErrors(ErrorWithResponse errorWithResponse) {
        if (this.braintreeErrorInspector.isDuplicatePaymentError(errorWithResponse)) {
            this.cardForm.setCardNumberError(getString(R.string.bt_card_already_exists));
            return;
        }
        BraintreeError errorFor = errorWithResponse.errorFor("unionPayEnrollment");
        if (errorFor == null) {
            errorFor = errorWithResponse.errorFor("creditCard");
        }
        if (errorFor != null) {
            if (!(errorFor.errorFor("expirationYear") == null && errorFor.errorFor("expirationMonth") == null && errorFor.errorFor("expirationDate") == null)) {
                this.cardForm.setExpirationError(requireContext().getString(R.string.bt_expiration_invalid));
            }
            if (errorFor.errorFor("cvv") != null) {
                this.cardForm.setCvvError(requireContext().getString(R.string.bt_cvv_invalid, new Object[]{requireContext().getString(this.cardForm.getCardEditText().getCardType().getSecurityCodeName())}));
            }
            if (errorFor.errorFor("billingAddress") != null) {
                this.cardForm.setPostalCodeError(requireContext().getString(R.string.bt_postal_code_invalid));
            }
            if (errorFor.errorFor("mobileCountryCode") != null) {
                this.cardForm.setCountryCodeError(requireContext().getString(R.string.bt_country_code_invalid));
            }
            if (errorFor.errorFor("mobileNumber") != null) {
                this.cardForm.setMobileNumberError(requireContext().getString(R.string.bt_mobile_number_invalid));
            }
        }
    }

    public void onCardFormSubmit() {
        hideSoftKeyboard();
        if (this.cardForm.isValid()) {
            this.animatedButtonView.showLoading();
            boolean z = !this.isTokenizationKeyAuth.booleanValue() && this.cardForm.isSaveCardCheckBoxChecked();
            Card card = new Card();
            card.setCardholderName(this.cardForm.getCardholderName());
            card.setNumber(this.cardForm.getCardNumber());
            card.setExpirationMonth(this.cardForm.getExpirationMonth());
            card.setExpirationYear(this.cardForm.getExpirationYear());
            card.setCvv(this.cardForm.getCvv());
            card.setPostalCode(this.cardForm.getPostalCode());
            card.setShouldValidate(z);
            sendDropInEvent(DropInEvent.createCardDetailsSubmitEvent(card));
            return;
        }
        this.animatedButtonView.showButton();
        this.cardForm.validate();
    }

    public void onCardFormFieldFocused(View view) {
        if (view instanceof CardEditText) {
            sendDropInEvent(DropInEvent.createEditCardNumberEvent(this.cardForm.getCardNumber()));
        }
    }

    private void hideSoftKeyboard() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }
}
