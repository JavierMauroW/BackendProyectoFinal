package com.example.ProyectoFinal.Configuration;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api MindNotes")
                        .version("1.0")
                        .description("Documentacion Api para aplicacion de notas y objetivos")
                        .contact(new Contact()
                                .name("Javier Montenegro")
                                .email("javiermauromontenegro@gmail.com")))
                ;

    }
}