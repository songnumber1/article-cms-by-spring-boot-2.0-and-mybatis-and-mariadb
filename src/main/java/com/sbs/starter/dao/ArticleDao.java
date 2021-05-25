package com.sbs.starter.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.starter.dto.Article;

@Mapper
public interface ArticleDao {
	public List<Article> getList();

	public long add(Map<String, Object> param);	
}
