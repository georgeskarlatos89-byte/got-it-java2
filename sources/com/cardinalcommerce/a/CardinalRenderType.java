package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import org.json.JSONException;

public final class CardinalRenderType extends setKeyboardNavigationCluster {
    private static int Cardinal = 0;
    private static final getString cca_continue = getString.getInstance();
    private static int init = 1;
    private cleanup configure;

    static {
        int i = Cardinal;
        int i2 = ((i ^ 92) + ((i & 92) << 1)) - 1;
        init = i2 % 128;
        if (!(i2 % 2 != 0)) {
            throw null;
        }
    }

    public CardinalRenderType(cleanup cleanup, onValidated onvalidated, int i) throws JSONException, InvalidInputException {
        if (onvalidated != null) {
            this.configure = cleanup;
            onCReqSuccess oncreqsuccess = onvalidated.getInstance().deviceFingerprint;
            getString getstring = cca_continue;
            getstring.Cardinal("CardinalInit", new StringBuilder("Creating device fingerprint JSON with referenceId : ").append(oncreqsuccess.cca_continue()).toString());
            super.Cardinal(new StringBuilder().append(oncreqsuccess.configure()).append(CardinalActionCode.Cardinal()).toString(), oncreqsuccess.init().toString(), i);
            getstring.Cardinal("CardinalInit", "DF task initialized");
            return;
        }
        cca_continue.cca_continue(new CardinalError(CardinalError.INIT_DF_PARAMETERS_ERROR_CODE), (String) null);
        throw new InvalidInputException("API Call", new Throwable("Invalid Input Exception"));
    }

    public final void getInstance(String str) {
        int i = Cardinal;
        boolean z = true;
        int i2 = ((i ^ 57) | (i & 57)) << 1;
        int i3 = -(((~i) & 57) | (i & -58));
        int i4 = (i2 & i3) + (i3 | i2);
        init = i4 % 128;
        int i5 = i4 % 2;
        cca_continue.Cardinal("CardinalInit", "LASSO Save Successful");
        this.configure.onCReqSuccess();
        int i6 = Cardinal;
        int i7 = (i6 & 103) + (i6 | 103);
        init = i7 % 128;
        if (i7 % 2 != 0) {
            z = false;
        }
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void configure(String str, int i) {
        CardinalError cardinalError = new CardinalError(i, str);
        cca_continue.cca_continue(cardinalError, (String) null);
        this.configure.cca_continue(cardinalError);
        int i2 = (init + 100) - 1;
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
        cca_continue.cca_continue(new CardinalError((int) CardinalError.INIT_DF_REQUEST_ERROR_CODE, exc.getLocalizedMessage()), (String) null);
        this.configure.cca_continue(new CardinalError(CardinalError.INIT_DF_REQUEST_ERROR_CODE));
        int i = init;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }
}
