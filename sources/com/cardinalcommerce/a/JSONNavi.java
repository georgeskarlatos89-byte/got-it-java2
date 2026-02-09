package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.merge;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import java.util.Hashtable;

public abstract class JSONNavi {
    private static merge[] getWarnings = new merge[0];
    public boolean Cardinal;
    public merge cca_continue;
    public toJSONString configure;
    public merge[] getInstance;
    protected Hashtable getSDKVersion;
    public merge init;

    public static abstract class Cardinal extends JSONNavi {
        public Cardinal(toJSONString tojsonstring, merge merge, merge merge2) {
            super(tojsonstring, merge, merge2);
        }

        public Cardinal(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr) {
            super(tojsonstring, merge, merge2, mergeArr);
        }

        public final JSONNavi Cardinal(JSONNavi jSONNavi) {
            return jSONNavi.getString() ? this : cca_continue(jSONNavi.CardinalChallengeObserver());
        }

        /* access modifiers changed from: protected */
        public final boolean Cardinal() {
            merge merge = this.init;
            merge merge2 = this.cca_continue;
            merge sDKVersion = this.configure.getSDKVersion();
            merge cleanup = this.configure.cleanup();
            merge instance = merge2.getInstance();
            int cleanup2 = cleanup();
            if (cleanup2 != 0) {
                if (cleanup2 == 1) {
                    merge merge3 = this.getInstance[0];
                    if (!merge3.cleanup()) {
                        merge instance2 = merge3.getInstance();
                        merge init = merge3.init(instance2);
                        instance = instance.init(merge3);
                        sDKVersion = sDKVersion.init(instance2);
                        cleanup = cleanup.init(init);
                    }
                } else if (cleanup2 == 2 || cleanup2 == 3 || cleanup2 == 4) {
                    merge merge4 = this.getInstance[0];
                    if (!merge4.cleanup()) {
                        merge instance3 = merge4.getInstance();
                        merge instance4 = instance3.getInstance();
                        merge init2 = instance3.init(instance4);
                        sDKVersion = sDKVersion.init(instance4);
                        cleanup = cleanup.init(init2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return instance.equals(merge.getInstance().cca_continue(sDKVersion).init(merge).cca_continue(cleanup));
        }

        /* access modifiers changed from: protected */
        public final boolean CardinalActionCode() {
            return getWarnings().values();
        }
    }

    public static class cca_continue extends init {
        public cca_continue(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
            super(tojsonstring, merge, merge2);
            if ((merge == null) == (merge2 != null ? false : true)) {
                if (merge != null) {
                    merge.configure.Cardinal(this.init, this.cca_continue);
                    if (tojsonstring != null) {
                        merge.configure.Cardinal(this.init, this.configure.getSDKVersion());
                    }
                }
                this.Cardinal = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        cca_continue(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
            super(tojsonstring, merge, merge2, mergeArr);
            this.Cardinal = z;
        }

        /* access modifiers changed from: protected */
        public final boolean CardinalActionCode() {
            merge valueOf = valueOf();
            if (valueOf.onCReqSuccess()) {
                return false;
            }
            merge CardinalEnvironment = CardinalEnvironment();
            int cleanup = cleanup();
            return (cleanup == 5 || cleanup == 6) ? CardinalEnvironment.values() != valueOf.values() : CardinalEnvironment.getInstance(valueOf).values();
        }

        public final JSONNavi CardinalChallengeObserver() {
            if (getString()) {
                return this;
            }
            merge merge = this.init;
            if (merge.onCReqSuccess()) {
                return this;
            }
            int cleanup = cleanup();
            if (cleanup == 0) {
                return new cca_continue(this.configure, merge, this.cca_continue.cca_continue(merge), this.Cardinal);
            } else if (cleanup == 1) {
                merge merge2 = this.cca_continue;
                merge merge3 = this.getInstance[0];
                return new cca_continue(this.configure, merge, merge2.cca_continue(merge), new merge[]{merge3}, this.Cardinal);
            } else if (cleanup == 5) {
                return new cca_continue(this.configure, merge, this.cca_continue.configure(), this.Cardinal);
            } else if (cleanup == 6) {
                merge merge4 = this.cca_continue;
                merge merge5 = this.getInstance[0];
                return new cca_continue(this.configure, merge, merge4.cca_continue(merge5), new merge[]{merge5}, this.Cardinal);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public final JSONNavi cca_continue(JSONNavi jSONNavi) {
            merge merge;
            merge merge2;
            merge merge3;
            merge merge4;
            merge merge5;
            merge merge6;
            JSONNavi jSONNavi2 = jSONNavi;
            if (getString()) {
                return jSONNavi2;
            }
            if (jSONNavi.getString()) {
                return this;
            }
            toJSONString configure = configure();
            int valueOf = configure.valueOf();
            merge merge7 = this.init;
            merge merge8 = jSONNavi2.init;
            if (valueOf == 0) {
                merge merge9 = this.cca_continue;
                merge merge10 = jSONNavi2.cca_continue;
                merge cca_continue = merge7.cca_continue(merge8);
                merge cca_continue2 = merge9.cca_continue(merge10);
                if (cca_continue.onCReqSuccess()) {
                    return cca_continue2.onCReqSuccess() ? getActionCode() : configure.init();
                }
                merge instance = cca_continue2.getInstance(cca_continue);
                merge cca_continue3 = instance.getInstance().cca_continue(instance).cca_continue(cca_continue).cca_continue(configure.getSDKVersion());
                return new cca_continue(configure, cca_continue3, instance.init(merge7.cca_continue(cca_continue3)).cca_continue(cca_continue3).cca_continue(merge9), this.Cardinal);
            } else if (valueOf == 1) {
                merge merge11 = this.cca_continue;
                merge merge12 = this.getInstance[0];
                merge merge13 = jSONNavi2.cca_continue;
                merge merge14 = jSONNavi2.getInstance[0];
                boolean cleanup = merge14.cleanup();
                merge cca_continue4 = merge12.init(merge13).cca_continue(cleanup ? merge11 : merge11.init(merge14));
                merge cca_continue5 = merge12.init(merge8).cca_continue(cleanup ? merge7 : merge7.init(merge14));
                if (cca_continue5.onCReqSuccess()) {
                    return cca_continue4.onCReqSuccess() ? getActionCode() : configure.init();
                }
                merge instance2 = cca_continue5.getInstance();
                merge init = instance2.init(cca_continue5);
                if (!cleanup) {
                    merge12 = merge12.init(merge14);
                }
                merge cca_continue6 = cca_continue4.cca_continue(cca_continue5);
                merge cca_continue7 = cca_continue6.Cardinal(cca_continue4, instance2, configure.getSDKVersion()).init(merge12).cca_continue(init);
                merge init2 = cca_continue5.init(cca_continue7);
                if (!cleanup) {
                    instance2 = instance2.init(merge14);
                }
                return new cca_continue(configure, init2, cca_continue4.Cardinal(merge7, cca_continue5, merge11).Cardinal(instance2, cca_continue6, cca_continue7), new merge[]{init.init(merge12)}, this.Cardinal);
            } else if (valueOf != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (merge7.onCReqSuccess()) {
                return merge8.onCReqSuccess() ? configure.init() : jSONNavi2.cca_continue(this);
            } else {
                merge merge15 = this.cca_continue;
                merge merge16 = this.getInstance[0];
                merge merge17 = jSONNavi2.cca_continue;
                merge merge18 = jSONNavi2.getInstance[0];
                boolean cleanup2 = merge16.cleanup();
                if (!cleanup2) {
                    merge2 = merge8.init(merge16);
                    merge = merge17.init(merge16);
                } else {
                    merge2 = merge8;
                    merge = merge17;
                }
                boolean cleanup3 = merge18.cleanup();
                if (!cleanup3) {
                    merge7 = merge7.init(merge18);
                    merge3 = merge15.init(merge18);
                } else {
                    merge3 = merge15;
                }
                merge cca_continue8 = merge3.cca_continue(merge);
                merge cca_continue9 = merge7.cca_continue(merge2);
                if (cca_continue9.onCReqSuccess()) {
                    return cca_continue8.onCReqSuccess() ? getActionCode() : configure.init();
                }
                if (merge8.onCReqSuccess()) {
                    JSONNavi CardinalRenderType = CardinalRenderType();
                    merge onValidated = CardinalRenderType.onValidated();
                    merge sDKVersion = CardinalRenderType.getSDKVersion();
                    merge instance3 = sDKVersion.cca_continue(merge17).getInstance(onValidated);
                    merge4 = instance3.getInstance().cca_continue(instance3).cca_continue(onValidated).cca_continue(configure.getSDKVersion());
                    if (merge4.onCReqSuccess()) {
                        return new cca_continue(configure, merge4, configure.cleanup().getWarnings(), this.Cardinal);
                    }
                    merge6 = instance3.init(onValidated.cca_continue(merge4)).cca_continue(merge4).cca_continue(sDKVersion).getInstance(merge4).cca_continue(merge4);
                    merge5 = configure.init(writeJSONString.CardinalRenderType);
                } else {
                    merge instance4 = cca_continue9.getInstance();
                    merge init3 = cca_continue8.init(merge7);
                    merge init4 = cca_continue8.init(merge2);
                    merge init5 = init3.init(init4);
                    if (init5.onCReqSuccess()) {
                        return new cca_continue(configure, init5, configure.cleanup().getWarnings(), this.Cardinal);
                    }
                    merge init6 = cca_continue8.init(instance4);
                    merge init7 = !cleanup3 ? init6.init(merge18) : init6;
                    merge configure2 = init4.cca_continue(instance4).configure(init7, merge15.cca_continue(merge16));
                    if (!cleanup2) {
                        init7 = init7.init(merge16);
                    }
                    merge4 = init5;
                    merge merge19 = configure2;
                    merge5 = init7;
                    merge6 = merge19;
                }
                return new cca_continue(configure, merge4, merge6, new merge[]{merge5}, this.Cardinal);
            }
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
            if (configure.valueOf() != 6) {
                return getActionCode().cca_continue(jSONNavi);
            }
            merge merge2 = jSONNavi.init;
            merge merge3 = jSONNavi.getInstance[0];
            if (merge2.onCReqSuccess() || !merge3.cleanup()) {
                return getActionCode().cca_continue(jSONNavi);
            }
            merge merge4 = this.cca_continue;
            merge merge5 = this.getInstance[0];
            merge merge6 = jSONNavi.cca_continue;
            merge instance = merge.getInstance();
            merge instance2 = merge4.getInstance();
            merge instance3 = merge5.getInstance();
            merge cca_continue = configure.getSDKVersion().init(instance3).cca_continue(instance2).cca_continue(merge4.init(merge5));
            merge configure2 = merge6.configure();
            merge Cardinal = configure.getSDKVersion().cca_continue(configure2).init(instance3).cca_continue(instance2).Cardinal(cca_continue, instance, instance3);
            merge init = merge2.init(instance3);
            merge instance4 = init.cca_continue(cca_continue).getInstance();
            if (instance4.onCReqSuccess()) {
                return Cardinal.onCReqSuccess() ? jSONNavi.getActionCode() : configure.init();
            }
            if (Cardinal.onCReqSuccess()) {
                return new cca_continue(configure, Cardinal, configure.cleanup().getWarnings(), this.Cardinal);
            }
            merge init2 = Cardinal.getInstance().init(init);
            merge init3 = Cardinal.init(instance4).init(instance3);
            return new cca_continue(configure, init2, Cardinal.cca_continue(instance4).getInstance().Cardinal(cca_continue, configure2, init3), new merge[]{init3}, this.Cardinal);
        }

        public final JSONNavi getActionCode() {
            merge merge;
            if (getString()) {
                return this;
            }
            toJSONString configure = configure();
            merge merge2 = this.init;
            if (merge2.onCReqSuccess()) {
                return configure.init();
            }
            int valueOf = configure.valueOf();
            if (valueOf == 0) {
                toJSONString tojsonstring = configure;
                merge cca_continue = this.cca_continue.getInstance(merge2).cca_continue(merge2);
                merge cca_continue2 = cca_continue.getInstance().cca_continue(cca_continue).cca_continue(tojsonstring.getSDKVersion());
                return new cca_continue(tojsonstring, cca_continue2, merge2.configure(cca_continue2, cca_continue.configure()), this.Cardinal);
            } else if (valueOf == 1) {
                toJSONString tojsonstring2 = configure;
                merge merge3 = this.cca_continue;
                merge merge4 = this.getInstance[0];
                boolean cleanup = merge4.cleanup();
                merge init = cleanup ? merge2 : merge2.init(merge4);
                if (!cleanup) {
                    merge3 = merge3.init(merge4);
                }
                merge instance = merge2.getInstance();
                merge cca_continue3 = instance.cca_continue(merge3);
                merge instance2 = init.getInstance();
                merge cca_continue4 = cca_continue3.cca_continue(init);
                merge Cardinal = cca_continue4.Cardinal(cca_continue3, instance2, tojsonstring2.getSDKVersion());
                return new cca_continue(tojsonstring2, init.init(Cardinal), instance.getInstance().Cardinal(init, Cardinal, cca_continue4), new merge[]{init.init(instance2)}, this.Cardinal);
            } else if (valueOf == 6) {
                merge merge5 = this.cca_continue;
                merge merge6 = this.getInstance[0];
                boolean cleanup2 = merge6.cleanup();
                merge init2 = cleanup2 ? merge5 : merge5.init(merge6);
                merge instance3 = cleanup2 ? merge6 : merge6.getInstance();
                merge sDKVersion = configure.getSDKVersion();
                merge init3 = cleanup2 ? sDKVersion : sDKVersion.init(instance3);
                merge cca_continue5 = merge5.getInstance().cca_continue(init2).cca_continue(init3);
                if (cca_continue5.onCReqSuccess()) {
                    return new cca_continue(configure, cca_continue5, configure.cleanup().getWarnings(), this.Cardinal);
                }
                merge instance4 = cca_continue5.getInstance();
                merge init4 = cleanup2 ? cca_continue5 : cca_continue5.init(instance3);
                merge cleanup3 = configure.cleanup();
                toJSONString tojsonstring3 = configure;
                if (cleanup3.getSDKVersion() < (configure.getInstance() >> 1)) {
                    merge instance5 = merge5.cca_continue(merge2).getInstance();
                    merge = instance5.cca_continue(cca_continue5).cca_continue(instance3).init(instance5).cca_continue(cleanup3.cleanup() ? init3.cca_continue(instance3).getInstance() : init3.configure(cleanup3, instance3.getInstance())).cca_continue(instance4);
                    if (!sDKVersion.onCReqSuccess()) {
                        if (!sDKVersion.cleanup()) {
                            merge = merge.cca_continue(sDKVersion.configure().init(init4));
                        }
                        return new cca_continue(tojsonstring3, instance4, merge, new merge[]{init4}, this.Cardinal);
                    }
                } else {
                    if (!cleanup2) {
                        merge2 = merge2.init(merge6);
                    }
                    merge = merge2.configure(cca_continue5, init2).cca_continue(instance4);
                }
                merge = merge.cca_continue(init4);
                return new cca_continue(tojsonstring3, instance4, merge, new merge[]{init4}, this.Cardinal);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public final merge getSDKVersion() {
            int cleanup = cleanup();
            if (cleanup != 5 && cleanup != 6) {
                return this.cca_continue;
            }
            merge merge = this.init;
            merge merge2 = this.cca_continue;
            if (getString() || merge.onCReqSuccess()) {
                return merge2;
            }
            merge init = merge2.cca_continue(merge).init(merge);
            if (6 != cleanup) {
                return init;
            }
            merge merge3 = this.getInstance[0];
            return !merge3.cleanup() ? init.getInstance(merge3) : init;
        }

        /* access modifiers changed from: protected */
        public final JSONNavi init() {
            return new cca_continue((toJSONString) null, onCReqSuccess(), getWarnings(), false);
        }
    }

    public static abstract class init extends JSONNavi {
        public init(toJSONString tojsonstring, merge merge, merge merge2) {
            super(tojsonstring, merge, merge2);
        }

        public init(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr) {
            super(tojsonstring, merge, merge2, mergeArr);
        }

        public final JSONNavi Cardinal(JSONNavi jSONNavi) {
            return jSONNavi.getString() ? this : cca_continue(jSONNavi.CardinalChallengeObserver());
        }

        /* access modifiers changed from: protected */
        public final boolean Cardinal() {
            merge merge;
            merge merge2;
            toJSONString configure = configure();
            merge merge3 = this.init;
            merge sDKVersion = configure.getSDKVersion();
            merge cleanup = configure.cleanup();
            int valueOf = configure.valueOf();
            if (valueOf == 6) {
                merge merge4 = this.getInstance[0];
                boolean cleanup2 = merge4.cleanup();
                if (merge3.onCReqSuccess()) {
                    merge instance = this.cca_continue.getInstance();
                    if (!cleanup2) {
                        cleanup = cleanup.init(merge4.getInstance());
                    }
                    return instance.equals(cleanup);
                }
                merge merge5 = this.cca_continue;
                merge instance2 = merge3.getInstance();
                if (cleanup2) {
                    merge2 = merge5.getInstance().cca_continue(merge5).cca_continue(sDKVersion);
                    merge = instance2.getInstance().cca_continue(cleanup);
                } else {
                    merge instance3 = merge4.getInstance();
                    merge instance4 = instance3.getInstance();
                    merge2 = merge5.cca_continue(merge4).Cardinal(merge5, sDKVersion, instance3);
                    merge = instance2.configure(cleanup, instance4);
                }
                return merge2.init(instance2).equals(merge);
            }
            merge merge6 = this.cca_continue;
            merge init = merge6.cca_continue(merge3).init(merge6);
            if (valueOf != 0) {
                if (valueOf == 1) {
                    merge merge7 = this.getInstance[0];
                    if (!merge7.cleanup()) {
                        merge init2 = merge7.init(merge7.getInstance());
                        init = init.init(merge7);
                        sDKVersion = sDKVersion.init(merge7);
                        cleanup = cleanup.init(init2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return init.equals(merge3.cca_continue(sDKVersion).init(merge3.getInstance()).cca_continue(cleanup));
        }

        public final JSONNavi configure(merge merge) {
            if (getString()) {
                return this;
            }
            int cleanup = cleanup();
            if (cleanup == 5) {
                merge valueOf = valueOf();
                merge CardinalEnvironment = CardinalEnvironment();
                return configure().cca_continue(valueOf, CardinalEnvironment.cca_continue(valueOf).getInstance(merge).cca_continue(valueOf.init(merge)), values(), this.Cardinal);
            } else if (cleanup != 6) {
                return JSONNavi.super.configure(merge);
            } else {
                merge valueOf2 = valueOf();
                merge CardinalEnvironment2 = CardinalEnvironment();
                merge merge2 = values()[0];
                merge init = valueOf2.init(merge.getInstance());
                merge cca_continue = CardinalEnvironment2.cca_continue(valueOf2).cca_continue(init);
                merge init2 = merge2.init(merge);
                return configure().cca_continue(init, cca_continue, new merge[]{init2}, this.Cardinal);
            }
        }

        public final JSONNavi getInstance(merge merge) {
            if (getString()) {
                return this;
            }
            int cleanup = cleanup();
            if (cleanup != 5 && cleanup != 6) {
                return JSONNavi.super.getInstance(merge);
            }
            merge valueOf = valueOf();
            return configure().cca_continue(valueOf, CardinalEnvironment().cca_continue(valueOf).init(merge).cca_continue(valueOf), values(), this.Cardinal);
        }

        /* access modifiers changed from: protected */
        public final boolean getInstance() {
            BigInteger onValidated = this.configure.onValidated();
            if (writeJSONString.CardinalEnvironment.equals(onValidated)) {
                return ((merge.Cardinal) CardinalRenderType().onCReqSuccess().cca_continue(this.configure.getSDKVersion())).CardinalError() == 0;
            }
            if (!writeJSONString.CardinalError.equals(onValidated)) {
                return JSONNavi.super.getInstance();
            }
            JSONNavi CardinalRenderType = CardinalRenderType();
            merge onCReqSuccess = CardinalRenderType.onCReqSuccess();
            merge Cardinal = ((toJSONString.cca_continue) this.configure).Cardinal(onCReqSuccess.cca_continue(this.configure.getSDKVersion()));
            if (Cardinal == null) {
                return false;
            }
            merge cca_continue = onCReqSuccess.init(Cardinal).cca_continue(CardinalRenderType.getWarnings()).cca_continue(this.configure.getSDKVersion());
            return ((merge.Cardinal) cca_continue).CardinalError() == 0 || ((merge.Cardinal) cca_continue.cca_continue(onCReqSuccess)).CardinalError() == 0;
        }

        public final init init(int i) {
            JSONNavi cca_continue;
            if (getString()) {
                return this;
            }
            toJSONString configure = configure();
            int valueOf = configure.valueOf();
            merge merge = this.init;
            if (valueOf != 0) {
                if (valueOf != 1) {
                    if (valueOf != 5) {
                        if (valueOf != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                merge merge2 = this.cca_continue;
                merge merge3 = this.getInstance[0];
                cca_continue = configure.cca_continue(merge.init(i), merge2.init(i), new merge[]{merge3.init(i)}, this.Cardinal);
                return (init) cca_continue;
            }
            cca_continue = configure.cca_continue(merge.init(i), this.cca_continue.init(i), this.Cardinal);
            return (init) cca_continue;
        }
    }

    protected JSONNavi(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr) {
        this.getSDKVersion = null;
        this.configure = tojsonstring;
        this.init = merge;
        this.cca_continue = merge2;
        this.getInstance = mergeArr;
    }

    public JSONNavi Cardinal(int i) {
        if (i >= 0) {
            JSONNavi jSONNavi = this;
            while (true) {
                i--;
                if (i < 0) {
                    return jSONNavi;
                }
                jSONNavi = jSONNavi.getActionCode();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract JSONNavi Cardinal(JSONNavi jSONNavi);

    /* access modifiers changed from: protected */
    public abstract boolean Cardinal();

    /* access modifiers changed from: protected */
    public abstract boolean CardinalActionCode();

    public abstract JSONNavi CardinalChallengeObserver();

    public final merge CardinalEnvironment() {
        return this.cca_continue;
    }

    public JSONNavi CardinalUiType() {
        return configure(this);
    }

    public final JSONNavi cca_continue() {
        return CardinalRenderType().init();
    }

    public abstract JSONNavi cca_continue(JSONNavi jSONNavi);

    /* access modifiers changed from: protected */
    public final int cleanup() {
        toJSONString tojsonstring = this.configure;
        if (tojsonstring == null) {
            return 0;
        }
        return tojsonstring.valueOf();
    }

    public JSONNavi configure(JSONNavi jSONNavi) {
        return getActionCode().cca_continue(jSONNavi);
    }

    public final toJSONString configure() {
        return this.configure;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JSONNavi)) {
            return false;
        }
        return init((JSONNavi) obj);
    }

    public abstract JSONNavi getActionCode();

    public merge getInstance(int i) {
        if (i < 0) {
            return null;
        }
        merge[] mergeArr = this.getInstance;
        if (i >= mergeArr.length) {
            return null;
        }
        return mergeArr[i];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = r2.configure.onCReqSuccess();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getInstance() {
        /*
            r2 = this;
            java.math.BigInteger r0 = com.cardinalcommerce.a.writeJSONString.CardinalRenderType
            com.cardinalcommerce.a.toJSONString r1 = r2.configure
            java.math.BigInteger r1 = r1.onValidated()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            com.cardinalcommerce.a.toJSONString r0 = r2.configure
            java.math.BigInteger r0 = r0.onCReqSuccess()
            if (r0 == 0) goto L_0x0025
            com.cardinalcommerce.a.JSONNavi r0 = com.cardinalcommerce.a.appendElement.cca_continue(r2, r0)
            boolean r0 = r0.getString()
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONNavi.getInstance():boolean");
    }

    public merge getSDKVersion() {
        return this.cca_continue;
    }

    public final boolean getString() {
        if (this.init == null || this.cca_continue == null) {
            return true;
        }
        merge[] mergeArr = this.getInstance;
        return mergeArr.length > 0 && mergeArr[0].onCReqSuccess();
    }

    /* access modifiers changed from: protected */
    public abstract JSONNavi init();

    public final merge onValidated() {
        return this.init;
    }

    public final merge valueOf() {
        return this.init;
    }

    /* access modifiers changed from: protected */
    public final merge[] values() {
        return this.getInstance;
    }

    public static class configure extends Cardinal {
        public configure(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
            super(tojsonstring, merge, merge2);
            if ((merge == null) == (merge2 != null ? false : true)) {
                this.Cardinal = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        configure(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
            super(tojsonstring, merge, merge2, mergeArr);
            this.Cardinal = z;
        }

        private merge configure(merge merge, merge merge2) {
            merge sDKVersion = configure().getSDKVersion();
            if (sDKVersion.onCReqSuccess() || merge.cleanup()) {
                return sDKVersion;
            }
            if (merge2 == null) {
                merge2 = merge.getInstance();
            }
            merge instance = merge2.getInstance();
            merge init = sDKVersion.init();
            return init.getSDKVersion() < sDKVersion.getSDKVersion() ? instance.init(init).init() : instance.init(sDKVersion);
        }

        public final JSONNavi CardinalChallengeObserver() {
            if (getString()) {
                return this;
            }
            toJSONString configure = configure();
            return configure.valueOf() != 0 ? new configure(configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal) : new configure(configure, this.init, this.cca_continue.init(), this.Cardinal);
        }

        /* access modifiers changed from: protected */
        public final JSONNavi init() {
            return new configure((toJSONString) null, onCReqSuccess(), getWarnings(), false);
        }

        public final merge getInstance(int i) {
            if (i != 1 || 4 != cleanup()) {
                return super.getInstance(i);
            }
            merge merge = this.getInstance[1];
            if (merge != null) {
                return merge;
            }
            merge[] mergeArr = this.getInstance;
            merge configure = configure(this.getInstance[0], (merge) null);
            mergeArr[1] = configure;
            return configure;
        }

        /* JADX WARNING: type inference failed for: r17v0, types: [com.cardinalcommerce.a.JSONNavi] */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
            if (r1 == r6) goto L_0x0125;
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.cardinalcommerce.a.JSONNavi cca_continue(com.cardinalcommerce.a.JSONNavi r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                boolean r2 = r16.getString()
                if (r2 == 0) goto L_0x000b
                return r1
            L_0x000b:
                boolean r2 = r17.getString()
                if (r2 == 0) goto L_0x0012
                return r0
            L_0x0012:
                if (r0 != r1) goto L_0x0019
                com.cardinalcommerce.a.JSONNavi r1 = r16.getActionCode()
                return r1
            L_0x0019:
                com.cardinalcommerce.a.toJSONString r3 = r16.configure()
                int r2 = r3.valueOf()
                com.cardinalcommerce.a.merge r4 = r0.init
                com.cardinalcommerce.a.merge r5 = r0.cca_continue
                com.cardinalcommerce.a.merge r6 = r1.init
                com.cardinalcommerce.a.merge r7 = r1.cca_continue
                if (r2 == 0) goto L_0x01dd
                r8 = 1
                r9 = 0
                if (r2 == r8) goto L_0x0145
                r10 = 4
                r11 = 2
                if (r2 == r11) goto L_0x003e
                if (r2 != r10) goto L_0x0036
                goto L_0x003e
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                com.cardinalcommerce.a.merge[] r12 = r0.getInstance
                r12 = r12[r9]
                com.cardinalcommerce.a.merge[] r1 = r1.getInstance
                r1 = r1[r9]
                boolean r13 = r12.cleanup()
                if (r13 != 0) goto L_0x00a5
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto L_0x00a5
                com.cardinalcommerce.a.merge r1 = r4.Cardinal(r6)
                com.cardinalcommerce.a.merge r7 = r5.Cardinal(r7)
                boolean r13 = r1.onCReqSuccess()
                if (r13 == 0) goto L_0x0070
                boolean r1 = r7.onCReqSuccess()
                if (r1 == 0) goto L_0x006b
                com.cardinalcommerce.a.JSONNavi r1 = r16.getActionCode()
                return r1
            L_0x006b:
                com.cardinalcommerce.a.JSONNavi r1 = r3.init()
                return r1
            L_0x0070:
                com.cardinalcommerce.a.merge r13 = r1.getInstance()
                com.cardinalcommerce.a.merge r4 = r4.init((com.cardinalcommerce.a.merge) r13)
                com.cardinalcommerce.a.merge r6 = r6.init((com.cardinalcommerce.a.merge) r13)
                com.cardinalcommerce.a.merge r13 = r4.Cardinal(r6)
                com.cardinalcommerce.a.merge r5 = r13.init((com.cardinalcommerce.a.merge) r5)
                com.cardinalcommerce.a.merge r13 = r7.getInstance()
                com.cardinalcommerce.a.merge r13 = r13.Cardinal(r4)
                com.cardinalcommerce.a.merge r6 = r13.Cardinal(r6)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r6)
                com.cardinalcommerce.a.merge r4 = r4.init((com.cardinalcommerce.a.merge) r7)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r5)
                com.cardinalcommerce.a.merge r1 = r1.init((com.cardinalcommerce.a.merge) r12)
                r5 = r4
                r4 = r6
            L_0x00a2:
                r14 = 0
                goto L_0x0125
            L_0x00a5:
                if (r13 == 0) goto L_0x00a8
                goto L_0x00b8
            L_0x00a8:
                com.cardinalcommerce.a.merge r15 = r12.getInstance()
                com.cardinalcommerce.a.merge r6 = r15.init((com.cardinalcommerce.a.merge) r6)
                com.cardinalcommerce.a.merge r15 = r15.init((com.cardinalcommerce.a.merge) r12)
                com.cardinalcommerce.a.merge r7 = r15.init((com.cardinalcommerce.a.merge) r7)
            L_0x00b8:
                boolean r15 = r1.cleanup()
                if (r15 == 0) goto L_0x00bf
                goto L_0x00cf
            L_0x00bf:
                com.cardinalcommerce.a.merge r14 = r1.getInstance()
                com.cardinalcommerce.a.merge r4 = r14.init((com.cardinalcommerce.a.merge) r4)
                com.cardinalcommerce.a.merge r14 = r14.init((com.cardinalcommerce.a.merge) r1)
                com.cardinalcommerce.a.merge r5 = r14.init((com.cardinalcommerce.a.merge) r5)
            L_0x00cf:
                com.cardinalcommerce.a.merge r6 = r4.Cardinal(r6)
                com.cardinalcommerce.a.merge r7 = r5.Cardinal(r7)
                boolean r14 = r6.onCReqSuccess()
                if (r14 == 0) goto L_0x00ed
                boolean r1 = r7.onCReqSuccess()
                if (r1 == 0) goto L_0x00e8
                com.cardinalcommerce.a.JSONNavi r1 = r16.getActionCode()
                return r1
            L_0x00e8:
                com.cardinalcommerce.a.JSONNavi r1 = r3.init()
                return r1
            L_0x00ed:
                com.cardinalcommerce.a.merge r14 = r6.getInstance()
                com.cardinalcommerce.a.merge r8 = r14.init((com.cardinalcommerce.a.merge) r6)
                com.cardinalcommerce.a.merge r4 = r14.init((com.cardinalcommerce.a.merge) r4)
                com.cardinalcommerce.a.merge r9 = r7.getInstance()
                com.cardinalcommerce.a.merge r9 = r9.cca_continue(r8)
                com.cardinalcommerce.a.merge r11 = r4.cca_continue(r4)
                com.cardinalcommerce.a.merge r9 = r9.Cardinal(r11)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r9)
                com.cardinalcommerce.a.merge r4 = r4.configure(r7, r8, r5)
                if (r13 != 0) goto L_0x0118
                com.cardinalcommerce.a.merge r5 = r6.init((com.cardinalcommerce.a.merge) r12)
                goto L_0x0119
            L_0x0118:
                r5 = r6
            L_0x0119:
                if (r15 != 0) goto L_0x0120
                com.cardinalcommerce.a.merge r1 = r5.init((com.cardinalcommerce.a.merge) r1)
                goto L_0x0121
            L_0x0120:
                r1 = r5
            L_0x0121:
                r5 = r4
                r4 = r9
                if (r1 != r6) goto L_0x00a2
            L_0x0125:
                if (r2 != r10) goto L_0x0135
                com.cardinalcommerce.a.merge r2 = r0.configure(r1, r14)
                r6 = 2
                com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
                r7 = 0
                r6[r7] = r1
                r8 = 1
                r6[r8] = r2
                goto L_0x013c
            L_0x0135:
                r7 = 0
                r8 = 1
                com.cardinalcommerce.a.merge[] r2 = new com.cardinalcommerce.a.merge[r8]
                r2[r7] = r1
                r6 = r2
            L_0x013c:
                com.cardinalcommerce.a.JSONNavi$configure r1 = new com.cardinalcommerce.a.JSONNavi$configure
                boolean r7 = r0.Cardinal
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x0145:
                com.cardinalcommerce.a.merge[] r2 = r0.getInstance
                r8 = 0
                r2 = r2[r8]
                com.cardinalcommerce.a.merge[] r1 = r1.getInstance
                r1 = r1[r8]
                boolean r8 = r2.cleanup()
                boolean r9 = r1.cleanup()
                if (r8 == 0) goto L_0x0159
                goto L_0x015d
            L_0x0159:
                com.cardinalcommerce.a.merge r7 = r7.init((com.cardinalcommerce.a.merge) r2)
            L_0x015d:
                if (r9 == 0) goto L_0x0160
                goto L_0x0164
            L_0x0160:
                com.cardinalcommerce.a.merge r5 = r5.init((com.cardinalcommerce.a.merge) r1)
            L_0x0164:
                com.cardinalcommerce.a.merge r7 = r7.Cardinal(r5)
                if (r8 == 0) goto L_0x016b
                goto L_0x016f
            L_0x016b:
                com.cardinalcommerce.a.merge r6 = r6.init((com.cardinalcommerce.a.merge) r2)
            L_0x016f:
                if (r9 == 0) goto L_0x0172
                goto L_0x0176
            L_0x0172:
                com.cardinalcommerce.a.merge r4 = r4.init((com.cardinalcommerce.a.merge) r1)
            L_0x0176:
                com.cardinalcommerce.a.merge r6 = r6.Cardinal(r4)
                boolean r10 = r6.onCReqSuccess()
                if (r10 == 0) goto L_0x0190
                boolean r1 = r7.onCReqSuccess()
                if (r1 == 0) goto L_0x018b
                com.cardinalcommerce.a.JSONNavi r1 = r16.getActionCode()
                return r1
            L_0x018b:
                com.cardinalcommerce.a.JSONNavi r1 = r3.init()
                return r1
            L_0x0190:
                if (r8 == 0) goto L_0x0194
                r2 = r1
                goto L_0x019b
            L_0x0194:
                if (r9 == 0) goto L_0x0197
                goto L_0x019b
            L_0x0197:
                com.cardinalcommerce.a.merge r2 = r2.init((com.cardinalcommerce.a.merge) r1)
            L_0x019b:
                com.cardinalcommerce.a.merge r1 = r6.getInstance()
                com.cardinalcommerce.a.merge r8 = r1.init((com.cardinalcommerce.a.merge) r6)
                com.cardinalcommerce.a.merge r1 = r1.init((com.cardinalcommerce.a.merge) r4)
                com.cardinalcommerce.a.merge r4 = r7.getInstance()
                com.cardinalcommerce.a.merge r4 = r4.init((com.cardinalcommerce.a.merge) r2)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r8)
                com.cardinalcommerce.a.merge r9 = r1.cca_continue(r1)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r9)
                com.cardinalcommerce.a.merge r6 = r6.init((com.cardinalcommerce.a.merge) r4)
                com.cardinalcommerce.a.merge r1 = r1.Cardinal(r4)
                com.cardinalcommerce.a.merge r5 = r1.configure(r7, r5, r8)
                com.cardinalcommerce.a.merge r1 = r8.init((com.cardinalcommerce.a.merge) r2)
                com.cardinalcommerce.a.JSONNavi$configure r8 = new com.cardinalcommerce.a.JSONNavi$configure
                r2 = 1
                com.cardinalcommerce.a.merge[] r7 = new com.cardinalcommerce.a.merge[r2]
                r2 = 0
                r7[r2] = r1
                boolean r1 = r0.Cardinal
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L_0x01dd:
                com.cardinalcommerce.a.merge r1 = r6.Cardinal(r4)
                com.cardinalcommerce.a.merge r2 = r7.Cardinal(r5)
                boolean r7 = r1.onCReqSuccess()
                if (r7 == 0) goto L_0x01fb
                boolean r1 = r2.onCReqSuccess()
                if (r1 == 0) goto L_0x01f6
                com.cardinalcommerce.a.JSONNavi r1 = r16.getActionCode()
                return r1
            L_0x01f6:
                com.cardinalcommerce.a.JSONNavi r1 = r3.init()
                return r1
            L_0x01fb:
                com.cardinalcommerce.a.merge r1 = r2.getInstance(r1)
                com.cardinalcommerce.a.merge r2 = r1.getInstance()
                com.cardinalcommerce.a.merge r2 = r2.Cardinal(r4)
                com.cardinalcommerce.a.merge r2 = r2.Cardinal(r6)
                com.cardinalcommerce.a.merge r4 = r4.Cardinal(r2)
                com.cardinalcommerce.a.merge r1 = r1.init((com.cardinalcommerce.a.merge) r4)
                com.cardinalcommerce.a.merge r1 = r1.Cardinal(r5)
                com.cardinalcommerce.a.JSONNavi$configure r4 = new com.cardinalcommerce.a.JSONNavi$configure
                boolean r5 = r0.Cardinal
                r4.<init>(r3, r2, r1, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONNavi.configure.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
        }

        public final JSONNavi getActionCode() {
            merge merge;
            merge merge2;
            merge merge3;
            if (getString()) {
                return this;
            }
            toJSONString configure = configure();
            merge merge4 = this.cca_continue;
            if (merge4.onCReqSuccess()) {
                return configure.init();
            }
            int valueOf = configure.valueOf();
            merge merge5 = this.init;
            if (valueOf == 0) {
                merge instance = merge5.getInstance();
                merge instance2 = instance.cca_continue(instance).cca_continue(instance).cca_continue(configure().getSDKVersion()).getInstance(merge4.cca_continue(merge4));
                merge Cardinal = instance2.getInstance().Cardinal(merge5.cca_continue(merge5));
                return new configure(configure, Cardinal, instance2.init(merge5.Cardinal(Cardinal)).Cardinal(merge4), this.Cardinal);
            } else if (valueOf == 1) {
                merge merge6 = this.getInstance[0];
                boolean cleanup = merge6.cleanup();
                merge sDKVersion = configure.getSDKVersion();
                if (!sDKVersion.onCReqSuccess() && !cleanup) {
                    sDKVersion = sDKVersion.init(merge6.getInstance());
                }
                merge instance3 = merge5.getInstance();
                merge cca_continue = sDKVersion.cca_continue(instance3.cca_continue(instance3).cca_continue(instance3));
                merge init = cleanup ? merge4 : merge4.init(merge6);
                merge instance4 = cleanup ? merge4.getInstance() : init.init(merge4);
                merge init2 = merge5.init(instance4);
                merge cca_continue2 = init2.cca_continue(init2);
                merge cca_continue3 = cca_continue2.cca_continue(cca_continue2);
                merge Cardinal2 = cca_continue.getInstance().Cardinal(cca_continue3.cca_continue(cca_continue3));
                merge cca_continue4 = init.cca_continue(init);
                merge init3 = Cardinal2.init(cca_continue4);
                merge cca_continue5 = instance4.cca_continue(instance4);
                merge init4 = cca_continue3.Cardinal(Cardinal2).init(cca_continue);
                merge instance5 = cca_continue5.getInstance();
                merge Cardinal3 = init4.Cardinal(instance5.cca_continue(instance5));
                if (cleanup) {
                    merge = cca_continue5.cca_continue(cca_continue5);
                } else {
                    merge = cca_continue4.getInstance();
                }
                return new configure(configure, init3, Cardinal3, new merge[]{merge.cca_continue(merge).init(init)}, this.Cardinal);
            } else if (valueOf == 2) {
                merge merge7 = this.getInstance[0];
                boolean cleanup2 = merge7.cleanup();
                merge instance6 = merge4.getInstance();
                merge instance7 = instance6.getInstance();
                merge sDKVersion2 = configure.getSDKVersion();
                merge init5 = sDKVersion2.init();
                if (init5.cca_continue().equals(BigInteger.valueOf(3))) {
                    merge instance8 = cleanup2 ? merge7 : merge7.getInstance();
                    merge init6 = merge5.cca_continue(instance8).init(merge5.Cardinal(instance8));
                    merge2 = init6.cca_continue(init6).cca_continue(init6);
                    merge init7 = instance6.init(merge5);
                    merge cca_continue6 = init7.cca_continue(init7);
                    merge3 = cca_continue6.cca_continue(cca_continue6);
                } else {
                    merge instance9 = merge5.getInstance();
                    merge cca_continue7 = instance9.cca_continue(instance9).cca_continue(instance9);
                    if (!cleanup2) {
                        if (!sDKVersion2.onCReqSuccess()) {
                            merge instance10 = merge7.getInstance().getInstance();
                            if (init5.getSDKVersion() < sDKVersion2.getSDKVersion()) {
                                merge2 = cca_continue7.Cardinal(instance10.init(init5));
                            } else {
                                sDKVersion2 = instance10.init(sDKVersion2);
                            }
                        } else {
                            merge2 = cca_continue7;
                        }
                        merge init8 = merge5.init(instance6);
                        merge cca_continue8 = init8.cca_continue(init8);
                        merge3 = cca_continue8.cca_continue(cca_continue8);
                    }
                    merge2 = cca_continue7.cca_continue(sDKVersion2);
                    merge init82 = merge5.init(instance6);
                    merge cca_continue82 = init82.cca_continue(init82);
                    merge3 = cca_continue82.cca_continue(cca_continue82);
                }
                merge Cardinal4 = merge2.getInstance().Cardinal(merge3.cca_continue(merge3));
                merge init9 = merge3.Cardinal(Cardinal4).init(merge2);
                merge cca_continue9 = instance7.cca_continue(instance7);
                merge cca_continue10 = cca_continue9.cca_continue(cca_continue9);
                merge Cardinal5 = init9.Cardinal(cca_continue10.cca_continue(cca_continue10));
                merge cca_continue11 = merge4.cca_continue(merge4);
                if (!cleanup2) {
                    cca_continue11 = cca_continue11.init(merge7);
                }
                return new configure(configure, Cardinal4, Cardinal5, new merge[]{cca_continue11}, this.Cardinal);
            } else if (valueOf == 4) {
                return getInstance(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public final JSONNavi configure(JSONNavi jSONNavi) {
            if (this == jSONNavi) {
                return CardinalUiType();
            }
            if (getString()) {
                return jSONNavi;
            }
            if (jSONNavi.getString()) {
                return getActionCode();
            }
            merge merge = this.cca_continue;
            if (merge.onCReqSuccess()) {
                return jSONNavi;
            }
            toJSONString configure = configure();
            int valueOf = configure.valueOf();
            if (valueOf != 0) {
                return (valueOf != 4 ? getActionCode() : getInstance(false)).cca_continue(jSONNavi);
            }
            merge merge2 = this.init;
            merge merge3 = jSONNavi.init;
            merge merge4 = jSONNavi.cca_continue;
            merge Cardinal = merge3.Cardinal(merge2);
            merge Cardinal2 = merge4.Cardinal(merge);
            if (Cardinal.onCReqSuccess()) {
                return Cardinal2.onCReqSuccess() ? CardinalUiType() : this;
            }
            merge instance = Cardinal.getInstance();
            merge Cardinal3 = instance.init(merge2.cca_continue(merge2).cca_continue(merge3)).Cardinal(Cardinal2.getInstance());
            if (Cardinal3.onCReqSuccess()) {
                return configure.init();
            }
            merge onValidated = Cardinal3.init(Cardinal).onValidated();
            merge init = Cardinal3.init(onValidated).init(Cardinal2);
            merge Cardinal4 = merge.cca_continue(merge).init(instance).init(Cardinal).init(onValidated).Cardinal(init);
            merge cca_continue = Cardinal4.Cardinal(init).init(init.cca_continue(Cardinal4)).cca_continue(merge3);
            return new configure(configure, cca_continue, merge2.Cardinal(cca_continue).init(Cardinal4).Cardinal(merge), this.Cardinal);
        }

        public final JSONNavi CardinalUiType() {
            if (getString()) {
                return this;
            }
            merge merge = this.cca_continue;
            if (merge.onCReqSuccess()) {
                return this;
            }
            toJSONString configure = configure();
            int valueOf = configure.valueOf();
            if (valueOf != 0) {
                return valueOf != 4 ? getActionCode().cca_continue(this) : getInstance(false).cca_continue(this);
            }
            merge merge2 = this.init;
            merge cca_continue = merge.cca_continue(merge);
            merge instance = cca_continue.getInstance();
            merge instance2 = merge2.getInstance();
            merge cca_continue2 = instance2.cca_continue(instance2).cca_continue(instance2).cca_continue(configure().getSDKVersion());
            merge Cardinal = merge2.cca_continue(merge2).cca_continue(merge2).init(instance).Cardinal(cca_continue2.getInstance());
            if (Cardinal.onCReqSuccess()) {
                return configure().init();
            }
            merge onValidated = Cardinal.init(cca_continue).onValidated();
            merge init = Cardinal.init(onValidated).init(cca_continue2);
            merge Cardinal2 = instance.getInstance().init(onValidated).Cardinal(init);
            merge cca_continue3 = Cardinal2.Cardinal(init).init(init.cca_continue(Cardinal2)).cca_continue(merge2);
            return new configure(configure, cca_continue3, merge2.Cardinal(cca_continue3).init(Cardinal2).Cardinal(merge), this.Cardinal);
        }

        public final JSONNavi Cardinal(int i) {
            merge merge;
            int i2 = i;
            if (i2 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i2 == 0 || getString()) {
                return this;
            } else {
                if (i2 == 1) {
                    return getActionCode();
                }
                toJSONString configure = configure();
                merge merge2 = this.cca_continue;
                if (merge2.onCReqSuccess()) {
                    return configure.init();
                }
                int valueOf = configure.valueOf();
                merge sDKVersion = configure.getSDKVersion();
                merge merge3 = this.init;
                merge init = this.getInstance.length <= 0 ? configure.init(writeJSONString.CardinalRenderType) : this.getInstance[0];
                if (!init.cleanup() && valueOf != 0) {
                    if (valueOf != 1) {
                        merge = null;
                        if (valueOf != 2) {
                            if (valueOf == 4) {
                                merge merge4 = this.getInstance[1];
                                if (merge4 == null) {
                                    merge[] mergeArr = this.getInstance;
                                    sDKVersion = configure(this.getInstance[0], (merge) null);
                                    mergeArr[1] = sDKVersion;
                                } else {
                                    sDKVersion = merge4;
                                }
                            } else {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                        }
                    } else {
                        merge = init.getInstance();
                        merge3 = merge3.init(init);
                        merge2 = merge2.init(merge);
                    }
                    sDKVersion = configure(init, merge);
                }
                int i3 = 0;
                merge merge5 = sDKVersion;
                merge merge6 = merge2;
                merge merge7 = merge3;
                merge merge8 = merge5;
                while (i3 < i2) {
                    if (merge6.onCReqSuccess()) {
                        return configure.init();
                    }
                    merge instance = merge7.getInstance();
                    merge cca_continue = instance.cca_continue(instance).cca_continue(instance);
                    merge cca_continue2 = merge6.cca_continue(merge6);
                    merge init2 = cca_continue2.init(merge6);
                    merge init3 = merge7.init(init2);
                    merge cca_continue3 = init3.cca_continue(init3);
                    merge instance2 = init2.getInstance();
                    merge cca_continue4 = instance2.cca_continue(instance2);
                    if (!merge8.onCReqSuccess()) {
                        cca_continue = cca_continue.cca_continue(merge8);
                        merge init4 = cca_continue4.init(merge8);
                        merge8 = init4.cca_continue(init4);
                    }
                    merge Cardinal = cca_continue.getInstance().Cardinal(cca_continue3.cca_continue(cca_continue3));
                    merge6 = cca_continue.init(cca_continue3.Cardinal(Cardinal)).Cardinal(cca_continue4);
                    init = init.cleanup() ? cca_continue2 : cca_continue2.init(init);
                    i3++;
                    merge7 = Cardinal;
                }
                if (valueOf == 0) {
                    merge onValidated = init.onValidated();
                    merge instance3 = onValidated.getInstance();
                    return new configure(configure, merge7.init(instance3), merge6.init(instance3.init(onValidated)), this.Cardinal);
                } else if (valueOf == 1) {
                    return new configure(configure, merge7.init(init), merge6, new merge[]{init.init(init.getInstance())}, this.Cardinal);
                } else if (valueOf == 2) {
                    return new configure(configure, merge7, merge6, new merge[]{init}, this.Cardinal);
                } else if (valueOf == 4) {
                    return new configure(configure, merge7, merge6, new merge[]{init, merge8}, this.Cardinal);
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        private configure getInstance(boolean z) {
            merge merge = this.init;
            merge merge2 = this.cca_continue;
            merge merge3 = this.getInstance[0];
            merge merge4 = this.getInstance[1];
            merge merge5 = null;
            if (merge4 == null) {
                merge[] mergeArr = this.getInstance;
                merge configure = configure(this.getInstance[0], (merge) null);
                mergeArr[1] = configure;
                merge4 = configure;
            }
            merge instance = merge.getInstance();
            merge cca_continue = instance.cca_continue(instance).cca_continue(instance).cca_continue(merge4);
            merge cca_continue2 = merge2.cca_continue(merge2);
            merge init = cca_continue2.init(merge2);
            merge init2 = merge.init(init);
            merge cca_continue3 = init2.cca_continue(init2);
            merge Cardinal = cca_continue.getInstance().Cardinal(cca_continue3.cca_continue(cca_continue3));
            merge instance2 = init.getInstance();
            merge cca_continue4 = instance2.cca_continue(instance2);
            merge Cardinal2 = cca_continue.init(cca_continue3.Cardinal(Cardinal)).Cardinal(cca_continue4);
            if (z) {
                merge init3 = cca_continue4.init(merge4);
                merge5 = init3.cca_continue(init3);
            }
            if (!merge3.cleanup()) {
                cca_continue2 = cca_continue2.init(merge3);
            }
            return new configure(configure(), Cardinal, Cardinal2, new merge[]{cca_continue2, merge5}, this.Cardinal);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected JSONNavi(com.cardinalcommerce.a.toJSONString r7, com.cardinalcommerce.a.merge r8, com.cardinalcommerce.a.merge r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0009
        L_0x0005:
            int r1 = r7.valueOf()
        L_0x0009:
            if (r1 == 0) goto L_0x0045
            r2 = 5
            if (r1 == r2) goto L_0x0045
            java.math.BigInteger r2 = com.cardinalcommerce.a.writeJSONString.CardinalRenderType
            com.cardinalcommerce.a.merge r2 = r7.init((java.math.BigInteger) r2)
            r3 = 1
            if (r1 == r3) goto L_0x0040
            r4 = 2
            if (r1 == r4) goto L_0x0040
            r5 = 3
            if (r1 == r5) goto L_0x0037
            r5 = 4
            if (r1 == r5) goto L_0x002c
            r4 = 6
            if (r1 != r4) goto L_0x0024
            goto L_0x0040
        L_0x0024:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L_0x002c:
            com.cardinalcommerce.a.merge[] r1 = new com.cardinalcommerce.a.merge[r4]
            r1[r0] = r2
            com.cardinalcommerce.a.merge r0 = r7.getSDKVersion()
            r1[r3] = r0
            goto L_0x0047
        L_0x0037:
            com.cardinalcommerce.a.merge[] r1 = new com.cardinalcommerce.a.merge[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            goto L_0x0047
        L_0x0040:
            com.cardinalcommerce.a.merge[] r1 = new com.cardinalcommerce.a.merge[r3]
            r1[r0] = r2
            goto L_0x0047
        L_0x0045:
            com.cardinalcommerce.a.merge[] r1 = getWarnings
        L_0x0047:
            r6.<init>(r7, r8, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONNavi.<init>(com.cardinalcommerce.a.toJSONString, com.cardinalcommerce.a.merge, com.cardinalcommerce.a.merge):void");
    }

    public final merge onCReqSuccess() {
        if (CardinalError()) {
            return this.init;
        }
        throw new IllegalStateException("point not in normal form");
    }

    public final merge getWarnings() {
        if (CardinalError()) {
            return getSDKVersion();
        }
        throw new IllegalStateException("point not in normal form");
    }

    public final boolean CardinalError() {
        toJSONString tojsonstring = this.configure;
        int valueOf = tojsonstring == null ? 0 : tojsonstring.valueOf();
        return valueOf == 0 || valueOf == 5 || getString() || this.getInstance[0].cleanup();
    }

    public final JSONNavi CardinalRenderType() {
        if (getString()) {
            return this;
        }
        toJSONString tojsonstring = this.configure;
        int valueOf = tojsonstring == null ? 0 : tojsonstring.valueOf();
        if (valueOf == 0 || valueOf == 5) {
            return this;
        }
        merge instance = getInstance(0);
        return instance.cleanup() ? this : init(instance.onValidated());
    }

    /* access modifiers changed from: package-private */
    public final JSONNavi init(merge merge) {
        toJSONString tojsonstring = this.configure;
        int valueOf = tojsonstring == null ? 0 : tojsonstring.valueOf();
        if (valueOf != 1) {
            if (valueOf == 2 || valueOf == 3 || valueOf == 4) {
                merge instance = merge.getInstance();
                return this.configure.cca_continue(this.init.init(instance), this.cca_continue.init(instance.init(merge)), this.Cardinal);
            } else if (valueOf != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.configure.cca_continue(this.init.init(merge), this.cca_continue.init(merge), this.Cardinal);
    }

    public final boolean init(final boolean z, final boolean z2) {
        if (!getString() && ((getInt) this.configure.Cardinal(this, "bc_validity", new getCurrentObject() {
            public final GMCipherSpi.SM2withRMD Cardinal(GMCipherSpi.SM2withRMD sM2withRMD) {
                getInt getint = sM2withRMD instanceof getInt ? (getInt) sM2withRMD : null;
                if (getint == null) {
                    getint = new getInt();
                }
                if (getint.init) {
                    return getint;
                }
                if (!getint.configure) {
                    if (z || JSONNavi.this.Cardinal()) {
                        getint.configure = true;
                    } else {
                        getint.init = true;
                        return getint;
                    }
                }
                if (z2 && !getint.cca_continue) {
                    if (!JSONNavi.this.getInstance()) {
                        getint.init = true;
                        return getint;
                    }
                    getint.cca_continue = true;
                }
                return getint;
            }
        })).init) {
            return false;
        }
        return true;
    }

    public JSONNavi configure(merge merge) {
        if (getString()) {
            return this;
        }
        return this.configure.cca_continue(this.init.init(merge), this.cca_continue, this.getInstance, this.Cardinal);
    }

    public JSONNavi getInstance(merge merge) {
        if (getString()) {
            return this;
        }
        return this.configure.cca_continue(this.init, this.cca_continue.init(merge), this.getInstance, this.Cardinal);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean init(com.cardinalcommerce.a.JSONNavi r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.cardinalcommerce.a.toJSONString r1 = r8.configure
            com.cardinalcommerce.a.toJSONString r2 = r9.configure
            r3 = 1
            if (r1 != 0) goto L_0x000d
            r4 = r3
            goto L_0x000e
        L_0x000d:
            r4 = r0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            r5 = r3
            goto L_0x0013
        L_0x0012:
            r5 = r0
        L_0x0013:
            boolean r6 = r8.getString()
            boolean r7 = r9.getString()
            if (r6 != 0) goto L_0x0068
            if (r7 == 0) goto L_0x0020
            goto L_0x0068
        L_0x0020:
            if (r4 == 0) goto L_0x0027
            if (r5 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r1 = r8
            goto L_0x004e
        L_0x0027:
            if (r4 == 0) goto L_0x002e
            com.cardinalcommerce.a.JSONNavi r9 = r9.CardinalRenderType()
            goto L_0x0025
        L_0x002e:
            if (r5 == 0) goto L_0x0035
            com.cardinalcommerce.a.JSONNavi r1 = r8.CardinalRenderType()
            goto L_0x004e
        L_0x0035:
            boolean r2 = r1.configure(r2)
            if (r2 != 0) goto L_0x003c
            return r0
        L_0x003c:
            r2 = 2
            com.cardinalcommerce.a.JSONNavi[] r2 = new com.cardinalcommerce.a.JSONNavi[r2]
            r2[r0] = r8
            com.cardinalcommerce.a.JSONNavi r9 = r1.cca_continue((com.cardinalcommerce.a.JSONNavi) r9)
            r2[r3] = r9
            r1.init((com.cardinalcommerce.a.JSONNavi[]) r2)
            r1 = r2[r0]
            r9 = r2[r3]
        L_0x004e:
            com.cardinalcommerce.a.merge r2 = r1.init
            com.cardinalcommerce.a.merge r4 = r9.init
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0067
            com.cardinalcommerce.a.merge r1 = r1.getSDKVersion()
            com.cardinalcommerce.a.merge r9 = r9.getSDKVersion()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0067
            return r3
        L_0x0067:
            return r0
        L_0x0068:
            if (r6 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0077
            if (r4 != 0) goto L_0x0076
            if (r5 != 0) goto L_0x0076
            boolean r9 = r1.configure(r2)
            if (r9 == 0) goto L_0x0077
        L_0x0076:
            return r3
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONNavi.init(com.cardinalcommerce.a.JSONNavi):boolean");
    }

    public int hashCode() {
        toJSONString tojsonstring = this.configure;
        int i = tojsonstring == null ? 0 : ~tojsonstring.hashCode();
        if (getString()) {
            return i;
        }
        JSONNavi CardinalRenderType = CardinalRenderType();
        return (i ^ (CardinalRenderType.init.hashCode() * 17)) ^ (CardinalRenderType.getSDKVersion().hashCode() * 257);
    }

    public String toString() {
        if (getString()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.init);
        stringBuffer.append(',');
        stringBuffer.append(this.cca_continue);
        for (merge append : this.getInstance) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public final byte[] Cardinal(boolean z) {
        if (getString()) {
            return new byte[1];
        }
        JSONNavi CardinalRenderType = CardinalRenderType();
        merge merge = CardinalRenderType.init;
        byte[] instance = setCornerRadius.getInstance((merge.Cardinal() + 7) / 8, merge.cca_continue());
        if (z) {
            byte[] bArr = new byte[(instance.length + 1)];
            bArr[0] = (byte) (CardinalRenderType.CardinalActionCode() ? 3 : 2);
            System.arraycopy(instance, 0, bArr, 1, instance.length);
            return bArr;
        }
        merge sDKVersion = CardinalRenderType.getSDKVersion();
        byte[] instance2 = setCornerRadius.getInstance((sDKVersion.Cardinal() + 7) / 8, sDKVersion.cca_continue());
        byte[] bArr2 = new byte[(instance.length + instance2.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(instance, 0, bArr2, 1, instance.length);
        System.arraycopy(instance2, 0, bArr2, instance.length + 1, instance2.length);
        return bArr2;
    }

    public final JSONNavi Cardinal(BigInteger bigInteger) {
        return this.configure.CardinalEnvironment().cca_continue(this, bigInteger);
    }
}
