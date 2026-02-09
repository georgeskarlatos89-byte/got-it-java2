package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.button.zzc;
import com.google.android.gms.wallet.zzau;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public abstract class zzp extends zzb implements zzq {
    public zzp() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzc.zzb(parcel);
                zzd(parcel.readInt(), (MaskedWallet) zzc.zza(parcel, MaskedWallet.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 2:
                zzc.zzb(parcel);
                zzb(parcel.readInt(), (FullWallet) zzc.zza(parcel, FullWallet.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzc.zzb(parcel);
                zzg(parcel.readInt(), zzc.zze(parcel), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzc.zzb(parcel);
                zzh(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 6:
                parcel.readInt();
                zzc.zze(parcel);
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 7:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zze zze = (zze) zzc.zza(parcel, zze.CREATOR);
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 8:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                Bundle bundle3 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 9:
                zzc.zzb(parcel);
                zzc((Status) zzc.zza(parcel, Status.CREATOR), zzc.zze(parcel), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzg zzg = (zzg) zzc.zza(parcel, zzg.CREATOR);
                Bundle bundle4 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 11:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                Bundle bundle5 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 12:
                Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzau zzau = (zzau) zzc.zza(parcel, zzau.CREATOR);
                Bundle bundle6 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 13:
                Status status6 = (Status) zzc.zza(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 14:
                zzc.zzb(parcel);
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (PaymentData) zzc.zza(parcel, PaymentData.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status7 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzm zzm = (zzm) zzc.zza(parcel, zzm.CREATOR);
                Bundle bundle8 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 16:
                Status status8 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzi zzi = (zzi) zzc.zza(parcel, zzi.CREATOR);
                Bundle bundle9 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 17:
                Status status9 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzk zzk = (zzk) zzc.zza(parcel, zzk.CREATOR);
                Bundle bundle10 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle11 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            case 19:
                zzc.zzb(parcel);
                zze((Status) zzc.zza(parcel, Status.CREATOR), (PaymentCardRecognitionIntentResponse) zzc.zza(parcel, PaymentCardRecognitionIntentResponse.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                return true;
            case 20:
                Status status10 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc zzc = (zzc) zzc.zza(parcel, zzc.CREATOR);
                Bundle bundle12 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                return true;
            default:
                return false;
        }
    }
}
