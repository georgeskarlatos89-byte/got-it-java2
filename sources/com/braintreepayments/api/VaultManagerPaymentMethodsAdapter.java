package com.braintreepayments.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class VaultManagerPaymentMethodsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final View.OnClickListener clickListener;
    private final List<PaymentMethodNonce> vaultedPaymentMethodNonces;

    VaultManagerPaymentMethodsAdapter(View.OnClickListener onClickListener, List<PaymentMethodNonce> list) {
        this.clickListener = onClickListener;
        this.vaultedPaymentMethodNonces = list;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(new PaymentMethodItemView(viewGroup.getContext()));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        PaymentMethodItemView paymentMethodItemView = (PaymentMethodItemView) viewHolder.itemView;
        paymentMethodItemView.setPaymentMethod(this.vaultedPaymentMethodNonces.get(i), true);
        paymentMethodItemView.setOnDeleteIconClick(new VaultManagerPaymentMethodsAdapter$$ExternalSyntheticLambda0(this, paymentMethodItemView));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onBindViewHolder$0$com-braintreepayments-api-VaultManagerPaymentMethodsAdapter  reason: not valid java name */
    public /* synthetic */ void m404lambda$onBindViewHolder$0$combraintreepaymentsapiVaultManagerPaymentMethodsAdapter(PaymentMethodItemView paymentMethodItemView, View view) {
        View.OnClickListener onClickListener = this.clickListener;
        if (onClickListener != null) {
            onClickListener.onClick(paymentMethodItemView);
        }
    }

    public int getItemCount() {
        return this.vaultedPaymentMethodNonces.size();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<PaymentMethodNonce> getPaymentMethodNonces() {
        return new ArrayList<>(this.vaultedPaymentMethodNonces);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(View view) {
            super(view);
        }
    }
}
