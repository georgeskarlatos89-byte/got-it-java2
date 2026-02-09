package com.mrousavy.camera.frameprocessor;

import androidx.camera.core.ImageProxy;

public class ImageProxyUtils {
    public static boolean isImageProxyValid(ImageProxy imageProxy) {
        try {
            if (imageProxy.getImage() == null) {
                return false;
            }
            imageProxy.getImage().getCropRect();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getPlanesCount(ImageProxy imageProxy) {
        return imageProxy.getPlanes().length;
    }

    public static int getBytesPerRow(ImageProxy imageProxy) {
        return imageProxy.getPlanes()[0].getRowStride();
    }
}
