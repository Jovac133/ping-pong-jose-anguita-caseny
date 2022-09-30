package Test.PingPong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PingPongApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongApplication.class, args);
	}

	@GetMapping("/ping")
	public String pong() {
		return "pong";

	}


}
