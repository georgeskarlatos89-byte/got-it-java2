package com.canhub.cropper.utils;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"getFilePathFromUri", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "uniqueName", "", "getFileFromContentUri", "Ljava/io/File;", "contentUri", "getFileExtension", "copy", "", "source", "Ljava/io/InputStream;", "target", "Ljava/io/OutputStream;", "cropper_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* compiled from: GetFilePathFromUri.kt */
public final class GetFilePathFromUriKt {
    public static final String getFilePathFromUri(Context context, Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        boolean z2 = false;
        if (path != null && StringsKt.contains$default((CharSequence) path, (CharSequence) "file://", false, 2, (Object) null)) {
            z2 = true;
        }
        if (z2) {
            String path2 = uri.getPath();
            Intrinsics.checkNotNull(path2);
            return path2;
        }
        String path3 = getFileFromContentUri(context, uri, z).getPath();
        Intrinsics.checkNotNull(path3);
        return path3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r1 != null) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.io.File getFileFromContentUri(android.content.Context r5, android.net.Uri r6, boolean r7) {
        /*
            java.lang.String r0 = getFileExtension(r5, r6)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            r0 = r1
        L_0x0009:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMdd_HHmmss"
            java.util.Locale r4 = java.util.Locale.getDefault()
            r2.<init>(r3, r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
            if (r7 == 0) goto L_0x0020
            r1 = r2
        L_0x0020:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "temp_file_"
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getCacheDir()
            r0.<init>(r1, r7)
            r0.createNewFile()
            r7 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0067 }
            java.io.InputStream r7 = r5.openInputStream(r6)     // Catch:{ Exception -> 0x0067 }
            if (r7 == 0) goto L_0x005b
            r5 = r1
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Exception -> 0x0067 }
            copy(r7, r5)     // Catch:{ Exception -> 0x0067 }
        L_0x005b:
            r1.flush()     // Catch:{ Exception -> 0x0067 }
            if (r7 == 0) goto L_0x0063
            r7.close()
        L_0x0063:
            r1.close()
            goto L_0x007f
        L_0x0067:
            r5 = move-exception
            goto L_0x006e
        L_0x0069:
            r5 = move-exception
            r1 = r7
            goto L_0x0081
        L_0x006c:
            r5 = move-exception
            r1 = r7
        L_0x006e:
            r5.printStackTrace()     // Catch:{ all -> 0x0080 }
            r5 = r7
            java.io.InputStream r5 = (java.io.InputStream) r5
            if (r7 == 0) goto L_0x0079
            r7.close()
        L_0x0079:
            r5 = r1
            java.io.FileOutputStream r5 = (java.io.FileOutputStream) r5
            if (r1 == 0) goto L_0x007f
            goto L_0x0063
        L_0x007f:
            return r0
        L_0x0080:
            r5 = move-exception
        L_0x0081:
            r6 = r7
            java.io.InputStream r6 = (java.io.InputStream) r6
            if (r7 == 0) goto L_0x0089
            r7.close()
        L_0x0089:
            r6 = r1
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            if (r1 == 0) goto L_0x0091
            r1.close()
        L_0x0091:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.utils.GetFilePathFromUriKt.getFileFromContentUri(android.content.Context, android.net.Uri, boolean):java.io.File");
    }

    private static final String getFileExtension(Context context, Uri uri) {
        if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) "content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        String path = uri.getPath();
        if (path != null) {
            return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString());
        }
        return null;
    }

    private static final void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
