package com.perscholas.springboot_basic_web;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.perscholas.springboot_basic_web.filters.AuthenticationFilter;

@SpringBootApplication
public class QeModuleSpringBootBasicWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(QeModuleSpringBootBasicWebApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<AuthenticationFilter> authFilter() {
		FilterRegistrationBean<AuthenticationFilter> registrationBean = 
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new AuthenticationFilter());
		registrationBean.setUrlPatterns(Arrays.asList(new String[] {"/homePage", "/aboutPage", 
				"/expenseForm", "/createExpense", "/allExpenses"}));

		return registrationBean;
	}
}
