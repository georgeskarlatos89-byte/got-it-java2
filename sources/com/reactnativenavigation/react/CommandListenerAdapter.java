package com.reactnativenavigation.react;

public class CommandListenerAdapter implements CommandListener {
    private CommandListener listener;

    public CommandListener getListener() {
        return this.listener;
    }

    public CommandListenerAdapter() {
    }

    public CommandListenerAdapter(CommandListener commandListener) {
        this.listener = commandListener;
    }

    public void onSuccess(String str) {
        CommandListener commandListener = this.listener;
        if (commandListener != null) {
            commandListener.onSuccess(str);
        }
    }

    public void onError(String str) {
        CommandListener commandListener = this.listener;
        if (commandListener != null) {
            commandListener.onError(str);
        }
    }
}
