package com.kolodenko.simple_boot_docker;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    public static final String URI = "http://localhost:8083/name";
    public RestTemplate restTemplate;

    public NameService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName(){
        return restTemplate.getForObject(URI, String.class);
    }
}
