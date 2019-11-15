package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MyController {
	 @RequestMapping("")

     public String hello() {

            return "你好，我是spring boot项目 。jdk 1.8";

     }
}
