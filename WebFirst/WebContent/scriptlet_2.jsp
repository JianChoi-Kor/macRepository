<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	int a = 10;
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
%>

<%
	int a = 20;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><%=sum(10, 20) %></div>
	<div><%=this.a %></div>
	<div><%=a %></div>
</body>
</html>