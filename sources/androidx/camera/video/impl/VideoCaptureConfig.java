package androidx.camera.video.impl;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;

public final class VideoCaptureConfig<T extends VideoOutput> implements UseCaseConfig<VideoCapture<T>>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option<VideoOutput> OPTION_VIDEO_OUTPUT = Config.Option.create("camerax.video.VideoCapture.videoOutput", VideoOutput.class);
    private final OptionsBundle mConfig;

    public int getInputFormat() {
        return 34;
    }

    public VideoCaptureConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public T getVideoOutput() {
        return (VideoOutput) retrieveOption(OPTION_VIDEO_OUTPUT);
    }

    public Config getConfig() {
        return this.mConfig;
    }
}
