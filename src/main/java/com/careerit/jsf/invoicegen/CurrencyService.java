package com.careerit.jsf.invoicegen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyService {

        private final Map<String,CurrencyDetails> currencyMap;
        @SneakyThrows
        public CurrencyService(){
            ObjectMapper objectMapper = new ObjectMapper();
            List<CurrencyDetails> currencyDetails = objectMapper.readValue(CurrencyService.class.getResourceAsStream("/currency.json"),
                    new TypeReference<List<CurrencyDetails>>() {
                    });
            currencyMap = currencyDetails.stream().collect(Collectors.toMap(CurrencyDetails::getCountryCode, e->e));
        }

        public CurrencyDetails getCurrencyDetails(String countryCode){
                return currencyMap.get(countryCode);
        }
}
