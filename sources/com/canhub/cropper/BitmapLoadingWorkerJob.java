package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH@¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u00050\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/canhub/cropper/BitmapLoadingWorkerJob;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "cropImageView", "Lcom/canhub/cropper/CropImageView;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V", "getUri$cropper_release", "()Landroid/net/Uri;", "width", "", "height", "cropImageViewReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "job", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "start", "", "onPostExecute", "result", "Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "(Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "Result", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: BitmapLoadingWorkerJob.kt */
public final class BitmapLoadingWorkerJob implements CoroutineScope {
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final WeakReference<CropImageView> cropImageViewReference;
    /* access modifiers changed from: private */
    public final int height;
    private Job job = JobKt.Job$default((Job) null, 1, (Object) null);
    private final Uri uri;
    /* access modifiers changed from: private */
    public final int width;

    public BitmapLoadingWorkerJob(Context context2, CropImageView cropImageView, Uri uri2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.context = context2;
        this.uri = uri2;
        this.cropImageViewReference = new WeakReference<>(cropImageView);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        double d = displayMetrics.density > 1.0f ? 1.0d / ((double) displayMetrics.density) : 1.0d;
        this.width = (int) (((double) displayMetrics.widthPixels) * d);
        this.height = (int) (((double) displayMetrics.heightPixels) * d);
    }

    public final Uri getUri$cropper_release() {
        return this.uri;
    }

    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void start() {
        this.job = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), (CoroutineStart) null, new BitmapLoadingWorkerJob$start$1(this, (Continuation<? super BitmapLoadingWorkerJob$start$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object onPostExecute(Result result, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapLoadingWorkerJob$onPostExecute$2(this, result, (Continuation<? super BitmapLoadingWorkerJob$onPostExecute$2>) null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u0016\u0010$\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001b\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "", "uri", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "loadSampleSize", "", "degreesRotated", "flipHorizontally", "", "flipVertically", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "<init>", "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V", "getUri", "()Landroid/net/Uri;", "getBitmap", "()Landroid/graphics/Bitmap;", "getLoadSampleSize", "()I", "getDegreesRotated", "getFlipHorizontally", "()Z", "getFlipVertically", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "equals", "other", "hashCode", "toString", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: BitmapLoadingWorkerJob.kt */
    public static final class Result {
        private final Bitmap bitmap;
        private final int degreesRotated;
        private final Exception error;
        private final boolean flipHorizontally;
        private final boolean flipVertically;
        private final int loadSampleSize;
        private final Uri uri;

        public static /* synthetic */ Result copy$default(Result result, Uri uri2, Bitmap bitmap2, int i, int i2, boolean z, boolean z2, Exception exc, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                uri2 = result.uri;
            }
            if ((i3 & 2) != 0) {
                bitmap2 = result.bitmap;
            }
            Bitmap bitmap3 = bitmap2;
            if ((i3 & 4) != 0) {
                i = result.loadSampleSize;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = result.degreesRotated;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                z = result.flipHorizontally;
            }
            boolean z3 = z;
            if ((i3 & 32) != 0) {
                z2 = result.flipVertically;
            }
            boolean z4 = z2;
            if ((i3 & 64) != 0) {
                exc = result.error;
            }
            return result.copy(uri2, bitmap3, i4, i5, z3, z4, exc);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final Bitmap component2() {
            return this.bitmap;
        }

        public final int component3() {
            return this.loadSampleSize;
        }

        public final int component4() {
            return this.degreesRotated;
        }

        public final boolean component5() {
            return this.flipHorizontally;
        }

        public final boolean component6() {
            return this.flipVertically;
        }

        public final Exception component7() {
            return this.error;
        }

        public final Result copy(Uri uri2, Bitmap bitmap2, int i, int i2, boolean z, boolean z2, Exception exc) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            return new Result(uri2, bitmap2, i, i2, z, z2, exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual((Object) this.uri, (Object) result.uri) && Intrinsics.areEqual((Object) this.bitmap, (Object) result.bitmap) && this.loadSampleSize == result.loadSampleSize && this.degreesRotated == result.degreesRotated && this.flipHorizontally == result.flipHorizontally && this.flipVertically == result.flipVertically && Intrinsics.areEqual((Object) this.error, (Object) result.error);
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            Bitmap bitmap2 = this.bitmap;
            int i = 0;
            int hashCode2 = (((((((((hashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31) + Integer.hashCode(this.loadSampleSize)) * 31) + Integer.hashCode(this.degreesRotated)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
            Exception exc = this.error;
            if (exc != null) {
                i = exc.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            Uri uri2 = this.uri;
            Bitmap bitmap2 = this.bitmap;
            int i = this.loadSampleSize;
            int i2 = this.degreesRotated;
            boolean z = this.flipHorizontally;
            boolean z2 = this.flipVertically;
            return "Result(uri=" + uri2 + ", bitmap=" + bitmap2 + ", loadSampleSize=" + i + ", degreesRotated=" + i2 + ", flipHorizontally=" + z + ", flipVertically=" + z2 + ", error=" + this.error + ")";
        }

        public Result(Uri uri2, Bitmap bitmap2, int i, int i2, boolean z, boolean z2, Exception exc) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.uri = uri2;
            this.bitmap = bitmap2;
            this.loadSampleSize = i;
            this.degreesRotated = i2;
            this.flipHorizontally = z;
            this.flipVertically = z2;
            this.error = exc;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getLoadSampleSize() {
            return this.loadSampleSize;
        }

        public final int getDegreesRotated() {
            return this.degreesRotated;
        }

        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        public final boolean getFlipVertically() {
            return this.flipVertically;
        }

        public final Exception getError() {
            return this.error;
        }
    }
}
