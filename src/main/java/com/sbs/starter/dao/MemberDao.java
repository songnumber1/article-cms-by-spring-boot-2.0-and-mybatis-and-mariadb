package com.sbs.starter.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.starter.dto.Member;

@Mapper
public interface MemberDao {

	int getLoginIdDupCount(String loginId);

	long join(Map<String, Object> param);

	Member getMatchedOne(String loginId, String loginPw);

	Member getOne(long loginedMemberLoginId);

}
