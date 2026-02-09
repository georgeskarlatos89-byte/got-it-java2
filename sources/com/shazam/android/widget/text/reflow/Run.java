package com.shazam.android.widget.text.reflow;

import android.graphics.Rect;

class Run {
    private final Rect end;
    private final boolean endVisible;
    private final Rect start;
    private final boolean startVisible;

    Run(Rect rect, boolean z, Rect rect2, boolean z2) {
        this.start = rect;
        this.startVisible = z;
        this.end = rect2;
        this.endVisible = z2;
    }

    /* access modifiers changed from: package-private */
    public Rect getStart() {
        return this.start;
    }

    /* access modifiers changed from: package-private */
    public boolean isStartVisible() {
        return this.startVisible;
    }

    /* access modifiers changed from: package-private */
    public Rect getEnd() {
        return this.end;
    }

    /* access modifiers changed from: package-private */
    public boolean isEndVisible() {
        return this.endVisible;
    }
}
