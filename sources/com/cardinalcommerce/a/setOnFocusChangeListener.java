package com.cardinalcommerce.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

final class setOnFocusChangeListener implements setCCAButtonDrawable {
    private static final Map<String, setOnFocusChangeListener> init;
    private final int cca_continue;
    private final String configure;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(cca_continue("SHA-256", 32, 16, 67), new setOnFocusChangeListener(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(cca_continue("SHA-512", 64, 16, Opcodes.LXOR), new setOnFocusChangeListener(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(cca_continue("SHAKE128", 32, 16, 67), new setOnFocusChangeListener(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(cca_continue("SHAKE256", 64, 16, Opcodes.LXOR), new setOnFocusChangeListener(67108868, "WOTSP_SHAKE256_W16"));
        init = Collections.unmodifiableMap(hashMap);
    }

    private setOnFocusChangeListener(int i, String str) {
        this.cca_continue = i;
        this.configure = str;
    }

    private static String cca_continue(String str, int i, int i2, int i3) {
        if (str != null) {
            return new StringBuilder().append(str).append("-").append(i).append("-").append(i2).append("-").append(i3).toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    protected static setOnFocusChangeListener getInstance(String str, int i, int i2, int i3) {
        if (str != null) {
            return init.get(cca_continue(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public final int Cardinal() {
        return this.cca_continue;
    }

    public final String toString() {
        return this.configure;
    }
}
