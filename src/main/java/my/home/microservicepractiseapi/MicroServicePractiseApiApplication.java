package my.home.microservicepractiseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("my.*")
@ComponentScan(basePackages = { "my.*" })
@EntityScan("my.*")
@SpringBootApplication
public class MicroServicePractiseApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServicePractiseApiApplication.class, args);
	}

}
