package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.braintreepayments.api.GraphQLConstants;
import com.canhub.cropper.CropImage;
import com.canhub.cropper.CropImageView;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/canhub/cropper/CropImageContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/canhub/cropper/CropImageContractOptions;", "Lcom/canhub/cropper/CropImageView$CropResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(message = "\n  This ActivityResultContract is deprecated.\n  Please either roll your own ActivityResultContract with the desired behavior or copy paste this.\n")
/* compiled from: CropImageContract.kt */
public final class CropImageContract extends ActivityResultContract<CropImageContractOptions, CropImageView.CropResult> {
    public Intent createIntent(Context context, CropImageContractOptions cropImageContractOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageContractOptions, GraphQLConstants.Keys.INPUT);
        Intent intent = new Intent(context, CropImageActivity.class);
        Bundle bundle = new Bundle(2);
        bundle.putParcelable(CropImage.CROP_IMAGE_EXTRA_SOURCE, cropImageContractOptions.getUri());
        bundle.putParcelable(CropImage.CROP_IMAGE_EXTRA_OPTIONS, cropImageContractOptions.getCropImageOptions());
        Unit unit = Unit.INSTANCE;
        intent.putExtra(CropImage.CROP_IMAGE_EXTRA_BUNDLE, bundle);
        return intent;
    }

    public CropImageView.CropResult parseResult(int i, Intent intent) {
        Parcelable parcelable = null;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra(CropImage.CROP_IMAGE_EXTRA_RESULT);
            if (parcelableExtra instanceof CropImage.ActivityResult) {
                parcelable = parcelableExtra;
            }
            parcelable = (CropImage.ActivityResult) parcelable;
        }
        if (parcelable == null || i == 0) {
            return CropImage.CancelledResult.INSTANCE;
        }
        return (CropImageView.CropResult) parcelable;
    }
}
