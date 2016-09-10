package me.yitar.controller;

import me.yitar.client.ServiceAFeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yitar on 2016/7/27.
 */
@RestController
public class ServiceAController implements ServiceAFeignClient{


    @Override
    public String greeting(@PathVariable("userName") String userName) {
        return "Hello, " + userName;
    }
}
