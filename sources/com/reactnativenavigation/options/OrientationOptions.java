package com.reactnativenavigation.options;

import com.brentvatne.react.ReactVideoView;
import com.facebook.hermes.intl.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class OrientationOptions {
    List<Orientation> orientations = new ArrayList();

    public static OrientationOptions parse(JSONObject jSONObject) {
        OrientationOptions orientationOptions = new OrientationOptions();
        if (jSONObject == null) {
            return orientationOptions;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(ReactVideoView.EVENT_PROP_ORIENTATION);
        if (optJSONArray == null) {
            orientationOptions.orientations.add(Orientation.fromString(jSONObject.optString(ReactVideoView.EVENT_PROP_ORIENTATION, Orientation.Default.name)));
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Orientation fromString = Orientation.fromString(optJSONArray.optString(i, Constants.COLLATION_DEFAULT));
                if (fromString != null) {
                    arrayList.add(fromString);
                }
            }
            orientationOptions.orientations = arrayList;
        }
        return orientationOptions;
    }

    public int getValue() {
        if (!hasValue()) {
            return Orientation.Default.orientationCode;
        }
        int i = AnonymousClass1.$SwitchMap$com$reactnativenavigation$options$Orientation[this.orientations.get(0).ordinal()];
        if (i == 1) {
            return (this.orientations.contains(Orientation.Portrait) ? Orientation.PortraitLandscape : Orientation.Landscape).orientationCode;
        } else if (i == 2) {
            return (this.orientations.contains(Orientation.Landscape) ? Orientation.PortraitLandscape : Orientation.Portrait).orientationCode;
        } else if (i == 3) {
            return Orientation.SensorLandscape.orientationCode;
        } else {
            if (i != 4) {
                return Orientation.Default.orientationCode;
            }
            return Orientation.SensorPortrait.orientationCode;
        }
    }

    /* renamed from: com.reactnativenavigation.options.OrientationOptions$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$reactnativenavigation$options$Orientation;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.reactnativenavigation.options.Orientation[] r0 = com.reactnativenavigation.options.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$reactnativenavigation$options$Orientation = r0
                com.reactnativenavigation.options.Orientation r1 = com.reactnativenavigation.options.Orientation.Landscape     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$Orientation     // Catch:{ NoSuchFieldError -> 0x001d }
                com.reactnativenavigation.options.Orientation r1 = com.reactnativenavigation.options.Orientation.Portrait     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$Orientation     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.reactnativenavigation.options.Orientation r1 = com.reactnativenavigation.options.Orientation.SensorLandscape     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$Orientation     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.reactnativenavigation.options.Orientation r1 = com.reactnativenavigation.options.Orientation.SensorPortrait     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$reactnativenavigation$options$Orientation     // Catch:{ NoSuchFieldError -> 0x003e }
                com.reactnativenavigation.options.Orientation r1 = com.reactnativenavigation.options.Orientation.Default     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.OrientationOptions.AnonymousClass1.<clinit>():void");
        }
    }

    public boolean hasValue() {
        if (this.orientations.isEmpty()) {
            return false;
        }
        if (this.orientations.size() == 1 && this.orientations.get(0) == Orientation.Default) {
            return false;
        }
        return true;
    }

    public OrientationOptions copy() {
        OrientationOptions orientationOptions = new OrientationOptions();
        orientationOptions.orientations = new ArrayList(this.orientations);
        return orientationOptions;
    }

    public OrientationOptions mergeWithDefault(OrientationOptions orientationOptions) {
        if (!hasValue()) {
            this.orientations = orientationOptions.orientations;
        }
        return this;
    }

    public String toString() {
        return hasValue() ? Arrays.toString(this.orientations.toArray(new Orientation[0])) : Orientation.Default.toString();
    }
}
