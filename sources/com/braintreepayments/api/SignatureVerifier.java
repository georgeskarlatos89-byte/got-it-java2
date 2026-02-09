package com.braintreepayments.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

class SignatureVerifier {
    private final CertificateHelper certificateHelper;

    SignatureVerifier() {
        this(new CertificateHelper());
    }

    SignatureVerifier(CertificateHelper certificateHelper2) {
        this.certificateHelper = certificateHelper2;
    }

    /* access modifiers changed from: package-private */
    public boolean isSignatureValid(Context context, String str, String str2) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length == 0) {
                return false;
            }
            int length = signatureArr.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!str2.equals(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(this.certificateHelper.getEncodedCertificate(signatureArr[i].toByteArray())), 0))) {
                        return false;
                    }
                    i++;
                } catch (NoSuchAlgorithmException | CertificateException unused) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            return false;
        }
    }
}
