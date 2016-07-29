package me.yitar.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.yitar.client.ServiceAClient;
import me.yitar.client.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yitar on 2016/7/27.
 */
@Api("ServiceBApi")
@RestController
@RequestMapping("/ServiceB")
public class ServiceBController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @ApiOperation("微服务相互调用")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userName", paramType = "path", dataType = "string", required = true)
    })
    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    public String greeting(@PathVariable("userName") String userName) {
        return serviceAFeignClient.greeting(userName);
    }

}
