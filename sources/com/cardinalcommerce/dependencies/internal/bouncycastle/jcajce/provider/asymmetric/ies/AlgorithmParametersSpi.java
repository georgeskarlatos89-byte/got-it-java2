package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ies;

import com.cardinalcommerce.a.XMSSMTKeyFactorySpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getPayment;
import com.cardinalcommerce.a.getProcessorTransactionId;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnableLogging;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setUICustomization;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private XMSSMTKeyFactorySpi Cardinal;

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof XMSSMTKeyFactorySpi) {
            this.Cardinal = (XMSSMTKeyFactorySpi) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "IES Parameters";
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else if (cls == XMSSMTKeyFactorySpi.class || cls == AlgorithmParameterSpec.class) {
            return this.Cardinal;
        } else {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        try {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            byte[] bArr6 = this.Cardinal.cca_continue;
            byte[] bArr7 = null;
            if (bArr6 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr6.length];
                System.arraycopy(bArr6, 0, bArr, 0, bArr6.length);
            }
            if (bArr != null) {
                byte[] bArr8 = this.Cardinal.cca_continue;
                if (bArr8 == null) {
                    bArr5 = null;
                } else {
                    bArr5 = new byte[bArr8.length];
                    System.arraycopy(bArr8, 0, bArr5, 0, bArr8.length);
                }
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 0, new setEnabledVisaCheckout(bArr5)));
            }
            byte[] bArr9 = this.Cardinal.getInstance;
            if (bArr9 == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[bArr9.length];
                System.arraycopy(bArr9, 0, bArr2, 0, bArr9.length);
            }
            if (bArr2 != null) {
                byte[] bArr10 = this.Cardinal.getInstance;
                if (bArr10 == null) {
                    bArr4 = null;
                } else {
                    bArr4 = new byte[bArr10.length];
                    System.arraycopy(bArr10, 0, bArr4, 0, bArr10.length);
                }
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 1, new setEnabledVisaCheckout(bArr4)));
            }
            getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.Cardinal.init));
            byte[] bArr11 = this.Cardinal.configure;
            if (bArr11 == null) {
                bArr3 = null;
            } else {
                bArr3 = new byte[bArr11.length];
                System.arraycopy(bArr11, 0, bArr3, 0, bArr11.length);
            }
            if (bArr3 != null) {
                getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.Cardinal.Cardinal));
                byte[] bArr12 = this.Cardinal.configure;
                if (bArr12 != null) {
                    bArr7 = new byte[bArr12.length];
                    System.arraycopy(bArr12, 0, bArr7, 0, bArr12.length);
                }
                getbackgroundcolor2.getInstance.addElement(new setEnvironment(bArr7));
                getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
            }
            return new getProcessorTransactionId(getbackgroundcolor).configure("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if ((str == null || str.equals("ASN.1")) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        try {
            isEnableLogging isenablelogging = (isEnableLogging) getThreeDSRequestorAppURL.Cardinal(bArr);
            if (isenablelogging.cca_continue() == 1) {
                this.Cardinal = new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(0)).getInstance).intValue());
            } else if (isenablelogging.cca_continue() == 2) {
                setEnableLogging cca_continue = setEnableLogging.cca_continue(isenablelogging.init(0));
                if (cca_continue.Cardinal == 0) {
                    this.Cardinal = new XMSSMTKeyFactorySpi(setUICustomization.init(cca_continue, false).getInstance(), (byte[]) null, new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(1)).getInstance).intValue());
                } else {
                    this.Cardinal = new XMSSMTKeyFactorySpi((byte[]) null, setUICustomization.init(cca_continue, false).getInstance(), new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(1)).getInstance).intValue());
                }
            } else if (isenablelogging.cca_continue() == 3) {
                this.Cardinal = new XMSSMTKeyFactorySpi(setUICustomization.init(setEnableLogging.cca_continue(isenablelogging.init(0)), false).getInstance(), setUICustomization.init(setEnableLogging.cca_continue(isenablelogging.init(1)), false).getInstance(), new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(2)).getInstance).intValue());
            } else if (isenablelogging.cca_continue() == 4) {
                setEnableLogging cca_continue2 = setEnableLogging.cca_continue(isenablelogging.init(0));
                setEnableLogging cca_continue3 = setEnableLogging.cca_continue(isenablelogging.init(1));
                isEnableLogging instance = isEnableLogging.getInstance((Object) isenablelogging.init(3));
                this.Cardinal = new XMSSMTKeyFactorySpi(setUICustomization.init(cca_continue2, false).getInstance(), setUICustomization.init(cca_continue3, false).getInstance(), new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(2)).getInstance).intValue(), new BigInteger(setEnvironment.getInstance((Object) instance.init(0)).getInstance).intValue(), setUICustomization.init(instance.init(1)).getInstance());
            }
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) throws IOException {
        if ((str == null || str.equals("ASN.1")) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
    }
}
