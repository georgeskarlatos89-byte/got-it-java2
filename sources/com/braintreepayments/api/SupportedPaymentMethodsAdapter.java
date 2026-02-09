package com.braintreepayments.api;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;
import java.util.List;

class SupportedPaymentMethodsAdapter extends RecyclerView.Adapter<SupportedPaymentMethodViewHolder> {
    private final SupportedPaymentMethodSelectedListener listener;
    private final List<DropInPaymentMethod> supportedPaymentMethods;

    SupportedPaymentMethodsAdapter(List<DropInPaymentMethod> list, SupportedPaymentMethodSelectedListener supportedPaymentMethodSelectedListener) {
        this.listener = supportedPaymentMethodSelectedListener;
        this.supportedPaymentMethods = list;
    }

    public SupportedPaymentMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SupportedPaymentMethodViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bt_payment_method_list_item, viewGroup, false));
    }

    public void onBindViewHolder(SupportedPaymentMethodViewHolder supportedPaymentMethodViewHolder, int i) {
        DropInPaymentMethod dropInPaymentMethod = this.supportedPaymentMethods.get(i);
        supportedPaymentMethodViewHolder.bind(dropInPaymentMethod);
        supportedPaymentMethodViewHolder.setOnClickListener(new SupportedPaymentMethodsAdapter$$ExternalSyntheticLambda0(this, dropInPaymentMethod));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onBindViewHolder$0$com-braintreepayments-api-SupportedPaymentMethodsAdapter  reason: not valid java name */
    public /* synthetic */ void m395lambda$onBindViewHolder$0$combraintreepaymentsapiSupportedPaymentMethodsAdapter(DropInPaymentMethod dropInPaymentMethod, View view) {
        this.listener.onPaymentMethodSelected(dropInPaymentMethod);
    }

    public int getItemCount() {
        return this.supportedPaymentMethods.size();
    }
}
