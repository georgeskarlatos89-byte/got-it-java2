package com.reactnativenavigation.react.events;

public enum ComponentType {
    Component("Component"),
    Button("TopBarButton"),
    Title("TopBarTitle"),
    Background("TopBarBackground");
    
    private String name;

    public String getName() {
        return this.name;
    }

    private ComponentType(String str) {
        this.name = str;
    }
}
