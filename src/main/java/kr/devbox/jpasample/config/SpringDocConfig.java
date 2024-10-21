package kr.devbox.jpasample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.utils.SpringDocUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Configuration
@Slf4j
@OpenAPIDefinition(
        info = @Info(title = "API", version = "v1",
                description = ""),
        servers = @Server(url = "/")
)
public class SpringDocConfig {

    static {
        var schema = new Schema<>();
        schema.example(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        SpringDocUtils.getConfig().replaceWithSchema(LocalTime.class, schema);
    }




    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Spring Boot REST API Specifications")
                        .description("Specification")
                        .version("1.0.0"));
    }


}