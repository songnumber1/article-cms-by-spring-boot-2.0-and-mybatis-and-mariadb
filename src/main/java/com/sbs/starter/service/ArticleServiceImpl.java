package com.sbs.starter.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.starter.dao.ArticleDao;
import com.sbs.starter.dto.Article;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao articleDao;
	
	public List<Article> getList() {
		return articleDao.getList();
	}

	@Override
	public long add(Map<String, Object> param) {
		// TODO Auto-generated method stub
		articleDao.add(param);
		
		BigInteger bigIntId = (BigInteger)param.get("id");
		long newId = bigIntId.longValue();
		
		log.info("newId : "  + newId);
		
		return newId;
	}
}
