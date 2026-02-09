package com.reactnativenavigation.utils;

import android.graphics.drawable.Drawable;
import com.reactnativenavigation.utils.ImageLoader;
import java.util.List;

public class ImageLoadingListenerAdapter implements ImageLoader.ImagesLoadingListener {
    public void onComplete(Drawable drawable) {
    }

    public void onComplete(List<? extends Drawable> list) {
    }

    public void onError(Throwable th) {
        th.printStackTrace();
    }
}
