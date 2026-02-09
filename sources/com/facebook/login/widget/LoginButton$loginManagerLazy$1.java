package com.facebook.login.widget;

import com.facebook.login.LoginManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/facebook/login/LoginManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LoginButton.kt */
final class LoginButton$loginManagerLazy$1 extends Lambda implements Function0<LoginManager> {
    public static final LoginButton$loginManagerLazy$1 INSTANCE = new LoginButton$loginManagerLazy$1();

    LoginButton$loginManagerLazy$1() {
        super(0);
    }

    public final LoginManager invoke() {
        return LoginManager.Companion.getInstance();
    }
}
