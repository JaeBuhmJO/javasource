<%@page import="board.domain.BoardDTO"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>

<main>
	<h2>Board Read</h2>
	<form action='' method="post">
		<div class="row mb-3">
			<label for="inputName" class="col-sm-2 col-form-label">작성자</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputName" name="name" value="${dto.name }" readonly>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputTitle" name="title" value="${dto.title }" readonly>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputContent" class="col-sm-2 col-form-label">내용</label>
			<div class="col-sm-10">
				<textarea class="form-control" id="inputContent" rows="10" name="content" readonly>${dto.content}</textarea>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputAttach" class="col-sm-2 col-form-label">첨부 파일</label>
			<%-- <div class="col-sm-10">
				<a href="download.jsp?fileName=${dto.attach}"> ${dto.attach }</a>
			</div> --%>
			<!-- 파일명에 ++ 와 같은 특수문자가 들어있거나 하는 경우에는 다운로드 요청시 문제가 생김 -->
			<div class="row mb-3">
				<%
				//다운로드 받을 파일명 가져오기 ==> EL과 java코드가 호환이 안됨
				BoardDTO dto = (BoardDTO) request.getAttribute("dto");
				String attachFullName = dto.getAttach();
				if (attachFullName != null) {
					//작성자가 올린 파일명 분리
					String attachName = attachFullName.substring(attachFullName.indexOf("_") + 1);
					String encodeAttach = URLEncoder.encode(attachFullName, "utf-8");
					out.print("<a href='download.jsp?fileName="+encodeAttach+"'>");
					out.print(attachName);
					out.print("</a>");
				}
				%>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">수정</button>
		<button type="button" class="btn btn-secondary">답변</button>
		<button type="button" class="btn btn-success">목록보기</button>
	</form>
</main>
<form action="" id="readForm">
	<input type="hidden" name="bno" value='${dto.bno }' />
</form>
<script src='<c:url value="/js/read.js"/>'></script>
<%@ include file="include/footer.jsp"%>