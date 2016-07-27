package me.yitar;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yitar on 2016/7/27.
 */
@SpringBootApplication
public class ServiceBApplication {

    public static void main(String[] args) {
        SpringCloudLearningApplication springCloudLearningApplication = new SpringCloudLearningApplication();
        springCloudLearningApplication.run(args);
    }
}
