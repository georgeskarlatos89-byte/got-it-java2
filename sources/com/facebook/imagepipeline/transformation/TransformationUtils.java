package com.facebook.imagepipeline.transformation;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import javax.annotation.Nullable;

public final class TransformationUtils {
    public static boolean maybeApplyTransformation(@Nullable BitmapTransformation bitmapTransformation, @Nullable CloseableReference<Bitmap> closeableReference) {
        if (bitmapTransformation == null || closeableReference == null) {
            return false;
        }
        Bitmap bitmap = closeableReference.get();
        if (bitmapTransformation.modifiesTransparency()) {
            bitmap.setHasAlpha(true);
        }
        bitmapTransformation.transform(bitmap);
        return true;
    }
}
