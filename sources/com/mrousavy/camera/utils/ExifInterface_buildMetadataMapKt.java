package com.mrousavy.camera.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"buildMetadataMap", "Lcom/facebook/react/bridge/WritableMap;", "Landroidx/exifinterface/media/ExifInterface;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExifInterface+buildMetadataMap.kt */
public final class ExifInterface_buildMetadataMapKt {
    public static final WritableMap buildMetadataMap(ExifInterface exifInterface) {
        Intrinsics.checkNotNullParameter(exifInterface, "<this>");
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(ExifInterface.TAG_ORIENTATION, exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(ExifInterface.TAG_RESOLUTION_UNIT, exifInterface.getAttributeInt(ExifInterface.TAG_RESOLUTION_UNIT, 0));
        createMap2.putString(ExifInterface.TAG_SOFTWARE, exifInterface.getAttribute(ExifInterface.TAG_SOFTWARE));
        createMap2.putString(ExifInterface.TAG_MAKE, exifInterface.getAttribute(ExifInterface.TAG_MAKE));
        createMap2.putString(ExifInterface.TAG_DATETIME, exifInterface.getAttribute(ExifInterface.TAG_DATETIME));
        createMap2.putDouble(ExifInterface.TAG_X_RESOLUTION, exifInterface.getAttributeDouble(ExifInterface.TAG_X_RESOLUTION, 0.0d));
        createMap2.putString(ExifInterface.TAG_MODEL, exifInterface.getAttribute(ExifInterface.TAG_MODEL));
        createMap2.putDouble(ExifInterface.TAG_Y_RESOLUTION, exifInterface.getAttributeDouble(ExifInterface.TAG_Y_RESOLUTION, 0.0d));
        createMap.putMap("{TIFF}", createMap2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putString(ExifInterface.TAG_DATETIME_ORIGINAL, exifInterface.getAttribute(ExifInterface.TAG_DATETIME_ORIGINAL));
        createMap3.putDouble(ExifInterface.TAG_EXPOSURE_TIME, exifInterface.getAttributeDouble(ExifInterface.TAG_EXPOSURE_TIME, 0.0d));
        createMap3.putDouble(ExifInterface.TAG_F_NUMBER, exifInterface.getAttributeDouble(ExifInterface.TAG_F_NUMBER, 0.0d));
        WritableArray createArray = Arguments.createArray();
        long[] attributeRange = exifInterface.getAttributeRange(ExifInterface.TAG_LENS_SPECIFICATION);
        if (attributeRange != null) {
            for (long j : attributeRange) {
                createArray.pushInt((int) j);
            }
        }
        createMap3.putArray(ExifInterface.TAG_LENS_SPECIFICATION, createArray);
        createMap3.putDouble(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, exifInterface.getAttributeDouble(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 0.0d));
        createMap3.putInt(ExifInterface.TAG_COLOR_SPACE, exifInterface.getAttributeInt(ExifInterface.TAG_COLOR_SPACE, 1));
        createMap3.putInt("FocalLenIn35mmFilm", exifInterface.getAttributeInt(ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, 0));
        createMap3.putDouble(ExifInterface.TAG_BRIGHTNESS_VALUE, exifInterface.getAttributeDouble(ExifInterface.TAG_BRIGHTNESS_VALUE, 0.0d));
        createMap3.putInt(ExifInterface.TAG_EXPOSURE_MODE, exifInterface.getAttributeInt(ExifInterface.TAG_EXPOSURE_MODE, 0));
        createMap3.putString(ExifInterface.TAG_LENS_MODEL, exifInterface.getAttribute(ExifInterface.TAG_LENS_MODEL));
        createMap3.putInt(ExifInterface.TAG_SCENE_TYPE, exifInterface.getAttributeInt(ExifInterface.TAG_SCENE_TYPE, 1));
        createMap3.putInt(ExifInterface.TAG_PIXEL_X_DIMENSION, exifInterface.getAttributeInt(ExifInterface.TAG_PIXEL_X_DIMENSION, 0));
        createMap3.putDouble(ExifInterface.TAG_SHUTTER_SPEED_VALUE, exifInterface.getAttributeDouble(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 0.0d));
        createMap3.putInt(ExifInterface.TAG_SENSING_METHOD, exifInterface.getAttributeInt(ExifInterface.TAG_SENSING_METHOD, 1));
        WritableArray createArray2 = Arguments.createArray();
        long[] attributeRange2 = exifInterface.getAttributeRange(ExifInterface.TAG_SUBJECT_AREA);
        if (attributeRange2 != null) {
            for (long j2 : attributeRange2) {
                createArray2.pushInt((int) j2);
            }
        }
        createMap3.putArray(ExifInterface.TAG_SUBJECT_AREA, createArray2);
        createMap3.putDouble(ExifInterface.TAG_APERTURE_VALUE, exifInterface.getAttributeDouble(ExifInterface.TAG_APERTURE_VALUE, 0.0d));
        createMap3.putString("SubsecTimeDigitized", exifInterface.getAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED));
        createMap3.putDouble(ExifInterface.TAG_FOCAL_LENGTH, exifInterface.getAttributeDouble(ExifInterface.TAG_FOCAL_LENGTH, 0.0d));
        createMap3.putString(ExifInterface.TAG_LENS_MAKE, exifInterface.getAttribute(ExifInterface.TAG_LENS_MAKE));
        createMap3.putString("SubsecTimeOriginal", exifInterface.getAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL));
        createMap3.putString(ExifInterface.TAG_OFFSET_TIME_DIGITIZED, exifInterface.getAttribute(ExifInterface.TAG_OFFSET_TIME_DIGITIZED));
        createMap3.putInt(ExifInterface.TAG_PIXEL_Y_DIMENSION, exifInterface.getAttributeInt(ExifInterface.TAG_PIXEL_Y_DIMENSION, 0));
        WritableArray createArray3 = Arguments.createArray();
        long[] attributeRange3 = exifInterface.getAttributeRange(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (attributeRange3 != null) {
            for (long j3 : attributeRange3) {
                createArray3.pushInt((int) j3);
            }
        }
        createMap3.putArray(ExifInterface.TAG_ISO_SPEED_RATINGS, createArray3);
        createMap3.putInt(ExifInterface.TAG_WHITE_BALANCE, exifInterface.getAttributeInt(ExifInterface.TAG_WHITE_BALANCE, 0));
        createMap3.putString(ExifInterface.TAG_DATETIME_DIGITIZED, exifInterface.getAttribute(ExifInterface.TAG_DATETIME_DIGITIZED));
        createMap3.putString(ExifInterface.TAG_OFFSET_TIME_ORIGINAL, exifInterface.getAttribute(ExifInterface.TAG_OFFSET_TIME_ORIGINAL));
        createMap3.putString(ExifInterface.TAG_EXIF_VERSION, exifInterface.getAttribute(ExifInterface.TAG_EXIF_VERSION));
        createMap3.putString(ExifInterface.TAG_OFFSET_TIME, exifInterface.getAttribute(ExifInterface.TAG_OFFSET_TIME));
        createMap3.putInt(ExifInterface.TAG_FLASH, exifInterface.getAttributeInt(ExifInterface.TAG_FLASH, 1));
        createMap3.putInt(ExifInterface.TAG_EXPOSURE_PROGRAM, exifInterface.getAttributeInt(ExifInterface.TAG_EXPOSURE_PROGRAM, 0));
        createMap3.putInt(ExifInterface.TAG_METERING_MODE, exifInterface.getAttributeInt(ExifInterface.TAG_METERING_MODE, 0));
        createMap.putMap("{Exif}", createMap3);
        Intrinsics.checkNotNullExpressionValue(createMap, "metadataMap");
        return createMap;
    }
}
