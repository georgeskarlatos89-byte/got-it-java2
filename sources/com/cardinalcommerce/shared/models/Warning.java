package com.cardinalcommerce.shared.models;

import com.cardinalcommerce.a.setAccessibilityHeading;

public class Warning {
    private String Cardinal;
    private setAccessibilityHeading cca_continue;
    private String configure;

    public Warning() {
    }

    public Warning(String str, String str2, setAccessibilityHeading setaccessibilityheading) {
        this.configure = str;
        this.Cardinal = str2;
        this.cca_continue = setaccessibilityheading;
    }

    public String getID() {
        return this.configure;
    }

    public String getMessage() {
        return this.Cardinal;
    }

    public setAccessibilityHeading getSeverity() {
        return this.cca_continue;
    }
}
