package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public final class getAcsSignedContent extends setRenderType {
    private byte[] Cardinal;
    private ASN1ObjectIdentifier cca_continue;
    private setEnvironment configure;
    private byte[][] getInstance;
    private byte[][] getWarnings;
    public Transaction[] init;
    private byte[] onCReqSuccess;
    private byte[] onValidated;

    public getAcsSignedContent(isEnableLogging isenablelogging) {
        isEnableLogging isenablelogging2 = isenablelogging;
        int i = 0;
        if (isenablelogging2.init(0) instanceof setEnvironment) {
            this.configure = setEnvironment.getInstance((Object) isenablelogging2.init(0));
        } else {
            this.cca_continue = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging2.init(0));
        }
        isEnableLogging isenablelogging3 = (isEnableLogging) isenablelogging2.init(1);
        this.getInstance = new byte[isenablelogging3.cca_continue()][];
        for (int i2 = 0; i2 < isenablelogging3.cca_continue(); i2++) {
            this.getInstance[i2] = ((setUICustomization) isenablelogging3.init(i2)).getInstance();
        }
        this.Cardinal = ((setUICustomization) ((isEnableLogging) isenablelogging2.init(2)).init(0)).getInstance();
        isEnableLogging isenablelogging4 = (isEnableLogging) isenablelogging2.init(3);
        this.getWarnings = new byte[isenablelogging4.cca_continue()][];
        for (int i3 = 0; i3 < isenablelogging4.cca_continue(); i3++) {
            this.getWarnings[i3] = ((setUICustomization) isenablelogging4.init(i3)).getInstance();
        }
        this.onValidated = ((setUICustomization) ((isEnableLogging) isenablelogging2.init(4)).init(0)).getInstance();
        this.onCReqSuccess = ((setUICustomization) ((isEnableLogging) isenablelogging2.init(5)).init(0)).getInstance();
        isEnableLogging isenablelogging5 = (isEnableLogging) isenablelogging2.init(6);
        byte[][][][] bArr = new byte[isenablelogging5.cca_continue()][][][];
        byte[][][][] bArr2 = new byte[isenablelogging5.cca_continue()][][][];
        byte[][][] bArr3 = new byte[isenablelogging5.cca_continue()][][];
        byte[][] bArr4 = new byte[isenablelogging5.cca_continue()][];
        int i4 = 0;
        while (i4 < isenablelogging5.cca_continue()) {
            isEnableLogging isenablelogging6 = (isEnableLogging) isenablelogging5.init(i4);
            isEnableLogging isenablelogging7 = (isEnableLogging) isenablelogging6.init(i);
            bArr[i4] = new byte[isenablelogging7.cca_continue()][][];
            for (int i5 = i; i5 < isenablelogging7.cca_continue(); i5++) {
                isEnableLogging isenablelogging8 = (isEnableLogging) isenablelogging7.init(i5);
                bArr[i4][i5] = new byte[isenablelogging8.cca_continue()][];
                for (int i6 = 0; i6 < isenablelogging8.cca_continue(); i6++) {
                    bArr[i4][i5][i6] = ((setUICustomization) isenablelogging8.init(i6)).getInstance();
                }
            }
            isEnableLogging isenablelogging9 = (isEnableLogging) isenablelogging6.init(1);
            bArr2[i4] = new byte[isenablelogging9.cca_continue()][][];
            for (int i7 = 0; i7 < isenablelogging9.cca_continue(); i7++) {
                isEnableLogging isenablelogging10 = (isEnableLogging) isenablelogging9.init(i7);
                bArr2[i4][i7] = new byte[isenablelogging10.cca_continue()][];
                for (int i8 = 0; i8 < isenablelogging10.cca_continue(); i8++) {
                    bArr2[i4][i7][i8] = ((setUICustomization) isenablelogging10.init(i8)).getInstance();
                }
            }
            isEnableLogging isenablelogging11 = (isEnableLogging) isenablelogging6.init(2);
            bArr3[i4] = new byte[isenablelogging11.cca_continue()][];
            for (int i9 = 0; i9 < isenablelogging11.cca_continue(); i9++) {
                bArr3[i4][i9] = ((setUICustomization) isenablelogging11.init(i9)).getInstance();
            }
            bArr4[i4] = ((setUICustomization) isenablelogging6.init(3)).getInstance();
            i4++;
            i = 0;
        }
        int length = this.onCReqSuccess.length - 1;
        this.init = new Transaction[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.onCReqSuccess;
            int i11 = i10 + 1;
            this.init[i10] = new Transaction(bArr5[i10], bArr5[i11], protocolError.Cardinal(bArr[i10]), protocolError.Cardinal(bArr2[i10]), protocolError.init(bArr3[i10]), protocolError.getInstance(bArr4[i10]));
            i10 = i11;
        }
    }

    public final short[][] Cardinal() {
        return protocolError.init(this.getWarnings);
    }

    public final short[][] cca_continue() {
        return protocolError.init(this.getInstance);
    }

    public getAcsSignedContent(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Transaction[] transactionArr) {
        this.configure = new setEnvironment(1);
        this.getInstance = protocolError.cca_continue(sArr);
        byte[] bArr = new byte[sArr2.length];
        for (int i = 0; i < sArr2.length; i++) {
            bArr[i] = (byte) sArr2[i];
        }
        this.Cardinal = bArr;
        this.getWarnings = protocolError.cca_continue(sArr3);
        byte[] bArr2 = new byte[sArr4.length];
        for (int i2 = 0; i2 < sArr4.length; i2++) {
            bArr2[i2] = (byte) sArr4[i2];
        }
        this.onValidated = bArr2;
        byte[] bArr3 = new byte[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            bArr3[i3] = (byte) iArr[i3];
        }
        this.onCReqSuccess = bArr3;
        this.init = transactionArr;
    }

    public final short[] configure() {
        byte[] bArr = this.Cardinal;
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public final short[] init() {
        byte[] bArr = this.onValidated;
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public final int[] getInstance() {
        byte[] bArr = this.onCReqSuccess;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        setEnvironment setenvironment = this.configure;
        if (setenvironment != null) {
            getbackgroundcolor.getInstance.addElement(setenvironment);
        } else {
            getbackgroundcolor.getInstance.addElement(this.cca_continue);
        }
        getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
        for (byte[] setenabledvisacheckout : this.getInstance) {
            getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout));
        }
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
        getBackgroundColor getbackgroundcolor3 = new getBackgroundColor();
        getbackgroundcolor3.getInstance.addElement(new setEnabledVisaCheckout(this.Cardinal));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor3));
        getBackgroundColor getbackgroundcolor4 = new getBackgroundColor();
        for (byte[] setenabledvisacheckout2 : this.getWarnings) {
            getbackgroundcolor4.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout2));
        }
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor4));
        getBackgroundColor getbackgroundcolor5 = new getBackgroundColor();
        getbackgroundcolor5.getInstance.addElement(new setEnabledVisaCheckout(this.onValidated));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor5));
        getBackgroundColor getbackgroundcolor6 = new getBackgroundColor();
        getbackgroundcolor6.getInstance.addElement(new setEnabledVisaCheckout(this.onCReqSuccess));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor6));
        getBackgroundColor getbackgroundcolor7 = new getBackgroundColor();
        for (int i = 0; i < this.init.length; i++) {
            getBackgroundColor getbackgroundcolor8 = new getBackgroundColor();
            byte[][][] Cardinal2 = protocolError.Cardinal(this.init[i].init);
            getBackgroundColor getbackgroundcolor9 = new getBackgroundColor();
            for (int i2 = 0; i2 < Cardinal2.length; i2++) {
                getBackgroundColor getbackgroundcolor10 = new getBackgroundColor();
                for (byte[] setenabledvisacheckout3 : Cardinal2[i2]) {
                    getbackgroundcolor10.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout3));
                }
                getbackgroundcolor9.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor10));
            }
            getbackgroundcolor8.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor9));
            byte[][][] Cardinal3 = protocolError.Cardinal(this.init[i].configure);
            getBackgroundColor getbackgroundcolor11 = new getBackgroundColor();
            for (int i3 = 0; i3 < Cardinal3.length; i3++) {
                getBackgroundColor getbackgroundcolor12 = new getBackgroundColor();
                for (byte[] setenabledvisacheckout4 : Cardinal3[i3]) {
                    getbackgroundcolor12.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout4));
                }
                getbackgroundcolor11.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor12));
            }
            getbackgroundcolor8.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor11));
            byte[][] cca_continue2 = protocolError.cca_continue(this.init[i].Cardinal);
            getBackgroundColor getbackgroundcolor13 = new getBackgroundColor();
            for (byte[] setenabledvisacheckout5 : cca_continue2) {
                getbackgroundcolor13.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout5));
            }
            getbackgroundcolor8.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor13));
            getbackgroundcolor8.getInstance.addElement(new setEnabledVisaCheckout(protocolError.init(this.init[i].cca_continue)));
            getbackgroundcolor7.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor8));
        }
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor7));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
