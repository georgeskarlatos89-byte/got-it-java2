package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.wallet.zza;
import com.google.android.gms.internal.wallet.zzc;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zze extends zza implements IInterface {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, iObjectWrapper);
        zzc.zzc(zza, buttonOptions);
        Parcel zzb = zzb(1, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }
}
