package com.cardinalcommerce.a;

import java.io.IOException;

abstract class setHeaderText extends cancel {
    protected int getSDKVersion;

    /* access modifiers changed from: protected */
    public abstract int Cardinal(char c, int i);

    /* access modifiers changed from: protected */
    public abstract void configure(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void init(int i, int i2);

    public setHeaderText(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final void configure(boolean[] zArr) throws IOException {
        int i = this.onValidated;
        Cardinal(zArr);
        init(i, this.onValidated);
    }

    /* access modifiers changed from: protected */
    public final Object cca_continue(boolean[] zArr) throws getToolbarCustomization, IOException {
        int i = this.onValidated;
        getInstance();
        getSDKVersion();
        if (this.init == '.' || this.init == 'E' || this.init == 'e') {
            if (this.init == '.') {
                getInstance();
                getSDKVersion();
            }
            if (this.init == 'E' || this.init == 'e') {
                this.cca_continue.configure('E');
                getInstance();
                if (this.init == '+' || this.init == '-' || (this.init >= '0' && this.init <= '9')) {
                    this.cca_continue.configure(this.init);
                    getInstance();
                    getSDKVersion();
                    getWarnings();
                    if (this.init < 0 || this.init >= '~' || zArr[this.init] || this.init == 26) {
                        init(i, this.onValidated);
                        return configure();
                    }
                    Cardinal(zArr);
                    init(i, this.onValidated);
                    if (this.onCReqSuccess) {
                        return this.configure;
                    }
                    throw new getToolbarCustomization(this.onValidated, 1, this.configure);
                }
                Cardinal(zArr);
                init(i, this.onValidated);
                if (this.onCReqSuccess) {
                    if (!this.getWarnings) {
                        Cardinal();
                    }
                    return this.configure;
                }
                throw new getToolbarCustomization(this.onValidated, 1, this.configure);
            }
            getWarnings();
            if (this.init < 0 || this.init >= '~' || zArr[this.init] || this.init == 26) {
                init(i, this.onValidated);
                return configure();
            }
            Cardinal(zArr);
            init(i, this.onValidated);
            if (this.onCReqSuccess) {
                return this.configure;
            }
            throw new getToolbarCustomization(this.onValidated, 1, this.configure);
        }
        getWarnings();
        if (this.init < 0 || this.init >= '~' || zArr[this.init] || this.init == 26) {
            init(i, this.onValidated);
            return getInstance(this.configure);
        }
        Cardinal(zArr);
        init(i, this.onValidated);
        if (this.onCReqSuccess) {
            return this.configure;
        }
        throw new getToolbarCustomization(this.onValidated, 1, this.configure);
    }

    /* access modifiers changed from: protected */
    public final void onValidated() throws getToolbarCustomization, IOException {
        if (this.cleanup || this.init != '\'') {
            int Cardinal = Cardinal(this.init, this.onValidated + 1);
            if (Cardinal != -1) {
                configure(this.onValidated + 1, Cardinal);
                if (this.configure.indexOf(92) == -1) {
                    init();
                    this.onValidated = Cardinal;
                    getInstance();
                    return;
                }
                this.cca_continue.Cardinal = -1;
                cleanup();
                return;
            }
            throw new getToolbarCustomization(this.getSDKVersion, 3, (Object) null);
        } else if (this.onCReqSuccess) {
            boolean[] zArr = Cardinal;
            int i = this.onValidated;
            Cardinal(zArr);
            init(i, this.onValidated);
        } else {
            throw new getToolbarCustomization(this.onValidated, 0, Character.valueOf(this.init));
        }
    }
}
