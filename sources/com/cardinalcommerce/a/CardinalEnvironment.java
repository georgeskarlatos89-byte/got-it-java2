package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import org.json.JSONException;
import org.json.JSONObject;

public final class CardinalEnvironment extends setKeyboardNavigationCluster {
    private static int Cardinal = 0;
    private static final getString configure = getString.getInstance();
    private static int init = 1;
    private final String cca_continue;
    private final cleanup getInstance;

    static {
        int i = Cardinal + 86;
        int i2 = (i & -1) + (i | -1);
        init = i2 % 128;
        if (i2 % 2 == 0) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public CardinalEnvironment(cleanup cleanup, String str, String str2) throws JSONException, InvalidInputException {
        this.getInstance = cleanup;
        this.cca_continue = str2;
        cca_continue(str);
    }

    private void cca_continue(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Order", new JSONObject());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("Agent", "CardinalMobileSdk_Android");
        jSONObject2.put("Version", ThreeDSStrings.SDKVersion);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("cca", true);
        jSONObject.put("SupportsAlternativePayments", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("BrowserPayload", jSONObject);
        jSONObject4.put("ConsumerSessionId", (Object) null);
        jSONObject4.put("Client", jSONObject2);
        jSONObject4.put("ServerJWT", str);
        super.Cardinal(new StringBuilder().append(this.cca_continue).append(CardinalActionCode.configure()).toString(), jSONObject4.toString(), 10000);
        int i = Cardinal;
        int i2 = i & 11;
        int i3 = (i | 11) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        init = i5 % 128;
        char c = 2;
        if (i5 % 2 != 0) {
            c = 31;
        }
        if (c != 31) {
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r8.isEmpty() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r8.isEmpty() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.IS_EXTERNAL_BUILD != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = 'C';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = '%';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r0 == '%') goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r0 = init;
        r1 = r0 & 125;
        r0 = -(-((r0 ^ 125) | r1));
        r6 = (r1 & r0) + (r0 | r1);
        Cardinal = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        configure.Cardinal("CardinalInit", "Init Response : \n".concat(java.lang.String.valueOf(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r0 = init;
        r1 = (r0 & 87) + (r0 | 87);
        Cardinal = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r8 = com.cardinalcommerce.a.values.cca_continue(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r8.configure == 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(r8.configure, r8.cca_continue);
        configure.cca_continue(r0, r8.init());
        r7.getInstance.configure(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r8 = Cardinal;
        r0 = ((r8 ^ 12) + ((r8 & 12) << 1)) - 1;
        init = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if ((r0 % 2) != 0) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if (r2 == true) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r8.Cardinal.getErrorNumber() == 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(r8.Cardinal.getErrorNumber(), r8.Cardinal.getErrorDescription());
        configure.cca_continue(r0, r8.init());
        r7.getInstance.configure(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        r8 = Cardinal;
        r0 = r8 & 35;
        r8 = -(-(r8 | 35));
        r1 = (r0 ^ r8) + ((r8 & r0) << 1);
        init = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fd, code lost:
        if ((r1 % 2) != 0) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r3 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        configure.Cardinal("CardinalInit", "Init Successful");
        r7.getInstance.cca_continue(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0113, code lost:
        r8 = Cardinal;
        r0 = ((r8 | 57) << 1) - (r8 ^ 57);
        init = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0123, code lost:
        configure.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError((int) com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.INIT_JWT_PARSER_EXCEPTION, (java.lang.Exception) r8), r4);
        r7.getInstance.configure(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError((int) com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.INIT_JWT_PARSER_EXCEPTION, r8.getLocalizedMessage()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = init
            r1 = r0 & 83
            r0 = r0 | 83
            int r0 = -r0
            int r0 = -r0
            r2 = r1 | r0
            r3 = 1
            int r2 = r2 << r3
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            Cardinal = r0
            int r2 = r2 % 2
            r0 = 39
            if (r2 == 0) goto L_0x001b
            r1 = 75
            goto L_0x001c
        L_0x001b:
            r1 = r0
        L_0x001c:
            r2 = 0
            r4 = 0
            if (r1 == r0) goto L_0x002c
            boolean r0 = r8.isEmpty()     // Catch:{ JSONException -> 0x0122 }
            r1 = 77
            int r1 = r1 / r2
            if (r0 == 0) goto L_0x004c
            goto L_0x0032
        L_0x002a:
            r8 = move-exception
            throw r8
        L_0x002c:
            boolean r0 = r8.isEmpty()     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x004c
        L_0x0032:
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r8 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0122 }
            r0 = 10219(0x27eb, float:1.432E-41)
            r8.<init>(r0)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.cleanup r0 = r7.getInstance     // Catch:{ JSONException -> 0x0122 }
            r0.configure(r8)     // Catch:{ JSONException -> 0x0122 }
            int r8 = Cardinal
            r0 = r8 | 1
            int r0 = r0 << r3
            r8 = r8 ^ r3
            int r0 = r0 - r8
            int r8 = r0 % 128
            init = r8
            int r0 = r0 % 2
            return
        L_0x004c:
            boolean r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.IS_EXTERNAL_BUILD     // Catch:{ JSONException -> 0x0122 }
            r1 = 37
            if (r0 != 0) goto L_0x0055
            r0 = 67
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            java.lang.String r5 = "CardinalInit"
            if (r0 == r1) goto L_0x0089
            int r0 = init
            r1 = r0 & 125(0x7d, float:1.75E-43)
            r0 = r0 ^ 125(0x7d, float:1.75E-43)
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r6 = r1 & r0
            r0 = r0 | r1
            int r6 = r6 + r0
            int r0 = r6 % 128
            Cardinal = r0
            int r6 = r6 % 2
            com.cardinalcommerce.a.getString r0 = configure     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r1 = "Init Response : \n"
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r1 = r1.concat(r6)     // Catch:{ JSONException -> 0x0122 }
            r0.Cardinal(r5, r1)     // Catch:{ JSONException -> 0x0122 }
            int r0 = init
            r1 = r0 & 87
            r0 = r0 | 87
            int r1 = r1 + r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % 2
        L_0x0089:
            com.cardinalcommerce.a.onValidated r8 = com.cardinalcommerce.a.values.cca_continue(r8)     // Catch:{ JSONException -> 0x0122 }
            int r0 = r8.configure     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x00c3
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0122 }
            int r1 = r8.configure     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r5 = r8.cca_continue     // Catch:{ JSONException -> 0x0122 }
            r0.<init>((int) r1, (java.lang.String) r5)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.getString r1 = configure     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r8 = r8.init()     // Catch:{ JSONException -> 0x0122 }
            r1.cca_continue(r0, r8)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.cleanup r8 = r7.getInstance     // Catch:{ JSONException -> 0x0122 }
            r8.configure(r0)     // Catch:{ JSONException -> 0x0122 }
            int r8 = Cardinal
            r0 = r8 ^ 12
            r8 = r8 & 12
            int r8 = r8 << r3
            int r0 = r0 + r8
            int r0 = r0 - r3
            int r8 = r0 % 128
            init = r8
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00ba
            r2 = r3
        L_0x00ba:
            if (r2 == r3) goto L_0x00bd
            return
        L_0x00bd:
            super.hashCode()     // Catch:{ all -> 0x00c1 }
            throw r4     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r8 = move-exception
            throw r8
        L_0x00c3:
            com.cardinalcommerce.cardinalmobilesdk.models.Payload r0 = r8.Cardinal     // Catch:{ JSONException -> 0x0122 }
            int r0 = r0.getErrorNumber()     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x0107
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.cardinalmobilesdk.models.Payload r1 = r8.Cardinal     // Catch:{ JSONException -> 0x0122 }
            int r1 = r1.getErrorNumber()     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.cardinalmobilesdk.models.Payload r5 = r8.Cardinal     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r5 = r5.getErrorDescription()     // Catch:{ JSONException -> 0x0122 }
            r0.<init>((int) r1, (java.lang.String) r5)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.getString r1 = configure     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r8 = r8.init()     // Catch:{ JSONException -> 0x0122 }
            r1.cca_continue(r0, r8)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.cleanup r8 = r7.getInstance     // Catch:{ JSONException -> 0x0122 }
            r8.configure(r0)     // Catch:{ JSONException -> 0x0122 }
            int r8 = Cardinal
            r0 = r8 & 35
            r8 = r8 | 35
            int r8 = -r8
            int r8 = -r8
            r1 = r0 ^ r8
            r8 = r8 & r0
            int r8 = r8 << r3
            int r1 = r1 + r8
            int r8 = r1 % 128
            init = r8
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r3 = r2
        L_0x0101:
            if (r3 != 0) goto L_0x0104
            return
        L_0x0104:
            throw r4     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r8 = move-exception
            throw r8
        L_0x0107:
            com.cardinalcommerce.a.getString r0 = configure     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r1 = "Init Successful"
            r0.Cardinal(r5, r1)     // Catch:{ JSONException -> 0x0122 }
            com.cardinalcommerce.a.cleanup r0 = r7.getInstance     // Catch:{ JSONException -> 0x0122 }
            r0.cca_continue((com.cardinalcommerce.a.onValidated) r8)     // Catch:{ JSONException -> 0x0122 }
            int r8 = Cardinal
            r0 = r8 | 57
            int r0 = r0 << r3
            r8 = r8 ^ 57
            int r0 = r0 - r8
            int r8 = r0 % 128
            init = r8
            int r0 = r0 % 2
            return
        L_0x0122:
            r8 = move-exception
            com.cardinalcommerce.a.getString r0 = configure
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10206(0x27de, float:1.4302E-41)
            r1.<init>((int) r2, (java.lang.Exception) r8)
            r0.cca_continue(r1, r4)
            com.cardinalcommerce.a.cleanup r0 = r7.getInstance
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.String r8 = r8.getLocalizedMessage()
            r1.<init>((int) r2, (java.lang.String) r8)
            r0.configure(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalEnvironment.getInstance(java.lang.String):void");
    }

    public final void configure(String str, int i) {
        super.configure(str, i);
        CardinalError cardinalError = new CardinalError(i, str);
        configure.cca_continue(cardinalError, (String) null);
        this.getInstance.configure(cardinalError);
        int i2 = init;
        int i3 = i2 & 91;
        int i4 = i3 + ((i2 ^ 91) | i3);
        Cardinal = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: com.cardinalcommerce.a.CardinalEnvironment$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] Cardinal;
        private static int configure = 1;
        private static int getInstance;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0042 */
        static {
            /*
                com.cardinalcommerce.a.setContextClickable[] r0 = com.cardinalcommerce.a.setContextClickable.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Cardinal = r0
                r1 = 2
                r2 = 1
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0025 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r0 = getInstance
                r3 = r0 & 93
                r0 = r0 ^ 93
                r0 = r0 | r3
                int r0 = -r0
                int r0 = -r0
                r4 = r3 & r0
                r0 = r0 | r3
                int r4 = r4 + r0
                int r0 = r4 % 128
                configure = r0
                int r4 = r4 % r1
            L_0x0025:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x0042 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0042 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
                int r0 = configure
                r3 = r0 & -98
                int r4 = ~r0
                r4 = r4 & 97
                r3 = r3 | r4
                r0 = r0 & 97
                int r0 = r0 << r2
                int r0 = ~r0
                int r3 = r3 - r0
                int r3 = r3 - r2
                int r0 = r3 % 128
                getInstance = r0
                int r3 = r3 % r1
            L_0x0042:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x005e }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                int r0 = configure
                r3 = r0 & -38
                int r4 = ~r0
                r5 = 37
                r4 = r4 & r5
                r3 = r3 | r4
                r0 = r0 & r5
                int r0 = r0 << r2
                int r3 = r3 + r0
                int r0 = r3 % 128
                getInstance = r0
                int r3 = r3 % r1
            L_0x005e:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x007a }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x007a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007a }
                int r0 = configure
                r3 = r0 ^ 123(0x7b, float:1.72E-43)
                r0 = r0 & 123(0x7b, float:1.72E-43)
                r0 = r0 | r3
                int r0 = r0 << r2
                int r3 = -r3
                int r3 = ~r3
                int r0 = r0 - r3
                int r0 = r0 - r2
                int r3 = r0 % 128
                getInstance = r3
                int r0 = r0 % r1
            L_0x007a:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x009e }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x009e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x009e }
                int r0 = configure
                r3 = r0 ^ 51
                r4 = r0 & 51
                r3 = r3 | r4
                int r3 = r3 << r2
                r4 = r0 & -52
                int r0 = ~r0
                r0 = r0 & 51
                r0 = r0 | r4
                int r0 = -r0
                r4 = r3 ^ r0
                r0 = r0 & r3
                int r0 = r0 << r2
                int r4 = r4 + r0
                int r0 = r4 % 128
                getInstance = r0
                int r4 = r4 % r1
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalEnvironment.AnonymousClass5.<clinit>():void");
        }
    }

    public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
        int i = Cardinal + 81;
        init = i % 128;
        int i2 = i % 2;
        super.cca_continue(exc, setcontextclickable);
        int i3 = AnonymousClass5.Cardinal[setcontextclickable.ordinal()];
        boolean z = true;
        if (i3 == 1 || i3 == 2) {
            configure.cca_continue(new CardinalError((int) CardinalError.INIT_IO_EXCEPTION, exc), (String) null);
            this.getInstance.configure(new CardinalError(CardinalError.INIT_IO_EXCEPTION));
            int i4 = (init + 118) - 1;
            Cardinal = i4 % 128;
            int i5 = i4 % 2;
        } else if (i3 == 3) {
            configure.cca_continue(new CardinalError((int) CardinalError.INIT_PROTOCOL_EXCEPTION, exc), (String) null);
            this.getInstance.configure(new CardinalError(CardinalError.INIT_PROTOCOL_EXCEPTION));
            int i6 = Cardinal;
            int i7 = ((((i6 ^ 61) | (i6 & 61)) << 1) - (~(-(((~i6) & 61) | (i6 & -62))))) - 1;
            init = i7 % 128;
            int i8 = i7 % 2;
        } else if (i3 != 4) {
            if (i3 == 5) {
                configure.cca_continue(new CardinalError((int) CardinalError.SOCKET_TIMEOUT_ERROR_CODE, exc), (String) null);
                this.getInstance.configure(new CardinalError(CardinalError.SOCKET_TIMEOUT_ERROR_CODE));
                int i9 = init;
                int i10 = (i9 & 94) + (i9 | 94);
                int i11 = (i10 ^ -1) + ((i10 & -1) << 1);
                Cardinal = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = Cardinal;
            int i14 = ((((i13 ^ 27) | (i13 & 27)) << 1) - (~(-(((~i13) & 27) | (i13 & -28))))) - 1;
            init = i14 % 128;
            if (i14 % 2 == 0) {
                z = false;
            }
            if (!z) {
                int i15 = 34 / 0;
            }
        } else {
            configure.cca_continue(new CardinalError((int) CardinalError.INIT_URL_EXCEPTION, exc), (String) null);
            this.getInstance.configure(new CardinalError(CardinalError.INIT_URL_EXCEPTION));
            int i16 = init;
            int i17 = ((i16 | 115) << 1) - (i16 ^ 115);
            Cardinal = i17 % 128;
            int i18 = i17 % 2;
        }
    }
}
