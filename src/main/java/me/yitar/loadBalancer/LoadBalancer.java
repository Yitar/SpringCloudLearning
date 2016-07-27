package me.yitar.loadBalancer;

import com.orbitz.consul.Consul;
import com.orbitz.consul.HealthClient;
import com.orbitz.consul.model.health.ServiceHealth;
import com.orbitz.okhttp3.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Yitar on 2016/7/27.
 */
@Component
public class LoadBalancer {

    @Autowired
    private Consul consul;

    /*
    * 服务发现
    * */
    public List<ServerAddress> getAvailableServerList(String serviceName) {
        List<ServerAddress> availableServerList = new ArrayList<>();
        HealthClient healthClient = consul.healthClient();
        List<ServiceHealth> availableServers = healthClient.getHealthyServiceInstances(serviceName).getResponse();
        availableServers.stream().forEach(x->availableServerList.add(new ServerAddress(x.getNode().getAddress(), x.getService().getPort())));
        return availableServerList;

    }

    /*
    * 负载均衡（随机）
    * */
    public ServerAddress chooseServer(String serviceName) {
        List<ServerAddress> servers = getAvailableServerList(serviceName);
        Random random = new Random();
        int index = 0;
        if (!servers.isEmpty()) {
            index = random.nextInt(servers.size());
        }
        return servers.get(index);
    }

}
