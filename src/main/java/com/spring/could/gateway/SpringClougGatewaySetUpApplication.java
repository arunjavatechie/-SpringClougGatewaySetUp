package com.spring.could.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringClougGatewaySetUpApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringClougGatewaySetUpApplication.class, args);
	}

    @GetMapping("/")
    public String hello() {
        return "Hello from Target Service (port 6001)";
    }


}
