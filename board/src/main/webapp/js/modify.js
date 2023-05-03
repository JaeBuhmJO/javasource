/**
 * 
 */

document.querySelector(".btn-success").addEventListener("click", () => {
	location.href = "list.do";
})

document.querySelector(".btn-danger").addEventListener("click", (e) => {
	e.preventDefault();
	const currPassword = document.querySelector("#inputPassword3");
	const passwordToDelete = document.querySelector("[name='passwordTodelete']")
	if (currPassword.value != "") {
		passwordToDelete.value = currPassword.value;
	} else {
		alert("게시글 삭제 확인을 위해 비밀번호를 입력하세요");
		currPassword.select();
		return;
	}
	const modifyForm = document.querySelector("#modifyForm");
	modifyForm.action = "delete.do";
	modifyForm.method = "post"
	modifyForm.submit();
});