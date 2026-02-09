package com.cardinalcommerce.emvco.utils;

public class EMVCoError {
    public static final int ACS_SIGNED_CONTENT_ERROR_CODE = 11404;
    public static final String ACS_SIGNED_CONTENT_EXCEPTION_MESSAGE = "ACSSignedContent Exception \n";
    public static final String CERTIFICATE_EXCEPTION = "Certificate Exception \n";
    public static final String CHALLENGE_TASK_101_CRES_DECRYPTION_ERROR = "Error 101 Created: Error Decrypting response";
    public static final String CHALLENGE_TASK_101_ERROR_MESSAGE = "Error 101 Created: Message Description Invalid";
    public static final String CHALLENGE_TASK_101_INVALID_ACS_SIGNED_CONTENT_MESSAGE = "Error 101 Created: Invalid ACS signed content";
    public static final String CHALLENGE_TASK_101_INVALID_FORMAT = "Error 101 Created: Response is in invalid format";
    public static final String CHALLENGE_TASK_101_MESSAGE_NOT_CRES = "Error 101 Created: Message is not CRes \n";
    public static final String CHALLENGE_TASK_101_MESSAGE_NOT_CRES_MESSAGE = "Error 101 Created: Message is not CRes - Challenge Decrypted CardinalError";
    public static final String CHALLENGE_TASK_102_ERROR_MESSAGE = "Error 102 Created: Invalid Message Version";
    public static final String CHALLENGE_TASK_201_ERROR_MESSAGE = "Error 201 Created: Required data element missing";
    public static final String CHALLENGE_TASK_202_ERROR_MESSAGE = "Error 202 Created: SDK is Critical";
    public static final String CHALLENGE_TASK_203_ERROR_MESSAGE = "Error 203 Created: \n";
    public static final String CHALLENGE_TASK_301_3DS_TRANS_ID_ERROR_MESSAGE = "Error 301 Created: Invalid ThreeDSServerTransID";
    public static final String CHALLENGE_TASK_301_ACS_TRANS_ID_ERROR_MESSAGE = "Error 301 Created: Invalid AcsTransId";
    public static final String CHALLENGE_TASK_301_SDK_TRANS_ID_ERROR_MESSAGE = "Error 301 Created: Invalid SdkTransactionID";
    public static final String CHALLENGE_TASK_302_ERROR_MESSAGE = "Error 302 Created: Data could not be decrypted";
    public static final String CHALLENGE_TASK_402_ERROR_MESSAGE = "Error 402 Created: Timeout Error";
    public static final int CHALLENGE_TASK_CREATE_101_ERROR = 12101;
    public static final int CHALLENGE_TASK_CREATE_102_ERROR = 12102;
    public static final int CHALLENGE_TASK_CREATE_201_ERROR = 12201;
    public static final int CHALLENGE_TASK_CREATE_202_ERROR = 12202;
    public static final int CHALLENGE_TASK_CREATE_203_ERROR = 12203;
    public static final int CHALLENGE_TASK_CREATE_301_ERROR = 12301;
    public static final int CHALLENGE_TASK_CREATE_302_ERROR = 12302;
    public static final int CHALLENGE_TASK_CREATE_402_ERROR = 12402;
    public static final String CHALLENGE_TASK_ERROR_TASK_ERROR_MESSAGE = "Exception while executing task \n";
    public static final String CHALLENGE_TASK_INVALID_ACS_SIGNED_CONTENT_MESSAGE = "Invalid ACSSignedContent \n";
    public static final String CHALLENGE_TASK_INVALID_CRES_MESSAGE = "Message is not CRes \n";
    public static final String CHALLENGE_TASK_JWE_DECRYPTION_MESSAGE = "JWE Decrypting Failed \n";
    public static final String CHALLENGE_TASK_JWE_ENCRYPTION_MESSAGE = "JWE Encryption Failed \n";
    public static final int CLEAN_UP_SDK_NOT_INITIALIZED_CODE = 11501;
    public static final String CLEAN_UP_SDK_NOT_INITIALIZED_MESSAGE = "SDK Not Initialized";
    public static final int CONFIG_PARAMETERS_INVALID_INPUT = 11201;
    public static final String CONFIG_PARAMETERS_INVALID_INPUT_MESSAGE = "Invalid Input for add params";
    public static final int CREATE_TRANSACTION_AUTH_REQUEST_PARAMS_ERROR = 11316;
    public static final String CREATE_TRANSACTION_DEVICE_DATA_ENCRYPTION_MESSAGE = "Error Encrypting Device Information: \n";
    public static final String CREATE_TRANSACTION_ERROR_CREATING_LASSO_JSON = " Error Creating LASSO JSON \n";
    public static final String CREATE_TRANSACTION_ERROR_MESSAGE = "Create Transaction CardinalError ";
    public static final int CREATE_TRANSACTION_INVALID_ALGORITHM_PARAMETERS_CODE = 11311;
    public static final int CREATE_TRANSACTION_INVALID_DSID = 11302;
    public static final String CREATE_TRANSACTION_INVALID_DSID_ERROR_MESSAGE = "Directory Server ID is not available ";
    public static final int CREATE_TRANSACTION_INVALID_MESSAGE_VERSION_CODE = 11303;
    public static final int CREATE_TRANSACTION_LASSO_DATA_ENCRYPTION_ERROR = 11315;
    public static final String CREATE_TRANSACTION_LASSO_ERROR_MESSAGE = "LASSO CardinalError : \n";
    public static final int CREATE_TRANSACTION_LASSO_INFORMATION_JSON_ERROR = 11317;
    public static final int CREATE_TRANSACTION_NO_SUCH_ALGORITHM_CODE = 11312;
    public static final String CREATE_TRANSACTION_NULL_MESSAGE_VERSION_ERROR_MESSAGE = " Null MessageVersion \n";
    public static final String CREATE_TRANSACTION_NULL_SDK_APP_ID_ERROR_MESSAGE = " Null SDKAppID \n";
    public static final String CREATE_TRANSACTION_NULL_SDK_EPHEMERAL_PUBLIC_KEY_ERROR_MESSAGE = " Null SDKEphemeralPublicKey \n";
    public static final String CREATE_TRANSACTION_NULL_SDK_REFERENCE_NUMBER_ERROR_MESSAGE = " Null SDKReferenceNumber \n";
    public static final int CREATE_TRANSACTION_NULL_SDK_TRANSACTION_ID_ERROR = 11313;
    public static final String CREATE_TRANSACTION_NULL_SDK_TRANSACTION_ID_ERROR_MESSAGE = " Null SDKTransactionID \n";
    public static final int CREATE_TRANSACTION_SDK_NOT_INITIALIZED_CODE = 11301;
    public static final String CREATE_TRANSACTION_SDK_NOT_INITIALIZED_MESSAGE = "SDK not initialized";
    public static final int CREATE_TRANSACTION_TRANSACTION_LASSO_ERROR = 11314;
    public static final int CREATE_TRANSACTION_TRANS_CONFIG_PARAMS_CODE = 11318;
    public static final String CREATE_TRANSACTION_TRANS_CONFIG_PARAMS_DECRYPTION_MESSAGE = "Error while decrypting data \n";
    public static final String CREATE_TRANSACTION_TRANS_CONFIG_PARAMS_MESSAGE = "Error while creating SDKAppID \n";
    public static final int CREATE_TRANSACTION_TRANS_CONFIG_PARAMs_DECRYPTION_CODE = 11320;
    public static final int CREATE_TRANSACTION_TRANS_CONFIG_PARAMs_ENCRYPTION_CODE = 11319;
    public static final int DO_CHALLENGE_CHALLENGE_TASK_128CBC_JWE_ENCRYPTION_ERROR = 11419;
    public static final int DO_CHALLENGE_CHALLENGE_TASK_128GCM_JWE_ENCRYPTION_ERROR = 11418;
    public static final int DO_CHALLENGE_CHALLENGE_TASK_INVALID_ACS_URL_ERROR = 11414;
    public static final String DO_CHALLENGE_CHALLENGE_TASK_INVALID_ACS_URL_MESSAGE = "Invalid ACSUrl \n";
    public static final int DO_CHALLENGE_CHALLENGE_TASK_JWE_DECRYPTION_ERROR = 11420;
    public static final int DO_CHALLENGE_CHALLENGE_TASK_NULL_ENCRYPTED_DATA_ERROR = 11415;
    public static final String DO_CHALLENGE_CHALLENGE_TASK_NULL_ENCRYPTED_DATA_MESSAGE = "Invalid ACSUrl \n";
    public static final int DO_CHALLENGE_CREATING_CHALLENGE_TASK_ERROR = 11417;
    public static final String DO_CHALLENGE_CREATING_CHALLENGE_TASK_MESSAGE = "Error while creating new ChallengeTask \n";
    public static final int DO_CHALLENGE_ERROR_TASK_ERROR = 11421;
    public static final int DO_CHALLENGE_ERROR_WHILE_CREATING_CREQ = 11416;
    public static final String DO_CHALLENGE_ERROR_WHILE_CREATING_CREQ_MESSAGE = "Error while creating and executing CReq \n";
    public static final int DO_CHALLENGE_INVALID_ACS_SIGNED_CONTENT_CODE = 11403;
    public static final int DO_CHALLENGE_INVALID_CREQ_CODE = 11413;
    public static final int DO_CHALLENGE_INVALID_TIMEOUT_CODE = 11401;
    public static final String DO_CHALLENGE_INVALID_TIMEOUT_ERROR_MESSAGE = "Invalid Timeout \n";
    public static final int DO_CHALLENGE_NULL_ACTIVITY_CODE = 11411;
    public static final String DO_CHALLENGE_NULL_ACTIVITY_ERROR_MESSAGE = " Null Current Activity \n";
    public static final int DO_CHALLENGE_NULL_CHALLENGE_PARAMETERS_CODE = 11402;
    public static final String DO_CHALLENGE_NULL_CHALLENGE_PARAMETERS_ERROR_MESSAGE = " Null Challenge Parameters \n";
    public static final int DO_CHALLENGE_NULL_CHALLENGE_STATUS_RECEIVER_CODE = 11412;
    public static final String DO_CHALLENGE_NULL_CHALLENGE_STATUS_RECEIVER_ERROR_MESSAGE = "Null Challenge Status Receiver \n";
    public static final String DO_CHALLENGE_PROGRESS_SCREEN_ERROR_MESSAGE = "Error while dismissing progress screen \n";
    public static final String DO_CHALLENGE_PROGRESS_SCREEN_IMAGE_ERROR_MESSAGE = "Unable to get DSString from DSConfiguration: ";
    public static final int EMVCO_DD_JSON_EXCEPTION_ERROR_CODE = 11305;
    public static final int EMVCO_DS_CONFIG_JSON_EXCEPTION_ERROR_CODE = 11406;
    public static final int EMVCO_EXCEPTION_ERROR_CODE = 11304;
    public static final int EMVCO_PROGRESS_SCREEN_JSON_ERROR_EXCEPTION = 11701;
    public static final int GET_VERSION_SDK_NOT_INITIALIZED_CODE = 11601;
    public static final String GET_VERSION_SDK_NOT_INITIALIZED_MESSAGE = "SDK Not Initialized";
    public static final int GET_VERSION_SDK_RUNTIME_EXCEPTION_CODE = 11602;
    public static final String GET_VERSION_SDK_RUNTIME_EXCEPTION_MESSAGE = "SDK RuntimeException at getSDKVersion()";
    public static final int INITIALIZE_CONTEXT_ERROR_CODE = 11113;
    public static final String INITIALIZE_ERROR_INVALID_CONTEXT = "Null Context ";
    public static final String INITIALIZE_ERROR_INVALID_LOCALE = "Null Locale ";
    public static final String INITIALIZE_ERROR_INVALID_PARAMETERS = "Null Parameters ";
    public static final String INITIALIZE_ERROR_INVALID_UICUSTOMIZATION = "Null UICustomization ";
    public static final String INITIALIZE_ERROR_MESSAGE = "EMVCO Initialize CardinalError: ";
    public static final int INITIALIZE_NULL_CONFIG_PARAMETERS_CODE = 11102;
    public static final int INITIALIZE_NULL_LOCALE_CODE = 11111;
    public static final int INITIALIZE_NULL_UICUSTOMIZATION_CODE = 11112;
    public static final int INITIALIZE_SDK_ALREADY_INITIALIZED = 11101;
    public static final String INITIALIZE_SDK_ALREADY_INITIALIZED_MESSAGE = "SDK already initialized ";
    public static final String INVALID_ALGORITHM_JSOE_EXCEPTION = "Invalid Algorithm JOSE Exception: ";
    public static final String INVALID_SIGNATURE_EXCEPTION = "Invalid Signature Exception: ";
    public static final String JSON_EXCEPTION_MESSAGE = "JSON Exception \n";
    public static final int KEY_GENERATOR_UTILS_ERROR_CODE = 11405;
    public static final String KEY_GENERATOR_UTIL_ECDH_KEY_ERROR_MESSAGE = "Error generating ECDH Secret Key. ";
    public static final String KEY_GENERATOR_UTIL_ERROR_MESSAGE = "Error generating ECDH Key Pair. ";
    private final String Cardinal;
    private final int configure;

    public EMVCoError(int i, String str) {
        this.configure = i;
        this.Cardinal = str;
    }

    public int getErrorCode() {
        return this.configure;
    }

    public String getErrorDescription() {
        return this.Cardinal;
    }
}
