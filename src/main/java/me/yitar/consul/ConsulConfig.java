package me.yitar.consul;

import com.orbitz.consul.Consul;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yitar on 2016/7/26.
 */
@Deprecated
@Configuration
public class ConsulConfig {

    @Bean
    public Consul consul() {
        return Consul.builder().build();
    }

}
