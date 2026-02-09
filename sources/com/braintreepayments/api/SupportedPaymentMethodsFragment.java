package com.braintreepayments.api;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;
import java.util.List;

public class SupportedPaymentMethodsFragment extends DropInFragment implements SupportedPaymentMethodSelectedListener, VaultedPaymentMethodSelectedListener {
    private DropInRequest dropInRequest;
    DropInViewModel dropInViewModel;
    View loadingIndicatorWrapper;
    private TextView supportedPaymentMethodsHeader;
    RecyclerView supportedPaymentMethodsView;
    private Button vaultManagerButton;
    private View vaultedPaymentMethodsContainer;
    RecyclerView vaultedPaymentMethodsView;
    ViewState viewState;

    enum ViewState {
        LOADING,
        SHOW_PAYMENT_METHODS,
        DROP_IN_FINISHING
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dropInRequest = (DropInRequest) arguments.getParcelable("EXTRA_DROP_IN_REQUEST");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bt_fragment_supported_payment_methods, viewGroup, false);
        this.loadingIndicatorWrapper = inflate.findViewById(R.id.bt_select_payment_method_loader_wrapper);
        this.supportedPaymentMethodsHeader = (TextView) inflate.findViewById(R.id.bt_supported_payment_methods_header);
        this.supportedPaymentMethodsView = (RecyclerView) inflate.findViewById(R.id.bt_supported_payment_methods);
        this.vaultedPaymentMethodsContainer = inflate.findViewById(R.id.bt_vaulted_payment_methods_wrapper);
        this.vaultedPaymentMethodsView = (RecyclerView) inflate.findViewById(R.id.bt_vaulted_payment_methods);
        this.vaultManagerButton = (Button) inflate.findViewById(R.id.bt_vault_edit_button);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), 1, false);
        this.supportedPaymentMethodsView.setLayoutManager(linearLayoutManager);
        this.supportedPaymentMethodsView.addItemDecoration(new DividerItemDecoration(requireActivity(), linearLayoutManager.getOrientation()));
        this.vaultedPaymentMethodsView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
        new LinearSnapHelper().attachToRecyclerView(this.vaultedPaymentMethodsView);
        this.dropInViewModel = (DropInViewModel) new ViewModelProvider(requireActivity()).get(DropInViewModel.class);
        if (hasSupportedPaymentMethods()) {
            setViewState(ViewState.SHOW_PAYMENT_METHODS);
        } else {
            setViewState(ViewState.LOADING);
        }
        this.dropInViewModel.getSupportedPaymentMethods().observe(getViewLifecycleOwner(), new SupportedPaymentMethodsFragment$$ExternalSyntheticLambda0(this));
        this.dropInViewModel.getVaultedPaymentMethods().observe(getViewLifecycleOwner(), new SupportedPaymentMethodsFragment$$ExternalSyntheticLambda1(this));
        this.dropInViewModel.getDropInState().observe(getViewLifecycleOwner(), new SupportedPaymentMethodsFragment$$ExternalSyntheticLambda2(this));
        this.dropInViewModel.getUserCanceledError().observe(getViewLifecycleOwner(), new SupportedPaymentMethodsFragment$$ExternalSyntheticLambda3(this));
        this.vaultManagerButton.setOnClickListener(new SupportedPaymentMethodsFragment$$ExternalSyntheticLambda4(this));
        sendAnalyticsEvent("appeared");
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$0$com-braintreepayments-api-SupportedPaymentMethodsFragment  reason: not valid java name */
    public /* synthetic */ void m396lambda$onCreateView$0$combraintreepaymentsapiSupportedPaymentMethodsFragment(List list) {
        if (hasSupportedPaymentMethods()) {
            setViewState(ViewState.SHOW_PAYMENT_METHODS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$1$com-braintreepayments-api-SupportedPaymentMethodsFragment  reason: not valid java name */
    public /* synthetic */ void m397lambda$onCreateView$1$combraintreepaymentsapiSupportedPaymentMethodsFragment(List list) {
        if (hasVaultedPaymentMethods()) {
            refreshView();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$2$com-braintreepayments-api-SupportedPaymentMethodsFragment  reason: not valid java name */
    public /* synthetic */ void m398lambda$onCreateView$2$combraintreepaymentsapiSupportedPaymentMethodsFragment(DropInState dropInState) {
        if (dropInState == DropInState.WILL_FINISH) {
            setViewState(ViewState.DROP_IN_FINISHING);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$3$com-braintreepayments-api-SupportedPaymentMethodsFragment  reason: not valid java name */
    public /* synthetic */ void m399lambda$onCreateView$3$combraintreepaymentsapiSupportedPaymentMethodsFragment(Exception exc) {
        if ((exc instanceof UserCanceledException) && hasSupportedPaymentMethods()) {
            setViewState(ViewState.SHOW_PAYMENT_METHODS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$4$com-braintreepayments-api-SupportedPaymentMethodsFragment  reason: not valid java name */
    public /* synthetic */ void m400lambda$onCreateView$4$combraintreepaymentsapiSupportedPaymentMethodsFragment(View view) {
        sendDropInEvent(new DropInEvent(DropInEventType.SHOW_VAULT_MANAGER));
    }

    public void onResume() {
        super.onResume();
        if (this.viewState == ViewState.LOADING && hasSupportedPaymentMethods()) {
            setViewState(ViewState.SHOW_PAYMENT_METHODS);
        }
    }

    private boolean hasSupportedPaymentMethods() {
        return this.dropInViewModel.getSupportedPaymentMethods().getValue() != null;
    }

    private boolean hasVaultedPaymentMethods() {
        return this.dropInViewModel.getVaultedPaymentMethods().getValue() != null;
    }

    private void setViewState(ViewState viewState2) {
        this.viewState = viewState2;
        refreshView();
    }

    /* renamed from: com.braintreepayments.api.SupportedPaymentMethodsFragment$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$SupportedPaymentMethodsFragment$ViewState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.braintreepayments.api.SupportedPaymentMethodsFragment$ViewState[] r0 = com.braintreepayments.api.SupportedPaymentMethodsFragment.ViewState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$braintreepayments$api$SupportedPaymentMethodsFragment$ViewState = r0
                com.braintreepayments.api.SupportedPaymentMethodsFragment$ViewState r1 = com.braintreepayments.api.SupportedPaymentMethodsFragment.ViewState.LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$braintreepayments$api$SupportedPaymentMethodsFragment$ViewState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braintreepayments.api.SupportedPaymentMethodsFragment$ViewState r1 = com.braintreepayments.api.SupportedPaymentMethodsFragment.ViewState.DROP_IN_FINISHING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$braintreepayments$api$SupportedPaymentMethodsFragment$ViewState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.braintreepayments.api.SupportedPaymentMethodsFragment$ViewState r1 = com.braintreepayments.api.SupportedPaymentMethodsFragment.ViewState.SHOW_PAYMENT_METHODS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.SupportedPaymentMethodsFragment.AnonymousClass1.<clinit>():void");
        }
    }

    private void refreshView() {
        int i = AnonymousClass1.$SwitchMap$com$braintreepayments$api$SupportedPaymentMethodsFragment$ViewState[this.viewState.ordinal()];
        if (i == 1 || i == 2) {
            this.vaultedPaymentMethodsContainer.setVisibility(8);
            showLoader();
        } else if (i == 3) {
            hideLoader();
            showSupportedPaymentMethods();
            if (hasVaultedPaymentMethods()) {
                showVaultedPaymentMethods();
            }
        }
    }

    private void showLoader() {
        this.loadingIndicatorWrapper.setVisibility(0);
    }

    private void hideLoader() {
        this.loadingIndicatorWrapper.setVisibility(8);
    }

    private void showSupportedPaymentMethods() {
        this.supportedPaymentMethodsView.setAdapter(new SupportedPaymentMethodsAdapter(this.dropInViewModel.getSupportedPaymentMethods().getValue(), this));
    }

    public void onPaymentMethodSelected(DropInPaymentMethod dropInPaymentMethod) {
        if (this.viewState == ViewState.SHOW_PAYMENT_METHODS) {
            if (dropInPaymentMethod == DropInPaymentMethod.PAYPAL || dropInPaymentMethod == DropInPaymentMethod.VENMO) {
                setViewState(ViewState.LOADING);
            }
            sendDropInEvent(DropInEvent.createSupportedPaymentMethodSelectedEvent(dropInPaymentMethod));
        }
    }

    public void onVaultedPaymentMethodSelected(PaymentMethodNonce paymentMethodNonce) {
        sendDropInEvent(DropInEvent.createVaultedPaymentMethodSelectedEvent(paymentMethodNonce));
    }

    private void showVaultedPaymentMethods() {
        List value = this.dropInViewModel.getVaultedPaymentMethods().getValue();
        if (containsCardNonce(value)) {
            sendAnalyticsEvent("vaulted-card.appear");
        }
        if (value == null || value.size() <= 0) {
            this.supportedPaymentMethodsHeader.setText(R.string.bt_select_payment_method);
            this.vaultedPaymentMethodsContainer.setVisibility(8);
            return;
        }
        this.supportedPaymentMethodsHeader.setText(R.string.bt_other);
        this.vaultedPaymentMethodsContainer.setVisibility(0);
        this.vaultedPaymentMethodsView.setAdapter(new VaultedPaymentMethodsAdapter(value, this));
        if (this.dropInRequest.isVaultManagerEnabled()) {
            this.vaultManagerButton.setVisibility(0);
        }
    }

    private static boolean containsCardNonce(List<PaymentMethodNonce> list) {
        if (list == null) {
            return false;
        }
        for (PaymentMethodNonce paymentMethodNonce : list) {
            if (paymentMethodNonce instanceof CardNonce) {
                return true;
            }
        }
        return false;
    }
}
