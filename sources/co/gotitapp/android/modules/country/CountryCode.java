package co.gotitapp.android.modules.country;

public class CountryCode {
    private String code;
    private String dialCode;
    private String displayDialCode;
    private String name;

    public void setName(String str) {
        this.name = str;
    }

    public void setDialCode(String str) {
        this.dialCode = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public String getName() {
        return this.name;
    }

    public String getDialCode() {
        return this.dialCode;
    }

    public String getCode() {
        return this.code;
    }

    public String getDisplayDialCode() {
        if (this.displayDialCode == null) {
            this.displayDialCode = String.format("+%s", new Object[]{this.dialCode});
        }
        return this.displayDialCode;
    }
}
