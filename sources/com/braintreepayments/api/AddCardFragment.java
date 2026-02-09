package com.braintreepayments.api;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import com.braintreepayments.api.dropin.R;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.utils.CardType;
import com.braintreepayments.cardform.view.AccessibleSupportedCardTypesView;
import com.braintreepayments.cardform.view.CardEditText;
import com.braintreepayments.cardform.view.CardForm;
import java.util.List;

public class AddCardFragment extends DropInFragment implements OnCardFormSubmitListener, CardEditText.OnCardTypeChangedListener {
    private static final String EXTRA_CARD_NUMBER = "EXTRA_CARD_NUMBER";
    private static final String EXTRA_DROP_IN_REQUEST = "EXTRA_DROP_IN_REQUEST";
    private AnimatedButtonView animatedButtonView;
    BraintreeErrorInspector braintreeErrorInspector = new BraintreeErrorInspector();
    CardForm cardForm;
    DropInViewModel dropInViewModel;
    AccessibleSupportedCardTypesView supportedCardTypesView;

    static AddCardFragment from(DropInRequest dropInRequest, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(EXTRA_DROP_IN_REQUEST, dropInRequest);
        if (str != null) {
            bundle.putString(EXTRA_CARD_NUMBER, str);
        }
        AddCardFragment addCardFragment = new AddCardFragment();
        addCardFragment.setArguments(bundle);
        return addCardFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bt_fragment_add_card, viewGroup, false);
        this.cardForm = (CardForm) inflate.findViewById(R.id.bt_card_form);
        this.supportedCardTypesView = (AccessibleSupportedCardTypesView) inflate.findViewById(R.id.bt_supported_card_types);
        if (((DropInRequest) getArguments().getParcelable(EXTRA_DROP_IN_REQUEST)).areCardLogosDisabled()) {
            this.supportedCardTypesView.setVisibility(8);
        }
        this.animatedButtonView = (AnimatedButtonView) inflate.findViewById(R.id.bt_animated_button_view);
        NoticeOfCollectionHelper.setNoticeOfCollectionText((TextView) inflate.findViewById(R.id.bt_privacy_policy), getString(R.string.bt_notice_of_collection));
        this.animatedButtonView.setClickListener(new AddCardFragment$$ExternalSyntheticLambda0(this));
        this.cardForm.getCardEditText().displayCardTypeIcon(false);
        this.cardForm.cardRequired(true).setup(requireActivity());
        this.cardForm.setOnCardTypeChangedListener(this);
        this.cardForm.setOnCardFormSubmitListener(this);
        DropInViewModel dropInViewModel2 = (DropInViewModel) new ViewModelProvider(requireActivity()).get(DropInViewModel.class);
        this.dropInViewModel = dropInViewModel2;
        dropInViewModel2.getSupportedCardTypes().observe(getViewLifecycleOwner(), new AddCardFragment$$ExternalSyntheticLambda1(this));
        this.dropInViewModel.getCardTokenizationError().observe(getViewLifecycleOwner(), new AddCardFragment$$ExternalSyntheticLambda2(this));
        requireActivity().getOnBackPressedDispatcher().addCallback(requireActivity(), new OnBackPressedCallback(true) {
            public void handleOnBackPressed() {
                AddCardFragment.this.getParentFragmentManager().popBackStack();
                remove();
            }
        });
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.bt_toolbar);
        toolbar.setNavigationContentDescription(R.string.bt_back);
        toolbar.setTouchscreenBlocksFocus(false);
        toolbar.setNavigationOnClickListener(new AddCardFragment$$ExternalSyntheticLambda3(this));
        sendAnalyticsEvent("card.selected");
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$0$com-braintreepayments-api-AddCardFragment  reason: not valid java name */
    public /* synthetic */ void m325lambda$onCreateView$0$combraintreepaymentsapiAddCardFragment(View view) {
        onCardFormSubmit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$1$com-braintreepayments-api-AddCardFragment  reason: not valid java name */
    public /* synthetic */ void m326lambda$onCreateView$1$combraintreepaymentsapiAddCardFragment(List list) {
        this.supportedCardTypesView.setSupportedCardTypes((CardType[]) list.toArray(new CardType[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$2$com-braintreepayments-api-AddCardFragment  reason: not valid java name */
    public /* synthetic */ void m327lambda$onCreateView$2$combraintreepaymentsapiAddCardFragment(Exception exc) {
        if (exc instanceof ErrorWithResponse) {
            setErrors((ErrorWithResponse) exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$3$com-braintreepayments-api-AddCardFragment  reason: not valid java name */
    public /* synthetic */ void m328lambda$onCreateView$3$combraintreepaymentsapiAddCardFragment(View view) {
        getParentFragmentManager().popBackStack();
    }

    public void onResume() {
        String string;
        super.onResume();
        this.cardForm.getCardEditText().requestFocus();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(EXTRA_CARD_NUMBER)) != null) {
            this.cardForm.getCardEditText().setText(string);
            onCardTypeChanged(this.cardForm.getCardEditText().getCardType());
            Bundle bundle = new Bundle();
            bundle.putString(EXTRA_DROP_IN_REQUEST, arguments.getString(EXTRA_DROP_IN_REQUEST));
            setArguments(bundle);
        }
    }

    private boolean isValid() {
        return this.cardForm.isValid() && isCardTypeValid();
    }

    private boolean isCardTypeValid() {
        if (this.dropInViewModel.getSupportedCardTypes().getValue() != null) {
            return this.dropInViewModel.getSupportedCardTypes().getValue().contains(this.cardForm.getCardEditText().getCardType());
        }
        return false;
    }

    private void showCardNotSupportedError() {
        this.cardForm.getCardEditText().setError(requireContext().getString(R.string.bt_card_not_accepted));
        this.animatedButtonView.showButton();
    }

    /* access modifiers changed from: package-private */
    public void setErrors(ErrorWithResponse errorWithResponse) {
        if (this.braintreeErrorInspector.isDuplicatePaymentError(errorWithResponse)) {
            this.cardForm.setCardNumberError(getString(R.string.bt_card_already_exists));
        } else {
            BraintreeError errorFor = errorWithResponse.errorFor("creditCard");
            if (!(errorFor == null || errorFor.errorFor("number") == null)) {
                this.cardForm.setCardNumberError(requireContext().getString(R.string.bt_card_number_invalid));
            }
        }
        this.animatedButtonView.showButton();
    }

    public void onCardFormSubmit() {
        if (isValid()) {
            this.animatedButtonView.showLoading();
            sendDropInEvent(DropInEvent.createAddCardSubmitEvent(this.cardForm.getCardNumber()));
        } else if (!this.cardForm.isValid()) {
            this.animatedButtonView.showButton();
            this.cardForm.validate();
        } else if (!isCardTypeValid()) {
            showCardNotSupportedError();
        }
    }

    public void onCardTypeChanged(CardType cardType) {
        if (cardType != CardType.EMPTY || this.dropInViewModel.getSupportedCardTypes().getValue() == null) {
            this.supportedCardTypesView.setSelected(cardType);
        } else {
            this.supportedCardTypesView.setSupportedCardTypes((CardType[]) this.dropInViewModel.getSupportedCardTypes().getValue().toArray(new CardType[0]));
        }
    }
}
