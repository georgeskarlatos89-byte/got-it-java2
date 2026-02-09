package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ¥\u00012\u00020\u0001:\u0006¥\u0001¦\u0001§\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0017J\u0006\u0010R\u001a\u00020JJ \u0010S\u001a\u00020J2\b\u0010T\u001a\u0004\u0018\u00010#2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000bJ\u0006\u0010W\u001a\u00020JJ\u000e\u0010X\u001a\u00020J2\u0006\u00109\u001a\u000208J\u000e\u0010Y\u001a\u00020J2\u0006\u0010Z\u001a\u00020<J\u000e\u0010[\u001a\u00020J2\u0006\u0010\\\u001a\u00020\u0012J\u0010\u0010]\u001a\u00020J2\b\u0010^\u001a\u0004\u0018\u00010BJ\u000e\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020\tJ\u000e\u0010a\u001a\u00020J2\u0006\u0010b\u001a\u00020\u000bJ\u000e\u0010c\u001a\u00020J2\u0006\u00105\u001a\u000204J\u000e\u0010d\u001a\u00020J2\u0006\u0010e\u001a\u00020\u0012J\u000e\u0010n\u001a\u00020J2\u0006\u0010o\u001a\u00020\tJ\u000e\u0010p\u001a\u00020J2\u0006\u0010q\u001a\u00020\tJ\u000e\u0010r\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u0012J\u000e\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0012J\u0016\u0010v\u001a\u00020J2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000bJ\u0016\u0010y\u001a\u00020J2\u0006\u0010z\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020\u000bJ'\u0010|\u001a\u00020J2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tJ\u0007\u0010\u0001\u001a\u00020JJ\u0010\u0010\u0001\u001a\u00020J2\u0007\u0010\u0001\u001a\u00020\u000eJ\t\u0010\u0001\u001a\u00020JH\u0002J\u0011\u0010\u0001\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0019H\u0002J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0014J\t\u0010\u0001\u001a\u00020JH\u0003J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u0001H\u0002J-\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010L\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J-\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010L\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J6\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010L\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J-\u0010\u0001\u001a\u00020J2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010L\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002J\u0013\u0010\u0001\u001a\u00020\u00122\b\u0010\u0001\u001a\u00030\u0001H\u0017J\u001b\u0010\u0001\u001a\u00020J2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020\tH\u0002J\t\u0010¡\u0001\u001a\u00020JH\u0002J\u001b\u0010¢\u0001\u001a\u00020J2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020\tH\u0002J\u0011\u0010£\u0001\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0004\u0018\u0001042\b\u0010.\u001a\u0004\u0018\u000104@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\"\u00109\u001a\u0004\u0018\u0001082\b\u0010.\u001a\u0004\u0018\u000108@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\"\u0010=\u001a\u0004\u0018\u00010<2\b\u0010.\u001a\u0004\u0018\u00010<@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010M\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00198F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010f\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010k\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR-\u0010\u0001\u001a\u0004\u0018\u00010F2\b\u0010L\u001a\u0004\u0018\u00010F8F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00128BX\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u00100¨\u0006¨\u0001"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mCropCornerRadius", "", "mCircleCornerFillColor", "", "Ljava/lang/Integer;", "mOptions", "Lcom/canhub/cropper/CropImageOptions;", "mScaleDetector", "Landroid/view/ScaleGestureDetector;", "mMultiTouchEnabled", "", "mCenterMoveEnabled", "mCropWindowHandler", "Lcom/canhub/cropper/CropWindowHandler;", "mCropWindowChangeListener", "Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;", "mDrawRect", "Landroid/graphics/RectF;", "mBorderPaint", "Landroid/graphics/Paint;", "mBorderCornerPaint", "mGuidelinePaint", "mBackgroundPaint", "textLabelPaint", "mPath", "Landroid/graphics/Path;", "mBoundsPoints", "", "mCalcBounds", "mViewWidth", "mViewHeight", "mBorderCornerOffset", "mBorderCornerLength", "mInitialCropWindowPaddingRatio", "mTouchRadius", "mSnapRadius", "mMoveHandler", "Lcom/canhub/cropper/CropWindowMoveHandler;", "value", "isFixAspectRatio", "()Z", "mAspectRatioX", "mAspectRatioY", "mTargetAspectRatio", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "isCropLabelEnabled", "cropLabelText", "", "cropLabelTextSize", "cropLabelTextColor", "mInitialCropWindowRect", "Landroid/graphics/Rect;", "initializedCropWindow", "maxVerticalGestureExclusion", "setCropWindowChangeListener", "", "listener", "rect", "cropWindowRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "(Landroid/graphics/RectF;)V", "fixCurrentCropWindowRect", "setBounds", "boundsPoints", "viewWidth", "viewHeight", "resetCropOverlayView", "setCropShape", "setCropCornerShape", "cropCornerShape", "setCropperTextLabelVisibility", "isEnabled", "setCropLabelText", "textLabel", "setCropLabelTextSize", "textSize", "setCropLabelTextColor", "textColor", "setGuidelines", "setFixedAspectRatio", "fixAspectRatio", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "(I)V", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "setSnapRadius", "snapRadius", "setCropCornerRadius", "cornerRadius", "setMultiTouchEnabled", "multiTouchEnabled", "setCenterMoveEnabled", "centerMoveEnabled", "setMinCropResultSize", "minCropResultWidth", "minCropResultHeight", "setMaxCropResultSize", "maxCropResultWidth", "maxCropResultHeight", "setCropWindowLimits", "maxWidth", "maxHeight", "scaleFactorWidth", "scaleFactorHeight", "initialCropWindowRect", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "resetCropWindowRect", "setInitialAttributeValues", "options", "initCropWindow", "fixCropWindowRectByRules", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setSystemGestureExclusionRects", "drawCropLabelText", "drawBackground", "drawGuidelines", "drawBorders", "drawCorners", "drawCornerBasedOnShape", "cornerOffset", "cornerExtension", "drawLineShape", "drawCornerShape", "radius", "drawCircleShape", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onActionDown", "x", "y", "onActionUp", "onActionMove", "calculateBounds", "isNonStraightAngleRotated", "Companion", "CropWindowChangeListener", "ScaleListener", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: CropOverlayView.kt */
public final class CropOverlayView extends View {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private CropImageView.CropCornerShape cornerShape;
    private String cropLabelText;
    private int cropLabelTextColor;
    private float cropLabelTextSize;
    private CropImageView.CropShape cropShape;
    private CropImageView.Guidelines guidelines;
    private boolean initializedCropWindow;
    private boolean isCropLabelEnabled;
    private boolean isFixAspectRatio;
    private int mAspectRatioX;
    private int mAspectRatioY;
    private Paint mBackgroundPaint;
    private float mBorderCornerLength;
    private float mBorderCornerOffset;
    private Paint mBorderCornerPaint;
    private Paint mBorderPaint;
    private final float[] mBoundsPoints;
    private final RectF mCalcBounds;
    private boolean mCenterMoveEnabled;
    private Integer mCircleCornerFillColor;
    private float mCropCornerRadius;
    private CropWindowChangeListener mCropWindowChangeListener;
    /* access modifiers changed from: private */
    public final CropWindowHandler mCropWindowHandler;
    private final RectF mDrawRect;
    private Paint mGuidelinePaint;
    private float mInitialCropWindowPaddingRatio;
    private final Rect mInitialCropWindowRect;
    private CropWindowMoveHandler mMoveHandler;
    private boolean mMultiTouchEnabled;
    private CropImageOptions mOptions;
    private final Path mPath;
    private ScaleGestureDetector mScaleDetector;
    private float mSnapRadius;
    private float mTargetAspectRatio;
    private float mTouchRadius;
    private int mViewHeight;
    private int mViewWidth;
    private final float maxVerticalGestureExclusion;
    private Paint textLabelPaint;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bà\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;", "", "onCropWindowChanged", "", "inProgress", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropOverlayView.kt */
    public interface CropWindowChangeListener {
        void onCropWindowChanged(boolean z);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropOverlayView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                com.canhub.cropper.CropImageView$CropShape[] r0 = com.canhub.cropper.CropImageView.CropShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.canhub.cropper.CropImageView$CropShape r2 = com.canhub.cropper.CropImageView.CropShape.RECTANGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.canhub.cropper.CropImageView$CropShape r3 = com.canhub.cropper.CropImageView.CropShape.RECTANGLE_VERTICAL_ONLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.canhub.cropper.CropImageView$CropShape r3 = com.canhub.cropper.CropImageView.CropShape.RECTANGLE_HORIZONTAL_ONLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.canhub.cropper.CropImageView$CropShape r3 = com.canhub.cropper.CropImageView.CropShape.OVAL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                com.canhub.cropper.CropImageView$CropCornerShape[] r0 = com.canhub.cropper.CropImageView.CropCornerShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.canhub.cropper.CropImageView$CropCornerShape r3 = com.canhub.cropper.CropImageView.CropCornerShape.OVAL     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.canhub.cropper.CropImageView$CropCornerShape r1 = com.canhub.cropper.CropImageView.CropCornerShape.RECTANGLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropOverlayView.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CropOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$Companion;", "", "<init>", "()V", "getTextPaint", "Landroid/graphics/Paint;", "options", "Lcom/canhub/cropper/CropImageOptions;", "getTextPaint$cropper_release", "getNewPaint", "color", "", "getNewPaint$cropper_release", "getNewPaintOrNull", "thickness", "", "getNewPaintOrNull$cropper_release", "getNewPaintWithFill", "getNewPaintWithFill$cropper_release", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropOverlayView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Paint getTextPaint$cropper_release(CropImageOptions cropImageOptions) {
            Intrinsics.checkNotNullParameter(cropImageOptions, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(cropImageOptions.cropperLabelTextSize);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(cropImageOptions.cropperLabelTextColor);
            return paint;
        }

        public final Paint getNewPaint$cropper_release(int i) {
            Paint paint = new Paint();
            paint.setColor(i);
            return paint;
        }

        public final Paint getNewPaintOrNull$cropper_release(float f, int i) {
            if (f <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        public final Paint getNewPaintWithFill$cropper_release(int i) {
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCenterMoveEnabled = true;
        this.mCropWindowHandler = new CropWindowHandler();
        this.mDrawRect = new RectF();
        this.mPath = new Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new RectF();
        this.mTargetAspectRatio = ((float) this.mAspectRatioX) / ((float) this.mAspectRatioY);
        this.cropLabelText = "";
        this.cropLabelTextSize = 20.0f;
        this.cropLabelTextColor = -1;
        this.mInitialCropWindowRect = new Rect();
        this.maxVerticalGestureExclusion = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    public final boolean isFixAspectRatio() {
        return this.isFixAspectRatio;
    }

    public final CropImageView.Guidelines getGuidelines() {
        return this.guidelines;
    }

    public final CropImageView.CropShape getCropShape() {
        return this.cropShape;
    }

    public final CropImageView.CropCornerShape getCornerShape() {
        return this.cornerShape;
    }

    public final void setCropWindowChangeListener(CropWindowChangeListener cropWindowChangeListener) {
        this.mCropWindowChangeListener = cropWindowChangeListener;
    }

    public final RectF getCropWindowRect() {
        return this.mCropWindowHandler.getRect();
    }

    public final void setCropWindowRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        this.mCropWindowHandler.setRect(rectF);
    }

    public final void fixCurrentCropWindowRect() {
        RectF cropWindowRect = getCropWindowRect();
        fixCropWindowRectByRules(cropWindowRect);
        this.mCropWindowHandler.setRect(cropWindowRect);
    }

    public final void setBounds(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.mBoundsPoints, fArr)) {
            boolean z = false;
            if (fArr == null) {
                Arrays.fill(this.mBoundsPoints, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.mBoundsPoints, 0, fArr.length);
            }
            this.mViewWidth = i;
            this.mViewHeight = i2;
            RectF rect = this.mCropWindowHandler.getRect();
            if (!(rect.width() == 0.0f)) {
                if (rect.height() == 0.0f) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            initCropWindow();
        }
    }

    public final void resetCropOverlayView() {
        if (this.initializedCropWindow) {
            setCropWindowRect(BitmapUtils.INSTANCE.getEMPTY_RECT_F());
            initCropWindow();
            invalidate();
        }
    }

    public final void setCropShape(CropImageView.CropShape cropShape2) {
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        if (this.cropShape != cropShape2) {
            this.cropShape = cropShape2;
            invalidate();
        }
    }

    public final void setCropCornerShape(CropImageView.CropCornerShape cropCornerShape) {
        Intrinsics.checkNotNullParameter(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropperTextLabelVisibility(boolean z) {
        this.isCropLabelEnabled = z;
        invalidate();
    }

    public final void setCropLabelText(String str) {
        if (str != null) {
            this.cropLabelText = str;
        }
    }

    public final void setCropLabelTextSize(float f) {
        this.cropLabelTextSize = f;
        invalidate();
    }

    public final void setCropLabelTextColor(int i) {
        this.cropLabelTextColor = i;
        invalidate();
    }

    public final void setGuidelines(CropImageView.Guidelines guidelines2) {
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        if (this.guidelines != guidelines2) {
            this.guidelines = guidelines2;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public final void setFixedAspectRatio(boolean z) {
        if (this.isFixAspectRatio != z) {
            this.isFixAspectRatio = z;
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public final int getAspectRatioX() {
        return this.mAspectRatioX;
    }

    public final void setAspectRatioX(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
        } else if (this.mAspectRatioX != i) {
            this.mAspectRatioX = i;
            this.mTargetAspectRatio = ((float) i) / ((float) this.mAspectRatioY);
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public final int getAspectRatioY() {
        return this.mAspectRatioY;
    }

    public final void setAspectRatioY(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
        } else if (this.mAspectRatioY != i) {
            this.mAspectRatioY = i;
            this.mTargetAspectRatio = ((float) this.mAspectRatioX) / ((float) i);
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public final void setSnapRadius(float f) {
        this.mSnapRadius = f;
    }

    public final void setCropCornerRadius(float f) {
        this.mCropCornerRadius = f;
    }

    public final boolean setMultiTouchEnabled(boolean z) {
        if (this.mMultiTouchEnabled == z) {
            return false;
        }
        this.mMultiTouchEnabled = z;
        if (!z || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
        return true;
    }

    public final boolean setCenterMoveEnabled(boolean z) {
        if (this.mCenterMoveEnabled == z) {
            return false;
        }
        this.mCenterMoveEnabled = z;
        return true;
    }

    public final void setMinCropResultSize(int i, int i2) {
        this.mCropWindowHandler.setMinCropResultSize(i, i2);
    }

    public final void setMaxCropResultSize(int i, int i2) {
        this.mCropWindowHandler.setMaxCropResultSize(i, i2);
    }

    public final void setCropWindowLimits(float f, float f2, float f3, float f4) {
        this.mCropWindowHandler.setCropWindowLimits(f, f2, f3, f4);
    }

    public final Rect getInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = BitmapUtils.INSTANCE.getEMPTY_RECT();
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            initCropWindow();
            invalidate();
            CropWindowChangeListener cropWindowChangeListener = this.mCropWindowChangeListener;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.onCropWindowChanged(false);
            }
        }
    }

    public final void resetCropWindowRect() {
        if (this.initializedCropWindow) {
            initCropWindow();
            invalidate();
            CropWindowChangeListener cropWindowChangeListener = this.mCropWindowChangeListener;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.onCropWindowChanged(false);
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        CropWindowChangeListener cropWindowChangeListener;
        Intrinsics.checkNotNullParameter(cropImageOptions, "options");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual((Object) this.mOptions, (Object) cropImageOptions);
        CropImageOptions cropImageOptions2 = this.mOptions;
        if (cropImageOptions2 != null && cropImageOptions.fixAspectRatio == cropImageOptions2.fixAspectRatio) {
            CropImageOptions cropImageOptions3 = this.mOptions;
            if (cropImageOptions3 != null && cropImageOptions.aspectRatioX == cropImageOptions3.aspectRatioX) {
                CropImageOptions cropImageOptions4 = this.mOptions;
                if (cropImageOptions4 != null && cropImageOptions.aspectRatioY == cropImageOptions4.aspectRatioY) {
                    z = false;
                }
            }
        }
        this.mOptions = cropImageOptions;
        this.mCropWindowHandler.setMinCropResultSize(cropImageOptions.minCropResultWidth, cropImageOptions.minCropResultHeight);
        this.mCropWindowHandler.setMaxCropResultSize(cropImageOptions.maxCropResultWidth, cropImageOptions.maxCropResultHeight);
        if (z2) {
            this.mCropWindowHandler.setInitialAttributeValues(cropImageOptions);
            this.cropLabelTextColor = cropImageOptions.cropperLabelTextColor;
            this.cropLabelTextSize = cropImageOptions.cropperLabelTextSize;
            String str = cropImageOptions.cropperLabelText;
            if (str == null) {
                str = "";
            }
            this.cropLabelText = str;
            this.isCropLabelEnabled = cropImageOptions.showCropLabel;
            this.mCropCornerRadius = cropImageOptions.cropCornerRadius;
            this.cornerShape = cropImageOptions.cornerShape;
            this.cropShape = cropImageOptions.cropShape;
            this.mSnapRadius = cropImageOptions.snapRadius;
            setEnabled(cropImageOptions.canChangeCropWindow);
            this.guidelines = cropImageOptions.guidelines;
            this.isFixAspectRatio = cropImageOptions.fixAspectRatio;
            setAspectRatioX(cropImageOptions.aspectRatioX);
            setAspectRatioY(cropImageOptions.aspectRatioY);
            boolean z3 = cropImageOptions.multiTouchEnabled;
            this.mMultiTouchEnabled = z3;
            if (z3 && this.mScaleDetector == null) {
                this.mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
            }
            this.mCenterMoveEnabled = cropImageOptions.centerMoveEnabled;
            this.mTouchRadius = cropImageOptions.touchRadius;
            this.mInitialCropWindowPaddingRatio = cropImageOptions.initialCropWindowPaddingRatio;
            Companion companion = Companion;
            this.mBorderPaint = companion.getNewPaintOrNull$cropper_release(cropImageOptions.borderLineThickness, cropImageOptions.borderLineColor);
            this.mBorderCornerOffset = cropImageOptions.borderCornerOffset;
            this.mBorderCornerLength = cropImageOptions.borderCornerLength;
            this.mCircleCornerFillColor = Integer.valueOf(cropImageOptions.circleCornerFillColorHexValue);
            this.mBorderCornerPaint = companion.getNewPaintOrNull$cropper_release(cropImageOptions.borderCornerThickness, cropImageOptions.borderCornerColor);
            this.mGuidelinePaint = companion.getNewPaintOrNull$cropper_release(cropImageOptions.guidelinesThickness, cropImageOptions.guidelinesColor);
            this.mBackgroundPaint = companion.getNewPaint$cropper_release(cropImageOptions.backgroundColor);
            this.textLabelPaint = companion.getTextPaint$cropper_release(cropImageOptions);
            if (z) {
                initCropWindow();
            }
            invalidate();
            if (z && (cropWindowChangeListener = this.mCropWindowChangeListener) != null) {
                cropWindowChangeListener.onCropWindowChanged(false);
            }
        }
    }

    private final void initCropWindow() {
        float max = Math.max(BitmapUtils.INSTANCE.getRectLeft(this.mBoundsPoints), 0.0f);
        float max2 = Math.max(BitmapUtils.INSTANCE.getRectTop(this.mBoundsPoints), 0.0f);
        float min = Math.min(BitmapUtils.INSTANCE.getRectRight(this.mBoundsPoints), (float) getWidth());
        float min2 = Math.min(BitmapUtils.INSTANCE.getRectBottom(this.mBoundsPoints), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.initializedCropWindow = true;
            float f = this.mInitialCropWindowPaddingRatio;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
                rectF.left = (((float) this.mInitialCropWindowRect.left) / this.mCropWindowHandler.getScaleFactorWidth()) + max;
                rectF.top = (((float) this.mInitialCropWindowRect.top) / this.mCropWindowHandler.getScaleFactorHeight()) + max2;
                rectF.right = rectF.left + (((float) this.mInitialCropWindowRect.width()) / this.mCropWindowHandler.getScaleFactorWidth());
                rectF.bottom = rectF.top + (((float) this.mInitialCropWindowRect.height()) / this.mCropWindowHandler.getScaleFactorHeight());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.isFixAspectRatio || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.mTargetAspectRatio) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.mTargetAspectRatio = ((float) this.mAspectRatioX) / ((float) this.mAspectRatioY);
                float max3 = Math.max(this.mCropWindowHandler.getMinCropWidth(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(this.mCropWindowHandler.getMinCropHeight(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            fixCropWindowRectByRules(rectF);
            this.mCropWindowHandler.setRect(rectF);
        }
    }

    private final void fixCropWindowRectByRules(RectF rectF) {
        if (rectF.width() < this.mCropWindowHandler.getMinCropWidth()) {
            float minCropWidth = (this.mCropWindowHandler.getMinCropWidth() - rectF.width()) / ((float) 2);
            rectF.left -= minCropWidth;
            rectF.right += minCropWidth;
        }
        if (rectF.height() < this.mCropWindowHandler.getMinCropHeight()) {
            float minCropHeight = (this.mCropWindowHandler.getMinCropHeight() - rectF.height()) / ((float) 2);
            rectF.top -= minCropHeight;
            rectF.bottom += minCropHeight;
        }
        if (rectF.width() > this.mCropWindowHandler.getMaxCropWidth()) {
            float width = (rectF.width() - this.mCropWindowHandler.getMaxCropWidth()) / ((float) 2);
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.mCropWindowHandler.getMaxCropHeight()) {
            float height = (rectF.height() - this.mCropWindowHandler.getMaxCropHeight()) / ((float) 2);
            rectF.top += height;
            rectF.bottom -= height;
        }
        calculateBounds(rectF);
        if (this.mCalcBounds.width() > 0.0f && this.mCalcBounds.height() > 0.0f) {
            float max = Math.max(this.mCalcBounds.left, 0.0f);
            float max2 = Math.max(this.mCalcBounds.top, 0.0f);
            float min = Math.min(this.mCalcBounds.right, (float) getWidth());
            float min2 = Math.min(this.mCalcBounds.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.isFixAspectRatio && ((double) Math.abs(rectF.width() - (rectF.height() * this.mTargetAspectRatio))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.mTargetAspectRatio) {
                float abs = Math.abs((rectF.height() * this.mTargetAspectRatio) - rectF.width()) / ((float) 2);
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.mTargetAspectRatio) - rectF.height()) / ((float) 2);
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawBackground(canvas);
        if (this.mCropWindowHandler.showGuidelines()) {
            if (this.guidelines == CropImageView.Guidelines.ON) {
                drawGuidelines(canvas);
            } else if (this.guidelines == CropImageView.Guidelines.ON_TOUCH && this.mMoveHandler != null) {
                drawGuidelines(canvas);
            }
        }
        Companion companion = Companion;
        CropImageOptions cropImageOptions = this.mOptions;
        float f = cropImageOptions != null ? cropImageOptions.borderCornerThickness : 0.0f;
        CropImageOptions cropImageOptions2 = this.mOptions;
        this.mBorderCornerPaint = companion.getNewPaintOrNull$cropper_release(f, cropImageOptions2 != null ? cropImageOptions2.borderCornerColor : -1);
        drawCropLabelText(canvas);
        drawBorders(canvas);
        drawCorners(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects();
        }
    }

    private final void setSystemGestureExclusionRects() {
        RectF rect = this.mCropWindowHandler.getRect();
        List systemGestureExclusionRects = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect2 = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
        List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect3 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
        List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect4 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
        rect2.left = (int) (rect.left - this.mTouchRadius);
        rect2.right = (int) (rect.right + this.mTouchRadius);
        rect2.top = (int) (rect.top - this.mTouchRadius);
        rect2.bottom = (int) (((float) rect2.top) + (this.maxVerticalGestureExclusion * 0.3f));
        rect3.left = rect2.left;
        rect3.right = rect2.right;
        rect3.top = (int) (((rect.top + rect.bottom) / 2.0f) - (this.maxVerticalGestureExclusion * 0.2f));
        rect3.bottom = (int) (((float) rect3.top) + (this.maxVerticalGestureExclusion * 0.4f));
        rect4.left = rect2.left;
        rect4.right = rect2.right;
        rect4.bottom = (int) (rect.bottom + this.mTouchRadius);
        rect4.top = (int) (((float) rect4.bottom) - (this.maxVerticalGestureExclusion * 0.3f));
        setSystemGestureExclusionRects(CollectionsKt.listOf(rect2, rect3, rect4));
    }

    private final void drawCropLabelText(Canvas canvas) {
        if (this.isCropLabelEnabled) {
            RectF rect = this.mCropWindowHandler.getRect();
            float f = (rect.left + rect.right) / ((float) 2);
            float f2 = rect.top - ((float) 50);
            Paint paint = this.textLabelPaint;
            if (paint != null) {
                paint.setTextSize(this.cropLabelTextSize);
                paint.setColor(this.cropLabelTextColor);
            }
            String str = this.cropLabelText;
            Paint paint2 = this.textLabelPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawText(str, f, f2, paint2);
            canvas.save();
        }
    }

    private final void drawBackground(Canvas canvas) {
        RectF rect = this.mCropWindowHandler.getRect();
        float max = Math.max(BitmapUtils.INSTANCE.getRectLeft(this.mBoundsPoints), 0.0f);
        float max2 = Math.max(BitmapUtils.INSTANCE.getRectTop(this.mBoundsPoints), 0.0f);
        float min = Math.min(BitmapUtils.INSTANCE.getRectRight(this.mBoundsPoints), (float) getWidth());
        float min2 = Math.min(BitmapUtils.INSTANCE.getRectBottom(this.mBoundsPoints), (float) getHeight());
        CropImageView.CropShape cropShape2 = this.cropShape;
        int i = cropShape2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cropShape2.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (!isNonStraightAngleRotated()) {
                float f = rect.top;
                Paint paint = this.mBackgroundPaint;
                Intrinsics.checkNotNull(paint);
                Canvas canvas2 = canvas;
                float f2 = max;
                float f3 = min;
                canvas2.drawRect(f2, max2, f3, f, paint);
                float f4 = rect.bottom;
                Paint paint2 = this.mBackgroundPaint;
                Intrinsics.checkNotNull(paint2);
                canvas2.drawRect(f2, f4, f3, min2, paint2);
                float f5 = rect.top;
                float f6 = rect.left;
                float f7 = rect.bottom;
                Paint paint3 = this.mBackgroundPaint;
                Intrinsics.checkNotNull(paint3);
                canvas2.drawRect(f2, f5, f6, f7, paint3);
                float f8 = rect.right;
                float f9 = rect.top;
                float f10 = rect.bottom;
                Paint paint4 = this.mBackgroundPaint;
                Intrinsics.checkNotNull(paint4);
                canvas.drawRect(f8, f9, min, f10, paint4);
                return;
            }
            this.mPath.reset();
            Path path = this.mPath;
            float[] fArr = this.mBoundsPoints;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.mPath;
            float[] fArr2 = this.mBoundsPoints;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.mPath;
            float[] fArr3 = this.mBoundsPoints;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.mPath;
            float[] fArr4 = this.mBoundsPoints;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.mPath.close();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.INTERSECT);
            }
            Paint paint5 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint5);
            canvas.drawRect(max, max2, min, min2, paint5);
            canvas.restore();
        } else if (i == 4) {
            this.mPath.reset();
            this.mDrawRect.set(rect.left, rect.top, rect.right, rect.bottom);
            this.mPath.addOval(this.mDrawRect, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.XOR);
            }
            Paint paint6 = this.mBackgroundPaint;
            Intrinsics.checkNotNull(paint6);
            canvas.drawRect(max, max2, min, min2, paint6);
            canvas.restore();
        } else {
            throw new IllegalStateException("Unrecognized crop shape");
        }
    }

    private final void drawGuidelines(Canvas canvas) {
        float f;
        if (this.mGuidelinePaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            RectF rect = this.mCropWindowHandler.getRect();
            rect.inset(f, f);
            float f2 = (float) 3;
            float width = rect.width() / f2;
            float height = rect.height() / f2;
            CropImageView.CropShape cropShape2 = this.cropShape;
            int i = cropShape2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cropShape2.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                float f3 = rect.left + width;
                float f4 = rect.right - width;
                float f5 = rect.top;
                float f6 = rect.bottom;
                Paint paint2 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint2);
                Canvas canvas2 = canvas;
                canvas2.drawLine(f3, f5, f3, f6, paint2);
                float f7 = rect.top;
                float f8 = rect.bottom;
                Paint paint3 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawLine(f4, f7, f4, f8, paint3);
                float f9 = rect.top + height;
                float f10 = rect.bottom - height;
                float f11 = rect.left;
                float f12 = rect.right;
                Paint paint4 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint4);
                canvas2.drawLine(f11, f9, f12, f9, paint4);
                float f13 = rect.left;
                float f14 = rect.right;
                Paint paint5 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint5);
                canvas.drawLine(f13, f10, f14, f10, paint5);
            } else if (i == 4) {
                float f15 = (float) 2;
                float width2 = (rect.width() / f15) - f;
                float height2 = (rect.height() / f15) - f;
                float f16 = rect.left + width;
                float f17 = rect.right - width;
                float sin = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                Paint paint6 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint6);
                canvas.drawLine(f16, (rect.top + height2) - sin, f16, (rect.bottom - height2) + sin, paint6);
                float f18 = (rect.top + height2) - sin;
                float f19 = (rect.bottom - height2) + sin;
                Paint paint7 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint7);
                canvas.drawLine(f17, f18, f17, f19, paint7);
                float f20 = rect.top + height;
                float f21 = rect.bottom - height;
                float cos = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                Paint paint8 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint8);
                canvas.drawLine((rect.left + width2) - cos, f20, (rect.right - width2) + cos, f20, paint8);
                float f22 = (rect.left + width2) - cos;
                float f23 = (rect.right - width2) + cos;
                Paint paint9 = this.mGuidelinePaint;
                Intrinsics.checkNotNull(paint9);
                canvas.drawLine(f22, f21, f23, f21, paint9);
            } else {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        }
    }

    private final void drawBorders(Canvas canvas) {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            Intrinsics.checkNotNull(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rect = this.mCropWindowHandler.getRect();
            float f = strokeWidth / ((float) 2);
            rect.inset(f, f);
            CropImageView.CropShape cropShape2 = this.cropShape;
            int i = cropShape2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cropShape2.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                Paint paint2 = this.mBorderPaint;
                Intrinsics.checkNotNull(paint2);
                canvas.drawRect(rect, paint2);
            } else if (i == 4) {
                Paint paint3 = this.mBorderPaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawOval(rect, paint3);
            } else {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        }
    }

    private final void drawCorners(Canvas canvas) {
        float f;
        if (this.mBorderCornerPaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            float f2 = (float) 2;
            float f3 = (strokeWidth - f) / f2;
            float f4 = strokeWidth / f2;
            float f5 = f4 + f3;
            CropImageView.CropShape cropShape2 = this.cropShape;
            int i = cropShape2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cropShape2.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                f4 += this.mBorderCornerOffset;
            } else if (i != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rect = this.mCropWindowHandler.getRect();
            rect.inset(f4, f4);
            drawCornerBasedOnShape(canvas, rect, f3, f5);
            if (this.cornerShape == CropImageView.CropCornerShape.OVAL) {
                Integer num = this.mCircleCornerFillColor;
                this.mBorderCornerPaint = num != null ? Companion.getNewPaintWithFill$cropper_release(num.intValue()) : null;
                drawCornerBasedOnShape(canvas, rect, f3, f5);
            }
        }
    }

    private final void drawCornerBasedOnShape(Canvas canvas, RectF rectF, float f, float f2) {
        RectF rectF2 = rectF;
        CropImageView.CropShape cropShape2 = this.cropShape;
        int i = cropShape2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cropShape2.ordinal()];
        if (i == 1) {
            drawCornerShape(canvas, rectF, f, f2, this.mCropCornerRadius);
        } else if (i == 2) {
            Paint paint = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint);
            Canvas canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - this.mBorderCornerLength, rectF2.top - f, rectF.centerX() + this.mBorderCornerLength, rectF2.top - f, paint);
            Paint paint2 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint2);
            canvas2.drawLine(rectF.centerX() - this.mBorderCornerLength, rectF2.bottom + f, rectF.centerX() + this.mBorderCornerLength, rectF2.bottom + f, paint2);
        } else if (i == 3) {
            Paint paint3 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint3);
            Canvas canvas3 = canvas;
            canvas3.drawLine(rectF2.left - f, rectF.centerY() - this.mBorderCornerLength, rectF2.left - f, rectF.centerY() + this.mBorderCornerLength, paint3);
            Paint paint4 = this.mBorderCornerPaint;
            Intrinsics.checkNotNull(paint4);
            canvas3.drawLine(rectF2.right + f, rectF.centerY() - this.mBorderCornerLength, rectF2.right + f, rectF.centerY() + this.mBorderCornerLength, paint4);
        } else if (i == 4) {
            drawLineShape(canvas, rectF, f, f2);
        } else {
            throw new IllegalStateException("Unrecognized crop shape");
        }
    }

    private final void drawLineShape(Canvas canvas, RectF rectF, float f, float f2) {
        float f3 = rectF.left - f;
        float f4 = rectF.top - f2;
        float f5 = rectF.left - f;
        float f6 = rectF.top + this.mBorderCornerLength;
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawLine(f3, f4, f5, f6, paint);
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawLine(rectF.left - f2, rectF.top - f, rectF.left + this.mBorderCornerLength, rectF.top - f, paint2);
        float f7 = rectF.right + f;
        float f8 = rectF.top - f2;
        float f9 = rectF.right + f;
        float f10 = rectF.top + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f7, f8, f9, f10, paint3);
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(rectF.right + f2, rectF.top - f, rectF.right - this.mBorderCornerLength, rectF.top - f, paint4);
        float f11 = rectF.left - f;
        float f12 = rectF.bottom + f2;
        float f13 = rectF.left - f;
        float f14 = rectF.bottom - this.mBorderCornerLength;
        Paint paint5 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint5);
        canvas.drawLine(f11, f12, f13, f14, paint5);
        Paint paint6 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint6);
        canvas.drawLine(rectF.left - f2, rectF.bottom + f, rectF.left + this.mBorderCornerLength, rectF.bottom + f, paint6);
        float f15 = rectF.right + f;
        float f16 = rectF.bottom + f2;
        float f17 = rectF.right + f;
        float f18 = rectF.bottom - this.mBorderCornerLength;
        Paint paint7 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint7);
        Canvas canvas2 = canvas;
        canvas2.drawLine(f15, f16, f17, f18, paint7);
        Paint paint8 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint8);
        canvas2.drawLine(rectF.right + f2, rectF.bottom + f, rectF.right - this.mBorderCornerLength, rectF.bottom + f, paint8);
    }

    private final void drawCornerShape(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        CropImageView.CropCornerShape cropCornerShape = this.cornerShape;
        int i = cropCornerShape == null ? -1 : WhenMappings.$EnumSwitchMapping$1[cropCornerShape.ordinal()];
        if (i == -1) {
            return;
        }
        if (i == 1) {
            drawCircleShape(canvas, rectF, f, f3);
        } else if (i == 2) {
            drawLineShape(canvas, rectF, f, f2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void drawCircleShape(Canvas canvas, RectF rectF, float f, float f2) {
        Paint paint = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(rectF.left - f, rectF.top - f, f2, paint);
        Paint paint2 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawCircle(rectF.right + f, rectF.top - f, f2, paint2);
        Paint paint3 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawCircle(rectF.left - f, rectF.bottom + f, f2, paint3);
        float f3 = rectF.right + f;
        float f4 = rectF.bottom + f;
        Paint paint4 = this.mBorderCornerPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawCircle(f3, f4, f2, paint4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled && (scaleGestureDetector = this.mScaleDetector) != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    onActionMove(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            onActionUp();
        } else {
            onActionDown(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    private final void onActionDown(float f, float f2) {
        CropWindowHandler cropWindowHandler = this.mCropWindowHandler;
        float f3 = this.mTouchRadius;
        CropImageView.CropShape cropShape2 = this.cropShape;
        Intrinsics.checkNotNull(cropShape2);
        CropWindowMoveHandler moveHandler = cropWindowHandler.getMoveHandler(f, f2, f3, cropShape2, this.mCenterMoveEnabled);
        this.mMoveHandler = moveHandler;
        if (moveHandler != null) {
            invalidate();
        }
    }

    private final void onActionUp() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            CropWindowChangeListener cropWindowChangeListener = this.mCropWindowChangeListener;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.onCropWindowChanged(false);
            }
            invalidate();
        }
    }

    private final void onActionMove(float f, float f2) {
        if (this.mMoveHandler != null) {
            float f3 = this.mSnapRadius;
            RectF rect = this.mCropWindowHandler.getRect();
            if (calculateBounds(rect)) {
                f3 = 0.0f;
            }
            CropWindowMoveHandler cropWindowMoveHandler = this.mMoveHandler;
            Intrinsics.checkNotNull(cropWindowMoveHandler);
            RectF rectF = rect;
            float f4 = f;
            float f5 = f2;
            cropWindowMoveHandler.move(rectF, f4, f5, this.mCalcBounds, this.mViewWidth, this.mViewHeight, f3, this.isFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.setRect(rect);
            CropWindowChangeListener cropWindowChangeListener = this.mCropWindowChangeListener;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.onCropWindowChanged(true);
            }
            invalidate();
        }
    }

    private final boolean calculateBounds(RectF rectF) {
        float f;
        float f2;
        RectF rectF2 = rectF;
        float rectLeft = BitmapUtils.INSTANCE.getRectLeft(this.mBoundsPoints);
        float rectTop = BitmapUtils.INSTANCE.getRectTop(this.mBoundsPoints);
        float rectRight = BitmapUtils.INSTANCE.getRectRight(this.mBoundsPoints);
        float rectBottom = BitmapUtils.INSTANCE.getRectBottom(this.mBoundsPoints);
        if (!isNonStraightAngleRotated()) {
            this.mCalcBounds.set(rectLeft, rectTop, rectRight, rectBottom);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        if (f8 < f4) {
            float f9 = fArr[3];
            if (f4 < f9) {
                float f10 = fArr[2];
                f4 = f6;
                f2 = f7;
                f6 = f9;
                f = f8;
                float f11 = f5;
                f5 = f10;
                f3 = f11;
            } else {
                float f12 = f3;
                f3 = fArr[2];
                f2 = f5;
                f5 = f12;
                float f13 = f6;
                f6 = f4;
                f4 = f9;
                f = f13;
            }
        } else {
            f = fArr[3];
            if (f4 > f) {
                f2 = fArr[2];
                f5 = f7;
                f6 = f8;
            } else {
                f2 = f3;
                f = f4;
                f3 = f7;
                f4 = f8;
            }
        }
        float f14 = (f4 - f) / (f3 - f2);
        float f15 = -1.0f / f14;
        float f16 = f - (f14 * f2);
        float f17 = f - (f2 * f15);
        float f18 = f6 - (f14 * f5);
        float f19 = f6 - (f5 * f15);
        float centerY = (rectF.centerY() - rectF2.top) / (rectF.centerX() - rectF2.left);
        float f20 = -centerY;
        float f21 = rectF2.top - (rectF2.left * centerY);
        float f22 = rectF2.top - (rectF2.right * f20);
        float f23 = f14 - centerY;
        float f24 = (f21 - f16) / f23;
        float f25 = rectBottom;
        if (f24 >= rectF2.right) {
            f24 = rectLeft;
        }
        float max = Math.max(rectLeft, f24);
        float f26 = (f21 - f17) / (f15 - centerY);
        if (f26 >= rectF2.right) {
            f26 = max;
        }
        float max2 = Math.max(max, f26);
        float f27 = f15 - f20;
        float f28 = (f22 - f19) / f27;
        if (f28 >= rectF2.right) {
            f28 = max2;
        }
        float max3 = Math.max(max2, f28);
        float f29 = (f22 - f17) / f27;
        if (f29 <= rectF2.left) {
            f29 = rectRight;
        }
        float min = Math.min(rectRight, f29);
        float f30 = (f22 - f18) / (f14 - f20);
        if (f30 <= rectF2.left) {
            f30 = min;
        }
        float min2 = Math.min(min, f30);
        float f31 = (f21 - f18) / f23;
        if (f31 <= rectF2.left) {
            f31 = min2;
        }
        float min3 = Math.min(min2, f31);
        float max4 = Math.max(rectTop, Math.max((f14 * max3) + f16, (f15 * min3) + f17));
        float min4 = Math.min(f25, Math.min((f15 * max3) + f19, (f14 * min3) + f18));
        this.mCalcBounds.left = max3;
        this.mCalcBounds.top = max4;
        this.mCalcBounds.right = min3;
        this.mCalcBounds.bottom = min4;
        return true;
    }

    private final boolean isNonStraightAngleRotated() {
        float[] fArr = this.mBoundsPoints;
        if (fArr[0] == fArr[6]) {
            return false;
        }
        return !((fArr[1] > fArr[7] ? 1 : (fArr[1] == fArr[7] ? 0 : -1)) == 0);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropOverlayView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lcom/canhub/cropper/CropOverlayView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropOverlayView.kt */
    private final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "detector");
            RectF rect = CropOverlayView.this.mCropWindowHandler.getRect();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float f = (float) 2;
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / f;
            float f2 = focusY - currentSpanY;
            float f3 = focusX - currentSpanX;
            float f4 = focusX + currentSpanX;
            float f5 = focusY + currentSpanY;
            if (f3 >= f4 || f2 > f5 || f3 < 0.0f || f4 > CropOverlayView.this.mCropWindowHandler.getMaxCropWidth() || f2 < 0.0f || f5 > CropOverlayView.this.mCropWindowHandler.getMaxCropHeight()) {
                return true;
            }
            rect.set(f3, f2, f4, f5);
            CropOverlayView.this.mCropWindowHandler.setRect(rect);
            CropOverlayView.this.invalidate();
            return true;
        }
    }
}
