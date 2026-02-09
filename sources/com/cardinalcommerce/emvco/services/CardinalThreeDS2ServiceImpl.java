package com.cardinalcommerce.emvco.services;

import android.content.Context;
import android.content.res.Resources;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.setAlpha;
import com.cardinalcommerce.a.setFocusable;
import com.cardinalcommerce.a.setHapticFeedbackEnabled;
import com.cardinalcommerce.a.setHorizontalScrollBarEnabled;
import com.cardinalcommerce.a.setLongClickable;
import com.cardinalcommerce.a.setSaveEnabled;
import com.cardinalcommerce.a.setTop;
import com.cardinalcommerce.a.setWillNotDraw;
import com.cardinalcommerce.emvco.parameters.ConfigParameters;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.Warning;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.models.exceptions.SDKAlreadyInitializedException;
import com.cardinalcommerce.shared.models.exceptions.SDKNotInitializedException;
import com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public class CardinalThreeDS2ServiceImpl implements ThreeDS2Service {
    private static CardinalThreeDS2ServiceImpl Cardinal;
    private static Context getInstance;
    private static List<Warning> onCReqSuccess = null;
    private UiCustomization cca_continue = null;
    private final setWillNotDraw cleanup = setWillNotDraw.getInstance();
    private setTop configure;
    private boolean getSDKVersion = false;
    private ConfigParameters init = null;

    static {
        Security.insertProviderAt(new KeyFactory(), 1);
    }

    public void initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException {
        String str2;
        if (!this.getSDKVersion) {
            this.getSDKVersion = true;
            this.cleanup.Cardinal("EMVCoInitialize", ThreeDSStrings.THREE_DS_SERVICE_CALLED);
            this.cleanup.Cardinal("EMVCoInitialize", new StringBuilder(ThreeDSStrings.THREE_DS_TRANSACTION_SDK_VERSION).append(ThreeDSStrings.SDKVersion).toString());
            if (context == null || configParameters == null || str == null || uiCustomization == null) {
                if (context == null) {
                    this.cleanup.getInstance(new EMVCoError(EMVCoError.INITIALIZE_CONTEXT_ERROR_CODE, "EMVCO Initialize CardinalError: Null Context "));
                    str2 = EMVCoError.INITIALIZE_ERROR_INVALID_CONTEXT;
                } else {
                    str2 = "";
                }
                if (configParameters == null) {
                    str2 = new StringBuilder().append(str2).append(EMVCoError.INITIALIZE_ERROR_INVALID_PARAMETERS).toString();
                    this.cleanup.getInstance(new EMVCoError(EMVCoError.INITIALIZE_NULL_CONFIG_PARAMETERS_CODE, "EMVCO Initialize CardinalError: Null Parameters "));
                }
                if (str == null) {
                    str2 = new StringBuilder().append(str2).append(EMVCoError.INITIALIZE_ERROR_INVALID_LOCALE).toString();
                    this.cleanup.getInstance(new EMVCoError(EMVCoError.INITIALIZE_NULL_LOCALE_CODE, "EMVCO Initialize CardinalError: Null Locale "));
                }
                if (uiCustomization == null) {
                    str2 = new StringBuilder().append(str2).append(EMVCoError.INITIALIZE_ERROR_INVALID_UICUSTOMIZATION).toString();
                    this.cleanup.getInstance(new EMVCoError(EMVCoError.INITIALIZE_NULL_UICUSTOMIZATION_CODE, "EMVCO Initialize CardinalError: Null UICustomization "));
                }
                throw new InvalidInputException("InvalidInputException", new Throwable("Invalid Input Exception: ".concat(String.valueOf(str2))));
            }
            getInstance = context;
            if (!ThreeDSStrings.IS_EXTERNAL_BUILD) {
                new setHapticFeedbackEnabled(getInstance).cca_continue();
            }
            this.init = configParameters;
            this.cca_continue = uiCustomization;
            onCReqSuccess = new ArrayList();
            setTop settop = new setTop(!getClass().getName().equals(CardinalThreeDS2ServiceImpl.class.getName()), context);
            this.configure = settop;
            onCReqSuccess.addAll(settop.cca_continue());
            setAlpha.cca_continue(getInstance.getApplicationContext());
            setAlpha.Cardinal(setSaveEnabled.EMVCO, uiCustomization);
            this.cleanup.Cardinal("EMVCoInitialize", "UIInteractionFactory Configured");
            this.cleanup.Cardinal("EMVCoInitialize", ThreeDSStrings.THREE_DS_SERVICE_INITIALIZED);
            return;
        }
        this.cleanup.getInstance(new EMVCoError(EMVCoError.INITIALIZE_SDK_ALREADY_INITIALIZED, EMVCoError.INITIALIZE_SDK_ALREADY_INITIALIZED_MESSAGE));
        throw new SDKAlreadyInitializedException("SDKAlreadyInitializedException", new Throwable("ThreeDS SDK is already initialized"));
    }

    public void initialize(Context context, ConfigParameters configParameters) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException {
        initialize(context, configParameters, Resources.getSystem().getConfiguration().locale.toString(), new UiCustomization());
    }

    public Transaction createTransaction(String str) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException {
        return createTransaction(str, ThreeDSStrings.DEFAULT_VALUE_MESSAGE_VERSION);
    }

    public Transaction createTransaction(String str, String str2) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException {
        if (!this.getSDKVersion) {
            this.cleanup.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_SDK_NOT_INITIALIZED_CODE, EMVCoError.CREATE_TRANSACTION_SDK_NOT_INITIALIZED_MESSAGE));
            throw new SDKNotInitializedException("SDKNotInitializedException", new Throwable("ThreeDS SDK is not initialized"));
        } else if (str2 == null || !ThreeDSStrings.supportedMessageVersions.contains(str2)) {
            this.cleanup.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_INVALID_MESSAGE_VERSION_CODE, EMVCoError.CREATE_TRANSACTION_ERROR_MESSAGE));
            throw new InvalidInputException("Invalid MessageVersion", new Throwable(new StringBuilder("MessageVersion ").append(str2).append(" is Invalid").toString()));
        } else {
            setFocusable setfocusable = new setFocusable(getInstance, str, this.cca_continue, setHorizontalScrollBarEnabled.configure(str2), this.configure, this.init.getParamValue("locationDataConsentGiven"));
            setLongClickable cca_continue2 = setLongClickable.cca_continue();
            try {
                if (new setHapticFeedbackEnabled(getInstance).init(str)) {
                    cca_continue2.getInstance(setfocusable);
                    this.cleanup.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_SERVICE_TRANSACTION_CREATED);
                    this.cleanup.Cardinal();
                    return cca_continue2;
                }
                this.cleanup.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_INVALID_DSID, EMVCoError.CREATE_TRANSACTION_INVALID_DSID_ERROR_MESSAGE));
                throw new InvalidInputException("Invalid Directory Server ID", new Throwable(new StringBuilder("Directory Server Id ").append(str).append(" is not available").toString()));
            } catch (InvalidAlgorithmParameterException e) {
                this.cleanup.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_INVALID_ALGORITHM_PARAMETERS_CODE, new StringBuilder(EMVCoError.CREATE_TRANSACTION_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString()));
                throw new InvalidInputException("Exception in Creating transaction", e.getCause());
            } catch (NoSuchAlgorithmException e2) {
                this.cleanup.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_NO_SUCH_ALGORITHM_CODE, new StringBuilder(EMVCoError.CREATE_TRANSACTION_ERROR_MESSAGE).append(e2.getLocalizedMessage()).toString()));
                throw new SDKRuntimeException("Exception in Creating transaction", e2.getCause());
            }
        }
    }

    public void cleanup(Context context) throws SDKNotInitializedException {
        if (this.getSDKVersion) {
            if (Cardinal != null) {
                Cardinal = null;
            }
            if (getInstance != null) {
                getInstance = null;
            }
            setLongClickable.cca_continue().close();
            this.getSDKVersion = false;
            return;
        }
        this.cleanup.getInstance(new EMVCoError(EMVCoError.CLEAN_UP_SDK_NOT_INITIALIZED_CODE, "SDK Not Initialized"));
        throw new SDKNotInitializedException("SDKNotInitializedException", new Throwable("ThreeDS SDK is not initialized"));
    }

    public String getSDKVersion() throws SDKNotInitializedException, SDKRuntimeException {
        if (!this.getSDKVersion) {
            this.cleanup.getInstance(new EMVCoError(EMVCoError.GET_VERSION_SDK_NOT_INITIALIZED_CODE, "SDK Not Initialized"));
            throw new SDKNotInitializedException("SDKNotInitializedException", new Throwable("ThreeDS SDK is not initialized"));
        } else if (ThreeDSStrings.SDKVersion != null) {
            return ThreeDSStrings.SDKVersion;
        } else {
            this.cleanup.getInstance(new EMVCoError(EMVCoError.GET_VERSION_SDK_RUNTIME_EXCEPTION_CODE, EMVCoError.GET_VERSION_SDK_RUNTIME_EXCEPTION_MESSAGE));
            throw new SDKRuntimeException("SDKRuntimeException", new Throwable("ThreeDS SDK getVersion() RuntimeException"));
        }
    }

    public List<Warning> getWarnings() {
        return onCReqSuccess;
    }
}
