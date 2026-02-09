package com.cardinalcommerce.a;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.braintreepayments.api.PostalAddressParser;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.facebook.appevents.UserDataStore;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.SimpleTimeZone;
import java.util.Vector;
import org.objectweb.asm.signature.SignatureVisitor;

public final class DSASigner extends setRenderType {
    public getDeviceFingerprint Cardinal;
    public dsa384 cca_continue;
    private int configure;
    public BCDSAPrivateKey getInstance;
    private boolean init = false;

    public final class dsa224 extends setRenderType {
        public final detDSASha3_384[] init;

        public dsa224(isEnableLogging isenablelogging) {
            this.init = new detDSASha3_384[isenablelogging.cca_continue()];
            for (int i = 0; i != isenablelogging.cca_continue(); i++) {
                this.init[i] = detDSASha3_384.Cardinal(isenablelogging.init(i));
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return new getProcessorTransactionId((CardinalConfigurationParameters[]) this.init);
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
            String instance = getTextFontSize.getInstance();
            stringBuffer.append(instance);
            for (int i = 0; i != this.init.length; i++) {
                stringBuffer.append("    ");
                stringBuffer.append(this.init[i]);
                stringBuffer.append(instance);
            }
            return stringBuffer.toString();
        }
    }

    public final class dsa256 extends setRenderType {
        private getDeviceFingerprint configure;

        public dsa256(getDeviceFingerprint getdevicefingerprint) {
            this.configure = getdevicefingerprint;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.configure;
        }

        public final String toString() {
            StringBuilder sb;
            byte b;
            byte[] instance = this.configure.getInstance();
            if (instance.length == 1) {
                sb = new StringBuilder("KeyUsage: 0x");
                b = instance[0] & 255;
            } else {
                sb = new StringBuilder("KeyUsage: 0x");
                b = (instance[0] & 255) | ((instance[1] & 255) << 8);
            }
            return sb.append(Integer.toHexString(b)).toString();
        }
    }

    public final class dsa512 extends getDeviceFingerprint {
        public dsa512(getDeviceFingerprint getdevicefingerprint) {
            super(getdevicefingerprint.getInstance(), getdevicefingerprint.onValidated());
        }
    }

    public abstract class dsaSha3_512 {
        public abstract getThreeDSRequestorAppURL getInstance();
    }

    public final int hashCode() {
        if (!this.init) {
            this.configure = super.hashCode();
            this.init = true;
        }
        return this.configure;
    }

    public final class dsa384 extends setRenderType {
        public setEnvironment Cardinal;
        public dsaSha3_384 cca_continue;
        isEnableLogging cleanup;
        public dsaSha3_384 configure;
        public BCDSAPrivateKey getInstance;
        public KeyAgreementSpi.MQVwithSHA384KDF init;
        public detDSASha3_224 onCReqSuccess;

        class getInstance implements Enumeration {
            private getInstance() {
            }

            /* synthetic */ getInstance(dsa384 dsa384, byte b) {
                this();
            }

            public final boolean hasMoreElements() {
                return false;
            }

            public final Object nextElement() {
                throw new NoSuchElementException("Empty Enumeration");
            }
        }

        public static class cca_continue extends setRenderType {
            private detDSASha3_224 Cardinal;
            public isEnableLogging configure;

            public cca_continue(isEnableLogging isenablelogging) {
                if (isenablelogging.cca_continue() < 2 || isenablelogging.cca_continue() > 3) {
                    throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
                }
                this.configure = isenablelogging;
            }

            public final getThreeDSRequestorAppURL onCReqSuccess() {
                return this.configure;
            }

            public final detDSASha3_224 Cardinal() {
                if (this.Cardinal == null && this.configure.cca_continue() == 3) {
                    CardinalConfigurationParameters init = this.configure.init(2);
                    this.Cardinal = init instanceof detDSASha3_224 ? (detDSASha3_224) init : init != null ? new detDSASha3_224(isEnableLogging.getInstance((Object) init)) : null;
                }
                return this.Cardinal;
            }
        }

        class configure implements Enumeration {
            private final Enumeration cca_continue;

            configure(Enumeration enumeration) {
                this.cca_continue = enumeration;
            }

            public final boolean hasMoreElements() {
                return this.cca_continue.hasMoreElements();
            }

            public final Object nextElement() {
                Object nextElement = this.cca_continue.nextElement();
                if (nextElement instanceof cca_continue) {
                    return (cca_continue) nextElement;
                }
                if (nextElement != null) {
                    return new cca_continue(isEnableLogging.getInstance(nextElement));
                }
                return null;
            }
        }

        public dsa384(isEnableLogging isenablelogging) {
            if (isenablelogging.cca_continue() < 3 || isenablelogging.cca_continue() > 7) {
                throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
            }
            int i = 0;
            detDSASha3_224 detdsasha3_224 = null;
            if (isenablelogging.init(0) instanceof setEnvironment) {
                this.Cardinal = setEnvironment.getInstance((Object) isenablelogging.init(0));
                i = 1;
            } else {
                this.Cardinal = null;
            }
            int i2 = i + 1;
            CardinalConfigurationParameters init2 = isenablelogging.init(i);
            this.getInstance = init2 instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init2 : init2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2)) : null;
            int i3 = i2 + 1;
            this.init = KeyAgreementSpi.MQVwithSHA384KDF.init(isenablelogging.init(i2));
            int i4 = i3 + 1;
            this.configure = dsaSha3_384.cca_continue(isenablelogging.init(i3));
            if (i4 < isenablelogging.cca_continue() && ((isenablelogging.init(i4) instanceof ExtendedData) || (isenablelogging.init(i4) instanceof getUiType) || (isenablelogging.init(i4) instanceof dsaSha3_384))) {
                this.cca_continue = dsaSha3_384.cca_continue(isenablelogging.init(i4));
                i4++;
            }
            if (i4 < isenablelogging.cca_continue() && !(isenablelogging.init(i4) instanceof setEnableLogging)) {
                this.cleanup = isEnableLogging.getInstance((Object) isenablelogging.init(i4));
                i4++;
            }
            if (i4 < isenablelogging.cca_continue() && (isenablelogging.init(i4) instanceof setEnableLogging)) {
                isEnableLogging configure2 = isEnableLogging.configure((setEnableLogging) isenablelogging.init(i4), true);
                this.onCReqSuccess = configure2 != null ? new detDSASha3_224(isEnableLogging.getInstance((Object) configure2)) : detdsasha3_224;
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            setEnvironment setenvironment = this.Cardinal;
            if (setenvironment != null) {
                getbackgroundcolor.getInstance.addElement(setenvironment);
            }
            getbackgroundcolor.getInstance.addElement(this.getInstance);
            getbackgroundcolor.getInstance.addElement(this.init);
            getbackgroundcolor.getInstance.addElement(this.configure);
            dsaSha3_384 dsasha3_384 = this.cca_continue;
            if (dsasha3_384 != null) {
                getbackgroundcolor.getInstance.addElement(dsasha3_384);
            }
            isEnableLogging isenablelogging = this.cleanup;
            if (isenablelogging != null) {
                getbackgroundcolor.getInstance.addElement(isenablelogging);
            }
            if (this.onCReqSuccess != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(this.onCReqSuccess));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class detDSA extends setRenderType {
        private static final Hashtable configure = new Hashtable();
        private static final String[] getInstance = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
        private setRequestTimeout init;

        private detDSA(int i) {
            this.init = new setRequestTimeout(i);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.init;
        }

        public static detDSA getInstance(Object obj) {
            if (obj == null) {
                return null;
            }
            int intValue = new BigInteger(setRequestTimeout.cca_continue(obj).Cardinal).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Hashtable hashtable = configure;
            if (!hashtable.containsKey(valueOf)) {
                hashtable.put(valueOf, new detDSA(intValue));
            }
            return (detDSA) hashtable.get(valueOf);
        }

        public final String toString() {
            int intValue = new BigInteger(this.init.Cardinal).intValue();
            return "CRLReason: ".concat(String.valueOf((intValue < 0 || intValue > 10) ? Constants.COLLATION_INVALID : getInstance[intValue]));
        }
    }

    public final class detDSA224 extends setRenderType {
        private BCDSAPrivateKey cca_continue;
        private byte[] configure;

        public detDSA224(BCDSAPrivateKey bCDSAPrivateKey, byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.configure = bArr2;
            this.cca_continue = bCDSAPrivateKey;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.cca_continue);
            getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.configure));
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class detDSA256 extends setRenderType {
        public setEnvironment Cardinal;
        public setEnvironment configure;
        public setEnvironment getInstance;

        public detDSA256(isEnableLogging isenablelogging) {
            if (isenablelogging.cca_continue() == 3) {
                Enumeration init = isenablelogging.init();
                this.Cardinal = setEnvironment.getInstance(init.nextElement());
                this.configure = setEnvironment.getInstance(init.nextElement());
                this.getInstance = setEnvironment.getInstance(init.nextElement());
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
        }

        public detDSA256(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.Cardinal = new setEnvironment(bigInteger);
            this.configure = new setEnvironment(bigInteger2);
            this.getInstance = new setEnvironment(bigInteger3);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.Cardinal);
            getbackgroundcolor.getInstance.addElement(this.configure);
            getbackgroundcolor.getInstance.addElement(this.getInstance);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class detDSA384 extends setRenderType {
        public stdDSA Cardinal;
        public BCDSAPrivateKey cca_continue;
        public getDeviceFingerprint configure;
        private isEnableLogging getInstance;

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.getInstance;
        }

        public detDSA384(isEnableLogging isenablelogging) {
            this.getInstance = isenablelogging;
            if (isenablelogging.cca_continue() == 3) {
                CardinalConfigurationParameters init = isenablelogging.init(0);
                BCDSAPrivateKey bCDSAPrivateKey = null;
                this.Cardinal = init instanceof stdDSA ? (stdDSA) init : init != null ? new stdDSA(isEnableLogging.getInstance((Object) init)) : null;
                CardinalConfigurationParameters init2 = isenablelogging.init(1);
                if (init2 instanceof BCDSAPrivateKey) {
                    bCDSAPrivateKey = (BCDSAPrivateKey) init2;
                } else if (init2 != null) {
                    bCDSAPrivateKey = new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2));
                }
                this.cca_continue = bCDSAPrivateKey;
                this.configure = getDeviceFingerprint.Cardinal((Object) isenablelogging.init(2));
                return;
            }
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
    }

    public final class detDSA512 extends setRenderType implements getChallengeTimeout {
        private CardinalConfigurationParameters Cardinal;
        private int init;

        public static detDSA512 cca_continue(Object obj) {
            if (obj == null) {
                return (detDSA512) obj;
            }
            if (obj instanceof setEnableLogging) {
                return new detDSA512((setEnableLogging) obj);
            }
            throw new IllegalArgumentException(new StringBuilder("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }

        private static void init(StringBuffer stringBuffer, String str, String str2, String str3) {
            stringBuffer.append("    ");
            stringBuffer.append(str2);
            stringBuffer.append(CertificateUtil.DELIMITER);
            stringBuffer.append(str);
            stringBuffer.append("    ");
            stringBuffer.append("    ");
            stringBuffer.append(str3);
            stringBuffer.append(str);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return new getPayment(false, this.init, this.Cardinal);
        }

        public final String toString() {
            String str;
            String str2;
            String instance = getTextFontSize.getInstance();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DistributionPointName: [");
            stringBuffer.append(instance);
            if (this.init == 0) {
                str2 = this.Cardinal.toString();
                str = PostalAddressParser.VENMO_GQL_RECIPIENT_KEY;
            } else {
                str2 = this.Cardinal.toString();
                str = "nameRelativeToCRLIssuer";
            }
            init(stringBuffer, instance, str, str2);
            stringBuffer.append("]");
            stringBuffer.append(instance);
            return stringBuffer.toString();
        }

        private detDSA512(setEnableLogging setenablelogging) {
            int i = setenablelogging.Cardinal;
            this.init = i;
            if (i == 0) {
                isEnableLogging configure = isEnableLogging.configure(setenablelogging, false);
                this.Cardinal = configure != null ? new dsa224(isEnableLogging.getInstance((Object) configure)) : null;
                return;
            }
            this.Cardinal = setEnableDFSync.init(setenablelogging);
        }
    }

    public final class detDSASha3_224 extends setRenderType {
        public Hashtable cca_continue = new Hashtable();
        public Vector init = new Vector();

        detDSASha3_224(isEnableLogging isenablelogging) {
            Enumeration init2 = isenablelogging.init();
            while (init2.hasMoreElements()) {
                detDSASha3_256 init3 = detDSASha3_256.init(init2.nextElement());
                if (!this.cca_continue.containsKey(init3.CardinalActionCode)) {
                    this.cca_continue.put(init3.CardinalActionCode, init3);
                    this.init.addElement(init3.CardinalActionCode);
                } else {
                    throw new IllegalArgumentException(new StringBuilder("repeated extension found: ").append(init3.CardinalActionCode).toString());
                }
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            Enumeration elements = this.init.elements();
            while (elements.hasMoreElements()) {
                Hashtable hashtable = this.cca_continue;
                getbackgroundcolor.getInstance.addElement((detDSASha3_256) hashtable.get((ASN1ObjectIdentifier) elements.nextElement()));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class detDSASha3_256 extends setRenderType {
        public static final ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("2.5.29.20").getInstance();
        public static final ASN1ObjectIdentifier CardinalEnvironment = new ASN1ObjectIdentifier("2.5.29.36").getInstance();
        public static final ASN1ObjectIdentifier CardinalError = new ASN1ObjectIdentifier("2.5.29.31").getInstance();
        public static final ASN1ObjectIdentifier CardinalRenderType = new ASN1ObjectIdentifier("2.5.29.33").getInstance();
        public static final ASN1ObjectIdentifier cca_continue = new ASN1ObjectIdentifier("2.5.29.15").getInstance();
        public static final ASN1ObjectIdentifier cleanup = new ASN1ObjectIdentifier("2.5.29.21").getInstance();
        public static final ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("2.5.29.18").getInstance();
        public static final ASN1ObjectIdentifier getActionCode = new ASN1ObjectIdentifier("2.5.29.54").getInstance();
        public static final ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("2.5.29.17").getInstance();
        public static final ASN1ObjectIdentifier getSDKVersion = new ASN1ObjectIdentifier("2.5.29.28").getInstance();
        public static final ASN1ObjectIdentifier getWarnings = new ASN1ObjectIdentifier("2.5.29.30").getInstance();
        public static final ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("2.5.29.19").getInstance();
        public static final ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("2.5.29.29").getInstance();
        public static final ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("2.5.29.27").getInstance();
        public static final ASN1ObjectIdentifier valueOf = new ASN1ObjectIdentifier("2.5.29.32").getInstance();
        public static final ASN1ObjectIdentifier values = new ASN1ObjectIdentifier("2.5.29.46").getInstance();
        ASN1ObjectIdentifier CardinalActionCode;
        public setUICustomization CardinalChallengeObserver;
        public boolean getString;

        static {
            new ASN1ObjectIdentifier("2.5.29.9").getInstance();
            new ASN1ObjectIdentifier("2.5.29.14").getInstance();
            new ASN1ObjectIdentifier("2.5.29.16").getInstance();
            new ASN1ObjectIdentifier("2.5.29.23").getInstance();
            new ASN1ObjectIdentifier("2.5.29.24").getInstance();
            new ASN1ObjectIdentifier("2.5.29.35").getInstance();
            new ASN1ObjectIdentifier("2.5.29.37").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3").getInstance();
            new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4").getInstance();
            new ASN1ObjectIdentifier("2.5.29.56").getInstance();
            new ASN1ObjectIdentifier("2.5.29.55").getInstance();
            new ASN1ObjectIdentifier("2.5.29.60").getInstance();
        }

        public static detDSASha3_256 init(Object obj) {
            if (obj instanceof detDSASha3_256) {
                return (detDSASha3_256) obj;
            }
            if (obj != null) {
                return new detDSASha3_256(isEnableLogging.getInstance(obj));
            }
            return null;
        }

        private detDSASha3_256(isEnableLogging isenablelogging) {
            boolean z = true;
            if (isenablelogging.cca_continue() == 2) {
                this.CardinalActionCode = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging.init(0));
                this.getString = false;
                this.CardinalChallengeObserver = setUICustomization.init(isenablelogging.init(1));
            } else if (isenablelogging.cca_continue() == 3) {
                this.CardinalActionCode = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging.init(0));
                this.getString = setChallengeTimeout.getInstance((Object) isenablelogging.init(1)).init[0] == 0 ? false : z;
                this.CardinalChallengeObserver = setUICustomization.init(isenablelogging.init(2));
            } else {
                throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
            }
        }

        public final int hashCode() {
            if (this.getString) {
                return this.CardinalChallengeObserver.hashCode() ^ this.CardinalActionCode.hashCode();
            }
            return ~(this.CardinalChallengeObserver.hashCode() ^ this.CardinalActionCode.hashCode());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof detDSASha3_256)) {
                return false;
            }
            detDSASha3_256 detdsasha3_256 = (detDSASha3_256) obj;
            if (!detdsasha3_256.CardinalActionCode.equals(this.CardinalActionCode) || !detdsasha3_256.CardinalChallengeObserver.equals(this.CardinalChallengeObserver) || detdsasha3_256.getString != this.getString) {
                return false;
            }
            return true;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.CardinalActionCode);
            if (this.getString) {
                getbackgroundcolor.getInstance.addElement(setChallengeTimeout.init(true));
            }
            getbackgroundcolor.getInstance.addElement(this.CardinalChallengeObserver);
            return new getProcessorTransactionId(getbackgroundcolor);
        }

        public static getThreeDSRequestorAppURL Cardinal(detDSASha3_256 detdsasha3_256) throws IllegalArgumentException {
            try {
                return getThreeDSRequestorAppURL.Cardinal(detdsasha3_256.CardinalChallengeObserver.getInstance());
            } catch (IOException e) {
                throw new IllegalArgumentException("can't convert extension: ".concat(String.valueOf(e)));
            }
        }
    }

    public final class detDSASha3_384 extends setRenderType implements getChallengeTimeout {
        public CardinalConfigurationParameters cca_continue;
        public int getInstance;

        private detDSASha3_384(int i, CardinalConfigurationParameters cardinalConfigurationParameters) {
            this.cca_continue = cardinalConfigurationParameters;
            this.getInstance = i;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.getInstance == 4 ? new getPayment(true, this.getInstance, this.cca_continue) : new getPayment(false, this.getInstance, this.cca_continue);
        }

        public final String toString() {
            String str;
            Object init;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.getInstance);
            stringBuffer.append(": ");
            int i = this.getInstance;
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    init = KeyAgreementSpi.MQVwithSHA384KDF.init(this.cca_continue);
                } else if (i != 6) {
                    init = this.cca_continue;
                }
                str = init.toString();
                stringBuffer.append(str);
                return stringBuffer.toString();
            }
            str = isEnabledHostedFields.cca_continue(this.cca_continue).cca_continue();
            stringBuffer.append(str);
            return stringBuffer.toString();
        }

        public static detDSASha3_384 Cardinal(Object obj) {
            if (obj == null || (obj instanceof detDSASha3_384)) {
                return (detDSASha3_384) obj;
            }
            if (obj instanceof setEnableLogging) {
                setEnableLogging setenablelogging = (setEnableLogging) obj;
                int i = setenablelogging.Cardinal;
                switch (i) {
                    case 0:
                        return new detDSASha3_384(i, isEnableLogging.configure(setenablelogging, false));
                    case 1:
                        return new detDSASha3_384(i, isEnabledHostedFields.getInstance(setenablelogging));
                    case 2:
                        return new detDSASha3_384(i, isEnabledHostedFields.getInstance(setenablelogging));
                    case 3:
                        throw new IllegalArgumentException("unknown tag: ".concat(String.valueOf(i)));
                    case 4:
                        return new detDSASha3_384(i, KeyAgreementSpi.MQVwithSHA384KDF.Cardinal(setenablelogging));
                    case 5:
                        return new detDSASha3_384(i, isEnableLogging.configure(setenablelogging, false));
                    case 6:
                        return new detDSASha3_384(i, isEnabledHostedFields.getInstance(setenablelogging));
                    case 7:
                        return new detDSASha3_384(i, setUICustomization.init(setenablelogging, false));
                    case 8:
                        return new detDSASha3_384(i, ASN1ObjectIdentifier.Cardinal(setenablelogging));
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return Cardinal(getThreeDSRequestorAppURL.Cardinal((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            } else {
                throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
            }
        }
    }

    public final class detDSASha3_512 extends setRenderType {
        private dsa224 Cardinal;
        private detDSA512 cca_continue;
        private dsa512 configure;

        private static void init(StringBuffer stringBuffer, String str, String str2, String str3) {
            stringBuffer.append("    ");
            stringBuffer.append(str2);
            stringBuffer.append(CertificateUtil.DELIMITER);
            stringBuffer.append(str);
            stringBuffer.append("    ");
            stringBuffer.append("    ");
            stringBuffer.append(str3);
            stringBuffer.append(str);
        }

        public final String toString() {
            String instance = getTextFontSize.getInstance();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DistributionPoint: [");
            stringBuffer.append(instance);
            detDSA512 detdsa512 = this.cca_continue;
            if (detdsa512 != null) {
                init(stringBuffer, instance, "distributionPoint", detdsa512.toString());
            }
            dsa512 dsa512 = this.configure;
            if (dsa512 != null) {
                init(stringBuffer, instance, "reasons", dsa512.toString());
            }
            dsa224 dsa224 = this.Cardinal;
            if (dsa224 != null) {
                init(stringBuffer, instance, "cRLIssuer", dsa224.toString());
            }
            stringBuffer.append("]");
            stringBuffer.append(instance);
            return stringBuffer.toString();
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [com.cardinalcommerce.a.getThreeDSRequestorAppURL] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public detDSASha3_512(com.cardinalcommerce.a.isEnableLogging r7) {
            /*
                r6 = this;
                r6.<init>()
                r0 = 0
                r1 = r0
            L_0x0005:
                int r2 = r7.cca_continue()
                if (r1 == r2) goto L_0x0068
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r7.init(r1)
                com.cardinalcommerce.a.setEnableLogging r2 = com.cardinalcommerce.a.setEnableLogging.cca_continue(r2)
                int r3 = r2.Cardinal
                r4 = 0
                if (r3 == 0) goto L_0x0053
                r5 = 1
                if (r3 == r5) goto L_0x0047
                r5 = 2
                if (r3 != r5) goto L_0x0030
                com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.configure(r2, r0)
                if (r2 == 0) goto L_0x002d
                com.cardinalcommerce.a.DSASigner$dsa224 r4 = new com.cardinalcommerce.a.DSASigner$dsa224
                com.cardinalcommerce.a.isEnableLogging r2 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r2)
                r4.<init>(r2)
            L_0x002d:
                r6.Cardinal = r4
                goto L_0x0065
            L_0x0030:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unknown tag encountered in structure: "
                r0.<init>(r1)
                int r1 = r2.Cardinal
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L_0x0047:
                com.cardinalcommerce.a.DSASigner$dsa512 r3 = new com.cardinalcommerce.a.DSASigner$dsa512
                com.cardinalcommerce.a.getDeviceFingerprint r2 = com.cardinalcommerce.a.getDeviceFingerprint.Cardinal((com.cardinalcommerce.a.setEnableLogging) r2)
                r3.<init>(r2)
                r6.configure = r3
                goto L_0x0065
            L_0x0053:
                com.cardinalcommerce.a.CardinalConfigurationParameters r3 = r2.configure
                if (r3 == 0) goto L_0x005d
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.configure
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r4 = r2.onCReqSuccess()
            L_0x005d:
                com.cardinalcommerce.a.setEnableLogging r4 = (com.cardinalcommerce.a.setEnableLogging) r4
                com.cardinalcommerce.a.DSASigner$detDSA512 r2 = com.cardinalcommerce.a.DSASigner.detDSA512.cca_continue(r4)
                r6.cca_continue = r2
            L_0x0065:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.DSASigner.detDSASha3_512.<init>(com.cardinalcommerce.a.isEnableLogging):void");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            if (this.cca_continue != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(this.cca_continue));
            }
            if (this.configure != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 1, this.configure));
            }
            if (this.Cardinal != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 2, this.Cardinal));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class dsaSha3_224 extends setRenderType {
        private boolean Cardinal;
        private detDSA512 cca_continue;
        private isEnableLogging cleanup;
        public boolean configure;
        private boolean getInstance;
        private boolean getWarnings;
        private dsa512 init;

        private static void cca_continue(StringBuffer stringBuffer, String str, String str2, String str3) {
            stringBuffer.append("    ");
            stringBuffer.append(str2);
            stringBuffer.append(CertificateUtil.DELIMITER);
            stringBuffer.append(str);
            stringBuffer.append("    ");
            stringBuffer.append("    ");
            stringBuffer.append(str3);
            stringBuffer.append(str);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.cleanup;
        }

        public dsaSha3_224(isEnableLogging isenablelogging) {
            this.cleanup = isenablelogging;
            for (int i = 0; i != isenablelogging.cca_continue(); i++) {
                setEnableLogging cca_continue2 = setEnableLogging.cca_continue(isenablelogging.init(i));
                int i2 = cca_continue2.Cardinal;
                if (i2 != 0) {
                    boolean z = true;
                    if (i2 == 1) {
                        this.Cardinal = setChallengeTimeout.Cardinal(cca_continue2).init[0] == 0 ? false : z;
                    } else if (i2 == 2) {
                        this.getInstance = setChallengeTimeout.Cardinal(cca_continue2).init[0] == 0 ? false : z;
                    } else if (i2 == 3) {
                        this.init = new dsa512(dsa512.Cardinal(cca_continue2));
                    } else if (i2 == 4) {
                        this.configure = setChallengeTimeout.Cardinal(cca_continue2).init[0] == 0 ? false : z;
                    } else if (i2 == 5) {
                        this.getWarnings = setChallengeTimeout.Cardinal(cca_continue2).init[0] == 0 ? false : z;
                    } else {
                        throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                    }
                } else {
                    this.cca_continue = detDSA512.cca_continue((setEnableLogging) (cca_continue2.configure != null ? cca_continue2.configure.onCReqSuccess() : null));
                }
            }
        }

        public final String toString() {
            String str;
            String str2;
            String instance = getTextFontSize.getInstance();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("IssuingDistributionPoint: [");
            stringBuffer.append(instance);
            detDSA512 detdsa512 = this.cca_continue;
            if (detdsa512 != null) {
                cca_continue(stringBuffer, instance, "distributionPoint", detdsa512.toString());
            }
            boolean z = this.Cardinal;
            String str3 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            if (z) {
                cca_continue(stringBuffer, instance, "onlyContainsUserCerts", z ? str3 : "false");
            }
            boolean z2 = this.getInstance;
            if (z2) {
                if (z2) {
                    str2 = str3;
                } else {
                    str2 = "false";
                }
                cca_continue(stringBuffer, instance, "onlyContainsCACerts", str2);
            }
            dsa512 dsa512 = this.init;
            if (dsa512 != null) {
                cca_continue(stringBuffer, instance, "onlySomeReasons", dsa512.toString());
            }
            boolean z3 = this.getWarnings;
            if (z3) {
                if (z3) {
                    str = str3;
                } else {
                    str = "false";
                }
                cca_continue(stringBuffer, instance, "onlyContainsAttributeCerts", str);
            }
            boolean z4 = this.configure;
            if (z4) {
                if (!z4) {
                    str3 = "false";
                }
                cca_continue(stringBuffer, instance, "indirectCRL", str3);
            }
            stringBuffer.append("]");
            stringBuffer.append(instance);
            return stringBuffer.toString();
        }
    }

    public class dsaSha3_256 extends setRenderType {
        private static ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("2.5.4.12");
        private static ASN1ObjectIdentifier CardinalActionCode = new ASN1ObjectIdentifier("2.5.4.17");
        private static ASN1ObjectIdentifier CardinalChallengeObserver = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        private static ASN1ObjectIdentifier CardinalConfigurationParameters = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        private static ASN1ObjectIdentifier CardinalEnvironment = new ASN1ObjectIdentifier("2.5.4.43");
        private static ASN1ObjectIdentifier CardinalError = new ASN1ObjectIdentifier("2.5.4.45");
        private static ASN1ObjectIdentifier CardinalRenderType = new ASN1ObjectIdentifier("2.5.4.44");
        private static ASN1ObjectIdentifier CardinalUiType = new ASN1ObjectIdentifier("2.5.4.46");
        private static ASN1ObjectIdentifier cca_continue = new ASN1ObjectIdentifier("2.5.4.3");
        private static ASN1ObjectIdentifier cleanup = new ASN1ObjectIdentifier("2.5.4.4");
        private static ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("2.5.4.10");
        private static ASN1ObjectIdentifier getActionCode = new ASN1ObjectIdentifier("2.5.4.65");
        private static ASN1ObjectIdentifier getChallengeTimeout = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        private static ASN1ObjectIdentifier getEnvironment = KeyAgreementSpi.DHUwithSHA224CKDF.setRenderType;
        private static ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("2.5.4.6");
        private static ASN1ObjectIdentifier getProxyAddress = noneDSA.a_;
        private static Hashtable getRenderType = new Hashtable();
        private static ASN1ObjectIdentifier getRequestTimeout = new ASN1ObjectIdentifier("2.5.4.16");
        private static ASN1ObjectIdentifier getSDKVersion = new ASN1ObjectIdentifier("2.5.4.7");
        private static ASN1ObjectIdentifier getString = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        private static Hashtable getThreeDSRequestorAppURL = new Hashtable();
        private static ASN1ObjectIdentifier getUICustomization = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        private static ASN1ObjectIdentifier getUiType = noneDSA.b_;
        private static ASN1ObjectIdentifier getWarnings = new ASN1ObjectIdentifier("2.5.4.5");
        private static ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("2.5.4.11");
        private static final Boolean isEnableDFSync = Boolean.FALSE;
        private static Hashtable isEnableLogging = new Hashtable();
        private static ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("2.5.4.8");
        private static ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("2.5.4.9");
        private static ASN1ObjectIdentifier setChallengeTimeout = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        private static ASN1ObjectIdentifier setEnvironment = KeyAgreementSpi.DHUwithSHA224CKDF.setUICustomization;
        private static ASN1ObjectIdentifier setProxyAddress = KeyAgreementSpi.DHUwithSHA224CKDF.getUICustomization;
        private static Hashtable setRenderType = new Hashtable();
        private static ASN1ObjectIdentifier setRequestTimeout = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        private static final Boolean setThreeDSRequestorAppURL = Boolean.TRUE;
        private static ASN1ObjectIdentifier setUICustomization = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        private static ASN1ObjectIdentifier setUiType = getEnvironment;
        private static ASN1ObjectIdentifier valueOf = new ASN1ObjectIdentifier("2.5.4.15");
        private static ASN1ObjectIdentifier values = new ASN1ObjectIdentifier("2.5.4.42");
        private Vector ExtendedData = new Vector();
        private int getEciFlag;
        private Vector getJSON = new Vector();
        private Vector isLocationDataConsentGiven = new Vector();
        private dsaSha3_512 setEnableDFSync = null;
        private isEnableLogging setEnableLogging;
        private boolean setLocationDataConsentGiven;

        static {
            new ASN1ObjectIdentifier("2.5.4.54");
            getRenderType.put(getInstance, "C");
            getRenderType.put(configure, "O");
            getRenderType.put(Cardinal, ExifInterface.GPS_DIRECTION_TRUE);
            getRenderType.put(init, "OU");
            getRenderType.put(cca_continue, "CN");
            getRenderType.put(getSDKVersion, "L");
            getRenderType.put(onCReqSuccess, "ST");
            getRenderType.put(getWarnings, "SERIALNUMBER");
            getRenderType.put(getEnvironment, ExifInterface.LONGITUDE_EAST);
            getRenderType.put(getUICustomization, "DC");
            getRenderType.put(setUICustomization, "UID");
            getRenderType.put(onValidated, "STREET");
            getRenderType.put(cleanup, "SURNAME");
            getRenderType.put(values, "GIVENNAME");
            getRenderType.put(CardinalEnvironment, "INITIALS");
            getRenderType.put(CardinalRenderType, "GENERATION");
            getRenderType.put(setEnvironment, "unstructuredAddress");
            getRenderType.put(setProxyAddress, "unstructuredName");
            getRenderType.put(CardinalError, "UniqueIdentifier");
            getRenderType.put(CardinalUiType, "DN");
            getRenderType.put(getActionCode, "Pseudonym");
            getRenderType.put(getRequestTimeout, "PostalAddress");
            getRenderType.put(setRequestTimeout, "NameAtBirth");
            getRenderType.put(CardinalConfigurationParameters, "CountryOfCitizenship");
            getRenderType.put(getChallengeTimeout, "CountryOfResidence");
            getRenderType.put(setChallengeTimeout, "Gender");
            getRenderType.put(getString, "PlaceOfBirth");
            getRenderType.put(CardinalChallengeObserver, "DateOfBirth");
            getRenderType.put(CardinalActionCode, "PostalCode");
            getRenderType.put(valueOf, "BusinessCategory");
            getRenderType.put(getProxyAddress, "TelephoneNumber");
            getRenderType.put(getUiType, "Name");
            setRenderType.put(getInstance, "C");
            setRenderType.put(configure, "O");
            setRenderType.put(init, "OU");
            setRenderType.put(cca_continue, "CN");
            setRenderType.put(getSDKVersion, "L");
            setRenderType.put(onCReqSuccess, "ST");
            setRenderType.put(onValidated, "STREET");
            setRenderType.put(getUICustomization, "DC");
            setRenderType.put(setUICustomization, "UID");
            getThreeDSRequestorAppURL.put(getInstance, "C");
            getThreeDSRequestorAppURL.put(configure, "O");
            getThreeDSRequestorAppURL.put(init, "OU");
            getThreeDSRequestorAppURL.put(cca_continue, "CN");
            getThreeDSRequestorAppURL.put(getSDKVersion, "L");
            getThreeDSRequestorAppURL.put(onCReqSuccess, "ST");
            getThreeDSRequestorAppURL.put(onValidated, "STREET");
            isEnableLogging.put("c", getInstance);
            isEnableLogging.put("o", configure);
            isEnableLogging.put("t", Cardinal);
            isEnableLogging.put("ou", init);
            isEnableLogging.put("cn", cca_continue);
            isEnableLogging.put("l", getSDKVersion);
            isEnableLogging.put(UserDataStore.STATE, onCReqSuccess);
            isEnableLogging.put("sn", getWarnings);
            isEnableLogging.put("serialnumber", getWarnings);
            isEnableLogging.put("street", onValidated);
            isEnableLogging.put("emailaddress", setUiType);
            isEnableLogging.put("dc", getUICustomization);
            isEnableLogging.put("e", setUiType);
            isEnableLogging.put("uid", setUICustomization);
            isEnableLogging.put("surname", cleanup);
            isEnableLogging.put("givenname", values);
            isEnableLogging.put("initials", CardinalEnvironment);
            isEnableLogging.put("generation", CardinalRenderType);
            isEnableLogging.put("unstructuredaddress", setEnvironment);
            isEnableLogging.put("unstructuredname", setProxyAddress);
            isEnableLogging.put("uniqueidentifier", CardinalError);
            isEnableLogging.put("dn", CardinalUiType);
            isEnableLogging.put("pseudonym", getActionCode);
            isEnableLogging.put("postaladdress", getRequestTimeout);
            isEnableLogging.put("nameofbirth", setRequestTimeout);
            isEnableLogging.put("countryofcitizenship", CardinalConfigurationParameters);
            isEnableLogging.put("countryofresidence", getChallengeTimeout);
            isEnableLogging.put(HintConstants.AUTOFILL_HINT_GENDER, setChallengeTimeout);
            isEnableLogging.put("placeofbirth", getString);
            isEnableLogging.put("dateofbirth", CardinalChallengeObserver);
            isEnableLogging.put("postalcode", CardinalActionCode);
            isEnableLogging.put("businesscategory", valueOf);
            isEnableLogging.put("telephonenumber", getProxyAddress);
            isEnableLogging.put("name", getUiType);
        }

        protected dsaSha3_256() {
        }

        private static String Cardinal(String str) {
            String Cardinal2 = getTextFontSize.Cardinal(str.trim());
            if (Cardinal2.length() <= 0 || Cardinal2.charAt(0) != '#') {
                return Cardinal2;
            }
            getThreeDSRequestorAppURL cca_continue2 = cca_continue(Cardinal2);
            return cca_continue2 instanceof isLocationDataConsentGiven ? getTextFontSize.Cardinal(((isLocationDataConsentGiven) cca_continue2).cca_continue().trim()) : Cardinal2;
        }

        private static getThreeDSRequestorAppURL cca_continue(String str) {
            try {
                return getThreeDSRequestorAppURL.Cardinal(getHeadingTextFontName.init(str.substring(1)));
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e)));
            }
        }

        private static String getInstance(String str) {
            StringBuffer stringBuffer = new StringBuffer();
            if (str.length() != 0) {
                char charAt = str.charAt(0);
                stringBuffer.append(charAt);
                int i = 1;
                while (i < str.length()) {
                    char charAt2 = str.charAt(i);
                    if (charAt != ' ' || charAt2 != ' ') {
                        stringBuffer.append(charAt2);
                    }
                    i++;
                    charAt = charAt2;
                }
            }
            return stringBuffer.toString();
        }

        public int hashCode() {
            if (this.setLocationDataConsentGiven) {
                return this.getEciFlag;
            }
            this.setLocationDataConsentGiven = true;
            for (int i = 0; i != this.getJSON.size(); i++) {
                String instance = getInstance(Cardinal((String) this.isLocationDataConsentGiven.elementAt(i)));
                int hashCode = this.getEciFlag ^ this.getJSON.elementAt(i).hashCode();
                this.getEciFlag = hashCode;
                this.getEciFlag = instance.hashCode() ^ hashCode;
            }
            return this.getEciFlag;
        }

        public dsaSha3_256(isEnableLogging isenablelogging) {
            Vector vector;
            this.setEnableLogging = isenablelogging;
            Enumeration init2 = isenablelogging.init();
            while (init2.hasMoreElements()) {
                setEnableDFSync cca_continue2 = setEnableDFSync.cca_continue(((CardinalConfigurationParameters) init2.nextElement()).onCReqSuccess());
                int i = 0;
                while (true) {
                    if (i < cca_continue2.cca_continue.size()) {
                        isEnableLogging instance = isEnableLogging.getInstance((Object) ((CardinalConfigurationParameters) cca_continue2.cca_continue.elementAt(i)).onCReqSuccess());
                        if (instance.cca_continue() == 2) {
                            this.getJSON.addElement(ASN1ObjectIdentifier.cca_continue((Object) instance.init(0)));
                            CardinalConfigurationParameters init3 = instance.init(1);
                            if (!(init3 instanceof isLocationDataConsentGiven) || (init3 instanceof CardinalValidateReceiver)) {
                                try {
                                    Vector vector2 = this.isLocationDataConsentGiven;
                                    StringBuilder sb = new StringBuilder("#");
                                    byte[] init4 = getHeadingTextFontName.init(init3.onCReqSuccess().configure("DER"));
                                    int length = init4.length;
                                    char[] cArr = new char[length];
                                    for (int i2 = 0; i2 != length; i2++) {
                                        cArr[i2] = (char) (init4[i2] & 255);
                                    }
                                    vector2.addElement(sb.append(new String(cArr)).toString());
                                } catch (IOException unused) {
                                    throw new IllegalArgumentException("cannot encode value");
                                }
                            } else {
                                String cca_continue3 = ((isLocationDataConsentGiven) init3).cca_continue();
                                if (cca_continue3.length() <= 0 || cca_continue3.charAt(0) != '#') {
                                    vector = this.isLocationDataConsentGiven;
                                } else {
                                    vector = this.isLocationDataConsentGiven;
                                    cca_continue3 = "\\".concat(String.valueOf(cca_continue3));
                                }
                                vector.addElement(cca_continue3);
                            }
                            this.ExtendedData.addElement(i != 0 ? setThreeDSRequestorAppURL : isEnableDFSync);
                            i++;
                        } else {
                            throw new IllegalArgumentException("badly sized pair");
                        }
                    }
                }
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            if (this.setEnableLogging == null) {
                getBackgroundColor getbackgroundcolor = new getBackgroundColor();
                getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
                ASN1ObjectIdentifier aSN1ObjectIdentifier = null;
                int i = 0;
                while (i != this.getJSON.size()) {
                    getBackgroundColor getbackgroundcolor3 = new getBackgroundColor();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) this.getJSON.elementAt(i);
                    getbackgroundcolor3.getInstance.addElement(aSN1ObjectIdentifier2);
                    String str = (String) this.isLocationDataConsentGiven.elementAt(i);
                    getbackgroundcolor3.getInstance.addElement(this.setEnableDFSync.getInstance());
                    if (aSN1ObjectIdentifier == null || ((Boolean) this.ExtendedData.elementAt(i)).booleanValue()) {
                        getbackgroundcolor2.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor3));
                    } else {
                        getbackgroundcolor.getInstance.addElement(new getType(getbackgroundcolor2));
                        getbackgroundcolor2 = new getBackgroundColor();
                        getbackgroundcolor2.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor3));
                    }
                    i++;
                    aSN1ObjectIdentifier = aSN1ObjectIdentifier2;
                }
                getbackgroundcolor.getInstance.addElement(new getType(getbackgroundcolor2));
                this.setEnableLogging = new getProcessorTransactionId(getbackgroundcolor);
            }
            return this.setEnableLogging;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r14) {
            /*
                r13 = this;
                r0 = 1
                if (r14 != r13) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r14 instanceof com.cardinalcommerce.a.DSASigner.dsaSha3_256
                r2 = 0
                if (r1 != 0) goto L_0x000e
                boolean r1 = r14 instanceof com.cardinalcommerce.a.isEnableLogging
                if (r1 != 0) goto L_0x000e
                return r2
            L_0x000e:
                r1 = r14
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = (com.cardinalcommerce.a.CardinalConfigurationParameters) r1
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r1.onCReqSuccess()
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r13.onCReqSuccess()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L_0x0020
                return r0
            L_0x0020:
                if (r14 == 0) goto L_0x0049
                boolean r1 = r14 instanceof com.cardinalcommerce.a.DSASigner.dsaSha3_256     // Catch:{ IllegalArgumentException -> 0x00d5 }
                if (r1 == 0) goto L_0x0027
                goto L_0x0049
            L_0x0027:
                boolean r1 = r14 instanceof com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384KDF     // Catch:{ IllegalArgumentException -> 0x00d5 }
                if (r1 == 0) goto L_0x003b
                com.cardinalcommerce.a.DSASigner$dsaSha3_256 r1 = new com.cardinalcommerce.a.DSASigner$dsaSha3_256     // Catch:{ IllegalArgumentException -> 0x00d5 }
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA384KDF r14 = (com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384KDF) r14     // Catch:{ IllegalArgumentException -> 0x00d5 }
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r14 = r14.onCReqSuccess()     // Catch:{ IllegalArgumentException -> 0x00d5 }
                com.cardinalcommerce.a.isEnableLogging r14 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r14)     // Catch:{ IllegalArgumentException -> 0x00d5 }
                r1.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x00d5 }
                goto L_0x004c
            L_0x003b:
                if (r14 == 0) goto L_0x0047
                com.cardinalcommerce.a.DSASigner$dsaSha3_256 r1 = new com.cardinalcommerce.a.DSASigner$dsaSha3_256     // Catch:{ IllegalArgumentException -> 0x00d5 }
                com.cardinalcommerce.a.isEnableLogging r14 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r14)     // Catch:{ IllegalArgumentException -> 0x00d5 }
                r1.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x00d5 }
                goto L_0x004c
            L_0x0047:
                r1 = 0
                goto L_0x004c
            L_0x0049:
                r1 = r14
                com.cardinalcommerce.a.DSASigner$dsaSha3_256 r1 = (com.cardinalcommerce.a.DSASigner.dsaSha3_256) r1     // Catch:{ IllegalArgumentException -> 0x00d5 }
            L_0x004c:
                java.util.Vector r14 = r13.getJSON
                int r14 = r14.size()
                java.util.Vector r3 = r1.getJSON
                int r3 = r3.size()
                if (r14 == r3) goto L_0x005b
                return r2
            L_0x005b:
                boolean[] r3 = new boolean[r14]
                java.util.Vector r4 = r13.getJSON
                java.lang.Object r4 = r4.elementAt(r2)
                java.util.Vector r5 = r1.getJSON
                java.lang.Object r5 = r5.elementAt(r2)
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0073
                r5 = r14
                r6 = r0
                r4 = r2
                goto L_0x0077
            L_0x0073:
                int r4 = r14 + -1
                r5 = -1
                r6 = r5
            L_0x0077:
                if (r4 == r5) goto L_0x00d4
                java.util.Vector r7 = r13.getJSON
                java.lang.Object r7 = r7.elementAt(r4)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r7 = (com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r7
                java.util.Vector r8 = r13.isLocationDataConsentGiven
                java.lang.Object r8 = r8.elementAt(r4)
                java.lang.String r8 = (java.lang.String) r8
                r9 = r2
            L_0x008a:
                if (r9 >= r14) goto L_0x00ce
                boolean r10 = r3[r9]
                if (r10 != 0) goto L_0x00cb
                java.util.Vector r10 = r1.getJSON
                java.lang.Object r10 = r10.elementAt(r9)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r10 = (com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r10
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x00cb
                java.util.Vector r10 = r1.isLocationDataConsentGiven
                java.lang.Object r10 = r10.elementAt(r9)
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r11 = Cardinal(r8)
                java.lang.String r10 = Cardinal(r10)
                boolean r12 = r11.equals(r10)
                if (r12 != 0) goto L_0x00c4
                java.lang.String r11 = getInstance(r11)
                java.lang.String r10 = getInstance(r10)
                boolean r10 = r11.equals(r10)
                if (r10 != 0) goto L_0x00c4
                r10 = r2
                goto L_0x00c5
            L_0x00c4:
                r10 = r0
            L_0x00c5:
                if (r10 == 0) goto L_0x00cb
                r3[r9] = r0
                r7 = r0
                goto L_0x00cf
            L_0x00cb:
                int r9 = r9 + 1
                goto L_0x008a
            L_0x00ce:
                r7 = r2
            L_0x00cf:
                if (r7 != 0) goto L_0x00d2
                return r2
            L_0x00d2:
                int r4 = r4 + r6
                goto L_0x0077
            L_0x00d4:
                return r0
            L_0x00d5:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.DSASigner.dsaSha3_256.equals(java.lang.Object):boolean");
        }

        private static void init(StringBuffer stringBuffer, Hashtable hashtable, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
            int i;
            String str2 = (String) hashtable.get(aSN1ObjectIdentifier);
            if (str2 != null) {
                stringBuffer.append(str2);
            } else {
                stringBuffer.append(aSN1ObjectIdentifier.init);
            }
            stringBuffer.append(SignatureVisitor.INSTANCEOF);
            int length = stringBuffer.length();
            stringBuffer.append(str);
            int length2 = stringBuffer.length();
            if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
                length += 2;
            }
            while (i < length2 && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                length = i + 2;
                length2++;
            }
            while (true) {
                length2--;
                if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                    stringBuffer.insert(length2, '\\');
                }
            }
            while (i <= length2) {
                char charAt = stringBuffer.charAt(i);
                if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                    switch (charAt) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            i++;
                            continue;
                    }
                }
                stringBuffer.insert(i, "\\");
                i += 2;
                length2++;
            }
        }

        public String toString() {
            Hashtable hashtable = getRenderType;
            StringBuffer stringBuffer = new StringBuffer();
            Vector vector = new Vector();
            StringBuffer stringBuffer2 = null;
            for (int i = 0; i < this.getJSON.size(); i++) {
                if (((Boolean) this.ExtendedData.elementAt(i)).booleanValue()) {
                    stringBuffer2.append(SignatureVisitor.EXTENDS);
                    init(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.getJSON.elementAt(i), (String) this.isLocationDataConsentGiven.elementAt(i));
                } else {
                    stringBuffer2 = new StringBuffer();
                    init(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.getJSON.elementAt(i), (String) this.isLocationDataConsentGiven.elementAt(i));
                    vector.addElement(stringBuffer2);
                }
            }
            boolean z = true;
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
            return stringBuffer.toString();
        }
    }

    public final class dsaSha3_384 extends setRenderType implements getChallengeTimeout {
        public getThreeDSRequestorAppURL Cardinal;

        private dsaSha3_384(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
            if ((getthreedsrequestorappurl instanceof ExtendedData) || (getthreedsrequestorappurl instanceof getUiType)) {
                this.Cardinal = getthreedsrequestorappurl;
                return;
            }
            throw new IllegalArgumentException("unknown object passed to Time");
        }

        public static dsaSha3_384 cca_continue(Object obj) {
            if (obj == null || (obj instanceof dsaSha3_384)) {
                return (dsaSha3_384) obj;
            }
            if (obj instanceof ExtendedData) {
                return new dsaSha3_384((ExtendedData) obj);
            }
            if (obj instanceof getUiType) {
                return new dsaSha3_384((getUiType) obj);
            }
            throw new IllegalArgumentException(new StringBuilder("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.Cardinal;
        }

        public final Date getInstance() {
            try {
                getThreeDSRequestorAppURL getthreedsrequestorappurl = this.Cardinal;
                if (!(getthreedsrequestorappurl instanceof ExtendedData)) {
                    return ((getUiType) getthreedsrequestorappurl).getInstance();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
                simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                return DSA.init(simpleDateFormat.parse(((ExtendedData) getthreedsrequestorappurl).cca_continue()));
            } catch (ParseException e) {
                throw new IllegalStateException(new StringBuilder("invalid date string: ").append(e.getMessage()).toString());
            }
        }

        public final String toString() {
            getThreeDSRequestorAppURL getthreedsrequestorappurl = this.Cardinal;
            return getthreedsrequestorappurl instanceof ExtendedData ? ((ExtendedData) getthreedsrequestorappurl).cca_continue() : ((getUiType) getthreedsrequestorappurl).cca_continue();
        }
    }

    public interface noneDSA {
        public static final ASN1ObjectIdentifier a_ = new ASN1ObjectIdentifier("2.5.4.20").getInstance();
        public static final ASN1ObjectIdentifier b_ = new ASN1ObjectIdentifier("2.5.4.41").getInstance();
        public static final ASN1ObjectIdentifier c_ = new ASN1ObjectIdentifier("2.5.4.97").getInstance();
        public static final ASN1ObjectIdentifier d_ = new ASN1ObjectIdentifier("2.5.8.1.1").getInstance();
        public static final ASN1ObjectIdentifier e_;
        public static final ASN1ObjectIdentifier f_;

        static {
            new ASN1ObjectIdentifier("2.5.4.3").getInstance();
            new ASN1ObjectIdentifier("2.5.4.6").getInstance();
            new ASN1ObjectIdentifier("2.5.4.7").getInstance();
            new ASN1ObjectIdentifier("2.5.4.8").getInstance();
            new ASN1ObjectIdentifier("2.5.4.10").getInstance();
            new ASN1ObjectIdentifier("2.5.4.11").getInstance();
            new ASN1ObjectIdentifier("1.3.14.3.2.26").getInstance();
            new ASN1ObjectIdentifier("1.3.36.3.2.1").getInstance();
            new ASN1ObjectIdentifier("1.3.36.3.3.1.2").getInstance();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
            e_ = aSN1ObjectIdentifier;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            new ASN1ObjectIdentifier("2.5.29");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "48");
            f_ = aSN1ObjectIdentifier2;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1").getInstance();
        }
    }

    public DSASigner(isEnableLogging isenablelogging) {
        if (isenablelogging.cca_continue() == 3) {
            CardinalConfigurationParameters init2 = isenablelogging.init(0);
            BCDSAPrivateKey bCDSAPrivateKey = null;
            this.cca_continue = init2 instanceof dsa384 ? (dsa384) init2 : init2 != null ? new dsa384(isEnableLogging.getInstance((Object) init2)) : null;
            CardinalConfigurationParameters init3 = isenablelogging.init(1);
            if (init3 instanceof BCDSAPrivateKey) {
                bCDSAPrivateKey = (BCDSAPrivateKey) init3;
            } else if (init3 != null) {
                bCDSAPrivateKey = new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init3));
            }
            this.getInstance = bCDSAPrivateKey;
            this.Cardinal = getDeviceFingerprint.Cardinal((Object) isenablelogging.init(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public final class stdDSA extends setRenderType {
        public BCDSAPrivateKey Cardinal;
        public KeyAgreementSpi.MQVwithSHA384KDF cca_continue;
        public KeyAgreementSpi.MQVwithSHA384KDF cleanup;
        public setEnvironment configure;
        public dsaSha3_384 getInstance;
        public dsaSha3_384 getSDKVersion;
        public SubjectPublicKeyInfo getWarnings;
        public setEnvironment init;
        public getDeviceFingerprint onCReqSuccess;
        public getDeviceFingerprint onValidated;
        private isEnableLogging valueOf;
        public detDSASha3_224 values;

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.valueOf;
        }

        stdDSA(isEnableLogging isenablelogging) {
            int i;
            boolean z;
            boolean z2;
            this.valueOf = isenablelogging;
            if (isenablelogging.init(0) instanceof setEnableLogging) {
                setEnableLogging setenablelogging = (setEnableLogging) isenablelogging.init(0);
                this.configure = setEnvironment.getInstance((Object) setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null);
                i = 0;
            } else {
                this.configure = new setEnvironment(0);
                i = -1;
            }
            if (new BigInteger(this.configure.getInstance).equals(BigInteger.valueOf(0))) {
                z = false;
                z2 = true;
            } else if (new BigInteger(this.configure.getInstance).equals(BigInteger.valueOf(1))) {
                z2 = false;
                z = true;
            } else if (new BigInteger(this.configure.getInstance).equals(BigInteger.valueOf(2))) {
                z2 = false;
                z = false;
            } else {
                throw new IllegalArgumentException("version number not recognised");
            }
            this.init = setEnvironment.getInstance((Object) isenablelogging.init(i + 1));
            CardinalConfigurationParameters init2 = isenablelogging.init(i + 2);
            this.Cardinal = init2 instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init2 : init2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2)) : null;
            this.cca_continue = KeyAgreementSpi.MQVwithSHA384KDF.init(isenablelogging.init(i + 3));
            isEnableLogging isenablelogging2 = (isEnableLogging) isenablelogging.init(i + 4);
            this.getInstance = dsaSha3_384.cca_continue(isenablelogging2.init(0));
            this.getSDKVersion = dsaSha3_384.cca_continue(isenablelogging2.init(1));
            this.cleanup = KeyAgreementSpi.MQVwithSHA384KDF.init(isenablelogging.init(i + 5));
            int i2 = i + 6;
            this.getWarnings = SubjectPublicKeyInfo.configure(isenablelogging.init(i2));
            int cca_continue2 = (isenablelogging.cca_continue() - i2) - 1;
            if (cca_continue2 == 0 || !z2) {
                while (cca_continue2 > 0) {
                    setEnableLogging setenablelogging2 = (setEnableLogging) isenablelogging.init(i2 + cca_continue2);
                    int i3 = setenablelogging2.Cardinal;
                    if (i3 == 1) {
                        this.onValidated = getDeviceFingerprint.Cardinal(setenablelogging2);
                    } else if (i3 == 2) {
                        this.onCReqSuccess = getDeviceFingerprint.Cardinal(setenablelogging2);
                    } else if (i3 != 3) {
                        throw new IllegalArgumentException(new StringBuilder("Unknown tag encountered in structure: ").append(setenablelogging2.Cardinal).toString());
                    } else if (!z) {
                        isEnableLogging configure2 = isEnableLogging.configure(setenablelogging2, true);
                        this.values = configure2 != null ? new detDSASha3_224(isEnableLogging.getInstance((Object) configure2)) : null;
                    } else {
                        throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                    }
                    cca_continue2--;
                }
                return;
            }
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
    }

    public final Enumeration configure() {
        dsa384 dsa3842 = this.cca_continue;
        return dsa3842.cleanup == null ? new dsa384.getInstance(dsa3842, (byte) 0) : new dsa384.configure(dsa3842.cleanup.init());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getbackgroundcolor.getInstance.addElement(this.getInstance);
        getbackgroundcolor.getInstance.addElement(this.Cardinal);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
