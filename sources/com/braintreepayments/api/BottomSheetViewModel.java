package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BottomSheetViewModel {
    private final List<BottomSheetViewType> fragments;

    BottomSheetViewModel(BottomSheetViewType... bottomSheetViewTypeArr) {
        ArrayList arrayList = new ArrayList();
        this.fragments = arrayList;
        arrayList.addAll(Arrays.asList(bottomSheetViewTypeArr));
    }

    /* access modifiers changed from: package-private */
    public BottomSheetViewType getItem(int i) {
        return this.fragments.get(i);
    }

    /* access modifiers changed from: package-private */
    public void add(BottomSheetViewType bottomSheetViewType) {
        this.fragments.add(bottomSheetViewType);
    }

    /* access modifiers changed from: package-private */
    public void remove(int i) {
        this.fragments.remove(i);
    }

    /* access modifiers changed from: package-private */
    public long getItemId(int i) {
        return getItem(i).getId();
    }

    /* access modifiers changed from: package-private */
    public boolean containsItem(long j) {
        for (BottomSheetViewType hasId : this.fragments) {
            if (hasId.hasId(j)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int size() {
        return this.fragments.size();
    }
}
