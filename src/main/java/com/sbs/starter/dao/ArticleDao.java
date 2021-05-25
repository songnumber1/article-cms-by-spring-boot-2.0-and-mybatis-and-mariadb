package com.sbs.starter.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.starter.dto.Article;

@Mapper
public interface ArticleDao {
	public List<Article> getList();	
}
