package example.cashcard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashCardApplication {

	private static final Logger logger = LoggerFactory.getLogger(CashCardApplication.class);

	public static void main(String[] args) {
		logger.info("Hola");
		SpringApplication.run(CashCardApplication.class, args);
	}
}
