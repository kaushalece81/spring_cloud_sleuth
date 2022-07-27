package com.example.sleuthserver.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/server")
@Slf4j
public class HelloResource {
    @GetMapping("/hello")
    public String helloWorld(){
        log.info("server invoked");
        return "Hello World!";
    }
}
