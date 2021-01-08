<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 내장객체 set, get Attribute가 있는 친구 4개
	// pageContext, request, session, application
	pageContext.setAttribute("name", "순일이");
	request.setAttribute("name", "홍길동");
	session.setAttribute("name", "도흠이");
	application.setAttribute("name", "유정이");
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>${param.n1}+${param.n2}=${param.n1}${param.n2}</div>
	<div>${name}</div>
</body>
</html>