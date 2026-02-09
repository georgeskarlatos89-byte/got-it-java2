package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class canWrite extends JSONNavi.init {
    public canWrite(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public canWrite(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    canWrite(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final boolean CardinalActionCode() {
        merge valueOf = valueOf();
        return !valueOf.onCReqSuccess() && CardinalEnvironment().values() != valueOf.values();
    }

    public final JSONNavi CardinalChallengeObserver() {
        if (getString()) {
            return this;
        }
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return this;
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        toJSONString tojsonstring = this.configure;
        merge[] mergeArr = {merge3};
        return new canWrite(tojsonstring, merge, merge2.cca_continue(merge3), mergeArr, this.Cardinal);
    }

    public final JSONNavi cca_continue(JSONNavi jSONNavi) {
        merge merge;
        merge merge2;
        merge merge3;
        merge merge4;
        merge merge5;
        merge merge6;
        if (getString()) {
            return jSONNavi;
        }
        if (jSONNavi.getString()) {
            return this;
        }
        toJSONString configure = configure();
        merge merge7 = this.init;
        merge valueOf = jSONNavi.valueOf();
        if (merge7.onCReqSuccess()) {
            return valueOf.onCReqSuccess() ? configure.init() : jSONNavi.cca_continue(this);
        }
        merge merge8 = this.cca_continue;
        merge merge9 = this.getInstance[0];
        merge CardinalEnvironment = jSONNavi.CardinalEnvironment();
        merge instance = jSONNavi.getInstance(0);
        boolean cleanup = merge9.cleanup();
        if (!cleanup) {
            merge2 = valueOf.init(merge9);
            merge = CardinalEnvironment.init(merge9);
        } else {
            merge2 = valueOf;
            merge = CardinalEnvironment;
        }
        boolean cleanup2 = instance.cleanup();
        if (!cleanup2) {
            merge7 = merge7.init(instance);
            merge3 = merge8.init(instance);
        } else {
            merge3 = merge8;
        }
        merge cca_continue = merge3.cca_continue(merge);
        merge cca_continue2 = merge7.cca_continue(merge2);
        if (cca_continue2.onCReqSuccess()) {
            return cca_continue.onCReqSuccess() ? getActionCode() : configure.init();
        }
        if (valueOf.onCReqSuccess()) {
            JSONNavi CardinalRenderType = CardinalRenderType();
            merge onValidated = CardinalRenderType.onValidated();
            merge sDKVersion = CardinalRenderType.getSDKVersion();
            merge instance2 = sDKVersion.cca_continue(CardinalEnvironment).getInstance(onValidated);
            merge5 = instance2.getInstance().cca_continue(instance2).cca_continue(onValidated).cca_continue(configure.getSDKVersion());
            if (merge5.onCReqSuccess()) {
                return new canWrite(configure, merge5, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge cca_continue3 = instance2.init(onValidated.cca_continue(merge5)).cca_continue(merge5).cca_continue(sDKVersion).getInstance(merge5).cca_continue(merge5);
            merge6 = configure.init(writeJSONString.CardinalRenderType);
            merge4 = cca_continue3;
        } else {
            merge instance3 = cca_continue2.getInstance();
            merge init = cca_continue.init(merge7);
            merge init2 = cca_continue.init(merge2);
            merge init3 = init.init(init2);
            if (init3.onCReqSuccess()) {
                return new canWrite(configure, init3, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge init4 = cca_continue.init(instance3);
            merge init5 = !cleanup2 ? init4.init(instance) : init4;
            merge configure2 = init2.cca_continue(instance3).configure(init5, merge8.cca_continue(merge9));
            if (!cleanup) {
                init5 = init5.init(merge9);
            }
            merge5 = init3;
            merge4 = configure2;
            merge6 = init5;
        }
        return new canWrite(configure, merge5, merge4, new merge[]{merge6}, this.Cardinal);
    }

    public final JSONNavi configure(JSONNavi jSONNavi) {
        if (getString()) {
            return jSONNavi;
        }
        if (jSONNavi.getString()) {
            return getActionCode();
        }
        toJSONString configure = configure();
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return jSONNavi;
        }
        merge valueOf = jSONNavi.valueOf();
        merge instance = jSONNavi.getInstance(0);
        if (valueOf.onCReqSuccess() || !instance.cleanup()) {
            return getActionCode().cca_continue(jSONNavi);
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        merge CardinalEnvironment = jSONNavi.CardinalEnvironment();
        merge instance2 = merge.getInstance();
        merge instance3 = merge2.getInstance();
        merge instance4 = merge3.getInstance();
        merge cca_continue = configure.getSDKVersion().init(instance4).cca_continue(instance3).cca_continue(merge2.init(merge3));
        merge configure2 = CardinalEnvironment.configure();
        merge Cardinal = configure.getSDKVersion().cca_continue(configure2).init(instance4).cca_continue(instance3).Cardinal(cca_continue, instance2, instance4);
        merge init = valueOf.init(instance4);
        merge instance5 = init.cca_continue(cca_continue).getInstance();
        if (instance5.onCReqSuccess()) {
            return Cardinal.onCReqSuccess() ? jSONNavi.getActionCode() : configure.init();
        }
        if (Cardinal.onCReqSuccess()) {
            return new canWrite(configure, Cardinal, configure.cleanup().getWarnings(), this.Cardinal);
        }
        merge init2 = Cardinal.getInstance().init(init);
        merge init3 = Cardinal.init(instance5).init(instance4);
        return new canWrite(configure, init2, Cardinal.cca_continue(instance5).getInstance().Cardinal(cca_continue, configure2, init3), new merge[]{init3}, this.Cardinal);
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return configure.init();
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        boolean cleanup = merge3.cleanup();
        merge init = cleanup ? merge2 : merge2.init(merge3);
        merge instance = cleanup ? merge3 : merge3.getInstance();
        merge sDKVersion = configure.getSDKVersion();
        if (!cleanup) {
            sDKVersion = sDKVersion.init(instance);
        }
        merge cca_continue = merge2.getInstance().cca_continue(init).cca_continue(sDKVersion);
        if (cca_continue.onCReqSuccess()) {
            return new canWrite(configure, cca_continue, configure.cleanup().getWarnings(), this.Cardinal);
        }
        merge instance2 = cca_continue.getInstance();
        merge init2 = cleanup ? cca_continue : cca_continue.init(instance);
        if (!cleanup) {
            merge = merge.init(merge3);
        }
        return new canWrite(configure, instance2, merge.configure(cca_continue, init).cca_continue(instance2).cca_continue(init2), new merge[]{init2}, this.Cardinal);
    }

    public final merge getSDKVersion() {
        merge merge = this.init;
        merge merge2 = this.cca_continue;
        if (getString() || merge.onCReqSuccess()) {
            return merge2;
        }
        merge init = merge2.cca_continue(merge).init(merge);
        merge merge3 = this.getInstance[0];
        return !merge3.cleanup() ? init.getInstance(merge3) : init;
    }

    public final JSONNavi init() {
        return new canWrite((toJSONString) null, onCReqSuccess(), getWarnings());
    }
}
