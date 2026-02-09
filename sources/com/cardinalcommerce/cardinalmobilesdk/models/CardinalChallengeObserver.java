package com.cardinalcommerce.cardinalmobilesdk.models;

import androidx.fragment.app.FragmentActivity;
import com.cardinalcommerce.a.init;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class CardinalChallengeObserver extends init {
    public CardinalChallengeObserver(FragmentActivity fragmentActivity, CardinalValidateReceiver cardinalValidateReceiver) throws InvalidInputException {
        super(fragmentActivity, cardinalValidateReceiver);
    }
}
