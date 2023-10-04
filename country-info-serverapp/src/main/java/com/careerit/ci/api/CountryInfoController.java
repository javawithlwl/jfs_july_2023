package com.careerit.ci.api;

import com.careerit.ci.dto.CountryInfoDto;
import com.careerit.ci.service.CountryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryInfoController {

    @Autowired
    private CountryInfoService countryInfoService;

    @GetMapping("/load")
    public ResponseEntity<List<CountryInfoDto>> loadCountryInfo() {
        return ResponseEntity.ok(countryInfoService.loadCountryInfo());
    }

    @GetMapping("/info")
    public ResponseEntity<List<CountryInfoDto>> getCountryInfo() {
        return ResponseEntity.ok(countryInfoService.getCountryInfoDetails());
    }

    @GetMapping("/search")
    public ResponseEntity<List<CountryInfoDto>> search(@RequestParam("str")String str) {
        return ResponseEntity.ok(countryInfoService.search(str));
    }


}
