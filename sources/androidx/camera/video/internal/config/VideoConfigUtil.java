package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.video.VideoSpec;

public final class VideoConfigUtil {
    private static final String TAG = "VideoConfigUtil";
    private static final int VIDEO_FRAME_RATE_FIXED_DEFAULT = 30;

    private VideoConfigUtil() {
    }

    static int resolveFrameRate(VideoSpec videoSpec) {
        Range<Integer> frameRate = videoSpec.getFrameRate();
        if (VideoSpec.FRAME_RATE_RANGE_AUTO.equals(frameRate) || frameRate.contains(30)) {
            Logger.d(TAG, "Using single supported VIDEO frame rate: 30");
        } else {
            Logger.w(TAG, "Requested frame rate range does not include single supported frame rate. Ignoring range. [range: " + frameRate + " supported frame rate: 30]");
        }
        return 30;
    }

    static int scaleAndClampBitrate(int i, int i2, int i3, int i4, int i5, int i6, int i7, Range<Integer> range) {
        String str;
        int doubleValue = (int) (((double) i) * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            str = String.format("Base Bitrate(%dbps) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(doubleValue)});
        } else {
            str = "";
        }
        if (!VideoSpec.BITRATE_RANGE_AUTO.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (Logger.isDebugEnabled(TAG)) {
                str = str + String.format("\nClamped to range %s -> %dbps", new Object[]{range, Integer.valueOf(doubleValue)});
            }
        }
        Logger.d(TAG, str);
        return doubleValue;
    }
}
