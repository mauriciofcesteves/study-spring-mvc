package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mauricio F. Caldas Esteves
 */
@SpringBootApplication //This annotation is the same as using @Configuration @EnableAutoConfiguration @ComponentScan.
public class Application {

	/**
	 * Main method to launch application.
	 */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}