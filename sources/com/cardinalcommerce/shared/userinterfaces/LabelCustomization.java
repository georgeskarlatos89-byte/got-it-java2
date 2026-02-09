package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;

public class LabelCustomization extends Customization {
    private String cca_continue;
    private int getInstance;
    private String init;

    public String getHeadingTextColor() {
        return this.init;
    }

    public void setHeadingTextColor(String str) throws InvalidInputException {
        if (setScrollbarFadingEnabled.getInstance(str)) {
            this.init = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextColor"));
    }

    public String getHeadingTextFontName() {
        return this.cca_continue;
    }

    public void setHeadingTextFontName(String str) throws InvalidInputException {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextFontName"));
        }
        this.cca_continue = str;
    }

    public int getHeadingTextFontSize() {
        return this.getInstance;
    }

    public void setHeadingTextFontSize(int i) throws InvalidInputException {
        if (i > 0) {
            this.getInstance = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextFontSize"));
    }
}
