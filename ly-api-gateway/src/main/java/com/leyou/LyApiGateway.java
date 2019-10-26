package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class LyApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyApiGateway.class);
        System.out.println("wanggang1");
        System.out.println("ceshi");
    }
}
