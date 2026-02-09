package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.io.Serializable;
import java.util.HashMap;

public class UiCustomization implements Serializable {
    public static ButtonType ButtonType;
    private final HashMap<String, ButtonCustomization> Cardinal = new HashMap<>();
    private LabelCustomization configure;
    private TextBoxCustomization getInstance;
    private ToolbarCustomization init;

    public ButtonCustomization getButtonCustomization(ButtonType buttonType) throws InvalidInputException {
        Throwable th = new Throwable("Caught in ButtonCustomization.setButtonCustomization");
        if (buttonType != null) {
            try {
                return this.Cardinal.get(buttonType.name());
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new InvalidInputException("InvalidInputException", th);
        }
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) throws InvalidInputException {
        if (buttonCustomization == null || buttonType == null) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setButtonCustomization"));
        }
        this.Cardinal.put(buttonType.name(), buttonCustomization);
    }

    public ButtonCustomization getButtonCustomization(String str) throws InvalidInputException {
        Throwable th = new Throwable("Caught in ButtonCustomization.setButtonCustomization");
        if (str != null) {
            try {
                return this.Cardinal.get(str);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new InvalidInputException("InvalidInputException", th);
        }
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) throws InvalidInputException {
        if (buttonCustomization == null || str == null) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setButtonCustomization"));
        }
        this.Cardinal.put(str, buttonCustomization);
    }

    public ToolbarCustomization getToolbarCustomization() {
        return this.init;
    }

    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) throws InvalidInputException {
        if (toolbarCustomization != null) {
            this.init = toolbarCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setToolbarCustomization"));
    }

    public LabelCustomization getLabelCustomization() {
        return this.configure;
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) throws InvalidInputException {
        if (labelCustomization != null) {
            this.configure = labelCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setLabelCustomization"));
    }

    public TextBoxCustomization getTextBoxCustomization() {
        return this.getInstance;
    }

    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) throws InvalidInputException {
        if (textBoxCustomization != null) {
            this.getInstance = textBoxCustomization;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextBoxCustomization"));
    }
}
