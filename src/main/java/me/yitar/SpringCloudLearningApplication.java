package me.yitar;

import me.yitar.consul.ConsulRegisterListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Deprecated
@SpringBootApplication
@EnableSwagger2
public class SpringCloudLearningApplication {

	public void run(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringCloudLearningApplication.class);
		springApplication.addListeners(new ConsulRegisterListener());
		springApplication.run(args);
	}

	public static void main(String[] args) {


	}
}
