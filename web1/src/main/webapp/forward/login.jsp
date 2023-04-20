<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String userid = request.getParameter("userid");
String password = request.getParameter("password");

//loginPro에서 userid, password 값을 공유하고 싶음
// setAttribute(), getAttribute(), removeAttribute()

request.setAttribute("userid", userid);
request.setAttribute("password", password);

pageContext.forward("loginPro.jsp");

/* 
	모든 jsp와 모든 Servlet은 각각의 request, response를 개별로 가지고 있음
	forward() : request와 response를 통째로 넘겨버림 
	=> 포워딩 받은 페이지에서, 넘어온 request와 response를 활용 가능 (목적은 DB와 연계해야 이해하기 좋음)
		웹서비스 페이지를 작성할 때 페이지끼리 데이터 공유가 필요 => 로그인, 장바구니 => session, cookie
		데이터 공유시 모든 데이터를 session에 담을 수는 없음. (session에 사용하는 데이터는 몇 정해져있음)
		그렇다면 session을 사용하지 않는 데이터는 어떻게 공유? => forward
		forward 어디서 씀? 게시판

*/
%>