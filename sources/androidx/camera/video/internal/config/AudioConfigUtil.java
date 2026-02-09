package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.AudioSource;
import java.util.ArrayList;
import java.util.Collections;

public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    static int resolveAudioSource(AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    static int resolveAudioSourceFormat(AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    static int selectSampleRateOrNearestSupported(Range<Integer> range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (!range.contains(Integer.valueOf(i5))) {
                Logger.d(TAG, "Sample rate " + i5 + "Hz is not in target range " + range);
            } else if (AudioSource.isSettingsSupported(i5, i, i2)) {
                return i5;
            } else {
                Logger.d(TAG, "Sample rate " + i5 + "Hz is not supported by audio source with channel count " + i + " and source format " + i2);
            }
            if (arrayList == null) {
                Logger.d(TAG, "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(AudioSource.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new AudioConfigUtil$$ExternalSyntheticLambda0(i3));
            }
            if (i4 < arrayList.size()) {
                int i6 = i4 + 1;
                i5 = ((Integer) arrayList.get(i4)).intValue();
                i4 = i6;
            } else {
                Logger.d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return AUDIO_SAMPLE_RATE_DEFAULT;
            }
        }
    }

    static /* synthetic */ int lambda$selectSampleRateOrNearestSupported$0(int i, Integer num, Integer num2) {
        float signum;
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        if (abs == 0) {
            signum = Math.signum((float) (num.intValue() - num2.intValue()));
        } else {
            signum = Math.signum((float) abs);
        }
        return (int) signum;
    }

    static int scaleAndClampBitrate(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        String str;
        int doubleValue = (int) (((double) i) * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            str = String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue)});
        } else {
            str = "";
        }
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (Logger.isDebugEnabled(TAG)) {
                str = str + String.format("\nClamped to range %s -> %dbps", new Object[]{range, Integer.valueOf(doubleValue)});
            }
        }
        Logger.d(TAG, str);
        return doubleValue;
    }
}
