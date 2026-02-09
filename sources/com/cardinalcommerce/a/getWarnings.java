package com.cardinalcommerce.a;

final class getWarnings {
    private static final boolean[][] Cardinal = {new boolean[]{true, true, false, false, false, false, false, false, false, false}, new boolean[]{true, true, true, false, false, false, false, false, false, false}, new boolean[]{true, true, true, true, false, false, false, false, false, false}, new boolean[]{true, true, true, false, true, false, true, false, false, false}, new boolean[]{false, true, false, true, true, true, true, true, true, false}, new boolean[]{true, true, true, true, true, true, true, true, true, false}, new boolean[]{false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, false, false, true, true, true, false}, new boolean[]{false, true, false, false, false, false, false, true, true, true}, new boolean[]{true, true, true, false, true, false, true, true, false, false}};
    private static int cca_continue = 0;
    private static int init = 1;

    getWarnings() {
    }

    static {
        int i = (1 - -106) - 1;
        cca_continue = i % 128;
        int i2 = i % 2;
    }

    static boolean init(Cardinal cardinal, Cardinal cardinal2) {
        int i = cca_continue;
        int i2 = i & 71;
        int i3 = ((((i ^ 71) | i2) << 1) - (~(-((i | 71) & (~i2))))) - 1;
        init = i3 % 128;
        if ((i3 % 2 == 0 ? '#' : 7) == 7) {
            return Cardinal[cardinal.configure()][cardinal2.configure()];
        }
        boolean z = Cardinal[cardinal.configure()][cardinal2.configure()];
        int i4 = 3 / 0;
        return z;
    }
}
