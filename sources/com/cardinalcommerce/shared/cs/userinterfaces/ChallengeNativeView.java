package com.cardinalcommerce.shared.cs.userinterfaces;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.cardinalcommerce.a.setAccessibilityLiveRegion;
import com.cardinalcommerce.a.setAlpha;
import com.cardinalcommerce.a.setAnimationMatrix;
import com.cardinalcommerce.a.setBottom;
import com.cardinalcommerce.a.setCameraDistance;
import com.cardinalcommerce.a.setFocusedByDefault;
import com.cardinalcommerce.a.setHorizontalScrollBarEnabled;
import com.cardinalcommerce.a.setHovered;
import com.cardinalcommerce.a.setLeft;
import com.cardinalcommerce.a.setRight;
import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.a.setTransitionVisibility;
import com.cardinalcommerce.a.setTranslationX;
import com.cardinalcommerce.a.setTranslationY;
import com.cardinalcommerce.a.setTranslationZ;
import com.cardinalcommerce.a.setVerticalFadingEdgeEnabled;
import com.cardinalcommerce.a.setX;
import com.cardinalcommerce.a.setY;
import com.cardinalcommerce.a.setZ;
import com.cardinalcommerce.cardinalmobilesdk.R;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import org.objectweb.asm.signature.SignatureVisitor;

public class ChallengeNativeView extends AppCompatActivity implements setFocusedByDefault {
    private static int setRenderType = 0;
    private static int setUiType = 1;
    private setY Cardinal;
    private setAccessibilityLiveRegion CardinalActionCode;
    private ProgressBar CardinalChallengeObserver;
    private List<setRight> CardinalConfigurationParameters;
    private setAnimationMatrix CardinalEnvironment;
    private setAnimationMatrix CardinalError;
    private setAnimationMatrix CardinalRenderType;
    private UiCustomization CardinalUiType;
    private Toolbar cca_continue;
    private setBottom cleanup;
    private setY configure;
    private setRight getActionCode;
    private String getChallengeTimeout = "";
    private boolean getEnvironment;
    private setY getInstance;
    private String getProxyAddress;
    private setTranslationZ getRequestTimeout;
    private setBottom getSDKVersion;
    private setTransitionVisibility getString;
    private BroadcastReceiver getUiType = new BroadcastReceiver() {
        private static int Cardinal = 1;
        private static int configure;

        public final void onReceive(Context context, Intent intent) {
            int i = configure + 53;
            Cardinal = i % 128;
            int i2 = i % 2;
            String action = intent.getAction();
            if ((action.equals(ThreeDSStrings.FINISH_ACTIVITY) ? 23 : '7') != '7') {
                int i3 = configure;
                int i4 = (i3 ^ 108) + ((i3 & 108) << 1);
                int i5 = (i4 ^ -1) + ((i4 & -1) << 1);
                Cardinal = i5 % 128;
                int i6 = i5 % 2;
                setAlpha.cca_continue(ChallengeNativeView.this.getApplicationContext()).init();
                ChallengeNativeView.this.finish();
                int i7 = Cardinal;
                int i8 = ((i7 | 39) << 1) - (i7 ^ 39);
                configure = i8 % 128;
                int i9 = i8 % 2;
            }
            boolean z = false;
            if ((action.equals(ThreeDSStrings.CHALLENGE_TIMEOUT_ACTIVITY) ? '(' : '_') != '_') {
                int i10 = Cardinal + 35;
                configure = i10 % 128;
                int i11 = i10 % 2;
                ChallengeNativeView.this.setResult(0);
                ChallengeNativeView.this.finish();
                int i12 = Cardinal;
                int i13 = (i12 ^ 11) + ((i12 & 11) << 1);
                configure = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = configure;
            int i16 = i15 & 121;
            int i17 = -(-((i15 ^ 121) | i16));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            Cardinal = i18 % 128;
            if (i18 % 2 != 0) {
                z = true;
            }
            if (!z) {
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        }
    };
    private setLeft getWarnings;
    private setAnimationMatrix init;
    private setAnimationMatrix onCReqSuccess;
    private setAnimationMatrix onValidated;
    private ArrayList<setCameraDistance> setChallengeTimeout;
    private boolean setEnvironment = false;
    private WeakReference<Context> setProxyAddress;
    private setTranslationX setRequestTimeout;
    private setAnimationMatrix valueOf;
    private setAnimationMatrix values;

    static /* synthetic */ setTranslationZ Cardinal(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i ^ 25;
        int i3 = (i & 25) << 1;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        setRenderType = i4 % 128;
        int i5 = i4 % 2;
        setTranslationZ settranslationz = challengeNativeView.getRequestTimeout;
        int i6 = (i & 7) + (i | 7);
        setRenderType = i6 % 128;
        if ((i6 % 2 != 0 ? 'c' : 17) != 'c') {
            return settranslationz;
        }
        int i7 = 20 / 0;
        return settranslationz;
    }

    static /* synthetic */ setAnimationMatrix CardinalActionCode(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = i & 99;
        int i3 = (i | 99) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        setUiType = i6;
        int i7 = i5 % 2;
        setAnimationMatrix setanimationmatrix = challengeNativeView.CardinalRenderType;
        int i8 = i6 & 79;
        int i9 = (i6 ^ 79) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        setRenderType = i10 % 128;
        int i11 = i10 % 2;
        return setanimationmatrix;
    }

    static /* synthetic */ ProgressBar CardinalChallengeObserver(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i + 93;
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = challengeNativeView.CardinalChallengeObserver;
        int i4 = (i & 25) + (i | 25);
        setRenderType = i4 % 128;
        int i5 = i4 % 2;
        return progressBar;
    }

    static /* synthetic */ setAnimationMatrix CardinalConfigurationParameters(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = (i & 61) + (i | 61);
        int i3 = i2 % 128;
        setRenderType = i3;
        int i4 = i2 % 2;
        setAnimationMatrix setanimationmatrix = challengeNativeView.values;
        int i5 = ((i3 ^ 124) + ((i3 & 124) << 1)) - 1;
        setUiType = i5 % 128;
        if (i5 % 2 != 0) {
            return setanimationmatrix;
        }
        throw null;
    }

    static /* synthetic */ setAccessibilityLiveRegion CardinalEnvironment(ChallengeNativeView challengeNativeView) {
        int i = setUiType + 32;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        setRenderType = i2 % 128;
        char c = i2 % 2 != 0 ? 'Z' : 'A';
        setAccessibilityLiveRegion setaccessibilityliveregion = challengeNativeView.CardinalActionCode;
        if (c == 'A') {
            return setaccessibilityliveregion;
        }
        throw null;
    }

    static /* synthetic */ void CardinalError(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i | 55;
        int i3 = i2 << 1;
        int i4 = -((~(i & 55)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        setRenderType = i5 % 128;
        char c = i5 % 2 != 0 ? '`' : '^';
        challengeNativeView.getInstance();
        if (c == '`') {
            int i6 = 74 / 0;
        }
    }

    static /* synthetic */ setRight CardinalRenderType(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        boolean z = true;
        int i2 = (i ^ 90) + ((i & 90) << 1);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        setUiType = i3 % 128;
        char c = i3 % 2 == 0 ? 22 : '5';
        Throwable th = null;
        setRight setright = challengeNativeView.getActionCode;
        if (c != 22) {
            int i4 = ((i ^ 111) | (i & 111)) << 1;
            int i5 = -(((~i) & 111) | (i & -112));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            setUiType = i6 % 128;
            if (i6 % 2 != 0) {
                z = false;
            }
            if (!z) {
                return setright;
            }
            super.hashCode();
            throw th;
        }
        throw th;
    }

    static /* synthetic */ void CardinalUiType(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = (i & -78) | ((~i) & 77);
        boolean z = true;
        int i3 = -(-((i & 77) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        setUiType = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        challengeNativeView.getSDKVersion();
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    static /* synthetic */ String cca_continue(ChallengeNativeView challengeNativeView, String str) {
        int i = setUiType;
        int i2 = i & 75;
        int i3 = (i ^ 75) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        setRenderType = i5;
        boolean z = i4 % 2 == 0;
        challengeNativeView.getChallengeTimeout = str;
        if (z) {
            int i6 = i5 & 113;
            int i7 = i6 + ((i5 ^ 113) | i6);
            setUiType = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ boolean cca_continue(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = (i & -98) | ((~i) & 97);
        int i3 = (i & 97) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        setUiType = i4 % 128;
        if ((i4 % 2 == 0 ? 'b' : ':') != 'b') {
            return challengeNativeView.CardinalRenderType();
        }
        challengeNativeView.CardinalRenderType();
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ String cleanup(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i & 95;
        int i3 = (i2 - (~(-(-((i ^ 95) | i2))))) - 1;
        int i4 = i3 % 128;
        setRenderType = i4;
        boolean z = i3 % 2 == 0;
        String str = challengeNativeView.getChallengeTimeout;
        if (z) {
            int i5 = (i4 & 123) + (i4 | 123);
            setUiType = i5 % 128;
            if ((i5 % 2 == 0 ? '2' : '?') != '2') {
                return str;
            }
            throw null;
        }
        throw null;
    }

    static /* synthetic */ String configure(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = (i ^ 92) + ((i & 92) << 1);
        int i3 = (i2 & -1) + (i2 | -1);
        setUiType = i3 % 128;
        char c = i3 % 2 == 0 ? 'S' : ',';
        String str = challengeNativeView.getProxyAddress;
        if (c != 'S') {
            int i4 = ((i | 1) << 1) - (((~i) & 1) | (i & -2));
            setUiType = i4 % 128;
            if ((i4 % 2 == 0 ? SignatureVisitor.INSTANCEOF : 'J') == 'J') {
                return str;
            }
            int i5 = 96 / 0;
            return str;
        }
        throw null;
    }

    static /* synthetic */ void configure(ChallengeNativeView challengeNativeView, UiCustomization uiCustomization, boolean z) {
        int i = setUiType;
        int i2 = i | 107;
        int i3 = i2 << 1;
        int i4 = -((~(i & 107)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        setRenderType = i5 % 128;
        int i6 = i5 % 2;
        challengeNativeView.Cardinal(uiCustomization, z);
        int i7 = setUiType;
        int i8 = ((i7 | 124) << 1) - (i7 ^ 124);
        int i9 = (i8 ^ -1) + ((i8 & -1) << 1);
        setRenderType = i9 % 128;
        if ((i9 % 2 != 0 ? '@' : '&') != '&') {
            int i10 = 3 / 0;
        }
    }

    static /* synthetic */ setAnimationMatrix getActionCode(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = (i & 11) + (i | 11);
        setRenderType = i2 % 128;
        boolean z = i2 % 2 == 0;
        setAnimationMatrix setanimationmatrix = challengeNativeView.valueOf;
        if (!z) {
            int i3 = 83 / 0;
        }
        int i4 = i | 53;
        int i5 = ((i4 << 1) - (~(-((~(i & 53)) & i4)))) - 1;
        setRenderType = i5 % 128;
        if ((i5 % 2 != 0 ? (char) 14 : 7) != 14) {
            return setanimationmatrix;
        }
        int i6 = 88 / 0;
        return setanimationmatrix;
    }

    static /* synthetic */ setAccessibilityLiveRegion getInstance(ChallengeNativeView challengeNativeView, setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = setUiType;
        int i2 = i | 87;
        int i3 = i2 << 1;
        int i4 = -((~(i & 87)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        setRenderType = i6;
        int i7 = i5 % 2;
        challengeNativeView.CardinalActionCode = setaccessibilityliveregion;
        boolean z = false;
        int i8 = ((i6 + 46) - 0) - 1;
        setUiType = i8 % 128;
        if (i8 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return setaccessibilityliveregion;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ setLeft getInstance(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = (i & -44) | ((~i) & 43);
        int i3 = -(-((i & 43) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        setRenderType = i5;
        boolean z = false;
        boolean z2 = i4 % 2 == 0;
        Throwable th = null;
        setLeft setleft = challengeNativeView.getWarnings;
        if (z2) {
            int i6 = i5 + 94;
            int i7 = (i6 ^ -1) + ((i6 & -1) << 1);
            setUiType = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return setleft;
            }
            super.hashCode();
            throw th;
        }
        super.hashCode();
        throw th;
    }

    static /* synthetic */ String getSDKVersion(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i ^ 101;
        int i3 = ((i & 101) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        setRenderType = i5 % 128;
        if ((i5 % 2 != 0 ? Typography.amp : '2') == '2') {
            String cca_continue2 = challengeNativeView.cca_continue();
            int i6 = setRenderType;
            int i7 = i6 ^ 11;
            int i8 = (i6 & 11) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            setUiType = i9 % 128;
            if (!(i9 % 2 == 0)) {
                return cca_continue2;
            }
            throw null;
        }
        challengeNativeView.cca_continue();
        throw null;
    }

    static /* synthetic */ boolean getString(ChallengeNativeView challengeNativeView) {
        int i = (setRenderType + 66) - 1;
        setUiType = i % 128;
        Throwable th = null;
        if ((i % 2 == 0 ? '6' : 4) != '6') {
            boolean onCReqSuccess2 = challengeNativeView.onCReqSuccess();
            int i2 = setRenderType;
            int i3 = i2 & 99;
            int i4 = (((i2 ^ 99) | i3) << 1) - ((i2 | 99) & (~i3));
            setUiType = i4 % 128;
            if (i4 % 2 != 0) {
                return onCReqSuccess2;
            }
            super.hashCode();
            throw th;
        }
        challengeNativeView.onCReqSuccess();
        throw th;
    }

    static /* synthetic */ UiCustomization getWarnings(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        boolean z = true;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        setRenderType = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        UiCustomization uiCustomization = challengeNativeView.CardinalUiType;
        if (z) {
            return uiCustomization;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ WeakReference init(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        boolean z = true;
        int i2 = (i + 18) - 1;
        setRenderType = i2 % 128;
        char c = i2 % 2 != 0 ? 'Q' : 27;
        WeakReference<Context> weakReference = challengeNativeView.setProxyAddress;
        if (c != 'Q') {
            int i3 = (i ^ 13) + ((i & 13) << 1);
            setRenderType = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            if (z) {
                return weakReference;
            }
            int i4 = 7 / 0;
            return weakReference;
        }
        throw null;
    }

    static /* synthetic */ void init(ChallengeNativeView challengeNativeView, setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = setUiType;
        int i2 = (((i | 26) << 1) - (i ^ 26)) - 1;
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
        challengeNativeView.cca_continue(setaccessibilityliveregion);
        int i4 = setUiType;
        int i5 = (i4 ^ 7) + ((i4 & 7) << 1);
        setRenderType = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void init(ChallengeNativeView challengeNativeView, setTransitionVisibility settransitionvisibility) {
        int i = (((setUiType + 113) - 1) + 0) - 1;
        setRenderType = i % 128;
        int i2 = i % 2;
        challengeNativeView.init(settransitionvisibility);
        int i3 = setUiType;
        int i4 = i3 & 35;
        int i5 = (i4 - (~((i3 ^ 35) | i4))) - 1;
        setRenderType = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ ArrayList onCReqSuccess(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = i & 87;
        int i3 = ((~i2) & (i | 87)) + (i2 << 1);
        setUiType = i3 % 128;
        char c = i3 % 2 == 0 ? 3 : '9';
        Throwable th = null;
        ArrayList<setCameraDistance> arrayList = challengeNativeView.setChallengeTimeout;
        if (c != 3) {
            int i4 = (i & -16) | ((~i) & 15);
            int i5 = -(-((i & 15) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            setUiType = i6 % 128;
            if ((i6 % 2 == 0 ? Typography.dollar : '<') == '<') {
                return arrayList;
            }
            super.hashCode();
            throw th;
        }
        super.hashCode();
        throw th;
    }

    static /* synthetic */ setBottom onValidated(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i & 67;
        int i3 = (i | 67) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        setRenderType = i6;
        boolean z = i5 % 2 != 0;
        setBottom setbottom = challengeNativeView.cleanup;
        if (!z) {
            int i7 = i6 & 123;
            int i8 = ((i6 | 123) & (~i7)) + (i7 << 1);
            setUiType = i8 % 128;
            int i9 = i8 % 2;
            return setbottom;
        }
        throw null;
    }

    static /* synthetic */ setAnimationMatrix setRequestTimeout(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i & 71;
        int i3 = (i | 71) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        setRenderType = i5 % 128;
        char c = i5 % 2 != 0 ? 'Y' : '^';
        setAnimationMatrix setanimationmatrix = challengeNativeView.CardinalError;
        if (c != 'Y') {
            return setanimationmatrix;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ setBottom valueOf(ChallengeNativeView challengeNativeView) {
        int i = setRenderType;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        setUiType = i2 % 128;
        char c = i2 % 2 == 0 ? 'G' : '0';
        setBottom setbottom = challengeNativeView.getSDKVersion;
        if (c != '0') {
            int i3 = 95 / 0;
        }
        return setbottom;
    }

    static /* synthetic */ setTransitionVisibility values(ChallengeNativeView challengeNativeView) {
        int i = setUiType;
        int i2 = i & 77;
        int i3 = i | 77;
        int i4 = (i2 & i3) + (i3 | i2);
        setRenderType = i4 % 128;
        char c = i4 % 2 != 0 ? 27 : ' ';
        setTransitionVisibility settransitionvisibility = challengeNativeView.getString;
        if (c != ' ') {
            int i5 = 18 / 0;
        }
        return settransitionvisibility;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.content.IntentFilter r11 = new android.content.IntentFilter
            r11.<init>()
            java.lang.String r0 = "finish_activity"
            r11.addAction(r0)
            java.lang.String r0 = "challenge_timeout_activity"
            r11.addAction(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 62
            r2 = 34
            if (r0 < r2) goto L_0x001c
            r0 = r1
            goto L_0x001e
        L_0x001c:
            r0 = 26
        L_0x001e:
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r1) goto L_0x003e
            android.content.BroadcastReceiver r0 = r10.getUiType
            r10.registerReceiver(r0, r11)
            int r11 = setRenderType
            r0 = r11 & 51
            int r1 = ~r0
            r11 = r11 | 51
            r11 = r11 & r1
            int r0 = r0 << r6
            int r0 = -r0
            int r0 = -r0
            r1 = r11 & r0
            r11 = r11 | r0
            int r1 = r1 + r11
            int r11 = r1 % 128
            setUiType = r11
            int r1 = r1 % r5
            goto L_0x0059
        L_0x003e:
            int r0 = setRenderType
            int r0 = r0 + 17
            int r1 = r0 % 128
            setUiType = r1
            int r0 = r0 % r5
            if (r0 != 0) goto L_0x004b
            r0 = r6
            goto L_0x004c
        L_0x004b:
            r0 = r4
        L_0x004c:
            if (r0 == 0) goto L_0x0054
            android.content.BroadcastReceiver r0 = r10.getUiType
            r10.registerReceiver(r0, r11, r3)
            goto L_0x0059
        L_0x0054:
            android.content.BroadcastReceiver r0 = r10.getUiType
            r10.registerReceiver(r0, r11, r5)
        L_0x0059:
            boolean r11 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.IS_EXTERNAL_BUILD
            r0 = 69
            r1 = 67
            if (r11 == 0) goto L_0x0063
            r11 = r0
            goto L_0x0064
        L_0x0063:
            r11 = r1
        L_0x0064:
            r7 = 56
            if (r11 == r1) goto L_0x0091
            int r11 = setRenderType
            r8 = r11 & 71
            r11 = r11 ^ 71
            r11 = r11 | r8
            int r11 = -r11
            int r11 = -r11
            r9 = r8 & r11
            r11 = r11 | r8
            int r9 = r9 + r11
            int r11 = r9 % 128
            setUiType = r11
            int r9 = r9 % r5
            if (r9 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = r7
        L_0x007e:
            android.view.Window r11 = r10.getWindow()
            if (r0 == r7) goto L_0x008c
            r0 = 2854(0xb26, float:4.0E-42)
            r8 = 27605(0x6bd5, float:3.8683E-41)
            r11.setFlags(r0, r8)
            goto L_0x0091
        L_0x008c:
            r0 = 8192(0x2000, float:1.14794E-41)
            r11.setFlags(r0, r0)
        L_0x0091:
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r11 = java.util.Objects.requireNonNull(r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.String r0 = "StepUpData"
            java.io.Serializable r11 = r11.getSerializable(r0)
            com.cardinalcommerce.a.setTransitionVisibility r11 = (com.cardinalcommerce.a.setTransitionVisibility) r11
            r10.getString = r11
            java.lang.String r11 = r11.configure()
            r10.getProxyAddress = r11
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = "ActivityObserverDriven"
            boolean r11 = r11.getBooleanExtra(r0, r4)
            r10.getEnvironment = r11
            com.cardinalcommerce.a.setTranslationY r11 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "UIType "
            r0.<init>(r8)
            java.lang.String r8 = r10.getProxyAddress
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            r8 = 0
            java.lang.String r9 = "Native Challenge Screen"
            r11.cca_continue(r9, r0, r8)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.content.Context r0 = r10.getApplicationContext()
            r11.<init>(r0)
            r10.setProxyAddress = r11
            java.lang.String r11 = r10.getProxyAddress
            int r0 = r11.hashCode()
            r8 = 35
            r9 = 5
            switch(r0) {
                case 1537: goto L_0x0175;
                case 1538: goto L_0x0154;
                case 1539: goto L_0x0128;
                case 1540: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x019d
        L_0x00ef:
            java.lang.String r0 = "04"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r8 = r1
        L_0x00f9:
            if (r8 == r1) goto L_0x019d
            int r11 = setUiType
            r0 = r11 | 5
            int r0 = r0 << r6
            r1 = r11 & -6
            int r11 = ~r11
            r11 = r11 & r9
            r11 = r11 | r1
            int r11 = -r11
            r1 = r0 | r11
            int r1 = r1 << r6
            r11 = r11 ^ r0
            int r1 = r1 - r11
            int r11 = r1 % 128
            setRenderType = r11
            int r1 = r1 % r5
            if (r1 == 0) goto L_0x0114
            r0 = r4
            goto L_0x0115
        L_0x0114:
            r0 = r6
        L_0x0115:
            if (r0 == r6) goto L_0x0119
            r0 = r9
            goto L_0x011a
        L_0x0119:
            r0 = r3
        L_0x011a:
            r1 = r11 ^ 94
            r11 = r11 & 94
            int r11 = r11 << r6
            int r1 = r1 + r11
            int r1 = r1 - r6
            int r11 = r1 % 128
            setUiType = r11
            int r1 = r1 % r5
            goto L_0x019e
        L_0x0128:
            java.lang.String r0 = "03"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0132
            r11 = r6
            goto L_0x0133
        L_0x0132:
            r11 = r4
        L_0x0133:
            if (r11 == 0) goto L_0x019d
            int r11 = setUiType
            int r11 = r11 + 32
            int r11 = r11 - r6
            int r0 = r11 % 128
            setRenderType = r0
            int r11 = r11 % r5
            r11 = r0 & -106(0xffffffffffffff96, float:NaN)
            int r1 = ~r0
            r8 = 105(0x69, float:1.47E-43)
            r1 = r1 & r8
            r11 = r11 | r1
            r0 = r0 & r8
            int r0 = r0 << r6
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r11 = r11 - r0
            int r11 = r11 - r6
            int r0 = r11 % 128
            setUiType = r0
            int r11 = r11 % r5
            r0 = r5
            goto L_0x019e
        L_0x0154:
            java.lang.String r0 = "02"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x015e
            r11 = r6
            goto L_0x015f
        L_0x015e:
            r11 = r4
        L_0x015f:
            if (r11 == r6) goto L_0x0162
            goto L_0x019d
        L_0x0162:
            int r11 = setRenderType
            r0 = r11 & 35
            int r1 = ~r0
            r11 = r11 | r8
            r11 = r11 & r1
            int r0 = r0 << r6
            r1 = r11 & r0
            r11 = r11 | r0
            int r1 = r1 + r11
            int r11 = r1 % 128
            setUiType = r11
            int r1 = r1 % r5
            r0 = r6
            goto L_0x019e
        L_0x0175:
            java.lang.String r0 = "01"
            boolean r11 = r11.equals(r0)
            r0 = 29
            if (r11 == 0) goto L_0x0181
            r11 = r0
            goto L_0x0183
        L_0x0181:
            r11 = 20
        L_0x0183:
            if (r11 == r0) goto L_0x0186
            goto L_0x019d
        L_0x0186:
            int r11 = setUiType
            r0 = r11 & 3
            r1 = r11 ^ 3
            r1 = r1 | r0
            int r0 = r0 + r1
            int r1 = r0 % 128
            setRenderType = r1
            int r0 = r0 % r5
            int r11 = r11 + 8
            int r11 = r11 - r6
            int r0 = r11 % 128
            setRenderType = r0
            int r11 = r11 % r5
            r0 = r4
            goto L_0x019e
        L_0x019d:
            r0 = -1
        L_0x019e:
            if (r0 == 0) goto L_0x0227
            if (r0 == r6) goto L_0x01f7
            if (r0 == r5) goto L_0x01c5
            if (r0 == r3) goto L_0x01a8
            goto L_0x0269
        L_0x01a8:
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.layout.activity_oob_challenge_view
            r10.setContentView((int) r11)
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.submitAuthenticationButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.cleanup = r11
            int r11 = setRenderType
            r0 = r11 & 56
            r11 = r11 | r7
            int r0 = r0 + r11
            int r0 = r0 - r6
            int r11 = r0 % 128
            setUiType = r11
            int r0 = r0 % r5
            goto L_0x0269
        L_0x01c5:
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.layout.activity_multi_select_challenge_view
            r10.setContentView((int) r11)
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.challengeInfoLabelTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.onValidated = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.resendInfoButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.getSDKVersion = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.ss_submitAuthenticationButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.cleanup = r11
            int r11 = setUiType
            r0 = r11 & 89
            r11 = r11 | 89
            int r11 = ~r11
            int r0 = r0 - r11
            int r0 = r0 - r6
            int r11 = r0 % 128
            setRenderType = r11
        L_0x01f5:
            int r0 = r0 % r5
            goto L_0x0269
        L_0x01f7:
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.layout.activity_single_select_challenge_view
            r10.setContentView((int) r11)
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.challengeInfoLabelTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.onValidated = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.resendInfoButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.getSDKVersion = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.ss_submitAuthenticationButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.cleanup = r11
            int r11 = setRenderType
            r0 = r11 ^ 15
            r11 = r11 & 15
            int r11 = r11 << r6
            int r0 = r0 + r11
            int r11 = r0 % 128
            setUiType = r11
            goto L_0x01f5
        L_0x0227:
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.layout.activity_otp_challenge_view
            r10.setContentView((int) r11)
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.challengeInfoLabelTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.onValidated = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.codeEditTextField
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setLeft r11 = (com.cardinalcommerce.a.setLeft) r11
            r10.getWarnings = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.submitAuthenticationButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.cleanup = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.resendInfoButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setBottom r11 = (com.cardinalcommerce.a.setBottom) r11
            r10.getSDKVersion = r11
            int r11 = setRenderType
            r0 = r11 | 5
            int r0 = r0 << r6
            r1 = r11 & -6
            int r11 = ~r11
            r11 = r11 & r9
            r11 = r11 | r1
            int r11 = -r11
            r1 = r0 ^ r11
            r11 = r11 & r0
            int r11 = r11 << r6
            int r1 = r1 + r11
            int r11 = r1 % 128
            setUiType = r11
            int r1 = r1 % r5
        L_0x0269:
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.challengeInfoTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.onCReqSuccess = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.toolbar
            android.view.View r11 = r10.findViewById(r11)
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r10.cca_continue = r11
            r10.setSupportActionBar(r11)
            androidx.appcompat.app.ActionBar r11 = r10.getSupportActionBar()
            java.lang.Object r11 = java.util.Objects.requireNonNull(r11)
            androidx.appcompat.app.ActionBar r11 = (androidx.appcompat.app.ActionBar) r11
            r11.setDisplayShowTitleEnabled(r4)
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.toolbarButton
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.CardinalEnvironment = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.pbHeaderProgress
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ProgressBar r11 = (android.widget.ProgressBar) r11
            r10.CardinalChallengeObserver = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.issuerImageView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setY r11 = (com.cardinalcommerce.a.setY) r11
            r10.Cardinal = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.psImageView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setY r11 = (com.cardinalcommerce.a.setY) r11
            r10.configure = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.warningIndicator
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setY r11 = (com.cardinalcommerce.a.setY) r11
            r10.getInstance = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.challengeInfoHeaderTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.init = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.whyInfoLableTextview
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.CardinalRenderType = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.whyInfoDecTextview
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.valueOf = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.helpLabelTextView
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.CardinalError = r11
            int r11 = com.cardinalcommerce.cardinalmobilesdk.R.id.helpDecTextview
            android.view.View r11 = r10.findViewById(r11)
            com.cardinalcommerce.a.setAnimationMatrix r11 = (com.cardinalcommerce.a.setAnimationMatrix) r11
            r10.values = r11
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "UiCustomization"
            java.io.Serializable r11 = r11.getSerializable(r0)
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r11 = (com.cardinalcommerce.shared.userinterfaces.UiCustomization) r11
            r10.CardinalUiType = r11
            com.cardinalcommerce.a.setTransitionVisibility r11 = r10.getString
            r10.init((com.cardinalcommerce.a.setTransitionVisibility) r11)
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r11 = r10.CardinalUiType
            r10.cca_continue((com.cardinalcommerce.shared.userinterfaces.UiCustomization) r11)
            r10.Cardinal()
            r10.onValidated()
            r10.getWarnings()
            int r11 = setUiType
            r0 = r11 ^ 65
            r1 = r11 & 65
            r0 = r0 | r1
            int r0 = r0 << r6
            int r1 = ~r1
            r11 = r11 | 65
            r11 = r11 & r1
            int r11 = -r11
            r1 = r0 ^ r11
            r11 = r11 & r0
            int r11 = r11 << r6
            int r1 = r1 + r11
            int r11 = r1 % 128
            setRenderType = r11
            int r1 = r1 % r5
            r11 = 38
            if (r1 == 0) goto L_0x0334
            r0 = 63
            goto L_0x0335
        L_0x0334:
            r0 = r11
        L_0x0335:
            if (r0 == r11) goto L_0x033b
            int r2 = r2 / r4
            return
        L_0x0339:
            r11 = move-exception
            throw r11
        L_0x033b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r3 != true) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if ((r6.setEnvironment ? '*' : 10) != '*') goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            int r0 = setUiType
            r1 = r0 & -34
            int r2 = ~r0
            r2 = r2 & 33
            r1 = r1 | r2
            r0 = r0 & 33
            r2 = 1
            int r0 = r0 << r2
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            setRenderType = r0
            int r3 = r3 % 2
            r0 = 36
            if (r3 == 0) goto L_0x001d
            r1 = 94
            goto L_0x001e
        L_0x001d:
            r1 = r0
        L_0x001e:
            java.lang.String r3 = "Challenge Screen back to foreground"
            java.lang.String r4 = "Native Challenge Screen"
            r5 = 0
            if (r1 == r0) goto L_0x003b
            com.cardinalcommerce.a.setTranslationY r0 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            r0.cca_continue(r4, r3, r5)
            boolean r0 = r6.setEnvironment
            r1 = 76
            r3 = 0
            int r1 = r1 / r3
            if (r0 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            if (r3 == r2) goto L_0x007d
            goto L_0x004f
        L_0x0039:
            r0 = move-exception
            throw r0
        L_0x003b:
            com.cardinalcommerce.a.setTranslationY r0 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            r0.cca_continue(r4, r3, r5)
            boolean r0 = r6.setEnvironment
            r1 = 42
            if (r0 == 0) goto L_0x004a
            r0 = r1
            goto L_0x004c
        L_0x004a:
            r0 = 10
        L_0x004c:
            if (r0 == r1) goto L_0x004f
            goto L_0x007d
        L_0x004f:
            java.lang.String r0 = r6.getProxyAddress
            java.lang.String r1 = "04"
            boolean r0 = r0.equals(r1)
            r1 = 47
            if (r0 == 0) goto L_0x005d
            r0 = r1
            goto L_0x005f
        L_0x005d:
            r0 = 69
        L_0x005f:
            if (r0 == r1) goto L_0x0062
            goto L_0x007d
        L_0x0062:
            int r0 = setUiType
            int r0 = r0 + 105
            int r1 = r0 % 128
            setRenderType = r1
            int r0 = r0 % 2
            r6.init()
            int r0 = setRenderType
            r1 = r0 & 35
            r0 = r0 ^ 35
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            setUiType = r0
            int r1 = r1 % 2
        L_0x007d:
            super.onResume()
            int r0 = setUiType
            int r0 = r0 + 53
            int r1 = r0 % 128
            setRenderType = r1
            int r0 = r0 % 2
            r1 = 13
            if (r0 == 0) goto L_0x0090
            r0 = r1
            goto L_0x0092
        L_0x0090:
            r0 = 23
        L_0x0092:
            if (r0 == r1) goto L_0x0095
            return
        L_0x0095:
            throw r5     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        int i = (((setRenderType + 65) - 1) + 0) - 1;
        setUiType = i % 128;
        int i2 = i % 2;
        this.setEnvironment = true;
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Challenge screen in background", (String) null);
        super.onPause();
        int i3 = setUiType;
        int i4 = i3 & 33;
        int i5 = ((i3 ^ 33) | i4) << 1;
        int i6 = -((i3 | 33) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        setRenderType = i7 % 128;
        int i8 = i7 % 2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        int i = setRenderType;
        int i2 = i & 95;
        int i3 = (i | 95) & (~i2);
        boolean z = true;
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        setUiType = i5 % 128;
        int i6 = i5 % 2;
        unregisterReceiver(this.getUiType);
        setAlpha.cca_continue(this).cca_continue();
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Activity closed", (String) null);
        super.onDestroy();
        int i7 = setRenderType + 61;
        setUiType = i7 % 128;
        if (i7 % 2 == 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fa, code lost:
        if (r2 == 28) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0204, code lost:
        if (r18.cleanup().isEmpty() != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0206, code lost:
        r2 = 'b';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0209, code lost:
        r2 = '\\';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020a, code lost:
        if (r2 == '\\') goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020c, code lost:
        r2 = setRenderType;
        r5 = (r2 & 6) + (r2 | 6);
        r2 = ((r5 | true ? 1 : 0) << r3) - (r5 ^ -1);
        setUiType = r2 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021d, code lost:
        if ((r2 % 2) != 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021f, code lost:
        r2 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0221, code lost:
        r2 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0223, code lost:
        if (r2 == 27) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0225, code lost:
        r1.onValidated.setCCAText(r18.cleanup());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022f, code lost:
        r1.onValidated.setCCAText(r18.cleanup());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r2 = 8 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023f, code lost:
        r1.onValidated.setVisibility(8);
        r2 = setUiType;
        r5 = r2 ^ true;
        r2 = (((r2 & true) | r5 ? 1 : 0) << r3) - (r5 ? 1 : 0);
        setRenderType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0258, code lost:
        if (onCReqSuccess() == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x025a, code lost:
        r2 = 'K';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025c, code lost:
        r2 = 'X';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0260, code lost:
        if (r2 == 'X') goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0262, code lost:
        r2 = setUiType;
        r6 = (r2 ^ 95) + ((r2 & true ? 1 : 0) << r3);
        setRenderType = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x026f, code lost:
        if ((r6 % 2) == 0) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0271, code lost:
        r2 = 'K';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0273, code lost:
        r2 = 'E';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0275, code lost:
        if (r2 == 'K') goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0277, code lost:
        r1.getSDKVersion.setCCAVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027c, code lost:
        r1.getSDKVersion.setCCAText(r18.getActionCode());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0286, code lost:
        r1.getSDKVersion.setCCAVisibility(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028c, code lost:
        r2 = setRenderType;
        r5 = r2 & 121;
        r5 = (r5 - (~((r2 ^ 121) | r5))) - r3;
        setUiType = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029f, code lost:
        if (r18.setRequestTimeout() == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a1, code lost:
        r2 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a4, code lost:
        r2 = '(';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a5, code lost:
        if (r2 == '(') goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a7, code lost:
        r2 = setRenderType;
        r5 = (r2 ^ 79) + ((r2 & true ? 1 : 0) << r3);
        setUiType = r5 % 128;
        r5 = r5 % 2;
        r1.cleanup.setCCAText(r18.setRequestTimeout());
        r2 = setRenderType;
        r5 = (r2 & 121) + (r2 | 121);
        setUiType = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02cd, code lost:
        if (r18.CardinalActionCode() == null) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02cf, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d1, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        if (r2 == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d4, code lost:
        r2 = setRenderType;
        r5 = r2 & 115;
        r5 = (r5 - (~(-(-((r2 ^ 115) | r5))))) - r3;
        setUiType = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e5, code lost:
        if ((r5 % 2) != 0) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e7, code lost:
        r2 = 'R';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ea, code lost:
        r2 = 'N';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ee, code lost:
        if (r2 == 'N') goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r5 = 73 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02f9, code lost:
        if (r1.getProxyAddress.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_OOB) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r2 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02fe, code lost:
        r2 = 'G';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0302, code lost:
        if (r2 == 'G') goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0305, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0307, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x030e, code lost:
        if (r1.getProxyAddress.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_OOB) == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0310, code lost:
        r2 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0312, code lost:
        r2 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0314, code lost:
        if (r2 == 27) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0317, code lost:
        r2 = setUiType;
        r5 = r2 & true;
        r2 = (r2 | 45) & (~(r5 ? 1 : 0));
        r5 = r5 << r3;
        r6 = (r2 & r5) + (r2 | r5);
        setRenderType = r6 % 128;
        r6 = r6 % 2;
        r1.cleanup.setCCAText(r18.CardinalActionCode());
        r2 = (setRenderType + 52) - r3;
        setUiType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0340, code lost:
        if (r18.getSDKVersion() == null) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0344, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0345, code lost:
        if (r2 == false) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0347, code lost:
        r2 = setRenderType;
        r6 = r2 & true;
        r5 = (((r2 ^ true) | r6 ? 1 : 0) << r3) - ((r2 | 37) & (~(r6 ? 1 : 0)));
        setUiType = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0359, code lost:
        if ((r5 % 2) != 0) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035b, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x035e, code lost:
        if (r2 != false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0360, code lost:
        r1.init.setCCAText(r18.getSDKVersion());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x036a, code lost:
        r1.init.setCCAText(r18.getSDKVersion());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0374, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0376, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0377, code lost:
        r1.init.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0380, code lost:
        if (r18.onValidated() == null) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0382, code lost:
        r2 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0385, code lost:
        r2 = 'Y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0387, code lost:
        if (r2 == 'Y') goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0389, code lost:
        r2 = (setUiType + 41) - r3;
        r4 = (r2 & -1) + (r2 | -1);
        setRenderType = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0397, code lost:
        if ((r4 % 2) == 0) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0399, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x039b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x039c, code lost:
        if (r2 == r3) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x039e, code lost:
        r1.onCReqSuccess.setCCAText(r18.onValidated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a8, code lost:
        r1.onCReqSuccess.setCCAText(r18.onValidated());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03b4, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03b7, code lost:
        r1.onCReqSuccess.setVisibility(4);
        r2 = setUiType;
        r6 = r2 & true;
        r4 = ((r2 ^ true) | r6 ? 1 : 0) << r3;
        r2 = -((r2 | 19) & (~(r6 ? 1 : 0)));
        r6 = (r4 & r2) + (r2 | r4);
        setRenderType = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03d6, code lost:
        if (r18.CardinalEnvironment() == null) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03d8, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03da, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03db, code lost:
        if (r2 == r3) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03dd, code lost:
        r2 = setRenderType;
        r4 = r2 & 51;
        r4 = r4 + ((r2 ^ 51) | r4);
        setUiType = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03f3, code lost:
        if (r18.CardinalEnvironment().equalsIgnoreCase("Y") == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03f5, code lost:
        r2 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03f8, code lost:
        r2 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03fc, code lost:
        if (r2 == 24) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03fe, code lost:
        r2 = (setUiType + 82) - r3;
        setRenderType = r2 % 128;
        r2 = r2 % 2;
        r1.getInstance.setCCAImageResource(com.cardinalcommerce.cardinalmobilesdk.R.drawable.warning);
        r1.getInstance.setVisibility(0);
        r2 = setUiType;
        r4 = (r2 ^ 126) + ((r2 & true ? 1 : 0) << r3);
        r2 = (r4 & -1) + (r4 | -1);
        setRenderType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0426, code lost:
        r1.getInstance.setVisibility(8);
        r2 = setRenderType;
        r4 = r2 & true;
        r2 = -(-(r2 | 123));
        r6 = (r4 ^ r2 ? 1 : 0) + ((r2 & r4 ? 1 : 0) << r3);
        setUiType = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x043e, code lost:
        r1.getInstance.setVisibility(8);
        r2 = setRenderType;
        r4 = r2 & true;
        r2 = (r2 | true) & (~(r4 ? 1 : 0));
        r4 = -(-(r4 << r3));
        r6 = (r2 ^ r4 ? 1 : 0) + ((r2 & r4 ? 1 : 0) << r3);
        setUiType = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x045c, code lost:
        if (r18.getChallengeTimeout() == null) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x045e, code lost:
        r2 = '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0461, code lost:
        r2 = 'A';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0465, code lost:
        if (r2 == '0') goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0468, code lost:
        r2 = setUiType;
        r4 = r2 & 29;
        r4 = r4 + ((r2 ^ 29) | r4);
        setRenderType = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0475, code lost:
        if ((r4 % 2) == 0) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0477, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0479, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x047a, code lost:
        if (r2 == false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r4 = 72 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0487, code lost:
        if (r18.getChallengeTimeout().isEmpty() != false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x048b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x048c, code lost:
        if (r2 == r3) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x048f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0490, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0491, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x049a, code lost:
        if (r18.getChallengeTimeout().isEmpty() != false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x049c, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x049e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x049f, code lost:
        if (r2 == r3) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04a1, code lost:
        r1.CardinalRenderType.setVisibility(4);
        r2 = setRenderType;
        r4 = (r2 & 96) + (r2 | 96);
        r2 = ((r4 | true ? 1 : 0) << r3) - (r4 ^ -1);
        setUiType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b8, code lost:
        r1.CardinalRenderType.setCCAText(r18.getChallengeTimeout());
        r1.CardinalRenderType.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04cc, code lost:
        if (r18.getRequestTimeout() == null) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04ce, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04d0, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04d1, code lost:
        if (r2 == r3) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04d3, code lost:
        r1.valueOf.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04d9, code lost:
        r2 = setUiType;
        r4 = r2 & true;
        r2 = (r2 | 119) & (~(r4 ? 1 : 0));
        r4 = r4 << r3;
        r6 = (r2 & r4) + (r2 | r4);
        setRenderType = r6 % 128;
        r6 = r6 % 2;
        r1.valueOf.setCCAText(r18.getRequestTimeout());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04f8, code lost:
        if (r18.values() == null) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04fa, code lost:
        r2 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04fd, code lost:
        r2 = ';';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0501, code lost:
        if (r2 == ' ') goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0504, code lost:
        r2 = setUiType;
        r4 = ((r2 ^ true) | (r2 & true) ? 1 : 0) << r3;
        r2 = -(((~r2) & 121) | (r2 & -122));
        r6 = (r4 ^ r2) + ((r2 & r4 ? 1 : 0) << r3);
        setRenderType = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0525, code lost:
        if (r18.values().isEmpty() != false) goto L_0x052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0527, code lost:
        r2 = '8';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x052a, code lost:
        r2 = 'P';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x052e, code lost:
        if (r2 == '8') goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0530, code lost:
        r1.CardinalError.setVisibility(4);
        r2 = setRenderType;
        r4 = r2 & true;
        r2 = (r2 | true) & (~(r4 ? 1 : 0));
        r4 = r4 << r3;
        r5 = (r2 ^ r4 ? 1 : 0) + ((r2 & r4 ? 1 : 0) << r3);
        setUiType = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0548, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0549, code lost:
        r2 = setUiType;
        r4 = ((((r2 | true ? 1 : 0) << r3) - (r2 ^ 92)) - 0) - r3;
        setRenderType = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0557, code lost:
        if ((r4 % 2) == 0) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0559, code lost:
        r0 = 'O';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x055c, code lost:
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0560, code lost:
        if (r0 == 9) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0562, code lost:
        r1.CardinalError.setCCAText(r18.values());
        r1.CardinalError.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0576, code lost:
        if (r18.getRequestTimeout() == null) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0578, code lost:
        r15 = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x057c, code lost:
        if (r15 == 'M') goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x057f, code lost:
        r1.CardinalError.setCCAText(r18.values());
        r1.CardinalError.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0593, code lost:
        if (r18.getRequestTimeout() == null) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0596, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0597, code lost:
        if (r10 == r3) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0599, code lost:
        r1.values.setCCAText(r18.CardinalError());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05a3, code lost:
        r1.values.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05a9, code lost:
        r18.cleanup();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05af, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r2 == 0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r2 == r3) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        if (r2 == 2) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        init(r18.valueOf());
        r2 = setRenderType + 20;
        r11 = (r2 & -1) + (r2 | -1);
        setUiType = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        configure(r18.valueOf());
        r2 = setRenderType + 89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        setUiType = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        r1.getWarnings.setCCAText("");
        r1.getWarnings.setCCAFocusableInTouchMode(r3);
        r1.getWarnings.setCCAOnFocusChangeListener(new com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.AnonymousClass3(r1));
        r2 = setRenderType + 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (r18.setEnvironment() == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0112, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        if (r2 == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0118, code lost:
        r2 = setUiType + 97;
        setRenderType = r2 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        if ((r2 % 2) == 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0123, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r2 != r3) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        if (r18.setEnvironment().isEmpty() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        r2 = (android.widget.LinearLayout) findViewById(com.cardinalcommerce.cardinalmobilesdk.R.id.whiteListCheckboxHolder);
        r2.removeAllViews();
        r12 = new com.cardinalcommerce.a.setRight(r1);
        r1.getActionCode = r12;
        r13 = r1.CardinalUiType;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (r13 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014a, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (r14 == r3) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        r14 = setRenderType;
        r15 = r14 & 25;
        r15 = (r15 - (~((r14 ^ 25) | r15))) - r3;
        setUiType = r15 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015d, code lost:
        if ((r15 % 2) != 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015f, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0161, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0162, code lost:
        if (r14 == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0164, code lost:
        com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.configure(r12, r13, (android.app.Activity) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
        r1.getActionCode.setCCAText(r18.setEnvironment());
        init(r1.getActionCode);
        r2.addView(r1.getActionCode);
        r2 = setRenderType;
        r12 = ((r2 | true ? 1 : 0) << r3) - (((~r2) & 95) | (r2 & -96));
        setUiType = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.configure(r12, r13, (android.app.Activity) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0192, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0195, code lost:
        r18.setEnvironment().isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        r2 = (android.widget.LinearLayout) findViewById(com.cardinalcommerce.cardinalmobilesdk.R.id.whiteListCheckboxHolder);
        r2.removeAllViews();
        r2.setPadding(0, 0, 0, 0);
        r2 = setRenderType;
        r12 = r2 & 113;
        r12 = (r12 - (~((r2 ^ 113) | r12))) - r3;
        setUiType = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c3, code lost:
        if (r1.getProxyAddress.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_OOB) != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c7, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c8, code lost:
        r15 = '3';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d0, code lost:
        if (r2 == r3) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d4, code lost:
        r2 = setUiType;
        r2 = ((((r2 | 28) << 1) - (r2 ^ 28)) + 0) - 1;
        setRenderType = r2 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e8, code lost:
        if ((r2 % 2) == 0) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ea, code lost:
        r2 = 'U';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ed, code lost:
        r2 = '3';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ee, code lost:
        if (r2 != '3') goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f4, code lost:
        if (r18.cleanup() == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        r2 = '^';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f9, code lost:
        r2 = 28;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.cardinalcommerce.a.setTransitionVisibility r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = setUiType
            r2 = r0 ^ 22
            r0 = r0 & 22
            r3 = 1
            int r0 = r0 << r3
            int r2 = r2 + r0
            int r2 = r2 - r3
            int r0 = r2 % 128
            setRenderType = r0
            r0 = 2
            int r2 = r2 % r0
            com.cardinalcommerce.a.setScrollbarFadingEnabled r2 = r18.CardinalRenderType()
            com.cardinalcommerce.a.setY r4 = r1.Cardinal
            r1.Cardinal((com.cardinalcommerce.a.setScrollbarFadingEnabled) r2, (com.cardinalcommerce.a.setY) r4)
            com.cardinalcommerce.a.setScrollbarFadingEnabled r2 = r18.getString()
            com.cardinalcommerce.a.setY r4 = r1.configure
            r1.Cardinal((com.cardinalcommerce.a.setScrollbarFadingEnabled) r2, (com.cardinalcommerce.a.setY) r4)
            java.lang.String r2 = r18.configure()
            int r4 = r2.hashCode()
            r6 = 9
            r7 = 40
            java.lang.String r8 = "04"
            r9 = -1
            r10 = 0
            switch(r4) {
                case 1537: goto L_0x0097;
                case 1538: goto L_0x007b;
                case 1539: goto L_0x0061;
                case 1540: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x00c2
        L_0x0039:
            boolean r2 = r2.equals(r8)
            r4 = 41
            if (r2 == 0) goto L_0x0043
            r2 = r4
            goto L_0x0044
        L_0x0043:
            r2 = r7
        L_0x0044:
            if (r2 == r7) goto L_0x00c2
            int r2 = setRenderType
            r11 = r2 ^ 73
            r2 = r2 & 73
            int r2 = r2 << r3
            int r11 = r11 + r2
            int r2 = r11 % 128
            setUiType = r2
            int r11 = r11 % r0
            if (r11 != 0) goto L_0x0057
            r2 = r4
            goto L_0x0059
        L_0x0057:
            r2 = 83
        L_0x0059:
            if (r2 == r4) goto L_0x005e
            r2 = 3
            goto L_0x00c3
        L_0x005e:
            r2 = r0
            goto L_0x00c3
        L_0x0061:
            java.lang.String r4 = "03"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x006b
            r2 = r10
            goto L_0x006c
        L_0x006b:
            r2 = r3
        L_0x006c:
            if (r2 == r3) goto L_0x00c2
            int r2 = setUiType
            r4 = r2 | 9
            int r4 = r4 << r3
            r2 = r2 ^ r6
            int r4 = r4 - r2
            int r2 = r4 % 128
            setRenderType = r2
            int r4 = r4 % r0
            goto L_0x005e
        L_0x007b:
            java.lang.String r4 = "02"
            boolean r2 = r2.equals(r4)
            r4 = 16
            if (r2 == 0) goto L_0x0087
            r2 = r4
            goto L_0x0088
        L_0x0087:
            r2 = 5
        L_0x0088:
            if (r2 == r4) goto L_0x008b
            goto L_0x00c2
        L_0x008b:
            int r2 = setUiType
            int r2 = r2 + 54
            int r2 = r2 - r3
            int r4 = r2 % 128
            setRenderType = r4
            int r2 = r2 % r0
        L_0x0095:
            r2 = r3
            goto L_0x00c3
        L_0x0097:
            java.lang.String r4 = "01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00a1
            r2 = r3
            goto L_0x00a2
        L_0x00a1:
            r2 = r10
        L_0x00a2:
            if (r2 == r3) goto L_0x00a5
            goto L_0x00c2
        L_0x00a5:
            int r2 = setRenderType
            r4 = r2 | 37
            int r11 = r4 << 1
            r2 = r2 & 37
            int r2 = ~r2
            r2 = r2 & r4
            int r2 = -r2
            r4 = r11 & r2
            r2 = r2 | r11
            int r4 = r4 + r2
            int r2 = r4 % 128
            setUiType = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L_0x00bd
            r2 = r3
            goto L_0x00be
        L_0x00bd:
            r2 = r10
        L_0x00be:
            if (r2 == r3) goto L_0x0095
            r2 = r10
            goto L_0x00c3
        L_0x00c2:
            r2 = r9
        L_0x00c3:
            r4 = 89
            if (r2 == 0) goto L_0x00f1
            if (r2 == r3) goto L_0x00e1
            if (r2 == r0) goto L_0x00cc
            goto L_0x010c
        L_0x00cc:
            java.util.ArrayList r2 = r18.valueOf()
            r1.init((java.util.ArrayList<com.cardinalcommerce.a.setCameraDistance>) r2)
            int r2 = setRenderType
            int r2 = r2 + 20
            r11 = r2 & -1
            r2 = r2 | r9
            int r11 = r11 + r2
            int r2 = r11 % 128
            setUiType = r2
            int r11 = r11 % r0
            goto L_0x010c
        L_0x00e1:
            java.util.ArrayList r2 = r18.valueOf()
            r1.configure((java.util.ArrayList<com.cardinalcommerce.a.setCameraDistance>) r2)
            int r2 = setRenderType
            int r2 = r2 + r4
        L_0x00eb:
            int r11 = r2 % 128
            setUiType = r11
            int r2 = r2 % r0
            goto L_0x010c
        L_0x00f1:
            com.cardinalcommerce.a.setLeft r2 = r1.getWarnings
            java.lang.String r11 = ""
            r2.setCCAText(r11)
            com.cardinalcommerce.a.setLeft r2 = r1.getWarnings
            r2.setCCAFocusableInTouchMode(r3)
            com.cardinalcommerce.a.setLeft r2 = r1.getWarnings
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$3 r11 = new com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView$3
            r11.<init>()
            r2.setCCAOnFocusChangeListener(r11)
            int r2 = setRenderType
            int r2 = r2 + 61
            goto L_0x00eb
        L_0x010c:
            java.lang.String r2 = r18.setEnvironment()
            if (r2 == 0) goto L_0x0114
            r2 = r3
            goto L_0x0115
        L_0x0114:
            r2 = r10
        L_0x0115:
            r11 = 0
            if (r2 == 0) goto L_0x01a0
            int r2 = setUiType
            int r2 = r2 + 97
            int r12 = r2 % 128
            setRenderType = r12
            int r2 = r2 % r0
            if (r2 == 0) goto L_0x0125
            r2 = r10
            goto L_0x0126
        L_0x0125:
            r2 = r3
        L_0x0126:
            if (r2 != r3) goto L_0x0195
            java.lang.String r2 = r18.setEnvironment()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01a0
            int r2 = com.cardinalcommerce.cardinalmobilesdk.R.id.whiteListCheckboxHolder
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.removeAllViews()
            com.cardinalcommerce.a.setRight r12 = new com.cardinalcommerce.a.setRight
            r12.<init>(r1)
            r1.getActionCode = r12
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r13 = r1.CardinalUiType
            if (r13 == 0) goto L_0x014a
            r14 = r3
            goto L_0x014b
        L_0x014a:
            r14 = r10
        L_0x014b:
            if (r14 == r3) goto L_0x014e
            goto L_0x0167
        L_0x014e:
            int r14 = setRenderType
            r15 = r14 & 25
            r14 = r14 ^ 25
            r14 = r14 | r15
            int r14 = ~r14
            int r15 = r15 - r14
            int r15 = r15 - r3
            int r14 = r15 % 128
            setUiType = r14
            int r15 = r15 % r0
            if (r15 != 0) goto L_0x0161
            r14 = r10
            goto L_0x0162
        L_0x0161:
            r14 = r3
        L_0x0162:
            if (r14 == 0) goto L_0x018c
            com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.configure((com.cardinalcommerce.a.setRight) r12, (com.cardinalcommerce.shared.userinterfaces.UiCustomization) r13, (android.app.Activity) r1)
        L_0x0167:
            com.cardinalcommerce.a.setRight r12 = r1.getActionCode
            java.lang.String r13 = r18.setEnvironment()
            r12.setCCAText(r13)
            com.cardinalcommerce.a.setRight r12 = r1.getActionCode
            r1.init((com.cardinalcommerce.a.setRight) r12)
            com.cardinalcommerce.a.setRight r12 = r1.getActionCode
            r2.addView(r12)
            int r2 = setRenderType
            r12 = r2 | 95
            int r12 = r12 << r3
            r13 = r2 & -96
            int r2 = ~r2
            r2 = r2 & 95
            r2 = r2 | r13
            int r12 = r12 - r2
            int r2 = r12 % 128
            setUiType = r2
            int r12 = r12 % r0
            goto L_0x01bd
        L_0x018c:
            com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.configure((com.cardinalcommerce.a.setRight) r12, (com.cardinalcommerce.shared.userinterfaces.UiCustomization) r13, (android.app.Activity) r1)
            super.hashCode()     // Catch:{ all -> 0x0193 }
            throw r11     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            throw r0
        L_0x0195:
            java.lang.String r0 = r18.setEnvironment()
            r0.isEmpty()
            throw r11     // Catch:{ all -> 0x019d }
        L_0x019d:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x01a0:
            int r2 = com.cardinalcommerce.cardinalmobilesdk.R.id.whiteListCheckboxHolder
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.removeAllViews()
            r2.setPadding(r10, r10, r10, r10)
            int r2 = setRenderType
            r12 = r2 & 113(0x71, float:1.58E-43)
            r2 = r2 ^ 113(0x71, float:1.58E-43)
            r2 = r2 | r12
            int r2 = ~r2
            int r12 = r12 - r2
            int r12 = r12 - r3
            int r2 = r12 % 128
            setUiType = r2
            int r12 = r12 % r0
        L_0x01bd:
            java.lang.String r2 = r1.getProxyAddress
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x01c7
            r2 = r3
            goto L_0x01c8
        L_0x01c7:
            r2 = r10
        L_0x01c8:
            r13 = 92
            r14 = 27
            r15 = 51
            r12 = 8
            if (r2 == r3) goto L_0x01d4
            goto L_0x02c9
        L_0x01d4:
            int r2 = setUiType
            r16 = r2 | 28
            int r16 = r16 << 1
            r6 = 28
            r2 = r2 ^ r6
            int r16 = r16 - r2
            int r16 = r16 + 0
            int r2 = r16 + -1
            int r5 = r2 % 128
            setRenderType = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L_0x01ed
            r2 = 85
            goto L_0x01ee
        L_0x01ed:
            r2 = r15
        L_0x01ee:
            if (r2 != r15) goto L_0x05a9
            java.lang.String r2 = r18.cleanup()
            if (r2 == 0) goto L_0x01f9
            r2 = 94
            goto L_0x01fa
        L_0x01f9:
            r2 = r6
        L_0x01fa:
            if (r2 == r6) goto L_0x023f
            java.lang.String r2 = r18.cleanup()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0209
            r2 = 98
            goto L_0x020a
        L_0x0209:
            r2 = r13
        L_0x020a:
            if (r2 == r13) goto L_0x023f
            int r2 = setRenderType
            r5 = r2 & 6
            r2 = r2 | 6
            int r5 = r5 + r2
            r2 = r5 | -1
            int r2 = r2 << r3
            r5 = r5 ^ r9
            int r2 = r2 - r5
            int r5 = r2 % 128
            setUiType = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L_0x0221
            r2 = r14
            goto L_0x0223
        L_0x0221:
            r2 = 72
        L_0x0223:
            if (r2 == r14) goto L_0x022f
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.onValidated
            java.lang.String r5 = r18.cleanup()
            r2.setCCAText(r5)
            goto L_0x0252
        L_0x022f:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.onValidated
            java.lang.String r5 = r18.cleanup()
            r2.setCCAText(r5)
            r2 = 8
            int r2 = r2 / r10
            goto L_0x0252
        L_0x023c:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x023f:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.onValidated
            r2.setVisibility(r12)
            int r2 = setUiType
            r5 = r2 ^ 125(0x7d, float:1.75E-43)
            r2 = r2 & 125(0x7d, float:1.75E-43)
            r2 = r2 | r5
            int r2 = r2 << r3
            int r2 = r2 - r5
            int r5 = r2 % 128
            setRenderType = r5
            int r2 = r2 % r0
        L_0x0252:
            boolean r2 = r17.onCReqSuccess()
            r5 = 75
            if (r2 == 0) goto L_0x025c
            r2 = r5
            goto L_0x025e
        L_0x025c:
            r2 = 88
        L_0x025e:
            r6 = 88
            if (r2 == r6) goto L_0x029b
            int r2 = setUiType
            r6 = r2 ^ 95
            r2 = r2 & 95
            int r2 = r2 << r3
            int r6 = r6 + r2
            int r2 = r6 % 128
            setRenderType = r2
            int r6 = r6 % r0
            if (r6 == 0) goto L_0x0273
            r2 = r5
            goto L_0x0275
        L_0x0273:
            r2 = 69
        L_0x0275:
            if (r2 == r5) goto L_0x0286
            com.cardinalcommerce.a.setBottom r2 = r1.getSDKVersion
            r2.setCCAVisibility(r10)
        L_0x027c:
            com.cardinalcommerce.a.setBottom r2 = r1.getSDKVersion
            java.lang.String r5 = r18.getActionCode()
            r2.setCCAText(r5)
            goto L_0x028c
        L_0x0286:
            com.cardinalcommerce.a.setBottom r2 = r1.getSDKVersion
            r2.setCCAVisibility(r3)
            goto L_0x027c
        L_0x028c:
            int r2 = setRenderType
            r5 = r2 & 121(0x79, float:1.7E-43)
            r2 = r2 ^ 121(0x79, float:1.7E-43)
            r2 = r2 | r5
            int r2 = ~r2
            int r5 = r5 - r2
            int r5 = r5 - r3
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
        L_0x029b:
            java.lang.String r2 = r18.setRequestTimeout()
            if (r2 == 0) goto L_0x02a4
            r2 = 20
            goto L_0x02a5
        L_0x02a4:
            r2 = r7
        L_0x02a5:
            if (r2 == r7) goto L_0x02c9
            int r2 = setRenderType
            r5 = r2 ^ 79
            r2 = r2 & 79
            int r2 = r2 << r3
            int r5 = r5 + r2
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
            com.cardinalcommerce.a.setBottom r2 = r1.cleanup
            java.lang.String r5 = r18.setRequestTimeout()
            r2.setCCAText(r5)
            int r2 = setRenderType
            r5 = r2 & 121(0x79, float:1.7E-43)
            r2 = r2 | 121(0x79, float:1.7E-43)
            int r5 = r5 + r2
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
        L_0x02c9:
            java.lang.String r2 = r18.CardinalActionCode()
            if (r2 == 0) goto L_0x02d1
            r2 = r3
            goto L_0x02d2
        L_0x02d1:
            r2 = r10
        L_0x02d2:
            if (r2 == 0) goto L_0x033c
            int r2 = setRenderType
            r5 = r2 & 115(0x73, float:1.61E-43)
            r2 = r2 ^ 115(0x73, float:1.61E-43)
            r2 = r2 | r5
            int r2 = -r2
            int r2 = -r2
            int r2 = ~r2
            int r5 = r5 - r2
            int r5 = r5 - r3
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L_0x02ea
            r2 = 82
            goto L_0x02ec
        L_0x02ea:
            r2 = 78
        L_0x02ec:
            r5 = 78
            if (r2 == r5) goto L_0x0308
            java.lang.String r2 = r1.getProxyAddress
            boolean r2 = r2.equals(r8)
            r5 = 73
            int r5 = r5 / r10
            if (r2 == 0) goto L_0x02fe
            r2 = 10
            goto L_0x0300
        L_0x02fe:
            r2 = 71
        L_0x0300:
            r5 = 71
            if (r2 == r5) goto L_0x033c
            goto L_0x0317
        L_0x0305:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0308:
            java.lang.String r2 = r1.getProxyAddress
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0312
            r2 = r14
            goto L_0x0314
        L_0x0312:
            r2 = 15
        L_0x0314:
            if (r2 == r14) goto L_0x0317
            goto L_0x033c
        L_0x0317:
            int r2 = setUiType
            r5 = r2 & 45
            int r6 = ~r5
            r2 = r2 | 45
            r2 = r2 & r6
            int r5 = r5 << r3
            r6 = r2 & r5
            r2 = r2 | r5
            int r6 = r6 + r2
            int r2 = r6 % 128
            setRenderType = r2
            int r6 = r6 % r0
            com.cardinalcommerce.a.setBottom r2 = r1.cleanup
            java.lang.String r5 = r18.CardinalActionCode()
            r2.setCCAText(r5)
            int r2 = setRenderType
            int r2 = r2 + 52
            int r2 = r2 - r3
            int r5 = r2 % 128
            setUiType = r5
            int r2 = r2 % r0
        L_0x033c:
            java.lang.String r2 = r18.getSDKVersion()
            if (r2 == 0) goto L_0x0344
            r2 = r3
            goto L_0x0345
        L_0x0344:
            r2 = r10
        L_0x0345:
            if (r2 == 0) goto L_0x0377
            int r2 = setRenderType
            r5 = r2 ^ 37
            r6 = r2 & 37
            r5 = r5 | r6
            int r5 = r5 << r3
            int r6 = ~r6
            r2 = r2 | 37
            r2 = r2 & r6
            int r5 = r5 - r2
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L_0x035d
            r2 = r3
            goto L_0x035e
        L_0x035d:
            r2 = r10
        L_0x035e:
            if (r2 != 0) goto L_0x036a
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.init
            java.lang.String r5 = r18.getSDKVersion()
            r2.setCCAText(r5)
            goto L_0x037c
        L_0x036a:
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.init
            java.lang.String r2 = r18.getSDKVersion()
            r0.setCCAText(r2)
            throw r11     // Catch:{ all -> 0x0374 }
        L_0x0374:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0377:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.init
            r2.setVisibility(r12)
        L_0x037c:
            java.lang.String r2 = r18.onValidated()
            if (r2 == 0) goto L_0x0385
            r2 = 11
            goto L_0x0386
        L_0x0385:
            r2 = r4
        L_0x0386:
            r5 = 4
            if (r2 == r4) goto L_0x03b7
            int r2 = setUiType
            int r2 = r2 + 41
            int r2 = r2 - r3
            r4 = r2 & -1
            r2 = r2 | r9
            int r4 = r4 + r2
            int r2 = r4 % 128
            setRenderType = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L_0x039b
            r2 = r3
            goto L_0x039c
        L_0x039b:
            r2 = r10
        L_0x039c:
            if (r2 == r3) goto L_0x03a8
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.onCReqSuccess
            java.lang.String r4 = r18.onValidated()
            r2.setCCAText(r4)
            goto L_0x03d2
        L_0x03a8:
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.onCReqSuccess
            java.lang.String r2 = r18.onValidated()
            r0.setCCAText(r2)
            super.hashCode()     // Catch:{ all -> 0x03b5 }
            throw r11     // Catch:{ all -> 0x03b5 }
        L_0x03b5:
            r0 = move-exception
            throw r0
        L_0x03b7:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.onCReqSuccess
            r2.setVisibility(r5)
            int r2 = setUiType
            r4 = r2 ^ 19
            r6 = r2 & 19
            r4 = r4 | r6
            int r4 = r4 << r3
            int r6 = ~r6
            r2 = r2 | 19
            r2 = r2 & r6
            int r2 = -r2
            r6 = r4 & r2
            r2 = r2 | r4
            int r6 = r6 + r2
            int r2 = r6 % 128
            setRenderType = r2
            int r6 = r6 % r0
        L_0x03d2:
            java.lang.String r2 = r18.CardinalEnvironment()
            if (r2 == 0) goto L_0x03da
            r2 = r10
            goto L_0x03db
        L_0x03da:
            r2 = r3
        L_0x03db:
            if (r2 == r3) goto L_0x043e
            int r2 = setRenderType
            r4 = r2 & 51
            r2 = r2 ^ r15
            r2 = r2 | r4
            int r4 = r4 + r2
            int r2 = r4 % 128
            setUiType = r2
            int r4 = r4 % r0
            java.lang.String r2 = r18.CardinalEnvironment()
            java.lang.String r4 = "Y"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x03f8
            r2 = 72
            goto L_0x03fa
        L_0x03f8:
            r2 = 24
        L_0x03fa:
            r4 = 24
            if (r2 == r4) goto L_0x0426
            int r2 = setUiType
            int r2 = r2 + 82
            int r2 = r2 - r3
            int r4 = r2 % 128
            setRenderType = r4
            int r2 = r2 % r0
            com.cardinalcommerce.a.setY r2 = r1.getInstance
            int r4 = com.cardinalcommerce.cardinalmobilesdk.R.drawable.warning
            r2.setCCAImageResource(r4)
            com.cardinalcommerce.a.setY r2 = r1.getInstance
            r2.setVisibility(r10)
            int r2 = setUiType
            r4 = r2 ^ 126(0x7e, float:1.77E-43)
            r2 = r2 & 126(0x7e, float:1.77E-43)
            int r2 = r2 << r3
            int r4 = r4 + r2
            r2 = r4 & -1
            r4 = r4 | r9
            int r2 = r2 + r4
            int r4 = r2 % 128
            setRenderType = r4
            int r2 = r2 % r0
            goto L_0x0458
        L_0x0426:
            com.cardinalcommerce.a.setY r2 = r1.getInstance
            r2.setVisibility(r12)
            int r2 = setRenderType
            r4 = r2 & 123(0x7b, float:1.72E-43)
            r2 = r2 | 123(0x7b, float:1.72E-43)
            int r2 = -r2
            int r2 = -r2
            r6 = r4 ^ r2
            r2 = r2 & r4
            int r2 = r2 << r3
            int r6 = r6 + r2
            int r2 = r6 % 128
            setUiType = r2
            int r6 = r6 % r0
            goto L_0x0458
        L_0x043e:
            com.cardinalcommerce.a.setY r2 = r1.getInstance
            r2.setVisibility(r12)
            int r2 = setRenderType
            r4 = r2 & 55
            int r6 = ~r4
            r2 = r2 | 55
            r2 = r2 & r6
            int r4 = r4 << r3
            int r4 = -r4
            int r4 = -r4
            r6 = r2 ^ r4
            r2 = r2 & r4
            int r2 = r2 << r3
            int r6 = r6 + r2
            int r2 = r6 % 128
            setUiType = r2
            int r6 = r6 % r0
        L_0x0458:
            java.lang.String r2 = r18.getChallengeTimeout()
            if (r2 == 0) goto L_0x0461
            r2 = 48
            goto L_0x0463
        L_0x0461:
            r2 = 65
        L_0x0463:
            r4 = 48
            if (r2 == r4) goto L_0x0468
            goto L_0x04a1
        L_0x0468:
            int r2 = setUiType
            r4 = r2 & 29
            r2 = r2 ^ 29
            r2 = r2 | r4
            int r4 = r4 + r2
            int r2 = r4 % 128
            setRenderType = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L_0x0479
            r2 = r3
            goto L_0x047a
        L_0x0479:
            r2 = r10
        L_0x047a:
            if (r2 == 0) goto L_0x0492
            java.lang.String r2 = r18.getChallengeTimeout()
            boolean r2 = r2.isEmpty()
            r4 = 72
            int r4 = r4 / r10
            if (r2 != 0) goto L_0x048b
            r2 = r3
            goto L_0x048c
        L_0x048b:
            r2 = r10
        L_0x048c:
            if (r2 == r3) goto L_0x04b8
            goto L_0x04a1
        L_0x048f:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0492:
            java.lang.String r2 = r18.getChallengeTimeout()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x049e
            r2 = r3
            goto L_0x049f
        L_0x049e:
            r2 = r10
        L_0x049f:
            if (r2 == r3) goto L_0x04b8
        L_0x04a1:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.CardinalRenderType
            r2.setVisibility(r5)
            int r2 = setRenderType
            r4 = r2 & 96
            r2 = r2 | 96
            int r4 = r4 + r2
            r2 = r4 | -1
            int r2 = r2 << r3
            r4 = r4 ^ r9
            int r2 = r2 - r4
            int r4 = r2 % 128
            setUiType = r4
            int r2 = r2 % r0
            goto L_0x04f4
        L_0x04b8:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.CardinalRenderType
            java.lang.String r4 = r18.getChallengeTimeout()
            r2.setCCAText(r4)
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.CardinalRenderType
            int r4 = com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r10, r4, r10)
            java.lang.String r2 = r18.getRequestTimeout()
            if (r2 == 0) goto L_0x04d0
            r2 = r3
            goto L_0x04d1
        L_0x04d0:
            r2 = r10
        L_0x04d1:
            if (r2 == r3) goto L_0x04d9
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.valueOf
            r2.setVisibility(r5)
            goto L_0x04f4
        L_0x04d9:
            int r2 = setUiType
            r4 = r2 & 119(0x77, float:1.67E-43)
            int r6 = ~r4
            r2 = r2 | 119(0x77, float:1.67E-43)
            r2 = r2 & r6
            int r4 = r4 << r3
            r6 = r2 & r4
            r2 = r2 | r4
            int r6 = r6 + r2
            int r2 = r6 % 128
            setRenderType = r2
            int r6 = r6 % r0
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.valueOf
            java.lang.String r4 = r18.getRequestTimeout()
            r2.setCCAText(r4)
        L_0x04f4:
            java.lang.String r2 = r18.values()
            if (r2 == 0) goto L_0x04fd
            r2 = 32
            goto L_0x04ff
        L_0x04fd:
            r2 = 59
        L_0x04ff:
            r4 = 32
            if (r2 == r4) goto L_0x0504
            goto L_0x0530
        L_0x0504:
            int r2 = setUiType
            r4 = r2 ^ 121(0x79, float:1.7E-43)
            r6 = r2 & 121(0x79, float:1.7E-43)
            r4 = r4 | r6
            int r4 = r4 << r3
            r6 = r2 & -122(0xffffffffffffff86, float:NaN)
            int r2 = ~r2
            r2 = r2 & 121(0x79, float:1.7E-43)
            r2 = r2 | r6
            int r2 = -r2
            r6 = r4 ^ r2
            r2 = r2 & r4
            int r2 = r2 << r3
            int r6 = r6 + r2
            int r2 = r6 % 128
            setRenderType = r2
            int r6 = r6 % r0
            java.lang.String r2 = r18.values()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x052a
            r2 = 56
            goto L_0x052c
        L_0x052a:
            r2 = 80
        L_0x052c:
            r4 = 56
            if (r2 == r4) goto L_0x0549
        L_0x0530:
            com.cardinalcommerce.a.setAnimationMatrix r2 = r1.CardinalError
            r2.setVisibility(r5)
            int r2 = setRenderType
            r4 = r2 & 5
            int r5 = ~r4
            r6 = 5
            r2 = r2 | r6
            r2 = r2 & r5
            int r4 = r4 << r3
            r5 = r2 ^ r4
            r2 = r2 & r4
            int r2 = r2 << r3
            int r5 = r5 + r2
            int r2 = r5 % 128
            setUiType = r2
            int r5 = r5 % r0
            return
        L_0x0549:
            int r2 = setUiType
            r4 = r2 | 92
            int r4 = r4 << r3
            r2 = r2 ^ r13
            int r4 = r4 - r2
            int r4 = r4 - r10
            int r4 = r4 - r3
            int r2 = r4 % 128
            setRenderType = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L_0x055c
            r0 = 79
            goto L_0x055e
        L_0x055c:
            r0 = 9
        L_0x055e:
            r2 = 9
            if (r0 == r2) goto L_0x057f
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.CardinalError
            java.lang.String r2 = r18.values()
            r0.setCCAText(r2)
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.CardinalError
            int r2 = com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r10, r2, r3)
            java.lang.String r0 = r18.getRequestTimeout()
            if (r0 == 0) goto L_0x057a
            r15 = 77
        L_0x057a:
            r0 = 77
            if (r15 == r0) goto L_0x0599
            goto L_0x05a3
        L_0x057f:
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.CardinalError
            java.lang.String r2 = r18.values()
            r0.setCCAText(r2)
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.CardinalError
            int r2 = com.cardinalcommerce.cardinalmobilesdk.R.drawable.plus
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r10, r2, r10)
            java.lang.String r0 = r18.getRequestTimeout()
            if (r0 == 0) goto L_0x0596
            goto L_0x0597
        L_0x0596:
            r10 = r3
        L_0x0597:
            if (r10 == r3) goto L_0x05a3
        L_0x0599:
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.values
            java.lang.String r2 = r18.CardinalError()
            r0.setCCAText(r2)
            return
        L_0x05a3:
            com.cardinalcommerce.a.setAnimationMatrix r0 = r1.values
            r0.setVisibility(r5)
            return
        L_0x05a9:
            r18.cleanup()
            super.hashCode()     // Catch:{ all -> 0x05b0 }
            throw r11     // Catch:{ all -> 0x05b0 }
        L_0x05b0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.init(com.cardinalcommerce.a.setTransitionVisibility):void");
    }

    private void init(setRight setright) {
        setright.setCCAOnClickListener(new setZ.Cardinal() {
            private static int Cardinal = 0;
            private static int getInstance = 1;

            public final void onClick(View view) {
                int i = Cardinal + 103;
                getInstance = i % 128;
                int i2 = i % 2;
            }
        });
        int i = setUiType;
        int i2 = i ^ 35;
        int i3 = ((i & 35) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        setRenderType = i5 % 128;
        int i6 = i5 % 2;
    }

    private void Cardinal() {
        this.cleanup.setCCAOnClickListener(new setZ.Cardinal() {
            private static int cca_continue = 1;
            private static int getInstance;

            /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v39 */
            /* JADX WARNING: type inference failed for: r1v40 */
            /* JADX WARNING: type inference failed for: r1v41 */
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r13) {
                /*
                    r12 = this;
                    com.cardinalcommerce.a.setTranslationY r13 = com.cardinalcommerce.a.setTranslationY.cca_continue()
                    java.lang.String r0 = "Native Challenge Screen"
                    java.lang.String r1 = "Submit authentication pressed"
                    r2 = 0
                    r13.cca_continue(r0, r1, r2)
                    com.cardinalcommerce.a.setHovered r13 = new com.cardinalcommerce.a.setHovered
                    r13.<init>()
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.configure((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    int r1 = r0.hashCode()
                    r3 = 7
                    r4 = 81
                    r5 = 3
                    r6 = -1
                    r7 = 0
                    r8 = 2
                    r9 = 1
                    switch(r1) {
                        case 1537: goto L_0x00b6;
                        case 1538: goto L_0x008a;
                        case 1539: goto L_0x004d;
                        case 1540: goto L_0x0028;
                        default: goto L_0x0026;
                    }
                L_0x0026:
                    goto L_0x00e1
                L_0x0028:
                    java.lang.String r1 = "04"
                    boolean r0 = r0.equals(r1)
                    r1 = 4
                    if (r0 == 0) goto L_0x0032
                    r3 = r1
                L_0x0032:
                    if (r3 == r1) goto L_0x0036
                    goto L_0x00e1
                L_0x0036:
                    int r0 = cca_continue
                    int r0 = r0 + 24
                    int r0 = r0 - r9
                    int r1 = r0 % 128
                    getInstance = r1
                    int r0 = r0 % r8
                    if (r0 == 0) goto L_0x0044
                    r0 = r9
                    goto L_0x0045
                L_0x0044:
                    r0 = r7
                L_0x0045:
                    if (r0 == r9) goto L_0x004a
                    r0 = r5
                    goto L_0x00e2
                L_0x004a:
                    r0 = r8
                    goto L_0x00e2
                L_0x004d:
                    java.lang.String r1 = "03"
                    boolean r0 = r0.equals(r1)
                    r1 = 48
                    if (r0 == 0) goto L_0x005a
                    r0 = 12
                    goto L_0x005b
                L_0x005a:
                    r0 = r1
                L_0x005b:
                    if (r0 == r1) goto L_0x00e1
                    int r0 = cca_continue
                    r1 = r0 ^ 125(0x7d, float:1.75E-43)
                    r3 = r0 & 125(0x7d, float:1.75E-43)
                    r1 = r1 | r3
                    int r1 = r1 << r9
                    int r3 = ~r3
                    r0 = r0 | 125(0x7d, float:1.75E-43)
                    r0 = r0 & r3
                    int r0 = -r0
                    r3 = r1 ^ r0
                    r0 = r0 & r1
                    int r0 = r0 << r9
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    getInstance = r0
                    int r3 = r3 % r8
                    if (r3 == 0) goto L_0x0078
                    r1 = r9
                    goto L_0x0079
                L_0x0078:
                    r1 = r7
                L_0x0079:
                    if (r1 == r9) goto L_0x007d
                    r1 = r8
                    goto L_0x007e
                L_0x007d:
                    r1 = 5
                L_0x007e:
                    r3 = r0 ^ 81
                    r0 = r0 & r4
                    int r0 = r0 << r9
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    r0 = r1
                    goto L_0x00e2
                L_0x008a:
                    java.lang.String r1 = "02"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0094
                    r0 = r7
                    goto L_0x0095
                L_0x0094:
                    r0 = r9
                L_0x0095:
                    if (r0 == 0) goto L_0x0098
                    goto L_0x00e1
                L_0x0098:
                    int r0 = cca_continue
                    r1 = r0 ^ 7
                    r0 = r0 & r3
                    int r0 = r0 << r9
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0
                    int r1 = r1 - r0
                    int r1 = r1 - r9
                    int r0 = r1 % 128
                    getInstance = r0
                    int r1 = r1 % r8
                    r1 = r0 ^ 45
                    r0 = r0 & 45
                    r0 = r0 | r1
                    int r0 = r0 << r9
                    int r0 = r0 - r1
                    int r1 = r0 % 128
                    cca_continue = r1
                    int r0 = r0 % r8
                    r0 = r9
                    goto L_0x00e2
                L_0x00b6:
                    java.lang.String r1 = "01"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x00c0
                    r0 = r9
                    goto L_0x00c1
                L_0x00c0:
                    r0 = r7
                L_0x00c1:
                    if (r0 == r9) goto L_0x00c4
                    goto L_0x00e1
                L_0x00c4:
                    int r0 = getInstance
                    r1 = r0 ^ 75
                    r3 = r0 & 75
                    int r3 = r3 << r9
                    int r1 = r1 + r3
                    int r3 = r1 % 128
                    cca_continue = r3
                    int r1 = r1 % r8
                    r1 = r0 & 125(0x7d, float:1.75E-43)
                    r0 = r0 | 125(0x7d, float:1.75E-43)
                    r3 = r1 ^ r0
                    r0 = r0 & r1
                    int r0 = r0 << r9
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    r0 = r7
                    goto L_0x00e2
                L_0x00e1:
                    r0 = r6
                L_0x00e2:
                    r1 = 39
                    r3 = 85
                    java.lang.String r10 = ""
                    if (r0 == 0) goto L_0x0294
                    if (r0 == r9) goto L_0x019e
                    if (r0 == r8) goto L_0x010d
                    if (r0 == r5) goto L_0x00f2
                    goto L_0x0339
                L_0x00f2:
                    r13.getInstance()
                    int r0 = getInstance
                    r3 = r0 ^ 93
                    r4 = r0 & 93
                    r3 = r3 | r4
                    int r3 = r3 << r9
                    int r4 = ~r4
                    r0 = r0 | 93
                    r0 = r0 & r4
                    int r0 = -r0
                    r4 = r3 & r0
                    r0 = r0 | r3
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    cca_continue = r0
                L_0x010a:
                    int r4 = r4 % r8
                    goto L_0x0339
                L_0x010d:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getSDKVersion(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L_0x011b
                    r0 = r3
                    goto L_0x011d
                L_0x011b:
                    r0 = 20
                L_0x011d:
                    if (r0 == r3) goto L_0x014d
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    boolean r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cca_continue((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    if (r0 == 0) goto L_0x0129
                    r0 = r9
                    goto L_0x012a
                L_0x0129:
                    r0 = r7
                L_0x012a:
                    if (r0 == 0) goto L_0x0339
                    int r0 = getInstance
                    int r0 = r0 + 126
                    int r0 = r0 - r9
                    int r3 = r0 % 128
                    cca_continue = r3
                    int r0 = r0 % r8
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
                    r13.configure(r0)
                    int r0 = cca_continue
                    r3 = r0 & 1
                    r0 = r0 ^ r9
                    r0 = r0 | r3
                    int r0 = ~r0
                    int r3 = r3 - r0
                    int r3 = r3 - r9
                    int r0 = r3 % 128
                    getInstance = r0
                    int r3 = r3 % r8
                    goto L_0x0339
                L_0x014d:
                    int r0 = getInstance
                    r3 = r0 ^ 125(0x7d, float:1.75E-43)
                    r4 = r0 & 125(0x7d, float:1.75E-43)
                    r3 = r3 | r4
                    int r3 = r3 << r9
                    r4 = r0 & -126(0xffffffffffffff82, float:NaN)
                    int r0 = ~r0
                    r0 = r0 & 125(0x7d, float:1.75E-43)
                    r0 = r0 | r4
                    int r0 = -r0
                    int r0 = ~r0
                    int r3 = r3 - r0
                    int r3 = r3 - r9
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    if (r3 != 0) goto L_0x0168
                    r0 = r9
                    goto L_0x0169
                L_0x0168:
                    r0 = r7
                L_0x0169:
                    if (r0 == 0) goto L_0x017e
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getSDKVersion(r0)
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r0)
                    r13.configure(r0)
                    r0 = 50
                    int r0 = r0 / r7
                    goto L_0x018b
                L_0x017c:
                    r13 = move-exception
                    throw r13
                L_0x017e:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getSDKVersion(r0)
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r0)
                    r13.configure(r0)
                L_0x018b:
                    int r0 = cca_continue
                    r3 = r0 ^ 102(0x66, float:1.43E-43)
                    r0 = r0 & 102(0x66, float:1.43E-43)
                    int r0 = r0 << r9
                    int r3 = r3 + r0
                    r0 = r3 & -1
                    r3 = r3 | r6
                    int r0 = r0 + r3
                    int r3 = r0 % 128
                    getInstance = r3
                    int r0 = r0 % r8
                    goto L_0x0339
                L_0x019e:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTranslationZ r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.Cardinal(r0)
                    r3 = 67
                    r11 = 88
                    if (r0 == 0) goto L_0x01ac
                    r0 = r3
                    goto L_0x01ad
                L_0x01ac:
                    r0 = r11
                L_0x01ad:
                    if (r0 == r3) goto L_0x01b0
                    goto L_0x01d0
                L_0x01b0:
                    int r0 = cca_continue
                    r3 = r0 & 39
                    r0 = r0 | r1
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    getInstance = r0
                    int r3 = r3 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTranslationZ r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.Cardinal(r0)
                    int r0 = r0.getInstance()
                    if (r0 == r6) goto L_0x01ca
                    r0 = 98
                    goto L_0x01cc
                L_0x01ca:
                    r0 = 17
                L_0x01cc:
                    r3 = 98
                    if (r0 == r3) goto L_0x021d
                L_0x01d0:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    boolean r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cca_continue((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    if (r0 == 0) goto L_0x01da
                    r0 = r9
                    goto L_0x01db
                L_0x01da:
                    r0 = r7
                L_0x01db:
                    if (r0 == 0) goto L_0x0200
                    int r0 = getInstance
                    int r0 = r0 + 63
                    int r3 = r0 % 128
                    cca_continue = r3
                    int r0 = r0 % r8
                    if (r0 != 0) goto L_0x01ea
                    r0 = r9
                    goto L_0x01eb
                L_0x01ea:
                    r0 = r7
                L_0x01eb:
                    if (r0 != 0) goto L_0x01f6
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
                    r13.configure(r0)
                    goto L_0x0339
                L_0x01f6:
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
                    r13.configure(r0)
                    throw r2     // Catch:{ all -> 0x01fe }
                L_0x01fe:
                    r13 = move-exception
                    throw r13
                L_0x0200:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setBottom r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onValidated(r0)
                    r0.setEnabled(r7)
                    int r0 = cca_continue
                    r3 = r0 & 45
                    r0 = r0 ^ 45
                    r0 = r0 | r3
                    int r0 = -r0
                    int r0 = -r0
                    r4 = r3 ^ r0
                    r0 = r0 & r3
                    int r0 = r0 << r9
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    getInstance = r0
                    goto L_0x010a
                L_0x021d:
                    int r0 = getInstance
                    r3 = r0 ^ 63
                    r0 = r0 & 63
                    int r0 = r0 << r9
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.shared.userinterfaces.UiCustomization r3 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getWarnings(r0)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.configure(r0, r3, r9)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.util.ArrayList r3 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onCReqSuccess(r0)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r6 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTranslationZ r6 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.Cardinal(r6)
                    int r6 = r6.getInstance()
                    java.lang.Object r3 = r3.get(r6)
                    com.cardinalcommerce.a.setCameraDistance r3 = (com.cardinalcommerce.a.setCameraDistance) r3
                    java.lang.String r3 = r3.cca_continue()
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cca_continue(r0, r3)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cleanup(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L_0x025e
                    r4 = 78
                L_0x025e:
                    r0 = 78
                    if (r4 == r0) goto L_0x0264
                    goto L_0x0339
                L_0x0264:
                    int r0 = cca_continue
                    int r0 = r0 + 45
                    int r3 = r0 % 128
                    getInstance = r3
                    int r0 = r0 % r8
                    if (r0 == 0) goto L_0x0271
                    r0 = r11
                    goto L_0x0273
                L_0x0271:
                    r0 = 10
                L_0x0273:
                    if (r0 == r11) goto L_0x0284
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cleanup(r0)
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r0)
                    r13.configure(r0)
                    goto L_0x0339
                L_0x0284:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    java.lang.String r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cleanup(r0)
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r0)
                    r13.configure(r0)
                    throw r2     // Catch:{ all -> 0x0292 }
                L_0x0292:
                    r13 = move-exception
                    throw r13
                L_0x0294:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setLeft r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getInstance((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    java.lang.CharSequence r0 = r0.configure()
                    if (r0 == 0) goto L_0x02a2
                    r0 = r9
                    goto L_0x02a3
                L_0x02a2:
                    r0 = r7
                L_0x02a3:
                    if (r0 == r9) goto L_0x02a6
                    goto L_0x02c9
                L_0x02a6:
                    int r0 = cca_continue
                    int r0 = r0 + 8
                    int r0 = r0 - r9
                    int r11 = r0 % 128
                    getInstance = r11
                    int r0 = r0 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setLeft r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getInstance((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    java.lang.CharSequence r0 = r0.configure()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x02c3
                    r0 = 59
                    goto L_0x02c5
                L_0x02c3:
                    r0 = 91
                L_0x02c5:
                    r11 = 59
                    if (r0 == r11) goto L_0x0305
                L_0x02c9:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    boolean r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.cca_continue((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    r4 = 74
                    if (r0 == 0) goto L_0x02d6
                    r0 = 92
                    goto L_0x02d7
                L_0x02d6:
                    r0 = r4
                L_0x02d7:
                    if (r0 == r4) goto L_0x0339
                    int r0 = cca_continue
                    int r0 = r0 + 45
                    int r0 = r0 - r9
                    r4 = r0 | -1
                    int r4 = r4 << r9
                    r0 = r0 ^ r6
                    int r4 = r4 - r0
                    int r0 = r4 % 128
                    getInstance = r0
                    int r4 = r4 % r8
                    if (r4 == 0) goto L_0x02ec
                    r0 = r3
                    goto L_0x02ee
                L_0x02ec:
                    r0 = 24
                L_0x02ee:
                    if (r0 == r3) goto L_0x02f8
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
                    r13.configure(r0)
                    goto L_0x0339
                L_0x02f8:
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
                    r13.configure(r0)
                    super.hashCode()     // Catch:{ all -> 0x0303 }
                    throw r2     // Catch:{ all -> 0x0303 }
                L_0x0303:
                    r13 = move-exception
                    throw r13
                L_0x0305:
                    int r0 = getInstance
                    int r0 = r0 + 44
                    r3 = r0 & -1
                    r0 = r0 | r6
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setLeft r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getInstance((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r0)
                    java.lang.CharSequence r0 = r0.configure()
                    java.lang.String r0 = r0.toString()
                    char[] r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r0)
                    r13.configure(r0)
                    int r0 = cca_continue
                    r3 = r0 & -82
                    int r6 = ~r0
                    r6 = r6 & r4
                    r3 = r3 | r6
                    r0 = r0 & r4
                    int r0 = r0 << r9
                    r4 = r3 & r0
                    r0 = r0 | r3
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    getInstance = r0
                    int r4 = r4 % r8
                L_0x0339:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setBottom r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onValidated(r0)
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto L_0x0347
                    r0 = r7
                    goto L_0x0348
                L_0x0347:
                    r0 = r9
                L_0x0348:
                    if (r0 == r9) goto L_0x0437
                    int r0 = getInstance
                    r3 = r0 & 3
                    r0 = r0 ^ r5
                    r0 = r0 | r3
                    r4 = r3 & r0
                    r0 = r0 | r3
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    cca_continue = r0
                    int r4 = r4 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTransitionVisibility r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.values(r0)
                    java.lang.String r0 = r0.setEnvironment()
                    if (r0 == 0) goto L_0x0366
                    goto L_0x0368
                L_0x0366:
                    r1 = 42
                L_0x0368:
                    r0 = 42
                    if (r1 == r0) goto L_0x0411
                    int r0 = getInstance
                    r1 = r0 & -92
                    int r3 = ~r0
                    r3 = r3 & 91
                    r1 = r1 | r3
                    r0 = r0 & 91
                    int r0 = r0 << r9
                    r3 = r1 & r0
                    r0 = r0 | r1
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    cca_continue = r0
                    int r3 = r3 % r8
                    if (r3 != 0) goto L_0x0384
                    r0 = r7
                    goto L_0x0385
                L_0x0384:
                    r0 = r9
                L_0x0385:
                    if (r0 != r9) goto L_0x0401
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTransitionVisibility r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.values(r0)
                    java.lang.String r0 = r0.setEnvironment()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L_0x0399
                    r0 = r7
                    goto L_0x039a
                L_0x0399:
                    r0 = r9
                L_0x039a:
                    if (r0 == r9) goto L_0x0411
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setRight r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.CardinalRenderType(r0)
                    if (r0 == 0) goto L_0x03a6
                    r0 = r7
                    goto L_0x03a7
                L_0x03a6:
                    r0 = r9
                L_0x03a7:
                    if (r0 == r9) goto L_0x03ee
                    int r0 = cca_continue
                    r1 = r0 & 93
                    int r3 = ~r1
                    r0 = r0 | 93
                    r0 = r0 & r3
                    int r1 = r1 << r9
                    r3 = r0 & r1
                    r0 = r0 | r1
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    getInstance = r0
                    int r3 = r3 % r8
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setRight r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.CardinalRenderType(r0)
                    int r0 = r0.cca_continue()
                    if (r0 == 0) goto L_0x03c9
                    r0 = r5
                    goto L_0x03cb
                L_0x03c9:
                    r0 = 34
                L_0x03cb:
                    if (r0 == r5) goto L_0x03ce
                    goto L_0x03ee
                L_0x03ce:
                    int r0 = getInstance
                    r1 = r0 | 61
                    int r1 = r1 << r9
                    r0 = r0 ^ 61
                    int r1 = r1 - r0
                    int r0 = r1 % 128
                    cca_continue = r0
                    int r1 = r1 % r8
                    if (r1 != 0) goto L_0x03de
                    r7 = r9
                L_0x03de:
                    if (r7 == r9) goto L_0x03e6
                    char[] r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.WHITE_LIST_SELECTED_VALUE
                    r13.init(r0)
                    goto L_0x0411
                L_0x03e6:
                    char[] r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.WHITE_LIST_SELECTED_VALUE
                    r13.init(r0)
                    throw r2     // Catch:{ all -> 0x03ec }
                L_0x03ec:
                    r13 = move-exception
                    throw r13
                L_0x03ee:
                    char[] r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.WHITE_LIST_NOT_SELECTED_VALUE
                    r13.init(r0)
                    int r0 = getInstance
                    r1 = r0 | 63
                    int r1 = r1 << r9
                    r0 = r0 ^ 63
                    int r1 = r1 - r0
                    int r0 = r1 % 128
                    cca_continue = r0
                    int r1 = r1 % r8
                    goto L_0x0411
                L_0x0401:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r13 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTransitionVisibility r13 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.values(r13)
                    java.lang.String r13 = r13.setEnvironment()
                    r13.isEmpty()
                    throw r2     // Catch:{ all -> 0x040f }
                L_0x040f:
                    r13 = move-exception
                    throw r13
                L_0x0411:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setAccessibilityLiveRegion r1 = new com.cardinalcommerce.a.setAccessibilityLiveRegion
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r2 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setTransitionVisibility r2 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.values(r2)
                    r1.<init>(r2, r13)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getInstance(r0, r1)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r13 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setAccessibilityLiveRegion r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.CardinalEnvironment(r13)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.init((com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView) r13, (com.cardinalcommerce.a.setAccessibilityLiveRegion) r0)
                    int r13 = getInstance
                    r0 = r13 & 103(0x67, float:1.44E-43)
                    r13 = r13 | 103(0x67, float:1.44E-43)
                    int r0 = r0 + r13
                    int r13 = r0 % 128
                    cca_continue = r13
                    int r0 = r0 % r8
                    return
                L_0x0437:
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r13 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                    com.cardinalcommerce.a.setBottom r13 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onValidated(r13)
                    r13.setEnabled(r9)
                    int r13 = cca_continue
                    r0 = r13 & 113(0x71, float:1.58E-43)
                    r13 = r13 ^ 113(0x71, float:1.58E-43)
                    r13 = r13 | r0
                    int r13 = -r13
                    int r13 = -r13
                    r1 = r0 ^ r13
                    r13 = r13 & r0
                    int r13 = r13 << r9
                    int r1 = r1 + r13
                    int r13 = r1 % 128
                    getInstance = r13
                    int r1 = r1 % r8
                    if (r1 == 0) goto L_0x0458
                    r13 = 73
                    goto L_0x045a
                L_0x0458:
                    r13 = 35
                L_0x045a:
                    r0 = 73
                    if (r13 == r0) goto L_0x045f
                    return
                L_0x045f:
                    r13 = 55
                    int r13 = r13 / r7
                    return
                L_0x0463:
                    r13 = move-exception
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.AnonymousClass10.onClick(android.view.View):void");
            }
        });
        if (onCReqSuccess()) {
            this.getSDKVersion.setCCAOnClickListener(new setZ.Cardinal() {
                private static int cca_continue = 1;
                private static int init;

                public final void onClick(View view) {
                    setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Resend challenge pressed", (String) null);
                    setHovered sethovered = new setHovered();
                    sethovered.cca_continue(setHorizontalScrollBarEnabled.configure("Y"));
                    ChallengeNativeView.getInstance(ChallengeNativeView.this, new setAccessibilityLiveRegion(ChallengeNativeView.values(ChallengeNativeView.this), sethovered));
                    ChallengeNativeView challengeNativeView = ChallengeNativeView.this;
                    ChallengeNativeView.init(challengeNativeView, ChallengeNativeView.CardinalEnvironment(challengeNativeView));
                    int i = cca_continue;
                    int i2 = i & 71;
                    int i3 = ((i ^ 71) | i2) << 1;
                    int i4 = -((i | 71) & (~i2));
                    int i5 = (i3 & i4) + (i4 | i3);
                    init = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i = setUiType + 43;
            setRenderType = i % 128;
            int i2 = i % 2;
        }
        this.CardinalEnvironment.setCCAOnClickListener(new setZ.Cardinal() {
            private static int cca_continue = 0;
            private static int getInstance = 1;

            /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
            public final void onClick(View view) {
                int i = getInstance;
                int i2 = i & 17;
                int i3 = -(-(i | 17));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                cca_continue = i4 % 128;
                ? r3 = 0;
                if (!(i4 % 2 != 0)) {
                    setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Cancel pressed", r3);
                    ChallengeNativeView.CardinalError(ChallengeNativeView.this);
                    return;
                }
                setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Cancel pressed", r3);
                ChallengeNativeView.CardinalError(ChallengeNativeView.this);
                super.hashCode();
                throw r3;
            }
        });
        int i3 = setUiType;
        int i4 = ((i3 & -126) | ((~i3) & 125)) + ((i3 & 125) << 1);
        setRenderType = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getInstance() {
        setHovered sethovered = new setHovered();
        sethovered.Cardinal(ThreeDSStrings.CHALLENGE_CANCEL_CHAR);
        setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion(this.getString, sethovered);
        this.CardinalActionCode = setaccessibilityliveregion;
        cca_continue(setaccessibilityliveregion);
        int i = setUiType;
        int i2 = ((i ^ 84) + ((i & 84) << 1)) - 1;
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onBackPressed() {
        super.onBackPressed();
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "Back button pressed", (String) null);
        setHovered sethovered = new setHovered();
        sethovered.Cardinal(ThreeDSStrings.CHALLENGE_CANCEL_CHAR);
        setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion(this.getString, sethovered);
        this.CardinalActionCode = setaccessibilityliveregion;
        cca_continue(setaccessibilityliveregion);
        int i = setRenderType + 79;
        setUiType = i % 128;
        int i2 = i % 2;
    }

    private String cca_continue() {
        StringBuilder sb = new StringBuilder();
        Iterator<setRight> it = this.CardinalConfigurationParameters.iterator();
        int i = setUiType;
        int i2 = (i | 29) << 1;
        int i3 = -(((~i) & 29) | (i & -30));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        setRenderType = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if ((it.hasNext() ? 20 : ']') != ']') {
                int i6 = setUiType;
                int i7 = i6 & 25;
                int i8 = (i6 ^ 25) | i7;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                setRenderType = i9 % 128;
                int i10 = i9 % 2;
                setRight next = it.next();
                boolean z = false;
                if (next.cca_continue() == 1) {
                    int i11 = setRenderType;
                    int i12 = i11 & 117;
                    int i13 = ((i11 | 117) & (~i12)) + (i12 << 1);
                    setUiType = i13 % 128;
                    int i14 = i13 % 2;
                    if (!sb.toString().isEmpty()) {
                        z = true;
                    }
                    if (!z) {
                        sb = new StringBuilder(this.setChallengeTimeout.get(next.init()).cca_continue());
                        int i15 = setUiType;
                        int i16 = ((i15 ^ 109) | (i15 & 109)) << 1;
                        int i17 = -(((~i15) & 109) | (i15 & -110));
                        int i18 = (i16 & i17) + (i17 | i16);
                        setRenderType = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        int i20 = setUiType + 69;
                        setRenderType = i20 % 128;
                        int i21 = i20 % 2;
                        sb.append(",").append(this.setChallengeTimeout.get(next.init()).cca_continue());
                        int i22 = setRenderType;
                        int i23 = ((i22 | 28) << 1) - (i22 ^ 28);
                        int i24 = (i23 ^ -1) + ((i23 & -1) << 1);
                        setUiType = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                int i26 = setUiType;
                int i27 = ((i26 | 9) << 1) - (i26 ^ 9);
                setRenderType = i27 % 128;
                int i28 = i27 % 2;
            } else {
                String obj = sb.toString();
                int i29 = setRenderType;
                int i30 = i29 & 29;
                int i31 = -(-((i29 ^ 29) | i30));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                setUiType = i32 % 128;
                int i33 = i32 % 2;
                return obj;
            }
        }
    }

    private void init(ArrayList<setCameraDistance> arrayList) {
        this.setChallengeTimeout = arrayList;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.multiSelectgroup);
        linearLayout.removeAllViews();
        this.CardinalConfigurationParameters = new ArrayList();
        int i = setRenderType;
        int i2 = ((i ^ 109) | (i & 109)) << 1;
        int i3 = -(((~i) & 109) | (i & -110));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        setUiType = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (i6 <= 0) {
                int i7 = setRenderType;
                int i8 = (((i7 & 46) + (i7 | 46)) - 0) - 1;
                int i9 = i8 % 128;
                setUiType = i9;
                int i10 = i8 % 2;
                int i11 = i9 ^ 43;
                int i12 = ((((i9 & 43) | i11) << 1) - (~(-i11))) - 1;
                setRenderType = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    setRight setright = new setRight(this);
                    setright.setCCAText(this.setChallengeTimeout.get(i14).getInstance());
                    setright.setCCAId(i14);
                    UiCustomization uiCustomization = this.CardinalUiType;
                    if (!(uiCustomization == null)) {
                        int i15 = setRenderType;
                        int i16 = i15 & 111;
                        int i17 = (i15 | 111) & (~i16);
                        int i18 = i16 << 1;
                        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                        setUiType = i19 % 128;
                        char c = i19 % 2 == 0 ? SignatureVisitor.SUPER : 'H';
                        setVerticalFadingEdgeEnabled.configure(setright, uiCustomization, (Activity) this);
                        if (c != 'H') {
                            int i20 = 58 / 0;
                        } else {
                            continue;
                        }
                    }
                    this.CardinalConfigurationParameters.add(setright);
                    init(setright);
                    linearLayout.addView(setright);
                    int i21 = i14 & -126;
                    int i22 = ((i14 | -126) & (~i21)) + (i21 << 1);
                    int i23 = i22 ^ 127;
                    int i24 = (i22 & 127) << 1;
                    i14 = (i24 | i23) + (i23 & i24);
                    int i25 = (((setUiType + 73) - 1) - 0) - 1;
                    setRenderType = i25 % 128;
                    int i26 = i25 % 2;
                }
                int i27 = (i6 + 121) - 1;
                i6 = ((i27 & -119) << 1) + (i27 ^ -119);
                int i28 = setRenderType;
                int i29 = i28 ^ 63;
                int i30 = (i28 & 63) << 1;
                int i31 = (i29 & i30) + (i30 | i29);
                setUiType = i31 % 128;
                int i32 = i31 % 2;
            } else {
                int i33 = setRenderType;
                int i34 = i33 ^ 125;
                int i35 = (i33 & 125) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                setUiType = i36 % 128;
                if ((i36 % 2 == 0 ? '/' : 20) == '/') {
                    throw null;
                }
                return;
            }
        }
    }

    private void configure(ArrayList<setCameraDistance> arrayList) {
        int i = setUiType;
        int i2 = (i & -86) | ((~i) & 85);
        int i3 = (i & 85) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        setRenderType = i4 % 128;
        char c = i4 % 2 != 0 ? '!' : 'C';
        int i5 = 0;
        if (c != 'C') {
            setTranslationZ settranslationz = (setTranslationZ) findViewById(R.id.selectradiogroup);
            this.getRequestTimeout = settranslationz;
            settranslationz.removeAllViews();
            this.getRequestTimeout.setOrientation(0);
            this.setChallengeTimeout = arrayList;
            i5 = 1;
        } else {
            setTranslationZ settranslationz2 = (setTranslationZ) findViewById(R.id.selectradiogroup);
            this.getRequestTimeout = settranslationz2;
            settranslationz2.removeAllViews();
            this.getRequestTimeout.setOrientation(1);
            this.setChallengeTimeout = arrayList;
        }
        int i6 = setUiType;
        int i7 = ((i6 ^ 48) + ((i6 & 48) << 1)) - 1;
        setRenderType = i7 % 128;
        int i8 = i7 % 2;
        while (i5 < this.setChallengeTimeout.size()) {
            setTranslationX settranslationx = new setTranslationX(this);
            this.setRequestTimeout = settranslationx;
            settranslationx.setId(i5);
            this.setRequestTimeout.setCCAText(this.setChallengeTimeout.get(i5).getInstance());
            setVerticalFadingEdgeEnabled.cca_continue(this.setRequestTimeout, this.CardinalUiType, (Activity) this);
            this.setRequestTimeout.setCCAOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                private static int configure = 0;
                private static int getInstance = 1;

                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
                    if (r3 != true) goto L_0x0043;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
                    if (r3 != true) goto L_0x0043;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
                    /*
                        r2 = this;
                        int r3 = configure
                        r0 = r3 & 87
                        r3 = r3 | 87
                        int r0 = r0 + r3
                        int r3 = r0 % 128
                        getInstance = r3
                        int r0 = r0 % 2
                        r3 = 0
                        r1 = 1
                        if (r0 != 0) goto L_0x0013
                        r0 = r1
                        goto L_0x0014
                    L_0x0013:
                        r0 = r3
                    L_0x0014:
                        if (r0 == r1) goto L_0x001c
                        if (r4 == 0) goto L_0x0019
                        r3 = r1
                    L_0x0019:
                        if (r3 == r1) goto L_0x0025
                        goto L_0x0043
                    L_0x001c:
                        r0 = 86
                        int r0 = r0 / r3
                        if (r4 == 0) goto L_0x0022
                        r3 = r1
                    L_0x0022:
                        if (r3 == r1) goto L_0x0025
                        goto L_0x0043
                    L_0x0025:
                        com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView r3 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.this
                        com.cardinalcommerce.shared.userinterfaces.UiCustomization r0 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getWarnings(r3)
                        com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.configure(r3, r0, r4)
                        int r3 = getInstance
                        r4 = r3 | 57
                        int r0 = r4 << 1
                        r3 = r3 & 57
                        int r3 = ~r3
                        r3 = r3 & r4
                        int r3 = -r3
                        r4 = r0 & r3
                        r3 = r3 | r0
                        int r4 = r4 + r3
                        int r3 = r4 % 128
                        configure = r3
                        int r4 = r4 % 2
                    L_0x0043:
                        int r3 = getInstance
                        r4 = r3 & 96
                        r3 = r3 | 96
                        int r4 = r4 + r3
                        int r4 = r4 - r1
                        int r3 = r4 % 128
                        configure = r3
                        int r4 = r4 % 2
                        r3 = 63
                        if (r4 == 0) goto L_0x0058
                        r4 = 66
                        goto L_0x0059
                    L_0x0058:
                        r4 = r3
                    L_0x0059:
                        if (r4 != r3) goto L_0x005c
                        return
                    L_0x005c:
                        r3 = 0
                        super.hashCode()     // Catch:{ all -> 0x0061 }
                        throw r3     // Catch:{ all -> 0x0061 }
                    L_0x0061:
                        r3 = move-exception
                        throw r3
                    L_0x0063:
                        r3 = move-exception
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.AnonymousClass9.onCheckedChanged(android.widget.CompoundButton, boolean):void");
                }
            });
            this.getRequestTimeout.Cardinal(this.setRequestTimeout);
            int i9 = ((i5 | -108) << 1) - (i5 ^ -108);
            int i10 = i9 & 109;
            int i11 = -(-((i9 ^ 109) | i10));
            i5 = ((i10 | i11) << 1) - (i11 ^ i10);
            int i12 = setUiType;
            int i13 = (i12 ^ 98) + ((i12 & 98) << 1);
            int i14 = ((i13 | -1) << 1) - (i13 ^ -1);
            setRenderType = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = setUiType;
        int i17 = (i16 ^ 105) + ((i16 & 105) << 1);
        setRenderType = i17 % 128;
        int i18 = i17 % 2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private void init() {
        int i = setRenderType + 70;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        setUiType = i2 % 128;
        ? r3 = 0;
        if ((i2 % 2 == 0 ? 5 : 'M') != 5) {
            boolean z = false;
            if (!(this.getString.getWarnings().isEmpty())) {
                int i3 = setRenderType;
                int i4 = ((i3 | 7) << 1) - (i3 ^ 7);
                setUiType = i4 % 128;
                int i5 = i4 % 2;
                if (this.getString.getWarnings() != null) {
                    int i6 = setUiType;
                    int i7 = i6 & 61;
                    int i8 = (i6 ^ 61) | i7;
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    setRenderType = i9 % 128;
                    int i10 = i9 % 2;
                    if ((!CardinalRenderType() ? '*' : '_') == '*') {
                        int i11 = setRenderType;
                        int i12 = i11 ^ 23;
                        int i13 = ((i11 & 23) | i12) << 1;
                        int i14 = -i12;
                        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                        setUiType = i15 % 128;
                        if (!(i15 % 2 == 0)) {
                            this.onCReqSuccess.setCCAText(this.getString.getWarnings());
                            int i16 = setUiType;
                            int i17 = (i16 ^ 84) + ((i16 & 84) << 1);
                            int i18 = ((i17 | -1) << 1) - (i17 ^ -1);
                            setRenderType = i18 % 128;
                            int i19 = i18 % 2;
                        } else {
                            this.onCReqSuccess.setCCAText(this.getString.getWarnings());
                            super.hashCode();
                            throw r3;
                        }
                    }
                }
            }
            if ((this.getString.CardinalEnvironment() != null ? '4' : 8) != 8) {
                int i20 = setRenderType;
                int i21 = i20 & 93;
                int i22 = (i21 - (~((i20 ^ 93) | i21))) - 1;
                setUiType = i22 % 128;
                int i23 = i22 % 2;
                this.getInstance.setVisibility(8);
                int i24 = setUiType;
                int i25 = i24 ^ 65;
                int i26 = ((i24 & 65) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 & i27) + (i26 | i27);
                setRenderType = i28 % 128;
                int i29 = i28 % 2;
            }
            if (!values()) {
                z = true;
            }
            if (z) {
                int i30 = setUiType;
                int i31 = i30 & 39;
                int i32 = -(-((i30 ^ 39) | i31));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                setRenderType = i33 % 128;
                int i34 = i33 % 2;
                this.cleanup.performClick();
                setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, "OOB Continue pressed by SDK", r3);
                int i35 = setUiType;
                int i36 = i35 & 51;
                int i37 = i36 + ((i35 ^ 51) | i36);
                setRenderType = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = setRenderType;
            int i40 = i39 ^ 53;
            int i41 = -(-((i39 & 53) << 1));
            int i42 = (i40 & i41) + (i41 | i40);
            setUiType = i42 % 128;
            int i43 = i42 % 2;
            return;
        }
        this.getString.getWarnings().isEmpty();
        super.hashCode();
        throw r3;
    }

    private void Cardinal(setScrollbarFadingEnabled setscrollbarfadingenabled, setY sety) throws InvalidInputException {
        int i = setUiType;
        int i2 = ((i | 65) << 1) - (i ^ 65);
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
        String instance = setscrollbarfadingenabled.getInstance((Context) this);
        if (!instance.equals("")) {
            new setX(sety, instance).init();
            int i4 = setUiType;
            int i5 = i4 & 37;
            int i6 = i5 + ((i4 ^ 37) | i5);
            setRenderType = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        sety.setVisibility(4);
        int i8 = setUiType;
        int i9 = ((i8 ^ 15) | (i8 & 15)) << 1;
        int i10 = -(((~i8) & 15) | (i8 & -16));
        int i11 = (i9 & i10) + (i10 | i9);
        setRenderType = i11 % 128;
        if ((i11 % 2 != 0 ? 'J' : SignatureVisitor.EXTENDS) == 'J') {
            throw null;
        }
    }

    private void cca_continue(UiCustomization uiCustomization) {
        int i = setRenderType;
        int i2 = (((i & -68) | ((~i) & 67)) - (~(-(-((i & 67) << 1))))) - 1;
        setUiType = i2 % 128;
        Throwable th = null;
        if ((i2 % 2 == 0 ? 'R' : '.') == '.') {
            if (!(uiCustomization == null)) {
                int i3 = (i + 26) - 1;
                setUiType = i3 % 128;
                int i4 = i3 % 2;
                if (!(this.getProxyAddress.equals(ThreeDSStrings.RENDER_TYPE_OOB))) {
                    int i5 = setUiType;
                    int i6 = ((i5 | 57) << 1) - (((~i5) & 57) | (i5 & -58));
                    setRenderType = i6 % 128;
                    int i7 = i6 % 2;
                    setVerticalFadingEdgeEnabled.getInstance(this.onValidated, uiCustomization, this);
                    if (!(!onCReqSuccess())) {
                        int i8 = setRenderType;
                        int i9 = (i8 & -92) | ((~i8) & 91);
                        int i10 = (i8 & 91) << 1;
                        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                        setUiType = i11 % 128;
                        if (i11 % 2 == 0 ? true : true) {
                            init(uiCustomization);
                        } else {
                            init(uiCustomization);
                            throw th;
                        }
                    }
                    if ((this.getProxyAddress.equals("01") ? '\\' : '2') != '2') {
                        int i12 = setUiType;
                        int i13 = i12 | 61;
                        int i14 = ((i13 << 1) - (~(-((~(i12 & 61)) & i13)))) - 1;
                        setRenderType = i14 % 128;
                        int i15 = i14 % 2;
                        setVerticalFadingEdgeEnabled.configure(this.getWarnings, uiCustomization, (Activity) this);
                        int i16 = setRenderType;
                        int i17 = (((i16 ^ 89) | (i16 & 89)) << 1) - (((~i16) & 89) | (i16 & -90));
                        setUiType = i17 % 128;
                        int i18 = i17 % 2;
                    }
                }
                setVerticalFadingEdgeEnabled.init(this.CardinalEnvironment, uiCustomization, (Activity) this);
                if (!(!onCReqSuccess())) {
                    int i19 = setUiType;
                    int i20 = i19 ^ 25;
                    int i21 = -(-((i19 & 25) << 1));
                    int i22 = (i20 & i21) + (i21 | i20);
                    setRenderType = i22 % 128;
                    if (i22 % 2 == 0) {
                        init(uiCustomization);
                        int i23 = setRenderType;
                        int i24 = i23 & 121;
                        int i25 = ((i23 | 121) & (~i24)) + (i24 << 1);
                        setUiType = i25 % 128;
                        int i26 = i25 % 2;
                    } else {
                        init(uiCustomization);
                        super.hashCode();
                        throw th;
                    }
                }
                setVerticalFadingEdgeEnabled.cca_continue(this.init, uiCustomization, (Activity) this);
                setVerticalFadingEdgeEnabled.getInstance(this.onCReqSuccess, uiCustomization, this);
                setVerticalFadingEdgeEnabled.getInstance(this.CardinalRenderType, uiCustomization, this);
                setVerticalFadingEdgeEnabled.getInstance(this.valueOf, uiCustomization, this);
                setVerticalFadingEdgeEnabled.getInstance(this.CardinalError, uiCustomization, this);
                setVerticalFadingEdgeEnabled.getInstance(this.values, uiCustomization, this);
                getInstance(uiCustomization);
                Cardinal(uiCustomization, false);
                setVerticalFadingEdgeEnabled.Cardinal(this.cca_continue, uiCustomization, (Activity) this);
                int i27 = setRenderType;
                int i28 = i27 ^ 59;
                int i29 = (((i27 & 59) | i28) << 1) - i28;
                setUiType = i29 % 128;
                int i30 = i29 % 2;
            }
            int i31 = setRenderType;
            int i32 = i31 & 63;
            int i33 = (((i31 ^ 63) | i32) << 1) - ((i31 | 63) & (~i32));
            setUiType = i33 % 128;
            if ((i33 % 2 == 0 ? '1' : 'P') == '1') {
                int i34 = 83 / 0;
                return;
            }
            return;
        }
        throw th;
    }

    private void init(UiCustomization uiCustomization) {
        int i = setRenderType;
        int i2 = (i & 76) + (i | 76);
        int i3 = (i2 & -1) + (i2 | -1);
        setUiType = i3 % 128;
        boolean z = true;
        if (i3 % 2 != 0) {
            if (!(this.getSDKVersion == null)) {
                if ((uiCustomization.getButtonCustomization(ButtonType.RESEND) == null ? '\'' : 'V') != 'V') {
                    int i4 = setUiType;
                    int i5 = (i4 & -78) | ((~i4) & 77);
                    int i6 = -(-((i4 & 77) << 1));
                    int i7 = (i5 & i6) + (i6 | i5);
                    setRenderType = i7 % 128;
                    int i8 = i7 % 2;
                    this.getSDKVersion.setTextColor(getResources().getColor(R.color.blue));
                    int i9 = setRenderType;
                    int i10 = i9 ^ 87;
                    int i11 = ((i9 & 87) | i10) << 1;
                    int i12 = -i10;
                    int i13 = (i11 & i12) + (i11 | i12);
                    setUiType = i13 % 128;
                    if (i13 % 2 != 0) {
                        z = false;
                    }
                    if (z) {
                        int i14 = 69 / 0;
                        return;
                    }
                    return;
                }
                setVerticalFadingEdgeEnabled.init(this.getSDKVersion, uiCustomization.getButtonCustomization(ButtonType.RESEND), (Activity) this);
                int i15 = setUiType;
                int i16 = i15 & 41;
                int i17 = (i15 | 41) & (~i16);
                int i18 = -(-(i16 << 1));
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                setRenderType = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = setRenderType;
            int i22 = i21 & 115;
            int i23 = ((i21 ^ 115) | i22) << 1;
            int i24 = -((i21 | 115) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            setUiType = i25 % 128;
            int i26 = i25 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r3 != true) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r3 != true) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.init(r4.cleanup, r5.getButtonCustomization(com.cardinalcommerce.shared.models.enums.ButtonType.VERIFY), (android.app.Activity) r4);
        r5 = setRenderType;
        r0 = ((r5 | 87) << 1) - (r5 ^ 87);
        setUiType = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getInstance(com.cardinalcommerce.shared.userinterfaces.UiCustomization r5) {
        /*
            r4 = this;
            int r0 = setRenderType
            r1 = r0 ^ 41
            r2 = r0 & 41
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -42
            int r0 = ~r0
            r0 = r0 & 41
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            setUiType = r0
            int r3 = r3 % 2
            r0 = 63
            if (r3 != 0) goto L_0x0021
            r1 = 69
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            r3 = 0
            if (r1 == r0) goto L_0x0037
            com.cardinalcommerce.shared.models.enums.ButtonType r0 = com.cardinalcommerce.shared.models.enums.ButtonType.VERIFY
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r0 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r0)
            r1 = 24
            int r1 = r1 / r3
            if (r0 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r3 = r2
        L_0x0032:
            if (r3 == r2) goto L_0x0082
            goto L_0x0043
        L_0x0035:
            r5 = move-exception
            throw r5
        L_0x0037:
            com.cardinalcommerce.shared.models.enums.ButtonType r0 = com.cardinalcommerce.shared.models.enums.ButtonType.VERIFY
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r0 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r3 = r2
        L_0x0041:
            if (r3 == r2) goto L_0x0082
        L_0x0043:
            com.cardinalcommerce.a.setBottom r5 = r4.cleanup
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.cardinalcommerce.cardinalmobilesdk.R.color.blue
            int r0 = r0.getColor(r1)
            r5.setBackgroundColor(r0)
            com.cardinalcommerce.a.setBottom r5 = r4.cleanup
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.cardinalcommerce.cardinalmobilesdk.R.color.colorWhite
            int r0 = r0.getColor(r1)
            r5.setTextColor(r0)
            int r5 = setRenderType
            r0 = r5 & 59
            r5 = r5 ^ 59
            r5 = r5 | r0
            r1 = r0 ^ r5
            r5 = r5 & r0
            int r5 = r5 << r2
            int r1 = r1 + r5
            int r5 = r1 % 128
            setUiType = r5
            int r1 = r1 % 2
            r5 = 18
            if (r1 != 0) goto L_0x007a
            r0 = 83
            goto L_0x007b
        L_0x007a:
            r0 = r5
        L_0x007b:
            if (r0 != r5) goto L_0x007e
            return
        L_0x007e:
            r5 = 0
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            throw r5
        L_0x0082:
            com.cardinalcommerce.a.setBottom r0 = r4.cleanup
            com.cardinalcommerce.shared.models.enums.ButtonType r1 = com.cardinalcommerce.shared.models.enums.ButtonType.VERIFY
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r5 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r1)
            com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.init((com.cardinalcommerce.a.setBottom) r0, (com.cardinalcommerce.shared.userinterfaces.ButtonCustomization) r5, (android.app.Activity) r4)
            int r5 = setRenderType
            r0 = r5 | 87
            int r0 = r0 << r2
            r5 = r5 ^ 87
            int r0 = r0 - r5
            int r5 = r0 % 128
            setUiType = r5
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.getInstance(com.cardinalcommerce.shared.userinterfaces.UiCustomization):void");
    }

    private void Cardinal(UiCustomization uiCustomization, boolean z) {
        int i = setUiType;
        int i2 = (i | 125) << 1;
        int i3 = -(((~i) & 125) | (i & -126));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        setRenderType = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = false;
        if (uiCustomization.getButtonCustomization(ButtonType.VERIFY) != null) {
            setVerticalFadingEdgeEnabled.init(this.cleanup, uiCustomization.getButtonCustomization(ButtonType.VERIFY), (Activity) this);
            int i6 = setRenderType + 86;
            int i7 = (i6 & -1) + (i6 | -1);
            setUiType = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = setUiType;
        int i10 = ((i9 ^ 75) | (i9 & 75)) << 1;
        int i11 = -((i9 & -76) | ((~i9) & 75));
        int i12 = (i10 & i11) + (i10 | i11);
        setRenderType = i12 % 128;
        Throwable th = null;
        if ((i12 % 2 != 0 ? (char) 2 : 3) != 2) {
            if (!(this.setRequestTimeout == null)) {
                int i13 = ((i9 ^ 15) | (i9 & 15)) << 1;
                int i14 = -((i9 & -16) | ((~i9) & 15));
                int i15 = (i13 & i14) + (i13 | i14);
                setRenderType = i15 % 128;
                if ((i15 % 2 != 0 ? '7' : 5) == 5) {
                    if (!(z)) {
                        int i16 = i9 ^ 33;
                        int i17 = -(-((i9 & 33) << 1));
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        setRenderType = i18 % 128;
                        if (i18 % 2 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            if ((values() ? 'U' : ';') == 'U') {
                                this.cleanup.setBackgroundColor(TopBar.DEFAULT_SUBTITLE_COLOR);
                                int i19 = setRenderType;
                                int i20 = i19 & 85;
                                int i21 = (i19 ^ 85) | i20;
                                int i22 = (i20 & i21) + (i21 | i20);
                                setUiType = i22 % 128;
                                int i23 = i22 % 2;
                                this.cleanup.setTextColor(getResources().getColor(R.color.colorWhite));
                                int i24 = setRenderType + 107;
                                setUiType = i24 % 128;
                                int i25 = i24 % 2;
                                return;
                            }
                        } else {
                            values();
                            super.hashCode();
                            throw th;
                        }
                    }
                } else {
                    throw th;
                }
            }
            this.cleanup.setBackgroundColor(getResources().getColor(R.color.blue));
            int i26 = (setUiType + 110) - 1;
            setRenderType = i26 % 128;
            int i27 = i26 % 2;
            this.cleanup.setTextColor(getResources().getColor(R.color.colorWhite));
            int i242 = setRenderType + 107;
            setUiType = i242 % 128;
            int i252 = i242 % 2;
            return;
        }
        super.hashCode();
        throw th;
    }

    private void cca_continue(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = setRenderType;
        int i2 = i & 47;
        int i3 = (~i2) & (i | 47);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        setUiType = i5 % 128;
        int i6 = i5 % 2;
        if ((this.getEnvironment ? 'R' : '1') != '1') {
            int i7 = ((i ^ 35) - (~((i & 35) << 1))) - 1;
            setUiType = i7 % 128;
            int i8 = i7 % 2;
            configure(setaccessibilityliveregion);
            int i9 = setRenderType + 73;
            setUiType = i9 % 128;
            if ((i9 % 2 == 0 ? 'T' : '\'') == 'T') {
                Throwable th = null;
                super.hashCode();
                throw th;
            }
            return;
        }
        init(setaccessibilityliveregion);
        int i10 = setUiType;
        int i11 = (i10 & 110) + (i10 | 110);
        int i12 = ((i11 | -1) << 1) - (i11 ^ -1);
        setRenderType = i12 % 128;
        int i13 = i12 % 2;
    }

    private void init(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = setUiType;
        int i2 = i | 93;
        int i3 = i2 << 1;
        int i4 = -((~(i & 93)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        setRenderType = i5 % 128;
        if ((i5 % 2 != 0 ? '7' : '@') != '7') {
            cleanup();
            setAlpha.cca_continue(getApplicationContext()).Cardinal(setaccessibilityliveregion, this, this.getProxyAddress);
            return;
        }
        cleanup();
        setAlpha.cca_continue(getApplicationContext()).Cardinal(setaccessibilityliveregion, this, this.getProxyAddress);
        throw null;
    }

    private void configure(setAccessibilityLiveRegion setaccessibilityliveregion) {
        Intent intent = new Intent();
        intent.putExtra(ThreeDSStrings.CCA_CREQ, setaccessibilityliveregion);
        setResult(-1, intent);
        finish();
        int i = setRenderType;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        boolean z = true;
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        setUiType = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    private void cleanup() {
        runOnUiThread(new Runnable() {
            private static int getInstance = 0;
            private static int init = 1;

            public final void run() {
                int i = init;
                int i2 = i & 49;
                int i3 = (i | 49) & (~i2);
                int i4 = i2 << 1;
                int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
                getInstance = i5 % 128;
                int i6 = i5 % 2;
                if ((ChallengeNativeView.valueOf(ChallengeNativeView.this) != null ? '?' : 'c') == '?') {
                    int i7 = init;
                    int i8 = (i7 & 98) + (i7 | 98);
                    int i9 = ((i8 | -1) << 1) - (i8 ^ -1);
                    getInstance = i9 % 128;
                    int i10 = i9 % 2;
                    if (!(!ChallengeNativeView.getString(ChallengeNativeView.this))) {
                        int i11 = getInstance;
                        int i12 = i11 & 119;
                        int i13 = (((i11 | 119) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                        init = i13 % 128;
                        if ((i13 % 2 == 0 ? 'A' : 18) != 18) {
                            ChallengeNativeView.valueOf(ChallengeNativeView.this).setEnabled(true);
                        } else {
                            ChallengeNativeView.valueOf(ChallengeNativeView.this).setEnabled(false);
                        }
                        int i14 = init;
                        int i15 = i14 ^ 117;
                        int i16 = ((((i14 & 117) | i15) << 1) - (~(-i15))) - 1;
                        getInstance = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                if ((ChallengeNativeView.configure(ChallengeNativeView.this).equals("01") ? (char) 3 : 27) == 3) {
                    int i18 = getInstance;
                    int i19 = i18 & 83;
                    int i20 = ((i18 ^ 83) | i19) << 1;
                    int i21 = -((i18 | 83) & (~i19));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    init = i22 % 128;
                    int i23 = i22 % 2;
                    ChallengeNativeView.getInstance(ChallengeNativeView.this).setFocusable(false);
                    int i24 = init;
                    int i25 = ((i24 ^ 6) + ((i24 & 6) << 1)) - 1;
                    getInstance = i25 % 128;
                    int i26 = i25 % 2;
                }
                ChallengeNativeView.onValidated(ChallengeNativeView.this).setEnabled(false);
                ChallengeNativeView.CardinalChallengeObserver(ChallengeNativeView.this).setVisibility(0);
                ChallengeNativeView.this.getWindow().setFlags(16, 16);
                int i27 = init;
                int i28 = ((i27 ^ 29) | (i27 & 29)) << 1;
                int i29 = -(((~i27) & 29) | (i27 & -30));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                getInstance = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 97 / 0;
                }
            }
        });
        int i = setUiType;
        int i2 = (((i | 31) << 1) - (~(-(((~i) & 31) | (i & -32))))) - 1;
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
    }

    private void getSDKVersion() {
        runOnUiThread(new Runnable() {
            private static int cca_continue = 0;
            private static int init = 1;

            public final void run() {
                int i = cca_continue;
                int i2 = ((i | 113) << 1) - (i ^ 113);
                init = i2 % 128;
                if ((i2 % 2 == 0 ? (char) 10 : 6) != 10) {
                    if ((ChallengeNativeView.valueOf(ChallengeNativeView.this) != null ? 14 : 'T') == 14) {
                        if (!(!ChallengeNativeView.getString(ChallengeNativeView.this))) {
                            int i3 = cca_continue;
                            int i4 = ((i3 | 57) << 1) - (i3 ^ 57);
                            init = i4 % 128;
                            int i5 = i4 % 2;
                            ChallengeNativeView.valueOf(ChallengeNativeView.this).setEnabled(true);
                            int i6 = cca_continue;
                            int i7 = ((i6 & -70) | ((~i6) & 69)) + ((i6 & 69) << 1);
                            init = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    if (ChallengeNativeView.configure(ChallengeNativeView.this).equals("01")) {
                        int i9 = init;
                        int i10 = ((i9 & -88) | ((~i9) & 87)) + ((i9 & 87) << 1);
                        cca_continue = i10 % 128;
                        if ((i10 % 2 != 0 ? 'I' : 'K') != 'I') {
                            ChallengeNativeView.getInstance(ChallengeNativeView.this).setFocusable(true);
                        } else {
                            ChallengeNativeView.getInstance(ChallengeNativeView.this).setFocusable(false);
                        }
                    }
                    ChallengeNativeView.CardinalChallengeObserver(ChallengeNativeView.this).setVisibility(8);
                    ChallengeNativeView.this.getWindow().clearFlags(16);
                    ChallengeNativeView.onValidated(ChallengeNativeView.this).setEnabled(true);
                    int i11 = cca_continue;
                    int i12 = i11 & 35;
                    int i13 = i11 | 35;
                    int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                    init = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                }
                ChallengeNativeView.valueOf(ChallengeNativeView.this);
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        });
        int i = setUiType;
        int i2 = i & 81;
        int i3 = i2 + ((i ^ 81) | i2);
        setRenderType = i3 % 128;
        if ((i3 % 2 != 0 ? 3 : '#') == 3) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void configure(final setTransitionVisibility settransitionvisibility) {
        runOnUiThread(new Runnable() {
            private static int cca_continue = 0;
            private static int configure = 1;

            public final void run() {
                int i = configure;
                int i2 = i & 93;
                int i3 = ((i ^ 93) | i2) << 1;
                int i4 = -((i | 93) & (~i2));
                int i5 = (i3 & i4) + (i4 | i3);
                cca_continue = i5 % 128;
                int i6 = i5 % 2;
                ChallengeNativeView.init(ChallengeNativeView.this, settransitionvisibility);
                ChallengeNativeView.CardinalUiType(ChallengeNativeView.this);
                int i7 = cca_continue;
                int i8 = ((i7 | 1) << 1) - (i7 ^ 1);
                configure = i8 % 128;
                if ((i8 % 2 == 0 ? '_' : 'I') != 'I') {
                    Throwable th = null;
                    super.hashCode();
                    throw th;
                }
            }
        });
        int i = setUiType;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        setRenderType = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void configure() {
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.NATIVE_CHALLENGE_EVENT, new StringBuilder("Activity closed: ").append(this.getProxyAddress).toString(), (String) null);
        getSDKVersion();
        finishAndRemoveTask();
        int i = setRenderType;
        int i2 = ((i ^ 123) - (~(-(-((i & 123) << 1))))) - 1;
        setUiType = i2 % 128;
        int i3 = i2 % 2;
    }

    private void onValidated() {
        this.CardinalRenderType.setCCAOnClickListener(new setZ.Cardinal() {
            private static int cca_continue = 1;
            private static int getInstance;

            public final void onClick(View view) {
                int i = getInstance;
                int i2 = (i ^ 71) + ((i & 71) << 1);
                cca_continue = i2 % 128;
                int i3 = i2 % 2;
                if (ChallengeNativeView.getActionCode(ChallengeNativeView.this).getVisibility() == 0) {
                    int i4 = cca_continue;
                    int i5 = i4 & 35;
                    int i6 = (i4 | 35) & (~i5);
                    int i7 = i5 << 1;
                    int i8 = (i6 & i7) + (i6 | i7);
                    getInstance = i8 % 128;
                    int i9 = i8 % 2;
                    ChallengeNativeView.getActionCode(ChallengeNativeView.this).setVisibility(8);
                    ChallengeNativeView.CardinalActionCode(ChallengeNativeView.this).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.plus, 0);
                    int i10 = (cca_continue + 112) - 1;
                    getInstance = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
                ChallengeNativeView.getActionCode(ChallengeNativeView.this).setVisibility(0);
                ChallengeNativeView.CardinalActionCode(ChallengeNativeView.this).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.minus, 0);
                int i12 = getInstance;
                int i13 = (i12 & 93) + (i12 | 93);
                cca_continue = i13 % 128;
                int i14 = i13 % 2;
            }
        });
        setVerticalFadingEdgeEnabled.getInstance(this.CardinalRenderType, this.CardinalUiType, this);
        int i = setUiType;
        int i2 = i ^ 67;
        int i3 = ((i & 67) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        setRenderType = i5 % 128;
        if ((i5 % 2 != 0 ? 31 : 'L') != 'L') {
            int i6 = 25 / 0;
        }
    }

    private void getWarnings() {
        this.CardinalError.setCCAOnClickListener(new setZ.Cardinal() {
            private static int Cardinal = 0;
            private static int init = 1;

            public final void onClick(View view) {
                int i = Cardinal;
                int i2 = i & 79;
                int i3 = ((i ^ 79) | i2) << 1;
                int i4 = -((i | 79) & (~i2));
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                init = i5 % 128;
                int i6 = i5 % 2;
                if (!(ChallengeNativeView.CardinalConfigurationParameters(ChallengeNativeView.this).getVisibility() == 0)) {
                    ChallengeNativeView.CardinalConfigurationParameters(ChallengeNativeView.this).setVisibility(0);
                    ChallengeNativeView.setRequestTimeout(ChallengeNativeView.this).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.minus, 0);
                    int i7 = init;
                    int i8 = (i7 ^ 113) + ((i7 & 113) << 1);
                    Cardinal = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
                int i10 = init;
                int i11 = (i10 ^ 18) + ((i10 & 18) << 1);
                int i12 = ((i11 | -1) << 1) - (i11 ^ -1);
                Cardinal = i12 % 128;
                if ((i12 % 2 != 0 ? 'N' : '!') != 'N') {
                    ChallengeNativeView.CardinalConfigurationParameters(ChallengeNativeView.this).setVisibility(8);
                    ChallengeNativeView.setRequestTimeout(ChallengeNativeView.this).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.plus, 0);
                    return;
                }
                ChallengeNativeView.CardinalConfigurationParameters(ChallengeNativeView.this).setVisibility(27);
                ChallengeNativeView.setRequestTimeout(ChallengeNativeView.this).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.plus, 1);
            }
        });
        setVerticalFadingEdgeEnabled.getInstance(this.CardinalError, this.CardinalUiType, this);
        int i = setRenderType + 111;
        setUiType = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if ((r4.getProxyAddress.equals("01")) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if ((r4.getProxyAddress.equals("01") ? 'O' : 'M') != 'M') goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onCReqSuccess() {
        /*
            r4 = this;
            int r0 = setRenderType
            r1 = r0 | 115(0x73, float:1.61E-43)
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 115(0x73, float:1.61E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            setUiType = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            java.lang.String r3 = "01"
            if (r1 == r2) goto L_0x002c
            java.lang.String r1 = r4.getProxyAddress
            boolean r1 = r1.equals(r3)
            r3 = 27
            int r3 = r3 / r0
            if (r1 == 0) goto L_0x0026
            r1 = r2
            goto L_0x0027
        L_0x0026:
            r1 = r0
        L_0x0027:
            if (r1 == 0) goto L_0x006d
            goto L_0x003c
        L_0x002a:
            r0 = move-exception
            throw r0
        L_0x002c:
            java.lang.String r1 = r4.getProxyAddress
            boolean r1 = r1.equals(r3)
            r3 = 77
            if (r1 == 0) goto L_0x0039
            r1 = 79
            goto L_0x003a
        L_0x0039:
            r1 = r3
        L_0x003a:
            if (r1 == r3) goto L_0x006d
        L_0x003c:
            com.cardinalcommerce.a.setTransitionVisibility r1 = r4.getString
            java.lang.String r1 = r1.getActionCode()
            java.lang.String r3 = ""
            boolean r1 = r1.equals(r3)
            r3 = 59
            if (r1 != 0) goto L_0x004e
            r1 = r3
            goto L_0x004f
        L_0x004e:
            r1 = 7
        L_0x004f:
            if (r1 == r3) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            int r1 = setRenderType
            r3 = r1 & 29
            r1 = r1 ^ 29
            r1 = r1 | r3
            int r3 = r3 + r1
            int r1 = r3 % 128
            setUiType = r1
            int r3 = r3 % 2
            r1 = 93
            if (r3 != 0) goto L_0x0066
            r3 = r1
            goto L_0x0068
        L_0x0066:
            r3 = 24
        L_0x0068:
            if (r3 == r1) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r2 = r0
        L_0x006c:
            return r2
        L_0x006d:
            int r1 = setUiType
            r3 = r1 & 65
            r1 = r1 ^ 65
            r1 = r1 | r3
            int r1 = ~r1
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            setRenderType = r1
            int r3 = r3 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.onCReqSuccess():boolean");
    }

    private boolean CardinalRenderType() {
        int i = setRenderType;
        int i2 = (((i & -2) | ((~i) & 1)) - (~((i & 1) << 1))) - 1;
        setUiType = i2 % 128;
        int i3 = i2 % 2;
        boolean equalsIgnoreCase = this.getString.CardinalChallengeObserver().equalsIgnoreCase(ThreeDSStrings.DEFAULT_VALUE_MESSAGE_VERSION);
        int i4 = setUiType;
        int i5 = ((i4 | 103) << 1) - (i4 ^ 103);
        setRenderType = i5 % 128;
        if ((i5 % 2 != 0 ? 'X' : 29) != 'X') {
            return equalsIgnoreCase;
        }
        int i6 = 57 / 0;
        return equalsIgnoreCase;
    }

    private boolean values() {
        boolean z;
        int i = setUiType;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        setRenderType = i2 % 128;
        if ((i2 % 2 != 0 ? 'F' : '@') != 'F') {
            z = this.getString.CardinalChallengeObserver().equalsIgnoreCase("2.1.0");
        } else {
            z = this.getString.CardinalChallengeObserver().equalsIgnoreCase("2.1.0");
            int i3 = 45 / 0;
        }
        int i4 = setRenderType;
        int i5 = ((i4 & 39) - (~(-(-(i4 | 39))))) - 1;
        setUiType = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
