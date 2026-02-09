package com.wix.reactnativenotifications;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;

public abstract class NotificationManagerCompatFacade {
    public static NotificationManagerCompat from(Context context) {
        return NotificationManagerCompat.from(context);
    }
}
