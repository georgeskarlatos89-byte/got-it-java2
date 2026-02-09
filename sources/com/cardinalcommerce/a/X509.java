package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public final class X509 {
    private static Hashtable Cardinal = new Hashtable();
    private static BCECPublicKey cca_continue = new BCECPublicKey() {
        public final GMCipherSpi getInstance() {
            BigInteger init = X509.init("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger init2 = X509.init("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger init3 = X509.init("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger init4 = X509.init("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            toJSONString instance = X509.getInstance(new toJSONString.getInstance(init, init2, init3, init4, valueOf));
            return new GMCipherSpi(instance, new ECUtils(instance, getHeadingTextFontName.init("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), init4, valueOf, (byte[]) null);
        }
    };
    private static BCECPublicKey configure = new BCECPublicKey() {
        public final GMCipherSpi getInstance() {
            BigInteger init = X509.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger init2 = X509.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger init3 = X509.init("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger init4 = X509.init("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            toJSONString instance = X509.getInstance(new toJSONString.getInstance(init, init2, init3, init4, valueOf));
            return new GMCipherSpi(instance, new ECUtils(instance, getHeadingTextFontName.init("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), init4, valueOf, (byte[]) null);
        }
    };
    private static Hashtable getInstance = new Hashtable();
    private static Hashtable init = new Hashtable();

    public static Enumeration Cardinal() {
        return init.elements();
    }

    public static GMCipherSpi configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        BCECPublicKey bCECPublicKey = (BCECPublicKey) Cardinal.get(aSN1ObjectIdentifier);
        if (bCECPublicKey == null) {
            return null;
        }
        return bCECPublicKey.Cardinal();
    }

    public static ASN1ObjectIdentifier configure(String str) {
        return (ASN1ObjectIdentifier) getInstance.get(getTextFontSize.Cardinal(str));
    }

    static /* synthetic */ toJSONString getInstance(toJSONString tojsonstring) {
        return tojsonstring;
    }

    public static String init(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) init.get(aSN1ObjectIdentifier);
    }

    public interface Mappings {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier init;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.101");
            getInstance = aSN1ObjectIdentifier;
            Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "110").getInstance();
            configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "111").getInstance();
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "112").getInstance();
            init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "113").getInstance();
        }
    }

    public static GMCipherSpi cca_continue(String str) {
        BCECPublicKey bCECPublicKey;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) getInstance.get(getTextFontSize.Cardinal(str));
        if (aSN1ObjectIdentifier == null || (bCECPublicKey = (BCECPublicKey) Cardinal.get(aSN1ObjectIdentifier)) == null) {
            return null;
        }
        return bCECPublicKey.Cardinal();
    }

    static /* synthetic */ BigInteger init(String str) {
        return new BigInteger(1, getHeadingTextFontName.init(str));
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = AlgorithmParametersSpi.cca_continue;
        BCECPublicKey bCECPublicKey = cca_continue;
        getInstance.put(getTextFontSize.Cardinal("wapip192v1"), aSN1ObjectIdentifier);
        init.put(aSN1ObjectIdentifier, "wapip192v1");
        Cardinal.put(aSN1ObjectIdentifier, bCECPublicKey);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = AlgorithmParametersSpi.getInstance;
        BCECPublicKey bCECPublicKey2 = configure;
        getInstance.put(getTextFontSize.Cardinal("sm2p256v1"), aSN1ObjectIdentifier2);
        init.put(aSN1ObjectIdentifier2, "sm2p256v1");
        Cardinal.put(aSN1ObjectIdentifier2, bCECPublicKey2);
    }
}
