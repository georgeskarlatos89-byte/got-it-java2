package com.reactnativenavigation.options.params;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import javax.annotation.Nullable;

public enum TitleDisplayMode {
    ALWAYS_SHOW(AHBottomNavigation.TitleState.ALWAYS_SHOW),
    SHOW_WHEN_ACTIVE(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE),
    ALWAYS_HIDE(AHBottomNavigation.TitleState.ALWAYS_HIDE),
    SHOW_WHEN_ACTIVE_FORCE(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE_FORCE),
    UNDEFINED((String) null);
    
    @Nullable
    private AHBottomNavigation.TitleState state;

    public static TitleDisplayMode fromString(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -363722962:
                if (str.equals("showWhenActiveForce")) {
                    c = 0;
                    break;
                }
                break;
            case 1183597553:
                if (str.equals("alwaysHide")) {
                    c = 1;
                    break;
                }
                break;
            case 1183924652:
                if (str.equals("alwaysShow")) {
                    c = 2;
                    break;
                }
                break;
            case 1414341053:
                if (str.equals("showWhenActive")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SHOW_WHEN_ACTIVE_FORCE;
            case 1:
                return ALWAYS_HIDE;
            case 2:
                return ALWAYS_SHOW;
            case 3:
                return SHOW_WHEN_ACTIVE;
            default:
                return UNDEFINED;
        }
    }

    private TitleDisplayMode(@Nullable AHBottomNavigation.TitleState titleState) {
        this.state = titleState;
    }

    public boolean hasValue() {
        return this.state != null;
    }

    public AHBottomNavigation.TitleState get(AHBottomNavigation.TitleState titleState) {
        AHBottomNavigation.TitleState titleState2 = this.state;
        return titleState2 == null ? titleState : titleState2;
    }

    public AHBottomNavigation.TitleState toState() {
        AHBottomNavigation.TitleState titleState = this.state;
        if (titleState != null) {
            return titleState;
        }
        throw new RuntimeException("TitleDisplayMode is undefined");
    }

    private static class Constants {
        static final String ALWAYS_HIDE = "alwaysHide";
        static final String ALWAYS_SHOW = "alwaysShow";
        static final String SHOW_WHEN_ACTIVE = "showWhenActive";
        static final String SHOW_WHEN_ACTIVE_FORCE = "showWhenActiveForce";

        private Constants() {
        }
    }
}
