package com.careerit.ci.repo;

import com.careerit.ci.domain.CountryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryInfoRepo extends JpaRepository<CountryInfo, Long> {

    List<CountryInfo> findByCountryNameContainingIgnoreCase(String str);
}
