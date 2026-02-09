package com.mrousavy.camera.parsers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"parseImageFormat", "", "imageFormat", "", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageFormat+String.kt */
public final class ImageFormat_StringKt {
    public static final String parseImageFormat(int i) {
        switch (i) {
            case 32:
            case 36:
                return "raw";
            case 34:
                return "private";
            case 35:
            case 39:
            case 40:
                return "yuv";
            case 256:
                return "jpeg";
            case 1144402265:
                return "depth-16";
            case 1212500294:
                return "heic";
            case 1768253795:
                return "jpeg-depth";
            default:
                return "unknown";
        }
    }
}
