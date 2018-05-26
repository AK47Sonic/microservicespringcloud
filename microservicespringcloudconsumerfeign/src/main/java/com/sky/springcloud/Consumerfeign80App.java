package com.sky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

// http://localhost/consumer/dept/list
@SpringBootApplication
// Ribbon配置
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.sky.springcloud"})
//@ComponentScan("com.sky.springcloud")
public class Consumerfeign80App {
    public static void main(String[] args) {
        SpringApplication.run(Consumerfeign80App.class, args);
    }
}
