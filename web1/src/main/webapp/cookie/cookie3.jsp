<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//cookie2에서 사용자가 선택한 값을 쿠키에 저장한 후 응답헤더에 쿠키 붙여 보내기

	Cookie cookie = new Cookie("language",request.getParameter("language"));
	cookie.setMaxAge(60*60*24); //만료 : 하루 뒤. 초 단위로 쿠키의 만료시간을 지정
	//사용자한테 응답 시 쿠키 전송
	response.addCookie(cookie);
	response.sendRedirect("cookie2.jsp");

%>