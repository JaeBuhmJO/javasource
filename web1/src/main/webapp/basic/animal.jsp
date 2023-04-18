<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석 --%>
<!-- html 주석 -->
<%
//value 한글이고 post form 
	request.setCharacterEncoding("utf-8");
//getParameter => 값을 하나'만' 가져올 수 있음
//	String animals = request.getParameter("animal");
	String[] animals = request.getParameterValues("animal");
	
	out.print("<h3>"+Arrays.toString(animals)+"<h3>");
%>
	<h3><%=Arrays.toString(animals) %></h3>
<%-- <%=Arrays.toString(animals)%> --%> 

</body>
</html>