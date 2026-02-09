package io.sentry.protocol;

public final class MeasurementValue {
    private final float value;

    public MeasurementValue(float f) {
        this.value = f;
    }

    public float getValue() {
        return this.value;
    }
}
