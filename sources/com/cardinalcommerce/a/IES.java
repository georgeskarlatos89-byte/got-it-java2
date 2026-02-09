package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public interface IES {
    public static final ASN1ObjectIdentifier Cardinal;
    public static final ASN1ObjectIdentifier CardinalActionCode;
    public static final ASN1ObjectIdentifier CardinalChallengeObserver;
    public static final ASN1ObjectIdentifier CardinalEnvironment;
    public static final ASN1ObjectIdentifier CardinalError;
    public static final ASN1ObjectIdentifier CardinalRenderType;
    public static final ASN1ObjectIdentifier CardinalUiType;
    public static final ASN1ObjectIdentifier cca_continue;
    public static final ASN1ObjectIdentifier cleanup;
    public static final ASN1ObjectIdentifier configure;
    public static final ASN1ObjectIdentifier getActionCode;
    public static final ASN1ObjectIdentifier getInstance;
    public static final ASN1ObjectIdentifier getSDKVersion;
    public static final ASN1ObjectIdentifier getString;
    public static final ASN1ObjectIdentifier getWarnings;
    public static final ASN1ObjectIdentifier init;
    public static final ASN1ObjectIdentifier onCReqSuccess;
    public static final ASN1ObjectIdentifier onValidated;
    public static final ASN1ObjectIdentifier valueOf;
    public static final ASN1ObjectIdentifier values;

    public final class Mappings {
        private static Hashtable cca_continue = new Hashtable();
        private static Hashtable getInstance = new Hashtable();
        private static Hashtable init = new Hashtable();

        public static KeyFactorySpi.EDDSA configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (KeyFactorySpi.EDDSA) getInstance.get(aSN1ObjectIdentifier);
        }

        public static KeyFactorySpi.EDDSA getInstance(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) init.get(str);
            if (aSN1ObjectIdentifier != null) {
                return (KeyFactorySpi.EDDSA) getInstance.get(aSN1ObjectIdentifier);
            }
            return null;
        }

        public static Enumeration getInstance() {
            return cca_continue.elements();
        }

        public static ASN1ObjectIdentifier init(String str) {
            return (ASN1ObjectIdentifier) init.get(str);
        }

        public static String init(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (String) cca_continue.get(aSN1ObjectIdentifier);
        }

        static {
            BigInteger bigInteger = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
            BigInteger bigInteger2 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
            toJSONString.getInstance getinstance = new toJSONString.getInstance(bigInteger, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger2, writeJSONString.CardinalRenderType);
            getInstance.put(IES.CardinalRenderType, new KeyFactorySpi.EDDSA(getinstance, getinstance.configure(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"), false), bigInteger2, writeJSONString.CardinalRenderType));
            BigInteger bigInteger3 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
            BigInteger bigInteger4 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
            toJSONString.getInstance getinstance2 = new toJSONString.getInstance(bigInteger3, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger4, writeJSONString.CardinalRenderType);
            getInstance.put(IES.CardinalActionCode, new KeyFactorySpi.EDDSA(getinstance2, getinstance2.configure(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"), false), bigInteger4, writeJSONString.CardinalRenderType));
            BigInteger bigInteger5 = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
            BigInteger bigInteger6 = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
            toJSONString.getInstance getinstance3 = new toJSONString.getInstance(bigInteger5, new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"), bigInteger6, writeJSONString.CardinalRenderType);
            getInstance.put(IES.CardinalError, new KeyFactorySpi.EDDSA(getinstance3, getinstance3.configure(new BigInteger("1"), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124"), false), bigInteger6, writeJSONString.CardinalRenderType));
            BigInteger bigInteger7 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
            BigInteger bigInteger8 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
            toJSONString.getInstance getinstance4 = new toJSONString.getInstance(bigInteger7, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger8, writeJSONString.CardinalRenderType);
            getInstance.put(IES.getActionCode, new KeyFactorySpi.EDDSA(getinstance4, getinstance4.configure(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"), false), bigInteger8, writeJSONString.CardinalRenderType));
            BigInteger bigInteger9 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
            BigInteger bigInteger10 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
            toJSONString.getInstance getinstance5 = new toJSONString.getInstance(bigInteger9, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger10, writeJSONString.CardinalRenderType);
            getInstance.put(IES.CardinalUiType, new KeyFactorySpi.EDDSA(getinstance5, getinstance5.configure(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"), false), bigInteger10, writeJSONString.CardinalRenderType));
            BigInteger bigInteger11 = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", 16);
            BigInteger bigInteger12 = new BigInteger("400000000000000000000000000000000FD8CDDFC87B6635C115AF556C360C67", 16);
            toJSONString.getInstance getinstance6 = new toJSONString.getInstance(bigInteger11, new BigInteger("C2173F1513981673AF4892C23035A27CE25E2013BF95AA33B22C656F277E7335", 16), new BigInteger("295F9BAE7428ED9CCC20E7C359A9D41A22FCCD9108E17BF7BA9337A6F8AE9513", 16), bigInteger12, writeJSONString.CardinalError);
            getInstance.put(KeyAgreementSpi.DHwithSHA224CKDF.values, new KeyFactorySpi.EDDSA(getinstance6, getinstance6.configure(new BigInteger("91E38443A5E82C0D880923425712B2BB658B9196932E02C78B2582FE742DAA28", 16), new BigInteger("32879423AB1A0375895786C4BB46E9565FDE0B5344766740AF268ADB32322E5C", 16), false), bigInteger12, writeJSONString.CardinalError));
            BigInteger bigInteger13 = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7", 16);
            BigInteger bigInteger14 = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF27E69532F48D89116FF22B8D4E0560609B4B38ABFAD2B85DCACDB1411F10B275", 16);
            toJSONString.getInstance getinstance7 = new toJSONString.getInstance(bigInteger13, new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC4", 16), new BigInteger("E8C2505DEDFC86DDC1BD0B2B6667F1DA34B82574761CB0E879BD081CFD0B6265EE3CB090F30D27614CB4574010DA90DD862EF9D4EBEE4761503190785A71C760", 16), bigInteger14, writeJSONString.CardinalRenderType);
            getInstance.put(KeyAgreementSpi.DHwithSHA224CKDF.valueOf, new KeyFactorySpi.EDDSA(getinstance7, getinstance7.configure(new BigInteger("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003"), new BigInteger("7503CFE87A836AE3A61B8816E25450E6CE5E1C93ACF1ABC1778064FDCBEFA921DF1626BE4FD036E93D75E6A50E3A41E98028FE5FC235F5B889A589CB5215F2A4", 16), false), bigInteger14, writeJSONString.CardinalRenderType));
            BigInteger bigInteger15 = new BigInteger("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006F", 16);
            BigInteger bigInteger16 = new BigInteger("800000000000000000000000000000000000000000000000000000000000000149A1EC142565A545ACFDB77BD9D40CFA8B996712101BEA0EC6346C54374F25BD", 16);
            toJSONString.getInstance getinstance8 = new toJSONString.getInstance(bigInteger15, new BigInteger("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006C", 16), new BigInteger("687D1B459DC841457E3E06CF6F5E2517B97C7D614AF138BCBF85DC806C4B289F3E965D2DB1416D217F8B276FAD1AB69C50F78BEE1FA3106EFB8CCBC7C5140116", 16), bigInteger16, writeJSONString.CardinalRenderType);
            getInstance.put(KeyAgreementSpi.DHwithSHA224CKDF.CardinalEnvironment, new KeyFactorySpi.EDDSA(getinstance8, getinstance8.configure(new BigInteger("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002"), new BigInteger("1A8F7EDA389B094C2C071E3647A8940F3C123B697578C213BE6DD9E6C8EC7335DCB228FD1EDF4A39152CBCAAF8C0398828041055F94CEEEC7E21340780FE41BD", 16), false), bigInteger16, writeJSONString.CardinalRenderType));
            BigInteger bigInteger17 = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7", 16);
            BigInteger bigInteger18 = new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC98CDBA46506AB004C33A9FF5147502CC8EDA9E7A769A12694623CEF47F023ED", 16);
            toJSONString.getInstance getinstance9 = new toJSONString.getInstance(bigInteger17, new BigInteger("DC9203E514A721875485A529D2C722FB187BC8980EB866644DE41C68E143064546E861C0E2C9EDD92ADE71F46FCF50FF2AD97F951FDA9F2A2EB6546F39689BD3", 16), new BigInteger("B4C4EE28CEBC6C2C8AC12952CF37F16AC7EFB6A9F69F4B57FFDA2E4F0DE5ADE038CBC2FFF719D2C18DE0284B8BFEF3B52B8CC7A5F5BF0A3C8D2319A5312557E1", 16), bigInteger18, writeJSONString.CardinalError);
            getInstance.put(KeyAgreementSpi.DHwithSHA224CKDF.CardinalError, new KeyFactorySpi.EDDSA(getinstance9, getinstance9.configure(new BigInteger("E2E31EDFC23DE7BDEBE241CE593EF5DE2295B7A9CBAEF021D385F7074CEA043AA27272A7AE602BF2A7B9033DB9ED3610C6FB85487EAE97AAC5BC7928C1950148", 16), new BigInteger("F5CE40D95B5EB899ABBCCFF5911CB8577939804D6527378B8C108C3D2090FF9BE18E2D33E3021ED2EF32D85822423B6304F726AA854BAE07D0396E9A9ADDC40F", 16), false), bigInteger18, writeJSONString.CardinalError));
            init.put("GostR3410-2001-CryptoPro-A", IES.CardinalRenderType);
            init.put("GostR3410-2001-CryptoPro-B", IES.CardinalError);
            init.put("GostR3410-2001-CryptoPro-C", IES.CardinalUiType);
            init.put("GostR3410-2001-CryptoPro-XchA", IES.CardinalActionCode);
            init.put("GostR3410-2001-CryptoPro-XchB", IES.getActionCode);
            init.put("Tc26-Gost-3410-12-256-paramSetA", KeyAgreementSpi.DHwithSHA224CKDF.values);
            init.put("Tc26-Gost-3410-12-512-paramSetA", KeyAgreementSpi.DHwithSHA224CKDF.valueOf);
            init.put("Tc26-Gost-3410-12-512-paramSetB", KeyAgreementSpi.DHwithSHA224CKDF.CardinalEnvironment);
            init.put("Tc26-Gost-3410-12-512-paramSetC", KeyAgreementSpi.DHwithSHA224CKDF.CardinalError);
            cca_continue.put(IES.CardinalRenderType, "GostR3410-2001-CryptoPro-A");
            cca_continue.put(IES.CardinalError, "GostR3410-2001-CryptoPro-B");
            cca_continue.put(IES.CardinalUiType, "GostR3410-2001-CryptoPro-C");
            cca_continue.put(IES.CardinalActionCode, "GostR3410-2001-CryptoPro-XchA");
            cca_continue.put(IES.getActionCode, "GostR3410-2001-CryptoPro-XchB");
            cca_continue.put(KeyAgreementSpi.DHwithSHA224CKDF.values, "Tc26-Gost-3410-12-256-paramSetA");
            cca_continue.put(KeyAgreementSpi.DHwithSHA224CKDF.valueOf, "Tc26-Gost-3410-12-512-paramSetA");
            cca_continue.put(KeyAgreementSpi.DHwithSHA224CKDF.CardinalEnvironment, "Tc26-Gost-3410-12-512-paramSetB");
            cca_continue.put(KeyAgreementSpi.DHwithSHA224CKDF.CardinalError, "Tc26-Gost-3410-12-512-paramSetC");
        }
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.643.2.2");
        configure = aSN1ObjectIdentifier;
        init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "9");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "10");
        cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "13.0");
        getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "13.1");
        Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "21");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31.0");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31.4");
        getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "20");
        onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "19");
        cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
        onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
        getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "30.1");
        values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "32.2");
        valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "32.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "32.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "32.5");
        CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "33.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "33.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "33.3");
        CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "35.1");
        CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "35.2");
        CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "35.3");
        CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "36.0");
        getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "36.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "36.0");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "36.1");
        CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "96");
        getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "98");
    }
}
