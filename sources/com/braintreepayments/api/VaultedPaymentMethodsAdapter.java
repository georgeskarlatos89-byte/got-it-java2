package com.braintreepayments.api;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;
import java.util.List;

class VaultedPaymentMethodsAdapter extends RecyclerView.Adapter<VaultedPaymentMethodViewHolder> {
    private final VaultedPaymentMethodSelectedListener listener;
    private final List<PaymentMethodNonce> paymentMethodNonces;

    VaultedPaymentMethodsAdapter(List<PaymentMethodNonce> list, VaultedPaymentMethodSelectedListener vaultedPaymentMethodSelectedListener) {
        this.listener = vaultedPaymentMethodSelectedListener;
        this.paymentMethodNonces = list;
    }

    public VaultedPaymentMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VaultedPaymentMethodViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bt_vaulted_payment_method_card, viewGroup, false));
    }

    public void onBindViewHolder(VaultedPaymentMethodViewHolder vaultedPaymentMethodViewHolder, int i) {
        PaymentMethodNonce paymentMethodNonce = this.paymentMethodNonces.get(i);
        vaultedPaymentMethodViewHolder.bind(paymentMethodNonce);
        vaultedPaymentMethodViewHolder.setOnClickListener(new VaultedPaymentMethodsAdapter$$ExternalSyntheticLambda0(this, paymentMethodNonce));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onBindViewHolder$0$com-braintreepayments-api-VaultedPaymentMethodsAdapter  reason: not valid java name */
    public /* synthetic */ void m405lambda$onBindViewHolder$0$combraintreepaymentsapiVaultedPaymentMethodsAdapter(PaymentMethodNonce paymentMethodNonce, View view) {
        this.listener.onVaultedPaymentMethodSelected(paymentMethodNonce);
    }

    public int getItemCount() {
        return this.paymentMethodNonces.size();
    }
}
