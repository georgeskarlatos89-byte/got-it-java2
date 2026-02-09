package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;

public interface cleanup {
    void cca_continue(onValidated onvalidated);

    void cca_continue(CardinalError cardinalError);

    void configure(CardinalError cardinalError);

    void configure(ValidateResponse validateResponse, String str);

    void onCReqSuccess();
}
