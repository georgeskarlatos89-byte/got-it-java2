package com.microsoft.codepush.react;

class CodePushInvalidPublicKeyException extends RuntimeException {
    public CodePushInvalidPublicKeyException(String str, Throwable th) {
        super(str, th);
    }

    public CodePushInvalidPublicKeyException(String str) {
        super(str);
    }
}
