package com.cardinalcommerce.a;

public final class dismiss {
    public String cca_continue;
    public String getInstance;

    public dismiss(String str, String str2) {
        this.getInstance = str;
        this.cca_continue = str2;
    }

    public final int hashCode() {
        String str = this.getInstance;
        int i = 1;
        int hashCode = str == null ? 1 : str.hashCode();
        String str2 = this.cca_continue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + (i * 31);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof dismiss)) {
            return false;
        }
        dismiss dismiss = (dismiss) obj;
        if (dismiss != this) {
            String str = this.getInstance;
            String str2 = dismiss.getInstance;
            if (str == str2) {
                z = true;
            } else {
                z = (str == null || str2 == null) ? false : str.equals(str2);
            }
            if (z) {
                String str3 = this.cca_continue;
                String str4 = dismiss.cca_continue;
                if (str3 == str4 ? true : (str3 == null || str4 == null) ? false : str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
