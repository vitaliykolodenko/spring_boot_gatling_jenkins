package com.kolodenko.simple_boot_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimpleController {

    @Autowired
    NameService nameService;

    @RequestMapping("hi")
    public String getHi(){
        return "Hi! " + nameService.getName();
    }
}
