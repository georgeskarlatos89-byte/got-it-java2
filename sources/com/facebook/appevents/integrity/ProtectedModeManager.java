package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/integrity/ProtectedModeManager;", "", "()V", "PROTECTED_MODE_IS_APPLIED_KEY", "", "PROTECTED_MODE_IS_APPLIED_VALUE", "defaultStandardParameterNames", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getDefaultStandardParameterNames", "()Ljava/util/HashSet;", "defaultStandardParameterNames$delegate", "Lkotlin/Lazy;", "enabled", "", "standardParams", "convertJSONArrayToHashSet", "jsonArray", "Lorg/json/JSONArray;", "disable", "", "enable", "isEnabled", "loadStandardParams", "processParametersForProtectedMode", "parameters", "Landroid/os/Bundle;", "protectedModeIsApplied", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ProtectedModeManager.kt */
public final class ProtectedModeManager {
    public static final ProtectedModeManager INSTANCE = new ProtectedModeManager();
    private static final String PROTECTED_MODE_IS_APPLIED_KEY = "pm";
    private static final String PROTECTED_MODE_IS_APPLIED_VALUE = "1";
    private static final Lazy defaultStandardParameterNames$delegate = LazyKt.lazy(ProtectedModeManager$defaultStandardParameterNames$2.INSTANCE);
    private static boolean enabled;
    private static HashSet<String> standardParams;

    private ProtectedModeManager() {
    }

    public final HashSet<String> getDefaultStandardParameterNames() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return (HashSet) defaultStandardParameterNames$delegate.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final void enable() {
        Class<ProtectedModeManager> cls = ProtectedModeManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                ProtectedModeManager protectedModeManager = INSTANCE;
                enabled = true;
                protectedModeManager.loadStandardParams();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void disable() {
        Class<ProtectedModeManager> cls = ProtectedModeManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean isEnabled() {
        Class<ProtectedModeManager> cls = ProtectedModeManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    private final void loadStandardParams() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    HashSet<String> convertJSONArrayToHashSet = convertJSONArrayToHashSet(queryAppSettings.getProtectedModeStandardParamsSetting());
                    if (convertJSONArrayToHashSet == null) {
                        convertJSONArrayToHashSet = getDefaultStandardParameterNames();
                    }
                    standardParams = convertJSONArrayToHashSet;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final HashSet<String> convertJSONArrayToHashSet(JSONArray jSONArray) {
        if (!CrashShieldHandler.isObjectCrashing(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    @JvmStatic
    public static final void processParametersForProtectedMode(Bundle bundle) {
        Class<ProtectedModeManager> cls = ProtectedModeManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (enabled && bundle != null && !bundle.isEmpty()) {
                    if (standardParams != null) {
                        List<String> arrayList = new ArrayList<>();
                        Set<String> keySet = bundle.keySet();
                        Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                        for (String str : keySet) {
                            HashSet<String> hashSet = standardParams;
                            Intrinsics.checkNotNull(hashSet);
                            if (!hashSet.contains(str)) {
                                Intrinsics.checkNotNullExpressionValue(str, "param");
                                arrayList.add(str);
                            }
                        }
                        for (String remove : arrayList) {
                            bundle.remove(remove);
                        }
                        bundle.putString(PROTECTED_MODE_IS_APPLIED_KEY, "1");
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final boolean protectedModeIsApplied(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this) || bundle == null) {
            return false;
        }
        try {
            if (!bundle.containsKey(PROTECTED_MODE_IS_APPLIED_KEY) || !Intrinsics.areEqual(bundle.get(PROTECTED_MODE_IS_APPLIED_KEY), (Object) "1")) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
