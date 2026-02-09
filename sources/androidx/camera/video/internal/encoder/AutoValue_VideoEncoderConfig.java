package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;

final class AutoValue_VideoEncoderConfig extends VideoEncoderConfig {
    private final int IFrameInterval;
    private final int bitrate;
    private final int colorFormat;
    private final int frameRate;
    private final String mimeType;
    private final int profile;
    private final Size resolution;

    private AutoValue_VideoEncoderConfig(String str, int i, Size size, int i2, int i3, int i4, int i5) {
        this.mimeType = str;
        this.profile = i;
        this.resolution = size;
        this.colorFormat = i2;
        this.frameRate = i3;
        this.IFrameInterval = i4;
        this.bitrate = i5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getProfile() {
        return this.profile;
    }

    public Size getResolution() {
        return this.resolution;
    }

    public int getColorFormat() {
        return this.colorFormat;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getIFrameInterval() {
        return this.IFrameInterval;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.mimeType + ", profile=" + this.profile + ", resolution=" + this.resolution + ", colorFormat=" + this.colorFormat + ", frameRate=" + this.frameRate + ", IFrameInterval=" + this.IFrameInterval + ", bitrate=" + this.bitrate + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderConfig)) {
            return false;
        }
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
        if (this.mimeType.equals(videoEncoderConfig.getMimeType()) && this.profile == videoEncoderConfig.getProfile() && this.resolution.equals(videoEncoderConfig.getResolution()) && this.colorFormat == videoEncoderConfig.getColorFormat() && this.frameRate == videoEncoderConfig.getFrameRate() && this.IFrameInterval == videoEncoderConfig.getIFrameInterval() && this.bitrate == videoEncoderConfig.getBitrate()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.resolution.hashCode()) * 1000003) ^ this.colorFormat) * 1000003) ^ this.frameRate) * 1000003) ^ this.IFrameInterval) * 1000003) ^ this.bitrate;
    }

    static final class Builder extends VideoEncoderConfig.Builder {
        private Integer IFrameInterval;
        private Integer bitrate;
        private Integer colorFormat;
        private Integer frameRate;
        private String mimeType;
        private Integer profile;
        private Size resolution;

        Builder() {
        }

        public VideoEncoderConfig.Builder setMimeType(String str) {
            if (str != null) {
                this.mimeType = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        public VideoEncoderConfig.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }

        public VideoEncoderConfig.Builder setResolution(Size size) {
            if (size != null) {
                this.resolution = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        public VideoEncoderConfig.Builder setColorFormat(int i) {
            this.colorFormat = Integer.valueOf(i);
            return this;
        }

        public VideoEncoderConfig.Builder setFrameRate(int i) {
            this.frameRate = Integer.valueOf(i);
            return this;
        }

        public VideoEncoderConfig.Builder setIFrameInterval(int i) {
            this.IFrameInterval = Integer.valueOf(i);
            return this;
        }

        public VideoEncoderConfig.Builder setBitrate(int i) {
            this.bitrate = Integer.valueOf(i);
            return this;
        }

        public VideoEncoderConfig build() {
            String str = this.mimeType == null ? " mimeType" : "";
            if (this.profile == null) {
                str = str + " profile";
            }
            if (this.resolution == null) {
                str = str + " resolution";
            }
            if (this.colorFormat == null) {
                str = str + " colorFormat";
            }
            if (this.frameRate == null) {
                str = str + " frameRate";
            }
            if (this.IFrameInterval == null) {
                str = str + " IFrameInterval";
            }
            if (this.bitrate == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new AutoValue_VideoEncoderConfig(this.mimeType, this.profile.intValue(), this.resolution, this.colorFormat.intValue(), this.frameRate.intValue(), this.IFrameInterval.intValue(), this.bitrate.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
