<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
int birthYear = Integer.parseInt(request.getParameter("birthYear"));
String addr = request.getParameter("addr");
String mobile = request.getParameter("mobile");

UserDAO userDAO = new UserDAO();
boolean flag = userDAO.insert(name, birthYear, addr, mobile);

//결과 판독
String path = "";
if (flag) {
	path = "list.jsp";
} else {
	path = "insert.jsp"; //insert 실패
}
response.sendRedirect(path);
%>