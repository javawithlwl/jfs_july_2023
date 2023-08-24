package com.careerit.jsf.day22;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
class Product {
    @JsonProperty("productName")
    private String name;
    private String brand;
    private String description;
    private List<String> usage;
    private List<Seller> sellers;

}

@Getter
@Setter
@ToString
class Seller {

    private String name;
    private double price;
    private double rating;
}

public class JsonExample {

    public static void main(String[] args) throws JsonProcessingException {


        String productInfo = """
                    {
                        "productName":"Dell Laptop",
                        "description":"Dell laptop with 8GB RAM and 1TB HDD",
                        "brand":"Dell",
                        "usage":["Gaming","Programming","Office"],
                        "mfdYear":2023,
                        "sellers":[
                            {
                                "name":"Amazon",
                                "price":45000.00,
                                "rating":4.5
                            },
                            {
                                "name":"Flipkart",
                                "price":46000.00,
                                "rating":4.2
                            },
                            {
                                "name":"Paytm",
                                "price":47000.00,
                                "rating":4.0
                            }
                        ]
                    }
                """;
        // Convert the above json string to Product object

        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Product product = objectMapper.readValue(productInfo, Product.class);
        System.out.println(product);
    }
}
