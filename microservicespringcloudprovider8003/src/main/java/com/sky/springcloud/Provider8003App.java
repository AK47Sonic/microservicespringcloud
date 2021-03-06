package com.sky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
@EnableDiscoveryClient
public class Provider8003App {
    public static void main(String[] args) {
        SpringApplication.run(Provider8003App.class, args);
    }
}
