package ai.gotit.giap.service;

import ai.gotit.giap.constant.CommonProps;
import ai.gotit.giap.constant.StorageKey;
import ai.gotit.giap.constant.TaskType;
import ai.gotit.giap.entity.Event;
import ai.gotit.giap.entity.Task;
import ai.gotit.giap.util.Logger;
import com.android.volley.NoConnectionError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TaskManager {
    private final Runnable flush = new Runnable() {
        public void run() {
            if (TaskManager.this.flushing.booleanValue()) {
                Logger.log("INCOMING FLUSHING: Another flushing is running. Ignore this flushing.");
            } else if (TaskManager.this.taskQueue.size() == 0) {
                Logger.log("INCOMING FLUSHING: Nothing to flush. Ignore this flushing.");
            } else {
                TaskManager.this.flushing = true;
                Logger.log("INCOMING FLUSHING: New flushing has started!");
                TaskManager.this.processingQueue.clear();
                TaskManager.this.processingQueue.addAll(TaskManager.this.taskQueue);
                Task task = (Task) TaskManager.this.processingQueue.peek();
                String type = task.getType();
                type.hashCode();
                char c = 65535;
                switch (type.hashCode()) {
                    case -1983941041:
                        if (type.equals(TaskType.REMOVE_FROM_PROPERTY)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -326141134:
                        if (type.equals(TaskType.INCREASE_PROPERTY)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 62365232:
                        if (type.equals(TaskType.ALIAS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 66353786:
                        if (type.equals(TaskType.EVENT)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 296999284:
                        if (type.equals(TaskType.APPEND_TO_PROPERTY)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 608964627:
                        if (type.equals(TaskType.UPDATE_PROFILE)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 646864652:
                        if (type.equals(TaskType.IDENTIFY)) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Logger.log("FLUSHING: try to flush removeFromProperty task");
                        task.setProcessing(true);
                        JSONObject data = task.getData();
                        TaskManager.this.processingQueue.poll();
                        try {
                            TaskManager.this.networkManager.removeFromProperty(data.getString(CommonProps.CURRENT_DISTINCT_ID), data.getString(CommonProps.PROPERTY_NAME), data.getJSONArray("value"), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                            return;
                        } catch (JSONException e) {
                            TaskManager.this.cleanUpProcessingTasks();
                            TaskManager.this.finishFlushing();
                            Logger.error((Throwable) e);
                            return;
                        }
                    case 1:
                        Logger.log("FLUSHING: try to flush increaseProperty task");
                        task.setProcessing(true);
                        JSONObject data2 = task.getData();
                        TaskManager.this.processingQueue.poll();
                        try {
                            if (data2.get("value") instanceof Integer) {
                                TaskManager.this.networkManager.increaseProperty(data2.getString(CommonProps.CURRENT_DISTINCT_ID), data2.getString(CommonProps.PROPERTY_NAME), Integer.valueOf(data2.getInt("value")), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                                return;
                            } else if (data2.get("value") instanceof Double) {
                                TaskManager.this.networkManager.increaseProperty(data2.getString(CommonProps.CURRENT_DISTINCT_ID), data2.getString(CommonProps.PROPERTY_NAME), Double.valueOf(data2.getDouble("value")), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                                return;
                            } else {
                                return;
                            }
                        } catch (JSONException e2) {
                            TaskManager.this.cleanUpProcessingTasks();
                            TaskManager.this.finishFlushing();
                            Logger.error((Throwable) e2);
                            return;
                        }
                    case 2:
                        Logger.log("FLUSHING: try to flush alias task");
                        task.setProcessing(true);
                        TaskManager.this.processingQueue.poll();
                        TaskManager.this.networkManager.alias(task.getData(), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                        return;
                    case 3:
                        Logger.log("FLUSHING: trying to flush event tasks");
                        List r1 = TaskManager.this.dequeueEvents();
                        int size = r1.size();
                        if (size > 0) {
                            Logger.log("FLUSHING: dequeue " + size + " events to the batch");
                            TaskManager.this.networkManager.track(new JSONArray(r1), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                            return;
                        }
                        Logger.warn("FLUSHING: empty event batch! (Should not happen)");
                        return;
                    case 4:
                        Logger.log("FLUSHING: try to flush appendToProperty task");
                        task.setProcessing(true);
                        JSONObject data3 = task.getData();
                        TaskManager.this.processingQueue.poll();
                        try {
                            TaskManager.this.networkManager.appendToProperty(data3.getString(CommonProps.CURRENT_DISTINCT_ID), data3.getString(CommonProps.PROPERTY_NAME), data3.getJSONArray("value"), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                            return;
                        } catch (JSONException e3) {
                            TaskManager.this.cleanUpProcessingTasks();
                            TaskManager.this.finishFlushing();
                            Logger.error((Throwable) e3);
                            return;
                        }
                    case 5:
                        Logger.log("FLUSHING: try to flush updateProfile task");
                        task.setProcessing(true);
                        TaskManager.this.processingQueue.poll();
                        TaskManager.this.networkManager.updateProfile(task.getData(), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                        return;
                    case 6:
                        Logger.log("FLUSHING: try to flush identify task");
                        task.setProcessing(true);
                        TaskManager.this.processingQueue.poll();
                        try {
                            TaskManager.this.networkManager.identify(task.getData().getString("user_id"), task.getData().getString(CommonProps.CURRENT_DISTINCT_ID), TaskManager.this.createSuccessCallback(task.getType()), TaskManager.this.createErrorCallback());
                            return;
                        } catch (JSONException e4) {
                            TaskManager.this.cleanUpProcessingTasks();
                            TaskManager.this.finishFlushing();
                            Logger.error((Throwable) e4);
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public Boolean flushing = false;
    private IdentityManager identityManager;
    /* access modifiers changed from: private */
    public NetworkManager networkManager;
    /* access modifiers changed from: private */
    public Queue<Task> processingQueue = new LinkedList();
    private ScheduledFuture<?> scheduledJobHandler = null;
    private ScheduledExecutorService scheduler = null;
    private Boolean shouldNotRestart = false;
    private Boolean started = false;
    private Storage storage;
    /* access modifiers changed from: private */
    public Queue<Task> taskQueue = new LinkedList();

    public TaskManager(Storage storage2, IdentityManager identityManager2, NetworkManager networkManager2) {
        this.storage = storage2;
        this.identityManager = identityManager2;
        this.networkManager = networkManager2;
        initScheduler();
        start();
    }

    public static TaskManager makeInstance(Storage storage2, IdentityManager identityManager2, NetworkManager networkManager2) {
        return new TaskManager(storage2, identityManager2, networkManager2);
    }

    private void storeTasks() {
        Logger.log("TASK MANAGER: storing tasks into Storage ...");
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList(this.taskQueue);
        while (linkedList.size() > 0) {
            try {
                jSONArray.put(((Task) linkedList.poll()).serialize());
            } catch (JSONException e) {
                Logger.error((Throwable) e);
            }
        }
        this.storage.put(StorageKey.STORED_TASKS, jSONArray.toString());
        Logger.log("TASK MANAGER: storing has completed!");
    }

    private void loadStoredTasks() {
        Logger.log("TASK MANAGER: loading tasks from Storage ...");
        String string = this.storage.getString(StorageKey.STORED_TASKS);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                Logger.log("TASK MANAGER: found " + jSONArray.length() + " task(s) in storage.");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        Task task = new Task(jSONArray.getJSONObject(i));
                        if ("1.0".equals(task.getSdkVersion())) {
                            addTask(task);
                        } else {
                            Logger.log("TASK MANAGER: ignore task from old SDK version ...");
                        }
                    } catch (JSONException e) {
                        Logger.error((Throwable) e);
                    }
                }
            } catch (JSONException e2) {
                Logger.error((Throwable) e2);
                return;
            }
        }
        Logger.log("TASK MANAGER: loading saved tasks completed!");
    }

    private void addTask(Task task) {
        while (this.taskQueue.size() >= 100) {
            Logger.warn("TASK MANAGER: exceeding task queue limit (100). Removing oldest event in the queue ...");
            this.taskQueue.poll();
        }
        if (this.shouldNotRestart.booleanValue()) {
            Logger.warn("TASK MANAGER: Service stopped permanently. Ignore this " + task.getType() + " task.");
            return;
        }
        this.taskQueue.add(task);
        Logger.log("TASK MANAGER: added new task to the queue!");
    }

    public void createEventTask(Event event) {
        try {
            addTask(new Task(TaskType.EVENT, event.serialize()));
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void createAliasTask(String str) {
        JSONObject jSONObject = new JSONObject();
        String distinctId = this.identityManager.getDistinctId();
        try {
            jSONObject.put("user_id", str);
            jSONObject.put(CommonProps.DISTINCT_ID, distinctId);
            addTask(new Task(TaskType.ALIAS, jSONObject));
            this.identityManager.updateDistinctId(str);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void createIdentifyTask(String str) {
        JSONObject jSONObject = new JSONObject();
        String distinctId = this.identityManager.getDistinctId();
        try {
            jSONObject.put("user_id", str);
            jSONObject.put(CommonProps.CURRENT_DISTINCT_ID, distinctId);
            addTask(new Task(TaskType.IDENTIFY, jSONObject));
            this.identityManager.updateDistinctId(str);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void createUpdateProfileTask(JSONObject jSONObject) {
        try {
            jSONObject.put(CommonProps.CURRENT_DISTINCT_ID, this.identityManager.getDistinctId());
            addTask(new Task(TaskType.UPDATE_PROFILE, jSONObject));
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public <T> void createIncreasePropertyTask(String str, T t) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonProps.PROPERTY_NAME, str);
            jSONObject.put("value", t);
            jSONObject.put(CommonProps.CURRENT_DISTINCT_ID, this.identityManager.getDistinctId());
            addTask(new Task(TaskType.INCREASE_PROPERTY, jSONObject));
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void createAppendToPropertyTask(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonProps.PROPERTY_NAME, str);
            jSONObject.put("value", jSONArray);
            jSONObject.put(CommonProps.CURRENT_DISTINCT_ID, this.identityManager.getDistinctId());
            addTask(new Task(TaskType.APPEND_TO_PROPERTY, jSONObject));
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void createRemoveFromPropertyTask(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonProps.PROPERTY_NAME, str);
            jSONObject.put("value", jSONArray);
            jSONObject.put(CommonProps.CURRENT_DISTINCT_ID, this.identityManager.getDistinctId());
            addTask(new Task(TaskType.REMOVE_FROM_PROPERTY, jSONObject));
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public List<JSONObject> dequeueEvents() {
        Logger.log("DEQUEUE: events");
        return dequeueEvents(new ArrayList());
    }

    private List<JSONObject> dequeueEvents(List<JSONObject> list) {
        if (this.processingQueue.size() == 0) {
            Logger.log("DEQUEUE: nothing left to dequeue");
            return list;
        }
        Task peek = this.processingQueue.peek();
        if (!peek.getType().equals(TaskType.EVENT)) {
            Logger.log("DEQUEUE: top item is not event, stop dequeue");
            return list;
        }
        peek.setProcessing(true);
        this.processingQueue.poll();
        list.add(peek.getData());
        Logger.log("DEQUEUE: added 1 event to the list");
        return dequeueEvents(list);
    }

    /* access modifiers changed from: private */
    public Response.Listener<JSONObject> createSuccessCallback(final String str) {
        return new Response.Listener<JSONObject>() {
            public void onResponse(JSONObject jSONObject) {
                Logger.log("FLUSHING: " + str + " task(s) succeed! - " + jSONObject.toString());
                TaskManager.this.cleanUpProcessingTasks();
                TaskManager.this.finishFlushing();
            }
        };
    }

    /* access modifiers changed from: private */
    public Response.ErrorListener createErrorCallback() {
        return new Response.ErrorListener() {
            public void onErrorResponse(VolleyError volleyError) {
                int i;
                Logger.error((Throwable) volleyError);
                if ((volleyError instanceof NoConnectionError) || volleyError.networkResponse == null) {
                    Logger.log("FLUSHING: network error, retry!");
                } else {
                    int i2 = volleyError.networkResponse.statusCode;
                    try {
                        i = new JSONObject(new String(volleyError.networkResponse.data, "UTF-8")).getInt("error_code");
                    } catch (Exception unused) {
                        Logger.error((Throwable) volleyError);
                        i = -1;
                    }
                    if (i == 40101) {
                        Logger.error("UNAUTHORIZED: This token is disabled at the moment. Stopping all GIAP's services and ignore all events.");
                        TaskManager.this.forceStopPermanently();
                        return;
                    } else if (i2 < 500 || i2 > 599) {
                        TaskManager.this.cleanUpProcessingTasks();
                    } else {
                        Logger.log("FLUSHING: GIAP Platform Core internal error!");
                    }
                }
                TaskManager.this.finishFlushing();
            }
        };
    }

    /* access modifiers changed from: private */
    public void cleanUpProcessingTasks() {
        while (this.taskQueue.size() > 0 && this.taskQueue.peek().getProcessing().booleanValue()) {
            this.taskQueue.poll();
        }
        Logger.log("FLUSHING: Cleaned up finished tasks!");
    }

    /* access modifiers changed from: private */
    public void finishFlushing() {
        this.processingQueue.clear();
        if (!this.started.booleanValue()) {
            Logger.log("FLUSHING: scheduler has stopped due to app's inactivity, save current queue into storage");
            storeTasks();
        }
        this.flushing = false;
        Logger.log("FLUSHING: Flushing finished!");
    }

    private synchronized void initScheduler() {
        if (this.scheduler == null) {
            this.scheduler = new ScheduledThreadPoolExecutor(100) {
                public void afterExecute(Runnable runnable, Throwable th) {
                    super.afterExecute(runnable, th);
                    boolean z = false;
                    if (th == null && (runnable instanceof ScheduledFuture)) {
                        try {
                            z = ((ScheduledFuture) runnable).isDone();
                            if (z) {
                                Logger.warn("SCHEDULED TASK: Scheduler is shut down.");
                                ((ScheduledFuture) runnable).get();
                            }
                        } catch (CancellationException unused) {
                            Logger.warn("SCHEDULED TASK: Scheduled job is cancelled!");
                        } catch (ExecutionException e) {
                            th = e.getCause();
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if (th != null) {
                        Logger.error(th, "SCHEDULED TASK: Uncaught exception is detected!");
                        if (z) {
                            Logger.log("Trying to restart the scheduler ...");
                            TaskManager.this.startScheduling();
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public void startScheduling() {
        if (!this.shouldNotRestart.booleanValue()) {
            if (this.scheduler == null) {
                Logger.error("TASK MANAGER: scheduler not found (should not be). Can not start scheduling.");
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.scheduledJobHandler;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.scheduledJobHandler = this.scheduler.scheduleAtFixedRate(this.flush, 1, 1, TimeUnit.SECONDS);
                Logger.log("TASK MANAGER: scheduler has started. Flushing tasks every 1 second(s).");
                return;
            }
            Logger.warn("TASK MANAGER: scheduling failed! Previous scheduled job has not done yet!");
        }
    }

    public void start() {
        if (!this.shouldNotRestart.booleanValue()) {
            if (this.started.booleanValue()) {
                Logger.warn("TASK MANAGER: Scheduler has started. Call stop() before starting again.");
                return;
            }
            this.started = true;
            loadStoredTasks();
            startScheduling();
        }
    }

    public void restart() {
        if (!this.shouldNotRestart.booleanValue()) {
            if (this.started.booleanValue()) {
                Logger.warn("TASK MANAGER: Scheduler has started. Call stop() before starting again.");
                return;
            }
            this.started = true;
            startScheduling();
        }
    }

    public void stop() {
        if (!this.started.booleanValue()) {
            Logger.warn("TASK MANAGER: Scheduler has not started yet.");
            return;
        }
        Logger.log("TASK MANAGER: stopping scheduler ...");
        ScheduledFuture<?> scheduledFuture = this.scheduledJobHandler;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        storeTasks();
        this.started = false;
    }

    public synchronized void forceStopPermanently() {
        Logger.warn("TASK MANAGER: force stop permanently ...");
        this.shouldNotRestart = true;
        ScheduledFuture<?> scheduledFuture = this.scheduledJobHandler;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        finishFlushing();
        this.started = false;
        Logger.warn("TASK MANAGER: Stopped permanently. Ignore incoming tasks.");
    }

    /* access modifiers changed from: package-private */
    public boolean hasStarted() {
        return this.started.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public Queue<Task> getTaskQueue() {
        return this.taskQueue;
    }
}
