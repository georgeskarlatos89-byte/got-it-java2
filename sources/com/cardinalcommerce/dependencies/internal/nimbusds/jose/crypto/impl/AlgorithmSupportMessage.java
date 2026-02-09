package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import java.util.Collection;

public class AlgorithmSupportMessage {
    private static String configure(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    public static String Cardinal(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return new StringBuilder("Unsupported JWS algorithm ").append(jWSAlgorithm).append(", must be ").append(configure(collection)).toString();
    }

    public static String init(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return new StringBuilder("Unsupported JWE algorithm ").append(jWEAlgorithm).append(", must be ").append(configure(collection)).toString();
    }

    public static String init(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return new StringBuilder("Unsupported JWE encryption method ").append(encryptionMethod).append(", must be ").append(configure(collection)).toString();
    }

    private AlgorithmSupportMessage() {
    }
}
