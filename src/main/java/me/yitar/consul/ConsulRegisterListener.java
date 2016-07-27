package me.yitar.consul;

import com.orbitz.consul.AgentClient;
import com.orbitz.consul.Consul;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.net.MalformedURLException;
import java.net.URI;

/**
 * Created by Yitar on 2016/7/26.
 */
public class ConsulRegisterListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Consul consul = contextRefreshedEvent.getApplicationContext().getBean(Consul.class);
        ConsulProperties properties = contextRefreshedEvent.getApplicationContext().getBean(ConsulProperties.class);

        AgentClient agentClient = consul.agentClient();
        try {
            agentClient.register(
                    properties.getServicePort(),
                    URI.create(properties.getHealthUrl()).toURL(),
                    properties.getHealthInterval(),
                    properties.getServiceName(),
                    properties.getServiceTag()
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
