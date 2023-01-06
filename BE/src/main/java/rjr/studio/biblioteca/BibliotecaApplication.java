package rjr.studio.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		
		System.setProperty("spring.devtools.restart.enabled", "false");
		
		SpringApplication.run(BibliotecaApplication.class, args);
	}

}
