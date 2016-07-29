package me.yitar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Yitar on 2016/7/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceAClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAClientApplication.class, args);
    }

}
