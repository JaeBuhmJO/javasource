<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	//사용자를 위한 페이지가 아님 => 개발자를 위한 페이지
	//백엔드 작업
	
	//form 에서 데이터 가져오기
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int birthYear = Integer.parseInt(request.getParameter("birthYear"));
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	//DB insert 작업
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);

	//SQL 실행
	String sql = "insert into usertbl values(user_seq.NEXTVAL, ?, ?, ?, ?)";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setInt(2, birthYear);
	pstmt.setString(3, addr);
	pstmt.setString(4, mobile);
	
	//결과 판독
	int count = pstmt.executeUpdate();
	String path="";
	if(count>0){
		path="list.jsp";
	}else{
		path="insert.jsp"; //insert 실패
	}
	response.sendRedirect(path);

%>