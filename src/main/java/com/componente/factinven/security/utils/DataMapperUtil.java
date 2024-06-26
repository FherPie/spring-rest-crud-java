package com.componente.factinven.security.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapperUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.findAndRegisterModules();
    }

    public static <F, T> T convertTo(final F from, final Class<T> toClass) {
        return MAPPER.convertValue(from , toClass);
    }
}
