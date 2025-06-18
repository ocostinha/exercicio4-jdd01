package com.fiap.jdd01.exercicio4.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gerenciamento de Condôminos")
                        .version("1.0")
                        .description("API para cadastro e gerenciamento de condôminos")
                        .contact(new Contact()
                                .name("FIAP")
                                .email("contato@fiap.com.br")));
    }
}