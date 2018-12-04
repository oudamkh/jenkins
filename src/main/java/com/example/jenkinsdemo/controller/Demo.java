package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 *
 * @Author: Oudam Seng (o.seng@gl-f.com) on 12/4/18.
 */
@RestController
public class Demo {

  @GetMapping(value = "/")
  public String get() {
    return "Welcome to Jenkins DevOp!";
  }
}
