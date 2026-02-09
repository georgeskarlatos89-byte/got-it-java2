package com.cardinalcommerce.a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class setRotation implements Serializable, Runnable {
    private static int configure = 1;
    private static int getInstance;
    public boolean Cardinal;
    public List<char[]> cca_continue;

    setRotation(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager != null && bluetoothManager.getAdapter() != null) {
            ArrayList arrayList = new ArrayList();
            for (BluetoothDevice name : bluetoothManager.getAdapter().getBondedDevices()) {
                arrayList.add(setHorizontalScrollBarEnabled.configure(name.getName()));
            }
            this.cca_continue = arrayList;
            this.Cardinal = bluetoothManager.getAdapter().isEnabled();
        }
    }

    public final JSONObject init() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<char[]> list = this.cca_continue;
            if ((list != null ? 25 : '`') != '`') {
                int i = getInstance;
                int i2 = (i ^ 124) + ((i & 124) << 1);
                int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
                configure = i3 % 128;
                int i4 = i3 % 2;
                if (!list.isEmpty()) {
                    jSONObject.putOpt("BondedDevices", new JSONArray(setHorizontalScrollBarEnabled.cca_continue(this.cca_continue)));
                    int i5 = getInstance;
                    int i6 = ((i5 ^ 48) + ((i5 & 48) << 1)) - 1;
                    configure = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            jSONObject.putOpt("IsBluetoothEnabled", Boolean.valueOf(this.Cardinal));
            int i8 = configure;
            int i9 = (i8 | 51) << 1;
            int i10 = -(((~i8) & 51) | (i8 & -52));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            getInstance = i11 % 128;
            int i12 = i11 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i13 = getInstance;
        int i14 = (i13 & -80) | ((~i13) & 79);
        int i15 = -(-((i13 & 79) << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        configure = i16 % 128;
        if ((i16 % 2 == 0 ? '1' : 30) != '1') {
            return jSONObject;
        }
        int i17 = 21 / 0;
        return jSONObject;
    }

    public final void Cardinal() {
        int i = configure;
        int i2 = i & 87;
        boolean z = true;
        int i3 = ((i | 87) & (~i2)) + (i2 << 1);
        getInstance = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        Executors.newSingleThreadExecutor().execute(this);
        if (!z) {
            throw null;
        }
    }

    public final void run() {
        int i = getInstance;
        int i2 = (i & 69) + (i | 69);
        configure = i2 % 128;
        int i3 = i2 % 2;
        setHorizontalScrollBarEnabled.Cardinal(this.cca_continue);
        this.Cardinal = false;
        int i4 = configure;
        int i5 = i4 ^ 65;
        int i6 = ((((i4 & 65) | i5) << 1) - (~(-i5))) - 1;
        getInstance = i6 % 128;
        int i7 = i6 % 2;
    }
}
