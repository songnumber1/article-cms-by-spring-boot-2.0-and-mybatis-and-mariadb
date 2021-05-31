package com.sbs.starter.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component("needToLogoutInterceptor")
public class NeedToLogoutInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 이 인터셉터 실행 전에 beforeActionInterceptor가 실행되고 거기서 isLogined라는 속성 새어
		// 그래서 여기서 단순히 request.getAttribute("isLogined"); 이것만으로 로그인 여부를 알수 있음.
		boolean isLogined = (boolean)request.getAttribute("isLogined");
		
		if(isLogined) {
			response.setContentType("text/html; chartset=UTP-8");
			response.getWriter().append("<script>");
			response.getWriter().append("history.back();");
			response.getWriter().append("</script>");
			
			return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
