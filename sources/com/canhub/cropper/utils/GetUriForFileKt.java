package com.canhub.cropper.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"authority", "", "Landroid/content/Context;", "getUriForFile", "Landroid/net/Uri;", "context", "file", "Ljava/io/File;", "cropper_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* compiled from: GetUriForFile.kt */
public final class GetUriForFileKt {
    public static final String authority(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageName() + ".cropper.fileprovider";
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A[SYNTHETIC, Splitter:B:39:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7 A[Catch:{ Exception -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee A[Catch:{ Exception -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f3 A[Catch:{ Exception -> 0x00f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri getUriForFile(android.content.Context r10, java.io.File r11) {
        /*
            java.lang.String r0 = "getUriForFile(...)"
            java.lang.String r1 = "AIC"
            java.lang.String r2 = "content://"
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            java.lang.String r3 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            java.lang.String r3 = authority(r10)
            java.lang.String r4 = "Try get URI for scope storage - content://"
            android.util.Log.i(r1, r4)     // Catch:{ Exception -> 0x0021 }
            android.net.Uri r4 = androidx.core.content.FileProvider.getUriForFile(r10, r3, r11)     // Catch:{ Exception -> 0x0021 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch:{ Exception -> 0x0021 }
            return r4
        L_0x0021:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00f7 }
            android.util.Log.e(r1, r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices"
            android.util.Log.w(r1, r4)     // Catch:{ Exception -> 0x00f7 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00f7 }
            java.io.File r5 = r10.getCacheDir()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = "CROP_LIB_CACHE"
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00f7 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = r11.getName()     // Catch:{ Exception -> 0x00f7 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00f7 }
            r4 = 0
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            r7.<init>(r11)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            java.io.OutputStream r8 = (java.io.OutputStream) r8     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            r9 = 2
            kotlin.io.ByteStreamsKt.copyTo$default(r7, r8, r4, r9, r6)     // Catch:{ Exception -> 0x006f, all -> 0x006d }
            java.lang.String r6 = "Completed Android N+ file copy. Attempting to return the cached file"
            android.util.Log.i(r1, r6)     // Catch:{ Exception -> 0x006f, all -> 0x006d }
            android.net.Uri r5 = androidx.core.content.FileProvider.getUriForFile(r10, r3, r5)     // Catch:{ Exception -> 0x006f, all -> 0x006d }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ Exception -> 0x006f, all -> 0x006d }
            r7.close()     // Catch:{ Exception -> 0x00f7 }
            r8.close()     // Catch:{ Exception -> 0x00f7 }
            return r5
        L_0x006d:
            r0 = move-exception
            goto L_0x0073
        L_0x006f:
            r0 = move-exception
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            r8 = r6
        L_0x0073:
            r6 = r7
            goto L_0x00ec
        L_0x0076:
            r0 = move-exception
            r8 = r6
        L_0x0078:
            r6 = r7
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            r8 = r6
            goto L_0x00ec
        L_0x007d:
            r0 = move-exception
            r8 = r6
        L_0x007f:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00eb }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "Trying to provide URI manually"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r0.<init>(r2)     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "/files/my_images/"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00eb }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00eb }
            r3 = 26
            if (r2 < r3) goto L_0x00b4
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x00eb }
            java.nio.file.Path r2 = java.nio.file.Paths.get(r0, r2)     // Catch:{ all -> 0x00eb }
            java.nio.file.attribute.FileAttribute[] r3 = new java.nio.file.attribute.FileAttribute[r4]     // Catch:{ all -> 0x00eb }
            java.nio.file.Files.createDirectories(r2, r3)     // Catch:{ all -> 0x00eb }
            goto L_0x00c2
        L_0x00b4:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00eb }
            r2.<init>(r0)     // Catch:{ all -> 0x00eb }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00eb }
            if (r3 != 0) goto L_0x00c2
            r2.mkdirs()     // Catch:{ all -> 0x00eb }
        L_0x00c2:
            java.lang.String r2 = r11.getName()     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r3.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00eb }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00e5
            r6.close()     // Catch:{ Exception -> 0x00f7 }
        L_0x00e5:
            if (r8 == 0) goto L_0x00ea
            r8.close()     // Catch:{ Exception -> 0x00f7 }
        L_0x00ea:
            return r0
        L_0x00eb:
            r0 = move-exception
        L_0x00ec:
            if (r6 == 0) goto L_0x00f1
            r6.close()     // Catch:{ Exception -> 0x00f7 }
        L_0x00f1:
            if (r8 == 0) goto L_0x00f6
            r8.close()     // Catch:{ Exception -> 0x00f7 }
        L_0x00f6:
            throw r0     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.util.Log.e(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            java.lang.String r3 = "fromFile(...)"
            if (r0 >= r2) goto L_0x0137
            java.io.File r10 = r10.getExternalCacheDir()
            if (r10 == 0) goto L_0x0137
            java.lang.String r0 = "Use External storage, do not work for OS 29 and above"
            android.util.Log.i(r1, r0)     // Catch:{ Exception -> 0x012b }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x012b }
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x012b }
            java.lang.String r2 = r11.getAbsolutePath()     // Catch:{ Exception -> 0x012b }
            r0.<init>(r10, r2)     // Catch:{ Exception -> 0x012b }
            android.net.Uri r10 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x012b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)     // Catch:{ Exception -> 0x012b }
            return r10
        L_0x012b:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            android.util.Log.e(r1, r10)
        L_0x0137:
            java.lang.String r10 = "Try get URI using file://"
            android.util.Log.i(r1, r10)
            android.net.Uri r10 = android.net.Uri.fromFile(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.utils.GetUriForFileKt.getUriForFile(android.content.Context, java.io.File):android.net.Uri");
    }
}
