<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
	<h1>res PAGE</h1>
	<h1><%=request.getParameter("name") %> 님의
	주소는 <%=request.getParameter("taddr") %>입니다.</h1>
<pre>
GET 방식 : queryString 포함
POST 방식 : 주소줄에 요청 페이지만 있다.

queryString : ?를 포함한 변수=값&...
</pre>
	
</body>
</html>