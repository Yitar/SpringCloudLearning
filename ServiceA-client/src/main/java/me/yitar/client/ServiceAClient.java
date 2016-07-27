package me.yitar.client;

import me.yitar.api.ServiceAApi;
import me.yitar.retrofit.RestAdapterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;

/**
 * Created by Yitar on 2016/7/27.
 */
@Component
public class ServiceAClient {

    @Autowired
    private RestAdapterConfig restAdapterConfig;

    public String greeting(String userName) {

        ServiceAApi serviceAApi = restAdapterConfig.create(ServiceAApi.class, "serviceA");
        return serviceAApi.greeting(userName);

    }

}
