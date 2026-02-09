package ai.gotit.giap.service;

import ai.gotit.giap.constant.StorageKey;
import java.util.UUID;

public class IdentityManager {
    private String distinctId = null;
    private Storage storage;

    public IdentityManager(Storage storage2) {
        this.storage = storage2;
        String string = storage2.getString(StorageKey.DISTINCT_ID);
        if (string == null) {
            generateNewDistinctId();
        } else {
            this.distinctId = string;
        }
    }

    public static IdentityManager makeInstance(Storage storage2) {
        return new IdentityManager(storage2);
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String generateNewDistinctId() {
        String uuid = UUID.randomUUID().toString();
        this.distinctId = uuid;
        updateDistinctId(uuid);
        return this.distinctId;
    }

    public void updateDistinctId(String str) {
        this.distinctId = str;
        this.storage.put(StorageKey.DISTINCT_ID, str);
    }
}
