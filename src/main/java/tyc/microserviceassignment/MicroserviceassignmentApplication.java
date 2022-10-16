package tyc.microserviceassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class MicroserviceassignmentApplication {
	@GetMapping("/tyc")
	public String Message() {
		return "Merhaba hocam, ben Taha Yasin CINAR... Sen Abdulhamit'i savundun...:)";
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceassignmentApplication.class, args);
	}

}
