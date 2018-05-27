package com.sky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// EurekaServer服务器端启动类
// http://localhost:7001/
@EnableEurekaServer
public class ConfigGitEurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServer7001App.class, args);
    }
}
