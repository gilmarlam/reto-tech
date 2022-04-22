package pe.intercorp.retotech.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.intercorp.retotech.constants.Constants;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(Constants.DEFAULT_API_INFO)
				.produces(Constants.DEFAULT_PRODUCES_AND_CONSUMERS);
	}
}