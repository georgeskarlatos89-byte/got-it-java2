package com.facebook.react;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {
    private final List<ModuleProvider> mModuleProviders = new ArrayList();
    private final Map<ModuleProvider, Map<String, ReactModuleInfo>> mPackageModuleInfos = new HashMap();

    interface ModuleProvider {
        NativeModule getModule(String str);
    }

    private static boolean shouldSupportLegacyPackages() {
        return ReactFeatureFlags.enableBridgelessArchitecture && ReactFeatureFlags.unstable_useTurboModuleInterop;
    }

    protected ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
        ReactModuleInfo reactModuleInfo;
        final ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        for (ReactPackage next : list) {
            if (next instanceof TurboReactPackage) {
                final TurboReactPackage turboReactPackage = (TurboReactPackage) next;
                AnonymousClass1 r4 = new ModuleProvider() {
                    public NativeModule getModule(String str) {
                        return turboReactPackage.getModule(str, reactApplicationContext2);
                    }
                };
                this.mModuleProviders.add(r4);
                this.mPackageModuleInfos.put(r4, turboReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages() && (next instanceof LazyReactPackage)) {
                LazyReactPackage lazyReactPackage = (LazyReactPackage) next;
                List<ModuleSpec> nativeModules = lazyReactPackage.getNativeModules(reactApplicationContext2);
                final HashMap hashMap = new HashMap();
                for (ModuleSpec next2 : nativeModules) {
                    hashMap.put(next2.getName(), next2.getProvider());
                }
                AnonymousClass2 r42 = new ModuleProvider() {
                    public NativeModule getModule(String str) {
                        Provider provider = (Provider) hashMap.get(str);
                        if (provider != null) {
                            return (NativeModule) provider.get();
                        }
                        return null;
                    }
                };
                this.mModuleProviders.add(r42);
                this.mPackageModuleInfos.put(r42, lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if ((!shouldSupportLegacyPackages() || !(next instanceof ReactInstancePackage)) && shouldSupportLegacyPackages()) {
                List<NativeModule> createNativeModules = next.createNativeModules(reactApplicationContext2);
                final HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                for (NativeModule next3 : createNativeModules) {
                    Class<?> cls = next3.getClass();
                    ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                    String name = reactModule != null ? reactModule.name() : next3.getName();
                    if (reactModule != null) {
                        reactModuleInfo = new ReactModuleInfo(name, cls.getName(), reactModule.canOverrideExistingModule(), true, reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls));
                    } else {
                        reactModuleInfo = new ReactModuleInfo(name, cls.getName(), next3.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls));
                    }
                    hashMap3.put(name, reactModuleInfo);
                    hashMap2.put(name, next3);
                }
                AnonymousClass3 r3 = new ModuleProvider() {
                    public NativeModule getModule(String str) {
                        return (NativeModule) hashMap2.get(str);
                    }
                };
                this.mModuleProviders.add(r3);
                this.mPackageModuleInfos.put(r3, hashMap3);
            }
        }
    }

    public TurboModule getModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule != null && !(resolveModule instanceof CxxModuleWrapper)) {
            return resolveModule;
        }
        return null;
    }

    public CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule resolveModule = resolveModule(str);
        if (resolveModule != null && (resolveModule instanceof CxxModuleWrapper)) {
            return (CxxModuleWrapper) resolveModule;
        }
        return null;
    }

    private TurboModule resolveModule(String str) {
        NativeModule nativeModule = null;
        for (ModuleProvider next : this.mModuleProviders) {
            try {
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.mPackageModuleInfos.get(next).get(str);
                if (reactModuleInfo != null && reactModuleInfo.isTurboModule()) {
                    if (nativeModule == null || reactModuleInfo.canOverrideExistingModule()) {
                        NativeModule module = next.getModule(str);
                        if (module != null) {
                            nativeModule = module;
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        for (ModuleProvider moduleProvider : this.mModuleProviders) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(moduleProvider).values()) {
                if (reactModuleInfo.isTurboModule() && reactModuleInfo.needsEagerInit()) {
                    arrayList.add(reactModuleInfo.name());
                }
            }
        }
        return arrayList;
    }

    public static abstract class Builder {
        private ReactApplicationContext mContext;
        private List<ReactPackage> mPackages;

        /* access modifiers changed from: protected */
        public abstract ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List<ReactPackage> list);

        public Builder setPackages(List<ReactPackage> list) {
            this.mPackages = new ArrayList(list);
            return this;
        }

        public Builder setReactApplicationContext(ReactApplicationContext reactApplicationContext) {
            this.mContext = reactApplicationContext;
            return this;
        }

        public ReactPackageTurboModuleManagerDelegate build() {
            Assertions.assertNotNull(this.mContext, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            Assertions.assertNotNull(this.mPackages, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return build(this.mContext, this.mPackages);
        }
    }
}
