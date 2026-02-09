package com.braintreepayments.api;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class BottomSheetViewAdapter extends FragmentStateAdapter {
    private final BottomSheetViewModel childFragmentList;
    private final DropInRequest dropInRequest;

    BottomSheetViewAdapter(FragmentManager fragmentManager, Lifecycle lifecycle, BottomSheetViewModel bottomSheetViewModel, DropInRequest dropInRequest2) {
        super(fragmentManager, lifecycle);
        this.dropInRequest = dropInRequest2;
        this.childFragmentList = bottomSheetViewModel;
    }

    public Fragment createFragment(int i) {
        BottomSheetViewType item = this.childFragmentList.getItem(i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DROP_IN_REQUEST", this.dropInRequest);
        if (AnonymousClass1.$SwitchMap$com$braintreepayments$api$BottomSheetViewType[item.ordinal()] != 1) {
            SupportedPaymentMethodsFragment supportedPaymentMethodsFragment = new SupportedPaymentMethodsFragment();
            supportedPaymentMethodsFragment.setArguments(bundle);
            return supportedPaymentMethodsFragment;
        }
        VaultManagerFragment vaultManagerFragment = new VaultManagerFragment();
        vaultManagerFragment.setArguments(bundle);
        return vaultManagerFragment;
    }

    /* renamed from: com.braintreepayments.api.BottomSheetViewAdapter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$braintreepayments$api$BottomSheetViewType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.braintreepayments.api.BottomSheetViewType[] r0 = com.braintreepayments.api.BottomSheetViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$braintreepayments$api$BottomSheetViewType = r0
                com.braintreepayments.api.BottomSheetViewType r1 = com.braintreepayments.api.BottomSheetViewType.VAULT_MANAGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$braintreepayments$api$BottomSheetViewType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braintreepayments.api.BottomSheetViewType r1 = com.braintreepayments.api.BottomSheetViewType.SUPPORTED_PAYMENT_METHODS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BottomSheetViewAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    public int getItemCount() {
        return this.childFragmentList.size();
    }

    public long getItemId(int i) {
        return this.childFragmentList.getItemId(i);
    }

    public boolean containsItem(long j) {
        return this.childFragmentList.containsItem(j);
    }
}
