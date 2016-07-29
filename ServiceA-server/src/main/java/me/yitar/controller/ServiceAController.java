package me.yitar.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Yitar on 2016/7/27.
 */
@Api("ServiceAApi")
@RestController
@RequestMapping("/serviceA")
public class ServiceAController {

    @ApiOperation("greeting")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userName",paramType = "path", dataType = "string", required = true)
    })
    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    public String greeting (@PathVariable("userName") String userName) {
        return "Hello, " + userName;
    }

}
