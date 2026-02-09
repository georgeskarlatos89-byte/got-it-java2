package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class TextBoxCustomization extends Customization {
    private int Cardinal = 0;
    private int cca_continue = 0;
    private String getInstance = "#545454";

    public int getBorderWidth() {
        return this.Cardinal;
    }

    public void setBorderWidth(int i) throws InvalidInputException {
        if (i > 0) {
            this.Cardinal = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setBorderWidth"));
    }

    public String getBorderColor() {
        return this.getInstance;
    }

    public void setBorderColor(String str) throws InvalidInputException {
        if (setScrollbarFadingEnabled.getInstance(str)) {
            this.getInstance = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setBorderColor"));
    }

    public int getCornerRadius() {
        return this.cca_continue;
    }

    public void setCornerRadius(int i) throws InvalidInputException {
        if (i > 0) {
            this.cca_continue = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setCornerRadius"));
    }

    public TextBoxCustomization() {
        setTextFontSize(0);
    }
}
