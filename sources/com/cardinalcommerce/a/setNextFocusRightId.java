package com.cardinalcommerce.a;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public enum setNextFocusRightId {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");
    
    public final String identifier;

    private setNextFocusRightId(String str) {
        this.identifier = str;
    }

    public static Set<setNextFocusRightId> getInstance(List<String> list) throws ParseException {
        setNextFocusRightId setnextfocusrightid;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : list) {
            if (next != null) {
                setNextFocusRightId[] values = values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        setnextfocusrightid = null;
                        break;
                    }
                    setnextfocusrightid = values[i];
                    if (next.equals(setnextfocusrightid.identifier)) {
                        break;
                    }
                    i++;
                }
                if (setnextfocusrightid != null) {
                    linkedHashSet.add(setnextfocusrightid);
                } else {
                    throw new ParseException("Invalid JWK operation: ".concat(String.valueOf(next)), 0);
                }
            }
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.identifier;
    }
}
