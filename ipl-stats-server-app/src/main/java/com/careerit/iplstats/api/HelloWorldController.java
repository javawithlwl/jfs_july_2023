package com.careerit.iplstats.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

        @GetMapping("/hello")
        public String greetings() {
                return "Hello Welcome to Spring Boot World";
        }
}
