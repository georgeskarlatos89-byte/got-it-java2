package net.minidev.json.writer;

import java.io.IOException;
import java.lang.reflect.Type;
import net.minidev.json.parser.ParseException;

public class UpdaterMapper<T> extends JsonReaderI<T> {
    final JsonReaderI<?> mapper;
    final T obj;

    public UpdaterMapper(JsonReader jsonReader, T t) {
        super(jsonReader);
        if (t != null) {
            this.obj = t;
            this.mapper = jsonReader.getMapper(t.getClass());
            return;
        }
        throw new NullPointerException("can not update null Object");
    }

    public UpdaterMapper(JsonReader jsonReader, T t, Type type) {
        super(jsonReader);
        if (t != null) {
            this.obj = t;
            this.mapper = jsonReader.getMapper(type);
            return;
        }
        throw new NullPointerException("can not update null Object");
    }

    public JsonReaderI<?> startObject(String str) throws ParseException, IOException {
        Object value = this.mapper.getValue(this.obj, str);
        if (value == null) {
            return this.mapper.startObject(str);
        }
        return new UpdaterMapper(this.base, value, this.mapper.getType(str));
    }

    public JsonReaderI<?> startArray(String str) throws ParseException, IOException {
        return this.mapper.startArray(str);
    }

    public void setValue(Object obj2, String str, Object obj3) throws ParseException, IOException {
        this.mapper.setValue(obj2, str, obj3);
    }

    public void addValue(Object obj2, Object obj3) throws ParseException, IOException {
        this.mapper.addValue(obj2, obj3);
    }

    public Object createObject() {
        T t = this.obj;
        if (t != null) {
            return t;
        }
        return this.mapper.createObject();
    }

    public Object createArray() {
        T t = this.obj;
        if (t != null) {
            return t;
        }
        return this.mapper.createArray();
    }

    public T convert(Object obj2) {
        T t = this.obj;
        if (t != null) {
            return t;
        }
        return this.mapper.convert(obj2);
    }
}
