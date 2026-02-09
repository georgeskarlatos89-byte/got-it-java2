package com.cardinalcommerce.cardinalmobilesdk;

import android.app.Activity;
import android.content.Context;
import com.cardinalcommerce.a.getInstance;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
import com.cardinalcommerce.shared.models.Warning;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.util.List;

public class Cardinal {
    private static final Object Cardinal = new Object();
    private static Cardinal configure;
    private static getInstance getInstance;
    private static boolean init;

    public static synchronized Cardinal getInstance() {
        Cardinal cardinal;
        synchronized (Cardinal.class) {
            if (configure == null) {
                synchronized (Cardinal) {
                    if (configure == null) {
                        configure = new Cardinal();
                        getInstance = getInstance.getInstance();
                    }
                }
            }
            cardinal = configure;
        }
        return cardinal;
    }

    public void configure(Context context, CardinalConfigurationParameters cardinalConfigurationParameters) throws InvalidInputException {
        boolean z = !getClass().getName().equals(Cardinal.class.getName());
        init = z;
        getInstance.configure(context, cardinalConfigurationParameters, z);
    }

    public void init(String str, CardinalInitService cardinalInitService) throws InvalidInputException {
        getInstance.configure(str, cardinalInitService);
    }

    @Deprecated
    public void init(String str, String str2, CardinalInitService cardinalInitService) throws InvalidInputException {
        getInstance.Cardinal(str, str2, cardinalInitService);
    }

    public void cca_continue(String str, String str2, Activity activity, CardinalValidateReceiver cardinalValidateReceiver) throws InvalidInputException {
        getInstance.getInstance(str, str2, activity, cardinalValidateReceiver);
    }

    public void cca_continue(String str, String str2, CardinalChallengeObserver cardinalChallengeObserver) throws InvalidInputException {
        getInstance.cca_continue(str, str2, cardinalChallengeObserver);
    }

    public List<Warning> getWarnings() {
        return getInstance.Cardinal();
    }

    public String getSDKVersion() {
        return getInstance.cca_continue();
    }

    public void cleanup() {
        getInstance.onValidated();
        configure = null;
        getInstance = null;
    }
}
