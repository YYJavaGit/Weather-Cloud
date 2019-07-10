package com.xiaozhu.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeatherEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEureka7003Application.class,args);
    }

}
