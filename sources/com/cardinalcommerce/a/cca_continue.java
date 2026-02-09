package com.cardinalcommerce.a;

import android.app.Activity;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
import com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils;

final class cca_continue extends ChallengeUtils {
    private static int Cardinal = 0;
    private static int getInstance = 1;
    private static final getString init = getString.getInstance();

    cca_continue() {
    }

    static {
        int i = Cardinal + 107;
        getInstance = i % 128;
        if ((i % 2 == 0 ? 'T' : 27) == 'T') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    static void cca_continue(setTransitionVisibility settransitionvisibility, Activity activity, CardinalConfigurationParameters cardinalConfigurationParameters, CardinalValidateReceiver cardinalValidateReceiver, String str) {
        int i = getInstance + 59;
        Cardinal = i % 128;
        int i2 = i % 2;
        if (!settransitionvisibility.CardinalConfigurationParameters().equalsIgnoreCase("Y")) {
            int i3 = getInstance;
            int i4 = i3 & 93;
            int i5 = ((i3 ^ 93) | i4) << 1;
            int i6 = -((i3 | 93) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            Cardinal = i7 % 128;
            int i8 = i7 % 2;
            if (!settransitionvisibility.CardinalConfigurationParameters().equalsIgnoreCase("N")) {
                Throwable th = null;
                if ((settransitionvisibility.onCReqSuccess().equalsIgnoreCase("N") ? (char) 15 : 29) != 29) {
                    int i9 = (Cardinal + 90) - 1;
                    getInstance = i9 % 128;
                    int i10 = i9 % 2;
                    configure(activity, settransitionvisibility, cardinalConfigurationParameters.getUICustomization());
                    int i11 = Cardinal;
                    int i12 = i11 ^ 55;
                    int i13 = ((i11 & 55) | i12) << 1;
                    int i14 = -i12;
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    getInstance = i15 % 128;
                    if ((i15 % 2 == 0 ? 'J' : 'K') != 'K') {
                        super.hashCode();
                        throw th;
                    }
                    return;
                }
                init(cardinalValidateReceiver, new CardinalError(10608), activity, cardinalConfigurationParameters, str);
                int i16 = Cardinal;
                int i17 = i16 & 91;
                int i18 = (((i16 ^ 91) | i17) << 1) - ((i16 | 91) & (~i17));
                getInstance = i18 % 128;
                if ((i18 % 2 == 0 ? '%' : 'F') == '%') {
                    throw th;
                }
                return;
            }
        }
        init(cardinalValidateReceiver, new CardinalError(10607), activity, cardinalConfigurationParameters, str);
        int i19 = (Cardinal + 56) - 1;
        getInstance = i19 % 128;
        if ((i19 % 2 == 0 ? 'V' : 'R') == 'V') {
            int i20 = 17 / 0;
        }
    }

    private static void init(CardinalValidateReceiver cardinalValidateReceiver, CardinalError cardinalError, Activity activity, CardinalConfigurationParameters cardinalConfigurationParameters, String str) {
        int i = Cardinal;
        int i2 = ((i | 27) << 1) - (i ^ 27);
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        getString getstring = init;
        getstring.cca_continue(cardinalError, str);
        if (cardinalValidateReceiver != null) {
            ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, cardinalError);
            getstring.init(cardinalConfigurationParameters.getEnvironment().toString());
            cardinalValidateReceiver.onValidated(activity.getApplicationContext(), validateResponse, "");
            int i4 = Cardinal + 39;
            getInstance = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = Cardinal;
        int i7 = i6 & 119;
        int i8 = (((i6 ^ 119) | i7) << 1) - ((i6 | 119) & (~i7));
        getInstance = i8 % 128;
        int i9 = i8 % 2;
    }
}
