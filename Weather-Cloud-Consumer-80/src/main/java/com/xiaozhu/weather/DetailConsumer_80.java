package com.xiaozhu.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.xiaozhu.weather"})
public class DetailConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(DetailConsumer_80.class, args);
    }
}
