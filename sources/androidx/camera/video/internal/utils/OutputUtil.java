package androidx.camera.video.internal.utils;

import java.io.File;

public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver r9, android.net.Uri r10, java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x002d, all -> 0x002b }
            r5[r0] = r11     // Catch:{ RuntimeException -> 0x002d, all -> 0x002b }
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x002d, all -> 0x002b }
            if (r9 != 0) goto L_0x0018
            if (r9 == 0) goto L_0x0017
            r9.close()
        L_0x0017:
            return r2
        L_0x0018:
            int r11 = r9.getColumnIndexOrThrow(r11)     // Catch:{ RuntimeException -> 0x0029 }
            r9.moveToFirst()     // Catch:{ RuntimeException -> 0x0029 }
            java.lang.String r10 = r9.getString(r11)     // Catch:{ RuntimeException -> 0x0029 }
            if (r9 == 0) goto L_0x0028
            r9.close()
        L_0x0028:
            return r10
        L_0x0029:
            r11 = move-exception
            goto L_0x002f
        L_0x002b:
            r10 = move-exception
            goto L_0x0051
        L_0x002d:
            r11 = move-exception
            r9 = r2
        L_0x002f:
            java.lang.String r3 = "OutputUtil"
            java.lang.String r4 = "Failed in getting absolute path for Uri %s with Exception %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x004f }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x004f }
            r5[r0] = r10     // Catch:{ all -> 0x004f }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x004f }
            r5[r1] = r10     // Catch:{ all -> 0x004f }
            java.lang.String r10 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x004f }
            androidx.camera.core.Logger.e(r3, r10)     // Catch:{ all -> 0x004f }
            if (r9 == 0) goto L_0x004e
            r9.close()
        L_0x004e:
            return r2
        L_0x004f:
            r10 = move-exception
            r2 = r9
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()
        L_0x0056:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static boolean createParentFolder(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }
}
