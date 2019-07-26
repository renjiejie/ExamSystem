package com.neuedu.demo.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TeacherInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*System.out.println("preHandle");*/
		HttpSession session = request.getSession();
		String account = (String) session.getAttribute("account");
		String permission = (String) session.getAttribute("permission");
		if(account != null && permission != "teacher"){
				if(permission=="student"){
					request.getRequestDispatcher("/blankStudentPage.html").forward(request, response);
				} else {
					request.getRequestDispatcher("/admin.html").forward(request, response);
				}
				return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
