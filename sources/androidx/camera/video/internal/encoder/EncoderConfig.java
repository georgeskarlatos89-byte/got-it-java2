package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.CamcorderProfileProxy;

public interface EncoderConfig {
    public static final int CODEC_PROFILE_NONE = CamcorderProfileProxy.CODEC_PROFILE_NONE;

    String getMimeType();

    int getProfile();

    MediaFormat toMediaFormat() throws InvalidConfigException;
}
