package me.yitar;

import me.yitar.consul.ConsulRegisterListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLearningApplication {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(SpringCloudLearningApplication.class);
		springApplication.addListeners(new ConsulRegisterListener());
		springApplication.run(args);
	}
}
