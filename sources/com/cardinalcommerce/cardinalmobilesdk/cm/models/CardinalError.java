package com.cardinalcommerce.cardinalmobilesdk.cm.models;

import java.util.Arrays;

public class CardinalError {
    public static final int CARDINAL_JSON_EXCEPTION_ERROR_CODE = 10610;
    public static final int CONFIGURATION_EXCEPTION_ERROR_CODE = 10104;
    public static final int CONTINUE_HTML_CHALLENGE_INVALID_URI_EXCEPTION = 10616;
    public static final int CONTINUE_IO_EXCEPTION = 10612;
    public static final int CONTINUE_JWT_PARSER_EXCEPTION = 10611;
    public static final int CONTINUE_NULL_POINTER_EXCEPTION_ERROR_CODE = 10617;
    public static final int CONTINUE_PROTOCOL_EXCEPTION = 10615;
    public static final int CONTINUE_TIME_EXCEPTION = 10614;
    public static final int CONTINUE_URL_EXCEPTION = 10613;
    private static int Cardinal = 0;
    public static final int HANDLE_ACTIVITY_RESULT_ERROR = 10714;
    public static final String HANDLE_ACTIVITY_RESULT_MESSAGE = "Exception thrown while handling Activity result \n ";
    public static final int INIT_DF_PARAMETERS_ERROR_CODE = 10204;
    public static final int INIT_DF_REQUEST_ERROR_CODE = 10218;
    public static final int INIT_EMPTY_RESPONSE = 10219;
    public static final int INIT_IO_EXCEPTION = 10212;
    public static final int INIT_JWT_PARSER_EXCEPTION = 10206;
    public static final int INIT_PROTOCOL_EXCEPTION = 10213;
    public static final int INIT_RESPONSE_ERROR_CODE = 10214;
    public static final String INIT_RESPONSE_ERROR_MESSAGE = "Cardinal Init Response Error. Missing field :";
    public static final int INIT_URL_EXCEPTION = 10211;
    public static final int NULL_CALLBACK_IN_CHALLENGE_OBSERVER_CODE = 10715;
    public static final String NULL_CALLBACK_IN_CHALLENGE_OBSERVER_MESSAGE = "Null CardinalValidateReceiver in CardinalChallengeObserverImpl, unable to return control back to the app. \n ";
    public static final int OBSERVER_SEND_RESULT_TO_MERCHANT_EXCEPTION_CODE = 10716;
    public static final int SDK_APP_ID_PACKAGE_NAME_NOT_FOUND = 10220;
    public static final int SEND_STEPUP_DATA_INVALID_USER_INPUT_ERROR_CODE = 10703;
    public static final int SEND_STEPUP_DATA_STARTED_CONTEXT_ERROR_CODE = 10712;
    public static final int SEND_STEPUP_DATA_STARTED_RESPONSE_ERROR_CODE = 10702;
    public static final int SEND_STEPUP_DATA_STARTED_SESSION_ID_ERROR_CODE = 10711;
    public static final int SEND_STEPUP_DATA_STARTED_USER_INPUT_ERROR_CODE = 10713;
    public static final int SOCKET_TIMEOUT_ERROR_CODE = 10216;
    public static final int SUBSEQUENT_CRES_INVALID_RUNTIME_EXCEPTION = 10705;
    public static final String SUBSEQUENT_CRES_VALIDATION_ERROR_MESSAGE = "Subsequent CRes Validation fails.";
    private static int cca_continue = 1;
    private final String configure;
    private final int getInstance;

    public CardinalError(int i, String str) {
        this.getInstance = i;
        this.configure = str;
    }

    public CardinalError(int i, Exception exc) {
        this.getInstance = i;
        this.configure = Arrays.toString(exc.getStackTrace());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r1.configure = "Invalid Activity: Null Activity.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        r1.configure = "Invalid Transition: An error occurred during Cardinal Configure.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardinalError(int r2) {
        /*
            r1 = this;
            r1.<init>()
            r1.getInstance = r2
            if (r2 == 0) goto L_0x008c
            r0 = 10207(0x27df, float:1.4303E-41)
            if (r2 == r0) goto L_0x0087
            r0 = 10617(0x2979, float:1.4878E-41)
            if (r2 == r0) goto L_0x0082
            r0 = 10703(0x29cf, float:1.4998E-41)
            if (r2 == r0) goto L_0x007d
            r0 = 10705(0x29d1, float:1.5001E-41)
            if (r2 == r0) goto L_0x0078
            r0 = 10714(0x29da, float:1.5014E-41)
            if (r2 == r0) goto L_0x0073
            r0 = 10715(0x29db, float:1.5015E-41)
            if (r2 == r0) goto L_0x006e
            switch(r2) {
                case 10101: goto L_0x0069;
                case 10102: goto L_0x0064;
                case 10103: goto L_0x005f;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r2) {
                case 10201: goto L_0x0069;
                case 10202: goto L_0x005a;
                case 10203: goto L_0x0055;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r2) {
                case 10601: goto L_0x0050;
                case 10602: goto L_0x004b;
                case 10603: goto L_0x0046;
                case 10604: goto L_0x0041;
                case 10605: goto L_0x003c;
                case 10606: goto L_0x0037;
                case 10607: goto L_0x0032;
                case 10608: goto L_0x002d;
                case 10609: goto L_0x0064;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.String r2 = "Internal Error."
            r1.configure = r2
            return
        L_0x002d:
            java.lang.String r2 = "Invalid ACS Payload."
            r1.configure = r2
            return
        L_0x0032:
            java.lang.String r2 = "Invalid Payload."
            r1.configure = r2
            return
        L_0x0037:
            java.lang.String r2 = "Payload Validation failed."
            r1.configure = r2
            return
        L_0x003c:
            java.lang.String r2 = "Invalid Payload passed to Continue."
            r1.configure = r2
            return
        L_0x0041:
            java.lang.String r2 = "Invalid Payload passed to Continue: Null or Empty Payload."
            r1.configure = r2
            return
        L_0x0046:
            java.lang.String r2 = "Invalid Transaction ID passed to Continue."
            r1.configure = r2
            return
        L_0x004b:
            java.lang.String r2 = "Invalid Cardinal Validate Receiver."
            r1.configure = r2
            return
        L_0x0050:
            java.lang.String r2 = "Invalid Transition: An error occurred during Cardinal Init."
            r1.configure = r2
            return
        L_0x0055:
            java.lang.String r2 = "Invalid Receiver or Interface."
            r1.configure = r2
            return
        L_0x005a:
            java.lang.String r2 = "Invalid JWT String."
            r1.configure = r2
            return
        L_0x005f:
            java.lang.String r2 = "Invalid Cardinal Configuration Parameters: Null."
            r1.configure = r2
            return
        L_0x0064:
            java.lang.String r2 = "Invalid Activity: Null Activity."
            r1.configure = r2
            return
        L_0x0069:
            java.lang.String r2 = "Invalid Transition: An error occurred during Cardinal Configure."
            r1.configure = r2
            return
        L_0x006e:
            java.lang.String r2 = "Null CardinalValidateReceiver in CardinalChallengeObserverImpl, unable to return control back to the app. \n "
            r1.configure = r2
            return
        L_0x0073:
            java.lang.String r2 = "Exception thrown while handling Activity result \n "
            r1.configure = r2
            return
        L_0x0078:
            java.lang.String r2 = "Subsequent CRes Validation fails."
            r1.configure = r2
            return
        L_0x007d:
            java.lang.String r2 = "Invalid Input."
            r1.configure = r2
            return
        L_0x0082:
            java.lang.String r2 = "Null pointer exception thrown during payload validation"
            r1.configure = r2
            return
        L_0x0087:
            java.lang.String r2 = "SDKRenderType value 'HTML' is not valid when SDKUIType is set to NATIVE"
            r1.configure = r2
            return
        L_0x008c:
            java.lang.String r2 = "Challenge timed out."
            r1.configure = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.<init>(int):void");
    }

    public final int cca_continue() {
        int i = Cardinal;
        int i2 = i & 123;
        int i3 = ((~i2) & (i | 123)) + (i2 << 1);
        cca_continue = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getInstance;
        int i6 = i + 55;
        cca_continue = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String Cardinal() {
        int i = cca_continue;
        int i2 = ((i ^ 73) - (~((i & 73) << 1))) - 1;
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        String str = this.configure;
        int i4 = ((i & 62) + (i | 62)) - 1;
        Cardinal = i4 % 128;
        if ((i4 % 2 != 0 ? 9 : 'Z') != 9) {
            return str;
        }
        throw null;
    }
}
