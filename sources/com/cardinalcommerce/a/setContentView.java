package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStyle;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;
import java.io.IOException;
import kotlin.text.Typography;

public final class setContentView extends setVerticalScrollbarThumbDrawable<setContentView> {
    private Boolean Cardinal;
    private boolean cca_continue;
    private boolean configure;
    private JSONStyle getInstance;
    private boolean getWarnings;
    private Appendable init;

    public setContentView(setFadingEdgeLength setfadingedgelength, Appendable appendable, JSONStyle jSONStyle) {
        this(setfadingedgelength, appendable, jSONStyle, (Boolean) null);
    }

    private setContentView(setFadingEdgeLength setfadingedgelength, Appendable appendable, JSONStyle jSONStyle, Boolean bool) {
        super(setfadingedgelength);
        this.cca_continue = false;
        this.configure = false;
        this.getWarnings = false;
        this.init = appendable;
        this.getInstance = jSONStyle;
        this.Cardinal = bool;
    }

    public final setVerticalScrollbarThumbDrawable<?> init(String str) throws IOException {
        configure((Object) this);
        getInstance(str);
        setContentView setcontentview = new setContentView(this.valueOf, this.init, this.getInstance, Boolean.TRUE);
        configure((Object) setcontentview);
        return setcontentview;
    }

    public final setVerticalScrollbarThumbDrawable<?> configure(String str) throws IOException {
        configure((Object) this);
        getInstance(str);
        setContentView setcontentview = new setContentView(this.valueOf, this.init, this.getInstance, Boolean.FALSE);
        configure((Object) setcontentview);
        return setcontentview;
    }

    private void getInstance(Object obj) throws IOException {
        if (obj instanceof String) {
            this.getInstance.writeString(this.init, (String) obj);
        } else if (obj instanceof setContentView) {
            Cardinal(obj);
        } else {
            JSONValue.writeJSONString(obj, this.init, this.getInstance);
        }
    }

    public final Object getInstance() {
        this.Cardinal = Boolean.TRUE;
        try {
            configure((Object) this);
        } catch (Exception unused) {
        }
        return this;
    }

    public final Object cca_continue() {
        this.Cardinal = Boolean.FALSE;
        try {
            configure((Object) this);
        } catch (Exception unused) {
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: cca_continue */
    public setContentView init(Object obj) {
        try {
            Cardinal(obj);
        } catch (Exception unused) {
        }
        return this;
    }

    private void configure(Object obj) throws IOException {
        setContentView setcontentview = (setContentView) obj;
        if (!setcontentview.configure) {
            boolean z = true;
            setcontentview.configure = true;
            if (setcontentview.Cardinal == Boolean.TRUE) {
                this.init.append('{');
                this.cca_continue = false;
                return;
            }
            if (setcontentview.Cardinal != Boolean.FALSE) {
                z = false;
            }
            if (z) {
                this.init.append('[');
                this.cca_continue = false;
            }
        }
    }

    private void getInstance(String str) throws IOException {
        boolean z = true;
        if (this.cca_continue) {
            this.init.append(',');
        } else {
            this.cca_continue = true;
        }
        if (this.Cardinal != Boolean.FALSE) {
            z = false;
        }
        if (!z) {
            if (!this.getInstance.mustProtectKey(str)) {
                this.init.append(str);
            } else {
                this.init.append(Typography.quote);
                JSONValue.escape(str, this.init, this.getInstance);
                this.init.append(Typography.quote);
            }
            this.init.append(':');
        }
    }

    public final void getInstance(Object obj, String str, Object obj2) throws IOException {
        if (!(obj2 instanceof setContentView)) {
            getInstance(str);
            getInstance(obj2);
        } else if (this.cca_continue) {
            this.init.append(',');
        } else {
            this.cca_continue = true;
        }
    }

    public final void Cardinal(Object obj, Object obj2) throws IOException {
        if (this.cca_continue) {
            this.init.append(',');
        } else {
            this.cca_continue = true;
        }
        getInstance(obj2);
    }

    private void Cardinal(Object obj) throws IOException {
        if (obj instanceof setContentView) {
            setContentView setcontentview = (setContentView) obj;
            if (!setcontentview.getWarnings) {
                setcontentview.getWarnings = true;
                boolean z = false;
                if (setcontentview.Cardinal == Boolean.TRUE) {
                    this.init.append('}');
                    this.cca_continue = true;
                    return;
                }
                if (setcontentview.Cardinal == Boolean.FALSE) {
                    z = true;
                }
                if (z) {
                    this.init.append(']');
                    this.cca_continue = true;
                }
            }
        }
    }
}
