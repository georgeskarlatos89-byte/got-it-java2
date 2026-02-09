package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class ToolbarCustomization extends Customization {
    private String cca_continue;
    private String configure;
    private String getInstance;

    public String getBackgroundColor() {
        return this.configure;
    }

    public void setBackgroundColor(String str) throws InvalidInputException {
        if (setScrollbarFadingEnabled.getInstance(str)) {
            this.configure = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setBackgroundColor"));
    }

    public String getHeaderText() {
        return this.cca_continue;
    }

    public void setHeaderText(String str) throws InvalidInputException {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setHeaderText"));
        }
        this.cca_continue = str;
    }

    public String getButtonText() {
        return this.getInstance;
    }

    public void setButtonText(String str) throws InvalidInputException {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setButtonText"));
        }
        this.getInstance = str;
    }
}
