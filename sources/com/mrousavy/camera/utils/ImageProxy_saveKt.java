package com.mrousavy.camera.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import androidx.camera.core.ImageProxy;
import androidx.exifinterface.media.ExifInterface;
import com.mrousavy.camera.CameraView;
import com.mrousavy.camera.InvalidFormatError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"flip", "", "imageBytes", "imageWidth", "", "flipImage", "save", "", "Landroidx/camera/core/ImageProxy;", "file", "Ljava/io/File;", "flipHorizontally", "", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageProxy+save.kt */
public final class ImageProxy_saveKt {
    public static final byte[] flip(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "imageBytes");
        byte[] bArr2 = new byte[bArr.length];
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            bArr3[i2] = bArr[i3];
            i2++;
            if (i3 % i == 0) {
                ArraysKt.reverse(bArr3);
                if (i3 != i) {
                    bArr3 = ArraysKt.plus(bArr2, bArr3);
                }
                i2 = 0;
                byte[] bArr4 = bArr3;
                bArr3 = new byte[i];
                bArr2 = bArr4;
            }
        }
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, bArr.length - i, bArr5, 0, i);
        return ArraysKt.plus(bArr2, bArr5);
    }

    public static final byte[] flipImage(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "imageBytes");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        switch (new ExifInterface((InputStream) new ByteArrayInputStream(bArr)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0)) {
            case 1:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …map.height, matrix, true)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    public static final void save(ImageProxy imageProxy, File file, boolean z) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        int format = imageProxy.getFormat();
        if (format == 35) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(imageProxy.getWidth()).putInt(imageProxy.getHeight()).putInt(imageProxy.getPlanes()[1].getPixelStride()).putInt(imageProxy.getPlanes()[1].getRowStride());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(allocate.array());
            for (int i = 0; i < 3; i++) {
                ByteBuffer buffer = imageProxy.getPlanes()[i].getBuffer();
                Intrinsics.checkNotNullExpressionValue(buffer, "planes[i].buffer");
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                fileOutputStream.write(bArr);
            }
            fileOutputStream.close();
        } else if (format == 256) {
            ByteBuffer buffer2 = imageProxy.getPlanes()[0].getBuffer();
            Intrinsics.checkNotNullExpressionValue(buffer2, "planes[0].buffer");
            byte[] bArr2 = new byte[buffer2.remaining()];
            buffer2.get(bArr2);
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                bArr2 = flipImage(bArr2);
                Log.i(CameraView.TAG_PERF, "Flipping Image took " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            fileOutputStream2.write(bArr2);
            fileOutputStream2.close();
        } else {
            throw new InvalidFormatError(imageProxy.getFormat());
        }
    }
}
