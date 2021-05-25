package com.sbs.starter.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
//	@RequestMapping("/article/list")
//	public String showMain(HttpServletRequest request) {
//		List<Article> list = articleService.getList();
//		
//		request.setAttribute("list", list);
//		
//		System.out.println("1");
//		
//		return "article/list";
//	}
	
	@RequestMapping("/article/list")
	public String showMain(Model aModel) {
		List<Article> list = articleService.getList();
		
		aModel.addAttribute("list", list);
		// 위의 showMain() 함수와 같이 
		// request.setAttribute("list", list);와 똑같은 표현이다.
		
		return "article/list";
	}
	
	@RequestMapping("/article/add")
	public String showAdd() {
		return "article/add";
	}
}
