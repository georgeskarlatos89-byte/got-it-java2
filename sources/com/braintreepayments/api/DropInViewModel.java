package com.braintreepayments.api;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.braintreepayments.cardform.utils.CardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DropInViewModel extends ViewModel {
    private final MutableLiveData<BottomSheetState> bottomSheetState = new MutableLiveData<>(BottomSheetState.HIDDEN);
    private final MutableLiveData<Exception> cardTokenizationError = new MutableLiveData<>();
    private final MutableLiveData<DropInState> dropInState = new MutableLiveData<>(DropInState.IDLE);
    private final MutableLiveData<List<CardType>> supportedCardTypes = new MutableLiveData<>();
    private final MutableLiveData<List<DropInPaymentMethod>> supportedPaymentMethods = new MutableLiveData<>();
    private final MutableLiveData<Exception> userCanceledError = new MutableLiveData<>();
    private final MutableLiveData<List<PaymentMethodNonce>> vaultedPaymentMethods = new MutableLiveData<>();

    /* access modifiers changed from: package-private */
    public LiveData<BottomSheetState> getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* access modifiers changed from: package-private */
    public void setBottomSheetState(BottomSheetState bottomSheetState2) {
        this.bottomSheetState.setValue(bottomSheetState2);
    }

    /* access modifiers changed from: package-private */
    public void setVaultedPaymentMethods(List<PaymentMethodNonce> list) {
        this.vaultedPaymentMethods.setValue(list);
    }

    /* access modifiers changed from: package-private */
    public LiveData<List<PaymentMethodNonce>> getVaultedPaymentMethods() {
        return this.vaultedPaymentMethods;
    }

    /* access modifiers changed from: package-private */
    public void setSupportedPaymentMethods(List<DropInPaymentMethod> list) {
        this.supportedPaymentMethods.setValue(list);
    }

    /* access modifiers changed from: package-private */
    public LiveData<List<DropInPaymentMethod>> getSupportedPaymentMethods() {
        return this.supportedPaymentMethods;
    }

    /* access modifiers changed from: package-private */
    public void setSupportedCardTypes(List<CardType> list) {
        this.supportedCardTypes.setValue(list);
    }

    /* access modifiers changed from: package-private */
    public LiveData<List<CardType>> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    /* access modifiers changed from: package-private */
    public LiveData<Exception> getCardTokenizationError() {
        return this.cardTokenizationError;
    }

    /* access modifiers changed from: package-private */
    public void setCardTokenizationError(Exception exc) {
        this.cardTokenizationError.setValue(exc);
    }

    /* access modifiers changed from: package-private */
    public LiveData<Exception> getUserCanceledError() {
        return this.userCanceledError;
    }

    /* access modifiers changed from: package-private */
    public void setUserCanceledError(Exception exc) {
        this.userCanceledError.setValue(exc);
    }

    /* access modifiers changed from: package-private */
    public void removeVaultedPaymentMethodNonce(PaymentMethodNonce paymentMethodNonce) {
        List value = this.vaultedPaymentMethods.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList(value);
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((PaymentMethodNonce) it.next()).getString().equals(paymentMethodNonce.getString())) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.vaultedPaymentMethods.setValue(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public LiveData<DropInState> getDropInState() {
        return this.dropInState;
    }

    /* access modifiers changed from: package-private */
    public void setDropInState(DropInState dropInState2) {
        this.dropInState.setValue(dropInState2);
    }
}
