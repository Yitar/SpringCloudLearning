package me.yitar.retrofit;

import me.yitar.loadBalancer.LoadBalancer;
import me.yitar.loadBalancer.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;

/**
 * Created by Yitar on 2016/7/27.
 */
@Deprecated
@Component
public class RestAdapterConfig {

    @Autowired
    private LoadBalancer loadBalancer;

    public <T> T create(Class<T> clazz, String serviceName) {

        ServerAddress serverAddress = loadBalancer.chooseServer(serviceName);
        String endPointUrl = new StringBuilder("http://")
                .append(serverAddress.getIp())
                .append(":")
                .append(serverAddress.getPort()).toString();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endPointUrl)
                .build();
        T tInstance = retrofit.create(clazz);
        return tInstance;
    }

}
