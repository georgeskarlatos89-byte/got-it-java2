package com.braintreepayments.api;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;
import com.braintreepayments.api.BottomSheetPresenter;
import com.braintreepayments.api.dropin.R;

public class BottomSheetFragment extends Fragment implements BottomSheetPresenter.ViewHolder {
    private View backgroundView;
    /* access modifiers changed from: private */
    public BottomSheetPresenter bottomSheetPresenter;
    private DropInRequest dropInRequest;
    DropInViewModel dropInViewModel;
    ViewPager2 viewPager;

    static BottomSheetFragment from(DropInRequest dropInRequest2) {
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DROP_IN_REQUEST", dropInRequest2);
        bottomSheetFragment.setArguments(bundle);
        return bottomSheetFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dropInRequest = (DropInRequest) arguments.getParcelable("EXTRA_DROP_IN_REQUEST");
        }
        this.dropInViewModel = (DropInViewModel) new ViewModelProvider(requireActivity()).get(DropInViewModel.class);
        View inflate = layoutInflater.inflate(R.layout.bt_fragment_bottom_sheet, viewGroup, false);
        this.backgroundView = inflate.findViewById(R.id.background);
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.view_pager);
        this.viewPager = viewPager2;
        viewPager2.setSaveEnabled(false);
        BottomSheetPresenter bottomSheetPresenter2 = new BottomSheetPresenter();
        this.bottomSheetPresenter = bottomSheetPresenter2;
        bottomSheetPresenter2.bind(this);
        getChildFragmentManager().setFragmentResultListener("DROP_IN_EVENT_REQUEST_KEY", this, new BottomSheetFragment$$ExternalSyntheticLambda2(this));
        requireActivity().getOnBackPressedDispatcher().addCallback(requireActivity(), new OnBackPressedCallback(true) {
            public void handleOnBackPressed() {
                BottomSheetViewType visibleFragment = BottomSheetFragment.this.bottomSheetPresenter.getVisibleFragment();
                if (visibleFragment != null) {
                    int i = AnonymousClass2.$SwitchMap$com$braintreepayments$api$BottomSheetViewType[visibleFragment.ordinal()];
                    if (i == 1) {
                        BottomSheetFragment.this.bottomSheetPresenter.dismissVaultManager();
                    } else if (i == 2) {
                        BottomSheetFragment.this.slideDownBottomSheet(new BottomSheetFragment$1$$ExternalSyntheticLambda0(this));
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$handleOnBackPressed$0$com-braintreepayments-api-BottomSheetFragment$1  reason: not valid java name */
            public /* synthetic */ void m334lambda$handleOnBackPressed$0$combraintreepaymentsapiBottomSheetFragment$1() {
                setEnabled(false);
                remove();
            }
        });
        this.dropInViewModel.getBottomSheetState().observe(requireActivity(), new BottomSheetFragment$$ExternalSyntheticLambda3(this));
        ((Button) inflate.findViewById(R.id.back_button)).setOnClickListener(new BottomSheetFragment$$ExternalSyntheticLambda4(this));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$0$com-braintreepayments-api-BottomSheetFragment  reason: not valid java name */
    public /* synthetic */ void m329lambda$onCreateView$0$combraintreepaymentsapiBottomSheetFragment(String str, Bundle bundle) {
        onDropInEvent(DropInEvent.fromBundle(bundle));
    }

    /* renamed from: com.braintreepayments.api.BottomSheetFragment$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$BottomSheetState;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$BottomSheetViewType;
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$DropInEventType;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.braintreepayments.api.BottomSheetState[] r0 = com.braintreepayments.api.BottomSheetState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$braintreepayments$api$BottomSheetState = r0
                r1 = 1
                com.braintreepayments.api.BottomSheetState r2 = com.braintreepayments.api.BottomSheetState.HIDE_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braintreepayments.api.BottomSheetState r3 = com.braintreepayments.api.BottomSheetState.SHOW_REQUESTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.braintreepayments.api.BottomSheetState r3 = com.braintreepayments.api.BottomSheetState.SHOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = $SwitchMap$com$braintreepayments$api$BottomSheetState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.braintreepayments.api.BottomSheetState r3 = com.braintreepayments.api.BottomSheetState.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.braintreepayments.api.DropInEventType[] r2 = com.braintreepayments.api.DropInEventType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$braintreepayments$api$DropInEventType = r2
                com.braintreepayments.api.DropInEventType r3 = com.braintreepayments.api.DropInEventType.SHOW_VAULT_MANAGER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = $SwitchMap$com$braintreepayments$api$DropInEventType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.braintreepayments.api.DropInEventType r3 = com.braintreepayments.api.DropInEventType.DISMISS_VAULT_MANAGER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.braintreepayments.api.BottomSheetViewType[] r2 = com.braintreepayments.api.BottomSheetViewType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$braintreepayments$api$BottomSheetViewType = r2
                com.braintreepayments.api.BottomSheetViewType r3 = com.braintreepayments.api.BottomSheetViewType.VAULT_MANAGER     // Catch:{ NoSuchFieldError -> 0x005f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = $SwitchMap$com$braintreepayments$api$BottomSheetViewType     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.braintreepayments.api.BottomSheetViewType r2 = com.braintreepayments.api.BottomSheetViewType.SUPPORTED_PAYMENT_METHODS     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BottomSheetFragment.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$1$com-braintreepayments-api-BottomSheetFragment  reason: not valid java name */
    public /* synthetic */ void m330lambda$onCreateView$1$combraintreepaymentsapiBottomSheetFragment(BottomSheetState bottomSheetState) {
        int i = AnonymousClass2.$SwitchMap$com$braintreepayments$api$BottomSheetState[bottomSheetState.ordinal()];
        if (i == 1) {
            slideDownBottomSheet();
        } else if (i == 2) {
            slideUpBottomSheet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreateView$2$com-braintreepayments-api-BottomSheetFragment  reason: not valid java name */
    public /* synthetic */ void m331lambda$onCreateView$2$combraintreepaymentsapiBottomSheetFragment(View view) {
        slideDownBottomSheet();
    }

    public void onResume() {
        super.onResume();
        if (this.dropInViewModel.getBottomSheetState().getValue() == BottomSheetState.SHOWN) {
            this.backgroundView.setAlpha(1.0f);
        } else {
            slideUpBottomSheet();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        BottomSheetPresenter bottomSheetPresenter2 = this.bottomSheetPresenter;
        if (bottomSheetPresenter2 != null) {
            bottomSheetPresenter2.unbind();
        }
    }

    private void slideUpBottomSheet() {
        if (!this.bottomSheetPresenter.isAnimating()) {
            this.bottomSheetPresenter.slideUpBottomSheet(new BottomSheetFragment$$ExternalSyntheticLambda0(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$slideUpBottomSheet$3$com-braintreepayments-api-BottomSheetFragment  reason: not valid java name */
    public /* synthetic */ void m333lambda$slideUpBottomSheet$3$combraintreepaymentsapiBottomSheetFragment() {
        this.dropInViewModel.setBottomSheetState(BottomSheetState.SHOWN);
    }

    private void slideDownBottomSheet() {
        slideDownBottomSheet((AnimationCompleteCallback) null);
    }

    /* access modifiers changed from: private */
    public void slideDownBottomSheet(AnimationCompleteCallback animationCompleteCallback) {
        if (!this.bottomSheetPresenter.isAnimating()) {
            this.bottomSheetPresenter.slideDownBottomSheet(new BottomSheetFragment$$ExternalSyntheticLambda1(this, animationCompleteCallback));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$slideDownBottomSheet$4$com-braintreepayments-api-BottomSheetFragment  reason: not valid java name */
    public /* synthetic */ void m332lambda$slideDownBottomSheet$4$combraintreepaymentsapiBottomSheetFragment(AnimationCompleteCallback animationCompleteCallback) {
        this.dropInViewModel.setBottomSheetState(BottomSheetState.HIDDEN);
        if (animationCompleteCallback != null) {
            animationCompleteCallback.onAnimationComplete();
        }
    }

    /* access modifiers changed from: package-private */
    public void onDropInEvent(DropInEvent dropInEvent) {
        int i = AnonymousClass2.$SwitchMap$com$braintreepayments$api$DropInEventType[dropInEvent.getType().ordinal()];
        if (i == 1) {
            this.bottomSheetPresenter.showVaultManager();
        } else if (i == 2) {
            this.bottomSheetPresenter.dismissVaultManager();
        }
        sendDropInEvent(dropInEvent);
    }

    private void sendDropInEvent(DropInEvent dropInEvent) {
        if (isAdded()) {
            getParentFragmentManager().setFragmentResult("DROP_IN_EVENT_REQUEST_KEY", dropInEvent.toBundle());
        }
    }

    public void requestLayout() {
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
    }

    public DropInRequest getDropInRequest() {
        return this.dropInRequest;
    }

    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public View getBackgroundView() {
        return this.backgroundView;
    }
}
