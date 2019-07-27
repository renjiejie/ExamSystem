package com.neuedu.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.neuedu.demo.interceptor.TeacherInterceptor;
import com.neuedu.demo.interceptor.UserInterceptor;

@Configuration
public class TeacherInterceptorConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TeacherInterceptor()).addPathPatterns(
				Arrays.asList("/addQuestions.html","/answerCard.html","/answercardList.html",
						"/blankTeacherPage.html","/examAnalyse.html","/generatePaper.html",
						"/paperManage.html","/questionManage.html","/teacherChangePaper.html",
						"/teacherCorrect.html"));
	}
	
}
