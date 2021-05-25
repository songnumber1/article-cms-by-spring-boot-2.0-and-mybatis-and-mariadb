package com.sbs.starter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sbs.starter.dto.Article;

@Component
public class ArticleDaoImpl implements ArticleDao {

	@Override
	public List<Article> getList() {
		// TODO Auto-generated method stub
		Article article1 = new Article(1, "2019-08-20 12:12:12", "제목1", "내용2");
		Article article2 = new Article(2, "2019-08-20 12:12:13", "제목2", "내용2");
		Article article3 = new Article(3, "2019-08-20 12:12:14", "제목3", "내용3");
		
		List<Article> list = new ArrayList<>();
		
		list.add(article3);
		list.add(article2);
		list.add(article1);
		
		return list;
	}

}
