package com.cardinalcommerce.dependencies.internal.bouncycastle.asn1;

import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getRenderType;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.setEnableLogging;
import com.cardinalcommerce.a.setUICustomization;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ASN1ObjectIdentifier extends getThreeDSRequestorAppURL {
    private static final ConcurrentMap<getInstance, ASN1ObjectIdentifier> configure = new ConcurrentHashMap();
    private byte[] cca_continue;
    public final String init;

    static class getInstance {
        private final byte[] configure;
        private final int init;

        getInstance(byte[] bArr) {
            this.init = getBackgroundColor.init(bArr);
            this.configure = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof getInstance) {
                return getBackgroundColor.Cardinal(this.configure, ((getInstance) obj).configure);
            }
            return false;
        }

        public final int hashCode() {
            return this.init;
        }
    }

    private static void Cardinal(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static ASN1ObjectIdentifier cca_continue(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof CardinalConfigurationParameters) {
            getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) obj).onCReqSuccess();
            if (onCReqSuccess instanceof ASN1ObjectIdentifier) {
                return (ASN1ObjectIdentifier) onCReqSuccess;
            }
        }
        throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    public static ASN1ObjectIdentifier cca_continue(byte[] bArr) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) configure.get(new getInstance(bArr));
        return aSN1ObjectIdentifier == null ? new ASN1ObjectIdentifier(bArr) : aSN1ObjectIdentifier;
    }

    private static void configure(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private static boolean configure(String str, int i) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public final int Cardinal() throws IOException {
        int length = init().length;
        return GM.Mappings.Cardinal(length) + 1 + length;
    }

    public final boolean configure() {
        return false;
    }

    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (getthreedsrequestorappurl == this) {
            return true;
        }
        if (!(getthreedsrequestorappurl instanceof ASN1ObjectIdentifier)) {
            return false;
        }
        return this.init.equals(((ASN1ObjectIdentifier) getthreedsrequestorappurl).init);
    }

    public final ASN1ObjectIdentifier getInstance() {
        getInstance getinstance = new getInstance(init());
        ConcurrentMap<getInstance, ASN1ObjectIdentifier> concurrentMap = configure;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) concurrentMap.get(getinstance);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        ASN1ObjectIdentifier putIfAbsent = concurrentMap.putIfAbsent(getinstance, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    public int hashCode() {
        return this.init.hashCode();
    }

    public static ASN1ObjectIdentifier Cardinal(setEnableLogging setenablelogging) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        return onCReqSuccess instanceof ASN1ObjectIdentifier ? cca_continue((Object) onCReqSuccess) : cca_continue(setUICustomization.init(onCReqSuccess).getInstance());
    }

    private ASN1ObjectIdentifier(byte[] bArr) {
        int i;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr3 = null;
        boolean z = true;
        BigInteger bigInteger = null;
        int i2 = 0;
        long j = 0;
        while (i2 != bArr2.length) {
            byte b = bArr2[i2] & 255;
            if (j <= 72057594037927808L) {
                i = i2;
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                } else {
                    j = j2 << 7;
                    i2 = i + 1;
                }
            } else {
                i = i2;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                    i2 = i + 1;
                }
            }
            j = 0;
            i2 = i + 1;
        }
        this.init = stringBuffer.toString();
        if (bArr2 != null) {
            bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        }
        this.cca_continue = bArr3;
    }

    public ASN1ObjectIdentifier(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = configure(str, 2);
            }
            if (z) {
                this.init = str;
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("string ").append(str).append(" not an OID").toString());
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public ASN1ObjectIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (configure(str, 0)) {
            this.init = new StringBuilder().append(aSN1ObjectIdentifier.init).append(".").append(str).toString();
            return;
        }
        throw new IllegalArgumentException(new StringBuilder("string ").append(str).append(" not a valid OID branch").toString());
    }

    private synchronized byte[] init() {
        if (this.cca_continue == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            SignatureSpi signatureSpi = new SignatureSpi(this.init);
            int parseInt = Integer.parseInt(signatureSpi.Cardinal()) * 40;
            String Cardinal = signatureSpi.Cardinal();
            if (Cardinal.length() <= 18) {
                Cardinal(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(Cardinal));
            } else {
                configure(byteArrayOutputStream, new BigInteger(Cardinal).add(BigInteger.valueOf((long) parseInt)));
            }
            while (true) {
                if (!(signatureSpi.Cardinal != -1)) {
                    break;
                }
                String Cardinal2 = signatureSpi.Cardinal();
                if (Cardinal2.length() <= 18) {
                    Cardinal(byteArrayOutputStream, Long.parseLong(Cardinal2));
                } else {
                    configure(byteArrayOutputStream, new BigInteger(Cardinal2));
                }
            }
            this.cca_continue = byteArrayOutputStream.toByteArray();
        }
        return this.cca_continue;
    }

    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] init2 = init();
        getrendertype.getInstance(6);
        getrendertype.configure(init2.length);
        getrendertype.configure.write(init2);
    }

    public String toString() {
        return this.init;
    }
}
