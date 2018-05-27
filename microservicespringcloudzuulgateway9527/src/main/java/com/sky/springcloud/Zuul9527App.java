package com.sky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
// http://localhost:9527/microserviceclouddept/dept/get/1
public class Zuul9527App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527App.class, args);
    }

}
