<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/memberList.jsp</title>
</head>
<body>
	<h3>회원리스트</h3>
	<%
	String resultId = (String) request.getAttribute("id");
	String resultPw = (String) request.getAttribute("pw");

	out.print("<h3>아이디: " + resultId + "</h3>");
	out.print("<h3>비번:" + resultPw + "</h3>");
	%>
	<a href='./memberInsert.do'>회원등록 페이지</a>
</body>
</html>