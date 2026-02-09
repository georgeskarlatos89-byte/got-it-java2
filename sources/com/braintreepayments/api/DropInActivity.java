package com.braintreepayments.api;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.braintreepayments.api.dropin.R;
import java.util.List;

public class DropInActivity extends AppCompatActivity {
    private static final String ADD_CARD_TAG = "ADD_CARD";
    private static final String BOTTOM_SHEET_TAG = "BOTTOM_SHEET";
    private static final String CARD_DETAILS_TAG = "CARD_DETAILS";
    AlertPresenter alertPresenter;
    DropInInternalClient dropInInternalClient;
    DropInRequest dropInRequest;
    DropInViewModel dropInViewModel;
    private FragmentContainerView fragmentContainerView;
    DropInResult pendingDropInResult;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (willDeliverSuccessfulBrowserSwitchResult()) {
            this.dropInViewModel.setDropInState(DropInState.WILL_FINISH);
        }
        this.dropInInternalClient.deliverBrowserSwitchResult(this, new DropInActivity$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bt_drop_in_activity);
        Intent intent = getIntent();
        Exception exc = (Exception) intent.getSerializableExtra("com.braintreepayments.api.EXTRA_AUTHORIZATION_ERROR");
        if (exc != null) {
            finishDropInWithError(exc);
            return;
        }
        if (this.dropInInternalClient == null) {
            this.dropInInternalClient = new DropInInternalClient(this, intent.getStringExtra("com.braintreepayments.api.EXTRA_AUTHORIZATION"), intent.getStringExtra("com.braintreepayments.api.EXTRA_SESSION_ID"), getDropInRequest(intent));
        }
        this.alertPresenter = new AlertPresenter();
        this.dropInRequest = getDropInRequest(getIntent());
        this.dropInViewModel = (DropInViewModel) new ViewModelProvider(this).get(DropInViewModel.class);
        this.fragmentContainerView = (FragmentContainerView) findViewById(R.id.fragment_container_view);
        getSupportFragmentManager().setFragmentResultListener("DROP_IN_EVENT_REQUEST_KEY", this, new DropInActivity$$ExternalSyntheticLambda9(this));
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            public void handleOnBackPressed() {
                DropInActivity.this.dropInViewModel.setBottomSheetState(BottomSheetState.HIDE_REQUESTED);
            }
        });
        this.dropInViewModel.getBottomSheetState().observe(this, new DropInActivity$$ExternalSyntheticLambda10(this));
        showBottomSheetIfNecessary();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$0$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m356lambda$onCreate$0$combraintreepaymentsapiDropInActivity(String str, Bundle bundle) {
        onDropInEvent(DropInEvent.fromBundle(bundle));
    }

    /* renamed from: com.braintreepayments.api.DropInActivity$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$BottomSheetState;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$DialogInteraction;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$DropInEventType;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$DropInExitTransition;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$DropInPaymentMethod;

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e8 */
        static {
            /*
                com.braintreepayments.api.BottomSheetState[] r0 = com.braintreepayments.api.BottomSheetState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$braintreepayments$api$BottomSheetState = r0
                r1 = 1
                com.braintreepayments.api.BottomSheetState r2 = com.braintreepayments.api.BottomSheetState.SHOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braintreepayments.api.BottomSheetState r3 = com.braintreepayments.api.BottomSheetState.HIDDEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.braintreepayments.api.BottomSheetState r4 = com.braintreepayments.api.BottomSheetState.HIDE_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.braintreepayments.api.BottomSheetState r5 = com.braintreepayments.api.BottomSheetState.SHOW_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.braintreepayments.api.DialogInteraction[] r4 = com.braintreepayments.api.DialogInteraction.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$braintreepayments$api$DialogInteraction = r4
                com.braintreepayments.api.DialogInteraction r5 = com.braintreepayments.api.DialogInteraction.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$com$braintreepayments$api$DialogInteraction     // Catch:{ NoSuchFieldError -> 0x004e }
                com.braintreepayments.api.DialogInteraction r5 = com.braintreepayments.api.DialogInteraction.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.braintreepayments.api.DropInExitTransition[] r4 = com.braintreepayments.api.DropInExitTransition.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$braintreepayments$api$DropInExitTransition = r4
                com.braintreepayments.api.DropInExitTransition r5 = com.braintreepayments.api.DropInExitTransition.NO_ANIMATION     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r4 = $SwitchMap$com$braintreepayments$api$DropInExitTransition     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.braintreepayments.api.DropInExitTransition r5 = com.braintreepayments.api.DropInExitTransition.FADE_OUT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                com.braintreepayments.api.DropInPaymentMethod[] r4 = com.braintreepayments.api.DropInPaymentMethod.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$braintreepayments$api$DropInPaymentMethod = r4
                com.braintreepayments.api.DropInPaymentMethod r5 = com.braintreepayments.api.DropInPaymentMethod.GOOGLE_PAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r4 = $SwitchMap$com$braintreepayments$api$DropInPaymentMethod     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.braintreepayments.api.DropInPaymentMethod r5 = com.braintreepayments.api.DropInPaymentMethod.PAYPAL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = $SwitchMap$com$braintreepayments$api$DropInPaymentMethod     // Catch:{ NoSuchFieldError -> 0x008e }
                com.braintreepayments.api.DropInPaymentMethod r5 = com.braintreepayments.api.DropInPaymentMethod.VENMO     // Catch:{ NoSuchFieldError -> 0x008e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r4 = $SwitchMap$com$braintreepayments$api$DropInPaymentMethod     // Catch:{ NoSuchFieldError -> 0x0098 }
                com.braintreepayments.api.DropInPaymentMethod r5 = com.braintreepayments.api.DropInPaymentMethod.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                com.braintreepayments.api.DropInEventType[] r4 = com.braintreepayments.api.DropInEventType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$braintreepayments$api$DropInEventType = r4
                com.braintreepayments.api.DropInEventType r5 = com.braintreepayments.api.DropInEventType.ADD_CARD_SUBMIT     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r1 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.braintreepayments.api.DropInEventType r4 = com.braintreepayments.api.DropInEventType.CARD_DETAILS_SUBMIT     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.DELETE_VAULTED_PAYMENT_METHOD     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.EDIT_CARD_NUMBER     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00d2 }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.SEND_ANALYTICS     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.SHOW_VAULT_MANAGER     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00e8 }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.SUPPORTED_PAYMENT_METHOD_SELECTED     // Catch:{ NoSuchFieldError -> 0x00e8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e8 }
            L_0x00e8:
                int[] r0 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x00f4 }
                com.braintreepayments.api.DropInEventType r1 = com.braintreepayments.api.DropInEventType.VAULTED_PAYMENT_METHOD_SELECTED     // Catch:{ NoSuchFieldError -> 0x00f4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f4 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f4 }
            L_0x00f4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.DropInActivity.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$1$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m357lambda$onCreate$1$combraintreepaymentsapiDropInActivity(BottomSheetState bottomSheetState) {
        int i = AnonymousClass3.$SwitchMap$com$braintreepayments$api$BottomSheetState[bottomSheetState.ordinal()];
        if (i == 1) {
            onDidShowBottomSheet();
        } else if (i == 2) {
            onDidHideBottomSheet();
        }
    }

    /* access modifiers changed from: package-private */
    public void finishDropInWithError(Exception exc) {
        setResult(1, new Intent().putExtra(DropInResult.EXTRA_ERROR, exc));
        finish();
    }

    private DropInRequest getDropInRequest(Intent intent) {
        Bundle bundle = (Bundle) intent.getParcelableExtra("com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST_BUNDLE");
        bundle.setClassLoader(DropInRequest.class.getClassLoader());
        return (DropInRequest) bundle.getParcelable("com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST");
    }

    /* access modifiers changed from: package-private */
    public void onDropInEvent(DropInEvent dropInEvent) {
        switch (AnonymousClass3.$SwitchMap$com$braintreepayments$api$DropInEventType[dropInEvent.getType().ordinal()]) {
            case 1:
                onAddCardSubmit(dropInEvent);
                return;
            case 2:
                onCardDetailsSubmit(dropInEvent);
                return;
            case 3:
                onDeleteVaultedPaymentMethod(dropInEvent);
                return;
            case 4:
                onEditCardNumber(dropInEvent);
                return;
            case 5:
                onSendAnalytics(dropInEvent);
                return;
            case 6:
                refreshVaultedPaymentMethods();
                return;
            case 7:
                onSupportedPaymentMethodSelected(dropInEvent);
                return;
            case 8:
                onVaultedPaymentMethodSelected(dropInEvent);
                return;
            default:
                return;
        }
    }

    private void onSupportedPaymentMethodSelected(DropInEvent dropInEvent) {
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            startPaymentFlow(dropInEvent.getDropInPaymentMethodType(DropInEventProperty.SUPPORTED_PAYMENT_METHOD));
        }
    }

    private void startPaymentFlow(DropInPaymentMethod dropInPaymentMethod) {
        int i = AnonymousClass3.$SwitchMap$com$braintreepayments$api$DropInPaymentMethod[dropInPaymentMethod.ordinal()];
        if (i == 1) {
            startGooglePayFlow();
        } else if (i == 2) {
            startPayPalFlow();
        } else if (i != 3) {
            prefetchSupportedCardTypes();
            startAddCardFlow((String) null);
        } else {
            startVenmoFlow();
        }
    }

    private void onDeleteVaultedPaymentMethod(DropInEvent dropInEvent) {
        deleteVaultedPaymentMethod(dropInEvent.getPaymentMethodNonce(DropInEventProperty.VAULTED_PAYMENT_METHOD));
    }

    private void deleteVaultedPaymentMethod(PaymentMethodNonce paymentMethodNonce) {
        this.alertPresenter.showConfirmNonceDeletionDialog(this, paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda15(this, paymentMethodNonce));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$deleteVaultedPaymentMethod$2$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m354lambda$deleteVaultedPaymentMethod$2$combraintreepaymentsapiDropInActivity(PaymentMethodNonce paymentMethodNonce, DialogInteraction dialogInteraction) {
        int i = AnonymousClass3.$SwitchMap$com$braintreepayments$api$DialogInteraction[dialogInteraction.ordinal()];
        if (i == 1) {
            sendAnalyticsEvent("manager.delete.confirmation.positive");
            removePaymentMethodNonce(paymentMethodNonce);
        } else if (i == 2) {
            sendAnalyticsEvent("manager.delete.confirmation.negative");
        }
    }

    /* access modifiers changed from: package-private */
    public void removePaymentMethodNonce(PaymentMethodNonce paymentMethodNonce) {
        this.dropInViewModel.removeVaultedPaymentMethodNonce(paymentMethodNonce);
        this.dropInInternalClient.deletePaymentMethod(this, paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda13(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$removePaymentMethodNonce$3$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m367lambda$removePaymentMethodNonce$3$combraintreepaymentsapiDropInActivity(PaymentMethodNonce paymentMethodNonce, Exception exc) {
        if (paymentMethodNonce != null) {
            sendAnalyticsEvent("manager.delete.succeeded");
        } else if (exc instanceof PaymentMethodDeleteException) {
            sendAnalyticsEvent("manager.delete.failed");
            this.alertPresenter.showSnackbarText(this.fragmentContainerView, R.string.bt_vault_manager_delete_failure, 0);
        } else {
            sendAnalyticsEvent("manager.unknown.failed");
            onError(exc);
        }
    }

    private void onSendAnalytics(DropInEvent dropInEvent) {
        sendAnalyticsEvent(dropInEvent.getString(DropInEventProperty.ANALYTICS_EVENT_NAME));
    }

    private void sendAnalyticsEvent(String str) {
        this.dropInInternalClient.sendAnalyticsEvent(str);
    }

    private void refreshVaultedPaymentMethods() {
        this.dropInInternalClient.getVaultedPaymentMethods(this, new DropInActivity$$ExternalSyntheticLambda5(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$refreshVaultedPaymentMethods$4$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m366lambda$refreshVaultedPaymentMethods$4$combraintreepaymentsapiDropInActivity(List list, Exception exc) {
        if (list != null) {
            this.dropInViewModel.setVaultedPaymentMethods(list);
        } else if (exc != null) {
            onError(exc);
        }
    }

    private void onDidShowBottomSheet() {
        this.dropInInternalClient.getSupportedPaymentMethods(this, new DropInActivity$$ExternalSyntheticLambda17(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onDidShowBottomSheet$5$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m358lambda$onDidShowBottomSheet$5$combraintreepaymentsapiDropInActivity(List list, Exception exc) {
        if (list != null) {
            this.dropInViewModel.setSupportedPaymentMethods(list);
            updateVaultedPaymentMethodNonces(false);
            return;
        }
        onError(exc);
    }

    private void onDidHideBottomSheet() {
        finishDropInWithPendingResult(DropInExitTransition.FADE_OUT);
    }

    private void finishDropInWithPendingResult(DropInExitTransition dropInExitTransition) {
        if (this.pendingDropInResult != null) {
            sendAnalyticsEvent("sdk.exit.success");
            this.dropInInternalClient.setLastUsedPaymentMethodType(this.pendingDropInResult.getPaymentMethodNonce());
            setResult(-1, new Intent().putExtra(DropInResult.EXTRA_DROP_IN_RESULT, this.pendingDropInResult));
        } else {
            sendAnalyticsEvent("sdk.exit.canceled");
            setResult(0);
        }
        finish();
        int i = AnonymousClass3.$SwitchMap$com$braintreepayments$api$DropInExitTransition[dropInExitTransition.ordinal()];
        if (i == 1) {
            overridePendingTransition(0, 0);
        } else if (i == 2) {
            overridePendingTransition(R.anim.bt_fade_in, R.anim.bt_fade_out);
        }
    }

    private void updateVaultedPaymentMethodNonces(boolean z) {
        this.dropInInternalClient.getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(Authorization authorization, Exception exc) {
                if (authorization instanceof ClientToken) {
                    DropInActivity.this.dropInInternalClient.getVaultedPaymentMethods(DropInActivity.this, new DropInActivity$2$$ExternalSyntheticLambda0(this));
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onAuthorizationResult$0$com-braintreepayments-api-DropInActivity$2  reason: not valid java name */
            public /* synthetic */ void m373lambda$onAuthorizationResult$0$combraintreepaymentsapiDropInActivity$2(List list, Exception exc) {
                if (list != null) {
                    DropInActivity.this.dropInViewModel.setVaultedPaymentMethods(list);
                } else if (exc != null) {
                    DropInActivity.this.onError(exc);
                }
            }
        });
    }

    private void onAddCardSubmit(DropInEvent dropInEvent) {
        showCardDetailsFragment(dropInEvent.getString(DropInEventProperty.CARD_NUMBER));
    }

    private boolean shouldAddFragment(String str) {
        return getSupportFragmentManager().findFragmentByTag(str) == null;
    }

    private void replaceExistingFragment(Fragment fragment, String str) {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.bt_fade_in, R.anim.bt_fade_out).replace(R.id.fragment_container_view, fragment, str).addToBackStack((String) null).commit();
    }

    private void showBottomSheetIfNecessary() {
        if (getSupportFragmentManager().getFragments().size() == 0) {
            replaceExistingFragment(BottomSheetFragment.from(this.dropInRequest), BOTTOM_SHEET_TAG);
            this.dropInViewModel.setBottomSheetState(BottomSheetState.SHOW_REQUESTED);
        }
    }

    private void showCardDetailsFragment(String str) {
        if (shouldAddFragment(CARD_DETAILS_TAG)) {
            this.dropInInternalClient.getAuthorization(new DropInActivity$$ExternalSyntheticLambda1(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$showCardDetailsFragment$7$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m369lambda$showCardDetailsFragment$7$combraintreepaymentsapiDropInActivity(String str, Authorization authorization, Exception exc) {
        if (authorization != null) {
            this.dropInInternalClient.getConfiguration(new DropInActivity$$ExternalSyntheticLambda8(this, authorization, str));
        } else {
            finishDropInWithError(exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$showCardDetailsFragment$6$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m368lambda$showCardDetailsFragment$6$combraintreepaymentsapiDropInActivity(Authorization authorization, String str, Configuration configuration, Exception exc) {
        if (configuration != null) {
            replaceExistingFragment(CardDetailsFragment.from(this.dropInRequest, str, configuration, authorization instanceof TokenizationKey), CARD_DETAILS_TAG);
            return;
        }
        finishDropInWithError(exc);
    }

    /* access modifiers changed from: package-private */
    public void onError(Exception exc) {
        if (exc instanceof ErrorWithResponse) {
            this.dropInViewModel.setCardTokenizationError((ErrorWithResponse) exc);
        } else if ((exc instanceof AuthenticationException) || (exc instanceof AuthorizationException) || (exc instanceof UpgradeRequiredException)) {
            sendAnalyticsEvent("sdk.exit.developer-error");
        } else if (exc instanceof ConfigurationException) {
            sendAnalyticsEvent("sdk.exit.configuration-exception");
        } else if ((exc instanceof ServerException) || (exc instanceof UnexpectedException)) {
            sendAnalyticsEvent("sdk.exit.server-error");
        } else if (exc instanceof ServiceUnavailableException) {
            sendAnalyticsEvent("sdk.exit.server-unavailable");
        } else {
            sendAnalyticsEvent("sdk.exit.sdk-error");
        }
        finishDropInWithError(exc);
    }

    private void animateBottomSheetClosedAndFinishDropInWithResult(DropInResult dropInResult) {
        this.pendingDropInResult = dropInResult;
        if (isBottomSheetVisible()) {
            this.dropInViewModel.setBottomSheetState(BottomSheetState.HIDE_REQUESTED);
        } else {
            finishDropInWithPendingResult(DropInExitTransition.NO_ANIMATION);
        }
    }

    private void startPayPalFlow() {
        this.dropInInternalClient.tokenizePayPalRequest(this, new DropInActivity$$ExternalSyntheticLambda14(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$startPayPalFlow$8$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m371lambda$startPayPalFlow$8$combraintreepaymentsapiDropInActivity(Exception exc) {
        if (exc != null) {
            onError(exc);
        }
    }

    private void startGooglePayFlow() {
        this.dropInInternalClient.requestGooglePayPayment(this, new DropInActivity$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$startGooglePayFlow$9$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m370lambda$startGooglePayFlow$9$combraintreepaymentsapiDropInActivity(Exception exc) {
        if (exc != null) {
            onError(exc);
        }
    }

    private void startVenmoFlow() {
        this.dropInInternalClient.tokenizeVenmoAccount(this, new DropInActivity$$ExternalSyntheticLambda16(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$startVenmoFlow$10$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m372lambda$startVenmoFlow$10$combraintreepaymentsapiDropInActivity(Exception exc) {
        if (exc != null) {
            onError(exc);
        }
    }

    private void onEditCardNumber(DropInEvent dropInEvent) {
        startAddCardFlow(dropInEvent.getString(DropInEventProperty.CARD_NUMBER));
    }

    private void prefetchSupportedCardTypes() {
        this.dropInInternalClient.getSupportedCardTypes(new DropInActivity$$ExternalSyntheticLambda18(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$prefetchSupportedCardTypes$11$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m365lambda$prefetchSupportedCardTypes$11$combraintreepaymentsapiDropInActivity(List list, Exception exc) {
        if (exc != null) {
            onError(exc);
        } else if (list != null) {
            this.dropInViewModel.setSupportedCardTypes(list);
        }
    }

    private void startAddCardFlow(String str) {
        this.dropInViewModel.setCardTokenizationError((Exception) null);
        if (shouldAddFragment(ADD_CARD_TAG)) {
            replaceExistingFragment(AddCardFragment.from(this.dropInRequest, str), ADD_CARD_TAG);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.dropInInternalClient.handleActivityResult(this, i, i2, intent, new DropInActivity$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    public void onDropInResult(DropInResult dropInResult, Exception exc) {
        if (dropInResult != null) {
            animateBottomSheetClosedAndFinishDropInWithResult(dropInResult);
        } else if (exc instanceof UserCanceledException) {
            updateVaultedPaymentMethodNonces(true);
            this.dropInViewModel.setUserCanceledError(exc);
        } else {
            onError(exc);
        }
    }

    private void onVaultedPaymentMethodSelected(DropInEvent dropInEvent) {
        PaymentMethodNonce paymentMethodNonce = dropInEvent.getPaymentMethodNonce(DropInEventProperty.VAULTED_PAYMENT_METHOD);
        if (paymentMethodNonce instanceof CardNonce) {
            sendAnalyticsEvent("vaulted-card.select");
        }
        this.dropInViewModel.setDropInState(DropInState.WILL_FINISH);
        this.dropInInternalClient.shouldRequestThreeDSecureVerification(paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda12(this, paymentMethodNonce));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onVaultedPaymentMethodSelected$14$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m364lambda$onVaultedPaymentMethodSelected$14$combraintreepaymentsapiDropInActivity(PaymentMethodNonce paymentMethodNonce, boolean z) {
        if (z) {
            this.dropInInternalClient.performThreeDSecureVerification(this, paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda6(this));
            return;
        }
        DropInResult dropInResult = new DropInResult();
        dropInResult.setPaymentMethodNonce(paymentMethodNonce);
        this.dropInInternalClient.collectDeviceData(this, this.dropInRequest.hasUserLocationConsent(), new DropInActivity$$ExternalSyntheticLambda7(this, dropInResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onVaultedPaymentMethodSelected$12$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m362lambda$onVaultedPaymentMethodSelected$12$combraintreepaymentsapiDropInActivity(DropInResult dropInResult, Exception exc) {
        if (dropInResult != null) {
            animateBottomSheetClosedAndFinishDropInWithResult(dropInResult);
            return;
        }
        updateVaultedPaymentMethodNonces(true);
        onError(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onVaultedPaymentMethodSelected$13$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m363lambda$onVaultedPaymentMethodSelected$13$combraintreepaymentsapiDropInActivity(DropInResult dropInResult, String str, Exception exc) {
        if (str != null) {
            dropInResult.setDeviceData(str);
            animateBottomSheetClosedAndFinishDropInWithResult(dropInResult);
            return;
        }
        updateVaultedPaymentMethodNonces(true);
        onError(exc);
    }

    private void onCardDetailsSubmit(DropInEvent dropInEvent) {
        Card card = dropInEvent.getCard(DropInEventProperty.CARD);
        this.dropInViewModel.setDropInState(DropInState.WILL_FINISH);
        this.dropInInternalClient.tokenizeCard(card, new DropInActivity$$ExternalSyntheticLambda19(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCardDetailsSubmit$15$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m355lambda$onCardDetailsSubmit$15$combraintreepaymentsapiDropInActivity(CardNonce cardNonce, Exception exc) {
        if (exc == null) {
            onPaymentMethodNonceCreated(cardNonce);
        } else if (exc instanceof ErrorWithResponse) {
            this.dropInViewModel.setCardTokenizationError(exc);
            this.dropInViewModel.setDropInState(DropInState.IDLE);
        } else {
            onError(exc);
        }
    }

    private void onPaymentMethodNonceCreated(PaymentMethodNonce paymentMethodNonce) {
        this.dropInInternalClient.shouldRequestThreeDSecureVerification(paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda11(this, paymentMethodNonce));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onPaymentMethodNonceCreated$18$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m361lambda$onPaymentMethodNonceCreated$18$combraintreepaymentsapiDropInActivity(PaymentMethodNonce paymentMethodNonce, boolean z) {
        if (z) {
            this.dropInInternalClient.performThreeDSecureVerification(this, paymentMethodNonce, new DropInActivity$$ExternalSyntheticLambda3(this));
            return;
        }
        DropInResult dropInResult = new DropInResult();
        dropInResult.setPaymentMethodNonce(paymentMethodNonce);
        this.dropInInternalClient.collectDeviceData(this, this.dropInRequest.hasUserLocationConsent(), new DropInActivity$$ExternalSyntheticLambda4(this, dropInResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onPaymentMethodNonceCreated$16$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m359lambda$onPaymentMethodNonceCreated$16$combraintreepaymentsapiDropInActivity(DropInResult dropInResult, Exception exc) {
        if (exc != null) {
            onError(exc);
        } else {
            animateBottomSheetClosedAndFinishDropInWithResult(dropInResult);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onPaymentMethodNonceCreated$17$com-braintreepayments-api-DropInActivity  reason: not valid java name */
    public /* synthetic */ void m360lambda$onPaymentMethodNonceCreated$17$combraintreepaymentsapiDropInActivity(DropInResult dropInResult, String str, Exception exc) {
        if (str != null) {
            dropInResult.setDeviceData(str);
            animateBottomSheetClosedAndFinishDropInWithResult(dropInResult);
            return;
        }
        onError(exc);
    }

    private boolean willDeliverSuccessfulBrowserSwitchResult() {
        BrowserSwitchResult browserSwitchResult = this.dropInInternalClient.getBrowserSwitchResult(this);
        if (browserSwitchResult == null || browserSwitchResult.getStatus() != 1) {
            return false;
        }
        return true;
    }

    private boolean isBottomSheetVisible() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(BOTTOM_SHEET_TAG);
        if (findFragmentByTag != null) {
            return findFragmentByTag.isVisible();
        }
        return false;
    }
}
