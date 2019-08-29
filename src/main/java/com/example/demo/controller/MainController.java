package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String hello() {
    return "hello";
  }
  
  @GetMapping("/hello")
  public String hi() {
    return "hi";
  }
}
