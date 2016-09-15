package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Mauricio F. Caldas Esteves
 */
// same as @Configuration, @EnableAutoConfiguration, @ComponentScan.
@SpringBootApplication
@EntityScan(basePackages = { "model" })
@EnableJpaRepositories(basePackages = { "dao" })
@EnableTransactionManagement
public class Application {

	/**
	 * Main method to launch application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}