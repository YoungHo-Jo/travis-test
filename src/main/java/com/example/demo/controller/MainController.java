package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok(
            "hello"
    );
  }
}
