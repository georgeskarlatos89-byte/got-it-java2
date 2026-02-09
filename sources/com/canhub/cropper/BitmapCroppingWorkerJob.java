package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001.B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H@¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/canhub/cropper/BitmapCroppingWorkerJob;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "cropImageViewReference", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/CropImageView;", "uri", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "cropPoints", "", "degreesRotated", "", "orgWidth", "orgHeight", "fixAspectRatio", "", "aspectRatioX", "aspectRatioY", "reqWidth", "reqHeight", "flipHorizontally", "flipVertically", "options", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "saveCompressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressQuality", "customOutputUri", "<init>", "(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "job", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "start", "", "onPostExecute", "result", "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "Result", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: BitmapCroppingWorkerJob.kt */
public final class BitmapCroppingWorkerJob implements CoroutineScope {
    /* access modifiers changed from: private */
    public final int aspectRatioX;
    /* access modifiers changed from: private */
    public final int aspectRatioY;
    /* access modifiers changed from: private */
    public final Bitmap bitmap;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final WeakReference<CropImageView> cropImageViewReference;
    /* access modifiers changed from: private */
    public final float[] cropPoints;
    /* access modifiers changed from: private */
    public final Uri customOutputUri;
    /* access modifiers changed from: private */
    public final int degreesRotated;
    /* access modifiers changed from: private */
    public final boolean fixAspectRatio;
    /* access modifiers changed from: private */
    public final boolean flipHorizontally;
    /* access modifiers changed from: private */
    public final boolean flipVertically;
    private Job job = JobKt.Job$default((Job) null, 1, (Object) null);
    /* access modifiers changed from: private */
    public final CropImageView.RequestSizeOptions options;
    /* access modifiers changed from: private */
    public final int orgHeight;
    /* access modifiers changed from: private */
    public final int orgWidth;
    /* access modifiers changed from: private */
    public final int reqHeight;
    /* access modifiers changed from: private */
    public final int reqWidth;
    /* access modifiers changed from: private */
    public final Bitmap.CompressFormat saveCompressFormat;
    /* access modifiers changed from: private */
    public final int saveCompressQuality;
    /* access modifiers changed from: private */
    public final Uri uri;

    public BitmapCroppingWorkerJob(Context context2, WeakReference<CropImageView> weakReference, Uri uri2, Bitmap bitmap2, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Bitmap.CompressFormat compressFormat, int i8, Uri uri3) {
        CropImageView.RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(weakReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(fArr, "cropPoints");
        Intrinsics.checkNotNullParameter(requestSizeOptions2, "options");
        Intrinsics.checkNotNullParameter(compressFormat2, "saveCompressFormat");
        this.context = context2;
        this.cropImageViewReference = weakReference;
        this.uri = uri2;
        this.bitmap = bitmap2;
        this.cropPoints = fArr;
        this.degreesRotated = i;
        this.orgWidth = i2;
        this.orgHeight = i3;
        this.fixAspectRatio = z;
        this.aspectRatioX = i4;
        this.aspectRatioY = i5;
        this.reqWidth = i6;
        this.reqHeight = i7;
        this.flipHorizontally = z2;
        this.flipVertically = z3;
        this.options = requestSizeOptions2;
        this.saveCompressFormat = compressFormat2;
        this.saveCompressQuality = i8;
        this.customOutputUri = uri3;
    }

    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void start() {
        this.job = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), (CoroutineStart) null, new BitmapCroppingWorkerJob$start$1(this, (Continuation<? super BitmapCroppingWorkerJob$start$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object onPostExecute(Result result, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapCroppingWorkerJob$onPostExecute$2(this, result, (Continuation<? super BitmapCroppingWorkerJob$onPostExecute$2>) null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u0010\u0018\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "", "bitmap", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "sampleSize", "", "<init>", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getUri", "()Landroid/net/Uri;", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "getSampleSize", "()I", "component1", "component2", "component3", "component4", "copy", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "equals", "", "other", "hashCode", "toString", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: BitmapCroppingWorkerJob.kt */
    public static final class Result {
        private final Bitmap bitmap;
        private final Exception error;
        private final int sampleSize;
        private final Uri uri;

        public static /* synthetic */ Result copy$default(Result result, Bitmap bitmap2, Uri uri2, Exception exc, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bitmap2 = result.bitmap;
            }
            if ((i2 & 2) != 0) {
                uri2 = result.uri;
            }
            if ((i2 & 4) != 0) {
                exc = result.error;
            }
            if ((i2 & 8) != 0) {
                i = result.sampleSize;
            }
            return result.copy(bitmap2, uri2, exc, i);
        }

        public final Bitmap component1() {
            return this.bitmap;
        }

        public final Uri component2() {
            return this.uri;
        }

        public final Exception component3() {
            return this.error;
        }

        public final int component4() {
            return this.sampleSize;
        }

        public final Result copy(Bitmap bitmap2, Uri uri2, Exception exc, int i) {
            return new Result(bitmap2, uri2, exc, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual((Object) this.bitmap, (Object) result.bitmap) && Intrinsics.areEqual((Object) this.uri, (Object) result.uri) && Intrinsics.areEqual((Object) this.error, (Object) result.error) && this.sampleSize == result.sampleSize;
        }

        public int hashCode() {
            Bitmap bitmap2 = this.bitmap;
            int i = 0;
            int hashCode = (bitmap2 == null ? 0 : bitmap2.hashCode()) * 31;
            Uri uri2 = this.uri;
            int hashCode2 = (hashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Exception exc = this.error;
            if (exc != null) {
                i = exc.hashCode();
            }
            return ((hashCode2 + i) * 31) + Integer.hashCode(this.sampleSize);
        }

        public String toString() {
            Bitmap bitmap2 = this.bitmap;
            Uri uri2 = this.uri;
            Exception exc = this.error;
            return "Result(bitmap=" + bitmap2 + ", uri=" + uri2 + ", error=" + exc + ", sampleSize=" + this.sampleSize + ")";
        }

        public Result(Bitmap bitmap2, Uri uri2, Exception exc, int i) {
            this.bitmap = bitmap2;
            this.uri = uri2;
            this.error = exc;
            this.sampleSize = i;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final Exception getError() {
            return this.error;
        }

        public final int getSampleSize() {
            return this.sampleSize;
        }
    }
}
