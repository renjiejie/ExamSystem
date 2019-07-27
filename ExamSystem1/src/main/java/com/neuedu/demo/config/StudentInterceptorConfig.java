package com.neuedu.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.neuedu.demo.interceptor.StudentInterceptor;
import com.neuedu.demo.interceptor.TeacherInterceptor;
import com.neuedu.demo.interceptor.UserInterceptor;

@Configuration
public class StudentInterceptorConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new StudentInterceptor()).addPathPatterns(
				Arrays.asList("/joinExam.html","/blankStudentPage.html","/practiceTest.html",
						"/studentAppeal.html","/studentExamPage.html","/studentScoreQuery.html"));
	}
	
}
