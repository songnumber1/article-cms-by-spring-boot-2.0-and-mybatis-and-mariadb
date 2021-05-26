<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageName" value="게시물 리스트"/>
<%@ include file="../part/head.jspf" %>
	
<h2 class="con">전체 게시물 개수 : ${totalCount}</h2>
<!-- V2 방식 -->
<div class="con">
	<c:forEach items="${list}" var="article">
			<section> 
				<a href="./detail?id=${article.id}">번호 : ${article.id}, 제목 : ${article.title} </section></a>
			<hr>
	</c:forEach>
</div>

<div class="bnts con">
	<a href="./add">게시물 추가</a>
</div>
<%@ include file="../part/foot.jspf" %>