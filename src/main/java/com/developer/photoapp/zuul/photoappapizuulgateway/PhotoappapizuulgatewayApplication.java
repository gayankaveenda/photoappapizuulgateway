package com.developer.photoapp.zuul.photoappapizuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PhotoappapizuulgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappapizuulgatewayApplication.class, args);
    }

}
