package com.careerit.ci.service;

import com.careerit.ci.domain.CountryInfo;
import com.careerit.ci.dto.CountryInfoDto;
import com.careerit.ci.repo.CountryInfoRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class CountryInfoService {

    @Autowired
    private CountryInfoRepo countryInfoRepo;

    public List<CountryInfoDto> getCountryInfoDetails(){
        List<CountryInfo> list = countryInfoRepo.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        List<CountryInfoDto> countryInfoDtoList = objectMapper.convertValue(list, new TypeReference<List<CountryInfoDto>>() {
        });
        log.info("Total countries found :{}", countryInfoDtoList.size());
        return countryInfoDtoList;
    }
    public List<CountryInfoDto> loadCountryInfo() {
        List<CountryInfoDto> list = getAllCountries();
        ObjectMapper objectMapper = new ObjectMapper();
        List<CountryInfo> countryInfo = objectMapper.convertValue(list, new TypeReference<List<CountryInfo>>() {
        });
        if (!countryInfo.isEmpty()) {
            countryInfoRepo.deleteAll();
            countryInfoRepo.saveAll(countryInfo);
        }
        List<CountryInfo> savedList = countryInfoRepo.findAll();
        List<CountryInfoDto> countryInfoDtoList = objectMapper.convertValue(savedList, new TypeReference<List<CountryInfoDto>>() {
        });
        log.info("Total countries found :{}", countryInfoDtoList.size());
        return countryInfoDtoList;
    }

    @SneakyThrows
    private List<CountryInfoDto> getAllCountries() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://restcountries.com/v3.1/all";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String resData = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Object>> typeRef = new TypeReference<List<Object>>() {
        };
        List<Object> list = objectMapper.readValue(resData, typeRef);
        List<CountryInfoDto> countryInfoDtoList = new ArrayList<>();
        for (Object obj : list) {
            Map<String, Object> map = objectMapper.convertValue(obj, new TypeReference<Map<String, Object>>() {
            });
            Object nameObject = map.get("name");
            String commonName = null;
            if (nameObject instanceof Map) {
                Map<String, Object> nameMap = (Map<String, Object>) nameObject;
                commonName = (String) nameMap.get("common");
            }
            String region = (String) map.get("region");
            String ccn3 = (String) map.get("cca3");
            double area = (double) map.get("area");
            long population = Long.parseLong(map.get("population").toString());
            String flagSvg = null;
            Object flagObject = map.get("flags");
            if (flagObject instanceof Map) {
                Map<String, Object> flagMap = (Map<String, Object>) flagObject;
                flagSvg = (String) flagMap.get("svg");
            }
            CountryInfoDto countryInfoDto = CountryInfoDto.builder()
                    .countryName(commonName)
                    .ccn3(ccn3)
                    .area(area)
                    .population(population)
                    .region(region)
                    .flagSvg(flagSvg)
                    .build();
            countryInfoDtoList.add(countryInfoDto);
        }
        return countryInfoDtoList;
    }

    public List<CountryInfoDto> search(String str){
        if(str==null || str.isEmpty()){
           return getCountryInfoDetails();
        }else{
            List<CountryInfo> searchResult = countryInfoRepo.findByCountryNameContainingIgnoreCase(str);
            ObjectMapper objectMapper = new ObjectMapper();
            List<CountryInfoDto> countryInfoDtoList = objectMapper.convertValue(searchResult, new TypeReference<List<CountryInfoDto>>() {
            });
            log.info("For search string {}, total countries found :{}",str, countryInfoDtoList.size());
            return countryInfoDtoList;
        }
    }
}
