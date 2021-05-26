package com.sbs.starter.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.starter.dao.ArticleDao;
import com.sbs.starter.dto.Article;
import com.sbs.starter.util.CUtil;

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
		
		// TODO : CUtile을 사용하기 전의 코드 (너무 길다)
//		BigInteger bigIntId = (BigInteger)param.get("id");
//		long newId = bigIntId.longValue();
//		
//		log.info("newId : "  + newId);
		
		return CUtil.getAsLong(param.get("id"));
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return articleDao.getTotalCount();
	}
}
