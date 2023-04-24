<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
int no = Integer.parseInt(request.getParameter("no"));
String newaddr = request.getParameter("newaddr");
String newmobile = request.getParameter("newmobile");

UserDAO dao = new UserDAO();

String path = "";
if (dao.update(newaddr, newmobile, no)) {
	path = "getPro.jsp?no=" + no;
} else {
	path = "modifyPro.jsp?no=" + no;
}
response.sendRedirect(path);
%>