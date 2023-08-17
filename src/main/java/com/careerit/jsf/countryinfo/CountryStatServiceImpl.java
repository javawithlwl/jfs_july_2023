package com.careerit.jsf.countryinfo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CountryStatServiceImpl implements  CountryStatService {

    private List<CountryDetails> countryDetails;
    public CountryStatServiceImpl(){
        countryDetails = loadFromFile();
    }

    @Override
    public String maxPopulatedCountry() {
        return null;
    }

    @Override
    public String biggestCountry() {
        return null;
    }

    @Override
    public List<String> countryNames() {
        return null;
    }
    @SneakyThrows
    private List<CountryDetails> loadFromFile(){
        // Reading json and collect required fields
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Map<String,Object>>> mapType = new TypeReference<>() {};
        List<Map<String, Object>> response = objectMapper.readValue(CountryStatServiceImpl.class.getResourceAsStream("/all_country.json"), mapType);
        List<CountryDetails> resList = new ArrayList<>();
        for(Map<String,Object> elements:response){
            Object obj=elements.get("name");
            Map<String, Object> map = objectMapper.convertValue(obj, new TypeReference<Map<String, Object>>() {});
            String countryName = (String) map.get("common");
            String ccn3 = (String) elements.get("ccn3");
            double area = Double.parseDouble(elements.get("area").toString());
            long population = Long.parseLong(elements.get("population").toString());
            CountryDetails countryDetails1 = CountryDetails
                    .builder()
                    .countryName(countryName)
                    .area(area)
                    .population(population)
                    .ccn3(ccn3)
                    .build();
            resList.add(countryDetails1);
        }
        return resList;
    }

    public static void main(String[] args) {
        CountryStatServiceImpl obj = new CountryStatServiceImpl();
        System.out.println(obj.loadFromFile());
    }
}
