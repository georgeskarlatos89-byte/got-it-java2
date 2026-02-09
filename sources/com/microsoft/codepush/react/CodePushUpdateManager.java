package com.microsoft.codepush.react;

import java.io.IOException;
import org.json.JSONObject;

public class CodePushUpdateManager {
    private String mDocumentsDirectory;

    public CodePushUpdateManager(String str) {
        this.mDocumentsDirectory = str;
    }

    private String getDownloadFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.DOWNLOAD_FILE_NAME);
    }

    private String getUnzippedFolderPath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.UNZIPPED_FOLDER_NAME);
    }

    private String getDocumentsDirectory() {
        return this.mDocumentsDirectory;
    }

    private String getCodePushPath() {
        String appendPathComponent = CodePushUtils.appendPathComponent(getDocumentsDirectory(), "CodePush");
        return CodePush.isUsingTestConfiguration() ? CodePushUtils.appendPathComponent(appendPathComponent, "TestPackages") : appendPathComponent;
    }

    private String getStatusFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.STATUS_FILE);
    }

    public JSONObject getCurrentPackageInfo() {
        String statusFilePath = getStatusFilePath();
        if (!FileUtils.fileAtPathExists(statusFilePath)) {
            return new JSONObject();
        }
        try {
            return CodePushUtils.getJsonObjectFromFile(statusFilePath);
        } catch (IOException e) {
            throw new CodePushUnknownException("Error getting current package info", e);
        }
    }

    public void updateCurrentPackageInfo(JSONObject jSONObject) {
        try {
            CodePushUtils.writeJsonToFile(jSONObject, getStatusFilePath());
        } catch (IOException e) {
            throw new CodePushUnknownException("Error updating current package info", e);
        }
    }

    public String getCurrentPackageFolderPath() {
        String optString = getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, (String) null);
        if (optString == null) {
            return null;
        }
        return getPackageFolderPath(optString);
    }

    public String getCurrentPackageBundlePath(String str) {
        JSONObject currentPackage;
        String currentPackageFolderPath = getCurrentPackageFolderPath();
        if (currentPackageFolderPath == null || (currentPackage = getCurrentPackage()) == null) {
            return null;
        }
        String optString = currentPackage.optString(CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, (String) null);
        if (optString == null) {
            return CodePushUtils.appendPathComponent(currentPackageFolderPath, str);
        }
        return CodePushUtils.appendPathComponent(currentPackageFolderPath, optString);
    }

    public String getPackageFolderPath(String str) {
        return CodePushUtils.appendPathComponent(getCodePushPath(), str);
    }

    public String getCurrentPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, (String) null);
    }

    public String getPreviousPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, (String) null);
    }

    public JSONObject getCurrentPackage() {
        String currentPackageHash = getCurrentPackageHash();
        if (currentPackageHash == null) {
            return null;
        }
        return getPackage(currentPackageHash);
    }

    public JSONObject getPreviousPackage() {
        String previousPackageHash = getPreviousPackageHash();
        if (previousPackageHash == null) {
            return null;
        }
        return getPackage(previousPackageHash);
    }

    public JSONObject getPackage(String str) {
        try {
            return CodePushUtils.getJsonObjectFromFile(CodePushUtils.appendPathComponent(getPackageFolderPath(str), CodePushConstants.PACKAGE_FILE_NAME));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0235 A[SYNTHETIC, Splitter:B:128:0x0235] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x023d A[Catch:{ IOException -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0242 A[Catch:{ IOException -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0247 A[Catch:{ IOException -> 0x0239 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void downloadPackage(org.json.JSONObject r26, java.lang.String r27, com.microsoft.codepush.react.DownloadProgressCallback r28, java.lang.String r29) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            java.lang.String r3 = "Error closing IO resources."
            java.lang.String r4 = "packageHash"
            r5 = 0
            java.lang.String r4 = r0.optString(r4, r5)
            r6 = r25
            java.lang.String r7 = r6.getPackageFolderPath(r4)
            java.lang.String r8 = "app.json"
            java.lang.String r8 = com.microsoft.codepush.react.CodePushUtils.appendPathComponent(r7, r8)
            boolean r9 = com.microsoft.codepush.react.FileUtils.fileAtPathExists(r7)
            if (r9 == 0) goto L_0x0024
            com.microsoft.codepush.react.FileUtils.deleteDirectoryAtPath(r7)
        L_0x0024:
            java.lang.String r9 = "downloadUrl"
            java.lang.String r9 = r0.optString(r9, r5)
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x021f, all -> 0x0217 }
            r10.<init>(r9)     // Catch:{ MalformedURLException -> 0x021f, all -> 0x0217 }
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ MalformedURLException -> 0x021f, all -> 0x0217 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ MalformedURLException -> 0x021f, all -> 0x0217 }
            java.lang.String r11 = "Accept-Encoding"
            java.lang.String r12 = "identity"
            r10.setRequestProperty(r11, r12)     // Catch:{ MalformedURLException -> 0x0211, all -> 0x020d }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ MalformedURLException -> 0x0211, all -> 0x020d }
            java.io.InputStream r12 = r10.getInputStream()     // Catch:{ MalformedURLException -> 0x0211, all -> 0x020d }
            r11.<init>(r12)     // Catch:{ MalformedURLException -> 0x0211, all -> 0x020d }
            int r12 = r10.getContentLength()     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            long r12 = (long) r12     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.io.File r14 = new java.io.File     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.lang.String r15 = r25.getCodePushPath()     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            r14.<init>(r15)     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            r14.mkdirs()     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.io.File r15 = new java.io.File     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.lang.String r5 = "download.zip"
            r15.<init>(r14, r5)     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            r5.<init>(r15)     // Catch:{ MalformedURLException -> 0x0207, all -> 0x0203 }
            java.io.BufferedOutputStream r14 = new java.io.BufferedOutputStream     // Catch:{ MalformedURLException -> 0x01fa, all -> 0x01f4 }
            r6 = 262144(0x40000, float:3.67342E-40)
            r14.<init>(r5, r6)     // Catch:{ MalformedURLException -> 0x01fa, all -> 0x01f4 }
            r17 = r9
            byte[] r9 = new byte[r6]     // Catch:{ MalformedURLException -> 0x01ee, all -> 0x01e9 }
            r6 = 4
            r19 = r3
            byte[] r3 = new byte[r6]     // Catch:{ MalformedURLException -> 0x01e5, all -> 0x01e1 }
            r20 = 0
            r22 = r7
            r6 = r20
        L_0x0078:
            r0 = 0
            r20 = r4
            r4 = 262144(0x40000, float:3.67342E-40)
            int r2 = r11.read(r9, r0, r4)     // Catch:{ MalformedURLException -> 0x01e5, all -> 0x01e1 }
            if (r2 < 0) goto L_0x00ca
            r23 = 4
            int r18 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r18 >= 0) goto L_0x009e
            r4 = r0
        L_0x008a:
            if (r4 >= r2) goto L_0x009e
            int r0 = (int) r6
            int r0 = r0 + r4
            r23 = r8
            r8 = 4
            if (r0 < r8) goto L_0x0094
            goto L_0x00a1
        L_0x0094:
            byte r16 = r9[r4]     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            r3[r0] = r16     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            int r4 = r4 + 1
            r8 = r23
            r0 = 0
            goto L_0x008a
        L_0x009e:
            r23 = r8
            r8 = 4
        L_0x00a1:
            long r0 = (long) r2     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            long r6 = r6 + r0
            r0 = 0
            r14.write(r9, r0, r2)     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            com.microsoft.codepush.react.DownloadProgress r0 = new com.microsoft.codepush.react.DownloadProgress     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            r0.<init>(r12, r6)     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            r1 = r28
            r1.call(r0)     // Catch:{ MalformedURLException -> 0x00c2, all -> 0x00ba }
            r1 = r27
            r2 = r29
            r4 = r20
            r8 = r23
            goto L_0x0078
        L_0x00ba:
            r0 = move-exception
            r16 = r5
            r5 = r14
            r2 = r19
            goto L_0x0233
        L_0x00c2:
            r0 = move-exception
            r16 = r5
            r5 = r10
            r2 = r19
            goto L_0x0228
        L_0x00ca:
            r23 = r8
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01b8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ MalformedURLException -> 0x01e5, all -> 0x01e1 }
            int r1 = r1.getInt()     // Catch:{ MalformedURLException -> 0x01e5, all -> 0x01e1 }
            r2 = 1347093252(0x504b0304, float:1.36238899E10)
            r3 = 1
            if (r1 != r2) goto L_0x00e0
            r1 = r3
            goto L_0x00e1
        L_0x00e0:
            r1 = r0
        L_0x00e1:
            r14.close()     // Catch:{ IOException -> 0x01af }
            r5.close()     // Catch:{ IOException -> 0x01af }
            r11.close()     // Catch:{ IOException -> 0x01af }
            if (r10 == 0) goto L_0x00ef
            r10.disconnect()     // Catch:{ IOException -> 0x01af }
        L_0x00ef:
            if (r1 == 0) goto L_0x01a0
            java.lang.String r1 = r25.getUnzippedFolderPath()
            com.microsoft.codepush.react.FileUtils.unzipFile(r15, r1)
            com.microsoft.codepush.react.FileUtils.deleteFileOrFolderSilently(r15)
            java.lang.String r2 = "hotcodepush.json"
            java.lang.String r2 = com.microsoft.codepush.react.CodePushUtils.appendPathComponent(r1, r2)
            boolean r4 = com.microsoft.codepush.react.FileUtils.fileAtPathExists(r2)
            if (r4 == 0) goto L_0x0119
            java.lang.String r5 = r25.getCurrentPackageFolderPath()
            r6 = r22
            com.microsoft.codepush.react.CodePushUpdateUtils.copyNecessaryFilesFromCurrentPackage(r2, r5, r6)
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            r5.delete()
            goto L_0x011b
        L_0x0119:
            r6 = r22
        L_0x011b:
            com.microsoft.codepush.react.FileUtils.copyDirectoryContents(r1, r6)
            com.microsoft.codepush.react.FileUtils.deleteFileAtPathSilently(r1)
            r1 = r27
            java.lang.String r2 = com.microsoft.codepush.react.CodePushUpdateUtils.findJSBundleInUpdateContents(r6, r1)
            if (r2 == 0) goto L_0x0185
            boolean r1 = com.microsoft.codepush.react.FileUtils.fileAtPathExists(r23)
            if (r1 == 0) goto L_0x013a
            java.io.File r1 = new java.io.File
            r5 = r23
            r1.<init>(r5)
            r1.delete()
            goto L_0x013c
        L_0x013a:
            r5 = r23
        L_0x013c:
            if (r4 == 0) goto L_0x0144
            java.lang.String r1 = "Applying diff update."
            com.microsoft.codepush.react.CodePushUtils.log((java.lang.String) r1)
            goto L_0x0149
        L_0x0144:
            java.lang.String r1 = "Applying full update."
            com.microsoft.codepush.react.CodePushUtils.log((java.lang.String) r1)
        L_0x0149:
            r1 = r29
            if (r1 == 0) goto L_0x014e
            r0 = r3
        L_0x014e:
            java.lang.String r3 = com.microsoft.codepush.react.CodePushUpdateUtils.getSignatureFilePath(r6)
            boolean r3 = com.microsoft.codepush.react.FileUtils.fileAtPathExists(r3)
            if (r0 == 0) goto L_0x016b
            if (r3 == 0) goto L_0x0163
            r0 = r20
            com.microsoft.codepush.react.CodePushUpdateUtils.verifyFolderHash(r6, r0)
            com.microsoft.codepush.react.CodePushUpdateUtils.verifyUpdateSignature(r6, r0, r1)
            goto L_0x017d
        L_0x0163:
            com.microsoft.codepush.react.CodePushInvalidUpdateException r0 = new com.microsoft.codepush.react.CodePushInvalidUpdateException
            java.lang.String r1 = "Error! Public key was provided but there is no JWT signature within app bundle to verify. Possible reasons, why that might happen: \n1. You've been released CodePush bundle update using version of CodePush CLI that is not support code signing.\n2. You've been released CodePush bundle update without providing --privateKeyPath option."
            r0.<init>(r1)
            throw r0
        L_0x016b:
            r0 = r20
            if (r3 == 0) goto L_0x0178
            java.lang.String r1 = "Warning! JWT signature exists in codepush update but code integrity check couldn't be performed because there is no public key configured. Please ensure that public key is properly configured within your application."
            com.microsoft.codepush.react.CodePushUtils.log((java.lang.String) r1)
            com.microsoft.codepush.react.CodePushUpdateUtils.verifyFolderHash(r6, r0)
            goto L_0x017d
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            com.microsoft.codepush.react.CodePushUpdateUtils.verifyFolderHash(r6, r0)
        L_0x017d:
            java.lang.String r0 = "bundlePath"
            r3 = r26
            com.microsoft.codepush.react.CodePushUtils.setJSONValueForKey(r3, r0, r2)
            goto L_0x01ab
        L_0x0185:
            com.microsoft.codepush.react.CodePushInvalidUpdateException r0 = new com.microsoft.codepush.react.CodePushInvalidUpdateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Update is invalid - A JS bundle file named \""
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "\" could not be found within the downloaded contents. Please check that you are releasing your CodePush updates using the exact same JS bundle file name that was shipped with your app's binary."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            r3 = r26
            r1 = r27
            r6 = r22
            r5 = r23
            com.microsoft.codepush.react.FileUtils.moveFile(r15, r6, r1)
        L_0x01ab:
            com.microsoft.codepush.react.CodePushUtils.writeJsonToFile(r3, r5)
            return
        L_0x01af:
            r0 = move-exception
            com.microsoft.codepush.react.CodePushUnknownException r1 = new com.microsoft.codepush.react.CodePushUnknownException
            r2 = r19
            r1.<init>(r2, r0)
            throw r1
        L_0x01b8:
            r2 = r19
            com.microsoft.codepush.react.CodePushUnknownException r0 = new com.microsoft.codepush.react.CodePushUnknownException     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.String r3 = "Received "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.String r3 = " bytes, expected "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
            throw r0     // Catch:{ MalformedURLException -> 0x01df, all -> 0x01dd }
        L_0x01dd:
            r0 = move-exception
            goto L_0x01eb
        L_0x01df:
            r0 = move-exception
            goto L_0x01f0
        L_0x01e1:
            r0 = move-exception
            r2 = r19
            goto L_0x01eb
        L_0x01e5:
            r0 = move-exception
            r2 = r19
            goto L_0x01f0
        L_0x01e9:
            r0 = move-exception
            r2 = r3
        L_0x01eb:
            r16 = r5
            goto L_0x0232
        L_0x01ee:
            r0 = move-exception
            r2 = r3
        L_0x01f0:
            r16 = r5
            r5 = r10
            goto L_0x0228
        L_0x01f4:
            r0 = move-exception
            r2 = r3
            r16 = r5
            r5 = 0
            goto L_0x0233
        L_0x01fa:
            r0 = move-exception
            r2 = r3
            r17 = r9
            r16 = r5
            r5 = r10
            r14 = 0
            goto L_0x0228
        L_0x0203:
            r0 = move-exception
            r2 = r3
            r5 = 0
            goto L_0x021c
        L_0x0207:
            r0 = move-exception
            r2 = r3
            r17 = r9
            r5 = r10
            goto L_0x0225
        L_0x020d:
            r0 = move-exception
            r2 = r3
            r5 = 0
            goto L_0x021b
        L_0x0211:
            r0 = move-exception
            r2 = r3
            r17 = r9
            r5 = r10
            goto L_0x0224
        L_0x0217:
            r0 = move-exception
            r2 = r3
            r5 = 0
            r10 = 0
        L_0x021b:
            r11 = 0
        L_0x021c:
            r16 = 0
            goto L_0x0233
        L_0x021f:
            r0 = move-exception
            r2 = r3
            r17 = r9
            r5 = 0
        L_0x0224:
            r11 = 0
        L_0x0225:
            r14 = 0
            r16 = 0
        L_0x0228:
            com.microsoft.codepush.react.CodePushMalformedDataException r1 = new com.microsoft.codepush.react.CodePushMalformedDataException     // Catch:{ all -> 0x0230 }
            r3 = r17
            r1.<init>((java.lang.String) r3, (java.net.MalformedURLException) r0)     // Catch:{ all -> 0x0230 }
            throw r1     // Catch:{ all -> 0x0230 }
        L_0x0230:
            r0 = move-exception
            r10 = r5
        L_0x0232:
            r5 = r14
        L_0x0233:
            if (r5 == 0) goto L_0x023b
            r5.close()     // Catch:{ IOException -> 0x0239 }
            goto L_0x023b
        L_0x0239:
            r0 = move-exception
            goto L_0x024b
        L_0x023b:
            if (r16 == 0) goto L_0x0240
            r16.close()     // Catch:{ IOException -> 0x0239 }
        L_0x0240:
            if (r11 == 0) goto L_0x0245
            r11.close()     // Catch:{ IOException -> 0x0239 }
        L_0x0245:
            if (r10 == 0) goto L_0x0251
            r10.disconnect()     // Catch:{ IOException -> 0x0239 }
            goto L_0x0251
        L_0x024b:
            com.microsoft.codepush.react.CodePushUnknownException r1 = new com.microsoft.codepush.react.CodePushUnknownException
            r1.<init>(r2, r0)
            throw r1
        L_0x0251:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushUpdateManager.downloadPackage(org.json.JSONObject, java.lang.String, com.microsoft.codepush.react.DownloadProgressCallback, java.lang.String):void");
    }

    public void installPackage(JSONObject jSONObject, boolean z) {
        String optString = jSONObject.optString("packageHash", (String) null);
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        String optString2 = currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, (String) null);
        if (optString == null || !optString.equals(optString2)) {
            if (z) {
                String currentPackageFolderPath = getCurrentPackageFolderPath();
                if (currentPackageFolderPath != null) {
                    FileUtils.deleteDirectoryAtPath(currentPackageFolderPath);
                }
            } else {
                String previousPackageHash = getPreviousPackageHash();
                if (previousPackageHash != null && !previousPackageHash.equals(optString)) {
                    FileUtils.deleteDirectoryAtPath(getPackageFolderPath(previousPackageHash));
                }
                CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, (String) null));
            }
            CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, optString);
            updateCurrentPackageInfo(currentPackageInfo);
        }
    }

    public void rollbackPackage() {
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        FileUtils.deleteDirectoryAtPath(getCurrentPackageFolderPath());
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, (String) null));
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, (Object) null);
        updateCurrentPackageInfo(currentPackageInfo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d A[SYNTHETIC, Splitter:B:45:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0085 A[Catch:{ IOException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008a A[Catch:{ IOException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008f A[Catch:{ IOException -> 0x0081 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void downloadAndReplaceCurrentBundle(java.lang.String r10, java.lang.String r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "Error closing IO resources."
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006d, all -> 0x0068 }
            r2.<init>(r10)     // Catch:{ MalformedURLException -> 0x006d, all -> 0x0068 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ MalformedURLException -> 0x006d, all -> 0x0068 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ MalformedURLException -> 0x006d, all -> 0x0068 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ MalformedURLException -> 0x0065, all -> 0x0061 }
            java.io.InputStream r4 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x0065, all -> 0x0061 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0065, all -> 0x0061 }
            java.io.File r4 = new java.io.File     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            java.lang.String r11 = r9.getCurrentPackageBundlePath(r11)     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            r4.<init>(r11)     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            r4.delete()     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            r11.<init>(r4)     // Catch:{ MalformedURLException -> 0x005e, all -> 0x005b }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ MalformedURLException -> 0x0056, all -> 0x0054 }
            r5 = 262144(0x40000, float:3.67342E-40)
            r4.<init>(r11, r5)     // Catch:{ MalformedURLException -> 0x0056, all -> 0x0054 }
            byte[] r1 = new byte[r5]     // Catch:{ MalformedURLException -> 0x0052 }
        L_0x0031:
            r6 = 0
            int r7 = r3.read(r1, r6, r5)     // Catch:{ MalformedURLException -> 0x0052 }
            if (r7 < 0) goto L_0x003c
            r4.write(r1, r6, r7)     // Catch:{ MalformedURLException -> 0x0052 }
            goto L_0x0031
        L_0x003c:
            r4.close()     // Catch:{ IOException -> 0x004b }
            r11.close()     // Catch:{ IOException -> 0x004b }
            r3.close()     // Catch:{ IOException -> 0x004b }
            if (r2 == 0) goto L_0x004a
            r2.disconnect()     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            return
        L_0x004b:
            r10 = move-exception
            com.microsoft.codepush.react.CodePushUnknownException r11 = new com.microsoft.codepush.react.CodePushUnknownException
            r11.<init>(r0, r10)
            throw r11
        L_0x0052:
            r1 = move-exception
            goto L_0x0073
        L_0x0054:
            r10 = move-exception
            goto L_0x007b
        L_0x0056:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x0073
        L_0x005b:
            r10 = move-exception
            r11 = r1
            goto L_0x007b
        L_0x005e:
            r11 = move-exception
            r4 = r1
            goto L_0x0071
        L_0x0061:
            r10 = move-exception
            r11 = r1
            r3 = r11
            goto L_0x007b
        L_0x0065:
            r11 = move-exception
            r3 = r1
            goto L_0x0070
        L_0x0068:
            r10 = move-exception
            r11 = r1
            r2 = r11
            r3 = r2
            goto L_0x007b
        L_0x006d:
            r11 = move-exception
            r2 = r1
            r3 = r2
        L_0x0070:
            r4 = r3
        L_0x0071:
            r1 = r11
            r11 = r4
        L_0x0073:
            com.microsoft.codepush.react.CodePushMalformedDataException r5 = new com.microsoft.codepush.react.CodePushMalformedDataException     // Catch:{ all -> 0x0079 }
            r5.<init>((java.lang.String) r10, (java.net.MalformedURLException) r1)     // Catch:{ all -> 0x0079 }
            throw r5     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r10 = move-exception
            r1 = r4
        L_0x007b:
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0083
        L_0x0081:
            r10 = move-exception
            goto L_0x0093
        L_0x0083:
            if (r11 == 0) goto L_0x0088
            r11.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0088:
            if (r3 == 0) goto L_0x008d
            r3.close()     // Catch:{ IOException -> 0x0081 }
        L_0x008d:
            if (r2 == 0) goto L_0x0099
            r2.disconnect()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0099
        L_0x0093:
            com.microsoft.codepush.react.CodePushUnknownException r11 = new com.microsoft.codepush.react.CodePushUnknownException
            r11.<init>(r0, r10)
            throw r11
        L_0x0099:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushUpdateManager.downloadAndReplaceCurrentBundle(java.lang.String, java.lang.String):void");
    }

    public void clearUpdates() {
        FileUtils.deleteDirectoryAtPath(getCodePushPath());
    }
}
