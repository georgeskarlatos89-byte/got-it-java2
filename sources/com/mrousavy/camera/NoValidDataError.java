package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/NoValidDataError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class NoValidDataError extends CameraError {
    public NoValidDataError(Throwable th) {
        super("capture", "no-valid-data", "The recording failed because no valid data was produced to be recorded.\nThis error is generated when the essential data for a recording to be played correctly is missing, for example, a recording must contain at least one key frame. The application will need to clean up the output file, such as deleting the file.", th);
    }
}
