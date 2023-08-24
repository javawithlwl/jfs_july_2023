package com.careerit.jsf.day27;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Product{
    private String name;
    private double price;
}

public class GenericExample {

    public static void main(String[] args) {

            Object data = "Rajesh";
            Object obj = Product.builder()
                    .name("Dell")
                    .price(45000)
                    .build();
            Product product = convert(obj,Product.class);
            System.out.println(product.getName());
        ObjectMapper objectMapper = new ObjectMapper();

        Predicate<Integer> predicate = (num)->num%2==0;

        String res = performOperations("Hello", "Rajesh", (a, b) -> a.concat(" ").concat(b));
        System.out.println(res);
        inspect(3.5d);

    }

    public static <T> T convert(Object object,Class<T> cls){
        return cls.cast(object);
    }

    public static <T> T performOperations(T a, T b, BiFunction<T,T,T> function){
        return function.apply(a,b);
    }
    public static <U extends Number> void inspect(U u){
        System.out.println("T: " + u.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
