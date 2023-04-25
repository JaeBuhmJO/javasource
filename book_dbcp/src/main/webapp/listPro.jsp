<%@page import="book.domain.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BookDAO dao = new BookDAO();
	
	List<BookDTO> list = dao.getList();
	
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");
%>
    