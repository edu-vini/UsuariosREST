package com.api.usuarios;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication


public class UsuariosApplication {
	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

	@Bean
	public GroupedOpenApi publicApi(){
		return GroupedOpenApi.builder()
				.group("controller")
				.packagesToScan("com.api.usuarios.controller")
				.build();
	}

	@Bean
	public OpenAPI usuarioApi(){
		return new OpenAPI()
				.info(new Info().title("Usuários API")
						.description("Api para retornar dados de usuário")
						.version("0.0.1")
				);

	}
}
