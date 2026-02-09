package com.braintreepayments.cardform.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.cardform.R;
import com.braintreepayments.cardform.utils.CardType;
import com.braintreepayments.cardform.utils.SelectableCardType;

class SupportedCardTypesAdapter extends RecyclerView.Adapter<SupportedCardTypesViewHolder> {
    private final int OPAQUE = 255;
    private final int SEMI_TRANSPARENT = 80;
    private final SelectableCardType[] supportedCardTypes;

    static class SupportedCardTypesViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;

        public SupportedCardTypesViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.bt_supported_card_icon);
        }

        public ImageView getImageView() {
            return this.imageView;
        }
    }

    SupportedCardTypesAdapter(SelectableCardType[] selectableCardTypeArr) {
        this.supportedCardTypes = selectableCardTypeArr;
    }

    public SupportedCardTypesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SupportedCardTypesViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bt_supported_card_type, viewGroup, false));
    }

    public void onBindViewHolder(SupportedCardTypesViewHolder supportedCardTypesViewHolder, int i) {
        SelectableCardType selectableCardType = this.supportedCardTypes[i];
        supportedCardTypesViewHolder.getImageView().setImageResource(selectableCardType.getCardType().getFrontResource());
        supportedCardTypesViewHolder.getImageView().setContentDescription(selectableCardType.getCardType().toString());
        if (selectableCardType.isDisabled()) {
            supportedCardTypesViewHolder.getImageView().setImageAlpha(80);
        } else {
            supportedCardTypesViewHolder.getImageView().setImageAlpha(255);
        }
    }

    public int getItemCount() {
        return this.supportedCardTypes.length;
    }

    /* access modifiers changed from: package-private */
    public SelectableCardType[] getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    /* access modifiers changed from: package-private */
    public void setSelected(CardType cardType) {
        SelectableCardType[] selectableCardTypeArr = this.supportedCardTypes;
        if (selectableCardTypeArr != null) {
            for (SelectableCardType selectableCardType : selectableCardTypeArr) {
                selectableCardType.setDisabled(selectableCardType.getCardType() != cardType);
            }
        }
    }
}
