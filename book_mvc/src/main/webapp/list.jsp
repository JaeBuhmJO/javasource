<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/include/header.jsp"%>
<h1>도서 목록</h1>
<table class="table">
	<thead>
		<tr>
			<th>code</th>
			<th>title</th>
			<th>writer</th>
			<th>price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.code}</td>
				<!-- 제목 링크 등 상세조회 페이지에는 무조건 pk를 하나 딸려 보낸다. 국룰 -->
				<td><a href='<c:url value="/read.do?code=${dto.code}"/>'>${dto.title}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@include file="/include/footer.jsp"%>