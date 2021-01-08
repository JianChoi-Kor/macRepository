<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.koreait.webfirst.CityEntity" %>    
<%
	List<CityEntity> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>city</title>
</head>
<body>
	<h1>city</h1>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
		</tr>
	
	<% for(CityEntity vo : list) { %>
		<tr>
			<td><%=vo.getID() %></td>
			<td><%=vo.getName() %></td> 
		</tr>
	<% } %>
	
	</table>
	
</body>
</html>