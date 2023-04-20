<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
li {
	list-style: decimal;
}
</style>
</head>
<body>
	<%
	ArrayList<String> products = (ArrayList<String>) session.getAttribute("products");
	%>
	<h3>장바구니 목록</h3>
	<ul>
		<%
		if (products != null) {
			for (String car : products) {
		%>
		<li><%=car%></li>
		<%
		}
		} else {
		%>
	</ul>
	<%="장바구니가 비었습니다."%>
	<%
	}
	%>
	<h4>
		<a href="cart.html">상품 선택</a>
	</h4>
	<h4>
		<a href="cartdel.jsp">장바구니 비우기</a>
	</h4>
</body>
</html>