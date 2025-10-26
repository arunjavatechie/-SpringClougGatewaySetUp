package com.spring.could.gateway.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorService {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes() ///api/learning
                .route("learning_route", route -> route.path("/api/learning/**")
                        // .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:6002/api/learning")
                )
                .route("elastic_search", route -> route.path("/elastic/**")
                       // .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:9000/elastic")
                )

//                .route("product_route", r -> r.path("/products/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("http://localhost:8082"))
                .build();
    }
}
