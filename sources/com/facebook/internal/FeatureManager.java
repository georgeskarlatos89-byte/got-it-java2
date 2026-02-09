package com.facebook.internal;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.objectweb.asm.Opcodes;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/FeatureManager;", "", "()V", "FEATURE_MANAGER_STORE", "", "featureMapping", "", "Lcom/facebook/internal/FeatureManager$Feature;", "", "checkFeature", "", "feature", "callback", "Lcom/facebook/internal/FeatureManager$Callback;", "defaultStatus", "", "disableFeature", "getFeature", "className", "getGKStatus", "initializeFeatureMapping", "isEnabled", "Callback", "Feature", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FeatureManager.kt */
public final class FeatureManager {
    private static final String FEATURE_MANAGER_STORE = "com.facebook.internal.FEATURE_MANAGER";
    public static final FeatureManager INSTANCE = new FeatureManager();
    private static final Map<Feature, String[]> featureMapping = new HashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FeatureManager$Callback;", "", "onCompleted", "", "enabled", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FeatureManager.kt */
    public interface Callback {
        void onCompleted(boolean z);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FeatureManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(72:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|(2:69|70)|71|73) */
        /* JADX WARNING: Can't wrap try/catch for region: R(73:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.facebook.internal.FeatureManager$Feature[] r0 = com.facebook.internal.FeatureManager.Feature.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Instrument     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ErrorReport     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AnrReport     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AAM     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CloudBridge     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLogging     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLoggingLib2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLoggingLib5To7     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitSubsDedupe     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BannedParamFiltering     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ProtectedMode     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.StdParamEnforcement     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.MACARuleMatching     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BlocklistEvents     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Monitoring     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BypassAppSwitch     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.GPSARATriggers     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.GPSPACAProcessing     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FeatureManager.WhenMappings.<clinit>():void");
        }
    }

    private FeatureManager() {
    }

    @JvmStatic
    public static final void checkFeature(Feature feature, Callback callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FetchedAppGateKeepersManager.loadAppGateKeepersAsync(new FeatureManager$checkFeature$1(callback, feature));
    }

    @JvmStatic
    public static final boolean isEnabled(Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = FacebookSdk.getApplicationContext().getSharedPreferences(FEATURE_MANAGER_STORE, 0).getString(feature.toKey(), (String) null);
        if (string != null && Intrinsics.areEqual((Object) string, (Object) FacebookSdk.getSdkVersion())) {
            return false;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            return INSTANCE.getGKStatus(feature);
        }
        FeatureManager featureManager = INSTANCE;
        if (!isEnabled(parent) || !featureManager.getGKStatus(feature)) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final void disableFeature(Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        FacebookSdk.getApplicationContext().getSharedPreferences(FEATURE_MANAGER_STORE, 0).edit().putString(feature.toKey(), FacebookSdk.getSdkVersion()).apply();
    }

    @JvmStatic
    public static final Feature getFeature(String str) {
        Intrinsics.checkNotNullParameter(str, "className");
        INSTANCE.initializeFeatureMapping();
        for (Map.Entry next : featureMapping.entrySet()) {
            Feature feature = (Feature) next.getKey();
            String[] strArr = (String[]) next.getValue();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (StringsKt.startsWith$default(str, strArr[i], false, 2, (Object) null)) {
                        return feature;
                    }
                    i++;
                }
            }
        }
        return Feature.Unknown;
    }

    private final synchronized void initializeFeatureMapping() {
        Map<Feature, String[]> map = featureMapping;
        if (map.isEmpty()) {
            map.put(Feature.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(Feature.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(Feature.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(Feature.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(Feature.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(Feature.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            map.put(Feature.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
            map.put(Feature.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
        }
    }

    private final boolean getGKStatus(Feature feature) {
        return FetchedAppGateKeepersManager.getGateKeeperForKey(feature.toKey(), FacebookSdk.getApplicationId(), defaultStatus(feature));
    }

    private final boolean defaultStatus(Feature feature) {
        switch (WhenMappings.$EnumSwitchMapping$0[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return false;
            default:
                return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b/\b\u0001\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00068"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "code", "", "(Ljava/lang/String;II)V", "parent", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "toKey", "", "toString", "Unknown", "Core", "AppEvents", "CodelessEvents", "CloudBridge", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "ProtectedMode", "MACARuleMatching", "BlocklistEvents", "FilterRedactedEvents", "FilterSensitiveParams", "StdParamEnforcement", "BannedParamFiltering", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "IapLoggingLib5To7", "AndroidManualImplicitPurchaseDedupe", "AndroidManualImplicitSubsDedupe", "AndroidIAPSubscriptionAutoLogging", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Megatron", "Elora", "GPSARATriggers", "GPSPACAProcessing", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FeatureManager.kt */
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(16843785),
        BannedParamFiltering(16843786),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(Opcodes.ASM5),
        GPSARATriggers(393216),
        GPSPACAProcessing(458752),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432);
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final int code;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* compiled from: FeatureManager.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(89:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|89) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.facebook.internal.FeatureManager$Feature[] r0 = com.facebook.internal.FeatureManager.Feature.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Core     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AppEvents     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Instrument     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CrashReport     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CrashShield     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ErrorReport     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AnrReport     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AAM     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.CloudBridge     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.StdParamEnforcement     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ProtectedMode     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BannedParamFiltering     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.MACARuleMatching     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BlocklistEvents     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams     // Catch:{ NoSuchFieldError -> 0x00dc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                    r2 = 22
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                L_0x00dc:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    r2 = 23
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                L_0x00e6:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    r2 = 24
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                L_0x00f0:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing     // Catch:{ NoSuchFieldError -> 0x00fa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                    r2 = 25
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                L_0x00fa:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing     // Catch:{ NoSuchFieldError -> 0x0104 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                    r2 = 26
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                L_0x0104:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLogging     // Catch:{ NoSuchFieldError -> 0x010e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                    r2 = 27
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                L_0x010e:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLoggingLib2     // Catch:{ NoSuchFieldError -> 0x0118 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                    r2 = 28
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                L_0x0118:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IapLoggingLib5To7     // Catch:{ NoSuchFieldError -> 0x0122 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                    r2 = 29
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                L_0x0122:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe     // Catch:{ NoSuchFieldError -> 0x012c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                    r2 = 30
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                L_0x012c:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitSubsDedupe     // Catch:{ NoSuchFieldError -> 0x0136 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                    r2 = 31
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
                L_0x0136:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging     // Catch:{ NoSuchFieldError -> 0x0140 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                    r2 = 32
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
                L_0x0140:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Monitoring     // Catch:{ NoSuchFieldError -> 0x014a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                    r2 = 33
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
                L_0x014a:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Megatron     // Catch:{ NoSuchFieldError -> 0x0154 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                    r2 = 34
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
                L_0x0154:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Elora     // Catch:{ NoSuchFieldError -> 0x015e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                    r2 = 35
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
                L_0x015e:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.GPSARATriggers     // Catch:{ NoSuchFieldError -> 0x0168 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                    r2 = 36
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
                L_0x0168:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.GPSPACAProcessing     // Catch:{ NoSuchFieldError -> 0x0172 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                    r2 = 37
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
                L_0x0172:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ServiceUpdateCompliance     // Catch:{ NoSuchFieldError -> 0x017c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                    r2 = 38
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
                L_0x017c:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Login     // Catch:{ NoSuchFieldError -> 0x0186 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                    r2 = 39
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
                L_0x0186:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x0190 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                    r2 = 40
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
                L_0x0190:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x019a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                    r2 = 41
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
                L_0x019a:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.BypassAppSwitch     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    r2 = 42
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
                L_0x01a4:
                    com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.Share     // Catch:{ NoSuchFieldError -> 0x01ae }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                    r2 = 43
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
                L_0x01ae:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FeatureManager.Feature.WhenMappings.<clinit>():void");
            }
        }

        private Feature(int i) {
            this.code = i;
        }

        static {
            Companion = new Companion((DefaultConstructorMarker) null);
        }

        public String toString() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case 20:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case 28:
                    return "IAPLoggingLib2";
                case 29:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case 31:
                    return "AndroidManualImplicitSubsDedupe";
                case 32:
                    return "AndroidIAPSubscriptionAutoLogging";
                case 33:
                    return "Monitoring";
                case 34:
                    return "Megatron";
                case 35:
                    return "Elora";
                case 36:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "ServiceUpdateCompliance";
                case 39:
                    return "LoginKit";
                case 40:
                    return "ChromeCustomTabsPrefetching";
                case 41:
                    return "IgnoreAppSwitchToLoggedOut";
                case 42:
                    return "BypassAppSwitch";
                case 43:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }

        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        public final Feature getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                return Companion.fromInt(i & InputDeviceCompat.SOURCE_ANY);
            }
            if ((65280 & i) > 0) {
                return Companion.fromInt(i & SupportMenu.CATEGORY_MASK);
            }
            if ((16711680 & i) > 0) {
                return Companion.fromInt(i & -16777216);
            }
            return Companion.fromInt(0);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature$Companion;", "", "()V", "fromInt", "Lcom/facebook/internal/FeatureManager$Feature;", "code", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: FeatureManager.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Feature fromInt(int i) {
                for (Feature feature : Feature.values()) {
                    if (feature.code == i) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }
    }
}
