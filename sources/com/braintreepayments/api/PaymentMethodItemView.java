package com.braintreepayments.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braintreepayments.api.dropin.R;

class PaymentMethodItemView extends LinearLayout {
    private View deleteIcon;
    private TextView description;
    private View divider;
    private ImageView icon;
    private final PaymentMethodInspector nonceInspector = new PaymentMethodInspector();
    private PaymentMethodNonce paymentMethodNonce;
    private TextView title;

    public PaymentMethodItemView(Context context) {
        super(context);
        init();
    }

    public PaymentMethodItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PaymentMethodItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setOrientation(1);
            LayoutInflater.from(getContext()).inflate(R.layout.bt_vault_manager_list_item, this);
            this.icon = (ImageView) findViewById(R.id.bt_payment_method_icon);
            this.title = (TextView) findViewById(R.id.bt_payment_method_title);
            this.description = (TextView) findViewById(R.id.bt_payment_method_description);
            this.deleteIcon = findViewById(R.id.bt_payment_method_delete_icon);
            this.divider = findViewById(R.id.bt_payment_method_divider);
        }
    }

    public void setPaymentMethod(PaymentMethodNonce paymentMethodNonce2, boolean z) {
        this.paymentMethodNonce = paymentMethodNonce2;
        DropInPaymentMethod paymentMethod = this.nonceInspector.getPaymentMethod(paymentMethodNonce2);
        if (z) {
            this.icon.setImageResource(paymentMethod.getDrawable());
            this.deleteIcon.setVisibility(0);
            this.divider.setVisibility(0);
        } else {
            this.icon.setImageResource(paymentMethod.getVaultedDrawable());
            this.deleteIcon.setVisibility(8);
            this.divider.setVisibility(8);
        }
        this.title.setText(paymentMethod.getLocalizedName());
        this.description.setText(this.nonceInspector.getPaymentMethodDescription(paymentMethodNonce2));
    }

    public void setOnDeleteIconClick(View.OnClickListener onClickListener) {
        this.deleteIcon.setOnClickListener(onClickListener);
        this.deleteIcon.setContentDescription(String.format("%s %s %s", new Object[]{getContext().getString(R.string.bt_delete), this.nonceInspector.getPaymentMethod(this.paymentMethodNonce).name(), this.nonceInspector.getPaymentMethodDescription(this.paymentMethodNonce)}));
    }

    public PaymentMethodNonce getPaymentMethodNonce() {
        return this.paymentMethodNonce;
    }
}
