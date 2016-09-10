package me.yitar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Yitar on 2016/7/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients("ServerAClient")
public class ServiceAClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAClientApplication.class, args);
    }

}
