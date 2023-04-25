<%@page import="user.domain.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%
UserDTO dto = (UserDTO) request.getAttribute("dto");
%>

<h1>회원 상세 조회</h1>
<form action="" method="post">
	<div class="mb-3">
		<label for="name" class="form-label">name</label>
		<%-- <input type="text" class="form-control" id="name" name="name" value="<%=dto.getUsername()%>" readonly> --%>
		<input type="text" class="form-control" id="name" name="name" value="${dto.userName}" readonly>
	</div>
	<div class="mb-3">
		<label for="birthYear" class="form-label">birthYear</label>
		<%-- <input type="text" class="form-control" id="birthYear" name="birthYear" value="<%=dto.getBirthYear()%>" readonly> --%>
		<input type="text" class="form-control" id="birthYear" name="birthYear" value="${dto.birthYear}" readonly>
	</div>
	<div class="mb-3">
		<label for="addr" class="form-label">addr</label>
		<%-- <input type="text" class="form-control" id="addr" name="addr" value="<%=dto.getAddr()%>" readonly> --%>
		<input type="text" class="form-control" id="addr" name="addr" value="${dto.addr}" readonly>
	</div>
	<div class="mb-3">
		<label for="mobile" class="form-label">mobile</label>
		<%-- <input type="text" class="form-control" id="mobile" name="mobile" value="<%=dto.getMobile()%>" readonly> --%>
		<input type="text" class="form-control" id="mobile" name="mobile" value="${dto.mobile}" readonly>
	</div>
	<input type="hidden" name="no" value="${dto.no}" id="no" />
	<button type="button" class="btn btn-primary">목록으로</button>
	<button type="button" class="btn btn-success">수정</button>
	<button type="button" class="btn btn-danger">삭제</button>
</form>
<script>
	const no =${dto.no};
</script>
<script src="/js/get.js"></script>
<%

%>
<%@include file="include/footer.jsp"%>