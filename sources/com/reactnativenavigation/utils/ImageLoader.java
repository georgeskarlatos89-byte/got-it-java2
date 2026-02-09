package com.reactnativenavigation.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativenavigation.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u001e"}, d2 = {"Lcom/reactnativenavigation/utils/ImageLoader;", "", "()V", "adjustThreadPolicyDebug", "Landroid/os/StrictMode$ThreadPolicy;", "context", "Landroid/content/Context;", "getBackButtonIcon", "Landroid/graphics/drawable/Drawable;", "Landroid/app/Activity;", "getDrawable", "source", "", "isLocalFile", "", "uri", "Landroid/net/Uri;", "loadFile", "loadIcon", "", "listener", "Lcom/reactnativenavigation/utils/ImageLoader$ImagesLoadingListener;", "loadIcons", "uris", "", "readJsDevImage", "restoreThreadPolicyDebug", "threadPolicy", "Companion", "ImagesLoadingListener", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageLoader.kt */
public class ImageLoader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FILE_SCHEME = "file";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/reactnativenavigation/utils/ImageLoader$ImagesLoadingListener;", "", "onComplete", "", "drawable", "Landroid/graphics/drawable/Drawable;", "", "onError", "error", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ImageLoader.kt */
    public interface ImagesLoadingListener {
        void onComplete(Drawable drawable);

        void onComplete(List<? extends Drawable> list);

        void onError(Throwable th);
    }

    public Drawable getBackButtonIcon(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "context");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "context.window.decorView");
        return ContextCompat.getDrawable(activity, ViewExtensionsKt.isRTL(decorView) ? R.drawable.ic_arrow_back_black_rtl_24dp : R.drawable.ic_arrow_back_black_24dp);
    }

    public Drawable loadIcon(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            return null;
        }
        try {
            return getDrawable(context, str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadIcon(Context context, String str, ImagesLoadingListener imagesLoadingListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "uri");
        Intrinsics.checkNotNullParameter(imagesLoadingListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        try {
            imagesLoadingListener.onComplete(getDrawable(context, str));
        } catch (IOException e) {
            imagesLoadingListener.onError(e);
        }
    }

    public void loadIcons(Context context, List<String> list, ImagesLoadingListener imagesLoadingListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "uris");
        Intrinsics.checkNotNullParameter(imagesLoadingListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        try {
            List arrayList = new ArrayList();
            for (String drawable : list) {
                arrayList.add(getDrawable(context, drawable));
            }
            imagesLoadingListener.onComplete((List<? extends Drawable>) arrayList);
        } catch (IOException e) {
            imagesLoadingListener.onError(e);
        }
    }

    private final Drawable getDrawable(Context context, String str) throws IOException {
        Drawable drawable;
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(source)");
        if (isLocalFile(parse)) {
            drawable = loadFile(context, str);
        } else {
            Drawable access$loadResource = Companion.loadResource(context, str);
            drawable = (access$loadResource != null || !ContextKt.isDebug(context)) ? access$loadResource : readJsDevImage(context, str);
        }
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "drawable.mutate()");
            return mutate;
        }
        throw new RuntimeException("Could not load image " + str);
    }

    private final Drawable readJsDevImage(Context context, String str) throws IOException {
        StrictMode.ThreadPolicy adjustThreadPolicyDebug = adjustThreadPolicyDebug(context);
        Bitmap decodeStream = BitmapFactory.decodeStream(Companion.openStream(context, str));
        restoreThreadPolicyDebug(context, adjustThreadPolicyDebug);
        return new BitmapDrawable(context.getResources(), decodeStream);
    }

    private final boolean isLocalFile(Uri uri) {
        return Intrinsics.areEqual((Object) "file", (Object) uri.getScheme());
    }

    private final Drawable loadFile(Context context, String str) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeFile(Uri.parse(str).getPath()));
    }

    private final StrictMode.ThreadPolicy adjustThreadPolicyDebug(Context context) {
        if (!ContextKt.isDebug(context)) {
            return null;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitNetwork().build());
        return threadPolicy;
    }

    private final void restoreThreadPolicyDebug(Context context, StrictMode.ThreadPolicy threadPolicy) {
        if (ContextKt.isDebug(context) && threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/utils/ImageLoader$Companion;", "", "()V", "FILE_SCHEME", "", "loadResource", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "iconSource", "localFile", "Ljava/io/InputStream;", "uri", "openStream", "remoteUrl", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ImageLoader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Drawable loadResource(Context context, String str) {
            return ResourceDrawableIdHelper.getInstance().getResourceDrawable(context, str);
        }

        /* access modifiers changed from: private */
        public final InputStream openStream(Context context, String str) throws IOException {
            return StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null) ? remoteUrl(str) : localFile(context, str);
        }

        private final InputStream remoteUrl(String str) throws IOException {
            InputStream openStream = new URL(str).openStream();
            Intrinsics.checkNotNullExpressionValue(openStream, "URL(uri).openStream()");
            return openStream;
        }

        private final InputStream localFile(Context context, String str) throws FileNotFoundException {
            return context.getContentResolver().openInputStream(Uri.parse(str));
        }
    }
}
