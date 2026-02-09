package com.braintreepayments.api;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 v2\u00020\u0001:\u0001vB\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010s\u001a\u00020+2\u0006\u0010t\u001a\u00020\u0003H\u0007J\b\u0010u\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0016\u0010*\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010,R\u0014\u0010-\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0016\u00100\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0016\u00101\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0014\u00102\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0014\u00103\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0016\u00104\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0014\u00105\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0014\u00106\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0014\u00107\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0014\u00108\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0014\u00109\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0014\u0010:\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0016\u0010;\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0016\u0010=\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0014\u0010?\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R\u0018\u0010A\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u000e\u0010C\u001a\u00020DX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0016\u0010G\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0018\u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0007R\u0016\u0010M\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R\u0016\u0010O\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0016\u0010Q\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u000e\u0010S\u001a\u00020TX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010U\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0007R\u0016\u0010W\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\u0016\u0010Y\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010%R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00030#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010%R\u000e\u0010_\u001a\u00020`X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010a\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0007R\u000e\u0010c\u001a\u00020dX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010e\u001a\u00020+8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010,R\u0016\u0010g\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0007R\u0016\u0010i\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0007R\u0016\u0010k\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0007R\u000e\u0010m\u001a\u00020nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010o\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0007R\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010%¨\u0006w"}, d2 = {"Lcom/braintreepayments/api/Configuration;", "", "configurationString", "", "(Ljava/lang/String;)V", "assetsUrl", "getAssetsUrl", "()Ljava/lang/String;", "braintreeApiAccessToken", "getBraintreeApiAccessToken", "braintreeApiConfiguration", "Lcom/braintreepayments/api/BraintreeApiConfiguration;", "braintreeApiUrl", "getBraintreeApiUrl", "cardConfiguration", "Lcom/braintreepayments/api/CardConfiguration;", "cardinalAuthenticationJwt", "getCardinalAuthenticationJwt", "challenges", "", "clientApiUrl", "getClientApiUrl", "environment", "getEnvironment", "googlePayAuthorizationFingerprint", "getGooglePayAuthorizationFingerprint", "googlePayConfiguration", "Lcom/braintreepayments/api/GooglePayConfiguration;", "googlePayDisplayName", "getGooglePayDisplayName", "googlePayEnvironment", "getGooglePayEnvironment", "googlePayPayPalClientId", "getGooglePayPayPalClientId", "googlePaySupportedNetworks", "", "getGooglePaySupportedNetworks", "()Ljava/util/List;", "graphQLConfiguration", "Lcom/braintreepayments/api/GraphQLConfiguration;", "graphQLUrl", "getGraphQLUrl", "isBraintreeApiEnabled", "", "()Z", "isCvvChallengePresent", "isFraudDataCollectionEnabled", "isGooglePayEnabled", "isGraphQLEnabled", "isKountEnabled", "isLocalPaymentEnabled", "isPayPalEnabled", "isPayPalTouchDisabled", "isPostalCodeChallengePresent", "isSamsungPayEnabled", "isThreeDSecureEnabled", "isUnionPayEnabled", "isVenmoEnabled", "isVisaCheckoutEnabled", "kountMerchantId", "getKountMerchantId", "merchantAccountId", "getMerchantAccountId", "merchantId", "getMerchantId", "payPalClientId", "getPayPalClientId", "payPalConfiguration", "Lcom/braintreepayments/api/PayPalConfiguration;", "payPalCurrencyIsoCode", "getPayPalCurrencyIsoCode", "payPalDirectBaseUrl", "getPayPalDirectBaseUrl", "payPalDisplayName", "getPayPalDisplayName", "payPalEnvironment", "getPayPalEnvironment", "payPalPrivacyUrl", "getPayPalPrivacyUrl", "payPalUserAgreementUrl", "getPayPalUserAgreementUrl", "samsungPayAuthorization", "getSamsungPayAuthorization", "samsungPayConfiguration", "Lcom/braintreepayments/api/SamsungPayConfiguration;", "samsungPayEnvironment", "getSamsungPayEnvironment", "samsungPayMerchantDisplayName", "getSamsungPayMerchantDisplayName", "samsungPayServiceId", "getSamsungPayServiceId", "samsungPaySupportedCardBrands", "getSamsungPaySupportedCardBrands", "supportedCardTypes", "getSupportedCardTypes", "unionPayConfiguration", "Lcom/braintreepayments/api/UnionPayConfiguration;", "venmoAccessToken", "getVenmoAccessToken", "venmoConfiguration", "Lcom/braintreepayments/api/VenmoConfiguration;", "venmoEnrichedCustomerDataEnabled", "getVenmoEnrichedCustomerDataEnabled", "venmoEnvironment", "getVenmoEnvironment", "venmoMerchantId", "getVenmoMerchantId", "visaCheckoutApiKey", "getVisaCheckoutApiKey", "visaCheckoutConfiguration", "Lcom/braintreepayments/api/VisaCheckoutConfiguration;", "visaCheckoutExternalClientId", "getVisaCheckoutExternalClientId", "visaCheckoutSupportedNetworks", "getVisaCheckoutSupportedNetworks", "isGraphQLFeatureEnabled", "feature", "toJson", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: Configuration.kt */
public class Configuration {
    private static final String ASSETS_URL_KEY = "assetsUrl";
    private static final String BRAINTREE_API_KEY = "braintreeApi";
    private static final String CARDINAL_AUTHENTICATION_JWT = "cardinalAuthenticationJWT";
    private static final String CARD_KEY = "creditCards";
    private static final String CHALLENGES_KEY = "challenges";
    private static final String CLIENT_API_URL_KEY = "clientApiUrl";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ENVIRONMENT_KEY = "environment";
    private static final String GOOGLE_PAY_KEY = "androidPay";
    private static final String GRAPHQL_KEY = "graphQL";
    private static final String MERCHANT_ACCOUNT_ID_KEY = "merchantAccountId";
    private static final String MERCHANT_ID_KEY = "merchantId";
    private static final String PAYPAL_ENABLED_KEY = "paypalEnabled";
    private static final String PAYPAL_KEY = "paypal";
    private static final String PAY_WITH_VENMO_KEY = "payWithVenmo";
    private static final String SAMSUNG_PAY_KEY = "samsungPay";
    private static final String THREE_D_SECURE_ENABLED_KEY = "threeDSecureEnabled";
    private static final String UNIONPAY_KEY = "unionPay";
    private static final String VISA_CHECKOUT_KEY = "visaCheckout";
    private final String assetsUrl;
    private final String braintreeApiAccessToken;
    private final BraintreeApiConfiguration braintreeApiConfiguration;
    private final String braintreeApiUrl;
    private final CardConfiguration cardConfiguration;
    private final String cardinalAuthenticationJwt;
    private final Set<String> challenges;
    private final String clientApiUrl;
    private final String configurationString;
    private final String environment;
    private final String googlePayAuthorizationFingerprint;
    private final GooglePayConfiguration googlePayConfiguration;
    private final String googlePayDisplayName;
    private final String googlePayEnvironment;
    private final String googlePayPayPalClientId;
    private final List<String> googlePaySupportedNetworks;
    private final GraphQLConfiguration graphQLConfiguration;
    private final String graphQLUrl;
    private final boolean isBraintreeApiEnabled;
    private final boolean isCvvChallengePresent;
    private final boolean isFraudDataCollectionEnabled;
    private final boolean isGooglePayEnabled;
    private final boolean isGraphQLEnabled;
    private final boolean isKountEnabled;
    private final boolean isLocalPaymentEnabled;
    private final boolean isPayPalEnabled;
    private final boolean isPayPalTouchDisabled;
    private final boolean isPostalCodeChallengePresent;
    private final boolean isSamsungPayEnabled;
    private final boolean isThreeDSecureEnabled;
    private final boolean isUnionPayEnabled;
    private final boolean isVenmoEnabled;
    private final boolean isVisaCheckoutEnabled;
    private final String kountMerchantId;
    private final String merchantAccountId;
    private final String merchantId;
    private final String payPalClientId;
    private final PayPalConfiguration payPalConfiguration;
    private final String payPalCurrencyIsoCode;
    private final String payPalDirectBaseUrl;
    private final String payPalDisplayName;
    private final String payPalEnvironment;
    private final String payPalPrivacyUrl;
    private final String payPalUserAgreementUrl;
    private final String samsungPayAuthorization;
    private final SamsungPayConfiguration samsungPayConfiguration;
    private final String samsungPayEnvironment;
    private final String samsungPayMerchantDisplayName;
    private final String samsungPayServiceId;
    private final List<String> samsungPaySupportedCardBrands;
    private final List<String> supportedCardTypes;
    private final UnionPayConfiguration unionPayConfiguration;
    private final String venmoAccessToken;
    private final VenmoConfiguration venmoConfiguration;
    private final boolean venmoEnrichedCustomerDataEnabled;
    private final String venmoEnvironment;
    private final String venmoMerchantId;
    private final String visaCheckoutApiKey;
    private final VisaCheckoutConfiguration visaCheckoutConfiguration;
    private final String visaCheckoutExternalClientId;
    private final List<String> visaCheckoutSupportedNetworks;

    @JvmStatic
    public static final Configuration fromJson(String str) throws JSONException {
        return Companion.fromJson(str);
    }

    public Configuration(String str) {
        if (str != null) {
            this.configurationString = str;
            JSONObject jSONObject = new JSONObject(str);
            String optString = Json.optString(jSONObject, ASSETS_URL_KEY, "");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(json, ASSETS_URL_KEY, \"\")");
            this.assetsUrl = optString;
            String string = jSONObject.getString(CLIENT_API_URL_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(CLIENT_API_URL_KEY)");
            this.clientApiUrl = string;
            this.challenges = new LinkedHashSet();
            JSONArray optJSONArray = jSONObject.optJSONArray(CHALLENGES_KEY);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Set<String> set = this.challenges;
                    String optString2 = optJSONArray.optString(i, "");
                    Intrinsics.checkNotNullExpressionValue(optString2, "challengesArray.optString(i, \"\")");
                    set.add(optString2);
                }
            }
            BraintreeApiConfiguration braintreeApiConfiguration2 = new BraintreeApiConfiguration(jSONObject.optJSONObject(BRAINTREE_API_KEY));
            this.braintreeApiConfiguration = braintreeApiConfiguration2;
            CardConfiguration cardConfiguration2 = new CardConfiguration(jSONObject.optJSONObject(CARD_KEY));
            this.cardConfiguration = cardConfiguration2;
            this.cardinalAuthenticationJwt = Json.optString(jSONObject, CARDINAL_AUTHENTICATION_JWT, (String) null);
            String string2 = jSONObject.getString(ENVIRONMENT_KEY);
            Intrinsics.checkNotNullExpressionValue(string2, "json.getString(ENVIRONMENT_KEY)");
            this.environment = string2;
            GooglePayConfiguration googlePayConfiguration2 = new GooglePayConfiguration(jSONObject.optJSONObject(GOOGLE_PAY_KEY));
            this.googlePayConfiguration = googlePayConfiguration2;
            GraphQLConfiguration graphQLConfiguration2 = new GraphQLConfiguration(jSONObject.optJSONObject(GRAPHQL_KEY));
            this.graphQLConfiguration = graphQLConfiguration2;
            this.isPayPalEnabled = jSONObject.optBoolean(PAYPAL_ENABLED_KEY, false);
            this.isThreeDSecureEnabled = jSONObject.optBoolean(THREE_D_SECURE_ENABLED_KEY, false);
            this.merchantAccountId = Json.optString(jSONObject, MERCHANT_ACCOUNT_ID_KEY, (String) null);
            String string3 = jSONObject.getString(MERCHANT_ID_KEY);
            Intrinsics.checkNotNullExpressionValue(string3, "json.getString(MERCHANT_ID_KEY)");
            this.merchantId = string3;
            PayPalConfiguration payPalConfiguration2 = new PayPalConfiguration(jSONObject.optJSONObject(PAYPAL_KEY));
            this.payPalConfiguration = payPalConfiguration2;
            SamsungPayConfiguration samsungPayConfiguration2 = new SamsungPayConfiguration(jSONObject.optJSONObject(SAMSUNG_PAY_KEY));
            this.samsungPayConfiguration = samsungPayConfiguration2;
            UnionPayConfiguration unionPayConfiguration2 = new UnionPayConfiguration(jSONObject.optJSONObject(UNIONPAY_KEY));
            this.unionPayConfiguration = unionPayConfiguration2;
            VenmoConfiguration venmoConfiguration2 = new VenmoConfiguration(jSONObject.optJSONObject(PAY_WITH_VENMO_KEY));
            this.venmoConfiguration = venmoConfiguration2;
            VisaCheckoutConfiguration visaCheckoutConfiguration2 = new VisaCheckoutConfiguration(jSONObject.optJSONObject(VISA_CHECKOUT_KEY));
            this.visaCheckoutConfiguration = visaCheckoutConfiguration2;
            this.isCvvChallengePresent = this.challenges.contains("cvv");
            this.isGooglePayEnabled = googlePayConfiguration2.isEnabled();
            this.isLocalPaymentEnabled = isPayPalEnabled();
            this.isPostalCodeChallengePresent = this.challenges.contains(PostalAddressParser.POSTAL_CODE_UNDERSCORE_KEY);
            this.isSamsungPayEnabled = samsungPayConfiguration2.isEnabled();
            this.isUnionPayEnabled = unionPayConfiguration2.isEnabled();
            this.isVenmoEnabled = venmoConfiguration2.isAccessTokenValid();
            this.isVisaCheckoutEnabled = visaCheckoutConfiguration2.isEnabled();
            this.payPalDirectBaseUrl = payPalConfiguration2.getDirectBaseUrl();
            this.payPalPrivacyUrl = payPalConfiguration2.getPrivacyUrl();
            this.payPalUserAgreementUrl = payPalConfiguration2.getUserAgreementUrl();
            this.braintreeApiAccessToken = braintreeApiConfiguration2.getAccessToken();
            this.braintreeApiUrl = braintreeApiConfiguration2.getUrl();
            this.googlePayAuthorizationFingerprint = googlePayConfiguration2.getGoogleAuthorizationFingerprint();
            this.googlePayDisplayName = googlePayConfiguration2.getDisplayName();
            this.googlePayEnvironment = googlePayConfiguration2.getEnvironment();
            this.googlePayPayPalClientId = googlePayConfiguration2.getPaypalClientId();
            this.googlePaySupportedNetworks = googlePayConfiguration2.getSupportedNetworks();
            this.graphQLUrl = graphQLConfiguration2.getUrl();
            this.isBraintreeApiEnabled = braintreeApiConfiguration2.isEnabled();
            this.isFraudDataCollectionEnabled = cardConfiguration2.isFraudDataCollectionEnabled();
            this.isGraphQLEnabled = graphQLConfiguration2.isEnabled();
            this.isKountEnabled = false;
            this.isPayPalTouchDisabled = payPalConfiguration2.isTouchDisabled();
            this.kountMerchantId = "";
            this.payPalClientId = payPalConfiguration2.getClientId();
            this.payPalCurrencyIsoCode = payPalConfiguration2.getCurrencyIsoCode();
            this.payPalDisplayName = payPalConfiguration2.getDisplayName();
            this.payPalEnvironment = payPalConfiguration2.getEnvironment();
            this.samsungPayAuthorization = samsungPayConfiguration2.getSamsungAuthorization();
            this.samsungPayEnvironment = samsungPayConfiguration2.getEnvironment();
            this.samsungPayMerchantDisplayName = samsungPayConfiguration2.getMerchantDisplayName();
            this.samsungPayServiceId = samsungPayConfiguration2.getServiceId();
            this.samsungPaySupportedCardBrands = CollectionsKt.toList(samsungPayConfiguration2.getSupportedCardBrands());
            this.supportedCardTypes = cardConfiguration2.getSupportedCardTypes();
            this.venmoAccessToken = venmoConfiguration2.getAccessToken();
            this.venmoEnvironment = venmoConfiguration2.getEnvironment();
            this.venmoMerchantId = venmoConfiguration2.getMerchantId();
            this.venmoEnrichedCustomerDataEnabled = venmoConfiguration2.getEnrichedCustomerDataEnabled();
            this.visaCheckoutApiKey = visaCheckoutConfiguration2.getApiKey();
            this.visaCheckoutExternalClientId = visaCheckoutConfiguration2.getExternalClientId();
            this.visaCheckoutSupportedNetworks = visaCheckoutConfiguration2.getAcceptedCardBrands();
            return;
        }
        throw new JSONException("Configuration cannot be null");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/braintreepayments/api/Configuration$Companion;", "", "()V", "ASSETS_URL_KEY", "", "BRAINTREE_API_KEY", "CARDINAL_AUTHENTICATION_JWT", "CARD_KEY", "CHALLENGES_KEY", "CLIENT_API_URL_KEY", "ENVIRONMENT_KEY", "GOOGLE_PAY_KEY", "GRAPHQL_KEY", "MERCHANT_ACCOUNT_ID_KEY", "MERCHANT_ID_KEY", "PAYPAL_ENABLED_KEY", "PAYPAL_KEY", "PAY_WITH_VENMO_KEY", "SAMSUNG_PAY_KEY", "THREE_D_SECURE_ENABLED_KEY", "UNIONPAY_KEY", "VISA_CHECKOUT_KEY", "fromJson", "Lcom/braintreepayments/api/Configuration;", "configurationString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: Configuration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Configuration fromJson(String str) throws JSONException {
            return new Configuration(str);
        }
    }

    public String getAssetsUrl() {
        return this.assetsUrl;
    }

    public String getCardinalAuthenticationJwt() {
        return this.cardinalAuthenticationJwt;
    }

    public String getClientApiUrl() {
        return this.clientApiUrl;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public boolean isCvvChallengePresent() {
        return this.isCvvChallengePresent;
    }

    public boolean isGooglePayEnabled() {
        return this.isGooglePayEnabled;
    }

    public boolean isLocalPaymentEnabled() {
        return this.isLocalPaymentEnabled;
    }

    public boolean isPayPalEnabled() {
        return this.isPayPalEnabled;
    }

    public boolean isPostalCodeChallengePresent() {
        return this.isPostalCodeChallengePresent;
    }

    public boolean isSamsungPayEnabled() {
        return this.isSamsungPayEnabled;
    }

    public boolean isThreeDSecureEnabled() {
        return this.isThreeDSecureEnabled;
    }

    public boolean isUnionPayEnabled() {
        return this.isUnionPayEnabled;
    }

    public boolean isVenmoEnabled() {
        return this.isVenmoEnabled;
    }

    public boolean isVisaCheckoutEnabled() {
        return this.isVisaCheckoutEnabled;
    }

    public String getMerchantAccountId() {
        return this.merchantAccountId;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getPayPalDirectBaseUrl() {
        return this.payPalDirectBaseUrl;
    }

    public String getPayPalPrivacyUrl() {
        return this.payPalPrivacyUrl;
    }

    public String getPayPalUserAgreementUrl() {
        return this.payPalUserAgreementUrl;
    }

    public List<String> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    public final String getBraintreeApiAccessToken() {
        return this.braintreeApiAccessToken;
    }

    public final String getBraintreeApiUrl() {
        return this.braintreeApiUrl;
    }

    public final String getGooglePayAuthorizationFingerprint() {
        return this.googlePayAuthorizationFingerprint;
    }

    public final String getGooglePayDisplayName() {
        return this.googlePayDisplayName;
    }

    public final String getGooglePayEnvironment() {
        return this.googlePayEnvironment;
    }

    public final String getGooglePayPayPalClientId() {
        return this.googlePayPayPalClientId;
    }

    public final List<String> getGooglePaySupportedNetworks() {
        return this.googlePaySupportedNetworks;
    }

    public final String getGraphQLUrl() {
        return this.graphQLUrl;
    }

    public final boolean isBraintreeApiEnabled() {
        return this.isBraintreeApiEnabled;
    }

    public final boolean isFraudDataCollectionEnabled() {
        return this.isFraudDataCollectionEnabled;
    }

    public final boolean isGraphQLEnabled() {
        return this.isGraphQLEnabled;
    }

    public final boolean isKountEnabled() {
        return this.isKountEnabled;
    }

    public final boolean isPayPalTouchDisabled() {
        return this.isPayPalTouchDisabled;
    }

    public final String getKountMerchantId() {
        return this.kountMerchantId;
    }

    public final String getPayPalClientId() {
        return this.payPalClientId;
    }

    public final String getPayPalCurrencyIsoCode() {
        return this.payPalCurrencyIsoCode;
    }

    public final String getPayPalDisplayName() {
        return this.payPalDisplayName;
    }

    public final String getPayPalEnvironment() {
        return this.payPalEnvironment;
    }

    public final String getSamsungPayAuthorization() {
        return this.samsungPayAuthorization;
    }

    public final String getSamsungPayEnvironment() {
        return this.samsungPayEnvironment;
    }

    public final String getSamsungPayMerchantDisplayName() {
        return this.samsungPayMerchantDisplayName;
    }

    public final String getSamsungPayServiceId() {
        return this.samsungPayServiceId;
    }

    public final List<String> getSamsungPaySupportedCardBrands() {
        return this.samsungPaySupportedCardBrands;
    }

    public final String getVenmoAccessToken() {
        return this.venmoAccessToken;
    }

    public final String getVenmoEnvironment() {
        return this.venmoEnvironment;
    }

    public final String getVenmoMerchantId() {
        return this.venmoMerchantId;
    }

    public final boolean getVenmoEnrichedCustomerDataEnabled() {
        return this.venmoEnrichedCustomerDataEnabled;
    }

    public final String getVisaCheckoutApiKey() {
        return this.visaCheckoutApiKey;
    }

    public final String getVisaCheckoutExternalClientId() {
        return this.visaCheckoutExternalClientId;
    }

    public final List<String> getVisaCheckoutSupportedNetworks() {
        return this.visaCheckoutSupportedNetworks;
    }

    public String toJson() {
        return this.configurationString;
    }

    public final boolean isGraphQLFeatureEnabled(String str) {
        Intrinsics.checkNotNullParameter(str, "feature");
        return this.graphQLConfiguration.isFeatureEnabled(str);
    }
}
