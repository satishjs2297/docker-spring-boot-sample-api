package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@RequestMapping("/echo")
	public String echo() {
		LOG.info("echo Invoked ....");
		return "{\"Message\" : \"Echo: This is testing spring boot app running on docker container.\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
