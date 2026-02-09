package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;

final class AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig extends Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig {
    private final int imageFormat;
    private final int maxImages;

    AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig(int i, int i2) {
        this.imageFormat = i;
        this.maxImages = i2;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getMaxImages() {
        return this.maxImages;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig)) {
            return false;
        }
        Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig multiResolutionImageReaderConfig = (Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig) obj;
        if (this.imageFormat == multiResolutionImageReaderConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderConfig.getMaxImages()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.imageFormat ^ 1000003) * 1000003) ^ this.maxImages;
    }
}
