package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.getRenderType;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.objectweb.asm.Opcodes;

public final class DSA {
    private static final Map cca_continue = new HashMap();
    private static Long init = 0L;

    DSA() {
    }

    public final class Mappings extends setEnableLogging {
        public Mappings(boolean z, int i, CardinalConfigurationParameters cardinalConfigurationParameters) {
            super(z, i, cardinalConfigurationParameters);
        }

        /* access modifiers changed from: package-private */
        public final int Cardinal() throws IOException {
            int init;
            boolean z = this.init;
            int Cardinal = this.configure.onCReqSuccess().getSDKVersion().Cardinal();
            if (this.cca_continue) {
                init = GM.Mappings.init(this.Cardinal) + GM.Mappings.Cardinal(Cardinal);
            } else {
                Cardinal--;
                init = GM.Mappings.init(this.Cardinal);
            }
            return init + Cardinal;
        }

        /* access modifiers changed from: package-private */
        public final boolean configure() {
            boolean z = this.init;
            if (this.cca_continue) {
                return true;
            }
            return this.configure.onCReqSuccess().getSDKVersion().configure();
        }

        /* access modifiers changed from: package-private */
        public final void getInstance(getRenderType getrendertype) throws IOException {
            boolean z = this.init;
            getThreeDSRequestorAppURL sDKVersion = this.configure.onCReqSuccess().getSDKVersion();
            boolean z2 = this.cca_continue;
            int i = Opcodes.IF_ICMPNE;
            if (z2) {
                getrendertype.Cardinal(Opcodes.IF_ICMPNE, this.Cardinal);
                getrendertype.configure(sDKVersion.Cardinal());
                getrendertype.getInstance((CardinalConfigurationParameters) sDKVersion);
                return;
            }
            if (!sDKVersion.configure()) {
                i = 128;
            }
            getrendertype.Cardinal(i, this.Cardinal);
            if (sDKVersion != null) {
                sDKVersion.getInstance(new getRenderType.getInstance(getrendertype.configure));
                return;
            }
            throw new IOException("null object detected");
        }
    }

    public static Date init(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = cca_continue;
        synchronized (map) {
            Long l = (Long) map.get(locale);
            if (l == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l = time == 0 ? init : Long.valueOf(time);
                map.put(locale, l);
            }
            if (l == init) {
                return date;
            }
            Date date2 = new Date(date.getTime() - l.longValue());
            return date2;
        }
    }

    static {
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    Locale locale = availableLocales[i];
                    return;
                }
            }
        }
        Locale.getDefault();
    }
}
