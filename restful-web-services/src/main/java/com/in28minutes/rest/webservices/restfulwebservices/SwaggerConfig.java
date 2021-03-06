package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final Contact DEFAULT_CONTACT = new Contact("Biff Jones","http://www.xyz.com","");
	private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Awesome API Title",
			"Awesome API Description", "1.0", "urn:tos",
			DEFAULT_CONTACT,"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",new ArrayList<>());
	public static final HashSet<String> PRODUCES_AND_CONSUME = new HashSet<>(Arrays.asList("application/json","application/xml"));

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(PRODUCES_AND_CONSUME)
				.consumes(PRODUCES_AND_CONSUME);
	}
	/*
		http://localhost:8080/v2/api-docs
		http://localhost:8080/swagger-ui.html
	 */

}
