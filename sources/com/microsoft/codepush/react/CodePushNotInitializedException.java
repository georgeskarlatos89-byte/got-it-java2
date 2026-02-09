package com.microsoft.codepush.react;

public final class CodePushNotInitializedException extends RuntimeException {
    public CodePushNotInitializedException(String str, Throwable th) {
        super(str, th);
    }

    public CodePushNotInitializedException(String str) {
        super(str);
    }
}
