package com.cardinalcommerce.a;

import com.cardinalcommerce.a.setCCAOnCheckedChangeListener;
import com.cardinalcommerce.a.setOnCheckedChangeListener;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ChallengeHTMLView {
    private static Map init;

    static abstract class configure {
        private configure() {
        }

        /* synthetic */ configure(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public abstract setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;
    }

    static {
        HashMap hashMap = new HashMap();
        init = hashMap;
        hashMap.put(PQCObjectIdentifiers.getWarnings, new init((byte) 0));
        init.put(PQCObjectIdentifiers.onCReqSuccess, new init((byte) 0));
        init.put(PQCObjectIdentifiers.CardinalError, new init((byte) 0));
        init.put(PQCObjectIdentifiers.valueOf, new init((byte) 0));
        init.put(PQCObjectIdentifiers.values, new init((byte) 0));
        init.put(PQCObjectIdentifiers.configure, new getInstance((byte) 0));
        init.put(PQCObjectIdentifiers.onValidated, new Cardinal((byte) 0));
        init.put(PQCObjectIdentifiers.getSDKVersion, new cca_continue((byte) 0));
        init.put(PQCObjectIdentifiers.cleanup, new getWarnings((byte) 0));
    }

    static class Cardinal extends configure {
        private Cardinal() {
            super((byte) 0);
        }

        /* synthetic */ Cardinal(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new completed(subjectPublicKeyInfo.Cardinal.getInstance());
        }
    }

    static class cca_continue extends configure {
        private cca_continue() {
            super((byte) 0);
        }

        /* synthetic */ cca_continue(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            byte[] bArr;
            CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
            byte[] bArr2 = null;
            get3DSServerTransactionID get3dsservertransactionid = cardinalConfigurationParameters instanceof get3DSServerTransactionID ? (get3DSServerTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new get3DSServerTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = get3dsservertransactionid.getInstance.cca_continue;
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init());
            set3DSServerTransactionID set3dsservertransactionid = Cardinal != null ? new set3DSServerTransactionID(isEnableLogging.getInstance((Object) Cardinal)) : null;
            setCCAOnCheckedChangeListener.init init = new setCCAOnCheckedChangeListener.init(new setFocusableInTouchMode(get3dsservertransactionid.configure, close.cca_continue(aSN1ObjectIdentifier)));
            byte[] bArr3 = set3dsservertransactionid.getInstance;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            if (bArr != null) {
                byte[] bArr4 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                init.getInstance = bArr4;
                byte[] bArr5 = set3dsservertransactionid.Cardinal;
                if (bArr5 != null) {
                    bArr2 = new byte[bArr5.length];
                    System.arraycopy(bArr5, 0, bArr2, 0, bArr5.length);
                }
                if (bArr2 != null) {
                    byte[] bArr6 = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                    init.Cardinal = bArr6;
                    return new setCCAOnCheckedChangeListener(init, (byte) 0);
                }
                throw new NullPointerException("in == null");
            }
            throw new NullPointerException("in == null");
        }
    }

    static class getInstance extends configure {
        private getInstance() {
            super((byte) 0);
        }

        /* synthetic */ getInstance(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            byte[] instance = subjectPublicKeyInfo.Cardinal.getInstance();
            CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
            return new ThreeDS2Service(instance, close.configure(cardinalConfigurationParameters instanceof ChallengeParameters ? (ChallengeParameters) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new ChallengeParameters(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null));
        }
    }

    static class getWarnings extends configure {
        private getWarnings() {
            super((byte) 0);
        }

        /* synthetic */ getWarnings(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            byte[] bArr;
            CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
            byte[] bArr2 = null;
            getAcsTransactionID getacstransactionid = cardinalConfigurationParameters instanceof getAcsTransactionID ? (getAcsTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new getAcsTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = getacstransactionid.cca_continue.cca_continue;
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init());
            set3DSServerTransactionID set3dsservertransactionid = Cardinal != null ? new set3DSServerTransactionID(isEnableLogging.getInstance((Object) Cardinal)) : null;
            setOnCheckedChangeListener.Cardinal cardinal = new setOnCheckedChangeListener.Cardinal(new setCCAId(getacstransactionid.getInstance, getacstransactionid.Cardinal, close.cca_continue(aSN1ObjectIdentifier)));
            byte[] bArr3 = set3dsservertransactionid.getInstance;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            if (bArr != null) {
                byte[] bArr4 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                cardinal.Cardinal = bArr4;
                byte[] bArr5 = set3dsservertransactionid.Cardinal;
                if (bArr5 != null) {
                    bArr2 = new byte[bArr5.length];
                    System.arraycopy(bArr5, 0, bArr2, 0, bArr5.length);
                }
                if (bArr2 != null) {
                    byte[] bArr6 = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                    cardinal.init = bArr6;
                    return new setOnCheckedChangeListener(cardinal, (byte) 0);
                }
                throw new NullPointerException("in == null");
            }
            throw new NullPointerException("in == null");
        }
    }

    static class init extends configure {
        private init() {
            super((byte) 0);
        }

        /* synthetic */ init(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new cancelled(close.cca_continue(subjectPublicKeyInfo.cca_continue), subjectPublicKeyInfo.Cardinal.init());
        }
    }

    public static setCCAImageUri init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        BCDSAPrivateKey bCDSAPrivateKey = subjectPublicKeyInfo.cca_continue;
        configure configure2 = (configure) init.get(bCDSAPrivateKey.cca_continue);
        if (configure2 != null) {
            return configure2.init(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier in public key not recognised: ").append(bCDSAPrivateKey.cca_continue).toString());
    }
}
