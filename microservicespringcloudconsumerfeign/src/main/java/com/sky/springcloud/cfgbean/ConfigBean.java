package com.sky.springcloud.cfgbean;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
public class ConfigBean
{

//    我们使用注解配置bean的时候，并没有指定bean的id，那么spring帮我们创建bean的时候会给一个默认的id，id为类名首字母小写。


    @Bean
//    Ribbon 配置
    @LoadBalanced
//    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule()
//    {
//        return new RoundRobinRule();
////        return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
////        return new RetryRule();
//    }
}