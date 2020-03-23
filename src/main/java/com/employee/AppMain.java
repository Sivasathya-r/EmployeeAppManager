package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)

public class AppMain extends SpringBootServletInitializer {
	@Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(AppMain.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
}
