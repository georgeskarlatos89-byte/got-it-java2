package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.zzk;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzy extends GmsClient {
    private final Context zze;
    private final int zzf;
    private final String zzg;
    private final int zzh;
    private final boolean zzi;

    public zzy(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = context;
        this.zzf = i;
        Account account = clientSettings.getAccount();
        this.zzg = account != null ? account.name : null;
        this.zzh = i2;
        this.zzi = z;
    }

    private final Bundle zzu() {
        String packageName = this.zze.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.zzf);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.zzi);
        bundle.putString("androidPackageName", packageName);
        String str = this.zzg;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.zzh);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzo(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zzk.zzi;
    }

    public final int getMinApkVersion() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final boolean requiresAccount() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        zzs zzs = new zzs((Activity) this.zze, i);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, zzu(), zzs);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e);
            zzs.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzv zzv = new zzv(taskCompletionSource);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, zzu, zzv);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e);
            zzv.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzo) getService()).zze(paymentCardRecognitionIntentRequest, zzu(), new zzw(taskCompletionSource));
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e);
            Status status = Status.RESULT_INTERNAL_ERROR;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzu zzu = new zzu(taskCompletionSource);
        try {
            ((zzo) getService()).zzf(isReadyToPayRequest, zzu(), zzu);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            zzu.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle zzu = zzu();
        zzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzx zzx = new zzx(taskCompletionSource);
        try {
            ((zzo) getService()).zzg(paymentDataRequest, zzu, zzx);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            zzx.zzf(Status.RESULT_INTERNAL_ERROR, (PaymentData) null, Bundle.EMPTY);
        }
    }
}
