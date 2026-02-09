package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    CameraEventCallbacks mCameraEventCallbacks;
    Config mCameraEventOnRepeatingOptions;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private final List<CaptureConfig> mCaptureConfigs;
    private final StateCallback mCaptureSessionStateCallback;
    List<DeferrableSurface> mConfiguredDeferrableSurfaces;
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;
    ListenableFuture<Void> mReleaseFuture;
    SessionConfig mSessionConfig;
    final Object mSessionLock;
    State mState;
    final StillCaptureFlow mStillCaptureFlow;
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    SynchronizedCaptureSessionOpener mSynchronizedCaptureSessionOpener;

    enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    CaptureSession() {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            }
        };
        this.mCameraEventOnRepeatingOptions = OptionsBundle.emptyBundle();
        this.mCameraEventCallbacks = CameraEventCallbacks.createEmptyCallback();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.emptyList();
        this.mState = State.UNINITIALIZED;
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mState = State.INITIALIZED;
        this.mCaptureSessionStateCallback = new StateCallback();
    }

    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State = r0
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.AnonymousClass3.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSessionConfig(androidx.camera.core.impl.SessionConfig r5) {
        /*
            r4 = this;
            java.lang.String r0 = "setSessionConfig() should not be possible in state: "
            java.lang.Object r1 = r4.mSessionLock
            monitor-enter(r1)
            int[] r2 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ all -> 0x0061 }
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch:{ all -> 0x0061 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0061 }
            r2 = r2[r3]     // Catch:{ all -> 0x0061 }
            switch(r2) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0047;
                case 3: goto L_0x0047;
                case 4: goto L_0x0047;
                case 5: goto L_0x001b;
                case 6: goto L_0x0013;
                case 7: goto L_0x0013;
                case 8: goto L_0x0013;
                default: goto L_0x0012;
            }     // Catch:{ all -> 0x0061 }
        L_0x0012:
            goto L_0x005f
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "Session configuration cannot be set on a closed/released session."
            r5.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x001b:
            r4.mSessionConfig = r5     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0021
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x0021:
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r0 = r4.mConfiguredSurfaceMap     // Catch:{ all -> 0x0061 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0061 }
            java.util.List r5 = r5.getSurfaces()     // Catch:{ all -> 0x0061 }
            boolean r5 = r0.containsAll(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x003a
            java.lang.String r5 = "CaptureSession"
            java.lang.String r0 = "Does not have the proper configured lists"
            androidx.camera.core.Logger.e(r5, r0)     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x003a:
            java.lang.String r5 = "CaptureSession"
            java.lang.String r0 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.Logger.d(r5, r0)     // Catch:{ all -> 0x0061 }
            androidx.camera.core.impl.SessionConfig r5 = r4.mSessionConfig     // Catch:{ all -> 0x0061 }
            r4.issueRepeatingCaptureRequests(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x0047:
            r4.mSessionConfig = r5     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x004a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r2.<init>(r0)     // Catch:{ all -> 0x0061 }
            androidx.camera.camera2.internal.CaptureSession$State r0 = r4.mState     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.setSessionConfig(androidx.camera.core.impl.SessionConfig):void");
    }

    public ListenableFuture<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        synchronized (this.mSessionLock) {
            if (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()] != 2) {
                Logger.e(TAG, "Open not allowed in state: " + this.mState);
                ListenableFuture<Void> immediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
                return immediateFailedFuture;
            }
            this.mState = State.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
            this.mConfiguredDeferrableSurfaces = arrayList;
            this.mSynchronizedCaptureSessionOpener = synchronizedCaptureSessionOpener;
            FutureChain<T> transformAsync = FutureChain.from(synchronizedCaptureSessionOpener.startWithDeferrableSurface(arrayList, 5000)).transformAsync(new CaptureSession$$ExternalSyntheticLambda1(this, sessionConfig, cameraDevice), this.mSynchronizedCaptureSessionOpener.getExecutor());
            Futures.addCallback(transformAsync, new FutureCallback<Void>() {
                public void onSuccess(Void voidR) {
                }

                public void onFailure(Throwable th) {
                    synchronized (CaptureSession.this.mSessionLock) {
                        CaptureSession.this.mSynchronizedCaptureSessionOpener.stop();
                        int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()];
                        if (i == 4 || i == 6 || i == 7) {
                            if (!(th instanceof CancellationException)) {
                                Logger.w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th);
                                CaptureSession.this.finishClose();
                            }
                        }
                    }
                }
            }, this.mSynchronizedCaptureSessionOpener.getExecutor());
            ListenableFuture<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
            return nonCancellationPropagating;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openCaptureSession */
    public ListenableFuture<Void> m55lambda$open$0$androidxcameracamera2internalCaptureSession(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList<>(new LinkedHashSet(list));
                    this.mState = State.OPENING;
                    Logger.d(TAG, "Opening capture session.");
                    SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                    CameraEventCallbacks cameraEventCallback = camera2ImplConfig.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback());
                    this.mCameraEventCallbacks = cameraEventCallback;
                    List<CaptureConfig> onPresetSession = cameraEventCallback.createComboCallback().onPresetSession();
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    for (CaptureConfig implementationOptions : onPresetSession) {
                        from.addImplementationOptions(implementationOptions.getImplementationOptions());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface outputConfigurationCompat : arrayList) {
                        OutputConfigurationCompat outputConfigurationCompat2 = new OutputConfigurationCompat(outputConfigurationCompat);
                        outputConfigurationCompat2.setPhysicalCameraId(camera2ImplConfig.getPhysicalCameraId((String) null));
                        arrayList2.add(outputConfigurationCompat2);
                    }
                    SessionConfigurationCompat createSessionConfigurationCompat = this.mSynchronizedCaptureSessionOpener.createSessionConfigurationCompat(0, arrayList2, createComboCallback);
                    try {
                        CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        ListenableFuture<Void> openCaptureSession = this.mSynchronizedCaptureSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                        return openCaptureSession;
                    } catch (CameraAccessException e) {
                        return Futures.immediateFailedFuture(e);
                    }
                } else if (i != 5) {
                    ListenableFuture<Void> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                    return immediateFailedFuture;
                }
            }
            ListenableFuture<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
            return immediateFailedFuture2;
        }
    }

    public void close() {
        synchronized (this.mSessionLock) {
            int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.mSessionConfig != null) {
                                    List<CaptureConfig> onDisableSession = this.mCameraEventCallbacks.createComboCallback().onDisableSession();
                                    if (!onDisableSession.isEmpty()) {
                                        try {
                                            issueCaptureRequests(setupConfiguredSurface(onDisableSession));
                                        } catch (IllegalStateException e) {
                                            Logger.e(TAG, "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        Preconditions.checkNotNull(this.mSynchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                        this.mState = State.CLOSED;
                        this.mSessionConfig = null;
                    } else {
                        Preconditions.checkNotNull(this.mSynchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                    }
                }
                this.mState = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r6.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASING;
        androidx.core.util.Preconditions.checkNotNull(r6.mSynchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + r6.mState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r6.mSynchronizedCaptureSessionOpener.stop() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        finishClose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r6.mReleaseFuture != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r6.mReleaseFuture = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda2(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r7 = r6.mReleaseFuture;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r6.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release(boolean r7) {
        /*
            r6 = this;
            java.lang.String r0 = "The Opener shouldn't null in state:"
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "release() should not be possible in state: "
            java.lang.Object r3 = r6.mSessionLock
            monitor-enter(r3)
            int[] r4 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.CaptureSession$State r5 = r6.mState     // Catch:{ all -> 0x00a0 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x00a0 }
            r4 = r4[r5]     // Catch:{ all -> 0x00a0 }
            switch(r4) {
                case 1: goto L_0x0084;
                case 2: goto L_0x007f;
                case 3: goto L_0x0066;
                case 4: goto L_0x002f;
                case 5: goto L_0x0018;
                case 6: goto L_0x0018;
                case 7: goto L_0x0053;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x00a0 }
        L_0x0016:
            goto L_0x0099
        L_0x0018:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r6.mSynchronizedCaptureSession     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x002f
            if (r7 == 0) goto L_0x002a
            r1.abortCaptures()     // Catch:{ CameraAccessException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r7 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.Logger.e(r1, r2, r7)     // Catch:{ all -> 0x00a0 }
        L_0x002a:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r7 = r6.mSynchronizedCaptureSession     // Catch:{ all -> 0x00a0 }
            r7.close()     // Catch:{ all -> 0x00a0 }
        L_0x002f:
            androidx.camera.camera2.internal.CaptureSession$State r7 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ all -> 0x00a0 }
            r6.mState = r7     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r7 = r6.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.CaptureSession$State r0 = r6.mState     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a0 }
            androidx.core.util.Preconditions.checkNotNull(r7, r0)     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r7 = r6.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a0 }
            boolean r7 = r7.stop()     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x0053
            r6.finishClose()     // Catch:{ all -> 0x00a0 }
            goto L_0x0099
        L_0x0053:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r7 = r6.mReleaseFuture     // Catch:{ all -> 0x00a0 }
            if (r7 != 0) goto L_0x0062
            androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda2 r7 = new androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda2     // Catch:{ all -> 0x00a0 }
            r7.<init>(r6)     // Catch:{ all -> 0x00a0 }
            com.google.common.util.concurrent.ListenableFuture r7 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r7)     // Catch:{ all -> 0x00a0 }
            r6.mReleaseFuture = r7     // Catch:{ all -> 0x00a0 }
        L_0x0062:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r7 = r6.mReleaseFuture     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            return r7
        L_0x0066:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r7 = r6.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.CaptureSession$State r1 = r6.mState     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a0 }
            androidx.core.util.Preconditions.checkNotNull(r7, r0)     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r7 = r6.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a0 }
            r7.stop()     // Catch:{ all -> 0x00a0 }
        L_0x007f:
            androidx.camera.camera2.internal.CaptureSession$State r7 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ all -> 0x00a0 }
            r6.mState = r7     // Catch:{ all -> 0x00a0 }
            goto L_0x0099
        L_0x0084:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r0.<init>(r2)     // Catch:{ all -> 0x00a0 }
            androidx.camera.camera2.internal.CaptureSession$State r1 = r6.mState     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a0 }
            r7.<init>(r0)     // Catch:{ all -> 0x00a0 }
            throw r7     // Catch:{ all -> 0x00a0 }
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            r7 = 0
            com.google.common.util.concurrent.ListenableFuture r7 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r7)
            return r7
        L_0x00a0:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release(boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$release$1$androidx-camera-camera2-internal-CaptureSession  reason: not valid java name */
    public /* synthetic */ Object m56lambda$release$1$androidxcameracamera2internalCaptureSession(CallbackToFutureAdapter.Completer completer) throws Exception {
        String str;
        synchronized (this.mSessionLock) {
            Preconditions.checkState(this.mReleaseCompleter == null, "Release completer expected to be null");
            this.mReleaseCompleter = completer;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                case 4:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case 5:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    /* access modifiers changed from: package-private */
    public State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    /* access modifiers changed from: package-private */
    public void finishClose() {
        if (this.mState == State.RELEASED) {
            Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = State.RELEASED;
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.Completer<Void> completer = this.mReleaseCompleter;
        if (completer != null) {
            completer.set(null);
            this.mReleaseCompleter = null;
        }
    }

    /* access modifiers changed from: package-private */
    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            if (sessionConfig == null) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e) {
                    Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } else {
                try {
                    Logger.d(TAG, "Issuing request for session.");
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                    Config mergeOptions = mergeOptions(this.mCameraEventCallbacks.createComboCallback().onRepeating());
                    this.mCameraEventOnRepeatingOptions = mergeOptions;
                    from.addImplementationOptions(mergeOptions);
                    CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                    if (build == null) {
                        Logger.d(TAG, "Skipping issuing empty request for session.");
                        return -1;
                    }
                    int singleRepeatingRequest = this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.mCaptureCallback));
                    return singleRepeatingRequest;
                } catch (CameraAccessException e2) {
                    Logger.e(TAG, "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void issuePendingCaptureRequest() {
        if (!this.mCaptureConfigs.isEmpty()) {
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        boolean z;
        synchronized (this.mSessionLock) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                ArrayList arrayList = new ArrayList();
                Logger.d(TAG, "Issuing capture request.");
                boolean z2 = false;
                for (CaptureConfig next : list) {
                    if (next.getSurfaces().isEmpty()) {
                        Logger.d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = next.getSurfaces().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            DeferrableSurface next2 = it.next();
                            if (!this.mConfiguredSurfaceMap.containsKey(next2)) {
                                Logger.d(TAG, "Skipping capture request with invalid surface: " + next2);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (next.getTemplateType() == 2) {
                                z2 = true;
                            }
                            CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
                            if (next.getTemplateType() == 5 && next.getCameraCaptureResult() != null) {
                                from.setCameraCaptureResult(next.getCameraCaptureResult());
                            }
                            SessionConfig sessionConfig = this.mSessionConfig;
                            if (sessionConfig != null) {
                                from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                            }
                            from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                            from.addImplementationOptions(next.getImplementationOptions());
                            CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                            if (build == null) {
                                Logger.d(TAG, "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (CameraCaptureCallback captureCallback : next.getCameraCaptureCallbacks()) {
                                CaptureCallbackConverter.toCaptureCallback(captureCallback, arrayList2);
                            }
                            cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                            arrayList.add(build);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z2)) {
                        this.mSynchronizedCaptureSession.stopRepeating();
                        cameraBurstCaptureCallback.setCaptureSequenceCallback(new CaptureSession$$ExternalSyntheticLambda0(this));
                    }
                    int captureBurstRequests = this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
                    return captureBurstRequests;
                }
                Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$issueBurstCaptureRequest$2$androidx-camera-camera2-internal-CaptureSession  reason: not valid java name */
    public /* synthetic */ void m54lambda$issueBurstCaptureRequest$2$androidxcameracamera2internalCaptureSession(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                issueRepeatingCaptureRequests(this.mSessionConfig);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.abortCaptures();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to abort captures.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to stop repeating.", e);
            }
        }
    }

    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            if (!this.mCaptureConfigs.isEmpty()) {
                arrayList = new ArrayList<>(this.mCaptureConfigs);
                this.mCaptureConfigs.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig cameraCaptureCallbacks : arrayList) {
                for (CameraCaptureCallback onCaptureCancelled : cameraCaptureCallbacks.getCameraCaptureCallbacks()) {
                    onCaptureCancelled.onCaptureCancelled();
                }
            }
        }
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback captureCallback : list) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(captureCallback));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback((List<CameraCaptureSession.CaptureCallback>) arrayList);
    }

    private static Config mergeOptions(List<CaptureConfig> list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (CaptureConfig implementationOptions : list) {
            Config implementationOptions2 = implementationOptions.getImplementationOptions();
            for (Config.Option next : implementationOptions2.listOptions()) {
                Object retrieveOption = implementationOptions2.retrieveOption(next, null);
                if (create.containsOption(next)) {
                    Object retrieveOption2 = create.retrieveOption(next, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        Logger.d(TAG, "Detect conflicting option " + next.getId() + " : " + retrieveOption + " != " + retrieveOption2);
                    }
                } else {
                    create.insertOption(next, retrieveOption);
                }
            }
        }
        return create;
    }

    final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        StateCallback() {
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                        CaptureSession.this.mState = State.OPENED;
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        if (CaptureSession.this.mSessionConfig != null) {
                            List<CaptureConfig> onEnableSession = CaptureSession.this.mCameraEventCallbacks.createComboCallback().onEnableSession();
                            if (!onEnableSession.isEmpty()) {
                                CaptureSession captureSession = CaptureSession.this;
                                captureSession.issueBurstCaptureRequest(captureSession.setupConfiguredSurface(onEnableSession));
                            }
                        }
                        Logger.d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                        CaptureSession captureSession2 = CaptureSession.this;
                        captureSession2.issueRepeatingCaptureRequests(captureSession2.mSessionConfig);
                        CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case 6:
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case 7:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger.d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
            }
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()] != 1) {
                    Logger.d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (CaptureSession.this.mState != State.UNINITIALIZED) {
                    Logger.d(CaptureSession.TAG, "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.finishClose();
                        break;
                    case 8:
                        Logger.d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                Logger.e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<CaptureConfig> setupConfiguredSurface(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig from : list) {
            CaptureConfig.Builder from2 = CaptureConfig.Builder.from(from);
            from2.setTemplateType(1);
            for (DeferrableSurface addSurface : this.mSessionConfig.getRepeatingCaptureConfig().getSurfaces()) {
                from2.addSurface(addSurface);
            }
            arrayList.add(from2.build());
        }
        return arrayList;
    }
}
