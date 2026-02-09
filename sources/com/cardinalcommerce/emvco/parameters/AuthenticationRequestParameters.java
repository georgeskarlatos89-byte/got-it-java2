package com.cardinalcommerce.emvco.parameters;

import com.cardinalcommerce.a.setWillNotDraw;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class AuthenticationRequestParameters {
    private char[] Cardinal;
    private char[] cca_continue;
    private char[] configure;
    private char[] getInstance;
    private char[] getWarnings;
    private char[] init;

    public AuthenticationRequestParameters(char[] cArr, char[] cArr2, char[] cArr3, char[] cArr4, char[] cArr5, char[] cArr6) throws InvalidInputException {
        setWillNotDraw instance = setWillNotDraw.getInstance();
        if (cArr4 == null || cArr4.length <= 0) {
            instance.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_SDK_APP_ID_ERROR_MESSAGE));
            throw cca_continue("sdkAppID");
        }
        this.getInstance = cArr4;
        if (cArr == null || cArr.length <= 0) {
            instance.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_SDK_TRANSACTION_ID_ERROR_MESSAGE));
            throw cca_continue("sdkTransactionID");
        }
        this.configure = cArr;
        this.Cardinal = cArr2;
        if (cArr3 == null || cArr3.length <= 0) {
            instance.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_SDK_EPHEMERAL_PUBLIC_KEY_ERROR_MESSAGE));
            throw cca_continue("sdkEphemeralPublicKey");
        }
        this.init = cArr3;
        if (cArr5 == null || cArr5.length <= 0) {
            instance.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_SDK_REFERENCE_NUMBER_ERROR_MESSAGE));
            throw cca_continue("sdkReferenceNumber");
        }
        this.cca_continue = cArr5;
        if (cArr6 == null || cArr6.length <= 0) {
            instance.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_MESSAGE_VERSION_ERROR_MESSAGE));
            throw cca_continue("messageVersion");
        } else {
            this.getWarnings = cArr6;
        }
    }

    private static InvalidInputException cca_continue(String str) {
        return new InvalidInputException("InvalidInputException", new Throwable("Caught in AuthenticationRequestParameters \n Invalid ".concat(String.valueOf(str))));
    }

    public String getSDKTransactionID() {
        return new String(this.configure);
    }

    public String getDeviceData() {
        return new String(this.Cardinal);
    }

    public String getSDKEphemeralPublicKey() {
        return new String(this.init);
    }

    public String getSDKAppID() {
        return new String(this.getInstance);
    }

    public String getSDKReferenceNumber() {
        return new String(this.cca_continue);
    }

    public String getMessageVersion() {
        return new String(this.getWarnings);
    }
}
