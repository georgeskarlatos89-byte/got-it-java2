package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DH;
import com.cardinalcommerce.a.EC;
import com.cardinalcommerce.a.EdEC;
import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class getProxyAddress extends FilterInputStream {
    private final byte[][] cca_continue;
    private final boolean configure;
    final int init;

    public getProxyAddress(InputStream inputStream) {
        this(inputStream, GM.Mappings.Cardinal(inputStream));
    }

    public getProxyAddress(InputStream inputStream, byte b) {
        this(inputStream, GM.Mappings.Cardinal(inputStream), true);
    }

    private getProxyAddress(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private getProxyAddress(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.init = i;
        this.configure = z;
        this.cca_continue = new byte[11][];
    }

    public getProxyAddress(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    public getProxyAddress(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public static int cca_continue(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if ((read & 127) != 0) {
            int i3 = 0;
            while (read >= 0 && (read & 128) != 0) {
                i3 = ((read & 127) | i3) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    public static int getInstance(InputStream inputStream, int i) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            } else {
                throw new IOException("DER length more than 4 bytes: ".concat(String.valueOf(i2)));
            }
        }
    }

    private static getBackgroundColor getInstance(EdEC.Mappings mappings) throws IOException {
        getProxyAddress getproxyaddress = new getProxyAddress((InputStream) mappings);
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        while (true) {
            getThreeDSRequestorAppURL configure2 = getproxyaddress.configure();
            if (configure2 == null) {
                return getbackgroundcolor;
            }
            getbackgroundcolor.getInstance.addElement(configure2);
        }
    }

    public final getThreeDSRequestorAppURL configure() throws IOException {
        int read = read();
        if (read > 0) {
            int cca_continue2 = cca_continue(this, read);
            int i = read & 32;
            boolean z = true;
            boolean z2 = i != 0;
            int instance = getInstance(this, this.init);
            if (instance >= 0) {
                if (i == 0) {
                    z = false;
                }
                try {
                    EdEC.Mappings mappings = new EdEC.Mappings(this, instance);
                    if ((read & 64) != 0) {
                        return new ASN1ObjectIdentifier(z, cca_continue2, mappings.configure());
                    }
                    if ((read & 128) != 0) {
                        return new KeyAgreementSpi.MQVwithSHA1KDF(mappings).Cardinal(z, cca_continue2);
                    }
                    if (!z) {
                        return configure(cca_continue2, mappings, this.cca_continue);
                    }
                    if (cca_continue2 == 4) {
                        getBackgroundColor instance2 = getInstance(mappings);
                        int size = instance2.getInstance.size();
                        setUICustomization[] setuicustomizationArr = new setUICustomization[size];
                        for (int i2 = 0; i2 != size; i2++) {
                            setuicustomizationArr[i2] = (setUICustomization) ((CardinalConfigurationParameters) instance2.getInstance.elementAt(i2));
                        }
                        return new getEciFlag(setuicustomizationArr);
                    } else if (cca_continue2 == 8) {
                        return new DH(getInstance(mappings));
                    } else {
                        if (cca_continue2 == 16) {
                            return this.configure ? new EC.Mappings(mappings.configure()) : isEnabledCCA.getInstance(getInstance(mappings));
                        }
                        if (cca_continue2 == 17) {
                            return isEnabledCCA.init(getInstance(mappings));
                        }
                        throw new IOException(new StringBuilder("unknown tag ").append(cca_continue2).append(" encountered").toString());
                    }
                } catch (IllegalArgumentException e) {
                    throw new setProxyAddress("corrupted stream detected", e);
                }
            } else if (z2) {
                KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF = new KeyAgreementSpi.MQVwithSHA1KDF(new ECGOST(this, this.init), this.init);
                if ((read & 64) != 0) {
                    return new getEnrolled(cca_continue2, mQVwithSHA1KDF).init();
                }
                if ((read & 128) != 0) {
                    return new isEnabledDiscover(true, cca_continue2, mQVwithSHA1KDF).init();
                }
                if (cca_continue2 == 4) {
                    return new getCavv(mQVwithSHA1KDF).init();
                }
                if (cca_continue2 == 8) {
                    return new setDeviceFingerprintUrl(mQVwithSHA1KDF).init();
                }
                if (cca_continue2 == 16) {
                    return new isEnabledPaypal(mQVwithSHA1KDF).init();
                }
                if (cca_continue2 == 17) {
                    return new getSignatureVerification(mQVwithSHA1KDF).init();
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    private static byte[] init(EdEC.Mappings mappings, byte[][] bArr) throws IOException {
        int i = mappings.configure;
        if (mappings.configure >= bArr.length) {
            return mappings.configure();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        setHeadingTextFontSize.init(mappings, bArr2);
        return bArr2;
    }

    private static char[] cca_continue(EdEC.Mappings mappings) throws IOException {
        int read;
        int i = mappings.configure / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            int read2 = mappings.read();
            if (read2 < 0 || (read = mappings.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    public static getThreeDSRequestorAppURL configure(int i, EdEC.Mappings mappings, byte[][] bArr) throws IOException {
        if (i == 10) {
            return setRequestTimeout.cca_continue(init(mappings, bArr));
        }
        if (i == 12) {
            return new isValidated(mappings.configure());
        }
        if (i == 30) {
            return new setEnabledPaypal(cca_continue(mappings));
        }
        switch (i) {
            case 1:
                return setChallengeTimeout.init(init(mappings, bArr));
            case 2:
                return new setEnvironment(mappings.configure(), false);
            case 3:
                return getRequestTimeout.init(mappings.configure, mappings);
            case 4:
                return new setEnabledVisaCheckout(mappings.configure());
            case 5:
                return isEnabledVisaCheckout.configure;
            case 6:
                return ASN1ObjectIdentifier.cca_continue(init(mappings, bArr));
            default:
                switch (i) {
                    case 18:
                        return new setEnabledCCA(mappings.configure());
                    case 19:
                        return new ValidateResponse(mappings.configure());
                    case 20:
                        return new onSetupCompleted(mappings.configure());
                    case 21:
                        return new DH.Mappings(mappings.configure());
                    case 22:
                        return new isEnabledHostedFields(mappings.configure());
                    case 23:
                        return new ExtendedData(mappings.configure());
                    case 24:
                        return new getUiType(mappings.configure());
                    case 25:
                        return new getErrorDescription(mappings.configure());
                    case 26:
                        return new SubjectPublicKeyInfo(mappings.configure());
                    case 27:
                        return new setErrorDescription(mappings.configure());
                    case 28:
                        return new CardinalValidateReceiver(mappings.configure());
                    default:
                        throw new IOException(new StringBuilder("unknown tag ").append(i).append(" encountered").toString());
                }
        }
    }
}
