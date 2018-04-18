package com.cbh.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能eureka使用
//@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现
//它们的作用是一样的
@RestController
public class GoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello this is goods-service:" + port;
    }
}
