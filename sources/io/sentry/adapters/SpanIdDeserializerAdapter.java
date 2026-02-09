package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanId;
import java.lang.reflect.Type;

public final class SpanIdDeserializerAdapter implements JsonDeserializer<SpanId> {
    private final SentryOptions options;

    public SpanIdDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public SpanId deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return new SpanId(jsonElement.getAsString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SpanId", th);
            return null;
        }
    }
}
