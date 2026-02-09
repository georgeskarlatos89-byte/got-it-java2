package com.cardinalcommerce.a;

import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import org.json.JSONException;

public final class setHasTransientState extends setKeyboardNavigationCluster {
    private static int Cardinal = 0;
    private static int configure = 1;
    private final setWillNotDraw init = setWillNotDraw.getInstance();

    public setHasTransientState(setVerticalScrollBarEnabled setverticalscrollbarenabled, String str) {
        try {
            setAutofillHints init2 = setAutofillHints.init();
            if (str == null && init2.init.init() != null) {
                str = init2.init.init();
            }
            super.Cardinal(str, setverticalscrollbarenabled.init().toString(), 8000);
        } catch (JSONException e) {
            this.init.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_ERROR_TASK_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_ERROR_TASK_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString()));
        }
    }

    public final void getInstance(String str) {
        int i = configure;
        int i2 = (((i & -116) | ((~i) & 115)) - (~(-(-((i & 115) << 1))))) - 1;
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        this.init.Cardinal("EMVCoTransaction", ThreeDSStrings.ERROR_TASK_ENDED);
        int i4 = configure + 89;
        Cardinal = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
        this.init.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_ERROR_TASK_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_ERROR_TASK_ERROR_MESSAGE).append(exc.getLocalizedMessage()).toString()));
        int i = (configure + 82) - 1;
        Cardinal = i % 128;
        int i2 = i % 2;
    }

    public final void configure(String str, int i) {
        super.configure(str, i);
        this.init.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_ERROR_TASK_ERROR, EMVCoError.CHALLENGE_TASK_ERROR_TASK_ERROR_MESSAGE.concat(String.valueOf(str))));
        int i2 = Cardinal;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        configure = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
