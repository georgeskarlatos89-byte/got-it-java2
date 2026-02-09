package com.canhub.cropper;

import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CropImageActivity$$ExternalSyntheticLambda3 implements ActivityResultCallback {
    public final /* synthetic */ CropImageActivity f$0;

    public /* synthetic */ CropImageActivity$$ExternalSyntheticLambda3(CropImageActivity cropImageActivity) {
        this.f$0 = cropImageActivity;
    }

    public final void onActivityResult(Object obj) {
        CropImageActivity.pickImageGallery$lambda$0(this.f$0, (Uri) obj);
    }
}
