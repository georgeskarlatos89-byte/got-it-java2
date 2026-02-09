package com.braintreepayments.api;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.api.dropin.R;

class SupportedPaymentMethodViewHolder extends RecyclerView.ViewHolder {
    private final ImageView icon;
    private final TextView name;

    SupportedPaymentMethodViewHolder(View view) {
        super(view);
        this.icon = (ImageView) view.findViewById(R.id.bt_payment_method_icon);
        this.name = (TextView) view.findViewById(R.id.bt_payment_method_type);
    }

    /* access modifiers changed from: package-private */
    public void bind(DropInPaymentMethod dropInPaymentMethod) {
        this.icon.setImageResource(dropInPaymentMethod.getDrawable());
        this.name.setText(this.name.getContext().getString(dropInPaymentMethod.getLocalizedName()));
    }

    /* access modifiers changed from: package-private */
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.itemView.setOnClickListener(onClickListener);
    }
}
