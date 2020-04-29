package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesGatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator routes(RouteLocatorBuilder build) {
		return build.routes()
				.route(r->
						r.path("/horror/**").uri("lb://horror-movies").id("horror"))
				.route(r->
						r.path("/scifi/**").uri("lb://scifi").id("scifi"))
				.build();
	}

}
