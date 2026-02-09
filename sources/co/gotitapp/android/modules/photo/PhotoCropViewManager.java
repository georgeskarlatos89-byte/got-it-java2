package co.gotitapp.android.modules.photo;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.gotitapp.android.R;
import com.canhub.cropper.CropImageView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.http.cookie.ClientCookie;

public class PhotoCropViewManager extends SimpleViewManager<FrameLayout> {
    private static final int COMMAND_RESET = 2;
    private static final String COMMAND_RESET_NAME = "reset";
    private static final int COMMAND_ROTATE = 1;
    private static final String COMMAND_ROTATE_NAME = "rotate";
    private static final int COMMAND_SAVE_IMAGE = 3;
    private static final String COMMAND_SAVE_IMAGE_NAME = "saveImage";
    public static final String REACT_CLASS = "PhotoCropView";
    private static final int ROTATE_ANGLE = 90;
    private static final String SAVE_IMAGE_CALLBACK_NAME = "onImageSaved";
    private static final String SAVE_IMAGE_EVENT_NAME = "saveImageEvent";
    private ReactApplicationContext reactContext;

    public String getName() {
        return REACT_CLASS;
    }

    public PhotoCropViewManager(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }

    public FrameLayout createViewInstance(ThemedReactContext themedReactContext) {
        return (FrameLayout) LayoutInflater.from(themedReactContext).inflate(R.layout.photo_crop_view, (ViewGroup) null);
    }

    @ReactProp(name = "source")
    public void setSource(FrameLayout frameLayout, String str) {
        getImageView(frameLayout).setImageUriAsync(Uri.parse(str));
    }

    private CropImageView getImageView(FrameLayout frameLayout) {
        return (CropImageView) frameLayout.getChildAt(0);
    }

    private void reset(CropImageView cropImageView) {
        cropImageView.resetCropRect();
    }

    private void rotate(CropImageView cropImageView) {
        cropImageView.setRotatedDegrees(cropImageView.getRotatedDegrees() - 90);
    }

    private String saveFile(File file, String str, Bitmap bitmap) {
        try {
            File file2 = new File(file, str);
            if (file2.exists()) {
                file2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2.getCanonicalPath();
        } catch (Exception unused) {
            return null;
        }
    }

    private void saveImage(FrameLayout frameLayout, CropImageView cropImageView) {
        Bitmap croppedImage = cropImageView.getCroppedImage();
        if (croppedImage != null) {
            String saveFile = saveFile(this.reactContext.getCacheDir(), "image.jpg", croppedImage);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(ClientCookie.PATH_ATTR, saveFile);
            Rect cropRect = cropImageView.getCropRect();
            createMap.putInt("width", cropRect.width());
            createMap.putInt("height", cropRect.height());
            createMap.putInt("rotatedDegrees", cropImageView.getRotatedDegrees());
            ((RCTEventEmitter) this.reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(frameLayout.getId(), SAVE_IMAGE_EVENT_NAME, createMap);
        }
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of(COMMAND_ROTATE_NAME, 1, COMMAND_RESET_NAME, 2, COMMAND_SAVE_IMAGE_NAME, 3);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put(SAVE_IMAGE_EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", SAVE_IMAGE_CALLBACK_NAME))).build();
    }

    public void receiveCommand(FrameLayout frameLayout, int i, ReadableArray readableArray) {
        super.receiveCommand(frameLayout, i, readableArray);
        CropImageView imageView = getImageView(frameLayout);
        if (i == 1) {
            rotate(imageView);
        } else if (i == 2) {
            reset(imageView);
        } else if (i == 3) {
            saveImage(frameLayout, imageView);
        }
    }
}
