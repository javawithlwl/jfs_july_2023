package com.careerit.todoapp.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertorUtil {

        public static <T> T convert(Object obj, Class<T> clazz) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(obj, clazz);
        }
        public static <T> T convert(Object obj, TypeReference<T> typeReference) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(obj, typeReference);
        }
}
