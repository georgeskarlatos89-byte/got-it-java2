package com.braintreepayments.cardform.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.braintreepayments.cardform.utils.CardType;
import com.braintreepayments.cardform.utils.SelectableCardType;
import com.google.android.flexbox.FlexboxLayoutManager;

public class AccessibleSupportedCardTypesView extends RecyclerView {
    SupportedCardTypesAdapter adapter;

    public AccessibleSupportedCardTypesView(Context context) {
        super(context);
    }

    public AccessibleSupportedCardTypesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibleSupportedCardTypesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSupportedCardTypes(CardType... cardTypeArr) {
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.setJustifyContent(2);
        setLayoutManager(flexboxLayoutManager);
        if (cardTypeArr == null) {
            cardTypeArr = new CardType[0];
        }
        SelectableCardType[] selectableCardTypeArr = new SelectableCardType[cardTypeArr.length];
        for (int i = 0; i < cardTypeArr.length; i++) {
            selectableCardTypeArr[i] = new SelectableCardType(cardTypeArr[i]);
        }
        SupportedCardTypesAdapter supportedCardTypesAdapter = new SupportedCardTypesAdapter(selectableCardTypeArr);
        this.adapter = supportedCardTypesAdapter;
        setAdapter(supportedCardTypesAdapter);
    }

    public void setSelected(CardType cardType) {
        SupportedCardTypesAdapter supportedCardTypesAdapter = this.adapter;
        if (supportedCardTypesAdapter != null) {
            supportedCardTypesAdapter.setSelected(cardType);
            this.adapter.notifyDataSetChanged();
        }
    }
}
