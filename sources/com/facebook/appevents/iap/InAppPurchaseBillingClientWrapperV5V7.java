package com.facebook.appevents.iap;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0007\u0018\u0000 K2\u00020\u0001:\u0002KLB\u0003\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\u0006\u0010'\u001a\u00020\u0017\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\u0006\u0010)\u001a\u00020\u0017\u0012\u0006\u0010*\u001a\u00020\u0017\u0012\u0006\u0010+\u001a\u00020\u0017¢\u0006\u0002\u0010,J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000204J\"\u00106\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u0002082\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u000208H\u0002J\u0012\u0010<\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u000208H\u0002J-\u0010=\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?H\u0002¢\u0006\u0002\u0010AJ-\u0010B\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?H\u0002¢\u0006\u0002\u0010AJ-\u0010C\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?H\u0002¢\u0006\u0002\u0010AJ-\u0010D\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?H\u0002¢\u0006\u0002\u0010AJ-\u0010E\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010?H\u0002¢\u0006\u0002\u0010AJ&\u0010F\u001a\u0002002\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u0002040:2\u0006\u0010G\u001a\u000202H\u0002J\u0018\u0010H\u001a\u0002002\u0006\u00107\u001a\u0002082\u0006\u0010G\u001a\u000202H\u0016J\u0018\u0010I\u001a\u0002002\u0006\u00107\u001a\u0002082\u0006\u0010G\u001a\u000202H\u0016J\u0010\u0010J\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "billingClient", "", "billingClientClazz", "Ljava/lang/Class;", "purchaseClazz", "productDetailsClazz", "purchaseHistoryRecordClazz", "queryProductDetailsParamsProductClazz", "billingResultClazz", "queryProductDetailsParamsClazz", "queryPurchaseHistoryParamsClazz", "queryPurchasesParamsClazz", "queryProductDetailsParamsBuilderClazz", "queryPurchaseHistoryParamsBuilderClazz", "queryPurchasesParamsBuilderClazz", "queryProductDetailsParamsProductBuilderClazz", "billingClientStateListenerClazz", "productDetailsResponseListenerClazz", "purchasesResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "queryPurchasesAsyncMethod", "Ljava/lang/reflect/Method;", "queryPurchasesParamsNewBuilderMethod", "queryPurchasesParamsBuilderBuildMethod", "queryPurchasesParamsBuilderSetProductTypeMethod", "purchaseGetOriginalJsonMethod", "queryPurchaseHistoryAsyncMethod", "queryPurchaseHistoryParamsNewBuilderMethod", "queryPurchaseHistoryParamsBuilderBuildMethod", "queryPurchaseHistoryParamsBuilderSetProductTypeMethod", "purchaseHistoryRecordGetOriginalJsonMethod", "queryProductDetailsAsyncMethod", "queryProductDetailsParamsNewBuilderMethod", "queryProductDetailsParamsBuilderBuildMethod", "queryProductDetailsParamsBuilderSetProductListMethod", "queryProductDetailsParamsProductNewBuilderMethod", "queryProductDetailsParamsProductBuilderBuildMethod", "queryProductDetailsParamsProductBuilderSetProductIdMethod", "queryProductDetailsParamsProductBuilderSetProductTypeMethod", "productDetailsToStringMethod", "billingClientStartConnectionMethod", "billingResultGetResponseCodeMethod", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getBillingClient", "()Ljava/lang/Object;", "executeServiceRequest", "", "runnable", "Ljava/lang/Runnable;", "getOriginalJson", "", "productDetailsString", "getQueryProductDetailsParams", "productType", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productIds", "", "getQueryPurchaseHistoryParams", "getQueryPurchasesParams", "onBillingServiceDisconnected", "wrapperArgs", "", "listenerArgs", "([Ljava/lang/Object;[Ljava/lang/Object;)V", "onBillingSetupFinished", "onProductDetailsResponse", "onPurchaseHistoryResponse", "onQueryPurchasesResponse", "queryProductDetailsAsync", "completionHandler", "queryPurchaseHistory", "queryPurchases", "startConnection", "Companion", "ListenerWrapper", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
public final class InAppPurchaseBillingClientWrapperV5V7 implements InAppPurchaseBillingClientWrapper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = InAppPurchaseBillingClientWrapperV5V7.class.getCanonicalName();
    private static final Map<String, JSONObject> iapPurchaseDetailsMap = new ConcurrentHashMap();
    private static InAppPurchaseBillingClientWrapperV5V7 instance;
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map<String, JSONObject> productDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> subsPurchaseDetailsMap = new ConcurrentHashMap();
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Method billingClientStartConnectionMethod;
    private final Class<?> billingClientStateListenerClazz;
    private final Class<?> billingResultClazz;
    private final Method billingResultGetResponseCodeMethod;
    private final Class<?> productDetailsClazz;
    private final Class<?> productDetailsResponseListenerClazz;
    private final Method productDetailsToStringMethod;
    private final Class<?> purchaseClazz;
    private final Method purchaseGetOriginalJsonMethod;
    private final Class<?> purchaseHistoryRecordClazz;
    private final Method purchaseHistoryRecordGetOriginalJsonMethod;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchasesResponseListenerClazz;
    private final Method queryProductDetailsAsyncMethod;
    private final Method queryProductDetailsParamsBuilderBuildMethod;
    private final Class<?> queryProductDetailsParamsBuilderClazz;
    private final Method queryProductDetailsParamsBuilderSetProductListMethod;
    private final Class<?> queryProductDetailsParamsClazz;
    private final Method queryProductDetailsParamsNewBuilderMethod;
    private final Method queryProductDetailsParamsProductBuilderBuildMethod;
    private final Class<?> queryProductDetailsParamsProductBuilderClazz;
    private final Method queryProductDetailsParamsProductBuilderSetProductIdMethod;
    private final Method queryProductDetailsParamsProductBuilderSetProductTypeMethod;
    private final Class<?> queryProductDetailsParamsProductClazz;
    private final Method queryProductDetailsParamsProductNewBuilderMethod;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchaseHistoryParamsBuilderBuildMethod;
    private final Class<?> queryPurchaseHistoryParamsBuilderClazz;
    private final Method queryPurchaseHistoryParamsBuilderSetProductTypeMethod;
    private final Class<?> queryPurchaseHistoryParamsClazz;
    private final Method queryPurchaseHistoryParamsNewBuilderMethod;
    private final Method queryPurchasesAsyncMethod;
    private final Method queryPurchasesParamsBuilderBuildMethod;
    private final Class<?> queryPurchasesParamsBuilderClazz;
    private final Method queryPurchasesParamsBuilderSetProductTypeMethod;
    private final Class<?> queryPurchasesParamsClazz;
    private final Method queryPurchasesParamsNewBuilderMethod;

    public /* synthetic */ InAppPurchaseBillingClientWrapperV5V7(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    @JvmStatic
    public static final synchronized InAppPurchaseBillingClientWrapperV5V7 getOrCreateInstance(Context context) {
        synchronized (InAppPurchaseBillingClientWrapperV5V7.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
                return null;
            }
            try {
                InAppPurchaseBillingClientWrapperV5V7 orCreateInstance = Companion.getOrCreateInstance(context);
                return orCreateInstance;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
                return null;
            }
        }
    }

    private InAppPurchaseBillingClientWrapperV5V7(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, Class<?> cls11, Class<?> cls12, Class<?> cls13, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseClazz = cls2;
        this.productDetailsClazz = cls3;
        this.purchaseHistoryRecordClazz = cls4;
        this.queryProductDetailsParamsProductClazz = cls5;
        this.billingResultClazz = cls6;
        this.queryProductDetailsParamsClazz = cls7;
        this.queryPurchaseHistoryParamsClazz = cls8;
        this.queryPurchasesParamsClazz = cls9;
        this.queryProductDetailsParamsBuilderClazz = cls10;
        this.queryPurchaseHistoryParamsBuilderClazz = cls11;
        this.queryPurchasesParamsBuilderClazz = cls12;
        this.queryProductDetailsParamsProductBuilderClazz = cls13;
        this.billingClientStateListenerClazz = cls14;
        this.productDetailsResponseListenerClazz = cls15;
        this.purchasesResponseListenerClazz = cls16;
        this.purchaseHistoryResponseListenerClazz = cls17;
        this.queryPurchasesAsyncMethod = method;
        this.queryPurchasesParamsNewBuilderMethod = method2;
        this.queryPurchasesParamsBuilderBuildMethod = method3;
        this.queryPurchasesParamsBuilderSetProductTypeMethod = method4;
        this.purchaseGetOriginalJsonMethod = method5;
        this.queryPurchaseHistoryAsyncMethod = method6;
        this.queryPurchaseHistoryParamsNewBuilderMethod = method7;
        this.queryPurchaseHistoryParamsBuilderBuildMethod = method8;
        this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod = method9;
        this.purchaseHistoryRecordGetOriginalJsonMethod = method10;
        this.queryProductDetailsAsyncMethod = method11;
        this.queryProductDetailsParamsNewBuilderMethod = method12;
        this.queryProductDetailsParamsBuilderBuildMethod = method13;
        this.queryProductDetailsParamsBuilderSetProductListMethod = method14;
        this.queryProductDetailsParamsProductNewBuilderMethod = method15;
        this.queryProductDetailsParamsProductBuilderBuildMethod = method16;
        this.queryProductDetailsParamsProductBuilderSetProductIdMethod = method17;
        this.queryProductDetailsParamsProductBuilderSetProductTypeMethod = method18;
        this.productDetailsToStringMethod = method19;
        this.billingClientStartConnectionMethod = method20;
        this.billingResultGetResponseCodeMethod = method21;
    }

    public static final /* synthetic */ Map access$getIapPurchaseDetailsMap$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return iapPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseBillingClientWrapperV5V7 access$getInstance$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getProductDetailsMap$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return productDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSubsPurchaseDetailsMap$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return subsPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isServiceConnected$cp() {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void access$onBillingServiceDisconnected(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapperV5V7.onBillingServiceDisconnected(objArr, objArr2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$onBillingSetupFinished(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapperV5V7.onBillingSetupFinished(objArr, objArr2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$onProductDetailsResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapperV5V7.onProductDetailsResponse(objArr, objArr2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$onPurchaseHistoryResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapperV5V7.onPurchaseHistoryResponse(objArr, objArr2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$onQueryPurchasesResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapperV5V7.onQueryPurchasesResponse(objArr, objArr2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                instance = inAppPurchaseBillingClientWrapperV5V7;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public Object getBillingClient() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.billingClient;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$ListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "wrapperArgs", "", "", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "invoke", "proxy", "m", "Ljava/lang/reflect/Method;", "listenerArgs", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    public final class ListenerWrapper implements InvocationHandler {
        private Object[] wrapperArgs;

        public ListenerWrapper(Object[] objArr) {
            this.wrapperArgs = objArr;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(obj, "proxy");
            Intrinsics.checkNotNullParameter(method, "m");
            String name = method.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (!name.equals(InAppPurchaseConstants.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                        return null;
                    }
                    InAppPurchaseBillingClientWrapperV5V7.access$onPurchaseHistoryResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                    return null;
                case -1599362358:
                    if (!name.equals(InAppPurchaseConstants.METHOD_ON_QUERY_PURCHASES_RESPONSE)) {
                        return null;
                    }
                    InAppPurchaseBillingClientWrapperV5V7.access$onQueryPurchasesResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                    return null;
                case -79406125:
                    if (!name.equals(InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED)) {
                        return null;
                    }
                    InAppPurchaseBillingClientWrapperV5V7.access$onBillingSetupFinished(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                    return null;
                case 1227540564:
                    if (!name.equals(InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED)) {
                        return null;
                    }
                    InAppPurchaseBillingClientWrapperV5V7.access$onBillingServiceDisconnected(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                    return null;
                case 1940131955:
                    if (!name.equals(InAppPurchaseConstants.METHOD_ON_PRODUCT_DETAILS_RESPONSE)) {
                        return null;
                    }
                    InAppPurchaseBillingClientWrapperV5V7.access$onProductDetailsResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                    return null;
                default:
                    return null;
            }
        }
    }

    private final Object getQueryPurchasesParams(InAppPurchaseUtils.IAPProductType iAPProductType) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsClazz, this.queryPurchasesParamsNewBuilderMethod, (Object) null, new Object[0]);
            if (invokeMethod == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsBuilderClazz, this.queryPurchasesParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsBuilderClazz, this.queryPurchasesParamsBuilderSetProductTypeMethod, invokeMethod, iAPProductType.getType()), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Object getQueryPurchaseHistoryParams(InAppPurchaseUtils.IAPProductType iAPProductType) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsClazz, this.queryPurchaseHistoryParamsNewBuilderMethod, (Object) null, new Object[0]);
            return InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod, invokeMethod, iAPProductType.getType()), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Object getQueryProductDetailsParams(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductClazz, this.queryProductDetailsParamsProductNewBuilderMethod, (Object) null, new Object[0]);
                Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductIdMethod, invokeMethod, str);
                Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductTypeMethod, invokeMethod2, iAPProductType.getType()), new Object[0]);
                if (invokeMethod3 != null) {
                    arrayList.add(invokeMethod3);
                }
            }
            Object invokeMethod4 = InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsClazz, this.queryProductDetailsParamsNewBuilderMethod, (Object) null, new Object[0]);
            return InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderSetProductListMethod, invokeMethod4, arrayList), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public void queryPurchases(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(iAPProductType, "productType");
                Intrinsics.checkNotNullParameter(runnable, "completionHandler");
                executeServiceRequest(new InAppPurchaseBillingClientWrapperV5V7$$ExternalSyntheticLambda1(this, iAPProductType, runnable));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void queryPurchases$lambda$0(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(inAppPurchaseBillingClientWrapperV5V7, "this$0");
                Intrinsics.checkNotNullParameter(iAPProductType, "$productType");
                Intrinsics.checkNotNullParameter(runnable, "$completionHandler");
                Object newProxyInstance = Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.purchasesResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.purchasesResponseListenerClazz}, new ListenerWrapper(new Object[]{iAPProductType, runnable}));
                InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryPurchasesAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), inAppPurchaseBillingClientWrapperV5V7.getQueryPurchasesParams(iAPProductType), newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public void queryPurchaseHistory(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(iAPProductType, "productType");
                Intrinsics.checkNotNullParameter(runnable, "completionHandler");
                executeServiceRequest(new InAppPurchaseBillingClientWrapperV5V7$$ExternalSyntheticLambda0(this, iAPProductType, runnable));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void queryPurchaseHistory$lambda$1(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(inAppPurchaseBillingClientWrapperV5V7, "this$0");
                Intrinsics.checkNotNullParameter(iAPProductType, "$productType");
                Intrinsics.checkNotNullParameter(runnable, "$completionHandler");
                Object newProxyInstance = Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.purchaseHistoryResponseListenerClazz}, new ListenerWrapper(new Object[]{iAPProductType, runnable}));
                InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryPurchaseHistoryAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), inAppPurchaseBillingClientWrapperV5V7.getQueryPurchaseHistoryParams(iAPProductType), newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void queryProductDetailsAsync(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                executeServiceRequest(new InAppPurchaseBillingClientWrapperV5V7$$ExternalSyntheticLambda2(this, runnable, iAPProductType, list));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void queryProductDetailsAsync$lambda$2(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        Class<InAppPurchaseBillingClientWrapperV5V7> cls = InAppPurchaseBillingClientWrapperV5V7.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(inAppPurchaseBillingClientWrapperV5V7, "this$0");
                Intrinsics.checkNotNullParameter(runnable, "$completionHandler");
                Intrinsics.checkNotNullParameter(iAPProductType, "$productType");
                Intrinsics.checkNotNullParameter(list, "$productIds");
                Object newProxyInstance = Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.productDetailsResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.productDetailsResponseListenerClazz}, new ListenerWrapper(new Object[]{runnable}));
                Object queryProductDetailsParams = inAppPurchaseBillingClientWrapperV5V7.getQueryProductDetailsParams(iAPProductType, list);
                if (queryProductDetailsParams != null) {
                    InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryProductDetailsAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), queryProductDetailsParams, newProxyInstance);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void executeServiceRequest(Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (isServiceConnected.get()) {
                    runnable.run();
                } else {
                    startConnection(runnable);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void startConnection(Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.billingClientStateListenerClazz.getClassLoader(), new Class[]{this.billingClientStateListenerClazz}, new ListenerWrapper(new Object[]{runnable}));
                InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.billingClientStartConnectionMethod, getBillingClient(), newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final String getOriginalJson(String str) {
        List<String> groupValues;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "productDetailsString");
            MatchResult find$default = Regex.find$default(new Regex("jsonString='(.*?)'"), str, 0, 2, (Object) null);
            if (find$default == null || (groupValues = find$default.getGroupValues()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(groupValues, 1);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void onQueryPurchasesResponse(Object[] objArr, Object[] objArr2) {
        Object obj;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (objArr != null) {
                try {
                    obj = ArraysKt.getOrNull((T[]) objArr, 0);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (obj instanceof InAppPurchaseUtils.IAPProductType) {
                Object orNull = ArraysKt.getOrNull((T[]) objArr, 1);
                if (orNull instanceof Runnable) {
                    Object orNull2 = objArr2 != null ? ArraysKt.getOrNull((T[]) objArr2, 1) : null;
                    if (orNull2 == null) {
                        return;
                    }
                    if (orNull2 instanceof List) {
                        List arrayList = new ArrayList();
                        for (Object invokeMethod : (List) orNull2) {
                            Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.purchaseGetOriginalJsonMethod, invokeMethod, new Object[0]);
                            String str = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!productDetailsMap.containsKey(string)) {
                                        Intrinsics.checkNotNullExpressionValue(string, "productId");
                                        arrayList.add(string);
                                    }
                                    if (obj == InAppPurchaseUtils.IAPProductType.INAPP) {
                                        Map<String, JSONObject> map = iapPurchaseDetailsMap;
                                        Intrinsics.checkNotNullExpressionValue(string, "productId");
                                        map.put(string, jSONObject);
                                    } else {
                                        Map<String, JSONObject> map2 = subsPurchaseDetailsMap;
                                        Intrinsics.checkNotNullExpressionValue(string, "productId");
                                        map2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            queryProductDetailsAsync((InAppPurchaseUtils.IAPProductType) obj, arrayList, (Runnable) orNull);
                        } else {
                            ((Runnable) orNull).run();
                        }
                    }
                }
            }
        }
    }

    private final void onPurchaseHistoryResponse(Object[] objArr, Object[] objArr2) {
        Object obj;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (objArr != null) {
                try {
                    obj = ArraysKt.getOrNull((T[]) objArr, 0);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (obj instanceof InAppPurchaseUtils.IAPProductType) {
                Object orNull = ArraysKt.getOrNull((T[]) objArr, 1);
                if (orNull instanceof Runnable) {
                    Object orNull2 = objArr2 != null ? ArraysKt.getOrNull((T[]) objArr2, 1) : null;
                    if (orNull2 == null) {
                        return;
                    }
                    if (orNull2 instanceof List) {
                        List arrayList = new ArrayList();
                        for (Object invokeMethod : (List) orNull2) {
                            try {
                                Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.purchaseHistoryRecordClazz, this.purchaseHistoryRecordGetOriginalJsonMethod, invokeMethod, new Object[0]);
                                String str = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        if (!productDetailsMap.containsKey(string)) {
                                            Intrinsics.checkNotNullExpressionValue(string, "productId");
                                            arrayList.add(string);
                                        }
                                        if (obj == InAppPurchaseUtils.IAPProductType.INAPP) {
                                            Map<String, JSONObject> map = iapPurchaseDetailsMap;
                                            Intrinsics.checkNotNullExpressionValue(string, "productId");
                                            map.put(string, jSONObject);
                                        } else {
                                            Map<String, JSONObject> map2 = subsPurchaseDetailsMap;
                                            Intrinsics.checkNotNullExpressionValue(string, "productId");
                                            map2.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            queryProductDetailsAsync((InAppPurchaseUtils.IAPProductType) obj, arrayList, (Runnable) orNull);
                        } else {
                            ((Runnable) orNull).run();
                        }
                    }
                }
            }
        }
    }

    private final void onProductDetailsResponse(Object[] objArr, Object[] objArr2) {
        Object obj;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (objArr != null) {
                try {
                    obj = ArraysKt.getOrNull((T[]) objArr, 0);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            } else {
                obj = null;
            }
            Object orNull = objArr2 != null ? ArraysKt.getOrNull((T[]) objArr2, 1) : null;
            if (orNull == null) {
                return;
            }
            if (orNull instanceof List) {
                for (Object invokeMethod : (List) orNull) {
                    try {
                        Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.productDetailsClazz, this.productDetailsToStringMethod, invokeMethod, new Object[0]);
                        String str = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                        if (str != null) {
                            String originalJson = getOriginalJson(str);
                            if (originalJson != null) {
                                JSONObject jSONObject = new JSONObject(originalJson);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    Map<String, JSONObject> map = productDetailsMap;
                                    Intrinsics.checkNotNullExpressionValue(string, "productId");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (obj == null) {
                    return;
                }
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x004b: MOVE  (r6v2 java.lang.Runnable) = (r6v1 java.lang.Runnable)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001b A[Catch:{ all -> 0x0016 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001c A[Catch:{ all -> 0x0016 }] */
    private final void onBillingSetupFinished(java.lang.Object[] r6, java.lang.Object[] r7) {
        /*
            r5 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0018
            int r2 = r7.length     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0010
            r2 = r0
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            if (r2 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r2 = r1
            goto L_0x0019
        L_0x0016:
            r6 = move-exception
            goto L_0x0053
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r2 == 0) goto L_0x001c
            return
        L_0x001c:
            r7 = r7[r1]     // Catch:{ all -> 0x0016 }
            java.lang.Class<?> r2 = r5.billingResultClazz     // Catch:{ all -> 0x0016 }
            java.lang.reflect.Method r3 = r5.billingResultGetResponseCodeMethod     // Catch:{ all -> 0x0016 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0016 }
            java.lang.Object r7 = com.facebook.appevents.iap.InAppPurchaseUtils.invokeMethod(r2, r3, r7, r4)     // Catch:{ all -> 0x0016 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0016 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x0016 }
            if (r7 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r7 = isServiceConnected     // Catch:{ all -> 0x0016 }
            r7.set(r0)     // Catch:{ all -> 0x0016 }
            if (r6 == 0) goto L_0x0043
            int r7 = r6.length     // Catch:{ all -> 0x0016 }
            if (r7 != 0) goto L_0x003e
            r7 = r0
            goto L_0x003f
        L_0x003e:
            r7 = r1
        L_0x003f:
            if (r7 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            if (r0 != 0) goto L_0x0052
            r6 = r6[r1]     // Catch:{ all -> 0x0016 }
            boolean r7 = r6 instanceof java.lang.Runnable     // Catch:{ all -> 0x0016 }
            if (r7 == 0) goto L_0x0052
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x0016 }
            if (r6 == 0) goto L_0x0052
            r6.run()     // Catch:{ all -> 0x0016 }
        L_0x0052:
            return
        L_0x0053:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7.onBillingSetupFinished(java.lang.Object[], java.lang.Object[]):void");
    }

    private final void onBillingServiceDisconnected(Object[] objArr, Object[] objArr2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                isServiceConnected.set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J0\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010#H\u0002¢\u0006\u0002\u0010$R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\n¨\u0006%"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;", "Ljava/lang/reflect/InvocationHandler;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "iapPurchaseDetailsMap", "", "Lorg/json/JSONObject;", "getIapPurchaseDetailsMap", "()Ljava/util/Map;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "productDetailsMap", "getProductDetailsMap", "subsPurchaseDetailsMap", "getSubsPurchaseDetailsMap", "createBillingClient", "", "context", "Landroid/content/Context;", "billingClientClazz", "Ljava/lang/Class;", "billingClientBuilderClazz", "purchasesUpdatedListenerClazz", "createInstance", "getOrCreateInstance", "invoke", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    public static final class Companion implements InvocationHandler {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(obj, "proxy");
            Intrinsics.checkNotNullParameter(method, "m");
            return null;
        }

        private Companion() {
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapperV5V7.access$isServiceConnected$cp();
        }

        public final Map<String, JSONObject> getIapPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getIapPurchaseDetailsMap$cp();
        }

        public final Map<String, JSONObject> getSubsPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getSubsPurchaseDetailsMap$cp();
        }

        public final Map<String, JSONObject> getProductDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getProductDetailsMap$cp();
        }

        @JvmStatic
        public final synchronized InAppPurchaseBillingClientWrapperV5V7 getOrCreateInstance(Context context) {
            InAppPurchaseBillingClientWrapperV5V7 access$getInstance$cp;
            Intrinsics.checkNotNullParameter(context, "context");
            access$getInstance$cp = InAppPurchaseBillingClientWrapperV5V7.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                access$getInstance$cp = createInstance(context);
            }
            return access$getInstance$cp;
        }

        private final InAppPurchaseBillingClientWrapperV5V7 createInstance(Context context) {
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE);
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS);
            Class<?> cls4 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RECORD);
            Class<?> cls5 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_PRODUCT);
            Class<?> cls6 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_RESULT);
            Class<?> cls7 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS);
            Class<?> cls8 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASE_HISTORY_PARAMS);
            Class<?> cls9 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS);
            Class<?> cls10 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_BUILDER);
            Class<?> cls11 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASE_HISTORY_PARAMS_BUILDER);
            Class<?> cls12 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS_BUILDER);
            Class<?> cls13 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_PRODUCT_BUILDER);
            Class<?> cls14 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_BUILDER);
            Class<?> cls15 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchasesUpdatedListener");
            Class<?> cls16 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
            Class<?> cls17 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS_RESPONSE_LISTENER);
            Class<?> cls18 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASES_RESPONSE_LISTENER);
            Class<?> cls19 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
            if (cls == null || cls2 == null || cls3 == null || cls4 == null || cls5 == null || cls6 == null || cls7 == null || cls8 == null || cls9 == null || cls10 == null || cls11 == null || cls12 == null || cls13 == null || cls14 == null || cls15 == null || cls16 == null || cls17 == null || cls18 == null || cls19 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            String str = "Failed to create Google Play billing library wrapper for in-app purchase auto-logging";
            Class<?> cls20 = cls14;
            Class<?> cls21 = cls15;
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASES_ASYNC, cls9, cls18);
            Method method2 = InAppPurchaseUtils.getMethod(cls9, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method3 = InAppPurchaseUtils.getMethod(cls12, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Class<?> cls22 = cls9;
            Method method4 = InAppPurchaseUtils.getMethod(cls12, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method5 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Class<?> cls23 = cls12;
            Method method6 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, cls8, cls19);
            Method method7 = InAppPurchaseUtils.getMethod(cls8, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method8 = InAppPurchaseUtils.getMethod(cls11, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Class<?> cls24 = cls8;
            Method method9 = InAppPurchaseUtils.getMethod(cls11, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method10 = InAppPurchaseUtils.getMethod(cls4, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method11 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PRODUCT_DETAILS_ASYNC, cls7, cls17);
            Method method12 = InAppPurchaseUtils.getMethod(cls7, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method13 = InAppPurchaseUtils.getMethod(cls10, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method14 = InAppPurchaseUtils.getMethod(cls10, InAppPurchaseConstants.METHOD_SET_PRODUCT_LIST, List.class);
            Method method15 = InAppPurchaseUtils.getMethod(cls5, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method16 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method17 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_SET_PRODUCT_ID, String.class);
            Method method18 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method19 = InAppPurchaseUtils.getMethod(cls3, InAppPurchaseConstants.METHOD_TO_STRING, new Class[0]);
            Method method20 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_START_CONNECTION, cls16);
            Class<?> cls25 = cls6;
            Method method21 = InAppPurchaseUtils.getMethod(cls25, InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null || method8 == null || method9 == null || method10 == null || method11 == null || method12 == null || method13 == null || method14 == null || method15 == null || method16 == null || method17 == null || method18 == null || method19 == null || method20 == null || method21 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), str);
                return null;
            }
            Object createBillingClient = createBillingClient(context, cls, cls20, cls21);
            if (createBillingClient == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            InAppPurchaseBillingClientWrapperV5V7.access$setInstance$cp(new InAppPurchaseBillingClientWrapperV5V7(createBillingClient, cls, cls2, cls3, cls4, cls5, cls25, cls7, cls24, cls22, cls10, cls11, cls23, cls13, cls16, cls17, cls18, cls19, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21, (DefaultConstructorMarker) null));
            return InAppPurchaseBillingClientWrapperV5V7.access$getInstance$cp();
        }

        private final Object createBillingClient(Context context, Class<?> cls, Class<?> cls2, Class<?> cls3) {
            Object invokeMethod;
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_NEW_BUILDER, Context.class);
            Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_SET_LISTENER, cls3);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
            Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            if (method4 == null || method2 == null || method == null || method3 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(cls2, method2, InAppPurchaseUtils.invokeMethod(cls, method, (Object) null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(cls2, method4, InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, new Object[0]), new Object[0]);
        }
    }
}
