package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Mauricio F. Caldas Esteves
 */
// this annotation is the same as using @Configuration,
// @EnableAutoConfiguration, @ComponentScan.
@SpringBootApplication
@EntityScan(basePackages = { "model" })
public class Application {

	/**
	 * Main method to launch application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}