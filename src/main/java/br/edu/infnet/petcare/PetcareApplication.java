package br.edu.infnet.petcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class PetcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcareApplication.class, args);
	}

}
