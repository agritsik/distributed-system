package com.agritsik.ds.boundary;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LegacyRestClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    @HystrixCommand(fallbackMethod = "reliable")
    public String ping(){

        List<ServiceInstance> instances = discoveryClient.getInstances("legacy-rest");

        RestTemplate restTemplate = new RestTemplate();
        return ">>> " + restTemplate.getForObject(instances.get(0).getUri(), String.class);
    }

    public String reliable(){
        return "circuit breaker";
    }
}
