package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

public final class EC extends getRenderType {
    public EC(OutputStream outputStream) {
        super(outputStream);
    }

    public final void getInstance(CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        if (cardinalConfigurationParameters != null) {
            cardinalConfigurationParameters.onCReqSuccess().getSDKVersion().getInstance(this);
            return;
        }
        throw new IOException("null object detected");
    }

    final class Mappings extends isEnableLogging {
        private byte[] Cardinal;

        Mappings(byte[] bArr) throws IOException {
            this.Cardinal = bArr;
        }

        private void cleanup() {
            KeyAgreementSpi.MQVwithSHA384CKDF mQVwithSHA384CKDF = new KeyAgreementSpi.MQVwithSHA384CKDF(this.Cardinal);
            while (mQVwithSHA384CKDF.hasMoreElements()) {
                this.init.addElement(mQVwithSHA384CKDF.nextElement());
            }
            this.Cardinal = null;
        }

        /* access modifiers changed from: package-private */
        public final int Cardinal() throws IOException {
            byte[] bArr = this.Cardinal;
            return bArr != null ? GM.Mappings.Cardinal(bArr.length) + 1 + this.Cardinal.length : super.getSDKVersion().Cardinal();
        }

        public final synchronized int cca_continue() {
            if (this.Cardinal != null) {
                cleanup();
            }
            return super.cca_continue();
        }

        /* access modifiers changed from: package-private */
        public final getThreeDSRequestorAppURL getSDKVersion() {
            if (this.Cardinal != null) {
                cleanup();
            }
            return super.getSDKVersion();
        }

        /* access modifiers changed from: package-private */
        public final getThreeDSRequestorAppURL getWarnings() {
            if (this.Cardinal != null) {
                cleanup();
            }
            return super.getWarnings();
        }

        public final synchronized CardinalConfigurationParameters init(int i) {
            if (this.Cardinal != null) {
                cleanup();
            }
            return super.init(i);
        }

        public final synchronized Enumeration init() {
            if (this.Cardinal == null) {
                return super.init();
            }
            return new KeyAgreementSpi.MQVwithSHA384CKDF(this.Cardinal);
        }

        /* access modifiers changed from: package-private */
        public final void getInstance(getRenderType getrendertype) throws IOException {
            byte[] bArr = this.Cardinal;
            if (bArr != null) {
                getrendertype.getInstance(48);
                getrendertype.configure(bArr.length);
                getrendertype.configure.write(bArr);
                return;
            }
            super.getSDKVersion().getInstance(getrendertype);
        }
    }
}
