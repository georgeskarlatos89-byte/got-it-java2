package com.canhub.cropper;

import androidx.activity.result.ActivityResultCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CropImageActivity$$ExternalSyntheticLambda4 implements ActivityResultCallback {
    public final /* synthetic */ CropImageActivity f$0;

    public /* synthetic */ CropImageActivity$$ExternalSyntheticLambda4(CropImageActivity cropImageActivity) {
        this.f$0 = cropImageActivity;
    }

    public final void onActivityResult(Object obj) {
        CropImageActivity.takePicture$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
    }
}
