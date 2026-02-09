package com.facebook.react.turbomodule.core;

import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TurboModuleManager implements JSIModule, TurboModuleRegistry {
    private static volatile boolean sIsSoLibraryLoaded;
    private final ModuleProvider<TurboModule> mCxxModuleProvider;
    private final List<String> mEagerInitModuleNames;
    private final HybridData mHybridData;
    private final ModuleProvider<TurboModule> mJavaModuleProvider;
    private final Object mModuleCleanupLock = new Object();
    private boolean mModuleCleanupStarted = false;
    private final Map<String, ModuleHolder> mModuleHolders = new HashMap();

    private interface ModuleProvider<T> {
        T getModule(String str);
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, CallInvokerHolderImpl callInvokerHolderImpl2, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings();

    public void initialize() {
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, final TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, CallInvokerHolder callInvokerHolder2) {
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (CallInvokerHolderImpl) callInvokerHolder2, turboModuleManagerDelegate);
        installJSIBindings();
        this.mEagerInitModuleNames = turboModuleManagerDelegate == null ? new ArrayList<>() : turboModuleManagerDelegate.getEagerInitModuleNames();
        this.mJavaModuleProvider = new ModuleProvider<TurboModule>() {
            public TurboModule getModule(String str) {
                TurboModuleManagerDelegate turboModuleManagerDelegate = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate == null) {
                    return null;
                }
                return turboModuleManagerDelegate.getModule(str);
            }
        };
        this.mCxxModuleProvider = new ModuleProvider<TurboModule>() {
            public TurboModule getModule(String str) {
                CxxModuleWrapper legacyCxxModule;
                TurboModuleManagerDelegate turboModuleManagerDelegate = turboModuleManagerDelegate;
                if (turboModuleManagerDelegate == null || (legacyCxxModule = turboModuleManagerDelegate.getLegacyCxxModule(str)) == null) {
                    return null;
                }
                Assertions.assertCondition(legacyCxxModule instanceof TurboModule, "CxxModuleWrapper \"" + str + "\" is not a TurboModule");
                return (TurboModule) legacyCxxModule;
            }
        };
    }

    public List<String> getEagerInitModuleNames() {
        return this.mEagerInitModuleNames;
    }

    private CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule module = getModule(str);
        if (!(module instanceof CxxModuleWrapper)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    private TurboModule getJavaModule(String str) {
        TurboModule module = getModule(str);
        if (module instanceof CxxModuleWrapper) {
            return null;
        }
        return module;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateStart(r4, r1.getModuleId());
        r0 = (com.facebook.react.turbomodule.core.interfaces.TurboModule) getOrCreateModule(r4, r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateEnd(r4, r1.getModuleId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateFail(r4, r1.getModuleId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.turbomodule.core.interfaces.TurboModule getModule(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mModuleCleanupLock
            monitor-enter(r0)
            boolean r1 = r3.mModuleCleanupStarted     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r4 = 0
            return r4
        L_0x000a:
            java.util.Map<java.lang.String, com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder> r1 = r3.mModuleHolders     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x001c
            java.util.Map<java.lang.String, com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder> r1 = r3.mModuleHolders     // Catch:{ all -> 0x0045 }
            com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder r2 = new com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0045 }
        L_0x001c:
            java.util.Map<java.lang.String, com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder> r1 = r3.mModuleHolders     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0045 }
            com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder r1 = (com.facebook.react.turbomodule.core.TurboModuleManager.ModuleHolder) r1     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r1.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateStart(r4, r0)
            r0 = 1
            com.facebook.react.bridge.NativeModule r0 = r3.getOrCreateModule(r4, r1, r0)
            com.facebook.react.turbomodule.core.interfaces.TurboModule r0 = (com.facebook.react.turbomodule.core.interfaces.TurboModule) r0
            if (r0 == 0) goto L_0x003d
            int r1 = r1.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateEnd(r4, r1)
            goto L_0x0044
        L_0x003d:
            int r1 = r1.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateFail(r4, r1)
        L_0x0044:
            return r0
        L_0x0045:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.turbomodule.core.TurboModuleManager.getModule(java.lang.String):com.facebook.react.turbomodule.core.interfaces.TurboModule");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r5 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateConstructStart(r3, r4.getModuleId());
        r5 = (com.facebook.react.bridge.NativeModule) r2.mJavaModuleProvider.getModule(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r5 = (com.facebook.react.bridge.NativeModule) r2.mCxxModuleProvider.getModule(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateConstructEnd(r3, r4.getModuleId());
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateSetUpStart(r3, r4.getModuleId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r5 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.setModule(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r5.initialize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateSetUpEnd(r3, r4.getModuleId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.endCreatingModule();
        r4.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r4.isCreatingModule() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007c, code lost:
        if (r1 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        r3 = r4.getModule();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0089, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.NativeModule getOrCreateModule(java.lang.String r3, com.facebook.react.turbomodule.core.TurboModuleManager.ModuleHolder r4, boolean r5) {
        /*
            r2 = this;
            monitor-enter(r4)
            boolean r0 = r4.isDoneCreatingModule()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0016
            if (r5 == 0) goto L_0x0010
            int r5 = r4.getModuleId()     // Catch:{ all -> 0x008e }
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateCacheHit(r3, r5)     // Catch:{ all -> 0x008e }
        L_0x0010:
            com.facebook.react.bridge.NativeModule r3 = r4.getModule()     // Catch:{ all -> 0x008e }
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r3
        L_0x0016:
            boolean r5 = r4.isCreatingModule()     // Catch:{ all -> 0x008e }
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0023
            r4.startCreatingModule()     // Catch:{ all -> 0x008e }
            r5 = r0
            goto L_0x0024
        L_0x0023:
            r5 = r1
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x006f
            int r5 = r4.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateConstructStart(r3, r5)
            com.facebook.react.turbomodule.core.TurboModuleManager$ModuleProvider<com.facebook.react.turbomodule.core.interfaces.TurboModule> r5 = r2.mJavaModuleProvider
            java.lang.Object r5 = r5.getModule(r3)
            com.facebook.react.bridge.NativeModule r5 = (com.facebook.react.bridge.NativeModule) r5
            if (r5 != 0) goto L_0x0040
            com.facebook.react.turbomodule.core.TurboModuleManager$ModuleProvider<com.facebook.react.turbomodule.core.interfaces.TurboModule> r5 = r2.mCxxModuleProvider
            java.lang.Object r5 = r5.getModule(r3)
            com.facebook.react.bridge.NativeModule r5 = (com.facebook.react.bridge.NativeModule) r5
        L_0x0040:
            int r0 = r4.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateConstructEnd(r3, r0)
            int r0 = r4.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateSetUpStart(r3, r0)
            if (r5 == 0) goto L_0x005c
            monitor-enter(r4)
            r4.setModule(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            r5.initialize()
            goto L_0x005c
        L_0x0059:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r3
        L_0x005c:
            int r0 = r4.getModuleId()
            com.facebook.react.turbomodule.core.TurboModulePerfLogger.moduleCreateSetUpEnd(r3, r0)
            monitor-enter(r4)
            r4.endCreatingModule()     // Catch:{ all -> 0x006c }
            r4.notifyAll()     // Catch:{ all -> 0x006c }
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            return r5
        L_0x006c:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r3
        L_0x006f:
            monitor-enter(r4)
        L_0x0070:
            boolean r3 = r4.isCreatingModule()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x007c
            r4.wait()     // Catch:{ InterruptedException -> 0x007a }
            goto L_0x0070
        L_0x007a:
            r1 = r0
            goto L_0x0070
        L_0x007c:
            if (r1 == 0) goto L_0x0085
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008b }
            r3.interrupt()     // Catch:{ all -> 0x008b }
        L_0x0085:
            com.facebook.react.bridge.NativeModule r3 = r4.getModule()     // Catch:{ all -> 0x008b }
            monitor-exit(r4)     // Catch:{ all -> 0x008b }
            return r3
        L_0x008b:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008b }
            throw r3
        L_0x008e:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.turbomodule.core.TurboModuleManager.getOrCreateModule(java.lang.String, com.facebook.react.turbomodule.core.TurboModuleManager$ModuleHolder, boolean):com.facebook.react.bridge.NativeModule");
    }

    public Collection<TurboModule> getModules() {
        ArrayList<ModuleHolder> arrayList = new ArrayList<>();
        synchronized (this.mModuleCleanupLock) {
            arrayList.addAll(this.mModuleHolders.values());
        }
        ArrayList arrayList2 = new ArrayList();
        for (ModuleHolder moduleHolder : arrayList) {
            synchronized (moduleHolder) {
                if (moduleHolder.getModule() != null) {
                    arrayList2.add((TurboModule) moduleHolder.getModule());
                }
            }
        }
        return arrayList2;
    }

    public boolean hasModule(String str) {
        ModuleHolder moduleHolder;
        synchronized (this.mModuleCleanupLock) {
            moduleHolder = this.mModuleHolders.get(str);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            if (moduleHolder.getModule() != null) {
                return true;
            }
            return false;
        }
    }

    public void onCatalystInstanceDestroy() {
        synchronized (this.mModuleCleanupLock) {
            this.mModuleCleanupStarted = true;
        }
        for (Map.Entry next : this.mModuleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule((String) next.getKey(), (ModuleHolder) next.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.mModuleHolders.clear();
        this.mHybridData.resetNative();
    }

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModuleManager.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.loadLibrary("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    private static class ModuleHolder {
        private static volatile int sHolderCount;
        private volatile boolean mIsDoneCreatingModule = false;
        private volatile boolean mIsTryingToCreate = false;
        private volatile NativeModule mModule = null;
        private volatile int mModuleId = sHolderCount;

        public ModuleHolder() {
            sHolderCount++;
        }

        /* access modifiers changed from: package-private */
        public int getModuleId() {
            return this.mModuleId;
        }

        /* access modifiers changed from: package-private */
        public void setModule(NativeModule nativeModule) {
            this.mModule = nativeModule;
        }

        /* access modifiers changed from: package-private */
        public NativeModule getModule() {
            return this.mModule;
        }

        /* access modifiers changed from: package-private */
        public void startCreatingModule() {
            this.mIsTryingToCreate = true;
        }

        /* access modifiers changed from: package-private */
        public void endCreatingModule() {
            this.mIsTryingToCreate = false;
            this.mIsDoneCreatingModule = true;
        }

        /* access modifiers changed from: package-private */
        public boolean isDoneCreatingModule() {
            return this.mIsDoneCreatingModule;
        }

        /* access modifiers changed from: package-private */
        public boolean isCreatingModule() {
            return this.mIsTryingToCreate;
        }
    }
}
