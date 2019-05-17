package com.evol.eureka;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YelpEurekaServerApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(YelpEurekaServerApplication.class).web(true).run(args);
        //SpringApplication.run(YelpEurekaServerApplication.class, args);
    }

}
