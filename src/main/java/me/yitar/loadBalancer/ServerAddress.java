package me.yitar.loadBalancer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Yitar on 2016/7/27.
 */
@Getter @Setter
@AllArgsConstructor
public class ServerAddress {

    private String ip;
    private int port;
}
