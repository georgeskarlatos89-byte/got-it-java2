package com.github.clans.fab;

import android.content.Context;

final class Util {
    static boolean hasJellyBean() {
        return true;
    }

    static boolean hasLollipop() {
        return true;
    }

    private Util() {
    }

    static int dpToPx(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }
}
