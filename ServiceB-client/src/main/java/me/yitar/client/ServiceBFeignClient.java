package me.yitar.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Yitar on 2016/7/29.
 */
@FeignClient(url = "http://localhost:8900/ServiceA")
public interface ServiceBFeignClient {

    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    String greeting(@PathVariable("userName") String userName);
}
