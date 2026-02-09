package ai.gotit.giap.entity;

import ai.gotit.giap.common.Serializable;
import ai.gotit.giap.constant.CommonConstant;
import ai.gotit.giap.constant.EventProps;
import ai.gotit.giap.exception.GIAPInvalidPropsPrefixException;
import ai.gotit.giap.util.Logger;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class Event implements Serializable {
    private JSONObject customProps = new JSONObject();
    private JSONObject deviceInfo;
    private String distinctId;
    private String name;
    private Long time;

    public Event(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        updateTimestamp();
        this.name = str;
        this.distinctId = str2;
        this.deviceInfo = jSONObject;
        if (jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    addCustomProp(next, !jSONObject2.isNull(next) ? jSONObject2.get(next) : null);
                }
                this.customProps = jSONObject2;
            } catch (JSONException e) {
                Logger.error((Throwable) e);
            }
        }
    }

    public void updateTimestamp() {
        this.time = Long.valueOf(new Date().getTime());
    }

    public void addCustomProp(String str, Object obj) {
        if (!str.startsWith(CommonConstant.DEFAULT_PROP_PREFIX)) {
            try {
                this.customProps.put(str, obj);
            } catch (JSONException e) {
                Logger.error((Throwable) e);
            }
        } else {
            throw new GIAPInvalidPropsPrefixException();
        }
    }

    public JSONObject serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventProps.DISTINCT_ID, this.distinctId);
        jSONObject.put(EventProps.NAME, this.name);
        jSONObject.put(EventProps.TIME, this.time);
        JSONObject jSONObject2 = this.deviceInfo;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, !this.deviceInfo.isNull(next) ? this.deviceInfo.get(next) : null);
            }
        }
        JSONObject jSONObject3 = this.customProps;
        if (jSONObject3 != null) {
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                jSONObject.put(next2, !this.customProps.isNull(next2) ? this.customProps.get(next2) : null);
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public long getTime() {
        return this.time.longValue();
    }
}
