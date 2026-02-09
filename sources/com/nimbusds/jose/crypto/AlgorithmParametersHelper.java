package com.nimbusds.jose.crypto;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

class AlgorithmParametersHelper {
    AlgorithmParametersHelper() {
    }

    public static AlgorithmParameters getInstance(String str, Provider provider) throws NoSuchAlgorithmException {
        if (provider == null) {
            return AlgorithmParameters.getInstance(str);
        }
        return AlgorithmParameters.getInstance(str, provider);
    }
}
