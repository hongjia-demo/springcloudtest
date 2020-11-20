package com.yun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //当前使用eureka的server
public class EurekaSeverApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSeverApplication.class,args);
    }

}
