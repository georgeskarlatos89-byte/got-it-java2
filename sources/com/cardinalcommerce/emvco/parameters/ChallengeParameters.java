package com.cardinalcommerce.emvco.parameters;

import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class ChallengeParameters {
    private String Cardinal;
    private String cca_continue;
    private String configure;
    private String getInstance;
    private String init;

    public ChallengeParameters() {
    }

    public ChallengeParameters(String str, String str2, String str3, String str4) throws InvalidInputException {
        if (!str.isEmpty()) {
            this.cca_continue = str;
            if (!str2.isEmpty()) {
                this.configure = str2;
                if (!str3.isEmpty()) {
                    this.getInstance = str3;
                    if (!str4.isEmpty()) {
                        this.Cardinal = str4;
                        return;
                    }
                    throw Cardinal("threeDSServerTransactionID");
                }
                throw Cardinal("acsRefNumber");
            }
            throw Cardinal("acsSignedContent");
        }
        throw Cardinal("acsTransactionID");
    }

    private InvalidInputException Cardinal(String str) {
        return new InvalidInputException("InvalidInputException", new Throwable(new StringBuilder("Caught in ").append(getClass().getName()).append("\n Invalid ").append(str).toString()));
    }

    public String getAcsSignedContent() {
        return this.configure;
    }

    public String get3DSServerTransactionID() {
        return this.Cardinal;
    }

    public String getAcsTransactionID() {
        return this.cca_continue;
    }

    public String getAcsRefNumber() {
        return this.getInstance;
    }

    public void setAcsSignedContent(String str) {
        if (!str.isEmpty()) {
            this.configure = str;
            return;
        }
        throw Cardinal(str);
    }

    public void set3DSServerTransactionID(String str) {
        if (!str.isEmpty()) {
            this.Cardinal = str;
            return;
        }
        throw Cardinal("On set3DSServerTransactionID");
    }

    public void setAcsTransactionID(String str) {
        if (str.isEmpty() || this.getInstance.length() <= 0) {
            throw Cardinal("On setAcsTransactionID");
        }
        this.cca_continue = str;
    }

    public void setAcsRefNumber(String str) {
        if (!str.isEmpty()) {
            this.getInstance = str;
            return;
        }
        throw Cardinal("On setAcsRefNumber");
    }

    public void setThreeDSRequestorAppURL(String str) {
        if (setScrollbarFadingEnabled.init(str, 256)) {
            this.init = str;
            return;
        }
        throw Cardinal("On setThreeDSRequestorAppURL");
    }

    public String getThreeDSRequestorAppURL() {
        return this.init;
    }
}
