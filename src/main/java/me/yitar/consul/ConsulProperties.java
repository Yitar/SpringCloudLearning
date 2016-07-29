package me.yitar.consul;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Yitar on 2016/7/26.
 */
@Deprecated
@Component
@Getter
@Setter
public class ConsulProperties {

    @Value("${service.name}")
    private String serviceName;
    @Value("${service.port:8080}")
    private int servicePort;
    @Value("${service.tag:dev}")
    private String serviceTag;
    //    @Value("${serviceIp:localhost}")
    //    private String serviceIp;

    @Value("${health.url}")
    private String healthUrl;
    @Value("${health.interval:10}")
    private int healthInterval;
}
