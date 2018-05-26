package com.sky.springcloud;

import com.sky.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

// http://localhost/consumer/dept/list
@SpringBootApplication
// Ribbon配置
@EnableEurekaClient
//自定义lb算法
@RibbonClient(name="MICROSERVICECLOUDDEPT",configuration=MySelfRule.class)
public class Consumer80App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80App.class, args);
    }
}
