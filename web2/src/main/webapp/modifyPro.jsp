<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
int no = Integer.parseInt(request.getParameter("no"));
String newaddr = request.getParameter("newaddr");
String newmobile = request.getParameter("newmobile");

//수정한 항목만 업데이트하기
Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";
Connection con = DriverManager.getConnection(url, user, password);

int result = 0;

if (!newaddr.equals("")) {
	String sql = "update usertbl set addr = ? where no=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, newaddr);
	pstmt.setInt(2, no);
	result += pstmt.executeUpdate();
}
if (!newmobile.equals("")) {
	String sql = "update usertbl set mobile = ? where no=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, newmobile);
	pstmt.setInt(2, no);
	result += pstmt.executeUpdate();
}

String path = "";
if (result > 0) {
	path = "get.jsp?no=" + no;
} else {
%>alert("정보 수정에 실패했습니다.")
<%
}
response.sendRedirect(path);
%>