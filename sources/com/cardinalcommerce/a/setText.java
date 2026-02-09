package com.cardinalcommerce.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

public final class setText implements setCCAButtonDrawable {
    private static final Map<String, setText> configure;
    private final String Cardinal;
    private final int getInstance;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 10), new setText(1, "XMSS_SHA2_10_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 16), new setText(2, "XMSS_SHA2_16_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 20), new setText(3, "XMSS_SHA2_20_256"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 10), new setText(4, "XMSS_SHA2_10_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 16), new setText(5, "XMSS_SHA2_16_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 20), new setText(6, "XMSS_SHA2_20_512"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 10), new setText(7, "XMSS_SHAKE_10_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 16), new setText(8, "XMSS_SHAKE_16_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 20), new setText(9, "XMSS_SHAKE_20_256"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 10), new setText(10, "XMSS_SHAKE_10_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 16), new setText(11, "XMSS_SHAKE_16_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 20), new setText(12, "XMSS_SHAKE_20_512"));
        configure = Collections.unmodifiableMap(hashMap);
    }

    private setText(int i, String str) {
        this.getInstance = i;
        this.Cardinal = str;
    }

    private static String Cardinal(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return new StringBuilder().append(str).append("-").append(i).append("-").append(i2).append("-").append(i3).append("-").append(i4).toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static setText cca_continue(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return configure.get(Cardinal(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public final int Cardinal() {
        return this.getInstance;
    }

    public final String toString() {
        return this.Cardinal;
    }
}
