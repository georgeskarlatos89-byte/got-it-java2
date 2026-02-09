package com.cardinalcommerce.a;

public abstract class setCCAOnFocusChangeListener {
    final int cleanup;
    final int configure;
    final long getWarnings;
    private final int init;

    public static abstract class init<T extends init> {
        final int getSDKVersion;
        int getWarnings = 0;
        long onCReqSuccess = 0;
        int onValidated = 0;

        protected init(int i) {
            this.getSDKVersion = i;
        }

        /* access modifiers changed from: protected */
        public final T cca_continue(int i) {
            this.onValidated = i;
            return init();
        }

        /* access modifiers changed from: protected */
        public final T getInstance(long j) {
            this.onCReqSuccess = j;
            return init();
        }

        /* access modifiers changed from: protected */
        public abstract T init();

        /* access modifiers changed from: protected */
        public final T init(int i) {
            this.getWarnings = i;
            return init();
        }
    }

    protected setCCAOnFocusChangeListener(init init2) {
        this.configure = init2.onValidated;
        this.getWarnings = init2.onCReqSuccess;
        this.init = init2.getSDKVersion;
        this.cleanup = init2.getWarnings;
    }

    /* access modifiers changed from: protected */
    public byte[] Cardinal() {
        byte[] bArr = new byte[32];
        setTextFontSize.init(this.configure, bArr, 0);
        long j = this.getWarnings;
        setTextFontSize.init((int) (j >>> 32), bArr, 4);
        setTextFontSize.init((int) j, bArr, 8);
        setTextFontSize.init(this.init, bArr, 12);
        setTextFontSize.init(this.cleanup, bArr, 28);
        return bArr;
    }
}
