package com.projeto_educa_eco.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@ComponentScan({"com.projeto_educa_eco.controllers"})
@ComponentScan({"com.projeto_educa_eco.controllers_artigos"})
@EntityScan({"com.projeto_educa_eco.models"})
@EnableJpaRepositories(basePackages = "com.projeto_educa_eco.repository")
public class EducaEcoApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(EducaEcoApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
