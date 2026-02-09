package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import com.google.android.gms.common.Scopes;
import java.util.Objects;

public abstract class AudioEncoderConfig implements EncoderConfig {
    public abstract int getBitrate();

    public abstract int getChannelCount();

    public abstract String getMimeType();

    public abstract int getProfile();

    public abstract int getSampleRate();

    AudioEncoderConfig() {
    }

    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(EncoderConfig.CODEC_PROFILE_NONE);
    }

    public MediaFormat toMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getSampleRate(), getChannelCount());
        createAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != CODEC_PROFILE_NONE) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", getProfile());
            } else {
                createAudioFormat.setInteger(Scopes.PROFILE, getProfile());
            }
        }
        return createAudioFormat;
    }

    public static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract AudioEncoderConfig autoBuild();

        public abstract Builder setBitrate(int i);

        public abstract Builder setChannelCount(int i);

        public abstract Builder setMimeType(String str);

        public abstract Builder setProfile(int i);

        public abstract Builder setSampleRate(int i);

        Builder() {
        }

        public AudioEncoderConfig build() {
            AudioEncoderConfig autoBuild = autoBuild();
            if (!Objects.equals(autoBuild.getMimeType(), "audio/mp4a-latm") || autoBuild.getProfile() != EncoderConfig.CODEC_PROFILE_NONE) {
                return autoBuild;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
    }
}
