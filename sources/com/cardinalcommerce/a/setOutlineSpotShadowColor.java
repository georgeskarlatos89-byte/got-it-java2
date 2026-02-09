package com.cardinalcommerce.a;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import kotlin.text.Typography;

public final class setOutlineSpotShadowColor extends ContentProvider {
    private static int Cardinal = 0;
    private static int cca_continue = 1;
    private static Context configure;

    public static Context cca_continue() {
        int i = cca_continue + 91;
        Cardinal = i % 128;
        if ((i % 2 != 0 ? (char) 7 : 16) == 16) {
            return configure;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final boolean onCreate() {
        int i = ((Cardinal + 14) - 0) - 1;
        cca_continue = i % 128;
        int i2 = i % 2;
        configure = getContext();
        int i3 = Cardinal;
        int i4 = i3 & 87;
        int i5 = ((i3 ^ 87) | i4) << 1;
        int i6 = -((i3 | 87) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        cca_continue = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Throwable, java.lang.Object, android.database.Cursor] */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = Cardinal + 24;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        int i3 = i2 % 128;
        cca_continue = i3;
        ? r4 = 0;
        if ((i2 % 2 == 0 ? 'B' : 'V') != 'B') {
            int i4 = (i3 ^ 13) + ((i3 & 13) << 1);
            Cardinal = i4 % 128;
            int i5 = i4 % 2;
            return r4;
        }
        super.hashCode();
        throw r4;
    }

    public final String getType(Uri uri) {
        int i = Cardinal;
        int i2 = (((i | 84) << 1) - (i ^ 84)) - 1;
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((i | 68) << 1) - (i ^ 68);
        int i5 = (i4 & -1) + (i4 | -1);
        cca_continue = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        int i = Cardinal;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        cca_continue = i5;
        boolean z = false;
        if (!(i4 % 2 == 0)) {
            int i6 = i5 & 61;
            int i7 = (i5 | 61) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            Cardinal = i9 % 128;
            if (i9 % 2 == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            throw null;
        }
        throw null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        int i = Cardinal;
        int i2 = i & 7;
        int i3 = i2 + ((i ^ 7) | i2);
        cca_continue = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 10 : Typography.amp) != 10 ? 0 : 1;
        int i5 = ((i | 45) << 1) - (i ^ 45);
        cca_continue = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = cca_continue;
        int i2 = (i ^ 65) + ((i & 65) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = cca_continue;
        int i2 = i ^ 7;
        boolean z = true;
        int i3 = (((i & 7) | i2) << 1) - i2;
        Cardinal = i3 % 128;
        if (!(i3 % 2 == 0)) {
            throw null;
        } else if (providerInfo == null) {
            throw new NullPointerException("YourLibraryInitProvider ProviderInfo cannot be null.");
        } else if (!"${applicationId}.CCInitProvider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            int i4 = Cardinal + 45;
            cca_continue = i4 % 128;
            if (i4 % 2 == 0) {
                z = false;
            }
            if (!z) {
                int i5 = 7 / 0;
            }
        } else {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }
}
