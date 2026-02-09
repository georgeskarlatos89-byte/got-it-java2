package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class ButtonCustomization extends Customization {
    private int cca_continue;
    private String getInstance;

    public String getBackgroundColor() {
        return this.getInstance;
    }

    public void setBackgroundColor(String str) throws InvalidInputException {
        if (setScrollbarFadingEnabled.getInstance(str)) {
            this.getInstance = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setBackgroundColor"));
    }

    public int getCornerRadius() {
        return this.cca_continue;
    }

    public void setCornerRadius(int i) throws InvalidInputException {
        if (i > 0) {
            this.cca_continue = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setCornerRadius"));
    }
}
