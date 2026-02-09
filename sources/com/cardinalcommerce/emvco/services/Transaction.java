package com.cardinalcommerce.emvco.services;

import android.app.Activity;
import com.cardinalcommerce.emvco.parameters.AuthenticationRequestParameters;
import com.cardinalcommerce.emvco.parameters.ChallengeParameters;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.userinterfaces.ProgressDialog;

public interface Transaction {
    void close();

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i) throws InvalidInputException;

    AuthenticationRequestParameters getAuthenticationRequestParameters();

    ProgressDialog getProgressView(Activity activity) throws InvalidInputException;
}
