<%@page import="book.persistence.BookDAO"%>
<%@page import="book.domain.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("utf-8");
int code = Integer.parseInt(request.getParameter("code"));
BookDAO dao = new BookDAO();
BookDTO dto = new BookDTO();

dto.setCode(code);
dto.setTitle(request.getParameter("title"));
dto.setWriter(request.getParameter("writer"));
dto.setPrice(Integer.parseInt(request.getParameter("price")));
dto.setDescription(request.getParameter("description"));

String path = "";
if (dao.update(dto)) {
	path = "listPro.jsp";
} else {
	path = "modifyPro.jsp?code="+code;
}
response.sendRedirect(path);
%>