package ai.gotit.giap.entity;

import ai.gotit.giap.common.Serializable;
import ai.gotit.giap.constant.TaskProps;
import org.json.JSONException;
import org.json.JSONObject;

public class Task implements Serializable {
    private JSONObject data;
    private Boolean processing;
    private String sdkVersion;
    private String type;

    public Task(String str) {
        this.data = null;
        this.sdkVersion = null;
        this.processing = false;
        this.sdkVersion = "1.0";
        this.type = str;
    }

    public Task(String str, JSONObject jSONObject) {
        this(str);
        this.data = jSONObject;
    }

    public Task(JSONObject jSONObject) throws JSONException {
        this.data = null;
        this.sdkVersion = null;
        this.processing = false;
        this.type = jSONObject.getString(TaskProps.TASK_TYPE);
        try {
            this.data = jSONObject.getJSONObject("data");
        } catch (JSONException unused) {
            this.data = null;
        }
        try {
            this.sdkVersion = jSONObject.getString(TaskProps.SDK_VERSION);
        } catch (JSONException unused2) {
            this.sdkVersion = null;
        }
    }

    public String getType() {
        return this.type;
    }

    public JSONObject getData() {
        return this.data;
    }

    public void setData(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public Boolean getProcessing() {
        return this.processing;
    }

    public void setProcessing(Boolean bool) {
        this.processing = bool;
    }

    public JSONObject serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TaskProps.TASK_TYPE, this.type);
        jSONObject.put("data", this.data);
        jSONObject.put(TaskProps.SDK_VERSION, this.sdkVersion);
        return jSONObject;
    }
}
