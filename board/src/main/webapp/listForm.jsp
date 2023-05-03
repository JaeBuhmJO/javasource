<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<main>
	<h2>Board Write</h2>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="dto">
    <tr>
      <td>${dto.bno}</td>
      <td><a href='<c:url value="/cntUpdate.do?bno=${dto.bno}"/>'>${dto.title}</a></td>
      <td>${dto.name}</td>
      <td>${dto.regDate}</td>
      <td>${dto.cnt}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</main>
<%@ include file="include/footer.jsp"%>