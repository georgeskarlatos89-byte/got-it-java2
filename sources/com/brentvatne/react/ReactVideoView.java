package com.brentvatne.react;

import android.app.Activity;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.media.TimedMetaData;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.yqritc.scalablevideoview.ScalableType;
import com.yqritc.scalablevideoview.ScalableVideoView;
import com.yqritc.scalablevideoview.ScaleManager;
import com.yqritc.scalablevideoview.Size;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactVideoView extends ScalableVideoView implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, LifecycleEventListener, MediaController.MediaPlayerControl {
    public static final String EVENT_PROP_CURRENT_TIME = "currentTime";
    public static final String EVENT_PROP_DURATION = "duration";
    public static final String EVENT_PROP_ERROR = "error";
    public static final String EVENT_PROP_EXTRA = "extra";
    public static final String EVENT_PROP_FAST_FORWARD = "canPlayFastForward";
    public static final String EVENT_PROP_HEIGHT = "height";
    public static final String EVENT_PROP_METADATA = "metadata";
    public static final String EVENT_PROP_METADATA_IDENTIFIER = "identifier";
    public static final String EVENT_PROP_METADATA_VALUE = "value";
    public static final String EVENT_PROP_NATURALSIZE = "naturalSize";
    public static final String EVENT_PROP_ORIENTATION = "orientation";
    public static final String EVENT_PROP_PLAYABLE_DURATION = "playableDuration";
    public static final String EVENT_PROP_REVERSE = "canPlayReverse";
    public static final String EVENT_PROP_SEEKABLE_DURATION = "seekableDuration";
    public static final String EVENT_PROP_SEEK_TIME = "seekTime";
    public static final String EVENT_PROP_SLOW_FORWARD = "canPlaySlowForward";
    public static final String EVENT_PROP_SLOW_REVERSE = "canPlaySlowReverse";
    public static final String EVENT_PROP_STEP_BACKWARD = "canStepBackward";
    public static final String EVENT_PROP_STEP_FORWARD = "canStepForward";
    public static final String EVENT_PROP_TARGET = "target";
    public static final String EVENT_PROP_WHAT = "what";
    public static final String EVENT_PROP_WIDTH = "width";
    /* access modifiers changed from: private */
    public boolean isCompleted = false;
    private float mActiveRate = 1.0f;
    /* access modifiers changed from: private */
    public boolean mBackgroundPaused = false;
    /* access modifiers changed from: private */
    public RCTEventEmitter mEventEmitter;
    private boolean mIsFullscreen = false;
    private int mMainVer = 0;
    /* access modifiers changed from: private */
    public boolean mMediaPlayerValid = false;
    private boolean mMuted = false;
    private int mPatchVer = 0;
    /* access modifiers changed from: private */
    public boolean mPaused = false;
    private boolean mPlayInBackground = false;
    private boolean mPreventsDisplaySleepDuringVideoPlayback = true;
    /* access modifiers changed from: private */
    public Handler mProgressUpdateHandler = new Handler();
    /* access modifiers changed from: private */
    public float mProgressUpdateInterval = 250.0f;
    /* access modifiers changed from: private */
    public Runnable mProgressUpdateRunnable = null;
    private float mRate = 1.0f;
    private boolean mRepeat = false;
    private ReadableMap mRequestHeaders = null;
    private ScalableType mResizeMode = ScalableType.LEFT_TOP;
    private long mSeekTime = 0;
    private boolean mSrcIsAsset = false;
    private boolean mSrcIsNetwork = false;
    private String mSrcType = "mp4";
    private String mSrcUriString = null;
    private float mStereoPan = 0.0f;
    private ThemedReactContext mThemedReactContext;
    private boolean mUseNativeControls = false;
    /* access modifiers changed from: private */
    public int mVideoBufferedDuration = 0;
    /* access modifiers changed from: private */
    public int mVideoDuration = 0;
    private float mVolume = 1.0f;
    /* access modifiers changed from: private */
    public MediaController mediaController;
    private Handler videoControlHandler = new Handler();

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        return 0;
    }

    public void onHostDestroy() {
    }

    public enum Events {
        EVENT_LOAD_START("onVideoLoadStart"),
        EVENT_LOAD("onVideoLoad"),
        EVENT_ERROR("onVideoError"),
        EVENT_PROGRESS("onVideoProgress"),
        EVENT_TIMED_METADATA("onTimedMetadata"),
        EVENT_SEEK("onVideoSeek"),
        EVENT_END("onVideoEnd"),
        EVENT_STALLED("onPlaybackStalled"),
        EVENT_RESUME("onPlaybackResume"),
        EVENT_READY_FOR_DISPLAY("onReadyForDisplay"),
        EVENT_FULLSCREEN_WILL_PRESENT("onVideoFullscreenPlayerWillPresent"),
        EVENT_FULLSCREEN_DID_PRESENT("onVideoFullscreenPlayerDidPresent"),
        EVENT_FULLSCREEN_WILL_DISMISS("onVideoFullscreenPlayerWillDismiss"),
        EVENT_FULLSCREEN_DID_DISMISS("onVideoFullscreenPlayerDidDismiss");
        
        private final String mName;

        private Events(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    public ReactVideoView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.mThemedReactContext = themedReactContext;
        this.mEventEmitter = (RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class);
        themedReactContext.addLifecycleEventListener(this);
        initializeMediaPlayerIfNeeded();
        setSurfaceTextureListener(this);
        this.mProgressUpdateRunnable = new Runnable() {
            public void run() {
                if (ReactVideoView.this.mMediaPlayerValid && !ReactVideoView.this.isCompleted && !ReactVideoView.this.mPaused && !ReactVideoView.this.mBackgroundPaused) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble(ReactVideoView.EVENT_PROP_CURRENT_TIME, ((double) ReactVideoView.this.mMediaPlayer.getCurrentPosition()) / 1000.0d);
                    createMap.putDouble(ReactVideoView.EVENT_PROP_PLAYABLE_DURATION, ((double) ReactVideoView.this.mVideoBufferedDuration) / 1000.0d);
                    createMap.putDouble(ReactVideoView.EVENT_PROP_SEEKABLE_DURATION, ((double) ReactVideoView.this.mVideoDuration) / 1000.0d);
                    ReactVideoView.this.mEventEmitter.receiveEvent(ReactVideoView.this.getId(), Events.EVENT_PROGRESS.toString(), createMap);
                    ReactVideoView.this.mProgressUpdateHandler.postDelayed(ReactVideoView.this.mProgressUpdateRunnable, (long) Math.round(ReactVideoView.this.mProgressUpdateInterval));
                }
            }
        };
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mUseNativeControls) {
            initializeMediaControllerIfNeeded();
            this.mediaController.show();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Matrix scaleMatrix;
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.mMediaPlayerValid) {
            int videoWidth = getVideoWidth();
            int videoHeight = getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0 && (scaleMatrix = new ScaleManager(new Size(getWidth(), getHeight()), new Size(videoWidth, videoHeight)).getScaleMatrix(this.mScalableType)) != null) {
                setTransform(scaleMatrix);
            }
        }
    }

    private void initializeMediaPlayerIfNeeded() {
        if (this.mMediaPlayer == null) {
            this.mMediaPlayerValid = false;
            this.mMediaPlayer = new MediaPlayer();
            this.mMediaPlayer.setOnVideoSizeChangedListener(this);
            this.mMediaPlayer.setOnErrorListener(this);
            this.mMediaPlayer.setOnPreparedListener(this);
            this.mMediaPlayer.setOnBufferingUpdateListener(this);
            this.mMediaPlayer.setOnSeekCompleteListener(this);
            this.mMediaPlayer.setOnCompletionListener(this);
            this.mMediaPlayer.setOnInfoListener(this);
            this.mMediaPlayer.setOnTimedMetaDataAvailableListener(new TimedMetaDataAvailableListener());
        }
    }

    private void initializeMediaControllerIfNeeded() {
        if (this.mediaController == null) {
            this.mediaController = new MediaController(getContext());
        }
    }

    public void cleanupMediaPlayerResources() {
        MediaController mediaController2 = this.mediaController;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setOnTimedMetaDataAvailableListener((MediaPlayer.OnTimedMetaDataAvailableListener) null);
            this.mMediaPlayerValid = false;
            release();
        }
        if (this.mIsFullscreen) {
            setFullscreen(false);
        }
        ThemedReactContext themedReactContext = this.mThemedReactContext;
        if (themedReactContext != null) {
            themedReactContext.removeLifecycleEventListener(this);
            this.mThemedReactContext = null;
        }
    }

    public void setSrc(String str, String str2, boolean z, boolean z2, ReadableMap readableMap) {
        setSrc(str, str2, z, z2, readableMap, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[Catch:{ Exception -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1 A[Catch:{ Exception -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSrc(java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, com.facebook.react.bridge.ReadableMap r11, int r12, int r13) {
        /*
            r6 = this;
            java.lang.String r0 = ".mp4"
            r6.mSrcUriString = r7
            r6.mSrcType = r8
            r6.mSrcIsNetwork = r9
            r6.mSrcIsAsset = r10
            r6.mRequestHeaders = r11
            r6.mMainVer = r12
            r6.mPatchVer = r13
            r11 = 0
            r6.mMediaPlayerValid = r11
            r6.mVideoDuration = r11
            r6.mVideoBufferedDuration = r11
            r6.initializeMediaPlayerIfNeeded()
            android.media.MediaPlayer r12 = r6.mMediaPlayer
            r12.reset()
            if (r9 == 0) goto L_0x005a
            android.webkit.CookieManager r10 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x0057 }
            android.net.Uri r12 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0057 }
            android.net.Uri$Builder r13 = r12.buildUpon()     // Catch:{ Exception -> 0x0057 }
            android.net.Uri r13 = r13.build()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r10 = r10.getCookie(r13)     // Catch:{ Exception -> 0x0057 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ Exception -> 0x0057 }
            r13.<init>()     // Catch:{ Exception -> 0x0057 }
            if (r10 == 0) goto L_0x0045
            java.lang.String r0 = "Cookie"
            r13.put(r0, r10)     // Catch:{ Exception -> 0x0057 }
        L_0x0045:
            com.facebook.react.bridge.ReadableMap r10 = r6.mRequestHeaders     // Catch:{ Exception -> 0x0057 }
            if (r10 == 0) goto L_0x0050
            java.util.Map r10 = toStringMap(r10)     // Catch:{ Exception -> 0x0057 }
            r13.putAll(r10)     // Catch:{ Exception -> 0x0057 }
        L_0x0050:
            com.facebook.react.uimanager.ThemedReactContext r10 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            r6.setDataSource((android.content.Context) r10, (android.net.Uri) r12, (java.util.Map<java.lang.String, java.lang.String>) r13)     // Catch:{ Exception -> 0x0057 }
            goto L_0x00e1
        L_0x0057:
            r7 = move-exception
            goto L_0x0137
        L_0x005a:
            if (r10 == 0) goto L_0x0073
            java.lang.String r10 = "content://"
            boolean r10 = r7.startsWith(r10)     // Catch:{ Exception -> 0x0057 }
            if (r10 == 0) goto L_0x006f
            android.net.Uri r10 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0057 }
            com.facebook.react.uimanager.ThemedReactContext r12 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            r6.setDataSource(r12, r10)     // Catch:{ Exception -> 0x0057 }
            goto L_0x00e1
        L_0x006f:
            r6.setDataSource((java.lang.String) r7)     // Catch:{ Exception -> 0x0057 }
            goto L_0x00e1
        L_0x0073:
            int r10 = r6.mMainVer     // Catch:{ Exception -> 0x0057 }
            if (r10 <= 0) goto L_0x00a4
            com.facebook.react.uimanager.ThemedReactContext r12 = r6.mThemedReactContext     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            int r13 = r6.mPatchVer     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            com.android.vending.expansion.zipfile.ZipResourceFile r10 = com.android.vending.expansion.zipfile.APKExpansionSupport.getAPKExpansionZipFile(r12, r10, r13)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            r12.<init>()     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            java.lang.String r13 = ""
            java.lang.String r13 = r7.replace(r0, r13)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            java.lang.StringBuilder r12 = r12.append(r0)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            android.content.res.AssetFileDescriptor r10 = r10.getAssetFileDescriptor(r12)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009b }
            goto L_0x00a5
        L_0x009b:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ Exception -> 0x0057 }
            goto L_0x00a4
        L_0x00a0:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ Exception -> 0x0057 }
        L_0x00a4:
            r10 = 0
        L_0x00a5:
            if (r10 != 0) goto L_0x00d1
            com.facebook.react.uimanager.ThemedReactContext r10 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r12 = "drawable"
            com.facebook.react.uimanager.ThemedReactContext r13 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ Exception -> 0x0057 }
            int r10 = r10.getIdentifier(r7, r12, r13)     // Catch:{ Exception -> 0x0057 }
            if (r10 != 0) goto L_0x00cd
            com.facebook.react.uimanager.ThemedReactContext r10 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r12 = "raw"
            com.facebook.react.uimanager.ThemedReactContext r13 = r6.mThemedReactContext     // Catch:{ Exception -> 0x0057 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ Exception -> 0x0057 }
            int r10 = r10.getIdentifier(r7, r12, r13)     // Catch:{ Exception -> 0x0057 }
        L_0x00cd:
            r6.setRawData(r10)     // Catch:{ Exception -> 0x0057 }
            goto L_0x00e1
        L_0x00d1:
            java.io.FileDescriptor r1 = r10.getFileDescriptor()     // Catch:{ Exception -> 0x0057 }
            long r2 = r10.getStartOffset()     // Catch:{ Exception -> 0x0057 }
            long r4 = r10.getLength()     // Catch:{ Exception -> 0x0057 }
            r0 = r6
            r0.setDataSource((java.io.FileDescriptor) r1, (long) r2, (long) r4)     // Catch:{ Exception -> 0x0057 }
        L_0x00e1:
            com.facebook.react.bridge.WritableMap r10 = com.facebook.react.bridge.Arguments.createMap()
            com.facebook.react.bridge.WritableMap r12 = com.facebook.react.bridge.Arguments.createMap()
            com.facebook.react.bridge.ReadableMap r13 = r6.mRequestHeaders
            r12.merge(r13)
            java.lang.String r13 = "uri"
            r10.putString(r13, r7)
            java.lang.String r7 = "type"
            r10.putString(r7, r8)
            java.lang.String r7 = "requestHeaders"
            r10.putMap(r7, r12)
            java.lang.String r7 = "isNetwork"
            r10.putBoolean(r7, r9)
            int r7 = r6.mMainVer
            if (r7 <= 0) goto L_0x0114
            java.lang.String r8 = "mainVer"
            r10.putInt(r8, r7)
            int r7 = r6.mPatchVer
            if (r7 <= 0) goto L_0x0114
            java.lang.String r8 = "patchVer"
            r10.putInt(r8, r7)
        L_0x0114:
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r8 = "src"
            r7.putMap(r8, r10)
            com.facebook.react.uimanager.events.RCTEventEmitter r8 = r6.mEventEmitter
            int r9 = r6.getId()
            com.brentvatne.react.ReactVideoView$Events r10 = com.brentvatne.react.ReactVideoView.Events.EVENT_LOAD_START
            java.lang.String r10 = r10.toString()
            r8.receiveEvent(r9, r10, r7)
            r6.isCompleted = r11
            r6.prepareAsync(r6)     // Catch:{ Exception -> 0x0132 }
            goto L_0x0136
        L_0x0132:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0136:
            return
        L_0x0137:
            r7.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.react.ReactVideoView.setSrc(java.lang.String, java.lang.String, boolean, boolean, com.facebook.react.bridge.ReadableMap, int, int):void");
    }

    public void setResizeModeModifier(ScalableType scalableType) {
        this.mResizeMode = scalableType;
        if (this.mMediaPlayerValid) {
            setScalableType(scalableType);
            invalidate();
        }
    }

    public void setRepeatModifier(boolean z) {
        this.mRepeat = z;
        if (this.mMediaPlayerValid) {
            setLooping(z);
        }
    }

    public void setPausedModifier(boolean z) {
        this.mPaused = z;
        if (this.mMediaPlayerValid) {
            if (z) {
                if (this.mMediaPlayer.isPlaying()) {
                    pause();
                }
            } else if (!this.mMediaPlayer.isPlaying()) {
                start();
                float f = this.mRate;
                if (f != this.mActiveRate) {
                    setRateModifier(f);
                }
                this.mProgressUpdateHandler.post(this.mProgressUpdateRunnable);
            }
            setKeepScreenOn(!this.mPaused && this.mPreventsDisplaySleepDuringVideoPlayback);
        }
    }

    private float calulateRelativeVolume() {
        return new BigDecimal((double) (this.mVolume * (1.0f - Math.abs(this.mStereoPan)))).setScale(1, 4).floatValue();
    }

    public void setPreventsDisplaySleepDuringVideoPlaybackModifier(boolean z) {
        this.mPreventsDisplaySleepDuringVideoPlayback = z;
        if (this.mMediaPlayerValid) {
            this.mMediaPlayer.setScreenOnWhilePlaying(this.mPreventsDisplaySleepDuringVideoPlayback);
            setKeepScreenOn(this.mPreventsDisplaySleepDuringVideoPlayback);
        }
    }

    public void setMutedModifier(boolean z) {
        this.mMuted = z;
        if (this.mMediaPlayerValid) {
            if (z) {
                setVolume(0.0f, 0.0f);
                return;
            }
            float f = this.mStereoPan;
            if (f < 0.0f) {
                setVolume(this.mVolume, calulateRelativeVolume());
            } else if (f > 0.0f) {
                setVolume(calulateRelativeVolume(), this.mVolume);
            } else {
                float f2 = this.mVolume;
                setVolume(f2, f2);
            }
        }
    }

    public void setVolumeModifier(float f) {
        this.mVolume = f;
        setMutedModifier(this.mMuted);
    }

    public void setStereoPan(float f) {
        this.mStereoPan = f;
        setMutedModifier(this.mMuted);
    }

    public void setProgressUpdateInterval(float f) {
        this.mProgressUpdateInterval = f;
    }

    public void setRateModifier(float f) {
        this.mRate = f;
        if (this.mMediaPlayerValid && !this.mPaused) {
            try {
                this.mMediaPlayer.setPlaybackParams(this.mMediaPlayer.getPlaybackParams().setSpeed(f));
                this.mActiveRate = f;
            } catch (Exception unused) {
                Log.e(ReactVideoViewManager.REACT_CLASS, "Unable to set rate, unsupported on this device");
            }
        }
    }

    public void setFullscreen(boolean z) {
        if (z != this.mIsFullscreen) {
            this.mIsFullscreen = z;
            Activity currentActivity = this.mThemedReactContext.getCurrentActivity();
            if (currentActivity != null) {
                View decorView = currentActivity.getWindow().getDecorView();
                if (this.mIsFullscreen) {
                    this.mEventEmitter.receiveEvent(getId(), Events.EVENT_FULLSCREEN_WILL_PRESENT.toString(), (WritableMap) null);
                    decorView.setSystemUiVisibility(4102);
                    this.mEventEmitter.receiveEvent(getId(), Events.EVENT_FULLSCREEN_DID_PRESENT.toString(), (WritableMap) null);
                    return;
                }
                this.mEventEmitter.receiveEvent(getId(), Events.EVENT_FULLSCREEN_WILL_DISMISS.toString(), (WritableMap) null);
                decorView.setSystemUiVisibility(0);
                this.mEventEmitter.receiveEvent(getId(), Events.EVENT_FULLSCREEN_DID_DISMISS.toString(), (WritableMap) null);
            }
        }
    }

    public void applyModifiers() {
        setResizeModeModifier(this.mResizeMode);
        setRepeatModifier(this.mRepeat);
        setPausedModifier(this.mPaused);
        setMutedModifier(this.mMuted);
        setPreventsDisplaySleepDuringVideoPlaybackModifier(this.mPreventsDisplaySleepDuringVideoPlayback);
        setProgressUpdateInterval(this.mProgressUpdateInterval);
        setRateModifier(this.mRate);
    }

    public void setPlayInBackground(boolean z) {
        this.mPlayInBackground = z;
    }

    public void setControls(boolean z) {
        this.mUseNativeControls = z;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mMediaPlayerValid = true;
        this.mVideoDuration = mediaPlayer.getDuration();
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("width", mediaPlayer.getVideoWidth());
        createMap.putInt("height", mediaPlayer.getVideoHeight());
        if (mediaPlayer.getVideoWidth() > mediaPlayer.getVideoHeight()) {
            createMap.putString(EVENT_PROP_ORIENTATION, "landscape");
        } else {
            createMap.putString(EVENT_PROP_ORIENTATION, "portrait");
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(EVENT_PROP_DURATION, ((double) this.mVideoDuration) / 1000.0d);
        createMap2.putDouble(EVENT_PROP_CURRENT_TIME, ((double) mediaPlayer.getCurrentPosition()) / 1000.0d);
        createMap2.putMap(EVENT_PROP_NATURALSIZE, createMap);
        createMap2.putBoolean(EVENT_PROP_FAST_FORWARD, true);
        createMap2.putBoolean(EVENT_PROP_SLOW_FORWARD, true);
        createMap2.putBoolean(EVENT_PROP_SLOW_REVERSE, true);
        createMap2.putBoolean(EVENT_PROP_REVERSE, true);
        createMap2.putBoolean(EVENT_PROP_FAST_FORWARD, true);
        createMap2.putBoolean(EVENT_PROP_STEP_BACKWARD, true);
        createMap2.putBoolean(EVENT_PROP_STEP_FORWARD, true);
        this.mEventEmitter.receiveEvent(getId(), Events.EVENT_LOAD.toString(), createMap2);
        applyModifiers();
        if (this.mUseNativeControls) {
            initializeMediaControllerIfNeeded();
            this.mediaController.setMediaPlayer(this);
            this.mediaController.setAnchorView(this);
            this.videoControlHandler.post(new Runnable() {
                public void run() {
                    ReactVideoView.this.mediaController.setEnabled(true);
                    ReactVideoView.this.mediaController.show();
                }
            });
        }
        selectTimedMetadataTrack(mediaPlayer);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(EVENT_PROP_WHAT, i);
        createMap.putInt(EVENT_PROP_EXTRA, i2);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        this.mEventEmitter.receiveEvent(getId(), Events.EVENT_ERROR.toString(), createMap2);
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            this.mEventEmitter.receiveEvent(getId(), Events.EVENT_READY_FOR_DISPLAY.toString(), Arguments.createMap());
            return false;
        } else if (i == 701) {
            this.mEventEmitter.receiveEvent(getId(), Events.EVENT_STALLED.toString(), Arguments.createMap());
            return false;
        } else if (i != 702) {
            return false;
        } else {
            this.mEventEmitter.receiveEvent(getId(), Events.EVENT_RESUME.toString(), Arguments.createMap());
            return false;
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        selectTimedMetadataTrack(mediaPlayer);
        this.mVideoBufferedDuration = (int) Math.round(((double) (this.mVideoDuration * i)) / 100.0d);
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(EVENT_PROP_CURRENT_TIME, ((double) getCurrentPosition()) / 1000.0d);
        createMap.putDouble(EVENT_PROP_SEEK_TIME, ((double) this.mSeekTime) / 1000.0d);
        this.mEventEmitter.receiveEvent(getId(), Events.EVENT_SEEK.toString(), createMap);
        this.mSeekTime = 0;
    }

    public void seekTo(int i) {
        int i2;
        if (this.mMediaPlayerValid) {
            this.mSeekTime = (long) i;
            super.seekTo(i);
            if (this.isCompleted && (i2 = this.mVideoDuration) != 0 && i < i2) {
                this.isCompleted = false;
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.isCompleted = true;
        this.mEventEmitter.receiveEvent(getId(), Events.EVENT_END.toString(), (WritableMap) null);
        if (!this.mRepeat) {
            setKeepScreenOn(false);
        }
    }

    public class TimedMetaDataAvailableListener implements MediaPlayer.OnTimedMetaDataAvailableListener {
        public TimedMetaDataAvailableListener() {
        }

        public void onTimedMetaDataAvailable(MediaPlayer mediaPlayer, TimedMetaData timedMetaData) {
            WritableMap createMap = Arguments.createMap();
            try {
                String str = new String(timedMetaData.getMetaData(), "UTF-8");
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("value", str.substring(str.lastIndexOf("\u0003") + 1));
                createMap2.putString("identifier", "id3/TDEN");
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                writableNativeArray.pushMap(createMap2);
                createMap.putArray(ReactVideoView.EVENT_PROP_METADATA, writableNativeArray);
                createMap.putDouble("target", (double) ReactVideoView.this.getId());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            ReactVideoView.this.mEventEmitter.receiveEvent(ReactVideoView.this.getId(), Events.EVENT_TIMED_METADATA.toString(), createMap);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.mMediaPlayerValid = false;
        super.onDetachedFromWindow();
        setKeepScreenOn(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.mMainVer;
        if (i > 0) {
            setSrc(this.mSrcUriString, this.mSrcType, this.mSrcIsNetwork, this.mSrcIsAsset, this.mRequestHeaders, i, this.mPatchVer);
        } else {
            setSrc(this.mSrcUriString, this.mSrcType, this.mSrcIsNetwork, this.mSrcIsAsset, this.mRequestHeaders);
        }
        setKeepScreenOn(this.mPreventsDisplaySleepDuringVideoPlayback);
    }

    public void onHostPause() {
        if (this.mMediaPlayerValid && !this.mPaused && !this.mPlayInBackground) {
            this.mBackgroundPaused = true;
            this.mMediaPlayer.pause();
        }
    }

    public void onHostResume() {
        this.mBackgroundPaused = false;
        if (this.mMediaPlayerValid && !this.mPlayInBackground && !this.mPaused) {
            new Handler().post(new Runnable() {
                public void run() {
                    ReactVideoView.this.setPausedModifier(false);
                }
            });
        }
    }

    public static Map<String, String> toStringMap(@Nullable ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            return hashMap;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    private void selectTimedMetadataTrack(MediaPlayer mediaPlayer) {
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            for (int i = 0; i < trackInfo.length; i++) {
                if (trackInfo[i].getTrackType() == 3) {
                    mediaPlayer.selectTrack(i);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
