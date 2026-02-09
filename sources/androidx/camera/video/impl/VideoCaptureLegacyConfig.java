package androidx.camera.video.impl;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoCaptureLegacy;

public final class VideoCaptureLegacyConfig implements UseCaseConfig<VideoCaptureLegacy>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option<Integer> OPTION_AUDIO_BIT_RATE = Config.Option.create("camerax.video.videoCaptureLegacy.audioBitRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_CHANNEL_COUNT = Config.Option.create("camerax.video.videoCaptureLegacy.audioChannelCount", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_MIN_BUFFER_SIZE = Config.Option.create("camerax.video.videoCaptureLegacy.audioMinBufferSize", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_RECORD_SOURCE = Config.Option.create("camerax.video.videoCaptureLegacy.audioRecordSource", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_AUDIO_SAMPLE_RATE = Config.Option.create("camerax.video.videoCaptureLegacy.audioSampleRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_BIT_RATE = Config.Option.create("camerax.video.videoCaptureLegacy.bitRate", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_INTRA_FRAME_INTERVAL = Config.Option.create("camerax.video.videoCaptureLegacy.intraFrameInterval", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_VIDEO_FRAME_RATE = Config.Option.create("camerax.video.videoCaptureLegacy.recordingFrameRate", Integer.TYPE);
    private final OptionsBundle mConfig;

    public int getInputFormat() {
        return 34;
    }

    public VideoCaptureLegacyConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public int getVideoFrameRate(int i) {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i))).intValue();
    }

    public int getVideoFrameRate() {
        return ((Integer) retrieveOption(OPTION_VIDEO_FRAME_RATE)).intValue();
    }

    public int getBitRate(int i) {
        return ((Integer) retrieveOption(OPTION_BIT_RATE, Integer.valueOf(i))).intValue();
    }

    public int getBitRate() {
        return ((Integer) retrieveOption(OPTION_BIT_RATE)).intValue();
    }

    public int getIFrameInterval(int i) {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i))).intValue();
    }

    public int getIFrameInterval() {
        return ((Integer) retrieveOption(OPTION_INTRA_FRAME_INTERVAL)).intValue();
    }

    public int getAudioBitRate(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE, Integer.valueOf(i))).intValue();
    }

    public int getAudioBitRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_BIT_RATE)).intValue();
    }

    public int getAudioSampleRate(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i))).intValue();
    }

    public int getAudioSampleRate() {
        return ((Integer) retrieveOption(OPTION_AUDIO_SAMPLE_RATE)).intValue();
    }

    public int getAudioChannelCount(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i))).intValue();
    }

    public int getAudioChannelCount() {
        return ((Integer) retrieveOption(OPTION_AUDIO_CHANNEL_COUNT)).intValue();
    }

    public int getAudioRecordSource(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_RECORD_SOURCE, Integer.valueOf(i))).intValue();
    }

    public int getAudioRecordSource() {
        return ((Integer) retrieveOption(OPTION_AUDIO_RECORD_SOURCE)).intValue();
    }

    public int getAudioMinBufferSize(int i) {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i))).intValue();
    }

    public int getAudioMinBufferSize() {
        return ((Integer) retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE)).intValue();
    }

    public Config getConfig() {
        return this.mConfig;
    }
}
