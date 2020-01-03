package com.deveric.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  @GetMapping("hello")
  public String hello(HttpSession session) {
    session.setAttribute("hello", "eric");
    return "hello eric!";
  }
}
