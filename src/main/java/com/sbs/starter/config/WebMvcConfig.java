package com.sbs.starter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer  {
	@Autowired
	@Qualifier("beforeActionInterceptor")
	HandlerInterceptor beforeActionInterceptor;
	
	// needToLoginInterceptor 인터셉터 불러오기
	@Autowired
	@Qualifier("needToLoginInterceptor")
	HandlerInterceptor needToLoginInterceptor;

	// needToLogoutInterceptor 인터셉터 불러오기
	@Autowired
	@Qualifier("needToLogoutInterceptor")
	HandlerInterceptor needToLogoutInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(beforeActionInterceptor).addPathPatterns("/**").excludePathPatterns("/resource/**");
		
		// /resouce로 시작하는 URL
		// 메인, 로그인, 로그인 처리, 가입, 가입 처리, 게시물 리스트, 게시물 상세 빼고는 모두 로그인 상태여야 접근이 가능하다.
		registry.addInterceptor(needToLoginInterceptor).addPathPatterns("/**").excludePathPatterns("/resource/**")
				.excludePathPatterns("/").excludePathPatterns("/member/login").excludePathPatterns("/member/doLogin")
				.excludePathPatterns("/member/join").excludePathPatterns("/member/doJoin")
				.excludePathPatterns("/article/list").excludePathPatterns("/article/detail");

		// 로그인, 로그인처리, 가입, 가입 처리는 로그인 상태일 때 접근할 수 없다.
		registry.addInterceptor(needToLogoutInterceptor).addPathPatterns("/member/login")
				.addPathPatterns("/member/doLogin").addPathPatterns("/member/join").addPathPatterns("/member/doJoin");
	}
}
