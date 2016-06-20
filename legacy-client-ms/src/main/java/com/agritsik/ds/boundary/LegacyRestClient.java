package com.agritsik.ds.boundary;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class LegacyRestClient {


    @HystrixCommand(fallbackMethod = "reliable")
    public String ping(){
        RestTemplate restTemplate = new RestTemplate();
        return ">>> " + restTemplate.getForObject(
                URI.create("http://localhost:9001/"),
                String.class);

    }

    public String reliable(){
        return "circuit breaker";
    }
}
