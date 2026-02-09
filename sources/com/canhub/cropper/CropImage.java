package com.canhub.cropper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.canhub.cropper.CropException;
import com.canhub.cropper.CropImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/canhub/cropper/CropImage;", "", "<init>", "()V", "CROP_IMAGE_EXTRA_SOURCE", "", "CROP_IMAGE_EXTRA_OPTIONS", "CROP_IMAGE_EXTRA_BUNDLE", "CROP_IMAGE_EXTRA_RESULT", "CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE", "", "toOvalBitmap", "Landroid/graphics/Bitmap;", "bitmap", "ActivityResult", "CancelledResult", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: CropImage.kt */
public final class CropImage {
    public static final int CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE = 204;
    public static final String CROP_IMAGE_EXTRA_BUNDLE = "CROP_IMAGE_EXTRA_BUNDLE";
    public static final String CROP_IMAGE_EXTRA_OPTIONS = "CROP_IMAGE_EXTRA_OPTIONS";
    public static final String CROP_IMAGE_EXTRA_RESULT = "CROP_IMAGE_EXTRA_RESULT";
    public static final String CROP_IMAGE_EXTRA_SOURCE = "CROP_IMAGE_EXTRA_SOURCE";
    public static final CropImage INSTANCE = new CropImage();

    private CropImage() {
    }

    public final Bitmap toOvalBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawOval(new RectF(0.0f, 0.0f, (float) width, (float) height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB[\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016¨\u0006\u001c"}, d2 = {"Lcom/canhub/cropper/CropImage$ActivityResult;", "Lcom/canhub/cropper/CropImageView$CropResult;", "Landroid/os/Parcelable;", "originalUri", "Landroid/net/Uri;", "uriContent", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "cropPoints", "", "cropRect", "Landroid/graphics/Rect;", "rotation", "", "wholeImageRect", "sampleSize", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;ILandroid/graphics/Rect;I)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "writeToParcel", "", "dest", "flags", "describeContents", "Companion", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImage.kt */
    public static class ActivityResult extends CropImageView.CropResult implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new CropImage$ActivityResult$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        public int describeContents() {
            return 0;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super((Bitmap) null, uri, (Bitmap) null, uri2, exc, fArr, rect, rect2, i, i2);
            Intrinsics.checkNotNull(fArr);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected ActivityResult(android.os.Parcel r13) {
            /*
                r12 = this;
                java.lang.String r0 = "in"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r2 = 0
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r13.readParcelable(r0)
                r3 = r0
                android.net.Uri r3 = (android.net.Uri) r3
                r4 = 0
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r13.readParcelable(r0)
                r5 = r0
                android.net.Uri r5 = (android.net.Uri) r5
                java.io.Serializable r0 = r13.readSerializable()
                r6 = r0
                java.lang.Exception r6 = (java.lang.Exception) r6
                float[] r7 = r13.createFloatArray()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r13.readParcelable(r0)
                r8 = r0
                android.graphics.Rect r8 = (android.graphics.Rect) r8
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r13.readParcelable(r0)
                r9 = r0
                android.graphics.Rect r9 = (android.graphics.Rect) r9
                int r10 = r13.readInt()
                int r11 = r13.readInt()
                r1 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImage.ActivityResult.<init>(android.os.Parcel):void");
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeParcelable(getOriginalUri(), i);
            parcel.writeParcelable(getUriContent(), i);
            parcel.writeSerializable(getError());
            parcel.writeFloatArray(getCropPoints());
            parcel.writeParcelable(getCropRect(), i);
            parcel.writeParcelable(getWholeImageRect(), i);
            parcel.writeInt(getRotation());
            parcel.writeInt(getSampleSize());
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImage$ActivityResult$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/canhub/cropper/CropImage$ActivityResult;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* compiled from: CropImage.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/canhub/cropper/CropImage$CancelledResult;", "Lcom/canhub/cropper/CropImageView$CropResult;", "<init>", "()V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImage.kt */
    public static final class CancelledResult extends CropImageView.CropResult {
        public static final CancelledResult INSTANCE = new CancelledResult();

        private CancelledResult() {
            super((Bitmap) null, (Uri) null, (Bitmap) null, (Uri) null, new CropException.Cancellation(), new float[0], (Rect) null, (Rect) null, 0, 0);
        }
    }
}
