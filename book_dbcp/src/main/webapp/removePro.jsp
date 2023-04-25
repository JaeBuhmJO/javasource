<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int code = Integer.parseInt(request.getParameter("code"));
	BookDAO dao = new BookDAO();

	String path="";
	if(dao.remove(code)){
		path="listPro.jsp";
	}else{
		path="readPro.jsp?code="+code;
	}
	response.sendRedirect(path);
%>