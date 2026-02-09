package com.reactnativenavigation.options;

import android.content.Context;
import com.reactnativenavigation.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class TopBarButtons {
    public BackButton back = new BackButton();
    public ArrayList<ButtonOptions> left;
    public ArrayList<ButtonOptions> right;

    public static TopBarButtons parse(Context context, JSONObject jSONObject) {
        TopBarButtons topBarButtons = new TopBarButtons();
        if (jSONObject == null) {
            return topBarButtons;
        }
        topBarButtons.right = parseButtons(context, jSONObject, "rightButtons");
        topBarButtons.left = parseButtons(context, jSONObject, "leftButtons");
        topBarButtons.back = BackButton.parse(context, jSONObject.optJSONObject("backButton"));
        return topBarButtons;
    }

    private static ArrayList<ButtonOptions> parseButtons(Context context, JSONObject jSONObject, String str) {
        return ButtonOptions.parse(context, jSONObject, str);
    }

    public TopBarButtons(ArrayList<ButtonOptions> arrayList) {
        this.right = arrayList;
    }

    public TopBarButtons() {
    }

    /* access modifiers changed from: package-private */
    public void mergeWith(TopBarButtons topBarButtons) {
        ArrayList<ButtonOptions> arrayList = topBarButtons.left;
        if (arrayList != null) {
            this.left = mergeLeftButton(arrayList);
        }
        ArrayList<ButtonOptions> arrayList2 = topBarButtons.right;
        if (arrayList2 != null) {
            this.right = CollectionUtils.map(arrayList2, new TopBarButtons$$ExternalSyntheticLambda0());
        }
        this.back.mergeWith(topBarButtons.back);
    }

    private ArrayList<ButtonOptions> mergeLeftButton(ArrayList<ButtonOptions> arrayList) {
        if (arrayList.isEmpty() || CollectionUtils.isNullOrEmpty(this.left)) {
            return arrayList;
        }
        ButtonOptions buttonOptions = arrayList.get(0);
        if (buttonOptions.id != null) {
            return arrayList;
        }
        this.left.get(0).mergeWith(buttonOptions);
        return this.left;
    }

    /* access modifiers changed from: package-private */
    public void mergeWithDefault(TopBarButtons topBarButtons) {
        if (this.left == null) {
            this.left = topBarButtons.left;
        } else if (!CollectionUtils.isNullOrEmpty(topBarButtons.left)) {
            Iterator<ButtonOptions> it = this.left.iterator();
            while (it.hasNext()) {
                it.next().mergeWithDefault(topBarButtons.left.get(0));
            }
        }
        if (this.right == null) {
            this.right = topBarButtons.right;
        } else if (!CollectionUtils.isNullOrEmpty(topBarButtons.right)) {
            Iterator<ButtonOptions> it2 = this.right.iterator();
            while (it2.hasNext()) {
                it2.next().mergeWithDefault(topBarButtons.right.get(0));
            }
        }
        this.back.mergeWithDefault(topBarButtons.back);
    }

    public boolean hasLeftButtons() {
        return !CollectionUtils.isNullOrEmpty(this.left) && this.left.get(0).id != null;
    }
}
