package com.sbs.starter.service;

import java.util.Map;

import com.sbs.starter.dto.Member;

public interface MemberService {

	Map<String, Object> checkLoginIdDup(String string);

	Map<String, Object> join(Map<String, Object> param);

	Member getMatchedOne(String string, String string2);

	Member getOne(long loginedMemberLoginId);
	
}
