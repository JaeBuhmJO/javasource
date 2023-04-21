<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
int no = Integer.parseInt(request.getParameter("no"));

Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";
Connection con = DriverManager.getConnection(url, user, password);

String sql = "delete usertbl where no=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, no);

int result = pstmt.executeUpdate();
String path = "";
if (result > 0) {
	path = "list.jsp";
} else {
	path = "get.jsp?no="+no;
}
response.sendRedirect(path);
%>
