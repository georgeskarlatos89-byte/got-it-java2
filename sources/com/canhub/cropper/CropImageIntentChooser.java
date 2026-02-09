package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010\u001f\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/canhub/cropper/CropImageIntentChooser;", "", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/canhub/cropper/CropImageIntentChooser$ResultCallback;", "<init>", "(Landroidx/activity/ComponentActivity;Lcom/canhub/cropper/CropImageIntentChooser$ResultCallback;)V", "title", "", "priorityIntentList", "", "cameraImgUri", "Landroid/net/Uri;", "intentChooser", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "showChooserIntent", "", "includeCamera", "", "includeGallery", "getCameraIntents", "context", "Landroid/content/Context;", "packageManager", "Landroid/content/pm/PackageManager;", "getGalleryIntents", "action", "isExplicitCameraPermissionRequired", "hasCameraPermissionInManifest", "setupPriorityAppsList", "appsList", "setIntentChooserTitle", "ResultCallback", "Companion", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: CropImageIntentChooser.kt */
public final class CropImageIntentChooser {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String GOOGLE_PHOTOS = "com.google.android.apps.photos";
    public static final String GOOGLE_PHOTOS_GO = "com.google.android.apps.photosgo";
    public static final String MIUI_GALLERY = "com.miui.gallery";
    public static final String ONEPLUS_GALLERY = "com.oneplus.gallery";
    public static final String SAMSUNG_GALLERY = "com.sec.android.gallery3d";
    private final ComponentActivity activity;
    private final ResultCallback callback;
    private Uri cameraImgUri;
    private final ActivityResultLauncher<Intent> intentChooser;
    private List<String> priorityIntentList = CollectionsKt.listOf(GOOGLE_PHOTOS, GOOGLE_PHOTOS_GO, SAMSUNG_GALLERY, ONEPLUS_GALLERY, MIUI_GALLERY);
    private String title;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImageIntentChooser$ResultCallback;", "", "onSuccess", "", "uri", "Landroid/net/Uri;", "onCancelled", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageIntentChooser.kt */
    public interface ResultCallback {
        void onCancelled();

        void onSuccess(Uri uri);
    }

    public CropImageIntentChooser(ComponentActivity componentActivity, ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(componentActivity, "activity");
        Intrinsics.checkNotNullParameter(resultCallback, "callback");
        this.activity = componentActivity;
        this.callback = resultCallback;
        String string = componentActivity.getString(R.string.pick_image_chooser_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.title = string;
        this.intentChooser = componentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new CropImageIntentChooser$$ExternalSyntheticLambda0(this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/canhub/cropper/CropImageIntentChooser$Companion;", "", "<init>", "()V", "GOOGLE_PHOTOS", "", "GOOGLE_PHOTOS_GO", "SAMSUNG_GALLERY", "ONEPLUS_GALLERY", "MIUI_GALLERY", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageIntentChooser.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: private */
    public static final void intentChooser$lambda$1(CropImageIntentChooser cropImageIntentChooser, ActivityResult activityResult) {
        Uri uri;
        Intrinsics.checkNotNullParameter(cropImageIntentChooser, "this$0");
        Intrinsics.checkNotNullParameter(activityResult, "activityRes");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data == null || (uri = data.getData()) == null) {
                uri = cropImageIntentChooser.cameraImgUri;
            }
            cropImageIntentChooser.callback.onSuccess(uri);
            return;
        }
        cropImageIntentChooser.callback.onCancelled();
    }

    public static /* synthetic */ void showChooserIntent$default(CropImageIntentChooser cropImageIntentChooser, boolean z, boolean z2, Uri uri, int i, Object obj) {
        if ((i & 4) != 0) {
            uri = null;
        }
        cropImageIntentChooser.showChooserIntent(z, z2, uri);
    }

    public final void showChooserIntent(boolean z, boolean z2, Uri uri) {
        Intent intent;
        this.cameraImgUri = uri;
        List arrayList = new ArrayList();
        PackageManager packageManager = this.activity.getPackageManager();
        if (!isExplicitCameraPermissionRequired(this.activity) && z) {
            Intrinsics.checkNotNull(packageManager);
            arrayList.addAll(getCameraIntents(this.activity, packageManager));
        }
        if (z2) {
            Intrinsics.checkNotNull(packageManager);
            List<Intent> galleryIntents = getGalleryIntents(packageManager, "android.intent.action.GET_CONTENT");
            if (galleryIntents.isEmpty()) {
                galleryIntents = getGalleryIntents(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(galleryIntents);
        }
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            Intent intent2 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z2) {
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
            }
            intent = intent2;
        }
        Intent createChooser = Intent.createChooser(intent, this.title);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        ActivityResultLauncher<Intent> activityResultLauncher = this.intentChooser;
        Intrinsics.checkNotNull(createChooser);
        activityResultLauncher.launch(createChooser);
    }

    private final List<Intent> getCameraIntents(Context context, PackageManager packageManager) {
        List<ResolveInfo> list;
        List<Intent> arrayList = new ArrayList<>();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 33) {
            list = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of((long) 0));
        } else {
            list = packageManager.queryIntentActivities(intent, 0);
        }
        Intrinsics.checkNotNull(list);
        for (ResolveInfo next : list) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            if (context instanceof Activity) {
                ((Activity) context).grantUriPermission(next.activityInfo.packageName, this.cameraImgUri, 3);
            }
            intent2.putExtra("output", this.cameraImgUri);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    private final List<Intent> getGalleryIntents(PackageManager packageManager, String str) {
        Intent intent;
        List<ResolveInfo> list;
        Object obj;
        List<Intent> arrayList = new ArrayList<>();
        if (Intrinsics.areEqual((Object) str, (Object) "android.intent.action.GET_CONTENT")) {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 33) {
            list = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of((long) 0));
        } else {
            list = packageManager.queryIntentActivities(intent, 0);
        }
        Intrinsics.checkNotNull(list);
        for (ResolveInfo next : list) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        List arrayList2 = new ArrayList();
        for (String next2 : this.priorityIntentList) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Intent) obj).getPackage(), (Object) next2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) obj;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    private final boolean isExplicitCameraPermissionRequired(Context context) {
        return hasCameraPermissionInManifest(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    private final boolean hasCameraPermissionInManifest(Context context) {
        PackageInfo packageInfo;
        boolean z;
        String packageName = context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of((long) 4096));
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(packageName, 4096);
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr == null) {
                return false;
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                String str = strArr[i];
                if (str != null && StringsKt.equals(str, "android.permission.CAMERA", true)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final CropImageIntentChooser setupPriorityAppsList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "appsList");
        CropImageIntentChooser cropImageIntentChooser = this;
        this.priorityIntentList = list;
        return this;
    }

    public final CropImageIntentChooser setIntentChooserTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        CropImageIntentChooser cropImageIntentChooser = this;
        this.title = str;
        return this;
    }
}
