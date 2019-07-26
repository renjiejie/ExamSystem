package com.neuedu.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.neuedu.demo.interceptor.AdminInterceptor;
import com.neuedu.demo.interceptor.StudentInterceptor;
import com.neuedu.demo.interceptor.TeacherInterceptor;
import com.neuedu.demo.interceptor.UserInterceptor;

@Configuration
public class AdminInterceptorConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AdminInterceptor()).addPathPatterns(
				Arrays.asList("/admin.html","/adminexam2.html","/adminExamAnalyse.html",
						"/adminmanage2.html"));
	}
	
}
