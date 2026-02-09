package com.braintreepayments.api;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;
import java.util.List;

public class VaultManagerFragment extends DropInFragment implements View.OnClickListener {
    VaultManagerPaymentMethodsAdapter adapter;
    DropInViewModel dropInViewModel;
    private RecyclerView vaultManagerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bt_fragment_vault_manager, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bt_vault_manager_list);
        this.vaultManagerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        DropInViewModel dropInViewModel2 = (DropInViewModel) new ViewModelProvider(requireActivity()).get(DropInViewModel.class);
        this.dropInViewModel = dropInViewModel2;
        dropInViewModel2.getVaultedPaymentMethods().observe(getViewLifecycleOwner(), new VaultManagerFragment$$ExternalSyntheticLambda0(this));
        inflate.findViewById(R.id.bt_vault_manager_close).setOnClickListener(new VaultManagerFragment$$ExternalSyntheticLambda1(this));
        sendAnalyticsEvent("manager.appeared");
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$0$com-braintreepayments-api-VaultManagerFragment  reason: not valid java name */
    public /* synthetic */ void m403lambda$onCreateView$0$combraintreepaymentsapiVaultManagerFragment(View view) {
        sendDropInEvent(new DropInEvent(DropInEventType.DISMISS_VAULT_MANAGER));
    }

    public void onClick(View view) {
        if (view instanceof PaymentMethodItemView) {
            sendDropInEvent(DropInEvent.createDeleteVaultedPaymentMethodNonceEvent(((PaymentMethodItemView) view).getPaymentMethodNonce()));
        }
    }

    /* access modifiers changed from: private */
    public void showVaultedPaymentMethods(List<PaymentMethodNonce> list) {
        VaultManagerPaymentMethodsAdapter vaultManagerPaymentMethodsAdapter = new VaultManagerPaymentMethodsAdapter(this, list);
        this.adapter = vaultManagerPaymentMethodsAdapter;
        this.vaultManagerView.setAdapter(vaultManagerPaymentMethodsAdapter);
    }
}
