package com.cardinalcommerce.a;

import com.facebook.internal.ServerProtocol;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;

public final class getTextColor {
    /* access modifiers changed from: private */
    public static final ThreadLocal init = new ThreadLocal();

    public static boolean getInstance(final String str) {
        try {
            String str2 = (String) AccessController.doPrivileged(new PrivilegedAction() {
                public final Object run() {
                    Map map = (Map) getTextColor.init.get();
                    return map != null ? map.get(str) : System.getProperty(str);
                }
            });
            if (str2 != null) {
                return ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(getTextFontSize.Cardinal(str2));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
