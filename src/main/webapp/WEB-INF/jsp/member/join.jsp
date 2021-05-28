<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageName" value="회원가입"/>
<%@ include file="../part/head.jspf" %>
<script>
	function submitJoinForm(form) {
		form.loingId.value = form.loingId.value.trim();
		
		if(form.loingId.value.length == 0) {
			alert('로그인 ID를 입력해주세요.');
			form.loingId.focus();
			
			return false;
		}
		
		
		form.loingPw.value = form.loingPw.value.trim();
		
		if(form.loingPw.value.length == 0) {
			alert('로그인 PW를 입력해주세요.');
			form.loingPw.focus();
			
			return false;
		}
		
		form.loingPwConfirm.value = form.loingPwConfirm.value.trim();
		
		if(form.loingPwConfirm.value.length == 0) {
			alert('로그인 PW확읜을 입력해주세요.');
			form.loingPwConfirm.focus();
			
			return false;
		}
		
		if(form.loingPw.value != form.loingPwConfirm.value) {
			alert('로그인 PW가 일치하지 않습니다.');
			form.loingPwConfirm.focus();
			
			return false;
		}
		
		form.submit();
	}
</script>

<div class="con">	
	<form class="con common-form" action="./doJoin" method="POST" onsubmit="submitJoinForm(this); return false;">
		<div>
			<span> 로그인 ID </span>
			
			<div>
				<input name="loginId" type = "text" placeholder="로그인 ID" autofocus="autofocus" maxlength="30">
			</div>		
		</div>
		
		<div>
			<span> 로그인 PW </span>
			
			<div>
				<input name="loginPw" type = "password" placeholder="로그인 PW" autofocus="autofocus" maxlength="30">
			</div>
		</div>
		
		<div>
			<span> 로그인 PW 확인</span>
			
			<div>
				<input name="loginPwConfirm" type = "password" placeholder="로그인 PW 확인" autofocus="autofocus" maxlength="30">
			</div>
		</div>
		
		<div>			
			<div>
				<input type="submit" value="가입">
				<input type="reset" value="취소" onclick="history.back();">
			</div>		
		</div>		
	</form>
</div>

<div class="bnts con">
	<a href="/">메인</a>
</div>
<%@ include file="../part/foot.jspf" %>