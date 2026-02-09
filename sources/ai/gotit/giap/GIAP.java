package ai.gotit.giap;

import ai.gotit.giap.entity.Event;
import ai.gotit.giap.exception.GIAPInstanceExistsException;
import ai.gotit.giap.service.ConfigManager;
import ai.gotit.giap.service.DeviceInfoManager;
import ai.gotit.giap.service.ExceptionHandler;
import ai.gotit.giap.service.IdentityManager;
import ai.gotit.giap.service.NetworkManager;
import ai.gotit.giap.service.Storage;
import ai.gotit.giap.service.TaskManager;
import ai.gotit.giap.support.GIAPActivityLifecycleCallbacks;
import ai.gotit.giap.util.Logger;
import android.app.Application;
import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

public class GIAP {
    private static GIAP instance;
    private ConfigManager configManager;
    private DeviceInfoManager deviceInfoManager;
    private ExceptionHandler exceptionHandler;
    private IdentityManager identityManager;
    private NetworkManager networkManager;
    private Storage storage;
    private TaskManager taskManager;

    public static GIAP getInstance() {
        return instance;
    }

    public GIAP() {
    }

    private GIAP(String str, String str2, Context context) {
        this.exceptionHandler = ExceptionHandler.makeInstance(this);
        ConfigManager makeInstance = ConfigManager.makeInstance(context, str, str2);
        this.configManager = makeInstance;
        Storage makeInstance2 = Storage.makeInstance(makeInstance);
        this.storage = makeInstance2;
        this.deviceInfoManager = DeviceInfoManager.makeInstance(this.configManager, makeInstance2);
        this.networkManager = NetworkManager.makeInstance(this.configManager);
        IdentityManager makeInstance3 = IdentityManager.makeInstance(this.storage);
        this.identityManager = makeInstance3;
        this.taskManager = TaskManager.makeInstance(this.storage, makeInstance3, this.networkManager);
        registerGIAPActivityLifecycleCallbacks(context);
    }

    public static GIAP initialize(String str, String str2, Context context) {
        if (instance == null) {
            synchronized (GIAP.class) {
                if (instance == null) {
                    GIAP giap = new GIAP(str, str2, context);
                    instance = giap;
                    return giap;
                }
            }
        }
        throw new GIAPInstanceExistsException();
    }

    private void registerGIAPActivityLifecycleCallbacks(Context context) {
        if (context.getApplicationContext() instanceof Application) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new GIAPActivityLifecycleCallbacks(this));
        } else {
            Logger.warn("Context is not an Application. We won't be able to automatically flush on background.");
        }
    }

    public void onUncaughtException() {
        TaskManager taskManager2 = this.taskManager;
        if (taskManager2 != null) {
            taskManager2.stop();
        }
    }

    public void onPause() {
        TaskManager taskManager2 = this.taskManager;
        if (taskManager2 != null) {
            taskManager2.stop();
        }
    }

    public void onResume() {
        TaskManager taskManager2 = this.taskManager;
        if (taskManager2 != null) {
            taskManager2.restart();
        }
    }

    public void track(String str) {
        track(str, (JSONObject) null);
    }

    public void track(String str, JSONObject jSONObject) {
        this.taskManager.createEventTask(new Event(str, this.identityManager.getDistinctId(), this.deviceInfoManager.getDeviceInfo(), jSONObject));
    }

    public void alias(String str) {
        this.taskManager.createAliasTask(str);
    }

    public void identify(String str) {
        this.taskManager.createIdentifyTask(str);
    }

    public void updateProfile(JSONObject jSONObject) {
        this.taskManager.createUpdateProfileTask(jSONObject);
    }

    public void increaseProperty(String str, int i) {
        this.taskManager.createIncreasePropertyTask(str, Integer.valueOf(i));
    }

    public void increaseProperty(String str, double d) {
        this.taskManager.createIncreasePropertyTask(str, Double.valueOf(d));
    }

    public void appendToProperty(String str, JSONArray jSONArray) {
        this.taskManager.createAppendToPropertyTask(str, jSONArray);
    }

    public void removeFromProperty(String str, JSONArray jSONArray) {
        this.taskManager.createRemoveFromPropertyTask(str, jSONArray);
    }

    public void reset() {
        this.identityManager.generateNewDistinctId();
    }
}
