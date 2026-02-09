package com.canhub.cropper;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.canhub.cropper.CropImage;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.databinding.CropImageActivityBinding;
import com.canhub.cropper.utils.GetUriForFileKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.File;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\u001c\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001fH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0014J-\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00072\u000e\u00100\u001a\n\u0018\u000102j\u0004\u0018\u0001`1H\u0016¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0014H\u0016J\u0010\u00108\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;H\u0016J/\u0010<\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00072\u000e\u00100\u001a\n\u0018\u000102j\u0004\u0018\u0001`12\u0006\u0010=\u001a\u00020;H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\u0014H\u0016J/\u0010@\u001a\u00020A2\b\u0010/\u001a\u0004\u0018\u00010\u00072\u000e\u00100\u001a\n\u0018\u000102j\u0004\u0018\u0001`12\u0006\u0010=\u001a\u00020;H\u0016¢\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020;H\u0016J \u0010F\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020;H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;", "Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;", "<init>", "()V", "cropImageUri", "Landroid/net/Uri;", "cropImageOptions", "Lcom/canhub/cropper/CropImageOptions;", "cropImageView", "Lcom/canhub/cropper/CropImageView;", "binding", "Lcom/canhub/cropper/databinding/CropImageActivityBinding;", "latestTmpUri", "pickImageGallery", "Landroidx/activity/result/ActivityResultLauncher;", "", "takePicture", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setCustomizations", "showIntentChooser", "openSource", "source", "Lcom/canhub/cropper/CropImageActivity$Source;", "openCamera", "getTmpFileUri", "showImageSourceDialog", "Lkotlin/Function1;", "onStart", "onStop", "onSaveInstanceState", "outState", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPickImageResult", "resultUri", "onSetImageUriComplete", "view", "uri", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "onCropImageComplete", "result", "Lcom/canhub/cropper/CropImageView$CropResult;", "cropImage", "setCropImageView", "rotateImage", "degrees", "", "setResult", "sampleSize", "(Landroid/net/Uri;Ljava/lang/Exception;I)V", "setResultCancel", "getResultIntent", "Landroid/content/Intent;", "(Landroid/net/Uri;Ljava/lang/Exception;I)Landroid/content/Intent;", "updateMenuItemIconColor", "itemId", "color", "updateMenuItemTextColor", "Source", "Companion", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(message = "\n  Create your own Activity and use the CropImageView directly.\n  This way you can customize everything and have utter control of everything.\n  Feel free to use this Activity Code to create your own Activity.\n")
/* compiled from: CropImageActivity.kt */
public class CropImageActivity extends AppCompatActivity implements CropImageView.OnSetImageUriCompleteListener, CropImageView.OnCropImageCompleteListener {
    @Deprecated
    public static final String BUNDLE_KEY_TMP_URI = "bundle_key_tmp_uri";
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private CropImageActivityBinding binding;
    private CropImageOptions cropImageOptions;
    private Uri cropImageUri;
    private CropImageView cropImageView;
    private Uri latestTmpUri;
    private final ActivityResultLauncher<String> pickImageGallery = registerForActivityResult(new ActivityResultContracts.GetContent(), new CropImageActivity$$ExternalSyntheticLambda3(this));
    private final ActivityResultLauncher<Uri> takePicture = registerForActivityResult(new ActivityResultContracts.TakePicture(), new CropImageActivity$$ExternalSyntheticLambda4(this));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.canhub.cropper.CropImageActivity$Source[] r0 = com.canhub.cropper.CropImageActivity.Source.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.canhub.cropper.CropImageActivity$Source r1 = com.canhub.cropper.CropImageActivity.Source.CAMERA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.canhub.cropper.CropImageActivity$Source r1 = com.canhub.cropper.CropImageActivity.Source.GALLERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final void pickImageGallery$lambda$0(CropImageActivity cropImageActivity, Uri uri) {
        Intrinsics.checkNotNullParameter(cropImageActivity, "this$0");
        cropImageActivity.onPickImageResult(uri);
    }

    /* access modifiers changed from: private */
    public static final void takePicture$lambda$1(CropImageActivity cropImageActivity, boolean z) {
        Intrinsics.checkNotNullParameter(cropImageActivity, "this$0");
        if (z) {
            cropImageActivity.onPickImageResult(cropImageActivity.latestTmpUri);
        } else {
            cropImageActivity.onPickImageResult((Uri) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.canhub.cropper.CropImageOptions} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r2 == null) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r81) {
        /*
            r80 = this;
            r0 = r80
            r1 = r81
            super.onCreate(r81)
            android.view.LayoutInflater r2 = r80.getLayoutInflater()
            com.canhub.cropper.databinding.CropImageActivityBinding r2 = com.canhub.cropper.databinding.CropImageActivityBinding.inflate(r2)
            r0.binding = r2
            java.lang.String r3 = "binding"
            r4 = 0
            if (r2 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = r4
        L_0x001a:
            com.canhub.cropper.CropImageView r2 = r2.getRoot()
            android.view.View r2 = (android.view.View) r2
            r0.setContentView((android.view.View) r2)
            com.canhub.cropper.databinding.CropImageActivityBinding r2 = r0.binding
            if (r2 != 0) goto L_0x002b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = r4
        L_0x002b:
            com.canhub.cropper.CropImageView r2 = r2.cropImageView
            java.lang.String r3 = "cropImageView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.setCropImageView(r2)
            android.content.Intent r2 = r80.getIntent()
            java.lang.String r3 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r2 = r2.getBundleExtra(r3)
            if (r2 == 0) goto L_0x0053
            java.lang.String r3 = "CROP_IMAGE_EXTRA_SOURCE"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            boolean r5 = r3 instanceof android.net.Uri
            if (r5 != 0) goto L_0x004c
            r3 = r4
        L_0x004c:
            android.net.Uri r3 = (android.net.Uri) r3
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x0054
        L_0x0053:
            r3 = r4
        L_0x0054:
            r0.cropImageUri = r3
            if (r2 == 0) goto L_0x006b
            java.lang.String r3 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            boolean r3 = r2 instanceof com.canhub.cropper.CropImageOptions
            if (r3 != 0) goto L_0x0063
            r2 = r4
        L_0x0063:
            com.canhub.cropper.CropImageOptions r2 = (com.canhub.cropper.CropImageOptions) r2
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            com.canhub.cropper.CropImageOptions r2 = (com.canhub.cropper.CropImageOptions) r2
            if (r2 != 0) goto L_0x00fb
        L_0x006b:
            com.canhub.cropper.CropImageOptions r2 = new com.canhub.cropper.CropImageOptions
            r5 = r2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = -1
            r77 = -1
            r78 = 63
            r79 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
        L_0x00fb:
            r0.cropImageOptions = r2
            if (r1 != 0) goto L_0x0175
            android.net.Uri r1 = r0.cropImageUri
            if (r1 == 0) goto L_0x0117
            android.net.Uri r2 = android.net.Uri.EMPTY
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x010c
            goto L_0x0117
        L_0x010c:
            com.canhub.cropper.CropImageView r1 = r0.cropImageView
            if (r1 == 0) goto L_0x0183
            android.net.Uri r2 = r0.cropImageUri
            r1.setImageUriAsync(r2)
            goto L_0x0183
        L_0x0117:
            com.canhub.cropper.CropImageOptions r1 = r0.cropImageOptions
            java.lang.String r2 = "cropImageOptions"
            if (r1 != 0) goto L_0x0121
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = r4
        L_0x0121:
            boolean r1 = r1.showIntentChooser
            if (r1 == 0) goto L_0x0129
            r80.showIntentChooser()
            goto L_0x0183
        L_0x0129:
            com.canhub.cropper.CropImageOptions r1 = r0.cropImageOptions
            if (r1 != 0) goto L_0x0131
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = r4
        L_0x0131:
            boolean r1 = r1.imageSourceIncludeGallery
            if (r1 == 0) goto L_0x014c
            com.canhub.cropper.CropImageOptions r1 = r0.cropImageOptions
            if (r1 != 0) goto L_0x013d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = r4
        L_0x013d:
            boolean r1 = r1.imageSourceIncludeCamera
            if (r1 == 0) goto L_0x014c
            com.canhub.cropper.CropImageActivity$onCreate$1 r1 = new com.canhub.cropper.CropImageActivity$onCreate$1
            r1.<init>(r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.showImageSourceDialog(r1)
            goto L_0x0183
        L_0x014c:
            com.canhub.cropper.CropImageOptions r1 = r0.cropImageOptions
            if (r1 != 0) goto L_0x0154
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = r4
        L_0x0154:
            boolean r1 = r1.imageSourceIncludeGallery
            if (r1 == 0) goto L_0x0160
            androidx.activity.result.ActivityResultLauncher<java.lang.String> r1 = r0.pickImageGallery
            java.lang.String r2 = "image/*"
            r1.launch(r2)
            goto L_0x0183
        L_0x0160:
            com.canhub.cropper.CropImageOptions r1 = r0.cropImageOptions
            if (r1 != 0) goto L_0x0168
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L_0x0169
        L_0x0168:
            r4 = r1
        L_0x0169:
            boolean r1 = r4.imageSourceIncludeCamera
            if (r1 == 0) goto L_0x0171
            r80.openCamera()
            goto L_0x0183
        L_0x0171:
            r80.finish()
            goto L_0x0183
        L_0x0175:
            java.lang.String r2 = "bundle_key_tmp_uri"
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L_0x0181
            android.net.Uri r4 = android.net.Uri.parse(r1)
        L_0x0181:
            r0.latestTmpUri = r4
        L_0x0183:
            r80.setCustomizations()
            androidx.activity.OnBackPressedDispatcher r5 = r80.getOnBackPressedDispatcher()
            r6 = 0
            r7 = 0
            com.canhub.cropper.CropImageActivity$$ExternalSyntheticLambda0 r8 = new com.canhub.cropper.CropImageActivity$$ExternalSyntheticLambda0
            r8.<init>(r0)
            r9 = 3
            r10 = 0
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CropImageActivity cropImageActivity, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(cropImageActivity, "this$0");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "$this$addCallback");
        cropImageActivity.setResultCancel();
        return Unit.INSTANCE;
    }

    private final void setCustomizations() {
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        CropImageOptions cropImageOptions3 = null;
        if (cropImageOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions2 = null;
        }
        int i = cropImageOptions2.activityBackgroundColor;
        CropImageActivityBinding cropImageActivityBinding = this.binding;
        if (cropImageActivityBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cropImageActivityBinding = null;
        }
        cropImageActivityBinding.getRoot().setBackgroundColor(i);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions4 = null;
            }
            CharSequence charSequence = cropImageOptions4.activityTitle;
            if (charSequence.length() == 0) {
            }
            setTitle(charSequence);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num = cropImageOptions5.toolbarColor;
            if (num != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions6 = null;
            }
            Integer num2 = cropImageOptions6.toolbarTitleColor;
            if (num2 != null) {
                int intValue = num2.intValue();
                Spannable spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(intValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions3 = cropImageOptions7;
            }
            Integer num3 = cropImageOptions3.toolbarBackButtonColor;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                try {
                    Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_24);
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    supportActionBar.setHomeAsUpIndicator(drawable);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private final void showIntentChooser() {
        CropImageIntentChooser cropImageIntentChooser = new CropImageIntentChooser(this, new CropImageActivity$showIntentChooser$ciIntentChooser$1(this));
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        Uri uri = null;
        if (cropImageOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions2 = null;
        }
        String str = cropImageOptions2.intentChooserTitle;
        if (str != null) {
            if (!(!StringsKt.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                cropImageIntentChooser.setIntentChooserTitle(str);
            }
        }
        List<String> list = cropImageOptions2.intentChooserPriorityList;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                cropImageIntentChooser.setupPriorityAppsList(list);
            }
        }
        if (cropImageOptions2.imageSourceIncludeCamera) {
            uri = getTmpFileUri();
        }
        cropImageIntentChooser.showChooserIntent(cropImageOptions2.imageSourceIncludeCamera, cropImageOptions2.imageSourceIncludeGallery, uri);
    }

    /* access modifiers changed from: private */
    public final void openSource(Source source) {
        int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i == 1) {
            openCamera();
        } else if (i == 2) {
            this.pickImageGallery.launch("image/*");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void openCamera() {
        Uri tmpFileUri = getTmpFileUri();
        this.latestTmpUri = tmpFileUri;
        this.takePicture.launch(tmpFileUri);
    }

    private final Uri getTmpFileUri() {
        File createTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        createTempFile.createNewFile();
        createTempFile.deleteOnExit();
        Intrinsics.checkNotNull(createTempFile);
        return GetUriForFileKt.getUriForFile(this, createTempFile);
    }

    public void showImageSourceDialog(Function1<? super Source, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "openSource");
        new AlertDialog.Builder(this).setCancelable(false).setOnKeyListener(new CropImageActivity$$ExternalSyntheticLambda1(this)).setTitle(R.string.pick_image_chooser_title).setItems((CharSequence[]) new String[]{getString(R.string.pick_image_camera), getString(R.string.pick_image_gallery)}, (DialogInterface.OnClickListener) new CropImageActivity$$ExternalSyntheticLambda2(function1)).show();
    }

    /* access modifiers changed from: private */
    public static final boolean showImageSourceDialog$lambda$16(CropImageActivity cropImageActivity, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(cropImageActivity, "this$0");
        if (i == 4 && keyEvent.getAction() == 1) {
            cropImageActivity.setResultCancel();
            cropImageActivity.finish();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void showImageSourceDialog$lambda$17(Function1 function1, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(function1, "$openSource");
        function1.invoke(i == 0 ? Source.CAMERA : Source.GALLERY);
    }

    public void onStart() {
        super.onStart();
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView3 = this.cropImageView;
        if (cropImageView3 != null) {
            cropImageView3.setOnCropImageCompleteListener(this);
        }
    }

    public void onStop() {
        super.onStop();
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnSetImageUriCompleteListener((CropImageView.OnSetImageUriCompleteListener) null);
        }
        CropImageView cropImageView3 = this.cropImageView;
        if (cropImageView3 != null) {
            cropImageView3.setOnCropImageCompleteListener((CropImageView.OnCropImageCompleteListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString(BUNDLE_KEY_TMP_URI, String.valueOf(this.latestTmpUri));
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r9) {
        /*
            r8 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            java.lang.String r1 = "cropImageOptions"
            r2 = 0
            if (r0 != 0) goto L_0x0010
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x0010:
            boolean r0 = r0.skipEditing
            r3 = 1
            if (r0 == 0) goto L_0x0016
            return r3
        L_0x0016:
            android.view.MenuInflater r0 = r8.getMenuInflater()
            int r4 = com.canhub.cropper.R.menu.crop_image_menu
            r0.inflate(r4, r9)
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            if (r0 != 0) goto L_0x0027
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x0027:
            boolean r0 = r0.allowRotation
            if (r0 != 0) goto L_0x0036
            int r0 = com.canhub.cropper.R.id.ic_rotate_left_24
            r9.removeItem(r0)
            int r0 = com.canhub.cropper.R.id.ic_rotate_right_24
            r9.removeItem(r0)
            goto L_0x004b
        L_0x0036:
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            if (r0 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x003e:
            boolean r0 = r0.allowCounterRotation
            if (r0 == 0) goto L_0x004b
            int r0 = com.canhub.cropper.R.id.ic_rotate_left_24
            android.view.MenuItem r0 = r9.findItem(r0)
            r0.setVisible(r3)
        L_0x004b:
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            if (r0 != 0) goto L_0x0053
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x0053:
            boolean r0 = r0.allowFlipping
            if (r0 != 0) goto L_0x005c
            int r0 = com.canhub.cropper.R.id.ic_flip_24
            r9.removeItem(r0)
        L_0x005c:
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            if (r0 != 0) goto L_0x0064
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x0064:
            java.lang.CharSequence r0 = r0.cropMenuCropButtonTitle
            if (r0 == 0) goto L_0x007b
            int r0 = com.canhub.cropper.R.id.crop_image_menu_crop
            android.view.MenuItem r0 = r9.findItem(r0)
            com.canhub.cropper.CropImageOptions r4 = r8.cropImageOptions
            if (r4 != 0) goto L_0x0076
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r4 = r2
        L_0x0076:
            java.lang.CharSequence r4 = r4.cropMenuCropButtonTitle
            r0.setTitle(r4)
        L_0x007b:
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions     // Catch:{ Exception -> 0x00a9 }
            if (r0 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ Exception -> 0x00a9 }
            r0 = r2
        L_0x0083:
            int r0 = r0.cropMenuCropButtonIcon     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x00a7
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x00a9 }
            com.canhub.cropper.CropImageOptions r4 = r8.cropImageOptions     // Catch:{ Exception -> 0x00a9 }
            if (r4 != 0) goto L_0x0092
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ Exception -> 0x00a9 }
            r4 = r2
        L_0x0092:
            int r4 = r4.cropMenuCropButtonIcon     // Catch:{ Exception -> 0x00a9 }
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r4)     // Catch:{ Exception -> 0x00a9 }
            int r4 = com.canhub.cropper.R.id.crop_image_menu_crop     // Catch:{ Exception -> 0x00a2 }
            android.view.MenuItem r4 = r9.findItem(r4)     // Catch:{ Exception -> 0x00a2 }
            r4.setIcon(r0)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00b5
        L_0x00a2:
            r4 = move-exception
            r7 = r4
            r4 = r0
            r0 = r7
            goto L_0x00ab
        L_0x00a7:
            r0 = r2
            goto L_0x00b5
        L_0x00a9:
            r0 = move-exception
            r4 = r2
        L_0x00ab:
            java.lang.String r5 = "Failed to read menu crop drawable"
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r6 = "AIC"
            android.util.Log.w(r6, r5, r0)
            r0 = r4
        L_0x00b5:
            com.canhub.cropper.CropImageOptions r4 = r8.cropImageOptions
            if (r4 != 0) goto L_0x00bd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r4 = r2
        L_0x00bd:
            int r4 = r4.activityMenuIconColor
            if (r4 == 0) goto L_0x00ff
            int r4 = com.canhub.cropper.R.id.ic_rotate_left_24
            com.canhub.cropper.CropImageOptions r5 = r8.cropImageOptions
            if (r5 != 0) goto L_0x00cb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r5 = r2
        L_0x00cb:
            int r5 = r5.activityMenuIconColor
            r8.updateMenuItemIconColor(r9, r4, r5)
            int r4 = com.canhub.cropper.R.id.ic_rotate_right_24
            com.canhub.cropper.CropImageOptions r5 = r8.cropImageOptions
            if (r5 != 0) goto L_0x00da
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r5 = r2
        L_0x00da:
            int r5 = r5.activityMenuIconColor
            r8.updateMenuItemIconColor(r9, r4, r5)
            int r4 = com.canhub.cropper.R.id.ic_flip_24
            com.canhub.cropper.CropImageOptions r5 = r8.cropImageOptions
            if (r5 != 0) goto L_0x00e9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r5 = r2
        L_0x00e9:
            int r5 = r5.activityMenuIconColor
            r8.updateMenuItemIconColor(r9, r4, r5)
            if (r0 == 0) goto L_0x00ff
            int r0 = com.canhub.cropper.R.id.crop_image_menu_crop
            com.canhub.cropper.CropImageOptions r4 = r8.cropImageOptions
            if (r4 != 0) goto L_0x00fa
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r4 = r2
        L_0x00fa:
            int r4 = r4.activityMenuIconColor
            r8.updateMenuItemIconColor(r9, r0, r4)
        L_0x00ff:
            com.canhub.cropper.CropImageOptions r0 = r8.cropImageOptions
            if (r0 != 0) goto L_0x0107
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0108
        L_0x0107:
            r2 = r0
        L_0x0108:
            java.lang.Integer r0 = r2.activityMenuTextColor
            if (r0 == 0) goto L_0x0166
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 6
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            int r2 = com.canhub.cropper.R.id.ic_rotate_left_24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            int r2 = com.canhub.cropper.R.id.ic_rotate_right_24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            int r2 = com.canhub.cropper.R.id.ic_flip_24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r1[r4] = r2
            int r2 = com.canhub.cropper.R.id.ic_flip_24_horizontally
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 3
            r1[r4] = r2
            int r2 = com.canhub.cropper.R.id.ic_flip_24_vertically
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 4
            r1[r4] = r2
            int r2 = com.canhub.cropper.R.id.crop_image_menu_crop
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 5
            r1[r4] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0152:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0166
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r8.updateMenuItemTextColor(r9, r2, r0)
            goto L_0x0152
        L_0x0166:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crop_image_menu_crop) {
            cropImage();
            return true;
        }
        CropImageOptions cropImageOptions2 = null;
        if (itemId == R.id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions3;
            }
            rotateImage(-cropImageOptions2.rotationDegrees);
            return true;
        } else if (itemId == R.id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions4;
            }
            rotateImage(cropImageOptions2.rotationDegrees);
            return true;
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView2 = this.cropImageView;
            if (cropImageView2 == null) {
                return true;
            }
            cropImageView2.flipImageHorizontally();
            return true;
        } else if (itemId == R.id.ic_flip_24_vertically) {
            CropImageView cropImageView3 = this.cropImageView;
            if (cropImageView3 == null) {
                return true;
            }
            cropImageView3.flipImageVertically();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResultCancel();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPickImageResult(Uri uri) {
        if (uri == null) {
            setResultCancel();
            return;
        }
        this.cropImageUri = uri;
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setImageUriAsync(uri);
        }
    }

    public void onSetImageUriComplete(CropImageView cropImageView2, Uri uri, Exception exc) {
        CropImageView cropImageView3;
        CropImageView cropImageView4;
        Intrinsics.checkNotNullParameter(cropImageView2, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(uri, "uri");
        CropImageOptions cropImageOptions2 = null;
        if (exc == null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions3 = null;
            }
            if (!(cropImageOptions3.initialCropWindowRectangle == null || (cropImageView4 = this.cropImageView) == null)) {
                CropImageOptions cropImageOptions4 = this.cropImageOptions;
                if (cropImageOptions4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                    cropImageOptions4 = null;
                }
                cropImageView4.setCropRect(cropImageOptions4.initialCropWindowRectangle);
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            if (cropImageOptions5.initialRotation > 0 && (cropImageView3 = this.cropImageView) != null) {
                CropImageOptions cropImageOptions6 = this.cropImageOptions;
                if (cropImageOptions6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                    cropImageOptions6 = null;
                }
                cropImageView3.setRotatedDegrees(cropImageOptions6.initialRotation);
            }
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions7;
            }
            if (cropImageOptions2.skipEditing) {
                cropImage();
                return;
            }
            return;
        }
        setResult((Uri) null, exc, 1);
    }

    public void onCropImageComplete(CropImageView cropImageView2, CropImageView.CropResult cropResult) {
        Intrinsics.checkNotNullParameter(cropImageView2, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(cropResult, "result");
        setResult(cropResult.getUriContent(), cropResult.getError(), cropResult.getSampleSize());
    }

    public void cropImage() {
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        CropImageOptions cropImageOptions3 = null;
        if (cropImageOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.noOutputImage) {
            setResult((Uri) null, (Exception) null, 1);
            return;
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions4 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions4.outputCompressFormat;
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i = cropImageOptions5.outputCompressQuality;
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i2 = cropImageOptions6.outputRequestWidth;
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions7 = null;
            }
            int i3 = cropImageOptions7.outputRequestHeight;
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions8 = null;
            }
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions8.outputRequestSizeOptions;
            CropImageOptions cropImageOptions9 = this.cropImageOptions;
            if (cropImageOptions9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions3 = cropImageOptions9;
            }
            cropImageView2.croppedImageAsync(compressFormat, i, i2, i3, requestSizeOptions, cropImageOptions3.customOutputUri);
        }
    }

    public void setCropImageView(CropImageView cropImageView2) {
        Intrinsics.checkNotNullParameter(cropImageView2, "cropImageView");
        this.cropImageView = cropImageView2;
    }

    public void rotateImage(int i) {
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.rotateImage(i);
        }
    }

    public void setResult(Uri uri, Exception exc, int i) {
        setResult(exc != null ? 204 : -1, getResultIntent(uri, exc, i));
        finish();
    }

    public void setResultCancel() {
        setResult(0);
        finish();
    }

    public Intent getResultIntent(Uri uri, Exception exc, int i) {
        CropImageView cropImageView2 = this.cropImageView;
        Uri imageUri = cropImageView2 != null ? cropImageView2.getImageUri() : null;
        CropImageView cropImageView3 = this.cropImageView;
        float[] cropPoints = cropImageView3 != null ? cropImageView3.getCropPoints() : null;
        CropImageView cropImageView4 = this.cropImageView;
        Rect cropRect = cropImageView4 != null ? cropImageView4.getCropRect() : null;
        CropImageView cropImageView5 = this.cropImageView;
        int rotatedDegrees = cropImageView5 != null ? cropImageView5.getRotatedDegrees() : 0;
        CropImageView cropImageView6 = this.cropImageView;
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(imageUri, uri, exc, cropPoints, cropRect, rotatedDegrees, cropImageView6 != null ? cropImageView6.getWholeImageRect() : null, i);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra(CropImage.CROP_IMAGE_EXTRA_RESULT, activityResult);
        return intent;
    }

    public void updateMenuItemIconColor(Menu menu, int i, int i2) {
        Drawable icon;
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(i);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(i2, BlendModeCompat.SRC_ATOP));
                findItem.setIcon(icon);
            } catch (Exception e) {
                Log.w("AIC", "Failed to update menu item color", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if ((!kotlin.text.StringsKt.isBlank(r5)) == true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateMenuItemTextColor(android.view.Menu r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.MenuItem r4 = r4.findItem(r5)
            if (r4 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.CharSequence r5 = r4.getTitle()
            r0 = 0
            if (r5 == 0) goto L_0x001c
            boolean r1 = kotlin.text.StringsKt.isBlank(r5)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != r2) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            if (r2 == 0) goto L_0x0044
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ Exception -> 0x003a }
            r1.<init>(r5)     // Catch:{ Exception -> 0x003a }
            android.text.Spannable r1 = (android.text.Spannable) r1     // Catch:{ Exception -> 0x003a }
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x003a }
            r5.<init>(r6)     // Catch:{ Exception -> 0x003a }
            int r6 = r1.length()     // Catch:{ Exception -> 0x003a }
            r2 = 33
            r1.setSpan(r5, r0, r6, r2)     // Catch:{ Exception -> 0x003a }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x003a }
            r4.setTitle(r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x0044
        L_0x003a:
            r4 = move-exception
            java.lang.String r5 = "Failed to update menu item color"
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r6 = "AIC"
            android.util.Log.w(r6, r5, r4)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.updateMenuItemTextColor(android.view.Menu, int, int):void");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageActivity$Source;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "GALLERY", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageActivity.kt */
    public enum Source {
        CAMERA,
        GALLERY;

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        static {
            Source[] $values;
            $ENTRIES = EnumEntriesKt.enumEntries((E[]) (Enum[]) $values);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageActivity$Companion;", "", "<init>", "()V", "BUNDLE_KEY_TMP_URI", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageActivity.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
