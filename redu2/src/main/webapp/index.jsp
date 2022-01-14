<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫페이지(index.jsp)</title><!-- /edu2/index.jsp -->
</head>
<body>
<a href='./member/memberList.jsp'>회원리스트</a><br>
<a href='./memberList.do?id=user1&pw=1234'>멤버리스트.do</a><br>
<a href='./memberInsert.do'>멤버등록.do</a>
<a href='./comment/commentAddForm.jsp'>글등록페이지</a>
<a href='./commentList.do'>글목록컨트롤</a>
<a href='./comment/commentList.jsp'>글목록</a>

<!-- //하나는 리스트 거쳐서가는거고 하나는..바로 목록으로 가는거  -->
</body>
</html>