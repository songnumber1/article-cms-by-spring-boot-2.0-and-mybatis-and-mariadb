package com.sbs.starter.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {

	int getLoginIdDupCount(String loginId);

}
