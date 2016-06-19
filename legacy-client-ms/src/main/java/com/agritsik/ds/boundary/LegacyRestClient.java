package com.agritsik.ds.boundary;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class LegacyRestClient {


    public String ping(){
        RestTemplate restTemplate = new RestTemplate();
        return ">>> " + restTemplate.getForObject(
                URI.create("http://localhost:9001/"),
                String.class);

    }
}
