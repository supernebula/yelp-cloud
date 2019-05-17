package com.evol.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YelpDiscoveryApplication {

    public static void main(String[] args) {
        //SpringApplication.run(YelpDiscoveryApplication.class, args);
        new SpringApplicationBuilder(YelpDiscoveryApplication.class).web(true).run(args);
    }

}
