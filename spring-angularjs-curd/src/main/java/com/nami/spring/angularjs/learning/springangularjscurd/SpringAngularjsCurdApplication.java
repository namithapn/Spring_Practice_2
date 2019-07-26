package com.nami.spring.angularjs.learning.springangularjscurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nami.spring.angularjs.learning.springangularjscurd.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication
public class SpringAngularjsCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularjsCurdApplication.class, args);
	}

}
