package com.sbs.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.starter.dao.ArticleDao;
import com.sbs.starter.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao articleDao;
	
	public List<Article> getList() {
		return articleDao.getList();
	}

	@Override
	public void add(Map<String, Object> param) {
		// TODO Auto-generated method stub
		articleDao.add(param);
	}
}
