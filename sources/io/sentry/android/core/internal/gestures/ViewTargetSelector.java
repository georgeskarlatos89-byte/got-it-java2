package io.sentry.android.core.internal.gestures;

import android.view.View;

interface ViewTargetSelector {
    boolean select(View view);

    boolean skipChildren() {
        return false;
    }
}
