package com.example.sleuthclient.resource;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
@Slf4j
public class HelloResource {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/hello")
    public String helloWorldServerCalling(){
        log.info("Calling the server");
        return restTemplate.getForObject("http://localhost:8081/rest/server/hello",String.class);
    }
}
