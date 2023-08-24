package com.careerit.jsf.invoicegen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.List;

public class CustomerService {

        private final List<CustomerUsageData> customerUsageData;

        @SneakyThrows
        public CustomerService(){
            ObjectMapper objectMapper = new ObjectMapper();
            customerUsageData = objectMapper.readValue(CurrencyService.class.getResourceAsStream("/customer.json"), new TypeReference<List<CustomerUsageData>>() {
            });
        }
        public List<CustomerUsageData> getCustomerUsageData(){
            return customerUsageData;
        }
}
