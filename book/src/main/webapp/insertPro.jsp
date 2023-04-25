<%@page import="book.persistence.BookDAO"%>
<%@page import="book.domain.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
BookDTO dto = new BookDTO();
dto.setCode(Integer.parseInt(request.getParameter("code")));
dto.setTitle(request.getParameter("title"));
dto.setWriter(request.getParameter("writer"));
dto.setPrice(Integer.parseInt(request.getParameter("price")));
dto.setDescription(request.getParameter("description"));

String path="";
BookDAO dao = new BookDAO();
if(dao.insert(dto)){
	path="listPro.jsp";
}else{
	path="insert.jsp";
}
response.sendRedirect(path);
%>