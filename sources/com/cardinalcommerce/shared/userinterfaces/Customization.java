package com.cardinalcommerce.shared.userinterfaces;

import android.graphics.Typeface;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.io.Serializable;

public class Customization implements Serializable {
    private int Cardinal;
    private String cca_continue = Typeface.DEFAULT.toString();
    private String configure;

    public String getTextFontName() {
        return this.cca_continue;
    }

    public void setTextFontName(String str) throws InvalidInputException {
        Throwable th = new Throwable("Caught in ButtonCustomization.setTextFontName");
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", th);
        }
        this.cca_continue = str;
    }

    public String getTextColor() {
        return this.configure;
    }

    public void setTextColor(String str) throws InvalidInputException {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextColor"));
        }
        this.configure = str;
    }

    public int getTextFontSize() {
        return this.Cardinal;
    }

    public void setTextFontSize(int i) throws InvalidInputException {
        if (i >= 0) {
            this.Cardinal = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextFontSize"));
    }
}
