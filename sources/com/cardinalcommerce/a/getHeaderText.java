package com.cardinalcommerce.a;

import java.io.IOException;

abstract class getHeaderText extends cancel {
    public getHeaderText(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final void configure(boolean[] zArr) throws IOException {
        this.cca_continue.Cardinal = -1;
        Cardinal(zArr);
        this.configure = this.cca_continue.toString().trim();
    }

    /* access modifiers changed from: protected */
    public final Object cca_continue(boolean[] zArr) throws getToolbarCustomization, IOException {
        this.cca_continue.Cardinal = -1;
        this.cca_continue.configure(this.init);
        getInstance();
        getSDKVersion();
        if (this.init == '.' || this.init == 'E' || this.init == 'e') {
            if (this.init == '.') {
                this.cca_continue.configure(this.init);
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
                        this.configure = this.cca_continue.toString().trim();
                        return configure();
                    }
                    Cardinal(zArr);
                    this.configure = this.cca_continue.toString().trim();
                    if (this.onCReqSuccess) {
                        return this.configure;
                    }
                    throw new getToolbarCustomization(this.onValidated, 1, this.configure);
                }
                Cardinal(zArr);
                this.configure = this.cca_continue.toString().trim();
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
                this.configure = this.cca_continue.toString().trim();
                return configure();
            }
            Cardinal(zArr);
            this.configure = this.cca_continue.toString().trim();
            if (this.onCReqSuccess) {
                return this.configure;
            }
            throw new getToolbarCustomization(this.onValidated, 1, this.configure);
        }
        getWarnings();
        if (this.init < 0 || this.init >= '~' || zArr[this.init] || this.init == 26) {
            this.configure = this.cca_continue.toString().trim();
            return getInstance(this.configure);
        }
        Cardinal(zArr);
        this.configure = this.cca_continue.toString().trim();
        if (this.onCReqSuccess) {
            return this.configure;
        }
        throw new getToolbarCustomization(this.onValidated, 1, this.configure);
    }

    /* access modifiers changed from: protected */
    public final void onValidated() throws getToolbarCustomization, IOException {
        if (this.cleanup || this.init != '\'') {
            this.cca_continue.Cardinal = -1;
            cleanup();
        } else if (this.onCReqSuccess) {
            boolean[] zArr = Cardinal;
            this.cca_continue.Cardinal = -1;
            Cardinal(zArr);
            this.configure = this.cca_continue.toString().trim();
        } else {
            throw new getToolbarCustomization(this.onValidated, 0, Character.valueOf(this.init));
        }
    }
}
