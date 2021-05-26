<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sbs.starter.dto.Article" %>

<!-- v1을 이용할 경우 선언해야 한다
<%
List<Article> list = (List<Article>)request.getAttribute("list");
%>
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 사이트 - 게시물 리스트</title>
<link rel="stylesheet" href="/resource/common.css">

</head>
<body>
	<h1 class="con">게시물 리스트</h1>
	
	<h2 class="con">전체 게시물 개수 : ${totalCount}</h2>
	
	<!-- el 문법 
	<div>
		${list}
	</div>
	<br>
	
	<hr>
	-->
	
	<!-- V1
	<h2>V1</h2>
	<% for (int i = 0; i < list.size(); i++) {%>
	<%
		Article article = list.get(i);
	%>
	<section>
		번호 : <%=article.getId() %>, 제목 : <%=article.getTitle() %>
	</section>
	<hr>
	<% } %>
	-->
	
	<!-- V2 방식 -->
	<div class="con">
		<c:forEach items="${list}" var="article">
				<section> 번호 : ${article.id}, 제목 : ${article.title} </section>
				<hr>
		</c:forEach>
	</div>
	
	<div class="bnts con">
		<a href="./add">게시물 추가</a>
	</div>
</body>
</html>