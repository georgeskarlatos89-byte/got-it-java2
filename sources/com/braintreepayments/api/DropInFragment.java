package com.braintreepayments.api;

import androidx.fragment.app.Fragment;

abstract class DropInFragment extends Fragment {
    DropInFragment() {
    }

    /* access modifiers changed from: protected */
    public void sendDropInEvent(DropInEvent dropInEvent) {
        if (isAdded()) {
            getParentFragmentManager().setFragmentResult("DROP_IN_EVENT_REQUEST_KEY", dropInEvent.toBundle());
        }
    }

    /* access modifiers changed from: protected */
    public void sendAnalyticsEvent(String str) {
        sendDropInEvent(DropInEvent.createSendAnalyticsEvent(str));
    }
}
