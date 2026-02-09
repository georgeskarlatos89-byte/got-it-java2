package com.facebook.appevents.integrity;

import com.braintreepayments.api.AnalyticsClient;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/integrity/BlocklistEventsManager;", "", "()V", "blocklist", "", "", "enabled", "", "disable", "", "enable", "isInBlocklist", "eventName", "loadBlocklistEvents", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BlocklistEventsManager.kt */
public final class BlocklistEventsManager {
    public static final BlocklistEventsManager INSTANCE = new BlocklistEventsManager();
    private static Set<String> blocklist = new HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void enable() {
        /*
            java.lang.Class<com.facebook.appevents.integrity.BlocklistEventsManager> r0 = com.facebook.appevents.integrity.BlocklistEventsManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            com.facebook.appevents.integrity.BlocklistEventsManager r1 = INSTANCE     // Catch:{ all -> 0x0024 }
            r1.loadBlocklistEvents()     // Catch:{ all -> 0x0024 }
            java.util.Set<java.lang.String> r1 = blocklist     // Catch:{ all -> 0x0024 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0024 }
            r2 = 1
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 != 0) goto L_0x0023
            enabled = r2     // Catch:{ all -> 0x0024 }
        L_0x0023:
            return
        L_0x0024:
            r1 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.BlocklistEventsManager.enable():void");
    }

    @JvmStatic
    public static final void disable() {
        Class<BlocklistEventsManager> cls = BlocklistEventsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
                blocklist = new HashSet();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void loadBlocklistEvents() {
        HashSet<String> convertJSONArrayToHashSet;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null && (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(queryAppSettings.getBlocklistEvents())) != null) {
                    blocklist = convertJSONArrayToHashSet;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @JvmStatic
    public static final boolean isInBlocklist(String str) {
        Class<BlocklistEventsManager> cls = BlocklistEventsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
            if (!enabled) {
                return false;
            }
            return blocklist.contains(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }
}
