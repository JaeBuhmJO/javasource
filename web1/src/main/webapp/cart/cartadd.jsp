<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// cart.html에서 사용자가 선택한 자동차들 가져오기
	String product = request.getParameter("product");

	//session에 arraylist 사용
	ArrayList<String> products = (ArrayList<String>) session.getAttribute("products");
	
	//이미 생성된 List session이 존재하는지 확인
	if (products == null) {
	//존재하지 않는다면 새로운 List 만들어서 session 추가
		products = new ArrayList<>();
		products.add(product);
		session.setAttribute("products", products);
	} else {
	//존재한다면 해당 session에 선택한 자동차 추가
		products.add(product);
		session.setAttribute("products", products);
	}

	// 가져온 자동차 정보를 session에 저장
	// 이동할 수 있는 페이지 제공
	response.sendRedirect("cartlist.jsp");
	%>
	<h3>장바구니 저장</h3>
	<h4>
		<a href="cartlist.jsp">장바구니 보기</a>
	</h4>
</body>
</html>