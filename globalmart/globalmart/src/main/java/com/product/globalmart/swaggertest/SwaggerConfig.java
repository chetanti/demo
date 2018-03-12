package com.product.globalmart.swaggertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Profile("Enabled")
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		// TODO Auto-generated method stub
		return or(regex("/products/.*"), regex("/products/getAllProducts"));
	}

	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("GlobalMart Application").description(" GlobalMart API for consumer desc").termsOfServiceUrl("http://localhost:8090/")
				.contact("chetanti,mehta@gmail.com").license("GlobalMart License").licenseUrl("licenseUrl").version("1.0").build();
	}
	
}
