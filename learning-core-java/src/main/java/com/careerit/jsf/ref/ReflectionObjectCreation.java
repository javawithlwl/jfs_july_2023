package com.careerit.jsf.ref;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectionObjectCreation {
    @SneakyThrows
    public static void main(String[] args) {

        Map<String,Object> map1 = Map.of("pname","Lenovo-Thinkpad","brand","Lenovo","price",45000.00);
        Map<String,Object> map2 = Map.of("empno",1001,"name","Krish","salary",45000.00);
        String jsonStr = "{\"empno\":1002,\"name\":\"John\",\"salary\":55000.0}\n";
        Employee emp = createObject(Employee.class,map2);
        System.out.println(emp);
        Product product = createObject(Product.class,map1);
        System.out.println(product);
        Employee emp2 = createObject(jsonStr,Employee.class);
        System.out.println(emp2);
    }

    public static <T>  T createObject(Class<T> cls,Map<String,Object> map){
        try {
            T obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            ObjectMapper objMapper = new ObjectMapper();
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = map.get(name);
                field.set(obj,value);
            }
            return obj;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public static <T>  T createObject(String jsonStr,Class<T> cls){
        try {
            T obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            ObjectMapper objMapper = new ObjectMapper();
            Map<String,Object> map = objMapper.readValue(jsonStr,HashMap.class);
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = map.get(name);
                field.set(obj,value);
            }
            return obj;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
