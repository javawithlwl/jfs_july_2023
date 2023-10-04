package com.careerit.sb.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

        @GetMapping("/greet")
        public ResponseEntity<String> greet(){
            return  ResponseEntity.ok("Greetings from User Controller");
        }
}
