package net.minidev.json.parser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import net.minidev.json.writer.JsonReaderI;

class JSONParserInputStream extends JSONParserReader {
    public JSONParserInputStream(int i) {
        super(i);
    }

    public Object parse(InputStream inputStream) throws ParseException, UnsupportedEncodingException {
        return super.parse(new InputStreamReader(inputStream, "utf8"));
    }

    public <T> T parse(InputStream inputStream, JsonReaderI<T> jsonReaderI) throws ParseException, UnsupportedEncodingException {
        return super.parse(new InputStreamReader(inputStream, "utf8"), jsonReaderI);
    }
}
