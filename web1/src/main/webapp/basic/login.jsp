<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>아이디 : <%=request.getParameter("userid")  %></h4>
<h4>비밀번호 : <%=request.getParameter("password")  %></h4>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	
	out.print(userid+"\n");
	out.print(password);
%>
</body>
</html>