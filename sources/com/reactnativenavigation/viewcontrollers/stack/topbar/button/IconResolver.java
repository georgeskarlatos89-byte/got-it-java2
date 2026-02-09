package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.utils.ImageLoader;
import com.reactnativenavigation.utils.ImageLoadingListenerAdapter;
import com.reactnativenavigation.utils.LogKt;

public class IconResolver {
    private Activity context;
    private ImageLoader imageLoader;

    public IconResolver(Activity activity, ImageLoader imageLoader2) {
        this.context = activity;
        this.imageLoader = imageLoader2;
    }

    public void resolve(ButtonOptions buttonOptions, final Functions.Func1<Drawable> func1) {
        if (buttonOptions.hasIcon()) {
            this.imageLoader.loadIcon(this.context, (String) buttonOptions.icon.get(), new ImageLoadingListenerAdapter() {
                public void onComplete(Drawable drawable) {
                    func1.run(drawable);
                }

                public void onError(Throwable th) {
                    throw new RuntimeException(th);
                }
            });
        } else if (buttonOptions.isBackButton()) {
            func1.run(this.imageLoader.getBackButtonIcon(this.context));
        } else {
            Log.w(LogKt.MAIN_LIB_TAG, "Left button needs to have an icon");
        }
    }

    public ImageLoader getImageLoader() {
        return this.imageLoader;
    }
}
