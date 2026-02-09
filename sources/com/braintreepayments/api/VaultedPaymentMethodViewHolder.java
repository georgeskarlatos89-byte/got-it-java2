package com.braintreepayments.api;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;

class VaultedPaymentMethodViewHolder extends RecyclerView.ViewHolder {
    private final TextView description;
    private final ImageView icon;
    private final PaymentMethodInspector nonceInspector = new PaymentMethodInspector();
    private final TextView title;

    VaultedPaymentMethodViewHolder(View view) {
        super(view);
        this.icon = (ImageView) view.findViewById(R.id.bt_payment_method_icon);
        this.title = (TextView) view.findViewById(R.id.bt_payment_method_title);
        this.description = (TextView) view.findViewById(R.id.bt_payment_method_description);
    }

    /* access modifiers changed from: package-private */
    public void bind(PaymentMethodNonce paymentMethodNonce) {
        DropInPaymentMethod paymentMethod = this.nonceInspector.getPaymentMethod(paymentMethodNonce);
        this.title.setText(paymentMethod.getLocalizedName());
        this.icon.setImageResource(paymentMethod.getVaultedDrawable());
        this.description.setText(this.nonceInspector.getPaymentMethodDescription(paymentMethodNonce));
    }

    /* access modifiers changed from: package-private */
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.itemView.setOnClickListener(onClickListener);
    }
}
