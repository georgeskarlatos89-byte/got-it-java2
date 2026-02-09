package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnableDFSync;
import com.cardinalcommerce.a.setEnableLogging;
import com.cardinalcommerce.a.setHeadingTextFontSize;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil Cardinal = new PEMUtil("CRL");
    private static final PEMUtil cca_continue = new PEMUtil("CERTIFICATE");
    private InputStream cleanup = null;
    private int configure = 0;
    private setEnableDFSync getInstance = null;
    private InputStream getSDKVersion = null;
    private int getWarnings = 0;
    private final BaseCipherSpi.ErasableOutputStream init = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private setEnableDFSync onCReqSuccess = null;

    class ExCertificateException extends CertificateException {
        private Throwable configure;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.configure = th;
        }

        public Throwable getCause() {
            return this.configure;
        }
    }

    static {
        new PEMUtil("PKCS7");
    }

    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new PKIXCertPath(inputStream, str);
    }

    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                throw new CertificateException(new StringBuilder("list contains non X509Certificate object while creating CertPath\n").append(next.toString()).toString());
            }
        }
        return new PKIXCertPath(list);
    }

    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCertificate);
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.getInstance.iterator();
    }

    private Certificate cca_continue(isEnableLogging isenablelogging) throws CertificateParsingException {
        DSASigner.detDSA384 detdsa384 = null;
        if (isenablelogging == null) {
            return null;
        }
        if (isenablelogging.cca_continue() <= 1 || !(isenablelogging.init(0) instanceof ASN1ObjectIdentifier) || !isenablelogging.init(0).equals(KeyAgreementSpi.DHUwithSHA224CKDF.setUiType)) {
            BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.init;
            if (isenablelogging != null) {
                detdsa384 = new DSASigner.detDSA384(isEnableLogging.getInstance((Object) isenablelogging));
            }
            return new X509CertificateObject(erasableOutputStream, detdsa384);
        }
        this.getInstance = KeyAgreementSpi.DHUwithSHA384CKDF.cca_continue(isEnableLogging.configure((setEnableLogging) isenablelogging.init(1), true)).getEciFlag;
        return configure();
    }

    private Certificate configure() throws CertificateParsingException {
        DSASigner.detDSA384 detdsa384 = null;
        if (this.getInstance != null) {
            while (this.configure < this.getInstance.cca_continue.size()) {
                setEnableDFSync setenabledfsync = this.getInstance;
                int i = this.configure;
                this.configure = i + 1;
                CardinalConfigurationParameters cardinalConfigurationParameters = (CardinalConfigurationParameters) setenabledfsync.cca_continue.elementAt(i);
                if (cardinalConfigurationParameters instanceof isEnableLogging) {
                    BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.init;
                    if (cardinalConfigurationParameters instanceof DSASigner.detDSA384) {
                        detdsa384 = (DSASigner.detDSA384) cardinalConfigurationParameters;
                    } else if (cardinalConfigurationParameters != null) {
                        detdsa384 = new DSASigner.detDSA384(isEnableLogging.getInstance((Object) cardinalConfigurationParameters));
                    }
                    return new X509CertificateObject(erasableOutputStream, detdsa384);
                }
            }
        }
        return null;
    }

    private CRL getInstance(isEnableLogging isenablelogging) throws CRLException {
        DSASigner dSASigner = null;
        if (isenablelogging == null) {
            return null;
        }
        if (isenablelogging.cca_continue() <= 1 || !(isenablelogging.init(0) instanceof ASN1ObjectIdentifier) || !isenablelogging.init(0).equals(KeyAgreementSpi.DHUwithSHA224CKDF.setUiType)) {
            if (isenablelogging != null) {
                dSASigner = new DSASigner(isEnableLogging.getInstance((Object) isenablelogging));
            }
            return new X509CRLObject(this.init, dSASigner);
        }
        this.onCReqSuccess = KeyAgreementSpi.DHUwithSHA384CKDF.cca_continue(isEnableLogging.configure((setEnableLogging) isenablelogging.init(1), true)).getEnrolled;
        return getInstance();
    }

    private CRL getInstance() throws CRLException {
        setEnableDFSync setenabledfsync = this.onCReqSuccess;
        DSASigner dSASigner = null;
        if (setenabledfsync == null || this.getWarnings >= setenabledfsync.cca_continue.size()) {
            return null;
        }
        setEnableDFSync setenabledfsync2 = this.onCReqSuccess;
        int i = this.getWarnings;
        this.getWarnings = i + 1;
        CardinalConfigurationParameters cardinalConfigurationParameters = (CardinalConfigurationParameters) setenabledfsync2.cca_continue.elementAt(i);
        if (cardinalConfigurationParameters instanceof DSASigner) {
            dSASigner = (DSASigner) cardinalConfigurationParameters;
        } else if (cardinalConfigurationParameters != null) {
            dSASigner = new DSASigner(isEnableLogging.getInstance((Object) cardinalConfigurationParameters));
        }
        return new X509CRLObject(this.init, dSASigner);
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        InputStream inputStream2 = this.getSDKVersion;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.getSDKVersion = inputStream;
            this.getInstance = null;
            this.configure = 0;
        }
        try {
            setEnableDFSync setenabledfsync = this.getInstance;
            if (setenabledfsync == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(setHeadingTextFontSize.init(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? cca_continue(cca_continue.Cardinal(inputStream)) : cca_continue(isEnableLogging.getInstance((Object) new getProxyAddress(inputStream).configure()));
            } else if (this.configure != setenabledfsync.cca_continue.size()) {
                return configure();
            } else {
                this.getInstance = null;
                this.configure = 0;
                return null;
            }
        } catch (Exception e) {
            throw new ExCertificateException(new StringBuilder("parsing issue: ").append(e.getMessage()).toString(), e);
        }
    }

    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        InputStream inputStream2 = this.cleanup;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.cleanup = inputStream;
            this.onCReqSuccess = null;
            this.getWarnings = 0;
        }
        try {
            setEnableDFSync setenabledfsync = this.onCReqSuccess;
            if (setenabledfsync == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(setHeadingTextFontSize.init(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? getInstance(Cardinal.Cardinal(inputStream)) : getInstance(isEnableLogging.getInstance((Object) new getProxyAddress(inputStream, (byte) 0).configure()));
            } else if (this.getWarnings != setenabledfsync.cca_continue.size()) {
                return getInstance();
            } else {
                this.onCReqSuccess = null;
                this.getWarnings = 0;
                return null;
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }
}
