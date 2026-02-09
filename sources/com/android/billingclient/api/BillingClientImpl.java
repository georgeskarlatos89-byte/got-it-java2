package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import androidx.work.WorkRequest;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private ExecutorService zzB;
    /* access modifiers changed from: private */
    public volatile int zza;
    private final String zzb;
    private final Handler zzc;
    /* access modifiers changed from: private */
    public volatile zzo zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzcc zzf;
    /* access modifiers changed from: private */
    public volatile zzs zzg;
    private volatile zzbc zzh;
    /* access modifiers changed from: private */
    public boolean zzi;
    /* access modifiers changed from: private */
    public boolean zzj;
    /* access modifiers changed from: private */
    public int zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public boolean zzo;
    /* access modifiers changed from: private */
    public boolean zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public boolean zzr;
    /* access modifiers changed from: private */
    public boolean zzs;
    /* access modifiers changed from: private */
    public boolean zzt;
    /* access modifiers changed from: private */
    public boolean zzu;
    /* access modifiers changed from: private */
    public boolean zzv;
    /* access modifiers changed from: private */
    public boolean zzw;
    /* access modifiers changed from: private */
    public boolean zzx;
    /* access modifiers changed from: private */
    public boolean zzy;
    private PendingPurchasesParams zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzbu(), str, (String) null, (UserChoiceBillingListener) null, (zzcc) null, (ExecutorService) null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzc zzc2, String str, zzcc zzcc) {
        this.zze = context.getApplicationContext();
        zzgt zzy2 = zzgu.zzy();
        zzy2.zzn(str);
        zzy2.zzm(this.zze.getPackageName());
        if (zzcc != null) {
            this.zzf = zzcc;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzy2.zzf());
        }
        if (purchasesUpdatedListener == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, (zzck) null, zzc2, (UserChoiceBillingListener) null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = zzc2 != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzbu zzbu = new zzbu(j);
        if (isReady()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            zzbu.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(zzcb.zza(37, 6, zzce.zzd));
            zzbu.onBillingSetupFinished(zzce.zzd);
        } else if (this.zza == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(zzcb.zza(38, 6, zzce.zzm));
            zzbu.onBillingSetupFinished(zzce.zzm);
        } else {
            this.zza = 1;
            zzb.zzj("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzbc(this, zzbu, (zzbb) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            zzb.zzj("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            zzb.zzj("BillingClient", "Billing service unavailable on device.");
            zzap(zzcb.zza(i, 6, zzce.zzc));
            zzbu.onBillingSetupFinished(zzce.zzc);
        }
    }

    static /* bridge */ /* synthetic */ zzcz zzag(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle bundle;
        BillingClientImpl billingClientImpl2 = billingClientImpl;
        zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzc2 = zzb.zzc(billingClientImpl2.zzn, billingClientImpl2.zzv, billingClientImpl2.zzz.isEnabledForOneTimeProducts(), billingClientImpl2.zzz.isEnabledForPrepaidPlans(), billingClientImpl2.zzb);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (billingClientImpl2.zzn) {
                    bundle = billingClientImpl2.zzg.zzj(true != billingClientImpl2.zzv ? 9 : 19, billingClientImpl2.zze.getPackageName(), str, str2, zzc2);
                    String str3 = str;
                } else {
                    bundle = billingClientImpl2.zzg.zzi(3, billingClientImpl2.zze.getPackageName(), str, str2);
                }
                zzda zza2 = zzdb.zza(bundle, "BillingClient", "getPurchase()");
                BillingResult zza3 = zza2.zza();
                if (zza3 != zzce.zzl) {
                    billingClientImpl2.zzap(zzcb.zza(zza2.zzb(), 9, zza3));
                    return new zzcz(zza3, list);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                boolean z = false;
                while (i2 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i2);
                    String str5 = stringArrayList3.get(i2);
                    zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str4, str5);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                        i2++;
                    } catch (JSONException e) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl2.zzap(zzcb.zza(51, 9, zzce.zzj));
                        return new zzcz(zzce.zzj, (List) null);
                    }
                }
                if (z) {
                    billingClientImpl2.zzap(zzcb.zza(26, 9, zzce.zzj));
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzcz(zzce.zzl, arrayList);
                }
                list = null;
            } catch (Exception e2) {
                billingClientImpl2.zzap(zzcb.zza(52, 9, zzce.zzm));
                zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzcz(zzce.zzm, (List) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final Handler zzaj() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzak(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new zzq(this, billingResult));
        return billingResult;
    }

    /* access modifiers changed from: private */
    public final BillingResult zzal() {
        if (this.zza == 0 || this.zza == 3) {
            return zzce.zzm;
        }
        return zzce.zzj;
    }

    private final String zzam(QueryProductDetailsParams queryProductDetailsParams) {
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return this.zze.getPackageName();
    }

    private static String zzan() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* access modifiers changed from: private */
    public final Future zzao(Callable callable, long j, Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(zzb.zza, new zzat(this));
        }
        try {
            Future submit = this.zzB.submit(callable);
            handler.postDelayed(new zzy(submit, runnable), (long) (((double) j) * 0.95d));
            return submit;
        } catch (Exception e) {
            zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzap(zzga zzga) {
        this.zzf.zzb(zzga, this.zzk);
    }

    /* access modifiers changed from: private */
    public final void zzaq(zzge zzge) {
        this.zzf.zzd(zzge, this.zzk);
    }

    private final void zzar(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 11, zzce.zzm));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzce.zzm, (List<PurchaseHistoryRecord>) null);
            return;
        }
        if (zzao(new zzav(this, str, purchaseHistoryResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzam(this, purchaseHistoryResponseListener), zzaj()) == null) {
            BillingResult zzal = zzal();
            zzap(zzcb.zza(25, 11, zzal));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzal, (List<PurchaseHistoryRecord>) null);
        }
    }

    private final void zzas(String str, PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 9, zzce.zzm));
            purchasesResponseListener.onQueryPurchasesResponse(zzce.zzm, zzai.zzk());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzk("BillingClient", "Please provide a valid product type.");
            zzap(zzcb.zza(50, 9, zzce.zzg));
            purchasesResponseListener.onQueryPurchasesResponse(zzce.zzg, zzai.zzk());
        } else {
            if (zzao(new zzau(this, str, purchasesResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzae(this, purchasesResponseListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 9, zzal));
                purchasesResponseListener.onQueryPurchasesResponse(zzal, zzai.zzk());
            }
        }
    }

    private final boolean zzat() {
        return this.zzv && this.zzz.isEnabledForPrepaidPlans();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.play_billing.zzge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.internal.play_billing.zzga} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzau(com.android.billingclient.api.BillingResult r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r8.getResponseCode()
            r1 = 0
            java.lang.String r2 = "Unable to create logging payload"
            java.lang.String r3 = "BillingLogger"
            r4 = 5
            if (r0 == 0) goto L_0x004d
            int r0 = com.android.billingclient.api.zzcb.zza
            com.google.android.gms.internal.play_billing.zzfz r0 = com.google.android.gms.internal.play_billing.zzga.zzy()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzgg r5 = com.google.android.gms.internal.play_billing.zzgk.zzy()     // Catch:{ Exception -> 0x0045 }
            int r6 = r8.getResponseCode()     // Catch:{ Exception -> 0x0045 }
            r5.zzn(r6)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r8 = r8.getDebugMessage()     // Catch:{ Exception -> 0x0045 }
            r5.zzm(r8)     // Catch:{ Exception -> 0x0045 }
            r5.zzo(r9)     // Catch:{ Exception -> 0x0045 }
            r0.zzl(r5)     // Catch:{ Exception -> 0x0045 }
            r0.zzn(r4)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzgz r8 = com.google.android.gms.internal.play_billing.zzhb.zzy()     // Catch:{ Exception -> 0x0045 }
            r8.zzl(r10)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzcs r8 = r8.zzf()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzhb r8 = (com.google.android.gms.internal.play_billing.zzhb) r8     // Catch:{ Exception -> 0x0045 }
            r0.zzm(r8)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzcs r8 = r0.zzf()     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.internal.play_billing.zzga r8 = (com.google.android.gms.internal.play_billing.zzga) r8     // Catch:{ Exception -> 0x0045 }
            r1 = r8
            goto L_0x0049
        L_0x0045:
            r8 = move-exception
            com.google.android.gms.internal.play_billing.zzb.zzl(r3, r2, r8)
        L_0x0049:
            r7.zzap(r1)
            return
        L_0x004d:
            int r8 = com.android.billingclient.api.zzcb.zza
            com.google.android.gms.internal.play_billing.zzgd r8 = com.google.android.gms.internal.play_billing.zzge.zzy()     // Catch:{ Exception -> 0x006e }
            r8.zzm(r4)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzgz r9 = com.google.android.gms.internal.play_billing.zzhb.zzy()     // Catch:{ Exception -> 0x006e }
            r9.zzl(r10)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzcs r9 = r9.zzf()     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzhb r9 = (com.google.android.gms.internal.play_billing.zzhb) r9     // Catch:{ Exception -> 0x006e }
            r8.zzl(r9)     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzcs r8 = r8.zzf()     // Catch:{ Exception -> 0x006e }
            com.google.android.gms.internal.play_billing.zzge r8 = (com.google.android.gms.internal.play_billing.zzge) r8     // Catch:{ Exception -> 0x006e }
            r1 = r8
            goto L_0x0072
        L_0x006e:
            r8 = move-exception
            com.google.android.gms.internal.play_billing.zzb.zzl(r3, r2, r8)
        L_0x0072:
            r7.zzaq(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzau(com.android.billingclient.api.BillingResult, int, int):void");
    }

    static /* bridge */ /* synthetic */ zzbt zzg(BillingClientImpl billingClientImpl, String str) {
        BillingClientImpl billingClientImpl2 = billingClientImpl;
        zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzc2 = zzb.zzc(billingClientImpl2.zzn, billingClientImpl2.zzv, billingClientImpl2.zzz.isEnabledForOneTimeProducts(), billingClientImpl2.zzz.isEnabledForPrepaidPlans(), billingClientImpl2.zzb);
        String str2 = null;
        while (billingClientImpl2.zzl) {
            try {
                Bundle zzh2 = billingClientImpl2.zzg.zzh(6, billingClientImpl2.zze.getPackageName(), str, str2, zzc2);
                zzda zza2 = zzdb.zza(zzh2, "BillingClient", "getPurchaseHistory()");
                BillingResult zza3 = zza2.zza();
                if (zza3 != zzce.zzl) {
                    billingClientImpl2.zzap(zzcb.zza(zza2.zzb(), 11, zza3));
                    return new zzbt(zza3, (List) null);
                }
                ArrayList<String> stringArrayList = zzh2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                boolean z = false;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                    } catch (JSONException e) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl2.zzap(zzcb.zza(51, 11, zzce.zzj));
                        return new zzbt(zzce.zzj, (List) null);
                    }
                }
                if (z) {
                    billingClientImpl2.zzap(zzcb.zza(26, 11, zzce.zzj));
                }
                str2 = zzh2.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzbt(zzce.zzl, arrayList);
                }
            } catch (RemoteException e2) {
                zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                billingClientImpl2.zzap(zzcb.zza(59, 11, zzce.zzm));
                return new zzbt(zzce.zzm, (List) null);
            }
        }
        zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbt(zzce.zzq, (List) null);
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 3, zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzm);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            zzap(zzcb.zza(26, 3, zzce.zzi));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzi);
        } else if (!this.zzn) {
            zzap(zzcb.zza(27, 3, zzce.zzb));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzb);
        } else {
            if (zzao(new zzu(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzv(this, acknowledgePurchaseResponseListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 3, zzal));
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzal);
            }
        }
    }

    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 4, zzce.zzm));
            consumeResponseListener.onConsumeResponse(zzce.zzm, consumeParams.getPurchaseToken());
            return;
        }
        if (zzao(new zzah(this, consumeParams, consumeResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzai(this, consumeResponseListener, consumeParams), zzaj()) == null) {
            BillingResult zzal = zzal();
            zzap(zzcb.zza(25, 4, zzal));
            consumeResponseListener.onConsumeResponse(zzal, consumeParams.getPurchaseToken());
        }
    }

    public void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 15, zzce.zzm));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzm, (AlternativeBillingOnlyReportingDetails) null);
        } else if (!this.zzx) {
            zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 15, zzce.zzE));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzE, (AlternativeBillingOnlyReportingDetails) null);
        } else {
            if (zzao(new zzz(this, alternativeBillingOnlyReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzaa(this, alternativeBillingOnlyReportingDetailsListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 15, zzal));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzal, (AlternativeBillingOnlyReportingDetails) null);
            }
        }
    }

    public void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 24, zzce.zzm));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzm, (ExternalOfferReportingDetails) null);
        } else if (!this.zzy) {
            zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(zzcb.zza(103, 24, zzce.zzy));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzy, (ExternalOfferReportingDetails) null);
        } else {
            if (zzao(new zzab(this, externalOfferReportingDetailsListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzak(this, externalOfferReportingDetailsListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 24, zzal));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzal, (ExternalOfferReportingDetails) null);
            }
        }
    }

    public final void endConnection() {
        zzaq(zzcb.zzc(12));
        try {
            if (this.zzd != null) {
                this.zzd.zzf();
            }
            if (this.zzh != null) {
                this.zzh.zzc();
            }
            if (!(this.zzh == null || this.zzg == null)) {
                zzb.zzj("BillingClient", "Unbinding from service.");
                this.zze.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzB;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzB = null;
            }
        } catch (Exception e) {
            zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
        } catch (Throwable th) {
            this.zza = 3;
            throw th;
        }
        this.zza = 3;
    }

    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            zzb.zzk("BillingClient", "Service disconnected.");
            zzap(zzcb.zza(2, 13, zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzm, (BillingConfig) null);
        } else if (!this.zzu) {
            zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            zzap(zzcb.zza(32, 13, zzce.zzA));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzA, (BillingConfig) null);
        } else {
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            if (zzao(new zzw(this, bundle, billingConfigResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzx(this, billingConfigResponseListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 13, zzal));
                billingConfigResponseListener.onBillingConfigResponse(zzal, (BillingConfig) null);
            }
        }
    }

    public final int getConnectionState() {
        return this.zza;
    }

    public void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 14, zzce.zzm));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzm);
        } else if (!this.zzx) {
            zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 14, zzce.zzE));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzE);
        } else {
            if (zzao(new zzaf(this, alternativeBillingOnlyAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzag(this, alternativeBillingOnlyAvailabilityListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 14, zzal));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzal);
            }
        }
    }

    public void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 23, zzce.zzm));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzm);
        } else if (!this.zzy) {
            zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(zzcb.zza(103, 23, zzce.zzy));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzy);
        } else {
            if (zzao(new zzaq(this, externalOfferAvailabilityListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzar(this, externalOfferAvailabilityListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 23, zzal));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzal);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = r14.isReady()
            r1 = 2
            r2 = 5
            if (r0 != 0) goto L_0x0022
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzm
            int r0 = r15.getResponseCode()
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.internal.play_billing.zzga r15 = com.android.billingclient.api.zzcb.zza(r1, r2, r15)
            r14.zzap(r15)
            goto L_0x001f
        L_0x0018:
            com.google.android.gms.internal.play_billing.zzge r15 = com.android.billingclient.api.zzcb.zzc(r2)
            r14.zzaq(r15)
        L_0x001f:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzm
            return r15
        L_0x0022:
            int r0 = com.android.billingclient.api.zzce.zzG
            int r0 = r15.hashCode()
            r3 = 13
            r4 = 12
            r5 = 11
            r6 = 8
            r7 = 7
            r8 = 6
            r9 = 3
            r10 = 4
            r11 = 1
            r12 = 10
            r13 = 9
            switch(r0) {
                case -422092961: goto L_0x00c5;
                case 96321: goto L_0x00bb;
                case 97314: goto L_0x00b1;
                case 98307: goto L_0x00a7;
                case 99300: goto L_0x009d;
                case 100293: goto L_0x0093;
                case 101286: goto L_0x0089;
                case 102279: goto L_0x007f;
                case 103272: goto L_0x0075;
                case 104265: goto L_0x006a;
                case 105258: goto L_0x005f;
                case 106251: goto L_0x0054;
                case 207616302: goto L_0x0049;
                case 1987365622: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x00cf
        L_0x003e:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = 0
            goto L_0x00d0
        L_0x0049:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r1
            goto L_0x00d0
        L_0x0054:
            java.lang.String r0 = "kkk"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r3
            goto L_0x00d0
        L_0x005f:
            java.lang.String r0 = "jjj"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r4
            goto L_0x00d0
        L_0x006a:
            java.lang.String r0 = "iii"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r5
            goto L_0x00d0
        L_0x0075:
            java.lang.String r0 = "hhh"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r12
            goto L_0x00d0
        L_0x007f:
            java.lang.String r0 = "ggg"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r13
            goto L_0x00d0
        L_0x0089:
            java.lang.String r0 = "fff"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r6
            goto L_0x00d0
        L_0x0093:
            java.lang.String r0 = "eee"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r7
            goto L_0x00d0
        L_0x009d:
            java.lang.String r0 = "ddd"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r2
            goto L_0x00d0
        L_0x00a7:
            java.lang.String r0 = "ccc"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r8
            goto L_0x00d0
        L_0x00b1:
            java.lang.String r0 = "bbb"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r9
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r0 = "aaa"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r10
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00cf
            r0 = r11
            goto L_0x00d0
        L_0x00cf:
            r0 = -1
        L_0x00d0:
            switch(r0) {
                case 0: goto L_0x01b1;
                case 1: goto L_0x01a4;
                case 2: goto L_0x0195;
                case 3: goto L_0x0186;
                case 4: goto L_0x0177;
                case 5: goto L_0x0168;
                case 6: goto L_0x0159;
                case 7: goto L_0x014a;
                case 8: goto L_0x013b;
                case 9: goto L_0x012c;
                case 10: goto L_0x011d;
                case 11: goto L_0x010e;
                case 12: goto L_0x00fd;
                case 13: goto L_0x00ec;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "BillingClient"
            java.lang.String r1 = "Unsupported feature: "
            java.lang.String r15 = r1.concat(r15)
            com.google.android.gms.internal.play_billing.zzb.zzk(r0, r15)
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzz
            r0 = 34
            r14.zzau(r15, r0, r11)
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzz
            return r15
        L_0x00ec:
            boolean r15 = r14.zzy
            if (r15 == 0) goto L_0x00f3
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x00f5
        L_0x00f3:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzy
        L_0x00f5:
            r0 = 103(0x67, float:1.44E-43)
            r1 = 18
            r14.zzau(r15, r0, r1)
            return r15
        L_0x00fd:
            boolean r15 = r14.zzx
            if (r15 == 0) goto L_0x0104
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0106
        L_0x0104:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzE
        L_0x0106:
            r0 = 66
            r1 = 14
            r14.zzau(r15, r0, r1)
            return r15
        L_0x010e:
            boolean r15 = r14.zzw
            if (r15 == 0) goto L_0x0115
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0117
        L_0x0115:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzD
        L_0x0117:
            r0 = 60
            r14.zzau(r15, r0, r3)
            return r15
        L_0x011d:
            boolean r15 = r14.zzu
            if (r15 == 0) goto L_0x0124
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0126
        L_0x0124:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzB
        L_0x0126:
            r0 = 33
            r14.zzau(r15, r0, r4)
            return r15
        L_0x012c:
            boolean r15 = r14.zzu
            if (r15 == 0) goto L_0x0133
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0135
        L_0x0133:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzA
        L_0x0135:
            r0 = 32
            r14.zzau(r15, r0, r5)
            return r15
        L_0x013b:
            boolean r15 = r14.zzt
            if (r15 == 0) goto L_0x0142
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0144
        L_0x0142:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzv
        L_0x0144:
            r0 = 20
            r14.zzau(r15, r0, r12)
            return r15
        L_0x014a:
            boolean r15 = r14.zzs
            if (r15 == 0) goto L_0x0151
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0153
        L_0x0151:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzt
        L_0x0153:
            r0 = 61
            r14.zzau(r15, r0, r13)
            return r15
        L_0x0159:
            boolean r15 = r14.zzs
            if (r15 == 0) goto L_0x0160
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0162
        L_0x0160:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzt
        L_0x0162:
            r0 = 19
            r14.zzau(r15, r0, r6)
            return r15
        L_0x0168:
            boolean r15 = r14.zzq
            if (r15 == 0) goto L_0x016f
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0171
        L_0x016f:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzu
        L_0x0171:
            r0 = 21
            r14.zzau(r15, r0, r7)
            return r15
        L_0x0177:
            boolean r15 = r14.zzr
            if (r15 == 0) goto L_0x017e
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x0180
        L_0x017e:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzs
        L_0x0180:
            r0 = 31
            r14.zzau(r15, r0, r8)
            return r15
        L_0x0186:
            boolean r15 = r14.zzp
            if (r15 == 0) goto L_0x018d
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x018f
        L_0x018d:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzw
        L_0x018f:
            r0 = 30
            r14.zzau(r15, r0, r2)
            return r15
        L_0x0195:
            boolean r15 = r14.zzm
            if (r15 == 0) goto L_0x019c
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x019e
        L_0x019c:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzr
        L_0x019e:
            r0 = 35
            r14.zzau(r15, r0, r10)
            return r15
        L_0x01a4:
            boolean r15 = r14.zzj
            if (r15 == 0) goto L_0x01ab
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x01ad
        L_0x01ab:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzp
        L_0x01ad:
            r14.zzau(r15, r12, r9)
            return r15
        L_0x01b1:
            boolean r15 = r14.zzi
            if (r15 == 0) goto L_0x01b8
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzl
            goto L_0x01ba
        L_0x01b8:
            com.android.billingclient.api.BillingResult r15 = com.android.billingclient.api.zzce.zzo
        L_0x01ba:
            r14.zzau(r15, r13, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x047e A[SYNTHETIC, Splitter:B:179:0x047e] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0490 A[Catch:{ CancellationException | TimeoutException -> 0x04fd, Exception -> 0x04e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r33, com.android.billingclient.api.BillingFlowParams r34) {
        /*
            r32 = this;
            r8 = r32
            r0 = r33
            java.lang.String r1 = "proxyPackageVersion"
            java.lang.String r9 = "BUY_INTENT"
            com.android.billingclient.api.zzo r2 = r8.zzd
            r10 = 2
            if (r2 == 0) goto L_0x0516
            com.android.billingclient.api.zzo r2 = r8.zzd
            com.android.billingclient.api.PurchasesUpdatedListener r2 = r2.zzd()
            if (r2 == 0) goto L_0x0516
            boolean r2 = r32.isReady()
            if (r2 != 0) goto L_0x002a
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzm
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r10, r10, r0)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzm
            r8.zzak(r0)
            return r0
        L_0x002a:
            java.util.ArrayList r2 = r34.zzf()
            java.util.List r3 = r34.zzg()
            r4 = 0
            java.lang.Object r5 = com.google.android.gms.internal.play_billing.zzan.zza(r2, r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzan.zza(r3, r4)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r6 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r6
            if (r5 == 0) goto L_0x004a
            java.lang.String r7 = r5.getSku()
            java.lang.String r11 = r5.getType()
            goto L_0x005a
        L_0x004a:
            com.android.billingclient.api.ProductDetails r7 = r6.zza()
            java.lang.String r7 = r7.getProductId()
            com.android.billingclient.api.ProductDetails r11 = r6.zza()
            java.lang.String r11 = r11.getProductType()
        L_0x005a:
            java.lang.String r12 = "subs"
            boolean r12 = r11.equals(r12)
            r13 = 9
            java.lang.String r14 = "BillingClient"
            if (r12 == 0) goto L_0x007f
            boolean r12 = r8.zzi
            if (r12 == 0) goto L_0x006b
            goto L_0x007f
        L_0x006b:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zzb.zzk(r14, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzo
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r13, r10, r0)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzo
            r8.zzak(r0)
            return r0
        L_0x007f:
            boolean r12 = r34.zzp()
            if (r12 == 0) goto L_0x00a0
            boolean r12 = r8.zzl
            if (r12 == 0) goto L_0x008a
            goto L_0x00a0
        L_0x008a:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zzb.zzk(r14, r0)
            r0 = 18
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzh
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r10, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzh
            r8.zzak(r0)
            return r0
        L_0x00a0:
            int r12 = r2.size()
            r15 = 1
            if (r12 <= r15) goto L_0x00c2
            boolean r12 = r8.zzs
            if (r12 == 0) goto L_0x00ac
            goto L_0x00c2
        L_0x00ac:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zzb.zzk(r14, r0)
            r0 = 19
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzt
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r10, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzt
            r8.zzak(r0)
            return r0
        L_0x00c2:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x00e3
            boolean r12 = r8.zzt
            if (r12 == 0) goto L_0x00cd
            goto L_0x00e3
        L_0x00cd:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zzb.zzk(r14, r0)
            r0 = 20
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzv
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r10, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzv
            r8.zzak(r0)
            return r0
        L_0x00e3:
            boolean r12 = r8.zzl
            if (r12 == 0) goto L_0x0463
            boolean r12 = r8.zzn
            boolean r13 = r8.zzv
            com.android.billingclient.api.PendingPurchasesParams r10 = r8.zzz
            boolean r10 = r10.isEnabledForOneTimeProducts()
            com.android.billingclient.api.PendingPurchasesParams r4 = r8.zzz
            boolean r4 = r4.isEnabledForPrepaidPlans()
            boolean r15 = r8.zzA
            r17 = r9
            java.lang.String r9 = r8.zzb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r18 = r11
            java.lang.String r11 = "playBillingLibraryVersion"
            r0.putString(r11, r9)
            int r9 = r34.zza()
            if (r9 == 0) goto L_0x0118
            int r9 = r34.zza()
            java.lang.String r11 = "prorationMode"
            r0.putInt(r11, r9)
        L_0x0118:
            java.lang.String r9 = r34.zzb()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x012b
            java.lang.String r9 = r34.zzb()
            java.lang.String r11 = "accountId"
            r0.putString(r11, r9)
        L_0x012b:
            java.lang.String r9 = r34.zzc()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x013e
            java.lang.String r9 = r34.zzc()
            java.lang.String r11 = "obfuscatedProfileId"
            r0.putString(r11, r9)
        L_0x013e:
            boolean r9 = r34.zzo()
            if (r9 == 0) goto L_0x014a
            java.lang.String r9 = "isOfferPersonalizedByDeveloper"
            r11 = 1
            r0.putBoolean(r9, r11)
        L_0x014a:
            r9 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x0163
            java.util.ArrayList r11 = new java.util.ArrayList
            java.lang.String[] r19 = new java.lang.String[]{r9}
            java.util.List r9 = java.util.Arrays.asList(r19)
            r11.<init>(r9)
            java.lang.String r9 = "skusToReplace"
            r0.putStringArrayList(r9, r11)
        L_0x0163:
            java.lang.String r9 = r34.zzd()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0176
            java.lang.String r9 = r34.zzd()
            java.lang.String r11 = "oldSkuPurchaseToken"
            r0.putString(r11, r9)
        L_0x0176:
            r9 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x0182
            java.lang.String r11 = "oldSkuPurchaseId"
            r0.putString(r11, r9)
        L_0x0182:
            java.lang.String r11 = r34.zze()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0196
            java.lang.String r11 = r34.zze()
            java.lang.String r9 = "originalExternalTransactionId"
            r0.putString(r9, r11)
            r9 = 0
        L_0x0196:
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x01a1
            java.lang.String r11 = "paymentsPurchaseParams"
            r0.putString(r11, r9)
        L_0x01a1:
            if (r12 == 0) goto L_0x01ac
            if (r10 == 0) goto L_0x01ac
            java.lang.String r9 = "enablePendingPurchases"
            r10 = 1
            r0.putBoolean(r9, r10)
            goto L_0x01ad
        L_0x01ac:
            r10 = 1
        L_0x01ad:
            if (r13 == 0) goto L_0x01b6
            if (r4 == 0) goto L_0x01b6
            java.lang.String r4 = "enablePendingPurchaseForSubscriptions"
            r0.putBoolean(r4, r10)
        L_0x01b6:
            if (r15 == 0) goto L_0x01bd
            java.lang.String r4 = "enableAlternativeBilling"
            r0.putBoolean(r4, r10)
        L_0x01bd:
            boolean r4 = r2.isEmpty()
            java.lang.String r9 = "additionalSkuTypes"
            java.lang.String r10 = "additionalSkus"
            java.lang.String r11 = "SKU_SERIALIZED_DOCID_LIST"
            java.lang.String r12 = "skuDetailsTokens"
            java.lang.String r13 = "SKU_OFFER_ID_TOKEN_LIST"
            if (r4 != 0) goto L_0x02d3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r20 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r21 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r22 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r23 = r2.iterator()
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x01f8:
            boolean r28 = r23.hasNext()
            if (r28 == 0) goto L_0x0265
            java.lang.Object r28 = r23.next()
            com.android.billingclient.api.SkuDetails r28 = (com.android.billingclient.api.SkuDetails) r28
            java.lang.String r29 = r28.zzf()
            boolean r29 = r29.isEmpty()
            if (r29 != 0) goto L_0x0218
            r29 = r6
            java.lang.String r6 = r28.zzf()
            r4.add(r6)
            goto L_0x021a
        L_0x0218:
            r29 = r6
        L_0x021a:
            java.lang.String r6 = r28.zzc()
            r30 = r5
            java.lang.String r5 = r28.zzb()
            int r31 = r28.zza()
            java.lang.String r8 = r28.zze()
            r15.add(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r16 = 1
            r6 = r6 ^ 1
            r24 = r24 | r6
            r7.add(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ 1
            r25 = r25 | r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
            r1.add(r5)
            if (r31 == 0) goto L_0x0250
            r5 = r16
            goto L_0x0251
        L_0x0250:
            r5 = 0
        L_0x0251:
            r26 = r26 | r5
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            r5 = r5 ^ 1
            r27 = r27 | r5
            r14.add(r8)
            r8 = r32
            r6 = r29
            r5 = r30
            goto L_0x01f8
        L_0x0265:
            r30 = r5
            r29 = r6
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0272
            r0.putStringArrayList(r12, r4)
        L_0x0272:
            if (r24 == 0) goto L_0x0277
            r0.putStringArrayList(r13, r15)
        L_0x0277:
            if (r25 == 0) goto L_0x027e
            java.lang.String r4 = "SKU_OFFER_ID_LIST"
            r0.putStringArrayList(r4, r7)
        L_0x027e:
            if (r26 == 0) goto L_0x0285
            java.lang.String r4 = "SKU_OFFER_TYPE_LIST"
            r0.putIntegerArrayList(r4, r1)
        L_0x0285:
            if (r27 == 0) goto L_0x028a
            r0.putStringArrayList(r11, r14)
        L_0x028a:
            int r1 = r2.size()
            r4 = 1
            if (r1 <= r4) goto L_0x0386
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r2.size()
            int r5 = r5 + -1
            r1.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.size()
            int r6 = r6 + -1
            r5.<init>(r6)
            r11 = r4
        L_0x02a8:
            int r6 = r2.size()
            if (r11 >= r6) goto L_0x02cb
            java.lang.Object r6 = r2.get(r11)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.getSku()
            r1.add(r6)
            java.lang.Object r6 = r2.get(r11)
            com.android.billingclient.api.SkuDetails r6 = (com.android.billingclient.api.SkuDetails) r6
            java.lang.String r6 = r6.getType()
            r5.add(r6)
            int r11 = r11 + 1
            goto L_0x02a8
        L_0x02cb:
            r0.putStringArrayList(r10, r1)
            r0.putStringArrayList(r9, r5)
            goto L_0x0386
        L_0x02d3:
            r21 = r1
            r30 = r5
            r29 = r6
            r20 = r7
            r22 = r14
            r4 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + -1
            r2.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x0304:
            int r14 = r3.size()
            if (r8 >= r14) goto L_0x0365
            java.lang.Object r14 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r14 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r14
            com.android.billingclient.api.ProductDetails r15 = r14.zza()
            java.lang.String r16 = r15.zzb()
            boolean r16 = r16.isEmpty()
            if (r16 != 0) goto L_0x0325
            java.lang.String r4 = r15.zzb()
            r5.add(r4)
        L_0x0325:
            java.lang.String r4 = r14.zzb()
            r6.add(r4)
            java.lang.String r4 = r15.zzc()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x033d
            java.lang.String r4 = r15.zzc()
            r7.add(r4)
        L_0x033d:
            if (r8 <= 0) goto L_0x0361
            java.lang.Object r4 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r4 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r4
            com.android.billingclient.api.ProductDetails r4 = r4.zza()
            java.lang.String r4 = r4.getProductId()
            r1.add(r4)
            java.lang.Object r4 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r4 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r4
            com.android.billingclient.api.ProductDetails r4 = r4.zza()
            java.lang.String r4 = r4.getProductType()
            r2.add(r4)
        L_0x0361:
            int r8 = r8 + 1
            r4 = 1
            goto L_0x0304
        L_0x0365:
            r0.putStringArrayList(r13, r6)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0371
            r0.putStringArrayList(r12, r5)
        L_0x0371:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x037a
            r0.putStringArrayList(r11, r7)
        L_0x037a:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x0386
            r0.putStringArrayList(r10, r1)
            r0.putStringArrayList(r9, r2)
        L_0x0386:
            boolean r1 = r0.containsKey(r13)
            r8 = r32
            if (r1 == 0) goto L_0x03a5
            boolean r1 = r8.zzq
            if (r1 == 0) goto L_0x0393
            goto L_0x03a5
        L_0x0393:
            r0 = 21
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzu
            r2 = 2
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r2, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzu
            r8.zzak(r0)
            return r0
        L_0x03a5:
            java.lang.String r1 = "skuPackageName"
            if (r30 == 0) goto L_0x03bd
            java.lang.String r2 = r30.zzd()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03bd
            java.lang.String r2 = r30.zzd()
            r0.putString(r1, r2)
        L_0x03ba:
            r1 = 0
            r15 = 1
            goto L_0x03db
        L_0x03bd:
            if (r29 == 0) goto L_0x03d9
            com.android.billingclient.api.ProductDetails r2 = r29.zza()
            java.lang.String r2 = r2.zza()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03d9
            com.android.billingclient.api.ProductDetails r2 = r29.zza()
            java.lang.String r2 = r2.zza()
            r0.putString(r1, r2)
            goto L_0x03ba
        L_0x03d9:
            r1 = 0
            r15 = 0
        L_0x03db:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x03e6
            java.lang.String r2 = "accountName"
            r0.putString(r2, r1)
        L_0x03e6:
            android.content.Intent r1 = r33.getIntent()
            if (r1 != 0) goto L_0x03f4
            java.lang.String r1 = "Activity's intent is null."
            r9 = r22
            com.google.android.gms.internal.play_billing.zzb.zzk(r9, r1)
            goto L_0x0425
        L_0x03f4:
            r9 = r22
            java.lang.String r2 = "PROXY_PACKAGE"
            java.lang.String r4 = r1.getStringExtra(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0425
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = "proxyPackage"
            r0.putString(r2, r1)
            android.content.Context r2 = r8.zze     // Catch:{ NameNotFoundException -> 0x041e }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x041e }
            r4 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x041e }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x041e }
            r2 = r21
            r0.putString(r2, r1)     // Catch:{ NameNotFoundException -> 0x0420 }
            goto L_0x0425
        L_0x041e:
            r2 = r21
        L_0x0420:
            java.lang.String r1 = "package not found"
            r0.putString(r2, r1)
        L_0x0425:
            boolean r1 = r8.zzt
            if (r1 == 0) goto L_0x0433
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0433
            r1 = 17
        L_0x0431:
            r3 = r1
            goto L_0x0445
        L_0x0433:
            boolean r1 = r8.zzr
            if (r1 == 0) goto L_0x043c
            if (r15 == 0) goto L_0x043c
            r1 = 15
            goto L_0x0431
        L_0x043c:
            boolean r1 = r8.zzn
            if (r1 == 0) goto L_0x0443
            r3 = 9
            goto L_0x0445
        L_0x0443:
            r1 = 6
            goto L_0x0431
        L_0x0445:
            com.android.billingclient.api.zzas r10 = new com.android.billingclient.api.zzas
            r1 = r10
            r2 = r32
            r4 = r20
            r5 = r18
            r6 = r34
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r32
            r2 = r10
            java.util.concurrent.Future r0 = r1.zzao(r2, r3, r5, r6)
            r1 = 78
            goto L_0x047c
        L_0x0463:
            r20 = r7
            r17 = r9
            r18 = r11
            r9 = r14
            com.android.billingclient.api.zzr r2 = new com.android.billingclient.api.zzr
            r2.<init>(r8, r7, r11)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r32
            java.util.concurrent.Future r0 = r1.zzao(r2, r3, r5, r6)
            r1 = 80
        L_0x047c:
            if (r0 != 0) goto L_0x0490
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzm     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r1 = 25
            r2 = 2
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r1, r2, r0)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r8.zzap(r0)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzm     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r8.zzak(r0)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            return r0
        L_0x0490:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r0.get(r3, r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            int r2 = com.google.android.gms.internal.play_billing.zzb.zzb(r0, r9)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            java.lang.String r3 = com.google.android.gms.internal.play_billing.zzb.zzg(r0, r9)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            if (r2 == 0) goto L_0x04cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r4.<init>()     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            java.lang.String r5 = "Unable to buy item, Error response code: "
            r4.append(r5)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r4.append(r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            java.lang.String r4 = r4.toString()     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            com.google.android.gms.internal.play_billing.zzb.zzk(r9, r4)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            com.android.billingclient.api.BillingResult r2 = com.android.billingclient.api.zzce.zza(r2, r3)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            if (r0 == 0) goto L_0x04c0
            r1 = 23
        L_0x04c0:
            r3 = 2
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r1, r3, r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r8.zzap(r0)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r8.zzak(r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            return r2
        L_0x04cc:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r33
            r1.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r1.putExtra(r2, r0)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            r3.startActivity(r1)     // Catch:{ TimeoutException -> 0x04ff, CancellationException -> 0x04fd, Exception -> 0x04e6 }
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzl
            return r0
        L_0x04e6:
            r0 = move-exception
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzl(r9, r1, r0)
            r0 = 5
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzm
            r2 = 2
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r2, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzm
            r8.zzak(r0)
            return r0
        L_0x04fd:
            r0 = move-exception
            goto L_0x0500
        L_0x04ff:
            r0 = move-exception
        L_0x0500:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzl(r9, r1, r0)
            r0 = 4
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzn
            r2 = 2
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r2, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzn
            r8.zzak(r0)
            return r0
        L_0x0516:
            r2 = r10
            r0 = 12
            com.android.billingclient.api.BillingResult r1 = com.android.billingclient.api.zzce.zzF
            com.google.android.gms.internal.play_billing.zzga r0 = com.android.billingclient.api.zzcb.zza(r0, r2, r1)
            r8.zzap(r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzce.zzF
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public final void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 7, zzce.zzm));
            productDetailsResponseListener.onProductDetailsResponse(zzce.zzm, new ArrayList());
        } else if (!this.zzt) {
            zzb.zzk("BillingClient", "Querying product details is not supported.");
            zzap(zzcb.zza(20, 7, zzce.zzv));
            productDetailsResponseListener.onProductDetailsResponse(zzce.zzv, new ArrayList());
        } else {
            if (zzao(new zzan(this, queryProductDetailsParams, productDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzao(this, productDetailsResponseListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 7, zzal));
                productDetailsResponseListener.onProductDetailsResponse(zzal, new ArrayList());
            }
        }
    }

    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzas(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzap(zzcb.zza(2, 8, zzce.zzm));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzm, (List<SkuDetails>) null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            zzap(zzcb.zza(49, 8, zzce.zzf));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzf, (List<SkuDetails>) null);
        } else if (skusList == null) {
            zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            zzap(zzcb.zza(48, 8, zzce.zze));
            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zze, (List<SkuDetails>) null);
        } else {
            if (zzao(new zzac(this, skuType, skusList, (String) null, skuDetailsResponseListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzad(this, skuDetailsResponseListener), zzaj()) == null) {
                BillingResult zzal = zzal();
                zzap(zzcb.zza(25, 8, zzal));
                skuDetailsResponseListener.onSkuDetailsResponse(zzal, (List<SkuDetails>) null);
            }
        }
    }

    public final BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            zzb.zzk("BillingClient", "Service disconnected.");
            return zzce.zzm;
        } else if (!this.zzp) {
            zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzce.zzw;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
            zzao(new zzap(this, bundle, activity, new zzaw(this, this.zzc, inAppMessageResponseListener)), 5000, (Runnable) null, this.zzc);
            return zzce.zzl;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzap(zzcb.zza(24, 3, zzce.zzn));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzS(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, (List<Purchase>) null);
        } else {
            zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzT(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzap(zzcb.zza(24, 4, zzce.zzn));
        consumeResponseListener.onConsumeResponse(zzce.zzn, consumeParams.getPurchaseToken());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzap(zzcb.zza(24, 15, zzce.zzn));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzn, (AlternativeBillingOnlyReportingDetails) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzap(zzcb.zza(24, 24, zzce.zzn));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzn, (ExternalOfferReportingDetails) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzW(BillingConfigResponseListener billingConfigResponseListener) {
        zzap(zzcb.zza(24, 13, zzce.zzn));
        billingConfigResponseListener.onBillingConfigResponse(zzce.zzn, (BillingConfig) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzap(zzcb.zza(24, 14, zzce.zzn));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzY(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzap(zzcb.zza(24, 23, zzce.zzn));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzZ(ProductDetailsResponseListener productDetailsResponseListener) {
        zzap(zzcb.zza(24, 7, zzce.zzn));
        productDetailsResponseListener.onProductDetailsResponse(zzce.zzn, new ArrayList());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaa(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzap(zzcb.zza(24, 11, zzce.zzn));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzce.zzn, (List<PurchaseHistoryRecord>) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(PurchasesResponseListener purchasesResponseListener) {
        zzap(zzcb.zza(24, 9, zzce.zzn));
        purchasesResponseListener.onQueryPurchasesResponse(zzce.zzn, zzai.zzk());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzac(SkuDetailsResponseListener skuDetailsResponseListener) {
        zzap(zzcb.zza(24, 8, zzce.zzn));
        skuDetailsResponseListener.onSkuDetailsResponse(zzce.zzn, (List<SkuDetails>) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzad(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzap(zzcb.zza(24, 16, zzce.zzn));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzce.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzae(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzap(zzcb.zza(24, 25, zzce.zzn));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzce.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, (String) null, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            zzs zzs2 = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd2 = zzs2.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zza(zzb.zzb(zzd2, "BillingClient"), zzb.zzg(zzd2, "BillingClient")));
            return null;
        } catch (Exception e) {
            zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            zzap(zzcb.zza(28, 3, zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zzm);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int i;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                zzs zzs2 = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str2 = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze2 = zzs2.zze(9, packageName, purchaseToken, bundle);
                i = zze2.getInt("RESPONSE_CODE");
                str = zzb.zzg(zze2, "BillingClient");
            } else {
                i = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzce.zza(i, str);
            if (i == 0) {
                zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return null;
            }
            zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + i);
            zzap(zzcb.zza(23, 4, zza2));
            consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            return null;
        } catch (Exception e) {
            zzb.zzl("BillingClient", "Error consuming purchase!", e);
            zzap(zzcb.zza(29, 4, zzce.zzm));
            consumeResponseListener.onConsumeResponse(zzce.zzm, purchaseToken);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            this.zzg.zzp(18, this.zze.getPackageName(), bundle, new zzbk(billingConfigResponseListener, this.zzf, this.zzk, (zzbj) null));
        } catch (DeadObjectException e) {
            zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            zzap(zzcb.zza(62, 13, zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzm, (BillingConfig) null);
        } catch (Exception e2) {
            zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            zzap(zzcb.zza(62, 13, zzce.zzj));
            billingConfigResponseListener.onBillingConfigResponse(zzce.zzj, (BillingConfig) null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String str;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        String zzb2 = queryProductDetailsParams.zzb();
        zzai zza2 = queryProductDetailsParams.zza();
        int size = zza2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i5 = i4 + 20;
            ArrayList arrayList2 = new ArrayList(zza2.subList(i4, i5 > size ? size : i5));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                zzs zzs2 = this.zzg;
                int i7 = true != this.zzw ? 17 : 20;
                String packageName = this.zze.getPackageName();
                boolean zzat = zzat();
                String str2 = this.zzb;
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str2);
                bundle2.putBoolean(InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zzat) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size3 = arrayList2.size();
                zzai zzai = zza2;
                int i8 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i8 < size3) {
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add((Object) null);
                    z |= !TextUtils.isEmpty((CharSequence) null);
                    int i9 = size3;
                    if (((QueryProductDetailsParams.Product) arrayList2.get(i8)).zzb().equals("first_party")) {
                        zzaa.zzc((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add((Object) null);
                        z2 = true;
                    }
                    i8++;
                    size3 = i9;
                    arrayList2 = arrayList6;
                }
                if (z) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !TextUtils.isEmpty((CharSequence) null)) {
                    bundle2.putString("accountName", (String) null);
                }
                i3 = 7;
                try {
                    Bundle zzl2 = zzs2.zzl(i7, packageName, zzb2, bundle, bundle2);
                    str = "Item is unavailable for purchase.";
                    if (zzl2 == null) {
                        zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        zzap(zzcb.zza(44, 7, zzce.zzC));
                        break;
                    } else if (!zzl2.containsKey("DETAILS_LIST")) {
                        i = zzb.zzb(zzl2, "BillingClient");
                        str = zzb.zzg(zzl2, "BillingClient");
                        if (i != 0) {
                            zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                            zzap(zzcb.zza(23, 7, zzce.zza(i, str)));
                        } else {
                            zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            zzap(zzcb.zza(45, 7, zzce.zza(6, str)));
                            i = 6;
                        }
                    } else {
                        ArrayList<String> stringArrayList = zzl2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                            zzap(zzcb.zza(46, 7, zzce.zzC));
                            break;
                        }
                        int i10 = 0;
                        while (i10 < stringArrayList.size()) {
                            try {
                                ProductDetails productDetails = new ProductDetails(stringArrayList.get(i10));
                                zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                arrayList.add(productDetails);
                                i10++;
                            } catch (JSONException e) {
                                zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                str = "Error trying to decode SkuDetails.";
                                i2 = 6;
                                zzap(zzcb.zza(47, 7, zzce.zza(6, str)));
                                i = i2;
                                productDetailsResponseListener.onProductDetailsResponse(zzce.zza(i, str), arrayList);
                                return null;
                            }
                        }
                        i4 = i5;
                        zza2 = zzai;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i2 = 6;
                    zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    zzap(zzcb.zza(43, i3, zzce.zzj));
                    str = "An internal error occurred.";
                    i = i2;
                    productDetailsResponseListener.onProductDetailsResponse(zzce.zza(i, str), arrayList);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                i2 = 6;
                i3 = 7;
                zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                zzap(zzcb.zza(43, i3, zzce.zzj));
                str = "An internal error occurred.";
                i = i2;
                productDetailsResponseListener.onProductDetailsResponse(zzce.zza(i, str), arrayList);
                return null;
            }
        }
        i = 4;
        productDetailsResponseListener.onProductDetailsResponse(zzce.zza(i, str), arrayList);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzo(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String str3;
        int i;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    zzs zzs2 = this.zzg;
                    String packageName = this.zze.getPackageName();
                    int i4 = this.zzk;
                    boolean isEnabledForOneTimeProducts = this.zzz.isEnabledForOneTimeProducts();
                    boolean zzat = zzat();
                    String str4 = this.zzb;
                    Bundle bundle3 = new Bundle();
                    if (i4 >= 9) {
                        bundle3.putString("playBillingLibraryVersion", str4);
                    }
                    if (i4 >= 9 && isEnabledForOneTimeProducts) {
                        bundle3.putBoolean(InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, true);
                    }
                    if (zzat) {
                        bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundle = zzs2.zzl(10, packageName, str, bundle2, bundle3);
                    String str5 = str;
                } else {
                    bundle = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle2);
                }
                str3 = "Item is unavailable for purchase.";
                if (bundle == null) {
                    zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                    zzap(zzcb.zza(44, 8, zzce.zzC));
                    break;
                } else if (!bundle.containsKey("DETAILS_LIST")) {
                    int zzb2 = zzb.zzb(bundle, "BillingClient");
                    str3 = zzb.zzg(bundle, "BillingClient");
                    if (zzb2 != 0) {
                        zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + zzb2);
                        zzap(zzcb.zza(23, 8, zzce.zza(zzb2, str3)));
                        i = zzb2;
                    } else {
                        zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        zzap(zzcb.zza(45, 8, zzce.zza(6, str3)));
                        i = 6;
                    }
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                        zzap(zzcb.zza(46, 8, zzce.zzC));
                        break;
                    }
                    int i5 = 0;
                    while (i5 < stringArrayList.size()) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                            zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                            i5++;
                        } catch (JSONException e) {
                            zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                            str3 = "Error trying to decode SkuDetails.";
                            zzap(zzcb.zza(47, 8, zzce.zza(6, str3)));
                            i = 6;
                        }
                    }
                    i2 = i3;
                }
            } catch (Exception e2) {
                zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                zzap(zzcb.zza(43, 8, zzce.zzm));
                str3 = "Service connection is disconnected.";
                i = -1;
            }
        }
        i = 4;
        arrayList = null;
        skuDetailsResponseListener.onSkuDetailsResponse(zzce.zza(i, str3), arrayList);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzt(12, this.zze.getPackageName(), bundle, new zzbs(new WeakReference(activity), resultReceiver, (zzbr) null));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzm(21, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbe(alternativeBillingOnlyReportingDetailsListener, this.zzf, this.zzk, (zzbd) null));
        } catch (Exception unused) {
            zzap(zzcb.zza(70, 15, zzce.zzj));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzce.zzj, (AlternativeBillingOnlyReportingDetails) null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzn(22, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbg(externalOfferReportingDetailsListener, this.zzf, this.zzk, (zzbf) null));
        } catch (Exception e) {
            zzap(zzcb.zzb(94, 24, zzce.zzj, String.format("%s: %s", new Object[]{e.getClass().getName(), zzab.zzb(e.getMessage())})));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzce.zzj, (ExternalOfferReportingDetails) null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            this.zzg.zzr(21, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbo(alternativeBillingOnlyAvailabilityListener, this.zzf, this.zzk, (zzbn) null));
        } catch (Exception unused) {
            zzap(zzcb.zza(69, 14, zzce.zzj));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzce.zzj);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            this.zzg.zzs(22, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbq(externalOfferAvailabilityListener, this.zzf, this.zzk, (zzbp) null));
        } catch (Exception e) {
            zzap(zzcb.zzb(91, 23, zzce.zzj, String.format("%s: %s", new Object[]{e.getClass().getName(), zzab.zzb(e.getMessage())})));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzce.zzj);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            this.zzg.zzo(21, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbi(new WeakReference(activity), resultReceiver, (zzbh) null));
        } catch (Exception unused) {
            zzap(zzcb.zza(74, 16, zzce.zzj));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(zzce.zzj);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            this.zzg.zzq(22, this.zze.getPackageName(), zzb.zzd(this.zzb), new zzbm(new WeakReference(activity), resultReceiver, (zzbl) null));
        } catch (Exception e) {
            zzap(zzcb.zzb(98, 25, zzce.zzj, String.format("%s: %s", new Object[]{e.getClass().getName(), zzab.zzb(e.getMessage())})));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(zzce.zzj);
        }
        return null;
    }

    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(str, purchaseHistoryResponseListener);
    }

    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzas(str, purchasesResponseListener);
    }

    public BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else if (!isReady()) {
            zzap(zzcb.zza(2, 16, zzce.zzm));
            return zzce.zzm;
        } else if (!this.zzx) {
            zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzap(zzcb.zza(66, 16, zzce.zzE));
            return zzce.zzE;
        } else {
            if (zzao(new zzs(this, activity, new zzax(this, this.zzc, alternativeBillingOnlyInformationDialogListener), alternativeBillingOnlyInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzt(this, alternativeBillingOnlyInformationDialogListener), this.zzc) != null) {
                return zzce.zzl;
            }
            BillingResult zzal = zzal();
            zzap(zzcb.zza(25, 16, zzal));
            return zzal;
        }
    }

    public BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else if (!isReady()) {
            zzap(zzcb.zza(2, 25, zzce.zzm));
            return zzce.zzm;
        } else if (!this.zzy) {
            zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            zzap(zzcb.zza(103, 25, zzce.zzy));
            return zzce.zzy;
        } else {
            if (zzao(new zzaj(this, activity, new zzay(this, this.zzc, externalOfferInformationDialogListener), externalOfferInformationDialogListener), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, new zzal(this, externalOfferInformationDialogListener), this.zzc) != null) {
                return zzce.zzl;
            }
            BillingResult zzal = zzal();
            zzap(zzcb.zza(25, 25, zzal));
            return zzal;
        }
    }

    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, zzcc zzcc, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (zzcc) null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    BillingClientImpl(String str, Context context, zzcc zzcc, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String zzan = zzan();
        this.zzb = zzan;
        this.zze = context.getApplicationContext();
        zzgt zzy2 = zzgu.zzy();
        zzy2.zzn(zzan);
        zzy2.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzy2.zzf());
        this.zze.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, String str, zzcc zzcc) {
        this.zze = context.getApplicationContext();
        zzgt zzy2 = zzgu.zzy();
        zzy2.zzn(str);
        zzy2.zzm(this.zze.getPackageName());
        if (zzcc != null) {
            this.zzf = zzcc;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzy2.zzf());
        }
        if (purchasesUpdatedListener == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, (zzck) null, (zzc) null, userChoiceBillingListener, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = userChoiceBillingListener != null;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzck zzck, zzcc zzcc, ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan();
        this.zze = context.getApplicationContext();
        zzgt zzy2 = zzgu.zzy();
        zzy2.zzn(zzan());
        zzy2.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzy2.zzf());
        zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzo(this.zze, (PurchasesUpdatedListener) null, (zzck) null, (zzc) null, (UserChoiceBillingListener) null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zze.getPackageName();
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzc2, zzcc zzcc, ExecutorService executorService) {
        String zzan = zzan();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (zzc) null, zzan, (zzcc) null);
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzcc zzcc, ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzan(), (String) null, userChoiceBillingListener, (zzcc) null, (ExecutorService) null);
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(zzcb.zza(37, 6, zzce.zzd));
            billingClientStateListener.onBillingSetupFinished(zzce.zzd);
        } else if (this.zza == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(zzcb.zza(38, 6, zzce.zzm));
            billingClientStateListener.onBillingSetupFinished(zzce.zzm);
        } else {
            this.zza = 1;
            zzb.zzj("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzbc(this, billingClientStateListener, (zzbb) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            zzb.zzj("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            zzb.zzj("BillingClient", "Billing service unavailable on device.");
            zzap(zzcb.zza(i, 6, zzce.zzc));
            billingClientStateListener.onBillingSetupFinished(zzce.zzc);
        }
    }
}
