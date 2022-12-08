package com.codestates.practicegithubActiondeploy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/")
    public String hello(){
        log.info("Hello Controller 출력완료 !!");
        return "Hello World! Hello BE BootCamp";
    }
}
