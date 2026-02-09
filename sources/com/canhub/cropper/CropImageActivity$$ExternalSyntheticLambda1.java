package com.canhub.cropper;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CropImageActivity$$ExternalSyntheticLambda1 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ CropImageActivity f$0;

    public /* synthetic */ CropImageActivity$$ExternalSyntheticLambda1(CropImageActivity cropImageActivity) {
        this.f$0 = cropImageActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return CropImageActivity.showImageSourceDialog$lambda$16(this.f$0, dialogInterface, i, keyEvent);
    }
}
