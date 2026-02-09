package androidx.camera.video;

import androidx.camera.video.Quality;

final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final String name;
    private final int value;

    AutoValue_Quality_ConstantQuality(int i, String str) {
        this.value = i;
        if (str != null) {
            this.name = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* access modifiers changed from: package-private */
    public int getValue() {
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.name;
    }

    public String toString() {
        return "ConstantQuality{value=" + this.value + ", name=" + this.name + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.ConstantQuality)) {
            return false;
        }
        Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
        if (this.value != constantQuality.getValue() || !this.name.equals(constantQuality.getName())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.value ^ 1000003) * 1000003) ^ this.name.hashCode();
    }
}
