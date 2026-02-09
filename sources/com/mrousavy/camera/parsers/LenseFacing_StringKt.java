package com.mrousavy.camera.parsers;

import co.gotitapp.android.modules.country.CountryPickerActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"parseLensFacing", "", "lensFacing", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LenseFacing+String.kt */
public final class LenseFacing_StringKt {
    public static final String parseLensFacing(Integer num) {
        if (num != null && num.intValue() == 1) {
            return CountryPickerActivity.BACK_BUTTON_ACCESSIBILITY_LABEL;
        }
        if (num != null && num.intValue() == 0) {
            return "front";
        }
        if (num != null && num.intValue() == 2) {
            return "external";
        }
        return null;
    }
}
