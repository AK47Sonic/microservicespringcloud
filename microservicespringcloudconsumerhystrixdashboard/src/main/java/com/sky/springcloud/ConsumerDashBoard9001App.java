package com.sky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
// http://localhost:9001/hystrix
// http://localhost:8001/hystrix.stream
public class ConsumerDashBoard9001App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashBoard9001App.class, args);
    }
}
