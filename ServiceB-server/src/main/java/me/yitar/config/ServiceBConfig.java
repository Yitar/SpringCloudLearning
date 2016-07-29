package me.yitar.config;

import me.yitar.client.ServiceAClient;

/**
 * Created by Yitar on 2016/7/27.
 */
@Deprecated
public class ServiceBConfig {

    public ServiceAClient serviceAClient() {

        return new ServiceAClient();

    }

}
