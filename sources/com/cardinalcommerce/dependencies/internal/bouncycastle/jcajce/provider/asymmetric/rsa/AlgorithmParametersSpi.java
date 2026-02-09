package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setUICustomization;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return getInstance(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    /* access modifiers changed from: protected */
    public abstract AlgorithmParameterSpec getInstance(Class cls) throws InvalidParameterSpecException;

    public static class OAEP extends AlgorithmParametersSpi {
        private OAEPParameterSpec getInstance;

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded() {
            try {
                return new KeyAgreementSpi.DHUwithSHA512KDF(new BCDSAPrivateKey(X931SignatureSpi.RIPEMD128WithRSAEncryption.getInstance(this.getInstance.getDigestAlgorithm()), isEnabledVisaCheckout.configure), new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess, new BCDSAPrivateKey(X931SignatureSpi.RIPEMD128WithRSAEncryption.getInstance(((MGF1ParameterSpec) this.getInstance.getMGFParameters()).getDigestAlgorithm()), isEnabledVisaCheckout.configure)), new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.getWarnings, new setEnabledVisaCheckout(((PSource.PSpecified) this.getInstance.getPSource()).getValue()))).configure("DER");
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                this.getInstance = (OAEPParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }

        /* access modifiers changed from: protected */
        public String engineToString() {
            return "OAEP Parameters";
        }

        /* access modifiers changed from: protected */
        public final AlgorithmParameterSpec getInstance(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.getInstance;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
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
                KeyAgreementSpi.DHUwithSHA512KDF init = KeyAgreementSpi.DHUwithSHA512KDF.init(bArr);
                if (init.cca_continue.cca_continue.equals(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess)) {
                    String configure = BaseCipherSpi.AnonymousClass1.configure(init.getInstance.cca_continue);
                    String mGFAlgorithm = OAEPParameterSpec.DEFAULT.getMGFAlgorithm();
                    CardinalConfigurationParameters cardinalConfigurationParameters = init.cca_continue.Cardinal;
                    this.getInstance = new OAEPParameterSpec(configure, mGFAlgorithm, new MGF1ParameterSpec(BaseCipherSpi.AnonymousClass1.configure((cardinalConfigurationParameters instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).cca_continue)), new PSource.PSpecified(setUICustomization.init(init.init.Cardinal).getInstance()));
                    return;
                }
                throw new IOException(new StringBuilder("unknown mask generation function: ").append(init.cca_continue.cca_continue).toString());
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }
    }

    public static class PSS extends AlgorithmParametersSpi {
        private PSSParameterSpec getInstance;

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.getInstance;
            return new KeyAgreementSpi.DHUwithSHA384KDF(new BCDSAPrivateKey(X931SignatureSpi.RIPEMD128WithRSAEncryption.getInstance(pSSParameterSpec.getDigestAlgorithm()), isEnabledVisaCheckout.configure), new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess, new BCDSAPrivateKey(X931SignatureSpi.RIPEMD128WithRSAEncryption.getInstance(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), isEnabledVisaCheckout.configure)), new setEnvironment((long) pSSParameterSpec.getSaltLength()), new setEnvironment((long) pSSParameterSpec.getTrailerField())).configure("DER");
        }

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                this.getInstance = (PSSParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }

        /* access modifiers changed from: protected */
        public String engineToString() {
            return "PSS Parameters";
        }

        /* access modifiers changed from: protected */
        public final AlgorithmParameterSpec getInstance(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.getInstance;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr) throws IOException {
            try {
                KeyAgreementSpi.DHUwithSHA384KDF configure = KeyAgreementSpi.DHUwithSHA384KDF.configure(bArr);
                if (configure.cca_continue.cca_continue.equals(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess)) {
                    String configure2 = BaseCipherSpi.AnonymousClass1.configure(configure.getInstance.cca_continue);
                    String mGFAlgorithm = PSSParameterSpec.DEFAULT.getMGFAlgorithm();
                    CardinalConfigurationParameters cardinalConfigurationParameters = configure.cca_continue.Cardinal;
                    this.getInstance = new PSSParameterSpec(configure2, mGFAlgorithm, new MGF1ParameterSpec(BaseCipherSpi.AnonymousClass1.configure((cardinalConfigurationParameters instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).cca_continue)), new BigInteger(configure.Cardinal.getInstance).intValue(), new BigInteger(configure.configure.getInstance).intValue());
                    return;
                }
                throw new IOException(new StringBuilder("unknown mask generation function: ").append(configure.cca_continue.cca_continue).toString());
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
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
}
