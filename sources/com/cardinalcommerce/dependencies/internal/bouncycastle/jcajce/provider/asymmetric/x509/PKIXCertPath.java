package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.dismiss;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getBorderColor;
import com.cardinalcommerce.a.getProcessorTransactionId;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.getType;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnableDFSync;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setTextColor;
import com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemObject;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

public class PKIXCertPath extends CertPath {
    static final List getInstance;
    private List configure;
    private final BaseCipherSpi.ErasableOutputStream init;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        getInstance = Collections.unmodifiableList(arrayList);
    }

    PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        X931SignatureSpi.WhirlpoolWithRSAEncryption whirlpoolWithRSAEncryption = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
        this.init = whirlpoolWithRSAEncryption;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7")) {
                    if (!str.equalsIgnoreCase("PEM")) {
                        throw new CertificateException("unsupported encoding: ".concat(String.valueOf(str)));
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.configure = new ArrayList();
                CertificateFactory Cardinal = whirlpoolWithRSAEncryption.Cardinal("X.509");
                while (true) {
                    Certificate generateCertificate = Cardinal.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.configure.add(generateCertificate);
                }
            } else {
                getThreeDSRequestorAppURL configure2 = new getProxyAddress(inputStream).configure();
                if (configure2 instanceof isEnableLogging) {
                    Enumeration init2 = ((isEnableLogging) configure2).init();
                    this.configure = new ArrayList();
                    CertificateFactory Cardinal2 = whirlpoolWithRSAEncryption.Cardinal("X.509");
                    while (init2.hasMoreElements()) {
                        this.configure.add(0, Cardinal2.generateCertificate(new ByteArrayInputStream(((CardinalConfigurationParameters) init2.nextElement()).onCReqSuccess().configure("DER"))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            }
            this.configure = cca_continue(this.configure);
        } catch (IOException e) {
            throw new CertificateException(new StringBuilder("IOException throw while decoding CertPath:\n").append(e.toString()).toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException(new StringBuilder("BouncyCastle provider not found while trying to get a CertificateFactory:\n").append(e2.toString()).toString());
        }
    }

    PKIXCertPath(List list) {
        super("X.509");
        this.init = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
        this.configure = cca_continue(new ArrayList(list));
    }

    private static getThreeDSRequestorAppURL Cardinal(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new getProxyAddress(x509Certificate.getEncoded()).configure();
        } catch (Exception e) {
            throw new CertificateEncodingException(new StringBuilder("Exception while encoding certificate: ").append(e.toString()).toString());
        }
    }

    private static List cca_continue(List list) {
        boolean z;
        boolean z2;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i = 1;
        while (true) {
            if (i != list.size()) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    z = false;
                    break;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i3 = 0;
            while (true) {
                if (i3 == list.size()) {
                    z2 = false;
                    break;
                } else if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z2) {
                arrayList.add(x509Certificate);
                list.remove(i2);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i4 = 0; i4 != arrayList.size(); i4++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                    arrayList.add(x509Certificate2);
                    list.remove(i5);
                    break;
                }
                i5++;
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private static byte[] getInstance(CardinalConfigurationParameters cardinalConfigurationParameters) throws CertificateEncodingException {
        try {
            return cardinalConfigurationParameters.onCReqSuccess().configure("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(String.valueOf(e)));
        }
    }

    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.configure));
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator<String> encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        String next = encodings.next();
        if (next instanceof String) {
            return getEncoded(next);
        }
        return null;
    }

    public Iterator getEncodings() {
        return getInstance.iterator();
    }

    public byte[] getEncoded(String str) throws CertificateEncodingException {
        int i;
        if (str.equalsIgnoreCase("PkiPath")) {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            List list = this.configure;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                getbackgroundcolor.getInstance.addElement(Cardinal((X509Certificate) listIterator.previous()));
            }
            return getInstance(new getProcessorTransactionId(getbackgroundcolor));
        }
        if (str.equalsIgnoreCase("PKCS7")) {
            KeyAgreementSpi.DHUwithSHA256CKDF dHUwithSHA256CKDF = new KeyAgreementSpi.DHUwithSHA256CKDF(KeyAgreementSpi.DHUwithSHA224CKDF.getUiType, (CardinalConfigurationParameters) null);
            getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
            for (int i2 = 0; i2 != this.configure.size(); i2++) {
                getbackgroundcolor2.getInstance.addElement(Cardinal((X509Certificate) this.configure.get(i2)));
            }
            return getInstance(new KeyAgreementSpi.DHUwithSHA256CKDF(KeyAgreementSpi.DHUwithSHA224CKDF.setUiType, new KeyAgreementSpi.DHUwithSHA384CKDF(new setEnvironment(1), new getType(), dHUwithSHA256CKDF, new getType(getbackgroundcolor2), (setEnableDFSync) null, new getType())));
        } else if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            getBorderColor getbordercolor = new getBorderColor(new OutputStreamWriter(byteArrayOutputStream));
            int i3 = 0;
            while (i3 != this.configure.size()) {
                try {
                    PemObject Cardinal = new PemObject("CERTIFICATE", ((X509Certificate) this.configure.get(i3)).getEncoded()).Cardinal();
                    getbordercolor.write(new StringBuilder("-----BEGIN ").append(Cardinal.getInstance).append("-----").toString());
                    getbordercolor.newLine();
                    if (!Cardinal.init.isEmpty()) {
                        for (dismiss dismiss : Cardinal.init) {
                            getbordercolor.write(dismiss.getInstance);
                            getbordercolor.write(": ");
                            getbordercolor.write(dismiss.cca_continue);
                            getbordercolor.newLine();
                        }
                        getbordercolor.newLine();
                    }
                    byte[] cca_continue = setTextColor.cca_continue(Cardinal.cca_continue);
                    int i4 = 0;
                    while (i4 < cca_continue.length) {
                        int i5 = 0;
                        while (i5 != getbordercolor.Cardinal.length && (i = i4 + i5) < cca_continue.length) {
                            getbordercolor.Cardinal[i5] = (char) cca_continue[i];
                            i5++;
                        }
                        getbordercolor.write(getbordercolor.Cardinal, 0, i5);
                        getbordercolor.newLine();
                        i4 += getbordercolor.Cardinal.length;
                    }
                    getbordercolor.write(new StringBuilder("-----END ").append(Cardinal.getInstance).append("-----").toString());
                    getbordercolor.newLine();
                    i3++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            getbordercolor.close();
            return byteArrayOutputStream.toByteArray();
        } else {
            throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
        }
    }
}
