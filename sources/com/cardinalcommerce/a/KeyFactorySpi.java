package com.cardinalcommerce.a;

import androidx.autofill.HintConstants;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.facebook.appevents.UserDataStore;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import kotlin.io.encoding.Base64;
import okio.Utf8;

public final class KeyFactorySpi extends KeyAgreementSpi.MQVwithSHA512CKDF {
    private static ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("2.5.4.15").getInstance();
    private static ASN1ObjectIdentifier CardinalActionCode = new ASN1ObjectIdentifier("2.5.4.25").getInstance();
    private static ASN1ObjectIdentifier CardinalChallengeObserver = new ASN1ObjectIdentifier("2.5.4.41").getInstance();
    private static ASN1ObjectIdentifier CardinalConfigurationParameters = new ASN1ObjectIdentifier("2.5.4.11").getInstance();
    private static ASN1ObjectIdentifier CardinalEnvironment = new ASN1ObjectIdentifier("2.5.4.51").getInstance();
    private static ASN1ObjectIdentifier CardinalError = new ASN1ObjectIdentifier("2.5.4.43").getInstance();
    private static ASN1ObjectIdentifier CardinalRenderType = new ASN1ObjectIdentifier("2.5.4.23").getInstance();
    private static ASN1ObjectIdentifier CardinalUiType = new ASN1ObjectIdentifier("2.5.4.10").getInstance();
    private static ASN1ObjectIdentifier ExtendedData = new ASN1ObjectIdentifier("2.5.4.45").getInstance();
    public static final KeyAgreementSpi.MQVwithSHA256KDF cca_continue = new KeyFactorySpi();
    private static ASN1ObjectIdentifier cleanup = new ASN1ObjectIdentifier("2.5.4.13").getInstance();
    private static ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25").getInstance();
    private static ASN1ObjectIdentifier getActionCode = new ASN1ObjectIdentifier("2.5.4.31").getInstance();
    private static ASN1ObjectIdentifier getChallengeTimeout = new ASN1ObjectIdentifier("2.5.4.32").getInstance();
    private static ASN1ObjectIdentifier getEnvironment = new ASN1ObjectIdentifier("2.5.4.26").getInstance();
    private static ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("2.5.4.3").getInstance();
    private static ASN1ObjectIdentifier getJSON = new ASN1ObjectIdentifier("2.5.4.50").getInstance();
    private static final Hashtable getPaResStatus;
    private static ASN1ObjectIdentifier getProxyAddress = new ASN1ObjectIdentifier("2.5.4.18").getInstance();
    private static ASN1ObjectIdentifier getRenderType = new ASN1ObjectIdentifier("2.5.4.9").getInstance();
    private static ASN1ObjectIdentifier getRequestTimeout = new ASN1ObjectIdentifier("2.5.4.17").getInstance();
    private static ASN1ObjectIdentifier getSDKVersion = new ASN1ObjectIdentifier("2.5.4.47").getInstance();
    private static ASN1ObjectIdentifier getString = new ASN1ObjectIdentifier("2.5.4.7").getInstance();
    private static ASN1ObjectIdentifier getThreeDSRequestorAppURL = new ASN1ObjectIdentifier("2.5.4.20").getInstance();
    private static ASN1ObjectIdentifier getUICustomization = new ASN1ObjectIdentifier("2.5.4.4").getInstance();
    private static ASN1ObjectIdentifier getUiType = new ASN1ObjectIdentifier("2.5.4.33").getInstance();
    private static ASN1ObjectIdentifier getWarnings = new ASN1ObjectIdentifier("2.5.4.27").getInstance();
    private static ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("2.5.4.6").getInstance();
    private static ASN1ObjectIdentifier isEnableDFSync = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1").getInstance();
    private static ASN1ObjectIdentifier isEnableLogging = new ASN1ObjectIdentifier("2.5.4.21").getInstance();
    private static ASN1ObjectIdentifier isLocationDataConsentGiven = new ASN1ObjectIdentifier("2.5.4.35").getInstance();
    private static ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("2.5.4.49").getInstance();
    private static ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("2.5.4.46").getInstance();
    private static ASN1ObjectIdentifier setChallengeTimeout = new ASN1ObjectIdentifier("2.5.4.16").getInstance();
    private static ASN1ObjectIdentifier setEnableDFSync = new ASN1ObjectIdentifier("2.5.4.22").getInstance();
    private static ASN1ObjectIdentifier setEnableLogging = new ASN1ObjectIdentifier("2.5.4.24").getInstance();
    private static ASN1ObjectIdentifier setEnvironment = new ASN1ObjectIdentifier("2.5.4.28").getInstance();
    private static final Hashtable setLocationDataConsentGiven;
    private static ASN1ObjectIdentifier setProxyAddress = new ASN1ObjectIdentifier("2.5.4.14").getInstance();
    private static ASN1ObjectIdentifier setRenderType = new ASN1ObjectIdentifier("2.5.4.34").getInstance();
    private static ASN1ObjectIdentifier setRequestTimeout = new ASN1ObjectIdentifier("2.5.4.19").getInstance();
    private static ASN1ObjectIdentifier setThreeDSRequestorAppURL = new ASN1ObjectIdentifier("2.5.4.12").getInstance();
    private static ASN1ObjectIdentifier setUICustomization = new ASN1ObjectIdentifier("2.5.4.5").getInstance();
    private static ASN1ObjectIdentifier setUiType = new ASN1ObjectIdentifier("2.5.4.8").getInstance();
    private static ASN1ObjectIdentifier valueOf = new ASN1ObjectIdentifier("2.5.4.42").getInstance();
    private static ASN1ObjectIdentifier values = new ASN1ObjectIdentifier("2.5.4.44").getInstance();
    private Hashtable getCavv = configure(setLocationDataConsentGiven);
    private Hashtable getEnrolled = configure(getPaResStatus);

    public final class ECDSA implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private static final byte[] cleanup = {41, 46, 67, -55, -94, -40, 124, 1, Base64.padSymbol, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, Ascii.RS, -101, 87, 60, -3, -44, -32, Ascii.SYN, 103, 66, 111, Ascii.CAN, -118, Ascii.ETB, -27, Ascii.DC2, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, Ascii.NAK, -78, 7, Utf8.REPLACEMENT_BYTE, -108, -62, Ascii.DLE, -119, Ascii.VT, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, Ascii.EM, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, Ascii.ESC, 96, 37, -83, -82, -80, -71, -10, Ascii.FS, 70, 97, 105, 52, SignedBytes.MAX_POWER_OF_TWO, 126, Ascii.SI, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, Ascii.CR, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, Ascii.FF, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, Ascii.GS, 57, -14, -17, -73, Ascii.SO, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, Ascii.US, 26, -37, -103, -115, 51, -97, 17, -125, Ascii.DC4};
        private int Cardinal;
        private int cca_continue;
        private byte[] configure = new byte[48];
        private byte[] getInstance = new byte[16];
        private byte[] init = new byte[16];
        private int onValidated;

        public ECDSA() {
            init();
        }

        private ECDSA(ECDSA ecdsa) {
            getInstance(ecdsa);
        }

        private void Cardinal(byte[] bArr) {
            for (int i = 0; i < 16; i++) {
                byte[] bArr2 = this.configure;
                bArr2[i + 16] = bArr[i];
                bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 18; i3++) {
                for (int i4 = 0; i4 < 48; i4++) {
                    byte[] bArr3 = this.configure;
                    byte b = (byte) (cleanup[i2] ^ bArr3[i4]);
                    bArr3[i4] = b;
                    i2 = b & 255;
                }
                i2 = (i2 + i3) % 256;
            }
        }

        private void getInstance(ECDSA ecdsa) {
            byte[] bArr = ecdsa.configure;
            System.arraycopy(bArr, 0, this.configure, 0, bArr.length);
            this.Cardinal = ecdsa.Cardinal;
            byte[] bArr2 = ecdsa.getInstance;
            System.arraycopy(bArr2, 0, this.getInstance, 0, bArr2.length);
            this.cca_continue = ecdsa.cca_continue;
            byte[] bArr3 = ecdsa.init;
            System.arraycopy(bArr3, 0, this.init, 0, bArr3.length);
            this.onValidated = ecdsa.onValidated;
        }

        private void getInstance(byte[] bArr) {
            byte b = this.init[15];
            for (int i = 0; i < 16; i++) {
                byte[] bArr2 = this.init;
                b = (byte) (cleanup[(b ^ bArr[i]) & 255] ^ bArr2[i]);
                bArr2[i] = b;
            }
        }

        public final setBackgroundColor Cardinal() {
            return new ECDSA(this);
        }

        public final int cca_continue() {
            return 16;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.getInstance;
            int i = this.cca_continue;
            int i2 = i + 1;
            this.cca_continue = i2;
            bArr[i] = b;
            if (i2 == 16) {
                getInstance(bArr);
                Cardinal(this.getInstance);
                this.cca_continue = 0;
            }
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            getInstance((ECDSA) setbackgroundcolor);
        }

        public final String configure() {
            return "MD2";
        }

        public final int getInstance() {
            return 16;
        }

        public final int init(byte[] bArr, int i) {
            int length = this.getInstance.length;
            int i2 = this.cca_continue;
            byte b = (byte) (length - i2);
            while (true) {
                byte[] bArr2 = this.getInstance;
                if (i2 < bArr2.length) {
                    bArr2[i2] = b;
                    i2++;
                } else {
                    getInstance(bArr2);
                    Cardinal(this.getInstance);
                    Cardinal(this.init);
                    System.arraycopy(this.configure, this.Cardinal, bArr, i, 16);
                    init();
                    return 16;
                }
            }
        }

        public final void init() {
            this.Cardinal = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.configure;
                if (i == bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
            this.cca_continue = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr2 = this.getInstance;
                if (i2 == bArr2.length) {
                    break;
                }
                bArr2[i2] = 0;
                i2++;
            }
            this.onValidated = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.init;
                if (i3 != bArr3.length) {
                    bArr3[i3] = 0;
                    i3++;
                } else {
                    return;
                }
            }
        }

        public final void init(byte[] bArr, int i, int i2) {
            while (this.cca_continue != 0 && i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > 16) {
                System.arraycopy(bArr, i, this.getInstance, 0, 16);
                getInstance(this.getInstance);
                Cardinal(this.getInstance);
                i2 -= 16;
                i += 16;
            }
            while (i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        setLocationDataConsentGiven = hashtable;
        Hashtable hashtable2 = new Hashtable();
        getPaResStatus = hashtable2;
        hashtable.put(Cardinal, "businessCategory");
        hashtable.put(init, "c");
        hashtable.put(getInstance, "cn");
        hashtable.put(configure, "dc");
        hashtable.put(cleanup, "description");
        hashtable.put(getWarnings, "destinationIndicator");
        hashtable.put(onCReqSuccess, "distinguishedName");
        hashtable.put(onValidated, "dnQualifier");
        hashtable.put(getSDKVersion, "enhancedSearchGuide");
        hashtable.put(CardinalRenderType, "facsimileTelephoneNumber");
        hashtable.put(values, "generationQualifier");
        hashtable.put(valueOf, "givenName");
        hashtable.put(CardinalEnvironment, "houseIdentifier");
        hashtable.put(CardinalError, "initials");
        hashtable.put(CardinalActionCode, "internationalISDNNumber");
        hashtable.put(getString, "l");
        hashtable.put(getActionCode, "member");
        hashtable.put(CardinalChallengeObserver, "name");
        hashtable.put(CardinalUiType, "o");
        hashtable.put(CardinalConfigurationParameters, "ou");
        hashtable.put(getChallengeTimeout, "owner");
        hashtable.put(setRequestTimeout, "physicalDeliveryOfficeName");
        hashtable.put(setChallengeTimeout, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);
        hashtable.put(getRequestTimeout, "postalCode");
        hashtable.put(getProxyAddress, "postOfficeBox");
        hashtable.put(setEnvironment, "preferredDeliveryMethod");
        hashtable.put(getEnvironment, "registeredAddress");
        hashtable.put(getUiType, "roleOccupant");
        hashtable.put(setProxyAddress, "searchGuide");
        hashtable.put(setRenderType, "seeAlso");
        hashtable.put(setUICustomization, "serialNumber");
        hashtable.put(getUICustomization, "sn");
        hashtable.put(setUiType, UserDataStore.STATE);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = getRenderType;
        Object obj = UserDataStore.STATE;
        hashtable.put(aSN1ObjectIdentifier, "street");
        hashtable.put(getThreeDSRequestorAppURL, "telephoneNumber");
        hashtable.put(setEnableDFSync, "teletexTerminalIdentifier");
        hashtable.put(isEnableLogging, "telexNumber");
        hashtable.put(setThreeDSRequestorAppURL, "title");
        hashtable.put(isEnableDFSync, "uid");
        hashtable.put(getJSON, "uniqueMember");
        hashtable.put(isLocationDataConsentGiven, "userPassword");
        hashtable.put(setEnableLogging, "x121Address");
        hashtable.put(ExtendedData, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", Cardinal);
        hashtable2.put("c", init);
        hashtable2.put("cn", getInstance);
        hashtable2.put("dc", configure);
        hashtable2.put("description", cleanup);
        hashtable2.put("destinationindicator", getWarnings);
        hashtable2.put("distinguishedname", onCReqSuccess);
        hashtable2.put("dnqualifier", onValidated);
        hashtable2.put("enhancedsearchguide", getSDKVersion);
        hashtable2.put("facsimiletelephonenumber", CardinalRenderType);
        hashtable2.put("generationqualifier", values);
        hashtable2.put("givenname", valueOf);
        hashtable2.put("houseidentifier", CardinalEnvironment);
        hashtable2.put("initials", CardinalError);
        hashtable2.put("internationalisdnnumber", CardinalActionCode);
        hashtable2.put("l", getString);
        hashtable2.put("member", getActionCode);
        hashtable2.put("name", CardinalChallengeObserver);
        hashtable2.put("o", CardinalUiType);
        hashtable2.put("ou", CardinalConfigurationParameters);
        hashtable2.put("owner", getChallengeTimeout);
        hashtable2.put("physicaldeliveryofficename", setRequestTimeout);
        hashtable2.put("postaladdress", setChallengeTimeout);
        hashtable2.put("postalcode", getRequestTimeout);
        hashtable2.put("postofficebox", getProxyAddress);
        hashtable2.put("preferreddeliverymethod", setEnvironment);
        hashtable2.put("registeredaddress", getEnvironment);
        hashtable2.put("roleoccupant", getUiType);
        hashtable2.put("searchguide", setProxyAddress);
        hashtable2.put("seealso", setRenderType);
        hashtable2.put("serialnumber", setUICustomization);
        hashtable2.put("sn", getUICustomization);
        hashtable2.put(obj, setUiType);
        hashtable2.put("street", getRenderType);
        hashtable2.put("telephonenumber", getThreeDSRequestorAppURL);
        hashtable2.put("teletexterminalidentifier", setEnableDFSync);
        hashtable2.put("telexnumber", isEnableLogging);
        hashtable2.put("title", setThreeDSRequestorAppURL);
        hashtable2.put("uid", isEnableDFSync);
        hashtable2.put("uniquemember", getJSON);
        hashtable2.put("userpassword", isLocationDataConsentGiven);
        hashtable2.put("x121address", setEnableLogging);
        hashtable2.put("x500uniqueidentifier", ExtendedData);
    }

    protected KeyFactorySpi() {
    }

    public final class ECDHC implements IESCipher.ECIESwithAESCBC {
        private cca_continue getInstance = new cca_continue((byte) 0);

        public final void cca_continue(byte b) {
            this.getInstance.write(b);
        }

        public final String configure() {
            return "NULL";
        }

        public final int getInstance() {
            return this.getInstance.size();
        }

        public final void init() {
            this.getInstance.reset();
        }

        public final void init(byte[] bArr, int i, int i2) {
            this.getInstance.write(bArr, i, i2);
        }

        static class cca_continue extends ByteArrayOutputStream {
            private cca_continue() {
            }

            /* synthetic */ cca_continue(byte b) {
                this();
            }

            /* access modifiers changed from: package-private */
            public final void cca_continue(byte[] bArr, int i) {
                System.arraycopy(this.buf, 0, bArr, i, size());
            }

            public final void reset() {
                super.reset();
                byte[] bArr = this.buf;
                if (bArr != null) {
                    for (int i = 0; i < bArr.length; i++) {
                        bArr[i] = 0;
                    }
                }
            }
        }

        public final int init(byte[] bArr, int i) {
            int size = this.getInstance.size();
            this.getInstance.cca_continue(bArr, i);
            this.getInstance.reset();
            return size;
        }
    }

    /* renamed from: com.cardinalcommerce.a.KeyFactorySpi$1  reason: invalid class name */
    public final class AnonymousClass1 extends setRenderType {
        public getDeviceFingerprint cca_continue;
        public setEnvironment configure;

        AnonymousClass1(isEnableLogging isenablelogging) {
            if (isenablelogging.cca_continue() == 2) {
                this.cca_continue = getDeviceFingerprint.Cardinal((Object) isenablelogging.init(0));
                this.configure = setEnvironment.getInstance((Object) isenablelogging.init(1));
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
        }

        public AnonymousClass1(byte[] bArr, int i) {
            if (bArr != null) {
                this.cca_continue = new getDeviceFingerprint(bArr);
                this.configure = new setEnvironment((long) i);
                return;
            }
            throw new IllegalArgumentException("'seed' cannot be null");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.cca_continue);
            getbackgroundcolor.getInstance.addElement(this.configure);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public abstract class EC implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private static long[] valueOf = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
        protected long Cardinal;
        private long CardinalEnvironment;
        private int CardinalError;
        private long[] CardinalRenderType;
        protected long cca_continue;
        protected long cleanup;
        protected long configure;
        protected long getInstance;
        protected long getSDKVersion;
        protected long getWarnings;
        protected long init;
        private int onCReqSuccess;
        private byte[] onValidated;
        private long values;

        protected EC() {
            this.onValidated = new byte[8];
            this.CardinalRenderType = new long[80];
            this.onCReqSuccess = 0;
            init();
        }

        protected EC(EC ec) {
            this.onValidated = new byte[8];
            this.CardinalRenderType = new long[80];
            init(ec);
        }

        private void getSDKVersion() {
            long j = this.CardinalEnvironment;
            if (j > 2305843009213693951L) {
                this.values += j >>> 61;
                this.CardinalEnvironment = j & 2305843009213693951L;
            }
        }

        public final int cca_continue() {
            return 128;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.onValidated;
            int i = this.onCReqSuccess;
            int i2 = i + 1;
            this.onCReqSuccess = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                Cardinal(bArr, 0);
                this.onCReqSuccess = 0;
            }
            this.CardinalEnvironment++;
        }

        public void init() {
            this.CardinalEnvironment = 0;
            this.values = 0;
            int i = 0;
            this.onCReqSuccess = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.onValidated;
                if (i2 >= bArr.length) {
                    break;
                }
                bArr[i2] = 0;
                i2++;
            }
            this.CardinalError = 0;
            while (true) {
                long[] jArr = this.CardinalRenderType;
                if (i != jArr.length) {
                    jArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void init(EC ec) {
            byte[] bArr = ec.onValidated;
            System.arraycopy(bArr, 0, this.onValidated, 0, bArr.length);
            this.onCReqSuccess = ec.onCReqSuccess;
            this.CardinalEnvironment = ec.CardinalEnvironment;
            this.values = ec.values;
            this.cca_continue = ec.cca_continue;
            this.init = ec.init;
            this.Cardinal = ec.Cardinal;
            this.configure = ec.configure;
            this.getInstance = ec.getInstance;
            this.getSDKVersion = ec.getSDKVersion;
            this.getWarnings = ec.getWarnings;
            this.cleanup = ec.cleanup;
            long[] jArr = ec.CardinalRenderType;
            System.arraycopy(jArr, 0, this.CardinalRenderType, 0, jArr.length);
            this.CardinalError = ec.CardinalError;
        }

        public final void init(byte[] bArr, int i, int i2) {
            while (this.onCReqSuccess != 0 && i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.onValidated.length) {
                Cardinal(bArr, i);
                byte[] bArr2 = this.onValidated;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.CardinalEnvironment += (long) bArr2.length;
            }
            while (i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
        }

        public final void onCReqSuccess() {
            getSDKVersion();
            long j = this.CardinalEnvironment << 3;
            long j2 = this.values;
            byte b = Byte.MIN_VALUE;
            while (true) {
                cca_continue(b);
                if (this.onCReqSuccess == 0) {
                    break;
                }
                b = 0;
            }
            if (this.CardinalError > 14) {
                cleanup();
            }
            long[] jArr = this.CardinalRenderType;
            jArr[14] = j2;
            jArr[15] = j;
            cleanup();
        }

        private void Cardinal(byte[] bArr, int i) {
            long[] jArr = this.CardinalRenderType;
            int i2 = this.CardinalError;
            int instance = setTextFontSize.getInstance(bArr, i);
            jArr[i2] = (((long) setTextFontSize.getInstance(bArr, i + 4)) & 4294967295L) | ((((long) instance) & 4294967295L) << 32);
            int i3 = this.CardinalError + 1;
            this.CardinalError = i3;
            if (i3 == 16) {
                cleanup();
            }
        }

        private void cleanup() {
            EC ec = this;
            getSDKVersion();
            for (int i = 16; i <= 79; i++) {
                long[] jArr = ec.CardinalRenderType;
                long j = jArr[i - 2];
                long j2 = ((j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)))) + jArr[i - 7];
                long j3 = jArr[i - 15];
                jArr[i] = j2 + ((j3 >>> 7) ^ (((j3 << 63) | (j3 >>> 1)) ^ ((j3 << 56) | (j3 >>> 8)))) + jArr[i - 16];
            }
            long j4 = ec.cca_continue;
            long j5 = ec.init;
            long j6 = ec.Cardinal;
            long j7 = ec.configure;
            long j8 = ec.getInstance;
            long j9 = ec.getSDKVersion;
            long j10 = ec.getWarnings;
            long j11 = j4;
            long j12 = ec.cleanup;
            long j13 = j6;
            int i2 = 0;
            int i3 = 0;
            while (i2 < 10) {
                long j14 = ((((j8 << 50) | (j8 >>> 14)) ^ ((j8 << 46) | (j8 >>> 18))) ^ ((j8 << 23) | (j8 >>> 41))) + ((j8 & j9) ^ ((~j8) & j10));
                long[] jArr2 = valueOf;
                long j15 = j14 + jArr2[i3];
                long[] jArr3 = ec.CardinalRenderType;
                int i4 = i3 + 1;
                long j16 = j12 + j15 + jArr3[i3];
                long j17 = j7 + j16;
                long j18 = j11 & j5;
                long j19 = j16 + ((((j11 << 36) | (j11 >>> 28)) ^ ((j11 << 30) | (j11 >>> 34))) ^ ((j11 << 25) | (j11 >>> 39))) + ((j18 ^ (j11 & j13)) ^ (j5 & j13));
                long j20 = j8;
                long j21 = ((((j17 << 50) | (j17 >>> 14)) ^ ((j17 << 46) | (j17 >>> 18))) ^ ((j17 << 23) | (j17 >>> 41))) + ((j17 & j8) ^ ((~j17) & j9)) + jArr2[i4];
                int i5 = i4 + 1;
                long j22 = j10 + j21 + jArr3[i4];
                long j23 = j13 + j22;
                long j24 = j19 & j11;
                long j25 = j22 + ((((j19 << 36) | (j19 >>> 28)) ^ ((j19 << 30) | (j19 >>> 34))) ^ ((j19 << 25) | (j19 >>> 39))) + ((j24 ^ (j19 & j5)) ^ j18);
                long j26 = j17;
                long j27 = ((((j23 << 50) | (j23 >>> 14)) ^ ((j23 << 46) | (j23 >>> 18))) ^ ((j23 << 23) | (j23 >>> 41))) + ((j23 & j17) ^ ((~j23) & j20)) + jArr2[i5];
                int i6 = i5 + 1;
                long j28 = j9 + j27 + jArr3[i5];
                long j29 = j5 + j28;
                long j30 = j25 & j19;
                long j31 = j28 + ((((j25 << 36) | (j25 >>> 28)) ^ ((j25 << 30) | (j25 >>> 34))) ^ ((j25 << 25) | (j25 >>> 39))) + ((j30 ^ (j25 & j11)) ^ j24);
                long j32 = j23;
                long j33 = ((((j29 << 50) | (j29 >>> 14)) ^ ((j29 << 46) | (j29 >>> 18))) ^ ((j29 << 23) | (j29 >>> 41))) + ((j29 & j23) ^ ((~j29) & j26)) + jArr2[i6];
                int i7 = i6 + 1;
                long j34 = j20 + j33 + jArr3[i6];
                long[] jArr4 = jArr3;
                long j35 = j11 + j34;
                long j36 = j31 & j25;
                long j37 = j34 + ((((j31 << 36) | (j31 >>> 28)) ^ ((j31 << 30) | (j31 >>> 34))) ^ ((j31 << 25) | (j31 >>> 39))) + ((j36 ^ (j31 & j19)) ^ j30);
                int i8 = i2;
                long j38 = j29;
                int i9 = i7 + 1;
                long j39 = j26 + ((((j35 << 50) | (j35 >>> 14)) ^ ((j35 << 46) | (j35 >>> 18))) ^ ((j35 << 23) | (j35 >>> 41))) + ((j35 & j29) ^ ((~j35) & j32)) + jArr2[i7] + jArr4[i7];
                long j40 = j19 + j39;
                long j41 = j37 & j31;
                long j42 = j39 + ((((j37 << 36) | (j37 >>> 28)) ^ ((j37 << 30) | (j37 >>> 34))) ^ ((j37 << 25) | (j37 >>> 39))) + ((j41 ^ (j37 & j25)) ^ j36);
                long j43 = j35;
                long j44 = ((((j40 << 50) | (j40 >>> 14)) ^ ((j40 << 46) | (j40 >>> 18))) ^ ((j40 << 23) | (j40 >>> 41))) + ((j40 & j35) ^ ((~j40) & j38)) + jArr2[i9];
                int i10 = i9 + 1;
                long j45 = j32 + j44 + jArr4[i9];
                long j46 = j25 + j45;
                long j47 = j42 & j37;
                j13 = j45 + ((((j42 << 36) | (j42 >>> 28)) ^ ((j42 << 30) | (j42 >>> 34))) ^ ((j42 << 25) | (j42 >>> 39))) + ((j47 ^ (j42 & j31)) ^ j41);
                long j48 = j40;
                int i11 = i10 + 1;
                long j49 = j38 + ((((j46 << 50) | (j46 >>> 14)) ^ ((j46 << 46) | (j46 >>> 18))) ^ ((j46 << 23) | (j46 >>> 41))) + ((j46 & j40) ^ ((~j46) & j43)) + jArr2[i10] + jArr4[i10];
                long j50 = j31 + j49;
                long j51 = j13 & j42;
                long j52 = j49 + ((((j13 << 36) | (j13 >>> 28)) ^ ((j13 << 30) | (j13 >>> 34))) ^ ((j13 << 25) | (j13 >>> 39))) + ((j51 ^ (j13 & j37)) ^ j47);
                long j53 = j43 + ((((j50 << 50) | (j50 >>> 14)) ^ ((j50 << 46) | (j50 >>> 18))) ^ ((j50 << 23) | (j50 >>> 41))) + ((j50 & j46) ^ ((~j50) & j48)) + jArr2[i11] + jArr4[i11];
                j11 = j53 + ((((j52 << 36) | (j52 >>> 28)) ^ ((j52 << 30) | (j52 >>> 34))) ^ ((j52 << 25) | (j52 >>> 39))) + (((j52 & j13) ^ (j52 & j42)) ^ j51);
                i3 = i11 + 1;
                j8 = j37 + j53;
                j10 = j46;
                i2 = i8 + 1;
                j9 = j50;
                ec = this;
                j7 = j42;
                j5 = j52;
                j12 = j48;
            }
            ec.cca_continue += j11;
            ec.init += j5;
            ec.Cardinal += j13;
            ec.configure += j7;
            ec.getInstance += j8;
            ec.getSDKVersion += j9;
            ec.getWarnings += j10;
            ec.cleanup += j12;
            ec.CardinalError = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                ec.CardinalRenderType[i12] = 0;
            }
        }
    }

    public final class ECDH extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int[] cca_continue = new int[16];
        private int cleanup;
        private int configure;
        private int getInstance;
        private int init;

        public ECDH() {
            init();
        }

        private ECDH(ECDH ecdh) {
            super(ecdh);
            init(ecdh);
        }

        private static void init(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
        }

        private void init(ECDH ecdh) {
            super.init(ecdh);
            this.Cardinal = ecdh.Cardinal;
            this.configure = ecdh.configure;
            this.init = ecdh.init;
            this.getInstance = ecdh.getInstance;
            int[] iArr = ecdh.cca_continue;
            System.arraycopy(iArr, 0, this.cca_continue, 0, iArr.length);
            this.cleanup = ecdh.cleanup;
        }

        public final setBackgroundColor Cardinal() {
            return new ECDH(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            init((ECDH) setbackgroundcolor);
        }

        public final String configure() {
            return "MD5";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.cleanup > 14) {
                cleanup();
            }
            int[] iArr = this.cca_continue;
            iArr[14] = (int) j;
            iArr[15] = (int) (j >>> 32);
        }

        public final int getInstance() {
            return 16;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int[] iArr = this.cca_continue;
            int i2 = this.cleanup;
            int i3 = i2 + 1;
            this.cleanup = i3;
            iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            if (i3 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            init(this.Cardinal, bArr, i);
            init(this.configure, bArr, i + 4);
            init(this.init, bArr, i + 8);
            init(this.getInstance, bArr, i + 12);
            init();
            return 16;
        }

        public final void init() {
            super.init();
            this.Cardinal = 1732584193;
            this.configure = -271733879;
            this.init = -1732584194;
            this.getInstance = 271733878;
            this.cleanup = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.cca_continue;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            int i = this.Cardinal;
            int i2 = this.configure;
            int i3 = this.init;
            int i4 = this.getInstance;
            int[] iArr = this.cca_continue;
            int i5 = iArr[0];
            int i6 = ((((i2 & i3) | ((~i2) & i4)) + i) + i5) - 680876936;
            int i7 = ((i6 >>> 25) | (i6 << 7)) + i2;
            int i8 = iArr[1];
            int i9 = ((((i7 & i2) | ((~i7) & i3)) + i4) + i8) - 389564586;
            int i10 = ((i9 >>> 20) | (i9 << 12)) + i7;
            int i11 = iArr[2];
            int i12 = ((i10 & i7) | ((~i10) & i2)) + i3 + i11 + 606105819;
            int i13 = ((i12 >>> 15) | (i12 << 17)) + i10;
            int i14 = iArr[3];
            int i15 = ((((i13 & i10) | ((~i13) & i7)) + i2) + i14) - 1044525330;
            int i16 = ((i15 << 22) | (i15 >>> 10)) + i13;
            int i17 = i7 + ((i16 & i13) | ((~i16) & i10));
            int i18 = iArr[4];
            int i19 = (i17 + i18) - 176418897;
            int i20 = ((i19 << 7) | (i19 >>> 25)) + i16;
            int i21 = i10 + ((i20 & i16) | ((~i20) & i13));
            int i22 = iArr[5];
            int i23 = i21 + i22 + 1200080426;
            int i24 = ((i23 << 12) | (i23 >>> 20)) + i20;
            int i25 = i4;
            int i26 = i13 + ((i24 & i20) | ((~i24) & i16));
            int i27 = iArr[6];
            int i28 = (i26 + i27) - 1473231341;
            int i29 = ((i28 << 17) | (i28 >>> 15)) + i24;
            int i30 = i3;
            int i31 = i16 + ((i29 & i24) | ((~i29) & i20));
            int i32 = iArr[7];
            int i33 = (i31 + i32) - 45705983;
            int i34 = ((i33 << 22) | (i33 >>> 10)) + i29;
            int i35 = i2;
            int i36 = i20 + ((i34 & i29) | ((~i34) & i24));
            int i37 = iArr[8];
            int i38 = i36 + i37 + 1770035416;
            int i39 = ((i38 << 7) | (i38 >>> 25)) + i34;
            int i40 = iArr[9];
            int i41 = ((i24 + ((i39 & i34) | ((~i39) & i29))) + i40) - 1958414417;
            int i42 = ((i41 << 12) | (i41 >>> 20)) + i39;
            int i43 = i29 + ((i42 & i39) | ((~i42) & i34));
            int i44 = iArr[10];
            int i45 = (i43 + i44) - 42063;
            int i46 = ((i45 << 17) | (i45 >>> 15)) + i42;
            int i47 = i;
            int i48 = iArr[11];
            int i49 = ((i34 + ((i46 & i42) | ((~i46) & i39))) + i48) - 1990404162;
            int i50 = ((i49 << 22) | (i49 >>> 10)) + i46;
            int i51 = iArr[12];
            int i52 = i39 + ((i50 & i46) | ((~i50) & i42)) + i51 + 1804603682;
            int i53 = ((i52 << 7) | (i52 >>> 25)) + i50;
            int i54 = i42 + ((i53 & i50) | ((~i53) & i46));
            int i55 = iArr[13];
            int i56 = (i54 + i55) - 40341101;
            int i57 = ((i56 << 12) | (i56 >>> 20)) + i53;
            int i58 = i32;
            int i59 = ~i57;
            int i60 = iArr[14];
            int i61 = ((i46 + ((i57 & i53) | (i59 & i50))) + i60) - 1502002290;
            int i62 = ((i61 << 17) | (i61 >>> 15)) + i57;
            int i63 = i11;
            int i64 = ~i62;
            int i65 = iArr[15];
            int i66 = i50 + ((i62 & i57) | (i64 & i53)) + i65 + 1236535329;
            int i67 = ((i66 << 22) | (i66 >>> 10)) + i62;
            int i68 = ((i53 + ((i67 & i57) | (i59 & i62))) + i8) - 165796510;
            int i69 = ((i68 << 5) | (i68 >>> 27)) + i67;
            int i70 = ((i57 + ((i69 & i62) | (i64 & i67))) + i27) - 1069501632;
            int i71 = ((i70 << 9) | (i70 >>> 23)) + i69;
            int i72 = i62 + ((i71 & i67) | ((~i67) & i69)) + i48 + 643717713;
            int i73 = ((i72 << 14) | (i72 >>> 18)) + i71;
            int i74 = ((i67 + ((i73 & i69) | ((~i69) & i71))) + i5) - 373897302;
            int i75 = ((i74 << 20) | (i74 >>> 12)) + i73;
            int i76 = ((i69 + ((i75 & i71) | ((~i71) & i73))) + i22) - 701558691;
            int i77 = ((i76 >>> 27) | (i76 << 5)) + i75;
            int i78 = i71 + ((i77 & i73) | ((~i73) & i75)) + i44 + 38016083;
            int i79 = ((i78 >>> 23) | (i78 << 9)) + i77;
            int i80 = ((i73 + ((i79 & i75) | ((~i75) & i77))) + i65) - 660478335;
            int i81 = ((i80 >>> 18) | (i80 << 14)) + i79;
            int i82 = ((i75 + ((i81 & i77) | ((~i77) & i79))) + i18) - 405537848;
            int i83 = ((i82 >>> 12) | (i82 << 20)) + i81;
            int i84 = i77 + ((i83 & i79) | ((~i79) & i81)) + i40 + 568446438;
            int i85 = ((i84 >>> 27) | (i84 << 5)) + i83;
            int i86 = ((i79 + ((i85 & i81) | ((~i81) & i83))) + i60) - 1019803690;
            int i87 = ((i86 >>> 23) | (i86 << 9)) + i85;
            int i88 = ((i81 + ((i87 & i83) | ((~i83) & i85))) + i14) - 187363961;
            int i89 = ((i88 >>> 18) | (i88 << 14)) + i87;
            int i90 = i83 + ((i89 & i85) | ((~i85) & i87)) + i37 + 1163531501;
            int i91 = ((i90 >>> 12) | (i90 << 20)) + i89;
            int i92 = ((i85 + ((i91 & i87) | ((~i87) & i89))) + i55) - 1444681467;
            int i93 = ((i92 >>> 27) | (i92 << 5)) + i91;
            int i94 = ((i87 + ((i93 & i89) | ((~i89) & i91))) + i63) - 51403784;
            int i95 = ((i94 >>> 23) | (i94 << 9)) + i93;
            int i96 = i89 + ((i95 & i91) | ((~i91) & i93)) + i58 + 1735328473;
            int i97 = ((i96 >>> 18) | (i96 << 14)) + i95;
            int i98 = ((i91 + ((i97 & i93) | ((~i93) & i95))) + i51) - 1926607734;
            int i99 = ((i98 >>> 12) | (i98 << 20)) + i97;
            int i100 = ((i93 + ((i99 ^ i97) ^ i95)) + i22) - 378558;
            int i101 = ((i100 >>> 28) | (i100 << 4)) + i99;
            int i102 = ((i95 + ((i101 ^ i99) ^ i97)) + i37) - 2022574463;
            int i103 = ((i102 >>> 21) | (i102 << 11)) + i101;
            int i104 = i97 + ((i103 ^ i101) ^ i99) + i48 + 1839030562;
            int i105 = ((i104 >>> 16) | (i104 << 16)) + i103;
            int i106 = ((i99 + ((i105 ^ i103) ^ i101)) + i60) - 35309556;
            int i107 = ((i106 >>> 9) | (i106 << 23)) + i105;
            int i108 = ((i101 + ((i107 ^ i105) ^ i103)) + i8) - 1530992060;
            int i109 = ((i108 >>> 28) | (i108 << 4)) + i107;
            int i110 = i103 + ((i109 ^ i107) ^ i105) + i18 + 1272893353;
            int i111 = ((i110 >>> 21) | (i110 << 11)) + i109;
            int i112 = ((i105 + ((i111 ^ i109) ^ i107)) + i58) - 155497632;
            int i113 = ((i112 >>> 16) | (i112 << 16)) + i111;
            int i114 = ((i107 + ((i113 ^ i111) ^ i109)) + i44) - 1094730640;
            int i115 = ((i114 >>> 9) | (i114 << 23)) + i113;
            int i116 = i109 + ((i115 ^ i113) ^ i111) + i55 + 681279174;
            int i117 = ((i116 >>> 28) | (i116 << 4)) + i115;
            int i118 = ((i111 + ((i117 ^ i115) ^ i113)) + i5) - 358537222;
            int i119 = ((i118 >>> 21) | (i118 << 11)) + i117;
            int i120 = ((i113 + ((i119 ^ i117) ^ i115)) + i14) - 722521979;
            int i121 = ((i120 >>> 16) | (i120 << 16)) + i119;
            int i122 = i115 + ((i121 ^ i119) ^ i117) + i27 + 76029189;
            int i123 = ((i122 >>> 9) | (i122 << 23)) + i121;
            int i124 = ((i117 + ((i123 ^ i121) ^ i119)) + i40) - 640364487;
            int i125 = ((i124 >>> 28) | (i124 << 4)) + i123;
            int i126 = ((i119 + ((i125 ^ i123) ^ i121)) + i51) - 421815835;
            int i127 = ((i126 >>> 21) | (i126 << 11)) + i125;
            int i128 = i121 + ((i127 ^ i125) ^ i123) + i65 + 530742520;
            int i129 = ((i128 >>> 16) | (i128 << 16)) + i127;
            int i130 = ((i123 + ((i129 ^ i127) ^ i125)) + i63) - 995338651;
            int i131 = ((i130 >>> 9) | (i130 << 23)) + i129;
            int i132 = ((i125 + (((~i127) | i131) ^ i129)) + i5) - 198630844;
            int i133 = ((i132 >>> 26) | (i132 << 6)) + i131;
            int i134 = i127 + (((~i129) | i133) ^ i131) + i58 + 1126891415;
            int i135 = ((i134 >>> 22) | (i134 << 10)) + i133;
            int i136 = ((i129 + (((~i131) | i135) ^ i133)) + i60) - 1416354905;
            int i137 = ((i136 << 15) | (i136 >>> 17)) + i135;
            int i138 = ((i131 + (((~i133) | i137) ^ i135)) + i22) - 57434055;
            int i139 = ((i138 << 21) | (i138 >>> 11)) + i137;
            int i140 = i133 + (((~i135) | i139) ^ i137) + i51 + 1700485571;
            int i141 = ((i140 >>> 26) | (i140 << 6)) + i139;
            int i142 = ((i135 + (((~i137) | i141) ^ i139)) + i14) - 1894986606;
            int i143 = ((i142 >>> 22) | (i142 << 10)) + i141;
            int i144 = ((i137 + (((~i139) | i143) ^ i141)) + i44) - 1051523;
            int i145 = ((i144 << 15) | (i144 >>> 17)) + i143;
            int i146 = ((i139 + (((~i141) | i145) ^ i143)) + i8) - 2054922799;
            int i147 = ((i146 << 21) | (i146 >>> 11)) + i145;
            int i148 = i141 + (((~i143) | i147) ^ i145) + i37 + 1873313359;
            int i149 = ((i148 << 6) | (i148 >>> 26)) + i147;
            int i150 = ((i143 + (((~i145) | i149) ^ i147)) + i65) - 30611744;
            int i151 = ((i150 << 10) | (i150 >>> 22)) + i149;
            int i152 = ((i145 + (((~i147) | i151) ^ i149)) + i27) - 1560198380;
            int i153 = ((i152 >>> 17) | (i152 << 15)) + i151;
            int i154 = i147 + (((~i149) | i153) ^ i151) + i55 + 1309151649;
            int i155 = ((i154 << 21) | (i154 >>> 11)) + i153;
            int i156 = ((i149 + (((~i151) | i155) ^ i153)) + i18) - 145523070;
            int i157 = ((i156 >>> 26) | (i156 << 6)) + i155;
            int i158 = ((i151 + (((~i153) | i157) ^ i155)) + i48) - 1120210379;
            int i159 = ((i158 >>> 22) | (i158 << 10)) + i157;
            int i160 = i153 + (((~i155) | i159) ^ i157) + i63 + 718787259;
            int i161 = ((i160 >>> 17) | (i160 << 15)) + i159;
            int i162 = ((i155 + (((~i157) | i161) ^ i159)) + i40) - 343485551;
            this.Cardinal = i47 + i157;
            this.configure = i35 + ((i162 >>> 11) | (i162 << 21)) + i161;
            this.init = i30 + i161;
            this.getInstance = i25 + i159;
            this.cleanup = 0;
            int i163 = 0;
            while (true) {
                int[] iArr2 = this.cca_continue;
                if (i163 != iArr2.length) {
                    iArr2[i163] = 0;
                    i163++;
                } else {
                    return;
                }
            }
        }
    }

    public final class ECGOST3410 extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int[] cca_continue = new int[16];
        private int configure;
        private int getInstance;
        private int getWarnings;
        private int init;

        public ECGOST3410() {
            init();
        }

        private ECGOST3410(ECGOST3410 ecgost3410) {
            super(ecgost3410);
            configure(ecgost3410);
        }

        private static void configure(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
        }

        private void configure(ECGOST3410 ecgost3410) {
            super.init(ecgost3410);
            this.configure = ecgost3410.configure;
            this.getInstance = ecgost3410.getInstance;
            this.init = ecgost3410.init;
            this.Cardinal = ecgost3410.Cardinal;
            int[] iArr = ecgost3410.cca_continue;
            System.arraycopy(iArr, 0, this.cca_continue, 0, iArr.length);
            this.getWarnings = ecgost3410.getWarnings;
        }

        public final setBackgroundColor Cardinal() {
            return new ECGOST3410(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            configure((ECGOST3410) setbackgroundcolor);
        }

        public final String configure() {
            return "MD4";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.getWarnings > 14) {
                cleanup();
            }
            int[] iArr = this.cca_continue;
            iArr[14] = (int) j;
            iArr[15] = (int) (j >>> 32);
        }

        public final int getInstance() {
            return 16;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int[] iArr = this.cca_continue;
            int i2 = this.getWarnings;
            int i3 = i2 + 1;
            this.getWarnings = i3;
            iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            if (i3 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            configure(this.configure, bArr, i);
            configure(this.getInstance, bArr, i + 4);
            configure(this.init, bArr, i + 8);
            configure(this.Cardinal, bArr, i + 12);
            init();
            return 16;
        }

        public final void init() {
            super.init();
            this.configure = 1732584193;
            this.getInstance = -271733879;
            this.init = -1732584194;
            this.Cardinal = 271733878;
            this.getWarnings = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.cca_continue;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            int i = this.configure;
            int i2 = this.getInstance;
            int i3 = this.init;
            int i4 = this.Cardinal;
            int[] iArr = this.cca_continue;
            int i5 = iArr[0];
            int i6 = ((i2 & i3) | ((~i2) & i4)) + i + i5;
            int i7 = (i6 >>> 29) | (i6 << 3);
            int i8 = iArr[1];
            int i9 = ((i7 & i2) | ((~i7) & i3)) + i4 + i8;
            int i10 = (i9 >>> 25) | (i9 << 7);
            int i11 = iArr[2];
            int i12 = ((i10 & i7) | ((~i10) & i2)) + i3 + i11;
            int i13 = (i12 >>> 21) | (i12 << 11);
            int i14 = iArr[3];
            int i15 = ((i13 & i10) | ((~i13) & i7)) + i2 + i14;
            int i16 = (i15 >>> 13) | (i15 << 19);
            int i17 = i7 + (((~i16) & i10) | (i16 & i13));
            int i18 = iArr[4];
            int i19 = i17 + i18;
            int i20 = (i19 >>> 29) | (i19 << 3);
            int i21 = i4;
            int i22 = i10 + (((~i20) & i13) | (i20 & i16));
            int i23 = iArr[5];
            int i24 = i22 + i23;
            int i25 = (i24 >>> 25) | (i24 << 7);
            int i26 = i3;
            int i27 = i13 + (((~i25) & i16) | (i25 & i20));
            int i28 = iArr[6];
            int i29 = i27 + i28;
            int i30 = (i29 >>> 21) | (i29 << 11);
            int i31 = i2;
            int i32 = i16 + (((~i30) & i20) | (i30 & i25));
            int i33 = iArr[7];
            int i34 = i32 + i33;
            int i35 = (i34 >>> 13) | (i34 << 19);
            int i36 = i20 + (((~i35) & i25) | (i35 & i30));
            int i37 = iArr[8];
            int i38 = i36 + i37;
            int i39 = (i38 >>> 29) | (i38 << 3);
            int i40 = i;
            int i41 = i25 + (((~i39) & i30) | (i39 & i35));
            int i42 = iArr[9];
            int i43 = i41 + i42;
            int i44 = (i43 >>> 25) | (i43 << 7);
            int i45 = i33;
            int i46 = i30 + (((~i44) & i35) | (i44 & i39));
            int i47 = iArr[10];
            int i48 = i46 + i47;
            int i49 = (i48 >>> 21) | (i48 << 11);
            int i50 = i14;
            int i51 = i35 + (((~i49) & i39) | (i49 & i44));
            int i52 = iArr[11];
            int i53 = i51 + i52;
            int i54 = (i53 >>> 13) | (i53 << 19);
            int i55 = i52;
            int i56 = i39 + (((~i54) & i44) | (i54 & i49));
            int i57 = iArr[12];
            int i58 = i56 + i57;
            int i59 = (i58 >>> 29) | (i58 << 3);
            int i60 = i47;
            int i61 = i44 + (((~i59) & i49) | (i59 & i54));
            int i62 = iArr[13];
            int i63 = i61 + i62;
            int i64 = (i63 >>> 25) | (i63 << 7);
            int i65 = i28;
            int i66 = i49 + (((~i64) & i54) | (i64 & i59));
            int i67 = iArr[14];
            int i68 = i66 + i67;
            int i69 = (i68 >>> 21) | (i68 << 11);
            int i70 = i69 & i64;
            int i71 = i67;
            int i72 = i54 + (((~i69) & i59) | i70);
            int i73 = iArr[15];
            int i74 = i72 + i73;
            int i75 = (i74 << 19) | (i74 >>> 13);
            int i76 = i75 & i69;
            int i77 = i59 + (i76 | (i75 & i64) | i70) + i5 + 1518500249;
            int i78 = (i77 << 3) | (i77 >>> 29);
            int i79 = i78 & i75;
            int i80 = i64 + (i79 | (i78 & i69) | i76) + i18 + 1518500249;
            int i81 = (i80 >>> 27) | (i80 << 5);
            int i82 = i81 & i78;
            int i83 = i69 + (i82 | (i81 & i75) | i79) + i37 + 1518500249;
            int i84 = (i83 << 9) | (i83 >>> 23);
            int i85 = i84 & i81;
            int i86 = i75 + (i85 | (i84 & i78) | i82) + i57 + 1518500249;
            int i87 = (i86 >>> 19) | (i86 << 13);
            int i88 = i87 & i84;
            int i89 = i78 + (i88 | (i87 & i81) | i85) + i8 + 1518500249;
            int i90 = (i89 << 3) | (i89 >>> 29);
            int i91 = i90 & i87;
            int i92 = i81 + (i91 | (i90 & i84) | i88) + i23 + 1518500249;
            int i93 = (i92 >>> 27) | (i92 << 5);
            int i94 = i93 & i90;
            int i95 = i84 + (i94 | (i93 & i87) | i91) + i42 + 1518500249;
            int i96 = (i95 << 9) | (i95 >>> 23);
            int i97 = i96 & i93;
            int i98 = i87 + (i97 | (i96 & i90) | i94) + i62 + 1518500249;
            int i99 = (i98 >>> 19) | (i98 << 13);
            int i100 = i99 & i96;
            int i101 = i90 + (i100 | (i99 & i93) | i97) + i11 + 1518500249;
            int i102 = (i101 << 3) | (i101 >>> 29);
            int i103 = i102 & i99;
            int i104 = i93 + (i103 | (i102 & i96) | i100) + i65 + 1518500249;
            int i105 = (i104 >>> 27) | (i104 << 5);
            int i106 = i105 & i102;
            int i107 = i96 + (i106 | (i105 & i99) | i103) + i60 + 1518500249;
            int i108 = (i107 << 9) | (i107 >>> 23);
            int i109 = i108 & i105;
            int i110 = i99 + (i109 | (i108 & i102) | i106) + i71 + 1518500249;
            int i111 = (i110 >>> 19) | (i110 << 13);
            int i112 = i111 & i108;
            int i113 = i102 + (i112 | (i111 & i105) | i109) + i50 + 1518500249;
            int i114 = (i113 << 3) | (i113 >>> 29);
            int i115 = i114 & i111;
            int i116 = i105 + (i115 | (i114 & i108) | i112) + i45 + 1518500249;
            int i117 = (i116 >>> 27) | (i116 << 5);
            int i118 = i117 & i114;
            int i119 = i108 + (i118 | (i117 & i111) | i115) + i55 + 1518500249;
            int i120 = (i119 << 9) | (i119 >>> 23);
            int i121 = i111 + ((i120 & i117) | (i120 & i114) | i118) + i73 + 1518500249;
            int i122 = (i121 >>> 19) | (i121 << 13);
            int i123 = i114 + ((i122 ^ i120) ^ i117) + i5 + 1859775393;
            int i124 = (i123 >>> 29) | (i123 << 3);
            int i125 = i117 + ((i124 ^ i122) ^ i120) + i37 + 1859775393;
            int i126 = (i125 << 9) | (i125 >>> 23);
            int i127 = i120 + ((i126 ^ i124) ^ i122) + i18 + 1859775393;
            int i128 = (i127 << 11) | (i127 >>> 21);
            int i129 = i122 + ((i128 ^ i126) ^ i124) + i57 + 1859775393;
            int i130 = (i129 >>> 17) | (i129 << 15);
            int i131 = i124 + ((i130 ^ i128) ^ i126) + i11 + 1859775393;
            int i132 = (i131 >>> 29) | (i131 << 3);
            int i133 = i126 + ((i132 ^ i130) ^ i128) + i60 + 1859775393;
            int i134 = (i133 >>> 23) | (i133 << 9);
            int i135 = i128 + ((i134 ^ i132) ^ i130) + i65 + 1859775393;
            int i136 = (i135 >>> 21) | (i135 << 11);
            int i137 = i130 + ((i136 ^ i134) ^ i132) + i71 + 1859775393;
            int i138 = (i137 >>> 17) | (i137 << 15);
            int i139 = i132 + ((i138 ^ i136) ^ i134) + i8 + 1859775393;
            int i140 = (i139 >>> 29) | (i139 << 3);
            int i141 = i134 + ((i140 ^ i138) ^ i136) + i42 + 1859775393;
            int i142 = (i141 >>> 23) | (i141 << 9);
            int i143 = i136 + ((i142 ^ i140) ^ i138) + i23 + 1859775393;
            int i144 = (i143 << 11) | (i143 >>> 21);
            int i145 = i138 + ((i144 ^ i142) ^ i140) + i62 + 1859775393;
            int i146 = (i145 << 15) | (i145 >>> 17);
            int i147 = i140 + ((i146 ^ i144) ^ i142) + i50 + 1859775393;
            int i148 = (i147 << 3) | (i147 >>> 29);
            int i149 = i142 + ((i148 ^ i146) ^ i144) + i55 + 1859775393;
            int i150 = (i149 >>> 23) | (i149 << 9);
            int i151 = i144 + ((i150 ^ i148) ^ i146) + i45 + 1859775393;
            int i152 = (i151 >>> 21) | (i151 << 11);
            int i153 = i146 + ((i152 ^ i150) ^ i148) + i73 + 1859775393;
            int i154 = i40 + i148;
            this.configure = i154;
            this.getInstance = i31 + ((i153 >>> 17) | (i153 << 15));
            this.init = i26 + i152;
            this.Cardinal = i21 + i150;
            this.getWarnings = 0;
            int i155 = 0;
            while (true) {
                int[] iArr2 = this.cca_continue;
                if (i155 != iArr2.length) {
                    iArr2[i155] = 0;
                    i155++;
                } else {
                    return;
                }
            }
        }
    }

    public final class ECGOST3410_2012 extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int cca_continue;
        private int cleanup;
        private int configure;
        private int getInstance;
        private int init;
        private int[] onCReqSuccess = new int[16];

        public ECGOST3410_2012() {
            init();
        }

        private ECGOST3410_2012(ECGOST3410_2012 ecgost3410_2012) {
            super(ecgost3410_2012);
            Cardinal(ecgost3410_2012);
        }

        private static int Cardinal(int i, int i2, int i3) {
            return ((~i) & i3) | (i2 & i);
        }

        private void Cardinal(ECGOST3410_2012 ecgost3410_2012) {
            super.init(ecgost3410_2012);
            this.init = ecgost3410_2012.init;
            this.Cardinal = ecgost3410_2012.Cardinal;
            this.cca_continue = ecgost3410_2012.cca_continue;
            this.configure = ecgost3410_2012.configure;
            this.getInstance = ecgost3410_2012.getInstance;
            int[] iArr = ecgost3410_2012.onCReqSuccess;
            System.arraycopy(iArr, 0, this.onCReqSuccess, 0, iArr.length);
            this.cleanup = ecgost3410_2012.cleanup;
        }

        private static int cca_continue(int i, int i2, int i3) {
            return i ^ (i2 | (~i3));
        }

        private static int configure(int i, int i2) {
            return (i >>> (32 - i2)) | (i << i2);
        }

        private static int configure(int i, int i2, int i3) {
            return (i & i3) | (i2 & (~i3));
        }

        private static int getInstance(int i, int i2, int i3) {
            return (i ^ i2) ^ i3;
        }

        private static int init(int i, int i2, int i3) {
            return (i | (~i2)) ^ i3;
        }

        private static void init(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
        }

        public final setBackgroundColor Cardinal() {
            return new ECGOST3410_2012(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            Cardinal((ECGOST3410_2012) setbackgroundcolor);
        }

        public final String configure() {
            return "RIPEMD160";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.cleanup > 14) {
                cleanup();
            }
            int[] iArr = this.onCReqSuccess;
            iArr[14] = (int) j;
            iArr[15] = (int) (j >>> 32);
        }

        public final int getInstance() {
            return 20;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int[] iArr = this.onCReqSuccess;
            int i2 = this.cleanup;
            int i3 = i2 + 1;
            this.cleanup = i3;
            iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            if (i3 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            init(this.init, bArr, i);
            init(this.Cardinal, bArr, i + 4);
            init(this.cca_continue, bArr, i + 8);
            init(this.configure, bArr, i + 12);
            init(this.getInstance, bArr, i + 16);
            init();
            return 20;
        }

        public final void init() {
            super.init();
            this.init = 1732584193;
            this.Cardinal = -271733879;
            this.cca_continue = -1732584194;
            this.configure = 271733878;
            this.getInstance = -1009589776;
            this.cleanup = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.onCReqSuccess;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            int i = this.init;
            int i2 = this.Cardinal;
            int i3 = this.cca_continue;
            int i4 = this.configure;
            int i5 = this.getInstance;
            int[] iArr = this.onCReqSuccess;
            int i6 = iArr[0];
            int i7 = ((i2 ^ i3) ^ i4) + i + i6;
            int i8 = ((i7 >>> 21) | (i7 << 11)) + i5;
            int i9 = (i3 << 10) | (i3 >>> 22);
            int i10 = iArr[1];
            int i11 = ((i8 ^ i2) ^ i9) + i5 + i10;
            int i12 = ((i11 >>> 18) | (i11 << 14)) + i4;
            int i13 = (i2 << 10) | (i2 >>> 22);
            int i14 = iArr[2];
            int i15 = ((i12 ^ i8) ^ i13) + i4 + i14;
            int i16 = ((i15 << 15) | (i15 >>> 17)) + i9;
            int i17 = (i8 << 10) | (i8 >>> 22);
            int i18 = i9 + ((i16 ^ i12) ^ i17) + iArr[3];
            int i19 = ((i18 << 12) | (i18 >>> 20)) + i13;
            int i20 = (i12 << 10) | (i12 >>> 22);
            int i21 = iArr[4];
            int i22 = i13 + ((i19 ^ i16) ^ i20) + i21;
            int i23 = ((i22 << 5) | (i22 >>> 27)) + i17;
            int i24 = (i16 << 10) | (i16 >>> 22);
            int i25 = iArr[5];
            int i26 = i17 + ((i23 ^ i19) ^ i24) + i25;
            int i27 = ((i26 << 8) | (i26 >>> 24)) + i20;
            int i28 = (i19 << 10) | (i19 >>> 22);
            int i29 = iArr[6];
            int i30 = i20 + ((i27 ^ i23) ^ i28) + i29;
            int i31 = ((i30 << 7) | (i30 >>> 25)) + i24;
            int i32 = (i23 << 10) | (i23 >>> 22);
            int i33 = iArr[7];
            int i34 = i24 + ((i31 ^ i27) ^ i32) + i33;
            int i35 = ((i34 << 9) | (i34 >>> 23)) + i28;
            int i36 = (i27 << 10) | (i27 >>> 22);
            int i37 = iArr[8];
            int i38 = i28 + ((i35 ^ i31) ^ i36) + i37;
            int i39 = ((i38 << 11) | (i38 >>> 21)) + i32;
            int i40 = (i31 << 10) | (i31 >>> 22);
            int i41 = iArr[9];
            int i42 = i32 + ((i39 ^ i35) ^ i40) + i41;
            int i43 = ((i42 << 13) | (i42 >>> 19)) + i36;
            int i44 = (i35 << 10) | (i35 >>> 22);
            int i45 = iArr[10];
            int i46 = i36 + ((i43 ^ i39) ^ i44) + i45;
            int i47 = ((i46 << 14) | (i46 >>> 18)) + i40;
            int i48 = (i39 << 10) | (i39 >>> 22);
            int i49 = iArr[11];
            int i50 = i40 + ((i47 ^ i43) ^ i48) + i49;
            int i51 = ((i50 << 15) | (i50 >>> 17)) + i44;
            int i52 = (i43 << 10) | (i43 >>> 22);
            int i53 = i44 + ((i51 ^ i47) ^ i52) + iArr[12];
            int i54 = ((i53 << 6) | (i53 >>> 26)) + i48;
            int i55 = (i47 << 10) | (i47 >>> 22);
            int i56 = iArr[13];
            int i57 = i48 + ((i54 ^ i51) ^ i55) + i56;
            int i58 = ((i57 << 7) | (i57 >>> 25)) + i52;
            int i59 = (i51 << 10) | (i51 >>> 22);
            int i60 = iArr[14];
            int i61 = i52 + ((i58 ^ i54) ^ i59) + i60;
            int i62 = ((i61 << 9) | (i61 >>> 23)) + i55;
            int i63 = (i54 << 10) | (i54 >>> 22);
            int i64 = iArr[15];
            int i65 = i55 + ((i62 ^ i58) ^ i63) + i64;
            int i66 = ((i65 << 8) | (i65 >>> 24)) + i59;
            int i67 = (i58 << 10) | (i58 >>> 22);
            int i68 = i63;
            int i69 = i + ((i3 | (~i4)) ^ i2) + i25 + 1352829926;
            int i70 = ((i69 >>> 24) | (i69 << 8)) + i5;
            int i71 = i5 + ((i2 | (~i9)) ^ i70) + i60 + 1352829926;
            int i72 = ((i71 << 9) | (i71 >>> 23)) + i4;
            int i73 = i4 + (((~i13) | i70) ^ i72) + i33 + 1352829926;
            int i74 = ((i73 >>> 23) | (i73 << 9)) + i9;
            int i75 = (i70 >>> 22) | (i70 << 10);
            int i76 = i9 + (((~i75) | i72) ^ i74) + i6 + 1352829926;
            int i77 = ((i76 << 11) | (i76 >>> 21)) + i13;
            int i78 = (i72 >>> 22) | (i72 << 10);
            int i79 = i13 + (((~i78) | i74) ^ i77) + i41 + 1352829926;
            int i80 = ((i79 << 13) | (i79 >>> 19)) + i75;
            int i81 = (i74 >>> 22) | (i74 << 10);
            int i82 = i75 + (((~i81) | i77) ^ i80) + i14 + 1352829926;
            int i83 = ((i82 >>> 17) | (i82 << 15)) + i78;
            int i84 = (i77 >>> 22) | (i77 << 10);
            int i85 = i78 + (((~i84) | i80) ^ i83) + i49 + 1352829926;
            int i86 = ((i85 >>> 17) | (i85 << 15)) + i81;
            int i87 = (i80 >>> 22) | (i80 << 10);
            int i88 = i81 + (((~i87) | i83) ^ i86) + i21 + 1352829926;
            int i89 = ((i88 >>> 27) | (i88 << 5)) + i84;
            int i90 = (i83 >>> 22) | (i83 << 10);
            int i91 = i84 + (((~i90) | i86) ^ i89) + i56 + 1352829926;
            int i92 = ((i91 >>> 25) | (i91 << 7)) + i87;
            int i93 = (i86 >>> 22) | (i86 << 10);
            int i94 = i87 + (((~i93) | i89) ^ i92) + i29 + 1352829926;
            int i95 = ((i94 >>> 25) | (i94 << 7)) + i90;
            int i96 = (i89 >>> 22) | (i89 << 10);
            int i97 = i90 + (((~i96) | i92) ^ i95) + i64 + 1352829926;
            int i98 = ((i97 >>> 24) | (i97 << 8)) + i93;
            int i99 = (i92 >>> 22) | (i92 << 10);
            int i100 = i93 + (((~i99) | i95) ^ i98) + i37 + 1352829926;
            int i101 = ((i100 >>> 21) | (i100 << 11)) + i96;
            int i102 = (i95 << 10) | (i95 >>> 22);
            int i103 = i96 + (((~i102) | i98) ^ i101) + i10 + 1352829926;
            int i104 = ((i103 >>> 18) | (i103 << 14)) + i99;
            int i105 = (i98 >>> 22) | (i98 << 10);
            int i106 = i99 + (((~i105) | i101) ^ i104) + i45 + 1352829926;
            int i107 = ((i106 >>> 18) | (i106 << 14)) + i102;
            int configure2 = configure(i101, 10);
            int configure3 = configure(i102 + cca_continue(i107, i104, configure2) + this.onCReqSuccess[3] + 1352829926, 12) + i105;
            int configure4 = configure(i104, 10);
            int configure5 = configure(i105 + cca_continue(configure3, i107, configure4) + this.onCReqSuccess[12] + 1352829926, 6) + configure2;
            int configure6 = configure(i107, 10);
            int configure7 = configure(i59 + Cardinal(i66, i62, i67) + this.onCReqSuccess[7] + 1518500249, 7) + i68;
            int configure8 = configure(i62, 10);
            int configure9 = configure(i68 + Cardinal(configure7, i66, configure8) + this.onCReqSuccess[4] + 1518500249, 6) + i67;
            int configure10 = configure(i66, 10);
            int configure11 = configure(i67 + Cardinal(configure9, configure7, configure10) + this.onCReqSuccess[13] + 1518500249, 8) + configure8;
            int configure12 = configure(configure7, 10);
            int configure13 = configure(configure8 + Cardinal(configure11, configure9, configure12) + this.onCReqSuccess[1] + 1518500249, 13) + configure10;
            int configure14 = configure(configure9, 10);
            int configure15 = configure(configure10 + Cardinal(configure13, configure11, configure14) + this.onCReqSuccess[10] + 1518500249, 11) + configure12;
            int configure16 = configure(configure11, 10);
            int configure17 = configure(configure12 + Cardinal(configure15, configure13, configure16) + this.onCReqSuccess[6] + 1518500249, 9) + configure14;
            int configure18 = configure(configure13, 10);
            int configure19 = configure(configure14 + Cardinal(configure17, configure15, configure18) + this.onCReqSuccess[15] + 1518500249, 7) + configure16;
            int configure20 = configure(configure15, 10);
            int configure21 = configure(configure16 + Cardinal(configure19, configure17, configure20) + this.onCReqSuccess[3] + 1518500249, 15) + configure18;
            int configure22 = configure(configure17, 10);
            int configure23 = configure(configure18 + Cardinal(configure21, configure19, configure22) + this.onCReqSuccess[12] + 1518500249, 7) + configure20;
            int configure24 = configure(configure19, 10);
            int configure25 = configure(configure20 + Cardinal(configure23, configure21, configure24) + this.onCReqSuccess[0] + 1518500249, 12) + configure22;
            int configure26 = configure(configure21, 10);
            int configure27 = configure(configure22 + Cardinal(configure25, configure23, configure26) + this.onCReqSuccess[9] + 1518500249, 15) + configure24;
            int configure28 = configure(configure23, 10);
            int configure29 = configure(configure24 + Cardinal(configure27, configure25, configure28) + this.onCReqSuccess[5] + 1518500249, 9) + configure26;
            int configure30 = configure(configure25, 10);
            int configure31 = configure(configure26 + Cardinal(configure29, configure27, configure30) + this.onCReqSuccess[2] + 1518500249, 11) + configure28;
            int configure32 = configure(configure27, 10);
            int configure33 = configure(configure28 + Cardinal(configure31, configure29, configure32) + this.onCReqSuccess[14] + 1518500249, 7) + configure30;
            int configure34 = configure(configure29, 10);
            int configure35 = configure(configure30 + Cardinal(configure33, configure31, configure34) + this.onCReqSuccess[11] + 1518500249, 13) + configure32;
            int configure36 = configure(configure31, 10);
            int configure37 = configure(configure32 + Cardinal(configure35, configure33, configure36) + this.onCReqSuccess[8] + 1518500249, 12) + configure34;
            int configure38 = configure(configure33, 10);
            int configure39 = configure(configure2 + configure(configure5, configure3, configure6) + this.onCReqSuccess[6] + 1548603684, 9) + configure4;
            int configure40 = configure(configure3, 10);
            int configure41 = configure(configure4 + configure(configure39, configure5, configure40) + this.onCReqSuccess[11] + 1548603684, 13) + configure6;
            int configure42 = configure(configure5, 10);
            int configure43 = configure(configure6 + configure(configure41, configure39, configure42) + this.onCReqSuccess[3] + 1548603684, 15) + configure40;
            int configure44 = configure(configure39, 10);
            int configure45 = configure(configure40 + configure(configure43, configure41, configure44) + this.onCReqSuccess[7] + 1548603684, 7) + configure42;
            int configure46 = configure(configure41, 10);
            int configure47 = configure(configure42 + configure(configure45, configure43, configure46) + this.onCReqSuccess[0] + 1548603684, 12) + configure44;
            int configure48 = configure(configure43, 10);
            int configure49 = configure(configure44 + configure(configure47, configure45, configure48) + this.onCReqSuccess[13] + 1548603684, 8) + configure46;
            int configure50 = configure(configure45, 10);
            int configure51 = configure(configure46 + configure(configure49, configure47, configure50) + this.onCReqSuccess[5] + 1548603684, 9) + configure48;
            int configure52 = configure(configure47, 10);
            int configure53 = configure(configure48 + configure(configure51, configure49, configure52) + this.onCReqSuccess[10] + 1548603684, 11) + configure50;
            int configure54 = configure(configure49, 10);
            int configure55 = configure(configure50 + configure(configure53, configure51, configure54) + this.onCReqSuccess[14] + 1548603684, 7) + configure52;
            int configure56 = configure(configure51, 10);
            int configure57 = configure(configure52 + configure(configure55, configure53, configure56) + this.onCReqSuccess[15] + 1548603684, 7) + configure54;
            int configure58 = configure(configure53, 10);
            int configure59 = configure(configure54 + configure(configure57, configure55, configure58) + this.onCReqSuccess[8] + 1548603684, 12) + configure56;
            int configure60 = configure(configure55, 10);
            int configure61 = configure(configure56 + configure(configure59, configure57, configure60) + this.onCReqSuccess[12] + 1548603684, 7) + configure58;
            int configure62 = configure(configure57, 10);
            int configure63 = configure(configure58 + configure(configure61, configure59, configure62) + this.onCReqSuccess[4] + 1548603684, 6) + configure60;
            int configure64 = configure(configure59, 10);
            int configure65 = configure(configure60 + configure(configure63, configure61, configure64) + this.onCReqSuccess[9] + 1548603684, 15) + configure62;
            int configure66 = configure(configure61, 10);
            int configure67 = configure(configure62 + configure(configure65, configure63, configure66) + this.onCReqSuccess[1] + 1548603684, 13) + configure64;
            int configure68 = configure(configure63, 10);
            int configure69 = configure(configure64 + configure(configure67, configure65, configure68) + this.onCReqSuccess[2] + 1548603684, 11) + configure66;
            int configure70 = configure(configure65, 10);
            int configure71 = configure(configure34 + init(configure37, configure35, configure38) + this.onCReqSuccess[3] + 1859775393, 11) + configure36;
            int configure72 = configure(configure35, 10);
            int configure73 = configure(configure36 + init(configure71, configure37, configure72) + this.onCReqSuccess[10] + 1859775393, 13) + configure38;
            int configure74 = configure(configure37, 10);
            int configure75 = configure(configure38 + init(configure73, configure71, configure74) + this.onCReqSuccess[14] + 1859775393, 6) + configure72;
            int configure76 = configure(configure71, 10);
            int configure77 = configure(configure72 + init(configure75, configure73, configure76) + this.onCReqSuccess[4] + 1859775393, 7) + configure74;
            int configure78 = configure(configure73, 10);
            int configure79 = configure(configure74 + init(configure77, configure75, configure78) + this.onCReqSuccess[9] + 1859775393, 14) + configure76;
            int configure80 = configure(configure75, 10);
            int configure81 = configure(configure76 + init(configure79, configure77, configure80) + this.onCReqSuccess[15] + 1859775393, 9) + configure78;
            int configure82 = configure(configure77, 10);
            int configure83 = configure(configure78 + init(configure81, configure79, configure82) + this.onCReqSuccess[8] + 1859775393, 13) + configure80;
            int configure84 = configure(configure79, 10);
            int configure85 = configure(configure80 + init(configure83, configure81, configure84) + this.onCReqSuccess[1] + 1859775393, 15) + configure82;
            int configure86 = configure(configure81, 10);
            int configure87 = configure(configure82 + init(configure85, configure83, configure86) + this.onCReqSuccess[2] + 1859775393, 14) + configure84;
            int configure88 = configure(configure83, 10);
            int configure89 = configure(configure84 + init(configure87, configure85, configure88) + this.onCReqSuccess[7] + 1859775393, 8) + configure86;
            int configure90 = configure(configure85, 10);
            int configure91 = configure(configure86 + init(configure89, configure87, configure90) + this.onCReqSuccess[0] + 1859775393, 13) + configure88;
            int configure92 = configure(configure87, 10);
            int configure93 = configure(configure88 + init(configure91, configure89, configure92) + this.onCReqSuccess[6] + 1859775393, 6) + configure90;
            int configure94 = configure(configure89, 10);
            int configure95 = configure(configure90 + init(configure93, configure91, configure94) + this.onCReqSuccess[13] + 1859775393, 5) + configure92;
            int configure96 = configure(configure91, 10);
            int configure97 = configure(configure92 + init(configure95, configure93, configure96) + this.onCReqSuccess[11] + 1859775393, 12) + configure94;
            int configure98 = configure(configure93, 10);
            int configure99 = configure(configure94 + init(configure97, configure95, configure98) + this.onCReqSuccess[5] + 1859775393, 7) + configure96;
            int configure100 = configure(configure95, 10);
            int configure101 = configure(configure96 + init(configure99, configure97, configure100) + this.onCReqSuccess[12] + 1859775393, 5) + configure98;
            int configure102 = configure(configure97, 10);
            int configure103 = configure(configure66 + init(configure69, configure67, configure70) + this.onCReqSuccess[15] + 1836072691, 9) + configure68;
            int configure104 = configure(configure67, 10);
            int configure105 = configure(configure68 + init(configure103, configure69, configure104) + this.onCReqSuccess[5] + 1836072691, 7) + configure70;
            int configure106 = configure(configure69, 10);
            int configure107 = configure(configure70 + init(configure105, configure103, configure106) + this.onCReqSuccess[1] + 1836072691, 15) + configure104;
            int configure108 = configure(configure103, 10);
            int configure109 = configure(configure104 + init(configure107, configure105, configure108) + this.onCReqSuccess[3] + 1836072691, 11) + configure106;
            int configure110 = configure(configure105, 10);
            int configure111 = configure(configure106 + init(configure109, configure107, configure110) + this.onCReqSuccess[7] + 1836072691, 8) + configure108;
            int configure112 = configure(configure107, 10);
            int configure113 = configure(configure108 + init(configure111, configure109, configure112) + this.onCReqSuccess[14] + 1836072691, 6) + configure110;
            int configure114 = configure(configure109, 10);
            int configure115 = configure(configure110 + init(configure113, configure111, configure114) + this.onCReqSuccess[6] + 1836072691, 6) + configure112;
            int configure116 = configure(configure111, 10);
            int configure117 = configure(configure112 + init(configure115, configure113, configure116) + this.onCReqSuccess[9] + 1836072691, 14) + configure114;
            int configure118 = configure(configure113, 10);
            int configure119 = configure(configure114 + init(configure117, configure115, configure118) + this.onCReqSuccess[11] + 1836072691, 12) + configure116;
            int configure120 = configure(configure115, 10);
            int configure121 = configure(configure116 + init(configure119, configure117, configure120) + this.onCReqSuccess[8] + 1836072691, 13) + configure118;
            int configure122 = configure(configure117, 10);
            int configure123 = configure(configure118 + init(configure121, configure119, configure122) + this.onCReqSuccess[12] + 1836072691, 5) + configure120;
            int configure124 = configure(configure119, 10);
            int configure125 = configure(configure120 + init(configure123, configure121, configure124) + this.onCReqSuccess[2] + 1836072691, 14) + configure122;
            int configure126 = configure(configure121, 10);
            int configure127 = configure(configure122 + init(configure125, configure123, configure126) + this.onCReqSuccess[10] + 1836072691, 13) + configure124;
            int configure128 = configure(configure123, 10);
            int configure129 = configure(configure124 + init(configure127, configure125, configure128) + this.onCReqSuccess[0] + 1836072691, 13) + configure126;
            int configure130 = configure(configure125, 10);
            int configure131 = configure(configure126 + init(configure129, configure127, configure130) + this.onCReqSuccess[4] + 1836072691, 7) + configure128;
            int configure132 = configure(configure127, 10);
            int configure133 = configure(configure128 + init(configure131, configure129, configure132) + this.onCReqSuccess[13] + 1836072691, 5) + configure130;
            int configure134 = configure(configure129, 10);
            int configure135 = configure(((configure98 + configure(configure101, configure99, configure102)) + this.onCReqSuccess[1]) - 1894007588, 11) + configure100;
            int configure136 = configure(configure99, 10);
            int configure137 = configure(((configure100 + configure(configure135, configure101, configure136)) + this.onCReqSuccess[9]) - 1894007588, 12) + configure102;
            int configure138 = configure(configure101, 10);
            int configure139 = configure(((configure102 + configure(configure137, configure135, configure138)) + this.onCReqSuccess[11]) - 1894007588, 14) + configure136;
            int configure140 = configure(configure135, 10);
            int configure141 = configure(((configure136 + configure(configure139, configure137, configure140)) + this.onCReqSuccess[10]) - 1894007588, 15) + configure138;
            int configure142 = configure(configure137, 10);
            int configure143 = configure(((configure138 + configure(configure141, configure139, configure142)) + this.onCReqSuccess[0]) - 1894007588, 14) + configure140;
            int configure144 = configure(configure139, 10);
            int configure145 = configure(((configure140 + configure(configure143, configure141, configure144)) + this.onCReqSuccess[8]) - 1894007588, 15) + configure142;
            int configure146 = configure(configure141, 10);
            int configure147 = configure(((configure142 + configure(configure145, configure143, configure146)) + this.onCReqSuccess[12]) - 1894007588, 9) + configure144;
            int configure148 = configure(configure143, 10);
            int configure149 = configure(((configure144 + configure(configure147, configure145, configure148)) + this.onCReqSuccess[4]) - 1894007588, 8) + configure146;
            int configure150 = configure(configure145, 10);
            int configure151 = configure(((configure146 + configure(configure149, configure147, configure150)) + this.onCReqSuccess[13]) - 1894007588, 9) + configure148;
            int configure152 = configure(configure147, 10);
            int configure153 = configure(((configure148 + configure(configure151, configure149, configure152)) + this.onCReqSuccess[3]) - 1894007588, 14) + configure150;
            int configure154 = configure(configure149, 10);
            int configure155 = configure(((configure150 + configure(configure153, configure151, configure154)) + this.onCReqSuccess[7]) - 1894007588, 5) + configure152;
            int configure156 = configure(configure151, 10);
            int configure157 = configure(((configure152 + configure(configure155, configure153, configure156)) + this.onCReqSuccess[15]) - 1894007588, 6) + configure154;
            int configure158 = configure(configure153, 10);
            int configure159 = configure(((configure154 + configure(configure157, configure155, configure158)) + this.onCReqSuccess[14]) - 1894007588, 8) + configure156;
            int configure160 = configure(configure155, 10);
            int configure161 = configure(((configure156 + configure(configure159, configure157, configure160)) + this.onCReqSuccess[5]) - 1894007588, 6) + configure158;
            int configure162 = configure(configure157, 10);
            int configure163 = configure(((configure158 + configure(configure161, configure159, configure162)) + this.onCReqSuccess[6]) - 1894007588, 5) + configure160;
            int configure164 = configure(configure159, 10);
            int configure165 = configure(((configure160 + configure(configure163, configure161, configure164)) + this.onCReqSuccess[2]) - 1894007588, 12) + configure162;
            int configure166 = configure(configure161, 10);
            int configure167 = configure(configure130 + Cardinal(configure133, configure131, configure134) + this.onCReqSuccess[8] + 2053994217, 15) + configure132;
            int configure168 = configure(configure131, 10);
            int configure169 = configure(configure132 + Cardinal(configure167, configure133, configure168) + this.onCReqSuccess[6] + 2053994217, 5) + configure134;
            int configure170 = configure(configure133, 10);
            int configure171 = configure(configure134 + Cardinal(configure169, configure167, configure170) + this.onCReqSuccess[4] + 2053994217, 8) + configure168;
            int configure172 = configure(configure167, 10);
            int configure173 = configure(configure168 + Cardinal(configure171, configure169, configure172) + this.onCReqSuccess[1] + 2053994217, 11) + configure170;
            int configure174 = configure(configure169, 10);
            int configure175 = configure(configure170 + Cardinal(configure173, configure171, configure174) + this.onCReqSuccess[3] + 2053994217, 14) + configure172;
            int configure176 = configure(configure171, 10);
            int configure177 = configure(configure172 + Cardinal(configure175, configure173, configure176) + this.onCReqSuccess[11] + 2053994217, 14) + configure174;
            int configure178 = configure(configure173, 10);
            int configure179 = configure(configure174 + Cardinal(configure177, configure175, configure178) + this.onCReqSuccess[15] + 2053994217, 6) + configure176;
            int configure180 = configure(configure175, 10);
            int configure181 = configure(configure176 + Cardinal(configure179, configure177, configure180) + this.onCReqSuccess[0] + 2053994217, 14) + configure178;
            int configure182 = configure(configure177, 10);
            int configure183 = configure(configure178 + Cardinal(configure181, configure179, configure182) + this.onCReqSuccess[5] + 2053994217, 6) + configure180;
            int configure184 = configure(configure179, 10);
            int configure185 = configure(configure180 + Cardinal(configure183, configure181, configure184) + this.onCReqSuccess[12] + 2053994217, 9) + configure182;
            int configure186 = configure(configure181, 10);
            int configure187 = configure(configure182 + Cardinal(configure185, configure183, configure186) + this.onCReqSuccess[2] + 2053994217, 12) + configure184;
            int configure188 = configure(configure183, 10);
            int configure189 = configure(configure184 + Cardinal(configure187, configure185, configure188) + this.onCReqSuccess[13] + 2053994217, 9) + configure186;
            int configure190 = configure(configure185, 10);
            int configure191 = configure(configure186 + Cardinal(configure189, configure187, configure190) + this.onCReqSuccess[9] + 2053994217, 12) + configure188;
            int configure192 = configure(configure187, 10);
            int configure193 = configure(configure188 + Cardinal(configure191, configure189, configure192) + this.onCReqSuccess[7] + 2053994217, 5) + configure190;
            int configure194 = configure(configure189, 10);
            int configure195 = configure(configure190 + Cardinal(configure193, configure191, configure194) + this.onCReqSuccess[10] + 2053994217, 15) + configure192;
            int configure196 = configure(configure191, 10);
            int configure197 = configure(configure192 + Cardinal(configure195, configure193, configure196) + this.onCReqSuccess[14] + 2053994217, 8) + configure194;
            int configure198 = configure(configure193, 10);
            int configure199 = configure(((configure162 + cca_continue(configure165, configure163, configure166)) + this.onCReqSuccess[4]) - 1454113458, 9) + configure164;
            int configure200 = configure(configure163, 10);
            int configure201 = configure(((configure164 + cca_continue(configure199, configure165, configure200)) + this.onCReqSuccess[0]) - 1454113458, 15) + configure166;
            int configure202 = configure(configure165, 10);
            int configure203 = configure(((configure166 + cca_continue(configure201, configure199, configure202)) + this.onCReqSuccess[5]) - 1454113458, 5) + configure200;
            int configure204 = configure(configure199, 10);
            int configure205 = configure(((configure200 + cca_continue(configure203, configure201, configure204)) + this.onCReqSuccess[9]) - 1454113458, 11) + configure202;
            int configure206 = configure(configure201, 10);
            int configure207 = configure(((configure202 + cca_continue(configure205, configure203, configure206)) + this.onCReqSuccess[7]) - 1454113458, 6) + configure204;
            int configure208 = configure(configure203, 10);
            int configure209 = configure(((configure204 + cca_continue(configure207, configure205, configure208)) + this.onCReqSuccess[12]) - 1454113458, 8) + configure206;
            int configure210 = configure(configure205, 10);
            int configure211 = configure(((configure206 + cca_continue(configure209, configure207, configure210)) + this.onCReqSuccess[2]) - 1454113458, 13) + configure208;
            int configure212 = configure(configure207, 10);
            int configure213 = configure(((configure208 + cca_continue(configure211, configure209, configure212)) + this.onCReqSuccess[10]) - 1454113458, 12) + configure210;
            int configure214 = configure(configure209, 10);
            int configure215 = configure(((configure210 + cca_continue(configure213, configure211, configure214)) + this.onCReqSuccess[14]) - 1454113458, 5) + configure212;
            int configure216 = configure(configure211, 10);
            int configure217 = configure(((configure212 + cca_continue(configure215, configure213, configure216)) + this.onCReqSuccess[1]) - 1454113458, 12) + configure214;
            int configure218 = configure(configure213, 10);
            int configure219 = configure(((configure214 + cca_continue(configure217, configure215, configure218)) + this.onCReqSuccess[3]) - 1454113458, 13) + configure216;
            int configure220 = configure(configure215, 10);
            int configure221 = configure(((configure216 + cca_continue(configure219, configure217, configure220)) + this.onCReqSuccess[8]) - 1454113458, 14) + configure218;
            int configure222 = configure(configure217, 10);
            int configure223 = configure(((configure218 + cca_continue(configure221, configure219, configure222)) + this.onCReqSuccess[11]) - 1454113458, 11) + configure220;
            int configure224 = configure(configure219, 10);
            int configure225 = configure(((configure220 + cca_continue(configure223, configure221, configure224)) + this.onCReqSuccess[6]) - 1454113458, 8) + configure222;
            int configure226 = configure(configure221, 10);
            int configure227 = configure(((configure222 + cca_continue(configure225, configure223, configure226)) + this.onCReqSuccess[15]) - 1454113458, 5) + configure224;
            int configure228 = configure(configure223, 10);
            int configure229 = configure(configure225, 10);
            int configure230 = configure(configure194 + ((configure197 ^ configure195) ^ configure198) + this.onCReqSuccess[12], 8) + configure196;
            int configure231 = configure(configure195, 10);
            int configure232 = configure(configure196 + getInstance(configure230, configure197, configure231) + this.onCReqSuccess[15], 5) + configure198;
            int configure233 = configure(configure197, 10);
            int configure234 = configure(configure198 + getInstance(configure232, configure230, configure233) + this.onCReqSuccess[10], 12) + configure231;
            int configure235 = configure(configure230, 10);
            int configure236 = configure(configure231 + getInstance(configure234, configure232, configure235) + this.onCReqSuccess[4], 9) + configure233;
            int configure237 = configure(configure232, 10);
            int configure238 = configure(configure233 + getInstance(configure236, configure234, configure237) + this.onCReqSuccess[1], 12) + configure235;
            int configure239 = configure(configure234, 10);
            int configure240 = configure(configure235 + getInstance(configure238, configure236, configure239) + this.onCReqSuccess[5], 5) + configure237;
            int configure241 = configure(configure236, 10);
            int configure242 = configure(configure237 + getInstance(configure240, configure238, configure241) + this.onCReqSuccess[8], 14) + configure239;
            int configure243 = configure(configure238, 10);
            int configure244 = configure(configure239 + getInstance(configure242, configure240, configure243) + this.onCReqSuccess[7], 6) + configure241;
            int configure245 = configure(configure240, 10);
            int configure246 = configure(configure241 + getInstance(configure244, configure242, configure245) + this.onCReqSuccess[6], 8) + configure243;
            int configure247 = configure(configure242, 10);
            int configure248 = configure(configure243 + getInstance(configure246, configure244, configure247) + this.onCReqSuccess[2], 13) + configure245;
            int configure249 = configure(configure244, 10);
            int configure250 = configure(configure245 + getInstance(configure248, configure246, configure249) + this.onCReqSuccess[13], 6) + configure247;
            int configure251 = configure(configure246, 10);
            int configure252 = configure(configure247 + getInstance(configure250, configure248, configure251) + this.onCReqSuccess[14], 5) + configure249;
            int configure253 = configure(configure248, 10);
            int configure254 = configure(configure249 + getInstance(configure252, configure250, configure253) + this.onCReqSuccess[0], 15) + configure251;
            int configure255 = configure(configure250, 10);
            int configure256 = configure(configure251 + getInstance(configure254, configure252, configure255) + this.onCReqSuccess[3], 13) + configure253;
            int configure257 = configure(configure252, 10);
            int configure258 = configure(configure253 + getInstance(configure256, configure254, configure257) + this.onCReqSuccess[9], 11) + configure255;
            int configure259 = configure(configure254, 10);
            int configure260 = configure(configure255 + getInstance(configure258, configure256, configure259) + this.onCReqSuccess[11], 11) + configure257;
            this.Cardinal = this.cca_continue + configure229 + configure259;
            this.cca_continue = this.configure + configure228 + configure257;
            this.configure = this.getInstance + configure226 + configure260;
            this.getInstance = this.init + configure(((configure224 + cca_continue(configure227, configure225, configure228)) + this.onCReqSuccess[13]) - 1454113458, 6) + configure226 + configure258;
            this.init = configure(configure256, 10) + configure227 + this.Cardinal;
            this.cleanup = 0;
            int i108 = 0;
            while (true) {
                int[] iArr2 = this.onCReqSuccess;
                if (i108 != iArr2.length) {
                    iArr2[i108] = 0;
                    i108++;
                } else {
                    return;
                }
            }
        }
    }

    public final class ECMQV extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int cca_continue;
        private int configure;
        private int getInstance;
        private int init;
        private int onCReqSuccess;
        private int[] onValidated = new int[80];

        public ECMQV() {
            init();
        }

        private ECMQV(ECMQV ecmqv) {
            super(ecmqv);
            configure(ecmqv);
        }

        private void configure(ECMQV ecmqv) {
            this.getInstance = ecmqv.getInstance;
            this.configure = ecmqv.configure;
            this.init = ecmqv.init;
            this.Cardinal = ecmqv.Cardinal;
            this.cca_continue = ecmqv.cca_continue;
            int[] iArr = ecmqv.onValidated;
            System.arraycopy(iArr, 0, this.onValidated, 0, iArr.length);
            this.onCReqSuccess = ecmqv.onCReqSuccess;
        }

        public final setBackgroundColor Cardinal() {
            return new ECMQV(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            ECMQV ecmqv = (ECMQV) setbackgroundcolor;
            super.init(ecmqv);
            configure(ecmqv);
        }

        public final String configure() {
            return "SHA-1";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.onCReqSuccess > 14) {
                cleanup();
            }
            int[] iArr = this.onValidated;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        public final int getInstance() {
            return 20;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i2] & 255) << Ascii.DLE) | ((bArr[i3] & 255) << 8);
            int[] iArr = this.onValidated;
            int i5 = this.onCReqSuccess;
            iArr[i5] = i4;
            int i6 = i5 + 1;
            this.onCReqSuccess = i6;
            if (i6 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            setTextFontSize.init(this.getInstance, bArr, i);
            setTextFontSize.init(this.configure, bArr, i + 4);
            setTextFontSize.init(this.init, bArr, i + 8);
            setTextFontSize.init(this.Cardinal, bArr, i + 12);
            setTextFontSize.init(this.cca_continue, bArr, i + 16);
            init();
            return 20;
        }

        public final void init() {
            super.init();
            this.getInstance = 1732584193;
            this.configure = -271733879;
            this.init = -1732584194;
            this.Cardinal = 271733878;
            this.cca_continue = -1009589776;
            this.onCReqSuccess = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.onValidated;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.onValidated;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 >>> 31) | (i2 << 1);
            }
            int i3 = this.getInstance;
            int i4 = this.configure;
            int i5 = this.init;
            int i6 = this.Cardinal;
            int i7 = this.cca_continue;
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = ((i3 << 5) | (i3 >>> 27)) + ((i4 & i5) | ((~i4) & i6));
                int[] iArr2 = this.onValidated;
                int i11 = i9 + 1;
                int i12 = i7 + i10 + iArr2[i9] + 1518500249;
                int i13 = (i4 >>> 2) | (i4 << 30);
                int i14 = i11 + 1;
                int i15 = i6 + ((i12 << 5) | (i12 >>> 27)) + ((i3 & i13) | ((~i3) & i5)) + iArr2[i11] + 1518500249;
                int i16 = (i3 >>> 2) | (i3 << 30);
                int i17 = i14 + 1;
                int i18 = i5 + ((i15 << 5) | (i15 >>> 27)) + ((i12 & i16) | ((~i12) & i13)) + iArr2[i14] + 1518500249;
                i7 = (i12 >>> 2) | (i12 << 30);
                int i19 = i17 + 1;
                i4 = i13 + ((i18 << 5) | (i18 >>> 27)) + ((i15 & i7) | ((~i15) & i16)) + iArr2[i17] + 1518500249;
                i6 = (i15 >>> 2) | (i15 << 30);
                i3 = i16 + ((i4 << 5) | (i4 >>> 27)) + ((i18 & i6) | ((~i18) & i7)) + iArr2[i19] + 1518500249;
                i5 = (i18 >>> 2) | (i18 << 30);
                i8++;
                i9 = i19 + 1;
            }
            int i20 = 0;
            while (i20 < 4) {
                int[] iArr3 = this.onValidated;
                int i21 = i9 + 1;
                int i22 = i7 + ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6) + iArr3[i9] + 1859775393;
                int i23 = (i4 >>> 2) | (i4 << 30);
                int i24 = i21 + 1;
                int i25 = i6 + ((i22 << 5) | (i22 >>> 27)) + ((i3 ^ i23) ^ i5) + iArr3[i21] + 1859775393;
                int i26 = (i3 >>> 2) | (i3 << 30);
                int i27 = i24 + 1;
                int i28 = i5 + ((i25 << 5) | (i25 >>> 27)) + ((i22 ^ i26) ^ i23) + iArr3[i24] + 1859775393;
                i7 = (i22 >>> 2) | (i22 << 30);
                int i29 = i27 + 1;
                i4 = i23 + ((i28 << 5) | (i28 >>> 27)) + ((i25 ^ i7) ^ i26) + iArr3[i27] + 1859775393;
                i6 = (i25 >>> 2) | (i25 << 30);
                i3 = i26 + ((i4 << 5) | (i4 >>> 27)) + ((i28 ^ i6) ^ i7) + iArr3[i29] + 1859775393;
                i5 = (i28 >>> 2) | (i28 << 30);
                i20++;
                i9 = i29 + 1;
            }
            int i30 = 0;
            while (i30 < 4) {
                int[] iArr4 = this.onValidated;
                int i31 = i9 + 1;
                int i32 = i7 + (((((i3 << 5) | (i3 >>> 27)) + (((i4 & i5) | (i4 & i6)) | (i5 & i6))) + iArr4[i9]) - 1894007588);
                int i33 = (i4 >>> 2) | (i4 << 30);
                int i34 = i31 + 1;
                int i35 = i6 + (((((i32 << 5) | (i32 >>> 27)) + (((i3 & i33) | (i3 & i5)) | (i33 & i5))) + iArr4[i31]) - 1894007588);
                int i36 = (i3 >>> 2) | (i3 << 30);
                int i37 = i34 + 1;
                int i38 = i5 + (((((i35 << 5) | (i35 >>> 27)) + (((i32 & i36) | (i32 & i33)) | (i36 & i33))) + iArr4[i34]) - 1894007588);
                i7 = (i32 >>> 2) | (i32 << 30);
                int i39 = i37 + 1;
                i4 = i33 + (((((i38 << 5) | (i38 >>> 27)) + (((i35 & i7) | (i35 & i36)) | (i7 & i36))) + iArr4[i37]) - 1894007588);
                i6 = (i35 >>> 2) | (i35 << 30);
                i3 = i36 + (((((i4 << 5) | (i4 >>> 27)) + (((i38 & i6) | (i38 & i7)) | (i6 & i7))) + iArr4[i39]) - 1894007588);
                i5 = (i38 >>> 2) | (i38 << 30);
                i30++;
                i9 = i39 + 1;
            }
            int i40 = 0;
            while (i40 <= 3) {
                int[] iArr5 = this.onValidated;
                int i41 = i9 + 1;
                int i42 = i7 + (((((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6)) + iArr5[i9]) - 899497514);
                int i43 = (i4 >>> 2) | (i4 << 30);
                int i44 = i41 + 1;
                int i45 = i6 + (((((i42 << 5) | (i42 >>> 27)) + ((i3 ^ i43) ^ i5)) + iArr5[i41]) - 899497514);
                int i46 = (i3 >>> 2) | (i3 << 30);
                int i47 = i44 + 1;
                int i48 = i5 + (((((i45 << 5) | (i45 >>> 27)) + ((i42 ^ i46) ^ i43)) + iArr5[i44]) - 899497514);
                i7 = (i42 >>> 2) | (i42 << 30);
                int i49 = i47 + 1;
                i4 = i43 + (((((i48 << 5) | (i48 >>> 27)) + ((i45 ^ i7) ^ i46)) + iArr5[i47]) - 899497514);
                i6 = (i45 >>> 2) | (i45 << 30);
                i3 = i46 + (((((i4 << 5) | (i4 >>> 27)) + ((i48 ^ i6) ^ i7)) + iArr5[i49]) - 899497514);
                i5 = (i48 >>> 2) | (i48 << 30);
                i40++;
                i9 = i49 + 1;
            }
            this.getInstance += i3;
            this.configure += i4;
            this.init += i5;
            this.Cardinal += i6;
            this.cca_continue += i7;
            this.onCReqSuccess = 0;
            for (int i50 = 0; i50 < 16; i50++) {
                this.onValidated[i50] = 0;
            }
        }
    }

    public final class ED25519 {
        public int Cardinal;
        public byte[] cca_continue;
        private int configure;

        public ED25519(byte[] bArr, int i) {
            this(bArr, i, -1);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ED25519)) {
                return false;
            }
            ED25519 ed25519 = (ED25519) obj;
            if (ed25519.Cardinal != this.Cardinal) {
                return false;
            }
            return getBackgroundColor.Cardinal(this.cca_continue, ed25519.cca_continue);
        }

        public final int hashCode() {
            return this.Cardinal ^ getBackgroundColor.init(this.cca_continue);
        }

        public ED25519(byte[] bArr, int i, int i2) {
            byte[] bArr2;
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.cca_continue = bArr2;
            this.Cardinal = i;
            this.configure = i2;
        }
    }

    public final class ED448 implements GMCipherSpi.SM2withRMD {
        public KeyPairGeneratorSpi.XDH Cardinal;
        public KeyPairGeneratorSpi.XDH init;

        public ED448(KeyPairGeneratorSpi.XDH xdh, KeyPairGeneratorSpi.XDH xdh2) {
            if (xdh == null) {
                throw new NullPointerException("staticPublicKey cannot be null");
            } else if (xdh2 == null) {
                throw new NullPointerException("ephemeralPublicKey cannot be null");
            } else if (xdh.Cardinal.equals(xdh2.Cardinal)) {
                this.init = xdh;
                this.Cardinal = xdh2;
            } else {
                throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
            }
        }
    }

    public class EDDSA implements writeJSONString {
        public BigInteger Cardinal;
        public toJSONString cca_continue;
        private BigInteger cleanup;
        public byte[] configure;
        public BigInteger getInstance;
        public JSONNavi init;

        public EDDSA(toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2) {
            this(tojsonstring, jSONNavi, bigInteger, bigInteger2, (byte[]) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EDDSA) {
                EDDSA eddsa = (EDDSA) obj;
                return this.cca_continue.configure(eddsa.cca_continue) && this.init.init(eddsa.init) && this.getInstance.equals(eddsa.getInstance) && this.Cardinal.equals(eddsa.Cardinal);
            }
        }

        public int hashCode() {
            return (((((this.cca_continue.hashCode() * 37) ^ this.init.hashCode()) * 37) ^ this.getInstance.hashCode()) * 37) ^ this.Cardinal.hashCode();
        }

        public final synchronized BigInteger init() {
            if (this.cleanup == null) {
                this.cleanup = this.Cardinal.modInverse(this.getInstance);
            }
            return this.cleanup;
        }

        public EDDSA(toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
            byte[] bArr2 = null;
            this.cleanup = null;
            if (tojsonstring == null) {
                throw new NullPointerException("curve");
            } else if (bigInteger != null) {
                this.cca_continue = tojsonstring;
                this.init = getInstance(tojsonstring, jSONNavi);
                this.getInstance = bigInteger;
                this.Cardinal = bigInteger2;
                if (bArr != null) {
                    bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                this.configure = bArr2;
            } else {
                throw new NullPointerException("n");
            }
        }

        static JSONNavi getInstance(toJSONString tojsonstring, JSONNavi jSONNavi) {
            if (jSONNavi == null) {
                throw new IllegalArgumentException("Point has null value");
            } else if (tojsonstring.configure(jSONNavi.configure())) {
                JSONNavi CardinalRenderType = tojsonstring.cca_continue(jSONNavi).CardinalRenderType();
                if (CardinalRenderType.getString()) {
                    throw new IllegalArgumentException("Point at infinity");
                } else if (CardinalRenderType.init(false, true)) {
                    return CardinalRenderType;
                } else {
                    throw new IllegalArgumentException("Point not on curve");
                }
            } else {
                throw new IllegalArgumentException("Point must be on the same curve");
            }
        }
    }

    public final class X25519 implements GMCipherSpi.SM2withRMD {
        public KeyPairGeneratorSpi.EdDSA Cardinal;
        private KeyPairGeneratorSpi.XDH cca_continue;
        public KeyPairGeneratorSpi.EdDSA configure;

        public X25519(KeyPairGeneratorSpi.EdDSA edDSA, KeyPairGeneratorSpi.EdDSA edDSA2, KeyPairGeneratorSpi.XDH xdh) {
            if (edDSA == null) {
                throw new NullPointerException("staticPrivateKey cannot be null");
            } else if (edDSA2 != null) {
                EDDSA eddsa = edDSA.Cardinal;
                if (eddsa.equals(edDSA2.Cardinal)) {
                    if (xdh == null) {
                        xdh = new KeyPairGeneratorSpi.XDH(eddsa.init.Cardinal(edDSA2.init), eddsa);
                    } else if (!eddsa.equals(xdh.Cardinal)) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    }
                    this.configure = edDSA;
                    this.Cardinal = edDSA2;
                    this.cca_continue = xdh;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
            } else {
                throw new NullPointerException("ephemeralPrivateKey cannot be null");
            }
        }
    }

    public final class X448 extends XDH {
        public final ASN1ObjectIdentifier cleanup;
        public final ASN1ObjectIdentifier getWarnings;
        public final ASN1ObjectIdentifier onValidated;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X448(com.cardinalcommerce.a.KeyFactorySpi.EDDSA r9, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r10, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r11, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r12) {
            /*
                r8 = this;
                com.cardinalcommerce.a.toJSONString r2 = r9.cca_continue
                com.cardinalcommerce.a.JSONNavi r3 = r9.init
                java.math.BigInteger r4 = r9.getInstance
                java.math.BigInteger r5 = r9.Cardinal
                byte[] r0 = r9.configure
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r6 = r0
                goto L_0x0018
            L_0x000f:
                int r1 = r0.length
                byte[] r1 = new byte[r1]
                int r6 = r0.length
                r7 = 0
                java.lang.System.arraycopy(r0, r7, r1, r7, r6)
                r6 = r1
            L_0x0018:
                r0 = r8
                r1 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.cardinalcommerce.a.KeyFactorySpi$XDH r9 = (com.cardinalcommerce.a.KeyFactorySpi.XDH) r9
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r9 = r9.onCReqSuccess
                boolean r9 = r10.equals(r9)
                if (r9 == 0) goto L_0x002e
                r8.onValidated = r10
                r8.cleanup = r11
                r8.getWarnings = r12
                return
            L_0x002e:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r10 = "named parameters do not match publicKeyParamSet value"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyFactorySpi.X448.<init>(com.cardinalcommerce.a.KeyFactorySpi$EDDSA, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier, com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier):void");
        }
    }

    public class XDH extends EDDSA {
        public ASN1ObjectIdentifier onCReqSuccess;

        public XDH(ASN1ObjectIdentifier aSN1ObjectIdentifier, toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
            super(tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
            this.onCReqSuccess = aSN1ObjectIdentifier;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public XDH(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r8, com.cardinalcommerce.a.KeyFactorySpi.EDDSA r9) {
            /*
                r7 = this;
                com.cardinalcommerce.a.toJSONString r1 = r9.cca_continue
                com.cardinalcommerce.a.JSONNavi r2 = r9.init
                java.math.BigInteger r3 = r9.getInstance
                java.math.BigInteger r4 = r9.Cardinal
                byte[] r9 = r9.configure
                if (r9 != 0) goto L_0x000f
                r9 = 0
                r5 = r9
                goto L_0x0018
            L_0x000f:
                int r0 = r9.length
                byte[] r0 = new byte[r0]
                int r5 = r9.length
                r6 = 0
                java.lang.System.arraycopy(r9, r6, r0, r6, r5)
                r5 = r0
            L_0x0018:
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r7.onCReqSuccess = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyFactorySpi.XDH.<init>(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier, com.cardinalcommerce.a.KeyFactorySpi$EDDSA):void");
        }
    }

    public final String cca_continue(KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = mQVwithSHA384KDF.cca_continue.length;
        KeyAgreementSpi.MQVwithSHA1CKDF[] mQVwithSHA1CKDFArr = new KeyAgreementSpi.MQVwithSHA1CKDF[length];
        System.arraycopy(mQVwithSHA384KDF.cca_continue, 0, mQVwithSHA1CKDFArr, 0, length);
        boolean z = true;
        for (int i = length - 1; i >= 0; i--) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            KeyAgreementSpi.MQVwithSHA384CKDF.configure(stringBuffer, mQVwithSHA1CKDFArr[i], this.getCavv);
        }
        return stringBuffer.toString();
    }
}
