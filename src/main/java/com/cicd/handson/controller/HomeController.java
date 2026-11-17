package com.cicd.handson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to CICD Pipeline Hands-on!";
    }

    @GetMapping("/api/message")
    public Map<String, String> message() {
        return Map.of(
                "project", "chnaegs the code and test it",
                "message", "Java 17 test new features in an sereevr"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
