package com.neuedu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.neuedu.demo.interceptor.UserInterceptor;

@Configuration
public class UserInterceptorConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**.html").excludePathPatterns("/login1.html");;
	}
	
}
