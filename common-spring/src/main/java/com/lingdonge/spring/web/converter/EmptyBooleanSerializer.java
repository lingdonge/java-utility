package com.lingdonge.spring.web.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 自定义序列化
 */
public  class EmptyBooleanSerializer extends JsonSerializer<Object> {
    public static final JsonSerializer<Object> INSTANCE = new EmptyBooleanSerializer();

    private EmptyBooleanSerializer() {
    }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        jsonGenerator.writeBoolean(false);
    }
}