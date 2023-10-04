package com.careerit.ci;

import com.careerit.ci.dto.CountryInfoDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CountryInfoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CountryInfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
