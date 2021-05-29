package com.project.bootcampbackend;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.validation.Valid;

@SpringBootApplication
public class BootcampBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampBackendApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application.description}") String description){
		return new OpenAPI().info(new Info()
				.title(description)
				.version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
