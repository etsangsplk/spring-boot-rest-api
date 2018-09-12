package com.ruubel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> status() {
        return new ResponseEntity<>(new HashMap<String, Object>(){{
            put("status", "alive");
        }}, HttpStatus.OK);
    }

}
