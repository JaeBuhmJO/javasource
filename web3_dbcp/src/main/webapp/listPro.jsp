<%@page import="user.domain.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	UserDAO dao = new UserDAO();
	List<UserDTO> list = dao.getList();
	
	//list를 list.jsp에서 보여주고 싶음
	
	//session : 브라우저로 요청 => 브라우저가 종료되면 정보 사라짐
	//			=> 서버 자원 사용 -> 모든 내용을 session에 저장하는 것은 아님
	
	//request - forward
	//결과 페이지의 request와 내용을 보여줄 페이지의 request를 일치시키는 방법
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");

%>