package com.microsoft.codepush.react;

import android.util.Base64;
import com.facebook.internal.security.CertificateUtil;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jwt.SignedJWT;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class CodePushUpdateUtils {
    public static final String NEW_LINE = System.getProperty("line.separator");

    public static boolean isHashIgnored(String str) {
        return str.startsWith("__MACOSX/") || str.equals(".DS_Store") || str.endsWith("/.DS_Store") || str.equals(CodePushConstants.BUNDLE_JWT_FILE) || str.endsWith("/.codepushrelease");
    }

    private static void addContentsOfFolderToManifest(String str, String str2, ArrayList<String> arrayList) {
        for (File file : new File(str).listFiles()) {
            String name = file.getName();
            String absolutePath = file.getAbsolutePath();
            String str3 = (str2.isEmpty() ? "" : str2 + "/") + name;
            if (!isHashIgnored(str3)) {
                if (file.isDirectory()) {
                    addContentsOfFolderToManifest(absolutePath, str3, arrayList);
                } else {
                    try {
                        arrayList.add(str3 + CertificateUtil.DELIMITER + computeHash(new FileInputStream(file)));
                    } catch (FileNotFoundException e) {
                        throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053 A[SYNTHETIC, Splitter:B:27:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b A[Catch:{ IOException -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String computeHash(java.io.InputStream r5) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0045, IOException -> 0x0043, all -> 0x003f }
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch:{ NoSuchAlgorithmException -> 0x0045, IOException -> 0x0043, all -> 0x003f }
            r2.<init>(r5, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0045, IOException -> 0x0043, all -> 0x003f }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x003d, IOException -> 0x003b }
        L_0x0010:
            int r3 = r2.read(r0)     // Catch:{ NoSuchAlgorithmException -> 0x003d, IOException -> 0x003b }
            r4 = -1
            if (r3 == r4) goto L_0x0018
            goto L_0x0010
        L_0x0018:
            r2.close()     // Catch:{ IOException -> 0x0021 }
            if (r5 == 0) goto L_0x0025
            r5.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0025:
            byte[] r5 = r1.digest()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r0, r5)
            r5 = 0
            r1[r5] = r2
            java.lang.String r5 = "%064x"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            return r5
        L_0x003b:
            r0 = move-exception
            goto L_0x0048
        L_0x003d:
            r0 = move-exception
            goto L_0x0048
        L_0x003f:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0051
        L_0x0043:
            r1 = move-exception
            goto L_0x0046
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            r2 = r0
            r0 = r1
        L_0x0048:
            com.microsoft.codepush.react.CodePushUnknownException r1 = new com.microsoft.codepush.react.CodePushUnknownException     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "Unable to compute hash of update contents."
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0059
        L_0x0057:
            r5 = move-exception
            goto L_0x005f
        L_0x0059:
            if (r5 == 0) goto L_0x0062
            r5.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0062
        L_0x005f:
            r5.printStackTrace()
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushUpdateUtils.computeHash(java.io.InputStream):java.lang.String");
    }

    public static void copyNecessaryFilesFromCurrentPackage(String str, String str2, String str3) throws IOException {
        FileUtils.copyDirectoryContents(str2, str3);
        try {
            JSONArray jSONArray = CodePushUtils.getJsonObjectFromFile(str).getJSONArray("deletedFiles");
            for (int i = 0; i < jSONArray.length(); i++) {
                File file = new File(str3, jSONArray.getString(i));
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (JSONException e) {
            throw new CodePushUnknownException("Unable to copy files from current package during diff update", e);
        }
    }

    public static String findJSBundleInUpdateContents(String str, String str2) {
        for (File file : new File(str).listFiles()) {
            String appendPathComponent = CodePushUtils.appendPathComponent(str, file.getName());
            if (file.isDirectory()) {
                String findJSBundleInUpdateContents = findJSBundleInUpdateContents(appendPathComponent, str2);
                if (findJSBundleInUpdateContents != null) {
                    return CodePushUtils.appendPathComponent(file.getName(), findJSBundleInUpdateContents);
                }
            } else {
                String name = file.getName();
                if (name.equals(str2)) {
                    return name;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        return com.microsoft.codepush.react.CodePushUtils.getStringFromInputStream(r2.getAssets().open(com.microsoft.codepush.react.CodePushConstants.CODE_PUSH_OLD_HASH_FILE_NAME));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r3 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        com.microsoft.codepush.react.CodePushUtils.log("Unable to get the hash of the binary's bundled resources - \"codepush.gradle\" may have not been added to the build definition.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getHashForBinaryContents(android.content.Context r2, boolean r3) {
        /*
            android.content.res.AssetManager r0 = r2.getAssets()     // Catch:{ IOException -> 0x000f }
            java.lang.String r1 = "CodePushHash"
            java.io.InputStream r0 = r0.open(r1)     // Catch:{ IOException -> 0x000f }
            java.lang.String r2 = com.microsoft.codepush.react.CodePushUtils.getStringFromInputStream(r0)     // Catch:{ IOException -> 0x000f }
            return r2
        L_0x000f:
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x001e }
            java.lang.String r0 = "CodePushHash.json"
            java.io.InputStream r2 = r2.open(r0)     // Catch:{ IOException -> 0x001e }
            java.lang.String r2 = com.microsoft.codepush.react.CodePushUtils.getStringFromInputStream(r2)     // Catch:{ IOException -> 0x001e }
            return r2
        L_0x001e:
            if (r3 != 0) goto L_0x0025
            java.lang.String r2 = "Unable to get the hash of the binary's bundled resources - \"codepush.gradle\" may have not been added to the build definition."
            com.microsoft.codepush.react.CodePushUtils.log((java.lang.String) r2)
        L_0x0025:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.CodePushUpdateUtils.getHashForBinaryContents(android.content.Context, boolean):java.lang.String");
    }

    public static void verifyFolderHash(String str, String str2) {
        CodePushUtils.log("Verifying hash for folder path: " + str);
        ArrayList arrayList = new ArrayList();
        addContentsOfFolderToManifest(str, "", arrayList);
        Collections.sort(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String replace = jSONArray.toString().replace("\\/", "/");
        CodePushUtils.log("Manifest string: " + replace);
        String computeHash = computeHash(new ByteArrayInputStream(replace.getBytes()));
        CodePushUtils.log("Expected hash: " + str2 + ", actual hash: " + computeHash);
        if (str2.equals(computeHash)) {
            CodePushUtils.log("The update contents succeeded the data integrity check.");
            return;
        }
        throw new CodePushInvalidUpdateException("The update contents failed the data integrity check.");
    }

    public static Map<String, Object> verifyAndDecodeJWT(String str, PublicKey publicKey) {
        try {
            SignedJWT parse = SignedJWT.parse(str);
            if (!parse.verify(new RSASSAVerifier((RSAPublicKey) publicKey))) {
                return null;
            }
            Map<String, Object> claims = parse.getJWTClaimsSet().getClaims();
            CodePushUtils.log("JWT verification succeeded, payload content: " + claims.toString());
            return claims;
        } catch (Exception e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static PublicKey parsePublicKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace(NEW_LINE, "").getBytes(), 0)));
        } catch (Exception e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static String getSignatureFilePath(String str) {
        return CodePushUtils.appendPathComponent(CodePushUtils.appendPathComponent(str, "CodePush"), CodePushConstants.BUNDLE_JWT_FILE);
    }

    public static String getSignature(String str) {
        try {
            return FileUtils.readFileToString(getSignatureFilePath(str));
        } catch (IOException e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static void verifyUpdateSignature(String str, String str2, String str3) throws CodePushInvalidUpdateException {
        CodePushUtils.log("Verifying signature for folder path: " + str);
        PublicKey parsePublicKey = parsePublicKey(str3);
        if (parsePublicKey != null) {
            String signature = getSignature(str);
            if (signature != null) {
                Map<String, Object> verifyAndDecodeJWT = verifyAndDecodeJWT(signature, parsePublicKey);
                if (verifyAndDecodeJWT != null) {
                    String str4 = (String) verifyAndDecodeJWT.get("contentHash");
                    if (str4 == null) {
                        throw new CodePushInvalidUpdateException("The update could not be verified because the signature did not specify a content hash.");
                    } else if (str4.equals(str2)) {
                        CodePushUtils.log("The update contents succeeded the code signing check.");
                    } else {
                        throw new CodePushInvalidUpdateException("The update contents failed the code signing check.");
                    }
                } else {
                    throw new CodePushInvalidUpdateException("The update could not be verified because it was not signed by a trusted party.");
                }
            } else {
                throw new CodePushInvalidUpdateException("The update could not be verified because no signature was found.");
            }
        } else {
            throw new CodePushInvalidUpdateException("The update could not be verified because no public key was found.");
        }
    }
}
