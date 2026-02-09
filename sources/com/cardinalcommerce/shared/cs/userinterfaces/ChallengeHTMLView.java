package com.cardinalcommerce.shared.cs.userinterfaces;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.cardinalcommerce.a.setAccessibilityLiveRegion;
import com.cardinalcommerce.a.setAlpha;
import com.cardinalcommerce.a.setAnimationMatrix;
import com.cardinalcommerce.a.setFocusedByDefault;
import com.cardinalcommerce.a.setHorizontalScrollBarEnabled;
import com.cardinalcommerce.a.setHovered;
import com.cardinalcommerce.a.setScrollbarFadingEnabled;
import com.cardinalcommerce.a.setTransitionVisibility;
import com.cardinalcommerce.a.setTranslationY;
import com.cardinalcommerce.a.setVerticalFadingEdgeEnabled;
import com.cardinalcommerce.a.setZ;
import com.cardinalcommerce.cardinalmobilesdk.R;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ChallengeHTMLView extends AppCompatActivity implements setFocusedByDefault {
    private static int cleanup = 0;
    private static int getWarnings = 1;
    private boolean Cardinal = false;
    private ProgressBar cca_continue;
    private boolean configure;
    private setTransitionVisibility getInstance;
    private WebView init;
    private BroadcastReceiver onCReqSuccess = new BroadcastReceiver() {
        private static int Cardinal = 0;
        private static int getInstance = 1;

        public final void onReceive(Context context, Intent intent) {
            int i = (Cardinal + 27) - 1;
            int i2 = (i & -1) + (i | -1);
            getInstance = i2 % 128;
            if ((i2 % 2 == 0 ? '4' : '6') == '6') {
                String action = intent.getAction();
                if (action.equals(ThreeDSStrings.FINISH_ACTIVITY)) {
                    setAlpha.cca_continue(ChallengeHTMLView.this.getApplicationContext()).init();
                    ChallengeHTMLView.this.finish();
                    int i3 = Cardinal;
                    int i4 = i3 ^ 85;
                    int i5 = (i3 & 85) << 1;
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    getInstance = i6 % 128;
                    int i7 = i6 % 2;
                }
                if (!(!action.equals(ThreeDSStrings.CHALLENGE_TIMEOUT_ACTIVITY))) {
                    int i8 = Cardinal;
                    int i9 = (((i8 & -56) | ((~i8) & 55)) - (~((i8 & 55) << 1))) - 1;
                    getInstance = i9 % 128;
                    int i10 = i9 % 2;
                    ChallengeHTMLView.this.setResult(0);
                    ChallengeHTMLView.this.finish();
                    int i11 = getInstance;
                    int i12 = i11 ^ 75;
                    int i13 = -(-((i11 & 75) << 1));
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    Cardinal = i14 % 128;
                    int i15 = i14 % 2;
                }
                int i16 = getInstance;
                int i17 = (i16 & 64) + (i16 | 64);
                int i18 = (i17 ^ -1) + ((i17 & -1) << 1);
                Cardinal = i18 % 128;
                if ((i18 % 2 != 0 ? '\"' : '_') == '\"') {
                    int i19 = 74 / 0;
                    return;
                }
                return;
            }
            intent.getAction().equals(ThreeDSStrings.FINISH_ACTIVITY);
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    };

    static /* synthetic */ WebView Cardinal(ChallengeHTMLView challengeHTMLView) {
        int i = getWarnings;
        int i2 = i & 13;
        int i3 = (i ^ 13) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        cleanup = i4 % 128;
        char c = i4 % 2 != 0 ? '2' : 'C';
        WebView webView = challengeHTMLView.init;
        if (c == '2') {
            int i5 = 25 / 0;
        }
        int i6 = (i & 50) + (i | 50);
        int i7 = ((i6 | -1) << 1) - (i6 ^ -1);
        cleanup = i7 % 128;
        int i8 = i7 % 2;
        return webView;
    }

    static /* synthetic */ void cca_continue(ChallengeHTMLView challengeHTMLView) {
        int i = cleanup;
        int i2 = i & 49;
        int i3 = (i2 - (~((i ^ 49) | i2))) - 1;
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        challengeHTMLView.getSDKVersion();
        int i5 = cleanup;
        int i6 = i5 & 3;
        int i7 = ((((i5 ^ 3) | i6) << 1) - (~(-((i5 | 3) & (~i6))))) - 1;
        getWarnings = i7 % 128;
        if ((i7 % 2 == 0 ? 'N' : '2') == 'N') {
            int i8 = 3 / 0;
        }
    }

    static /* synthetic */ void cca_continue(ChallengeHTMLView challengeHTMLView, setTransitionVisibility settransitionvisibility) {
        int i = getWarnings;
        int i2 = i | 47;
        int i3 = i2 << 1;
        int i4 = -((~(i & 47)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        cleanup = i5 % 128;
        boolean z = i5 % 2 == 0;
        challengeHTMLView.Cardinal(settransitionvisibility);
        if (z) {
            int i6 = cleanup;
            int i7 = i6 ^ 113;
            int i8 = (((i6 & 113) | i7) << 1) - i7;
            getWarnings = i8 % 128;
            if ((i8 % 2 == 0 ? 13 : 'N') != 'N') {
                throw null;
            }
            return;
        }
        throw null;
    }

    static /* synthetic */ void getInstance(ChallengeHTMLView challengeHTMLView) {
        boolean z = true;
        int i = (getWarnings + 8) - 1;
        cleanup = i % 128;
        boolean z2 = i % 2 == 0;
        challengeHTMLView.getInstance();
        if (!z2) {
            int i2 = 98 / 0;
        }
        int i3 = (getWarnings + 4) - 1;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    static /* synthetic */ ProgressBar init(ChallengeHTMLView challengeHTMLView) {
        int i = cleanup;
        int i2 = (i & -58) | ((~i) & 57);
        int i3 = -(-((i & 57) << 1));
        int i4 = (i2 & i3) + (i2 | i3);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        ProgressBar progressBar = challengeHTMLView.cca_continue;
        int i6 = i & 73;
        int i7 = -(-((i ^ 73) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        getWarnings = i8 % 128;
        if ((i8 % 2 == 0 ? 'F' : 'U') == 'U') {
            return progressBar;
        }
        int i9 = 12 / 0;
        return progressBar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        BroadcastReceiver broadcastReceiver;
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ThreeDSStrings.FINISH_ACTIVITY);
        intentFilter.addAction(ThreeDSStrings.CHALLENGE_TIMEOUT_ACTIVITY);
        if (!(Build.VERSION.SDK_INT >= 34)) {
            registerReceiver(this.onCReqSuccess, intentFilter);
            int i2 = getWarnings;
            int i3 = i2 & 125;
            int i4 = -(-((i2 ^ 125) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            cleanup = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = cleanup;
            int i8 = (i7 | 5) << 1;
            int i9 = -(i7 ^ 5);
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            getWarnings = i10 % 128;
            if ((i10 % 2 == 0 ? '2' : 'B') != '2') {
                broadcastReceiver = this.onCReqSuccess;
                i = 4;
            } else {
                broadcastReceiver = this.onCReqSuccess;
                i = 3;
            }
            registerReceiver(broadcastReceiver, intentFilter, i);
        }
        if ((ThreeDSStrings.IS_EXTERNAL_BUILD ? 'M' : 30) != 30) {
            int i11 = cleanup;
            int i12 = (i11 & 41) + (i11 | 41);
            getWarnings = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 11 : 22) != 11) {
                getWindow().setFlags(8192, 8192);
            } else {
                getWindow().setFlags(24444, 24825);
            }
        }
        this.getInstance = (setTransitionVisibility) ((Bundle) Objects.requireNonNull(getIntent().getExtras())).getSerializable(ThreeDSStrings.STEP_UP_DATA_EVENT);
        UiCustomization uiCustomization = (UiCustomization) getIntent().getExtras().getSerializable("UiCustomization");
        this.configure = getIntent().getBooleanExtra(ThreeDSStrings.ACTIVITY_OBSERVER_DRIVEN, false);
        setContentView(R.layout.activity_html_ui_view);
        setAnimationMatrix setanimationmatrix = (setAnimationMatrix) findViewById(R.id.toolbarButton);
        setanimationmatrix.setCCAOnClickListener(new setZ.Cardinal() {
            private static int cca_continue = 0;
            private static int init = 1;

            public final void onClick(View view) {
                int i = cca_continue;
                int i2 = i & 115;
                int i3 = ((i ^ 115) | i2) << 1;
                int i4 = -((i | 115) & (~i2));
                int i5 = (i3 & i4) + (i4 | i3);
                init = i5 % 128;
                int i6 = i5 % 2;
                setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Cancel pressed", (String) null);
                ChallengeHTMLView.getInstance(ChallengeHTMLView.this);
                int i7 = init;
                int i8 = (i7 ^ 28) + ((i7 & 28) << 1);
                int i9 = (i8 ^ -1) + ((i8 & -1) << 1);
                cca_continue = i9 % 128;
                if ((i9 % 2 != 0 ? 'U' : 'V') != 'V') {
                    throw null;
                }
            }
        });
        this.cca_continue = (ProgressBar) findViewById(R.id.pbHeaderProgress);
        WebView webView = (WebView) findViewById(R.id.webviewUi);
        this.init = webView;
        webView.getSettings().setJavaScriptEnabled(false);
        this.init.setWebViewClient(new WebViewClient() {
            private static int Cardinal = 0;
            private static int init = 1;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
                if ((!r5.isEmpty() ? true : true) != true) goto L_0x005a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                if ((!r5.isEmpty() ? 'D' : '?') != 'D') goto L_0x005a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    int r4 = init
                    r0 = r4 & 7
                    int r1 = ~r0
                    r4 = r4 | 7
                    r4 = r4 & r1
                    r1 = 1
                    int r0 = r0 << r1
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0
                    int r4 = r4 - r0
                    int r4 = r4 - r1
                    int r0 = r4 % 128
                    Cardinal = r0
                    int r4 = r4 % 2
                    r0 = 82
                    if (r4 == 0) goto L_0x001b
                    r4 = r0
                    goto L_0x001c
                L_0x001b:
                    r4 = 4
                L_0x001c:
                    r2 = 0
                    if (r4 == r0) goto L_0x002d
                    boolean r4 = r5.isEmpty()
                    r0 = 20
                    if (r4 != 0) goto L_0x0029
                    r4 = r0
                    goto L_0x002a
                L_0x0029:
                    r4 = r1
                L_0x002a:
                    if (r4 == r0) goto L_0x003f
                    goto L_0x005a
                L_0x002d:
                    boolean r4 = r5.isEmpty()
                    r0 = 14
                    int r0 = r0 / r2
                    r0 = 68
                    if (r4 != 0) goto L_0x003a
                    r4 = r0
                    goto L_0x003c
                L_0x003a:
                    r4 = 63
                L_0x003c:
                    if (r4 == r0) goto L_0x003f
                    goto L_0x005a
                L_0x003f:
                    android.net.Uri r4 = android.net.Uri.parse(r5)
                    com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView r5 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView.this
                    r5.init((android.net.Uri) r4)
                    int r4 = init
                    r5 = r4 & 43
                    r4 = r4 ^ 43
                    r4 = r4 | r5
                    r0 = r5 | r4
                    int r0 = r0 << r1
                    r4 = r4 ^ r5
                    int r0 = r0 - r4
                    int r4 = r0 % 128
                    Cardinal = r4
                    int r0 = r0 % 2
                L_0x005a:
                    int r4 = Cardinal
                    int r4 = r4 + 50
                    r5 = r4 ^ -1
                    r4 = r4 & -1
                    int r4 = r4 << r1
                    int r5 = r5 + r4
                    int r4 = r5 % 128
                    init = r4
                    int r5 = r5 % 2
                    return r2
                L_0x006b:
                    r4 = move-exception
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView.AnonymousClass4.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }
        });
        Cardinal(this.getInstance);
        setVerticalFadingEdgeEnabled.init(setanimationmatrix, uiCustomization, (Activity) this);
        setVerticalFadingEdgeEnabled.Cardinal((Toolbar) findViewById(R.id.toolbar), uiCustomization, (Activity) this);
        int i13 = cleanup;
        int i14 = i13 & 41;
        int i15 = ((i13 | 41) & (~i14)) + (i14 << 1);
        getWarnings = i15 % 128;
        int i16 = i15 % 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if ((r6.Cardinal ? '5' : 'M') != 'M') goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0 != true) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            int r0 = cleanup
            r1 = r0 | 43
            int r2 = r1 << 1
            r0 = r0 & 43
            int r0 = ~r0
            r0 = r0 & r1
            int r0 = -r0
            r1 = r2 & r0
            r0 = r0 | r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            getWarnings = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x001b
            r1 = r0
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r3 = 0
            java.lang.String r4 = "Challenge Screen back to foreground"
            java.lang.String r5 = "HTML Challenge Screen"
            if (r1 == 0) goto L_0x0033
            com.cardinalcommerce.a.setTranslationY r1 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            r1.cca_continue(r5, r4, r3)
            boolean r1 = r6.Cardinal
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 == r2) goto L_0x005e
            goto L_0x0049
        L_0x0033:
            com.cardinalcommerce.a.setTranslationY r1 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            r1.cca_continue(r5, r4, r3)
            boolean r1 = r6.Cardinal
            r3 = 46
            int r3 = r3 / r0
            r0 = 77
            if (r1 == 0) goto L_0x0046
            r1 = 53
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            if (r1 == r0) goto L_0x005e
        L_0x0049:
            r6.init()
            int r0 = getWarnings
            r1 = r0 & 11
            int r3 = ~r1
            r0 = r0 | 11
            r0 = r0 & r3
            int r1 = r1 << r2
            int r1 = ~r1
            int r0 = r0 - r1
            int r0 = r0 - r2
            int r1 = r0 % 128
            cleanup = r1
            int r0 = r0 % 2
        L_0x005e:
            super.onResume()
            int r0 = getWarnings
            r1 = r0 ^ 85
            r3 = r0 & 85
            r1 = r1 | r3
            int r1 = r1 << r2
            r3 = r0 & -86
            int r0 = ~r0
            r0 = r0 & 85
            r0 = r0 | r3
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            return
        L_0x007a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        int i = cleanup;
        int i2 = (((i ^ 8) + ((i & 8) << 1)) + 0) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Activity closed", (String) null);
        unregisterReceiver(this.onCReqSuccess);
        setAlpha.cca_continue(this).cca_continue();
        super.onDestroy();
        int i4 = getWarnings;
        int i5 = i4 & 65;
        int i6 = (i4 | 65) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        cleanup = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* access modifiers changed from: package-private */
    public final void init(Uri uri) {
        new Handler(getMainLooper()).post(new Runnable() {
            private static int cca_continue = 0;
            private static int getInstance = 1;

            public final void run() {
                int i = getInstance;
                boolean z = true;
                int i2 = (((i | 18) << 1) - (i ^ 18)) - 1;
                cca_continue = i2 % 128;
                if (i2 % 2 != 0) {
                    z = false;
                }
                ChallengeHTMLView.Cardinal(ChallengeHTMLView.this).stopLoading();
                if (!z) {
                    Throwable th = null;
                    super.hashCode();
                    throw th;
                }
            }
        });
        boolean z = false;
        ? r3 = 0;
        if (uri.isHierarchical()) {
            int i = getWarnings;
            int i2 = i & 21;
            int i3 = (i | 21) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            cleanup = i5 % 128;
            int i6 = i5 % 2;
            if (!uri.toString().contains("data:text/html")) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = queryParameterNames.iterator();
                int i7 = getWarnings;
                int i8 = i7 & 47;
                int i9 = ((i7 ^ 47) | i8) << 1;
                int i10 = -((i7 | 47) & (~i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                cleanup = i11 % 128;
                int i12 = i11 % 2;
                while (true) {
                    if ((it.hasNext() ? 30 : '4') != 30) {
                        cca_continue(setHorizontalScrollBarEnabled.configure(sb.toString()));
                        int i13 = getWarnings;
                        int i14 = i13 & 27;
                        int i15 = (i13 | 27) & (~i14);
                        int i16 = i14 << 1;
                        int i17 = (i15 & i16) + (i15 | i16);
                        cleanup = i17 % 128;
                        if ((i17 % 2 != 0 ? '3' : '*') == '3') {
                            throw r3;
                        }
                        return;
                    }
                    int i18 = getWarnings;
                    int i19 = i18 & 83;
                    int i20 = -(-((i18 ^ 83) | i19));
                    int i21 = (i19 & i20) + (i20 | i19);
                    cleanup = i21 % 128;
                    int i22 = i21 % 2;
                    String next = it.next();
                    if (!(sb.toString().isEmpty())) {
                        int i23 = cleanup;
                        int i24 = i23 & 107;
                        int i25 = ((((i23 ^ 107) | i24) << 1) - (~(-((i23 | 107) & (~i24))))) - 1;
                        getWarnings = i25 % 128;
                        if ((i25 % 2 == 0 ? 10 : '1') != 10) {
                            sb.append("&");
                            int i26 = (getWarnings + 72) - 1;
                            cleanup = i26 % 128;
                            int i27 = i26 % 2;
                        } else {
                            sb.append("&");
                            super.hashCode();
                            throw r3;
                        }
                    }
                    try {
                        sb.append(setScrollbarFadingEnabled.onValidated(next)).append("=").append(setScrollbarFadingEnabled.onValidated(uri.getQueryParameter(next)));
                        int i28 = cleanup;
                        int i29 = i28 & 1;
                        int i30 = ((i28 | 1) & (~i29)) + (i29 << 1);
                        getWarnings = i30 % 128;
                        int i31 = i30 % 2;
                    } catch (UnsupportedEncodingException unused) {
                        Cardinal();
                    }
                }
            }
            int i32 = getWarnings;
            int i33 = i32 ^ 9;
            int i34 = ((i32 & 9) | i33) << 1;
            int i35 = -i33;
            int i36 = (i34 & i35) + (i34 | i35);
            cleanup = i36 % 128;
            int i37 = i36 % 2;
            return;
        }
        setTranslationY.cca_continue().configure("10616", ThreeDSStrings.HTML_CHALLENGE_NON_HIERARCHICAL_URI, (String) r3);
        Cardinal();
        int i38 = cleanup;
        int i39 = ((i38 | 57) << 1) - (((~i38) & 57) | (i38 & -58));
        getWarnings = i39 % 128;
        if (i39 % 2 != 0) {
            z = true;
        }
        if (!z) {
            super.hashCode();
            throw r3;
        }
    }

    private void init() {
        int i = cleanup;
        int i2 = ((((i ^ 13) | (i & 13)) << 1) - (~(-(((~i) & 13) | (i & -14))))) - 1;
        getWarnings = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            String instance = this.getInstance.getInstance();
            if (!instance.equalsIgnoreCase("")) {
                String str = new String(Base64.decode(instance, 8), StandardCharsets.UTF_8);
                if (str.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    int i3 = getWarnings;
                    int i4 = i3 & 103;
                    int i5 = (i3 | 103) & (~i4);
                    int i6 = i4 << 1;
                    int i7 = (i5 & i6) + (i5 | i6);
                    cleanup = i7 % 128;
                    int i8 = i7 % 2;
                    this.init.loadDataWithBaseURL("HTTPS://EMV3DS/challenge/refresh", str, "text/html", "UTF-8", (String) null);
                    int i9 = cleanup;
                    int i10 = i9 ^ 67;
                    int i11 = ((((i9 & 67) | i10) << 1) - (~(-i10))) - 1;
                    getWarnings = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            int i13 = cleanup;
            int i14 = i13 & 89;
            int i15 = ((((i13 ^ 89) | i14) << 1) - (~(-((i13 | 89) & (~i14))))) - 1;
            getWarnings = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        this.getInstance.getInstance().equalsIgnoreCase("");
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        int i = getWarnings;
        int i2 = (i & 89) + (i | 89);
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
        }
        this.Cardinal = true;
        super.onPause();
    }

    private void cca_continue(char[] cArr) {
        setHovered sethovered = new setHovered();
        sethovered.getInstance(cArr);
        cca_continue(new setAccessibilityLiveRegion(this.getInstance, sethovered));
        int i = cleanup;
        int i2 = i & 57;
        int i3 = i | 57;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getWarnings = i4 % 128;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
    }

    private void cca_continue(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = cleanup;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        int i3 = i2 % 128;
        getWarnings = i3;
        if (i2 % 2 != 0) {
            if ((this.configure ? 19 : 'L') != 19) {
                init(setaccessibilityliveregion);
                int i4 = cleanup;
                int i5 = i4 & 75;
                int i6 = i5 + ((i4 ^ 75) | i5);
                getWarnings = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = (i3 ^ 17) + ((i3 & 17) << 1);
            cleanup = i8 % 128;
            int i9 = i8 % 2;
            getInstance(setaccessibilityliveregion);
            int i10 = getWarnings;
            int i11 = ((i10 | 50) << 1) - (i10 ^ 50);
            int i12 = (i11 ^ -1) + ((i11 & -1) << 1);
            cleanup = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void getInstance(setAccessibilityLiveRegion setaccessibilityliveregion) {
        Intent intent = new Intent();
        intent.putExtra(ThreeDSStrings.CCA_CREQ, setaccessibilityliveregion);
        setResult(-1, intent);
        finish();
        int i = cleanup;
        int i2 = ((((i ^ 33) | (i & 33)) << 1) - (~(-(((~i) & 33) | (i & -34))))) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
    }

    private void init(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = (cleanup + 122) - 1;
        getWarnings = i % 128;
        if (!(i % 2 != 0)) {
            cca_continue();
            setAlpha.cca_continue(getApplicationContext()).Cardinal(setaccessibilityliveregion, this, ThreeDSStrings.RENDER_TYPE_HTML);
            int i2 = 77 / 0;
        } else {
            cca_continue();
            setAlpha.cca_continue(getApplicationContext()).Cardinal(setaccessibilityliveregion, this, ThreeDSStrings.RENDER_TYPE_HTML);
        }
        int i3 = getWarnings;
        int i4 = i3 & 3;
        int i5 = ((((i3 ^ 3) | i4) << 1) - (~(-((i3 | 3) & (~i4))))) - 1;
        cleanup = i5 % 128;
        int i6 = i5 % 2;
    }

    private void getInstance() {
        setHovered sethovered = new setHovered();
        sethovered.Cardinal(ThreeDSStrings.CHALLENGE_CANCEL_CHAR);
        cca_continue(new setAccessibilityLiveRegion(this.getInstance, sethovered));
        int i = getWarnings;
        int i2 = i & 89;
        int i3 = -(-((i ^ 89) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    private void Cardinal() {
        setHovered sethovered = new setHovered();
        sethovered.Cardinal(ThreeDSStrings.CHALLENGE_CANCEL_ERROR);
        cca_continue(new setAccessibilityLiveRegion(this.getInstance, sethovered));
        int i = cleanup;
        boolean z = true;
        int i2 = ((((i ^ 95) | (i & 95)) << 1) - (~(-(((~i) & 95) | (i & -96))))) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        if (z) {
            throw null;
        }
    }

    private void cca_continue() {
        runOnUiThread(new Runnable() {
            private static int Cardinal = 1;
            private static int init;

            public final void run() {
                boolean z = true;
                int i = (Cardinal + 13) - 1;
                int i2 = (i ^ -1) + ((i & -1) << 1);
                init = i2 % 128;
                int i3 = i2 % 2;
                ChallengeHTMLView.init(ChallengeHTMLView.this).setVisibility(0);
                ChallengeHTMLView.this.getWindow().setFlags(16, 16);
                int i4 = init;
                int i5 = (i4 ^ 3) + ((i4 & 3) << 1);
                Cardinal = i5 % 128;
                if (i5 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    Throwable th = null;
                    super.hashCode();
                    throw th;
                }
            }
        });
        int i = getWarnings;
        int i2 = i & 99;
        int i3 = ((i ^ 99) | i2) << 1;
        int i4 = -((i | 99) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        cleanup = i5 % 128;
        if (!(i5 % 2 == 0)) {
            int i6 = 56 / 0;
        }
    }

    private void getSDKVersion() {
        runOnUiThread(new Runnable() {
            private static int Cardinal = 1;
            private static int cca_continue;

            public final void run() {
                int i = cca_continue;
                int i2 = (((i ^ 98) + ((i & 98) << 1)) + 0) - 1;
                Cardinal = i2 % 128;
                int i3 = i2 % 2;
                ChallengeHTMLView.init(ChallengeHTMLView.this).setVisibility(8);
                ChallengeHTMLView.this.getWindow().clearFlags(16);
                int i4 = (Cardinal + 114) - 1;
                cca_continue = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i = cleanup;
        int i2 = i & 125;
        int i3 = ((i ^ 125) | i2) << 1;
        int i4 = -((i | 125) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getWarnings = i5 % 128;
        if ((i5 % 2 == 0 ? 19 : 'B') == 19) {
            throw null;
        }
    }

    public final void configure(final setTransitionVisibility settransitionvisibility) {
        runOnUiThread(new Runnable() {
            private static int cca_continue = 1;
            private static int configure;

            public final void run() {
                int i = configure + 5;
                cca_continue = i % 128;
                int i2 = i % 2;
                ChallengeHTMLView.cca_continue(ChallengeHTMLView.this, settransitionvisibility);
                ChallengeHTMLView.cca_continue(ChallengeHTMLView.this);
                int i3 = cca_continue;
                int i4 = i3 ^ 75;
                int i5 = -(-((i3 & 75) << 1));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                configure = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i = getWarnings;
        int i2 = i ^ 41;
        boolean z = true;
        int i3 = (((i & 41) | i2) << 1) - i2;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    private void Cardinal(setTransitionVisibility settransitionvisibility) {
        String replaceAll = new String(Base64.decode(settransitionvisibility.cca_continue(), 8), StandardCharsets.UTF_8).replaceAll("\"POST\"", "\"GET\"").replaceAll("\"post\"", "\"get\"").replaceAll("<input type=\"submit\"", "<input type=\"submit\" name=\"submit\"");
        if ((!replaceAll.isEmpty() ? (char) 30 : 10) == 30) {
            int i = getWarnings;
            int i2 = ((i & -122) | ((~i) & 121)) + ((i & 121) << 1);
            cleanup = i2 % 128;
            int i3 = i2 % 2;
            this.init.loadDataWithBaseURL("HTTPS://EMV3DS/challenge", replaceAll, "text/html", "UTF-8", (String) null);
            int i4 = getWarnings;
            int i5 = ((i4 & 25) - (~(-(-(i4 | 25))))) - 1;
            cleanup = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = cleanup;
        int i8 = (i7 ^ 68) + ((i7 & 68) << 1);
        int i9 = (i8 ^ -1) + ((i8 & -1) << 1);
        getWarnings = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void configure() {
        int i = cleanup;
        boolean z = true;
        int i2 = (i ^ 86) + ((i & 86) << 1);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (z) {
            setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Activity closed", (String) null);
            getSDKVersion();
            finishAndRemoveTask();
            int i4 = 88 / 0;
        } else {
            setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Activity closed", (String) null);
            getSDKVersion();
            finishAndRemoveTask();
        }
        int i5 = cleanup;
        int i6 = (i5 & 75) + (i5 | 75);
        getWarnings = i6 % 128;
        if ((i6 % 2 == 0 ? (char) 22 : 24) != 24) {
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public void onBackPressed() {
        int i = cleanup;
        int i2 = i & 5;
        int i3 = ((i ^ 5) | i2) << 1;
        int i4 = -((i | 5) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getWarnings = i5 % 128;
        ? r4 = 0;
        if ((i5 % 2 == 0 ? 15 : 'F') != 15) {
            setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Back button pressed", r4);
            getSDKVersion();
            getInstance();
            return;
        }
        setTranslationY.cca_continue().cca_continue(ThreeDSStrings.HTML_CHALLENGE_EVENT, "Back button pressed", r4);
        getSDKVersion();
        getInstance();
        super.hashCode();
        throw r4;
    }
}
