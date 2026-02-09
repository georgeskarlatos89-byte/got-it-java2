package com.reactnativenavigation.options;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class LayoutNode {
    final List<LayoutNode> children;
    public final JSONObject data;
    public final String id;
    public final Type type;

    public enum Type {
        Component,
        ExternalComponent,
        Stack,
        BottomTabs,
        SideMenuRoot,
        SideMenuCenter,
        SideMenuLeft,
        SideMenuRight,
        TopTabs
    }

    LayoutNode(String str, Type type2) {
        this(str, type2, new JSONObject(), new ArrayList());
    }

    public LayoutNode(String str, Type type2, JSONObject jSONObject, List<LayoutNode> list) {
        this.id = str;
        this.type = type2;
        this.data = jSONObject;
        this.children = list;
    }

    /* access modifiers changed from: package-private */
    public JSONObject getOptions() {
        return this.data.optJSONObject("options");
    }
}
