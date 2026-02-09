package com.cardinalcommerce.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

public final class setOnClickListener implements setCCAButtonDrawable {
    private static final Map<String, setOnClickListener> Cardinal;
    private final String getInstance;
    private final int init;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 20, 2), new setOnClickListener(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 20, 4), new setOnClickListener(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 40, 2), new setOnClickListener(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 40, 2), new setOnClickListener(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 40, 4), new setOnClickListener(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 60, 8), new setOnClickListener(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 60, 6), new setOnClickListener(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(Cardinal("SHA-256", 32, 16, 67, 60, 12), new setOnClickListener(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 20, 2), new setOnClickListener(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 20, 4), new setOnClickListener(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 40, 2), new setOnClickListener(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 40, 4), new setOnClickListener(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 40, 8), new setOnClickListener(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 60, 3), new setOnClickListener(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 60, 6), new setOnClickListener(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(Cardinal("SHA-512", 64, 16, Opcodes.LXOR, 60, 12), new setOnClickListener(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 20, 2), new setOnClickListener(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 20, 4), new setOnClickListener(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 40, 2), new setOnClickListener(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 40, 4), new setOnClickListener(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 40, 8), new setOnClickListener(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 60, 3), new setOnClickListener(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 60, 6), new setOnClickListener(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(Cardinal("SHAKE128", 32, 16, 67, 60, 12), new setOnClickListener(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 20, 2), new setOnClickListener(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 20, 4), new setOnClickListener(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 40, 2), new setOnClickListener(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 40, 4), new setOnClickListener(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 40, 8), new setOnClickListener(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 60, 3), new setOnClickListener(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 60, 6), new setOnClickListener(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(Cardinal("SHAKE256", 64, 16, Opcodes.LXOR, 60, 12), new setOnClickListener(32, "XMSSMT_SHAKE_60/12_512"));
        Cardinal = Collections.unmodifiableMap(hashMap);
    }

    private setOnClickListener(int i, String str) {
        this.init = i;
        this.getInstance = str;
    }

    private static String Cardinal(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return new StringBuilder().append(str).append("-").append(i).append("-").append(i2).append("-").append(i3).append("-").append(i4).append("-").append(i5).toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static setOnClickListener getInstance(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return Cardinal.get(Cardinal(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public final int Cardinal() {
        return this.init;
    }

    public final String toString() {
        return this.getInstance;
    }
}
