package br.com.sondercs.basicospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "br.com.sondercs")
public class BasicoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicoSpringbootApplication.class, args);
	}

}
