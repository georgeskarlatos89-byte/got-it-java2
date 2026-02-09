package com.google.android.gms.wallet.button;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzf {
    public static final View zza(Context context, ButtonOptions buttonOptions) {
        zze zze;
        DynamiteModule zzb = zzb(context);
        try {
            IBinder instantiate = zzb.instantiate("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (instantiate == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                zze = queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zze(instantiate);
            }
            if (zze != null) {
                return (View) ObjectWrapper.unwrap(zze.zzd(ObjectWrapper.wrap(new Context[]{zzb.getModuleContext(), context}), buttonOptions));
            }
            Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
            return null;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
        }
    }

    private static final DynamiteModule zzb(Context context) {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.LoadingException e) {
            throw new IllegalStateException(e);
        }
    }
}
